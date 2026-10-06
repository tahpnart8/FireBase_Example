package vn.edu.ueh.thanhdnh.firebase_example;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class ArticleDetailActivity extends AppCompatActivity {
  public static final String EXTRA_ARTICLE_ID = "article_id";

  FirebaseFirestore db;
  ImageView imgCover;
  TextView txtTitle, txtContent, txtView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_article_detail);

    FirebaseApp.initializeApp(this);
    db = FirebaseFirestore.getInstance();

    imgCover = findViewById(R.id.img_detail_cover);
    txtTitle = findViewById(R.id.txt_detail_title);
    txtContent = findViewById(R.id.txt_detail_content);
    txtView = findViewById(R.id.txt_detail_view);

    String articleId = getIntent().getStringExtra(EXTRA_ARTICLE_ID);

    // tang view moi lan mo trang chi tiet
    db.collection("articles").document(articleId).update("view", FieldValue.increment(1));

    db.collection("articles").document(articleId)
        .addSnapshotListener(new EventListener<DocumentSnapshot>() {
          @Override
          public void onEvent(@Nullable DocumentSnapshot snapshot, @Nullable FirebaseFirestoreException error) {
            if (snapshot != null && snapshot.exists()) {
              String title = snapshot.getString("title");
              String content = snapshot.getString("content");
              Long imgCoverValue = snapshot.getLong("imgCover");
              Long viewValue = snapshot.getLong("view");

              txtTitle.setText(title);
              txtContent.setText(content);
              txtView.setText("View: " + (viewValue == null ? 0 : viewValue));
              imgCover.setImageResource(resolveDrawable(imgCoverValue == null ? 0 : imgCoverValue.intValue()));
            }
          }
        });
  }

  // 1=thoi tiet, 2=giao thong, 3=suc khoe, giong du lieu mau cua lab7
  private int resolveDrawable(int imgCoverValue) {
    switch (imgCoverValue) {
      case 1:
        return R.drawable.cover_weather;
      case 2:
        return R.drawable.cover_traffic;
      case 3:
        return R.drawable.cover_health;
      default:
        return R.drawable.ic_launcher_background;
    }
  }
}

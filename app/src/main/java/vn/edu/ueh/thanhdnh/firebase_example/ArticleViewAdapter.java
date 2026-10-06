package vn.edu.ueh.thanhdnh.firebase_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArticleViewAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
  private LayoutInflater mInflater;
  private List<Article> articles;

  public ArticleViewAdapter(Context context, List<Article> articles) {
    this.mInflater = LayoutInflater.from(context);
    this.articles = articles;
  }

  public void update(List<Article> articles){
    this.articles = articles;
  }

  @NonNull
  @Override
  public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View customView = mInflater.inflate(R.layout.contact_list, parent, false);
    return new ArticleViewHolder(customView, this);
  }

  @Override
  public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
    Article currentArticle = articles.get(position);
    holder.getImgCover().setImageResource(resolveDrawable(currentArticle.getImgCover()));
    holder.getTxtTitle().setText(currentArticle.getTitle());
    holder.getTxtContent().setText(currentArticle.getContent());
    holder.getTxtImgCover().setText("ImgCover: " + currentArticle.getImgCover());
    holder.getTxtView().setText("View: " + currentArticle.getView());
  }

  @Override
  public int getItemCount() {
    return articles.size();
  }

  // 1=thoi tiet, 2=giao thong, 3=suc khoe, giong du lieu mau cua lab7
  private int resolveDrawable(int imgCover) {
    switch (imgCover) {
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

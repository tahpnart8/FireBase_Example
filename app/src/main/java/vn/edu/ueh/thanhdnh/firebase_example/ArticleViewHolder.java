package vn.edu.ueh.thanhdnh.firebase_example;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
  private ImageView imgCover;
  private TextView txtTitle, txtContent, txtImgCover, txtView;
  private ArticleViewAdapter adapter;

  public ArticleViewHolder(@NonNull View itemView, ArticleViewAdapter adapter) {
    super(itemView);
    imgCover = itemView.findViewById(R.id.img_cover);
    txtTitle = itemView.findViewById(R.id.txt_title);
    txtContent = itemView.findViewById(R.id.txt_content);
    txtImgCover = itemView.findViewById(R.id.txt_img_cover);
    txtView = itemView.findViewById(R.id.txt_view);
    this.adapter = adapter;
  }

  public ImageView getImgCover() {
    return imgCover;
  }

  public void setImgCover(ImageView imgCover) {
    this.imgCover = imgCover;
  }

  public TextView getTxtTitle() {
    return txtTitle;
  }

  public void setTxtTitle(TextView txtTitle) {
    this.txtTitle = txtTitle;
  }

  public TextView getTxtContent() {
    return txtContent;
  }

  public void setTxtContent(TextView txtContent) {
    this.txtContent = txtContent;
  }

  public TextView getTxtImgCover() {
    return txtImgCover;
  }

  public void setTxtImgCover(TextView txtImgCover) {
    this.txtImgCover = txtImgCover;
  }

  public TextView getTxtView() {
    return txtView;
  }

  public void setTxtView(TextView txtView) {
    this.txtView = txtView;
  }
}

package vn.edu.ueh.thanhdnh.firebase_example;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
  private TextView txtId, txtName, txtEmail, txtPhone;
  private ArticleViewAdapter adapter;

  public ArticleViewHolder(@NonNull View itemView, ArticleViewAdapter adapter) {
    super(itemView);
    txtId = itemView.findViewById(R.id.txt_id);
    txtName = itemView.findViewById(R.id.txt_name);
    txtEmail = itemView.findViewById(R.id.txt_email);
    txtPhone = itemView.findViewById(R.id.txt_phone);
    this.adapter = adapter;
  }

  public TextView getTxtId() {
    return txtId;
  }

  public void setTxtId(TextView txtId) {
    this.txtId = txtId;
  }

  public TextView getTxtName() {
    return txtName;
  }

  public void setTxtName(TextView txtName) {
    this.txtName = txtName;
  }

  public TextView getTxtEmail() {
    return txtEmail;
  }

  public void setTxtEmail(TextView txtEmail) {
    this.txtEmail = txtEmail;
  }

  public TextView getTxtPhone() {
    return txtPhone;
  }

  public void setTxtPhone(TextView txtPhone) {
    this.txtPhone = txtPhone;
  }
}

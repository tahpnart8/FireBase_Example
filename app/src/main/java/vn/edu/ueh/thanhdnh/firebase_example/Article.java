package vn.edu.ueh.thanhdnh.firebase_example;

public class Article {
  private String title;
  private String content;
  private int imgCover;
  private int view;

  public Article() {
  }

  public Article(String title, String content, int imgCover) {
    this.title = title;
    this.content = content;
    this.imgCover = imgCover;
    this.view = 0;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getImgCover() {
    return imgCover;
  }

  public void setImgCover(int imgCover) {
    this.imgCover = imgCover;
  }

  public int getView() {
    return view;
  }

  public void setView(int view) {
    this.view = view;
  }

  @Override
  public String toString() {
    return "Article{" +
      "title='" + title + '\'' +
      ", content='" + content + '\'' +
      ", imgCover=" + imgCover +
      ", view=" + view +
      '}';
  }
}

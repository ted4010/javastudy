package practice01_Board;

public class BoardVo {
  
  // 필드
  private int boardNO;
  private String title;
  private String writer;
  private String createdAt;
  
  // 생성자
  public BoardVo() {

  }

  public BoardVo(int boardNO, String title, String writer, String createdAt) {
    super();
    this.boardNO = boardNO;
    this.title = title;
    this.writer = writer;
    this.createdAt = createdAt;
  }

  //메소드
  
  public int getBoardNO() {
    return boardNO;
  }

  public void setBoardNO(int boardNO) {
    this.boardNO = boardNO;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "BoardVo [boardNO=" + boardNO + ", title=" + title + ", writer=" + writer + ", createdAt=" + createdAt + "]";
  }
  
}

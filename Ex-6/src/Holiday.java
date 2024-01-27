public class Holiday {
  private String date;
  private String name;

  Holiday(String date, String name) {
    this.date = date;
    this.name = name;
  }

  public String getDate() {
    return this.date;
  }

  public String getName() {
    return this.name;
  }
}

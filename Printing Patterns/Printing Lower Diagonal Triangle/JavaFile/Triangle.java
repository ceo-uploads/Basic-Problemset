class Triangle {
  protected int n;

  public Triangle(n) {
    this.n = n;
  }

  public void view(n) {
    for (int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

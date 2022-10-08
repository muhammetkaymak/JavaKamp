public class Product {

  public Product() {
    System.out.println("Yapici blok calisti.");
  }

  //attribute | field
  int _id;
  String _name;
  String _description;
  double _price;
  int _stockAmount;
  String _renk;
  String _kod;

  // getter
  public int get_id() {
    return _id;
  }

  // setter
  // this içerisinde bulunduğunuz class'ı belirtir.
  public void set_id(int id) {
    // this.id = id;
    _id = id;
  }



  public String get_name() {
    return _name;
  }

  public void set_name(String _name) {
    this._name = _name;
  }

  public String get_description() {
    return _description;
  }

  public void set_description(String _description) {
    this._description = _description;
  }

  public double get_price() {
    return _price;
  }

  public void set_price(double _price) {
    this._price = _price;
  }

  public int get_stockAmount() {
    return _stockAmount;
  }

  public void set_stockAmount(int _stockAmount) {
    this._stockAmount = _stockAmount;
  }

  public String get_renk() {
    return _renk;
  }

  public void set_renk(String _renk) {
    this._renk = _renk;
  }

  public String get_kod() {
    return _kod;
  }

  public void set_kod(String _kod) {
    this._kod = _kod;
  }  
}

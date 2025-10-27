class Car{
    //メンバ変数
    String auto; //メーカー名
    String name;  //車種
    double num;  //燃費

    //メソッド
    void brand(String a){
        auto = a;
    }
    void carName(String s){
        name = s;
    }
    void mileage(double n){
        num = n;
    }
    void display(){
        System.out.println("メーカー名:" + auto);
        System.out.println("車種" + name);
        System.out.println("燃費:" + num + "km/L");
    }
}
class SortCar{
    public static void main(String[] args){
        //Carクラスのオブジェクトc1を作成
        Car c1 = new Car();

        //自動車c1のメーカーを設定
        c1.brand("SUBARU");

        //自動車c1の車種を設定
        c1.carName("forester");

        //自動車c1の燃費を設定
        c1.mileage(18.8);
        
        //自動車c1のメーカー、車種、燃費を表示
        c1.display();
    }
}
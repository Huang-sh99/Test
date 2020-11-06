public class DrinkFactory {
  public static Vehicle maleVenicle(int type){
    if (type==1){
      return  new Coco();
    }else if (type==2){
      return new Sprite();
    }else if (type==3){
      return new Sixboom();
    }else {
      return new Coco();
    }
  }
}

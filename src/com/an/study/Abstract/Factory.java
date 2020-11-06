package com.an.study.Abstract;

public  class Factory {
  public static Vehicle maleVenicle(int type) {
    if (type == 1) {
      return new Car();
    } else if (type == 2) {
      return new Truck();
    }
    return  null;
  }
}

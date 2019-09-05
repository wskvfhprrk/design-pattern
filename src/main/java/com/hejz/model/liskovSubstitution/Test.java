package com.hejz.model.liskovSubstitution;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/4 8:51
 */
public class Test {

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println(rectangle.getWidth() + "," + rectangle.getLength());
        }
        System.out.println("resize方法结束：" + rectangle.getWidth() + "," + rectangle.getLength());
    }

    public static void main(String[] args) {
//        Square square =new Square();
//        square.setLength(10L);
//        resize(square);
    }
//    public static void main(String[] args) {
//        Rectangle rectangle=new Rectangle();
//        rectangle.setWidth(10L);
//        rectangle.setLength(20L);
//        resize(rectangle);
//    }
}

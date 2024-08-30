public class VendingMachine {
    //필드 (자판기가 가지는 것들) ex) 동전통 상품 케이스
    //생성자
    //메소드 (자판기가 할 수 있는 행위들)
    public String pushProductButton(int menuId){
        System.out.println(menuId +"전달 받았습니다.");
        if(menuId ==1) {
            return "콜라";
        } else if (menuId == 2) {
            return "사이다";
        } else if (menuId == 3) {
            return "환타";
        }else {
            return "존재하지 않는 메뉴 입니다";
        }
    }
    public void userStart(int start){ //void 리턴은 나오는 값이 없다. 그냥 메소드 내에서만 실행
        System.out.println("실행");
    }
    public static void printVersion(){
        System.out.println("v1.0");
    }

}

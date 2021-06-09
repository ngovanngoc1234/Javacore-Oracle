package chapter3;

public class DemoDateTypeCharAndUnicodeAndBoolean {
    public static void main(String[] args) {
        System.out.println("kiểu dữ liệu char được hiểu là các ký tự thường nằm trong dấu nháy đơn  ví dụ : 'a' , '1'");
        System.out.println("sau đây e sẽ quy đổi theo unicode từ a-z thành kiểu số nguyên");
        char typeA = 'a';
        char typeZ = 'z';
        System.out.println("khi output ra thì sẽ được quy đổi theo unicode ");
        System.out.println("..........");
        System.out.println(" ký tự a = " + (int) typeA);
        System.out.println("............");
        System.out.println("ký tự z = " + (int) typeZ);
        System.out.println("..........");
        System.out.println("vậy là khi quy đổi ra kiểu số nguyên thì các ký tự từ a - z sẽ nằm trong khoảng 97 -> 122");
        System.out.println("***************");
        System.out.println("sau đây em sẽ thử nếu ký dự đó là number thì sao, vì là ký tự mình sẽ chạy từ 0 -> 9");
        char typeNumber0 = '0';
        char typeNumber9 = '9';
        System.out.println("..........");
        System.out.println("ký tự 0 = " + (int) typeNumber0);
        System.out.println("..........");
        System.out.println("ký tự 9 = " + (int) typeNumber9);
        System.out.println("..........");
        System.out.println("vậy là các ký tự từ 0 ->9 sẽ nằm ở khoảng 48 -> 57");
        System.out.println("-----------------------------------------------");

//        tất cả các ký tự đc quy đổi theo chuẩn unicode
//        tiếp theo là kiểu boolean
        System.out.println("kiểu mặc định của biến boolean sẽ là false ");
        boolean typeBoolean = false;
        System.out.println("kiểu boolean = "+typeBoolean);
        System.out.println(" boolean chỉ có 2 loại true và false");
    }
}

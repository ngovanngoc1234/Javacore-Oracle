package chapter3.operators;

public class MathematicalFunctionsAndConstants {
    public static void main(String[] args) {
//        java có đầy đử các phép tính toán học ở trong bộ thư viện java.lang.Math.*
        double numberSquare = 9;
        double square = Math.sqrt(numberSquare);
        System.out.println("hàm tính căn bậc 2 ");
        System.out.println("căn bậc 2 của vd a = " + square);

        System.out.println("-----------------------------------------");
        System.out.println("casts như sách nói thì e đang hiểu là ép kiểu");
        double x = 10.54534;
        int nx = (int) x;
        System.out.println("x double sẽ đc connect sang int = " + nx);
//         như trên thì ép kiểu từ double sang int sẽ lấy phần số nguyên bên double sang int, và loại bỏ phần thập phân
//        ta cũng có thể làm tròn lên số gần nhất với hàm Math.round
        System.out.println("---------------------");
        System.out.println("vd làm tròn số double thành int làm tròn lên số gần nhất");
        double xx = 8.999;
        int nxx = (int) Math.round(nx);
        System.out.println(" sau khi sử dụng hàm Math.round là = " + nxx);
//        tiếp theo sẽ là các toán tử trong lập trình phổ biến nhất là toán tử " ++, -- "
        System.out.println("********************************");
//        em sẽ lấy vd về các toán tử trong java hoạt động như thế nào

        int numberExclusive = 10;
        int minusSignInFront = --numberExclusive;
        int numberAllow = 10;
        int plusSignInFront = ++numberAllow;
//        các toán tử mà đặt ở phía trước hoặc sau parma thể hiện rõ nhất khi mình sử dụng với for
        System.out.println("kết quả khi sử dụng toán tử -- : " + minusSignInFront);
        System.out.println("kết quả khi sử dụng toán tử ++ : " + plusSignInFront);

    }
}

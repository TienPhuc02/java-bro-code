import javax.swing.*;
import java.util.*;
public class App {
    public static void main(String[] args)  {
   ArrayList<String> food =new ArrayList<String>();
   food.add("pizza");
   food.add("hot dog");
   food.add("hamburger");

   food.set(0,"sushi");
   food.remove(2);
   food.clear();
   for(int i=0;i<food.size();i++){
System.out.println(food.get(i));
   }
   /*
    1. Kích thước:
Array: Có kích thước cố định. Một khi bạn khai báo một mảng với một kích thước nhất định, bạn không thể thay đổi kích thước của nó sau này.
ArrayList: Kích thước có thể thay đổi (dynamic). ArrayList có thể tự động tăng hoặc giảm kích thước khi bạn thêm hoặc xóa các phần tử.


2. Kiểu dữ liệu:
Array: Có thể chứa cả kiểu dữ liệu nguyên thủy (như int, double, char) và đối tượng (như String, các lớp do người dùng định nghĩa).
ArrayList: Chỉ chứa đối tượng. Bạn không thể lưu trữ kiểu dữ liệu nguyên thủy trực tiếp trong một ArrayList; thay vào đó, bạn phải sử dụng wrapper classes (như Integer, Double, Character).


3. Hiệu suất:
Array: Thường nhanh hơn ArrayList vì nó là một cấu trúc dữ liệu cố định và ít overhead hơn.
ArrayList: Có thể chậm hơn một chút so với mảng do cần quản lý kích thước động và có overhead bổ sung từ các phương thức của nó.


4. Thuận tiện:
Array: Việc sử dụng mảng có thể phức tạp hơn khi bạn cần thêm hoặc xóa các phần tử vì bạn phải quản lý kích thước của mảng một cách thủ công.
ArrayList: Cung cấp các phương thức tiện ích như add(), remove(), indexOf(), clear(), và nhiều hơn nữa, làm cho việc quản lý các phần tử trở nên dễ dàng và linh hoạt.


5. Khai báo:
Array:



int[] myArray = new int[10]; // Mảng của kiểu int với kích thước 10
String[] myArray = new String[5]; // Mảng của kiểu String với kích thước 5
ArrayList:

ArrayList<Integer> myList = new ArrayList<Integer>(); // ArrayList chứa Integer
ArrayList<String> myList = new ArrayList<String>(); // ArrayList chứa String


6. An toàn kiểu dữ liệu (Type Safety):
Array: Là type-safe. Nghĩa là, một mảng của một kiểu dữ liệu nhất định chỉ có thể chứa các phần tử của kiểu đó.
ArrayList: Cũng là type-safe nếu bạn sử dụng generics. Nếu không, nó có thể chứa bất kỳ loại đối tượng nào, dẫn đến lỗi ClassCastException khi thao tác với các phần tử của nó.



Kết luận:
Sử dụng Array khi kích thước cố định và hiệu suất là ưu tiên.
Sử dụng ArrayList khi bạn cần một cấu trúc dữ liệu linh hoạt với khả năng thay đổi kích thước tự động và bạn muốn sử dụng các phương thức tiện ích mà nó cung cấp. 

    */

    }
}

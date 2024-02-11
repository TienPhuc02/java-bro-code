import java.util.Scanner;

import javax.swing.*;
import java.util.*;
public class App {
    public static void main(String[] args)  {
    /*
     
    Java Wrapper classes là các lớp cho phép các kiểu dữ liệu nguyên thủy (primitive types) như int, double, char, và boolean được làm việc như các đối tượng. Trong Java, mọi thứ đều là đối tượng ngoại trừ các kiểu dữ liệu nguyên thủy. Wrapper classes giải quyết vấn đề này bằng cách "bao bọc" một giá trị nguyên thủy trong một đối tượng. Điều này rất hữu ích trong các tình huống như làm việc với Collection framework (ví dụ, ArrayList, HashMap, v.v.) nơi mà chỉ có thể lưu trữ đối tượng.

Mỗi kiểu dữ liệu nguyên thủy có một wrapper class tương ứng:

byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
char -> Character
boolean -> Boolean
Tính năng chính của Wrapper classes:
Autoboxing: Quá trình tự động chuyển đổi từ kiểu dữ liệu nguyên thủy sang đối tượng của wrapper class tương ứng.
Ví dụ: int thành Integer.
Unboxing: Quá trình tự động chuyển đổi từ đối tượng wrapper class sang kiểu dữ liệu nguyên thủy.
Ví dụ: Integer thành int.
Ví dụ về Autoboxing và Unboxing:
java

// Autoboxing: Chuyển đổi tự động từ int sang Integer
Integer i = 10;

// Unboxing: Chuyển đổi tự động từ Integer sang int
int iPrime = i;


Tại sao lại sử dụng Wrapper classes?
Cho phép sử dụng kiểu nguyên thủy trong các cấu trúc đòi hỏi đối tượng: Ví dụ, bạn không thể lưu trữ int trong một ArrayList vì ArrayList chỉ chấp nhận đối tượng. Nhưng bạn có thể lưu trữ Integer.
Cung cấp các phương thức tiện ích: Wrapper classes chứa các phương thức hữu ích để làm việc với giá trị của chúng, như compareTo(), toString(), valueOf(), v.v.
Lưu ý:
Sử dụng wrapper classes có thể ảnh hưởng đến hiệu suất do quá trình boxing và unboxing cần thêm thời gian xử lý. Do đó, sử dụng chúng khi thực sự cần thiết.
Java 5 trở lên hỗ trợ autoboxing và unboxing, giúp việc làm việc với wrapper classes dễ dàng hơn.
     */


    }
}

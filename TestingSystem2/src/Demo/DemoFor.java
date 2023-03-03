package Demo;

public class DemoFor {
        public static void main(String[] args) {
            // for i
            for (int i = 0; i <= 100; i++) {
                System.out.println(i);
            }
            // for each (chỉ sử dụng với 1 danh sách)
            int[] arri = {1, 2, 3, 4, 5};

            // for (kiểu dữ liệu từng phần tử trong danh sách, đặt tên cho mỗi phần tử, : , danh sách dữ liệu mà mình muốn sử dụng)
            for (int item : arri) {
                // Xử lý theo từng phần tử mà nó gọi tới
                System.out.println(item);
            }
        }
    }


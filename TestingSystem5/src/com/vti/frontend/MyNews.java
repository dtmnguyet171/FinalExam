package com.vti.frontend;
import com.vti.entity.News;
import com.vti.utils.Scannerutils;

public class MyNews {
    public static void main(String[] args) {
        News news = new News();
        while(true) {
            System.out.println("Mời bạn nhập vào chức năng");
            System.out.println("1. Thêm mới 1 news");
            System.out.println("2. Hiển thị dnah sách các news");
            System.out.println("3. Đánh giá");
            System.out.println("4. Thoát");
            int choose = Scannerutils.inputMinMax(1, 4);
            switch (choose) {
                case 1:
                    System.out.println("Mời bạn nhập vào tiêu đề");
                    String title = Scannerutils.inputString();
                    news.setTitle(title);

                    System.out.println("Mời bạn nhập vào ngày công bố");
                    String publicDate = Scannerutils.inputString();
                    news.setPublicDate(publicDate);

                    System.out.println("Mời bạn nhập vào tên tác giả");
                    String author = Scannerutils.inputString();
                    news.setAuthor(author);

                    System.out.println("Mời bạn nhập vào nội dung");
                    String content = Scannerutils.inputString();
                    news.setContent(content);
                    break;
                case 2:
                    news.Display();
                    break;
                case 3:
                    news.Calculate();
                    news.Display();
                    break;
                case 4:
                    return;
            }
        }
    }
}

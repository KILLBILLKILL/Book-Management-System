package classes;

import action.Action;

import java.util.List;
import java.util.Scanner;

public class Teacher extends User {
    private static String ISBN  ;

    public Teacher(String id, String name) {
        super(id,name);
    }

    @Override
    public void menu() {
        System.out.println("***老师请选择 **");
        System.out.println("***  0. 退出**");
        System.out.println("** 1.上架 ****");
        System.out.println("** 2.查阅图书*");
        System.out.println("** 3.查阅记录");
    }

    @Override
    public boolean input() {
        Scanner scanner=new Scanner(System.in);
        int selected=scanner.nextInt();
        switch(selected)
        {
            case 0:
                return true;
            case 1:
              putBook();
              break;
            case 2:
                queryBooks();
                break;
            case 3:
                System.out.println("请查询记录");
                break;


        }

        return false;

    }

//    private void queryBooks() {
//        List<Book> bookList=Action.queryBooks();
//        for(Book book:bookList)
//        {
//            //书名 by作者 price 价格 存量  借阅次数
//            System.out.printf("《%s》 by %s 价格 ： %f 存量 ：%d 借阅次数： %d%n",book.getTitle(),book.getAuthor(),book.getPrice(),
//                    book.getCurrentCount(),book.getBorrowedCount());
//        }
//
//        System.out.println("共查询到"+bookList.size()+"本书");
//    }

    private void putBook() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入 ISBN");
        String ISNB=scanner.nextLine();
        System.out.println("请输入书名：");
        String title =scanner.nextLine();
        System.out.println("请输入作者：");
        String author =scanner.nextLine();
        System.out.println("请输入价格：");
        double price =scanner.nextDouble();
        System.out.println("请输入数量：");
        int count  =scanner.nextInt();

        Book book=Action.putBook(ISBN,title,author,price,count);

        System.out.printf("《%s》 上架成功！",book.getTitle());

    }
}

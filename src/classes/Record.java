package classes;

import javax.xml.crypto.Data;
import java.lang.annotation.Annotation;
import java.util.Date;

public class Record {

    private String userId;
    private  String bookISBN;
    private Data borrowedAt;

    public Record(String id, String ISBN) {

        this.userId=id;
        this.bookISBN=ISBN;
        this.borrowedAt= (Data) new Date();//当前时间
    }

    public boolean is(User user, String ISBN) {


        return userId.equals(user.getId())&&bookISBN.equals(ISBN);

    }
}

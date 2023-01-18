package oraclecertifiedquestions;

class Book implements Readeble{

    @Override
    public void readBook() {

    }

    @Override
    public void setBookMark() {

    }
    String msg;

    Book(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Book{" +
                "msg='" + msg + '\'' +
                '}';
    }

}

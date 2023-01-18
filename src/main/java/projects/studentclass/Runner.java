package projects.studentclass;

import java.util.Scanner;

public class StudentClassRunner {

    public static void main(String[] args) {

        /*
          1. fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
          2. Ogrenci sınıfına ad, soyad ve yas dan oluşan bir constructor tanımlayınız.
          3. Bütün fieldlar için encapsulation uygulayınız.
          4. Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
          5. ArrayList cinsinden Öğrencileri olsun.
          6. main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
          7. bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
          8. ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
             bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
        */

        School school = new School();
        while (true) {
            try {
                StudentClass std1 = new StudentClass("Ece", "Can", 13);
                School.students.add(std1.getStudentName());
                School.students.add(std1.getStudentSurname());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }











    }
}

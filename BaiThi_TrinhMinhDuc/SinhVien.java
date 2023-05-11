package BaiThi_TrinhMinhDuc;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String name;
    private int birthYear;
    private String studentClass;

    // Constructor without parameters
    public SinhVien() {
        this.name = "";
        this.birthYear = 0;
        this.studentClass = "";
    }

    // Constructor with parameters
    public SinhVien(String name, int birthYear, String studentClass) {
        this.name = name;
        this.birthYear = birthYear;
        this.studentClass = studentClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the birth year: ");
        birthYear = sc.nextInt();
        sc.nextLine(); // consume the remaining newline character
        System.out.print("Enter the class: ");
        studentClass = sc.nextLine();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Class: " + studentClass);
    }

}

class TheMuon extends SinhVien {
    private int leaseNumber;
    private String bookstoreNumber;
    private Date leaseDate;
    private Date paymentDueDate;

    public TheMuon() {
        super();
        this.leaseNumber = 0;
        this.bookstoreNumber = "";
        this.leaseDate = new Date();
        this.paymentDueDate = new Date();
    }

    public TheMuon(String name, int birthYear, String studentClass, int leaseNumber, String bookstoreNumber,
            Date leaseDate, Date paymentDueDate) {
        super(name, birthYear, studentClass);
        this.leaseNumber = leaseNumber;
        this.bookstoreNumber = bookstoreNumber;
        this.leaseDate = leaseDate;
        this.paymentDueDate = paymentDueDate;
    }

    public int getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(int leaseNumber) {
        this.leaseNumber = leaseNumber;
    }

    public String getBookstoreNumber() {
        return bookstoreNumber;
    }

    public void setBookstoreNumber(String bookstoreNumber) {
        this.bookstoreNumber = bookstoreNumber;
    }

    public Date getLeaseDate() {
        return leaseDate;
    }

    public void setLeaseDate(Date leaseDate) {
        this.leaseDate = leaseDate;
    }

    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    @Override
    public void input() {
        super.input();
        // attributes
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lease number: ");
        leaseNumber = sc.nextInt();
        sc.nextLine(); // consume the remaining newline character
        System.out.print("Enter the bookstore number: ");
        bookstoreNumber = sc.nextLine();
        System.out.println("Enter the lease date (format: dd/MM/yyyy): ");
        try {
            String dateStr = sc.nextLine();
            leaseDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Error in parsing date string. Using current date instead.");
        }
        System.out.println("Enter the payment due date (format: dd/MM/yyyy): ");
        try {
            String dateStr = sc.nextLine();
            paymentDueDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Error in parsing date string. Using current date instead.");
        }
    }

    @Override
    public void output() {
        super.output(); // calls the output() method of the SinhVien class to print the inherited
                        // attributes
        System.out.println("Lease number: " + leaseNumber);
        System.out.println("Bookstore number: " + bookstoreNumber);
        System.out.println("Lease date: " + new SimpleDateFormat("dd/MM/yyyy").format(leaseDate));
        System.out.println("Payment due date: " + new SimpleDateFormat("dd/MM/yyyy").format(paymentDueDate));
    }

    public static void main(String[] args) {
        TheMuon tm = new TheMuon();
        tm.input();
        tm.output();
    }
}

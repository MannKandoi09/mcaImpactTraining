package Day14;

import java.util.*;

class Library {
    String name;
    int id;

    Library(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class BookLending extends Library {
    int days;
    double rate;

    BookLending(String name, int id, int days, double rate) {
        super(name, id);
        this.days = days;
        this.rate = rate;
    }

    double calculateFine() {
        return days * rate;
    }
}

class MemberFine extends BookLending {
    double waiver;

    MemberFine(String name, int id, int days, double rate, double waiver) {
        super(name, id, days, rate);
        this.waiver = waiver;
    }

    double calculateTotalPayable() {
        double total = calculateFine() - waiver;
        return total < 0 ? 0.0 : total;
    }
}

public class ClassExercis_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int id = sc.nextInt();
        int days = sc.nextInt();
        double rate = sc.nextDouble();
        double waiver = sc.nextDouble();

        MemberFine mf = new MemberFine(name, id, days, rate, waiver);

        System.out.printf("Total Fine: Rs. %.2f%n", mf.calculateTotalPayable());
    }
}
package com.phonebook;

import java.util.ArrayList;

public class TelephoneBook {
    private ArrayList<Record> Records = new ArrayList<>();

    public void add(Record r) {
        Records.add(r);
    }

    public Record find(String record) {
        Record r = null;
        for (int i = 0; i < Records.size(); i++) {
            if (Records.get(i).getName().equals(record)) {
                r = Records.get(i);
                break;
            }
        }
        return r;
    }

    public ArrayList<Record> allRecords(String record) {
        ArrayList<Record> allRecords = new ArrayList<>();

        for (int i = 0; i < Records.size(); i++) {
            if (Records.get(i).getName().equals(record)) {
                allRecords.add(Records.get(i));
            }
        }

        if (allRecords.size() == 0) {
            allRecords = null;
        }

        return allRecords;
    }

    public static void main(String[] args) {
        Record a = new Record("Kolia", 6870227);
        Record b = new Record("Tania", 6870224);
        Record c = new Record("Vania", 6870233);
        Record d = new Record("Kolia", 335);
        TelephoneBook t = new TelephoneBook();
        t.add(a);
        t.add(b);
        t.add(c);
        t.add(d);
        System.out.println(t.find("Kol"));
        for (int i = 0; i < t.allRecords("Kolia").size(); i++) {
            System.out.println(t.allRecords("Kolia").get(i).getPhone());
        }

    }
}

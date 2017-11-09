package com.qhdong.chapter1.section2;

public class Date implements Comparable<Date> {

    private final static int[] DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private final int month;
    private final int day;
    private final int year;

    public Date(int month, int day, int year) {
        if (!isValid(month, day, year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(String date) {
        String[] fields = date.split("/");
        if (fields.length != 3) {
            throw new IllegalArgumentException("Invalid date");
        }
        month = Integer.parseInt(fields[0]);
        day = Integer.parseInt(fields[1]);
        year = Integer.parseInt(fields[2]);
        if (!isValid(month, day, year)) throw new IllegalArgumentException("Invalid date");
    }

    public Date next() {
        if (isValid(month, day + 1, year)) {
            return new Date(month, day + 1, year);
        }
        else if (isValid(month + 1, 1, year)) {
            return new Date(month + 1, 1, year);
        }
        else return new Date(1, 1, year + 1);
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public boolean isBefore(Date that) {
        return compareTo(that) < 0;
    }

    public boolean isAfter(Date that) {
        return compareTo(that) > 0;
    }

    private static boolean isValid(int month, int day, int year) {
        if (month < 1 || month > 12) return false;
        else if (day < 1 || day > DAYS[month]) return false;
        else if (year < 0) return false;
        else if (month == 2 && day == 29 && !isLeapYear(year)) return false;
        return true;
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    @Override
    public int compareTo(Date that) {
        if (year > that.year) return 1;
        if (year < that.year) return -1;
        if (month > that.month) return 1;
        if (month < that.month) return -1;
        return Integer.compare(day, that.day);
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Date that = (Date) other;
        return (month == that.month) && (day == that.day) && (year == that.year);
    }

    @Override
    public int hashCode() {
        int hash = 13;
        hash = hash * 31 + month;
        hash = hash * 31 + day;
        hash = hash * 31 + year;
        return hash;
    }

    public static void main(String[] args) {
        Date today = new Date(11, 8, 2017);
        System.out.println(today.next());
        System.out.println(today.isBefore(new Date("11/11/2017")));
    }
}

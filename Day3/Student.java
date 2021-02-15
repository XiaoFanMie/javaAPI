package com.ff.javaapi.Day3;

public class Student implements Comparable<Student>{
    private String name;
    private int computerResults;
    private int writtenTestResults;

    public Student(String name, int computerResults, int writtenTestResults) {
        this.name = name;
        this.computerResults = computerResults;
        this.writtenTestResults = writtenTestResults;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名='" + name + '\'' +
                ", 上机成绩=" + computerResults +
                ", 笔试成绩=" + writtenTestResults +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getComputerResults() {
        return computerResults;
    }

    public void setComputerResults(int computerResults) {
        this.computerResults = computerResults;
    }

    public int getWrittenTestResults() {
        return writtenTestResults;
    }

    public void setWrittenTestResults(int writtenTestResults) {
        this.writtenTestResults = writtenTestResults;
    }

    @Override
    public int compareTo(Student o) {
        /*return o.computerResults-this.computerResults;//上机成绩从大到小排序*/
        /*return o.computerResults-this.computerResults;//上机成绩从小到大排序*/
        return this.name.compareTo(o.name);
    }
}

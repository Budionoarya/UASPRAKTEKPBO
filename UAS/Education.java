/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Daffa
 */
public class Education {

    String degree, major;

    int researches;

    public Education(String degree, String major, int researches) {

        this.degree = degree;

        this.major = major;

        this.researches = researches;

    }

    public Education() {


    }

    public String getDegree() {

        return degree;

    }

    public void setDegree(String degree) {

        this.degree = degree;

    }

    public String getMajor() {

        return major;

    }

    public void setMajor(String major) {

        this.major = major;

    }

    public int getResearches() {

        return researches;

    }

    public void setResearches(int researches) {

        this.researches = researches;

    }

}

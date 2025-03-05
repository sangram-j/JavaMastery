package com.designpatterns.prototype;

public class MainClass {

    public static void main(String[] args) {

        ProfessionCache.loadprofessionCache();

        Profession docCloneProfession = ProfessionCache.getNewCloneProfession(1);
        System.out.println(docCloneProfession);

        Profession teacherCloneProfession = ProfessionCache.getNewCloneProfession(2);
        System.out.println(teacherCloneProfession);

        Profession docCloneProfession1 = ProfessionCache.getNewCloneProfession(1);
        System.out.println(docCloneProfession1);
        docCloneProfession1.hashCode();

    }
}

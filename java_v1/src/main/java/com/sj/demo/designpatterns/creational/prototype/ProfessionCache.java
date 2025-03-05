package com.sj.demo.designpatterns.creational.prototype;


import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer, Profession> professionMap = new Hashtable<Integer, Profession>();

    public static Profession getNewCloneProfession(int id) {
        Profession cachedProfessionInstance = professionMap.get(id);

        return (Profession) cachedProfessionInstance.cloningMethod();
    }

    public static void loadprofessionCache() {
        Doctor doc = new Doctor();
        doc.id = 1;
        professionMap.put(doc.id, doc);

        Teacher teacher = new Teacher();
        teacher.id = 2;
        professionMap.put(teacher.id, teacher);
    }
}

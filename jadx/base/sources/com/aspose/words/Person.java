package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class Person {
    private String zzXEP;
    private String zzXEQ;
    private String zzXER;

    public Person(String str, String str2, String str3) {
        this.zzXER = str;
        this.zzXEQ = str2;
        this.zzXEP = str3;
    }

    private boolean zzZ(Person person) {
        return com.aspose.words.internal.zzZKN.equals(getLast(), person.getLast()) && com.aspose.words.internal.zzZKN.equals(getFirst(), person.getFirst()) && com.aspose.words.internal.zzZKN.equals(getMiddle(), person.getMiddle());
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        Person person = (Person) com.aspose.words.internal.zzZKW.zzZ(obj, Person.class);
        return person != null && zzZ(person);
    }

    public final String getFirst() {
        return this.zzXEQ;
    }

    public final String getLast() {
        return this.zzXER;
    }

    public final String getMiddle() {
        return this.zzXEP;
    }

    public final int hashCode() {
        return ((((getLast() != null ? getLast().hashCode() : 0) * 397) ^ (getFirst() != null ? getFirst().hashCode() : 0)) * 397) ^ (getMiddle() != null ? getMiddle().hashCode() : 0);
    }
}

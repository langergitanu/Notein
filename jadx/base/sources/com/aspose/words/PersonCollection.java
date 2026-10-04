package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class PersonCollection extends Contributor implements Iterable<Person> {
    private ArrayList<Person> zzXEO = new ArrayList<>();

    public final Person get(int i) {
        return this.zzXEO.get(i);
    }

    public final int getCount() {
        return this.zzXEO.size();
    }

    @Override // java.lang.Iterable
    @ReservedForInternalUse
    @Deprecated
    public final Iterator<Person> iterator() {
        return this.zzXEO.iterator();
    }

    public final void zzY(Person person) {
        this.zzXEO.add(person);
    }
}

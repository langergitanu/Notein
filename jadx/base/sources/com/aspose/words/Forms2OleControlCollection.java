package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class Forms2OleControlCollection implements Iterable<Forms2OleControl> {
    private ArrayList<Forms2OleControl> zzZm = new ArrayList<>();

    public Forms2OleControl get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<Forms2OleControl> iterator() {
        return this.zzZm.iterator();
    }

    public final Forms2OleControl zzZ(Forms2OleControl forms2OleControl) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, forms2OleControl);
        return forms2OleControl;
    }
}

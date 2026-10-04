package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FramesetCollection implements Iterable<Frameset> {
    private ArrayList<Frameset> zzZm = new ArrayList<>();

    public Frameset get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<Frameset> iterator() {
        return this.zzZm.iterator();
    }

    public final void zzY(Frameset frameset) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, frameset);
    }
}

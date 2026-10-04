package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYL5<T> implements Cloneable {
    private ArrayList<T> zzY0 = new ArrayList<>();
    private int zzXn = -1;

    private void zzYmS() {
        int i = this.zzXn;
        if (i < 0 || i >= this.zzY0.size()) {
            throw new IllegalStateException("There is no current object.");
        }
    }

    public final T get(int i) {
        zzYmS();
        return this.zzY0.get(i);
    }

    public final int getCount() {
        return this.zzY0.size();
    }

    public final int getIndex() {
        return this.zzXn;
    }

    public final void zzYPf() {
        zzYmS();
        this.zzY0.remove(this.zzY0.get(this.zzXn));
        if (this.zzXn > this.zzY0.size() - 1) {
            this.zzXn--;
        }
    }

    public final boolean zzZ4(T t) {
        int iIndexOf = this.zzY0.indexOf(t);
        if (iIndexOf == -1) {
            return false;
        }
        this.zzXn = iIndexOf;
        return true;
    }

    public final void zzZ5(T t) {
        if (this.zzXn == this.zzY0.size() - 1) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzY0, t);
        } else {
            this.zzY0.add(this.zzXn + 1, t);
        }
    }

    public final void zzZ6(T t) {
        if (this.zzY0.size() == 0) {
            zzZ5(t);
            return;
        }
        zzYmS();
        this.zzY0.add(this.zzXn, t);
        this.zzXn++;
    }
}

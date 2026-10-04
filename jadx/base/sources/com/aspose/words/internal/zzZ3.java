package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3<T> implements Cloneable {
    private int zzXZ;
    private ArrayList<T> zzY0;
    private int zzZF;

    public zzZ3(ArrayList<T> arrayList) {
        if (arrayList == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: array");
        }
        this.zzY0 = arrayList;
        zzL(0);
        setCount(arrayList.size());
    }

    private int getEndIndex() {
        return this.zzXZ + this.zzZF;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void setCount(int i) {
        if (this.zzXZ + i > this.zzY0.size()) {
            i = this.zzY0.size() - this.zzXZ;
        }
        this.zzZF = i;
    }

    public final int getCount() {
        return this.zzZF;
    }

    public final T getItem(int i) {
        if (i < 0 || i >= this.zzZF) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return this.zzY0.get(this.zzXZ + i);
    }

    public final void setEndIndex(int i) {
        int i2 = this.zzXZ;
        setCount(i < i2 ? 0 : i - i2);
    }

    public final void zzL(int i) {
        int endIndex = getEndIndex();
        if (i > getEndIndex()) {
            i = getEndIndex();
        }
        this.zzXZ = i;
        setCount(endIndex - i);
    }

    public final ArrayList<T> zzYE() {
        return this.zzY0;
    }

    public final T zzYF() {
        return getItem(this.zzZF - 1);
    }

    public final boolean zzYG() {
        return this.zzZF > 0;
    }

    public final zzZ3<T> zzYH() {
        return (zzZ3) memberwiseClone();
    }

    public final void zzYI() {
        setEndIndex(getEndIndex() - 1);
    }
}

package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZWQ implements Iterable<String>, Iterator<String> {
    private zzZYE zz4;
    private int zz8X = Integer.MIN_VALUE;
    private StringBuilder zz8Y = new StringBuilder();

    public zzZWQ(String str) {
        this.zz4 = new zzZYE(str);
    }

    private static boolean zzSi(int i) {
        return zzZVU.zzc((char) i) == 8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean zHasNext;
        if (this.zz8Y.length() == 0) {
            zHasNext = this.zz4.hasNext();
            if (zHasNext) {
                this.zz8X = this.zz4.next().intValue();
            }
        } else {
            zHasNext = false;
        }
        if (this.zz8X != Integer.MIN_VALUE) {
            this.zz8Y.setLength(0);
            zzZVS.zzZ(this.zz8Y, this.zz8X);
            this.zz8X = Integer.MIN_VALUE;
            zHasNext = true;
        }
        while (this.zz4.hasNext()) {
            int iIntValue = this.zz4.next().intValue();
            if (!zzSi(iIntValue)) {
                this.zz8X = iIntValue;
                return zHasNext;
            }
            zzZVS.zzZ(this.zz8Y, iIntValue);
        }
        return zHasNext;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zz8Y.toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

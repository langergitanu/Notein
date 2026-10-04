package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYBC {
    private int end;
    private int start;

    public zzYBC() {
    }

    public final boolean contains(int i) {
        return i >= this.start && i < this.end;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getLength() {
        return this.end - this.start;
    }

    public final int getStart() {
        return this.start;
    }

    public final boolean isEmpty() {
        return this.start == this.end;
    }

    public final void zzm0(int i) {
        this.end = i;
    }

    public zzYBC(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}

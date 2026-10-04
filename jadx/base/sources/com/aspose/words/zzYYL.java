package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYL extends com.aspose.words.internal.zzY0 {
    public zzYYL(com.aspose.words.internal.zzZOP zzzop) {
        super(zzzop);
    }

    public final void zzQk(int i) throws Exception {
        zzq().zzH(zzq().getPosition() + ((long) i));
    }

    public final int zzYCY() throws Exception {
        long jZzl = zzY3N.zzl(this);
        if (jZzl <= 2147483647L) {
            return (int) jZzl;
        }
        throw new IllegalStateException("Invalid forward encoded Int32 value.");
    }

    public final int zzYCZ() throws Exception {
        int iZzXb = zzXb();
        if (iZzXb == -1) {
            return -1;
        }
        long j = ((long) iZzXb) & 4294967295L;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalStateException("Invalid record index.");
    }

    public final int zzYD0() throws Exception {
        long jZzXb = ((long) zzXb()) & 4294967295L;
        if (jZzXb <= 2147483647L) {
            return (int) jZzXb;
        }
        throw new IllegalStateException("Value is too large for Int32.");
    }

    public final void zzua(int i) throws Exception {
        if (zzXb() != i) {
            throw new IllegalStateException("Unexpected record ID.");
        }
    }
}

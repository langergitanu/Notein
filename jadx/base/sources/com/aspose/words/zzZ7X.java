package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7X {
    private zzZAY zzYhX;
    private FieldSeq zzYhY;
    private FieldSeq zzYhZ;
    private FieldXE zzYi0;
    private int zzYi1;
    private int zzYi2;
    private zzZQO zzYin;

    public zzZ7X(int i, int i2, FieldSeq fieldSeq, FieldSeq fieldSeq2, zzZQO zzzqo, FieldXE fieldXE, zzZPF zzzpf) {
        this.zzYhX = zzzpf;
        this.zzYi2 = i;
        this.zzYi1 = i2;
        this.zzYhZ = fieldSeq;
        this.zzYin = zzzqo;
        this.zzYi0 = fieldXE;
        this.zzYhY = fieldSeq2;
    }

    private int zzT(FieldSeq fieldSeq) throws Exception {
        zzTL zztlZzz;
        if (fieldSeq == null || (zztlZzz = this.zzYhX.zzz(fieldSeq)) == null) {
            return 0;
        }
        return (int) zztlZzz.zz8Y();
    }

    public final FieldXE zzYUV() {
        return this.zzYi0;
    }

    public final zzZQO zzYUW() {
        return this.zzYin;
    }

    public final boolean zzYUX() {
        return this.zzYi2 == this.zzYi1;
    }

    public final boolean zzYUY() {
        return this.zzYi1 != -1;
    }

    public final int zzYUZ() throws Exception {
        return zzT(this.zzYhY);
    }

    public final int zzYV0() throws Exception {
        return zzT(this.zzYhZ);
    }

    public final int zzYV1() {
        return this.zzYi1;
    }

    public final int zzYV2() {
        return this.zzYi2;
    }
}

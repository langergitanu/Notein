package com.aspose.words.internal;

import com.aspose.words.internal.zzYY5;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3K extends zzZ3M implements zzZ5R {
    private final int zzWlA;
    private final byte[] zzWlj;
    static final byte[] zzWlg = zzYGC.decode("3043300506032b6571033a00");
    static final byte[] zzWlf = zzYGC.decode("302a300506032b6570032100");

    public zzZ3K(zzZ5W zzz5w, byte[] bArr) {
        super(zzz5w);
        this.zzWlj = zzYGU.zzVI(bArr);
        this.zzWlA = zzXGF();
    }

    private int zzXGF() {
        return zzYGU.hashCode(this.zzWlj) + (zzXGV().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        zzXGE();
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3K)) {
            return false;
        }
        zzZ3K zzz3k = (zzZ3K) obj;
        if (zzYGU.zzp(this.zzWlj, zzz3k.zzWlj)) {
            return zzXGV().equals(zzz3k.zzXGV());
        }
        return false;
    }

    public final byte[] getEncoded() {
        if (zzXGV().equals(zzYY5.zzZ.zzW7v)) {
            byte[] bArr = zzWlg;
            byte[] bArr2 = new byte[bArr.length + this.zzWlj.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.zzWlj;
            System.arraycopy(bArr3, 0, bArr2, bArr.length, bArr3.length);
            return bArr2;
        }
        byte[] bArr4 = zzWlf;
        byte[] bArr5 = new byte[bArr4.length + this.zzWlj.length];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        byte[] bArr6 = this.zzWlj;
        System.arraycopy(bArr6, 0, bArr5, bArr4.length, bArr6.length);
        return bArr5;
    }

    public final int hashCode() {
        zzXGE();
        return this.zzWlA;
    }

    public final byte[] zzXGx() {
        return zzYGU.zzVI(this.zzWlj);
    }

    public zzZ3K(byte[] bArr) {
        super(bArr[8] == 113 ? zzYY5.zzZ.zzW7v : zzYY5.zzZ.zzW7u);
        if (bArr[8] == 113) {
            byte[] bArr2 = zzWlg;
            if (zzZ2X.zzG(bArr2, bArr) && bArr.length - bArr2.length == 57) {
                this.zzWlj = zzYGU.copyOfRange(bArr, bArr2.length, bArr.length);
            } else {
                throw new IllegalArgumentException("raw key data not recognised");
            }
        } else {
            byte[] bArr3 = zzWlf;
            if (zzZ2X.zzG(bArr3, bArr) && bArr.length - bArr3.length == 32) {
                this.zzWlj = zzYGU.copyOfRange(bArr, bArr3.length, bArr.length);
            } else {
                throw new IllegalArgumentException("raw key data not recognised");
            }
        }
        this.zzWlA = zzXGF();
    }
}

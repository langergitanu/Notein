package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzD7 {
    private static int zzuT;
    private static int[] zzuU = new int[0];
    private int zzVf;
    private int[] zzuV = zzuU;

    private void zzCS() {
        if (this.zzVf == 0) {
            throw new IllegalStateException("The stack is empty.");
        }
    }

    private boolean zzZ(zzD7 zzd7) {
        if (zzZKO.zzA(null, zzd7)) {
            return false;
        }
        if (zzZKO.zzA(this, zzd7)) {
            return true;
        }
        if (this.zzVf != zzd7.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (this.zzuV[i] != zzd7.zzuV[i]) {
                return false;
            }
        }
        return true;
    }

    public final void clear() {
        zzZKV.zzX(this.zzuV, 0, this.zzVf);
        this.zzVf = 0;
    }

    public boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzD7.class) {
            return false;
        }
        return zzZ((zzD7) obj);
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int i = this.zzVf;
        for (int i2 = 0; i2 < this.zzVf; i2++) {
            i = (i * 397) + this.zzuV[i2];
        }
        return i;
    }

    public final int zzCQ() {
        zzCS();
        int[] iArr = this.zzuV;
        int i = this.zzVf - 1;
        this.zzVf = i;
        int i2 = iArr[i];
        iArr[i] = zzuT;
        return i2;
    }

    public final int zzCR() {
        zzCS();
        return this.zzuV[this.zzVf - 1];
    }

    public final void zzVF(int i) {
        int i2 = this.zzVf;
        int[] iArr = this.zzuV;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[iArr.length == 0 ? 4 : iArr.length * 2];
            zzZKV.zzZ(iArr, 0, iArr2, 0, i2);
            this.zzuV = iArr2;
        }
        int[] iArr3 = this.zzuV;
        int i3 = this.zzVf;
        this.zzVf = i3 + 1;
        iArr3[i3] = i;
    }
}

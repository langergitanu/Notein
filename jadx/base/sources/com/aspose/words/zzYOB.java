package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOB {
    private int zzw9;
    private int zzwa;

    public zzYOB(int i, int i2) {
        this.zzw9 = i;
        this.zzwa = i2;
    }

    public static zzYOB zzXV(byte[] bArr) {
        return new zzYOB(com.aspose.words.internal.zzZQK.zzA(bArr, 4), com.aspose.words.internal.zzZQK.zzA(bArr, 0));
    }

    private boolean zzZ(zzYOB zzyob) {
        return this.zzw9 == zzyob.zzw9 && this.zzwa == zzyob.zzwa;
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzYOB.class) {
            return false;
        }
        return zzZ((zzYOB) obj);
    }

    public final int getLeft() {
        return this.zzwa;
    }

    public final int getTop() {
        return this.zzw9;
    }

    public final int hashCode() {
        return (this.zzw9 * 397) ^ this.zzwa;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("Raw: {0}, (T:{1}hm ({3}pt), L:{2}hm ({4}pt))", com.aspose.words.internal.zzZ1.zzY(zzYro()), Integer.valueOf(this.zzw9), Integer.valueOf(this.zzwa), Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(((double) this.zzw9) * 0.028346456587314606d)), Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(((double) this.zzwa) * 0.028346456587314606d)));
    }

    public final byte[] zzYro() {
        byte[] bArr = new byte[8];
        byte[] bytes = com.aspose.words.internal.zzZQK.getBytes(this.zzw9);
        com.aspose.words.internal.zzZQK.getBytes(this.zzw9);
        System.arraycopy(bytes, 0, bArr, 4, 4);
        byte[] bytes2 = com.aspose.words.internal.zzZQK.getBytes(this.zzwa);
        com.aspose.words.internal.zzZQK.getBytes(this.zzwa);
        System.arraycopy(bytes2, 0, bArr, 0, 4);
        return bArr;
    }
}

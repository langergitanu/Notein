package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZUH {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("saltSize", "blockSize", "keyBits", "hashSize", "cipherAlgorithm", "cipherChaining", "hashAlgorithm", "saltValue", "spinCount");
    private int zzVm;
    private byte[] zzYL5;
    private String zzYL6;
    private String zzYL7;
    private String zzYL8;
    private int zzYL9;
    private int zzYLa;
    private int zzYLb;
    private int zzYLc;

    public final int getBlockSize() {
        return this.zzVm;
    }

    public final boolean zzA(zzYU4 zzyu4) {
        switch (zzUR.zzTP(zzyu4.getLocalName())) {
            case 0:
                this.zzYLc = zzyu4.zzb();
                return true;
            case 1:
                this.zzVm = zzyu4.zzb();
                return true;
            case 2:
                this.zzYLb = zzyu4.zzb();
                return true;
            case 3:
                this.zzYLa = zzyu4.zzb();
                return true;
            case 4:
                this.zzYL8 = zzyu4.getValue();
                return true;
            case 5:
                this.zzYL7 = zzyu4.getValue();
                return true;
            case 6:
                this.zzYL6 = zzyu4.getValue();
                return true;
            case 7:
                this.zzYL5 = com.aspose.words.internal.zzZQB.zzVT(zzyu4.getValue());
                return true;
            case 8:
                this.zzYL9 = zzyu4.zzb();
                return true;
            default:
                return false;
        }
    }

    public final byte[] zzZjh() {
        return this.zzYL5;
    }

    public final String zzZji() {
        return this.zzYL6;
    }

    public final String zzZjj() {
        return this.zzYL7;
    }

    public final String zzZjk() {
        return this.zzYL8;
    }

    public final int zzZjl() {
        return this.zzYL9;
    }

    public final int zzZjm() {
        return this.zzYLa;
    }

    public final int zzZjn() {
        return this.zzYLb;
    }
}

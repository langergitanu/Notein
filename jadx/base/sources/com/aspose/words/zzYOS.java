package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYOS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("top", "left", "bottom", "right");
    private zzZMK zzXKx;
    private String zzXKy;
    private String zzXLG;
    private String zzZDG;
    private int zzXKw = Integer.MIN_VALUE;
    private int zzXKv = Integer.MIN_VALUE;
    private int zzXKu = Integer.MIN_VALUE;
    private int zzXKt = Integer.MIN_VALUE;
    private int zzXKs = Integer.MIN_VALUE;
    private int zzXKr = Integer.MIN_VALUE;
    private int zzXKq = Integer.MIN_VALUE;
    private int zzXKp = Integer.MIN_VALUE;
    private zzYTI zzXKz = new zzYTI();

    public final String getBackgroundColor() {
        return this.zzZDG;
    }

    public final int getPaddingBottom() {
        return this.zzXKq;
    }

    public final int getPaddingLeft() {
        return this.zzXKr;
    }

    public final int getPaddingRight() {
        return this.zzXKp;
    }

    public final int getPaddingTop() {
        return this.zzXKs;
    }

    public final void setBackgroundColor(String str) {
        this.zzZDG = str;
    }

    public final void zzDP(String str) {
        this.zzXLG = str;
    }

    public final void zzDh(String str) {
        this.zzXKy = str;
    }

    public final int zzDi(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return this.zzXKs;
        }
        if (iZzTP == 1) {
            return this.zzXKr;
        }
        if (iZzTP == 2) {
            return this.zzXKq;
        }
        if (iZzTP == 3) {
            return this.zzXKp;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected side value '{0}'", str));
    }

    public final int zzDj(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return this.zzXKu;
        }
        if (iZzTP == 1) {
            return this.zzXKw;
        }
        if (iZzTP == 2) {
            return this.zzXKt;
        }
        if (iZzTP == 3) {
            return this.zzXKv;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected side value '{0}'", str));
    }

    public final String zzYHK() {
        return this.zzXKy;
    }

    public final zzZMK zzYsN() {
        return this.zzXKx;
    }

    public final zzYTI zzYsO() {
        return this.zzXKz;
    }

    public final int zzYsP() {
        return this.zzXKt;
    }

    public final int zzYsQ() {
        return this.zzXKu;
    }

    public final String zzYtp() {
        return this.zzXLG;
    }

    public final void zzZ(zzZMK zzzmk) {
        this.zzXKx = zzzmk;
    }

    public boolean zzd(int i, Object obj) {
        if (this.zzXKz.zze(i, obj)) {
            return zzYTI.zzB((Border) obj);
        }
        return false;
    }

    public final void zzre(int i) {
        this.zzXKp = i;
    }

    public final void zzrf(int i) {
        this.zzXKq = i;
    }

    public final void zzrg(int i) {
        this.zzXKr = i;
    }

    public final void zzrh(int i) {
        this.zzXKs = i;
    }

    public final void zzri(int i) {
        this.zzXKt = i;
    }

    public final void zzrj(int i) {
        this.zzXKu = i;
    }

    public final void zzrk(int i) {
        this.zzXKv = i;
    }

    public final void zzrl(int i) {
        this.zzXKw = i;
    }
}

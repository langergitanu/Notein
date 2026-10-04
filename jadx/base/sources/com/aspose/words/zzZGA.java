package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGA {
    private boolean zzYnZ;
    private boolean zzYo0;
    private boolean zzYo1;
    private boolean zzYo2;
    private boolean zzYo3;
    private ListLevel zzYo4;
    private int zzYoN;
    private int zzYoQ;

    public zzZGA(ListLevel listLevel) {
        this.zzYo4 = listLevel;
    }

    public final ListLevel getListLevel() {
        return this.zzYo4;
    }

    public final String getNumberFormat() {
        return this.zzYo4.getNumberFormat();
    }

    public final int getNumberStyle() {
        return this.zzYo4.getNumberStyle();
    }

    public final void setNumberFormat(String str) {
        this.zzYo4.zzJ8(str);
        this.zzYo2 = true;
    }

    public final void setNumberStyle(int i) {
        this.zzYo4.setNumberStyle(i);
        this.zzYo0 = true;
    }

    public final boolean zzZ0o() {
        return this.zzYnZ;
    }

    public final int zzZ0p() {
        return this.zzYo4.zzZ0p();
    }

    public final boolean zzZ0q() {
        return this.zzYo0;
    }

    public final boolean zzZ0r() {
        return this.zzYo1;
    }

    public final int zzZ0s() {
        return (this.zzYo4.getStartAt() + this.zzYoQ) - 1;
    }

    public final boolean zzZ0t() {
        return this.zzYo2;
    }

    public final boolean zzZ0u() {
        return this.zzYo3;
    }

    public final int zzZ0v() {
        return this.zzYoN;
    }

    public final boolean zzZ0w() {
        return this.zzYoQ > 0;
    }

    public final void zzZ0x() {
        this.zzYoQ = 0;
    }

    public final void zzZ0y() {
        this.zzYoQ++;
    }

    public final void zzze(int i) {
        int i2 = (i - this.zzYoQ) + 1;
        if (ListLevel.zzx9(i2)) {
            this.zzYo4.setStartAt(i2);
            this.zzYo1 = true;
        }
    }

    public final void zzzp(int i) {
        this.zzYo4.zzzp(i);
        this.zzYnZ = true;
    }

    public final void zzzq(int i) {
        this.zzYoN = i;
        this.zzYo3 = true;
    }
}

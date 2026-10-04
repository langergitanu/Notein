package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZYR {
    private int mLength;
    private zzZXH zzA4;
    private int zzWz;
    private String zzZi;
    private boolean zzcd;
    private boolean zzce;
    private zzZYE zzcf = new zzZYE("");

    public zzZYR(String str) {
        zzZYD.zzXk(str);
        this.zzZi = str;
        reset();
    }

    private void reset() {
        this.zzWz = 0;
        this.mLength = 0;
        this.zzA4 = null;
        this.zzce = false;
        this.zzcd = false;
    }

    public final boolean getKeepOriginalFontMetrics() {
        return this.zzcd;
    }

    public final String getText() {
        String str = this.zzZi;
        int i = this.zzWz;
        return str.substring(i, this.mLength + i);
    }

    public final boolean moveNext() throws Exception {
        int i = this.zzWz + this.mLength;
        this.zzWz = i;
        if (i >= this.zzZi.length()) {
            return false;
        }
        int i2 = this.zzWz;
        this.zzcf.setText(this.zzZi.substring(i2));
        while (this.zzcf.hasNext()) {
            int iIntValue = this.zzcf.next().intValue();
            int iZzS6 = zzZVS.zzS6(iIntValue);
            zzZXH zzzxhZzy = zzy(iIntValue);
            this.zzA4 = zzzxhZzy;
            if (zzK5.zzZ(iIntValue, zzzxhZzy)) {
                int i3 = this.zzWz;
                if (i2 == i3) {
                    this.mLength = iZzS6;
                    this.zzce = true;
                    this.zzcd = this.zzA4.zzSC(iIntValue);
                } else {
                    this.mLength = i2 - i3;
                    this.zzce = false;
                }
                return true;
            }
            i2 += iZzS6;
        }
        this.mLength = this.zzZi.length() - this.zzWz;
        this.zzce = false;
        this.zzcd = false;
        return true;
    }

    public final void zzXv(String str) {
        this.zzZi = str;
        reset();
    }

    public final boolean zzr6() {
        return this.zzce;
    }

    public final zzZXH zzr7() {
        return this.zzA4;
    }

    public abstract zzZXH zzy(int i) throws Exception;
}

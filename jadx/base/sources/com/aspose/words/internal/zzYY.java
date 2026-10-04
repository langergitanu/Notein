package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYY {
    private Object[] zzXR;

    private zzYY(Object[] objArr) {
        this.zzXR = objArr;
    }

    private void setBackColor(int i) {
        this.zzXR[7] = Integer.valueOf(i);
    }

    private void setFontName(String str) {
        this.zzXR[8] = str;
    }

    private void setFontSize(float f) {
        this.zzXR[9] = Float.valueOf(f);
    }

    private void setForeColor(int i) {
        this.zzXR[6] = Integer.valueOf(i);
    }

    private void setScale(float f) {
        this.zzXR[5] = Float.valueOf(f);
    }

    private void setTextAlignment(int i) {
        this.zzXR[12] = Integer.valueOf(i);
    }

    private void zzI(int i) {
        this.zzXR[11] = Integer.valueOf(i);
    }

    private void zzJ(int i) {
        this.zzXR[10] = Integer.valueOf(i);
    }

    private void zzK(int i) {
        this.zzXR[1] = Integer.valueOf(i);
    }

    private void zzM(boolean z) {
        this.zzXR[13] = Boolean.valueOf(z);
    }

    private void zzV(float f) {
        this.zzXR[4] = Float.valueOf(f);
    }

    private void zzW(float f) {
        this.zzXR[3] = Float.valueOf(f);
    }

    private void zzX(float f) {
        this.zzXR[2] = Float.valueOf(f);
    }

    private static Object[] zzYA() {
        Object[] objArr = new Object[16];
        objArr[0] = "{87787932-4419-45C3-8CF9-26B211CC2EF5}";
        return objArr;
    }

    public final void setText(String str) {
        this.zzXR[14] = str;
    }

    public final Object[] zzYy() {
        return this.zzXR;
    }

    public final byte[] zzYz() {
        Object[] objArr = this.zzXR;
        byte[] bArr = (byte[]) objArr[15];
        objArr[15] = null;
        return bArr;
    }

    public zzYY(int i, float f, float f2, float f3, float f4, int i2, int i3, String str, float f5, int i4, int i5, int i6, boolean z) {
        this(zzYA());
        zzK(i);
        zzX(f);
        zzW(f2);
        zzV(f3);
        setScale(f4);
        setForeColor(i2);
        setBackColor(i3);
        setFontName(str);
        setFontSize(f5);
        zzJ(i4);
        zzI(i5);
        setTextAlignment(i6);
        zzM(z);
    }
}

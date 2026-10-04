package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz0D extends zz7M {
    private String zzYXf;
    private String zzYXg;
    private zzZBX zzYXh;
    private String zzZ0W;

    public zz0D(String[] strArr, zzZBX zzzbx) {
        if (strArr.length < 4) {
            throw new IllegalArgumentException("Wrong number of formula parts.\r\nParameter name: formulaParts");
        }
        this.zzZ0W = strArr[1];
        this.zzYXg = strArr[2];
        this.zzYXf = strArr[3];
        this.zzYXh = zzzbx;
    }

    public final void zzOg(String str) {
        this.zzYXf = str;
    }

    public final void zzOh(String str) {
        this.zzYXg = str;
    }

    public final void zzOs(String str) {
        this.zzZ0W = str;
    }

    @Override // com.aspose.words.zz7M
    public final double zzX(zzZCC zzzcc) {
        return this.zzYXh.zzL(zz7K.zzZ(this.zzZ0W, zzzcc), zz7K.zzZ(this.zzYXg, zzzcc), zz7K.zzZ(this.zzYXf, zzzcc));
    }

    public final String zzZsl() {
        return this.zzYXf;
    }

    public final String zzZsm() {
        return this.zzYXg;
    }

    public final String zzZxO() {
        return this.zzZ0W;
    }

    public zz0D(String[] strArr, zzZBX zzzbx, String str) {
        this(strArr, zzzbx);
        zzOE(str);
    }
}

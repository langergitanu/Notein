package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz02 extends zz7M {
    private zzZBW zzYX0;
    private String zzYXg;
    private String zzZ0W;

    public zz02(String[] strArr, zzZBW zzzbw) {
        if (strArr.length < 3) {
            throw new IllegalArgumentException("Wrong number of formula parts.\r\nParameter name: formulaParts");
        }
        this.zzZ0W = strArr[1];
        this.zzYXg = strArr[2];
        this.zzYX0 = zzzbw;
    }

    public final void zzOh(String str) {
        this.zzYXg = str;
    }

    public final void zzOs(String str) {
        this.zzZ0W = str;
    }

    @Override // com.aspose.words.zz7M
    public final double zzX(zzZCC zzzcc) {
        return this.zzYX0.zzA(zz7K.zzZ(this.zzZ0W, zzzcc), zz7K.zzZ(this.zzYXg, zzzcc));
    }

    public final String zzZsm() {
        return this.zzYXg;
    }

    public final String zzZxO() {
        return this.zzZ0W;
    }

    public zz02(String[] strArr, zzZBW zzzbw, String str) {
        this(strArr, zzzbw);
        zzOE(str);
    }
}

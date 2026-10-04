package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz4J extends zz7M {
    private String zzZ0W;
    private zzZC6 zzZ0X;

    public zz4J(String[] strArr, zzZC6 zzzc6) {
        if (strArr.length < 2) {
            throw new IllegalArgumentException("Wrong number of formula parts.\r\nParameter name: formulaParts");
        }
        this.zzZ0W = strArr[1];
        this.zzZ0X = zzzc6;
    }

    public final void zzOs(String str) {
        this.zzZ0W = str;
    }

    @Override // com.aspose.words.zz7M
    public final double zzX(zzZCC zzzcc) {
        return this.zzZ0X.zzZ8(zz7K.zzZ(this.zzZ0W, zzzcc));
    }

    public final String zzZxO() {
        return this.zzZ0W;
    }

    public zz4J(String[] strArr, zzZC6 zzzc6, String str) {
        this(strArr, zzzc6);
        zzOE(str);
    }
}

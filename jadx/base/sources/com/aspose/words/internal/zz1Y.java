package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zz1Y extends zz1X {
    private zz1X zzfW;
    private String zzfX;
    private String zzfY;
    private String zzfZ;

    public zz1Y(zz4W zz4w, String str, String str2) {
        super(zz4w);
        this.zzfZ = str;
        this.zzfY = str2;
    }

    public final void zzXL(String str) {
        this.zzfX = str;
    }

    public final void zzY(zz1X zz1x) {
        this.zzfW = zz1x;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/StructElem");
        zzfy.zzH("/S", this.zzfZ);
        zzfy.zzZ("/P", this.zzfW);
        if (zzZYD.zzXk(this.zzfX)) {
            zzfy.zzD("/ID", this.zzfX);
        }
        if (zzZYD.zzXk(this.zzfY)) {
            zzfy.zzC("/Alt", this.zzfY);
        }
        zzz(zzfy);
        zzy(zzfy);
        zzfy.zzFc();
    }

    public void zzz(zzFY zzfy) throws Exception {
    }
}

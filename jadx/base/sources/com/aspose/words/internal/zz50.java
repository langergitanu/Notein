package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz50 extends zz21 {
    private zz39 zzjV;
    private zz38 zzjW;
    private zz4Y zzjX;
    private zz4X zzjY;

    public zz50(zz4W zz4w, zz4Y zz4y) throws Exception {
        super(zz4w);
        this.zzjX = zz4y;
        this.zzjY = new zz4X(this);
        this.zzjV = new zz39(this);
        this.zzjW = new zz38(this);
    }

    public final zz39 zzvi() {
        return this.zzjV;
    }

    public final zz38 zzvj() {
        return this.zzjW;
    }

    public final zz4Y zzvk() {
        return this.zzjX;
    }

    public final zz4X zzvl() {
        return this.zzjY;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz4S extends zz33 {
    private zz1I zzjs;
    private zz4U zzjz;

    public zz4S(zz4W zz4w, zz4U zz4u, zz1I zz1i) {
        super(zz4w);
        this.zzjz = zz4u;
        this.zzjs = zz1i;
    }

    private zz45 zzZ6(long j) {
        if (j >= 200 && zzuN().zzvc().getTextCompression() == 3) {
            return new zz43();
        }
        return new zz3Y();
    }

    private zzZOR zzuW() throws Exception {
        zzZOR zzzor = new zzZOR();
        zzXZ zzxz = new zzXZ(zzzor);
        for (int i = 0; i < this.zzjz.zzv0().getCount(); i++) {
            zz4T zz4tZzVY = this.zzjz.zzv0().zzVY(i);
            zzxz.writeByte((byte) zz4tZzVY.zzuZ());
            zzxz.zzl(zz4tZzVY.zzuY());
            zzxz.zzj(zz4tZzVY.zzuX());
        }
        return zzzor;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzZOR zzzorZzuW = zzuW();
        try {
            zzZOR zzzor = new zzZOR();
            try {
                zz45 zz45VarZzZ6 = zzZ6(zzzorZzuW.getLength());
                zz45VarZzZ6.zzZ(zzzorZzuW, zzzor, null);
                zzfy.zzFd();
                zzfy.zzH("/Type", "/XRef");
                zzfy.zzZ("/W", new int[]{1, 4, 2});
                this.zzjs.zzv(zzfy);
                zz45VarZzZ6.zzH(zzfy);
                zzfy.zzM("/Length", (int) zzzor.getLength());
                zzfy.zzFc();
                zzfy.zzP(zzzor.zziA(), (int) zzzor.getLength());
            } finally {
                zzzor.close();
            }
        } finally {
            zzzorZzuW.close();
        }
    }
}

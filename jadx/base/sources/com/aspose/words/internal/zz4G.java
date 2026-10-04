package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz4G extends zz33 {
    private byte[] zziA;
    private byte[] zziB;
    private byte[] zziC;
    private boolean zziD;
    private byte[] zziE;
    private byte[] zziF;
    private int zziI;

    private zz4G(zz4W zz4w) {
        super(zz4w);
    }

    public static zz4G zzZ(zz4W zz4w, int i, byte[] bArr, byte[] bArr2) {
        zz4G zz4g = new zz4G(zz4w);
        zz4g.zziD = false;
        zz4g.zziI = i;
        zz4g.zziF = bArr;
        zz4g.zziE = bArr2;
        return zz4g;
    }

    public static zz4G zzZ(zz4W zz4w, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        zz4G zz4g = new zz4G(zz4w);
        zz4g.zziD = true;
        zz4g.zziI = i;
        zz4g.zziA = bArr;
        zz4g.zziF = bArr2;
        zz4g.zziC = bArr3;
        zz4g.zziE = bArr4;
        zz4g.zziB = bArr5;
        return zz4g;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzZ((zz2V) null);
        zzfy.zzFd();
        zzfy.zzH("/Filter", "/Standard");
        zzfy.zzM("/V", this.zziD ? 5 : 4);
        zzfy.zzM("/R", this.zziD ? 6 : 4);
        zzfy.zzM("/Length", this.zziD ? 256 : 128);
        zzfy.zzYY("/CF");
        zzfy.zzFd();
        zzfy.zzYY("/StdCF");
        zzfy.zzFd();
        zzfy.zzH("/CFM", this.zziD ? "/AESV3" : "/AESV2");
        zzfy.zzM("/Length", this.zziD ? 32 : 16);
        zzfy.zzFc();
        zzfy.zzFc();
        zzfy.zzH("/StmF", "/StdCF");
        zzfy.zzH("/StrF", "/StdCF");
        zzfy.zzY("/O", this.zziF);
        if (this.zziD) {
            zzfy.zzY("/OE", this.zziC);
        }
        zzfy.zzY("/U", this.zziE);
        if (this.zziD) {
            zzfy.zzY("/UE", this.zziB);
        }
        zzfy.zzM("/P", this.zziI);
        if (this.zziD) {
            zzfy.zzY("/Perms", this.zziA);
        }
        zzfy.zzFc();
    }
}

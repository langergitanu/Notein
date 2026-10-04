package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzOH extends zzOG {
    private boolean zzFX;
    private zzZQ4 zzFY;
    private float zzFZ;
    private zzPV[] zzG0;
    private byte[] zzP;

    public zzOH(byte[] bArr) {
        this(bArr, (byte) 0);
        this.zzFX = true;
    }

    public final byte[] getImageBytes() {
        return this.zzP;
    }

    public final void setImageBytes(byte[] bArr) {
        this.zzP = bArr;
    }

    public final void zzE(zzZQ4 zzzq4) {
        this.zzFY = zzzq4;
    }

    public final boolean zzNc() {
        return this.zzFX;
    }

    public final zzZQ4 zzNd() {
        return this.zzFY;
    }

    public final zzPV[] zzNe() {
        return this.zzG0;
    }

    public final float zzNf() {
        return this.zzFZ;
    }

    public final void zzX(zzPV[] zzpvArr) {
        this.zzG0 = zzpvArr;
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzH5 zzh5) throws Exception {
        this.zzP = zzh5.zzZ(this.zzP);
    }

    public final void zzy(float f) {
        this.zzFZ = f;
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzPW zzpw) throws Exception {
        zzpw.zzZ(this);
    }

    public zzOH(byte[] bArr, byte b) {
        this(bArr, 0);
    }

    public zzOH(byte[] bArr, int i) {
        super(2);
        this.zzFZ = -3.4028235E38f;
        this.zzFY = zzZQ4.zz2T;
        this.zzP = bArr;
        zzL(new zzP9());
        zzXR(i);
    }
}

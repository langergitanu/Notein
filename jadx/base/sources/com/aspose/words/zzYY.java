package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYY {
    private boolean zzZDN;
    private byte zzZDO;
    private byte zzZDP;
    private byte zzZDQ;

    public zzYY(zzYYL zzyyl) throws Exception {
        this.zzZDQ = zzyyl.readByte();
        this.zzZDP = zzyyl.readByte();
        this.zzZDO = zzyyl.readByte();
        this.zzZDN = zzyyl.readByte() == 1;
    }

    public final boolean zzag() {
        return this.zzZDN;
    }

    public final byte zzah() {
        return this.zzZDO;
    }

    public final byte zzai() {
        return this.zzZDP;
    }

    public final byte zzaj() {
        return this.zzZDQ;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWI {
    private byte[] zzTZ;
    private zzHD zzTu;
    private zzWL zzTv;
    private zzWL zzTw;
    private boolean zzTx;

    public zzWI(byte[] bArr, zzWL zzwl, zzWL zzwl2, zzHD zzhd) {
        this.zzTw = zzwl;
        this.zzTv = zzwl2;
        this.zzTu = zzhd;
        this.zzTZ = bArr;
    }

    public final boolean hasErrors() {
        return this.zzTx;
    }

    public final void zzUQ() {
        zzWH zzwh = new zzWH(this.zzTZ, this.zzTw, this.zzTv, this.zzTu);
        while (!zzwh.zzUL()) {
            zzWG zzwgZzUJ = zzwh.zzUJ();
            if (zzwh.hasErrors()) {
                break;
            } else {
                zzwgZzUJ.zzZ(zzwh);
            }
        }
        this.zzTx = zzwh.hasErrors();
    }
}

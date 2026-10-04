package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWM {
    private byte[] zzTZ;

    private zzWM() {
    }

    public static zzWM zzU(zzWK zzwk) throws Exception {
        zzWM zzwm = new zzWM();
        zzwk.zzUU();
        zzwk.zzUU();
        short sZzUU = zzwk.zzUU();
        zzwk.zzUR();
        zzwk.zzq().zzH(zzwk.zzq().getPosition() - 4);
        zzwm.zzTZ = zzwk.zzn(sZzUU);
        return zzwm;
    }

    public final int getSize() {
        return this.zzTZ.length;
    }

    public final void zzZ(zzWJ zzwj) throws Exception {
        zzwj.writeBytes(this.zzTZ);
    }
}

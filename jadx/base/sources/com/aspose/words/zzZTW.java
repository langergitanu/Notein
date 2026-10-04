package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTW extends zzZT7 {
    int size;
    int tag;
    private boolean zzYKl;
    private zzZU0 zzYKm;
    int zzYKn;
    int zzYKo;
    int zzYKp;
    int zzYKq;
    int zzYKr;
    int zzYKs;
    byte[] zzYKt;
    int zzYKu;
    int zzYKv;

    public zzZTW() {
        super(61447, 2);
    }

    private void zzV(zzZSP zzzsp) throws Exception {
        zzzsp.zzr((byte) this.zzYKv);
        zzzsp.zzr((byte) this.zzYKu);
        zzzsp.write(this.zzYKt);
        zzzsp.zzI((short) this.tag);
        zzzsp.write(this.size);
        zzzsp.write(this.zzYKs);
        zzzsp.zzDY((int) (((long) this.zzYKr) & 4294967295L));
        zzzsp.zzr((byte) this.zzYKq);
        zzzsp.zzr((byte) this.zzYKp);
        zzzsp.zzr((byte) this.zzYKo);
        zzzsp.zzr((byte) this.zzYKn);
    }

    private void zzx(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKv = zzzox.readByte() & 255;
        this.zzYKu = zzzox.readByte() & 255;
        this.zzYKt = zzzox.zzn(16);
        this.tag = zzzox.zzXa();
        this.size = zzzox.zzXc();
        this.zzYKs = zzzox.zzXc();
        this.zzYKr = zzzox.zzXb();
        this.zzYKq = zzzox.readByte() & 255;
        this.zzYKp = zzzox.readByte() & 255;
        this.zzYKo = zzzox.readByte() & 255;
        this.zzYKn = zzzox.readByte() & 255;
        if (this.zzYKp > 0) {
            throw new IllegalStateException("Found a BLIP with a name and this is not yet supported.");
        }
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int position = (int) (zzzox.zzq().getPosition() + ((long) zzZii().getLength()));
        zzx(zzzox);
        while (zzzox.zzq().getPosition() < position) {
            this.zzYKl = true;
            zzZU0 zzzu0 = (zzZU0) com.aspose.words.internal.zzZKW.zzZ(zzZT5.zzZ(zzzox, getWarningCallback()), zzZU0.class);
            if (zzzu0 != null) {
                this.zzYKm = zzzu0;
            }
        }
    }

    public final void zzW(zzZSP zzzsp) throws Exception {
        this.zzYKr = (int) zzzsp.zzq().getPosition();
        this.size = this.zzYKm.zzS(zzzsp);
    }

    public final void zzWo(boolean z) {
        this.zzYKl = z;
    }

    public final void zzZ(zzZU0 zzzu0) {
        this.zzYKm = zzzu0;
    }

    public final zzZU0 zzZiJ() {
        return this.zzYKm;
    }

    public final boolean zzZiK() {
        return this.zzYKl;
    }

    public final void zzy(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if ((((long) this.zzYKr) & 4294967295L) == 4294967295L || this.zzYKs == 0 || this.zzYKv == 0) {
            return;
        }
        zzzox.zzq().zzH(((long) this.zzYKr) & 4294967295L);
        this.zzYKm = (zzZU0) com.aspose.words.internal.zzZKW.zzZ(zzZT5.zzZ(zzzox, getWarningCallback()), zzZU0.class);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        int position = (int) zzzsp.zzq().getPosition();
        zzV(zzzsp);
        if (this.zzYKl) {
            this.size = this.zzYKm.zzS(zzzsp);
            int position2 = (int) zzzsp.zzq().getPosition();
            zzzsp.zzq().zzH(position);
            zzV(zzzsp);
            zzzsp.zzq().zzH(position2);
        }
    }
}

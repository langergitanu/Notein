package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZO5 extends zzZZG<zzYCQ> {
    static boolean zzZD5 = false;
    private com.aspose.words.internal.zzZOX zzYzm;

    public zzZO5() {
        super(12);
    }

    private void zzZ9O() {
        int i = 0;
        while (i < zzsk() - 1) {
            int i2 = i + 1;
            if (zzTe(i) == zzTe(i2)) {
                removeAt(i);
            } else {
                i = i2;
            }
        }
    }

    public final void zzR(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        for (int i = 0; i < getItemCount(); i++) {
            zzYCQ zzycq = get(i);
            zzycq.zzXnI = -1;
            if (zzycq.zzXnH.getData().length > 0) {
                zzycq.zzXnK = (int) zzzow.zzq().getPosition();
                zzycq.zzXnH.zzZ(zzzow);
            } else {
                zzycq.zzXnK = -1;
            }
        }
    }

    @Override // com.aspose.words.zzZZH
    public final zzZ8R zzU(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzYCQ zzycq = new zzYCQ(zzzox);
        if ((((long) zzycq.zzXnK) & 4294967295L) != 4294967295L) {
            long position = this.zzYzm.zzq().getPosition();
            if ((((long) zzycq.zzXnK) & 4294967295L) <= this.zzYzm.zzq().getLength()) {
                this.zzYzm.zzq().zzU(4294967295L & ((long) zzycq.zzXnK), 0);
                zzycq.zzXnH = zzYE1.zz8(this.zzYzm);
            }
            this.zzYzm.zzq().zzH(position);
        }
        return zzycq;
    }

    public zzZO5(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, com.aspose.words.internal.zzZOX zzzox2) throws Exception {
        this();
        this.zzYzm = zzzox;
        zzZ(zzzox2, zzzra.zzYGE.zzXAz);
        zzZ9O();
    }
}

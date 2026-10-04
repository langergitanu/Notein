package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzMY extends zzMO {
    private long zzDN;
    private byte[] zzDO;
    private boolean zzDP;
    private int zzDQ;
    private int zzDR;
    private int zzDS;
    private byte zzDT;
    private zzP9 zzDU;
    private zzZQ4 zzDV;
    private zzZQ4 zzDW;

    private zzXN zzJV() throws Exception {
        return new zzXN(zzEF.zzZ(zzJJ(), this.zzDQ, this.zzDR));
    }

    private zzXN zzJW() throws Exception {
        int position = (int) zzJJ().zzq().getPosition();
        zzXO zzxoZzY = zzQX.zzY(zzJJ());
        if (!zzZ(zzxoZzY, this.zzDR)) {
            return null;
        }
        zzJJ().zzq().zzH(position + this.zzDQ);
        boolean z = zzxoZzY.getHeight() > 0;
        int iAbs = Math.abs(zzxoZzY.getHeight());
        zzXN zzxn = new zzXN(zzxoZzY.getWidth(), iAbs);
        zzXQ zzxqZzWz = zzxn.zzWz();
        for (int i = 0; i < iAbs; i++) {
            for (int i2 = 0; i2 < zzxoZzY.getWidth(); i2++) {
                byte bZzX6 = zzJJ().zzX6();
                byte bZzX62 = zzJJ().zzX6();
                byte bZzX63 = zzJJ().zzX6();
                byte bZzX64 = zzJJ().zzX6();
                int i3 = bZzX64 & 255;
                if (i3 > 0) {
                    float f = i3 / 255.0f;
                    bZzX6 = zzZ(bZzX6, f);
                    bZzX62 = zzZ(bZzX62, f);
                    bZzX63 = zzZ(bZzX63, f);
                }
                zzxqZzWz.zzY(((z ? (iAbs - i) - 1 : i) * zzxoZzY.getWidth()) + i2, bZzX64, bZzX63, bZzX62, bZzX6);
            }
        }
        zzxqZzWz.zzWQ();
        return zzxn;
    }

    private zzXN zzJX() throws Exception {
        return this.zzDS == 1 ? zzJW() : zzJV();
    }

    private byte[] zzJY() throws Exception {
        zzJJ().zzq().zzH(this.zzDN);
        zzXN zzxnZzJX = zzJX();
        if (zzxnZzJX == null) {
            if (zzxnZzJX == null) {
                return null;
            }
            zzxnZzJX.dispose();
            return null;
        }
        try {
            byte b = this.zzDT;
            if ((b & 255) != 255) {
                zzZ(zzxnZzJX, b);
            }
            zzZOR zzzor = new zzZOR();
            try {
                zzxnZzJX.zzV(zzzor);
                byte[] bArrZzWy = zzzor.zzWy();
                zzxnZzJX.dispose();
                return bArrZzWy;
            } finally {
                zzzor.close();
            }
        } catch (Throwable th) {
            zzxnZzJX.dispose();
            throw th;
        }
    }

    private static byte zzZ(byte b, float f) {
        return (byte) Math.min((int) ((b & 255) / f), 255);
    }

    public final zzP9 zzJS() {
        return this.zzDU;
    }

    public final zzZQ4 zzJT() {
        return this.zzDV;
    }

    public final zzZQ4 zzJU() {
        return this.zzDW;
    }

    public final byte[] zzJZ() throws Exception {
        if (!this.zzDP) {
            this.zzDO = zzJY();
            this.zzDP = true;
        }
        return this.zzDO;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        zzJJ().zzMY();
        int iZzXc = zzJJ().zzXc();
        int iZzXc2 = zzJJ().zzXc();
        int iZzXc3 = zzJJ().zzXc();
        int iZzXc4 = zzJJ().zzXc();
        zzJJ().zzX6();
        zzJJ().zzX6();
        this.zzDT = zzJJ().zzX6();
        this.zzDS = zzJJ().zzX6() & 255;
        int iZzXc5 = zzJJ().zzXc();
        int iZzXc6 = zzJJ().zzXc();
        this.zzDU = zzJJ().zzMQ();
        zzJJ().zzMW();
        zzJJ().zzXc();
        zzJJ().zzXc();
        this.zzDQ = zzJJ().zzXc();
        zzJJ().zzXc();
        this.zzDR = zzJJ().zzXc();
        this.zzDV = new zzZQ4(iZzXc5, iZzXc6, zzJJ().zzXc(), zzJJ().zzXc());
        this.zzDW = new zzZQ4(iZzXc, iZzXc2, iZzXc3, iZzXc4);
        this.zzDN = zzJJ().zzq().getPosition();
    }

    private static boolean zzZ(zzXO zzxo, int i) {
        if (zzxo.zzWM() != 32) {
            return false;
        }
        if (zzxo.zzWL() == 3 || zzxo.zzWL() == 0) {
            return i == (Math.abs(zzxo.getHeight()) * zzxo.getWidth()) * 4;
        }
        return false;
    }

    private static void zzZ(zzXN zzxn, byte b) {
        zzPT zzpt = new zzPT();
        zzpt.set(3, 3, (b & 255) / 255.0f);
        zzPJ zzpj = new zzPJ();
        zzpj.zzZ(zzpt);
        zzxn.zzZ(zzpj);
    }
}

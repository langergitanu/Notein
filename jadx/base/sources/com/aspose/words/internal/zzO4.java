package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzO4 implements zzG8, zzZOY {
    private zzZOW zzFA;
    private zzZOR zzFB;
    private int zzFC;
    private zzO8 zzFD;
    private zzZOP zzFE;
    private zzM2 zzFI;

    private zzO4(zz8T zz8t, int i) throws Exception {
        this.zzFE = zz8t.zzR1();
        zzM2 zzm2 = new zzM2(zz8t, this);
        this.zzFI = zzm2;
        this.zzFD = zzm2.zzJz();
        this.zzFC = i;
        zzZOR zzzor = new zzZOR();
        this.zzFB = zzzor;
        this.zzFA = new zzZOW(zzzor);
    }

    private void zzMH() throws Exception {
        this.zzFE.zzH(this.zzFI.zzJA().zzJr());
        byte[] bArrZzn = this.zzFI.zzJz().zzn((int) this.zzFI.zzJA().zzJq());
        this.zzFB.write(bArrZzn, 0, bArrZzn.length);
    }

    private void zzMI() throws Exception {
        int position = (int) this.zzFB.getPosition();
        this.zzFB.zzH(48L);
        this.zzFA.zzl(position);
        this.zzFA.zzl(this.zzFC + 2);
    }

    private void zzMJ() throws Exception {
        this.zzFE.zzH(4L);
        int iZzXc = this.zzFD.zzXc();
        this.zzFE.zzH(0L);
        this.zzFA.writeBytes(this.zzFD.zzn(iZzXc));
    }

    public static byte[] zzZ(zz8T zz8t, int i) throws Exception {
        zzO4 zzo4 = new zzO4(zz8t, i);
        try {
            zzo4.zzMJ();
            zzo4.zzFI.play();
            zzo4.zzMH();
            zzo4.zzMI();
            return zzo4.zzFB.zzWy();
        } finally {
            zzo4.dispose();
        }
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() throws Exception {
        zzZOR zzzor = this.zzFB;
        if (zzzor != null) {
            zzzor.dispose();
            this.zzFB = null;
        }
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        if (this.zzFI.zzJA().zzJp() > this.zzFC && this.zzFI.zzJA().getType() != 14) {
            return true;
        }
        zzMH();
        return true;
    }
}

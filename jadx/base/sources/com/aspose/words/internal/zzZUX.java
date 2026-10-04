package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZUX implements zzG8, zzZOY {
    private zzZV1 zz6U;
    private zzZOW zzFA;
    private zzZOR zzFB;
    private int zzFC;
    private zzZOP zzFE;
    private zzZTY zzr0;
    private zz8T zzr4;

    private zzZUX(zz8T zz8t, int i) throws Exception {
        this.zzr4 = zz8t;
        this.zzFE = zz8t.zzR1();
        zzZTY zzzty = new zzZTY(zz8t, this);
        this.zzr0 = zzzty;
        this.zz6U = zzzty.zzmP();
        this.zzFC = i;
        zzZOR zzzor = new zzZOR();
        this.zzFB = zzzor;
        this.zzFA = new zzZOW(zzzor);
    }

    private void zzMH() throws Exception {
        this.zzFE.zzH(this.zzr0.zzmO().zzJr());
        byte[] bArrZzn = this.zzr0.zzmP().zzn((int) this.zzr0.zzmO().zzJq());
        this.zzFB.write(bArrZzn, 0, bArrZzn.length);
    }

    private void zzMI() throws Exception {
        int position = (int) this.zzFB.getPosition();
        this.zzFB.zzH(34L);
        this.zzFA.zzl(position);
    }

    private void zzMJ() throws Exception {
        this.zzFE.zzH(0L);
        if (this.zzr4.zzyX() == 2) {
            this.zzFA.writeBytes(this.zz6U.zzn(22));
        } else {
            new zz8Y((short) this.zzr4.zzyQ().getLeft(), (short) this.zzr4.zzyQ().getTop(), (short) this.zzr4.zzyQ().getRight(), (short) this.zzr4.zzyQ().getBottom()).zzZ(this.zzFA);
        }
        this.zzFA.writeBytes(this.zz6U.zzn(18));
    }

    public static byte[] zzZ(zz8T zz8t, int i) throws Exception {
        zzZUX zzzux = new zzZUX(zz8t, i);
        try {
            zzzux.zzMJ();
            zzzux.zzr0.play();
            zzzux.zzMH();
            zzzux.zzMI();
            return zzzux.zzFB.zzWy();
        } finally {
            zzzux.dispose();
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
        if (this.zzr0.zzmO().zzJp() > this.zzFC && this.zzr0.zzmO().getType() != 0) {
            return true;
        }
        zzMH();
        return true;
    }
}

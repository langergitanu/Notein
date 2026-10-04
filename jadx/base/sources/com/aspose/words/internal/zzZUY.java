package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZUY implements zzG8, zzZOY {
    private int zz6V;
    private boolean zz6W;
    private zzZOR zz6X = new zzZOR();
    private zzZTY zzr0;

    private zzZUY(zz8T zz8t) {
        this.zzr0 = new zzZTY(zz8t, this);
    }

    public static byte[] zzX(zz8T zz8t) throws Exception {
        zzZUY zzzuy = new zzZUY(zz8t);
        try {
            zzzuy.zzr0.play();
            byte[] bArrZzWy = zzzuy.zz6X.zzWy();
            if (zzzuy.zz6W) {
                if (bArrZzWy.length > 0) {
                    return bArrZzWy;
                }
            }
            zzzuy.dispose();
            return null;
        } finally {
            zzzuy.dispose();
        }
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() {
        zzZOR zzzor = this.zz6X;
        if (zzzor != null) {
            zzzor.dispose();
            this.zz6X = null;
        }
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        if (this.zzr0.zzmO().getType() != 1574 || this.zzr0.zzmP().zzXa() != 15) {
            return false;
        }
        this.zzr0.zzmP().zzXa();
        int iZzXc = this.zzr0.zzmP().zzXc();
        int iZzXc2 = this.zzr0.zzmP().zzXc();
        int iZzXc3 = this.zzr0.zzmP().zzXc();
        if (iZzXc == 1128680791 && iZzXc2 == 1 && iZzXc3 == 65536) {
            this.zzr0.zzmP().zzXa();
            this.zzr0.zzmP().zzXc();
            int iZzXc4 = this.zzr0.zzmP().zzXc();
            int iZzXc5 = this.zzr0.zzmP().zzXc();
            int iZzXc6 = this.zzr0.zzmP().zzXc();
            int iZzXc7 = this.zzr0.zzmP().zzXc();
            byte[] bArrZzn = this.zzr0.zzmP().zzn(iZzXc5);
            this.zz6X.write(bArrZzn, 0, bArrZzn.length);
            this.zz6V++;
            long j = iZzXc7;
            this.zz6W = j == this.zz6X.getLength() && iZzXc6 == 0 && iZzXc4 == this.zz6V;
            if (this.zz6X.getLength() < j) {
                return true;
            }
        }
        return false;
    }
}

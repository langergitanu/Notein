package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzX1 extends com.aspose.words.internal.zz6 {
    private ArrayList<zzX2> zzZAm;
    private zzYL9 zzZAn;
    private boolean zzZAo;
    private com.aspose.words.internal.zzZQ4 zzZL;

    private zzYL9 zzD(com.aspose.words.internal.zzZG zzzg) throws Exception {
        com.aspose.words.internal.zzOH zzoh;
        if (zzzg.zzZ2() == null && (zzoh = (com.aspose.words.internal.zzOH) com.aspose.words.internal.zzZKW.zzZ(zzzg.zzZ1(), com.aspose.words.internal.zzOH.class)) != null) {
            return zzZ8E.zzZ(zzoh.getImageBytes(), this.zzZL);
        }
        return null;
    }

    private zzYL9 zzE(com.aspose.words.internal.zzZG zzzg) throws Exception {
        zzYL9 zzyl9ZzD = !this.zzZAo ? zzD(zzzg) : null;
        return zzyl9ZzD == null ? zzYM8.zzr(zzzg) : zzyl9ZzD;
    }

    private static zzYL9 zzP(com.aspose.words.internal.zzZP zzzp) throws Exception {
        return zzZ8E.zzZ(zzzp.getImageBytes(), zzzp.zzZj());
    }

    private zzYL9 zzW(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        this.zzZL = zzzq4;
        this.zzZAn = new zzYL9();
        this.zzZAm = new ArrayList<>();
        zzg.zzZ(this);
        return this.zzZAn;
    }

    public static zzYL9 zzX(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        return new zzX1().zzW(zzg, zzzq4);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzG zzg) {
        if (this.zzZAo && zzg.getCount() == 0) {
            zzZ(new zzYL9(new zzYLC(new long[]{0})));
        }
        ArrayList<zzX2> arrayList = this.zzZAm;
        Class.getSimpleName();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzG zzg) throws Exception {
        zzX2 zzx2 = new zzX2(zzg.zzZO());
        if (zzg.zzZN() != null) {
            com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(zzg.zzZN().zzO8());
            zzzg.zzX(new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzKa));
            zzzg.zzZ2().setWidth(0.0f);
            zzYL9 zzyl9Zzr = zzYM8.zzr(zzzg);
            zzx2.zzZ(zzyl9Zzr.zzYna() > 0 ? zzyl9Zzr.zzq0(0) : null);
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZAm, zzx2);
    }

    private void zzY(zzYL9 zzyl9) {
        zzX2 zzx2 = (zzX2) C21505OooO0Oo.OooO00o(1, this.zzZAm);
        if (zzx2.zz6M() != null) {
            zzyl9.zzT(zzx2.zz6M());
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        zzZ(zzE(zzzg));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZP zzzp) throws Exception {
        zzZ(zzP(zzzp));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZU zzzu) {
        if (zzzu.isHidden()) {
            return;
        }
        zzZ(new zzYL9(new zzYLC(zzzu.zzZj())));
    }

    private void zzY(zzYLC zzylc) {
        for (int size = this.zzZAm.size() - 1; size >= 0; size--) {
            zzX2 zzx2 = this.zzZAm.get(size);
            com.aspose.words.internal.zzP9 zzp9ZzZO = zzx2.zzZO() != null ? zzx2.zzZO() : null;
            if (zzp9ZzZO != null) {
                zzylc.zzq(zzp9ZzZO);
            }
        }
    }

    private void zzZ(zzYL9 zzyl9) {
        zzY(zzyl9);
        for (int i = 0; i < zzyl9.zzYna(); i++) {
            zzY(zzyl9.zzq0(i));
            if (this.zzZAo) {
                this.zzZAn.zzU(zzyl9.zzq0(i));
            } else {
                this.zzZAn.zzV(zzyl9.zzq0(i));
            }
        }
    }
}

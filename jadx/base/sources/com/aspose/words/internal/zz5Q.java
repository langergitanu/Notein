package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz5Q extends zz5S {
    private static zzPV zzkJ = zzPV.zzKa;
    private zzPM zzZl;
    private ArrayList<String> zzZm;
    private int zzZn;
    private zz5T zzkK;

    public zz5Q(zz2M zz2m, zz9 zz9Var) throws Exception {
        super(zz2m, zz9Var);
        this.zzZn = zz9Var.getValue();
        this.zzZm = zz9Var.zzZA();
        this.zzZl = zz9Var.zzZB();
        zzX(zzwg());
        zzwh();
        zzwe();
    }

    private void zzwe() throws Exception {
        zz3Q zz3qZzM = zzuN().zzvU().zzM(this.zzZl);
        Iterator<String> it = this.zzZm.iterator();
        while (it.hasNext()) {
            zz3qZzM.zzXQ(it.next());
        }
    }

    private long zzwf() {
        float fZzPg = this.zzZl.zzPg();
        float fZzPg2 = this.zzZl.zzPg();
        for (int i = 0; i < this.zzZm.size(); i++) {
            long jZz6 = this.zzZl.zz6(this.zzZm.get(i));
            int i2 = (int) jZz6;
            if (Float.intBitsToFloat(i2) > fZzPg) {
                fZzPg = Float.intBitsToFloat(i2);
            }
            if (zzZPW.zzYz(jZz6) > fZzPg2) {
                fZzPg2 = zzZPW.zzYz(jZz6);
            }
        }
        return zzZPW.zzG(fZzPg, fZzPg2);
    }

    private zzZQ4 zzwg() {
        long jZzwf = zzwf();
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzZT()) - 1.75f;
        float fZzYC = zzZPY.zzYC(zzZT());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jZzwf) + fIntBitsToFloat + 10.0f + 3.5f;
        float fZzYz = (fZzYC - zzZPW.zzYz(jZzwf)) - 2.0f;
        if (fZzYz < 0.0f) {
            fZzYz = 0.0f;
        }
        if (fIntBitsToFloat2 > this.zzkP.getWidth()) {
            fIntBitsToFloat2 = this.zzkP.getWidth();
        }
        return zzZQ4.zzX(fIntBitsToFloat, fZzYz, fIntBitsToFloat2, fZzYC);
    }

    private void zzwh() throws Exception {
        zz5T zz5t = new zz5T(zzuN());
        this.zzkK = zz5t;
        zz5t.zzX(new zzZQ4(0.0f, 0.0f, zzZv().getWidth(), zzZv().getHeight()));
        zzZ(this.zzkK.zzvl());
    }

    @Override // com.aspose.words.internal.zz5S
    public final int getFieldType() {
        return 2;
    }

    @Override // com.aspose.words.internal.zz5S
    public final void zzX(zzFY zzfy) throws Exception {
        zzfy.zzYY("/Opt");
        zzfy.zzFf();
        for (int i = 0; i < this.zzZm.size(); i++) {
            zzfy.zzYV(this.zzZm.get(i));
            if (i < this.zzZm.size() - 1) {
                zzfy.zzFh();
            }
        }
        zzfy.zzFe();
        zzfy.zzC("/V", this.zzZm.get(this.zzZn));
        zzfy.zzD("/DA", zzZ(this.zzZl, zzZu()));
        zzfy.zzYY("/AP");
        zzfy.zzFd();
        zzfy.zzZ("/N", this.zzkK);
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        this.zzkK.zzY(zzfx);
    }

    @Override // com.aspose.words.internal.zz5S
    public final int zzwk() {
        return 131072 | super.zzwk();
    }

    private void zzZ(zz4X zz4x) throws Exception {
        zz5S.zzZ(zz4x, this.zzkK.zzZv(), zzkJ, zzZt());
        zz4x.zzXW(" /Tx BMC\r\n  q\r\n   BT\r\n    ");
        zz5S.zzZ(zz4x, zzZu(), false);
        zz3Q zz3qZzZ = zzZ(zz4x, this.zzZl);
        zz5S.zzZ(zz4x, (zzZv().getHeight() - this.zzZl.zzPg()) - 1.0f);
        zz5S.zzY(zz4x, 0.0f);
        zz5S.zzZ(zz4x, this.zzZm.get(this.zzZn), zz3qZzZ);
        zz4x.zzXW("\r\n   ET\r\n  Q\r\n EMC");
    }
}

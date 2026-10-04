package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz9H extends zz9F {
    private zzJ7 zzZ5P;
    private zzJ3 zzZ5Q;
    private zz9K zzZ5R;
    private zz9K zzZ5S;
    private zzJ6 zzZ5T;
    private zz65 zzZ5U;
    private zz9G zzZ5V;

    public zz9H(zz8Z zz8z) {
        super(zz8z);
        this.zzZ5T = new zzJ6();
    }

    private static boolean zzJ1(int i) {
        return i == 3 || i == 5;
    }

    private zzJ4 zzL(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        ArrayList<zzJ4> arrayList = new ArrayList();
        Iterator<T> it = this.zzZ5T.zzZRX().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            Iterator<T> it2 = this.zzZ5T.zzZRW().iterator();
            while (it2.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzJ4>) arrayList, zzJ5.zzZ(zzzq4, zzzq42, iIntValue, ((Integer) it2.next()).intValue()));
            }
        }
        zzJ4 zzj4 = (zzJ4) arrayList.get(0);
        for (zzJ4 zzj42 : arrayList) {
            if (zzj42.zzZSd() <= zzj4.zzZSd()) {
                zzj4 = zzj42;
            }
        }
        return zzj4;
    }

    private void zzY(zz07 zz07Var) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZDY = zzZDX().zzZDY();
        zz07Var.zzW(zz07Var.zzQb() + ((double) com.aspose.words.internal.zzSA.zzo(zzzq4ZzZDY.getX())));
        zz07Var.zzV(zz07Var.zzYm() + ((double) com.aspose.words.internal.zzSA.zzo(zzzq4ZzZDY.getY())));
    }

    private static zz9K zzZ(zz93 zz93Var, String str, ArrayList<zz9K> arrayList) {
        if (zz93Var == null || arrayList.size() == 0) {
            return null;
        }
        for (zz9K zz9k : arrayList) {
            if (zzZ(zz9k, str) && zz9k.zzZDU() == zz93Var) {
                return zz9k;
            }
        }
        for (zz9K zz9k2 : arrayList) {
            if (zzZ(zz9k2, str)) {
                return zz9k2;
            }
        }
        for (zz9K zz9k3 : arrayList) {
            if (zz9k3.zzZDU() == zz93Var) {
                return zz9k3;
            }
        }
        return null;
    }

    private boolean zzZDr() {
        return (this.zzZ5S == null || this.zzZ5R == null) ? false : true;
    }

    private void zzZDs() throws Exception {
        if (this.zzZ5V == null) {
            return;
        }
        zzZDR().zzZz5();
        this.zzZ5V.zzZ(this.zzZ5P.zzZS7());
        this.zzZ5V.zzZE4();
    }

    private zz2O zzZDt() {
        zzJ7 zzj7 = this.zzZ5P;
        if (zzj7 == null || zzj7.isEmpty()) {
            return null;
        }
        zz2O zz2o = new zz2O(0);
        zz2o.zzO(zzZDL().zzZCJ());
        zz2o.zzZ(this.zzZ5P.zzZTf());
        zz2o.zzZ(this.zzZ5P.zzZTh().zzZAi());
        zzY(zz2o.zzZTh());
        zzJ3 zzj3ZzZ = zzJ3.zzZ(this.zzZ5T, zzZDS());
        zzj3ZzZ.zzZ(zz2o);
        zzZDL().zzZCM().zzZ(zz2o, zzZDV(), zzj3ZzZ.zzZRS());
        return zz2o;
    }

    public final void zz5(ArrayList<zz9K> arrayList) {
        if (zzZDT().size() == 0) {
            return;
        }
        zz93 zz93Var = zzZDT().get(0);
        if (zzJ1(zz93Var.getType())) {
            this.zzZ5S = zzZ(zzZDL().zzZEk().zzX(zz93Var), this.zzZ5T.zzZRZ(), arrayList);
            this.zzZ5R = zzZ(zzZDL().zzZEk().zzW(zz93Var), this.zzZ5T.zzZRY(), arrayList);
        }
    }

    @Override // com.aspose.words.zz9K
    public final void zzW(com.aspose.words.internal.zzZYT<String> zzzyt) {
        this.zzZ5T.zzX(zzzyt);
    }

    public final void zzZDu() {
        this.zzZ5Q = zzJ3.zzZ(this.zzZ5T, zzZDS());
    }

    @Override // com.aspose.words.zz9K
    public final void zzZE0() {
        super.zzZE0();
        this.zzZ5U = zzZDR().zzHW(8);
        zzZDR().zzHW(31);
        zzZDR().zzHW(3);
        zzZDR().zzHW(14);
        zzZDR().zzHW(4);
        zzZDR().zzHW(15);
        zzZDR().zzHW(5);
        zzZDR().zzHW(17);
        zzZDR().zzHW(62);
        zzZDR().zzHW(13);
    }

    @Override // com.aspose.words.zz9K
    public final void zzZE2() throws Exception {
        if (zzZDr()) {
            zzJ4 zzj4ZzL = zzL(zzW(this.zzZ5S), zzW(this.zzZ5R));
            zzZDR().zzZzb();
            float fZzX = zzHW.zzX(this.zzZ5U);
            if (com.aspose.words.internal.zzAN.zzf(fZzX) || zzj4ZzL.zzZSd() < fZzX) {
                zzZDL().zzZCH().zzZ(zzj4ZzL.zzZSd(), (zzZC9) this.zzZ5U);
                zzZDR().zzZzb();
            }
            this.zzZ5P = zzJ7.zzZ(zzj4ZzL, new zzJ8(zzZDR()), this.zzZ5T, zzZDS());
            zzZDs();
        }
    }

    @Override // com.aspose.words.zz9F, com.aspose.words.zz9K
    public final void zzZE3() throws Exception {
        super.zzZE3();
        zzZDL().zzZCI().zzT(this);
    }

    public final boolean zzZRS() {
        return this.zzZ5Q.zzZRS();
    }

    private com.aspose.words.internal.zzZQ4 zzW(zz9K zz9k) {
        long jOooO00o = 0;
        for (zz9K zz9kZzZDX = zz9k; zz9kZzZDX != zzZDX(); zz9kZzZDX = zz9kZzZDX.zzZDX()) {
            jOooO00o = C22243OooO0Oo.OooO00o(com.aspose.words.internal.zzZPY.zzYC(jOooO00o), Float.intBitsToFloat((int) zz9kZzZDX.zzZDP()) + Float.intBitsToFloat((int) jOooO00o), zz9kZzZDX.zzZDP());
        }
        return new com.aspose.words.internal.zzZQ4(jOooO00o, zz9k.zzZDQ());
    }

    private static boolean zzZ(zz9K zz9k, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            return com.aspose.words.internal.zzZKN.equals(zz9k.zzZDW(), str);
        }
        return true;
    }

    @Override // com.aspose.words.zz9K
    public final void zzZ(zz8Y zz8y) {
        zz2O zz2oZzZDt;
        if (zzZDr() && (zz2oZzZDt = zzZDt()) != null) {
            zz9G zz9g = this.zzZ5V;
            if (zz9g != null) {
                zz9g.zzT(zz2oZzZDt);
                zzY(zz2oZzZDt.zzZAk().zzZTh());
            }
            zzZ(zz2oZzZDt, zz8y);
        }
    }

    public final void zzZ(zz9G zz9g) {
        this.zzZ5V = zz9g;
    }
}

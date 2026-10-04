package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz9K {
    private zz65 zzZ60;
    private zz65 zzZ61;
    private boolean zzZ62;
    private boolean zzZ63;
    private long zzZ64;
    private long zzZ65;
    private zz64 zzZ66;
    private ArrayList<zz93> zzZ67;
    private zz93 zzZ68;
    private zz93 zzZ69;
    private String zzZ6a;
    private String zzZ6b;
    private zz9K zzZ6c;
    private zz8Z zzZ7J;
    private zz8X zzZhR;

    public zz9K(zz8Z zz8z) {
        this.zzZ7J = zz8z;
        this.zzZ66 = new zz64(this, zz8z);
    }

    private void zzX(zz66 zz66Var) throws Exception {
        if (zzZ(zz66Var.zzZ2n)) {
            return;
        }
        float fZzZzq = zz66Var.zzZ2n.zzZzq();
        float fZzZ = zzZ(zz66Var, fZzZzq);
        float fMin = Math.min(fZzZzq, fZzZ);
        float fMax = Math.max(fZzZzq, fZzZ);
        if (fMin > zz66Var.zzZ2n.zzZzp()) {
            return;
        }
        if (fMax > zz66Var.zzZ2n.zzZzp()) {
            fMax = zz66Var.zzZ2n.zzZzp();
        }
        this.zzZ7J.zzZCI().zzZ(zz66Var.zzZ2j, fMin, fMax);
        if (zzZ(zz66Var.zzZ2n, fMin)) {
            zzZ(zz66Var, fMin, false);
            return;
        }
        if (!zzZ(zz66Var.zzZ2n, fMax)) {
            zzZ(zz66Var, fMax, true);
            return;
        }
        while (fMax - fMin > 1.0f) {
            float f = (fMax + fMin) / 2.0f;
            if (zzZ(zz66Var.zzZ2n, f)) {
                fMax = f;
            } else {
                fMin = f;
            }
        }
        zzZ(zz66Var, fMax, fMax > fZzZzq);
    }

    private void zzY(zz66 zz66Var) throws Exception {
        if (zzZ(zz66Var.zzZ2n)) {
            return;
        }
        int iZzZzq = (int) zz66Var.zzZ2n.zzZzq();
        int iZzR = (int) com.aspose.words.internal.zzZKQ.zzR((float) zz66Var.zzZ2k, 0);
        float f = iZzR;
        if (!Float.isNaN(f) && iZzR < iZzZzq) {
            this.zzZ7J.zzZCI().zzZ(zz66Var.zzZ2j, f, iZzZzq);
            if (!zzZ(zz66Var.zzZ2n, f)) {
                zzZ(zz66Var, f, false);
                return;
            }
            while (iZzZzq - iZzR > 1) {
                int i = (iZzZzq + iZzR) / 2;
                if (zzZ(zz66Var.zzZ2n, i)) {
                    iZzR = i;
                } else {
                    iZzZzq = i;
                }
            }
            zzZ(zz66Var, iZzR, false);
        }
    }

    private void zzZ(zz66 zz66Var) throws Exception {
        if (zz66Var.zzZ2n.getType() == 22 || zz66Var.zzZ2n.getType() == 27) {
            zzY(zz66Var);
            return;
        }
        if (zz66Var.zzZ2j.zzZF7() == 2) {
            if ((zz66Var.zzZ2n.getType() == 61 || zz66Var.zzZ2n.getType() == 16) && (this instanceof zz9B)) {
                zzX(zz66Var);
            }
        }
    }

    private void zzZE1() throws Exception {
        int iZzZF2 = this.zzZ7J.zzZCH().zzZF2();
        Iterator<zz66> it = this.zzZ66.zzZz1().iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
        this.zzZ7J.zzZCH().zzX8(iZzZF2);
    }

    public final void zz6(ArrayList<zz93> arrayList) {
        this.zzZ67 = arrayList;
    }

    public final void zzJ(zz93 zz93Var) {
        this.zzZ68 = zz93Var;
    }

    public final zz65 zzJ2(int i) {
        return this.zzZ66.zzZz4().get(i);
    }

    public final void zzK(zz93 zz93Var) {
        this.zzZ69 = zz93Var;
    }

    public final void zzPG(String str) {
        this.zzZ6a = str;
    }

    public final void zzPH(String str) {
        this.zzZ6b = str;
    }

    public void zzW(com.aspose.words.internal.zzZYT<String> zzzyt) {
    }

    public final void zzXX(long j) {
        this.zzZ64 = j;
    }

    public final void zzXY(long j) {
        this.zzZ65 = j;
    }

    public void zzXZ(long j) {
    }

    public final void zzXo(boolean z) {
        this.zzZ62 = z;
    }

    public final void zzXp(boolean z) {
        this.zzZ63 = z;
    }

    public final zz9A zzZDK() {
        return this.zzZ7J.zzZCI();
    }

    public final zz8Z zzZDL() {
        return this.zzZ7J;
    }

    public final zz65 zzZDM() {
        return this.zzZ60;
    }

    public final zz65 zzZDN() {
        return this.zzZ61;
    }

    public final boolean zzZDO() {
        return this.zzZ63;
    }

    public final long zzZDP() {
        return this.zzZ64;
    }

    public final long zzZDQ() {
        return this.zzZ65;
    }

    public final zz64 zzZDR() {
        return this.zzZ66;
    }

    public final zz8X zzZDS() {
        return this.zzZhR;
    }

    public final ArrayList<zz93> zzZDT() {
        return this.zzZ67;
    }

    public final zz93 zzZDU() {
        return this.zzZ69;
    }

    public final String zzZDV() {
        return this.zzZ6a;
    }

    public final String zzZDW() {
        return this.zzZ6b;
    }

    public final zz9K zzZDX() {
        return this.zzZ6c;
    }

    public final com.aspose.words.internal.zzZQ4 zzZDY() {
        long jOooO00o = this.zzZ64;
        for (zz9K zz9k = this.zzZ6c; zz9k != null; zz9k = zz9k.zzZ6c) {
            jOooO00o = C22243OooO0Oo.OooO00o(com.aspose.words.internal.zzZPY.zzYC(jOooO00o), Float.intBitsToFloat((int) zz9k.zzZ64) + Float.intBitsToFloat((int) jOooO00o), zz9k.zzZ64);
        }
        return new com.aspose.words.internal.zzZQ4(jOooO00o, this.zzZ65);
    }

    public final zz2O zzZDZ() {
        if (Float.intBitsToFloat((int) this.zzZ65) <= 0.0f || com.aspose.words.internal.zzZPW.zzYz(this.zzZ65) <= 0.0f) {
            return null;
        }
        zz2O zz2oZzZ = this.zzZ7J.zzZCM().zzZ(this.zzZhR, zzZDY());
        zz93 zz93Var = this.zzZ68;
        zz2oZzZ.zzZ(zz93Var != null ? zz93Var.zzZEC() : null);
        this.zzZ7J.zzZCM().zzZ(zz2oZzZ, this.zzZ6a, false);
        return zz2oZzZ;
    }

    public void zzZE0() {
        this.zzZ61 = this.zzZ66.zzHW(61);
        this.zzZ60 = this.zzZ66.zzHW(16);
    }

    public void zzZE2() throws Exception {
    }

    public abstract void zzZE3() throws Exception;

    public final void zzZE4() throws Exception {
        int iZzZF2 = this.zzZ7J.zzZCH().zzZF2();
        zzZE3();
        this.zzZ7J.zzZCH().zzX8(iZzZF2);
        zzZE1();
    }

    private static float zzZ(zz66 zz66Var, float f) {
        if (!Double.isNaN(zz66Var.zzZ2k)) {
            if (Double.isInfinite(zz66Var.zzZ2k)) {
                return 558.4472f;
            }
            return (float) zz66Var.zzZ2k;
        }
        if (Double.isNaN(zz66Var.zzZ2m)) {
            return Float.NaN;
        }
        return f * ((float) zz66Var.zzZ2m);
    }

    private boolean zzZ(zzZC9 zzzc9) {
        if (this instanceof zz9B) {
            return this.zzZ63;
        }
        if (zzzc9.getType() != 22 && zzzc9.getType() != 27) {
            return this.zzZ62;
        }
        return this.zzZ63;
    }

    public final void zzX(zz9K zz9k) {
        this.zzZ6c = zz9k;
    }

    public void zzZ(zz8Y zz8y) {
        zzZ(zzZDZ(), zz8y);
    }

    public final void zzZ(zz8X zz8x) {
        this.zzZhR = zz8x;
    }

    private boolean zzZ(zzZC9 zzzc9, float f) throws Exception {
        int iZzZF2 = this.zzZ7J.zzZCH().zzZF2();
        this.zzZ7J.zzZCH().zzZ(f, zzzc9, false);
        zzZE3();
        this.zzZ7J.zzZCH().zzX8(iZzZF2);
        return zzZ(zzzc9);
    }

    private void zzZ(zz66 zz66Var, float f, boolean z) throws Exception {
        this.zzZ7J.zzZCH().zzZ(f, zz66Var.zzZ2n, z);
        zzZE3();
        this.zzZ7J.zzZCI().zzZ(zz66Var.zzZ2j, f);
    }

    public final void zzZ(zz2O zz2o, zz8Y zz8y) {
        if (zz2o != null) {
            zz8X zz8x = this.zzZhR;
            zz8y.zzZ(zz2o, zz8x != null ? zz8x.getZOrder() : 0);
        }
    }
}

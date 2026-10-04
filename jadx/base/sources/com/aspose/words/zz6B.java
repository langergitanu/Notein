package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz6B {
    private zz61 zzZ2B;
    private com.aspose.words.internal.zzD4 zzZ2A = new com.aspose.words.internal.zzD4();
    private com.aspose.words.internal.zzD4 zzZ2z = new com.aspose.words.internal.zzD4();

    public zz6B(zz61 zz61Var) {
        this.zzZ2B = zz61Var;
    }

    private static boolean zzHY(int i) {
        return i == 61 || i == 16;
    }

    private boolean zzHZ(int i) {
        for (zzBF zzbf : this.zzZ2B.zzZ1U.zzl9()) {
            if (zzS(zzbf.zzZF9()) && zzR(zzbf) && zzbf.zzZF9().getType() == i) {
                return true;
            }
        }
        return false;
    }

    private void zzI0(int i) {
        this.zzZ2A.set(i, 0);
        zzI1(i);
    }

    private boolean zzP(zzBE zzbe) {
        for (zzBF zzbf : this.zzZ2B.zzZ1U.zzl9()) {
            if (zzR(zzbf) && zzbf.zzZF9().zzX(zzbe)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzQ(zzBF zzbf) {
        return zzS(zzbf) && zzbf.zzNi() == 1 && zzT(zzbf) && com.aspose.words.internal.zzAN.zzL(zzbf.getValue(), 0.0d);
    }

    private static boolean zzR(zzBF zzbf) {
        if (zzQ(zzbf)) {
            return false;
        }
        return zzbf.zzNi() == 1 || zzbf.zzNi() == 0;
    }

    private static boolean zzS(zzBE zzbe) {
        return zzbe.zzZF7() == 2;
    }

    private Iterable<zz65> zzT(zzBE zzbe) {
        zz65 zz65VarZzHX;
        ArrayList arrayList = new ArrayList();
        for (zz61 zz61Var : this.zzZ2B.zzX3(zzbe.zzZF7() == 0)) {
            if (zzZ(zz61Var.zzZ24, zzbe) && (zz65VarZzHX = zz61Var.zzZ24.zzZDR().zzHX(zzbe.getType())) != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz65>) arrayList, zz65VarZzHX);
            }
        }
        return arrayList;
    }

    private void zzU(zzBE zzbe) {
        if (zzbe.getType() == 0) {
            return;
        }
        if (zzS(zzbe)) {
            if (zzB5.zzJt(zzbe.getType()) && zzZzz().zzHX(zzbe.getType()) == null) {
                zzZzz().zzHW(zzbe.getType());
                return;
            }
            return;
        }
        if (zzZzz().zzO(zzbe) == null) {
            zz67 zz67Var = new zz67(zzbe, this.zzZ2B.zzZ24);
            zzZzz().zzZ(zz67Var);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) zz67Var.zzZzo(), (Iterable) zzT(zz67Var.zzZzt()));
        }
    }

    private void zzV(zzBE zzbe) {
        zzZC8 zzzc8ZzO;
        if (zzS(zzbe) || (zzzc8ZzO = zzZzz().zzO(zzbe)) == null) {
            return;
        }
        zzzc8ZzO.zzZzl();
    }

    private void zzW(zzBF zzbf) {
        zzBE zzbeZzZF9 = zzbf.zzZF9();
        zzBE zzbeZzZF8 = zzbf.zzZF8();
        float fZzZFa = (float) zzbf.zzZFa();
        int iZzNi = zzbf.zzNi();
        if (iZzNi == 0) {
            zzZ(zzbeZzZF9, zzbeZzZF8, fZzZFa, true);
            return;
        }
        if (iZzNi == 1) {
            zzZ(zzbeZzZF9, zzbeZzZF8, fZzZFa, true);
            zzZ(zzbeZzZF9, zzbeZzZF8, fZzZFa, false);
            float f = 1.0f / fZzZFa;
            zzZ(zzbeZzZF8, zzbeZzZF9, f, true);
            zzZ(zzbeZzZF8, zzbeZzZF9, f, false);
            return;
        }
        if (iZzNi == 2) {
            zzZ(zzbeZzZF8, zzbeZzZF9, 1.0f / fZzZFa, false);
        } else {
            if (iZzNi != 3) {
                throw new IllegalStateException("Unexpected boolean operator.");
            }
            zzZ(zzbeZzZF9, zzbeZzZF8, fZzZFa, false);
        }
    }

    private void zzX(zzBF zzbf) {
        if (zzR(zzbf)) {
            zzY(zzbf.zzZF9(), (float) zzbf.getValue());
        }
    }

    private static int zzXb(boolean z) {
        return z ? 19 : 32;
    }

    private static int zzXc(boolean z) {
        return z ? 61 : 16;
    }

    private void zzY(zzBE zzbe, float f) {
        zzZC9 zzzc9ZzR = zzR(zzbe);
        if (zzS(zzbe) && zzB5.zzJr(zzbe.getType())) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(zzZzz().zzZz3(), new zz68(zzzc9ZzR, f));
    }

    private static boolean zzZ(zz9K zz9k, zzBE zzbe) {
        if (com.aspose.words.internal.zzZYD.zzXk(zzbe.zzZF6()) && !com.aspose.words.internal.zzZKN.equals(zzbe.zzZF6(), zz9k.zzZDW())) {
            return false;
        }
        if (zzbe.zzZF5() == 0) {
            return true;
        }
        if (zz9k.zzZDT().size() == 0) {
            return false;
        }
        return zzAL.zzY3(zzbe.zzZF5(), zz9k.zzZDT().get(0).getType());
    }

    private zz64 zzZzz() {
        return this.zzZ2B.zzZ24.zzZDR();
    }

    public final void zzI1(int i) {
        this.zzZ2z.set(i, 0);
    }

    public final void zzZzA() {
        for (zz4V zz4v : this.zzZ2B.zzZ1T.zzl9()) {
            zzZC9 zzzc9ZzR = zzZzz().zzR(zz4v.zzZF9());
            if (zzzc9ZzR != null) {
                com.aspose.words.internal.zzZQG.zzZ(zzZzz().zzZz1(), new zz66(zzzc9ZzR, zz4v.zzZFa(), zz4v.getMax(), zz4v.getValue(), zz4v.zzZF9()));
            }
        }
    }

    public final void zzZzB() {
        Iterator<zzBF> it = this.zzZ2B.zzZ1U.zzl9().iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
        Iterator<zzBF> it2 = this.zzZ2B.zzZ1Q.iterator();
        while (it2.hasNext()) {
            zzV(it2.next());
        }
        zzZzz().zzZzc();
    }

    public final void zzZzC() {
        for (zzBF zzbf : this.zzZ2B.zzZ1U.zzl9()) {
            zzU(zzbf.zzZF9());
            zzU(zzbf.zzZF8());
            if (zzbf.zzNi() != 0) {
                zzV(zzbf.zzZF9());
                zzV(zzbf.zzZF8());
            }
        }
    }

    private static boolean zzS(zzBF zzbf) {
        return !zzS(zzbf.zzZF9());
    }

    private zzZC9 zzR(zzBE zzbe) {
        if (zzbe.getType() == 0) {
            return null;
        }
        if (zzbe.zzZF7() == 2) {
            return zzZzz().zzHX(zzbe.getType());
        }
        return zzZzz().zzO(zzbe);
    }

    private void zzV(zzBF zzbf) {
        if (zzQ(zzbf.zzZF9())) {
            return;
        }
        if (zzT(zzbf)) {
            zzY(zzbf.zzZF9(), (float) zzbf.getValue());
        } else {
            zzZ(zzbf.zzZF9(), zzbf.zzZF8(), (float) zzbf.zzZFa(), true);
        }
    }

    public final void zzY(HashMap<zz9K, zz61> map) {
        for (zz5K zz5k : ((zz9I) this.zzZ2B.zzZ24).zzZ5Y.values()) {
            zzZ(zz5k, true, map);
            zzZ(zz5k, false, map);
            zzZ(zz5k, 63);
            zzZ(zz5k, 21);
            zzZ(zz5k, 10);
            zzZ(zz5k, 26);
            zzZ(zz5k, 18);
            zzZ(zz5k, 34);
            zzZ(zz5k, 12);
            zzZ(zz5k, 7);
        }
    }

    private boolean zzQ(zzBE zzbe) {
        if (zzS(zzbe)) {
            if (this.zzZ2z.zzVE(zzbe.getType())) {
                return true;
            }
            return zzHZ(zzbe.getType());
        }
        return zzP(zzbe);
    }

    public final void zzZ(HashMap<zz9K, zz61> map) {
        zz67 zz67Var;
        for (zzBF zzbf : this.zzZ2B.zzZ1U.zzl9()) {
            if (zzS(zzbf) && zzR(zzbf) && (zz67Var = (zz67) com.aspose.words.internal.zzZKW.zzZ(zzR(zzbf.zzZF9()), zz67.class)) != null) {
                for (zz65 zz65Var : zz67Var.zzZzo()) {
                    map.get(zz65Var.zzZzn()).zzZ1R.zzI0(zz65Var.getType());
                }
            }
        }
    }

    private static boolean zzT(zzBF zzbf) {
        return !zzU(zzbf);
    }

    private static boolean zzU(zzBF zzbf) {
        return zzbf.zzZF8().getType() != 0;
    }

    private void zzZ(zzBF zzbf) {
        if (zzR(zzbf.zzZF9()) != null) {
            if (zzU(zzbf) && zzR(zzbf.zzZF8()) == null) {
                throw new IllegalStateException("Invalid constraint.");
            }
            if (zzY(zzbf)) {
                return;
            }
            if (zzT(zzbf)) {
                zzX(zzbf);
                return;
            } else {
                zzW(zzbf);
                return;
            }
        }
        throw new IllegalStateException("Invalid constraint.");
    }

    private static zzBE zzY(zz5K zz5k, int i) {
        return new zzBE(i, zz5k.zzZyF().zzZDW());
    }

    private static zzBF zzY(boolean z, zz5K zz5k) {
        zzBF zzbf = new zzBF();
        zzbf.zzZ(zzY(zz5k, zzXc(z)));
        zzbf.zzY(new zzBE(zzXc(z)));
        return zzbf;
    }

    private boolean zzY(zzBF zzbf) {
        if (zzS(zzbf.zzZF9()) && zzR(zzbf)) {
            return this.zzZ2A.zzVE(zzbf.zzZF9().getType());
        }
        return false;
    }

    private void zzZ(zzBE zzbe, zzBE zzbe2, float f, boolean z) {
        com.aspose.words.internal.zzZQG.zzZ(zzZzz().zzZz2(), new zz69(zzR(zzbe), zzR(zzbe2), f, z));
    }

    private void zzZ(zz5K zz5k, int i) {
        zzBF zzbf = new zzBF();
        zzbf.zzZ(zzY(zz5k, i));
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ2B.zzZ1Q, zzbf);
    }

    private void zzZ(zz5K zz5k, boolean z, HashMap<zz9K, zz61> map) {
        int iZzXb;
        boolean z2;
        zz61 zz61Var = map.get(zz5k.zzZyF());
        Iterator<zzBF> it = this.zzZ2B.zzZ1U.zzl9().iterator();
        boolean z3 = false;
        int iZzXb2 = 0;
        while (true) {
            if (!it.hasNext()) {
                iZzXb = 0;
                break;
            }
            zzBF next = it.next();
            if (zzZ(next, zz5k, z) && zzR(next)) {
                if (iZzXb2 == 0) {
                    iZzXb2 = next.zzZF9().getType();
                } else if (next.zzZF9().getType() != iZzXb2) {
                    iZzXb = next.zzZF9().getType();
                    break;
                }
            }
        }
        if (iZzXb2 == 0) {
            iZzXb2 = zzXb(z);
            com.aspose.words.internal.zzZQG.zzZ(this.zzZ2B.zzZ1Q, zzZ(z, zz5k));
            iZzXb = zzXc(z);
            z2 = true;
        } else if (iZzXb == 0) {
            boolean zZzHY = zzHY(iZzXb2);
            z2 = !zZzHY;
            if (!zZzHY) {
                iZzXb = zzXc(z);
            } else {
                iZzXb = zzXb(z);
                com.aspose.words.internal.zzZQG.zzZ(this.zzZ2B.zzZ1Q, zzZ(z, zz5k));
            }
        } else {
            z2 = false;
        }
        zz5k.zzR(iZzXb2, iZzXb, z);
        if (!z2 || !zz61Var.zzZ1R.zzHZ(zzXc(z))) {
            zz61Var.zzZ1R.zzI0(zzXc(z));
            z3 = z2;
        }
        if (z3) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZ2B.zzZ1Q, zzY(z, zz5k));
        }
    }

    private static boolean zzZ(zzBF zzbf, zz5K zz5k, boolean z) {
        if (zzbf.zzZF9().zzZF7() == 0 && com.aspose.words.internal.zzZKN.equals(zzbf.zzZF9().zzZF6(), zz5k.zzZyF().zzZDW())) {
            int type = zzbf.zzZF9().getType();
            if (type != 2) {
                if (type != 9) {
                    if (type != 11 && type != 16) {
                        if (type != 19 && type != 24) {
                            if (type != 32) {
                                if (type != 61) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                return z;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    private static zzBF zzZ(boolean z, zz5K zz5k) {
        zzBF zzbf = new zzBF();
        zzbf.zzZ(zzY(zz5k, zzXb(z)));
        return zzbf;
    }
}

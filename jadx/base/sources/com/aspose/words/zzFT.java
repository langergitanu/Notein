package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzFT implements Cloneable {
    private zzZCB zzZf9;
    private static int[] zzZen = {20};
    private static zzFT zzZeo = zzZNy();
    private static zzFT zzZeq = zzZNA();
    private static zzFT zzZep = zzZNz();

    public static class zzZ implements zzZCA, Cloneable {
        private zzFT zzZem;

        public zzZ(zzFT zzft) {
            this.zzZem = zzft;
        }

        private Object memberwiseClone() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCA zzZOl() {
            zzZ zzz = (zzZ) memberwiseClone();
            zzFT zzft = this.zzZem;
            if (zzft != null) {
                zzz.zzZem = zzft.zzZNH();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zzFT zzft = this.zzZem;
            if (zzft != null) {
                return zzft.zzZf9;
            }
            return null;
        }
    }

    private zzFT() {
        this(null);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zzY(zzCM zzcm) {
        int i;
        zz11 zz11VarZzZGw = zzcm.zzZGw();
        if (zzcm.zzZGz() == 1 && zzcm.zzZGy() == null && zzcm.zzZGv() == null && zz11VarZzZGw.zzZtK().isEmpty() && zz11VarZzZGw.zzZtL().isEmpty() && zz11VarZzZGw.zzMi().size() == 1) {
            String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), (String) zzLv(6), " ");
            zz4A zz4a = zz11VarZzZGw.zzMi().get(0);
            if (!((Boolean) zzLv(14)).booleanValue()) {
                i = 0;
            } else {
                if (!zzZ(zz4a.zzMf(), 0, "CELLRANGE", "[CELLRANGE]", strOooO0OO)) {
                    return false;
                }
                i = 1;
            }
            if (((Boolean) zzLv(11)).booleanValue()) {
                if (!zzZ(zz4a.zzMf(), i, "SERIESNAME", "[SERIES NAME]", strOooO0OO)) {
                    return false;
                }
                i += i == 0 ? 1 : 2;
            }
            if (((Boolean) zzLv(8)).booleanValue()) {
                if (!zzZ(zz4a.zzMf(), i, "XVALUE", "[X VALUE]", strOooO0OO) && !zzZ(zz4a.zzMf(), i, "CATEGORYNAME", "[CATEGORY NAME]", strOooO0OO)) {
                    return false;
                }
                i += i == 0 ? 1 : 2;
            }
            if (((Boolean) zzLv(12)).booleanValue()) {
                if (!zzZ(zz4a.zzMf(), i, "VALUE", "[VALUE]", strOooO0OO)) {
                    return false;
                }
                i += i == 0 ? 1 : 2;
            }
            if (((Boolean) zzLv(7)).booleanValue()) {
                if (!zzZ(zz4a.zzMf(), i, "BUBBLESIZE", "[BUBBLESIZE]", strOooO0OO)) {
                    return false;
                }
                i += i == 0 ? 1 : 2;
            }
            if (((Boolean) zzLv(10)).booleanValue()) {
                if (!zzZ(zz4a.zzMf(), i, "PERCENTAGE", "[PERCENTAGE]", strOooO0OO)) {
                    return false;
                }
                i += i == 0 ? 1 : 2;
            }
            if (zz4a.zzMf().size() == i) {
                return true;
            }
        }
        return false;
    }

    private static void zzZ(zz4A zz4a, String str, String str2, String str3) {
        if (zz4a.zzMf().size() > 0) {
            zz31 zz31Var = new zz31();
            zz31Var.zzZ(zz4a);
            zz4a.zzMf().add(zz31Var);
            zz31Var.setText(str3);
        }
        zz0P zz0p = new zz0P();
        zz0p.zzZ(zz4a);
        zz4a.zzMf().add(zz0p);
        zz0p.zzPy(str);
        zz0p.setText(str2);
        zz0p.zzN(com.aspose.words.internal.zzZZS.zzY(Integer.valueOf(zz4a.zzMf().size())));
    }

    private static zzFT zzZNA() {
        zzFT zzftZzZNy = zzZNy();
        Boolean bool = Boolean.TRUE;
        zzftZzZNy.zzL(7, bool);
        zzftZzZNy.zzL(8, bool);
        zzftZzZNy.zzL(9, bool);
        zzftZzZNy.zzL(10, bool);
        zzftZzZNy.zzL(11, bool);
        zzftZzZNy.zzL(12, bool);
        return zzftZzZNy;
    }

    private boolean zzZNB() {
        return (!((Boolean) zzLv(8)).booleanValue() || !((Boolean) zzLv(10)).booleanValue() || ((Boolean) zzLv(7)).booleanValue() || ((Boolean) zzLv(11)).booleanValue() || ((Boolean) zzLv(12)).booleanValue()) ? false : true;
    }

    private com.aspose.words.internal.zzZYG<zz82> zzZNC() {
        com.aspose.words.internal.zzZYG<zz82> zzzyg = (com.aspose.words.internal.zzZYG) zzLu(19);
        if (zzzyg != null) {
            return zzzyg;
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg2 = new com.aspose.words.internal.zzZYG<>();
        this.zzZf9.zzL(19, zzzyg2);
        return zzzyg2;
    }

    private void zzZND() {
        if (this.zzZf9.zzZzW() != null) {
            return;
        }
        com.aspose.words.internal.zzZYG<zz82> zzzygZzZNC = zzZNC();
        zz82 zz82Var = new zz82("{CE6537A1-D6FC-4f65-9D91-7224C49458BB}", null);
        zzzygZzZNC.set("{CE6537A1-D6FC-4f65-9D91-7224C49458BB}", zz82Var);
        zz82Var.zzW(new zzFT());
        this.zzZf9.zzZ(zz82Var.zzZBS().zzZf9);
    }

    private boolean zzZNE() {
        if (this.zzZf9.zzZzX() == null) {
            return false;
        }
        if (zzLh(6)) {
            return true;
        }
        return this.zzZf9.zzZzX().zzZOm().zzLh(6);
    }

    private static zzFT zzZNy() {
        zzFT zzft = new zzFT();
        Boolean bool = Boolean.FALSE;
        zzft.zzL(1, bool);
        zzft.zzL(2, 0);
        zzft.zzL(3, 0);
        zzft.zzL(4, null);
        zzft.zzL(5, null);
        zzft.zzL(6, ",");
        zzft.zzL(7, bool);
        zzft.zzL(8, bool);
        zzft.zzL(9, bool);
        zzft.zzL(10, bool);
        zzft.zzL(11, bool);
        zzft.zzL(12, bool);
        zzft.zzL(13, bool);
        zzft.zzL(14, bool);
        zzft.zzL(15, null);
        zzft.zzL(16, null);
        zzft.zzL(17, null);
        zzft.zzL(18, null);
        zzft.zzL(20, bool);
        zzft.zzL(19, null);
        return zzft;
    }

    private static zzFT zzZNz() {
        zzFT zzftZzZNy = zzZNy();
        zzftZzZNy.zzL(12, Boolean.TRUE);
        return zzftZzZNy;
    }

    public final void clear() {
        this.zzZf9.removeAll();
        this.zzZf9.zzZ((zzZCB) null);
    }

    public final int getCount() {
        return this.zzZf9.getCount();
    }

    public final boolean zz3n() {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        zzdb.add(3);
        zzdb.add(16);
        zzdb.add(19);
        zzD9 zzd9 = (zzD9) zzLu(18);
        if (zzd9 != null && zzd9.isEmpty()) {
            zzdb.add(18);
        }
        zzD9 zzd92 = (zzD9) zzLu(15);
        if (zzd92 != null && zzd92.isEmpty()) {
            zzdb.add(15);
        }
        zzCL zzcl = (zzCL) zzLu(17);
        if (zzcl != null && zzcl.isEmpty()) {
            zzdb.add(17);
        }
        if (this.zzZf9.zzZ(zzdb.toArray(), null)) {
            return true;
        }
        zzCM zzcm = (zzCM) zzLu(16);
        if (zzcm != null) {
            if (!((Boolean) zzLv(14)).booleanValue()) {
                return true;
            }
            Object objZzLu = this.zzZf9.zzZzX().zzZOm().zzLu(16);
            if ((objZzLu != null && !zzcm.equals(objZzLu)) || !zzY(zzcm)) {
                return true;
            }
        }
        zzZCB zzzcbZzZzW = this.zzZf9.zzZzW();
        zzZCB zzzcbZzZzW2 = this.zzZf9.zzZzX().zzZOm().zzZzW();
        if (zzzcbZzZzW != null && zzzcbZzZzW.zzZ(zzZen, zzzcbZzZzW2)) {
            return true;
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(19);
        if (zzzyg == null) {
            return false;
        }
        for (String str : zzzyg.zzxs()) {
            if (!com.aspose.words.internal.zzZYD.zzh(str, "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}") && !com.aspose.words.internal.zzZYD.zzh(str, "{C3380CC4-5D6E-409C-BE32-E72D297353CC}")) {
                return true;
            }
        }
        return false;
    }

    public final void zzA(int[] iArr) {
        Object objZzLv;
        for (int i : iArr) {
            Object objZzLu = zzLu(i);
            if (objZzLu != null && (objZzLv = this.zzZf9.zzZzX().zzZOm().zzLv(i)) != null && objZzLv.equals(objZzLu)) {
                this.zzZf9.remove(i);
            }
        }
    }

    public final void zzB(int[] iArr) {
        Object objZzLv;
        for (int i = 0; i <= 0; i++) {
            int i2 = iArr[0];
            if (zzLj(i2) == null && (objZzLv = zzLv(i2)) != null) {
                zzI(i2, objZzLv);
            }
        }
    }

    public final void zzC(int[] iArr) {
        for (int i : iArr) {
            if (zzLu(i) == null) {
                zzL(i, zzLv(i));
            }
        }
    }

    public final void zzI(int i, Object obj) {
        zzZND();
        this.zzZf9.zzZzW().zzL(i, obj);
    }

    public final void zzL(int i, Object obj) {
        zz82 zz82Var;
        this.zzZf9.zzL(i, obj);
        if (i != 19 || obj == null || (zz82Var = (zz82) ((com.aspose.words.internal.zzZYG) obj).get("{CE6537A1-D6FC-4f65-9D91-7224C49458BB}")) == null || zz82Var.zzZBS() == null) {
            return;
        }
        this.zzZf9.zzZ(zz82Var.zzZBS().zzZf9);
    }

    public final boolean zzLh(int i) {
        return this.zzZf9.zzLh(i);
    }

    public final void zzLi(int i) {
        if (this.zzZf9.zzZzW() != null) {
            this.zzZf9.zzZzW().remove(i);
        }
    }

    public final Object zzLj(int i) {
        if (this.zzZf9.zzZzW() != null) {
            return this.zzZf9.zzZzW().zzLu(i);
        }
        return null;
    }

    public final Object zzLu(int i) {
        return this.zzZf9.zzLu(i);
    }

    public final Object zzLv(int i) {
        return this.zzZf9.zzLv(i);
    }

    public final void zzXX(boolean z) {
        if (zzLu(16) != null) {
            return;
        }
        zzCM zzcm = new zzCM();
        zzL(16, zzcm);
        zz11 zz11Var = new zz11();
        zzcm.zzY(zz11Var);
        zz4A zz4a = new zz4A();
        com.aspose.words.internal.zzZQG.zzZ(zz11Var.zzMi(), zz4a);
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), (String) zzLv(6), " ");
        if (((Boolean) zzLv(14)).booleanValue()) {
            zzZ(zz4a, "CELLRANGE", "[CELLRANGE]", strOooO0OO);
        }
        if (((Boolean) zzLv(11)).booleanValue()) {
            zzZ(zz4a, "SERIESNAME", "[SERIES NAME]", strOooO0OO);
        }
        if (((Boolean) zzLv(8)).booleanValue()) {
            if (z) {
                zzZ(zz4a, "CATEGORYNAME", "[CATEGORY NAME]", strOooO0OO);
            } else {
                zzZ(zz4a, "XVALUE", "[X VALUE]", strOooO0OO);
            }
        }
        if (((Boolean) zzLv(12)).booleanValue()) {
            zzZ(zz4a, "VALUE", "[VALUE]", strOooO0OO);
        }
        if (((Boolean) zzLv(7)).booleanValue()) {
            zzZ(zz4a, "BUBBLESIZE", "[BUBBLESIZE]", strOooO0OO);
        }
        if (((Boolean) zzLv(10)).booleanValue()) {
            zzZ(zz4a, "PERCENTAGE", "[PERCENTAGE]", strOooO0OO);
        }
    }

    public final String zzXY(boolean z) {
        return (!z || !zzZNB() || zzLh(6) || zzZNE()) ? (String) zzLv(6) : ControlChar.CR_LF;
    }

    public final void zzZNF() {
        zz82 zz82VarZzZ = zz82.zzZ(zzZNC(), "{C3380CC4-5D6E-409C-BE32-E72D297353CC}");
        if (com.aspose.words.internal.zzZOZ.zzZ(zz82VarZzZ.zzZBQ(), com.aspose.words.internal.zzZOZ.zzZXP)) {
            Object objZzLv = zzLv(3);
            if (objZzLv == null) {
                objZzLv = 0;
            }
            zz82VarZzZ.zzO(com.aspose.words.internal.zzZZS.zzY(Integer.valueOf(((Integer) objZzLv).intValue() + 52731)));
        }
    }

    public final void zzZNG() {
        this.zzZf9.remove(5);
    }

    public final zzFT zzZNH() {
        zzFT zzft = (zzFT) memberwiseClone();
        zzft.zzZf9 = this.zzZf9.zzZzY();
        zzEH zzeh = (zzEH) zzLu(4);
        if (zzeh != null) {
            zzft.zzL(4, zzeh.zzZLr());
        }
        zzE8 zze8 = (zzE8) zzLu(5);
        if (zze8 != null) {
            zzft.zzL(5, zze8.zzZLc());
        }
        zzD9 zzd9 = (zzD9) zzLu(15);
        if (zzd9 != null) {
            zzft.zzL(15, zzd9.zzZI4());
        }
        zzCM zzcm = (zzCM) zzLu(16);
        if (zzcm != null) {
            zzft.zzL(16, zzcm.zzZGB());
        }
        zzCL zzcl = (zzCL) zzLu(17);
        if (zzcl != null) {
            zzft.zzL(17, zzcl.zzZGr());
        }
        zzD9 zzd92 = (zzD9) zzLu(18);
        if (zzd92 != null) {
            zzft.zzL(18, zzd92.zzZI4());
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zzLu(19);
        if (zzzyg != null) {
            zzft.zzL(19, zz80.zzN(zzzyg));
        }
        return zzft;
    }

    public zzFT(zzGK zzgk) {
        this(null, zzgk);
    }

    public zzFT(zzFT zzft, zzGK zzgk) {
        this(zzft, zzgk == null ? null : zzgk.getDocument(), zzgk != null && zzgk.zzZQO() == 16);
    }

    public zzFT(zzFT zzft, DocumentBase documentBase, boolean z) {
        this.zzZf9 = new zz6R();
        this.zzZf9.zzZ(new zzZ(zzft == null ? zzY(documentBase, z) : zzft));
    }

    private static boolean zzZ(ArrayList<zz47> arrayList, int i, String str, String str2, String str3) {
        zz0P zz0p;
        zz31 zz31Var;
        if (arrayList.size() <= i) {
            return false;
        }
        return (i <= 0 || ((zz31Var = (zz31) com.aspose.words.internal.zzZKW.zzZ(arrayList.get(i), zz31.class)) != null && !zzZ(zz31Var) && com.aspose.words.internal.zzZKN.equals(zz31Var.getText(), str3) && arrayList.size() > (i = i + 1))) && (zz0p = (zz0P) com.aspose.words.internal.zzZKW.zzZ(arrayList.get(i), zz0P.class)) != null && com.aspose.words.internal.zzZKN.equals(zz0p.getType(), str) && com.aspose.words.internal.zzZKN.equals(zz0p.getText(), str2) && !zzZ(zz0p);
    }

    private static boolean zzZ(zz47 zz47Var) {
        zz30 zz30VarZzZx5 = zz47Var.zzZx5();
        if (zz30VarZzZx5.zzZTe() == null || zz30VarZzZx5.zzZTe().getCount() <= 0) {
            return (zz30VarZzZx5.getExtensions() != null && zz30VarZzZx5.getExtensions().getCount() > 0) || zz30VarZzZx5.zzr(new int[]{2, 10}) || !com.aspose.words.internal.zzAN.zzL(zz30VarZzZx5.zzZvY(), 0.0d);
        }
        return true;
    }

    private static zzFT zzY(DocumentBase documentBase, boolean z) {
        if (z) {
            return zzZep;
        }
        return zzCG.zzV(documentBase) ? zzZeo : zzZeq;
    }
}

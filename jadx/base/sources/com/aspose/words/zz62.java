package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz62 {
    private zz8Z zzZ7J;
    private HashMap<zz9K, zz61> zzZ27 = new HashMap<>();
    private ArrayList<zz61> zzZ26 = new ArrayList<>();
    private ArrayList<zz61> zzZ25 = new ArrayList<>();

    public zz62(zz8Z zz8z) {
        this.zzZ7J = zz8z;
    }

    private static ArrayList<zz93> zzG(zz93 zz93Var) {
        ArrayList<zz93> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zz93Var);
        return arrayList;
    }

    private zz9K zzK(zz61 zz61Var) {
        zz9J zz9i = new zz9I(this.zzZ7J);
        zzZ((zz9K) zz9i, zz61Var);
        zzZ(zz9i, zz61Var);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ25, zz61Var);
        return zz9i;
    }

    private zz9K zzL(zz61 zz61Var) {
        zz9J zz9d = new zz9D(this.zzZ7J);
        zzZ((zz9K) zz9d, zz61Var);
        zz6A.zzT(zz61Var);
        zzZ(zz9d, zz61Var);
        return zz9d;
    }

    private zz9K zzM(zz61 zz61Var) {
        zz9J zz9e = new zz9E(this.zzZ7J);
        zzZ((zz9K) zz9e, zz61Var);
        zz6A.zzU(zz61Var);
        zzZ(zz9e, zz61Var);
        return zz9e;
    }

    private zz9K zzN(zz61 zz61Var) {
        zz9H zz9h = new zz9H(this.zzZ7J);
        zzZ(zz9h, zz61Var);
        zz9h.zzZDu();
        zz9h.zzPG(zzZ(zz9h.zzZDU(), zz61Var.zzZ20.zzZDV(), zz9h.zzZRS()));
        zz6A.zzV(zz61Var);
        zzZ(zz61Var.zzZ1Y, zz9h);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ26, zz61Var);
        return zz9h;
    }

    private zz9K zzO(zz61 zz61Var) {
        zz9B zz9b = new zz9B(this.zzZ7J);
        zzZ(zz9b, zz61Var);
        zz6A.zzW(zz61Var);
        return zz9b;
    }

    private zz9K zzP(zz61 zz61Var) {
        zz9C zz9c = new zz9C(this.zzZ7J);
        zzZ(zz9c, zz61Var);
        zz6A.zzX(zz61Var);
        return zz9c;
    }

    private zz9K zzQ(zz61 zz61Var) {
        zzJG zzjg = zz61Var.zzZ1X;
        if (zzjg == null) {
            throw new IllegalStateException("Missing node algorithm.");
        }
        switch (zzjg.getType()) {
            case 0:
                return zzK(zz61Var);
            case 1:
                return zzN(zz61Var);
            case 2:
            case 3:
            case 4:
            case 6:
                throw new IllegalStateException("Unsupported layout algorithm.");
            case 5:
                return zzM(zz61Var);
            case 7:
                return zzL(zz61Var);
            case 8:
                return zzP(zz61Var);
            case 9:
                return zzO(zz61Var);
            default:
                throw new IllegalStateException("Unexpected layout algorithm type.");
        }
    }

    private void zzR(zz61 zz61Var) {
        Iterator<zz61> it = zz61Var.zzX4(false).iterator();
        while (it.hasNext()) {
            it.next().zzZ24.zzZE0();
        }
        zz61Var.zzZ1R.zzI1(61);
        zz61Var.zzZ1R.zzI1(16);
        Iterator<zz61> it2 = zz61Var.zzX4(false).iterator();
        while (it2.hasNext()) {
            it2.next().zzZ1R.zzZzC();
        }
        Iterator<zz61> it3 = this.zzZ25.iterator();
        while (it3.hasNext()) {
            it3.next().zzZ1R.zzY(this.zzZ27);
        }
        Iterator<zz61> it4 = zz61Var.zzX4(true).iterator();
        while (it4.hasNext()) {
            it4.next().zzZ1R.zzZ(this.zzZ27);
        }
        Iterator<zz61> it5 = zz61Var.zzX4(true).iterator();
        while (it5.hasNext()) {
            it5.next().zzZ1R.zzZzB();
        }
        Iterator<zz61> it6 = zz61Var.zzX4(true).iterator();
        while (it6.hasNext()) {
            it6.next().zzZ1R.zzZzA();
        }
    }

    private static ArrayList<zz9K> zzS(zz61 zz61Var) {
        ArrayList<zz9K> arrayList = new ArrayList<>();
        Iterator<zz61> it = zz61Var.zzZ1S.zzX3(false).iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, it.next().zzZ24);
        }
        return arrayList;
    }

    private void zzZ(zz9J zz9j, zz61 zz61Var) {
        Iterator<zz61> it = zz61Var.zzZ1Y.iterator();
        while (it.hasNext()) {
            zz9K zz9kZzQ = zzQ(it.next());
            com.aspose.words.internal.zzZQG.zzZ(zz9j.zzQw(), zz9kZzQ);
            zz9kZzQ.zzX(zz9j);
        }
    }

    private void zzZyY() {
        for (zz61 zz61Var : this.zzZ26) {
            ((zz9H) zz61Var.zzZ24).zz5(zzS(zz61Var));
        }
    }

    public final zz9K zzZyZ() {
        zz61 zz61VarZzX = zz63.zzX(this.zzZ7J);
        zzQ(zz61VarZzX);
        this.zzZ7J.zzZCI().zzZ(zz61VarZzX);
        zzZyY();
        zzR(zz61VarZzX);
        return zz61VarZzX.zzZ24;
    }

    private void zzZ(ArrayList<zz61> arrayList, zz9H zz9h) {
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        zz61 zz61Var = arrayList.get(0);
        if (zz61Var.zzZ1X.getType() != 9) {
            return;
        }
        zz9G zz9g = new zz9G(this.zzZ7J);
        zzZ(zz9g, zz61Var);
        zz6A.zzW(zz61Var);
        zz9g.zzPG(zz9h.zzZDV());
        zz9h.zzZ(zz9g);
        zz9g.zzX(zz9h);
    }

    private void zzZ(zz9K zz9k, zz61 zz61Var) {
        zz9k.zzK(zz61Var.zzZ23);
        zz9k.zzJ(zz61Var.zzZ22);
        zz9k.zzPH(zz61Var.zzZ20.getName());
        zz9k.zzPG(zzZ(zz61Var.zzZ23, zz61Var.zzZ20.zzZDV(), false));
        zz9k.zzZ(zz61Var.zzZ1Z);
        ArrayList<zz93> arrayListZzG = zz61Var.zzZ21;
        if (arrayListZzG == null) {
            arrayListZzG = zzG(zz61Var.zzZ23);
        }
        zz9k.zz6(arrayListZzG);
        zz9k.zzW(zz61Var.zzZ1X.zzZSm());
        zz61Var.zzZ24 = zz9k;
        this.zzZ27.put(zz9k, zz61Var);
    }

    private String zzZ(zz93 zz93Var, String str, boolean z) {
        String str2;
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            return str;
        }
        int iZzZ = this.zzZ7J.zzZEk().zzZ(zz93Var);
        if (iZzZ > 4) {
            iZzZ = 4;
        }
        if (z) {
            str2 = "1D";
        } else {
            str2 = "2D";
        }
        int type = zz93Var.getType();
        if (type == 1) {
            return "node1";
        }
        if (type == 2) {
            return com.aspose.words.internal.zzZKN.format("node{0}", Integer.valueOf(iZzZ));
        }
        if (type == 3) {
            return com.aspose.words.internal.zzZKN.format("parChTrans{0}{1}", str2, Integer.valueOf(iZzZ));
        }
        if (type != 5) {
            return "";
        }
        return com.aspose.words.internal.zzZKN.format("sibTrans{0}{1}", str2, Integer.valueOf(iZzZ));
    }
}

package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
final class zzAL {
    private zzAM zzZ74;

    public zzAL(zzAM zzam) {
        this.zzZ74 = zzam;
    }

    private zz93 zzV(zz93 zz93Var) {
        return zzS(zzR(zz93Var.zzZD0()).zzZEz());
    }

    public static boolean zzY3(int i, int i2) {
        switch (i) {
            case 0:
                return true;
            case 1:
                return i2 == 0;
            case 2:
                return i2 == 1;
            case 3:
                return i2 == 2;
            case 4:
                return i2 == 2;
            case 5:
            default:
                return false;
            case 6:
                return i2 == 2;
            case 7:
                return i2 == 3;
            case 8:
                return i2 == 4;
            case 9:
                return i2 == 5;
        }
    }

    public final zzAN zzR(zz5A zz5a) {
        for (zzAN zzan : this.zzZ74.zzZEt()) {
            if (zzan.zzZEC().equals(zz5a)) {
                return zzan;
            }
        }
        return null;
    }

    public final zz93 zzS(zz5A zz5a) {
        for (zz93 zz93Var : this.zzZ74.zzZEu()) {
            if (zz93Var.zzZEC().equals(zz5a)) {
                return zz93Var;
            }
        }
        return null;
    }

    public final zzAN zzT(zz5A zz5a) {
        for (zzAN zzan : this.zzZ74.zzZEt()) {
            if (zzan.zzZEB().equals(zz5a) && zzan.getType() == 0) {
                return zzan;
            }
        }
        return null;
    }

    public final ArrayList<zzAN> zzU(zz5A zz5a) {
        ArrayList<zzAN> arrayList = new ArrayList<>();
        for (zzAN zzan : this.zzZ74.zzZEt()) {
            if (zzan.zzZEz().equals(zz5a) && zzan.getType() == 0) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzan);
            }
        }
        Collections.sort(arrayList, new zz94());
        return arrayList;
    }

    public final zz93 zzW(zz93 zz93Var) {
        int type = zz93Var.getType();
        if (type == 3) {
            return zzU(zz93Var);
        }
        if (type == 5) {
            return zzS(zz93Var);
        }
        throw new IllegalStateException("Unexpected transition type.");
    }

    public final zz93 zzX(zz93 zz93Var) {
        int type = zz93Var.getType();
        if (type == 3) {
            return zzV(zz93Var);
        }
        if (type == 5) {
            return zzT(zz93Var);
        }
        throw new IllegalStateException("Unexpected transition type.");
    }

    public final zz93 zzY(zz93 zz93Var) {
        if (zz93Var.zzZCX() == null) {
            return null;
        }
        return zzS(zz93Var.zzZCX().zzZwi().zzZwh());
    }

    public final int zzZ(zz93 zz93Var) {
        zzAN zzanZzT;
        if (zz93Var.getType() == 1) {
            return 0;
        }
        int type = zz93Var.getType();
        if (type == 2) {
            zzanZzT = zzT(zz93Var.zzZEC());
        } else {
            if (type != 3 && type != 5) {
                throw new IllegalStateException("Unexpected point type.");
            }
            zzanZzT = zzR(zz93Var.zzZD0());
        }
        return zzZ(zzS(zzanZzT.zzZEz())) + 1;
    }

    public final zz93 zzZEl() {
        for (zz93 zz93Var : this.zzZ74.zzZEu()) {
            if (zz93Var.getType() == 1) {
                return zz93Var;
            }
        }
        throw new IllegalStateException("No document point in data model.");
    }

    private zz93 zzS(zz93 zz93Var) {
        return zzS(zzZ(zzR(zz93Var.zzZD0())).zzZEB());
    }

    private zz93 zzT(zz93 zz93Var) {
        return zzS(zzR(zz93Var.zzZD0()).zzZEB());
    }

    private zz93 zzU(zz93 zz93Var) {
        return zzS(zzR(zz93Var.zzZD0()).zzZEB());
    }

    public final zz93 zzZ(zz5A zz5a, String str) {
        for (zz93 zz93Var : this.zzZ74.zzZEu()) {
            if (zz93Var.getType() == 4 && zz93Var.zzZCX() != null && zz5a.equals(zz93Var.zzZCX().zzZwi().zzZwh()) && com.aspose.words.internal.zzZKN.equals(str, zz93Var.zzZCX().zzZwi().zzZwg())) {
                return zz93Var;
            }
        }
        return null;
    }

    private zzAN zzZ(zzAN zzan) {
        ArrayList<zzAN> arrayListZzU = zzU(zzan.zzZEz());
        arrayListZzU.contains(zzan);
        int iIndexOf = arrayListZzU.indexOf(zzan);
        if (iIndexOf != arrayListZzU.size() - 1) {
            return arrayListZzU.get(iIndexOf + 1);
        }
        return arrayListZzU.get(0);
    }
}

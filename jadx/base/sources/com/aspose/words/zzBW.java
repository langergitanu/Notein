package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzBW {
    static zzBW zzZ8e = zz6S.zzh(com.aspose.words.internal.zzPV.zzHZ);
    private ArrayList<zzZCM> zzZeQ;

    private int indexOf(int i) {
        for (int i2 = 0; i2 < zzZNX().size(); i2++) {
            if (zzZNX().get(i2).zzZR1() == i) {
                return i2;
            }
        }
        return -1;
    }

    public static zzBW zzZ(double d, int i, int i2, int i3) {
        zz6S zz6s = new zz6S();
        zz6s.setValue(com.aspose.words.internal.zzJB.zzWt(new com.aspose.words.internal.zzPV(0, i, i2, i3).toArgb()));
        if (!com.aspose.words.internal.zzAN.zzL(d, 1.0d)) {
            zzZ(zz6s, d);
        }
        return zz6s;
    }

    private int zzZFF() {
        Iterator<zzZCM> it = zzZNX().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode ^= it.next().hashCode();
        }
        return iHashCode;
    }

    public static zzBW zzj(com.aspose.words.internal.zzPV zzpv) {
        return zzZ(((double) zzpv.zzPD()) / 255.0d, zzpv.zzPC(), zzpv.zzPB(), zzpv.zzPA());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzBW zzbw = (zzBW) obj;
        return zzZHs() == zzbw.zzZHs() && com.aspose.words.internal.zzBP.zzX(zzbw.zzZNX(), zzZNX());
    }

    public int hashCode() {
        return zzZHs() ^ zzZFF();
    }

    public boolean isEmpty() {
        return false;
    }

    public final zzZCM zzJw(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf >= 0) {
            return zzZNX().get(iIndexOf);
        }
        return null;
    }

    public final void zzU(zzBW zzbw) {
        ArrayList<zzZCM> arrayList = new ArrayList<>(zzZNX().size());
        Iterator<zzZCM> it = zzZNX().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, it.next().zzZFm());
        }
        zzbw.zzZeQ = arrayList;
    }

    public void zzV(zzBW zzbw) {
    }

    public final com.aspose.words.internal.zzPV zzY(zzZ90 zzz90) {
        return zzZ(zzz90);
    }

    public final zzBW zzY0(double d) {
        zzHV zzhvZzZFG = zzZFG();
        if (zzhvZzZFG == null) {
            zzhvZzZFG = new zzHV();
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzHV>) zzZNX(), zzhvZzZFG);
        }
        zzhvZzZFG.setValue(d);
        return this;
    }

    public abstract com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90);

    public final zzHV zzZFG() {
        int iIndexOf = indexOf(0);
        if (iIndexOf == -1) {
            return null;
        }
        return (zzHV) zzZNX().get(iIndexOf);
    }

    public abstract int zzZHs();

    public abstract zzBW zzZHt();

    public final ArrayList<zzZCM> zzZNX() {
        if (this.zzZeQ == null) {
            this.zzZeQ = new ArrayList<>();
        }
        return this.zzZeQ;
    }

    public final void zze(ArrayList<zzZCM> arrayList) {
        this.zzZeQ = arrayList;
    }

    private com.aspose.words.internal.zzPV zzY(com.aspose.words.internal.zzPV zzpv, zzZCM zzzcm) {
        Iterator<zzZCM> it = zzZNX().iterator();
        while (it.hasNext()) {
            zzpv = it.next().zzl(zzpv);
        }
        return zzzcm != null ? zzzcm.zzl(zzpv) : zzpv;
    }

    public static void zzZ(zzBW zzbw, double d) {
        zzHV zzhv = new zzHV();
        zzhv.setValue(d);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzHV>) zzbw.zzZNX(), zzhv);
    }

    public final void zzZ(zzHV zzhv) {
        int iIndexOf = indexOf(0);
        if (iIndexOf == -1) {
            if (zzhv != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzHV>) zzZNX(), zzhv);
            }
        } else if (zzhv != null) {
            zzZNX().set(iIndexOf, zzhv);
        } else {
            zzZNX().remove(iIndexOf);
        }
    }

    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90, zzZCM zzzcm) {
        return zzY(zzZ(zzz90), zzzcm);
    }
}

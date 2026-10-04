package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz7H implements Cloneable {
    private String mName;
    private zz0Y zzZ3B;
    private ArrayList<zz45> zzZ3E = new ArrayList<>();
    private zz6U zzZ3D = new zz6U();
    private ArrayList<zzBG> zzZ3C = new ArrayList<>();
    private ArrayList<zzJM> zzZ3A = new ArrayList<>();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zz3(ArrayList<zzBG> arrayList) {
        this.zzZ3C = arrayList;
    }

    public final void zzOB(String str) {
        this.mName = str;
    }

    public final void zzZ(zz45 zz45Var) {
        if (zz45Var == null) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3E, zz45Var);
    }

    public final ArrayList<zzBG> zzZAJ() {
        return this.zzZ3C;
    }

    public final zz0Y zzZAK() {
        return this.zzZ3B;
    }

    public final com.aspose.words.internal.zzZQ4 zzZAL() {
        zz0Y zz0y = this.zzZ3B;
        return zz0y == null ? com.aspose.words.internal.zzZQ4.zz2T : zz0y.zzZ(this.zzZ3D, com.aspose.words.internal.zzZKN.zzX(zzZAO(), "uparrow", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8));
    }

    public final ArrayList<zzJM> zzZAM() {
        return this.zzZ3A;
    }

    public final ArrayList<zz45> zzZAN() {
        return this.zzZ3E;
    }

    public final String zzZAO() {
        String str = this.mName;
        return str == null ? "" : str;
    }

    public final zz6U zzZAP() {
        return this.zzZ3D;
    }

    public final zz7H zzZAQ() {
        zz7H zz7h = (zz7H) memberwiseClone();
        zz7h.zzZ3D = this.zzZ3D.zzZA3();
        if (zz7h.zzZ3E != null) {
            zz7h.zzZ3E = new ArrayList<>();
            Iterator<zz45> it = this.zzZ3E.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(zz7h.zzZ3E, it.next().zzZx4());
            }
        }
        if (this.zzZ3C != null) {
            zz7h.zzZ3C = new ArrayList<>();
            Iterator<zzBG> it2 = this.zzZ3C.iterator();
            while (it2.hasNext()) {
                zz7h.zzZ3C.add(it2.next().zzZFd());
            }
        }
        if (this.zzZ3A != null) {
            zz7h.zzZ3A = new ArrayList<>();
            Iterator<zzJM> it3 = this.zzZ3A.iterator();
            while (it3.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(zz7h.zzZ3A, it3.next().zzZSs());
            }
        }
        zz0Y zz0y = this.zzZ3B;
        if (zz0y != null) {
            zz7h.zzZ3B = zz0y.zzZtq();
        }
        return zz7h;
    }

    public final void zzZ(zz0Y zz0y) {
        this.zzZ3B = zz0y;
    }
}

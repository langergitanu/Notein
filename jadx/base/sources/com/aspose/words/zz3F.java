package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz3F implements Cloneable {
    private ArrayList<zz45> zzZ3E = new ArrayList<>();
    private int zzYZQ = 0;
    private zz6U zzZ3D = new zz6U();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzH9(int i) {
        this.zzYZQ = i;
    }

    public final void zzZ(zz45 zz45Var) {
        if (zz45Var == null) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3E, zz45Var);
    }

    public final ArrayList<zz45> zzZAN() {
        return this.zzZ3E;
    }

    public final zz6U zzZAP() {
        return this.zzZ3D;
    }

    public final int zzZwk() {
        return this.zzYZQ;
    }

    public final zz3F zzZwl() {
        zz3F zz3f = (zz3F) memberwiseClone();
        zz3f.zzZ3D = this.zzZ3D.zzZA3();
        if (zz3f.zzZ3E != null) {
            zz3f.zzZ3E = new ArrayList<>();
            Iterator<zz45> it = this.zzZ3E.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(zz3f.zzZ3E, it.next().zzZx4());
            }
        }
        return zz3f;
    }
}

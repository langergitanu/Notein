package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz61 {
    public zz61 zzZ1S;
    public zz60 zzZ1V;
    public zz60 zzZ1W;
    public zzJG zzZ1X;
    public zz8X zzZ1Z;
    public zz99 zzZ20;
    public ArrayList<zz93> zzZ21;
    public zz93 zzZ22;
    public zz93 zzZ23;
    public zz9K zzZ24;
    public ArrayList<zz61> zzZ1Y = new ArrayList<>();
    public zzBD zzZ1U = zzBD.zzZF4();
    public zz4U zzZ1T = zz4U.zzZy1();
    public ArrayList<zzBF> zzZ1Q = new ArrayList<>();
    public zz6B zzZ1R = new zz6B(this);

    private boolean isActive() {
        return this.zzZ24 != null;
    }

    public final Iterable<zz61> zzX3(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (zz61 zz61Var : this.zzZ1Y) {
            if (zz61Var.isActive()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz61>) arrayList, zz61Var);
                if (!z) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, (Iterable) zz61Var.zzX3(false));
                }
            }
        }
        return arrayList;
    }

    public final Iterable<zz61> zzX4(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (isActive()) {
            if (z) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz61>) arrayList, this);
            }
            Iterator<zz61> it = this.zzZ1Y.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, (Iterable) it.next().zzX4(z));
            }
            if (!z) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz61>) arrayList, this);
            }
        }
        return arrayList;
    }
}

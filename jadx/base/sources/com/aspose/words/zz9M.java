package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz9M {
    private zzAL zzZ73;

    public zz9M(zzAL zzal) {
        this.zzZ73 = zzal;
    }

    private static ArrayList<zz93> zzM(ArrayList<zz93> arrayList, int i) {
        ArrayList<zz93> arrayList2 = new ArrayList<>();
        for (zz93 zz93Var : arrayList) {
            if (zzAL.zzY3(i, zz93Var.getType())) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, zz93Var);
            }
        }
        return arrayList2;
    }

    public final ArrayList<zz93> zzZ(zz6C zz6c, zz93 zz93Var) {
        zzA6 zza6 = new zzA6();
        zza6.zzP(zz93Var);
        int i = 0;
        while (i < zz6c.zzZzI().length) {
            int i2 = zz6c.zzZzI()[i];
            boolean z = i >= zz6c.zzZzG().length || zz6c.zzZzG()[i];
            int i3 = i >= zz6c.zzZzH().length ? 0 : zz6c.zzZzH()[i];
            int i4 = i >= zz6c.zzZzF().length ? 1 : zz6c.zzZzF()[i];
            int i5 = i < zz6c.zzZzD().length ? zz6c.zzZzD()[i] : 1;
            int i6 = i >= zz6c.zzZzE().length ? 0 : zz6c.zzZzE()[i];
            zzA6 zza62 = new zzA6();
            Iterator<zz93> it = zza6.zzLy().iterator();
            while (it.hasNext()) {
                zza62.zz7(zzZ(it.next(), i2, i3, z, i4, i5, i6));
            }
            i++;
            zza6 = zza62;
        }
        return zza6.zzLy();
    }

    private ArrayList<zz93> zzZ(zz93 zz93Var, int i, int i2, boolean z, int i3, int i4, int i5) {
        return zzZ(zzM(zzAK.zzZ(this.zzZ73, i, z).zzR(zz93Var), i2), i3, i4, i5);
    }

    private static ArrayList<zz93> zzZ(ArrayList<zz93> arrayList, int i, int i2, int i3) {
        if (i3 >= 0) {
            if (i3 == 0) {
                i3 = arrayList.size();
            }
            int size = i - 1;
            if (i == 0) {
                size = 0;
            } else if (i < 0 && i >= (-arrayList.size())) {
                size = arrayList.size() + i;
            } else if (i < (-arrayList.size())) {
                size = arrayList.size() + 1;
            }
            if (i2 == 0) {
                i2 = 1;
            } else if (i2 < 0) {
                i2 = arrayList.size();
            }
            ArrayList<zz93> arrayList2 = new ArrayList<>();
            for (int i4 = 0; size < arrayList.size() && i4 < i3; i4++) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, arrayList.get(size));
                size += i2;
            }
            return arrayList2;
        }
        throw new IllegalStateException("Invalid 'cnt' value in iterator attributes.");
    }
}

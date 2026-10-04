package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz5D {
    private zz4W zzkV;
    private String zzkk;
    private int zzZF = 0;
    private zzZYT<ArrayList<zz5E>> zzkj = new zzZYT<>();

    public zz5D(String str, zz4W zz4w) {
        this.zzkk = str;
        this.zzkV = zz4w;
    }

    public final zz5E zzY(String str, zzP9 zzp9) {
        ArrayList<zz5E> arrayListZzZ = this.zzkj.zzZ(str, (ArrayList<zz5E>) null);
        if (arrayListZzZ == null) {
            return null;
        }
        if (!arrayListZzZ.get(0).zzvY()) {
            return arrayListZzZ.get(0);
        }
        for (int size = arrayListZzZ.size() - 1; size >= 0; size--) {
            if (zzP9.zzY(arrayListZzZ.get(size).zzvZ(), zzp9)) {
                return arrayListZzZ.get(size);
            }
        }
        return null;
    }

    public final zz5E zzZ(String str, zzZQ4 zzzq4, zz3A zz3a) throws Exception {
        int i = this.zzZF + 1;
        this.zzZF = i;
        zz5E zz5e = new zz5E(this.zzkV, zzZKN.format("{0}{1}", this.zzkk, Integer.valueOf(i)), zzzq4, zz3a);
        if (this.zzkj.containsKey(str)) {
            zzZQG.zzZ(this.zzkj.get(str), zz5e);
            return zz5e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(zz5e);
        this.zzkj.set(str, arrayList);
        return zz5e;
    }

    public final void zzY(zzFX zzfx) throws Exception {
        Iterator<ArrayList<zz5E>> it = this.zzkj.zzl9().iterator();
        while (it.hasNext()) {
            Iterator<zz5E> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().zzY(zzfx);
            }
        }
    }
}

package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZX5 {
    private zzZX9 zz9w;
    private zzD3<zzZX9> zz9y = new zzD3<>();
    private zzD3<zzZX9> zz9x = new zzD3<>();
    private ArrayList<zzUV> zz9v = new ArrayList<>();

    private zzDB zzSv(int i) {
        zzDB zzdb = new zzDB();
        Iterator<zzUV> it = this.zz9v.iterator();
        while (it.hasNext()) {
            it.next().zzZ(i, zzdb);
        }
        return zzdb;
    }

    public final boolean zzC(int i, boolean z) {
        return (z ? zzSy(i) : this.zz9y.get(i)) != null;
    }

    public final void zzH(ArrayList<zzUV> arrayList) {
        this.zz9v = arrayList;
    }

    public final zzZX9 zzSt(int i) {
        zzZX9 zzzx9ZzSu = zzSu(i);
        return zzzx9ZzSu != null ? zzzx9ZzSu : this.zz9w;
    }

    public final zzZX9 zzSu(int i) {
        return this.zz9x.get(i);
    }

    public final boolean zzSw(int i) {
        return zzC(i, true);
    }

    public final zzZX9 zzSx(int i) {
        zzZX9 zzzx9ZzSy = zzSy(i);
        return zzzx9ZzSy != null ? zzzx9ZzSy : this.zz9w;
    }

    public final zzZX9 zzSy(int i) {
        zzZX9 zzzx9 = this.zz9y.get(i);
        if (zzzx9 != null) {
            return zzzx9;
        }
        zzDB zzdbZzSv = zzSv(i);
        for (int i2 = 0; i2 < zzdbZzSv.getCount(); i2++) {
            zzZX9 zzzx92 = this.zz9y.get(zzdbZzSv.get(i2));
            if (zzzx92 != null) {
                return zzzx92;
            }
        }
        return null;
    }

    public final void zzY(zzZX9 zzzx9) {
        this.zz9w = zzzx9;
    }

    public final void zzZ(zzZX9 zzzx9) {
        this.zz9x.set(zzzx9.getGlyphIndex(), zzzx9);
    }

    public final void zzZv(int i, int i2) {
        zzZX9 zzzx9 = this.zz9x.get(i2);
        this.zz9y.set(i, zzzx9);
        if (zzzx9.zzZD() == 0) {
            zzzx9.zzSz(i);
        }
    }

    public final zzD3<zzZX9> zzoR() {
        return this.zz9y;
    }

    public final zzD3<zzZX9> zzoS() {
        return this.zz9x;
    }

    public final zzZX9 zzoT() {
        return this.zz9w;
    }
}

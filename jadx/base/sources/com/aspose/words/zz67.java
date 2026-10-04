package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zz67 implements zzZC8 {
    private boolean zzZ2q;
    private boolean zzZ2r;
    private zz9K zzZ2s;
    private zzBE zzZ2u;
    private float zzZ2p = Float.POSITIVE_INFINITY;
    private float zzZ2o = Float.POSITIVE_INFINITY;
    private boolean zzZiG = true;
    private ArrayList<zz65> zzZ2t = new ArrayList<>();

    public zz67(zzBE zzbe, zz9K zz9k) {
        this.zzZ2u = zzbe;
        this.zzZ2s = zz9k;
    }

    private float zzX8(boolean z) {
        float fZzZzs = Float.POSITIVE_INFINITY;
        for (zz65 zz65Var : this.zzZ2t) {
            if (!Float.isInfinite(zz65Var.zzZzs())) {
                fZzZzs = Float.isInfinite(fZzZzs) ? zz65Var.zzZzs() : z ? Math.max(fZzZzs, zz65Var.zzZzs()) : Math.min(fZzZzs, zz65Var.zzZzs());
            }
        }
        return fZzZzs;
    }

    private boolean zzZzg() {
        Iterator<zz65> it = this.zzZ2t.iterator();
        while (it.hasNext()) {
            if (it.next().zzZzd()) {
                return true;
            }
        }
        return false;
    }

    private boolean zzZzh() {
        Iterator<zz65> it = this.zzZ2t.iterator();
        while (it.hasNext()) {
            if (it.next().zzZzk()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzZC9
    public final int getType() {
        return this.zzZ2u.getType();
    }

    @Override // com.aspose.words.zzZC9
    public final void invalidate() {
        this.zzZiG = false;
    }

    @Override // com.aspose.words.zzZC9
    public final void zzX9(boolean z) {
        this.zzZ2q = true;
    }

    @Override // com.aspose.words.zzZC9
    public final void zzXa(boolean z) {
    }

    @Override // com.aspose.words.zzZC9
    public final void zzYS(float f) {
        this.zzZ2o = zzB5.zzR(this.zzZ2u.getType(), f);
    }

    @Override // com.aspose.words.zzZC9
    public final void zzYT(float f) {
        this.zzZ2p = zzB5.zzR(this.zzZ2u.getType(), f);
    }

    @Override // com.aspose.words.zzZC9
    public final void zzZzf() {
        zzYT(this.zzZiG ? Float.POSITIVE_INFINITY : 0.0f);
        zzYS(this.zzZiG ? Float.POSITIVE_INFINITY : 0.0f);
        this.zzZ2q = false;
    }

    @Override // com.aspose.words.zzZC8
    public final zzB9 zzZzi() {
        if (!this.zzZ2r || !zzZzh()) {
            return null;
        }
        float fZzX8 = zzX8(zzZzg());
        if (Float.isInfinite(fZzX8)) {
            return null;
        }
        return new zzB9(fZzX8, this);
    }

    @Override // com.aspose.words.zzZC8
    public final ArrayList<zzBC> zzZzj() {
        ArrayList<zzBC> arrayList = new ArrayList<>();
        float fZzZzq = zzZzq();
        if (!Float.isInfinite(fZzZzq)) {
            Iterator<zz65> it = this.zzZ2t.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzB8>) arrayList, new zzB8(fZzZzq, it.next()));
            }
        }
        return arrayList;
    }

    @Override // com.aspose.words.zzZC9
    public final boolean zzZzk() {
        return this.zzZ2q;
    }

    @Override // com.aspose.words.zzZC8
    public final void zzZzl() {
        this.zzZ2r = true;
    }

    @Override // com.aspose.words.zzZC8
    public final boolean zzZzm() {
        return this.zzZ2r;
    }

    @Override // com.aspose.words.zzZC9
    public final zz9K zzZzn() {
        return this.zzZ2s;
    }

    public final ArrayList<zz65> zzZzo() {
        return this.zzZ2t;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzp() {
        return Float.POSITIVE_INFINITY;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzq() {
        return !Float.isInfinite(this.zzZ2o) ? this.zzZ2o : this.zzZ2p;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzr() {
        return this.zzZ2o;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzs() {
        return this.zzZ2p;
    }

    @Override // com.aspose.words.zzZC8
    public final zzBE zzZzt() {
        return this.zzZ2u;
    }
}

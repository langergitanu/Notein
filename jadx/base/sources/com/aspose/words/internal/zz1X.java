package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz1X extends zz33 {
    private ArrayList<zz1V> zzro;

    public zz1X(zz4W zz4w) {
        super(zz4w);
        this.zzro = new ArrayList<>();
    }

    public final void zzS(int i, String str) {
        zz1T zz1t = new zz1T(i, str);
        zz1t.zzZ(this);
        zzZQG.zzZ((ArrayList<zz1T>) this.zzro, zz1t);
    }

    public final void zzX(zz1Y zz1y) {
        zz1y.zzY(this);
        zz1U zz1u = new zz1U(zz1y);
        zz1u.zzZ(this);
        zzZQG.zzZ((ArrayList<zz1U>) this.zzro, zz1u);
    }

    @Override // com.aspose.words.internal.zz33
    public void zzZ(zzFX zzfx) throws Exception {
        Iterator<zz1V> it = this.zzro.iterator();
        while (it.hasNext()) {
            it.next().zzV(zzfx);
        }
    }

    public final void zzy(zzFY zzfy) throws Exception {
        if (this.zzro.size() == 0) {
            return;
        }
        zzfy.zzYY("/K");
        zzfy.zzFf();
        for (int i = 0; i < this.zzro.size(); i++) {
            this.zzro.get(i).zzx(zzfy);
            if (i < this.zzro.size() - 1) {
                zzfy.zzFh();
            }
        }
        zzfy.zzFe();
    }

    public final void zzZ(zz33 zz33Var, String str) {
        zz1S zz1s = new zz1S(zz33Var, str);
        zz1s.zzZ(this);
        zzZQG.zzZ((ArrayList<zz1S>) this.zzro, zz1s);
    }
}

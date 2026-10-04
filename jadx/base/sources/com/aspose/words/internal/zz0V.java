package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz0V {
    private zzYZ zzeD;
    private zzSR zzeE;
    private zz0V zzeF;
    private zzZZR zzeG;
    private zzZZR zzeH;

    public zz0V(zzZZR zzzzr) {
        this.zzeH = zzzzr;
    }

    private void zzZ(Map map) {
        if (this.zzeG == null) {
            this.zzeG = new zzZZR(this.zzeH);
        }
        this.zzeG.zzi(zzZ(this.zzeH.zzEW(), map));
        this.zzeG.zzh(!this.zzeH.zzrP() ? zzZ(this.zzeH.zzEV(), map) : this.zzeG.zzEW());
    }

    private void zzsC() {
        this.zzeG.zzi(null);
        this.zzeG.zzh(null);
    }

    public boolean isComposite() {
        return false;
    }

    public final void zzW(zz0V zz0v) {
        this.zzeF = zz0v;
    }

    public final void zzX(zzSR zzsr) {
        this.zzeE = zzsr;
    }

    public final void zzY(zzFS zzfs, Map map, zz0U zz0u) throws Exception {
        zzZ(map);
        zzYZ zzyz = this.zzeD;
        zzZ((zzyz == null || !zzyz.zzYC()) ? zzZ(zzfs, this.zzeG, map, zz0u) : 3, zzfs, this.zzeG, zz0u);
        zzsC();
    }

    public abstract int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception;

    public final zz0V zzsA() {
        return this.zzeF;
    }

    public final zzZZR zzsB() {
        return this.zzeH;
    }

    public final boolean zzsx() {
        for (zzSR zzsr = this.zzeE; zzsr != null; zzsr = zzsr.zzeE) {
            if (zzsr.zzeH.zzEU() == 2) {
                return true;
            }
        }
        return false;
    }

    public final zzYZ zzsy() {
        return this.zzeD;
    }

    public final zzSR zzsz() {
        return this.zzeE;
    }

    public boolean zzxO() {
        return false;
    }

    public boolean zzxb() {
        return false;
    }

    private Object zzZ(Object obj, Map map) {
        zzYZ zzyz = this.zzeD;
        return zzyz != null ? zzyz.zzZ(obj, map) : obj;
    }

    public static void zzZ(int i, zzFS zzfs, zzZZR zzzzr, zz0U zz0u) throws Exception {
        if ((i & 1) != 0) {
            zzZ(zzfs, zzzzr, zz0u.zzsw());
        }
        if ((i & 2) != 0) {
            zzfs.zzY(zzzzr);
        } else if ((i & 4) != 0) {
            zzfs.zzX(zzzzr);
        }
    }

    private static void zzZ(zzFS zzfs, zzZZR zzzzr, zzZQE<Object> zzzqe) {
        if (zzzqe == null) {
            return;
        }
        zzZ(zzfs, zzzzr.zzEW(), zzzqe);
        if (zzzzr.zzrP()) {
            return;
        }
        zzZ(zzfs, zzzzr.zzEV(), zzzqe);
    }

    private static void zzZ(zzFS zzfs, Object obj, zzZQE<Object> zzzqe) {
        Object objZzG = zzfs.zzG(obj);
        if (objZzG == null) {
            return;
        }
        if (zzzqe.zzl7() == null || !zzZKO.equals(zzzqe.zzl7().getValue(), objZzG)) {
            zzzqe.addLast(objZzG);
        }
    }

    public final void zzZ(zzYZ zzyz) {
        this.zzeD = zzyz;
    }
}

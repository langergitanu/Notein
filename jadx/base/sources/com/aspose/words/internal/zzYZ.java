package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class zzYZ extends zzSR {
    private zzJD zzXS;

    public zzYZ(zzZZR zzzzr, zzJC zzjc, String str) {
        super(zzzzr, str);
        this.zzXS = new zzJD(zzjc);
    }

    private Object zzY(Object obj, Map map) {
        for (zzYZ zzyzZzsy = zzsy(); zzyzZzsy != null; zzyzZzsy = zzyzZzsy.zzsy()) {
            obj = map.get(obj);
        }
        return obj;
    }

    public final zzGW zzYB() {
        return this.zzXS;
    }

    public final boolean zzYC() {
        return this.zzXS.zzYC();
    }

    public final boolean zzYD() throws Exception {
        return this.zzXS.zzHb();
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Map map2;
        boolean z;
        boolean z2 = map == null;
        boolean z3 = zz0u.zzsw() != null;
        Iterator it = this.zzXS.iterator();
        zzZZR zzzzr2 = null;
        boolean z4 = false;
        while (it.hasNext()) {
            it.next();
            if (z4) {
                map2 = map;
                z = z4;
            } else {
                if (z2) {
                    map = new HashMap();
                }
                zzZ(0, (zz0V) this, map);
                if (z3) {
                    zzzzr2 = new zzZZR(zzzzr);
                }
                map2 = map;
                z = true;
            }
            zzZZR zzzzr3 = zzzzr2;
            zzfs.zzZ(zzzzr, map2);
            zzZ(zzfs, map2, zz0u);
            if (z3) {
                zzZ(zzzzr3, zzzzr, zzfs, map2, zz0u);
            }
            z4 = z;
            zzzzr2 = zzzzr3;
            map = map2;
        }
        if (!z4 || z2) {
            return 3;
        }
        zzZ(1, (zz0V) this, map);
        return 3;
    }

    private void zzZ(zzZZR zzzzr, zzZZR zzzzr2, zzFS zzfs, Map map, zz0U zz0u) throws Exception {
        zzzzr.zzi(map.get(zzzzr2.zzEW()));
        zzzzr.zzh(map.get(zzzzr2.zzEV()));
        zz0V.zzZ(5, zzfs, zzzzr, zz0u);
    }

    private void zzZ(int i, zz0V zz0v, Map map) {
        zzZ(i, zz0v.zzsB().zzEW(), map);
        if (!zz0v.zzsB().zzrP()) {
            zzZ(i, zz0v.zzsB().zzEV(), map);
        }
        if (zz0v.isComposite()) {
            for (zz0V zz0vZzSi = ((zzSR) zz0v).zzSi(); zz0vZzSi != null; zz0vZzSi = zz0vZzSi.zzsA()) {
                zzZ(i, zz0vZzSi, map);
            }
        }
    }

    private void zzZ(int i, Object obj, Map map) {
        if (i == 0) {
            map.put(zzY(obj, map), null);
        } else {
            if (i == 1) {
                map.remove(zzY(obj, map));
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final Object zzZ(Object obj, Map map) {
        return map.get(zzY(obj, map));
    }
}

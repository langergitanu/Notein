package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zz6T {
    private zzZYT<Integer> zzmg = new zzZYT<>(false);
    private zz6S zzmh;
    private zz6S zzmi;
    private zz6U zzmj;

    public zz6T(zz6U zz6u) {
        this.zzmj = zz6u;
        zz6S zz6s = new zz6S();
        this.zzmi = zz6s;
        zz6s.zzUg(0);
        this.zzmi.zzUf(0);
        this.zzmh = this.zzmi;
        zzx4();
    }

    private void zzx4() {
        Iterator<Map.Entry<K, V>> it = this.zzmj.zzx5().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.zzmg.set(zzI.zzL((String) entry.getKey()), (Integer) entry.getValue());
        }
    }

    public final boolean zzZ(zzI zzi, Object obj) {
        int iIntValue = ((Integer) zzQW.zzZ(this.zzmg, zzi.getName(), Integer.valueOf(this.zzmj.getDefaultBookmarksOutlineLevel()))).intValue();
        if (iIntValue == 0 || zzi.zzZS()) {
            return false;
        }
        zz6S zz6s = new zz6S();
        zz6s.zzUg(iIntValue);
        zz6s.zzl(obj);
        zzZ(zz6s);
        return true;
    }

    public final zz6S zzx3() {
        return this.zzmi;
    }

    public final boolean zzZ(zzZI zzzi, Object obj) {
        if (zzzi.getLevel() >= this.zzmj.getHeadingsOutlineLevels()) {
            return false;
        }
        zz6S zz6s = new zz6S();
        zz6s.zzUg(zzzi.getLevel() + 1);
        zz6s.zzl(obj);
        zzZ(zz6s);
        return true;
    }

    private void zzZ(zz6S zz6s) {
        if (zz6s.zzx1() <= this.zzmi.zzx1()) {
            zz6s.zzX(null);
            return;
        }
        zz6s.zzZM(zz6s.zzx1() <= this.zzmj.getExpandedOutlineLevels());
        while (zz6s.zzx1() <= this.zzmh.zzx1()) {
            this.zzmh = this.zzmh.zzx2();
        }
        if (this.zzmj.getCreateMissingOutlineLevels()) {
            while (zz6s.zzx1() > this.zzmh.zzx0() + 1) {
                zz6S zz6s2 = new zz6S();
                this.zzmh.zzY(zz6s2);
                zz6s2.zzUg(zz6s2.zzx0());
                zz6s2.zzZM(zz6s2.zzx0() <= this.zzmj.getExpandedOutlineLevels());
                this.zzmh = zz6s2;
            }
        }
        this.zzmh.zzY(zz6s);
        this.zzmh = zz6s;
    }
}

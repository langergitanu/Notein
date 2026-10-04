package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zz74 implements Cloneable, Iterable<zz75> {
    private zzZYT<zz75> zzmL;
    private zzZYT<zz75> zzmM;
    private String zzmN;

    public zz74(String str) {
        this.zzmN = str;
        zzxg();
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void zzY(zz75 zz75Var) {
        this.zzmM.set(zz75Var.getId(), zz75Var);
        this.zzmL.set(zzr(zz75Var.getTarget(), zz75Var.getType()), zz75Var);
    }

    private static String zzr(String str, String str2) {
        return zzZKN.format("{0}{1}", str, str2);
    }

    private void zzxg() {
        this.zzmM = new zzZYT<>(true);
        this.zzmL = new zzZYT<>(false);
    }

    public final int getCount() {
        return this.zzmM.getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator<zz75> iterator() {
        return this.zzmM.zzl9().iterator();
    }

    public final void remove(String str) {
        zz75 zz75VarZzY7 = zzY7(str);
        this.zzmM.remove(zz75VarZzY7.getId());
        this.zzmL.remove(zz75VarZzY7.getTarget());
    }

    public final zz75 zzY6(String str) {
        Iterator<Map.Entry<K, V>> it = this.zzmM.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (zzZKN.equals(((zz75) entry.getValue()).getType(), str)) {
                return (zz75) entry.getValue();
            }
        }
        return null;
    }

    public final zz75 zzY7(String str) {
        return (zz75) zzQW.zzZ((zzZYT) this.zzmM, str);
    }

    public final String zzZ(String str, String str2, boolean z) {
        if (!z) {
            str2 = zz78.zzt(this.zzmN, str2);
        } else if (zzZVR.zzWE(str2)) {
            str2 = zzZVR.zzWu(zzZVR.zzWl(str2));
        } else if (zzZVR.zzWn(str2)) {
            str2 = zzZVR.zzWu(zzZVR.zzWt(str2));
        }
        zz75 zz75Var = (zz75) zzQW.zzZ((zzZYT) this.zzmL, zzr(str2, str));
        if (zz75Var != null) {
            return zz75Var.getId();
        }
        String str3 = zzZKN.format("rId{0}", Integer.valueOf(this.zzmL.getCount() + 1));
        zzZ(str3, str, str2, z);
        return str3;
    }

    public final String zzxf() {
        return this.zzmN;
    }

    public final zz74 zzxh() {
        zz74 zz74Var = (zz74) memberwiseClone();
        zz74Var.zzxg();
        Iterator<zz75> it = this.zzmM.zzl9().iterator();
        while (it.hasNext()) {
            zz74Var.zzY(it.next().zzxi());
        }
        return zz74Var;
    }

    public final void zzZ(String str, String str2, String str3, boolean z) {
        if (!z) {
            str3 = str3.replace("\\", "/");
        }
        zzY(new zz75(str, str2, str3, z));
    }
}

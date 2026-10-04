package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLR {
    private zzZLX zzZSb;
    private zzZLX zzZUU;
    private zzZLX zzZUV;
    private boolean zzZV3;
    private List<zzZN3> zzZSc = new ArrayList();
    private zzZLX zzZSa = new zzZLX();
    private zzZLX zzZS9 = new zzZLX();
    private zzZLX zzZS8 = new zzZLX();
    private zzZLX zzZS7 = new zzZLX();
    private HashMap<String, zzZLZ> zzZS6 = new HashMap<>();
    private zzZOZ zzZSu = zzZOZ.zziD();

    private void zzO(zzZN3 zzzn3) {
        for (zzZLZ zzzlz : zzzn3.zzh5().values()) {
            zzfU().zzZ(zzzlz.zzgQ(), (zzZML) zzzlz);
        }
        for (zzZLZ zzzlz2 : zzzn3.zzh4().values()) {
            zzfT().zzZ(zzzlz2.zzgQ(), (zzZMX) zzzlz2);
        }
        for (zzZLZ zzzlz3 : zzzn3.zzh3().values()) {
            zzfS().zzZ(zzzlz3.zzgQ(), zzzlz3);
        }
        for (zzZLZ zzzlz4 : zzzn3.zzh2().values()) {
            this.zzZSa.zzZ(zzzlz4.zzgQ(), (zzZMW) zzzlz4);
        }
        for (zzZLZ zzzlz5 : zzzn3.zzh1().values()) {
            this.zzZS9.zzZ(zzzlz5.zzgQ(), (zzZMF) zzzlz5);
        }
        for (Map.Entry<String, zzZLZ> entry : zzzn3.zzh0().entrySet()) {
            this.zzZS6.put(entry.getKey(), entry.getValue());
        }
        for (zzZLZ zzzlz6 : zzzn3.zzgZ().values()) {
            this.zzZS7.zzZ(zzzlz6.zzgQ(), (zzZMC) zzzlz6);
        }
    }

    private static String zzUq(String str) {
        return str == null ? "" : str;
    }

    private zzZLX zzfS() {
        if (this.zzZSb == null) {
            this.zzZSb = new zzZLX();
        }
        return this.zzZSb;
    }

    private zzZLX zzfT() {
        if (this.zzZUU == null) {
            this.zzZUU = new zzZLX();
        }
        return this.zzZUU;
    }

    private zzZLX zzfU() {
        if (this.zzZUV == null) {
            this.zzZUV = new zzZLX();
        }
        return this.zzZUV;
    }

    private void zzfV() {
        this.zzZV3 = false;
        zzfW();
    }

    private void zzfW() {
        zzfU().clear();
        zzfT().clear();
        zzfS().clear();
        this.zzZSa.clear();
        this.zzZS9.clear();
        this.zzZS8.clear();
        this.zzZS6.clear();
        this.zzZS7.clear();
    }

    public final boolean contains(String str) {
        String strZzUq = zzUq(str);
        Iterator<zzZN3> it = this.zzZSc.iterator();
        while (it.hasNext()) {
            if (zzUq(it.next().zzgY()).equals(strZzUq)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzM(zzZN3 zzzn3) {
        Iterator<zzZN3> it = this.zzZSc.iterator();
        while (it.hasNext()) {
            if (it.next() == zzzn3) {
                return true;
            }
        }
        return false;
    }

    public final void zzN(zzZN3 zzzn3) {
        this.zzZSc.add(zzzn3);
        zzfV();
    }

    public final List<zzZN3> zzfR() {
        return this.zzZSc;
    }

    public final void zzfX() throws zzZMJ {
        zzfW();
        ArrayList<zzZN3> arrayList = new ArrayList();
        arrayList.addAll(this.zzZSc);
        zzZLT zzzlt = new zzZLT();
        ArrayList arrayList2 = new ArrayList();
        for (zzZN3 zzzn3 : arrayList) {
            if (!zzzn3.zzh6()) {
                zzzn3.zzZ(this, zzzlt, arrayList2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator<zzZLZ> it2 = ((zzZN3) it.next()).zzh5().values().iterator();
            while (it2.hasNext()) {
                ((zzZML) it2.next()).zzgs();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            try {
                ((zzZN3) it3.next()).zztF();
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            zzO((zzZN3) it4.next());
        }
        this.zzZV3 = true;
    }

    public final zzZOZ zzg5() {
        return this.zzZSu;
    }
}

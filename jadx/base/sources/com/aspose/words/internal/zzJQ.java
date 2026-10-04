package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzJQ {
    private String zzA7;
    private zzZXH zzA8;
    private zzK6 zzA9;
    private zzZWU zzAa;
    private zzQZ zzAb;
    private final Map<String, String> zzAc = new HashMap();
    private final zzK2 zzAd;
    private final zzKJ zzAe;

    public zzJQ() {
        zzKJ zzkj = new zzKJ(new zzGP[]{new zzZXS()});
        this.zzAe = zzkj;
        zzkj.zzIi();
        this.zzAd = zzK2.zzHY();
        zzHt();
        zzHs();
        zzHr();
        zzHu();
    }

    private void zzHr() {
        try {
            if (!zz0T.zzsp() || zz0T.zzsq()) {
                return;
            }
            zzK6 zzk6 = new zzK6();
            this.zzA9 = zzk6;
            if (zzk6.isFontConfigAvailable()) {
                return;
            }
            this.zzA9 = null;
        } catch (Throwable unused) {
        }
    }

    private void zzHs() {
        if (zz0T.zzsr()) {
            this.zzAb = new zzQZ("FreeSans");
        } else if (zz0T.zzsq()) {
            this.zzAb = new zzQZ("Droid Sans Fallback");
        } else {
            this.zzAb = new zzQZ("Times New Roman");
        }
    }

    private void zzHt() {
        try {
            if (zz0T.zzsr()) {
                this.zzAa = zzZWU.zzot();
            } else if (zz0T.zzsq()) {
                this.zzAa = zzZWU.zzos();
            } else {
                this.zzAa = zzZWU.zzou();
            }
        } catch (Throwable unused) {
        }
    }

    private void zzHu() {
        if (this.zzAc.isEmpty()) {
            Iterator<zzJU> it = this.zzAe.zzIj().iterator();
            while (it.hasNext()) {
                for (String str : it.next().zzHI()) {
                    if (this.zzA7 == null) {
                        this.zzA7 = str;
                    }
                    this.zzAc.put(str.toLowerCase(), str);
                }
            }
        }
    }

    public final zzK2 zzHv() {
        return this.zzAd;
    }

    public final String zzHw() {
        return this.zzA7;
    }

    public final zzZXH zzIk() {
        zzZXH zzzxhZzIk = this.zzAe.zzIk();
        if (zzzxhZzIk != null) {
            return zzzxhZzIk;
        }
        if (this.zzA8 == null) {
            this.zzA8 = zzJF.zzHi();
        }
        return this.zzA8;
    }

    public final zzZXH zzQ(String str, int i) {
        zzZWU zzzwu = this.zzAa;
        if (zzzwu == null) {
            return null;
        }
        return zzzwu.zzZ(str, i, null, this.zzAe);
    }

    public final zzZXH zzR(String str, int i) {
        zzK6 zzk6 = this.zzA9;
        if (zzk6 == null) {
            return null;
        }
        return zzk6.zzZ(str, i, null, this.zzAe);
    }

    public final zzZXH zzV(String str, int i) {
        return this.zzAe.zzV(str, i);
    }

    public final zzZXH zzWR(int i) {
        return this.zzAb.zzZ(i, this.zzAe);
    }

    public final String zzZM(String str) {
        return this.zzAc.get(str.toLowerCase());
    }
}

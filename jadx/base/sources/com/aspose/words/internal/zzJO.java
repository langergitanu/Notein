package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzJO {
    private String mName;
    private zzZXH zzA4;
    private int zzAr;
    private zzZYV<Integer> zzA3 = new zzZYV<>();
    private zzZYV<Integer> zzQu = new zzZYV<>();

    public zzJO(zzZXH zzzxh) {
        this.zzA4 = zzzxh;
    }

    public final String getName() {
        return this.mName;
    }

    public final int getStyle() {
        return this.zzAr;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public abstract void zzF(zzZOP zzzop) throws Exception;

    public abstract void zzG(zzZOP zzzop) throws Exception;

    public final zzZYV<Integer> zzHn() {
        return this.zzA3;
    }

    public abstract boolean zzHo();

    public final void zzHp() {
        zzg(this.zzA4.zzpP().zzoT().zzZD(), zzWQ(this.zzA4.zzpP().zzoT().getGlyphIndex()));
    }

    public final zzZXH zzPl() {
        return this.zzA4;
    }

    public final zzZYV<Integer> zzTt() {
        return this.zzQu;
    }

    public final void zzWN(int i) {
        this.zzAr = i;
    }

    public abstract int zzWO(int i);

    public final int zzWP(int i) {
        if (this.zzQu.zzVE(i)) {
            return this.zzQu.get(i).intValue();
        }
        int iZzWQ = zzWQ(this.zzA4.zzpP().zzSx(i).getGlyphIndex());
        zzg(i, iZzWQ);
        return iZzWQ;
    }

    public final int zzWQ(int i) {
        if (this.zzA3.zzVE(i)) {
            return this.zzA3.get(i).intValue();
        }
        if (this.zzA4.zzpP().zzSu(i) == null) {
            return this.zzA3.get(0).intValue();
        }
        int iZzWO = zzWO(i);
        this.zzA3.add(i, Integer.valueOf(iZzWO));
        return iZzWO;
    }

    public abstract void zzY(zzZOP zzzop) throws Exception;

    public final void zzZL(String str) {
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            zzWP(((Integer) itOooO00o.next()).intValue());
        }
    }

    public final void zzg(int i, int i2) {
        if (this.zzQu.zzVE(i)) {
            return;
        }
        this.zzQu.set(i, Integer.valueOf(i2));
    }
}

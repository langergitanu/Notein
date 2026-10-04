package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzZUE extends zzZT7 {
    private int zz6N;
    private byte[] zz6O;
    private int[] zzCD;
    private zzZQ4 zzHe;
    private zz0Q zzpa;

    private zz0Q zzA(int i, boolean z) throws Exception {
        if (zzmX() - zzmY().zzq().getPosition() < (z ? i * 4 : i * 2)) {
            return null;
        }
        zz0Q zz0q = new zz0Q(i);
        for (int i2 = 0; i2 < i; i2++) {
            zz0q.add(zzZPY.zzG(zzmY().zzXa(), z ? -zzmY().zzXa() : 0.0f));
        }
        return zz0q;
    }

    private boolean zzIU() {
        return (this.zz6N & 16) != 0;
    }

    private boolean zzZz() {
        return (this.zz6N & 128) != 0;
    }

    public final boolean isOpaque() {
        return (this.zz6N & 2) != 0;
    }

    public final zzZQ4 zzJH() {
        return this.zzHe;
    }

    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        zzY(zzmY().zzN1());
        int iZzXa = zzmY().zzXa() & 65535;
        short sZzXa = zzmY().zzXa();
        this.zz6N = sZzXa;
        boolean z = (sZzXa & 8192) != 0;
        this.zzHe = zzZQ4.zz2T;
        if (isOpaque() || zzmS()) {
            this.zzHe = zzmY().zzMY();
        }
        this.zz6O = null;
        this.zzCD = null;
        if (zzIU()) {
            this.zzCD = zzmY().zzXP(iZzXa);
        } else {
            this.zz6O = zzmY().zzn(iZzXa);
        }
        if (zzAN.zzZP(iZzXa)) {
            zzmY().zzX6();
        }
        this.zzpa = zzA(iZzXa, z);
    }

    @Override // com.aspose.words.internal.zzZT7
    public final zz8N zzZ(zzPM zzpm, zz9O zz9o, float f, zzGQ zzgq, zzF8 zzf8) throws Exception {
        if (zzIU()) {
            return zz8L.zzZ(this.zzCD, this.zzpa, zzpm);
        }
        String strZzZn = zz9o.zzZn(this.zz6O);
        return zz8L.zzZ(strZzZn, zzZz(), false, zzZ(strZzZn, this.zzpa, zz9o), f, zzpm, zzgq, zzf8);
    }

    public final boolean zzmS() {
        return (this.zz6N & 4) != 0;
    }

    public final zz0Q zzmT() {
        return this.zzpa;
    }

    private static zz0Q zzZ(String str, zz0Q zz0q, zz9O zz9o) {
        if (zz0q == null) {
            return null;
        }
        zz0Q zz0q2 = new zz0Q(zz0q.getCount());
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        int i = 0;
        while (itOooO00o.hasNext()) {
            int iZzV2 = zz9o.zzV2(((Integer) itOooO00o.next()).intValue());
            long jOooO00o = 0;
            int i2 = 0;
            while (i2 < iZzV2) {
                long j = zz0q.get(i);
                jOooO00o = C22243OooO0Oo.OooO00o(zzZPY.zzYC(jOooO00o), Float.intBitsToFloat((int) j) + Float.intBitsToFloat((int) jOooO00o), j);
                i2++;
                i++;
            }
            zz0q2.add(jOooO00o);
        }
        return zz0q2;
    }
}

package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzL1 {
    private zz8N zzCC;
    private int[] zzCD;
    private zz0Q zzCE;
    private int zzCF;
    private long zzCG;
    private boolean zzD7;
    private zzZQ4 zzHe;
    private String zzZi;

    public zzL1(long j, zzZQ4 zzzq4, int i, int[] iArr, String str) {
        this.zzCG = j;
        this.zzHe = zzzq4;
        this.zzCF = i;
        this.zzCE = null;
        this.zzCD = iArr;
        this.zzZi = str;
    }

    private boolean zzIU() {
        return (this.zzCF & 16) != 0;
    }

    public static zzL1 zzIW() {
        zzL1 zzl1 = new zzL1();
        zzl1.zzD7 = true;
        return zzl1;
    }

    private zz8N zzY(zz8W zz8w, zzPM zzpm, int i, zzGQ zzgq, zzF8 zzf8) throws Exception {
        return zzIU() ? zz8L.zzZ(this.zzCD, this.zzCE, zzpm) : zz8L.zzZ(this.zzZi, zzZz(), zz8w.zzz7(), this.zzCE, i, zzpm, zzgq, zzf8);
    }

    private static void zzZ(String str, zz0Q zz0q) {
        if (zz0q == null) {
            return;
        }
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        int i = 0;
        while (itOooO00o.hasNext()) {
            if (zzZVS.zzS4(((Integer) itOooO00o.next()).intValue())) {
                long j = zz0q.get(i);
                int i2 = i + 1;
                long j2 = zz0q.get(i2);
                zz0q.set(i, C22243OooO0Oo.OooO00o(zzZPY.zzYC(j), Float.intBitsToFloat((int) j2) + Float.intBitsToFloat((int) j), j2));
                zz0q.removeAt(i2);
            }
            i++;
        }
    }

    private boolean zzZz() {
        return (this.zzCF & 128) != 0;
    }

    public final int getOptions() {
        return this.zzCF;
    }

    public final boolean isEmpty() {
        return this.zzD7;
    }

    public final zz0Q zzIT() {
        return this.zzCE;
    }

    public final long zzIV() {
        return this.zzCG;
    }

    public final zzZQ4 zzJH() {
        return this.zzHe;
    }

    private zzL1() {
    }

    public static zzL1 zzZ(zzO8 zzo8, long j, boolean z) throws Exception {
        String strZzXN;
        zzL1 zzl1 = new zzL1();
        zzl1.zzCG = zzo8.zzN1();
        int iZzXc = zzo8.zzXc();
        int iZzXc2 = zzo8.zzXc();
        int iZzXc3 = zzo8.zzXc();
        zzl1.zzCF = iZzXc3;
        boolean z2 = (iZzXc3 & 16) != 0;
        boolean z3 = (iZzXc3 & 512) != 0 || z;
        zzl1.zzHe = zzo8.zzMY();
        int iZzXc4 = zzo8.zzXc();
        zzl1.zzCE = null;
        if (iZzXc4 != 0) {
            zzo8.zzq().zzH(((long) iZzXc4) + j);
            zzl1.zzCE = zzZ(zzo8, iZzXc, zzl1.zzCF);
        }
        zzo8.zzq().zzH(j + ((long) iZzXc2));
        if (z2) {
            zzl1.zzCD = zzo8.zzXP(iZzXc);
            return zzl1;
        }
        if (z3) {
            strZzXN = zzo8.zzXM(iZzXc);
        } else {
            strZzXN = zzo8.zzXN(iZzXc);
        }
        zzl1.zzZi = strZzXN;
        zzZ(strZzXN, zzl1.zzCE);
        return zzl1;
    }

    private static zz0Q zzZ(zzO8 zzo8, int i, int i2) throws Exception {
        zz0Q zz0q = new zz0Q();
        for (int i3 = 0; i3 < i; i3++) {
            zz0q.add(zzZ(zzo8, i2));
        }
        return zz0q;
    }

    private static long zzZ(zzO8 zzo8, int i) throws Exception {
        return zzZPY.zzG(zzo8.zzXc(), (i & 8192) != 0 ? -zzo8.zzXc() : 0);
    }

    public final zz8N zzZ(zz8W zz8w, zzPM zzpm, int i, zzGQ zzgq, zzF8 zzf8) throws Exception {
        zz8N zz8n = this.zzCC;
        if (zz8n != null) {
            return zz8n;
        }
        zz8N zz8nZzY = zzY(zz8w, zzpm, i, zzgq, zzf8);
        this.zzCC = zz8nZzY;
        return zz8nZzY;
    }
}

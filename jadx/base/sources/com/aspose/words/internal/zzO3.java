package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzO3 {
    private zzN6 zzFz;

    public zzO3(zzN6 zzn6) {
        this.zzFz = zzn6;
    }

    private static String zz3(String str) {
        StringBuilder sb = new StringBuilder();
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            int iIntValue = ((Integer) itOooO00o.next()).intValue();
            zzZNH.zzU(sb, zzXE(iIntValue) ? "" : zzZVS.zzS7(iIntValue));
        }
        return sb.toString();
    }

    private static boolean zzXE(int i) {
        return i != 13 && i != 10 && i >= 0 && i <= 31;
    }

    public final zzZL zzY(long[] jArr, int i) throws Exception {
        return zzZ(new zzZG(zz9K.zzS(jArr)), i, (zzNX) null);
    }

    public final zzG zzZ(zzNM zznm, zzZQ4 zzzq4, int i, zzZQ4 zzzq42) throws Exception {
        zzZQ4 zzzq4ZzX = this.zzFz.zzKi().zzX(zzzq4, i);
        zzG zzg = new zzG();
        zzg.zzX(zznm.zzLZ());
        zzg.zzW(zzP9.zzZ(zzzq4ZzX, zzzq42));
        zzg.zzZ(zzP8.zzM(zzzq4ZzX));
        return zzg;
    }

    public final zzG zzZ(zzNM zznm, zzZQ4 zzzq4, int i, long[] jArr) throws Exception {
        zzZQ4 zzzq4ZzX = this.zzFz.zzKi().zzX(zzzq4, i);
        zzG zzg = new zzG();
        zzg.zzX(zznm.zzLZ());
        zzg.zzW(zzP9.zzZ(zzzq4ZzX, jArr));
        zzg.zzZ(zzP8.zzM(zzzq4ZzX));
        return zzg;
    }

    public static zzG zzZ(String str, zzPM zzpm, long[] jArr, zzNX zznx, int i, zzP9 zzp9) {
        zzPM zzpm2;
        if (zzp9.zzOp() || !zzZYD.zzXk(str)) {
            return null;
        }
        zzPY zzpyZzMx = zznx.zzMx();
        zzP9 zzp92 = new zzP9(zzp9.zzOf(), zzp9.zzOe(), zzp9.zzOd(), zzp9.zzOc(), 0.0f, 0.0f);
        boolean z = (i & 2) != 0;
        zzP9 zzp9ZzOh = zzp92.zzOh();
        if (z) {
            zzp9ZzOh.zzX(90.0f, 0);
        }
        zz0Q zz0q = new zz0Q();
        if ((i & 4) != 0) {
            long jOooO00o = jArr[0];
            Iterator itOooO00o = OooO0OO.OooO00o(str);
            while (itOooO00o.hasNext()) {
                int iIntValue = ((Integer) itOooO00o.next()).intValue();
                zz0q.add(jOooO00o);
                long jZzR = zzp9ZzOh.zzR(zzZPY.zzG(zzpm.zzY7(iIntValue), 0.0f));
                jOooO00o = C22243OooO0Oo.OooO00o(zzZPY.zzYC(jOooO00o), Float.intBitsToFloat((int) jZzR) + Float.intBitsToFloat((int) jOooO00o), jZzR);
            }
            zzpm2 = zzpm;
        } else {
            zzpm2 = zzpm;
            Iterator itOooO00o2 = OooO0OO.OooO00o(str);
            int i2 = 0;
            while (itOooO00o2.hasNext()) {
                int iIntValue2 = ((Integer) itOooO00o2.next()).intValue();
                zz0q.add(jArr[i2]);
                i2 += zzZVS.zzS4(iIntValue2) ? 2 : 1;
            }
        }
        zzG zzg = new zzG();
        Iterator itOooO00o3 = OooO0OO.OooO00o(str);
        int i3 = 0;
        while (itOooO00o3.hasNext()) {
            int iIntValue3 = ((Integer) itOooO00o3.next()).intValue();
            int i4 = i3 + 1;
            long j = zz0q.get(i3);
            zzZU zzzu = new zzZU(zzpm2, zzpyZzMx, 0L, zzZVS.zzS7(iIntValue3));
            zzzu.zzW(new zzP9());
            if (z) {
                if (zzUX.zzZb(iIntValue3)) {
                    zzzu.zzZO().zzY(zzpm.getAscentPoints() + (-zzpm.getLineSpacingPoints()), zzpm.getAscentPoints(), 1);
                } else {
                    zzzu.zzZO().zzY(0.0f, zzpm.getDescentPoints(), 1);
                    zzzu.zzZO().zzX(90.0f, 1);
                }
            }
            zzzu.zzZO().zzZ(zzp92, 1);
            zzzu.zzZO().zzY(Float.intBitsToFloat((int) j), zzZPY.zzYC(j), 1);
            zzg.zzX(zzzu);
            zzpm2 = zzpm;
            i3 = i4;
        }
        return zzg;
    }

    public final zzZL zzZ(long[] jArr, int i, int i2, float f, int i3) throws Exception {
        return zzZ(new zzZG(zz9K.zzZ(jArr, i, i2, f)), i3, (zzNX) null);
    }

    public final zzZL zzZ(long[] jArr, float f, int i, zzNX zznx) throws Exception {
        return zzZ(new zzZG(zz9K.zzZ(jArr, f)), i, zznx);
    }

    public final zzZL zzZ(zzZQ4 zzzq4, float f, float f2, int i) throws Exception {
        return zzZ(new zzZG(zz9K.zzZ(zzzq4, f, f2)), i, (zzNX) null);
    }

    public final zzZL zzZ(zzZQ4 zzzq4, float f, float f2, int i, zzNX zznx) throws Exception {
        return zzZ(new zzZG(zz9K.zzY(zzzq4, f, f2)), i, zznx);
    }

    public final zzZL zzZ(zzZQ4 zzzq4, int i, zzNX zznx) throws Exception {
        return zzZ(new zzZG(zz9K.zzs(zzzq4)), i, zznx);
    }

    public final zzZL zzZ(long[] jArr, boolean z, int i, zzNX zznx) throws Exception {
        return zzZ(new zzZG(zz9K.zzY(jArr, z)), i, zznx);
    }

    public final zzZL zzZ(zzZQ4[] zzzq4Arr, int i, zzNX zznx) throws Exception {
        zzZG zzzg = new zzZG();
        for (zzZQ4 zzzq4 : zzzq4Arr) {
            zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzP5.zzK(zzzq4));
        }
        return zzZ(zzzg, i, zznx);
    }

    private zzZL zzZ(zzZG zzzg, int i, zzNX zznx) throws Exception {
        zzZ(zzzg, zznx);
        zzZ(zzzg, i);
        ArrayList<zzZG> arrayListZzYv = zz6J.zzZ(zzzg, new zz6I(zzzg.zzZ2() == null ? new zzPF() : zzzg.zzZ2().zzNO(), false, false, false)).zzYv();
        if (arrayListZzYv == null) {
            return zzzg;
        }
        if (arrayListZzYv.size() == 1) {
            return arrayListZzYv.get(0);
        }
        zzG zzg = new zzG();
        zzg.zzZ(arrayListZzYv);
        return zzg;
    }

    private static void zzZ(zzZG zzzg, zzNX zznx) {
        if (zznx == null) {
            zzzg.zzY((zzPY) null);
        } else {
            zzzg.zzY(zznx.zzMx());
        }
    }

    private void zzZ(zzZG zzzg, int i) {
        if (i == Integer.MAX_VALUE) {
            zzzg.zzX(null);
            return;
        }
        zzNC zzncZzXr = this.zzFz.zzKk().zzXr(i);
        zzzg.zzX(zzncZzXr.zzLs());
        if (!zzncZzXr.zzLr() || zzncZzXr.zzLq()) {
            return;
        }
        this.zzFz.zz1("EmfPlusPen object uses unsupported features.");
        zzncZzXr.zzLp();
    }

    public final zzG zzZ(String str, zzZQ4 zzzq4, int i, zzNX zznx, int i2) throws Exception {
        zzZQ4 zzzq42;
        zzNN zznnZzXo = this.zzFz.zzKk().zzXo(i2);
        if (zznnZzXo == null) {
            return null;
        }
        zzPM zzpmZzZ = zznnZzXo.zzZ(this.zzFz);
        zzN3 zzn3ZzXn = this.zzFz.zzKk().zzXn(i);
        if (zzn3ZzXn == null) {
            zzn3ZzXn = new zzN3();
        }
        zzN3 zzn3 = zzn3ZzXn;
        zzPY zzpyZzMx = zznx.zzMx();
        String strZz3 = zz3(str);
        zzNR zznr = new zzNR(strZz3, zzn3, zzpyZzMx, zzpmZzZ, zznnZzXo.zzM8(), zzn3.zzK6() || zzY9.zzK(strZz3));
        float height = Float.MAX_VALUE;
        float width = (zzn3.zzK4() || zzAN.zzf(zzzq4.getWidth())) ? Float.MAX_VALUE : zzzq4.getWidth();
        if (!zzn3.zzK4() && !zzAN.zzf(zzzq4.getHeight())) {
            height = zzzq4.getHeight();
        }
        long jZzG = zzZPW.zzG(width, height);
        if (zzn3.zzK5()) {
            jZzG = zzZPW.zzG(zzZPW.zzYz(jZzG), Float.intBitsToFloat((int) jZzG));
            zzzq42 = new zzZQ4(zzzq4.zzZE(), zzZPW.zzG(zzzq4.getHeight(), zzzq4.getWidth()));
        } else {
            zzzq42 = zzzq4;
        }
        zzYQ zzyq = new zzYQ();
        zzyq.zzZ(zznr, new zzNT(jZzG, zzzq42, zzn3, this.zzFz.zzKp().zzMk(), this.zzFz.zzMj()));
        zzG zzgZzYs = zzyq.zzYs();
        if (zzn3.zzK5()) {
            if (zzgZzYs.zzZO() == null) {
                OooO0O0.OooO00o(zzgZzYs);
            }
            zzgZzYs.zzZO().zzZ(90.0f, zzzq4.zzZE(), 0);
            zzgZzYs.zzZO().zzY(zzzq4.getWidth(), 0.0f, 1);
        }
        if (zzn3.zzK2() || zzzq4.isEmpty()) {
            return zzgZzYs;
        }
        zzG zzg = new zzG();
        zzg.zzZ(zzP8.zzM(zzzq4));
        zzg.zzX((zzZL) zzgZzYs);
        return zzg;
    }

    public final zzZL zzZ(int i, int i2, zzNX zznx) throws Exception {
        zzP8 zzp8ZzXq = this.zzFz.zzKk().zzXq(i);
        if (zzp8ZzXq == null) {
            return null;
        }
        return zzZ(new zzZG(zzp8ZzXq.zzO8()), i2, zznx);
    }

    public final zzZG zzZ(int i, zzNX zznx) throws Exception {
        zzON zzonZzXp = this.zzFz.zzKk().zzXp(i);
        if (zzonZzXp == null) {
            return null;
        }
        zzZG zzzg = new zzZG(zzZZN.zzU(zzonZzXp));
        zzZ(zzzg, zznx);
        return zzzg;
    }
}

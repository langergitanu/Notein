package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz5X {
    private zz6C zzll;

    public zz5X(zz6C zz6c) {
        this.zzll = zz6c;
    }

    private zz68 zzK(zzZU zzzu) throws Exception {
        zz68 zz68VarZzN = zzN(zzzu.zzZr());
        this.zzll.zzwM().zzY3(zz68VarZzN.zzwF());
        this.zzll.zzwM().zzK((byte) -88);
        this.zzll.zzwM().zzP((short) 590);
        this.zzll.zzwM().zzK((byte) -86);
        this.zzll.zzwM().zz9(zzzu.zzZr().zzPg());
        this.zzll.zzwM().zzK((byte) -90);
        this.zzll.zzwM().zzM((byte) 111);
        return zz68VarZzN;
    }

    private zz68 zzN(zzPM zzpm) {
        return this.zzll.zzwI().zzP(zzpm);
    }

    private static void zzZ(zzZU zzzu, short[] sArr, short[] sArr2) {
        Iterator<Integer> it = new zzZYE(zzzu.getText()).iterator();
        int i = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            sArr[i] = (iIntValue > 65535 || iIntValue < 0) ? (short) 0 : (short) iIntValue;
            sArr2[i] = zzZQB.zzRs(zzZQB.zzZk(zzzu.zzZr().zzY7(iIntValue)));
            i++;
        }
    }

    private void zzn(long j) throws Exception {
        this.zzll.zzwM().zzZb(j);
        this.zzll.zzwM().zzK((byte) 76);
        this.zzll.zzwM().zzM((byte) 107);
    }

    public final void zzL(zzZU zzzu) throws Exception {
        if (zzzu.zzZy().isEmpty() && zzzu.zzZq().isEmpty()) {
            return;
        }
        zzK(zzzu);
        int length = zzzu.getText().length();
        short[] sArr = new short[length];
        short[] sArr2 = new short[length];
        zzZ(zzzu, sArr, sArr2);
        boolean z = (zzzu.zzZO() == null || zzzu.zzZO().isIdentity()) ? false : true;
        if (!zzzu.zzZy().isEmpty()) {
            if (z) {
                zzZ(zzzu, sArr, sArr2, false, zzzu.zzZy());
            } else {
                zzZ(zzzu.zzZT(), sArr, sArr2, false, zzzu.zzZy());
                sArr = sArr;
                sArr2 = sArr2;
            }
        }
        if (zzzu.zzZq().isEmpty()) {
            return;
        }
        if (z) {
            zzZ(zzzu, sArr, sArr2, true, zzzu.zzZq());
        } else {
            zzZ(zzzu.zzZT(), sArr, sArr2, true, zzzu.zzZq());
        }
    }

    private void zzZ(long j, short[] sArr, short[] sArr2, boolean z, zzPV zzpv) throws Exception {
        this.zzll.zzwK().zzZ(zzpv, z);
        if (z) {
            this.zzll.zzwK().zzZL(false);
        }
        zzn(j);
        this.zzll.zzwM().zzZ(sArr);
        this.zzll.zzwM().zzK((byte) -85);
        if (sArr2 != null && sArr2.length > 0) {
            this.zzll.zzwM().zzZ(sArr2);
            this.zzll.zzwM().zzK((byte) -81);
        }
        if (!z) {
            this.zzll.zzwM().zzM((byte) -88);
            return;
        }
        this.zzll.zzwM().zzM((byte) -87);
        this.zzll.zzwM().zzM((byte) -124);
        this.zzll.zzwM().zzM((byte) -122);
    }

    private void zzZ(zzZU zzzu, short[] sArr, short[] sArr2, boolean z, zzPV zzpv) throws Exception {
        Iterator<Integer> it = new zzZYE(zzzu.getText()).iterator();
        int i = 0;
        float f = 0.0f;
        while (it.hasNext()) {
            it.next();
            f += i == 0 ? 0.0f : sArr2[i - 1] & 65535;
            zzZ(zzzu.zzZO().zzR(zzZPY.zzG(Float.intBitsToFloat((int) zzzu.zzZT()) + f, zzZPY.zzYC(zzzu.zzZT()))), new short[]{sArr[i]}, (short[]) null, z, zzpv);
            i++;
        }
    }
}

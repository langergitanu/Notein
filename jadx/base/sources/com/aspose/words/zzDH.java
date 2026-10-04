package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzDH implements Cloneable, Iterable<zzCF> {
    private zzCE zzZaA = null;
    private zzCE zzZaB;
    private double[] zzZaz;
    private String zzZyL;

    public zzDH(zzCE zzce) {
        this.zzZaB = zzce;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzRl(String str) {
        char cZzH5 = com.aspose.words.internal.zzJB.zzH5();
        String strZzX = com.aspose.words.internal.zzJB.zzX(0.3333333333333333d, str);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < strZzX.length(); i2++) {
            char cCharAt = strZzX.charAt(i2);
            if (cCharAt == '%') {
                i++;
            }
            if (Character.isDigit(cCharAt) || cCharAt == cZzH5) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        int length = i * 2;
        int iIndexOf = string.indexOf(cZzH5);
        if (iIndexOf > 0) {
            length += string.length() - (iIndexOf + 1);
        }
        return Math.min(length, 15);
    }

    private void zzRm(String str) {
        double d;
        this.zzZaz = new double[zzZN4().getValueCount()];
        zzFA[] zzfaArr = new zzFA[zzZN4().getValueCount()];
        zzFA[] zzfaArr2 = new zzFA[zzZN4().getValueCount()];
        double sum = getSum();
        int iZzRl = zzRl(str);
        double d2 = 0.0d;
        double dAbs = 0.0d;
        int i = 0;
        while (true) {
            if (i >= zzZN4().getValueCount()) {
                break;
            }
            zzCF zzcfZzL0 = zzL0(i);
            double value = zzCF.zzR(zzcfZzL0) ? d2 : zzcfZzL0.getValue() * (com.aspose.words.internal.zzAN.zzL(1.0d, sum) ? 1.0d : 1.0d / sum);
            this.zzZaz[i] = value;
            double dZzR = com.aspose.words.internal.zzZKQ.zzR(value, iZzRl);
            double d3 = dZzR - value;
            dAbs += Math.abs(dZzR);
            if (com.aspose.words.internal.zzAN.zzZD(d3)) {
                d = d2;
            } else {
                d = d2;
                (d3 > d2 ? zzfaArr : zzfaArr2)[i] = new zzFA(i, com.aspose.words.internal.zzQO.zzZ(Math.abs(d3), 15));
            }
            i++;
            d2 = d;
        }
        double d4 = d2;
        double d5 = 1.0d - dAbs;
        double dAbs2 = Math.abs(d5);
        if (com.aspose.words.internal.zzAN.zzZD(d5)) {
            return;
        }
        double d6 = 100.0d * dAbs2;
        if (d6 < 1.0d || !zzEW.zzRq(str)) {
            return;
        }
        double dPow = (d5 / dAbs2) * (1.0d / Math.pow(10.0d, iZzRl));
        if (dPow > d4) {
            zzfaArr = zzfaArr2;
        }
        int iZzZ = zzZ(zzfaArr);
        com.aspose.words.internal.zzZKV.sort(zzfaArr, iZzZ, zzfaArr.length - iZzZ);
        int iRound = (int) Math.round(d6);
        int i2 = 0;
        while (i2 < iRound) {
            i2++;
            zzFA zzfa = zzfaArr[zzfaArr.length - i2];
            double[] dArr = this.zzZaz;
            int index = zzfa.getIndex();
            dArr[index] = dArr[index] + dPow;
        }
    }

    private String zzS(double d, String str) {
        if (d < 0.0d) {
            return "";
        }
        boolean zZzRr = zzEW.zzRr(str);
        com.aspose.words.internal.zzZQ9 zzzq9ZzY3 = zzCG.zzY3(d);
        long jZzZIk = zZzRr ? 0L : zzZIk();
        if (jZzZIk != 0) {
            zzzq9ZzY3 = new com.aspose.words.internal.zzZQ9(zzw(zzzq9ZzY3.zzkP(), jZzZIk) * jZzZIk);
        }
        return zzDG.zzY(zzzq9ZzY3, str);
    }

    public static zzCF zzY(zzCE zzce, int i) {
        if (zzce == null) {
            return new zzD4(i, Integer.toString(i + 1));
        }
        zzCF zzcfZzKg = zzce.zzKg(i);
        return (zzcfZzKg == null && (zzce.getValueType() == 1 || zzce.getValueType() == 3)) ? new zzFA(i, i + 1) : zzcfZzKg;
    }

    private static boolean zzYf(double d) {
        return d >= 0.0d && d < 2958466.0d;
    }

    private void zzZ(zzCE zzce, String str, boolean z) {
        zzCE zzce2 = new zzCE(1);
        Iterator<zzCF> it = zzce.iterator();
        while (it.hasNext()) {
            zzE7 zze7 = (zzE7) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzE7.class);
            if (zze7 != null) {
                zzce2.zzP(zzZ(zze7, str, z));
            }
        }
        this.zzZaA = zzce2;
    }

    private void zzZIi() {
        if (this.zzZaA == null) {
            this.zzZaA = this.zzZaB.zzZGc();
        }
    }

    private long zzZIj() {
        double dMin = Double.MAX_VALUE;
        double dMax = -1.7976931348623157E308d;
        for (zzCF zzcf : zzZN4()) {
            if (!Double.isNaN(zzcf.getValue())) {
                dMin = Math.min(dMin, zzcf.getValue());
                dMax = Math.max(dMax, zzcf.getValue());
            }
        }
        double dZz2w = (dMax - dMin) / ((double) (zzZN4().zz2w() + 1));
        return com.aspose.words.internal.zzZQ9.zzU(com.aspose.words.internal.zzZQ9.zzZg(dZz2w), com.aspose.words.internal.zzZQ9.zzZg(0.0d)).zzkP();
    }

    private long zzZIk() {
        long jZzZIj = zzZIj();
        if (zzw(jZzZIj, 864000000000L) > 0) {
            return 864000000000L;
        }
        if (zzw(jZzZIj, 36000000000L) > 0) {
            return 36000000000L;
        }
        if (zzw(jZzZIj, 600000000L) > 0) {
            return 600000000L;
        }
        if (zzw(jZzZIj, 10000000L) > 0) {
            return 10000000L;
        }
        return jZzZIj;
    }

    private int zzZIl() {
        for (int i = 0; i <= zzZN4().zz2w(); i++) {
            if (!zzCF.zzR(zzZN4().zzKg(i))) {
                return i;
            }
        }
        return -1;
    }

    private void zzZIm() {
        zzZIi();
        zzZN4().zzZIm();
    }

    private zzCF zzZIn() {
        int iZzZIl = zzZIl();
        if (iZzZIl < 0) {
            return null;
        }
        return zzZN4().zzKg(iZzZIl);
    }

    private zzCE zzZN4() {
        zzCE zzce = this.zzZaA;
        return zzce != null ? zzce : this.zzZaB;
    }

    private static long zzw(long j, long j2) {
        return (((j2 / 2) + j) + 1) / j2;
    }

    public final String getFormatCode() {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZyL)) {
            this.zzZyL = zzEW.zzRt(this.zzZaB.getFormatCode());
        }
        return this.zzZyL;
    }

    public final double getSum() {
        double dAbs = 0.0d;
        for (zzCF zzcf : zzZN4()) {
            dAbs += Math.abs(zzCF.zzR(zzcf) ? 0.0d : zzcf.getValue());
        }
        return dAbs;
    }

    public final int getValueCount() {
        return zzZN4().getValueCount();
    }

    public final int getValueType() {
        return zzZN4().getValueType();
    }

    public final boolean isDate() {
        zzCF zzcfZzZIn = zzZIn();
        return zzcfZzZIn != null && zzcfZzZIn.isDate();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzCF> iterator() {
        return zzZN4().iterator();
    }

    public final int zz2w() {
        return zzZN4().zz2w();
    }

    public final void zzC(String str, boolean z) {
        if (zzZN4().getValueType() != 2) {
            return;
        }
        zzZ(zzZN4(), str, z);
    }

    public final double zzF(int i, String str) {
        if (this.zzZaz == null) {
            zzRm(str);
        }
        double[] dArr = this.zzZaz;
        if (i >= dArr.length) {
            return 0.0d;
        }
        return dArr[i];
    }

    public final zzCF zzKv(int i) {
        return zzY(this.zzZaB, i);
    }

    public final void zzKw(int i) {
        if (isDate() || zzZN4().zzZIg()) {
            return;
        }
        zzNy(Math.max(i, 1));
        zzZIm();
    }

    public final zzCF zzL0(int i) {
        return zzY(zzZN4(), i);
    }

    public final void zzNy(int i) {
        zzZIi();
        zzZN4().zzNy(i);
    }

    public final void zzU(zzCF zzcf) {
        zzZIi();
        zzZN4().zzP(zzcf);
    }

    public final boolean zzZIg() {
        return zzZN4().zzZIg();
    }

    public final int zzZIh() {
        return zzZN4().zzZIh();
    }

    public final zzCF[] zzZIo() {
        zzCF[] zzcfArr = new zzCF[zzZN4().getValueCount()];
        int i = 0;
        for (int i2 = 0; i2 < zzZN4().getValueCount(); i2++) {
            zzCF zzcfZzL0 = zzL0(i2);
            if (zzcfZzL0 != null) {
                zzcfArr[i] = zzcfZzL0;
                i++;
            }
        }
        zzCF[] zzcfArr2 = new zzCF[i];
        System.arraycopy(zzcfArr, 0, zzcfArr2, 0, i);
        return zzcfArr2;
    }

    public final zzDH zzZIp() {
        return zzU(this.zzZaB.zzZGc());
    }

    public final zzDH zzU(zzCE zzce) {
        zzDH zzdh = (zzDH) memberwiseClone();
        zzdh.zzZaB = zzce;
        zzCE zzce2 = this.zzZaA;
        if (zzce2 != null) {
            zzdh.zzZaA = zzce2.zzZGc();
        }
        return zzdh;
    }

    private zzD4 zzZ(zzE7 zze7, String str, boolean z) {
        String stringValue;
        String strZzZ = zzEW.zzZ(str, z, zze7.getFormatCode(), this.zzZyL);
        if (zzYf(zze7.getValue()) && ((zze7.isDate() || zzEW.zzRs(strZzZ)) && !zzEW.zzRu(strZzZ) && zze7.getValueType() != 0 && !Double.isNaN(zze7.getValue()))) {
            stringValue = zzS(zze7.getValue(), strZzZ);
        } else if (!zzEW.zzRu(strZzZ) && !Double.isNaN(zze7.getValue())) {
            stringValue = com.aspose.words.internal.zzJB.zzX(zze7.getValue(), strZzZ);
        } else {
            stringValue = zze7.getStringValue();
        }
        return new zzD4(zze7.getIndex(), stringValue);
    }

    private static int zzZ(zzFA[] zzfaArr) {
        int i = 0;
        for (int i2 = 0; i2 < zzfaArr.length; i2++) {
            if (zzfaArr[i2] == null) {
                zzfaArr[i2] = zzfaArr[i];
                zzfaArr[i] = null;
                i++;
            }
        }
        return i;
    }
}

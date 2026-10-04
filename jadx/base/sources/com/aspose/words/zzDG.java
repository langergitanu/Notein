package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzDG {
    static com.aspose.words.internal.zzZNR zzZay = new com.aspose.words.internal.zzZNR("\\s");
    private static com.aspose.words.internal.zzZNR zzZax = new com.aspose.words.internal.zzZNR("_x\\w{4}_");
    private static com.aspose.words.internal.zzZNR zzZaw = new com.aspose.words.internal.zzZNR("0,+");
    private static com.aspose.words.internal.zzZNR zzZav = new com.aspose.words.internal.zzZNR("[\\-]");
    private static com.aspose.words.internal.zzZNR zzZau = new com.aspose.words.internal.zzZNR("MMMMM");

    private static String zz1(String str, int i) {
        return com.aspose.words.internal.zzZKN.format("{0}...", str.substring(0, i));
    }

    private static String zz2(String str, int i) {
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            return str;
        }
        String strZzRj = zzRj(str);
        float f = i;
        if (com.aspose.words.internal.zzAN.zzR(f, 0.0f) || com.aspose.words.internal.zzAN.zzR(strZzRj.length(), f)) {
            return strZzRj;
        }
        String[] strArrZzUY = zzZay.zzUY(strZzRj);
        int iMax = 0;
        for (String str2 : strArrZzUY) {
            iMax = Math.max(iMax, str2.length());
        }
        return iMax < i ? strZzRj : zz1(strZzRj, Math.min(Math.min(i, iMax), strArrZzUY[0].length()));
    }

    private static boolean zzA(com.aspose.words.internal.zzZG zzzg) {
        if (zzzg.zzZ2() == null || !zzP(zzzg.zzZ2().zzZ1())) {
            return zzP(zzzg.zzZ1());
        }
        return true;
    }

    public static void zzB(com.aspose.words.internal.zzZG zzzg) {
        if (zzzg.zzZ2() == null || !zzzg.zzZ2().zzZ1().isEmpty() || zzzg.zzZ1() == null) {
            return;
        }
        zzzg.zzZ2().zzY(zzzg.zzZ1());
        zzzg.zzZ2().zzXW(1);
    }

    private static boolean zzH(com.aspose.words.internal.zzOU zzou) {
        return zzou != null && zzO(zzou.zzZ1());
    }

    public static zzCM zzM(Iterable<String> iterable) {
        zzCM zzcmZzZIf = zzZIf();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            zzZ(zzcmZzZIf, it.next());
        }
        return zzcmZzZIf;
    }

    public static double[] zzN(zzGK zzgk) {
        int i;
        int iZzZPb = zzgk.zzZPb();
        double[] dArr = new double[iZzZPb];
        Iterator<ChartSeries> it = zzgk.zzZPj().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ChartSeries next = it.next();
            while (i < iZzZPb) {
                zzCF zzcfZzKv = next.zz2y().zzZMv().zzKv(i);
                dArr[i] = Math.abs(zzCF.zzR(zzcfZzKv) ? 0.0d : zzcfZzKv.getValue()) + dArr[i];
                i++;
            }
        }
        while (i < iZzZPb) {
            if (com.aspose.words.internal.zzAN.zzZD(dArr[i])) {
                dArr[i] = 1.0d;
            }
            i++;
        }
        return dArr;
    }

    private static boolean zzO(zzGK zzgk) {
        if (zzgk == null) {
            return false;
        }
        if (zzgk.zzZP3() || zzgk.zzZQO() == 0 || zzgk.zzZP9()) {
            return true;
        }
        return zzgk.zzZPa() && ((zz3B) com.aspose.words.internal.zzZKW.zzZ(zzgk, zz3B.class)).zzZwf() == 0;
    }

    private static boolean zzP(com.aspose.words.internal.zzPY zzpy) {
        if (zzpy == null) {
            return true;
        }
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 0) {
            return ((com.aspose.words.internal.zzOI) zzpy).zzZy().zzPD() < 255;
        }
        if (iZzPH != 3 && iZzPH != 4 && iZzPH != 5) {
            return false;
        }
        for (com.aspose.words.internal.zzPI zzpi : ((com.aspose.words.internal.zzPL) zzpy).zzOP()) {
            if (zzpi.zzZy().zzPD() < 255) {
                return true;
            }
        }
        return false;
    }

    private static void zzR(com.aspose.words.internal.zzPY zzpy, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (zzpy == null || zzpy.zzPH() != 2) {
            return;
        }
        ((com.aspose.words.internal.zzOH) zzpy).zzNb().zzY(zzzq4.getX(), zzzq4.getY(), 1);
    }

    public static String zzRi(String str) {
        return zzZav.zzZS(str, "- ");
    }

    private static String zzRj(String str) {
        if (!zzZax.zzUV(str)) {
            return str;
        }
        for (com.aspose.words.internal.zzZNT zzznt : zzZax.zzUW(str)) {
            str = com.aspose.words.internal.zzZNR.zzN(str, zzznt.getValue(), com.aspose.words.internal.zzZVS.zzS7(com.aspose.words.internal.zzZQB.zzVU("0" + zzznt.getValue().substring(1, zzznt.getValue().length() - 1))));
        }
        return str;
    }

    public static zzCM zzRk(String str) {
        zzCM zzcmZzZIf = zzZIf();
        for (String str2 : com.aspose.words.internal.zzZKN.zzZ(str, new String[]{ControlChar.CR_LF}, com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd)) {
            zzZ(zzcmZzZIf, str2);
        }
        return zzcmZzZIf;
    }

    public static float zzS(zzCL zzcl, zzDI zzdi) throws Exception {
        return zzT(zzcl, zzdi).getLineSpacingPoints();
    }

    public static com.aspose.words.internal.zzPM zzT(zzCL zzcl, zzDI zzdi) throws Exception {
        return zzZ(zzcl, zzdi.zzZIC().zzZMQ().zzZM7(), zzdi);
    }

    public static float zzU(zzCL zzcl, zzDI zzdi) throws Exception {
        return zzT(zzcl, zzdi).zzPf();
    }

    public static float zzV(zzCL zzcl, zzDI zzdi) throws Exception {
        return zzT(zzcl, zzdi).getDescentPoints();
    }

    public static float zzW(zzCL zzcl, zzDI zzdi) throws Exception {
        return zzT(zzcl, zzdi).getAscentPoints();
    }

    public static float zzX(zzCL zzcl, zzDI zzdi) throws Exception {
        return zzT(zzcl, zzdi).zzPg();
    }

    public static float zzY(String str, zzCL zzcl, zzDI zzdi) throws Exception {
        return zzZ(str, zzcl, zzdi) + 91440.0f + 91440.0f;
    }

    public static double zzYc(double d) {
        return Math.floor(d / 635.0d) * 635.0d;
    }

    public static boolean zzYd(double d) {
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(d);
        return com.aspose.words.internal.zzAN.zzL(dZzZJ, 90.0d) || com.aspose.words.internal.zzAN.zzL(dZzZJ, 270.0d);
    }

    public static String zzYe(double d) {
        return ((Math.abs(d) < 1.0E-7d || Math.abs(d) > 9.9999999999E8d) && !com.aspose.words.internal.zzAN.zzZD(d)) ? com.aspose.words.internal.zzJB.zzZV(d) : com.aspose.words.internal.zzJB.zzZT(d);
    }

    public static float zzZ(String str, zzCL zzcl, zzDI zzdi) throws Exception {
        return zzT(zzcl, zzdi).zz7(str);
    }

    public static zzCM zzZIf() {
        zzCM zzcm = new zzCM();
        zzcm.zzY(new zz11());
        return zzcm;
    }

    public static int zzt(float f, float f2) {
        if (com.aspose.words.internal.zzAN.zzP(f, f2)) {
            return 1;
        }
        return (int) ((f2 / f) + 1.0f);
    }

    public static boolean zzz(com.aspose.words.internal.zzZG zzzg) {
        return zzO(zzzg.zzZ1()) || zzH(zzzg.zzZ2());
    }

    private static String[] zzH(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = com.aspose.words.internal.zzZKN.zzU3(strArr[i]) ? strArr[i] : strArr[i].substring(0, 1);
        }
        return strArr2;
    }

    public static String zzY(com.aspose.words.internal.zzZQ9 zzzq9, String str) {
        com.aspose.words.internal.zzZP1 zzzp1ZzVq = zzEW.zzVq(str);
        String strZzRx = zzEW.zzRx(zzEW.zzRv(str));
        if (zzZau.zzUV(strZzRx)) {
            zzzp1ZzVq = (com.aspose.words.internal.zzZP1) com.aspose.words.internal.zzZKW.zzZ(zzzp1ZzVq.zzj4(), com.aspose.words.internal.zzZP1.class);
            String[] strArrZzH = zzH(zzzp1ZzVq.zzjc().getAbbreviatedMonthNames());
            com.aspose.words.internal.zzZP0 zzzp0 = new com.aspose.words.internal.zzZP0();
            zzzp0.setAbbreviatedMonthNames(strArrZzH);
            zzzp1ZzVq.zzV(zzzp0);
            strZzRx = zzZau.zzZS(strZzRx, "MMM");
        }
        return zzzq9.zzY(strZzRx, zzzp1ZzVq);
    }

    public static com.aspose.words.internal.zzZQ9 zzV(com.aspose.words.internal.zzZQ9 zzzq9, int i) {
        if (i != 2) {
            return i != 3 ? zzzq9 : new com.aspose.words.internal.zzZQ9(zzzq9.getYear(), 1, 1);
        }
        return zzzq9.zzZj((-zzzq9.getDay()) + 1);
    }

    private static String zzX(double d, String str, com.aspose.words.internal.zzZP1 zzzp1) {
        if (com.aspose.words.internal.zzZYD.zzXk(zzZaw.zzUX(str).getValue())) {
            d /= Math.pow(1000.0d, com.aspose.words.internal.zzZKN.zzR(r0.getValue(), ',').length - 1);
        }
        String strZzZS = zzZaw.zzZS(str, "0");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZS) && zzEW.zzRu(strZzZS)) {
            return zzYe(d);
        }
        return com.aspose.words.internal.zzZKN.zzU3(strZzZS) ? "" : com.aspose.words.internal.zzJB.zzZ(d, strZzZS, zzzp1);
    }

    private static com.aspose.words.internal.zzPM zzZ(zzCL zzcl, zz30 zz30Var, zzDI zzdi) throws Exception {
        zzcl.zzZHj().zzU(zz30Var);
        return zzdi.zzZIA().zzS(zzcl.zzZHj());
    }

    private static int zzM(zzGK zzgk) {
        int iZzZIT = zzgk.zzZPg().zzZIT();
        if (zzgk.zzZQO() == 11 && iZzZIT == 0) {
            return zzgk.zzZPj().getCount();
        }
        boolean z = false;
        boolean z2 = (zzgk.zzZQO() == 11 && iZzZIT == 3) | (zzgk.zzZQO() == 3);
        if (zzgk.zzZQO() == 1 && !zzgk.zzZQj()) {
            z = true;
        }
        return z2 | z ? 2 : 1;
    }

    public static String zzR(double d, String str) {
        com.aspose.words.internal.zzZP1 zzzp1ZzVq = zzEW.zzVq(str);
        String strZzRw = zzEW.zzRw(str);
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(strZzRw, ';');
        if (d > 0.0d) {
            strZzRw = strArrZzR[0];
        } else if (d < 0.0d) {
            if (strArrZzR.length > 1) {
                strZzRw = strArrZzR[1];
            }
        } else if (strArrZzR.length > 2) {
            strZzRw = strArrZzR[2];
        }
        String strZzRt = zzEW.zzRt(strZzRw);
        if (d < 0.0d && strArrZzR.length > 1 && !zzEW.zzRu(strZzRt)) {
            d = Math.abs(d);
        }
        return zzX(d, strZzRt, zzzp1ZzVq);
    }

    private static boolean zzO(com.aspose.words.internal.zzPY zzpy) {
        return (zzpy == null || zzpy.isEmpty()) ? false : true;
    }

    public static float zzZ(zz30 zz30Var, zzDI zzdi) {
        try {
            return zzdi.zzZIA().zzS(zz30Var).getLineSpacingPoints();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static com.aspose.words.internal.zzOU zzZ(zzD9 zzd9, zzFI zzfi, int i) throws Exception {
        return zzZ(zzd9.getOutline(), zzfi, i, false);
    }

    public static com.aspose.words.internal.zzOU zzZ(zz4G zz4g, zzFI zzfi, int i) throws Exception {
        return zzZ(zz4g, zzfi, i, false);
    }

    private static com.aspose.words.internal.zzOU zzZ(zz4G zz4g, zzFI zzfi, int i, boolean z) throws Exception {
        com.aspose.words.internal.zzOU zzouZzLe;
        if (zz4g != null && zz4g.zzZxz() > 0) {
            zz4G zz4gZzZxK = zz4g.zzZxK();
            zzfi.zzZ(zz4gZzZxK, i);
            zzfi.zzZMW().zzZ(null);
            zzouZzLe = zz4gZzZxK.zzZ(zzfi.zzZMW(), z);
        } else {
            zzouZzLe = zzfi.zzLe(i);
        }
        return zzouZzLe == null ? new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzHZ, 0.0f) : zzouZzLe;
    }

    public static float zzX(String str, zzCL zzcl, zzDI zzdi) throws Exception {
        return zzZ(str, zzcl, zzdi, zzZay);
    }

    public static String zzY(zzCF zzcf, int i) {
        if (!zzCF.zzQ(zzcf) && !com.aspose.words.internal.zzZKN.zzU3(zzcf.getStringValue())) {
            return zz2(zzcf.getStringValue(), i);
        }
        return "";
    }

    public static long zzY(long j, long j2, double d) {
        int i = (int) j;
        int i2 = (int) j2;
        if (com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))) {
            return com.aspose.words.internal.zzZPY.zzG((float) d, (com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(j)) + com.aspose.words.internal.zzZPY.zzYC(j));
        }
        return com.aspose.words.internal.zzZPY.zzG((float) d, (float) (((d - ((double) Float.intBitsToFloat(i))) * ((double) ((com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(j)) / (Float.intBitsToFloat(i2) - Float.intBitsToFloat(i))))) + ((double) com.aspose.words.internal.zzZPY.zzYC(j))));
    }

    public static com.aspose.words.internal.zzPY zzZ(zzD9 zzd9, zzFI zzfi, int i, com.aspose.words.internal.zzZL zzzl) throws Exception {
        return zzZ(zzd9.getFill(), zzfi, i, zzzl);
    }

    private static com.aspose.words.internal.zzPY zzZ(zz7X zz7x, zzFI zzfi, int i, com.aspose.words.internal.zzZL zzzl) throws Exception {
        com.aspose.words.internal.zzPY zzpyZzY = zzfi.zzY(i, zzzl);
        if (zz7x.zzZQ4() != 6) {
            zzfi.zzZMW().zzZ(null);
            zzpyZzY = zz7x.zzZ(zzfi.zzZMW());
        }
        zzR(zzpyZzY, zzfi.zzZMW().zzZPK());
        return zzpyZzY;
    }

    public static void zzZ(com.aspose.words.internal.zzZG zzzg, ChartDataPoint chartDataPoint, zzFI zzfi, int i) throws Exception {
        zzzg.zzY(zzZ(zzZ(chartDataPoint.zzaQ().getFill(), chartDataPoint.zz3e()), zzfi, i, zzzg));
        zz4G outline = chartDataPoint.zzaQ().getOutline();
        if (chartDataPoint.zz3I().zzZQO() == 8) {
            zz4G zz4gZzZxK = chartDataPoint.zzaQ().getOutline().zzZxK();
            zz4gZzZxK.setWeight(zz4gZzZxK.getWeight() * (chartDataPoint.getExplosion() == 0 ? 0.3499999940395355d : Math.exp(((double) chartDataPoint.getExplosion()) * (-0.004d)) * 0.366100013256073d));
            zzzg.zzX(zzZ(zz4gZzZxK, zzfi, i, true));
            return;
        }
        zzzg.zzX(zzZ(outline, chartDataPoint.zz3I(), zzfi, i));
    }

    public static com.aspose.words.internal.zzOU zzZ(zz4G zz4g, zzGK zzgk, zzFI zzfi, int i) throws Exception {
        boolean zZzLh = zz4g.zzLh(3);
        if (!zZzLh && !zzO(zzgk)) {
            zz4g.setEndCap(0);
        }
        com.aspose.words.internal.zzOU zzouZzZ = zzZ(zz4g, zzfi, i, false);
        if (!zZzLh) {
            zz4g.zzZxJ();
        }
        return zzouZzZ;
    }

    public static void zzZ(com.aspose.words.internal.zzZG zzzg, zzD9 zzd9, zzE3 zze3, zzFI zzfi, int i) throws Exception {
        zzzg.zzY(zzZ(zzZ(zzd9.getFill(), zze3), zzfi, i, zzzg));
        zzzg.zzX(zzZ(zzd9.getOutline(), zzfi, i, false));
    }

    public static void zzZ(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzG zzg, ChartDataPoint chartDataPoint, zzFI zzfi, int i) throws Exception {
        zzZ(zzzg, chartDataPoint, zzfi, i);
        zzZ(zzzg, zzg, chartDataPoint.zzaQ(), zzfi);
    }

    public static void zzZ(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzG zzg, zzD9 zzd9, zzFI zzfi) throws Exception {
        zz2C zz2cZzZ = zzZ(zzd9, zzfi);
        if (zz2cZzZ != null && zz2cZzZ.getCount() != 0) {
            zz2B.zzZ(zz2cZzZ, zzzg, zzg, zzfi.zz43().zzZIB(), zzA(zzzg));
        } else {
            zzg.zzX(zzzg);
        }
    }

    private static zz2C zzZ(zzD9 zzd9, zzFI zzfi) throws Exception {
        zz2C zz2cZzZTe = zzd9.zzZTe();
        return (zz2cZzZTe == null || zz2cZzZTe.getCount() == 0) ? zzfi.zzZMX() != null ? zzfi.zzZMX().zzZTe() : null : zz2cZzZTe;
    }

    private static zz7X zzZ(zz7X zz7x, zzE3 zze3) {
        zzH0 zzh0;
        if (zze3 == null || (zzh0 = (zzH0) com.aspose.words.internal.zzZKW.zzZ(zz7x.zzZQ6(), zzH0.class)) == null) {
            return zz7x;
        }
        int pictureFormat = zze3.getPictureFormat();
        if (pictureFormat != 0 && pictureFormat != 1) {
            zzh0.zzZ(new zzGZ());
            return zzh0;
        }
        zzh0.zzZ(new zzGY());
        return zzh0;
    }

    public static ArrayList<long[]> zzZ(long[] jArr, int[] iArr) {
        if (iArr.length % 2 <= 0) {
            ArrayList<long[]> arrayList = new ArrayList<>();
            for (int i = 0; i < iArr.length; i += 2) {
                int i2 = iArr[i];
                int i3 = iArr[i + 1];
                long[] jArr2 = new long[i3];
                com.aspose.words.internal.zzZKV.zzZ(jArr, i2, jArr2, 0, i3);
                com.aspose.words.internal.zzZQG.zzZ(arrayList, jArr2);
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Length of segment indexes array must be even.");
    }

    public static int zzZ(float f, zzCL zzcl, zzDI zzdi) throws Exception {
        return zzt(f, zzT(zzcl, zzdi).getAscentPoints());
    }

    public static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzEH zzeh, zzDI zzdi) {
        if (zzeh == null || zzeh.isEmpty()) {
            return zzzq4;
        }
        float fIntBitsToFloat = (float) (((double) Float.intBitsToFloat((int) zzdi.zzZIz())) * (zzeh.zzZLl() ? zzeh.getLeft() : 0.0d));
        float fZzYz = (float) (((double) com.aspose.words.internal.zzZPW.zzYz(zzdi.zzZIz())) * (zzeh.zzZLk() ? zzeh.getTop() : 0.0d));
        float fIntBitsToFloat2 = (float) (((double) Float.intBitsToFloat((int) zzdi.zzZIz())) * (zzeh.zzZLj() ? zzeh.getWidth() : 0.0d));
        float fZzYz2 = (float) (((double) com.aspose.words.internal.zzZPW.zzYz(zzdi.zzZIz())) * (zzeh.zzZLi() ? zzeh.getHeight() : 0.0d));
        if (zzeh.zzZLo() == 0) {
            fIntBitsToFloat2 -= fIntBitsToFloat;
        }
        if (zzeh.zzZLq() == 0) {
            fZzYz2 -= fZzYz;
        }
        if (com.aspose.words.internal.zzAN.zzR(fIntBitsToFloat2, 0.0f)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) zzdi.zzZIz()) - fIntBitsToFloat;
        }
        if (com.aspose.words.internal.zzAN.zzR(fZzYz2, 0.0f)) {
            fZzYz2 = com.aspose.words.internal.zzZPW.zzYz(zzdi.zzZIz()) - fZzYz;
        }
        return new com.aspose.words.internal.zzZQ4(fIntBitsToFloat, fZzYz, fIntBitsToFloat2, fZzYz2);
    }

    public static void zzZ(zzCM zzcm, String str) {
        zzZ(zzcm, new String[]{str}, new double[1]);
    }

    public static void zzZ(zzCM zzcm, String[] strArr, double[] dArr) {
        zz4A zz4a = new zz4A();
        zzcm.zzZGw().zzY(zz4a);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (!com.aspose.words.internal.zzZKN.zzU3(str)) {
                zz31 zz31Var = new zz31();
                zz31Var.setText(zzRj(str));
                if (i < dArr.length && !Double.isNaN(dArr[i])) {
                    zz31Var.zzZx5().zzXu(dArr[i]);
                }
                zz4a.zzY(zz31Var);
            }
        }
    }

    public static zzCK zzZ(String str, float f, zzCK zzck, zzCV zzcv, zzDI zzdi) throws Exception {
        int length = str.length();
        while (com.aspose.words.internal.zzAN.zzR(f, zzck.zzZGm().getHeight()) && length > 1) {
            int iLastIndexOf = str.lastIndexOf(32);
            length = iLastIndexOf > 0 ? iLastIndexOf : length - 1;
            str = zz1(str, length);
            zzck = zzCK.zzZ(zzRk(str), zzcv, zzdi, false);
        }
        return zzck;
    }

    public static float zzZ(String str, zzCL zzcl, zzDI zzdi, com.aspose.words.internal.zzZNR zzznr) throws Exception {
        float fMax = 0.0f;
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            return 0.0f;
        }
        for (String str2 : zzznr.zzUY(str)) {
            fMax = Math.max(fMax, zzY(str2, zzcl, zzdi));
        }
        return fMax;
    }

    public static float zzZ(zzGK zzgk, float f, int i) {
        if (!zzgk.zz3R()) {
            return 0.0f;
        }
        return ((((Integer) zzgk.zzZPg().zzLv(10)).intValue() / 100.0f) + 1.0f) * (i / 100.0f) * (f / ((((Integer) zzgk.zzZPg().zzLv(11)).intValue() / 100.0f) + zzM(zzgk)));
    }

    public static void zzZ(long[] jArr, int i, zzDI zzdi, ChartSeries chartSeries, boolean z, boolean z2, boolean z3) throws Exception {
        long[] jArr2;
        zzDI zzdi2;
        ChartSeries chartSeries2;
        zzdi.zzW(zzdi.zzKy(16));
        if (z3) {
            jArr2 = jArr;
            zzdi2 = zzdi;
            chartSeries2 = chartSeries;
            zz5W.zzZ(jArr2, true, zzdi2, chartSeries2, z, chartSeries.getSmooth());
        } else {
            jArr2 = jArr;
            zzdi2 = zzdi;
            chartSeries2 = chartSeries;
        }
        if (z2) {
            zzZ(jArr2, i, zzdi2, chartSeries2);
        }
        zzdi2.zzZI();
    }

    public static void zzZ(ArrayList<long[]> arrayList, zzDI zzdi, ChartSeries chartSeries, boolean z, boolean z2, boolean z3) throws Exception {
        int length = 0;
        for (long[] jArr : arrayList) {
            zzDI zzdi2 = zzdi;
            zzZ(jArr, length, zzdi2, chartSeries, z, z2, z3);
            length += jArr.length;
            zzdi = zzdi2;
        }
    }

    private static void zzZ(long[] jArr, int i, zzDI zzdi, ChartSeries chartSeries) throws Exception {
        zzDI zzdi2;
        com.aspose.words.internal.zz7 zz7VarZzZ = zzZ(zzdi, chartSeries);
        int i2 = 0;
        while (i2 < jArr.length) {
            int i3 = i + i2;
            zzCF zzcfZzL0 = chartSeries.zz2y().zzL0(i3);
            if (zzCF.zzR(zzcfZzL0) || zzcfZzL0.isVisible()) {
                zzdi2 = zzdi;
                zzEE.zzZ(jArr[i2], chartSeries.zzNM(i3).getMarker(), chartSeries.getIndex(), zzdi2, zz7VarZzZ);
            } else {
                zzdi2 = zzdi;
            }
            i2++;
            zzdi = zzdi2;
        }
    }

    public static com.aspose.words.internal.zz7 zzZ(zzDI zzdi, ChartSeries chartSeries) {
        zzD9 zzd9 = (zzD9) chartSeries.zz2H().zz3d().zzLv(5);
        if (chartSeries.zz3I().zzZQO() != 6 && zzd9 != null && !zzd9.isEmpty() && (zzd9.getOutline() == null || zzd9.getOutline().getFill() == null || zzd9.getOutline().getFill().zzZQ4() == 3)) {
            return zzdi.zzKy(20);
        }
        return zzdi.zzsD();
    }

    public static boolean zzZ(ChartAxis chartAxis, double d) {
        if (chartAxis.zz3K()) {
            return d < 0.0d || com.aspose.words.internal.zzAN.zzZD(d);
        }
        return false;
    }
}

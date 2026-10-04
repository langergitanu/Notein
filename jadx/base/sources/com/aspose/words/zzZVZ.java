package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefDouble;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZVZ extends zzTL {
    private static String[] zzYN0 = {"$", "€", "¥", "£", "CHF", "C$", "kr", "HK$", "р", "₽"};
    private double zzE0;
    private boolean zzYN1;
    private int zzYN2;
    private boolean zzYN3;
    private boolean zzYN4;
    private boolean zzYN5;

    public zzZVZ(double d) {
        this.zzE0 = d;
        String strZzZZ = com.aspose.words.internal.zzJB.zzZZ(d);
        int iIndexOf = strZzZZ.indexOf(46);
        this.zzYN2 = iIndexOf != -1 ? strZzZZ.substring(iIndexOf + 1).length() : 0;
    }

    private static int zzMG(String str) {
        if (str.indexOf(com.aspose.words.internal.zzJB.zzH5()) == -1) {
            return 0;
        }
        return (str.length() - r0) - 1;
    }

    private static boolean zzMH(String str) {
        int iZzH3 = com.aspose.words.internal.zzJB.zzH3();
        if (iZzH3 == 0) {
            return true;
        }
        char cZzH4 = com.aspose.words.internal.zzJB.zzH4();
        char cZzH5 = com.aspose.words.internal.zzJB.zzH5();
        int iIndexOf = str.indexOf(cZzH4);
        if (iIndexOf == -1) {
            return true;
        }
        while (true) {
            int iIndexOf2 = str.indexOf(cZzH4, iIndexOf + 1);
            if (iIndexOf2 == -1) {
                int iIndexOf3 = str.indexOf(cZzH5);
                if (iIndexOf3 == -1) {
                    return true;
                }
                return iIndexOf3 >= iIndexOf && iIndexOf3 - iIndexOf == iZzH3 + 1;
            }
            if (iIndexOf2 - iIndexOf != iZzH3 + 1) {
                return false;
            }
            iIndexOf = iIndexOf2;
        }
    }

    private static boolean zzMI(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char cCharAt = str.charAt(length);
            if (Character.isDigit(cCharAt)) {
                return false;
            }
            if (!com.aspose.words.internal.zzZKU.zzG(cCharAt) && cCharAt != '%') {
                return true;
            }
        }
        return false;
    }

    public static zzZVZ zzMJ(String str) {
        boolean z;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        if (str.length() <= 1 || str.charAt(0) != '-') {
            z = false;
        } else {
            str = str.substring(1, str.length());
            z = true;
        }
        boolean z2 = str.indexOf(com.aspose.words.internal.zzJB.zzH4()) != -1;
        RefBoolean refBoolean = new RefBoolean(false);
        String strZzZ = zzZ(str, refBoolean);
        boolean z3 = refBoolean.get();
        int iIndexOf = strZzZ.indexOf(37);
        boolean z4 = iIndexOf != -1;
        double d = z4 ? 0.01d : 1.0d;
        boolean zZzMI = zzMI(strZzZ);
        String strZzXa = com.aspose.words.internal.zzZYD.zzXa(strZzZ);
        if (z4 && strZzXa.length() != iIndexOf) {
            return null;
        }
        int iZzMG = zzMG(strZzXa);
        if (z4) {
            iZzMG += 2;
        }
        int i = iZzMG;
        if (!zzMH(strZzXa)) {
            return null;
        }
        double dZzZj = com.aspose.words.internal.zzJB.zzZj(strZzXa);
        if (Double.isNaN(dZzZj)) {
            dZzZj = com.aspose.words.internal.zzJB.zzZq(strZzXa);
        }
        if (Double.isNaN(dZzZj)) {
            return null;
        }
        double d2 = d;
        if (z) {
            dZzZj = -dZzZj;
        }
        return new zzZVZ(d2 * dZzZj, z3, z2, i, zZzMI);
    }

    private void zzW(zzTL zztl) {
        if (zztl.zzbY() != 2) {
            return;
        }
        zzZVZ zzzvz = (zzZVZ) zztl;
        if (zzzvz.zzYN5) {
            this.zzYN5 = true;
        }
        if (zzzvz.zzYN4) {
            this.zzYN4 = true;
        }
        if (zzzvz.zzYN3) {
            this.zzYN3 = true;
        }
    }

    private static zzZVZ zzY(zzTK zztk, double d, int i) {
        zzZVZ zzzvz = new zzZVZ(d);
        if (i >= 0) {
            zzzvz.zzYN2 = i;
        }
        Iterator<zzTL> it = zztk.iterator();
        while (it.hasNext()) {
            zzzvz.zzW(it.next());
        }
        return zzzvz;
    }

    public static zzZVZ zzZ(zzTL zztl, double d) {
        zzTK zztk = new zzTK();
        zztk.zzY(zztl);
        return zzY(zztk, d, -1);
    }

    @Override // com.aspose.words.zzTL
    public final String zz8W() {
        return com.aspose.words.internal.zzJB.zzZ(this.zzE0, this.zzYN5, this.zzYN4, this.zzYN2, this.zzYN3);
    }

    @Override // com.aspose.words.zzTL
    public final boolean zz8X() {
        return this.zzE0 != 0.0d;
    }

    @Override // com.aspose.words.zzTL
    public final double zz8Y() {
        return this.zzE0;
    }

    public final void zzWp(boolean z) {
        this.zzYN3 = z;
    }

    public final boolean zzZk4() {
        return this.zzYN1;
    }

    public final int zzZk5() {
        return this.zzYN2;
    }

    @Override // com.aspose.words.zzTL
    public final int zzbY() {
        return 2;
    }

    public static zzZVZ zzZ(zzTL zztl, double d, int i) {
        zzTK zztk = new zzTK();
        zztk.zzY(zztl);
        return zzY(zztk, d, i);
    }

    private zzZVZ(double d, boolean z, boolean z2, int i, boolean z3) {
        this.zzE0 = d;
        this.zzYN5 = z;
        this.zzYN4 = z2;
        this.zzYN2 = i;
        this.zzYN1 = z3;
    }

    public static zzZVZ zzZ(zzTL zztl, zzTL zztl2, double d, int i) {
        zzTK zztk = new zzTK();
        zztk.zzY(zztl);
        zztk.zzY(zztl2);
        return zzY(zztk, d, i);
    }

    public static zzZVZ zzZ(zzTK zztk, double d, int i) {
        return zzY(zztk, d, i);
    }

    private static String zzZ(String str, RefBoolean refBoolean) {
        String strZzZ9 = com.aspose.words.internal.zzJB.zzZ9(str);
        String strZzf = com.aspose.words.internal.zzZYD.zzf(strZzZ9, com.aspose.words.internal.zzJB.zzH1());
        if (!com.aspose.words.internal.zzZKN.equals(strZzf, strZzZ9)) {
            refBoolean.set(true);
            return strZzf;
        }
        refBoolean.set(false);
        for (String str2 : zzYN0) {
            String strZzf2 = com.aspose.words.internal.zzZYD.zzf(strZzZ9, str2);
            if (!com.aspose.words.internal.zzZKN.equals(strZzf2, strZzZ9)) {
                return strZzf2;
            }
        }
        return strZzZ9;
    }

    public static zzZQ8 zzZ(double d, zzYIU zzyiu, int i, IFieldResultFormatter iFieldResultFormatter) {
        String numeric;
        zzYIT.zzW(zzyiu);
        if (iFieldResultFormatter != null && (numeric = iFieldResultFormatter.formatNumeric(d, zzyiu.zzEL())) != null) {
            return new zzZQ8(zzYIU.zzCI(numeric), false);
        }
        return new zzZQ8((zzYIU) com.aspose.words.internal.zzJB.zzZ(d, zzyiu, i, zzYIT.zzXxA), true ^ ((i & 4) != 0));
    }

    @Override // com.aspose.words.zzTL
    public final zzZQ8 zzZ(zzYIU zzyiu, int i, IFieldResultFormatter iFieldResultFormatter) {
        return zzZ(this.zzE0, zzyiu, i, iFieldResultFormatter);
    }

    @Override // com.aspose.words.zzTL
    public final boolean zzZ(RefDouble refDouble) {
        refDouble.set(this.zzE0);
        return true;
    }
}

package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzRI extends zzKP {
    private static String[] zzWN = {"jedna", "dva", "tři", "čtyři", "pět", "šest", "sedm", "osm", "devět", "deset", "jedenáct", "dvanáct", "třináct", "čtrnáct", "patnáct", "šestnáct", "sedmnáct", "osmnáct", "devatenáct"};
    private static String[] zzO0 = {"první", "druhý", "třetí", "čtvrtý", "pátý", "šestý", "sedmý", "osmý", "devátý", "desátý", "jedenáctý", "dvanáctý", "třináctý", "čtrnáctý", "patnáctý", "šestnáctý", "sedmnáctý", "osmnáctý", "devatenáctý"};
    private static String[] zzMT = {"", "dvou", "tří", "čtyř", "pěti", "šesti", "sedmi", "osmi", "devíti"};
    private static String[] zzNZ = {"dvacet", "třicet", "čtyřicet", "padesát", "šedesát", "sedmdesát", "osmdesát", "devadesát"};
    private static String[] zzNY = {"dvacátý", "třicátý", "čtyřicátý", "padesátý", "šedesátý", "sedmdesátý", "osmdesátý", "devadesátý"};

    private static String zzW(int i, boolean z, boolean z2) {
        return z ? (z2 || i == 1) ? "sto" : i != 2 ? (i == 3 || i == 4) ? "sta" : "set" : "stě" : "stý";
    }

    private static boolean zzZ(boolean z, int i, boolean z2) {
        return (z && i != 0 && z2) ? false : true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return z ? "nula" : "nultý";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzX(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzZ(sb, zzP(i, z4), zzZ(z4, i2, z3));
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return "a";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXH() {
        return zzNZ;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXI() {
        return zzNY;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXJ() {
        return zzO0;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXK() {
        return zzWN;
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzXM() {
        return false;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXO() {
        return " ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzY(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzKP.zzZ(sb, zzQ(i, z4), true, zzZ(z4, i2, z3) ? getSeparator() : "");
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i4) {
        boolean zZzZ = zzZ(z4, i3, z3);
        zzKP.zzZ(sb, zzP(i, z4) + ((!z4 && z3 && (i == 7 || i == 8)) ? "" : getSeparator()) + zzQ(i2, z4), true, zZzZ ? getSeparator() : "");
    }

    private String zzY(int i, boolean z, boolean z2) {
        if (!z) {
            return zzMT[i - 1];
        }
        if (!z2 && i == 2) {
            return "dvě";
        }
        return zzQ(i, true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        boolean z6 = true;
        if (i != 1 || (z5 && z4)) {
            zzZ(sb, zzY(i, z5, z4), true);
        }
        if (!z5 ? i != 1 : z4) {
            z6 = false;
        }
        zzZ(sb, zzW(i, z5, z4), z6);
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzZ(boolean z, int i, ArrayList<Integer> arrayList, int i2) {
        if (!super.zzZ(z, i, arrayList, i2)) {
            return false;
        }
        if (z) {
            return i % 100 != 0;
        }
        int i3 = i % 100;
        return (i3 == 10 || i3 == 70 || i3 == 80) ? false : true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        if (i != 1) {
            if (i == 2) {
                return "miliónů";
            }
            if (i == 3) {
                return "miliarda";
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: thousandIndex");
        }
        if (!z) {
            return "tisící";
        }
        if (i2 != 200 && i2 != 300 && i2 != 400) {
            int i3 = i2 % 100;
            int i4 = i2 % 10;
            if (i4 != 2 && i4 != 3 && i4 != 4) {
                return "tisíc";
            }
            if (i3 >= 10 && i3 <= 20) {
                return "tisíc";
            }
        }
        return "tisíce";
    }
}

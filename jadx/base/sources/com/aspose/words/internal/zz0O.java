package com.aspose.words.internal;

import com.facebook.common.callercontext.ContextChain;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz0O extends zzKP {
    private static String[] zzWN = {"jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć", "dziesięć", "jedenaście", "dwanaście", "trzynaście", "czternaście", "piętnaście", "szesnaście", "siedemnaście", "osiemnaście", "dziewiętnaście"};
    private static String[] zzO0 = {"pierwszy", "drugi", "trzeci", "czwarty", "piąty", "szósty", "siódmy", "ósmy", "dziewiąty", "dziesiąty", "jedenasty", "dwunasty", "trzynasty", "czternasty", "piętnasty", "szesnasty", "siedemnasty", "osiemnasty", "dziewiętnasty"};
    private static String[] zzNZ = {"dwadzieścia", "trzydzieści", "czterdzieści", "pięćdziesiąt", "sześćdziesiąt", "siedemdziesiąt", "osiemdziesiąt", "dziewięćdziesiąt"};
    private static String[] zzNY = {"dwudziesty", "trzydziesty", "czterdziesty", "pięćdziesiąty", "sześćdziesiąty", "siedemdziesiąty", "osiemdziesiąty", "dziewięćdziesiąty"};
    private static String[] zzet = {"dziesiącio", "dwudziesto", "trzydziesto", "czterdziesto", "pięćdziesiącio", "sześćdziesiącio", "siedemdziesiącio", "osiemdziesiącio", "dziewięćdziesiącio"};
    private static String[] zzes = {"jedno", "dwu", "trzy", "cztero", "piącio", "szeącio", "siedmio", "óąmio", "dziewiącio", "dziesiącio", "jedenasto", "dwunasto", "trzynasto", "czternasto", "piętnasto", "szesnasto", "siedemnasto", "osiemnasto", "dziewiętnasto"};

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return z ? "zero" : "zerowy";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzX(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzZ(sb, zzY(i, z4, arrayList, i3), zzZ(i2, z, z2, z4, arrayList, i3));
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return ContextChain.TAG_INFRA;
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
        zzKP.zzZ(sb, zzZ(i, z4, arrayList, i3), true, zzZ(i2, z, z2, z4, arrayList, i3) ? getSeparator() : "");
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i4) {
        boolean zZzZ = zzZ(i3, z, z2, z4, arrayList, i4);
        zzKP.zzZ(sb, zzY(i, z4, arrayList, i4) + (((z || !z3) && (z4 || i4 == 0 || !zzKP.zzW(arrayList, i4))) ? getSeparator() : "") + zzZ(i2, z4, arrayList, i4), true, zZzZ ? getSeparator() : "");
    }

    private String zzY(int i, boolean z, ArrayList<Integer> arrayList, int i2) {
        if (z) {
            return zzP(i, true);
        }
        if (i2 == 0) {
            return zzP(i, false);
        }
        if (!zzKP.zzW(arrayList, i2)) {
            return zzP(i, true);
        }
        return zzet[i - 1];
    }

    private static boolean zzZ(int i, boolean z, boolean z2, boolean z3, ArrayList<Integer> arrayList, int i2) {
        if (i != 0 || zzZ(z, z2, arrayList, i2)) {
            return z3 || i2 == 0 || !zzKP.zzW(arrayList, i2);
        }
        return false;
    }

    private String zzZ(int i, boolean z, ArrayList<Integer> arrayList, int i2) {
        if (z) {
            return zzQ(i, true);
        }
        if (i2 == 0) {
            return zzQ(i, false);
        }
        if (!zzKP.zzW(arrayList, i2)) {
            return zzQ(i, true);
        }
        return zzes[i - 1];
    }

    private String zzY(int i, boolean z, boolean z2, ArrayList<Integer> arrayList, int i2) {
        if (z) {
            if (i == 2) {
                return "dwie";
            }
        } else if (i2 == 0) {
            if (i == 2) {
                if (z2) {
                    return "dwie";
                }
                return "dwu";
            }
        } else if (zzKP.zzW(arrayList, i2)) {
            if (i == 2) {
                return "dwu";
            }
            if (i == 6) {
                return "szeuść";
            }
        } else if (i == 2) {
            return "dwie";
        }
        return zzQ(i, true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        boolean zZzZ = zzZ(z, z3, arrayList, i2);
        if (i != 1) {
            zzZ(sb, zzY(i, z5, z2, arrayList, i2), zZzZ);
        }
        zzZ(sb, zzZ(i, z5, z2, arrayList, i2), i == 1 && zZzZ);
    }

    private static boolean zzZ(boolean z, boolean z2, ArrayList<Integer> arrayList, int i) {
        if (!z && z2) {
            int i2 = i + 1;
            if (arrayList.get(i2).intValue() % 100 >= 20 && arrayList.get(i2).intValue() % 10 == 0) {
                return false;
            }
        }
        return true;
    }

    private static String zzZ(int i, boolean z, boolean z2, ArrayList<Integer> arrayList, int i2) {
        if (!z && ((i2 != 0 || !z2) && (i2 == 0 || zzKP.zzW(arrayList, i2)))) {
            if (i2 == 0) {
                return "setny";
            }
            if (i >= 5) {
                return "set";
            }
            return "stu";
        }
        if (i == 1) {
            return "sto";
        }
        if (i == 2) {
            return "ście";
        }
        if (i != 3 && i != 4) {
            return "set";
        }
        return "sta";
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzZ(boolean z, int i, ArrayList<Integer> arrayList, int i2) {
        if (super.zzZ(z, i, arrayList, i2)) {
            return z || !zzKP.zzW(arrayList, i2);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        if (i != 1) {
            if (i == 2) {
                return z ? "milion" : "milionowy";
            }
            if (i == 3) {
                return z ? "miliard" : "miliardowy";
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: thousandIndex");
        }
        if (i2 == 1) {
            if (!z && arrayList.get(0).intValue() == 0) {
                return "tysiączny";
            }
            return "tysiąc";
        }
        if (!z && arrayList.get(0).intValue() == 0) {
            return "tysięczny";
        }
        int i3 = i2 % 10;
        if (i3 == 2 || i3 == 3 || i3 == 4) {
            int i4 = i2 % 100;
            if (i4 >= 10 && i4 <= 20) {
                return "tysięcy";
            }
            return "tysiące";
        }
        return "tysięcy";
    }
}

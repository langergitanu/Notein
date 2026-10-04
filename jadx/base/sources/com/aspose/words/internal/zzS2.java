package com.aspose.words.internal;

import com.facebook.common.callercontext.ContextChain;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzS2 extends zzKP {
    private static String[] zzWN = {"jedan", "dva", "tri", "četiri", "pet", "šest", "sedam", "osam", "devet", "deset", "jedanaest", "dvanaest", "trinaest", "četrnaest", "petnaest", "šesnaest", "sedamnaest", "osamnaest", "devetnaest"};
    private static String[] zzO0 = {"prvi", "drugi", "treći", "četvrti", "peti", "šesti", "sedmi", "osmi", "deveti", "deseti", "jedanaesti", "dvanaesti", "trinaesti", "četrnaesti", "petnaesti", "šesnaesti", "sedamnaesti", "osamnaesti", "devetnaesti"};
    private static String[] zzNZ = {"dvadeset", "trideset", "četrdeset", "pedeset", "šezdeset", "sedamdeset", "osamdeset", "devedeset"};
    private static String[] zzNY = {"dvadeseti", "trideseti", "četrdeseti", "pedeseti", "šezdeseti", "sedamdeseti", "osamdeseti", "devedeseti"};

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return z ? "nula" : "nulti";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzX(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzZ(sb, zzZ(i, z, z4), true);
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
        zzKP.zzZ(sb, zzZ(i, z, i3), true, getSeparator());
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i4) {
        zzKP.zzZ(sb, zzZ(i, z, z4) + getSeparator() + zzQ(i2, z), true, getSeparator());
    }

    private static String zzX(boolean z, boolean z2) {
        return (z || z2) ? "sto" : "stoti";
    }

    private String zzY(int i, boolean z, boolean z2) {
        if (i == 2) {
            return "dvje";
        }
        if (i != 6 || (!z && !z2)) {
            return zzQ(i, true);
        }
        return "še";
    }

    private String zzZ(int i, boolean z, int i2) {
        if (z && i2 != 0) {
            if (i == 1) {
                return "jedna";
            }
            if (i == 2) {
                return "dvije";
            }
        }
        return zzQ(i, z);
    }

    private String zzZ(int i, boolean z, boolean z2) {
        if (z && !z2 && i == 3) {
            return "tridest";
        }
        return zzP(i, z);
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        if (i != 1) {
            zzZ(sb, zzY(i, z, z2), true);
        }
        zzZ(sb, zzX(z, z2), i == 1);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        int i3;
        if (i != 1) {
            if (i == 2) {
                return "milijun";
            }
            if (i == 3) {
                return "milijarda";
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: thousandIndex");
        }
        if (!z && zzKP.zzW(arrayList, i)) {
            return "tisućiti";
        }
        int i4 = i2 % 100;
        if (i4 == 0) {
            i3 = i2 / 100;
        } else {
            i3 = (i4 < 10 || i4 >= 20) ? i2 % 10 : -1;
        }
        if (i3 == 0 || i3 == 1) {
            return "tisuću";
        }
        if (i3 != 2 && i3 != 3 && i3 != 4) {
            return "tisuća";
        }
        return "tisuće";
    }
}

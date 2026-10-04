package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzX7 extends zzXA {
    String zzZAL;
    private int zzZCz;
    int zzci;

    private zzX7(int i, int i2, String str) {
        super(i, i2);
        if (zzU7.zzZq(str.charAt(0))) {
            this.zzZCz |= 1;
        }
        if (com.aspose.words.internal.zzZKN.equals(str, zzU7.SECTION_BREAK)) {
            this.zzZCz |= 4;
        }
        if (com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtX)) {
            this.zzZCz |= 64;
        }
        if (com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtW)) {
            this.zzZCz |= 32;
        }
        if (com.aspose.words.internal.zzZKN.equals(str, zzU7.PARAGRAPH_BREAK)) {
            this.zzZCz |= 8;
        }
        if (com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtI)) {
            this.zzZCz |= 16;
        }
        if (zzU7.zzSV(str)) {
            this.zzZCz |= 128;
        }
        if (com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtM) || com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtL) || com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtK) || com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtJ) || com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtP) || zzU7.zzZk(str.charAt(0)) || zzU7.zzZh(str.charAt(0)) || zzU7.zzZn(str.charAt(0)) || com.aspose.words.internal.zzZKN.equals(str, zzU7.zzZtT)) {
            this.zzZCz |= 2;
        }
        this.zzci = str.length();
        this.zzZAL = str;
    }

    private boolean zz6O() {
        return zzU7.zzZk(this.zzZAL.charAt(0)) || zzU7.zzZh(this.zzZAL.charAt(0));
    }

    private boolean zz6Q() {
        return (this.zzZCz & 128) != 0;
    }

    private boolean zz6R() {
        return (this.zzZCz & 32) != 0;
    }

    private boolean zz6S() {
        return (this.zzZCz & 64) != 0;
    }

    private static boolean zzYz(int i, int i2) {
        if (i2 == 4 || i == 4 || (i == 3 && i2 != 3)) {
            return true;
        }
        return (i2 == 3 && i != 3) || i2 == 6 || i == 6;
    }

    public static zzX9 zzZ(zzVD zzvd, Map<String, Integer> map, CompareOptions compareOptions) {
        zzX9 zzx9 = new zzX9();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < zzvd.getLength()) {
            int iZzZr = zzU7.zzZr(zzvd.get(i));
            if (zzYz(i3, iZzZr)) {
                zzZ(zzx9, map, zzvd.substring(i2, i - i2), i2, compareOptions);
                i2 = i;
            }
            i++;
            i3 = iZzZr;
        }
        if (i2 < zzvd.getLength()) {
            zzZ(zzx9, map, zzvd.substring(i2, zzvd.getLength() - i2), i2, compareOptions);
        }
        return zzx9;
    }

    @Override // com.aspose.words.zzXA
    public final int getWeight() {
        if (zz6Q()) {
            return 1000;
        }
        return (zz6U() || zz6T() || zz6S() || zz6R() || zz6O()) ? 5 : 1;
    }

    public final boolean zz6P() {
        return (this.zzZCz & 2) != 0;
    }

    public final boolean zz6T() {
        return (this.zzZCz & 4) != 0;
    }

    public final boolean zz6U() {
        return zz6W() || zz6V();
    }

    public final boolean zz6V() {
        return (this.zzZCz & 16) != 0;
    }

    public final boolean zz6W() {
        return (this.zzZCz & 8) != 0;
    }

    public final boolean zz6X() {
        return (this.zzZCz & 1) != 0;
    }

    private static void zzZ(zzX9 zzx9, Map<String, Integer> map, String str, int i, CompareOptions compareOptions) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            String lowerCase = compareOptions.getIgnoreCaseChanges() ? str.toLowerCase() : str;
            RefInt refInt = new RefInt(0);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(map, lowerCase, refInt);
            int size = refInt.get();
            if (!zZzZ) {
                size = map.size() + 1;
                map.put(lowerCase, Integer.valueOf(size));
            }
            zzx9.zzZ(new zzX7(size, i, str));
        }
    }
}

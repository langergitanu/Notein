package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ38 extends zzZ3E {
    private int zzPm;
    private int zzUG;
    private int zzYG;
    private int zzYc5;
    private int zzYc7;
    private int zzYw;
    private static int zzY9d = ((Integer) zzYMX.zzOt(EditingLanguage.KASHMIRI_ARABIC)).intValue();
    private static int zzY9c = 0;
    private static int zzY9b = ((Integer) zzYMX.zzOt(EditingLanguage.GALICIAN)).intValue();

    public zzZ38(zzX6 zzx6, boolean z) {
        super(zzx6);
        this.zzYG = zzY9d;
        this.zzYw = zzY9b;
        this.zzUG = zzY9c;
        this.zzYc5 = 0;
        if (z) {
            zzYN9();
        }
    }

    public static zzZ38 zzZ(zzZ38 zzz38) {
        if (zzz38 == null) {
            zzz38 = new zzZ38(null, true);
        }
        if (zzz38.zzZoP() == null || zzz38.isCached()) {
            return zzz38;
        }
        zzZ38 zzz382 = (zzZ38) com.aspose.words.internal.zzQW.zzZ((Map<zzZ38, TValue>) zzz38.zzZoP().zzZAy, zzz38);
        if (zzz382 != null) {
            return zzz382;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz38.zzZoP().zzZAy, zzz38, zzz38);
        return zzz38;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ38 zzz38 = (zzZ38) obj;
        return this.zzYG == zzz38.zzYG && this.zzYw == zzz38.zzYw && this.zzUG == zzz38.zzUG && this.zzYc7 == zzz38.zzYc7 && this.zzYc5 == zzz38.zzYc5 && this.zzPm == zzz38.zzPm;
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    public final int getId() {
        return this.zzYG;
    }

    public final int getLevel() {
        return this.zzYw;
    }

    public final int getNumberStyle() {
        return this.zzPm;
    }

    public final int getTrailingCharacter() {
        return this.zzYc7;
    }

    public final void setAlignment(int i) {
        zzYN6();
        this.zzUG = i;
    }

    public final void setId(int i) {
        zzYN6();
        this.zzYG = i;
    }

    public final void setLevel(int i) {
        zzYN6();
        this.zzYw = i;
    }

    public final void setNumberStyle(int i) {
        zzYN6();
        this.zzPm = i;
    }

    public final void setTrailingCharacter(int i) {
        zzYN6();
        this.zzYc7 = i;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzwB(this.zzYG);
        zzwB(this.zzYw);
        zzwB(this.zzUG);
        zzwB(this.zzYc7);
        zzwB(this.zzYc5);
        zzwA(this.zzPm);
    }

    public final int zzYO6() {
        return this.zzYc5;
    }

    public final void zzx1(int i) {
        zzYN6();
        this.zzYc5 = i;
    }
}

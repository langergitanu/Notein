package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzXZO {
    static zzXZO zzWTc = new zzXZO(0, com.aspose.words.internal.zzPV.zzHZ);
    private int zzAr;
    private com.aspose.words.internal.zzPV zzZf;

    private zzXZO(int i, com.aspose.words.internal.zzPV zzpv) {
        this.zzAr = i;
        this.zzZf = zzpv;
    }

    private static int zzUW(int i, int i2) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 20:
            case 24:
            case 25:
            case 26:
            case 27:
                if (i2 != 1) {
                    return i2 != 2 ? 1 : 3;
                }
                return 2;
            case 2:
                return 3;
            case 3:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
                return 12;
            case 4:
            default:
                return 1;
            case 5:
                return 13;
            case 6:
                return 11;
            case 7:
            case 22:
                return i2 == 0 ? 9 : 10;
            case 8:
            case 23:
                return i2 == 0 ? 4 : 5;
            case 9:
                return i2 == 0 ? 7 : 8;
        }
    }

    private static int zzVR(double d) {
        if (d < 1.0d) {
            return 0;
        }
        return d < 2.0d ? 1 : 2;
    }

    public static zzXZO zzt(Border border) {
        return new zzXZO(zzUW(border.getLineStyle(), zzVR(border.getLineWidth())), border.zz8Q());
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzXZO.class) {
            return false;
        }
        zzXZO zzxzo = (zzXZO) obj;
        return zzxzo.zzAr == this.zzAr && com.aspose.words.internal.zzZKO.equals(zzxzo.zzZf, this.zzZf);
    }

    public final int getStyle() {
        return this.zzAr;
    }

    public int hashCode() {
        int i = this.zzAr * 397;
        com.aspose.words.internal.zzPV zzpv = this.zzZf;
        return i ^ (zzpv != null ? zzpv.hashCode() : 0);
    }

    public final com.aspose.words.internal.zzPV zzZy() {
        return this.zzZf;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCL {
    public static Shading zzZ(zzZLE[] zzzleArr, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        if (zzzleArr == null) {
            return zzZI(zzpv);
        }
        Shading shading = new Shading();
        shading.setTexture(8);
        shading.zzZJ(zzpv);
        shading.zzZK(zzpv2);
        return shading;
    }

    public static Shading zzZI(com.aspose.words.internal.zzPV zzpv) {
        Shading shading = new Shading();
        shading.zzZK(zzpv);
        return shading;
    }

    private static int zzmr(int i) {
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 2;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static Shading zzZ(int i, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        Shading shading = new Shading();
        if (i != 32 && i != 34 && i != 37 && i != 40 && i != 43 && i != 48 && i != 53 && i != 54) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    shading.setTexture(zzmr(i));
                    shading.zzZJ(zzpv);
                    shading.zzZK(zzpv2);
                    break;
                default:
                    switch (i) {
                        default:
                            shading.zzZK(zzpv2);
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            return shading;
                    }
                    break;
            }
        }
        return shading;
    }
}

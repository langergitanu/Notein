package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ12 {
    public static zzZ13 zzZ(OfficeMath officeMath, zzZ13 zzz13, zzZ14 zzz14) throws Exception {
        zzZ13 zzz132;
        int mathObjectType = officeMath.zzZsL().getMathObjectType();
        if (mathObjectType == 0 || mathObjectType == 1) {
            zzz132 = new zzZ13(zzz14, officeMath);
            if (zzz13 != null) {
                zzz132.zzYn(zzz13.zzYGi());
            }
        } else if (mathObjectType == 2) {
            zzz132 = new zzZ19(zzz14, officeMath);
        } else if (mathObjectType == 6) {
            zzz132 = new zzZ16(zzz14, officeMath);
        } else if (mathObjectType == 13) {
            zzz132 = new zzZ0Y(zzz14, officeMath);
        } else if (mathObjectType == 15) {
            zzz132 = new zzZ0X(zzz14, officeMath);
        } else if (mathObjectType == 23) {
            zzz132 = new zzYZT(zzz14, officeMath);
        } else if (mathObjectType == 9) {
            zzz132 = new zzZ18(zzz14, officeMath);
        } else if (mathObjectType != 10) {
            switch (mathObjectType) {
                case 17:
                    zzz132 = new zzZ0W(zzz14, officeMath, true);
                    break;
                case 18:
                    zzz132 = new zzZ0W(zzz14, officeMath, false);
                    break;
                case 19:
                    zzz132 = new zzZ0M(zzz14, officeMath);
                    break;
                case 20:
                    zzz132 = new zzZ0L(zzz14, (zzZ0M) zzz13, officeMath);
                    break;
                case 21:
                    zzz132 = new zzZ0K(zzz14, officeMath);
                    break;
                default:
                    switch (mathObjectType) {
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            zzz132 = new zzYZS(zzz14, officeMath);
                            break;
                        default:
                            zzz132 = new zzZ13(zzz14, officeMath);
                            break;
                    }
                    break;
            }
        } else {
            zzz132 = new zzZ0Z(zzz14, officeMath);
        }
        return zzZ(zzz13, zzz132);
    }

    private static zzZ13 zzZ(zzZ13 zzz13, zzZ13 zzz132) {
        if (zzz13 != null) {
            zzz13.zzZ(zzz132);
        }
        return zzz132;
    }
}

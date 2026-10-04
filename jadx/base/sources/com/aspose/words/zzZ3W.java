package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3W {

    public static class zzZ {
        private int zzYbm;
        private int zzZz3;
        private int zzw9;
        private int zzwa;

        public zzZ(int i, int i2, int i3, int i4) {
            this.zzwa = i;
            this.zzZz3 = i2;
            this.zzw9 = i3;
            this.zzYbm = i4;
        }

        public final int getBottom() {
            return this.zzYbm;
        }

        public final int getLeft() {
            return this.zzwa;
        }

        public final int getRight() {
            return this.zzZz3;
        }

        public final int getTop() {
            return this.zzw9;
        }
    }

    private static int zzwE(int i) {
        return (i == 1031 || i == 1041 || i == 1049 || i == 5129) ? 1 : 9;
    }

    public static long zzwF(int i) {
        return zzY0C.zzhA(zzwE(i));
    }

    public static int zzwG(int i) {
        return i != 1033 ? 708 : 720;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZ zzwH(int i) {
        if (i != 1036) {
            if (i != 1037) {
                if (i != 1040) {
                    if (i == 1041) {
                        return new zzZ(1701, 1701, 1985, 1701);
                    }
                    if (i != 1049) {
                        if (i != 1050) {
                            if (i != 2057) {
                                if (i != 2058) {
                                    if (i != 3081) {
                                        if (i != 3082) {
                                            switch (i) {
                                                case EditingLanguage.BULGARIAN /* 1026 */:
                                                case 1053:
                                                case 1055:
                                                case EditingLanguage.FRENCH_BELGIUM /* 2060 */:
                                                case EditingLanguage.DUTCH_BELGIUM /* 2067 */:
                                                case EditingLanguage.FRENCH_SWITZERLAND /* 4108 */:
                                                    break;
                                                case EditingLanguage.UKRAINIAN /* 1058 */:
                                                    return new zzZ(1417, 850, 850, 850);
                                                case EditingLanguage.LITHUANIAN /* 1063 */:
                                                    return new zzZ(1701, 567, 1701, EditingLanguage.LUXEMBOUGISH);
                                                case EditingLanguage.TATAR /* 1092 */:
                                                    break;
                                                case 2052:
                                                    break;
                                                case EditingLanguage.GERMAN_SWITZERLAND /* 2055 */:
                                                case EditingLanguage.GERMAN_AUSTRIA /* 3079 */:
                                                case EditingLanguage.GERMAN_LUXEMBOURG /* 4103 */:
                                                case EditingLanguage.GERMAN_LIECHTENSTEIN /* 5127 */:
                                                    return new zzZ(1417, 1417, 1417, EditingLanguage.LUXEMBOUGISH);
                                                case EditingLanguage.ITALIAN_SWITZERLAND /* 2064 */:
                                                    break;
                                                case EditingLanguage.PORTUGUESE_PORTUGAL /* 2070 */:
                                                case EditingLanguage.SPANISH_ARGENTINA /* 11274 */:
                                                case EditingLanguage.SPANISH_CHILE /* 13322 */:
                                                    break;
                                                case EditingLanguage.ENGLISH_CANADA /* 4105 */:
                                                case EditingLanguage.ENGLISH_NEW_ZEALAND /* 5129 */:
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case EditingLanguage.CZECH /* 1029 */:
                                                            break;
                                                        case EditingLanguage.DANISH /* 1030 */:
                                                            return new zzZ(EditingLanguage.LUXEMBOUGISH, EditingLanguage.LUXEMBOUGISH, 1701, 1701);
                                                        case EditingLanguage.GERMAN_GERMANY /* 1031 */:
                                                            break;
                                                        case EditingLanguage.GREEK /* 1032 */:
                                                            break;
                                                        case EditingLanguage.ENGLISH_US /* 1033 */:
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case EditingLanguage.DUTCH_NETHERLANDS /* 1043 */:
                                                                case EditingLanguage.NORWEGIAN_BOKMAL /* 1044 */:
                                                                case EditingLanguage.POLISH /* 1045 */:
                                                                    break;
                                                                case EditingLanguage.PORTUGUESE_BRAZIL /* 1046 */:
                                                                    break;
                                                                default:
                                                                    int i2 = i & 255;
                                                                    return i2 == 9 ? new zzZ(1440, 1440, 1440, 1440) : i2 == 7 ? new zzZ(1417, 1417, 1417, EditingLanguage.LUXEMBOUGISH) : i2 == 10 ? new zzZ(1701, 1701, 1417, 1417) : new zzZ(1417, 1417, 1417, 1417);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                }
                                return new zzZ(1701, 1701, 1417, 1417);
                            }
                            return new zzZ(1440, 1440, 1440, 1440);
                        }
                    }
                    return new zzZ(1701, 850, EditingLanguage.LUXEMBOUGISH, EditingLanguage.LUXEMBOUGISH);
                }
                return new zzZ(EditingLanguage.LUXEMBOUGISH, EditingLanguage.LUXEMBOUGISH, 1417, EditingLanguage.LUXEMBOUGISH);
            }
            return new zzZ(1800, 1800, 1440, 1440);
        }
        return new zzZ(1417, 1417, 1417, 1417);
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVC {
    private static boolean zzEw(int i) {
        if (i == 224 || i == 225 || i == 236 || i == 237 || i == 242 || i == 243 || i == 249 || i == 250 || i == 252) {
            return true;
        }
        switch (i) {
            case 232:
            case 233:
            case 234:
                return true;
            default:
                return false;
        }
    }

    private static boolean zzEx(int i) {
        if (i == 161 || i == 164 || i == 170 || i == 173 || i == 215 || i == 247 || i == 252 || i == 167 || i == 168 || i == 224 || i == 225 || i == 236 || i == 237 || i == 242 || i == 243 || i == 249 || i == 250) {
            return true;
        }
        switch (i) {
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
                return true;
            default:
                switch (i) {
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                    case 186:
                        return true;
                    default:
                        switch (i) {
                            case 188:
                            case 189:
                            case 190:
                            case 191:
                                return true;
                            default:
                                switch (i) {
                                    case 232:
                                    case 233:
                                    case 234:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    private static int zzXO(int i, int i2) {
        if (i < 160 || i > 255) {
            return 0;
        }
        int i3 = !zzEx(i) ? 1 : 0;
        if (zzZ3X.zzwL(i2) || i2 == 1024 || !zzEw(i)) {
            return i3;
        }
        return 1;
    }

    public static boolean zzXP(int i, int i2) {
        return zzXO(i, i2) == 0;
    }
}

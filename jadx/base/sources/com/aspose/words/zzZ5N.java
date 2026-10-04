package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5N {
    public static int zzxR(int i) {
        if (i == 0 || i == 255) {
            return 0;
        }
        if (i == 30 || i == 31) {
            return 1;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
                return 1;
            default:
                switch (i) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        return 1;
                    default:
                        switch (i) {
                            case 50:
                            case 51:
                                return 3;
                            case 52:
                            case 54:
                            case 55:
                                return 7;
                            case 53:
                                return 16;
                            default:
                                switch (i) {
                                    case 60:
                                    case 61:
                                        return 5;
                                    case 62:
                                        return 17;
                                    case 63:
                                        return 12;
                                    case 64:
                                        return 14;
                                    case 65:
                                        return 10;
                                    default:
                                        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: loadFormat");
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzxS(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 80) {
            return 29;
        }
        if (i != 10 && i != 11 && i != 30 && i != 31) {
            if (i != 60 && i != 61) {
                switch (i) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        return 2;
                    default:
                        switch (i) {
                            case 40:
                                return 15;
                            default:
                                switch (i) {
                                    case 44:
                                        return 19;
                                    case 45:
                                        return 4;
                                    case 46:
                                        break;
                                    case 47:
                                    case 48:
                                        return 20;
                                    default:
                                        switch (i) {
                                            case 50:
                                            case 51:
                                                return 4;
                                            case 52:
                                            case 53:
                                            case 54:
                                                return 8;
                                            default:
                                                switch (i) {
                                                    case 70:
                                                        return 18;
                                                    case 71:
                                                    case 72:
                                                        break;
                                                    case 73:
                                                        return 13;
                                                    default:
                                                        switch (i) {
                                                            case 100:
                                                            case 101:
                                                            case 102:
                                                            case 103:
                                                            case 104:
                                                            case 105:
                                                                return 9;
                                                            case 106:
                                                                return 20;
                                                            default:
                                                                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: saveFormat");
                                                        }
                                                }
                                                break;
                                        }
                                        break;
                                }
                            case 41:
                            case 42:
                                return 11;
                        }
                        break;
                }
            } else {
                return 6;
            }
        } else {
            return 2;
        }
    }
}

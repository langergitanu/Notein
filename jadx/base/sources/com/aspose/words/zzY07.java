package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY07 {
    private static boolean zzLX;

    public static zzZ9U zzXRS() {
        zzYSP zzysp = new zzYSP();
        if (zzLX) {
            zzysp.zzYZd();
        }
        return zzysp;
    }

    public static zzYOM zzY(Document document, SaveOptions saveOptions) {
        int saveFormat = saveOptions.getSaveFormat();
        if (saveFormat == 10) {
            return new zzZZL(document);
        }
        if (saveFormat != 11) {
            if (saveFormat == 30) {
                return new zzYG9(document);
            }
            if (saveFormat == 31) {
                return new zzY15(document);
            }
            if (saveFormat != 60 && saveFormat != 61 && saveFormat != 80) {
                switch (saveFormat) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        break;
                    default:
                        switch (saveFormat) {
                            case 40:
                            case 41:
                            case 42:
                                break;
                            default:
                                switch (saveFormat) {
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                        break;
                                    default:
                                        switch (saveFormat) {
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                                return ((HtmlSaveOptions) saveOptions).zzYZ2() ? new zzYOM(document, saveOptions.getSaveFormat()) : new zzYTX(document);
                                            default:
                                                switch (saveFormat) {
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                        break;
                                                    default:
                                                        switch (saveFormat) {
                                                            case 100:
                                                            case 101:
                                                            case 102:
                                                            case 103:
                                                            case 104:
                                                            case 105:
                                                            case 106:
                                                                break;
                                                            default:
                                                                return null;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
        }
        return new zzYTX(document);
    }

    public static zzZBZ zzZ(zzYDZ zzydz, int i, DocumentVisitor documentVisitor) {
        return new zz1G(zzydz, i, documentVisitor);
    }

    public static zzZBR zzhv(int i) {
        if (i == 10 || i == 11) {
            return new zzZZ3();
        }
        if (i == 30) {
            return new zzYEN();
        }
        if (i == 31) {
            return new zzY0P();
        }
        if (i == 60 || i == 61) {
            return new zzYOR();
        }
        if (i == 80) {
            return new zzXZ7();
        }
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return new zzZW2();
            default:
                switch (i) {
                    case 40:
                        return new zzYLY();
                    case 41:
                        break;
                    case 42:
                        return new zzY00();
                    default:
                        switch (i) {
                            case 44:
                                return new zzY79();
                            case 45:
                                return new zzZHW();
                            case 46:
                                break;
                            case 47:
                                return new zzYKL();
                            case 48:
                                return new zzYM1();
                            default:
                                switch (i) {
                                    case 50:
                                        return new zzZDH();
                                    case 51:
                                        return new zzYYT();
                                    case 52:
                                        return new zzZU5();
                                    case 53:
                                        return new zzYV();
                                    case 54:
                                        return new zzYXL();
                                    default:
                                        switch (i) {
                                            case 70:
                                                return new zzY4F();
                                            case 71:
                                            case 72:
                                                return new zzXZT();
                                            case 73:
                                                return new zzZ1M();
                                            default:
                                                switch (i) {
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                        return new zzZ87();
                                                    default:
                                                        throw new IllegalArgumentException("Invalid file format requested.");
                                                }
                                        }
                                }
                        }
                        break;
                }
                return new zzXYO();
        }
    }
}

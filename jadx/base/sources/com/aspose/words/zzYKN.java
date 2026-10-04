package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKN {
    public static void zzZ(int i, IWarningCallback iWarningCallback, IDocumentLoadingCallback iDocumentLoadingCallback) {
        if (zzpH(i) || iDocumentLoadingCallback == null) {
            return;
        }
        zzY1Z.zzZ(iWarningCallback, WarningType.HINT, zzY1Z.zzi8(i), com.aspose.words.internal.zzZKN.format("Loading progress is not supported for the '{0}' format.", Integer.valueOf(i)));
    }

    public static boolean zzpG(int i) {
        if (i != 10 && i != 11 && i != 71 && i != 72) {
            switch (i) {
                default:
                    switch (i) {
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                            break;
                        default:
                            return false;
                    }
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return true;
            }
        }
        return true;
    }

    public static boolean zzpH(int i) {
        if (i == 10 || i == 11 || i == 30 || i == 31) {
            return true;
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
                return true;
            default:
                switch (i) {
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static void zzZ(int i, IWarningCallback iWarningCallback, IDocumentSavingCallback iDocumentSavingCallback) {
        if (zzpG(i) || iDocumentSavingCallback == null) {
            return;
        }
        zzY1Z.zzZ(iWarningCallback, WarningType.HINT, zzY1Z.zzi7(i), com.aspose.words.internal.zzZKN.format("Saving progress is not supported for the '{0}' format.", Integer.valueOf(i)));
    }
}

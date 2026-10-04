package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK4 {
    public static zzZBS zzZ(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, int i, FileFormatInfo fileFormatInfo, Document document) throws Exception {
        if (i == 30) {
            return new zzYFU(zzzop, loadOptions, document);
        }
        if (i == 31) {
            return zzY11.zzZ(zzzop, loadOptions, document);
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
                return new zzZZO(zzzop, loadOptions, fileFormatInfo, document);
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
                        return new zzYNR(zzzop, loadOptions, fileFormatInfo, document);
                    default:
                        switch (i) {
                            case 50:
                                return new zzZIM(zzzop, loadOptions, fileFormatInfo, document);
                            case 51:
                                return new zzYYY(zzzop, loadOptions, document);
                            case 52:
                                return new zzYXV(zzzop, document);
                            case 53:
                                return new zzVU(zzzop, loadOptions, document);
                            case 54:
                                return new zzZ0(zzzop, document);
                            case 55:
                                return new zzZU8(zzzop, document);
                            default:
                                switch (i) {
                                    case 60:
                                    case 61:
                                        return new zzYQ7(zzzop, loadOptions, document);
                                    case 62:
                                        return new zzY4H(zzzop, loadOptions, fileFormatInfo, document);
                                    case 63:
                                        return new zzZ1U(zzzop, loadOptions, fileFormatInfo, document);
                                    case 64:
                                        return new zzYLZ(zzzop, loadOptions, document);
                                    case 65:
                                        return new zzXZ4(zzzop, document);
                                    default:
                                        throw new UnsupportedFileFormatException("Unsupported file format: " + LoadFormat.toString(i));
                                }
                        }
                }
        }
    }

    public static zzZBS zzZ(String str, int i, DocumentBuilder documentBuilder) {
        return new zzZIP(str, i, documentBuilder);
    }
}

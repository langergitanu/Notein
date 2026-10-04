package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ5 {
    private static com.aspose.words.internal.zzD5 zzYTU = new com.aspose.words.internal.zzD5();
    private static com.aspose.words.internal.zzD5 zzYTT = new com.aspose.words.internal.zzD5();

    static {
        zzYTU.zz2(0, 0);
        zzYTU.zz2(1, EditingLanguage.JAPANESE);
        zzYTU.zz2(2, 2052);
        zzYTU.zz2(3, EditingLanguage.KOREAN);
        zzYTU.zz2(4, EditingLanguage.CHINESE_TAIWAN);
        zzYTT.zz2(0, 6);
        zzYTT.zz2(65530, 3);
        zzYTT.zz2(65531, 4);
        zzYTT.zz2(65532, 7);
        zzYTT.zz2(65533, 2);
        zzYTT.zz2(65534, 1);
        zzYTT.zz2(65535, 5);
    }

    public static int zzG7(int i) {
        switch (i) {
            case 54793:
            case 54802:
            case 54896:
                return 0;
            case 54796:
            case 54898:
                return 2;
            case 54806:
            case 54897:
                return 1;
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Invalid SprmCode value {0}.", Integer.valueOf(i)));
        }
    }

    public static int zzG8(int i) {
        return zzYTT.zz0(i, 0);
    }

    public static int zzG9(int i) {
        return zzYTT.zzVC(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzGa(int i) {
        if (i == 17) {
            i = 1041;
        } else if (i == 18) {
            i = 1042;
        } else if (i != 1041) {
            if (i == 1042) {
            }
        }
        return zzYTU.zz0(i, 0);
    }

    public static int zzGb(int i) {
        return zzYTU.zz1(i, 0);
    }

    public static int zzGc(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalStateException("Unexpected subdocument type.");
    }

    public static int zzGd(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 6;
        }
        throw new IllegalStateException("Requested text box subdocument type for invalid current subdocument type.");
    }
}

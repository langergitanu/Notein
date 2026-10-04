package com.aspose.words;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9L {
    private static int[] zzXba = {0, 0, 17920, 50689, 9730, 9219, 9220, 9221, 9222, 9223, 9224, EditingLanguage.ENGLISH_CARIBBEAN, 50750, 9727, 9228, 50701, 33806, 33807, 17936, 33809, 25618, 42003, 42004, 50709, 9238, 9239, 33816, 33817, 33818, 9755, 17948, 17949, 17950, 17951, 17952, 17953, 17954, 9251, 38, 39, 40, 41, 42, 43, 9258, 17451, 17452, 17453, 33838, 33839, 9264, 9265, 0, 0, 0, 0, 0, 9272, 9271, 17465, 0, 0, 0, 0, 64, 2048, EditingLanguage.ARABIC_IRAQ, 2050, 68, 18436, 26629, 2054, 18439, 73, 74, EditingLanguage.SPANISH_MEXICO, 0, 0, 0, 79, 18992, 51761, 10802, 10803, 0, 2101, 2102, 2103, 2104, 2105, 2106, EditingLanguage.NORTHERN_SAMI_SWEDEN, EditingLanguage.IRISH, 93, 10814, 59967, 34880, 19009, 10818, 19011, 10820, 18501, 10822, 51783, 10824, 51785, 51786, 18507, 51788, 19021, 110, 111, 0, 113, 0, 0, 116, 2133, 2134, 11776, 52737, 27650, 27651, 27652, 27653, 0, 0, 0, 0, 0, 0, 12288, EditingLanguage.ARABIC_LEBANON, 133, 0, 0, 61955, 61956, 12293, 12294, 20487, 20488, EditingLanguage.ENGLISH_ZIMBABWE, EditingLanguage.SPANISH_ECUADOR, 20491, 36876, 12301, 12302, 45088, 45087, 12305, 12306, 12307, 12308, AccountTransferStatusCodes.NO_DATA_AVAILABLE, 36886, 45079, 45080, 12313, 12314, 20507, 20508, 12317, 163, 45087, 45088, 45089, 45090, 36899, 36900, 45093, 20518, 0, 0, 0, 0, 0, 0, 0, 179, 0, 0, 21642, 38401, 38402, 13414, 13316, 197, 54790, 37895, 54792, 191, 29706, 193, 30241, 22050, 30243, 22052, 22053, 54822, 30247};

    public static boolean zzlo(int i) {
        return i < 208;
    }

    public static int zzlp(int i) {
        int[] iArr = zzXba;
        if (i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    public static int zzlq(int i) {
        if (65 <= i && i < 119) {
            return 2;
        }
        if (119 <= i && i < 124) {
            return 3;
        }
        if (131 > i || i >= 182) {
            return (182 > i || i >= 200) ? 1 : 5;
        }
        return 4;
    }
}

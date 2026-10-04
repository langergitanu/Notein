package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzCU {
    private static String[] zzul = {"ン", "ア", "イ", "ウ", "エ", "オ", "カ", "キ", "ク", "ケ", "コ", "サ", "シ", "ス", "セ", "ソ", "タ", "チ", "ツ", "テ", "ト", "ナ", "ニ", "ヌ", "ネ", "ノ", "ハ", "ヒ", "フ", "ヘ", "ホ", "マ", "ミ", "ム", "メ", "モ", "ヤ", "ユ", "ヨ", "ラ", "リ", "ル", "レ", "ロ", "ワ", "ヲ"};
    private static String[] zzuk = {"ﾝ", "ｱ", "ｲ", "ｳ", "ｴ", "ｵ", "ｶ", "ｷ", "ｸ", "ｹ", "ｺ", "ｻ", "ｼ", "ｽ", "ｾ", "ｿ", "ﾀ", "ﾁ", "ﾂ", "ﾃ", "ﾄ", "ﾅ", "ﾆ", "ﾇ", "ﾈ", "ﾉ", "ﾊ", "ﾋ", "ﾌ", "ﾍ", "ﾎ", "ﾏ", "ﾐ", "ﾑ", "ﾒ", "ﾓ", "ﾔ", "ﾕ", "ﾖ", "ﾗ", "ﾘ", "ﾙ", "ﾚ", "ﾛ", "ﾜ", "ｦ"};
    private static String[] zzuj = {"ン", "イ", "ロ", "ハ", "ニ", "ホ", "ヘ", "ト", "チ", "リ", "ヌ", "ル", "ヲ", "ワ", "カ", "ヨ", "タ", "レ", "ソ", "ツ", "ネ", "ナ", "ラ", "ム", "ウ", "ヰ", "ノ", "オ", "ク", "ヤ", "マ", "ケ", "フ", "コ", "エ", "テ", "ア", "サ", "キ", "ユ", "メ", "ミ", "シ", "ヱ", "ヒ", "モ", "セ", "ス"};
    private static String[] zzui = {"〇", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    private static String[] zzuh = {"", "十", "百", "千"};
    private static String[] zzug = {"", "万", "億"};

    public static String zzP(long j, int i) {
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 1);
        StringBuilder sb = new StringBuilder();
        for (int size = i - arrayListZzQ.size(); size > 0; size--) {
            zzZNH.zzU(sb, zzui[0]);
        }
        for (int size2 = arrayListZzQ.size() - 1; size2 >= 0; size2--) {
            zzZNH.zzU(sb, zzui[arrayListZzQ.get(size2).intValue()]);
        }
        return sb.toString();
    }

    public static String zzW(long j, boolean z) {
        String[] strArr = z ? zzuk : zzul;
        return j == 0 ? "0" : strArr[(int) (j % ((long) strArr.length))];
    }

    public static String zzZR(long j) {
        if (j < 10) {
            return zzui[(int) j];
        }
        StringBuilder sb = new StringBuilder();
        boolean z = j >= 10000;
        for (int size = zzIU.zzQ(j, 4).size() - 1; size >= 0; size--) {
            ArrayList<Integer> arrayListZzQ = zzIU.zzQ(r7.get(size).intValue(), 1);
            for (int size2 = arrayListZzQ.size() - 1; size2 >= 0; size2--) {
                int iIntValue = arrayListZzQ.get(size2).intValue();
                if (iIntValue != 0) {
                    if (iIntValue > 1 || size2 == 0 || z) {
                        zzZNH.zzU(sb, zzui[iIntValue]);
                    }
                    zzZNH.zzU(sb, zzuh[size2]);
                    z = false;
                }
            }
            zzZNH.zzU(sb, zzug[size]);
        }
        return sb.toString();
    }

    public static String zzZS(long j) {
        if (j == 0) {
            return "0";
        }
        String[] strArr = zzuj;
        return strArr[(int) (j % ((long) strArr.length))];
    }
}

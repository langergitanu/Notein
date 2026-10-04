package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAW {
    private static HashMap<Character, Integer> zzXd2 = new HashMap<>();

    static {
        zzY7A();
    }

    private static int zzX(zzY9S zzy9s) throws Exception {
        int iZzXO = zzXO(zzy9s.getText().charAt(0));
        if (iZzXO == 0) {
            return 23;
        }
        return iZzXO;
    }

    private static int zzXO(char c) {
        RefInt refInt = new RefInt(0);
        return com.aspose.words.internal.zzZQF.zzZ(zzXd2, Character.valueOf(c), refInt) ? refInt.get() : (zz0.zzZB(c) || com.aspose.words.internal.zzUX.zzO(c)) ? 15 : 0;
    }

    public static boolean zzXP(char c) {
        return zzlZ(zzXO(c));
    }

    private static void zzY7A() {
        for (int i = 0; i < 16; i++) {
            zzXd2.put(Character.valueOf("‘“（〔［｛〈《「『【｟〘〖«〝".charAt(i)), 1);
        }
        for (int i2 = 0; i2 < 18; i2++) {
            zzXd2.put(Character.valueOf("’”）〕］｝〉》」』】｠〙〗»〟；：".charAt(i2)), 2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            zzXd2.put(Character.valueOf("‐〜゠–".charAt(i3)), 3);
        }
        for (int i4 = 0; i4 < 6; i4++) {
            zzXd2.put(Character.valueOf("！？‼⁇⁈⁉".charAt(i4)), 4);
        }
        for (int i5 = 0; i5 <= 0; i5++) {
            zzXd2.put(Character.valueOf("・".charAt(0)), 5);
        }
        for (int i6 = 0; i6 < 3; i6++) {
            zzXd2.put(Character.valueOf("。．.".charAt(i6)), 6);
        }
        for (int i7 = 0; i7 < 3; i7++) {
            zzXd2.put(Character.valueOf("、，,".charAt(i7)), 7);
        }
        for (int i8 = 0; i8 < 6; i8++) {
            zzXd2.put(Character.valueOf("—…‥〳〴〵".charAt(i8)), 8);
        }
        for (int i9 = 0; i9 < 6; i9++) {
            zzXd2.put(Character.valueOf("ヽヾゝゞ々〻".charAt(i9)), 9);
        }
        for (int i10 = 0; i10 <= 0; i10++) {
            zzXd2.put(Character.valueOf("ー".charAt(0)), 10);
        }
        for (int i11 = 0; i11 < 42; i11++) {
            zzXd2.put(Character.valueOf("ぁぃぅぇぉァィゥェォっゃゅょゎゕゖッャュョヮヵヶㇰㇱㇲㇳㇴㇵㇶㇷㇸㇹㇺㇻㇼㇽㇾㇿㇷ゚".charAt(i11)), 11);
        }
        for (int i12 = 0; i12 < 6; i12++) {
            zzXd2.put(Character.valueOf("￥＄￡＃€№".charAt(i12)), 12);
        }
        for (int i13 = 0; i13 < 32; i13++) {
            zzXd2.put(Character.valueOf("°′″℃￠％‰㏋ℓ㌃㌍㌔㌘㌢㌣㌦㌧㌫㌶㌻㍉㍊㍍㍑㍗㎎㎏㎜㎝㎞㎡㏄".charAt(i13)), 13);
        }
    }

    public static int zzZD(zzYAU zzyau) throws Exception {
        int iZzZo6 = zzyau.zzZo6();
        if (iZzZo6 != 9217) {
            if (iZzZo6 != 10754) {
                return iZzZo6 != 10782 ? 0 : 15;
            }
            return 22;
        }
        if (((zzY9S) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9S.class)) != null) {
            return zzX((zzY9S) zzyau);
        }
        return 0;
    }

    private static boolean zzlZ(int i) {
        return i == 1 || i == 2 || i == 4 || i == 5 || i == 6 || i == 7;
    }
}

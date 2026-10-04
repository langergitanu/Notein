package com.aspose.slides.internal.p267m6;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.firestore.local.SQLitePersistence;

/* JADX INFO: renamed from: com.aspose.slides.internal.m6.to */
/* JADX INFO: loaded from: classes4.dex */
public class C6323to {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f17984k4 = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, SQLitePersistence.MAX_ARGS, 1000};

    /* JADX INFO: renamed from: x1 */
    private static final String f17988x1 = C14113y2.m67408k4("あいうえおかきくけこ", "さしすせそたちつてと", "なにぬねのはひふへほ", "まみむめもやゆよらり", "るれろわをん");

    /* JADX INFO: renamed from: kk */
    private static final String f17985kk = C14113y2.m67408k4("いろはにほへとちりぬ", "るをわかよたれそつね", "ならむうゐのおくやま", "けふこえてあさきゆめ", "みしゑひもせす");

    /* JADX INFO: renamed from: to */
    private static final String f17987to = C14113y2.m67408k4("アイウエオカキクケコ", "サシスセソタチツテト", "ナニヌネノハヒフヘホ", "マミムメモヤユヨラリ", "ルレロワヲン");

    /* JADX INFO: renamed from: du */
    private static final String f17982du = C14113y2.m67408k4("イロハニホヘトチリヌ", "ルヲワカヨタレソツネ", "ナラムウヰノオクヤマ", "ケフコエテアサキユメ", "ミシヱヒモセスン");

    /* JADX INFO: renamed from: h4 */
    private static final String f17983h4 = C14113y2.m67408k4("ｱｲｳｴｵｶｷｸｹｺ", "ｻｼｽｾｿﾀﾁﾂﾃﾄ", "ﾅﾆﾇﾈﾉﾊﾋﾌﾍﾎ", "ﾏﾐﾑﾒﾓﾔﾕﾖﾗﾘ", "ﾙﾚﾛﾜｦﾝ");

    /* JADX INFO: renamed from: m9 */
    private static final String f17986m9 = C14113y2.m67408k4("ｲﾛﾊﾆﾎﾍﾄﾁﾘﾇ", "ﾙｦﾜｶﾖﾀﾚｿﾂﾈ", "ﾅﾗﾑｳヰﾉｵｸﾔﾏ", "ｹﾌｺｴﾃｱｻｷﾕﾒ", "ﾐｼヱﾋﾓｾｽﾝ");

    /* JADX INFO: renamed from: k4 */
    public static void m25889k4(C6765kp c6765kp, double d, char c, int i) {
        int i2 = 7;
        char[] cArr = new char[7];
        int iM27462to = C7019kk.m27462to(Double.valueOf(d), 14);
        while (iM27462to > i) {
            int i3 = iM27462to - 1;
            int i4 = i3 / i;
            i2--;
            cArr[i2] = (char) ((i3 - (i4 * i)) + c);
            iM27462to = i4;
        }
        int i5 = i2 - 1;
        cArr[i5] = (char) ((iM27462to - 1) + c);
        c6765kp.m26799k4(cArr, i5, 7 - i5);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25890k4(C6765kp c6765kp, double d, boolean z) {
        int iM27462to = C7019kk.m27462to(Double.valueOf(d), 14);
        String str = z ? "IIVIXXLXCCDCM" : "iivixxlxccdcm";
        int length = f17984k4.length;
        while (true) {
            int i = length - 1;
            if (length == 0) {
                return;
            }
            while (true) {
                int i2 = f17984k4[i];
                if (iM27462to >= i2) {
                    iM27462to -= i2;
                    c6765kp.m26793k4(str, i, (i & 1) + 1);
                }
            }
            length = i;
        }
    }
}

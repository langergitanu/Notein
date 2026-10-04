package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ezy {

    /* JADX INFO: renamed from: du */
    private static final Dictionary<String, String> f4948du;

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Character, String> f4949k4;

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<Character, String> f4950kk;

    /* JADX INFO: renamed from: to */
    private static final Dictionary<String, Character> f4951to;

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<Character, String> f4952x1;

    static {
        Dictionary<Character, String> dictionary = new Dictionary<>(113);
        f4949k4 = dictionary;
        Dictionary<Character, String> dictionary2 = new Dictionary<>(113);
        f4952x1 = dictionary2;
        Dictionary<Character, String> dictionary3 = new Dictionary<>(113);
        f4950kk = dictionary3;
        f4951to = new Dictionary<>(StyleIdentifier.LIST_TABLE_4_ACCENT_2);
        m5797k4("𝑎𝑏𝑐𝑑𝑒𝑓𝑔ℎ𝑖𝑗𝑘𝑙𝑚𝑛𝑜𝑝𝑞𝑟𝑠𝑡𝑢𝑣𝑤𝑥𝑦𝑧𝐴𝐵𝐶𝐷𝐸𝐹𝐺𝐻𝐼𝐽𝐾𝐿𝑀𝑁𝑂𝑃𝑄𝑅𝑆𝑇𝑈𝑉𝑊𝑋𝑌𝑍0123456789𝛢𝛣𝛤𝛥𝛦𝛧𝛨𝛩𝛪𝛫𝛬𝛭𝛮𝛯𝛰𝛱𝛲𝛴𝛵𝛶𝛷𝛸𝛹𝛺𝛼𝛽𝛾𝛿𝜀𝜁𝜂𝜃𝜄𝜅𝜆𝜇𝜈𝜉𝜊𝜋𝜌𝜍𝜎𝜏𝜐𝜙𝜑𝜒𝜓𝜔𝜖", dictionary);
        m5797k4("𝐚𝐛𝐜𝐝𝐞𝐟𝐠𝐡𝐢𝐣𝐤𝐥𝐦𝐧𝐨𝐩𝐪𝐫𝐬𝐭𝐮𝐯𝐰𝐱𝐲𝐳𝐀𝐁𝐂𝐃𝐄𝐅𝐆𝐇𝐈𝐉𝐊𝐋𝐌𝐍𝐎𝐏𝐐𝐑𝐒𝐓𝐔𝐕𝐖𝐗𝐘𝐙𝟎𝟏𝟐𝟑𝟒𝟓𝟔𝟕𝟖𝟗𝚨𝚩𝚪𝚫𝚬𝚭𝚮𝚯𝚰𝚱𝚲𝚳𝚴𝚵𝚶𝚷𝚸𝚺𝚻𝚼𝚽𝚾𝚿𝛀𝛂𝛃𝛄𝛅𝛆𝛇𝛈𝛉𝛊𝛋𝛌𝛍𝛎𝛏𝛐𝛑𝛒𝛓𝛔𝛕𝛖𝛟𝛗𝛘𝛙𝛚𝛜", dictionary2);
        m5797k4("𝒂𝒃𝒄𝒅𝒆𝒇𝒈𝒉𝒊𝒋𝒌𝒍𝒎𝒏𝒐𝒑𝒒𝒓𝒔𝒕𝒖𝒗𝒘𝒙𝒚𝒛𝑨𝑩𝑪𝑫𝑬𝑭𝑮𝑯𝑰𝑱𝑲𝑳𝑴𝑵𝑶𝑷𝑸𝑹𝑺𝑻𝑼𝑽𝑾𝑿𝒀𝒁𝟎𝟏𝟐𝟑𝟒𝟓𝟔𝟕𝟖𝟗𝜜𝜝𝜞𝜟𝜠𝜡𝜢𝜣𝜤𝜥𝜦𝜧𝜨𝜩𝜪𝜫𝜬𝜮𝜯𝜰𝜱𝜲𝜳𝜴𝜶𝜷𝜸𝜹𝜺𝜻𝜼𝜽𝜾𝜿𝝀𝝁𝝂𝝃𝝄𝝅𝝆𝝇𝝈𝝉𝝊𝝓𝝋𝝌𝝍𝝎𝝐", dictionary3);
        f4948du = new Dictionary<>(3);
        m5796k4();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m5795k4(String str, int i) {
        Dictionary<Character, String> dictionary;
        String string;
        int i2;
        String strM67443x1;
        C6765kp c6765kp = new C6765kp(str);
        if (1 != i) {
            C6765kp c6765kp2 = new C6765kp();
            int i3 = 0;
            while (true) {
                if (i3 >= str.length()) {
                    break;
                }
                int i4 = C14117yj.m67514du(str.charAt(i3)) ? 2 : 1;
                Character[] chArr = {0};
                boolean zTryGetValue = f4951to.tryGetValue(C14113y2.m67443x1(str, i3, i4), chArr);
                char cCharValue = chArr[0].charValue();
                if (zTryGetValue) {
                    c6765kp2.m26780k4(cCharValue);
                } else {
                    c6765kp2.m26793k4(str, i3, i4);
                }
                i3 += i4;
            }
            if (i == 0) {
                dictionary = f4949k4;
                string = c6765kp2.toString();
                c6765kp = new C6765kp();
                i2 = 0;
                while (i2 < string.length()) {
                    int i5 = C14117yj.m67514du(string.charAt(i2)) ? 2 : 1;
                    if (i5 > 1) {
                        strM67443x1 = C14113y2.m67443x1(string, i2, i5);
                    } else {
                        String[] strArr = {null};
                        boolean zTryGetValue2 = dictionary.tryGetValue(Character.valueOf(string.charAt(i2)), strArr);
                        strM67443x1 = strArr[0];
                        if (!zTryGetValue2) {
                            c6765kp.m26780k4(string.charAt(i2));
                        }
                        i2 += i5;
                    }
                    c6765kp.m26792k4(strM67443x1);
                    i2 += i5;
                }
            } else {
                if (i == 2) {
                    dictionary = f4952x1;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new NotSupportedException(C14113y2.m67402k4("The '{0}' font style is not supported by the ConvertMathSymbols function.", C14042ak.m66410k4(n4n.class, i)));
                    }
                    dictionary = f4950kk;
                }
                string = c6765kp2.toString();
                c6765kp = new C6765kp();
                i2 = 0;
                while (i2 < string.length()) {
                }
            }
        }
        Dictionary.Enumerator<String, String> it = f4948du.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                c6765kp.m26794k4((String) next.getKey(), (String) next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5796k4() {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            char cCharAt = "-*'".charAt(i2);
            int i3 = C14117yj.m67514du("−∗′".charAt(i)) ? 2 : 1;
            f4948du.set_Item(C14113y2.m67389k4(cCharAt, 1), C14113y2.m67443x1("−∗′", i, i3));
            i += i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5797k4(String str, Dictionary<Character, String> dictionary) {
        int i = 0;
        for (int i2 = 0; i2 < 113; i2++) {
            char cCharAt = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρςστυφϕχψωϵ".charAt(i2);
            int i3 = C14117yj.m67514du(str.charAt(i)) ? 2 : 1;
            String strM67443x1 = C14113y2.m67443x1(str, i, i3);
            dictionary.set_Item(Character.valueOf(cCharAt), strM67443x1);
            f4951to.set_Item(strM67443x1, Character.valueOf(cCharAt));
            i += i3;
        }
    }
}

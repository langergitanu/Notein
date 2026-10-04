package com.aspose.slides.internal.p502xk;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p048bv.InterfaceC1858du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10018x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xk.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12544x1 {

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<Integer, String> f42024k4;

    /* JADX INFO: renamed from: x1 */
    private static Dictionary<String, Integer> f42025x1;

    /* JADX INFO: renamed from: ak */
    public static int m58445ak(int i) {
        return i < 1000 ? i + 1000 : i;
    }

    /* JADX INFO: renamed from: ar */
    public static boolean m58446ar(int i) {
        if (i < 6016 || i > 6143) {
            return i >= 6624 && i <= 6655;
        }
        return true;
    }

    /* JADX INFO: renamed from: b3 */
    public static boolean m58447b3(int i) {
        if (i < 12448 || i > 12543) {
            return i >= 12784 && i <= 12799;
        }
        return true;
    }

    /* JADX INFO: renamed from: bv */
    public static boolean m58448bv(int i) {
        if (i >= 4608 && i <= 4991) {
            return true;
        }
        if (i >= 4992 && i <= 5023) {
            return true;
        }
        if (i < 11648 || i > 11743) {
            return i >= 43776 && i <= 43823;
        }
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public static boolean m58449c5(int i) {
        if (i < 4256 || i > 4351) {
            return i >= 11520 && i <= 11567;
        }
        return true;
    }

    /* JADX INFO: renamed from: ck */
    public static boolean m58450ck(int i) {
        return i >= 2560 && i <= 2687;
    }

    /* JADX INFO: renamed from: dq */
    public static String m58451dq(int i) {
        Dictionary<Integer, String> dictionaryM58477x1 = m58477x1();
        if (dictionaryM58477x1 != null && dictionaryM58477x1.containsKey(Integer.valueOf(i))) {
            return dictionaryM58477x1.get_Item(Integer.valueOf(i));
        }
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: du */
    public static boolean m58452du(int i) {
        if (i >= 1536 && i <= 1791) {
            return true;
        }
        if (i >= 1872 && i <= 1919) {
            return true;
        }
        if (i < 64336 || i > 65023) {
            return i >= 65136 && i <= 65279;
        }
        return true;
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m58453dy(int i) {
        if (i >= 1024 && i <= 1279) {
            return true;
        }
        if (i >= 1280 && i <= 1327) {
            return true;
        }
        if (i < 11744 || i > 11775) {
            return i >= 42560 && i <= 42655;
        }
        return true;
    }

    /* JADX INFO: renamed from: fa */
    public static boolean m58454fa(int i) {
        if (i < 2304 || i > 2431) {
            return i >= 43232 && i <= 43263;
        }
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m58455h4(int i) {
        if (i < 880 || i > 1023) {
            return i >= 7936 && i <= 8191;
        }
        return true;
    }

    /* JADX INFO: renamed from: ix */
    public static boolean m58456ix(int i) {
        return i >= 2944 && i <= 3071;
    }

    /* JADX INFO: renamed from: jd */
    public static boolean m58457jd(int i) {
        if (i >= 4352 && i <= 4607) {
            return true;
        }
        if (i >= 12592 && i <= 12687) {
            return true;
        }
        if (i >= 43360 && i <= 43391) {
            return true;
        }
        if (i < 44032 || i > 55203) {
            return i >= 55216 && i <= 55295;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m58458k4(InterfaceC1858du interfaceC1858du) {
        Integer numValueOf;
        int iValueOf;
        Dictionary dictionary = new Dictionary();
        int iMo9715m9 = interfaceC1858du.mo9715m9();
        for (int i = 0; i < iMo9715m9; i++) {
            char cMo9716to = interfaceC1858du.mo9716to(i);
            if (dictionary.containsKey(Integer.valueOf(m58476wy(cMo9716to)))) {
                int iIntValue = ((Integer) dictionary.get_Item(Integer.valueOf(m58476wy(cMo9716to)))).intValue();
                numValueOf = Integer.valueOf(m58476wy(cMo9716to));
                iValueOf = Integer.valueOf(iIntValue + 1);
            } else {
                numValueOf = Integer.valueOf(m58476wy(cMo9716to));
                iValueOf = 0;
            }
            dictionary.addItem(numValueOf, iValueOf);
        }
        Dictionary.Enumerator it = dictionary.iterator();
        int iIntValue2 = -1;
        int iIntValue3 = -1;
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                int iIntValue4 = ((Integer) next.getKey()).intValue();
                if (iIntValue4 != 998 && iIntValue4 != 999 && ((Integer) next.getValue()).intValue() > iIntValue3) {
                    iIntValue3 = ((Integer) next.getValue()).intValue();
                    iIntValue2 = ((Integer) next.getKey()).intValue();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (iIntValue2 < 0) {
            return 998;
        }
        return iIntValue2;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m58462kk(int i) {
        if (i < 1424 || i > 1535) {
            return i >= 64256 && i <= 64335;
        }
        return true;
    }

    /* JADX INFO: renamed from: ks */
    public static boolean m58463ks(int i) {
        return i >= 2816 && i <= 2943;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m58464lr(int i) {
        return i >= 12544 && i <= 12591;
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m58465m9(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        if (i >= 97 && i <= 122) {
            return true;
        }
        if (i >= 192 && i <= 214) {
            return true;
        }
        if (i >= 216 && i <= 223) {
            return true;
        }
        if (i >= 224 && i <= 246) {
            return true;
        }
        if (i >= 248 && i <= 255) {
            return true;
        }
        if (i >= 256 && i <= 383) {
            return true;
        }
        if (i >= 384 && i <= 591) {
            return true;
        }
        if (i >= 7680 && i <= 7935) {
            return true;
        }
        if (i >= 11360 && i <= 11391) {
            return true;
        }
        if (i < 42784 || i > 43007) {
            return i >= 64256 && i <= 64271;
        }
        return true;
    }

    /* JADX INFO: renamed from: ne */
    public static boolean m58466ne(int i) {
        return i >= 3072 && i <= 3199;
    }

    /* JADX INFO: renamed from: qq */
    public static boolean m58467qq(int i) {
        return i >= 3584 && i <= 3711;
    }

    /* JADX INFO: renamed from: rv */
    public static boolean m58468rv(int i) {
        return i >= 3840 && i <= 4095;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m58469to(int i) {
        return i >= 6144 && i <= 6319;
    }

    /* JADX INFO: renamed from: u4 */
    public static boolean m58470u4(int i) {
        return i >= 3328 && i <= 3455;
    }

    /* JADX INFO: renamed from: um */
    public static boolean m58471um(int i) {
        return i >= 3712 && i <= 3839;
    }

    /* JADX INFO: renamed from: up */
    public static boolean m58472up(int i) {
        return i >= 2688 && i <= 2815;
    }

    /* JADX INFO: renamed from: uz */
    public static boolean m58473uz(int i) {
        return i >= 3456 && i <= 3583;
    }

    /* JADX INFO: renamed from: v4 */
    public static boolean m58474v4(int i) {
        if (i >= 13312 && i <= 19903) {
            return true;
        }
        if (i >= 19968 && i <= 40959) {
            return true;
        }
        if (i >= 63744 && i <= 64255) {
            return true;
        }
        if (i >= 131072 && i <= 173791) {
            return true;
        }
        if (i < 173824 || i > 177983) {
            return i >= 194560 && i <= 195103;
        }
        return true;
    }

    /* JADX INFO: renamed from: wl */
    public static boolean m58475wl(int i) {
        if (i < 4096 || i > 4255) {
            return i >= 43616 && i <= 43647;
        }
        return true;
    }

    /* JADX INFO: renamed from: wy */
    public static int m58476wy(int i) {
        int i2;
        if (C10018x1.m49179m9(i) || m58461k4(i) || m58478x1(i)) {
            return 998;
        }
        if (m58465m9(i)) {
            return 215;
        }
        if (m58453dy(i)) {
            return 220;
        }
        if (m58455h4(i)) {
            return 200;
        }
        if (m58474v4(i)) {
            return 500;
        }
        if (m58464lr(i)) {
            return StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1;
        }
        if (m58447b3(i) || m58480yd(i)) {
            return 410;
        }
        if (m58457jd(i)) {
            return StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1;
        }
        if (m58452du(i)) {
            return 160;
        }
        if (m58462kk(i)) {
            return 125;
        }
        if (m58469to(i)) {
            return 145;
        }
        if (m58449c5(i)) {
            return 240;
        }
        if (m58450ck(i)) {
            i2 = StyleIdentifier.GRID_TABLE_3_ACCENT_5;
        } else if (m58454fa(i)) {
            i2 = 315;
        } else if (m58472up(i)) {
            i2 = StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6;
        } else if (m58481yj(i)) {
            i2 = StyleIdentifier.LIST_TABLE_5_DARK;
        } else if (m58463ks(i)) {
            i2 = StyleIdentifier.LIST_TABLE_6_COLORFUL;
        } else {
            if (m58468rv(i)) {
                return StyleIdentifier.LIST_TABLE_2_ACCENT_1;
            }
            if (m58479x6(i)) {
                i2 = StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2;
            } else if (m58466ne(i)) {
                i2 = StyleIdentifier.LIST_TABLE_3_ACCENT_3;
            } else if (m58456ix(i)) {
                i2 = StyleIdentifier.LIST_TABLE_4_ACCENT_3;
            } else {
                if (!m58470u4(i)) {
                    return m58473uz(i) ? StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_3 : m58475wl(i) ? StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 : m58467qq(i) ? StyleIdentifier.LIST_TABLE_3_ACCENT_4 : m58446ar(i) ? StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4 : m58471um(i) ? StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4 : m58448bv(i) ? 430 : 998;
                }
                i2 = StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3;
            }
        }
        return m58445ak(i2);
    }

    /* JADX INFO: renamed from: x1 */
    private static Dictionary<Integer, String> m58477x1() {
        if (f42024k4 == null) {
            m58459k4();
        }
        return f42024k4;
    }

    /* JADX INFO: renamed from: x6 */
    public static boolean m58479x6(int i) {
        return i >= 3072 && i <= 3199;
    }

    /* JADX INFO: renamed from: yd */
    public static boolean m58480yd(int i) {
        return i >= 12352 && i <= 12447;
    }

    /* JADX INFO: renamed from: yj */
    public static boolean m58481yj(int i) {
        return i >= 2432 && i <= 2559;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58459k4() {
        Dictionary<Integer, String> dictionary = new Dictionary<>();
        Dictionary<String, Integer> dictionary2 = new Dictionary<>();
        m58460k4(dictionary, dictionary2, 125, "hebr");
        m58460k4(dictionary, dictionary2, 145, "mong");
        m58460k4(dictionary, dictionary2, 160, "arab");
        m58460k4(dictionary, dictionary2, 200, "grek");
        m58460k4(dictionary, dictionary2, 215, "latn");
        m58460k4(dictionary, dictionary2, 220, "cyrl");
        m58460k4(dictionary, dictionary2, 240, "geor");
        m58460k4(dictionary, dictionary2, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1, "bopo");
        m58460k4(dictionary, dictionary2, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1, "hang");
        m58460k4(dictionary, dictionary2, StyleIdentifier.GRID_TABLE_3_ACCENT_5, "guru");
        m58460k4(dictionary, dictionary2, 1310, "gur2");
        m58460k4(dictionary, dictionary2, 315, "deva");
        m58460k4(dictionary, dictionary2, 1315, "dev2");
        m58460k4(dictionary, dictionary2, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6, "gujr");
        m58460k4(dictionary, dictionary2, 1320, "gjr2");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_5_DARK, "beng");
        m58460k4(dictionary, dictionary2, 1326, "bng2");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_6_COLORFUL, "orya");
        m58460k4(dictionary, dictionary2, 1327, "ory2");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_2_ACCENT_1, "tibt");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, "telu");
        m58460k4(dictionary, dictionary2, 1340, "tel2");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_3_ACCENT_3, "knda");
        m58460k4(dictionary, dictionary2, 1345, "knd2");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_4_ACCENT_3, "taml");
        m58460k4(dictionary, dictionary2, 1346, "tml2");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3, "mlym");
        m58460k4(dictionary, dictionary2, 1347, "mlm2");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_3, "sinh");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, "mymr");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_3_ACCENT_4, "thai");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4, "khmr");
        m58460k4(dictionary, dictionary2, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4, "laoo");
        m58460k4(dictionary, dictionary2, 410, "hira");
        m58460k4(dictionary, dictionary2, 430, "ethi");
        m58460k4(dictionary, dictionary2, 500, "hani");
        m58460k4(dictionary, dictionary2, 410, "kana");
        m58460k4(dictionary, dictionary2, 995, "zmth");
        m58460k4(dictionary, dictionary2, 996, "zsym");
        m58460k4(dictionary, dictionary2, 998, "zyyy");
        m58460k4(dictionary, dictionary2, 999, "zzzz");
        f42024k4 = dictionary;
        f42025x1 = dictionary2;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m58478x1(int i) {
        return i >= 48 && i <= 57;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58460k4(Dictionary<Integer, String> dictionary, Dictionary<String, Integer> dictionary2, int i, String str) {
        dictionary.addItem(Integer.valueOf(i), str);
        dictionary2.addItem(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m58461k4(int i) {
        if (i >= 33 && i <= 47) {
            return true;
        }
        if (i >= 58 && i <= 64) {
            return true;
        }
        if (i >= 95 && i <= 96) {
            return true;
        }
        if (i >= 126 && i <= 126) {
            return true;
        }
        if (i >= 126 && i <= 126) {
            return true;
        }
        if (i >= 161 && i <= 191) {
            return true;
        }
        if (i >= 215 && i <= 215) {
            return true;
        }
        if (i < 247 || i > 247) {
            return i >= 8192 && i <= 8303;
        }
        return true;
    }
}

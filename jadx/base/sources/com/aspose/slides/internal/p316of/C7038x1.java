package com.aspose.slides.internal.p316of;

import com.aspose.slides.internal.p154gr.C4378x1;
import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p274mh.AbstractC6384k4;
import com.aspose.slides.internal.p274mh.C6385kk;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.words.EditingLanguage;
import com.aspose.words.TableStyleOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.of.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7038x1 {

    /* JADX INFO: renamed from: k4 */
    private static AbstractC6384k4 f19189k4 = new C6385kk();

    /* JADX INFO: renamed from: x1 */
    private static C7038x1 f19190x1 = null;

    /* JADX INFO: renamed from: du */
    private AbstractC4584k4[][] f19191du;

    /* JADX INFO: renamed from: kk */
    private Map<EnumC7034k4, Float> f19192kk;

    /* JADX INFO: renamed from: to */
    private String[][] f19193to;

    private C7038x1() {
        this.f19192kk = null;
        this.f19193to = null;
        this.f19191du = null;
        this.f19192kk = new HashMap();
        this.f19193to = m27523g8();
        this.f19191du = m27538sv();
    }

    /* JADX INFO: renamed from: ak */
    public static String[] m27510ak() {
        return (String[]) C7032du.f19113b3.clone();
    }

    /* JADX INFO: renamed from: ar */
    public static String[] m27511ar() {
        return (String[]) C7032du.f19141wl.clone();
    }

    /* JADX INFO: renamed from: b3 */
    public static String[] m27512b3() {
        return (String[]) C7032du.f19129lr.clone();
    }

    /* JADX INFO: renamed from: bv */
    public static String[] m27513bv() {
        return (String[]) C7032du.f19112ar.clone();
    }

    /* JADX INFO: renamed from: bz */
    public static String[] m27514bz() {
        return (String[]) C7032du.f19135ts.clone();
    }

    /* JADX INFO: renamed from: c5 */
    public static String[] m27515c5() {
        return (String[]) C7032du.f19120dy.clone();
    }

    /* JADX INFO: renamed from: c6 */
    public static String[] m27516c6() {
        return (String[]) C7032du.f19118dq.clone();
    }

    /* JADX INFO: renamed from: ck */
    public static String[] m27517ck() {
        return (String[]) C7032du.f19125jd.clone();
    }

    /* JADX INFO: renamed from: dq */
    public static String[] m27518dq() {
        return (String[]) C7032du.f19142wy.clone();
    }

    /* JADX INFO: renamed from: du */
    public static String[] m27519du() {
        return (String[]) C7032du.f19143x1.clone();
    }

    /* JADX INFO: renamed from: dy */
    public static String[] m27520dy() {
        return (String[]) C7032du.f19130m9.clone();
    }

    /* JADX INFO: renamed from: e0 */
    public static String[] m27521e0() {
        return (String[]) C7032du.f19145xk.clone();
    }

    /* JADX INFO: renamed from: fa */
    public static String[] m27522fa() {
        return (String[]) C7032du.f19117ck.clone();
    }

    /* JADX INFO: renamed from: g8 */
    private String[][] m27523g8() {
        String[][] strArr = {m27519du(), m27524h4(), m27533m9(), m27520dy(), m27515c5(), m27526jd(), m27517ck(), m27522fa(), m27543up(), m27551yj(), m27531ks(), m27537rv(), m27548x6(), m27534ne(), m27525ix(), m27541u4(), m27544uz(), m27546wl(), m27536qq(), m27511ar(), m27542um(), m27513bv(), m27545v4(), m27532lr(), m27550yd(), m27512b3(), m27547wy(), m27510ak(), m27518dq(), m27549xk(), m27516c6(), m27521e0(), m27540ts(), m27514bz(), m27535qm()};
        this.f19193to = strArr;
        return strArr;
    }

    /* JADX INFO: renamed from: h4 */
    public static String[] m27524h4() {
        return (String[]) C7032du.f19134to.clone();
    }

    /* JADX INFO: renamed from: ix */
    public static String[] m27525ix() {
        return (String[]) C7032du.f19131ne.clone();
    }

    /* JADX INFO: renamed from: jd */
    public static String[] m27526jd() {
        return (String[]) C7032du.f19115c5.clone();
    }

    /* JADX INFO: renamed from: k4 */
    public static C7038x1 m27527k4() {
        if (f19190x1 == null) {
            f19190x1 = new C7038x1();
        }
        return f19190x1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC4584k4[] m27530kk(EnumC7034k4 enumC7034k4) {
        String[][] strArr = this.f19193to;
        String[] strArr2 = enumC7034k4 == null ? strArr[strArr.length - 1] : strArr[enumC7034k4.ordinal()];
        int length = strArr2.length;
        AbstractC4584k4[] abstractC4584k4Arr = new AbstractC4584k4[length];
        int[][] iArrM27529k4 = m27529k4(enumC7034k4);
        boolean z = false;
        for (int i = 0; i < length; i++) {
            AbstractC4584k4 abstractC4584k4M17683k4 = C4378x1.m17683k4(strArr2[i], 10.0f, f19189k4);
            if (!abstractC4584k4M17683k4.m18937x1().equals(strArr2[i])) {
                if (iArrM27529k4 != null) {
                    boolean z2 = true;
                    for (int[] iArr : iArrM27529k4) {
                        if (!abstractC4584k4M17683k4.mo18938x1(iArr[2])) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        z = true;
                    }
                }
            }
            abstractC4584k4Arr[i] = abstractC4584k4M17683k4;
        }
        if (!z && iArrM27529k4 != null) {
            AbstractC4584k4[] abstractC4584k4ArrM27528k4 = m27528k4(iArrM27529k4, f19189k4);
            if (abstractC4584k4ArrM27528k4.length > 0) {
                return abstractC4584k4ArrM27528k4;
            }
        }
        return abstractC4584k4Arr;
    }

    /* JADX INFO: renamed from: ks */
    public static String[] m27531ks() {
        return (String[]) C7032du.f19147yj.clone();
    }

    /* JADX INFO: renamed from: lr */
    public static String[] m27532lr() {
        return (String[]) C7032du.f19114bv.clone();
    }

    /* JADX INFO: renamed from: m9 */
    public static String[] m27533m9() {
        return (String[]) C7032du.f19119du.clone();
    }

    /* JADX INFO: renamed from: ne */
    public static String[] m27534ne() {
        return (String[]) C7032du.f19144x6.clone();
    }

    /* JADX INFO: renamed from: qm */
    public static String[] m27535qm() {
        return (String[]) C7032du.f19121e0.clone();
    }

    /* JADX INFO: renamed from: qq */
    public static String[] m27536qq() {
        return (String[]) C7032du.f19139uz.clone();
    }

    /* JADX INFO: renamed from: rv */
    public static String[] m27537rv() {
        return (String[]) C7032du.f19128ks.clone();
    }

    /* JADX INFO: renamed from: sv */
    private AbstractC4584k4[][] m27538sv() {
        return new AbstractC4584k4[][]{m27530kk(EnumC7034k4.CJK), m27530kk(EnumC7034k4.ARABIC), m27530kk(EnumC7034k4.THAI), m27530kk(EnumC7034k4.HINDI), m27530kk(EnumC7034k4.TAMIL), m27530kk(EnumC7034k4.TELUGU), m27530kk(EnumC7034k4.TIBET), m27530kk(EnumC7034k4.MONGOL), m27530kk(EnumC7034k4.ETHIOPIC), m27530kk(EnumC7034k4.SYRIAC), m27530kk(EnumC7034k4.THAANA), m27530kk(EnumC7034k4.ARMENIAN), m27530kk(EnumC7034k4.GEORGIAN), m27530kk(EnumC7034k4.SUPERSCRIPT), m27530kk(EnumC7034k4.SUBSCRIPT), m27530kk(EnumC7034k4.LAO), m27530kk(EnumC7034k4.KHMER), m27530kk(EnumC7034k4.THAI_EXTRA), m27530kk(EnumC7034k4.HIRAGANA), m27530kk(EnumC7034k4.KATAKANA), m27530kk(EnumC7034k4.YI_SYLLABLES), m27530kk(EnumC7034k4.CHEROKEE), m27530kk(EnumC7034k4.CANADIAN_ABORIGINAL), m27530kk(EnumC7034k4.HANGUL_JAMO), m27530kk(EnumC7034k4.FULLWIDTH), m27530kk(EnumC7034k4.BENGALI), m27530kk(EnumC7034k4.GUJARATI), m27530kk(EnumC7034k4.KANNADA), m27530kk(EnumC7034k4.MALAYALAM), m27530kk(EnumC7034k4.ORIYA), m27530kk(EnumC7034k4.SINHALA), m27530kk(EnumC7034k4.HANGUL_SYLLABLES), m27530kk(EnumC7034k4.HIGH_AND_LOW_SURROGATES), m27530kk(EnumC7034k4.LATIN), m27530kk(null)};
    }

    /* JADX INFO: renamed from: to */
    public static String[] m27539to() {
        return (String[]) C7032du.f19126k4.clone();
    }

    /* JADX INFO: renamed from: ts */
    public static String[] m27540ts() {
        return (String[]) C7032du.f19116c6.clone();
    }

    /* JADX INFO: renamed from: u4 */
    public static String[] m27541u4() {
        return (String[]) C7032du.f19124ix.clone();
    }

    /* JADX INFO: renamed from: um */
    public static String[] m27542um() {
        return (String[]) C7032du.f19132qq.clone();
    }

    /* JADX INFO: renamed from: up */
    public static String[] m27543up() {
        return (String[]) C7032du.f19122fa.clone();
    }

    /* JADX INFO: renamed from: uz */
    public static String[] m27544uz() {
        return (String[]) C7032du.f19136u4.clone();
    }

    /* JADX INFO: renamed from: v4 */
    public static String[] m27545v4() {
        return (String[]) C7032du.f19137um.clone();
    }

    /* JADX INFO: renamed from: wl */
    public static String[] m27546wl() {
        return (String[]) C7032du.f19123h4.clone();
    }

    /* JADX INFO: renamed from: wy */
    public static String[] m27547wy() {
        return (String[]) C7032du.f19146yd.clone();
    }

    /* JADX INFO: renamed from: x6 */
    public static String[] m27548x6() {
        return (String[]) C7032du.f19133rv.clone();
    }

    /* JADX INFO: renamed from: xk */
    public static String[] m27549xk() {
        return (String[]) C7032du.f19111ak.clone();
    }

    /* JADX INFO: renamed from: yd */
    public static String[] m27550yd() {
        return (String[]) C7032du.f19140v4.clone();
    }

    /* JADX INFO: renamed from: yj */
    public static String[] m27551yj() {
        return (String[]) C7032du.f19138up.clone();
    }

    /* JADX INFO: renamed from: x1 */
    public float m27553x1(EnumC7034k4 enumC7034k4) {
        if (this.f19192kk.containsKey(enumC7034k4)) {
            return this.f19192kk.get(enumC7034k4).floatValue();
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4584k4[] m27528k4(int[][] iArr, AbstractC6384k4 abstractC6384k4) {
        ArrayList arrayList = new ArrayList();
        for (C12004dy c12004dy : abstractC6384k4.m26211k4()) {
            AbstractC4584k4 abstractC4584k4M17683k4 = C4378x1.m17683k4(c12004dy.m56527du(), 10.0f, abstractC6384k4);
            boolean z = true;
            for (int[] iArr2 : iArr) {
                if (!abstractC4584k4M17683k4.mo18938x1(iArr2[2])) {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(abstractC4584k4M17683k4);
            }
        }
        return (AbstractC4584k4[]) arrayList.toArray(new AbstractC4584k4[0]);
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC4584k4[][] m27552kk() {
        return this.f19191du;
    }

    /* JADX INFO: renamed from: x1 */
    public String[][] m27554x1() {
        return this.f19193to;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[][] m27529k4(EnumC7034k4 enumC7034k4) {
        if (enumC7034k4 == EnumC7034k4.LATIN) {
            return new int[][]{new int[]{33, 127, 33}};
        }
        if (enumC7034k4 == EnumC7034k4.CJK) {
            return new int[][]{new int[]{19968, 40911, 19968}, new int[]{63744, 64255, 63744}};
        }
        if (enumC7034k4 == EnumC7034k4.ARABIC) {
            return new int[][]{new int[]{TableStyleOptions.DEFAULT_2003, 1791, TableStyleOptions.DEFAULT_2003}, new int[]{64336, 65023, 64336}, new int[]{65136, 65279, 65136}};
        }
        if (enumC7034k4 == EnumC7034k4.THAI) {
            return new int[][]{new int[]{3584, 3632, 3585}, new int[]{3663, 3711, 3585}};
        }
        if (enumC7034k4 == EnumC7034k4.THAI_EXTRA) {
            return new int[][]{new int[]{3633, 3662, 3585}};
        }
        if (enumC7034k4 == EnumC7034k4.HINDI) {
            return new int[][]{new int[]{2304, 2431, 2308}, new int[]{43232, 43263, 43232}};
        }
        if (enumC7034k4 == EnumC7034k4.TAMIL) {
            return new int[][]{new int[]{2944, 3071, 2946}};
        }
        if (enumC7034k4 == EnumC7034k4.TELUGU) {
            return new int[][]{new int[]{3072, 3199, 3072}};
        }
        if (enumC7034k4 == EnumC7034k4.TIBET) {
            return new int[][]{new int[]{3840, 4095, 3840}};
        }
        if (enumC7034k4 == EnumC7034k4.MONGOL) {
            return new int[][]{new int[]{6144, 6319, 6144}};
        }
        if (enumC7034k4 == EnumC7034k4.ETHIOPIC) {
            return new int[][]{new int[]{4608, 4991, 4608}};
        }
        if (enumC7034k4 == EnumC7034k4.SYRIAC) {
            return new int[][]{new int[]{1792, 1871, 1808}};
        }
        if (enumC7034k4 == EnumC7034k4.THAANA) {
            return new int[][]{new int[]{1920, 1983, 1920}};
        }
        if (enumC7034k4 == EnumC7034k4.ARMENIAN) {
            return new int[][]{new int[]{1328, 1423, 1329}, new int[]{64275, 64279, 64275}};
        }
        if (enumC7034k4 == EnumC7034k4.GEORGIAN) {
            return new int[][]{new int[]{4256, 4351, 4304}};
        }
        if (enumC7034k4 == EnumC7034k4.SUPERSCRIPT) {
            return new int[][]{new int[]{8304, 8305, 8304}, new int[]{8308, 8319, 8308}};
        }
        if (enumC7034k4 == EnumC7034k4.SUBSCRIPT) {
            return new int[][]{new int[]{8320, 8351, 8320}};
        }
        if (enumC7034k4 == EnumC7034k4.LAO) {
            return new int[][]{new int[]{3712, 3839, 3713}};
        }
        if (enumC7034k4 == EnumC7034k4.KHMER) {
            return new int[][]{new int[]{6016, 6143, 6016}};
        }
        if (enumC7034k4 == EnumC7034k4.HIRAGANA) {
            return new int[][]{new int[]{12352, 12447, 12353}};
        }
        if (enumC7034k4 == EnumC7034k4.KATAKANA) {
            return new int[][]{new int[]{12448, 12543, 12449}};
        }
        if (enumC7034k4 == EnumC7034k4.YI_SYLLABLES) {
            return new int[][]{new int[]{40960, 42127, 40960}};
        }
        if (enumC7034k4 == EnumC7034k4.CHEROKEE) {
            return new int[][]{new int[]{5024, 5119, 5024}};
        }
        if (enumC7034k4 == EnumC7034k4.CANADIAN_ABORIGINAL) {
            return new int[][]{new int[]{5120, 5759, EditingLanguage.ARABIC_ALGERIA}};
        }
        if (enumC7034k4 == EnumC7034k4.HANGUL_JAMO) {
            return new int[][]{new int[]{4352, 4607, 4352}, new int[]{12592, 12686, 12593}};
        }
        if (enumC7034k4 == EnumC7034k4.FULLWIDTH) {
            return new int[][]{new int[]{65281, 65374, 65281}, new int[]{65504, 65510, 65504}};
        }
        if (enumC7034k4 == EnumC7034k4.BENGALI) {
            return new int[][]{new int[]{2433, 2554, 2437}};
        }
        if (enumC7034k4 == EnumC7034k4.GUJARATI) {
            return new int[][]{new int[]{2689, 2801, 2693}};
        }
        if (enumC7034k4 == EnumC7034k4.KANNADA) {
            return new int[][]{new int[]{3202, 3314, 3205}};
        }
        if (enumC7034k4 == EnumC7034k4.MALAYALAM) {
            return new int[][]{new int[]{3328, 3455, 3333}};
        }
        if (enumC7034k4 == EnumC7034k4.ORIYA) {
            return new int[][]{new int[]{2816, 2943, 2821}};
        }
        if (enumC7034k4 == EnumC7034k4.SINHALA) {
            return new int[][]{new int[]{3456, 3583, 3461}};
        }
        if (enumC7034k4 == EnumC7034k4.HANGUL_SYLLABLES) {
            return new int[][]{new int[]{44032, 55203, 44032}};
        }
        if (enumC7034k4 == EnumC7034k4.HIGH_AND_LOW_SURROGATES) {
            return new int[][]{new int[]{55296, 57343, 55296}};
        }
        return null;
    }
}

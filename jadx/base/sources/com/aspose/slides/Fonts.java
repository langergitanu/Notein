package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Fonts implements IFonts {

    /* JADX INFO: renamed from: x1 */
    static final IGenericDictionary<String, C0421k4> f2330x1 = m1519k4(new C0421k4("ar-SA", "Arab", 2), new C0421k4("bg-BG", "Cyrl", 0), new C0421k4("ca-ES", "Latn", 0), new C0421k4("zh-TW", "Hant", 1), new C0421k4("cs-CZ", "Latn", 0), new C0421k4("da-DK", "Latn", 0), new C0421k4("de-DE", "Latn", 0), new C0421k4("el-GR", "Grek", 0), new C0421k4("en-US", "Latn", 0), new C0421k4("fi-FI", "Latn", 0), new C0421k4("fr-FR", "Latn", 0), new C0421k4("he-IL", "Hebr", 2), new C0421k4("hu-HU", "Latn", 0), new C0421k4("is-IS", "Latn", 0), new C0421k4("it-IT", "Latn", 0), new C0421k4("ja-JP", "Jpan", 1), new C0421k4("ko-KP", "Hang", 1), new C0421k4("ko-KR", "Hang", 1), new C0421k4("nl-NL", "Latn", 0), new C0421k4("nb-NO", "Latn", 0), new C0421k4("pl-PL", "Latn", 0), new C0421k4("pt-BR", "Latn", 0), new C0421k4("ro-RO", "Latn", 0), new C0421k4("ru-RU", "Cyrl", 0), new C0421k4("hr-HR", "Latn", 0), new C0421k4("sk-SK", "Latn", 0), new C0421k4("sq-AL", "Latn", 0), new C0421k4("sv-SE", "Latn", 0), new C0421k4("th-TH", "Thai", 2), new C0421k4("tr-TR", "Latn", 0), new C0421k4("ur-PK", "Arab", 2), new C0421k4("id-ID", "Latn", 0), new C0421k4("uk-UA", "Cyrl", 0), new C0421k4("be-BY", "Cyrl", 0), new C0421k4("sl-SI", "Latn", 0), new C0421k4("et-EE", "Latn", 0), new C0421k4("lv-LV", "Latn", 0), new C0421k4("lt-LT", "Latn", 0), new C0421k4("fa-IR", "Arab", 2), new C0421k4("hy-AM", "Armn", 0), new C0421k4("az-Latn-AZ", "Latn", 0), new C0421k4("eu-ES", "Latn", 0), new C0421k4("mk-MK", "Cyrl", 0), new C0421k4("af-ZA", "Latn", 0), new C0421k4("ka-GE", "Geor", 0), new C0421k4("fo-FO", "Latn", 0), new C0421k4("hi-IN", "Deva", 2), new C0421k4("ms-MY", "Latn", 0), new C0421k4("kk-KZ", "Cyrl", 0), new C0421k4("ky-KG", "Cyrl", 0), new C0421k4("sw-KE", "Latn", 0), new C0421k4("uz-Latn-UZ", "Latn", 0), new C0421k4("tt-RU", "Cyrl", 0), new C0421k4("pa-IN", "Guru", 2), new C0421k4("gu-IN", "Gujr", 2), new C0421k4("ta-IN", "Taml", 2), new C0421k4("te-IN", "Telu", 2), new C0421k4("kn-IN", "Knda", 2), new C0421k4("mr-IN", "Deva", 2), new C0421k4("sa-IN", "Deva", 2), new C0421k4("mn-MN", "Cyrl", 0), new C0421k4("gl-ES", "Latn", 0), new C0421k4("kok-IN", "Deva", 2), new C0421k4("syr-SY", "Syrc", 2), new C0421k4("dv-MV", "Thaa", 2), new C0421k4("ar-IQ", "Arab", 2), new C0421k4("zh-CN", "Hans", 1), new C0421k4("de-CH", "Latn", 0), new C0421k4("en-GB", "Latn", 0), new C0421k4("es-MX", "Latn", 0), new C0421k4("fr-BE", "Latn", 0), new C0421k4("it-CH", "Latn", 0), new C0421k4("nl-BE", "Latn", 0), new C0421k4("nn-NO", "Latn", 0), new C0421k4("pt-PT", "Latn", 0), new C0421k4("sr-Latn-CS", "Latn", 0), new C0421k4("sv-FI", "Latn", 0), new C0421k4("az-Cyrl-AZ", "Cyrl", 0), new C0421k4("ms-BN", "Latn", 0), new C0421k4("uz-Cyrl-UZ", "Cyrl", 0), new C0421k4("ar-EG", "Arab", 2), new C0421k4("zh-HK", "Hant", 1), new C0421k4("de-AT", "Latn", 0), new C0421k4("en-AU", "Latn", 0), new C0421k4("es-ES", "Latn", 0), new C0421k4("fr-CA", "Latn", 0), new C0421k4("sr-Cyrl-CS", "Cyrl", 0), new C0421k4("ar-LY", "Arab", 2), new C0421k4("zh-SG", "Hans", 1), new C0421k4("de-LU", "Latn", 0), new C0421k4("en-CA", "Latn", 0), new C0421k4("es-GT", "Latn", 0), new C0421k4("fr-CH", "Latn", 0), new C0421k4("ar-DZ", "Arab", 2), new C0421k4("zh-MO", "Hant", 1), new C0421k4("de-LI", "Latn", 0), new C0421k4("en-NZ", "Latn", 0), new C0421k4("es-CR", "Latn", 0), new C0421k4("fr-LU", "Latn", 0), new C0421k4("ar-MA", "Arab", 2), new C0421k4("en-IE", "Latn", 0), new C0421k4("es-PA", "Latn", 0), new C0421k4("fr-MC", "Latn", 0), new C0421k4("ar-TN", "Arab", 2), new C0421k4("en-ZA", "Latn", 0), new C0421k4("es-DO", "Latn", 0), new C0421k4("ar-OM", "Arab", 2), new C0421k4("en-JM", "Latn", 0), new C0421k4("es-VE", "Latn", 0), new C0421k4("ar-YE", "Arab", 2), new C0421k4("en-029", "Latn", 0), new C0421k4("es-CO", "Latn", 0), new C0421k4("ar-SY", "Arab", 2), new C0421k4("en-BZ", "Latn", 0), new C0421k4("es-PE", "Latn", 0), new C0421k4("ar-JO", "Arab", 2), new C0421k4("en-TT", "Latn", 0), new C0421k4("es-AR", "Latn", 0), new C0421k4("ar-LB", "Arab", 2), new C0421k4("en-ZW", "Latn", 0), new C0421k4("es-EC", "Latn", 0), new C0421k4("ar-KW", "Arab", 2), new C0421k4("en-PH", "Latn", 0), new C0421k4("es-CL", "Latn", 0), new C0421k4("ar-AE", "Arab", 2), new C0421k4("es-UY", "Latn", 0), new C0421k4("ar-BH", "Arab", 2), new C0421k4("es-PY", "Latn", 0), new C0421k4("ar-QA", "Arab", 2), new C0421k4("es-BO", "Latn", 0), new C0421k4("es-SV", "Latn", 0), new C0421k4("es-HN", "Latn", 0), new C0421k4("es-NI", "Latn", 0), new C0421k4("es-PR", "Latn", 0), new C0421k4("am-ET", "Ethi", 0), new C0421k4("tzm-Latn-DZ", "Latn", 0), new C0421k4("iu-Latn-CA", "Latn", 0), new C0421k4("sma-NO", "Latn", 0), new C0421k4("mn-Mong-CN", "Mong", 2), new C0421k4("gd-GB", "Latn", 0), new C0421k4("en-MY", "Latn", 0), new C0421k4("prs-AF", "Arab", 2), new C0421k4("bn-BD", "Beng", 2), new C0421k4("wo-SN", "Latn", 0), new C0421k4("rw-RW", "Latn", 0), new C0421k4("qut-GT", "Latn", 0), new C0421k4("sah-RU", "Cyrl", 0), new C0421k4("gsw-FR", "Latn", 0), new C0421k4("co-FR", "Latn", 0), new C0421k4("oc-FR", "Latn", 0), new C0421k4("mi-NZ", "Latn", 0), new C0421k4("ga-IE", "Latn", 0), new C0421k4("se-SE", "Latn", 0), new C0421k4("br-FR", "Latn", 0), new C0421k4("smn-FI", "Latn", 0), new C0421k4("moh-CA", "Latn", 0), new C0421k4("arn-CL", "Latn", 0), new C0421k4("ii-CN", "Yiii", 1), new C0421k4("dsb-DE", "Latn", 0), new C0421k4("ig-NG", "Latn", 0), new C0421k4("kl-GL", "Latn", 0), new C0421k4("lb-LU", "Latn", 0), new C0421k4("ba-RU", "Cyrl", 0), new C0421k4("nso-ZA", "Latn", 0), new C0421k4("quz-BO", "Latn", 0), new C0421k4("yo-NG", "Latn", 0), new C0421k4("ha-Latn-NG", "Latn", 0), new C0421k4("fil-PH", "Latn", 0), new C0421k4("ps-AF", "Arab", 2), new C0421k4("fy-NL", "Latn", 0), new C0421k4("ne-NP", "Deva", 2), new C0421k4("se-NO", "Latn", 0), new C0421k4("iu-Cans-CA", "Cans", 0), new C0421k4("sr-Latn-RS", "Latn", 0), new C0421k4("si-LK", "Sinh", 2), new C0421k4("sr-Cyrl-RS", "Cyrl", 0), new C0421k4("lo-LA", "Laoo", 2), new C0421k4("km-KH", "Khmr", 2), new C0421k4("cy-GB", "Latn", 0), new C0421k4("bo-CN", "Tibt", 2), new C0421k4("sms-FI", "Latn", 0), new C0421k4("as-IN", "Beng", 2), new C0421k4("ml-IN", "Mlym", 2), new C0421k4("en-IN", "Latn", 0), new C0421k4("or-IN", "Orya", 2), new C0421k4("bn-IN", "Beng", 2), new C0421k4("tk-TM", "Latn", 0), new C0421k4("bs-Latn-BA", "Latn", 0), new C0421k4("mt-MT", "Latn", 0), new C0421k4("sr-Cyrl-ME", "Cyrl", 0), new C0421k4("se-FI", "Latn", 0), new C0421k4("zu-ZA", "Latn", 0), new C0421k4("xh-ZA", "Latn", 0), new C0421k4("tn-ZA", "Latn", 0), new C0421k4("hsb-DE", "Latn", 0), new C0421k4("bs-Cyrl-BA", "Cyrl", 0), new C0421k4("tg-Cyrl-TJ", "Cyrl", 0), new C0421k4("sr-Latn-BA", "Latn", 0), new C0421k4("smj-NO", "Latn", 0), new C0421k4("rm-CH", "Latn", 0), new C0421k4("smj-SE", "Latn", 0), new C0421k4("quz-EC", "Latn", 0), new C0421k4("quz-PE", "Latn", 0), new C0421k4("hr-BA", "Latn", 0), new C0421k4("sr-Latn-ME", "Latn", 0), new C0421k4("sma-SE", "Latn", 0), new C0421k4("en-SG", "Latn", 0), new C0421k4("sr-Cyrl-BA", "Cyrl", 0), new C0421k4("es-US", "Latn", 0));

    /* JADX INFO: renamed from: c5 */
    private long f2331c5;

    /* JADX INFO: renamed from: du */
    private C14093tq<Integer> f2332du;

    /* JADX INFO: renamed from: h4 */
    private C14093tq<Integer> f2334h4;

    /* JADX INFO: renamed from: kk */
    private AbstractC0869ct f2336kk;

    /* JADX INFO: renamed from: m9 */
    private C14093tq<Integer> f2337m9;

    /* JADX INFO: renamed from: to */
    private final C13827mb f2338to;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0869ct> f2335k4 = new AbstractC7018k4<AbstractC0869ct>() { // from class: com.aspose.slides.Fonts.1
        {
            Fonts.this.f2336kk = new AbstractC0869ct() { // from class: com.aspose.slides.Fonts.1.1
                @Override // com.aspose.slides.AbstractC0869ct
                /* JADX INFO: renamed from: k4 */
                public void mo1517k4() {
                    for (AbstractC0869ct abstractC0869ct : ((AbstractC7018k4) C04201.this).f19081x1) {
                        if (abstractC0869ct != null) {
                            abstractC0869ct.mo1517k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: dy */
    private C1247ic f2333dy = new C1247ic();

    /* JADX INFO: renamed from: com.aspose.slides.Fonts$k4 */
    public static class C0421k4 {

        /* JADX INFO: renamed from: k4 */
        final String f2341k4;

        /* JADX INFO: renamed from: kk */
        final int f2342kk;

        /* JADX INFO: renamed from: x1 */
        final String f2343x1;

        public C0421k4(String str, String str2, int i) {
            this.f2341k4 = str;
            this.f2343x1 = str2;
            this.f2342kk = i;
        }
    }

    public Fonts(C13827mb c13827mb) {
        this.f2332du = new C14093tq<>();
        this.f2334h4 = new C14093tq<>();
        this.f2337m9 = new C14093tq<>();
        this.f2338to = c13827mb;
        this.f2332du = new C14093tq<>(Integer.valueOf(c13827mb.m64799k4(0, (IFontData) new FontData("Arial"))));
        this.f2334h4 = new C14093tq<>(Integer.valueOf(c13827mb.m64799k4(1, (IFontData) new FontData("Arial"))));
        this.f2337m9 = new C14093tq<>(Integer.valueOf(c13827mb.m64799k4(2, (IFontData) new FontData("Arial"))));
    }

    /* JADX INFO: renamed from: du */
    private void m1518du() {
        AbstractC0869ct abstractC0869ct = this.f2336kk;
        if (abstractC0869ct == null || this.f2335k4.m27430k4()) {
            return;
        }
        abstractC0869ct.mo1517k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static IGenericDictionary<String, C0421k4> m1519k4(C0421k4... c0421k4Arr) {
        Dictionary dictionary = new Dictionary(AbstractC14070jw.m66790x1());
        for (C0421k4 c0421k4 : c0421k4Arr) {
            dictionary.addItem(c0421k4.f2341k4, c0421k4);
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: to */
    private void m1522to() {
        this.f2331c5++;
        m1518du();
    }

    @Override // com.aspose.slides.IFonts
    public final IFontData getComplexScriptFont() {
        if (this.f2337m9.m67302x1()) {
            return this.f2338to.m64802k4(this.f2337m9.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    @Override // com.aspose.slides.IFonts
    public final IFontData getEastAsianFont() {
        if (this.f2334h4.m67302x1()) {
            return this.f2338to.m64802k4(this.f2334h4.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    @Override // com.aspose.slides.IFonts
    public final IFontData getLatinFont() {
        if (this.f2332du.m67302x1()) {
            return this.f2338to.m64802k4(this.f2332du.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final long m1526kk() {
        return this.f2331c5;
    }

    @Override // com.aspose.slides.IFonts
    public final void setComplexScriptFont(IFontData iFontData) {
        if (iFontData != null) {
            this.f2337m9 = new C14093tq<>(Integer.valueOf(this.f2338to.m64799k4(2, iFontData)));
        }
        m1522to();
    }

    @Override // com.aspose.slides.IFonts
    public final void setEastAsianFont(IFontData iFontData) {
        if (iFontData != null) {
            this.f2334h4 = new C14093tq<>(Integer.valueOf(this.f2338to.m64799k4(1, iFontData)));
        }
        m1522to();
    }

    @Override // com.aspose.slides.IFonts
    public final void setLatinFont(IFontData iFontData) {
        if (iFontData != null) {
            this.f2332du = new C14093tq<>(Integer.valueOf(this.f2338to.m64799k4(0, iFontData)));
        }
        m1522to();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1527x1() {
        return C14093tq.m67295k4(this.f2337m9, new C14093tq(65535));
    }

    /* JADX INFO: renamed from: k4 */
    public final C1247ic m1523k4() {
        return this.f2333dy;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m1521k4(String str) {
        C0421k4[] c0421k4Arr = {null};
        return !C14113y2.m67411k4(str) && f2330x1.tryGetValue(str, c0421k4Arr) ? c0421k4Arr[0].f2343x1 : "Latn";
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1524k4(Fonts fonts) {
        fonts.f2332du.CloneTo(this.f2332du);
        fonts.f2334h4.CloneTo(this.f2334h4);
        fonts.f2337m9.CloneTo(this.f2337m9);
        if (fonts.f2333dy.m7619x1() != null) {
            this.f2333dy.m7617k4(fonts.f2333dy.m7619x1().m29645to());
        }
        m1522to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1525k4(IFontsEffectiveData iFontsEffectiveData) {
        this.f2332du = new C14093tq<>(Integer.valueOf(this.f2338to.m64799k4(0, iFontsEffectiveData.getLatinFont())));
        this.f2334h4 = new C14093tq<>(Integer.valueOf(this.f2338to.m64799k4(1, iFontsEffectiveData.getEastAsianFont())));
        this.f2337m9 = new C14093tq<>(Integer.valueOf(this.f2338to.m64799k4(2, iFontsEffectiveData.getComplexScriptFont())));
        if (C7019kk.m27469x1(iFontsEffectiveData, C13839mj.class)) {
            C13839mj c13839mj = (C13839mj) iFontsEffectiveData;
            this.f2333dy.m7615k4().clear();
            Dictionary.KeyCollection.Enumerator<String, String> it = c13839mj.f46241k4.m7615k4().getKeys().iterator();
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    this.f2333dy.m7615k4().addItem(next, c13839mj.f46241k4.m7615k4().get_Item(next));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (c13839mj.f46241k4.m7619x1() != null) {
                this.f2333dy.m7617k4(c13839mj.f46241k4.m7619x1().m29645to());
            }
        }
        m1522to();
    }
}

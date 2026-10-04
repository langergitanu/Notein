package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C9774jd extends AbstractC9769fa {

    /* JADX INFO: renamed from: x1 */
    private static final int[] f35309x1 = {EditingLanguage.AFRIKAANS, 1052, 1025, EditingLanguage.ARABIC_IRAQ, EditingLanguage.ARABIC_EGYPT, EditingLanguage.ARABIC_LIBYA, EditingLanguage.ARABIC_ALGERIA, EditingLanguage.ARABIC_MOROCCO, EditingLanguage.ARABIC_TUNISIA, EditingLanguage.ARABIC_OMAN, EditingLanguage.ARABIC_YEMEN, EditingLanguage.ARABIC_SYRIA, EditingLanguage.ARABIC_JORDAN, EditingLanguage.ARABIC_LEBANON, EditingLanguage.ARABIC_KUWAIT, EditingLanguage.ARABIC_UAE, EditingLanguage.ARABIC_BAHRAIN, EditingLanguage.ARABIC_QATAR, EditingLanguage.ARMENIAN, EditingLanguage.ASSAMESE, EditingLanguage.AZERBAIJANI_LATIN, EditingLanguage.AZERBAIJANI_CYRILLIC, EditingLanguage.BASQUE, EditingLanguage.BELARUSIAN, EditingLanguage.BANGLA_INDIA, EditingLanguage.BULGARIAN, EditingLanguage.BURMESE, EditingLanguage.CATALAN, EditingLanguage.CHINESE_TAIWAN, 2052, EditingLanguage.CHINESE_HONG_KONG, EditingLanguage.CHINESE_SINGAPORE, EditingLanguage.CHINESE_MACAO, 1050, EditingLanguage.CZECH, EditingLanguage.DANISH, EditingLanguage.DUTCH_NETHERLANDS, EditingLanguage.DUTCH_BELGIUM, EditingLanguage.ENGLISH_US, EditingLanguage.ENGLISH_UK, EditingLanguage.ENGLISH_AUSTRALIA, EditingLanguage.ENGLISH_CANADA, EditingLanguage.ENGLISH_NEW_ZEALAND, EditingLanguage.ENGLISH_IRELAND, EditingLanguage.ENGLISH_SOUTH_AFRICA, EditingLanguage.ENGLISH_JAMAICA, EditingLanguage.ENGLISH_CARIBBEAN, EditingLanguage.ENGLISH_BELIZE, EditingLanguage.ENGLISH_TRINIDAD_AND_TOBAGO, EditingLanguage.ENGLISH_ZIMBABWE, EditingLanguage.ENGLISH_PHILIPPINES, EditingLanguage.ESTONIAN, EditingLanguage.FAEROESE, EditingLanguage.PERSIAN, EditingLanguage.FINNISH, EditingLanguage.FRENCH_FRANCE, EditingLanguage.FRENCH_BELGIUM, EditingLanguage.FRENCH_CANADA, EditingLanguage.FRENCH_SWITZERLAND, EditingLanguage.FRENCH_LUXEMBOURG, EditingLanguage.FRENCH_MONACO, EditingLanguage.GEORGIAN, EditingLanguage.GERMAN_GERMANY, EditingLanguage.GERMAN_SWITZERLAND, EditingLanguage.GERMAN_AUSTRIA, EditingLanguage.GERMAN_LUXEMBOURG, EditingLanguage.GERMAN_LIECHTENSTEIN, EditingLanguage.GREEK, EditingLanguage.GUJARATI, EditingLanguage.HEBREW, EditingLanguage.HINDI, EditingLanguage.HUNGARIAN, EditingLanguage.ICELANDIC, EditingLanguage.INDONESIAN, EditingLanguage.ITALIAN_ITALY, EditingLanguage.ITALIAN_SWITZERLAND, EditingLanguage.JAPANESE, EditingLanguage.KANNADA, EditingLanguage.KASHMIRI, EditingLanguage.KAZAKH, EditingLanguage.KONKANI, EditingLanguage.KOREAN, 2066, EditingLanguage.LATVIAN, EditingLanguage.LITHUANIAN, 2087, EditingLanguage.MACEDONIAN, EditingLanguage.MALAY_MALAYSIA, EditingLanguage.MALAY_BRUNEI_DARUSSALAM, EditingLanguage.MALAYALAM, EditingLanguage.MANIPURI, EditingLanguage.MARATHI, 2145, EditingLanguage.NORWEGIAN_BOKMAL, EditingLanguage.NORWEGIAN_NYNORSK, EditingLanguage.ORIYA, EditingLanguage.POLISH, EditingLanguage.PORTUGUESE_BRAZIL, EditingLanguage.PORTUGUESE_PORTUGAL, EditingLanguage.PUNJABI_INDIA, EditingLanguage.ROMANIAN, 1049, EditingLanguage.SANSKRIT, EditingLanguage.SERBIAN_CYRILLIC_SERBIA_AND_MONTENEGRO, EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO, EditingLanguage.SINDHI_DEVANAGARIC, 1051, EditingLanguage.SLOVENIAN, EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT, EditingLanguage.SPANISH_MEXICO, EditingLanguage.SPANISH_SPAIN_MODERN_SORT, EditingLanguage.SPANISH_GUATEMALA, EditingLanguage.SPANISH_COSTA_RICA, EditingLanguage.SPANISH_PANAMA, EditingLanguage.SPANISH_DOMINICAN_REPUBLIC, EditingLanguage.SPANISH_VENEZUELA, EditingLanguage.SPANISH_COLOMBIA, EditingLanguage.SPANISH_PERU, EditingLanguage.SPANISH_ARGENTINA, EditingLanguage.SPANISH_ECUADOR, EditingLanguage.SPANISH_CHILE, EditingLanguage.SPANISH_URUGUAY, EditingLanguage.SPANISH_PARAGUAY, EditingLanguage.SPANISH_BOLIVIA, EditingLanguage.SPANISH_EL_SALVADOR, EditingLanguage.SPANISH_HONDURAS, EditingLanguage.SPANISH_NICARAGUA, EditingLanguage.SPANISH_PUERTO_RICO, EditingLanguage.SUTU, EditingLanguage.KISWAHILI, 1053, EditingLanguage.SWEDISH_FINLAND, EditingLanguage.TAMIL, EditingLanguage.TATAR, EditingLanguage.TELUGU, EditingLanguage.THAI, 1055, EditingLanguage.UKRAINIAN, EditingLanguage.URDU, 2080, EditingLanguage.UZBEK_LATIN, EditingLanguage.UZBEK_CYRILLIC, EditingLanguage.VIETNAMESE};

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<String, C12004dy> f35310k4;

    public C9774jd(String[] strArr, byte[][] bArr) {
        super(strArr, bArr);
        this.f35310k4 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: kk */
    private void m48093kk(List<C12004dy> list) {
        List.Enumerator<C12004dy> it = list.iterator();
        while (it.hasNext()) {
            try {
                m48092k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: k4 */
    public C9790ts mo48024k4(int i) {
        return m48059dy().m48115k4(i);
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: to */
    public void mo48065to() {
        super.mo48065to();
        this.f35310k4.clear();
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: x1 */
    public C9790ts mo48029x1(String str, int i) {
        return m48059dy().m48118x1(str, i, false);
    }

    @Override // com.aspose.slides.internal.p353q7.InterfaceC9759bv
    /* JADX INFO: renamed from: k4 */
    public C9790ts mo3692k4(String str, int i) {
        return m48059dy().m48118x1(str, i, true);
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: kk */
    public C9773ix[] mo48027kk() {
        return m48059dy().m48119x1();
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: x1 */
    public void mo48067x1(String str) {
        List.Enumerator<C12004dy> it = C9794uz.m48256k4(str).iterator();
        while (it.hasNext()) {
            try {
                m48092k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p353q7.InterfaceC9759bv
    /* JADX INFO: renamed from: k4 */
    public C12013m9 mo3693k4(String str, float f, int i) {
        m48057ck();
        C9790ts c9790tsM48118x1 = m48059dy().m48118x1(str, i, false);
        C12004dy c12004dyM48260k4 = c9790tsM48118x1 != null ? C9794uz.m48260k4(c9790tsM48118x1) : null;
        if (c12004dyM48260k4 != null) {
            try {
                return C12013m9.m56630k4(c12004dyM48260k4, f, i);
            } catch (ArgumentException unused) {
            }
        }
        C12004dy[] c12004dyArr = {c12004dyM48260k4};
        boolean z = this.f35310k4.tryGetValue(str, c12004dyArr) && c12004dyArr[0].m56529h4(i);
        C12004dy c12004dy = c12004dyArr[0];
        if (z) {
            return C12013m9.m56630k4(c12004dy, f, i);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: x1 */
    public void mo48068x1(byte[] bArr) {
        m48093kk(C9794uz.m48257k4(bArr));
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9769fa
    /* JADX INFO: renamed from: k4 */
    public void mo48026k4(IGenericDictionary<String, String> iGenericDictionary) {
    }

    /* JADX INFO: renamed from: k4 */
    private void m48092k4(C12004dy c12004dy) {
        if (c12004dy == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = f35309x1;
            if (i >= iArr.length) {
                return;
            }
            this.f35310k4.set_Item(c12004dy.m56531k4(iArr[i]), c12004dy);
            i++;
        }
    }
}

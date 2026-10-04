package com.aspose.slides.internal.p418tf;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p229ki.AbstractC5728qw;
import com.aspose.slides.internal.p229ki.C5688d4;
import com.aspose.slides.internal.p229ki.C5707j5;
import com.aspose.slides.internal.p229ki.C5717m4;
import com.aspose.slides.internal.p229ki.C5720na;
import com.aspose.slides.internal.p229ki.C5758x5;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.AbstractC12892ae;
import com.aspose.slides.internal.p532yu.C12943dd;
import com.aspose.slides.internal.p532yu.C13023hz;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.tf.du */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10925du extends AbstractC10930to implements InterfaceC10927k4, InterfaceC13980t6, InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    public static final C10926h4 f38007k4 = new C10926h4();

    /* JADX INFO: renamed from: x1 */
    public static final char[] f38010x1 = {'R', 'E', 'A', 'N', 'T', 'S', 'W', 'P', 'C', 'X'};

    /* JADX INFO: renamed from: kk */
    public static final char[] f38008kk = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6'};

    /* JADX INFO: renamed from: to */
    public static final int[] f38009to = {1, 2, 0, 0, 112, 32, 64, 128, 256, 2147483635};

    /* JADX INFO: renamed from: c5 */
    public static boolean m52680c5(int i) {
        return (((long) (i + (-4))) & 4294967295L) <= 2;
    }

    /* JADX INFO: renamed from: du */
    private static int m52681du(AbstractC10925du abstractC10925du) {
        int i = 0;
        while (abstractC10925du.mo21864ne()) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: dy */
    public static int m52682dy(int i) {
        if (i == 9) {
            return Integer.MAX_VALUE;
        }
        if (i == 4) {
            return 112;
        }
        return 1 << i;
    }

    /* JADX INFO: renamed from: k4 */
    private int m52683k4(AbstractC10925du abstractC10925du, AbstractC10925du abstractC10925du2) {
        int iMo21857kk = abstractC10925du.mo21857kk();
        int i = iMo21857kk != 2 ? iMo21857kk != 3 ? 2 : 0 : 1;
        int iMo21857kk2 = abstractC10925du2.mo21857kk();
        if (iMo21857kk2 == 2) {
            i--;
            if (i == 0) {
                while (abstractC10925du.mo21861ks()) {
                    if (abstractC10925du.mo21876x1(abstractC10925du2)) {
                        return 0;
                    }
                }
            }
        } else if (iMo21857kk2 != 3) {
            i -= 2;
            if (i == 0) {
                while (abstractC10925du.mo21865rv()) {
                    if (abstractC10925du.mo21876x1(abstractC10925du2)) {
                        return 0;
                    }
                }
            }
        } else if (i == 0) {
            while (abstractC10925du.m52685ar()) {
                if (abstractC10925du.mo21876x1(abstractC10925du2)) {
                    return 0;
                }
            }
        }
        return i < 0 ? 0 : 1;
    }

    /* JADX INFO: renamed from: m9 */
    public static int m52684m9(int i) {
        return f38009to[i];
    }

    /* JADX INFO: renamed from: ar */
    public final boolean m52685ar() {
        return mo21858kk(0);
    }

    /* JADX INFO: renamed from: bv */
    public final long m52686bv() {
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        int iMo21857kk = mo21857kk();
        long j = 0;
        if (iMo21857kk == 2) {
            while (abstractC10925duDeepClone.mo21861ks()) {
                j++;
            }
            return j;
        }
        if (iMo21857kk != 3) {
            while (abstractC10925duDeepClone.mo21865rv()) {
                j++;
            }
            return j;
        }
        while (abstractC10925duDeepClone.m52685ar()) {
            j++;
        }
        return j;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract String mo21839c5();

    /* JADX INFO: renamed from: ck */
    public String mo52687ck() {
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        while (!abstractC10925duDeepClone.mo21877x1(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "http://www.w3.org/XML/1998/namespace")) {
            if (!abstractC10925duDeepClone.mo21864ne()) {
                return C14113y2.f47374k4;
            }
        }
        return abstractC10925duDeepClone.mo21843dy();
    }

    @Override // com.aspose.slides.internal.p418tf.InterfaceC10927k4
    public AbstractC10925du createNavigator() {
        return deepClone();
    }

    /* JADX INFO: renamed from: du */
    public abstract String mo21841du();

    /* JADX INFO: renamed from: fa */
    public Object mo21844fa() {
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public AbstractC10929m9 mo21845h4(int i) {
        return new C5717m4(deepClone(), i);
    }

    /* JADX INFO: renamed from: h4 */
    public abstract String mo21846h4();

    /* JADX INFO: renamed from: ix */
    public void mo21848ix() {
        while (mo21864ne()) {
        }
    }

    /* JADX INFO: renamed from: jd */
    public abstract boolean mo21849jd();

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC10925du deepClone();

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo21855k4(AbstractC10925du abstractC10925du);

    /* JADX INFO: renamed from: kk */
    public abstract int mo21857kk();

    /* JADX INFO: renamed from: kk */
    public abstract boolean mo21858kk(int i);

    /* JADX INFO: renamed from: kk */
    public boolean mo21859kk(AbstractC10925du abstractC10925du) {
        if (abstractC10925du == null) {
            return false;
        }
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        while (abstractC10925duDeepClone.mo21864ne()) {
            if (abstractC10925duDeepClone.mo21876x1(this)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ks */
    public abstract boolean mo21861ks();

    /* JADX INFO: renamed from: m9 */
    public abstract String mo21863m9();

    /* JADX INFO: renamed from: ne */
    public abstract boolean mo21864ne();

    /* JADX INFO: renamed from: qq */
    public final boolean m52696qq() {
        return mo21875x1(0);
    }

    /* JADX INFO: renamed from: rv */
    public abstract boolean mo21865rv();

    /* JADX INFO: renamed from: to */
    public int mo21866to(AbstractC10925du abstractC10925du) {
        if (abstractC10925du == null) {
            return 3;
        }
        if (mo21876x1(abstractC10925du)) {
            return 2;
        }
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        AbstractC10925du abstractC10925duDeepClone2 = abstractC10925du.deepClone();
        int iM52681du = m52681du(abstractC10925duDeepClone.deepClone());
        int iM52681du2 = m52681du(abstractC10925duDeepClone2.deepClone());
        if (iM52681du > iM52681du2) {
            while (iM52681du > iM52681du2) {
                abstractC10925duDeepClone.mo21864ne();
                iM52681du--;
            }
            if (abstractC10925duDeepClone.mo21876x1(abstractC10925duDeepClone2)) {
                return 1;
            }
        }
        if (iM52681du2 > iM52681du) {
            while (iM52681du2 > iM52681du) {
                abstractC10925duDeepClone2.mo21864ne();
                iM52681du2--;
            }
            if (abstractC10925duDeepClone.mo21876x1(abstractC10925duDeepClone2)) {
                return 0;
            }
        }
        AbstractC10925du abstractC10925duDeepClone3 = abstractC10925duDeepClone.deepClone();
        AbstractC10925du abstractC10925duDeepClone4 = abstractC10925duDeepClone2.deepClone();
        while (abstractC10925duDeepClone3.mo21864ne() && abstractC10925duDeepClone4.mo21864ne()) {
            if (abstractC10925duDeepClone3.mo21876x1(abstractC10925duDeepClone4)) {
                "Microsoft.VisualStudio.Modeling.StoreNavigator".equals(C14067j2.m66727k4(abstractC10925duDeepClone).toString());
                return m52683k4(abstractC10925duDeepClone, abstractC10925duDeepClone2);
            }
            abstractC10925duDeepClone.mo21864ne();
            abstractC10925duDeepClone2.mo21864ne();
        }
        return 3;
    }

    /* JADX INFO: renamed from: to */
    public abstract String mo21867to();

    /* JADX INFO: renamed from: to */
    public abstract boolean mo21869to(String str);

    public String toString() {
        return mo21843dy();
    }

    /* JADX INFO: renamed from: u4 */
    public boolean mo21871u4() {
        if (!mo21878x6()) {
            return false;
        }
        mo21864ne();
        return true;
    }

    /* JADX INFO: renamed from: um */
    public final boolean m52697um() {
        if (mo21857kk() == 0) {
            return false;
        }
        if (mo21865rv()) {
            return true;
        }
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        if (!mo21864ne()) {
            return false;
        }
        int iMo21857kk = abstractC10925duDeepClone.mo21857kk();
        if ((iMo21857kk == 2 || iMo21857kk == 3) && mo21878x6()) {
            return true;
        }
        while (!mo21865rv()) {
            if (!mo21864ne()) {
                mo21855k4(abstractC10925duDeepClone);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: up */
    public boolean mo21872up() {
        if (!mo21879yj()) {
            return false;
        }
        mo21864ne();
        return true;
    }

    /* JADX INFO: renamed from: uz */
    public InterfaceC13298y4 mo52698uz() {
        return (InterfaceC13298y4) C7019kk.m27452k4((Object) this, InterfaceC13298y4.class);
    }

    /* JADX INFO: renamed from: v4 */
    public String mo21873v4() {
        long jM52686bv;
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        C6765kp c6765kp = new C6765kp();
        char c = f38010x1[mo21857kk()];
        while (true) {
            c6765kp.m26780k4(c);
            while (true) {
                jM52686bv = abstractC10925duDeepClone.m52686bv();
                if (!abstractC10925duDeepClone.mo21864ne()) {
                    return c6765kp.toString();
                }
                if ((jM52686bv & 4294967295L) <= 31) {
                    break;
                }
                c6765kp.m26780k4('0');
                while (true) {
                    c6765kp.m26780k4(f38008kk[(int) (jM52686bv & 31)]);
                    long j = (jM52686bv & 4294967295L) >> 5;
                    long j2 = j & 4294967295L;
                    if ((j & 4294967295L) == 0) {
                        break;
                    }
                    jM52686bv = j2;
                }
                c6765kp.m26780k4('0');
            }
            c = f38008kk[(int) jM52686bv];
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract AbstractC13883dt mo21874x1();

    /* JADX INFO: renamed from: x1 */
    public Object m52699x1(AbstractC10928kk abstractC10928kk) {
        return m52692k4(abstractC10928kk, (AbstractC10929m9) null);
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo21875x1(int i);

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo21876x1(AbstractC10925du abstractC10925du);

    /* JADX INFO: renamed from: x6 */
    public abstract boolean mo21878x6();

    /* JADX INFO: renamed from: yj */
    public abstract boolean mo21879yj();

    /* JADX INFO: renamed from: du */
    public AbstractC10928kk m52688du(String str) {
        return AbstractC10928kk.m52701k4(str);
    }

    /* JADX INFO: renamed from: h4 */
    public AbstractC10929m9 m52689h4(String str) {
        return m52691k4(AbstractC10928kk.m52701k4(str));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public IGenericDictionary<String, String> mo52690k4(int i) {
        int iMo21857kk = mo21857kk();
        if ((iMo21857kk != 1 && i != 2) || iMo21857kk == 2 || iMo21857kk == 3) {
            AbstractC10925du abstractC10925duDeepClone = deepClone();
            if (abstractC10925duDeepClone.mo21864ne()) {
                return abstractC10925duDeepClone.mo52690k4(i);
            }
        }
        Dictionary dictionary = new Dictionary();
        if (i == 0) {
            dictionary.set_Item("xml", "http://www.w3.org/XML/1998/namespace");
        }
        if (mo21875x1(i)) {
            do {
                String strMo21867to = mo21867to();
                String strMo21843dy = mo21843dy();
                if (strMo21867to.length() != 0 || strMo21843dy.length() != 0 || i == 2) {
                    dictionary.set_Item(strMo21867to, strMo21843dy);
                }
            } while (mo21858kk(i));
            mo21864ne();
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: kk */
    public boolean mo52695kk(String str) {
        if (mo21875x1(0)) {
            while (!C14113y2.m67363du(str, mo21867to())) {
                if (!mo21858kk(0)) {
                    mo21864ne();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: to */
    public boolean mo21868to(int i) {
        if (!mo21878x6()) {
            return false;
        }
        int iM52684m9 = m52684m9(i);
        while (((1 << mo21857kk()) & iM52684m9) == 0) {
            if (!mo21865rv()) {
                mo21864ne();
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: x1 */
    public String mo52700x1(String str) {
        if (str == null) {
            return null;
        }
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        if (mo21857kk() != 1) {
            if (abstractC10925duDeepClone.mo21864ne()) {
                return abstractC10925duDeepClone.mo52700x1(str);
            }
        } else if (abstractC10925duDeepClone.mo21875x1(0)) {
            while (!C14113y2.m67363du(str, abstractC10925duDeepClone.mo21843dy())) {
                if (!abstractC10925duDeepClone.mo21858kk(0)) {
                }
            }
            return abstractC10925duDeepClone.mo21867to();
        }
        if (C14113y2.m67363du(str, mo13292k4(C14113y2.f47374k4))) {
            return C14113y2.f47374k4;
        }
        if ("http://www.w3.org/XML/1998/namespace".equals(str)) {
            return "xml";
        }
        if ("http://www.w3.org/2000/xmlns/".equals(str)) {
            return "xmlns";
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public AbstractC10929m9 mo21840du(String str, String str2) {
        return new C5717m4(deepClone(), str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 mo21852k4(int i, boolean z) {
        return new C5707j5(deepClone(), i, z);
    }

    /* JADX INFO: renamed from: kk */
    public boolean mo21860kk(String str, String str2) {
        if (!mo21878x6()) {
            return false;
        }
        do {
            if (mo21857kk() == 1 && C14113y2.m67363du(str, mo21867to()) && C14113y2.m67363du(str2, mo21841du())) {
                return true;
            }
        } while (mo21865rv());
        mo21864ne();
        return false;
    }

    /* JADX INFO: renamed from: to */
    public boolean mo21870to(String str, String str2) {
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        while (mo21865rv()) {
            if (mo21857kk() == 1 && C14113y2.m67363du(str, mo21867to()) && C14113y2.m67363du(str2, mo21841du())) {
                return true;
            }
        }
        mo21855k4(abstractC10925duDeepClone);
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo21877x1(String str, String str2) {
        if (!mo21879yj()) {
            return false;
        }
        do {
            if (C14113y2.m67363du(str, mo21867to()) && C14113y2.m67363du(str2, mo21841du())) {
                return true;
            }
        } while (mo21861ks());
        mo21864ne();
        return false;
    }

    /* JADX INFO: renamed from: du */
    public boolean mo21842du(int i) {
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        int iM52684m9 = m52684m9(i);
        while (mo21865rv()) {
            if (((1 << mo21857kk()) & iM52684m9) != 0) {
                return true;
            }
        }
        mo21855k4(abstractC10925duDeepClone);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 m52691k4(AbstractC10928kk abstractC10928kk) {
        AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(m52699x1(abstractC10928kk), AbstractC10929m9.class);
        if (abstractC10929m9 != null) {
            return abstractC10929m9;
        }
        throw XPathException.create("Expression must evaluate to a node-set.");
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 mo21853k4(String str, String str2, boolean z) {
        return new C5707j5(deepClone(), str, str2, z);
    }

    /* JADX INFO: renamed from: k4 */
    public Object m52692k4(AbstractC10928kk abstractC10928kk, AbstractC10929m9 abstractC10929m9) {
        C5688d4 c5688d4 = (C5688d4) C7019kk.m27452k4((Object) abstractC10928kk, C5688d4.class);
        if (c5688d4 == null) {
            throw XPathException.create("This is an invalid object. Only objects returned from Compile() can be passed as input.");
        }
        AbstractC5728qw abstractC5728qwM23314k4 = AbstractC5728qw.m23314k4(c5688d4.m23222x1());
        abstractC5728qwM23314k4.mo23138c5();
        if (abstractC10929m9 == null) {
            abstractC10929m9 = new C5720na(deepClone(), true);
        }
        Object objMo23148k4 = abstractC5728qwM23314k4.mo23148k4(abstractC10929m9);
        return C7019kk.m27469x1(objMo23148k4, AbstractC10929m9.class) ? new C5758x5(abstractC10929m9.mo21834kk(), abstractC5728qwM23314k4) : objMo23148k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10930to
    /* JADX INFO: renamed from: k4 */
    public Object mo52693k4(AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        AbstractC12892ae abstractC12892aeM60211bz;
        if (interfaceC13980t6 == null) {
            interfaceC13980t6 = this;
        }
        InterfaceC13298y4 interfaceC13298y4Mo52698uz = mo52698uz();
        if (interfaceC13298y4Mo52698uz != null) {
            if (interfaceC13298y4Mo52698uz.ak_() == 1) {
                C12943dd c12943ddAl_ = interfaceC13298y4Mo52698uz.al_();
                if (c12943ddAl_ == null) {
                    c12943ddAl_ = interfaceC13298y4Mo52698uz.am_();
                }
                if (c12943ddAl_ != null) {
                    return c12943ddAl_.m60215g8().mo60122k4(mo21843dy(), abstractC14068j5, interfaceC13980t6);
                }
            } else {
                C12943dd c12943ddAm_ = interfaceC13298y4Mo52698uz.am_();
                if (c12943ddAm_ != null && (abstractC12892aeM60211bz = c12943ddAm_.m60211bz()) != null) {
                    return c12943ddAm_.m60215g8().mo60121k4(abstractC12892aeM60211bz.mo60025k4(mo21843dy(), mo21874x1(), interfaceC13980t6), abstractC14068j5, interfaceC13980t6);
                }
            }
        }
        return C13023hz.f43742k4.mo60122k4(mo21843dy(), abstractC14068j5, interfaceC13980t6);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        if (str == null) {
            return null;
        }
        if (mo21857kk() != 1) {
            AbstractC10925du abstractC10925duDeepClone = deepClone();
            if (abstractC10925duDeepClone.mo21864ne()) {
                return abstractC10925duDeepClone.mo13292k4(str);
            }
        } else if (mo52695kk(str)) {
            String strMo21843dy = mo21843dy();
            mo21864ne();
            return strMo21843dy;
        }
        if (str.length() == 0) {
            return C14113y2.f47374k4;
        }
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public String mo52694k4(String str, String str2) {
        if (!mo21877x1(str, str2)) {
            return "";
        }
        String strMo21843dy = mo21843dy();
        mo21864ne();
        return strMo21843dy;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo21854k4(int i, AbstractC10925du abstractC10925du) {
        int iMo21857kk;
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        int iM52684m9 = m52684m9(i);
        if (abstractC10925du != null && ((iMo21857kk = abstractC10925du.mo21857kk()) == 2 || iMo21857kk == 3)) {
            abstractC10925du = abstractC10925du.deepClone();
            abstractC10925du.m52697um();
        }
        int iMo21857kk2 = mo21857kk();
        if ((iMo21857kk2 == 2 || iMo21857kk2 == 3) && !mo21864ne()) {
            return false;
        }
        do {
            if (!mo21878x6()) {
                while (!mo21865rv()) {
                    if (!mo21864ne()) {
                        mo21855k4(abstractC10925duDeepClone);
                        return false;
                    }
                }
            }
            if (abstractC10925du != null && mo21876x1(abstractC10925du)) {
                mo21855k4(abstractC10925duDeepClone);
                return false;
            }
        } while (((1 << mo21857kk()) & iM52684m9) == 0);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo21856k4(String str, String str2, AbstractC10925du abstractC10925du) {
        int iMo21857kk;
        AbstractC10925du abstractC10925duDeepClone = deepClone();
        if (abstractC10925du != null && ((iMo21857kk = abstractC10925du.mo21857kk()) == 2 || iMo21857kk == 3)) {
            abstractC10925du = abstractC10925du.deepClone();
            abstractC10925du.m52697um();
        }
        int iMo21857kk2 = mo21857kk();
        if ((iMo21857kk2 == 2 || iMo21857kk2 == 3) && !mo21864ne()) {
            return false;
        }
        while (true) {
            if (!mo21878x6()) {
                while (!mo21865rv()) {
                    if (!mo21864ne()) {
                        mo21855k4(abstractC10925duDeepClone);
                        return false;
                    }
                }
            }
            if (abstractC10925du != null && mo21876x1(abstractC10925du)) {
                mo21855k4(abstractC10925duDeepClone);
                return false;
            }
            if (mo21857kk() == 1 && C14113y2.m67363du(str, mo21867to()) && C14113y2.m67363du(str2, mo21841du())) {
                return true;
            }
        }
    }
}

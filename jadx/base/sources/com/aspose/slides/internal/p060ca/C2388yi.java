package com.aspose.slides.internal.p060ca;

import androidx.datastore.preferences.protobuf.o000oOoO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooOo;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12381h4;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.yi */
/* JADX INFO: loaded from: classes3.dex */
public class C2388yi extends AbstractC2177li implements InterfaceC2191m8 {

    /* JADX INFO: renamed from: du */
    private C2015bq f8264du;

    /* JADX INFO: renamed from: h4 */
    private C2120hx f8265h4 = new C2120hx();

    /* JADX INFO: renamed from: k4 */
    private C2299sz f8266k4;

    /* JADX INFO: renamed from: kk */
    private C2299sz f8267kk;

    /* JADX INFO: renamed from: to */
    private C2299sz f8268to;

    /* JADX INFO: renamed from: x1 */
    private C2299sz f8269x1;

    /* JADX INFO: renamed from: m9 */
    private static final C12380dy f8263m9 = new C12380dy("(^\\W*(-?[0-9a-fA-F]*))|(WX\\W+(-?[\\d]+))|(N\\W+([^;\\W\r\n]+))|(B\\W+([^;\r\n]+))", 70);

    /* JADX INFO: renamed from: dy */
    private static final C12380dy f8262dy = new C12380dy("^\\W*([^\\W\r\n]*)\\W*([^\\W\r\n]*)\\W*(-?[\\d]*)", 70);

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f8261c5 = new C7017h4("EncodingScheme", "FontName", "FamilyName", "Weight", "ItalicAngle", "UnderlinePosition", "UnderlineThickness", "CapHeight", "XHeight", "Ascender", "Descender", "StdHW", "StdVW", "IsFixedPitch", "FontBBox", "StartCharMetrics", "StartComposites", "StartKernPairs", "StartTrackKern", "AdobeStandardEncoding", "FontSpecific", "JIS12-88-CFEncoding", "CharStrings", "version", "Notice", "FullName", "isFixedPitch", "Encoding", "PaintType", "FontType", "FontMatrix", "UniqueID", "Metrics", "StrokeWidth", "RD", "ND", "NP", "Subrs", "OtherSubrs", "BlueValues", "OtherBlues", "FamilyBlues", "FamilyOtherBlues", "BlueScale", "BlueShift", "BlueFuzz", "StemSnapH", "StemSnapV", "ForceBold", "LanguageGroup", "password", "lenIV", "MinFeature", "RndStemUp");

    /* JADX INFO: renamed from: du */
    private static double m11748du(C2295sq c2295sq) {
        if (c2295sq.m11424kk() == 2 && C7019kk.m27469x1(c2295sq.m11425x1(), Double.class)) {
            return ((Double) C7019kk.m27464to(c2295sq.m11425x1(), Double.TYPE)).doubleValue();
        }
        if (c2295sq.m11424kk() != 0 || !C7019kk.m27469x1(c2295sq.m11425x1(), String.class)) {
            return -1.7976931348623157E308d;
        }
        double[] dArr = {-1.7976931348623157E308d};
        C14044b3.m66435k4(C2016br.m10269k4((String) c2295sq.m11425x1()), 167, C11697x1.m55250kk(), dArr);
        return dArr[0];
    }

    /* JADX INFO: renamed from: h4 */
    private static boolean m11749h4(C2295sq c2295sq) {
        if (c2295sq.m11424kk() != 0 || !C7019kk.m27469x1(c2295sq.m11425x1(), String.class)) {
            return false;
        }
        try {
            return C14051ck.m66555k4((String) c2295sq.m11425x1());
        } catch (FormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: kk */
    private static int m11755kk(C2295sq c2295sq) {
        if (c2295sq.m11424kk() != 2 && c2295sq.m11424kk() != 1) {
            return Integer.MIN_VALUE;
        }
        if (C7019kk.m27469x1(c2295sq.m11425x1(), Double.class)) {
            return C7019kk.m27462to(C7019kk.m27464to(c2295sq.m11425x1(), Double.TYPE), 14);
        }
        if (C7019kk.m27469x1(c2295sq.m11425x1(), Integer.class)) {
            return ((Integer) C7019kk.m27464to(c2295sq.m11425x1(), Integer.TYPE)).intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: m9 */
    private static C2036cu m11757m9(C2295sq c2295sq) {
        if (c2295sq.m11424kk() == 4) {
            return (C2036cu) c2295sq.m11425x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    private static double m11758to(C2295sq c2295sq) {
        if (c2295sq.m11424kk() == 2 && C7019kk.m27469x1(c2295sq.m11425x1(), Double.class)) {
            return ((Double) C7019kk.m27464to(c2295sq.m11425x1(), Double.TYPE)).doubleValue();
        }
        return -1.7976931348623157E308d;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m11760x1(C2295sq c2295sq) {
        return c2295sq.m11424kk() == 0 ? (String) c2295sq.m11425x1() : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2177li
    /* JADX INFO: renamed from: k4 */
    public AbstractC2313tw mo11021k4(C2033cj c2033cj) {
        C2015bq c2015bq;
        try {
            m11762x1(c2033cj);
            if (this.f8269x1 == null && this.f8266k4 == null) {
                if (this.f8268to == null) {
                    if (this.f8267kk != null) {
                    }
                    m11750k4();
                    return this.f8264du;
                }
                c2015bq = new C2113hg(c2033cj);
            } else {
                c2015bq = new C2015bq(c2033cj);
            }
            this.f8264du = c2015bq;
            m11750k4();
            return this.f8264du;
        } catch (C2096ga e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new C2149jo("Unexpected font parsing exception", e2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m11750k4() {
        if (C7019kk.m27469x1(this.f8264du, C2015bq.class) && !C7019kk.m27469x1(this.f8264du, C2113hg.class)) {
            AbstractC2011be abstractC2011beM11428kk = (this.f8265h4.m10702kk() ? this.f8269x1 : this.f8266k4).m11428kk();
            AbstractC3150x6 abstractC3150x6Mo10245x1 = abstractC2011beM11428kk.mo10245x1();
            try {
                abstractC3150x6Mo10245x1.setPosition(0L);
                byte[] bArr = new byte[(int) abstractC3150x6Mo10245x1.getLength()];
                abstractC3150x6Mo10245x1.read(bArr, 0, (int) abstractC3150x6Mo10245x1.getLength());
                this.f8265h4.m10700k4(bArr);
                C2211n7 c2211n7 = new C2211n7(this.f8265h4);
                c2211n7.m10976k4((InterfaceC2191m8) this);
                try {
                    c2211n7.m11146x6();
                    c2211n7.m10976k4((InterfaceC2191m8) null);
                    this.f8265h4.m10700k4(this.f8264du.mo10267k4().m11575k4());
                    C2246pk c2246pk = new C2246pk(this.f8265h4);
                    c2246pk.m10976k4((InterfaceC2191m8) this);
                    try {
                        c2246pk.mo10280x1(0, new int[]{0});
                    } finally {
                        c2246pk.m10976k4((InterfaceC2191m8) null);
                    }
                } catch (Throwable th) {
                    c2211n7.m10976k4((InterfaceC2191m8) null);
                    throw th;
                }
            } finally {
                if (abstractC2011beM11428kk.m10244to()) {
                    abstractC3150x6Mo10245x1.close();
                }
            }
        }
        C2299sz c2299sz = this.f8268to;
        AbstractC2011be abstractC2011beM11428kk2 = (c2299sz == null && (c2299sz = this.f8267kk) == null) ? null : c2299sz.m11428kk();
        if (abstractC2011beM11428kk2 != null) {
            AbstractC3150x6 abstractC3150x6Mo10245x12 = abstractC2011beM11428kk2.mo10245x1();
            try {
                abstractC3150x6Mo10245x12.setPosition(0L);
                byte[] bArr2 = new byte[(int) abstractC3150x6Mo10245x12.getLength()];
                abstractC3150x6Mo10245x12.read(bArr2, 0, (int) abstractC3150x6Mo10245x12.getLength());
                this.f8265h4.m10700k4(bArr2);
                C2162kk c2162kk = new C2162kk(this.f8265h4);
                c2162kk.m10976k4((InterfaceC2191m8) this);
                try {
                    c2162kk.m10933to();
                } finally {
                    c2162kk.m10976k4((InterfaceC2191m8) null);
                }
            } finally {
                if (abstractC2011beM11428kk2.m10244to()) {
                    abstractC3150x6Mo10245x12.close();
                }
            }
        }
        if ("ZapfDingbats".equals(this.f8264du.mo10262h4())) {
            ((C2302td) this.f8264du.mo10263jd()).m11431k4(C2190m7.f7617k4);
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m11756kk(Object obj) {
        Iterator<T> it = ((C2246pk) obj).m11244k4().iterator();
        while (it.hasNext()) {
            m11753k4(this.f8264du, (C2295sq) it.next());
        }
    }

    /* JADX INFO: renamed from: to */
    private void m11759to(Object obj) {
        C2211n7 c2211n7 = (C2211n7) obj;
        Iterator<T> it = c2211n7.m11145to().iterator();
        while (it.hasNext()) {
            m11753k4(this.f8264du, (C2295sq) it.next());
        }
        this.f8264du.mo10267k4().m11574k4(c2211n7.m11144k4());
    }

    /* JADX INFO: renamed from: x1 */
    private void m11761x1(C2015bq c2015bq, C2227o9 c2227o9) {
        Iterator<T> it = c2227o9.m11186k4().iterator();
        while (it.hasNext()) {
            m11753k4(c2015bq, (C2295sq) it.next());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m11751k4(C2015bq c2015bq, C2036cu c2036cu) {
        c2015bq.mo10267k4().m11578m9().m10772k4(new C2052dp());
        c2015bq.mo10267k4().m11578m9().m10769k4().f7079k4 = new C2115hj[c2036cu.m10338k4().size()];
        for (int i = 0; i < c2036cu.m10338k4().size(); i++) {
            C2142jd c2142jd = c2036cu.m10338k4().get_Item(i);
            C2115hj c2115hj = new C2115hj();
            if (c2142jd.m10814k4() != null && C7019kk.m27469x1(c2142jd.m10814k4(), byte[].class)) {
                c2115hj.m10693k4((byte[]) C7019kk.m27458kk(c2142jd.m10814k4(), byte[].class));
            }
            if (c2142jd.m10818x1() >= 0 && c2142jd.m10818x1() <= c2015bq.mo10267k4().m11578m9().m10769k4().f7079k4.length) {
                c2015bq.mo10267k4().m11578m9().m10769k4().f7079k4[c2142jd.m10818x1()] = c2115hj;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m11762x1(C2033cj c2033cj) {
        if (c2033cj == null) {
            throw new C2225o3("Font creation error. Could not find the font.");
        }
        if (c2033cj.m10333kk().length == 1 && c2033cj.m10333kk()[0].m11429x1() == null) {
            this.f8266k4 = c2033cj.m10333kk()[0];
            this.f8265h4.m10699k4(false);
            return;
        }
        for (int length = c2033cj.m10333kk().length - 1; length >= 0; length--) {
            if (C14113y2.m67363du(c2033cj.m10333kk()[length].m11429x1(), C2156k6.m10906k4())) {
                this.f8266k4 = c2033cj.m10333kk()[length];
                this.f8265h4.m10699k4(false);
            }
            if (C14113y2.m67363du(c2033cj.m10333kk()[length].m11429x1(), C2156k6.m10909x1())) {
                this.f8269x1 = c2033cj.m10333kk()[length];
                this.f8265h4.m10699k4(true);
            } else if (C14113y2.m67363du(c2033cj.m10333kk()[length].m11429x1(), C2156k6.m10907kk())) {
                this.f8267kk = c2033cj.m10333kk()[length];
            } else if (C14113y2.m67363du(c2033cj.m10333kk()[length].m11429x1(), C2156k6.m10908to())) {
                this.f8268to = c2033cj.m10333kk()[length];
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m11752k4(C2015bq c2015bq, C2227o9 c2227o9) {
        c2015bq.mo10267k4().m11569dy().f8003k4 = new C2357wz[c2227o9.m11186k4().size()];
        c2015bq.mo10267k4().m11569dy().f8004x1 = new Dictionary<>();
        for (int i = 0; i < c2227o9.m11186k4().size(); i++) {
            C2295sq c2295sq = c2227o9.m11186k4().get_Item(i);
            C2357wz c2357wz = new C2357wz();
            c2357wz.m11630k4(c2295sq.m11420k4());
            if (c2295sq.m11424kk() == 8) {
                c2357wz.m11631k4((byte[]) c2295sq.m11425x1());
            }
            c2015bq.mo10267k4().m11569dy().f8003k4[i] = c2357wz;
            c2015bq.mo10267k4().m11569dy().f8004x1.set_Item(c2357wz.m11629k4(), Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m11763x1(Object obj) {
        C2054dt c2054dt;
        for (C2295sq c2295sq : ((C2162kk) obj).m10930k4().m11186k4()) {
            C7017h4 c7017h4 = f8261c5;
            switch (c7017h4.m27428k4(c2295sq.m11420k4())) {
                case 0:
                    if (C7019kk.m27469x1(this.f8264du, C2113hg.class)) {
                        int iM27428k4 = c7017h4.m27428k4((String) c2295sq.m11425x1());
                        if (iM27428k4 == 19) {
                            ((C2302td) this.f8264du.mo10263jd()).m11430k4().m11259k4();
                        } else if (iM27428k4 != 20) {
                            continue;
                        } else {
                            ((C2302td) this.f8264du.mo10263jd()).m11430k4().clear();
                            C2254q3 c2254q3M11542k4 = C2063e8.m10448k4().m10450to().m11542k4(this.f8264du.mo10262h4());
                            if (c2254q3M11542k4 != null) {
                                IGenericEnumerator<Integer> it = c2254q3M11542k4.getKeys().iterator();
                                while (it.hasNext()) {
                                    try {
                                        int iIntValue = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
                                        ((C2302td) this.f8264du.mo10263jd()).m11430k4().m11260k4(iIntValue, c2254q3M11542k4.m11258k4(iIntValue));
                                    } catch (Throwable th) {
                                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                            it.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                    break;
                case 1:
                    ((C2288sa) this.f8264du.mo10258c5()).m11396k4((String) c2295sq.m11425x1());
                    break;
                case 2:
                    ((C2288sa) this.f8264du.mo10258c5()).m11404x1((String) c2295sq.m11425x1());
                    break;
                case 3:
                    ((C2288sa) this.f8264du.mo10258c5()).m11399kk((String) c2295sq.m11425x1());
                    break;
                case 4:
                    ((C2288sa) this.f8264du.mo10258c5()).m11403x1(m11748du(c2295sq));
                    break;
                case 5:
                    ((C2288sa) this.f8264du.mo10258c5()).m11398kk(m11748du(c2295sq));
                    break;
                case 6:
                    ((C2288sa) this.f8264du.mo10258c5()).m11401to(m11748du(c2295sq));
                    break;
                case 7:
                    ((C2288sa) this.f8264du.mo10258c5()).m11391du(m11748du(c2295sq));
                    break;
                case 8:
                    ((C2288sa) this.f8264du.mo10258c5()).m11393h4(m11748du(c2295sq));
                    break;
                case 9:
                    ((C2288sa) this.f8264du.mo10258c5()).f7878kk = m11748du(c2295sq);
                    break;
                case 10:
                    ((C2288sa) this.f8264du.mo10258c5()).f7883to = m11748du(c2295sq);
                    break;
                case 11:
                    ((C2288sa) this.f8264du.mo10258c5()).m11400m9(m11748du(c2295sq));
                    break;
                case 12:
                    ((C2288sa) this.f8264du.mo10258c5()).m11392dy(m11748du(c2295sq));
                    break;
                case 13:
                    ((C2288sa) this.f8264du.mo10258c5()).m11816k4(m11749h4(c2295sq));
                    break;
                case 14:
                    String[] strArrM67369h4 = C14113y2.m67369h4((String) c2295sq.m11425x1(), ControlChar.SPACE_CHAR, '\t');
                    if (strArrM67369h4.length == 4) {
                        try {
                            ((C2288sa) this.f8264du.mo10258c5()).mo11395k4(new C2054dt(C2016br.m10272x1(strArrM67369h4[0]), C2016br.m10272x1(strArrM67369h4[1]), C2016br.m10272x1(strArrM67369h4[2]), C2016br.m10272x1(strArrM67369h4[3])));
                        } catch (FormatException unused) {
                        }
                    }
                    break;
                case 15:
                    for (C2295sq c2295sq2 : ((C2227o9) c2295sq.m11425x1()).m11186k4()) {
                        if (c2295sq2.m11424kk() == 0) {
                            C12381h4 c12381h4M57986kk = f8263m9.m57986kk((String) c2295sq2.m11425x1());
                            String strM67440x1 = C14113y2.f47374k4;
                            Iterator<C12385to> it2 = c12381h4M57986kk.iterator();
                            String strMo57995kk = strM67440x1;
                            String strMo57995kk2 = strMo57995kk;
                            while (it2.hasNext()) {
                                try {
                                    C12385to next = it2.next();
                                    if (next.m58004du().m58000k4(4).mo58006to()) {
                                        strMo57995kk = next.m58004du().m58000k4(4).mo57995kk();
                                    }
                                    if (next.m58004du().m58000k4(6).mo58006to()) {
                                        strMo57995kk2 = next.m58004du().m58000k4(6).mo57995kk();
                                    }
                                    if (next.m58004du().m58000k4(8).mo58006to()) {
                                        strM67440x1 = C14113y2.m67440x1(next.m58004du().m58000k4(8).mo57995kk());
                                    }
                                } catch (Throwable th2) {
                                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                        ((IDisposable) it2).dispose();
                                    }
                                    throw th2;
                                }
                                break;
                            }
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it2).dispose();
                            }
                            if (!C14113y2.m67411k4(strM67440x1)) {
                                String[] strArrM67369h42 = C14113y2.m67369h4(strM67440x1, ControlChar.SPACE_CHAR, '\t');
                                if (strArrM67369h42.length == 4) {
                                    try {
                                        c2054dt = new C2054dt(C2016br.m10272x1(strArrM67369h42[0]), C2016br.m10272x1(strArrM67369h42[1]), C2016br.m10272x1(strArrM67369h42[2]), C2016br.m10272x1(strArrM67369h42[3]));
                                    } catch (FormatException unused2) {
                                        c2054dt = null;
                                    }
                                    try {
                                        ((C2288sa) this.f8264du.mo10258c5()).m11814k4(new C2319ub(strMo57995kk2), C14057f9.m66582k4(strMo57995kk), c2054dt);
                                    } catch (FormatException unused3) {
                                        C2244ph.m11243k4(C14113y2.m67402k4("Error happened during parsing glyph {0} metrics", strMo57995kk2));
                                    }
                                } else {
                                    c2054dt = null;
                                    ((C2288sa) this.f8264du.mo10258c5()).m11814k4(new C2319ub(strMo57995kk2), C14057f9.m66582k4(strMo57995kk), c2054dt);
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 17:
                    for (C2295sq c2295sq3 : ((C2227o9) c2295sq.m11425x1()).m11186k4()) {
                        if (c2295sq3.m11424kk() == 0) {
                            C12385to c12385toM57989x1 = f8262dy.m57989x1((String) c2295sq3.m11425x1());
                            if (c12385toM57989x1.mo58006to()) {
                                String strOooO00o = OooOo.OooO00o(c12385toM57989x1, 1);
                                String strOooO00o2 = OooOo.OooO00o(c12385toM57989x1, 2);
                                try {
                                    ((C2288sa) this.f8264du.mo10258c5()).m11815k4(new C2319ub(strOooO00o), new C2319ub(strOooO00o2), C2016br.m10272x1(OooOo.OooO00o(c12385toM57989x1, 3)));
                                } catch (FormatException unused4) {
                                    C2244ph.m11243k4(C14113y2.m67402k4("Error happened during parsing kerning pair glyph1: {0}; glyph2: {0}", strOooO00o, strOooO00o2));
                                }
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m11753k4(C2015bq c2015bq, C2295sq c2295sq) {
        if (c2295sq.m11424kk() == 3) {
            if (f8261c5.m27428k4(c2295sq.m11420k4()) != 22) {
                m11761x1(c2015bq, (C2227o9) c2295sq.m11425x1());
                return;
            } else {
                m11752k4(this.f8264du, (C2227o9) c2295sq.m11425x1());
                return;
            }
        }
        int iM27428k4 = f8261c5.m27428k4(c2295sq.m11420k4());
        if (iM27428k4 == 11) {
            c2015bq.mo10267k4().m11578m9().m10783to(m11760x1(c2295sq));
            return;
        }
        if (iM27428k4 == 12) {
            c2015bq.mo10267k4().m11578m9().m10765du(m11760x1(c2295sq));
            return;
        }
        if (iM27428k4 == 14) {
            c2015bq.mo10267k4().m11568du().m11136k4(m11754k4(c2295sq));
            return;
        }
        switch (iM27428k4) {
            case 1:
                c2015bq.mo10267k4().m11573k4(m11760x1(c2295sq));
                return;
            case 2:
                c2015bq.mo10267k4().m11580x1().m11411to(m11760x1(c2295sq));
                return;
            case 3:
                c2015bq.mo10267k4().m11580x1().m11405du(m11760x1(c2295sq));
                return;
            case 4:
                c2015bq.mo10267k4().m11580x1().m11406k4(m11758to(c2295sq));
                return;
            case 5:
                c2015bq.mo10267k4().m11580x1().m11412x1(m11758to(c2295sq));
                return;
            case 6:
                c2015bq.mo10267k4().m11580x1().m11409kk(m11758to(c2295sq));
                return;
            default:
                switch (iM27428k4) {
                    case 23:
                        c2015bq.mo10267k4().m11580x1().m11407k4(m11760x1(c2295sq));
                        return;
                    case 24:
                        c2015bq.mo10267k4().m11580x1().m11413x1(m11760x1(c2295sq));
                        return;
                    case 25:
                        c2015bq.mo10267k4().m11580x1().m11410kk(m11760x1(c2295sq));
                        return;
                    case 26:
                        c2015bq.mo10267k4().m11580x1().m11408k4(m11749h4(c2295sq));
                        return;
                    case 27:
                        if (c2295sq.m11424kk() == 0) {
                            String strM11760x1 = m11760x1(c2295sq);
                            if (!"StandardEncoding".equals(strM11760x1)) {
                                throw new NotSupportedException(C14113y2.m67402k4("The encoding named '{0}' is not supporded", strM11760x1));
                            }
                            ((C2302td) c2015bq.mo10263jd()).m11430k4().m11259k4();
                            return;
                        }
                        if (c2295sq.m11424kk() == 4) {
                            for (C2142jd c2142jd : ((C2036cu) c2295sq.m11425x1()).m10338k4()) {
                                if (c2142jd.m10817kk() == 1) {
                                    C12385to c12385toM57989x1 = new C12380dy("(\\d+)\\s(\\d+)\\s(\\d+)").m57989x1(AbstractC6747ar.m26650yj().m26681x1(C2027c5.m10304k4((Byte[]) c2142jd.m10814k4())));
                                    if (o000oOoO.OooO0OO(c12385toM57989x1, 1) && o000oOoO.OooO0OO(c12385toM57989x1, 2) && o000oOoO.OooO0OO(c12385toM57989x1, 3)) {
                                        int iM66582k4 = C14057f9.m66582k4(c12385toM57989x1.m58004du().m58000k4(2).mo57995kk());
                                        int iM66582k42 = C14057f9.m66582k4(c12385toM57989x1.m58004du().m58000k4(3).mo57995kk());
                                        for (int iM66582k43 = C14057f9.m66582k4(c12385toM57989x1.m58004du().m58000k4(1).mo57995kk()); iM66582k43 <= iM66582k42; iM66582k43 += iM66582k4) {
                                            ((C2302td) c2015bq.mo10263jd()).m11430k4().m11260k4(iM66582k43, ".notdef");
                                        }
                                    }
                                } else if (c2142jd.m10817kk() == 2) {
                                    ((C2302td) c2015bq.mo10263jd()).m11430k4().m11260k4(c2142jd.m10818x1(), AbstractC6747ar.m26650yj().m26681x1((byte[]) c2142jd.m10814k4()));
                                }
                            }
                            return;
                        }
                        return;
                    case 28:
                        c2015bq.mo10267k4().m11572k4(m11755kk(c2295sq));
                        return;
                    case 29:
                        c2015bq.mo10267k4().m11581x1(m11755kk(c2295sq));
                        return;
                    case 30:
                        c2015bq.mo10267k4().m11579to().m10696k4(m11754k4(c2295sq));
                        return;
                    case 31:
                        c2015bq.mo10267k4().m11577kk(m11755kk(c2295sq));
                        return;
                    case 32:
                        c2015bq.mo10267k4().m11570h4().m11817k4(m11760x1(c2295sq));
                        return;
                    case 33:
                        c2015bq.mo10267k4().m11571k4(m11755kk(c2295sq));
                        return;
                    case 34:
                        c2015bq.mo10267k4().m11578m9().m10773k4(m11760x1(c2295sq));
                        return;
                    case 35:
                        c2015bq.mo10267k4().m11578m9().m10786x1(m11760x1(c2295sq));
                        return;
                    case 36:
                        c2015bq.mo10267k4().m11578m9().m10777kk(m11760x1(c2295sq));
                        return;
                    case 37:
                        m11751k4(this.f8264du, m11757m9(c2295sq));
                        return;
                    case 38:
                        c2015bq.mo10267k4().m11578m9().m10777kk(c2295sq.m11425x1().toString());
                        return;
                    case 39:
                        c2015bq.mo10267k4().m11578m9().m10775k4(m11754k4(c2295sq));
                        return;
                    case 40:
                        c2015bq.mo10267k4().m11578m9().m10787x1(m11754k4(c2295sq));
                        return;
                    case 41:
                        c2015bq.mo10267k4().m11578m9().m10778kk(m11754k4(c2295sq));
                        return;
                    case 42:
                        c2015bq.mo10267k4().m11578m9().m10784to(m11754k4(c2295sq));
                        return;
                    case 43:
                        c2015bq.mo10267k4().m11578m9().m10770k4(m11758to(c2295sq));
                        return;
                    case 44:
                        c2015bq.mo10267k4().m11578m9().m10771k4(m11755kk(c2295sq));
                        return;
                    case 45:
                        c2015bq.mo10267k4().m11578m9().m10785x1(m11755kk(c2295sq));
                        return;
                    case 46:
                        c2015bq.mo10267k4().m11578m9().m10768h4(m11760x1(c2295sq));
                        return;
                    case 47:
                        c2015bq.mo10267k4().m11578m9().m10780m9(m11760x1(c2295sq));
                        return;
                    case 48:
                        c2015bq.mo10267k4().m11578m9().m10774k4(m11749h4(c2295sq));
                        return;
                    case 49:
                        c2015bq.mo10267k4().m11578m9().m10776kk(m11755kk(c2295sq));
                        return;
                    case 50:
                        c2015bq.mo10267k4().m11578m9().m10782to(m11755kk(c2295sq));
                        return;
                    case 51:
                        c2015bq.mo10267k4().m11578m9().m10764du(m11755kk(c2295sq));
                        this.f8265h4.m10698k4(c2015bq.mo10267k4().m11578m9().m10767h4());
                        return;
                    case 52:
                        c2015bq.mo10267k4().m11578m9().m10766dy(m11760x1(c2295sq));
                        return;
                    case 53:
                        c2015bq.mo10267k4().m11578m9().m10774k4(m11749h4(c2295sq));
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public final void mo10226k4(Object obj) {
        if (C7019kk.m27469x1(obj, C2162kk.class)) {
            m11763x1(obj);
        } else if (C7019kk.m27469x1(obj, C2246pk.class)) {
            m11756kk(obj);
        } else if (C7019kk.m27469x1(obj, C2211n7.class)) {
            m11759to(obj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static double[] m11754k4(C2295sq c2295sq) {
        try {
            if (c2295sq.m11424kk() == 5) {
                String str = (String) c2295sq.m11425x1();
                if (str.length() > 0) {
                    String[] strArrM67369h4 = C14113y2.m67369h4(C14113y2.m67440x1(str), ControlChar.SPACE_CHAR, '\t');
                    int i = 0;
                    for (String str2 : strArrM67369h4) {
                        if (!C14113y2.m67411k4(str2)) {
                            i++;
                        }
                    }
                    double[] dArr = new double[i];
                    int i2 = 0;
                    for (String str3 : strArrM67369h4) {
                        if (!C14113y2.m67411k4(str3)) {
                            int i3 = i2 + 1;
                            dArr[i2] = C2016br.m10272x1(str3);
                            i2 = i3;
                        }
                    }
                    return dArr;
                }
            }
        } catch (FormatException unused) {
            C2244ph.m11243k4(C14113y2.m67402k4("Error happened during parsing array: {0}", (String) c2295sq.m11425x1()));
        }
        return new double[0];
    }
}

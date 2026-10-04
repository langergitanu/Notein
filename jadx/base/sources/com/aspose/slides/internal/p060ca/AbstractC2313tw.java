package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.tw */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2313tw implements InterfaceC2251pt {

    /* JADX INFO: renamed from: x1 */
    private final C2037cw f8001x1 = new C2037cw();

    /* JADX INFO: renamed from: kk */
    private static final C12380dy f8000kk = new C12380dy("([A-Z]{6})\\+(.*)");

    /* JADX INFO: renamed from: k4 */
    private static final InterfaceC2079f5 f7999k4 = C2006b1.m10229k4().m10231x1().mo10237k4();

    /* JADX INFO: renamed from: k4 */
    public static AbstractC2313tw m11467k4(int i, AbstractC2011be abstractC2011be) {
        return m11469k4(new C2033cj(i, new C2299sz(abstractC2011be)));
    }

    /* JADX INFO: renamed from: ck */
    public abstract C2033cj mo10259ck();

    /* JADX INFO: renamed from: fa */
    public abstract InterfaceC2201mt mo10261fa();

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: jd */
    public abstract InterfaceC2371xl mo10263jd();

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: kk */
    public AbstractC2220nx[] mo10751kk(String str) {
        List list = new List();
        for (int i = 0; i < str.length(); i++) {
            list.addItem(mo10263jd().mo10987k4(C14117yj.m67514du(str.charAt(i)) ? C14117yj.m67525k4(str.charAt(i), str.charAt(i + 1)) : str.charAt(i)));
        }
        return (AbstractC2220nx[]) list.toArray(new AbstractC2220nx[0]);
    }

    /* JADX INFO: renamed from: ks */
    public final C2037cw m11470ks() {
        return this.f8001x1;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC2313tw m11471x1(int i) {
        if (i != 0) {
            throw new C2279rs();
        }
        C2132iq c2132iq = new C2132iq();
        C2132iq c2132iq2 = (C2132iq) this;
        String strMo10755to = c2132iq2.mo10755to();
        String[] strArrM10343k4 = c2132iq2.m10761x6().m10343k4();
        for (int i2 = 0; i2 < strArrM10343k4.length; i2++) {
            if (strMo10755to.length() < strArrM10343k4[i2].length()) {
                strMo10755to = strArrM10343k4[i2];
            }
        }
        c2132iq.m10756to(c2132iq2.mo10262h4());
        c2132iq.m10746k4(strMo10755to);
        c2132iq.m10760x1(c2132iq2.mo10752m9());
        Dictionary dictionary = new Dictionary();
        for (int i3 = 0; i3 < (c2132iq2.m10758x1().m10547du().m11521k4() & 65535); i3++) {
            C2334v6 c2334v6 = new C2334v6(i3);
            C2068ei c2068eiMo10265k4 = c2132iq2.mo10265k4(c2334v6);
            if (c2068eiMo10265k4.m10463c5() < 0.0d) {
                c2068eiMo10265k4.m10478kk(65535 & c2132iq2.m10758x1().m10552jd().m10846k4().m10856k4(i3).m10851k4());
            }
            int iMo10986k4 = c2132iq2.mo10263jd().mo10986k4(c2334v6);
            int iM10740k4 = c2132iq.m10740k4(c2068eiMo10265k4);
            c2132iq.mo10263jd().mo10988k4(iM10740k4, iMo10986k4);
            dictionary.addItem(Integer.valueOf(iM10740k4), Integer.valueOf(i3));
        }
        c2132iq.m10758x1().m10572kk().m11007k4(c2132iq2.m10758x1().m10572kk().m11015x1());
        c2132iq.m10758x1().m10572kk().m11008k4(c2132iq2.m10758x1().m10572kk().m11009kk());
        c2132iq.m10758x1().m10572kk().m11017x1(c2132iq2.m10758x1().m10572kk().m11013to());
        c2132iq.m10758x1().m10572kk().m11011kk(c2132iq2.m10758x1().m10572kk().m10999du());
        c2132iq.m10758x1().m10572kk().m11014to(c2132iq2.m10758x1().m10572kk().m11002h4());
        c2132iq.m10758x1().m10572kk().m11016x1(c2132iq2.m10758x1().m10572kk().m11012m9());
        c2132iq.m10758x1().m10572kk().m11010kk(c2132iq2.m10758x1().m10572kk().m11001dy());
        c2132iq.m10758x1().m10572kk().m11006k4(c2132iq2.m10758x1().m10572kk().m11005k4());
        c2132iq.m10758x1().m10545c5().m11591k4(c2132iq2.m10758x1().m10545c5().m11592kk());
        c2132iq.m10758x1().m10545c5().m11597x1(c2132iq2.m10758x1().m10545c5().m11594to());
        c2132iq.m10758x1().m10545c5().m11593kk(c2132iq2.m10758x1().m10545c5().m11587du());
        c2132iq.m10758x1().m10545c5().m11595to(c2132iq2.m10758x1().m10545c5().m11588h4());
        c2132iq.m10758x1().m10581x6().m10619k4(c2132iq2.m10758x1().m10581x6().m10616k4());
        c2132iq.m10758x1().m10581x6().m10617k4(c2132iq2.m10758x1().m10581x6().m10642x1());
        c2132iq.m10758x1().m10581x6().m10643x1(c2132iq2.m10758x1().m10581x6().m10620kk());
        c2132iq.m10758x1().m10581x6().m10621kk(c2132iq2.m10758x1().m10581x6().m10632to());
        c2132iq.m10758x1().m10581x6().m10644x1(c2132iq2.m10758x1().m10581x6().m10602du());
        c2132iq.m10758x1().m10581x6().m10622kk(c2132iq2.m10758x1().m10581x6().m10610h4());
        c2132iq.m10758x1().m10581x6().m10634to(c2132iq2.m10758x1().m10581x6().m10625m9());
        c2132iq.m10758x1().m10581x6().m10604du(c2132iq2.m10758x1().m10581x6().m10605dy());
        c2132iq.m10758x1().m10581x6().m10612h4(c2132iq2.m10758x1().m10581x6().m10598c5());
        c2132iq.m10758x1().m10581x6().m10627m9(c2132iq2.m10758x1().m10581x6().m10614jd());
        c2132iq.m10758x1().m10581x6().m10607dy(c2132iq2.m10758x1().m10581x6().m10600ck());
        c2132iq.m10758x1().m10581x6().m10599c5(c2132iq2.m10758x1().m10581x6().m10608fa());
        c2132iq.m10758x1().m10581x6().m10615jd(c2132iq2.m10758x1().m10581x6().m10637up());
        c2132iq.m10758x1().m10581x6().m10601ck(c2132iq2.m10758x1().m10581x6().m10646yj());
        c2132iq.m10758x1().m10581x6().m10633to(c2132iq2.m10758x1().m10581x6().m10628ne());
        c2132iq.m10758x1().m10581x6().m10603du(c2132iq2.m10758x1().m10581x6().m10613ix());
        c2132iq.m10758x1().m10581x6().m10611h4(c2132iq2.m10758x1().m10581x6().m10635u4());
        c2132iq.m10758x1().m10581x6().m10609fa(c2132iq2.m10758x1().m10581x6().m10639uz());
        c2132iq.m10758x1().m10581x6().m10638up(c2132iq2.m10758x1().m10581x6().m10641wl());
        c2132iq.m10758x1().m10581x6().m10647yj(c2132iq2.m10758x1().m10581x6().m10629qq());
        c2132iq.m10758x1().m10581x6().m10626m9(c2132iq2.m10758x1().m10581x6().m10596ar());
        c2132iq.m10758x1().m10581x6().m10606dy(c2132iq2.m10758x1().m10581x6().m10636um());
        c2132iq.m10758x1().m10581x6().m10623ks(c2132iq2.m10758x1().m10581x6().m10597bv());
        c2132iq.m10758x1().m10581x6().m10630rv(c2132iq2.m10758x1().m10581x6().m10640v4());
        C3152yj c3152yj = new C3152yj();
        c2132iq.mo11257k4(c3152yj);
        return (C2132iq) new C2284s2().mo11021k4(new C2033cj(0, new C2350wl(c3152yj.toArray())));
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC2313tw m11468k4(int i, AbstractC2313tw abstractC2313tw, C2384y6 c2384y6) {
        if (i == 0) {
            return C2132iq.m10728k4(abstractC2313tw, c2384y6);
        }
        throw new C2279rs();
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC2313tw m11469k4(C2033cj c2033cj) {
        try {
            AbstractC2313tw abstractC2313twMo11021k4 = AbstractC2177li.m11020k4(c2033cj.m10334x1()).mo11021k4(c2033cj);
            AbstractC3150x6 abstractC3150x6Mo10245x1 = c2033cj.m10333kk()[0].m11428kk().mo10245x1();
            abstractC3150x6Mo10245x1.setPosition((int) c2033cj.m10333kk()[0].m11428kk().m10241du());
            byte[] bArr = new byte[4];
            abstractC3150x6Mo10245x1.read(bArr, 0, 4);
            return "OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 4)) ? abstractC2313twMo11021k4.m11471x1(0) : abstractC2313twMo11021k4;
        } catch (RuntimeException e) {
            f7999k4.mo10505k4(C14113y2.m67402k4("Could not create font. \r\nFont definition: \r\n{0}", C2277rq.m11348k4(c2033cj)), e);
            throw e;
        }
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: k4 */
    public void mo11257k4(AbstractC3150x6 abstractC3150x6) {
        AbstractC2406ze.m11819k4(this, abstractC3150x6).mo10714k4();
    }
}

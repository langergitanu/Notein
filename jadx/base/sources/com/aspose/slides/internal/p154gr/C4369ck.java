package com.aspose.slides.internal.p154gr;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p156gw.AbstractC4415wy;
import com.aspose.slides.internal.p156gw.C4408to;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p314oc.C7015du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p316of.C7035kk;
import com.aspose.slides.internal.p390s1.C10130to;
import com.aspose.slides.internal.p390s1.InterfaceC10128k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11895du;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11897fa;
import com.aspose.slides.internal.p472w8.C11904m9;
import com.aspose.slides.internal.p472w8.C11905ne;
import com.aspose.slides.internal.p472w8.C11907to;
import com.aspose.slides.internal.p472w8.C11908u4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12017to;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;
import com.google.android.material.internal.ViewUtils;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.aspose.slides.internal.gr.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4369ck extends AbstractC12008jd {

    /* JADX INFO: renamed from: kk */
    private static int f11857kk = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: to */
    private static final C11913yj f11858to = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.5f);

    /* JADX INFO: renamed from: du */
    private InterfaceC14122k4 f11861du;

    /* JADX INFO: renamed from: h4 */
    private float f11864h4;

    /* JADX INFO: renamed from: k4 */
    AbstractC12002ck f11867k4;

    /* JADX INFO: renamed from: m9 */
    private float f11869m9;

    /* JADX INFO: renamed from: rv */
    private int f11872rv;

    /* JADX INFO: renamed from: x1 */
    C12014ne f11877x1;

    /* JADX INFO: renamed from: x6 */
    private C11913yj f11878x6;

    /* JADX INFO: renamed from: dy */
    private int f11862dy = 0;

    /* JADX INFO: renamed from: c5 */
    private int f11859c5 = 0;

    /* JADX INFO: renamed from: jd */
    private Integer f11866jd = 3;

    /* JADX INFO: renamed from: ck */
    private float f11860ck = 1.0f;

    /* JADX INFO: renamed from: fa */
    private int f11863fa = 1;

    /* JADX INFO: renamed from: up */
    private int f11874up = 0;

    /* JADX INFO: renamed from: yj */
    private int f11879yj = 0;

    /* JADX INFO: renamed from: ks */
    private int f11868ks = 4;

    /* JADX INFO: renamed from: ne */
    private C12016rv f11870ne = new C12016rv(0, 0);

    /* JADX INFO: renamed from: ix */
    private C11913yj f11865ix = new C11913yj();

    /* JADX INFO: renamed from: u4 */
    private C11893c5 f11873u4 = null;

    /* JADX INFO: renamed from: uz */
    private C4371dy f11875uz = new C4371dy(this);

    /* JADX INFO: renamed from: wl */
    private C4368c5 f11876wl = new C4368c5(this);

    /* JADX INFO: renamed from: qq */
    private C4377to f11871qq = new C4377to(this);

    private C4369ck() {
    }

    /* JADX INFO: renamed from: ak */
    private void m17446ak() {
        this.f11865ix = m17448du(this.f11878x6);
    }

    /* JADX INFO: renamed from: b3 */
    private C11893c5 m17447b3() {
        C11893c5 c11893c5 = this.f11873u4;
        this.f11873u4 = c11893c5.m55500k4();
        return c11893c5;
    }

    /* JADX INFO: renamed from: du */
    private C11913yj m17448du(C11913yj c11913yj) {
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        c11913yjM55760h4.m55780m9();
        return c11913yjM55760h4;
    }

    /* JADX INFO: renamed from: kk */
    private static C11913yj m17460kk(AbstractC12008jd abstractC12008jd) {
        C11913yj c11913yjM17467x1 = m17467x1(abstractC12008jd);
        if (!c11913yjM17467x1.m55778kk()) {
            return new C11913yj();
        }
        c11913yjM17467x1.m55780m9();
        return c11913yjM17467x1;
    }

    /* JADX INFO: renamed from: wy */
    private boolean m17464wy() {
        int i = this.f11874up;
        return i == 0 || i == 3 || i == 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static C4369ck m17465x1(AbstractC12002ck abstractC12002ck) {
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("Value of 'image' cannot be null");
        }
        if (AbstractC12002ck.m56327x1(abstractC12002ck.mo15753jd())) {
            throw new RuntimeException("Cannot create graphic object from indexed image format");
        }
        C4369ck c4369ck = new C4369ck();
        c4369ck.f11861du = AbstractC14124to.m67617m9().mo67651k4(abstractC12002ck.mo15751du().m62930k4().mo11984k4());
        c4369ck.m17462kk(abstractC12002ck);
        c4369ck.mo17560kk(3);
        c4369ck.mo17478dy(0);
        c4369ck.mo17495k4(0);
        c4369ck.mo17586x1(0);
        c4369ck.mo17560kk(3);
        c4369ck.mo17476du(0);
        c4369ck.mo17481h4(0);
        return c4369ck;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: ar */
    public C11913yj mo17471ar() {
        return this.f11861du.mo67596kk();
    }

    /* JADX INFO: renamed from: bv */
    public C11913yj m17472bv() {
        return C4375kk.m17625k4(mo17577u4(), mo17605yj(), mo17579up());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: c5 */
    public int mo17473c5() {
        return this.f11859c5;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: ck */
    public float mo17474ck() {
        return this.f11869m9;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f11861du.mo67584du();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: dy */
    public int mo17477dy() {
        return this.f11862dy;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: fa */
    public int mo17479fa() {
        return this.f11866jd.intValue();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: h4 */
    public C12018u4 mo17480h4() {
        InterfaceC1565x1 interfaceC1565x1Mo67586h4 = mo17582wl().mo67586h4();
        return interfaceC1565x1Mo67586h4 == null ? new C12018u4() : m17461kk(new C4408to(interfaceC1565x1Mo67586h4).m17980x1(m17460kk(this)).m17980x1(this.f11865ix));
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: ix */
    public int mo17482ix() {
        return this.f11872rv;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: jd */
    public float mo17483jd() {
        return this.f11864h4;
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 m17484k4(InterfaceC1565x1 interfaceC1565x1) {
        return m17567lr() ? C6541k4.m26346k4(f11858to, interfaceC1565x1) : interfaceC1565x1;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: ks */
    public int mo17566ks() {
        return this.f11874up;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m17567lr() {
        return m17604yd() && m17464wy();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: m9 */
    public C12007ix mo17568m9() {
        InterfaceC1565x1 interfaceC1565x1Mo67586h4 = mo17582wl().mo67586h4();
        return new C4408to((interfaceC1565x1Mo67586h4 == null ? new C12018u4().m56748k4() : new C4408to(interfaceC1565x1Mo67586h4.mo8355dy().m56574up())).m17980x1(m17460kk(this))).m17980x1(m17448du(mo17577u4())).mo8355dy();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: ne */
    public int mo17570ne() {
        return this.f11868ks;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: qq */
    public <T> T mo17571qq() {
        return (T) this.f11861du.mo67588k4();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: rv */
    public C12016rv mo17572rv() {
        return this.f11870ne;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: to */
    public void mo17573to() {
        this.f11865ix = new C11913yj();
        m17587x1((InterfaceC1565x1) null);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: u4 */
    public C11913yj mo17577u4() {
        return this.f11878x6.m55760h4();
    }

    /* JADX INFO: renamed from: um */
    public void m17578um() {
        if (Math.abs(C4375kk.m17617k4(2, mo17605yj(), mo17474ck()) - 1.0f) <= 0.001d || C4375kk.m17630k4(mo17605yj())) {
            return;
        }
        mo17500k4(new C11913yj(C4375kk.m17617k4(2, mo17605yj(), mo17483jd()), 0.0f, 0.0f, C4375kk.m17617k4(2, mo17605yj(), mo17474ck()), 0.0f, 0.0f), 1);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: up */
    public float mo17579up() {
        return this.f11860ck;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: uz */
    public C12007ix mo17580uz() {
        if (mo17480h4().m56775x1(this)) {
            return C12007ix.f40519k4;
        }
        AbstractC4415wy abstractC4415wyM56574up = mo17568m9().m56574up();
        AbstractC4415wy.k4 k4Var = new AbstractC4415wy.k4(this.f11877x1.m56669jd(), this.f11877x1.m56664ck(), this.f11877x1.m56663c5(), this.f11877x1.m56683x1());
        if (abstractC4415wyM56574up.mo17781c5() <= 0.0d || abstractC4415wyM56574up.mo17785jd() <= 0.0d) {
            return C12007ix.f40519k4;
        }
        AbstractC4415wy.m18009k4(abstractC4415wyM56574up, C6541k4.m26346k4(m17448du(mo17577u4()), k4Var).mo8355dy().m56574up(), abstractC4415wyM56574up);
        return new C12007ix((float) abstractC4415wyM56574up.mo17784h4(), (float) abstractC4415wyM56574up.mo17787m9(), (float) abstractC4415wyM56574up.mo17781c5(), (float) abstractC4415wyM56574up.mo17785jd());
    }

    /* JADX INFO: renamed from: v4 */
    public boolean m17581v4() {
        return (mo17566ks() == 4 || mo17566ks() == 2) ? false : true;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: wl */
    public InterfaceC14122k4 mo17582wl() {
        return this.f11861du;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x6 */
    public int mo17603x6() {
        return this.f11879yj;
    }

    /* JADX INFO: renamed from: yd */
    public boolean m17604yd() {
        int i = this.f11879yj;
        return i == 4 || i == 2;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: yj */
    public int mo17605yj() {
        return this.f11863fa;
    }

    /* JADX INFO: renamed from: k4 */
    private C11893c5 m17449k4(C11913yj c11913yj, boolean z) {
        C11893c5 c11893c5 = new C11893c5(this, c11913yj, z);
        m17469x1(c11893c5);
        return c11893c5;
    }

    /* JADX INFO: renamed from: kk */
    private C12018u4 m17461kk(InterfaceC1565x1 interfaceC1565x1) {
        if (interfaceC1565x1 == null) {
            return null;
        }
        return new C12018u4(C11896dy.m55503k4(interfaceC1565x1));
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> C4369ck m17466x1(T t) {
        C4369ck c4369ck = new C4369ck();
        c4369ck.f11861du = AbstractC14124to.m67617m9().mo67652x1(t);
        c4369ck.m17462kk((AbstractC12002ck) null);
        return c4369ck;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: du */
    public void mo17475du() {
        this.f11878x6.m55758dy();
        m17446ak();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: dy */
    public void mo17478dy(int i) {
        this.f11872rv = i;
        this.f11861du.mo67587h4(i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: h4 */
    public void mo17481h4(int i) {
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C11908u4.class), i)) {
            throw new ArgumentException("smoothingMode");
        }
        this.f11879yj = i;
        this.f11861du.mo67600to(i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: m9 */
    public void mo17569m9(int i) {
        if (i < 0 || i > 12) {
            throw new ArgumentException();
        }
        this.f11868ks = i;
        this.f11861du.mo67585du(i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: to */
    public void mo17574to(int i) {
        if (i == 0) {
            throw new ArgumentException("Bad argument", "value");
        }
        this.f11863fa = i;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: du */
    public void mo17476du(int i) {
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C11905ne.class), i)) {
            throw new ArgumentException("pixelOffsetMode");
        }
        this.f11874up = i;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public C11904m9 mo17485k4() {
        return new C11904m9(m17449k4(C11913yj.f40121k4, true));
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: kk */
    public void mo17559kk() {
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: to */
    public void mo17575to(C11913yj c11913yj) {
        C11913yj c11913yjMo17471ar = mo17471ar();
        c11913yjMo17471ar.m55769k4(c11913yj, 0);
        mo17561kk(c11913yjMo17471ar);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public C11893c5 mo17583x1() {
        return m17449k4(C11913yj.f40121k4, false);
    }

    /* JADX INFO: renamed from: x1 */
    private static C11913yj m17467x1(AbstractC12008jd abstractC12008jd) {
        C11913yj c11913yj = new C11913yj();
        if (!C4375kk.m17630k4(abstractC12008jd.mo17605yj())) {
            C11913yj c11913yj2 = new C11913yj();
            c11913yj2.m55763k4(abstractC12008jd.mo17483jd() / C4375kk.m17632kk(), abstractC12008jd.mo17474ck() / C4375kk.m17633to());
            c11913yj.m55787x1(c11913yj2);
        }
        if (abstractC12008jd.mo17605yj() != 1) {
            C11913yj c11913yj3 = new C11913yj();
            c11913yj3.m55763k4(abstractC12008jd.mo17579up(), abstractC12008jd.mo17579up());
            c11913yj.m55787x1(c11913yj3);
        }
        C11913yj c11913yj4 = new C11913yj();
        float fM17615k4 = (float) C4375kk.m17615k4(abstractC12008jd.mo17605yj(), 1, 1.0d);
        c11913yj4.m55763k4(fM17615k4, fM17615k4);
        c11913yj.m55787x1(c11913yj4);
        return c11913yj;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public C11904m9 mo17486k4(C12007ix c12007ix, C12007ix c12007ix2, int i) {
        C11913yj c11913yj = new C11913yj(c12007ix2.Clone(), new C12025x6[]{new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck())});
        float fM17615k4 = (float) C4375kk.m17615k4(2, i, C4375kk.m17615k4(mo17605yj(), 2, 1.0d));
        c11913yj.m55763k4(fM17615k4, fM17615k4);
        return new C11904m9(m17449k4(c11913yj, true));
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: kk */
    public void mo17560kk(int i) {
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C11897fa.class), i)) {
            throw new ArgumentException("interpolationMode");
        }
        Integer numValueOf = Integer.valueOf(i);
        this.f11866jd = numValueOf;
        this.f11861du.mo67597kk(numValueOf.intValue());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: to */
    public void mo17576to(C12026yj c12026yj, C12016rv[] c12016rvArr) {
        C11896dy c11896dy = new C11896dy();
        if (c12016rvArr == null) {
            throw new ArgumentNullException("points");
        }
        if (c12016rvArr.length < 2) {
            throw new ArgumentException("Invalid parameter used.");
        }
        int i = 0;
        while (i < c12016rvArr.length - 1) {
            C12016rv c12016rv = c12016rvArr[i];
            i++;
            c11896dy.m55546k4(c12016rv, c12016rvArr[i]);
        }
        c11896dy.m55567m9();
        mo17540k4(c12026yj, c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12013m9 m17450k4(C12013m9 c12013m9) {
        return C4378x1.m17687k4(c12013m9) ? new C12013m9("Times New Roman", c12013m9.m56639dy(), c12013m9.m56642jd(), c12013m9.m56640fa(), c12013m9.m56646kk(), c12013m9.m56649to()) : c12013m9;
    }

    /* JADX INFO: renamed from: x1 */
    private String m17468x1(String str) {
        String strReplaceAll;
        String[] strArr = {"҃҃", "҄҄", "҅҅", "҆҆"};
        int i = 0;
        while (i < 4) {
            String str2 = strArr[i];
            while (true) {
                strReplaceAll = str.replaceAll(str2, str2.substring(1));
                if (strReplaceAll.length() == str.length()) {
                    break;
                }
                str = strReplaceAll;
            }
            i++;
            str = strReplaceAll;
        }
        return str;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: kk */
    public void mo17561kk(C11913yj c11913yj) {
        this.f11861du.mo67593k4(c11913yj);
    }

    /* JADX INFO: renamed from: kk */
    private void m17462kk(AbstractC12002ck abstractC12002ck) {
        this.f11867k4 = abstractC12002ck;
        this.f11878x6 = new C11913yj();
        if (abstractC12002ck != null) {
            this.f11864h4 = abstractC12002ck.mo15752dy();
            this.f11869m9 = abstractC12002ck.mo15758up();
            this.f11877x1 = new C12014ne(0, 0, abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9());
        } else {
            this.f11864h4 = this.f11861du.mo67599to();
            this.f11869m9 = this.f11861du.mo67599to();
            this.f11877x1 = new C12014ne(0, 0, 1024, ViewUtils.EDGE_TO_EDGE_FLAGS);
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public C12015qq mo17487k4(String str, C12013m9 c12013m9) {
        return m17451k4(str, c12013m9, (C12019um) null, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, (int[]) null);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17584x1(float f, float f2) {
        mo17585x1(f, f2, 0);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public C12015qq mo17488k4(String str, C12013m9 c12013m9, int i, C12019um c12019um) {
        return m17451k4(str, c12013m9, c12019um, i, f11857kk, (int[]) null);
    }

    /* JADX INFO: renamed from: kk */
    public void m17562kk(C12026yj c12026yj, float f, float f2, float f3, float f4) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55534k4(f, f2, f3, f4);
        mo17540k4(c12026yj, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17585x1(float f, float f2, int i) {
        this.f11878x6.m55786x1(f, f2, i);
        m17446ak();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public C12015qq mo17489k4(String str, C12013m9 c12013m9, C12015qq c12015qq, C12019um c12019um) {
        return m17451k4(str, c12013m9, c12019um, c12015qq.m56699x1(), c12015qq.m56697kk(), (int[]) null);
    }

    /* JADX INFO: renamed from: kk */
    public void m17563kk(C12026yj c12026yj, int i, int i2, int i3, int i4) {
        mo17595x1(c12026yj, i, i2, i3, i4);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17586x1(int i) {
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C11895du.class), i)) {
            throw new ArgumentException("compositingQuality");
        }
        this.f11859c5 = i;
        this.f11861du.mo67602x1(i);
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m17451k4(String str, C12013m9 c12013m9, C12019um c12019um, float f, float f2, int[] iArr) {
        if (str == null || str.isEmpty()) {
            return C12015qq.f40552k4.Clone();
        }
        if (c12013m9 == null) {
            throw new ArgumentNullException("font");
        }
        float f3 = f <= 0.0f ? f11857kk : f;
        float f4 = f2 <= 0.0f ? f11857kk : f2;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        int iMo17482ix = mo17482ix();
        try {
            String strM27497k4 = C7035kk.m27497k4(c12013m9, str);
            C12013m9 c12013m9M27503x1 = C7035kk.m27503x1(c12013m9, strM27497k4);
            if (!c12013m9M27503x1.m56648m9().equalsIgnoreCase(c12013m9M27503x1.m56648m9())) {
                c12013m9M27503x1 = C7035kk.m27496k4(c12013m9M27503x1, strM27497k4, 1);
            }
            C10130to c10130to = new C10130to(this, C7035kk.m27498k4(c12013m9M27503x1.m56648m9(), m17468x1(m17452k4(strM27497k4))), C4378x1.m17684k4(this, c12013m9M27503x1), C4378x1.m17684k4(this, c12013m9), mo17582wl().mo67601x1(), c12019um, f3, f4);
            int iM49753du = c10130to.m49753du();
            float fM49756h4 = c10130to.m49756h4();
            float fM49766m9 = c10130to.m49766m9();
            if (c12019um != null && c12019um.m56803ck()) {
                fM49766m9 = fM49756h4;
                fM49756h4 = fM49766m9;
            }
            if (iArr != null) {
                iArr[0] = iM49753du;
                iArr[1] = c10130to.m49768to();
            }
            if (c12019um == null || !c12019um.m56828yj()) {
                if (fM49756h4 <= f3) {
                    f3 = fM49756h4;
                }
                if (fM49766m9 <= f4) {
                    f4 = fM49766m9;
                }
                fM49756h4 = f3;
            } else {
                f4 = fM49766m9;
            }
            C12015qq c12015qq = new C12015qq(fM49756h4, f4);
            mo17478dy(iMo17482ix);
            return c12015qq;
        } catch (Throwable th) {
            mo17478dy(iMo17482ix);
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: kk */
    public void mo17564kk(C12026yj c12026yj, C12016rv[] c12016rvArr) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55581x1(c12016rvArr);
        mo17540k4(c12026yj, c11896dy);
    }

    /* JADX INFO: renamed from: x1 */
    public void m17587x1(InterfaceC1565x1 interfaceC1565x1) {
        if (interfaceC1565x1 == null) {
            mo17582wl().mo67590k4((InterfaceC1565x1) null);
            return;
        }
        InterfaceC1565x1 interfaceC1565x1M17623k4 = C4375kk.m17623k4(interfaceC1565x1);
        if (!(interfaceC1565x1M17623k4 instanceof AbstractC4415wy.k4)) {
            mo17582wl().mo67590k4(interfaceC1565x1);
            return;
        }
        C12014ne c12014neM56763m9 = new C12018u4().m56763m9();
        AbstractC4415wy.k4 k4Var = (AbstractC4415wy.k4) interfaceC1565x1M17623k4;
        if (k4Var.mo17781c5() >= c12014neM56763m9.m56663c5() || k4Var.mo17785jd() >= c12014neM56763m9.m56683x1()) {
            mo17582wl().mo67590k4((InterfaceC1565x1) null);
        } else {
            mo17582wl().mo67590k4(k4Var);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m17469x1(C11893c5 c11893c5) {
        c11893c5.m55501k4(this.f11873u4);
        this.f11873u4 = c11893c5;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public C12015qq mo17490k4(String str, C12013m9 c12013m9, C12025x6 c12025x6, C12019um c12019um) {
        return m17451k4(str, c12013m9, c12019um, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, (int[]) null);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: kk */
    public void mo17565kk(C12026yj c12026yj, C12025x6[] c12025x6Arr) {
        C11896dy c11896dy = new C11896dy();
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("points");
        }
        if (c12025x6Arr.length < 2) {
            throw new ArgumentException("Invalid parameter used.");
        }
        int i = 0;
        while (i < c12025x6Arr.length - 1) {
            C12025x6 c12025x6 = c12025x6Arr[i];
            i++;
            c11896dy.m55547k4(c12025x6, c12025x6Arr[i]);
        }
        c11896dy.m55567m9();
        mo17540k4(c12026yj, c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m17452k4(String str) {
        return str.replaceAll("\u0000", "");
    }

    /* JADX INFO: renamed from: kk */
    private boolean m17463kk(C11893c5 c11893c5) {
        C11893c5 c11893c5M55500k4 = this.f11873u4;
        while (c11893c5M55500k4 != c11893c5) {
            c11893c5M55500k4 = c11893c5M55500k4.m55500k4();
            if (c11893c5M55500k4 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17588x1(C11913yj c11913yj) {
        if (c11913yj == null) {
            throw new NullPointerException("Value of 'value' cannot be null");
        }
        if (!c11913yj.m55778kk()) {
            throw new ArgumentException("Value of 'value' is invalid");
        }
        c11913yj.m55768k4(this.f11878x6);
        m17446ak();
    }

    /* JADX INFO: renamed from: k4 */
    private String m17453k4(String str, C12019um c12019um, C7015du<C12013m9> c7015du) {
        String str2 = str;
        int iM56807h4 = c12019um.m56807h4();
        if (iM56807h4 > 0 && (c12019um.m56819m9() == 3 || c12019um.m56819m9() == 2)) {
            C11697x1 c11697x1 = new C11697x1(iM56807h4);
            if (c11697x1.m55259c5().endsWith("IN")) {
                c11697x1 = c12019um.m56819m9() == 2 ? new C11697x1("en-IN") : new C11697x1("mr-IN");
            }
            C7015du<List<String>> c7015du2 = new C7015du<>(new ArrayList());
            C7015du<List<Integer>> c7015du3 = new C7015du<>(new ArrayList());
            m17456k4(str2, c7015du2, c7015du3);
            ArrayList<int[]> arrayList = new ArrayList();
            int i = 10;
            if (c11697x1.m55259c5().startsWith(TranslateLanguage.ARABIC)) {
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < c7015du3.f19072k4.size() - 1) {
                    int length = c7015du2.f19072k4.get(i2).length() + c7015du3.f19072k4.get(i2).intValue();
                    i2++;
                    String[] strArrSplit = str2.substring(length, c7015du3.f19072k4.get(i2).intValue()).split("[\\s]+");
                    if ((strArrSplit.length == 1 && strArrSplit[0].length() > 0) || strArrSplit.length > 1) {
                        arrayList.add(new int[]{i3, i4});
                        i3 = i2;
                    }
                    i4 = i2;
                }
                arrayList.add(new int[]{i3, i4});
                c11697x1.m55263fa().m55053k4(iM56807h4);
                for (int[] iArr : arrayList) {
                    String strOooO0Oo = "";
                    int i5 = 0;
                    while (true) {
                        int i6 = iArr[1];
                        if (i5 <= i6 - iArr[0]) {
                            String strReplaceFirst = c7015du2.f19072k4.get(i6 - i5).replaceFirst("[\\.,]", c11697x1.m55263fa().m55062ne());
                            int i7 = 0;
                            while (i7 < i) {
                                strReplaceFirst = strReplaceFirst.replaceAll(new Integer(i7).toString(), c11697x1.m55263fa().m55069up()[i7]);
                                i7++;
                                i = 10;
                            }
                            if (iArr[1] > iArr[0] && (strReplaceFirst.startsWith("+") || strReplaceFirst.startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR))) {
                                strReplaceFirst = strReplaceFirst.substring(1) + strReplaceFirst.charAt(0);
                            }
                            strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo, strReplaceFirst);
                            if (i5 < iArr[1] - iArr[0]) {
                                StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strOooO0Oo);
                                sbOooO0OO.append(str2.substring(c7015du2.f19072k4.get((iArr[1] - i5) - 1).length() + c7015du3.f19072k4.get((iArr[1] - i5) - 1).intValue(), c7015du3.f19072k4.get(iArr[1] - i5).intValue()));
                                strOooO0Oo = sbOooO0OO.toString();
                            }
                            i5++;
                            i = 10;
                        }
                    }
                    str2 = str2.substring(0, c7015du3.f19072k4.get(iArr[0]).intValue()) + strOooO0Oo + str2.substring(c7015du2.f19072k4.get(iArr[1]).length() + c7015du3.f19072k4.get(iArr[1]).intValue());
                    i = 10;
                }
                return str2;
            }
            for (int i8 = 0; i8 < c7015du2.f19072k4.size(); i8++) {
                String strReplaceFirst2 = c7015du2.f19072k4.get(i8).replaceFirst("[\\.,]", c11697x1.m55263fa().m55062ne());
                for (int i9 = 0; i9 < 10; i9++) {
                    strReplaceFirst2 = strReplaceFirst2.replaceAll(new Integer(i9).toString(), c11697x1.m55263fa().m55069up()[i9]);
                }
                str2 = str2.substring(0, c7015du3.f19072k4.get(i8).intValue()) + strReplaceFirst2 + str2.substring(c7015du2.f19072k4.get(i8).length() + c7015du3.f19072k4.get(i8).intValue());
            }
        }
        return str2;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17589x1(AbstractC12002ck abstractC12002ck, int i, int i2) {
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("Value of 'image' cannot be null");
        }
        mo17504k4(abstractC12002ck, i, i2, abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17590x1(C12018u4 c12018u4) {
        mo17523k4(c12018u4, 0);
    }

    /* JADX INFO: renamed from: x1 */
    private void m17470x1(C12018u4 c12018u4, int i) {
        C4408to c4408to = (C4408to) c12018u4.m56748k4().clone();
        boolean zM56762kk = mo17480h4().m56762kk(this);
        if (i == 0) {
            m17587x1((InterfaceC1565x1) null);
            return;
        }
        if (i == 1) {
            if (zM56762kk) {
                m17587x1((InterfaceC1565x1) null);
                return;
            } else {
                m17455k4(c4408to, i);
                return;
            }
        }
        if (i == 2) {
            m17587x1((InterfaceC1565x1) null);
        } else {
            if (i != 3 && i != 4 && i != 5) {
                throw new ArgumentException();
            }
            m17455k4(c4408to, i);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m17591x1(AbstractC12024x1 abstractC12024x1, float f, float f2, float f3, float f4) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55534k4(f, f2, f3, f4);
        mo17527k4(abstractC12024x1, c11896dy);
    }

    /* JADX INFO: renamed from: x1 */
    public void m17592x1(AbstractC12024x1 abstractC12024x1, int i, int i2, int i3, int i4) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55538k4(i, i2, i3, i4);
        mo17527k4(abstractC12024x1, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17593x1(AbstractC12024x1 abstractC12024x1, C12007ix c12007ix) {
        mo17524k4(abstractC12024x1, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17594x1(AbstractC12024x1 abstractC12024x1, C12014ne c12014ne) {
        mo17526k4(abstractC12024x1, c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17595x1(C12026yj c12026yj, float f, float f2, float f3, float f4) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55562kk(f, f2, f3, f4);
        mo17540k4(c12026yj, c11896dy);
    }

    /* JADX INFO: renamed from: x1 */
    public void m17596x1(C12026yj c12026yj, float f, float f2, float f3, float f4, float f5, float f6) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55575x1(f, f2, f3, f4, f5, f6);
        mo17540k4(c12026yj, c11896dy);
    }

    /* JADX INFO: renamed from: x1 */
    public void m17597x1(C12026yj c12026yj, int i, int i2, int i3, int i4) {
        m17562kk(c12026yj, i, i2, i3, i4);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17598x1(C12026yj c12026yj, C12007ix c12007ix, float f, float f2) {
        m17596x1(c12026yj, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1(), f, f2);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17599x1(C12026yj c12026yj, C12014ne c12014ne) {
        m17563kk(c12026yj, c12014ne.m56681to(), c12014ne.m56666dy(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17491k4(float f) {
        if (f <= 0.0f) {
            throw new ArgumentException("PageScale property's value can not be less or equal to zero");
        }
        this.f11860ck = f;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17600x1(C12026yj c12026yj, C12014ne c12014ne, float f, float f2) {
        m17596x1(c12026yj, c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1(), f, f2);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17492k4(float f, float f2) {
        mo17493k4(f, f2, 0);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17601x1(C12026yj c12026yj, C12016rv[] c12016rvArr) {
        m17549k4(c12026yj, c12016rvArr, 0.5f);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17493k4(float f, float f2, int i) {
        if (f == 0.0f || f2 == 0.0f) {
            throw new ArgumentException("Value of 'sx' or 'sy' is invalid");
        }
        this.f11878x6.m55764k4(f, f2, i);
        m17446ak();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: x1 */
    public void mo17602x1(C12026yj c12026yj, C12025x6[] c12025x6Arr) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55564kk(c12025x6Arr);
        mo17540k4(c12026yj, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17494k4(float f, int i) {
        this.f11878x6.m55765k4(f, i);
        m17446ak();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17495k4(int i) {
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C11907to.class), i)) {
            throw new ArgumentException("compositingMode");
        }
        this.f11862dy = i;
        this.f11861du.mo67589k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m17454k4(C4408to c4408to) {
        m17455k4(c4408to, 1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m17455k4(C4408to c4408to, int i) {
        InterfaceC1565x1 interfaceC1565x1M17636x1 = C4375kk.m17636x1(C4375kk.m17624k4(C4375kk.m17624k4(c4408to, mo17577u4()), m17467x1((AbstractC12008jd) this)));
        if (i == 0) {
            this.f11865ix = m17448du(mo17577u4());
            m17587x1(interfaceC1565x1M17636x1);
            return;
        }
        InterfaceC1565x1 interfaceC1565x1Mo67586h4 = mo17582wl().mo67586h4();
        if (interfaceC1565x1Mo67586h4 == null) {
            interfaceC1565x1Mo67586h4 = new C12018u4().m56748k4();
        }
        C4408to c4408to2 = new C4408to(C4375kk.m17636x1(interfaceC1565x1Mo67586h4));
        C4408to c4408to3 = new C4408to(interfaceC1565x1M17636x1);
        if (i == 1) {
            c4408to2.m17978kk(c4408to3);
            m17587x1((InterfaceC1565x1) c4408to2);
            return;
        }
        if (i == 2) {
            c4408to2.m17974k4(c4408to3);
            m17587x1((InterfaceC1565x1) c4408to2);
            return;
        }
        if (i == 3) {
            c4408to2.m17979to(c4408to3);
            m17587x1((InterfaceC1565x1) c4408to2);
        } else if (i == 4) {
            c4408to2.m17982x1(c4408to3);
            m17587x1((InterfaceC1565x1) c4408to2);
        } else {
            if (i != 5) {
                throw new ArgumentException();
            }
            c4408to3.m17982x1(c4408to2);
            m17587x1((InterfaceC1565x1) c4408to3);
            this.f11865ix = m17448du(mo17577u4());
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17496k4(C11893c5 c11893c5) {
        if (m17463kk(c11893c5)) {
            while (m17447b3() != c11893c5) {
            }
            c11893c5.m55502k4(this);
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17497k4(C11896dy c11896dy, int i) {
        if (c11896dy == null) {
            throw new ArgumentNullException("path");
        }
        m17455k4(new C4408to(c11896dy.m55568ne()), i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17498k4(C11904m9 c11904m9) {
        if (c11904m9 == null) {
            throw new ArgumentNullException("Value of 'container' cannot be null");
        }
        mo17496k4(c11904m9.m55674k4());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17499k4(C11913yj c11913yj) {
        mo17500k4(c11913yj, 0);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17500k4(C11913yj c11913yj, int i) {
        if (c11913yj == null) {
            throw new ArgumentNullException("Value of 'matrix' cannot be null");
        }
        if (!c11913yj.m55778kk()) {
            throw new ArgumentException("Value of 'matrix' is invalid");
        }
        this.f11878x6.m55769k4(c11913yj, i);
        m17446ak();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17501k4(AbstractC12002ck abstractC12002ck, float f, float f2) {
        this.f11871qq.m17660k4(abstractC12002ck, f, f2);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17502k4(AbstractC12002ck abstractC12002ck, float f, float f2, float f3, float f4) {
        this.f11871qq.m17661k4(abstractC12002ck, f, f2, f3, f4);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17503k4(AbstractC12002ck abstractC12002ck, int i, int i2) {
        this.f11871qq.m17663k4(abstractC12002ck, i, i2);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17504k4(AbstractC12002ck abstractC12002ck, int i, int i2, int i3, int i4) {
        this.f11871qq.m17664k4(abstractC12002ck, i, i2, i3, i4);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17505k4(AbstractC12002ck abstractC12002ck, int i, int i2, C12014ne c12014ne, int i3) {
        this.f11871qq.m17665k4(abstractC12002ck, i, i2, c12014ne, i3);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17506k4(AbstractC12002ck abstractC12002ck, C12007ix c12007ix) {
        this.f11871qq.m17666k4(abstractC12002ck, c12007ix);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17507k4(AbstractC12002ck abstractC12002ck, C12007ix c12007ix, C12007ix c12007ix2, int i) {
        this.f11871qq.m17667k4(abstractC12002ck, c12007ix, c12007ix2, i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17508k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne) {
        this.f11871qq.m17668k4(abstractC12002ck, c12014ne);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17509k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne, float f, float f2, float f3, float f4, int i) {
        this.f11871qq.m17669k4(abstractC12002ck, c12014ne, f, f2, f3, f4, i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17510k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne, float f, float f2, float f3, float f4, int i, C3976c5 c3976c5) {
        this.f11871qq.m17670k4(abstractC12002ck, c12014ne, f, f2, f3, f4, i, c3976c5);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17511k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne, int i, int i2, int i3, int i4, int i5, C3976c5 c3976c5) {
        this.f11871qq.m17671k4(abstractC12002ck, c12014ne, i, i2, i3, i4, i5, c3976c5);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17512k4(AbstractC12002ck abstractC12002ck, C12014ne c12014ne, C12014ne c12014ne2, int i) {
        this.f11871qq.m17672k4(abstractC12002ck, c12014ne, c12014ne2, i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17513k4(AbstractC12002ck abstractC12002ck, C12016rv c12016rv) {
        this.f11871qq.m17673k4(abstractC12002ck, c12016rv);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17514k4(AbstractC12002ck abstractC12002ck, C12025x6 c12025x6) {
        this.f11871qq.m17674k4(abstractC12002ck, c12025x6);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17515k4(AbstractC12002ck abstractC12002ck, C12016rv[] c12016rvArr, C12014ne c12014ne, int i, C3976c5 c3976c5) {
        this.f11871qq.m17676k4(abstractC12002ck, c12016rvArr, c12014ne, i, c3976c5);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17516k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, C3976c5 c3976c5) {
        this.f11871qq.m17678k4(abstractC12002ck, c12025x6Arr, c12007ix, i, c3976c5);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17517k4(C12003du c12003du) {
        this.f11861du.mo67594k4(c12003du);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17518k4(C12007ix c12007ix) {
        mo17519k4(c12007ix.Clone(), 0);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17519k4(C12007ix c12007ix, int i) {
        m17455k4(new C4408to(c12007ix.m56574up()), i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17520k4(C12014ne c12014ne, int i) {
        mo17519k4(C12007ix.m56544k4(c12014ne), i);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17521k4(C12016rv c12016rv) {
        if (c12016rv == null) {
            throw new ArgumentNullException("Argument cannot be null");
        }
        this.f11870ne = c12016rv;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17522k4(C12018u4 c12018u4) {
        if (c12018u4 == null) {
            throw new ArgumentNullException("region");
        }
        if (c12018u4.m56762kk(this)) {
            return;
        }
        m17454k4(c12018u4.m56748k4());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17523k4(C12018u4 c12018u4, int i) {
        if (c12018u4 == null) {
            throw new ArgumentNullException("region");
        }
        if (c12018u4.m56762kk(this)) {
            m17470x1(c12018u4, i);
        } else {
            m17455k4((C4408to) c12018u4.m56748k4().clone(), i);
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17524k4(AbstractC12024x1 abstractC12024x1, float f, float f2, float f3, float f4) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55562kk(f, f2, f3, f4);
        this.f11875uz.m17607k4(abstractC12024x1, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17525k4(AbstractC12024x1 abstractC12024x1, float f, float f2, float f3, float f4, float f5, float f6) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55575x1(f, f2, f3, f4, f5, f6);
        mo17527k4(abstractC12024x1, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17526k4(AbstractC12024x1 abstractC12024x1, int i, int i2, int i3, int i4) {
        mo17524k4(abstractC12024x1, i, i2, i3, i4);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17527k4(AbstractC12024x1 abstractC12024x1, C11896dy c11896dy) {
        this.f11875uz.m17607k4(abstractC12024x1, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17528k4(AbstractC12024x1 abstractC12024x1, C12007ix c12007ix) {
        m17591x1(abstractC12024x1, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17529k4(AbstractC12024x1 abstractC12024x1, C12014ne c12014ne) {
        m17592x1(abstractC12024x1, c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17530k4(AbstractC12024x1 abstractC12024x1, C12014ne c12014ne, float f, float f2) {
        mo17525k4(abstractC12024x1, c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1(), f, f2);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17531k4(AbstractC12024x1 abstractC12024x1, C12018u4 c12018u4) {
        this.f11875uz.m17607k4(abstractC12024x1, C11896dy.m55503k4((InterfaceC1565x1) c12018u4));
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17532k4(AbstractC12024x1 abstractC12024x1, C12007ix[] c12007ixArr) {
        if (c12007ixArr == null) {
            throw new ArgumentNullException("Value of 'rects' cannot be null");
        }
        if (c12007ixArr.length == 0) {
            throw new ArgumentException("Value of 'rects' cannot be empty");
        }
        for (C12007ix c12007ix : c12007ixArr) {
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55578x1(c12007ix);
            mo17527k4(abstractC12024x1, c11896dy);
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17533k4(AbstractC12024x1 abstractC12024x1, C12016rv[] c12016rvArr, int i) {
        C11896dy c11896dy = new C11896dy(i);
        c11896dy.m55563kk(c12016rvArr);
        mo17527k4(abstractC12024x1, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17534k4(AbstractC12024x1 abstractC12024x1, C12025x6[] c12025x6Arr) {
        mo17535k4(abstractC12024x1, c12025x6Arr, 0);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17535k4(AbstractC12024x1 abstractC12024x1, C12025x6[] c12025x6Arr, int i) {
        C11896dy c11896dy = new C11896dy(i);
        c11896dy.m55570to(c12025x6Arr);
        mo17527k4(abstractC12024x1, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17536k4(AbstractC12024x1 abstractC12024x1, C12025x6[] c12025x6Arr, int i, float f) {
        C11896dy c11896dy = new C11896dy(i);
        c11896dy.m55556k4(c12025x6Arr, f);
        mo17527k4(abstractC12024x1, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17537k4(C12026yj c12026yj, float f, float f2, float f3, float f4) {
        if (f == f3 && f2 == f4) {
            return;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55574x1(f, f2, f3, f4);
        mo17540k4(c12026yj, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17538k4(C12026yj c12026yj, float f, float f2, float f3, float f4, float f5, float f6) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55535k4(f, f2, f3, f4, f5, f6);
        mo17540k4(c12026yj, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17539k4(C12026yj c12026yj, int i, int i2, int i3, int i4) {
        mo17537k4(c12026yj, i, i2, i3, i4);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17540k4(C12026yj c12026yj, C11896dy c11896dy) {
        this.f11876wl.m17445k4(c12026yj, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17541k4(C12026yj c12026yj, C12007ix c12007ix) {
        m17562kk(c12026yj, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17542k4(C12026yj c12026yj, C12007ix c12007ix, float f, float f2) {
        mo17538k4(c12026yj, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1(), f, f2);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17543k4(C12026yj c12026yj, C12014ne c12014ne) {
        m17597x1(c12026yj, c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17544k4(C12026yj c12026yj, C12014ne c12014ne, float f, float f2) {
        mo17538k4(c12026yj, c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1(), f, f2);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17545k4(C12026yj c12026yj, C12016rv c12016rv, C12016rv c12016rv2) {
        mo17539k4(c12026yj, c12016rv.m56708k4(), c12016rv.m56713x1(), c12016rv2.m56708k4(), c12016rv2.m56713x1());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17546k4(C12026yj c12026yj, C12025x6 c12025x6, C12025x6 c12025x62) {
        mo17537k4(c12026yj, c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17547k4(C12026yj c12026yj, C12007ix[] c12007ixArr) {
        for (C12007ix c12007ix : c12007ixArr) {
            mo17595x1(c12026yj, c12007ix.m56571to(), c12007ix.m56554dy(), c12007ix.m56550c5(), c12007ix.m56575x1());
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17548k4(C12026yj c12026yj, C12016rv[] c12016rvArr) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55553k4(c12016rvArr);
        mo17540k4(c12026yj, c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17549k4(C12026yj c12026yj, C12016rv[] c12016rvArr, float f) {
        if (c12016rvArr == null) {
            throw new ArgumentNullException("Value 'points' cannot be null");
        }
        m17550k4(c12026yj, c12016rvArr, 0, c12016rvArr.length - 1, f);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17550k4(C12026yj c12026yj, C12016rv[] c12016rvArr, int i, int i2, float f) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55554k4(c12016rvArr, i, i2, f);
        mo17540k4(c12026yj, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17551k4(C12026yj c12026yj, C12025x6[] c12025x6Arr) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55555k4(c12025x6Arr);
        mo17540k4(c12026yj, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17552k4(C12026yj c12026yj, C12025x6[] c12025x6Arr, float f, int i) {
        C11896dy c11896dy = new C11896dy(i);
        c11896dy.m55556k4(c12025x6Arr, f);
        mo17540k4(c12026yj, c11896dy);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17553k4(C12026yj c12026yj, C12025x6[] c12025x6Arr, int i, int i2, float f) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55557k4(c12025x6Arr, i, i2, f);
        mo17540k4(c12026yj, c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    private void m17456k4(String str, C7015du<List<String>> c7015du, C7015du<List<Integer>> c7015du2) {
        Matcher matcher = Pattern.compile("((-|\\+:?)?[0-9]+((,|\\.:?)[0-9]+:?)?)", 107).matcher(str);
        matcher.reset();
        while (matcher.find()) {
            c7015du.f19072k4.add(matcher.group(1));
            c7015du2.f19072k4.add(Integer.valueOf(matcher.start(1)));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(1:4)(1:5)|6|(1:49)(12:10|(1:12)(1:13)|14|(1:16)(1:17)|18|(1:20)(1:21)|22|(1:24)(1:25)|26|(1:28)|29|(4:31|(1:37)(1:36)|38|(19:40|50|113|51|(1:59)|(1:67)(1:65)|66|110|108|68|(1:70)(1:71)|72|73|111|74|(2:75|(4:77|(1:79)(1:83)|80|84)(1:115))|(1:91)|95|96)(1:41))(2:45|(9:47|44|50|113|51|(1:59)|(15:61|67|66|110|108|68|(0)(0)|72|73|111|74|(3:75|(0)(0)|84)|(3:87|89|91)|95|96)(0)|106|107)(10:48|43|44|50|113|51|(0)|(0)(0)|106|107)))|42|43|44|50|113|51|(0)|(0)(0)|106|107|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d A[EDGE_INSN: B:115:0x015d->B:86:0x015d BREAK  A[LOOP:0: B:75:0x012a->B:84:0x0155], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0102 A[Catch: all -> 0x0184, TryCatch #0 {all -> 0x0184, blocks: (B:68:0x00fb, B:72:0x0106, B:71:0x0102), top: B:108:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130 A[Catch: all -> 0x014e, TryCatch #2 {all -> 0x014e, blocks: (B:74:0x011c, B:75:0x012a, B:77:0x0130, B:79:0x0144, B:80:0x0148, B:84:0x0155, B:83:0x0150), top: B:111:0x011c }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.aspose.slides.internal.w8.yj] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.aspose.slides.ms.backend.System.Drawing.k4] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m17457k4(String str, C12013m9 c12013m9, C12013m9 c12013m92, AbstractC12024x1 abstractC12024x1, float f, float f2, float f3, float f4, C12019um c12019um) throws Throwable {
        C4369ck c4369ck;
        float f5;
        float f6;
        float f7;
        float f8;
        C11913yj c11913yjMo67596kk;
        float f9;
        InterfaceC1565x1 interfaceC1565x1Mo67586h4;
        InterfaceC1565x1 interfaceC1565x1;
        float f10;
        C10130to c10130to;
        float f11;
        InterfaceC10128k4 interfaceC10128k4M49754dy;
        float f12;
        float f13;
        C12013m9 c12013m9M17684k4 = c12013m92;
        ?? r12 = 0;
        float f14 = f3 == 0.0f ? Float.POSITIVE_INFINITY : f3;
        boolean z = true;
        if (c12019um == null || c12019um.m56825x1() == 0) {
            c4369ck = this;
            f5 = f;
        } else {
            c4369ck = this;
            C12015qq c12015qqM17451k4 = c4369ck.m17451k4(str, c12013m9, c12019um, c12019um.m56803ck() ? f11857kk : f14, c12019um.m56803ck() ? f4 : f11857kk, (int[]) null);
            if (C14064he.m66703du(f14)) {
                f12 = 0.0f;
                f13 = 0.0f;
            } else {
                f12 = f4;
                f13 = f14;
            }
            float fM56699x1 = c12019um.m56803ck() ? f13 - c12015qqM17451k4.m56699x1() : f12 - c12015qqM17451k4.m56697kk();
            if (c12019um.m56825x1() == 1) {
                fM56699x1 /= 2.0f;
            }
            if (!c12019um.m56803ck()) {
                f7 = f2 + fM56699x1;
                if (C14064he.m66703du(f4)) {
                    f5 = f;
                    f6 = f4;
                    f8 = f14;
                    c11913yjMo67596kk = c4369ck.mo17582wl().mo67596kk();
                    c4369ck.mo17582wl().mo67595k4(abstractC12024x1);
                    c4369ck.mo17582wl().mo67593k4(c4369ck.m17472bv());
                    if (!C14064he.m66703du(f8)) {
                    }
                    if (z) {
                    }
                    mo17582wl().mo67593k4(r12);
                    throw th;
                }
                f6 = f4 - fM56699x1;
                f5 = f;
                f8 = f14;
                c11913yjMo67596kk = c4369ck.mo17582wl().mo67596kk();
                c4369ck.mo17582wl().mo67595k4(abstractC12024x1);
                c4369ck.mo17582wl().mo67593k4(c4369ck.m17472bv());
                if (!C14064he.m66703du(f8)) {
                    z = false;
                }
                if (z) {
                    f9 = 0.0f;
                    interfaceC1565x1Mo67586h4 = null;
                    interfaceC1565x1 = interfaceC1565x1Mo67586h4;
                    C12013m9 c12013m9M17684k42 = C4378x1.m17684k4(c4369ck, c12013m9);
                    if (c12013m9M17684k4 == null) {
                    }
                    f10 = f6;
                    f11 = f7;
                    c10130to = new C10130to(c4369ck, str, c12013m9M17684k42, c12013m9M17684k4, c4369ck.mo17582wl().mo67601x1(), c12019um, f8, f10);
                    mo17582wl().mo67604x1(c10130to.m49772yj());
                    while (true) {
                        interfaceC10128k4M49754dy = c10130to.m49754dy();
                        if (interfaceC10128k4M49754dy != null) {
                        }
                        mo17582wl().mo67593k4(c11913yjMo67596kk);
                    }
                    if (!z) {
                        mo17582wl().mo67593k4(m17472bv());
                        mo17582wl().mo67590k4(interfaceC1565x1);
                    }
                    mo17582wl().mo67593k4(c11913yjMo67596kk);
                    return;
                }
                mo17582wl().mo67593k4(r12);
                throw th;
            }
            float f15 = (c12019um.m56818ks() && c12019um.m56825x1() == 2) ? f : f + fM56699x1;
            if (C14064he.m66703du(f14)) {
                f5 = f15;
            } else {
                f5 = f15;
                f8 = f14 - fM56699x1;
                f7 = f2;
                f6 = f4;
                c11913yjMo67596kk = c4369ck.mo17582wl().mo67596kk();
                c4369ck.mo17582wl().mo67595k4(abstractC12024x1);
                c4369ck.mo17582wl().mo67593k4(c4369ck.m17472bv());
                if (!C14064he.m66703du(f8) && (c12019um == null || !c12019um.m56828yj())) {
                    z = false;
                }
                if (!z || f8 == 0.0f || f6 == 0.0f) {
                    f9 = 0.0f;
                    interfaceC1565x1Mo67586h4 = null;
                } else {
                    interfaceC1565x1Mo67586h4 = c4369ck.mo17582wl().mo67586h4();
                    InterfaceC14122k4 interfaceC14122k4Mo17582wl = c4369ck.mo17582wl();
                    f9 = 0.0f;
                    AbstractC4415wy.x1 x1Var = new AbstractC4415wy.x1(f, f2, f14, f4);
                    interfaceC14122k4Mo17582wl.mo67590k4(x1Var);
                    r12 = x1Var;
                }
                interfaceC1565x1 = interfaceC1565x1Mo67586h4;
                try {
                    try {
                        C12013m9 c12013m9M17684k422 = C4378x1.m17684k4(c4369ck, c12013m9);
                        if (c12013m9M17684k4 == null) {
                            c12013m9M17684k4 = C4378x1.m17684k4(c4369ck, c12013m9M17684k4);
                        }
                        f10 = f6;
                        f11 = f7;
                    } catch (Throwable th) {
                        th = th;
                        f10 = f6;
                    }
                    try {
                        c10130to = new C10130to(c4369ck, str, c12013m9M17684k422, c12013m9M17684k4, c4369ck.mo17582wl().mo67601x1(), c12019um, f8, f10);
                        mo17582wl().mo67604x1(c10130to.m49772yj());
                        while (true) {
                            interfaceC10128k4M49754dy = c10130to.m49754dy();
                            if (interfaceC10128k4M49754dy != null) {
                                break;
                            }
                            C11913yj c11913yjMo67596kk2 = mo17582wl().mo67596kk();
                            new C11913yj().m55787x1(c11913yjMo67596kk2);
                            interfaceC10128k4M49754dy.mo46214k4(abstractC12024x1 instanceof C12012lr ? mo17582wl() : mo17582wl(), f5 + f9, f11);
                            mo17582wl().mo67593k4(c11913yjMo67596kk2);
                        }
                        if (!z && f8 != f9 && f10 != f9) {
                            mo17582wl().mo67593k4(m17472bv());
                            mo17582wl().mo67590k4(interfaceC1565x1);
                        }
                        mo17582wl().mo67593k4(c11913yjMo67596kk);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (!z && f8 != f9 && f10 != f9) {
                            mo17582wl().mo67593k4(m17472bv());
                            mo17582wl().mo67590k4(interfaceC1565x1);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        f7 = f2;
        f6 = f4;
        f8 = f14;
        c11913yjMo67596kk = c4369ck.mo17582wl().mo67596kk();
        c4369ck.mo17582wl().mo67595k4(abstractC12024x1);
        c4369ck.mo17582wl().mo67593k4(c4369ck.m17472bv());
        if (!C14064he.m66703du(f8)) {
        }
        if (z) {
        }
        mo17582wl().mo67593k4(r12);
        throw th;
    }

    /* JADX INFO: renamed from: k4 */
    private void m17458k4(String str, C12013m9 c12013m9, AbstractC12024x1 abstractC12024x1, float f, float f2, float f3, float f4, C12019um c12019um) throws Throwable {
        String strM17453k4;
        C12013m9 c12013m92;
        C12019um c12019um2 = c12019um;
        if (abstractC12024x1 == null) {
            throw new ArgumentNullException("brush");
        }
        if (c12013m9 == null) {
            throw new ArgumentNullException("font");
        }
        if (c12019um2 != null) {
            C7015du<C12013m9> c7015du = new C7015du<>(c12013m9);
            strM17453k4 = m17453k4(str, c12019um2, c7015du);
            c12013m92 = c7015du.f19072k4;
        } else {
            strM17453k4 = str;
            c12013m92 = c12013m9;
        }
        String strM27497k4 = C7035kk.m27497k4(c12013m92, strM17453k4);
        C12013m9 c12013m9M27503x1 = C7035kk.m27503x1(c12013m92, strM27497k4);
        String strM56648m9 = c12013m9M27503x1.m56648m9();
        C12013m9 c12013m9M17450k4 = m17450k4(c12013m9M27503x1);
        if (!strM56648m9.equalsIgnoreCase(c12013m9M17450k4.m56648m9())) {
            c12013m9M17450k4 = C7035kk.m27496k4(c12013m9M17450k4, strM27497k4, 1);
        }
        String strM27498k4 = C7035kk.m27498k4(c12013m9M17450k4.m56648m9(), m17468x1(m17452k4(strM27497k4)));
        C12013m9 c12013m9M17685k4 = C4378x1.m17685k4(c12013m9M17450k4, c12019um2, mo17482ix());
        boolean zM17459k4 = m17459k4(c12013m9M17685k4, c12019um2, mo17482ix());
        if (strM27498k4.contains("\t") && c12019um2 == null) {
            c12019um2 = (C12019um) C12019um.m56800dy().deepClone();
            c12019um2.m56811k4(0.0f, C4378x1.m17688x1(this, c12013m9M17685k4));
        }
        m17457k4(strM27498k4, c12013m9M17685k4, c12013m9, abstractC12024x1, f, f2, f3, f4, c12019um2);
        if (zM17459k4) {
            mo17478dy(mo17482ix());
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17554k4(String str, C12013m9 c12013m9, AbstractC12024x1 abstractC12024x1, float f, float f2, C12019um c12019um) throws Throwable {
        m17458k4(str, c12013m9, abstractC12024x1, f, f2, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, c12019um);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17555k4(String str, C12013m9 c12013m9, AbstractC12024x1 abstractC12024x1, C12007ix c12007ix) throws Throwable {
        m17458k4(str, c12013m9, abstractC12024x1, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1(), (C12019um) null);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17556k4(String str, C12013m9 c12013m9, AbstractC12024x1 abstractC12024x1, C12007ix c12007ix, C12019um c12019um) throws Throwable {
        m17458k4(str, c12013m9, abstractC12024x1, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1(), c12019um);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public void mo17557k4(String str, C12013m9 c12013m9, AbstractC12024x1 abstractC12024x1, C12025x6 c12025x6, C12019um c12019um) throws Throwable {
        m17458k4(str, c12013m9, abstractC12024x1, c12025x6.m56897x1(), c12025x6.m56895kk(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, c12019um);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m17459k4(C12013m9 c12013m9, C12019um c12019um, int i) {
        return false;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12008jd
    /* JADX INFO: renamed from: k4 */
    public C12018u4[] mo17558k4(String str, C12013m9 c12013m9, C12007ix c12007ix, C12019um c12019um) {
        int i;
        C12017to[] c12017toArr;
        float fMo46209k4;
        float fMo46204h4;
        if (str == null || str.length() == 0) {
            return new C12018u4[0];
        }
        if (c12013m9 == null) {
            throw new ArgumentNullException("Value of 'font' cannot be null");
        }
        if (c12019um == null) {
            throw new ArgumentException("Value of 'stringFormat' is invalid");
        }
        C12018u4 c12018u4 = new C12018u4();
        if (c12007ix.m56550c5() <= 0.0d) {
            if (c12007ix.m56575x1() < 0.0d) {
                C12018u4[] c12018u4Arr = new C12018u4[c12019um.m56827x6().length];
                for (int i2 = 0; i2 < c12019um.m56827x6().length; i2++) {
                    c12018u4Arr[i2] = c12018u4;
                }
                return c12018u4Arr;
            }
            c12007ix.m56576x1(c12018u4.m56763m9().m56663c5());
        }
        if (c12007ix.m56575x1() <= 0.0d) {
            c12007ix.m56560k4(c12018u4.m56763m9().m56683x1());
        }
        C12017to[] c12017toArrM56827x6 = c12019um.m56827x6();
        if (c12017toArrM56827x6 == null || c12017toArrM56827x6.length == 0) {
            return new C12018u4[0];
        }
        for (C12017to c12017to : c12019um.m56827x6()) {
            if (c12017to.m56720x1() + c12017to.m56717k4() > str.length() || c12017to.m56717k4() < 0) {
                throw new ArgumentException("Value of 'stringFormat' is invalid");
            }
        }
        int length = c12017toArrM56827x6.length;
        C11896dy[] c11896dyArr = new C11896dy[length];
        for (int i3 = 0; i3 < length; i3++) {
            c11896dyArr[i3] = new C11896dy();
        }
        String strM27497k4 = C7035kk.m27497k4(c12013m9, C7035kk.m27498k4(c12013m9.m56648m9(), str));
        C12013m9 c12013m9M27503x1 = C7035kk.m27503x1(c12013m9, strM27497k4);
        String strM56648m9 = c12013m9M27503x1.m56648m9();
        C12013m9 c12013m9M17450k4 = m17450k4(c12013m9M27503x1);
        if (!strM56648m9.equalsIgnoreCase(c12013m9M17450k4.m56648m9())) {
            c12013m9M17450k4 = C7035kk.m27496k4(c12013m9M17450k4, strM27497k4, 1);
        }
        String strM17468x1 = m17468x1(m17452k4(strM27497k4));
        C10130to c10130to = new C10130to(this, strM17468x1, C4378x1.m17685k4(C4378x1.m17684k4(this, c12013m9M17450k4), c12019um, mo17482ix()), C4378x1.m17684k4(this, c12013m9), mo17582wl().mo67601x1(), c12019um, c12007ix.m56550c5(), c12007ix.m56575x1());
        while (true) {
            InterfaceC10128k4 interfaceC10128k4M49754dy = c10130to.m49754dy();
            if (interfaceC10128k4M49754dy == null) {
                break;
            }
            int i4 = 0;
            while (i4 < c12017toArrM56827x6.length) {
                int iM56717k4 = c12017toArrM56827x6[i4].m56717k4();
                int iM56720x1 = c12017toArrM56827x6[i4].m56720x1();
                if (strM17468x1.substring(iM56717k4, iM56717k4 + iM56720x1).contains("&") && c12019um.m56822to() != 0) {
                    iM56720x1--;
                }
                int i5 = iM56720x1 + iM56717k4;
                int iMo46210k4 = interfaceC10128k4M49754dy.mo46210k4();
                if (iM56717k4 >= interfaceC10128k4M49754dy.mo46218x1() || i5 <= iMo46210k4) {
                    i = i4;
                    c12017toArr = c12017toArrM56827x6;
                } else {
                    if (iM56717k4 > iMo46210k4) {
                        fMo46209k4 = interfaceC10128k4M49754dy.mo46209k4(iMo46210k4, iM56717k4);
                    } else {
                        iM56717k4 = iMo46210k4;
                        fMo46209k4 = 0.0f;
                    }
                    float fMo46209k42 = i5 < interfaceC10128k4M49754dy.mo46218x1() ? interfaceC10128k4M49754dy.mo46209k4(iM56717k4, i5) : interfaceC10128k4M49754dy.mo46215kk() - fMo46209k4;
                    float fMo46204h42 = interfaceC10128k4M49754dy.mo46204h4() + interfaceC10128k4M49754dy.mo46202du();
                    float fMo46216m9 = interfaceC10128k4M49754dy.mo46216m9();
                    float fMo46208dy = interfaceC10128k4M49754dy.mo46208dy();
                    if (c12019um.m56803ck()) {
                        fMo46208dy += fMo46209k4;
                        fMo46204h4 = fMo46216m9 - interfaceC10128k4M49754dy.mo46204h4();
                    } else {
                        fMo46204h4 = fMo46216m9 + fMo46209k4;
                        if (c12019um.m56825x1() == 0) {
                            fMo46208dy -= interfaceC10128k4M49754dy.mo46202du();
                        }
                    }
                    if (interfaceC10128k4M49754dy.mo46217to() + fMo46204h42 > c10130to.m49769up()) {
                        float fM49769up = c10130to.m49769up() - interfaceC10128k4M49754dy.mo46217to();
                        if (c12019um.m56803ck() && c12019um.m56818ks()) {
                            fMo46204h4 += fM49769up;
                            fMo46204h42 -= fM49769up;
                        } else {
                            fMo46204h42 = fM49769up;
                        }
                    }
                    if (c12019um.m56803ck()) {
                        i = i4;
                        c11896dyArr[i4].m55562kk((int) (c12007ix.m56557jd() + fMo46204h4), (int) (c12007ix.m56551ck() + fMo46208dy), (float) Math.ceil(fMo46204h42), (float) Math.ceil(fMo46209k42));
                        c12017toArr = c12017toArrM56827x6;
                    } else {
                        i = i4;
                        C11896dy c11896dy = c11896dyArr[i];
                        float fM56557jd = (int) (c12007ix.m56557jd() + fMo46204h4);
                        float fM56551ck = (int) (c12007ix.m56551ck() + fMo46208dy);
                        c12017toArr = c12017toArrM56827x6;
                        c11896dy.m55562kk(fM56557jd, fM56551ck, (float) Math.ceil(fMo46209k42), (float) Math.ceil(fMo46204h42));
                    }
                }
                i4 = i + 1;
                c12017toArrM56827x6 = c12017toArr;
            }
        }
        C12017to[] c12017toArr2 = c12017toArrM56827x6;
        C11913yj c11913yjM49765ks = c10130to.m49765ks();
        if (c11913yjM49765ks != null) {
            for (int i6 = 0; i6 < length; i6++) {
                c11896dyArr[i6].m55529ix().mo59965k4(c11913yjM49765ks);
            }
        }
        int length2 = c12017toArr2.length;
        C12018u4[] c12018u4Arr2 = new C12018u4[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            if (c12007ix.m56550c5() < 0.0f || c12007ix.m56575x1() < 0.0f) {
                c12018u4Arr2[i7] = mo17480h4();
            } else {
                c12018u4Arr2[i7] = new C12018u4(c11896dyArr[i7]);
            }
        }
        return c12018u4Arr2;
    }
}

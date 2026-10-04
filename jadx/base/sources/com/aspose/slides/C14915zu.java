package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p021af.C1369x1;
import com.aspose.slides.internal.p021af.InterfaceC1368kk;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p182ii.C4948yd;
import com.aspose.slides.internal.p213jw.C5561x1;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.zu */
/* JADX INFO: loaded from: classes3.dex */
class C14915zu extends AbstractC10972up {

    /* JADX INFO: renamed from: c5 */
    private final InterfaceC1368kk f50734c5;

    /* JADX INFO: renamed from: dy */
    private final String f50737dy;

    /* JADX INFO: renamed from: fa */
    private LayoutSlide f50738fa;

    /* JADX INFO: renamed from: jd */
    private final Presentation f50740jd;

    /* JADX INFO: renamed from: ks */
    private int f50743ks;

    /* JADX INFO: renamed from: m9 */
    private final C13845mp f50744m9;

    /* JADX INFO: renamed from: rv */
    private C10948ar f50745rv;

    /* JADX INFO: renamed from: to */
    private C12804k4 f50746to;

    /* JADX INFO: renamed from: up */
    private C14247oq f50747up;

    /* JADX INFO: renamed from: yj */
    private Slide f50749yj;

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<C12804k4, bnx> f50741k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<C12804k4, b4a> f50748x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<C12804k4, Integer> f50742kk = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private final List<C10963ks> f50736du = new List<>();

    /* JADX INFO: renamed from: h4 */
    private final List<AbstractC14184nj> f50739h4 = new List<>();

    /* JADX INFO: renamed from: ck */
    private final List<Slide> f50735ck = new List<>();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        r2.f50738fa = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C14915zu(Presentation presentation, C13845mp c13845mp, String str, InterfaceC1368kk interfaceC1368kk) {
        this.f50740jd = presentation;
        this.f50744m9 = c13845mp;
        this.f50737dy = str;
        this.f50734c5 = interfaceC1368kk;
        IGenericEnumerator<ILayoutSlide> it = presentation.getMasters().get_Item(0).getLayoutSlides().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                LayoutSlide layoutSlide = (LayoutSlide) it.next();
                if (layoutSlide.getLayoutType() == 11) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f50738fa == null) {
            this.f50738fa = (LayoutSlide) this.f50740jd.getMasters().get_Item(0).getLayoutSlides().get_Item(0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static float m74815k4(int i, float f, float f2, float f3, float f4) {
        switch (i) {
            case 0:
            case 4:
            case 8:
                return f * 0.75f;
            case 1:
                return (f * f2) / 100.0f;
            case 2:
                return f * f3;
            case 3:
                return f * f3;
            case 5:
                return ((f * 0.75f) / 2.54f) * 72.0f;
            case 6:
                return ((f * 0.75f) / 25.4f) * 72.0f;
            case 7:
                return f * 0.75f * 72.0f;
            case 9:
                return f * 0.75f * 12.0f;
            default:
                return 0.0f;
        }
    }

    /* JADX INFO: renamed from: kk */
    private C1369x1 m74823kk(C1369x1 c1369x1) {
        while (!C14722w3.m72633x1((C12804k4) c1369x1.m8125x1())) {
            c1369x1 = c1369x1.m8123k4();
            if (c1369x1 == null) {
                return null;
            }
        }
        return c1369x1;
    }

    /* JADX INFO: renamed from: to */
    private C12804k4 m74824to(C1369x1 c1369x1) {
        C12804k4 c12804k4;
        do {
            c12804k4 = (C12804k4) c1369x1.m8125x1();
            c1369x1 = c1369x1.m8123k4();
            if (C14722w3.m72626du(c12804k4) && !C14722w3.m72628h4(c12804k4) && ((!C14722w3.m72627dy(c12804k4) || !C14722w3.m72631m9((C12804k4) c1369x1.m8125x1())) && !C7019kk.m27469x1(c12804k4, C4948yd.class))) {
                return c12804k4;
            }
            if (c1369x1 == null || C14722w3.m72630kk(c12804k4)) {
                return null;
            }
        } while (!C14722w3.m72633x1(c12804k4));
        return null;
    }

    /* JADX INFO: renamed from: c5 */
    public final C10948ar m74826c5() {
        return this.f50745rv;
    }

    /* JADX INFO: renamed from: ck */
    public final Dictionary<C12804k4, b4a> m74827ck() {
        return this.f50748x1;
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC1368kk m74828du() {
        return this.f50734c5;
    }

    /* JADX INFO: renamed from: dy */
    public final int m74829dy() {
        return this.f50743ks;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m74830fa() {
        return this.f50736du.size() > 0;
    }

    /* JADX INFO: renamed from: h4 */
    public final Presentation m74831h4() {
        return this.f50740jd;
    }

    /* JADX INFO: renamed from: jd */
    public final Dictionary<C12804k4, bnx> m74832jd() {
        return this.f50741k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final Slide m74838m9() {
        return this.f50749yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<C12804k4, Integer> m74840x1() {
        return this.f50742kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m74816k4(C6884yj c6884yj, float f, float f2, float f3) {
        return m74815k4(c6884yj.m26946k4(), c6884yj.m26948x1(), f, f2, f3);
    }

    /* JADX INFO: renamed from: x1 */
    private C1369x1 m74825x1(C1369x1 c1369x1) {
        while (!C14722w3.m72630kk((C12804k4) c1369x1.m8125x1())) {
            c1369x1 = c1369x1.m8123k4();
            if (c1369x1 == null) {
                return null;
            }
        }
        return c1369x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C13845mp m74837kk() {
        return this.f50744m9;
    }

    /* JADX INFO: renamed from: to */
    public final String m74839to() {
        return this.f50737dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<AbstractC14184nj> m74833k4() {
        return this.f50739h4;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        m74819k4((AbstractC10973uz) c10971um);
        super.mo13516x1(c10971um);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m74817k4(C1369x1 c1369x1) {
        C12007ix c12007ixClone = c1369x1.m8124kk().Clone();
        return new C12007ix(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74834k4(int i) {
        this.f50743ks = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74835k4(Slide slide) {
        this.f50749yj = slide;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r4
      0x003e: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v2 java.lang.String) binds: [B:6:0x0019, B:8:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m74818k4(C5561x1 c5561x1) {
        String strMo22741kk;
        if (c5561x1.mo22857k4("background")) {
            strMo22741kk = c5561x1.mo22861x1("background").mo22741kk();
        } else {
            String str = null;
            if (c5561x1.mo22857k4("style")) {
                Dictionary<String, String> dictionaryM70772k4 = C14470su.m70772k4(c5561x1.mo22861x1("style").mo22741kk());
                String[] strArr = {null};
                boolean zTryGetValue = dictionaryM70772k4.tryGetValue("background", strArr);
                str = strArr[0];
                if (zTryGetValue) {
                    strMo22741kk = str;
                } else {
                    strArr[0] = str;
                    dictionaryM70772k4.tryGetValue("background-color", strArr);
                    strMo22741kk = strArr[0];
                }
            }
        }
        if (strMo22741kk != null) {
            IBackground background = m74838m9().getBackground();
            C14782xd.m73316k4(strMo22741kk, background.getFillFormat().getSolidFillColor());
            if (background.getFillFormat().getSolidFillColor().getColorType() != -1) {
                background.getFillFormat().setFillType((byte) 1);
                background.setType((byte) 1);
            }
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16972k4(C10948ar c10948ar) {
        this.f50747up = C14247oq.m68746k4(this);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13524k4(C10963ks c10963ks) {
        super.mo13524k4(c10963ks);
        if (m74822k4(c10963ks, this)) {
            return;
        }
        m74819k4((AbstractC10973uz) c10963ks);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13525k4(C10970u4 c10970u4) {
        C1369x1 c1369x1Mo8117x1 = this.f50734c5.mo8117x1(c10970u4);
        if (OooOo00.OooO0O0((C1569kk) c1369x1Mo8117x1.m8125x1()) != 2) {
            m74833k4().addItem(new bsv(c10970u4, this.f50747up, (C12804k4) c1369x1Mo8117x1.m8125x1()));
        }
        super.mo13525k4(c10970u4);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13515k4(C10971um c10971um) {
        super.mo13515k4(c10971um);
    }

    /* JADX INFO: renamed from: k4 */
    private void m74819k4(AbstractC10973uz abstractC10973uz) {
        C12804k4 c12804k4M74824to;
        C1369x1 c1369x1Mo8117x1 = this.f50734c5.mo8117x1(abstractC10973uz);
        if (c1369x1Mo8117x1 == null) {
            return;
        }
        C12804k4 c12804k4 = (C12804k4) c1369x1Mo8117x1.m8125x1();
        m74820k4(c12804k4);
        C10963ks c10963ks = (C10963ks) C7019kk.m27452k4((Object) abstractC10973uz, C10963ks.class);
        if (C14722w3.m72628h4(c12804k4)) {
            if (this.f50746to == null) {
                this.f50746to = c12804k4;
            }
            if (c10963ks == null) {
                m74818k4(c12804k4.m22704h4());
                return;
            } else {
                this.f50736du.addItem(c10963ks);
                return;
            }
        }
        if (m74830fa()) {
            m74836k4(this.f50747up);
        }
        if (c10963ks == null || m74825x1(c1369x1Mo8117x1) != null || (c12804k4M74824to = m74824to(c1369x1Mo8117x1)) == null) {
            return;
        }
        b4a[] b4aVarArr = {null};
        boolean zTryGetValue = this.f50748x1.tryGetValue(c12804k4M74824to, b4aVarArr);
        b4a b4aVar = b4aVarArr[0];
        if (!zTryGetValue) {
            b4aVar = new b4a(this.f50747up, c12804k4M74824to);
            m74833k4().addItem(b4aVar);
            this.f50748x1.set_Item(c12804k4M74824to, b4aVar);
        }
        b4aVar.m4003x1(abstractC10973uz);
    }

    /* JADX INFO: renamed from: k4 */
    private void m74820k4(C12804k4 c12804k4) {
        m74821k4(c12804k4, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m74821k4(C12804k4 c12804k4, int i) {
        while (c12804k4 != null) {
            if (C14722w3.m72633x1(c12804k4)) {
                i |= 4;
            } else if (C14722w3.m72632to(c12804k4)) {
                i |= 1;
            } else if (C14722w3.m72626du(c12804k4)) {
                i |= 2;
            }
            Integer[] numArr = {0};
            boolean zTryGetValue = this.f50742kk.tryGetValue(c12804k4, numArr);
            int iIntValue = numArr[0].intValue();
            if (zTryGetValue) {
                this.f50742kk.set_Item(c12804k4, Integer.valueOf(iIntValue | i));
            } else {
                this.f50742kk.set_Item(c12804k4, Integer.valueOf(i));
            }
            c12804k4 = (C12804k4) C7019kk.m27452k4((Object) c12804k4.mo22646kp(), C12804k4.class);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74836k4(C14247oq c14247oq) {
        m74833k4().addItem(new C14364qx(this.f50736du.toArray(new C10963ks[0]), c14247oq, this.f50746to));
        this.f50736du.clear();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74822k4(AbstractC10973uz abstractC10973uz, C14915zu c14915zu) {
        C1369x1 c1369x1M74825x1;
        C1369x1 c1369x1Mo8117x1 = this.f50734c5.mo8117x1(abstractC10973uz);
        if (c1369x1Mo8117x1 == null || (c1369x1M74825x1 = m74825x1(c1369x1Mo8117x1)) == null) {
            return false;
        }
        m74820k4((C12804k4) c1369x1Mo8117x1.m8125x1());
        C1369x1 c1369x1M74823kk = m74823kk(c1369x1M74825x1);
        if (c1369x1M74823kk == null) {
            return false;
        }
        C12804k4 c12804k4 = (C12804k4) c1369x1M74823kk.m8125x1();
        if (!this.f50741k4.containsKey(c12804k4)) {
            bnx bnxVar = new bnx(this.f50747up, c12804k4);
            m74833k4().addItem(bnxVar);
            this.f50741k4.set_Item((C12804k4) c1369x1M74823kk.m8125x1(), bnxVar);
        }
        this.f50741k4.get_Item((C12804k4) c1369x1M74823kk.m8125x1()).m4280k4(c1369x1M74825x1, abstractC10973uz, c14915zu);
        return true;
    }
}

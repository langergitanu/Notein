package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p151gj.AbstractC4326to;
import com.aspose.slides.internal.p151gj.C4314c5;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p306ny.C6963x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10959ix;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10966ne;
import com.aspose.slides.internal.p420th.C10968rv;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.os */
/* JADX INFO: loaded from: classes3.dex */
final class C14250os extends AbstractC14897zn {

    /* JADX INFO: renamed from: c5 */
    private final float f47896c5;

    /* JADX INFO: renamed from: ck */
    private C4328x1 f47897ck;

    /* JADX INFO: renamed from: dy */
    private final float f47898dy;

    /* JADX INFO: renamed from: fa */
    private C4320jd f47899fa;

    /* JADX INFO: renamed from: ix */
    private final boolean f47900ix;

    /* JADX INFO: renamed from: jd */
    private C12015qq f47901jd;

    /* JADX INFO: renamed from: ks */
    private C10966ne f47902ks;

    /* JADX INFO: renamed from: ne */
    private boolean f47903ne;

    /* JADX INFO: renamed from: qq */
    private C13700js f47904qq;

    /* JADX INFO: renamed from: rv */
    private IHyperlink f47905rv;

    /* JADX INFO: renamed from: u4 */
    private C12007ix f47906u4;

    /* JADX INFO: renamed from: up */
    private C4317dy f47907up;

    /* JADX INFO: renamed from: uz */
    private final C1197hf f47908uz;

    /* JADX INFO: renamed from: wl */
    private List<Integer> f47909wl;

    /* JADX INFO: renamed from: x6 */
    private IHyperlink f47910x6;

    /* JADX INFO: renamed from: yj */
    private C10951c5 f47911yj;

    public C14250os(int i, int i2, float f, float f2, boolean z, C13700js c13700js, C1197hf c1197hf, List<Integer> list) {
        super((C12009k4) null);
        this.f47901jd = new C12015qq();
        this.f47911yj = new C10951c5();
        this.f47906u4 = new C12007ix();
        if (c1197hf == null) {
            throw new ArgumentNullException("fontsManager");
        }
        this.f47904qq = c13700js;
        this.f47908uz = c1197hf;
        this.f47898dy = f;
        this.f47896c5 = f2;
        this.f47900ix = z;
        this.f47909wl = list;
        C12015qq c12015qq = new C12015qq((float) C12566m9.m58654x1(i, 72.0d), (float) C12566m9.m58654x1(i2, 72.0d));
        this.f47901jd = new C12015qq(i, i2);
        this.f47907up = new C4317dy();
        this.f47906u4 = new C12007ix(0.0f, 0.0f, 0.0f, 0.0f);
        m68775k4(c12015qq.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private static int m68760k4(byte b) {
        if (b != 0) {
            if (b == 1) {
                return 3;
            }
            if (b != 2) {
                return b != 3 ? 0 : 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: kk */
    private C10959ix m68784kk(IHyperlink iHyperlink) {
        Hyperlink hyperlink = (Hyperlink) iHyperlink;
        switch (hyperlink.getActionType()) {
            case 1:
            case 10:
            case 11:
                C12007ix c12007ixClone = this.f47906u4.Clone();
                boolean zM63540k4 = this.f47904qq.m63540k4();
                String externalUrl = hyperlink.getExternalUrl();
                if (zM63540k4) {
                    externalUrl = m68786x1(externalUrl);
                }
                return new C10959ix(c12007ixClone, externalUrl, iHyperlink.getTooltip());
            case 2:
                return new C10959ix(3, this.f47906u4.Clone(), iHyperlink.getTooltip());
            case 3:
                return new C10959ix(2, this.f47906u4.Clone(), iHyperlink.getTooltip());
            case 4:
                return new C10959ix(1, this.f47906u4.Clone(), iHyperlink.getTooltip());
            case 5:
                return new C10959ix(4, this.f47906u4.Clone(), iHyperlink.getTooltip());
            case 6:
            case 9:
            default:
                return null;
            case 7:
                return new C10959ix(5, this.f47906u4.Clone(), iHyperlink.getTooltip());
            case 8:
                ISlide targetSlide = hyperlink.getTargetSlide();
                if (targetSlide == null) {
                    return null;
                }
                int iM2709qq = ((Slide) targetSlide).m2709qq();
                List<Integer> list = this.f47909wl;
                if (list != null && iM2709qq < list.size()) {
                    iM2709qq = this.f47909wl.get_Item(iM2709qq).intValue();
                }
                if (iM2709qq > -1) {
                    return new C10959ix(this.f47906u4.Clone(), iM2709qq, hyperlink.getTooltip());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static String m68786x1(String str) {
        String strM66686k4;
        if (str == null) {
            str = "";
        }
        try {
            C14062gk c14062gk = new C14062gk(str);
            if (!C14113y2.m67411k4(c14062gk.m66689ks()) && !C14113y2.m67363du(c14062gk.m66689ks(), C14062gk.f47220x1)) {
                return (m68785kk(str) && c14062gk.m66683ix()) ? c14062gk.m66697x1() : str;
            }
            if (c14062gk.m66684jd()) {
                if (!c14062gk.m66679dy() || !C14113y2.m67411k4(C3141rv.m13397du(c14062gk.m66686k4()))) {
                    return C14113y2.m67408k4("//", c14062gk.m66678du(), C14062gk.m66625ck(c14062gk.m66686k4()));
                }
                strM66686k4 = c14062gk.m66697x1();
            } else {
                if (!c14062gk.m66683ix()) {
                    return C14062gk.m66625ck(str);
                }
                strM66686k4 = c14062gk.m66686k4();
            }
            return C14062gk.m66625ck(strM66686k4);
        } catch (UriFormatException unused) {
            return m68785kk(str) ? C14062gk.m66632jd(str) : C14062gk.m66625ck(str);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return str;
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: c5 */
    public C4317dy mo67706c5() {
        return this.f47907up;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m68789ck() {
        return this.f47900ix;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: du */
    public float mo67707du() {
        return this.f47898dy;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: dy */
    public int mo67708dy() {
        return C7019kk.m27462to(Float.valueOf(this.f47901jd.m56697kk()), 13);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: fa */
    public C12007ix mo64335fa() {
        return new C12007ix();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: h4 */
    public float mo67709h4() {
        return this.f47896c5;
    }

    /* JADX INFO: renamed from: jd */
    public final C10951c5 m68790jd() {
        return this.f47911yj;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: m9 */
    public int mo67711m9() {
        return C7019kk.m27462to(Float.valueOf(this.f47901jd.m56699x1()), 13);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: to */
    public void mo68798to() {
    }

    /* JADX INFO: renamed from: up */
    public final C14250os m68799up() {
        C14250os c14250os = new C14250os(mo67711m9(), mo67708dy(), this.f47898dy, this.f47896c5, this.f47900ix, this.f47904qq, this.f47908uz, this.f47909wl);
        c14250os.m74632x1(m74623ks());
        this.f47906u4.CloneTo(c14250os.f47906u4);
        c14250os.m74616k4(m74636yj());
        return c14250os;
    }

    /* JADX INFO: renamed from: k4 */
    private AutoShape m68761k4(IPortion iPortion) {
        if (iPortion == null) {
            return null;
        }
        IGenericEnumerator<IParagraph> it = iPortion.getSlide().getShapes().iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) it.next(), AutoShape.class);
                if (autoShape != null && autoShape.getTextFrame() != null && autoShape.getTextFrame().getParagraphs() != null) {
                    it = autoShape.getTextFrame().getParagraphs().iterator();
                    while (it.hasNext()) {
                        try {
                            if (it.next().getPortions().contains(iPortion)) {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                return autoShape;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
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
        return null;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: kk */
    public void mo68797kk() {
        this.f47902ks = (C10966ne) C7019kk.m27452k4((Object) this.f47902ks.m53116um(), C10966ne.class);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: x1 */
    public void mo68800x1() {
        this.f47910x6 = null;
        this.f47903ne = false;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4328x1 m68762k4(C14478sy c14478sy) {
        return m68763k4(c14478sy, 96.0f);
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m68785kk(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 255) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: x1 */
    public void mo68801x1(IHyperlink iHyperlink) {
        this.f47910x6 = iHyperlink;
        this.f47903ne = false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r2v2, types: [double, int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r5v0, types: [double, int] */
    /* JADX INFO: renamed from: k4 */
    private static C4328x1 m68763k4(C14478sy c14478sy, float f) {
        AbstractC4326to abstractC4326toM73536k4 = C14814xq.m73536k4(c14478sy, f);
        if (!C7019kk.m27469x1(abstractC4326toM73536k4, C4314c5.class)) {
            return abstractC4326toM73536k4;
        }
        C12007ix c12007ixClone = ((C4314c5) abstractC4326toM73536k4).m17299du().Clone();
        if (c12007ixClone.m56568kk()) {
            c14478sy.m71131xk().CloneTo(c12007ixClone);
        }
        C12015qq c12015qq = new C12015qq(c12007ixClone.m56550c5(), c12007ixClone.m56575x1());
        C12009k4 c12009k4 = new C12009k4((int) StringBuffer.append((int) c12015qq.m56699x1()), (int) StringBuffer.append((int) c12015qq.m56697kk()));
        try {
            c12009k4.m56332k4(96.0f, 96.0f);
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                C11913yj c11913yjMo17577u4 = abstractC12008jdM56582k4.mo17577u4();
                c11913yjMo17577u4.m55777kk(-c12007ixClone.m56571to(), -c12007ixClone.m56554dy());
                abstractC12008jdM56582k4.mo17588x1(c11913yjMo17577u4);
                abstractC12008jdM56582k4.mo17593x1(C14814xq.m73547k4(c14478sy), c12007ixClone.Clone());
                C3152yj c3152yj = new C3152yj();
                try {
                    c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                    C4327up c4327up = new C4327up(c3152yj.toArray());
                    c3152yj.dispose();
                    C4317dy c4317dy = new C4317dy();
                    c4317dy.m17348x1(c12007ixClone.m56571to(), c12007ixClone.m56554dy());
                    c4327up.m17387k4(c4317dy);
                    abstractC12008jdM56582k4.dispose();
                    return c4327up;
                } catch (Throwable th) {
                    c3152yj.dispose();
                    throw th;
                }
            } catch (Throwable th2) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th2;
            }
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m68787x1(cxj cxjVar) {
        C12007ix c12007ixClone = cxjVar.m71131xk().Clone();
        boolean z = true;
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67479k4(c12007ixClone.m56557jd(), (short) 1)), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(C14116yg.m67479k4(c12007ixClone.m56551ck(), (short) 1)), 14);
        C12015qq c12015qq = new C12015qq(c12007ixClone.m56550c5(), c12007ixClone.m56575x1());
        C10951c5 c10951c5 = new C10951c5();
        C7131h4 c7131h4M4845ar = cxjVar.m4845ar();
        byte[] bArrM2134m9 = (c7131h4M4845ar == null || !c7131h4M4845ar.m27679to()) ? ((PPImage) cxjVar.m4861wl().getImage()).m2134m9() : c7131h4M4845ar.m27674du();
        if (C3099wl.m13194kk(bArrM2134m9) || C3099wl.m13199x1(bArrM2134m9)) {
            if (this.f47900ix) {
                float fM63832ck = (m74636yj().m63832ck() / 96.0f) * m74636yj().m63848ne();
                bArrM2134m9 = m68783k4(bArrM2134m9, new C12015qq(c12015qq.m56699x1() * fM63832ck, c12015qq.m56697kk() * fM63832ck).Clone(), m74636yj().m63848ne());
            }
        } else if (c7131h4M4845ar == null || C3099wl.m13170du(bArrM2134m9)) {
            C12009k4 c12009k4 = new C12009k4(new C3152yj(bArrM2134m9));
            try {
                ColorChange[] colorChangeArr = {null};
                if (!m68778k4(cxjVar.m4861wl().getImageTransform(), colorChangeArr) || !colorChangeArr[0].m1059to()) {
                    z = false;
                }
                ColorChange colorChange = colorChangeArr[0];
                if (z) {
                    C12009k4 c12009k4M56600k4 = !AbstractC12002ck.m56321kk(c12009k4.mo15753jd()) ? c12009k4.m56600k4(new C12007ix(0.0f, 0.0f, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 2498570) : c12009k4;
                    C3108y2.m13227k4(c12009k4M56600k4, ((ColorFormat) colorChange.getToColor()).m1084to().Clone(), 99);
                    C3152yj c3152yj = new C3152yj();
                    try {
                        c12009k4M56600k4.m56333k4(c3152yj, C3977ck.m15681jd());
                        byte[] array = c3152yj.toArray();
                        c3152yj.dispose();
                        bArrM2134m9 = array;
                    } catch (Throwable th) {
                        c3152yj.dispose();
                        throw th;
                    }
                }
                c12009k4.dispose();
                if (m74636yj() != null) {
                    m74636yj().m63846ks().m56971k4(C7134m9.m27683k4(bArrM2134m9), new C7131h4(C3099wl.m13169ck(bArrM2134m9), bArrM2134m9));
                }
            } catch (Throwable th2) {
                c12009k4.dispose();
                throw th2;
            }
        }
        C10970u4 c10970u4 = new C10970u4(new C12025x6(iM27462to, iM27462to2), c12015qq.Clone(), bArrM2134m9, cxjVar.m4848fa());
        PictureFrame pictureFrame = (PictureFrame) C7019kk.m27452k4((Object) cxjVar.m4857um().getParent_Immediate(), PictureFrame.class);
        if (pictureFrame != null) {
            c10970u4.m53078k4(pictureFrame.getAlternativeText());
        }
        c10951c5.m52930k4(c10970u4);
        c10951c5.m52904k4(mo67706c5().m17345kk());
        m68770k4(c10951c5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo68802x1(C12007ix c12007ix, azo azoVar, C0962es c0962es) {
        boolean z;
        C4328x1 c4328x1M73540k4;
        c12007ix.CloneTo(this.f47906u4);
        boolean z2 = true;
        if (C7019kk.m27469x1(c0962es, C14478sy.class)) {
            c4328x1M73540k4 = m68762k4((C14478sy) c0962es);
        } else {
            if (c0962es == null || c0962es.m5681to() == 0) {
                z = false;
                if (azoVar == null && azoVar.m3903h4()) {
                    this.f47899fa = azoVar.m3919rv();
                } else {
                    z2 = false;
                }
                m68768k4(C10971um.m53087k4(c12007ix.Clone()), z2, z);
            }
            c4328x1M73540k4 = C14814xq.m73540k4(c0962es);
        }
        this.f47897ck = c4328x1M73540k4;
        z = true;
        if (azoVar == null) {
            z2 = false;
        }
        m68768k4(C10971um.m53087k4(c12007ix.Clone()), z2, z);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [float, java.lang.String] */
    /* JADX INFO: renamed from: x1 */
    private void m68788x1(String str, C12007ix c12007ix, qy7 qy7Var, C14251ot c14251ot) {
        if (m68779k4(c14251ot)) {
            int iM27462to = C7019kk.m27462to(Float.valueOf(c14251ot.m68817m9()), 13);
            C12023wl c12023wl = new C12023wl(C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13) + iM27462to, C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13) + iM27462to);
            C12023wl c12023wl2 = new C12023wl(PackageManager.getPackageInfo((String) c12023wl.m56865x1(), 1082130432), PackageManager.getPackageInfo((String) c12023wl.m56862kk(), 1082130432));
            C12009k4 c12009k4 = new C12009k4(c12023wl2.m56865x1(), c12023wl2.m56862kk());
            try {
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
                    abstractC12008jdM56582k4.dispose();
                    omq omqVar = new omq(c12009k4, c12009k4.mo15760yj(), c12009k4.mo15757m9());
                    try {
                        omqVar.m74630x1(4.0f, 4.0f);
                        omqVar.mo64343k4(str, new C12007ix(0.0f, (c12009k4.mo15757m9() / 4.0f) - iM27462to, c12009k4.mo15760yj() / 4.0f, c12009k4.mo15757m9() / 4.0f), qy7Var);
                        m68774k4(c12009k4, new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck() - (c12023wl.m56862kk() - iM27462to)).Clone(), C12023wl.m56853k4(c12023wl).Clone());
                    } finally {
                        omqVar.dispose();
                    }
                } catch (Throwable th) {
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    throw th;
                }
            } finally {
                c12009k4.dispose();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:
    
        r8.m53036k4(r11.m56699x1() + r23.m69930x6());
        r9 = r9 + 1;
        r19 = r11;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C10963ks m68764k4(C5659x1 c5659x1, C4328x1 c4328x1, C12003du c12003du, C12003du c12003du2, C12025x6 c12025x6, String str, qy7 qy7Var) {
        C12015qq c12015qq;
        int i;
        C10963ks c10963ks;
        C12013m9 c12013m9;
        C12015qq c12015qq2;
        String strOooO00o = str;
        if (strOooO00o.length() > 1 && strOooO00o.charAt(0) == 8237 && androidx.core.content.OooO0O0.OooO00o(1, strOooO00o) == 8236) {
            strOooO00o = OooO0OO.OooO00o(2, 1, strOooO00o, strOooO00o);
        }
        String str2 = strOooO00o;
        C6963x1 c6963x1 = new C6963x1();
        try {
            C12013m9 c12013m9M7123k4 = this.f47908uz.m7123k4(c5659x1.m23123m9(), c5659x1.m23114dy(), c5659x1.m23125x1());
            C5656k4 c5656k4 = new C5656k4(c12003du2.m56506h4());
            C5656k4 c5656k42 = C12003du.m56476x1(c12003du, C12003du.f40505to) ? new C5656k4(c12003du.m56506h4()) : C5656k4.f15629ze;
            C12015qq c12015qq3 = new C12015qq();
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    c6963x1.m27219k4(str2, c12013m9M7123k4).CloneTo(c12015qq3);
                    break;
                } catch (RuntimeException e) {
                    if (i2 == 2) {
                        throw e;
                    }
                }
            }
            C4320jd c4320jd = new C4320jd(c5656k42);
            if (c4328x1 != null) {
                c12015qq = c12015qq3;
                i = 3;
                c10963ks = new C10963ks(c5659x1, c4328x1, c4320jd, c12025x6.Clone(), str2, c12015qq3.Clone(), qy7Var.m69930x6());
                c10963ks.m52993k4(qy7Var.m69924wl());
                c12013m9 = c12013m9M7123k4;
            } else {
                c12015qq = c12015qq3;
                i = 3;
                c12013m9 = c12013m9M7123k4;
                c10963ks = new C10963ks(c5659x1, c5656k4, c5656k42, c12025x6.Clone(), str2, c12015qq.Clone(), qy7Var.m69930x6(), qy7Var.m69924wl());
            }
            c10963ks.m52992k4(m68780k4(qy7Var, c5659x1.m23114dy(), c5659x1.m23120k4(), str2));
            if (!C14064he.m66715kk(qy7Var.m69930x6()) && qy7Var.m69930x6() != 0.0f) {
                C10968rv.k4 k4Var = new C10968rv.k4();
                int i3 = 0;
                while (i3 < str2.length()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i) {
                            c12015qq2 = c12015qq;
                            break;
                        }
                        try {
                            c12015qq2 = c12015qq;
                        } catch (RuntimeException e2) {
                            e = e2;
                            c12015qq2 = c12015qq;
                        }
                        try {
                            c6963x1.m27219k4(C14113y2.m67389k4(str2.charAt(i3), 1), c12013m9).CloneTo(c12015qq2);
                            break;
                        } catch (RuntimeException e3) {
                            e = e3;
                            if (i4 == 2) {
                                throw e;
                            }
                            i4++;
                            c12015qq = c12015qq2;
                        }
                        i4++;
                        c12015qq = c12015qq2;
                    }
                }
                c10963ks.m52988k4(k4Var.m53034h4());
            }
            c6963x1.dispose();
            c10963ks.m52984k4(mo67706c5().m17345kk());
            c10963ks.m52990k4(c12025x6.Clone());
            if (this.f47905rv != null) {
                this.f47906u4 = new C12007ix(new C12025x6(c10963ks.m52982jd().m56897x1(), c10963ks.m52982jd().m56895kk() - c10963ks.m53005x1().m23111c5()).Clone(), c10963ks.m53002up().Clone());
                c10963ks.m52987k4(m68784kk(this.f47905rv));
            }
            AutoShape autoShapeM68761k4 = m68761k4(qy7Var.f48480to);
            c10963ks.m52983k4((autoShapeM68761k4 == null || autoShapeM68761k4.getPlaceholder() == null) ? 0 : m68760k4(autoShapeM68761k4.getPlaceholder().getType()));
            lrb lrbVar = qy7Var.f48466du;
            c10963ks.m52991k4(lrbVar != null ? lrbVar.getLanguageId() : null);
            return c10963ks;
        } catch (Throwable th) {
            c6963x1.dispose();
            throw th;
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo68791k4() {
        this.f47905rv = null;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo68792k4(IHyperlink iHyperlink) {
        this.f47905rv = iHyperlink;
    }

    /* JADX INFO: renamed from: k4 */
    private void m68765k4(IOuterShadowEffectiveData iOuterShadowEffectiveData, String str, qy7 qy7Var, C4328x1 c4328x1, C5659x1 c5659x1, C12025x6 c12025x6) {
        if (iOuterShadowEffectiveData != null) {
            vmd vmdVar = (vmd) C7019kk.m27452k4((Object) iOuterShadowEffectiveData, vmd.class);
            o6h o6hVar = new o6h(vmdVar);
            if (vmdVar.getScaleHorizontal() != 0.0d && vmdVar.getScaleVertical() != 0.0d) {
                if (vmdVar.m72364h4() || vmdVar.getScaleHorizontal() != 100.0d || vmdVar.getScaleVertical() != 100.0d || (vmdVar.getBlurRadius() > 2.0d && (qy7Var.m69915rv() > 28.0f || vmdVar.getBlurRadius() >= 4.0d))) {
                    C12025x6 c12025x6Clone = c12025x6.Clone();
                    if (c4328x1.m17417k4() == 3) {
                        c12025x6Clone = new C12025x6(c12025x6.m56897x1(), (qy7Var.m69915rv() / 10.0f) + c12025x6.m56895kk());
                    }
                    o6hVar.m68351k4(this, C14381rb.m70044k4(str, this, qy7Var, c12025x6Clone.Clone(), this.f50616du, 0.0f), qy7Var);
                    return;
                }
                oju ojuVar = qy7Var.f48472k4;
                C12025x6[] c12025x6Arr = {c12025x6};
                o6hVar.m68350k4(qy7Var, new C12007ix(0.0f, 0.0f, ojuVar.f47836k4, ojuVar.f47837x1), qy7Var.m69915rv(), false).m55775k4(c12025x6Arr);
                C12025x6 c12025x6Clone2 = c12025x6Arr[0].Clone();
                C12003du c12003duClone = C12003du.f40505to.Clone();
                if (qy7Var.m69917to() != null && qy7Var.m69917to().f4054h4.m5681to() == 1) {
                    ((qy7Var.m69907kk() == null || qy7Var.m69907kk().m5681to() == 0) ? qy7Var.m69894h4() : AbstractC14897zn.m74600k4(qy7Var.m69894h4().Clone())).CloneTo(c12003duClone);
                }
                C12003du c12003duClone2 = C12003du.f40505to.Clone();
                if (qy7Var.m69907kk() != null && qy7Var.m69907kk().m5681to() != 0) {
                    vmdVar.m72367x1().CloneTo(c12003duClone2);
                }
                if ((qy7Var.m69907kk() != null && qy7Var.m69907kk().m5681to() != 0) || (qy7Var.m69917to() != null && qy7Var.m69917to().f4054h4.m5681to() != 0)) {
                    m68770k4(m68764k4(c5659x1, null, c12003duClone.Clone(), c12003duClone2.Clone(), c12025x6Clone2.Clone(), str, qy7Var));
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64337k4(IPPImage iPPImage, C12007ix c12007ix, C12007ix c12007ix2, qta qtaVar) {
        mo68793k4(iPPImage, c12007ix.Clone(), qtaVar);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo68793k4(IPPImage iPPImage, C12007ix c12007ix, qta qtaVar) {
        if (iPPImage.getWidth() < 1 || iPPImage.getHeight() < 1) {
            return;
        }
        C12015qq c12015qq = new C12015qq(c12007ix.m56550c5(), c12007ix.m56575x1());
        C10951c5 c10951c5 = new C10951c5();
        c10951c5.m52930k4(new C10970u4(c12007ix.m56552du().Clone(), c12007ix.m56570m9().Clone(), m68781k4(iPPImage, c12015qq.Clone()), qtaVar == null ? new C6921dy(0.0d, 0.0d, 0.0d, 0.0d) : qtaVar.m69753k4()));
        c10951c5.m52904k4(mo67706c5().m17345kk());
        m68770k4(c10951c5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68766k4(cxj cxjVar) {
        float f;
        C12007ix c12007ixClone = cxjVar.m71131xk().Clone();
        C12007ix c12007ixClone2 = cxjVar.m4851ks().Clone();
        C12007ix c12007ix = new C12007ix(0.0f, 0.0f, c12007ixClone2.m56550c5(), c12007ixClone2.m56575x1());
        cxjVar.m71129kk(c12007ix.Clone());
        AbstractC12002ck abstractC12002ckM4846bv = cxjVar.m4846bv();
        C12023wl c12023wlClone = AbstractC14897zn.m74607x1(c12007ixClone2.Clone()).Clone();
        C12007ix[] c12007ixArr = {c12007ix};
        C12012lr c12012lrM73545k4 = C14814xq.m73545k4(cxjVar, this, c12007ixArr);
        c12007ixArr[0].CloneTo(c12007ix);
        cxjVar.m4863x1(c12007ix.Clone());
        if (AbstractC14897zn.m74603k4(cxjVar, c12023wlClone.Clone(), c12012lrM73545k4, c12007ix.Clone())) {
            float[] fArr = {1.0f};
            AbstractC14897zn.m74602k4(c12023wlClone.Clone(), c12012lrM73545k4, fArr).CloneTo(c12023wlClone);
            f = fArr[0];
            c12012lrM73545k4.m56621kk(f, f);
        } else {
            f = 1.0f;
        }
        int iMo15753jd = abstractC12002ckM4846bv.mo15753jd();
        if (C3099wl.m13193kk(abstractC12002ckM4846bv)) {
            iMo15753jd = 2498570;
        }
        C12009k4 c12009k4 = new C12009k4(c12023wlClone.m56865x1(), c12023wlClone.m56862kk(), iMo15753jd);
        try {
            c12009k4.m56603k4();
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                abstractC12008jdM56582k4.mo17478dy(3);
                abstractC12008jdM56582k4.mo17476du(2);
                C11896dy c11896dy = new C11896dy();
                c11896dy.m55578x1(new C12007ix(c12007ixClone2.m56557jd(), c12007ixClone2.m56551ck(), c12023wlClone.m56865x1(), c12023wlClone.m56862kk()));
                float f2 = 1.0f / c12012lrM73545k4.m56624m9().m55776k4()[0];
                float f3 = 1.0f / c12012lrM73545k4.m56624m9().m55776k4()[3];
                if (f2 != 1.0f || f3 != 1.0f) {
                    c12012lrM73545k4.m56625to(c12007ixClone2.m56557jd() * f2 * 2.0f, c12007ixClone2.m56551ck() * f3 * 2.0f);
                }
                try {
                    abstractC12008jdM56582k4.mo17527k4(c12012lrM73545k4, c11896dy);
                    abstractC12008jdM56582k4.dispose();
                    int iM27462to = C7019kk.m27462to(Float.valueOf(c12007ixClone2.m56550c5() * f), 13);
                    int iM27462to2 = C7019kk.m27462to(Float.valueOf(c12007ixClone2.m56575x1() * f), 13);
                    C12009k4 c12009k42 = new C12009k4(iM27462to, iM27462to2);
                    try {
                        c12009k42.m56603k4();
                        abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                        try {
                            abstractC12008jdM56582k4.mo17478dy(3);
                            abstractC12008jdM56582k4.mo17476du(2);
                            abstractC12008jdM56582k4.mo17512k4(c12009k4, new C12014ne(0, 0, iM27462to, iM27462to2), new C12014ne(C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12007ixClone2.m56557jd())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12007ixClone2.m56551ck())), 14), iM27462to, iM27462to2), 2);
                            abstractC12008jdM56582k4.dispose();
                            byte[] bArrM13188k4 = C3099wl.m13188k4((AbstractC12002ck) c12009k42);
                            c12009k42.dispose();
                            if (m74636yj() != null) {
                                m74636yj().m63846ks().m56971k4(C7134m9.m27683k4(bArrM13188k4), new C7131h4(C3099wl.m13169ck(bArrM13188k4), bArrM13188k4));
                            }
                            m68767k4(new C10970u4(new C12025x6(C7019kk.m27462to(Double.valueOf(C14116yg.m67479k4(c12007ixClone.m56557jd(), (short) 1)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67479k4(c12007ixClone.m56551ck(), (short) 1)), 14)), c12007ixClone.m56570m9().Clone(), bArrM13188k4, new C6921dy(0.0d, 0.0d, 0.0d, 0.0d)));
                            c12009k4.dispose();
                        } finally {
                        }
                    } catch (Throwable th) {
                        c12009k42.dispose();
                        throw th;
                    }
                } finally {
                    c12012lrM73545k4.dispose();
                }
            } finally {
            }
        } catch (Throwable th2) {
            c12009k4.dispose();
            throw th2;
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo67710k4(C4317dy c4317dy) {
        this.f47907up = c4317dy.m17345kk();
        mo68798to();
    }

    /* JADX INFO: renamed from: k4 */
    private void m68767k4(C10970u4 c10970u4) {
        C10951c5 c10951c5 = new C10951c5();
        c10951c5.m52930k4(c10970u4);
        c10951c5.m52904k4(mo67706c5().m17345kk());
        m68770k4(c10951c5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68768k4(C10971um c10971um, boolean z, boolean z2) {
        m68769k4(c10971um, z, z2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68769k4(C10971um c10971um, boolean z, boolean z2, int i) {
        if (z2 || z) {
            c10971um.m53100k4(z ? this.f47899fa : null);
            c10971um.m53101k4(z2 ? this.f47897ck : null);
            m74623ks().m17345kk();
            c10971um.m53105kk(i);
            c10971um.m53099k4(mo67706c5().m17345kk());
        } else if (this.f47910x6 == null) {
            return;
        } else {
            c10971um.m52928dy();
        }
        IHyperlink iHyperlink = this.f47910x6;
        if (iHyperlink != null && !this.f47903ne) {
            c10971um.m53102k4(m68784kk(iHyperlink));
            this.f47903ne = true;
        }
        m68770k4(c10971um);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68770k4(AbstractC10973uz abstractC10973uz) {
        C10966ne c10966ne = this.f47902ks;
        if (c10966ne == null) {
            this.f47911yj.m52930k4(abstractC10973uz);
        } else {
            c10966ne.m52930k4(abstractC10973uz);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68771k4(C11896dy c11896dy, byte b) {
        if (b != 5) {
            this.f47899fa = null;
            m68773k4(c11896dy, true, true, 1);
            return;
        }
        this.f47899fa.m17377x1(2);
        this.f47899fa.m17371kk(2);
        this.f47899fa.m17363h4(0);
        this.f47899fa.m17374to(0);
        m68773k4(c11896dy, true, false, 1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68772k4(C11896dy c11896dy, azo azoVar) {
        C11896dy[] c11896dyArr = {null};
        C11896dy[] c11896dyArr2 = {null};
        C11896dy c11896dyM74609k4 = m74609k4(c11896dy, azoVar, c11896dyArr, c11896dyArr2);
        C11896dy c11896dy2 = c11896dyArr[0];
        C11896dy c11896dy3 = c11896dyArr2[0];
        C4320jd c4320jdM3919rv = azoVar.m3919rv();
        this.f47899fa = c4320jdM3919rv;
        if (c11896dy2 != null) {
            c4320jdM3919rv.m17377x1(0);
        }
        if (c11896dy3 != null) {
            this.f47899fa.m17371kk(0);
        }
        m68773k4(c11896dyM74609k4, true, false, 1);
        C0962es c0962es = azoVar.f4054h4;
        this.f47897ck = c0962es == null ? new C4318fa(C5656k4.m23095k4(azoVar.m3916m9().Clone())) : C7019kk.m27469x1(c0962es, C14478sy.class) ? m68762k4((C14478sy) azoVar.f4054h4) : C14814xq.m73540k4(azoVar.f4054h4);
        if (c11896dy2 != null) {
            C4320jd c4320jdM3919rv2 = azoVar.m3919rv();
            this.f47899fa = c4320jdM3919rv2;
            c4320jdM3919rv2.m17377x1(0);
            m68771k4(c11896dy2, azoVar.m3897c5());
        }
        if (c11896dy3 != null) {
            C4320jd c4320jdM3919rv3 = azoVar.m3919rv();
            this.f47899fa = c4320jdM3919rv3;
            c4320jdM3919rv3.m17371kk(0);
            m68771k4(c11896dy3, azoVar.m3905jd());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a A[PHI: r0
      0x011a: PHI (r0v13 boolean) = (r0v12 boolean), (r0v12 boolean), (r0v24 boolean) binds: [B:35:0x00bb, B:37:0x00c1, B:60:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo64338k4(C11896dy c11896dy, azo azoVar, C0962es c0962es) {
        boolean z;
        int i;
        C4328x1 c4328x1M73540k4;
        C4327up c4327upM73537k4;
        boolean z2 = true;
        if (C7019kk.m27469x1(c0962es, cxj.class)) {
            cxj cxjVar = (cxj) c0962es;
            if (m74621k4(c11896dy, azoVar, cxjVar, true)) {
                if (m74618k4(cxjVar.m4861wl())) {
                    m68787x1(cxjVar);
                    return;
                } else {
                    m68766k4(cxjVar);
                    return;
                }
            }
        }
        c11896dy.m55523c5().CloneTo(this.f47906u4);
        int i2 = 0;
        if (C7019kk.m27469x1(c0962es, b2l.class)) {
            try {
                c4327upM73537k4 = C14814xq.m73537k4((b2l) c0962es);
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                this.f47897ck = C14814xq.m73549x1(c0962es);
                c4327upM73537k4 = null;
            }
            if (c4327upM73537k4 != null) {
                C4317dy c4317dyM74623ks = m74623ks();
                C11913yj c11913yj = new C11913yj(c4317dyM74623ks.m17347to(), c4317dyM74623ks.m17329du(), c4317dyM74623ks.m17331h4(), c4317dyM74623ks.m17346m9(), 0.0f, 0.0f);
                c4328x1M73540k4 = c4327upM73537k4;
                if (!c11913yj.m55789x1()) {
                    c4328x1M73540k4 = c4327upM73537k4;
                    if (c11913yj.m55778kk()) {
                        c11913yj.m55780m9();
                        float[] fArrM55776k4 = c11913yj.m55776k4();
                        c4327upM73537k4.m17387k4(new C4317dy(fArrM55776k4[0], fArrM55776k4[1], fArrM55776k4[2], fArrM55776k4[3], 0.0f, 0.0f));
                        c4328x1M73540k4 = c4327upM73537k4;
                    }
                }
            }
            z = true;
            if (azoVar == null || !azoVar.m3903h4()) {
                z2 = false;
            } else {
                c11896dy.m55526dy();
                boolean z3 = ((azoVar.m3905jd() == 0 && azoVar.m3897c5() == 0) || m74619k4(c11896dy)) ? false : true;
                if (z3 || !(azoVar.m3927x1() == -1 || azoVar.m3927x1() == 0)) {
                    C12026yj c12026yjM3930x6 = azoVar.m3930x6();
                    if (z3) {
                        m68772k4(c11896dy, azoVar);
                        return;
                    }
                    this.f50624x1.mo17540k4(c12026yjM3930x6, c11896dy);
                    C12556ck.m58562k4(c11896dy, c12026yjM3930x6);
                    if (c0962es == null) {
                        this.f47897ck = new C4318fa(C5656k4.m23095k4(azoVar.m3916m9().Clone()));
                        this.f47899fa = null;
                        i = 1;
                    } else {
                        z2 = z;
                        i = 0;
                    }
                    i2 = i;
                    z = z2;
                    z2 = false;
                } else if (!C7019kk.m27469x1(azoVar.m3917ne(), C14478sy.class) || ((C14478sy) azoVar.m3917ne()).m70894qq()) {
                    this.f47899fa = azoVar.m3919rv();
                } else {
                    this.f47897ck = m68762k4((C14478sy) azoVar.m3917ne());
                    C12026yj c12026yjM3930x62 = azoVar.m3930x6();
                    try {
                        c11896dy.m55549k4(c12026yjM3930x62);
                        z = true;
                        z2 = false;
                    } finally {
                        if (c12026yjM3930x62 != null) {
                            c12026yjM3930x62.dispose();
                        }
                    }
                }
            }
            m68773k4(c11896dy, z2, z, i2);
        }
        if (C7019kk.m27469x1(c0962es, C14478sy.class)) {
            c4328x1M73540k4 = m68762k4((C14478sy) c0962es);
        } else {
            if (c0962es == null || c0962es.m5681to() == 0) {
                z = false;
                if (azoVar == null) {
                    z2 = false;
                }
                m68773k4(c11896dy, z2, z, i2);
            }
            c4328x1M73540k4 = C14814xq.m73540k4(c0962es);
        }
        this.f47897ck = c4328x1M73540k4;
        z = true;
        if (azoVar == null) {
        }
        m68773k4(c11896dy, z2, z, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m68773k4(C11896dy c11896dy, boolean z, boolean z2, int i) {
        C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
        byte[] bArrM55571to = c11896dy.m55571to();
        int length = bArrM55571to.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < bArrM55571to.length; i2++) {
            iArr[i2] = bArrM55571to[i2] & 255;
        }
        List list = new List();
        C14239oj c14239oj = null;
        for (int i3 = 0; i3 < length; i3++) {
            if (iArr[i3] == 0) {
                c14239oj = new C14239oj();
                list.addItem(c14239oj);
            }
            if (c14239oj != null) {
                if ((iArr[i3] & 128) == 128) {
                    c14239oj.m68612k4(true);
                }
                c14239oj.m68611k4(c12025x6ArrM55565kk[i3].Clone(), iArr[i3]);
            }
        }
        C10971um c10971um = new C10971um();
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                C14239oj c14239oj2 = (C14239oj) it.next();
                C10971um[] c10971umArr = {c10971um};
                C14712vv.m72554k4(c10971umArr, c14239oj2.m68614kk(), c14239oj2.m68615x1(), c14239oj2.m68613k4());
                c10971um = c10971umArr[0];
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m68769k4(c10971um, z, z2, i);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64339k4(AbstractC12002ck abstractC12002ck, float f, float f2, float f3, float f4) {
        m68774k4(abstractC12002ck, new C12025x6(f, f2), new C12015qq(f3, f4));
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64340k4(AbstractC12002ck abstractC12002ck, int i, int i2) {
        m68774k4(abstractC12002ck, new C12025x6(i, i2), new C12015qq(abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9()));
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64341k4(AbstractC12002ck abstractC12002ck, int i, int i2, int i3, int i4) {
        m68774k4(abstractC12002ck, new C12025x6(i, i2), new C12015qq(i3, i4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r2 = ((com.aspose.slides.internal.p323op.C7131h4) r0.getValue()).m27674du();
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m68774k4(AbstractC12002ck abstractC12002ck, C12025x6 c12025x6, C12015qq c12015qq) {
        C12007ix c12007ixM53080kk;
        byte[] array = null;
        if (m74636yj() != null) {
            Dictionary.Enumerator<C7134m9, C7131h4> it = m74636yj().m63846ks().m56976x1().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    KeyValuePair next = it.next();
                    if (((C7131h4) next.getValue()).m27679to() && abstractC12002ck.equals(((C7131h4) next.getValue()).m27678kk())) {
                        break;
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (array == null) {
            C3152yj c3152yj = new C3152yj();
            try {
                abstractC12002ck.m56333k4(c3152yj, C3977ck.m15681jd());
                array = c3152yj.toArray();
            } finally {
                c3152yj.dispose();
            }
        }
        C10970u4 c10970u4 = new C10970u4(c12025x6.Clone(), c12015qq.Clone(), array, new C6921dy(0.0d, 0.0d, 0.0d, 0.0d));
        IHyperlink iHyperlink = this.f47910x6;
        if (iHyperlink != null && !this.f47903ne) {
            IShape iShape = (IGeometryShape) C7019kk.m27452k4((Object) ((Hyperlink) iHyperlink).m1693jd(), IGeometryShape.class);
            if (iShape == null) {
                c12007ixM53080kk = c10970u4.m53080kk();
            } else if (C7019kk.m27469x1(iShape, Shape.class)) {
                c12007ixM53080kk = ((Shape) iShape).m2546bz().m5633jd();
            } else {
                this.f47906u4 = new C12007ix(iShape.getX(), iShape.getY(), iShape.getWidth(), iShape.getHeight());
                c10970u4.m53075k4(m68784kk(this.f47910x6));
                this.f47903ne = true;
            }
            c12007ixM53080kk.CloneTo(this.f47906u4);
            c10970u4.m53075k4(m68784kk(this.f47910x6));
            this.f47903ne = true;
        }
        m68767k4(c10970u4);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64342k4(C12007ix c12007ix) {
        m68790jd().m52907k4(C10971um.m53087k4(c12007ix.Clone()));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo68794k4(C12007ix c12007ix, azo azoVar, C0962es c0962es) {
        boolean z;
        C4328x1 c4328x1M73541k4;
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(c12007ix.Clone());
        boolean z2 = true;
        if (C7019kk.m27469x1(c0962es, cxj.class)) {
            cxj cxjVar = (cxj) c0962es;
            if (m74621k4(c11896dy, azoVar, cxjVar, true)) {
                if (m74618k4(cxjVar.m4861wl())) {
                    m68787x1(cxjVar);
                    return;
                } else {
                    m68766k4(cxjVar);
                    return;
                }
            }
        }
        c12007ix.CloneTo(this.f47906u4);
        if (C7019kk.m27469x1(c0962es, C14478sy.class)) {
            c4328x1M73541k4 = m68763k4((C14478sy) c0962es, 288.0f);
        } else {
            if (c0962es == null || c0962es.m5681to() == 0) {
                z = false;
                if (azoVar == null && azoVar.m3903h4()) {
                    this.f47899fa = azoVar.m3919rv();
                } else {
                    z2 = false;
                }
                m68768k4(C10971um.m53087k4(c12007ix.Clone()), z2, z);
            }
            c4328x1M73541k4 = C14814xq.m73541k4(c0962es, 288.0f);
        }
        this.f47897ck = c4328x1M73541k4;
        z = true;
        if (azoVar == null) {
            z2 = false;
        }
        m68768k4(C10971um.m53087k4(c12007ix.Clone()), z2, z);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo68795k4(C12014ne c12014ne, azo azoVar, C0962es c0962es) {
        mo68794k4(new C12007ix(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1()).Clone(), azoVar, c0962es);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68775k4(C12015qq c12015qq) {
        this.f47911yj.m52904k4(new C4317dy(c12015qq.m56699x1() / this.f47901jd.m56699x1(), 0.0f, 0.0f, c12015qq.m56697kk() / this.f47901jd.m56697kk(), 0.0f, 0.0f));
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo68796k4(String str) {
        C10966ne c10966ne = new C10966ne();
        c10966ne.m53025k4(str);
        m68770k4(c10966ne);
        this.f47902ks = c10966ne;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo64343k4(String str, C12007ix c12007ix, qy7 qy7Var) {
        C14251ot c14251otM69882b3;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 8205 || str.charAt(i) == 8237 || str.charAt(i) == 8238 || str.charAt(i) == 8236) {
                C6765kp c6765kp = new C6765kp();
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (str.charAt(i2) != 8205 && str.charAt(i2) != 8237 && str.charAt(i2) != 8238 && str.charAt(i2) != 8236) {
                        c6765kp.m26780k4(str.charAt(i2));
                    }
                }
                str = c6765kp.toString();
                c14251otM69882b3 = qy7Var.m69882b3();
                if (!m68779k4(c14251otM69882b3)) {
                    m68788x1(str, c12007ix.Clone(), qy7Var, c14251otM69882b3);
                    return;
                }
                c12007ix.m56572to(c12007ix.m56551ck() - (qy7Var.m69915rv() * (qy7Var.m69926x1() / 100.0f)));
                if (qy7Var.m69921up() != 1 || qy7Var.m69907kk() == null || qy7Var.m69907kk().m5681to() <= 1) {
                    mo68705k4(str, c12007ix.Clone(), qy7Var, c14251otM69882b3);
                    return;
                } else {
                    m74633x1(str, c12007ix.Clone(), qy7Var);
                    return;
                }
            }
        }
        c14251otM69882b3 = qy7Var.m69882b3();
        if (!m68779k4(c14251otM69882b3)) {
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo68705k4(String str, C12007ix c12007ix, qy7 qy7Var, C14251ot c14251ot) {
        qy7 qy7Var2;
        C4320jd c4320jdM3907k4;
        String strM68812k4 = c14251ot.m68812k4(str);
        C4328x1 c4328x1M73540k4 = C14814xq.m73540k4(qy7Var.m69907kk());
        C12003du c12003duClone = C12003du.f40505to.Clone();
        C5659x1 c5659x1M68819x1 = c14251ot.m68819x1();
        IPdfOptions iPdfOptions = this.f47904qq.f45576up;
        if (iPdfOptions == null || iPdfOptions.getCompliance() <= 2) {
            qy7Var2 = qy7Var;
            m68776k4(strM68812k4, c12007ix.m56552du().Clone(), c4328x1M73540k4, c5659x1M68819x1, qy7Var2, c14251ot);
            c4328x1M73540k4 = c4328x1M73540k4;
        } else {
            qy7Var2 = qy7Var;
        }
        C12003du c12003duClone2 = C12003du.f40505to.Clone();
        if (qy7Var2.m69917to() != null) {
            if (qy7Var2.m69917to().f4054h4.m5681to() == 1) {
                qy7Var2.m69917to().m3916m9().CloneTo(c12003duClone2);
            } else {
                c4320jdM3907k4 = qy7Var2.m69917to().f4054h4.m5681to() == 2 ? qy7Var2.m69917to().m3907k4(54.0f) : null;
            }
        }
        C10963ks c10963ksM68764k4 = m68764k4(c5659x1M68819x1, c4328x1M73540k4, c12003duClone2.Clone(), c12003duClone.Clone(), c12007ix.m56552du().Clone(), strM68812k4, qy7Var2);
        if (c4320jdM3907k4 != null) {
            c10963ksM68764k4.m52985k4(c4320jdM3907k4);
        }
        m68770k4(c10963ksM68764k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68776k4(String str, C12025x6 c12025x6, C4328x1 c4328x1, C5659x1 c5659x1, qy7 qy7Var, C14251ot c14251ot) {
        C5659x1 c5659x12;
        if (qy7Var.m69918ts() || qy7Var.m69886c6() || qy7Var.m69896jd() || qy7Var.m69887ck()) {
            String str2 = str;
            C11896dy c11896dyM70044k4 = C14381rb.m70044k4(str2, this, qy7Var, c12025x6.Clone(), this.f50616du, 0.0f);
            if (qy7Var.m69918ts() && !qy7Var.m69913qm()) {
                IGlowEffectiveData iGlowEffectiveData = qy7Var.f48462c5;
                if (iGlowEffectiveData != null) {
                    new C13763l5(iGlowEffectiveData).m64308k4(this, c11896dyM70044k4, qy7Var);
                }
                IGlowEffectiveData iGlowEffectiveData2 = qy7Var.f48468fa;
                if (iGlowEffectiveData2 != null) {
                    new C14871z3(iGlowEffectiveData2).m74297k4(this, c11896dyM70044k4, qy7Var.m69907kk(), (azo) null);
                }
            }
            if (qy7Var.m69886c6()) {
                new pz4(qy7Var.f48467dy).m69343k4(this, c11896dyM70044k4, qy7Var, c12025x6.Clone());
            }
            if (!qy7Var.m69896jd() || qy7Var.m69913qm()) {
                c5659x12 = c5659x1;
            } else {
                c5659x12 = c5659x1;
                m68765k4(qy7Var.f48464ck, str2, qy7Var, c4328x1, c5659x12, c12025x6.Clone());
                m68765k4(qy7Var.f48471jd, str2, qy7Var, c4328x1, c5659x12, c12025x6.Clone());
                str2 = str2;
            }
            if (qy7Var.m69887ck()) {
                m68777k4(str2, c12025x6.Clone(), c14251ot, c5659x12, qy7Var);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68777k4(String str, C12025x6 c12025x6, C14251ot c14251ot, C5659x1 c5659x1, qy7 qy7Var) {
        C12025x6 c12025x6Clone = m74627u4().Clone();
        float fM56644k4 = c14251ot.m68811k4().m56644k4(this.f50624x1);
        C12025x6 c12025x62 = new C12025x6(((c12025x6Clone.m56897x1() * fM56644k4) / 20.0f) + c12025x6.m56897x1(), ((c12025x6Clone.m56895kk() * fM56644k4) / 20.0f) + c12025x6.m56895kk());
        m68770k4(m68764k4(c5659x1, null, C12003du.f40505to.Clone().Clone(), AbstractC14897zn.m74600k4(qy7Var.m69894h4().Clone()).Clone().Clone(), c12025x62.Clone(), str, qy7Var));
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m68778k4(IImageTransformOperationCollection iImageTransformOperationCollection, ColorChange[] colorChangeArr) {
        colorChangeArr[0] = null;
        if (iImageTransformOperationCollection == null || iImageTransformOperationCollection.size() == 0) {
            return false;
        }
        IGenericEnumerator<IImageTransformOperation> it = iImageTransformOperationCollection.iterator();
        while (it.hasNext()) {
            try {
                IImageTransformOperation next = it.next();
                if (C7019kk.m27469x1(next, ColorChange.class)) {
                    colorChangeArr[0] = (ColorChange) next;
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m68779k4(C14251ot c14251ot) {
        return c14251ot.m68810h4() && this.f47904qq.f45576up.getRasterizeUnsupportedFontStyles();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m68780k4(qy7 qy7Var, float f, C9790ts c9790ts, String str) {
        boolean z = false;
        if (str.length() <= 1) {
            return false;
        }
        c9790ts.m48171ak();
        boolean z2 = C3047dy.m12881to((int) str.charAt(0)) == 2;
        lrb lrbVar = qy7Var.f48466du;
        if (lrbVar != null && f >= lrbVar.getKerningMinimalSize() && !z2 && lrbVar.getKerningMinimalSize() > 0.0f) {
            z = true;
        }
        if (!z || c9790ts.m48220lr() == null) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m68781k4(IPPImage iPPImage, C12015qq c12015qq) {
        byte[] bArrM2134m9 = ((PPImage) iPPImage).m2134m9();
        if (("image/x-emf".equals(iPPImage.getContentType()) || "image/x-wmf".equals(iPPImage.getContentType())) && this.f47900ix) {
            bArrM2134m9 = m68783k4(bArrM2134m9, c12015qq.Clone(), this.f47904qq.f45572ks);
        }
        return m68782k4(bArrM2134m9, C12003du.f40505to.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m68782k4(byte[] bArr, C12003du c12003du) {
        if (c12003du.m56504dy()) {
            return bArr;
        }
        C12009k4 c12009k4 = new C12009k4(new C3152yj(bArr));
        try {
            c12009k4.m56606k4(c12003du.Clone());
            if (c12009k4.mo15750ck().m15685k4().equals(C3977ck.m15678dy().m15685k4().Clone()) || c12009k4.mo15750ck().m15685k4().equals(C3977ck.m15677du().m15685k4().Clone()) || c12009k4.mo15750ck().m15685k4().equals(C3977ck.m15675c5().m15685k4().Clone())) {
                C3108y2.m13227k4(c12009k4, c12003du.Clone(), 99);
            }
            C3152yj c3152yj = new C3152yj();
            try {
                c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                byte[] array = c3152yj.toArray();
                c12009k4.dispose();
                return array;
            } finally {
                c3152yj.dispose();
            }
        } catch (Throwable th) {
            c12009k4.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m68783k4(byte[] bArr, C12015qq c12015qq, float f) {
        C12009k4 c12009k4M13182k4 = C3099wl.m13182k4(bArr, c12015qq.Clone(), f);
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                c12009k4M13182k4.m56333k4(c3152yj, C3977ck.m15681jd());
                byte[] array = c3152yj.toArray();
                c12009k4M13182k4.dispose();
                return array;
            } finally {
                c3152yj.dispose();
            }
        } catch (Throwable th) {
            if (c12009k4M13182k4 != null) {
                c12009k4M13182k4.dispose();
            }
            throw th;
        }
    }
}

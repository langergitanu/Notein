package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7224aa;
import com.aspose.slides.internal.p332p7.C8345ni;
import com.aspose.slides.internal.p407st.C10381c1;
import com.aspose.slides.internal.p407st.C10418eb;
import com.aspose.slides.internal.p407st.C10678v6;
import com.aspose.slides.internal.p407st.C10692wh;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11708b5;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11722cw;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11728dt;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11831uw;
import com.aspose.slides.internal.p464vq.C11848x3;
import com.aspose.slides.internal.p464vq.C11857y6;
import com.aspose.slides.internal.p464vq.C11869ze;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.huawei.hms.network.embedded.C18115b5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class td3 {
    /* JADX INFO: renamed from: k4 */
    public static ILayoutSlide m71103k4(C10692wh c10692wh, final m4c m4cVar) {
        C11708b5 c11708b5;
        ILayoutSlide iLayoutSlide = null;
        try {
            c11708b5 = new C11708b5(new C3152yj(c10692wh.mo51148to()), new AbstractC3174jd() { // from class: com.aspose.slides.td3.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(m4cVar.m64712du().m71955yj()) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                }

                @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                /* JADX INFO: renamed from: k4 */
                public void mo4791k4() {
                    m4cVar.m64712du().m71955yj().throwIfInterruptionRequested();
                }
            });
        } catch (C11848x3 unused) {
            c11708b5 = null;
        }
        if (c11708b5 == null || c11708b5.m55277ix().size() < 1) {
            return null;
        }
        gnb gnbVarM3188ks = m4cVar.m64712du().m3188ks();
        sfn.m70603k4(gnbVarM3188ks.m6801yj(), m4cVar.m64712du().m71946k4(), gnbVarM3188ks);
        MasterSlide masterSlide = (MasterSlide) m4cVar.m64735up();
        List.Enumerator<C11791os> it = c11708b5.m55277ix().iterator();
        while (it.hasNext()) {
            try {
                C11791os next = it.next();
                gnbVarM3188ks.m55337k4(next.m55377up());
                try {
                    ILayoutSlide[] iLayoutSlideArr = {iLayoutSlide};
                    new q7e(next, gnbVarM3188ks).m69458k4(masterSlide, iLayoutSlideArr);
                    iLayoutSlide = iLayoutSlideArr[0];
                } catch (RuntimeException e) {
                    IGenericEnumerator<ILayoutSlide> it2 = masterSlide.getLayoutSlides().iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        try {
                            if (it2.next().getLayoutType() == 11) {
                                i++;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                    }
                    ILayoutSlide iLayoutSlideMo1945k4 = masterSlide.m1944x6().f49885k4.mo1945k4((byte) 11);
                    if (i <= 1) {
                        i = 1;
                    }
                    iLayoutSlideMo1945k4.setName(C14113y2.m67402k4("{0}_Blank", Integer.valueOf(i)));
                    m4cVar.m64712du().m3185k4(C14113y2.m67408k4("RoundTrip Layout slide ", next.m55427x1(), " is corrupted: ", e.getMessage()), 1);
                    iLayoutSlide = iLayoutSlideMo1945k4;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iLayoutSlide;
    }

    /* JADX INFO: renamed from: kk */
    public static void m71113kk(rpo rpoVar) {
        y2n y2nVarM70215k4 = rpoVar.m70215k4();
        LayoutSlide layoutSlide = (LayoutSlide) rpoVar.m70235x1();
        C10678v6 c10678v6 = (C10678v6) rpoVar.m70228to();
        C11708b5 c11708b5 = new C11708b5();
        C11791os c11791osM55394k4 = c11708b5.m55394k4("/drs/slideLayouts/slideLayout1.xml", (AbstractC11760jd.k4) null, new C11857y6());
        c11708b5.m55390dy().m55311x1(c11791osM55394k4);
        new q7e(c11791osM55394k4, y2nVarM70215k4.m73713ks(), layoutSlide).m69457k4(layoutSlide);
        IGenericEnumerator<C11709bg> it = c11791osM55394k4.m55377up().iterator();
        while (it.hasNext()) {
            try {
                C11709bg next = it.next();
                for (C11791os c11791os : y2nVarM70215k4.m73713ks().mo4812qm().m55388c5()) {
                    if (C14113y2.m67363du(c11791os.m55427x1(), next.m55292k4())) {
                        c11708b5.m55408x1(c11791os);
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C10692wh c10692whM70202ar = rpoVar.m70202ar();
        c10692whM70202ar.m51147k4(c11708b5.m55285uz());
        c10692whM70202ar.m51407kk((short) rpoVar.m70226qq());
        if (rpoVar.m70234wl()) {
            return;
        }
        c10678v6.m50507k4(c10692whM70202ar);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m71114x1(final m4c m4cVar) {
        C10381c1 c10381c1M51757h4;
        C11708b5 c11708b5;
        IGenericEnumerator<C11709bg> it;
        if (m4cVar.m64743xk() || (c10381c1M51757h4 = m4cVar.m64717jd().m51757h4()) == null) {
            return;
        }
        try {
            c11708b5 = new C11708b5(new C3152yj(c10381c1M51757h4.mo51148to()), new AbstractC3174jd() { // from class: com.aspose.slides.td3.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(m4cVar.m64712du().m71955yj()) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                }

                @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                /* JADX INFO: renamed from: k4 */
                public void mo4791k4() {
                    m4cVar.m64712du().m71955yj().throwIfInterruptionRequested();
                }
            });
        } catch (C11848x3 unused) {
            c11708b5 = null;
        }
        if (c11708b5 == null || c11708b5.m55281ne().size() < 1) {
            return;
        }
        C11791os c11791osM55282rv = c11708b5.m55282rv();
        if (c11791osM55282rv != null) {
            it = c11791osM55282rv.m55377up().iterator();
            while (it.hasNext()) {
                try {
                    m71105k4(it.next().m55296x1(), m4cVar);
                } finally {
                }
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return;
            }
        } else {
            it = c11708b5.m55281ne().iterator();
            while (it.hasNext()) {
                try {
                    m71105k4((C11791os) it.next(), m4cVar);
                } finally {
                }
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return;
            }
        }
        it.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    private static C11723d3 m71104k4(C11708b5 c11708b5, m4c m4cVar) {
        C11791os c11791osM55280ks = c11708b5.m55280ks();
        m4cVar.m64712du().m3188ks().m6787k4(AbstractC6747ar.m26635ix().mo26677to("Generated by Aspose.Slides for Android via Java "));
        if (C14084qq.m67081jd().m67130fa() % 2 == 0) {
            m4cVar.m64712du().m3186k4(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
        }
        return c11791osM55280ks.m55377up();
    }

    /* JADX INFO: renamed from: x1 */
    public static void m71115x1(rpo rpoVar) {
        qxw qxwVarM70229u4 = rpoVar.m70229u4();
        if (rpoVar.m70220kk() == 2) {
            qxwVarM70229u4 = rpoVar.m70214k4(0).m70229u4();
        }
        if (qxwVarM70229u4.m69810x1() == null) {
            return;
        }
        if (qxwVarM70229u4.m69804h4() || qxwVarM70229u4.m69808m9()) {
            final y2n y2nVarM70215k4 = rpoVar.m70215k4();
            C11708b5 c11708b5 = new C11708b5();
            C11791os c11791osM55394k4 = c11708b5.m55394k4("/theme/theme/themeManager.xml", (AbstractC11760jd.k4) null, new C11722cw());
            c11708b5.m55390dy().m55311x1(c11791osM55394k4);
            if (qxwVarM70229u4.m69804h4()) {
                C11791os c11791osM55394k42 = c11708b5.m55394k4("/theme/theme/theme{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.td3.7
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(y2nVarM70215k4) + "Aspose.Slides.PptSerialization.PptSerializationContext.GetNextThemeFileNumber()";
                    }

                    @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                    /* JADX INFO: renamed from: k4 */
                    public int mo5039k4() {
                        return y2nVarM70215k4.m73687ak();
                    }
                }, new C11831uw());
                c11791osM55394k4.m55377up().m55311x1(c11791osM55394k42);
                new y2q(c11791osM55394k4, y2nVarM70215k4.m73713ks()).m73734k4();
                np9 np9Var = new np9(c11791osM55394k42, y2nVarM70215k4.m73713ks());
                MasterThemeManager masterThemeManager = (MasterThemeManager) C7019kk.m27452k4((Object) qxwVarM70229u4.m69805k4(), MasterThemeManager.class);
                if (masterThemeManager == null) {
                    return;
                }
                IMasterTheme iMasterThemeM1963k4 = masterThemeManager.m1963k4();
                if (rpoVar.m70220kk() == 2) {
                    String name = iMasterThemeM1963k4.getName();
                    iMasterThemeM1963k4.setName(C14113y2.m67408k4(C14057f9.m66591x1(rpoVar.m70226qq()), C18115b5.CONNECTOR, name));
                    np9Var.m68153k4(iMasterThemeM1963k4);
                    iMasterThemeM1963k4.setName(name);
                } else {
                    np9Var.m68153k4(iMasterThemeM1963k4);
                }
            } else {
                C11791os c11791osM55394k43 = c11708b5.m55394k4("/theme/theme/themeOverride{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.td3.8
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return C22209OooOo0O.OooO00o(y2nVarM70215k4.m73713ks(), new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextThemeOverrideFileNumber()");
                    }

                    @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                    /* JADX INFO: renamed from: k4 */
                    public int mo5039k4() {
                        return y2nVarM70215k4.m73713ks().m71572yd();
                    }
                }, new C11869ze());
                c11791osM55394k4.m55377up().m55311x1(c11791osM55394k43);
                y2q y2qVar = new y2q(c11791osM55394k4, y2nVarM70215k4.m73713ks());
                new k1j(c11791osM55394k43, y2nVarM70215k4.m73713ks()).m63593k4((IOverrideTheme) qxwVarM70229u4.m69810x1());
                y2qVar.m73734k4();
            }
            C10381c1 c10381c1 = new C10381c1();
            c10381c1.m51147k4(c11708b5.m55285uz());
            rpoVar.m70228to().m50507k4(c10381c1);
            C0917dv.m5259k4(rpoVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71105k4(C11791os c11791os, m4c m4cVar) {
        boolean zM67359c5 = C14113y2.m67359c5(C14113y2.m67368h4(c11791os.m55427x1()), "themeoverride");
        gnb gnbVarM3188ks = m4cVar.m64712du().m3188ks();
        IMasterThemeManager iMasterThemeManager = (IMasterThemeManager) C7019kk.m27452k4((Object) m4cVar.m64739wy().m69805k4(), IMasterThemeManager.class);
        IOverrideThemeManager iOverrideThemeManager = (IOverrideThemeManager) C7019kk.m27452k4((Object) m4cVar.m64739wy().m69805k4(), IOverrideThemeManager.class);
        if (zM67359c5) {
            k1j k1jVar = new k1j(c11791os, gnbVarM3188ks);
            if (iMasterThemeManager != null) {
                throw new ArgumentException("Processing not implemented for filling of MasterTheme from ThemeOverride data!");
            }
            if (iOverrideThemeManager != null) {
                m71106k4(k1jVar, iOverrideThemeManager, m4cVar);
                return;
            }
            return;
        }
        np9 np9Var = new np9(c11791os, gnbVarM3188ks);
        if (iMasterThemeManager != null) {
            m71108k4(np9Var, iMasterThemeManager, m4cVar);
        } else if (iOverrideThemeManager != null) {
            m71109k4(np9Var, iOverrideThemeManager, m4cVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71106k4(k1j k1jVar, IOverrideThemeManager iOverrideThemeManager, m4c m4cVar) {
        IOverrideTheme overrideTheme = iOverrideThemeManager.getOverrideTheme();
        BaseOverrideThemeManager baseOverrideThemeManager = (BaseOverrideThemeManager) iOverrideThemeManager;
        iOverrideThemeManager.setOverrideTheme(new OverrideTheme(baseOverrideThemeManager));
        k1jVar.m63594k4(iOverrideThemeManager);
        if (m71111k4((ColorScheme) iOverrideThemeManager.getOverrideTheme().getColorScheme())) {
            iOverrideThemeManager.setOverrideTheme(overrideTheme);
            return;
        }
        C13682je c13682jeM5258k4 = C0917dv.m5258k4(m4cVar);
        if (c13682jeM5258k4 == null || !c13682jeM5258k4.m63294k4()) {
            return;
        }
        baseOverrideThemeManager.m423to().m63292k4(c13682jeM5258k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71107k4(final m4c m4cVar) {
        C10678v6 c10678v6;
        C10418eb c10418ebM51845ks;
        C11708b5 c11708b5;
        com.aspose.slides.internal.p332p7.i0a i0aVarM28083up;
        if (m4cVar.m64743xk() || (c10678v6 = (C10678v6) C7019kk.m27452k4((Object) m4cVar.m64717jd(), C10678v6.class)) == null || (c10418ebM51845ks = c10678v6.m51845ks()) == null) {
            return;
        }
        MasterSlide masterSlide = (MasterSlide) C7019kk.m27452k4((Object) m4cVar.m64735up(), MasterSlide.class);
        if (masterSlide == null) {
            masterSlide = (MasterSlide) C7019kk.m27452k4((Object) m4cVar.m64734um(), MasterSlide.class);
        }
        if (masterSlide == null) {
            return;
        }
        C7224aa c7224aa = null;
        try {
            c11708b5 = new C11708b5(new C3152yj(c10418ebM51845ks.mo51148to()), new AbstractC3174jd() { // from class: com.aspose.slides.td3.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(m4cVar.m64712du().m71955yj()) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                }

                @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                /* JADX INFO: renamed from: k4 */
                public void mo4791k4() {
                    m4cVar.m64712du().m71955yj().throwIfInterruptionRequested();
                }
            });
        } catch (C11848x3 unused) {
            c11708b5 = null;
        }
        if (c11708b5 == null || c11708b5.m55280ks() == null) {
            return;
        }
        C11791os c11791osM55280ks = c11708b5.m55280ks();
        m4cVar.m64712du().m3188ks().m55337k4(m71104k4(c11708b5, m4cVar));
        C13938ms c13938ms = new C13938ms(new C3152yj(c11791osM55280ks.m55426to()));
        c13938ms.m65615k4((AbstractC13943n5) null);
        try {
            c7224aa = new C7224aa(c13938ms);
        } catch (RuntimeException unused2) {
        }
        if (c7224aa == null || (i0aVarM28083up = c7224aa.m28083up()) == null) {
            return;
        }
        if (i0aVarM28083up.m33795to() != null) {
            TextStyle textStyle = new TextStyle(masterSlide);
            textStyle.m2986k4((TextStyle) masterSlide.getTitleStyle());
            ((TextStyle) masterSlide.getTitleStyle()).m2989m9();
            iq8.m63054k4(masterSlide.getTitleStyle(), i0aVarM28083up.m33795to(), m4cVar.m64712du().m3188ks());
            ((TextStyle) masterSlide.getTitleStyle()).m2994x1(textStyle);
        }
        if (i0aVarM28083up.m33789du() != null) {
            TextStyle textStyle2 = new TextStyle(masterSlide);
            textStyle2.m2986k4((TextStyle) masterSlide.getBodyStyle());
            ((TextStyle) masterSlide.getBodyStyle()).m2989m9();
            iq8.m63054k4(masterSlide.getBodyStyle(), i0aVarM28083up.m33789du(), m4cVar.m64712du().m3188ks());
            ((TextStyle) masterSlide.getBodyStyle()).m2988kk(textStyle2);
        }
        if (i0aVarM28083up.m33790h4() != null) {
            TextStyle textStyle3 = new TextStyle(masterSlide);
            textStyle3.m2986k4((TextStyle) masterSlide.getOtherStyle());
            ((TextStyle) masterSlide.getOtherStyle()).m2989m9();
            iq8.m63054k4(masterSlide.getOtherStyle(), i0aVarM28083up.m33790h4(), m4cVar.m64712du().m3188ks());
            ((TextStyle) masterSlide.getOtherStyle()).m2988kk(textStyle3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71108k4(np9 np9Var, IMasterThemeManager iMasterThemeManager, m4c m4cVar) {
        IMasterTheme overrideTheme = iMasterThemeManager.getOverrideTheme();
        boolean zIsOverrideThemeEnabled = iMasterThemeManager.isOverrideThemeEnabled();
        MasterThemeManager masterThemeManager = (MasterThemeManager) iMasterThemeManager;
        iMasterThemeManager.setOverrideTheme(new MasterTheme(masterThemeManager));
        np9Var.m68154k4(iMasterThemeManager);
        if (m71111k4((ColorScheme) iMasterThemeManager.getOverrideTheme().getColorScheme())) {
            iMasterThemeManager.setOverrideTheme(overrideTheme);
            iMasterThemeManager.setOverrideThemeEnabled(zIsOverrideThemeEnabled);
            return;
        }
        C13682je c13682jeM5258k4 = C0917dv.m5258k4(m4cVar);
        if (c13682jeM5258k4 == null || !c13682jeM5258k4.m63294k4()) {
            return;
        }
        masterThemeManager.m423to().m63292k4(c13682jeM5258k4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m71109k4(np9 np9Var, IOverrideThemeManager iOverrideThemeManager, m4c m4cVar) {
        MasterThemeManager masterThemeManager = new MasterThemeManager(null);
        np9Var.m68154k4(masterThemeManager);
        if (m71111k4((ColorScheme) masterThemeManager.getOverrideTheme().getColorScheme())) {
            return;
        }
        C13682je c13682jeM5258k4 = C0917dv.m5258k4(m4cVar);
        if (c13682jeM5258k4 != null && c13682jeM5258k4.m63294k4()) {
            masterThemeManager.m423to().m63292k4(c13682jeM5258k4);
        }
        if (m4cVar.m64714fa() == 2 && m71112k4(m4cVar, masterThemeManager)) {
            return;
        }
        if (iOverrideThemeManager.getOverrideTheme().getColorScheme() != null) {
            ((ColorScheme) iOverrideThemeManager.getOverrideTheme().getColorScheme()).m1128k4((ColorScheme) masterThemeManager.getOverrideTheme().getColorScheme());
        } else {
            iOverrideThemeManager.getOverrideTheme().initColorSchemeFrom((ColorScheme) masterThemeManager.getOverrideTheme().getColorScheme());
        }
        if (masterThemeManager.m423to().m63294k4()) {
            ((BaseThemeManager) iOverrideThemeManager).m423to().m63292k4(masterThemeManager.m423to());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71110k4(rpo rpoVar) {
        if (C7019kk.m27469x1(rpoVar.m70235x1(), MasterSlide.class)) {
            MasterSlide masterSlide = (MasterSlide) rpoVar.m70235x1();
            if (rpoVar.m70220kk() == 2) {
                masterSlide = (MasterSlide) C7019kk.m27452k4((Object) ((LayoutSlide) rpoVar.m70235x1()).getMasterSlide(), MasterSlide.class);
            }
            if (((TextStyle) masterSlide.getTitleStyle()).m2981h4() || ((TextStyle) masterSlide.getBodyStyle()).m2981h4() || ((TextStyle) masterSlide.getOtherStyle()).m2981h4()) {
                y2n y2nVarM70215k4 = rpoVar.m70215k4();
                C10678v6 c10678v6 = (C10678v6) rpoVar.m70228to();
                C11708b5 c11708b5 = new C11708b5();
                C11791os c11791osM55394k4 = c11708b5.m55394k4("/drs/slideMasters/slideMaster1.xml", (AbstractC11760jd.k4) null, new C11728dt());
                c11708b5.m55390dy().m55311x1(c11791osM55394k4);
                C11723d3 c11723d3M55433g8 = y2nVarM70215k4.m73713ks().m55433g8();
                u8s u8sVarM73713ks = y2nVarM70215k4.m73713ks();
                u8sVarM73713ks.m55434k4(c11708b5.m55390dy());
                try {
                    final com.aspose.slides.internal.p332p7.i0a i0aVar = new com.aspose.slides.internal.p332p7.i0a();
                    iq8.m63053k4(masterSlide.getTitleStyle(), new AbstractC4685kk<C8345ni>() { // from class: com.aspose.slides.td3.4
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(i0aVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_SlideMasterTextStylesElementData.AddTitleStyle()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C8345ni invoke() {
                            return i0aVar.m33791k4();
                        }
                    }, u8sVarM73713ks);
                    iq8.m63053k4(masterSlide.getBodyStyle(), new AbstractC4685kk<C8345ni>() { // from class: com.aspose.slides.td3.5
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(i0aVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_SlideMasterTextStylesElementData.AddBodyStyle()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C8345ni invoke() {
                            return i0aVar.m33796x1();
                        }
                    }, u8sVarM73713ks);
                    iq8.m63053k4(masterSlide.getOtherStyle(), new AbstractC4685kk<C8345ni>() { // from class: com.aspose.slides.td3.6
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(i0aVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_SlideMasterTextStylesElementData.AddOtherStyle()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C8345ni invoke() {
                            return i0aVar.m33793kk();
                        }
                    }, u8sVarM73713ks);
                    new edy(c11791osM55394k4, u8sVarM73713ks).m5462k4(i0aVar);
                    u8sVarM73713ks.m55434k4(c11723d3M55433g8);
                    C10418eb c10418eb = new C10418eb();
                    c10418eb.m51147k4(c11708b5.m55285uz());
                    c10678v6.m50507k4(c10418eb);
                } catch (Throwable th) {
                    u8sVarM73713ks.m55434k4(c11723d3M55433g8);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m71111k4(ColorScheme colorScheme) {
        if (colorScheme == null) {
            return true;
        }
        for (int i = 0; i < 12; i++) {
            ColorFormat colorFormat = colorScheme.f1989x1[i];
            if (colorFormat == null || colorFormat.getColorType() == -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m71112k4(m4c m4cVar, MasterThemeManager masterThemeManager) {
        MasterSlide masterSlide;
        LayoutSlide layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) m4cVar.m64735up(), LayoutSlide.class);
        if (layoutSlide == null) {
            return false;
        }
        LayoutSlideThemeManager layoutSlideThemeManager = (LayoutSlideThemeManager) layoutSlide.getThemeManager();
        if (layoutSlideThemeManager.getOverrideTheme().getColorScheme() != null || (masterSlide = (MasterSlide) C7019kk.m27452k4((Object) layoutSlide.getMasterSlide(), MasterSlide.class)) == null) {
            return false;
        }
        MasterThemeManager masterThemeManager2 = (MasterThemeManager) masterSlide.getThemeManager();
        IColorScheme colorScheme = masterThemeManager2.m1963k4().getColorScheme();
        C13682je c13682jeM423to = layoutSlideThemeManager.m423to();
        if (!c13682jeM423to.m63294k4()) {
            c13682jeM423to = masterThemeManager2.mo348kk();
        }
        IColorScheme colorScheme2 = masterThemeManager.getOverrideTheme().getColorScheme();
        C13682je c13682jeMo348kk = masterThemeManager.mo348kk();
        for (int i = 0; i < 12; i++) {
            if (C12003du.m56476x1(((ColorFormat) colorScheme.getByColorSchemeIndex(c13682jeM423to.m63289k4(i))).m1084to(), ((ColorFormat) colorScheme2.getByColorSchemeIndex(c13682jeMo348kk.m63289k4(i))).m1084to())) {
                return false;
            }
        }
        return true;
    }
}

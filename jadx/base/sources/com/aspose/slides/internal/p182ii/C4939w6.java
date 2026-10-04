package com.aspose.slides.internal.p182ii;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.w6 */
/* JADX INFO: loaded from: classes.dex */
public class C4939w6 extends C1569kk {
    public C4939w6(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
    }

    /* JADX INFO: renamed from: wy */
    private C4884ai m20681wy(String str) {
        C4950zj c4950zj = new C4950zj(this, str);
        if (c4950zj.mo20312k4() > 0) {
            return (C4884ai) C7019kk.m27452k4((Object) c4950zj.mo20314k4(0), C4884ai.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: ai */
    public final String m20682ai() {
        return m59490c5("border", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: ar */
    public final void m20683ar(String str) {
        mo22708k4("border", str);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m20684b3(String str) {
        mo22708k4("width", str);
    }

    /* JADX INFO: renamed from: bs */
    public final String m20685bs() {
        return m59490c5("frame", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: bv */
    public final void m20686bv(String str) {
        mo22708k4("cellspacing", str);
    }

    /* JADX INFO: renamed from: ca */
    public final String m20687ca() {
        return m59490c5("cellspacing", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: em */
    public final String m20688em() {
        return m59490c5("align", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: gf */
    public final void m20689gf() {
        m20680k4((C12804k4) m20701qw());
    }

    /* JADX INFO: renamed from: he */
    public final String m20690he() {
        return m59490c5("rules", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: j2 */
    public final C4884ai m20691j2() {
        return m20681wy("TFOOT");
    }

    /* JADX INFO: renamed from: j5 */
    public final InterfaceC12769ix m20692j5() {
        return m20691j2() != null ? m20691j2() : (C12804k4) C7019kk.m27452k4((Object) m22641kk((AbstractC5535bv) C7019kk.m27452k4((Object) mo22660v4().mo22775du("TFOOT"), AbstractC5535bv.class)), C12804k4.class);
    }

    /* JADX INFO: renamed from: jw */
    public final String m20693jw() {
        return m59490c5("summary", C14113y2.f47374k4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC12777qq m20694k4(int i) {
        C1569kk c1569kk;
        InterfaceC12777qq interfaceC12777qqMo20314k4;
        C4919os c4919osM20706w6 = m20706w6();
        if (i < -1 || i > c4919osM20706w6.mo20312k4()) {
            throw new C12786x1((byte) 1);
        }
        C1569kk c1569kk2 = (c4919osM20706w6.mo20312k4() <= i || i == -1) ? null : (C1569kk) C7019kk.m27452k4((Object) c4919osM20706w6.mo20314k4(i), C1569kk.class);
        C4884ai c4884ai = c1569kk2 != null ? (C4884ai) c1569kk2.m8440k4(C4884ai.class) : null;
        AbstractC4908jd abstractC4908jdM20699os = m20699os();
        if (abstractC4908jdM20699os.mo20312k4() == 0) {
            AbstractC5535bv abstractC5535bvM20703tq = m20703tq();
            if (abstractC5535bvM20703tq == null) {
                abstractC5535bvM20703tq = m20701qw();
            }
            C1569kk c1569kk3 = (C1569kk) C7019kk.m27452k4((Object) mo22660v4().mo22775du("TBODY"), C1569kk.class);
            interfaceC12777qqMo20314k4 = abstractC5535bvM20703tq != null ? m22664x1((AbstractC5535bv) c1569kk3, abstractC5535bvM20703tq) : m22636k4((AbstractC5535bv) c1569kk3, (AbstractC5535bv) C7019kk.m27452k4((Object) m22725x6(), AbstractC5535bv.class));
        } else {
            if (c4884ai != null) {
                c1569kk = c4884ai;
                InterfaceC12769ix interfaceC12769ixMo22775du = mo22660v4().mo22775du("TR");
                return (InterfaceC12777qq) C7019kk.m27452k4((Object) ((c4884ai == c1569kk || i == -1) ? c1569kk.m22641kk((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12769ixMo22775du, AbstractC5535bv.class)) : c1569kk.m22636k4((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12769ixMo22775du, AbstractC5535bv.class), (AbstractC5535bv) c1569kk2)), C12804k4.class);
            }
            interfaceC12777qqMo20314k4 = abstractC4908jdM20699os.mo20314k4(abstractC4908jdM20699os.mo20312k4() - 1);
        }
        c1569kk = (C1569kk) C7019kk.m27452k4((Object) interfaceC12777qqMo20314k4, C1569kk.class);
        InterfaceC12769ix interfaceC12769ixMo22775du2 = mo22660v4().mo22775du("TR");
        return (InterfaceC12777qq) C7019kk.m27452k4((Object) ((c4884ai == c1569kk || i == -1) ? c1569kk.m22641kk((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12769ixMo22775du2, AbstractC5535bv.class)) : c1569kk.m22636k4((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12769ixMo22775du2, AbstractC5535bv.class), (AbstractC5535bv) c1569kk2)), C12804k4.class);
    }

    /* JADX INFO: renamed from: lr */
    public final void m20695lr(String str) {
        mo22708k4("rules", str);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m20696m2() {
        m20680k4((C12804k4) m20703tq());
    }

    /* JADX INFO: renamed from: m4 */
    public final InterfaceC12769ix m20697m4() {
        C4884ai c4884aiM20703tq = m20703tq();
        if (c4884aiM20703tq != null) {
            return c4884aiM20703tq;
        }
        C12804k4 c12804k4 = (C12804k4) C7019kk.m27452k4((Object) mo22660v4().mo22775du("THEAD"), C12804k4.class);
        C4937vh c4937vhM20701qw = m20701qw();
        return (InterfaceC12769ix) C7019kk.m27452k4((Object) (c4937vhM20701qw != null ? m22664x1((AbstractC5535bv) c12804k4, (AbstractC5535bv) c4937vhM20701qw) : m22636k4((AbstractC5535bv) c12804k4, (AbstractC5535bv) C7019kk.m27452k4((Object) m22725x6(), AbstractC5535bv.class))), C12804k4.class);
    }

    /* JADX INFO: renamed from: nv */
    public final void m20698nv() {
        m20680k4((C12804k4) m20691j2());
    }

    /* JADX INFO: renamed from: os */
    public final AbstractC4908jd m20699os() {
        return new C4950zj(this, "TBODY");
    }

    /* JADX INFO: renamed from: qq */
    public final void m20700qq(String str) {
        mo22708k4("bgcolor", str);
    }

    /* JADX INFO: renamed from: qw */
    public final C4937vh m20701qw() {
        return (C4937vh) m8450x1(C4937vh.class);
    }

    /* JADX INFO: renamed from: ri */
    public final String m20702ri() {
        return m59490c5("cellpadding", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: tq */
    public final C4884ai m20703tq() {
        return m20681wy("THEAD");
    }

    /* JADX INFO: renamed from: um */
    public final void m20704um(String str) {
        mo22708k4("cellpadding", str);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m20705v4(String str) {
        mo22708k4("frame", str);
    }

    /* JADX INFO: renamed from: w6 */
    public final C4919os m20706w6() {
        return new C4919os(this, m22716m9("TR"));
    }

    /* JADX INFO: renamed from: wl */
    public final void m20707wl(String str) {
        mo22708k4("align", str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20708x1(int i) {
        C4919os c4919osM20706w6 = m20706w6();
        if (i < -1 || i >= c4919osM20706w6.mo20312k4()) {
            throw new C12786x1((byte) 1);
        }
        if (i == -1) {
            i = c4919osM20706w6.mo20312k4() - 1;
        }
        C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) c4919osM20706w6.mo20314k4(i), C1569kk.class);
        c1569kk.m8452xw().m22663x1((AbstractC5535bv) c1569kk);
    }

    /* JADX INFO: renamed from: y2 */
    public final String m20709y2() {
        return m59490c5("width", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: y9 */
    public final InterfaceC12769ix m20710y9() {
        return m20701qw() != null ? m20701qw() : (C12804k4) C7019kk.m27452k4((Object) m22636k4((AbstractC5535bv) C7019kk.m27452k4((Object) mo22660v4().mo22775du("CAPTION"), AbstractC5535bv.class), (AbstractC5535bv) C7019kk.m27452k4((Object) m22725x6(), AbstractC5535bv.class)), C12804k4.class);
    }

    /* JADX INFO: renamed from: yd */
    public final void m20711yd(String str) {
        mo22708k4("summary", str);
    }

    /* JADX INFO: renamed from: zj */
    public final String m20712zj() {
        return m59490c5("bgcolor", C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        if (m8445t6().m23814ca() != 1) {
            InterfaceC1566du interfaceC1566duMo4645c5 = interfaceC1566du.mo4645c5(this);
            IGenericEnumerator<InterfaceC12777qq> it = m20699os().iterator();
            while (it.hasNext()) {
                try {
                    ((C4884ai) it.next()).mo8441k4(interfaceC1566duMo4645c5);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            interfaceC1566duMo4645c5.mo8369jd(this);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m20680k4(C12804k4 c12804k4) {
        if (c12804k4 != null) {
            m22663x1((AbstractC5535bv) c12804k4);
        }
    }
}

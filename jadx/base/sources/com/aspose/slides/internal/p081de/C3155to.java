package com.aspose.slides.internal.p081de;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p047bu.C1855x1;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3183dy;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p099e3.C3550du;
import com.aspose.slides.internal.p099e3.C3553kk;
import com.aspose.slides.internal.p099e3.C3556x1;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p138fu.C4126jd;
import com.aspose.slides.internal.p148gb.C4252k4;
import com.aspose.slides.internal.p148gb.C4255x1;
import com.aspose.slides.internal.p231kk.C5791k4;
import com.aspose.slides.internal.p252lk.C6108x1;
import com.aspose.slides.internal.p298nh.AbstractC6890h4;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p321on.C7124k4;
import com.aspose.slides.internal.p321on.C7125kk;
import com.aspose.slides.internal.p324oq.InterfaceC7137k4;
import com.aspose.slides.internal.p351q5.C9753kk;
import com.aspose.slides.internal.p379rg.C10007x1;
import com.aspose.slides.internal.p400sk.AbstractC10231to;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.internal.p400sk.C10230kk;
import com.aspose.slides.internal.p400sk.C10232x1;
import com.aspose.slides.internal.p404sp.C10310jd;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.de.to */
/* JADX INFO: loaded from: classes3.dex */
public class C3155to {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f9372fa = new C7017h4("circle", "ellipse", "line", DrawToolFactory.LASSO_TYPE_RECT, "polyline", "polygon", "path", "text", "tspan", "rawText", "image");

    /* JADX INFO: renamed from: du */
    private final C3786fa f9375du;

    /* JADX INFO: renamed from: dy */
    private C9753kk f9376dy;

    /* JADX INFO: renamed from: h4 */
    private final C3787h4 f9377h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC6890h4 f9379k4;

    /* JADX INFO: renamed from: kk */
    private final C3154kk f9380kk;

    /* JADX INFO: renamed from: m9 */
    private final C3791ks f9381m9;

    /* JADX INFO: renamed from: to */
    private final C3783ck f9382to;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC3793to f9383x1;

    /* JADX INFO: renamed from: c5 */
    private final C4126jd f9373c5 = new C4126jd();

    /* JADX INFO: renamed from: jd */
    private final Stack<C11913yj> f9378jd = new Stack<>();

    /* JADX INFO: renamed from: ck */
    private final C11913yj f9374ck = new C11913yj(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    public C3155to(AbstractC6890h4 abstractC6890h4, C3154kk c3154kk, C3783ck c3783ck, C3786fa c3786fa, C3787h4 c3787h4, C3791ks c3791ks, InterfaceC3793to interfaceC3793to) {
        this.f9379k4 = abstractC6890h4;
        this.f9380kk = c3154kk;
        this.f9382to = c3783ck;
        this.f9375du = c3786fa;
        this.f9383x1 = interfaceC3793to;
        this.f9377h4 = c3787h4;
        this.f9381m9 = c3791ks;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m13484c5() {
        this.f9379k4.mo9698k4(this.f9378jd.pop());
    }

    /* JADX INFO: renamed from: du */
    public final C3786fa m13485du() {
        return this.f9375du;
    }

    /* JADX INFO: renamed from: dy */
    public final C4126jd m13486dy() {
        return this.f9373c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final C3787h4 m13487h4() {
        return this.f9377h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6890h4 m13488k4() {
        return this.f9379k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C3154kk m13491kk() {
        return this.f9380kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C3791ks m13493m9() {
        return this.f9381m9;
    }

    /* JADX INFO: renamed from: to */
    public final C3783ck m13494to() {
        return this.f9382to;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC3793to m13495x1() {
        return this.f9383x1;
    }

    /* JADX INFO: renamed from: k4 */
    private C6895to m13479k4(C10007x1 c10007x1, C12009k4 c12009k4, C12015qq c12015qq, C12018u4 c12018u4) {
        C12018u4 c12018u4M56768x1 = c12018u4.m56768x1();
        try {
            c12018u4M56768x1.m56772x1(new C12007ix(0.0f, 0.0f, c12015qq.m56699x1(), c12015qq.m56697kk()));
            C12009k4 c12009k42 = new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12015qq.m56699x1())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12015qq.m56697kk())), 14));
            C6895to c6895to = new C6895to(c12009k42);
            try {
                AbstractC6890h4 abstractC6890h4M26992k4 = AbstractC6890h4.m26992k4(c6895to);
                try {
                    abstractC6890h4M26992k4.mo9702kk(2);
                    abstractC6890h4M26992k4.mo9705x1(2);
                    abstractC6890h4M26992k4.mo9706x1(c12018u4);
                    new C3155to(abstractC6890h4M26992k4, m13491kk(), m13494to(), m13485du(), m13487h4(), m13493m9(), m13495x1()).m13489k4(c10007x1, c12015qq.Clone(), (C12018u4) null);
                    abstractC6890h4M26992k4.dispose();
                    C12014ne c12014neClone = m13481k4(c12018u4).Clone();
                    C12009k4 c12009k43 = new C12009k4(c12014neClone.m56663c5(), c12014neClone.m56683x1());
                    for (int iM56681to = c12014neClone.m56681to(); iM56681to < c12014neClone.m56668h4(); iM56681to++) {
                        for (int iM56666dy = c12014neClone.m56666dy(); iM56666dy < c12014neClone.m56670k4(); iM56666dy++) {
                            C12003du c12003duClone = c12009k42.m56609x1(iM56681to, iM56666dy).Clone();
                            C12003du c12003duClone2 = c12009k4.m56609x1(iM56681to, iM56666dy).Clone();
                            float fM56505fa = ((c12003duClone.m56505fa() & 255) * 0.0721f) + ((c12003duClone.m56502ck() & 255) * 0.7154f) + ((c12003duClone.m56507jd() & 255) * 0.2125f);
                            if ((c12003duClone2.m56501c5() & 255) != 0) {
                                c12003duClone2 = C12003du.m56398k4(C7019kk.m27462to(Float.valueOf(((c12003duClone.m56501c5() & 255) * fM56505fa) / 255.0f), 13), c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255);
                            }
                            c12009k43.m56604k4(iM56681to - c12014neClone.m56681to(), iM56666dy - c12014neClone.m56666dy(), c12003duClone2.Clone().Clone());
                        }
                    }
                    C6895to c6895to2 = new C6895to(c12009k43);
                    c6895to.dispose();
                    c12018u4M56768x1.dispose();
                    return c6895to2;
                } finally {
                }
            } catch (Throwable th) {
                c6895to.dispose();
                throw th;
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public final void m13492kk(C3181c5 c3181c5, C12015qq c12015qq, C12018u4 c12018u4) {
        C11896dy c11896dy;
        C12015qq c12015qqClone;
        C12015qq c12015qqClone2;
        C9753kk c9753kk;
        AbstractC10231to abstractC10231to;
        C12015qq c12015qqClone3;
        boolean zM27456k4;
        String str = c3181c5.f9461x1.get_Item("visibility");
        if (C14113y2.m67432to("hidden", str, (short) 3) || C14113y2.m67432to("collapse", str, (short) 3) || C14113y2.m67432to("none", c3181c5.f9461x1.get_Item("display"), (short) 3) || !C3794up.m15168x1(c3181c5)) {
            return;
        }
        if (C7019kk.m27469x1(c3181c5, C3556x1.class)) {
            List.Enumerator<C5791k4> it = C7125kk.m27650k4(m13487h4().m15134k4(), c3181c5.f9461x1.get_Item("class"), (String) null).iterator();
            while (it.hasNext()) {
                try {
                    C5791k4 next = it.next();
                    if (!C14113y2.m67432to("hidden", next.mo23515k5(), (short) 3) && !C14113y2.m67432to("collapse", next.mo23515k5(), (short) 3)) {
                        if (C14113y2.m67432to("none", next.mo23519kp(), (short) 3)) {
                            if (zM27456k4) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                        return;
                    }
                    return;
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
        try {
            int iM24745kk = C6108x1.m24745kk(c12018u4 != null ? c3181c5.m13640um() : c3181c5.m13629bv());
            switch (f9372fa.m27428k4(c3181c5.f9456h4)) {
                case 0:
                    c11896dy = new C11896dy(iM24745kk);
                    c11896dy.m55542k4(((C4252k4) c3181c5).mo13679k4(this.f9375du, c12015qq.Clone()).Clone());
                    if (c12018u4 == null) {
                        c12015qqClone = c12015qq.Clone();
                        C7125kk.m27656k4(this, c11896dy, c3181c5, c12015qqClone);
                    } else {
                        c12015qqClone2 = c12015qq.Clone();
                        C7125kk.m27661k4(c12018u4, c11896dy, this, c3181c5, c12015qqClone2);
                    }
                    break;
                case 1:
                    c11896dy = new C11896dy(iM24745kk);
                    c11896dy.m55542k4(((C4255x1) c3181c5).mo13679k4(m13485du(), c12015qq.Clone()).Clone());
                    if (c12018u4 == null) {
                        c12015qqClone = c12015qq.Clone();
                        C7125kk.m27656k4(this, c11896dy, c3181c5, c12015qqClone);
                    } else {
                        c12015qqClone2 = c12015qq.Clone();
                        C7125kk.m27661k4(c12018u4, c11896dy, this, c3181c5, c12015qqClone2);
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    C11896dy c11896dyM13468k4 = C3153k4.m13468k4(((InterfaceC7137k4) c3181c5).mo17081x1(this.f9375du, c12015qq.Clone()));
                    c11896dyM13468k4.m55537k4(iM24745kk);
                    if (c12018u4 == null) {
                        C7125kk.m27656k4(this, c11896dyM13468k4, c3181c5, c12015qq.Clone());
                    } else {
                        C7125kk.m27661k4(c12018u4, c11896dyM13468k4, this, c3181c5, c12015qq.Clone());
                    }
                    break;
                case 7:
                    c9753kk = new C9753kk(this, c12018u4);
                    this.f9376dy = c9753kk;
                    abstractC10231to = (AbstractC10231to) c3181c5;
                    c12015qqClone3 = c12015qq.Clone();
                    c9753kk.m24353k4(abstractC10231to, c12015qqClone3);
                    break;
                case 8:
                    c9753kk = this.f9376dy;
                    abstractC10231to = (AbstractC10231to) c3181c5;
                    c12015qqClone3 = c12015qq.Clone();
                    c9753kk.m24353k4(abstractC10231to, c12015qqClone3);
                    break;
                case 9:
                    if ("text".equals(c3181c5.f9457k4.f9456h4) || "tspan".equals(c3181c5.f9457k4.f9456h4)) {
                        this.f9376dy.m24351k4((C10229k4) c3181c5, c12015qq.Clone());
                    }
                    break;
                case 10:
                    try {
                        C7124k4.m27647k4(this, (C3553kk) c3181c5, c12015qq.Clone());
                    } catch (C3183dy unused) {
                    }
                    break;
            }
            m13489k4(c3181c5, c12015qq.Clone(), c12018u4);
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: all -> 0x0085, RuntimeException -> 0x0087, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0087, blocks: (B:24:0x0074, B:27:0x007c, B:32:0x0089, B:33:0x00af), top: B:58:0x0074, outer: #1 }] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13496x1(C3181c5 c3181c5, C12015qq c12015qq, C12018u4 c12018u4) {
        C12018u4 c12018u4M27654k4;
        if (C3794up.m15164k4(c3181c5)) {
            C3550du c3550du = (C3550du) C7019kk.m27452k4((Object) c3181c5, C3550du.class);
            if (c3550du != null) {
                m13482k4(c3550du, c12015qq.Clone(), c12018u4);
                return;
            }
            boolean zContainsKey = c3181c5.f9461x1.containsKey("transform");
            if (zContainsKey) {
                C11913yj c11913yjM15149k4 = this.f9381m9.m15149k4(c3181c5.f9461x1.get_Item("transform"), c12015qq.Clone());
                if (c11913yjM15149k4.equals(this.f9374ck)) {
                    return;
                } else {
                    m13490k4(c11913yjM15149k4);
                }
            }
            C12018u4 c12018u4Mo9704x1 = null;
            if (!C7019kk.m27469x1(c3181c5, InterfaceC3186k4.class) || (c12018u4M27654k4 = C7125kk.m27654k4(this, (InterfaceC3186k4) c3181c5, c12015qq.Clone(), c3181c5)) == null) {
                c12018u4M27654k4 = null;
            } else if (c12018u4 == null) {
                C12018u4 c12018u4Mo9704x12 = m13488k4().mo9704x1();
                m13488k4().mo9700k4(c12018u4M27654k4, 1);
                c12018u4M27654k4 = null;
                c12018u4Mo9704x1 = c12018u4Mo9704x12;
            }
            C10007x1 c10007x1M27653k4 = C7125kk.m27653k4(this, c3181c5);
            try {
                if (c10007x1M27653k4 != null) {
                    try {
                        if (C7019kk.m27469x1(c3181c5, InterfaceC3186k4.class)) {
                            if (c12018u4Mo9704x1 == null) {
                                c12018u4Mo9704x1 = m13488k4().mo9704x1();
                            }
                            m13488k4().mo9699k4(((InterfaceC3186k4) c3181c5).mo13679k4(m13485du(), c12015qq.Clone()).Clone().Clone(), 1);
                            m13483k4(c10007x1M27653k4, c3181c5, c12015qq.Clone());
                        } else {
                            m13492kk(c3181c5, c12015qq.Clone(), c12018u4);
                        }
                    } catch (RuntimeException e) {
                        if (!C4113k4.f11284k4) {
                            throw e;
                        }
                        if (c12018u4Mo9704x1 != null) {
                            m13488k4().mo9700k4(c12018u4Mo9704x1, 0);
                        }
                        if (c12018u4M27654k4 != null) {
                            c12018u4.m56761kk(c12018u4M27654k4);
                        }
                        if (zContainsKey) {
                            m13484c5();
                            return;
                        }
                        return;
                    }
                }
                if (c12018u4Mo9704x1 != null) {
                    m13488k4().mo9700k4(c12018u4Mo9704x1, 0);
                }
                if (c12018u4M27654k4 != null) {
                    c12018u4.m56761kk(c12018u4M27654k4);
                }
                if (zContainsKey) {
                    m13484c5();
                }
            } catch (Throwable th) {
                if (c12018u4Mo9704x1 != null) {
                    m13488k4().mo9700k4(c12018u4Mo9704x1, 0);
                }
                if (c12018u4M27654k4 != null) {
                    c12018u4.m56761kk(c12018u4M27654k4);
                }
                if (zContainsKey) {
                    m13484c5();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [double, int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r4v0, types: [double, int] */
    /* JADX INFO: renamed from: k4 */
    private C12009k4 m13480k4(C3181c5 c3181c5, C12015qq c12015qq) {
        C12009k4 c12009k4 = new C12009k4((int) StringBuffer.append((int) c12015qq.m56699x1()), (int) StringBuffer.append((int) c12015qq.m56697kk()));
        AbstractC6890h4 abstractC6890h4M26992k4 = AbstractC6890h4.m26992k4(new C6895to(c12009k4));
        try {
            abstractC6890h4M26992k4.mo9702kk(2);
            abstractC6890h4M26992k4.mo9705x1(2);
            abstractC6890h4M26992k4.mo9706x1(m13488k4().mo9704x1());
            new C3155to(abstractC6890h4M26992k4, m13491kk(), m13494to(), m13485du(), m13487h4(), m13493m9(), m13495x1()).m13492kk(c3181c5, c12015qq.Clone(), null);
            abstractC6890h4M26992k4.dispose();
            return c12009k4;
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12014ne m13481k4(C12018u4 c12018u4) {
        if (c12018u4 == null) {
            throw new ArgumentNullException("region");
        }
        C12007ix c12007ixClone = ((C1855x1) m13488k4()).m9690k4(c12018u4).Clone();
        return new C12014ne(C12016rv.m56702k4(c12007ixClone.m56552du().Clone()).Clone(), C12023wl.m56854k4(c12007ixClone.m56570m9().Clone()).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13489k4(C3181c5 c3181c5, C12015qq c12015qq, C12018u4 c12018u4) {
        for (int i = 0; i < c3181c5.m13628ar().m13697k4(); i++) {
            try {
                C3181c5 c3181c5M13702x1 = c3181c5.m13628ar().m13702x1(i);
                if (!"rawText".equals(c3181c5M13702x1.f9456h4) || C7019kk.m27469x1(c3181c5M13702x1.m13638qq(), C10230kk.class) || C7019kk.m27469x1(c3181c5M13702x1.f9457k4, C10232x1.class)) {
                    m13496x1(c3181c5M13702x1, c12015qq.Clone(), c12018u4);
                }
            } catch (RuntimeException e) {
                if (!C4113k4.f11284k4) {
                    throw e;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m13482k4(C3550du c3550du, C12015qq c12015qq, C12018u4 c12018u4) {
        C12007ix c12007ixClone = c3550du.mo13679k4(this.f9375du, c12015qq.Clone()).Clone();
        C12015qq c12015qq2 = new C12015qq((float) C14116yg.m67501x1(c12007ixClone.m56550c5()), (float) C14116yg.m67501x1(c12007ixClone.m56575x1()));
        C12018u4 c12018u4Mo9704x1 = m13488k4().mo9704x1();
        try {
            if (c3550du.m14429c6()) {
                m13488k4().mo9706x1(new C12018u4(new C12007ix(new C12025x6(c12007ixClone.m56557jd(), c12007ixClone.m56551ck()), c12015qq2.Clone())));
            }
            C11913yj c11913yj = new C11913yj();
            C10310jd c10310jdM14437ts = c3550du.m14437ts();
            if (c10310jdM14437ts != null) {
                c12015qq2 = c10310jdM14437ts.m50276k4(m13485du()).m56570m9();
            }
            C12015qq c12015qqClone = c12015qq2.Clone();
            C12007ix c12007ixClone2 = C3794up.m15154k4(c3550du.m14432e0(), new C12007ix(C12025x6.f40591k4.Clone(), c12015qqClone.Clone()), c12007ixClone.Clone()).Clone();
            if (c10310jdM14437ts != null) {
                c11913yj.m55786x1(-c10310jdM14437ts.m50276k4(m13485du()).m56557jd(), -c10310jdM14437ts.m50276k4(m13485du()).m56551ck(), 1);
            }
            c11913yj.m55764k4(c12007ixClone2.m56550c5() / c12015qqClone.m56699x1(), c12007ixClone2.m56575x1() / c12015qqClone.m56697kk(), 1);
            c11913yj.m55786x1(c12007ixClone2.m56557jd(), c12007ixClone2.m56551ck(), 1);
            m13490k4(c11913yj);
            m13489k4((C3181c5) c3550du, c12015qqClone.Clone(), c12018u4);
            m13484c5();
            m13488k4().mo9706x1(c12018u4Mo9704x1);
        } catch (Throwable th) {
            m13484c5();
            m13488k4().mo9706x1(c12018u4Mo9704x1);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m13483k4(C10007x1 c10007x1, C3181c5 c3181c5, C12015qq c12015qq) {
        C12009k4 c12009k4M13480k4 = m13480k4(c3181c5, c12015qq.Clone());
        try {
            C12018u4 c12018u4M56768x1 = m13488k4().mo9704x1().m56768x1();
            C12015qq c12015qq2 = new C12015qq();
            if (c10007x1.m49134wy() == 0) {
                c12015qq.CloneTo(c12015qq2);
            } else {
                ((InterfaceC3186k4) c3181c5).mo13679k4(m13485du(), c12015qq.Clone()).Clone().m56570m9().CloneTo(c12015qq2);
            }
            C6895to c6895toM13479k4 = m13479k4(c10007x1, c12009k4M13480k4, c12015qq2.Clone(), c12018u4M56768x1);
            try {
                C12007ix c12007ix = new C12007ix(0.0f, 0.0f, c6895toM13479k4.mo13502h4(), c6895toM13479k4.mo13504m9());
                C12018u4 c12018u4Mo9704x1 = m13488k4().mo9704x1();
                int iMo9703to = m13488k4().mo9703to();
                int iMo9701kk = m13488k4().mo9701kk();
                try {
                    m13488k4().mo9705x1(3);
                    m13488k4().mo9691k4(0);
                    m13488k4().mo9700k4(c12018u4M56768x1, 1);
                    m13488k4().mo9692k4(c6895toM13479k4, m13481k4(c12018u4M56768x1).Clone().Clone(), 0.0f, 0.0f, c12007ix.m56550c5(), c12007ix.m56575x1(), 2);
                    m13488k4().mo9705x1(iMo9703to);
                    m13488k4().mo9700k4(c12018u4Mo9704x1, 0);
                    m13488k4().mo9691k4(iMo9701kk);
                    c6895toM13479k4.dispose();
                    if (c12009k4M13480k4 != null) {
                        c12009k4M13480k4.dispose();
                    }
                } catch (Throwable th) {
                    m13488k4().mo9705x1(iMo9703to);
                    m13488k4().mo9700k4(c12018u4Mo9704x1, 0);
                    m13488k4().mo9691k4(iMo9701kk);
                    throw th;
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13490k4(C11913yj c11913yj) {
        this.f9378jd.push(this.f9379k4.mo9688du());
        C11913yj c11913yjM55760h4 = this.f9379k4.mo9688du().m55760h4();
        c11913yjM55760h4.m55769k4(c11913yj, 0);
        this.f9379k4.mo9698k4(c11913yjM55760h4);
    }
}

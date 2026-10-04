package com.aspose.slides.internal.p365qn;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooOo00;
import com.aspose.slides.internal.p021af.C1367k4;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p046bs.C1847du;
import com.aspose.slides.internal.p046bs.C1850to;
import com.aspose.slides.internal.p046bs.InterfaceC1849kk;
import com.aspose.slides.internal.p046bs.InterfaceC1851x1;
import com.aspose.slides.internal.p048bv.C1867ne;
import com.aspose.slides.internal.p048bv.C1868rv;
import com.aspose.slides.internal.p048bv.C1872x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p182ii.C4913ks;
import com.aspose.slides.internal.p213jw.C5546kk;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5780c6;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5805u4;
import com.aspose.slides.internal.p231kk.InterfaceC5817yj;
import com.aspose.slides.internal.p237ks.C5904h4;
import com.aspose.slides.internal.p237ks.C5908m9;
import com.aspose.slides.internal.p237ks.C5909to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p317og.C7039k4;
import com.aspose.slides.internal.p384rq.C10043dy;
import com.aspose.slides.internal.p384rq.C10046jd;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p423to.C11071kk;
import com.aspose.slides.internal.p453uz.C11589u4;
import com.aspose.slides.internal.p465vt.C11873k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p478wl.C12187wp;
import com.aspose.slides.internal.p491x3.C12378x1;
import com.aspose.slides.internal.p517y2.InterfaceC12760ar;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12778rv;
import com.aspose.slides.internal.p518y4.C12791kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qn.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9897k4 {

    /* JADX INFO: renamed from: k4 */
    private C3152yj f35746k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC1849kk f35747kk;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1851x1 f35748x1;

    public C9897k4(InterfaceC1851x1 interfaceC1851x1, InterfaceC1849kk interfaceC1849kk) {
        this.f35748x1 = interfaceC1851x1;
        this.f35747kk = interfaceC1849kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m48737k4(C11589u4 c11589u4) {
        return c11589u4.m54601m9();
    }

    /* JADX INFO: renamed from: k4 */
    private C1847du m48738k4(String str, InterfaceC5797ne interfaceC5797ne) {
        InterfaceC1849kk interfaceC1849kk;
        C1850to c1850to;
        if (new C14062gk(str, 0).m66683ix()) {
            interfaceC1849kk = this.f35747kk;
            c1850to = new C1850to(str);
        } else {
            if (interfaceC5797ne.mo23405to() != null) {
                str = C3141rv.m13412x1(C3141rv.m13400h4(interfaceC5797ne.mo23405to().mo23395kk()), str);
            }
            C1847du c1847duMo9646k4 = this.f35747kk.mo9646k4(this, new C1850to(str));
            if (c1847duMo9646k4.m9637x1() == null) {
                return c1847duMo9646k4;
            }
            interfaceC1849kk = this.f35747kk;
            c1850to = new C1850to(C3141rv.m13412x1(this.f35748x1.mo9639k4(), str));
        }
        return interfaceC1849kk.mo9646k4(this, c1850to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C9898kk m48742k4(InterfaceC12778rv interfaceC12778rv, C9901x1 c9901x1) {
        m48739k4((InterfaceC5805u4) C7019kk.m27452k4((Object) interfaceC12778rv, InterfaceC5805u4.class));
        m48741k4(interfaceC12778rv);
        try {
            C3152yj c3152yj = new C3152yj();
            this.f35746k4 = c3152yj;
            C10046jd c10046jd = new C10046jd(c3152yj);
            try {
                C1367k4 c1367k4 = new C1367k4(interfaceC12778rv, new C12378x1());
                C12791kk.m59463k4((C4913ks) interfaceC12778rv, c9901x1);
                new C10043dy(this.f35748x1, c10046jd, c9901x1, this.f35747kk, c1367k4).m49635k4((C4913ks) C7019kk.m27452k4((Object) interfaceC12778rv, C4913ks.class));
                c10046jd.m49658x1();
                this.f35746k4.seek(0L, 0);
                C1867ne c1867ne = new C1867ne();
                c1867ne.m9770k4("Times New Roman");
                Dictionary<String, C12007ix> dictionary = new Dictionary<>();
                c1867ne.m9768k4(dictionary);
                c1867ne.m9769k4(new C11873k4(this.f35747kk));
                c1867ne.m9771k4(c9901x1.m48762kk());
                c1867ne.m9775x1(true);
                C10948ar[] array = C1872x6.m9790k4(this.f35746k4, c1867ne).toArray(new C10948ar[0]);
                if (c9901x1.m48758du()) {
                    array = new C9899m9(c9901x1).m48748k4(array);
                }
                c1367k4.m8115k4(array);
                c1367k4.m8114k4(dictionary);
                C9898kk c9898kk = new C9898kk(c1367k4);
                c10046jd.dispose();
                C1868rv.m9778k4().dispose();
                C5909to.m23804kk(0);
                return c9898kk;
            } catch (Throwable th) {
                c10046jd.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            C1868rv.m9778k4().dispose();
            C5909to.m23804kk(0);
            throw th2;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public final C9898kk m48743k4(String str, C9901x1 c9901x1) {
        this.f35748x1.mo9645x1(c9901x1.m48760h4());
        this.f35748x1.mo9640k4(c9901x1.m48759dy());
        return m48742k4(new C5546kk(this.f35747kk, this.f35748x1, c9901x1).m22751k4(str), c9901x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m48739k4(InterfaceC5805u4 interfaceC5805u4) {
        String strM23800x1;
        IGenericEnumerator<InterfaceC5780c6> it = interfaceC5805u4.mo20448x1().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<C5908m9> it2 = ((InterfaceC5775ar) it.next()).mo23390x1().iterator();
                while (it2.hasNext()) {
                    try {
                        InterfaceC5797ne next = it2.next();
                        if (next.mo23403k4() == 5) {
                            C5904h4 c5904h4M23774k4 = C5904h4.m23774k4((InterfaceC5817yj) next);
                            it2 = c5904h4M23774k4.mo23765x1().iterator();
                            while (it2.hasNext()) {
                                try {
                                    C5908m9 next2 = it2.next();
                                    if (next2.m23799kk() == null || (!C14113y2.m67449x1(next2.m23799kk(), ".ttf", (short) 5) && !C14113y2.m67449x1(next2.m23799kk(), ".woff", (short) 5))) {
                                        if (next2.m23800x1() == null || (!C14113y2.m67449x1(next2.m23800x1(), ".ttf", (short) 5) && !C14113y2.m67449x1(next2.m23800x1(), ".woff", (short) 5))) {
                                        }
                                    }
                                    strM23800x1 = next2.m23800x1();
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                        it2.dispose();
                                    }
                                }
                            }
                            strM23800x1 = null;
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            if (strM23800x1 != null) {
                                C1847du c1847duM48738k4 = m48738k4(strM23800x1, next);
                                if (c1847duM48738k4.m9637x1() == null && c1847duM48738k4.m9634k4() != null) {
                                    byte[] bArrM9634k4 = c1847duM48738k4.m9634k4();
                                    if (C14113y2.m67449x1(strM23800x1, ".woff", (short) 5)) {
                                        C3152yj c3152yj = new C3152yj(bArrM9634k4);
                                        try {
                                            C3152yj c3152yj2 = new C3152yj();
                                            try {
                                                new C7039k4().m27558k4(c3152yj, c3152yj2);
                                                byte[] array = c3152yj2.toArray();
                                                c3152yj2.dispose();
                                                bArrM9634k4 = array;
                                            } catch (Throwable th) {
                                                c3152yj2.dispose();
                                                throw th;
                                            }
                                        } finally {
                                            c3152yj.dispose();
                                        }
                                    }
                                    C1868rv.m9778k4().m9784k4(c5904h4M23774k4.mo23764k4(), C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12187wp.class), c5904h4M23774k4.m23775kk()), m48737k4(c5904h4M23774k4.m23776to()), bArrM9634k4);
                                }
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th3) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48740k4(InterfaceC12777qq interfaceC12777qq, InterfaceC12777qq interfaceC12777qq2) {
        InterfaceC12777qq interfaceC12777qqMo22653ss = interfaceC12777qq.mo22653ss();
        if (interfaceC12777qqMo22653ss == null) {
            return;
        }
        C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) interfaceC12777qq, C1569kk.class);
        while (interfaceC12777qqMo22653ss != null) {
            if (interfaceC12777qqMo22653ss.mo22608fa() == 1 && ((C1569kk) interfaceC12777qqMo22653ss).m8445t6().m23853t6() == 2 && c1569kk != null && OooOo00.OooO0O0(c1569kk) == 14) {
                InterfaceC12777qq interfaceC12777qqMo22631g8 = interfaceC12777qqMo22653ss.mo22631g8();
                interfaceC12777qq2.mo22666x1(interfaceC12777qqMo22653ss, interfaceC12777qq2.mo22661wp());
                interfaceC12777qqMo22653ss = interfaceC12777qqMo22631g8;
            } else {
                m48740k4(interfaceC12777qqMo22653ss, interfaceC12777qq2);
                interfaceC12777qqMo22653ss = interfaceC12777qqMo22653ss.mo22631g8();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48741k4(InterfaceC12778rv interfaceC12778rv) {
        InterfaceC12760ar interfaceC12760arMo22773ck = interfaceC12778rv.mo22773ck("BODY");
        if (interfaceC12760arMo22773ck.mo20312k4() == 0) {
            return;
        }
        InterfaceC12777qq interfaceC12777qqMo20314k4 = interfaceC12760arMo22773ck.mo20314k4(0);
        m48740k4(interfaceC12777qqMo20314k4, interfaceC12777qqMo20314k4);
    }
}

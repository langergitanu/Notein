package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p057c6.C1977c5;
import com.aspose.slides.internal.p057c6.C1983k4;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p150gi.C4273fa;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p406ss.AbstractC10327ck;
import com.aspose.slides.internal.p406ss.C10336ks;
import com.aspose.slides.internal.p406ss.C10339qq;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p513xw.C12712m2;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.bv */
/* JADX INFO: loaded from: classes3.dex */
public class C1580bv extends C1594m9 {

    /* JADX INFO: renamed from: k4 */
    private C1608yd f6106k4 = null;

    /* JADX INFO: renamed from: x1 */
    private C1608yd f6109x1 = null;

    /* JADX INFO: renamed from: kk */
    private C1608yd f6107kk = null;

    /* JADX INFO: renamed from: to */
    private C1608yd f6108to = null;

    /* JADX INFO: renamed from: du */
    private C1608yd f6104du = null;

    /* JADX INFO: renamed from: dy */
    private IGenericDictionary<Object, Object> f6105dy = null;

    /* JADX INFO: renamed from: c5 */
    private boolean f6103c5 = false;

    public C1580bv() {
    }

    public final Object clone() {
        C1580bv c1580bv = (C1580bv) super.mo8601k4(new C1580bv());
        C1608yd c1608yd = this.f6106k4;
        if (c1608yd != null) {
            c1580bv.f6106k4 = (C1608yd) c1608yd.clone();
        }
        C1608yd c1608yd2 = this.f6109x1;
        if (c1608yd2 != null) {
            c1580bv.f6109x1 = (C1608yd) c1608yd2.clone();
        }
        C1608yd c1608yd3 = this.f6107kk;
        if (c1608yd3 != null) {
            c1580bv.f6107kk = (C1608yd) c1608yd3.clone();
        }
        C1608yd c1608yd4 = this.f6108to;
        if (c1608yd4 != null) {
            c1580bv.f6108to = (C1608yd) c1608yd4.clone();
        }
        C1608yd c1608yd5 = this.f6104du;
        if (c1608yd5 != null) {
            c1580bv.f6104du = (C1608yd) c1608yd5.clone();
        }
        return c1580bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1608yd m8495k4(int i) {
        switch (i) {
            case 56:
                return this.f6104du;
            case 57:
                return this.f6106k4;
            case 58:
                return this.f6107kk;
            case 59:
                return this.f6108to;
            case 60:
            default:
                throw new ArgumentException(C14113y2.m67408k4("No such area class with ID = ", C14057f9.m66591x1(i)));
            case 61:
                return this.f6109x1;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m8499x1() {
        if (this.f6103c5) {
            return false;
        }
        C1608yd c1608yd = this.f6107kk;
        if (c1608yd == null) {
            return true;
        }
        return ((C1586fa) c1608yd.m8684u4()).m8564ar();
    }

    public C1580bv(C10339qq c10339qq) {
        C1983k4 c1983k4 = new C1983k4(c10339qq.m50386qm().mo9884to(), c10339qq.m50382g8().mo9884to());
        C4273fa c4273faM50381e0 = c10339qq.m50381e0();
        C1977c5 c1977c5 = new C1977c5(null, 5, c1983k4.f6947k4);
        C1977c5 c1977c52 = new C1977c5(null, 5, c1983k4.f6948x1);
        C12007ix c12007ix = new C12007ix(c4273faM50381e0.f11653kk.mo9886x1(c1977c5), c4273faM50381e0.f11652k4.mo9886x1(c1977c52), (c1983k4.f6947k4 - c4273faM50381e0.f11653kk.mo9886x1(c1977c5)) - c4273faM50381e0.f11655to.mo9886x1(c1977c5), (c1983k4.f6948x1 - c4273faM50381e0.f11652k4.mo9886x1(c1977c52)) - c4273faM50381e0.f11656x1.mo9886x1(c1977c52));
        C1983k4 c1983k42 = new C1983k4(0, 0);
        C1609yj c1609yjM8688k4 = C1609yj.m8688k4(c10339qq.m50387sv(), c10339qq.m50389wp(), c12007ix.Clone(), c1983k42);
        Dictionary.ValueCollection.Enumerator<String, AbstractC10327ck> it = c10339qq.m50388ts().getValues().iterator();
        while (it.hasNext()) {
            try {
                AbstractC10327ck next = it.next();
                C1608yd c1608ydM8493k4 = m8493k4(next, c1983k42, c1609yjM8688k4);
                C1593lr c1586fa = next.mo14084ix() == 58 ? new C1586fa((C10336ks) next, c1608ydM8493k4) : new C1593lr(next, c1608ydM8493k4);
                C12712m2.m59042k4((C1606x1) c1586fa, next.m50338e0(), false, false, false, false, (InterfaceC1981h4) null);
                C12712m2.m59052x1(c1586fa, next.m50338e0(), false, false, false, false, null);
                m8494k4(c1586fa, next, c1608ydM8493k4.m8686wl().Clone());
                c1608ydM8493k4.m8683k4(c1586fa);
                m8497k4(next.mo14084ix(), c1608ydM8493k4);
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
    }

    /* JADX INFO: renamed from: k4 */
    private static C1608yd m8493k4(AbstractC10327ck abstractC10327ck, C1983k4 c1983k4, C1609yj c1609yj) {
        C12007ix c12007ixClone = abstractC10327ck.mo50341k4(c1983k4).Clone();
        C1608yd c1608yd = new C1608yd(c1609yj.m8692k4(c12007ixClone.Clone()).Clone().Clone());
        c1608yd.m8670kk(C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1()), 13));
        c1608yd.m8679x1(C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5()), 13));
        C12712m2.m59037k4(c1608yd, abstractC10327ck.m50338e0(), (InterfaceC1981h4) null);
        c1608yd.m8687x1(abstractC10327ck.m50343qm() == 57 || abstractC10327ck.m50343qm() == 42);
        return c1608yd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8496k4() {
        this.f6103c5 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8497k4(int i, C1608yd c1608yd) {
        if (i == 57) {
            this.f6106k4 = c1608yd;
            return;
        }
        if (i == 61) {
            this.f6109x1 = c1608yd;
            return;
        }
        if (i == 58) {
            this.f6107kk = c1608yd;
        } else if (i == 59) {
            this.f6108to = c1608yd;
        } else if (i == 56) {
            this.f6104du = c1608yd;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8498k4(InterfaceC1380to interfaceC1380to) {
        C1608yd c1608yd = this.f6106k4;
        if (c1608yd != null) {
            c1608yd.mo8475k4(interfaceC1380to);
        }
        C1608yd c1608yd2 = this.f6109x1;
        if (c1608yd2 != null) {
            c1608yd2.mo8475k4(interfaceC1380to);
        }
        C1608yd c1608yd3 = this.f6107kk;
        if (c1608yd3 != null) {
            c1608yd3.mo8475k4(interfaceC1380to);
        }
        C1608yd c1608yd4 = this.f6108to;
        if (c1608yd4 != null) {
            c1608yd4.mo8475k4(interfaceC1380to);
        }
        C1608yd c1608yd5 = this.f6104du;
        if (c1608yd5 != null) {
            c1608yd5.mo8475k4(interfaceC1380to);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8494k4(C1593lr c1593lr, AbstractC10327ck abstractC10327ck, C12007ix c12007ix) {
        C1983k4 c1983k4 = new C1983k4(0, 0);
        c1593lr.m8595k4(C1609yj.m8688k4(abstractC10327ck.m50344sv(), abstractC10327ck.m50346wp(), c12007ix.Clone(), c1983k4));
        c1593lr.m8679x1((c1983k4.f6947k4 - c1593lr.m8660fa()) - c1593lr.m8677up());
        c1593lr.m8670kk((c1983k4.f6948x1 - c1593lr.m8656dy()) - c1593lr.m8653ck());
    }
}

package com.aspose.slides.internal.p253lm;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C6184ts implements InterfaceC6132em, InterfaceC6166os {

    /* JADX INFO: renamed from: c5 */
    private AbstractC6178sq f17465c5;

    /* JADX INFO: renamed from: kk */
    protected AbstractC6123ca f17473kk;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC6173qw f17474m9;

    /* JADX INFO: renamed from: to */
    protected int f17475to;

    /* JADX INFO: renamed from: x1 */
    protected boolean f17477x1;

    /* JADX INFO: renamed from: yj */
    private Stack<String> f17478yj;

    /* JADX INFO: renamed from: jd */
    private C6765kp f17471jd = new C6765kp();

    /* JADX INFO: renamed from: ck */
    private String f17466ck = C14113y2.f47374k4;

    /* JADX INFO: renamed from: fa */
    private C6175rq f17469fa = new C6175rq();

    /* JADX INFO: renamed from: up */
    private com.aspose.slides.Collections.Stack f17476up = new com.aspose.slides.Collections.Stack();

    /* JADX INFO: renamed from: k4 */
    protected Stack<C6202x3> f17472k4 = new Stack<>();

    /* JADX INFO: renamed from: du */
    protected C6112ar f17467du = null;

    /* JADX INFO: renamed from: h4 */
    protected C6176rv f17470h4 = null;

    /* JADX INFO: renamed from: dy */
    private C6202x3 f17468dy = new C6202x3((AbstractC6211yd) C7019kk.m27452k4((Object) mo10078to(), C6116bs.class));

    public C6184ts(int i) {
        this.f17474m9 = new C6177s7(this, i);
        m25059k4(m25049du());
        m25056k4(new Stack<>());
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6132em
    /* JADX INFO: renamed from: c5 */
    public final AbstractC6123ca mo10039c5() {
        return this.f17469fa.f17421x1;
    }

    /* JADX INFO: renamed from: du */
    public final C6202x3 m25049du() {
        return this.f17468dy;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC6211yd m25050dy() {
        return this.f17469fa.f17420k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC6178sq m25051h4() {
        return this.f17465c5;
    }

    /* JADX INFO: renamed from: jd */
    public final C6202x3 m25052jd() {
        return this.f17472k4.peek();
    }

    /* JADX INFO: renamed from: k4 */
    public final Stack<String> m25053k4() {
        return this.f17478yj;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m25064kk() {
        return (!this.f17477x1 && this.f17470h4 == null && this.f17467du == null) ? false : true;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6132em
    /* JADX INFO: renamed from: m9 */
    public final AbstractC6123ca mo10077m9() {
        return this.f17473kk;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6132em
    /* JADX INFO: renamed from: to */
    public final InterfaceC6173qw mo10078to() {
        return this.f17474m9;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6132em
    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca mo10079x1(AbstractC6123ca abstractC6123ca) {
        this.f17473kk = abstractC6123ca;
        return abstractC6123ca;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m25048kk(AbstractC6123ca abstractC6123ca) {
        return abstractC6123ca == C6163nh.f17403k4 || abstractC6123ca == C6185u1.f17479k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C6189up m25054k4(AbstractC6123ca abstractC6123ca, AbstractC6123ca abstractC6123ca2) {
        if (C14113y2.m67363du(abstractC6123ca.mo24770dy(), abstractC6123ca2.mo24770dy())) {
            if (abstractC6123ca != C6163nh.f17403k4 && abstractC6123ca != C6185u1.f17479k4) {
                if ("number".equals(abstractC6123ca.mo24770dy())) {
                    if (abstractC6123ca.mo24775x1() != Double.NaN && abstractC6123ca2.mo24775x1() != Double.NaN && abstractC6123ca.mo24775x1() == abstractC6123ca2.mo24775x1()) {
                        return mo10078to().mo24972ks().m25188jd();
                    }
                    return mo10078to().mo24972ks().m25187c5();
                }
                if ("string".equals(abstractC6123ca.mo24770dy())) {
                    return mo10078to().mo24972ks().m25189k4(C14113y2.m67363du(abstractC6123ca.toString(), abstractC6123ca2.toString()));
                }
                if ("boolean".equals(abstractC6123ca.mo24770dy())) {
                    return mo10078to().mo24972ks().m25189k4(abstractC6123ca.mo24772k4() == abstractC6123ca2.mo24772k4());
                }
                if ("object".equals(abstractC6123ca.mo24770dy())) {
                    return mo10078to().mo24972ks().m25189k4(abstractC6123ca == abstractC6123ca2);
                }
                return mo10078to().mo24972ks().m25189k4(abstractC6123ca.mo24769C_().equals(abstractC6123ca2.mo24769C_()));
            }
            return mo10078to().mo24972ks().m25188jd();
        }
        C6185u1 c6185u1 = C6185u1.f17479k4;
        if (abstractC6123ca == c6185u1 && abstractC6123ca2 == C6163nh.f17403k4) {
            return mo10078to().mo24972ks().m25188jd();
        }
        if (abstractC6123ca == C6163nh.f17403k4 && abstractC6123ca2 == c6185u1) {
            return mo10078to().mo24972ks().m25188jd();
        }
        if ("number".equals(abstractC6123ca.mo24770dy()) && "string".equals(abstractC6123ca2.mo24770dy())) {
            return mo10078to().mo24972ks().m25189k4(abstractC6123ca.mo24775x1() == abstractC6123ca2.mo24775x1());
        }
        if ("string".equals(abstractC6123ca.mo24770dy()) && "number".equals(abstractC6123ca2.mo24770dy())) {
            return mo10078to().mo24972ks().m25189k4(abstractC6123ca.mo24775x1() == abstractC6123ca2.mo24775x1());
        }
        if ("boolean".equals(abstractC6123ca.mo24770dy()) || "boolean".equals(abstractC6123ca2.mo24770dy())) {
            return mo10078to().mo24972ks().m25189k4(abstractC6123ca.mo24775x1() == abstractC6123ca2.mo24775x1());
        }
        return ("object".equals(abstractC6123ca2.mo24770dy()) && ("string".equals(abstractC6123ca.mo24770dy()) || "number".equals(abstractC6123ca.mo24770dy()))) ? m25054k4(abstractC6123ca, abstractC6123ca2.mo24776x1(mo10078to())) : ("object".equals(abstractC6123ca.mo24770dy()) && ("string".equals(abstractC6123ca2.mo24770dy()) || "number".equals(abstractC6123ca2.mo24770dy()))) ? m25054k4(abstractC6123ca.mo24776x1(mo10078to()), abstractC6123ca2) : mo10078to().mo24972ks().m25187c5();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25065x1() {
        this.f17472k4.pop();
    }

    /* JADX INFO: renamed from: k4 */
    public final C6198wp m25055k4(InterfaceC6192vh interfaceC6192vh) {
        C6198wp c6198wpM25013jd = mo10078to().mo24978up().m25013jd();
        c6198wpM25013jd.m25134k4(interfaceC6192vh.mo24841kk());
        c6198wpM25013jd.m25137m9(interfaceC6192vh.mo24838k4());
        c6198wpM25013jd.m25135k4(m25052jd());
        c6198wpM25013jd.m25132k4((IGenericList<String>) interfaceC6192vh.mo24842x1());
        if (m25046k4(1)) {
            IGenericEnumerator<String> it = c6198wpM25013jd.m25141yj().iterator();
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    if ("eval".equals(next) || "arguments".equals(next)) {
                        throw new C6158m4(mo10078to().mo24980v4().m25068h4("The parameters do not respect strict mode"));
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
                return c6198wpM25013jd;
            }
        }
        return c6198wpM25013jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25056k4(Stack<String> stack) {
        this.f17478yj = stack;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10040k4(C6109af c6109af) {
        this.f17473kk = null;
        if (c6109af.m24747k4() != null) {
            c6109af.m24747k4().mo24749k4(this);
            mo10079x1(mo10039c5());
        }
        this.f17477x1 = true;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10041k4(C6110ai c6110ai) {
        AbstractC6178sq abstractC6178sqM24753kk;
        c6110ai.m24750k4().mo24749k4(this);
        m25062k4((Object) mo10039c5());
        if (mo10039c5().mo24772k4()) {
            abstractC6178sqM24753kk = c6110ai.m24754x1();
        } else if (c6110ai.m24753kk() == null) {
            return;
        } else {
            abstractC6178sqM24753kk = c6110ai.m24753kk();
        }
        abstractC6178sqM24753kk.mo24749k4(this);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10042k4(C6111ak c6111ak) {
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10043k4(C6112ar c6112ar) {
        this.f17467du = c6112ar;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10044k4(C6113av c6113av) {
        mo10048k4((AbstractC6123ca) null);
        c6113av.m24756k4().mo24749k4(this);
        AbstractC6123ca abstractC6123caMo10039c5 = mo10039c5();
        mo10048k4((AbstractC6123ca) null);
        m25062k4((Object) abstractC6123caMo10039c5);
        (abstractC6123caMo10039c5.mo24772k4() ? c6113av.m24758x1() : c6113av.m24757kk()).mo24749k4(this);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10045k4(C6117bu c6117bu) {
        int iM24778x1 = c6117bu.m24778x1();
        if (iM24778x1 == 0) {
            c6117bu.m24777k4().mo24749k4(this);
            if (mo10039c5() == null) {
                mo10048k4((AbstractC6123ca) mo10078to().mo24980v4().m25068h4(C6163nh.f17403k4.mo24770dy()));
                return;
            }
            if (C7019kk.m27469x1(mo10039c5(), C6185u1.class)) {
                mo10048k4((AbstractC6123ca) mo10078to().mo24980v4().m25068h4("object"));
                return;
            } else if (C7019kk.m27469x1(mo10039c5(), C6198wp.class)) {
                mo10048k4((AbstractC6123ca) mo10078to().mo24980v4().m25068h4("function"));
                return;
            } else {
                mo10048k4((AbstractC6123ca) mo10078to().mo24980v4().m25068h4(mo10039c5().mo24770dy()));
                return;
            }
        }
        switch (iM24778x1) {
            case 2:
                c6117bu.m24777k4().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                mo10048k4((AbstractC6123ca) mo10078to().mo24972ks().m25189k4(!mo10039c5().mo24772k4()));
                return;
            case 3:
                c6117bu.m24777k4().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                mo10048k4((AbstractC6123ca) mo10078to().mo24977um().m25186k4(-mo10039c5().mo24775x1()));
                return;
            case 4:
                c6117bu.m24777k4().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                mo10048k4((AbstractC6123ca) mo10078to().mo24977um().m25186k4(mo10039c5().mo24775x1()));
                return;
            case 5:
                c6117bu.m24777k4().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                m25060k4(C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class) != null ? (C6203x5) C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class) : new C6203x5(c6117bu.m24777k4(), null), mo10078to().mo24977um().m25186k4(mo10039c5().mo24775x1() + 1.0d));
                return;
            case 6:
                c6117bu.m24777k4().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                m25060k4(C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class) != null ? (C6203x5) C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class) : new C6203x5(c6117bu.m24777k4(), null), mo10078to().mo24977um().m25186k4(mo10039c5().mo24775x1() - 1.0d));
                return;
            case 7:
                c6117bu.m24777k4().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                AbstractC6123ca abstractC6123caMo10039c5 = mo10039c5();
                m25060k4(C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class) != null ? (C6203x5) C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class) : new C6203x5(c6117bu.m24777k4(), null), mo10078to().mo24977um().m25186k4(abstractC6123caMo10039c5.mo24775x1() + 1.0d));
                mo10048k4(abstractC6123caMo10039c5);
                return;
            case 8:
                c6117bu.m24777k4().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                AbstractC6123ca abstractC6123caMo10039c52 = mo10039c5();
                m25060k4(C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class) != null ? (C6203x5) C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class) : new C6203x5(c6117bu.m24777k4(), null), mo10078to().mo24977um().m25186k4(abstractC6123caMo10039c52.mo24775x1() - 1.0d));
                mo10048k4(abstractC6123caMo10039c52);
                return;
            case 9:
                C6203x5 c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6117bu.m24777k4(), C6203x5.class);
                if (c6203x5 == null) {
                    throw new NotImplementedException(RequestParameters.SUBRESOURCE_DELETE);
                }
                c6203x5.m25158x1().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                AbstractC6123ca abstractC6123caMo10039c53 = mo10039c5();
                String strM25201k4 = C7019kk.m27469x1(c6203x5.m25156k4(), C6125d4.class) ? ((C6125d4) c6203x5.m25156k4()).m25201k4() : null;
                if (C7019kk.m27469x1(c6203x5.m25156k4(), C6174ri.class)) {
                    ((C6174ri) c6203x5.m25156k4()).m24984k4().mo24749k4(this);
                    strM25201k4 = mo10039c5().toString();
                }
                if (C14113y2.m67411k4(strM25201k4)) {
                    throw new C6158m4(mo10078to().mo24981wl().m25166jd());
                }
                try {
                    ((AbstractC6211yd) abstractC6123caMo10039c53).mo25041x1(strM25201k4);
                    ((AbstractC6211yd) abstractC6123caMo10039c53).mo25041x1(strM25201k4);
                    mo10048k4(abstractC6123caMo10039c53);
                    return;
                } catch (C6208y2 unused) {
                    throw new C6158m4(mo10078to().mo24981wl().m25166jd());
                }
            case 10:
                c6117bu.m24777k4().mo24749k4(this);
                mo10048k4((AbstractC6123ca) C6163nh.f17403k4);
                return;
            case 11:
                c6117bu.m24777k4().mo24749k4(this);
                m25062k4((Object) mo10039c5());
                mo10048k4((AbstractC6123ca) mo10078to().mo24977um().m25186k4((0.0d - mo10039c5().mo24775x1()) - 1.0d));
                return;
            default:
                return;
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10046k4(C6119bz c6119bz) {
        c6119bz.m24781k4().mo24749k4(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10047k4(C6121c5 c6121c5) {
        C6147jd c6147jd;
        C6203x5 c6203x5;
        switch (c6121c5.m24785kk()) {
            case 0:
                c6121c5.m24786x1().mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c5 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                    c6203x5 = new C6203x5(c6121c5.m24782k4(), null);
                }
                m25060k4(c6203x5, abstractC6123caMo10039c5);
                mo10048k4(abstractC6123caMo10039c5);
                return;
            case 1:
                c6147jd = new C6147jd(12, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c52 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c52);
                mo10048k4(abstractC6123caMo10039c52);
                return;
            case 2:
                c6147jd = new C6147jd(11, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c522 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c522);
                mo10048k4(abstractC6123caMo10039c522);
                return;
            case 3:
                c6147jd = new C6147jd(10, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c5222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c5222);
                mo10048k4(abstractC6123caMo10039c5222);
                return;
            case 4:
                c6147jd = new C6147jd(9, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c52222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c52222);
                mo10048k4(abstractC6123caMo10039c52222);
                return;
            case 5:
                c6147jd = new C6147jd(8, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c522222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c522222);
                mo10048k4(abstractC6123caMo10039c522222);
                return;
            case 6:
                c6147jd = new C6147jd(19, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c5222222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c5222222);
                mo10048k4(abstractC6123caMo10039c5222222);
                return;
            case 7:
                c6147jd = new C6147jd(20, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c52222222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c52222222);
                mo10048k4(abstractC6123caMo10039c52222222);
                return;
            case 8:
                c6147jd = new C6147jd(21, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c522222222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c522222222);
                mo10048k4(abstractC6123caMo10039c522222222);
                return;
            case 9:
                c6147jd = new C6147jd(14, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c5222222222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c5222222222);
                mo10048k4(abstractC6123caMo10039c5222222222);
                return;
            case 10:
                c6147jd = new C6147jd(15, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c52222222222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c52222222222);
                mo10048k4(abstractC6123caMo10039c52222222222);
                return;
            case 11:
                c6147jd = new C6147jd(16, c6121c5.m24782k4(), c6121c5.m24786x1());
                c6147jd.mo24749k4(this);
                AbstractC6123ca abstractC6123caMo10039c522222222222 = mo10039c5();
                c6203x5 = (C6203x5) C7019kk.m27452k4((Object) c6121c5.m24782k4(), C6203x5.class);
                if (c6203x5 == null) {
                }
                m25060k4(c6203x5, abstractC6123caMo10039c522222222222);
                mo10048k4(abstractC6123caMo10039c522222222222);
                return;
            default:
                throw new NotSupportedException();
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6132em
    /* JADX INFO: renamed from: k4 */
    public final void mo10048k4(AbstractC6123ca abstractC6123ca) {
        C6175rq c6175rq = this.f17469fa;
        c6175rq.f17421x1 = abstractC6123ca;
        c6175rq.f17420k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25057k4(AbstractC6123ca abstractC6123ca, AbstractC6211yd abstractC6211yd) {
        C6175rq c6175rq = this.f17469fa;
        c6175rq.f17421x1 = abstractC6123ca;
        c6175rq.f17420k4 = abstractC6211yd;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10049k4(C6125d4 c6125d4) {
        AbstractC6211yd abstractC6211yd = (AbstractC6211yd) C7019kk.m27452k4((Object) mo10039c5(), AbstractC6211yd.class);
        mo10048k4((AbstractC6123ca) null);
        String strM25201k4 = c6125d4.m25201k4();
        this.f17466ck = strM25201k4;
        AbstractC6123ca[] abstractC6123caArr = {null};
        boolean z = abstractC6211yd != null && abstractC6211yd.mo25038k4(strM25201k4, abstractC6123caArr);
        AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
        if (z) {
            m25057k4(abstractC6123ca, abstractC6211yd);
            return;
        }
        if (mo10039c5() == null && this.f17471jd.m26807x1() > 0) {
            this.f17471jd.m26780k4(FilenameUtils.EXTENSION_SEPARATOR).m26792k4(strM25201k4);
        }
        m25057k4((AbstractC6123ca) C6163nh.f17403k4, abstractC6211yd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10050k4(C6127dl c6127dl) {
        AbstractC6123ca abstractC6123caM25189k4;
        int iM24806x1 = c6127dl.m24806x1();
        if (iM24806x1 == 3) {
            abstractC6123caM25189k4 = mo10078to().mo24972ks().m25189k4(((Boolean) C7019kk.m27464to(c6127dl.m24805k4(), Boolean.TYPE)).booleanValue());
        } else if (iM24806x1 == 9) {
            abstractC6123caM25189k4 = mo10078to().mo24977um().m25186k4(C14080ne.m66903fa(c6127dl.m24805k4()));
        } else if (iM24806x1 == 18) {
            abstractC6123caM25189k4 = mo10078to().mo24980v4().m25068h4((String) c6127dl.m24805k4());
        } else if (iM24806x1 != 13 && iM24806x1 != 14) {
            abstractC6123caM25189k4 = (AbstractC6123ca) C7019kk.m27452k4(c6127dl.m24805k4(), AbstractC6123ca.class);
        }
        mo10048k4(abstractC6123caM25189k4);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10051k4(C6133f7 c6133f7) {
        C6163nh c6163nh = C6163nh.f17403k4;
        mo10048k4((AbstractC6123ca) c6163nh);
        if (c6133f7.m24816kk() == null) {
            if (m25052jd().mo25039kk(c6133f7.m24817x1())) {
                return;
            }
            m25052jd().m25180x1(c6133f7.m24817x1(), c6163nh);
            return;
        }
        c6133f7.m24816kk().mo24749k4(this);
        if (c6133f7.m24815k4()) {
            throw new InvalidOperationException("Cant declare a global variable");
        }
        if (m25052jd().mo25039kk(c6133f7.m24817x1())) {
            m25052jd().mo25037k4(c6133f7.m24817x1(), mo10039c5());
        } else {
            m25052jd().m25180x1(c6133f7.m24817x1(), mo10039c5());
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10052k4(C6135fa c6135fa) {
        boolean zM27456k4;
        AbstractC6178sq abstractC6178sqM25051h4 = m25051h4();
        IGenericEnumerator<Object> it = c6135fa.m24831k4().iterator();
        while (it.hasNext()) {
            try {
                C6210y9 c6210y9 = (C6210y9) it.next();
                AbstractC6178sq abstractC6178sq = (AbstractC6178sq) c6210y9.m25167k4();
                m25058k4((AbstractC6178sq) c6210y9.m25167k4());
                mo10048k4((AbstractC6123ca) null);
                abstractC6178sq.mo24749k4(this);
                if (m25064kk()) {
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
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
        m25058k4(abstractC6178sqM25051h4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10053k4(C6136g8 c6136g8) {
        String strM25201k4;
        IGenericEnumerator it;
        boolean zM27456k4;
        String str = C14113y2.f47374k4;
        if (C7019kk.m27469x1(c6136g8.m24832k4(), C6133f7.class)) {
            ((C6133f7) c6136g8.m24832k4()).m24815k4();
            strM25201k4 = ((C6133f7) c6136g8.m24832k4()).m24817x1();
        } else {
            if (!C7019kk.m27469x1(c6136g8.m24832k4(), C6217zj.class)) {
                throw new NotSupportedException("Only variable declaration are allowed in a for in loop");
            }
            strM25201k4 = ((C6217zj) c6136g8.m24832k4()).m25201k4();
        }
        c6136g8.m24836x1().mo24749k4(this);
        AbstractC6211yd abstractC6211yd = (AbstractC6211yd) C7019kk.m27452k4((Object) mo10039c5(), AbstractC6211yd.class);
        if (C7019kk.m27469x1(mo10039c5().mo24769C_(), IEnumerable.class)) {
            it = ((IGenericEnumerable) mo10039c5().mo24769C_()).iterator();
            while (it.hasNext()) {
                try {
                    m25052jd().mo25037k4(strM25201k4, (AbstractC6123ca) it.next());
                    c6136g8.m24835kk().mo24749k4(this);
                    m25063k4(c6136g8.m25011h4());
                    if (m25064kk()) {
                        if (this.f17470h4 != null && C14113y2.m67363du(c6136g8.m25011h4(), this.f17470h4.m25011h4())) {
                            this.f17470h4 = null;
                        }
                        if (zM27456k4) {
                            return;
                        } else {
                            return;
                        }
                    }
                    m25063k4(c6136g8.m25011h4());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
                return;
            }
            return;
        }
        if (abstractC6211yd == null) {
            throw new InvalidOperationException("The property can't be enumerated");
        }
        List list = new List(abstractC6211yd.mo24948kk());
        it = abstractC6211yd.mo25028du().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        list.sort();
        for (int i = 0; i < list.size(); i++) {
            m25052jd().mo25037k4(strM25201k4, mo10078to().mo24980v4().m25068h4((String) list.get_Item(i)));
            c6136g8.m24835kk().mo24749k4(this);
            m25063k4(c6136g8.m25011h4());
            if (m25064kk()) {
                if (this.f17470h4 == null || !C14113y2.m67363du(c6136g8.m25011h4(), this.f17470h4.m25011h4())) {
                    return;
                }
                this.f17470h4 = null;
                return;
            }
            m25063k4(c6136g8.m25011h4());
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10054k4(C6138gi c6138gi) {
        mo10048k4((AbstractC6123ca) m25055k4((InterfaceC6192vh) c6138gi));
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10055k4(C6140h4 c6140h4) {
        C6182to c6182toM24811m9 = mo10078to().mo24983yj().m24811m9();
        AbstractC6123ca[] abstractC6123caArr = new AbstractC6123ca[c6140h4.m24843k4().size()];
        for (int i = 0; i < c6140h4.m24843k4().size(); i++) {
            c6140h4.m24843k4().get_Item(i).mo24749k4(this);
            c6182toM24811m9.mo25037k4(C14057f9.m66591x1(i), mo10039c5());
        }
        mo10048k4((AbstractC6123ca) c6182toM24811m9);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10056k4(C6143ii c6143ii) {
        C6198wp c6198wp;
        AbstractC6211yd abstractC6211yd = (AbstractC6211yd) C7019kk.m27452k4((Object) mo10039c5(), AbstractC6211yd.class);
        int iM24852kk = c6143ii.m24852kk();
        if (iM24852kk == 0) {
            c6143ii.m24854x1().mo24749k4(this);
            abstractC6211yd.mo25036k4((AbstractC6155lr) new C6165o9(abstractC6211yd, c6143ii.m24847k4(), mo10039c5()));
            return;
        }
        if (iM24852kk == 1 || iM24852kk == 2) {
            C6198wp c6198wp2 = null;
            if (c6143ii.m24853to() != null) {
                c6143ii.m24853to().mo24749k4(this);
                c6198wp = (C6198wp) mo10039c5();
            } else {
                c6198wp = null;
            }
            if (c6143ii.m24846du() != null) {
                c6143ii.m24846du().mo24749k4(this);
                c6198wp2 = (C6198wp) mo10039c5();
            }
            C6126dc c6126dc = new C6126dc(mo10078to(), abstractC6211yd, c6143ii.m24847k4());
            c6126dc.m24801k4(c6198wp);
            c6126dc.m24804x1(c6198wp2);
            c6126dc.m24911k4(true);
            abstractC6211yd.mo25036k4((AbstractC6155lr) c6126dc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02bb, code lost:
    
        if (r1 == r14) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (r1 == r14) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012c, code lost:
    
        r14 = mo10078to().mo24977um();
        r0 = com.aspose.slides.p559ms.System.C14080ne.m66843c5(java.lang.Double.valueOf(r0.mo24775x1())) >> (com.aspose.slides.p559ms.System.C14080ne.m66913h4(java.lang.Double.valueOf(r1.mo24775x1())) & 65535);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0155, code lost:
    
        if (r1 == r14) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0217, code lost:
    
        if (r0.mo24775x1() == r1.mo24775x1()) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0272, code lost:
    
        if (r1 == r14) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0274, code lost:
    
        r14 = mo10078to().mo24977um();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0282, code lost:
    
        r14 = mo10078to().mo24977um();
        r0 = r1.mo24775x1();
     */
    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10057k4(C6147jd c6147jd) {
        C6213yj c6213yjMo24972ks;
        boolean zMo24772k4;
        AbstractC6123ca abstractC6123caM25054k4;
        C6212yg c6212ygMo24977um;
        double dMo24775x1;
        C6212yg c6212ygMo24977um2;
        double dMo24775x12;
        long jM66843c5;
        C6213yj c6213yjMo24972ks2;
        boolean zM67363du;
        c6147jd.m24861k4().mo24749k4(this);
        m25062k4((Object) mo10039c5());
        AbstractC6123ca abstractC6123caMo10039c5 = mo10039c5();
        if (c6147jd.m24862kk() == 0 && !abstractC6123caMo10039c5.mo24772k4()) {
            mo10048k4(abstractC6123caMo10039c5);
            return;
        }
        if (c6147jd.m24862kk() == 1 && abstractC6123caMo10039c5.mo24772k4()) {
            mo10048k4(abstractC6123caMo10039c5);
            return;
        }
        c6147jd.m24863x1().mo24749k4(this);
        m25062k4((Object) mo10039c5());
        AbstractC6123ca abstractC6123caMo10039c52 = mo10039c5();
        double d = 1.0d;
        switch (c6147jd.m24862kk()) {
            case 0:
                if (abstractC6123caMo10039c5.mo24772k4()) {
                    mo10048k4(abstractC6123caMo10039c52);
                    return;
                }
                c6213yjMo24972ks2 = mo10078to().mo24972ks();
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 1:
                if (abstractC6123caMo10039c5.mo24772k4()) {
                    mo10048k4(abstractC6123caMo10039c5);
                    return;
                } else {
                    mo10048k4(abstractC6123caMo10039c52);
                    return;
                }
            case 2:
                c6213yjMo24972ks = mo10078to().mo24972ks();
                zMo24772k4 = m25054k4(abstractC6123caMo10039c5, abstractC6123caMo10039c52).mo24772k4();
                zM67363du = !zMo24772k4;
                abstractC6123caM25054k4 = c6213yjMo24972ks.m25189k4(zM67363du);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 3:
                int[] iArr = {0};
                mo10048k4((AbstractC6123ca) ((!m25047k4(abstractC6123caMo10039c5, abstractC6123caMo10039c52, iArr) || iArr[0] > 0) ? mo10078to().mo24972ks().m25187c5() : mo10078to().mo24972ks().m25188jd()));
                return;
            case 4:
                int[] iArr2 = {0};
                mo10048k4((AbstractC6123ca) ((!m25047k4(abstractC6123caMo10039c5, abstractC6123caMo10039c52, iArr2) || iArr2[0] < 0) ? mo10078to().mo24972ks().m25187c5() : mo10078to().mo24972ks().m25188jd()));
                return;
            case 5:
                int[] iArr3 = {0};
                mo10048k4((AbstractC6123ca) ((!m25047k4(abstractC6123caMo10039c5, abstractC6123caMo10039c52, iArr3) || iArr3[0] >= 0) ? mo10078to().mo24972ks().m25187c5() : mo10078to().mo24972ks().m25188jd()));
                return;
            case 6:
                int[] iArr4 = {0};
                mo10048k4((AbstractC6123ca) ((!m25047k4(abstractC6123caMo10039c5, abstractC6123caMo10039c52, iArr4) || iArr4[0] <= 0) ? mo10078to().mo24972ks().m25187c5() : mo10078to().mo24972ks().m25188jd()));
                return;
            case 7:
                abstractC6123caM25054k4 = m25054k4(abstractC6123caMo10039c5, abstractC6123caMo10039c52);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 8:
                c6212ygMo24977um = mo10078to().mo24977um();
                dMo24775x1 = abstractC6123caMo10039c5.mo24775x1() - abstractC6123caMo10039c52.mo24775x1();
                abstractC6123caM25054k4 = c6212ygMo24977um.m25186k4(dMo24775x1);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 9:
                if ("String".equals(abstractC6123caMo10039c5.mo24774to()) || "String".equals(abstractC6123caMo10039c52.mo24774to())) {
                    abstractC6123caM25054k4 = mo10078to().mo24980v4().m25068h4(C14113y2.m67408k4(abstractC6123caMo10039c5.toString(), abstractC6123caMo10039c52.toString()));
                    mo10048k4(abstractC6123caM25054k4);
                    return;
                } else {
                    c6212ygMo24977um2 = mo10078to().mo24977um();
                    dMo24775x12 = abstractC6123caMo10039c52.mo24775x1() + abstractC6123caMo10039c5.mo24775x1();
                    abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                    mo10048k4(abstractC6123caM25054k4);
                    return;
                }
            case 10:
                if (abstractC6123caMo10039c52 == mo10078to().mo24977um().mo25032k4("NEGATIVE_INFINITY") || abstractC6123caMo10039c52 == mo10078to().mo24977um().mo25032k4("POSITIVE_INFINITY")) {
                    abstractC6123caM25054k4 = mo10078to().mo24977um().mo25032k4("POSITIVE_INFINITY");
                } else if (abstractC6123caMo10039c52.mo24775x1() == 0.0d) {
                    abstractC6123caM25054k4 = mo10078to().mo24977um().mo25032k4("NaN");
                } else {
                    c6212ygMo24977um = mo10078to().mo24977um();
                    dMo24775x1 = abstractC6123caMo10039c5.mo24775x1() % abstractC6123caMo10039c52.mo24775x1();
                    abstractC6123caM25054k4 = c6212ygMo24977um.m25186k4(dMo24775x1);
                }
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 11:
                double dMo24775x13 = abstractC6123caMo10039c52.mo24775x1();
                double dMo24775x14 = abstractC6123caMo10039c5.mo24775x1();
                if (abstractC6123caMo10039c52 != mo10078to().mo24977um().mo25032k4("NEGATIVE_INFINITY") && abstractC6123caMo10039c52 != mo10078to().mo24977um().mo25032k4("POSITIVE_INFINITY")) {
                    if (dMo24775x13 == 0.0d) {
                        mo10048k4(dMo24775x14 > 0.0d ? mo10078to().mo24977um().mo25032k4("POSITIVE_INFINITY") : mo10078to().mo24977um().mo25032k4("NEGATIVE_INFINITY"));
                        return;
                    }
                    C6212yg c6212ygMo24977um3 = mo10078to().mo24977um();
                    d = dMo24775x14 / dMo24775x13;
                    abstractC6123caM25054k4 = c6212ygMo24977um3.m25186k4(d);
                    mo10048k4(abstractC6123caM25054k4);
                    return;
                }
                abstractC6123caM25054k4 = mo10078to().mo24977um().m25186k4(0.0d);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 12:
                c6212ygMo24977um2 = mo10078to().mo24977um();
                dMo24775x12 = abstractC6123caMo10039c52.mo24775x1() * abstractC6123caMo10039c5.mo24775x1();
                abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 13:
                c6212ygMo24977um2 = mo10078to().mo24977um();
                dMo24775x12 = C14116yg.m67469du(abstractC6123caMo10039c5.mo24775x1(), abstractC6123caMo10039c52.mo24775x1());
                abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 14:
                C6163nh c6163nh = C6163nh.f17403k4;
                if (abstractC6123caMo10039c5 != c6163nh && abstractC6123caMo10039c52 != c6163nh) {
                    c6212ygMo24977um2 = mo10078to().mo24977um();
                    jM66843c5 = C14080ne.m66843c5(Double.valueOf(abstractC6123caMo10039c52.mo24775x1())) & C14080ne.m66843c5(Double.valueOf(abstractC6123caMo10039c5.mo24775x1()));
                    dMo24775x12 = jM66843c5;
                    abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                    mo10048k4(abstractC6123caM25054k4);
                    return;
                }
                abstractC6123caM25054k4 = mo10078to().mo24977um().m25186k4(0.0d);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 15:
                C6163nh c6163nh2 = C6163nh.f17403k4;
                if (abstractC6123caMo10039c5 != c6163nh2) {
                    if (abstractC6123caMo10039c52 != c6163nh2) {
                        c6212ygMo24977um2 = mo10078to().mo24977um();
                        jM66843c5 = C14080ne.m66843c5(Double.valueOf(abstractC6123caMo10039c52.mo24775x1())) | C14080ne.m66843c5(Double.valueOf(abstractC6123caMo10039c5.mo24775x1()));
                        dMo24775x12 = jM66843c5;
                        abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                        mo10048k4(abstractC6123caM25054k4);
                        return;
                    }
                    c6212ygMo24977um2 = mo10078to().mo24977um();
                    double dMo24775x15 = abstractC6123caMo10039c5.mo24775x1();
                    jM66843c5 = C14080ne.m66843c5(Double.valueOf(dMo24775x15));
                    dMo24775x12 = jM66843c5;
                    abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                    mo10048k4(abstractC6123caM25054k4);
                    return;
                }
                break;
            case 16:
                C6163nh c6163nh3 = C6163nh.f17403k4;
                if (abstractC6123caMo10039c5 != c6163nh3) {
                    if (abstractC6123caMo10039c52 != c6163nh3) {
                        c6212ygMo24977um2 = mo10078to().mo24977um();
                        jM66843c5 = C14080ne.m66843c5(Double.valueOf(abstractC6123caMo10039c52.mo24775x1())) ^ C14080ne.m66843c5(Double.valueOf(abstractC6123caMo10039c5.mo24775x1()));
                        dMo24775x12 = jM66843c5;
                        abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                        mo10048k4(abstractC6123caM25054k4);
                        return;
                    }
                    c6212ygMo24977um2 = mo10078to().mo24977um();
                    double dMo24775x152 = abstractC6123caMo10039c5.mo24775x1();
                    jM66843c5 = C14080ne.m66843c5(Double.valueOf(dMo24775x152));
                    dMo24775x12 = jM66843c5;
                    abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                    mo10048k4(abstractC6123caM25054k4);
                    return;
                }
                break;
            case 17:
                if (!C14113y2.m67363du(abstractC6123caMo10039c5.mo24770dy(), abstractC6123caMo10039c52.mo24770dy())) {
                    c6213yjMo24972ks2 = mo10078to().mo24972ks();
                } else if (C7019kk.m27469x1(abstractC6123caMo10039c5, C6163nh.class) || C7019kk.m27469x1(abstractC6123caMo10039c5, C6185u1.class)) {
                    c6213yjMo24972ks2 = mo10078to().mo24972ks();
                } else if ("number".equals(abstractC6123caMo10039c5.mo24770dy())) {
                    if (abstractC6123caMo10039c5 != mo10078to().mo24977um().mo25032k4("NaN")) {
                        if (abstractC6123caMo10039c52 != mo10078to().mo24977um().mo25032k4("NaN")) {
                        }
                    }
                    c6213yjMo24972ks2 = mo10078to().mo24972ks();
                    break;
                } else if ("string".equals(abstractC6123caMo10039c5.mo24770dy())) {
                    c6213yjMo24972ks = mo10078to().mo24972ks();
                    zM67363du = C14113y2.m67363du(abstractC6123caMo10039c5.toString(), abstractC6123caMo10039c52.toString());
                    abstractC6123caM25054k4 = c6213yjMo24972ks.m25189k4(zM67363du);
                } else if ("boolean".equals(abstractC6123caMo10039c5.mo24770dy())) {
                    abstractC6123caM25054k4 = mo10078to().mo24972ks().m25189k4(abstractC6123caMo10039c5.mo24772k4() == abstractC6123caMo10039c52.mo24772k4());
                } else {
                    c6213yjMo24972ks2 = mo10078to().mo24972ks();
                    abstractC6123caM25054k4 = abstractC6123caMo10039c5 == abstractC6123caMo10039c52 ? c6213yjMo24972ks2.m25188jd() : c6213yjMo24972ks2.m25187c5();
                }
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 18:
                new C6147jd(17, c6147jd.m24861k4(), c6147jd.m24863x1()).mo24749k4(this);
                c6213yjMo24972ks = mo10078to().mo24972ks();
                zMo24772k4 = mo10039c5().mo24772k4();
                zM67363du = !zMo24772k4;
                abstractC6123caM25054k4 = c6213yjMo24972ks.m25189k4(zM67363du);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 19:
                C6163nh c6163nh4 = C6163nh.f17403k4;
                if (abstractC6123caMo10039c5 != c6163nh4) {
                    if (abstractC6123caMo10039c52 != c6163nh4) {
                        c6212ygMo24977um2 = mo10078to().mo24977um();
                        jM66843c5 = C14080ne.m66843c5(Double.valueOf(abstractC6123caMo10039c5.mo24775x1())) << (C14080ne.m66913h4(Double.valueOf(abstractC6123caMo10039c52.mo24775x1())) & 65535);
                        dMo24775x12 = jM66843c5;
                        abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                        mo10048k4(abstractC6123caM25054k4);
                        return;
                    }
                    c6212ygMo24977um2 = mo10078to().mo24977um();
                    double dMo24775x1522 = abstractC6123caMo10039c5.mo24775x1();
                    jM66843c5 = C14080ne.m66843c5(Double.valueOf(dMo24775x1522));
                    dMo24775x12 = jM66843c5;
                    abstractC6123caM25054k4 = c6212ygMo24977um2.m25186k4(dMo24775x12);
                    mo10048k4(abstractC6123caM25054k4);
                    return;
                }
                abstractC6123caM25054k4 = mo10078to().mo24977um().m25186k4(0.0d);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 20:
                C6163nh c6163nh5 = C6163nh.f17403k4;
                if (abstractC6123caMo10039c5 != c6163nh5) {
                }
                abstractC6123caM25054k4 = mo10078to().mo24977um().m25186k4(0.0d);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 21:
                C6163nh c6163nh6 = C6163nh.f17403k4;
                if (abstractC6123caMo10039c5 != c6163nh6) {
                }
                abstractC6123caM25054k4 = mo10078to().mo24977um().m25186k4(0.0d);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 22:
                C6198wp c6198wp = (C6198wp) C7019kk.m27452k4((Object) abstractC6123caMo10039c52, C6198wp.class);
                C6116bs c6116bs = (C6116bs) C7019kk.m27452k4((Object) abstractC6123caMo10039c5, C6116bs.class);
                if (c6198wp == null) {
                    throw new C6158m4(mo10078to().mo24981wl().m25165h4(C14113y2.m67408k4("Right argument should be a function: ", c6147jd.m24863x1().toString())));
                }
                if (c6116bs == null) {
                    throw new C6158m4(mo10078to().mo24981wl().m25165h4(C14113y2.m67408k4("Left argument should be an object: ", c6147jd.m24861k4().toString())));
                }
                c6213yjMo24972ks = mo10078to().mo24972ks();
                zM67363du = c6198wp.m25140x1(c6116bs);
                abstractC6123caM25054k4 = c6213yjMo24972ks.m25189k4(zM67363du);
                mo10048k4(abstractC6123caM25054k4);
                return;
            case 23:
                if (C7019kk.m27469x1(abstractC6123caMo10039c52, InterfaceC6145j2.class)) {
                    throw new C6158m4(mo10078to().mo24982x6().m25165h4("Cannot apply 'in' operator to the specified member."));
                }
                c6213yjMo24972ks = mo10078to().mo24972ks();
                zM67363du = ((AbstractC6211yd) abstractC6123caMo10039c52).m25182x1(abstractC6123caMo10039c5);
                abstractC6123caM25054k4 = c6213yjMo24972ks.m25189k4(zM67363du);
                mo10048k4(abstractC6123caM25054k4);
                return;
            default:
                throw new NotSupportedException("Unkown binary operator");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r9.f17470h4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x003a, PHI: r3
      0x0068: PHI (r3v8 boolean) = (r3v2 boolean), (r3v7 boolean), (r3v2 boolean) binds: [B:15:0x0057, B:19:0x0067, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:5:0x0019, B:7:0x001f, B:9:0x002e, B:20:0x0068, B:22:0x006c, B:14:0x003c, B:16:0x0059), top: B:37:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c A[EDGE_INSN: B:42:0x006c->B:22:0x006c BREAK  A[LOOP:0: B:37:0x0019->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:0: B:37:0x0019->B:43:?, LOOP_END, SYNTHETIC] */
    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10058k4(C6148jf c6148jf) {
        m25058k4(c6148jf.m24864k4());
        boolean z = false;
        if (c6148jf.m24867x1() != null) {
            IGenericEnumerator<C6162ne> it = c6148jf.m24867x1().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    C6162ne next = it.next();
                    m25058k4((AbstractC6178sq) next.m24943k4());
                    if (z) {
                        next.m24945x1().mo24749k4(this);
                        if (!this.f17477x1) {
                            if (this.f17470h4 == null) {
                                break;
                            }
                        }
                    } else {
                        new C6147jd(7, (AbstractC6131e0) c6148jf.m24864k4(), next.m24943k4()).mo24749k4(this);
                        if (mo10039c5().mo24772k4()) {
                            next.m24945x1().mo24749k4(this);
                            if (this.f17477x1) {
                                z = true;
                                break;
                            } else {
                                z = true;
                                if (this.f17470h4 == null) {
                                }
                            }
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (z || c6148jf.m24866kk() == null) {
            return;
        }
        c6148jf.m24866kk().mo24749k4(this);
        if (this.f17470h4 != null) {
            this.f17470h4 = null;
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10059k4(C6152kp c6152kp) {
        m25052jd().m25180x1(c6152kp.mo24838k4(), m25055k4((InterfaceC6192vh) c6152kp));
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10060k4(C6156ly c6156ly) {
        c6156ly.m24917k4().mo24749k4(this);
        m25062k4((Object) mo10039c5());
        while (mo10039c5().mo24772k4()) {
            c6156ly.m24918x1().mo24749k4(this);
            m25063k4(c6156ly.m25011h4());
            if (m25064kk()) {
                if (this.f17470h4 == null || !C14113y2.m67363du(c6156ly.m25011h4(), this.f17470h4.m25011h4())) {
                    return;
                }
                this.f17470h4 = null;
                return;
            }
            c6156ly.m24917k4().mo24749k4(this);
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10061k4(C6157m2 c6157m2) {
        C6116bs c6116bsM24759jd = mo10078to().mo24967fa().m24759jd();
        Dictionary.Enumerator<String, AbstractC6131e0> it = c6157m2.m24919k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                mo10048k4((AbstractC6123ca) c6116bsM24759jd);
                ((AbstractC6131e0) next.getValue()).mo24749k4(this);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        mo10048k4((AbstractC6123ca) c6116bsM24759jd);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10062k4(C6167ou c6167ou) {
        mo10048k4((AbstractC6123ca) C6163nh.f17403k4);
        if (c6167ou.m24953k4() != null) {
            c6167ou.m24953k4().mo24749k4(this);
        }
        throw new C6158m4(mo10039c5());
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10063k4(C6168q6 c6168q6) {
        c6168q6.m24955x1().mo24749k4(this);
        if (!C7019kk.m27469x1(mo10039c5(), AbstractC6211yd.class)) {
            throw new C6158m4(this.f17474m9.mo24980v4().m25068h4("Invalid expression in 'with' statement"));
        }
        m25061k4((AbstractC6211yd) mo10039c5());
        try {
            c6168q6.m24954k4().mo24749k4(this);
        } finally {
            m25065x1();
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10064k4(C6169qk c6169qk) {
        mo10048k4((AbstractC6123ca) mo10078to().mo24966bv().m25124k4(c6169qk.m24956k4(), C14113y2.m67364dy(c6169qk.m24958x1(), "g") != -1, C14113y2.m67364dy(c6169qk.m24958x1(), ContextChain.TAG_INFRA) != -1, C14113y2.m67364dy(c6169qk.m24958x1(), "m") != -1));
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10065k4(C6174ri c6174ri) {
        m25062k4((Object) mo10039c5());
        C6116bs c6116bs = (C6116bs) mo10039c5();
        c6174ri.m24984k4().mo24749k4(this);
        m25057k4("String".equals(c6116bs.mo24774to()) ? mo10078to().mo24980v4().m25068h4(C14117yj.m67537ne(c6116bs.toString().charAt(C14080ne.m66994m9(Double.valueOf(mo10039c5().mo24775x1()))))) : c6116bs.m24791b3() != null ? c6116bs.m24791b3().mo25044k4(c6116bs, mo10039c5()) : c6116bs.mo25031k4(mo10039c5()), (AbstractC6211yd) c6116bs);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10066k4(C6176rv c6176rv) {
        this.f17470h4 = c6176rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25058k4(AbstractC6178sq abstractC6178sq) {
        this.f17465c5 = abstractC6178sq;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10067k4(C6180sv c6180sv) {
        if (c6180sv.m25014k4() != null) {
            c6180sv.m25014k4().mo24749k4(this);
        }
        if (c6180sv.m25020x1() != null) {
            c6180sv.m25020x1().mo24749k4(this);
        } else {
            mo10048k4((AbstractC6123ca) mo10078to().mo24972ks().m25189k4(true));
        }
        m25062k4((Object) mo10039c5());
        while (mo10039c5().mo24772k4()) {
            c6180sv.m25018to().mo24749k4(this);
            m25063k4(c6180sv.m25011h4());
            if (m25064kk()) {
                if (this.f17470h4 == null || !C14113y2.m67363du(c6180sv.m25011h4(), this.f17470h4.m25011h4())) {
                    return;
                }
                this.f17470h4 = null;
                return;
            }
            if (c6180sv.m25016kk() != null) {
                c6180sv.m25016kk().mo24749k4(this);
            }
            if (c6180sv.m25020x1() != null) {
                c6180sv.m25020x1().mo24749k4(this);
            } else {
                mo10048k4((AbstractC6123ca) mo10078to().mo24972ks().m25189k4(true));
            }
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10068k4(C6186u4 c6186u4) {
        boolean zM27456k4;
        IGenericEnumerator<AbstractC6178sq> it = c6186u4.m25067k4().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo24749k4(this);
                if (m25064kk()) {
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
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

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6132em
    /* JADX INFO: renamed from: k4 */
    public final void mo10069k4(C6198wp c6198wp, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (c6198wp == null) {
            return;
        }
        int i = this.f17475to;
        this.f17475to = i + 1;
        if (i > 100) {
            throw new C6158m4(mo10078to().mo24982x6().m25165h4("Too many recursions in the script."));
        }
        C6201x1 c6201x1 = new C6201x1(mo10078to(), c6198wp, abstractC6123caArr);
        C6202x3 c6202x3 = new C6202x3(c6198wp.m25136ks() != null ? c6198wp.m25136ks() : m25049du());
        int i2 = 0;
        while (i2 < c6198wp.m25141yj().size()) {
            c6202x3.mo25036k4(i2 < abstractC6123caArr.length ? new C6146j5(c6202x3, c6198wp.m25141yj().get_Item(i2), c6201x1.mo24946du(C14057f9.m66591x1(i2)), c6201x1) : new C6165o9(c6202x3, c6198wp.m25141yj().get_Item(i2), C6163nh.f17403k4));
            i2++;
        }
        if (m25046k4(1)) {
            c6202x3.m25180x1("arguments", c6201x1);
        } else {
            c6201x1.m25180x1("arguments", c6201x1);
        }
        if (abstractC6211yd == null) {
            abstractC6211yd = (AbstractC6211yd) C7019kk.m27452k4((Object) mo10078to(), C6116bs.class);
        }
        c6202x3.m25180x1("this", abstractC6211yd);
        m25059k4(c6202x3);
        try {
            mo10048k4(c6198wp.mo10037k4(this, abstractC6211yd, abstractC6123caArr));
            if (this.f17477x1) {
                this.f17477x1 = false;
            }
        } finally {
            m25065x1();
            this.f17475to--;
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10070k4(C6199wy c6199wy) {
        do {
            c6199wy.m25143x1().mo24749k4(this);
            m25063k4(c6199wy.m25011h4());
            if (m25064kk()) {
                if (this.f17470h4 == null || !C14113y2.m67363du(c6199wy.m25011h4(), this.f17470h4.m25011h4())) {
                    return;
                }
                this.f17470h4 = null;
                return;
            }
            c6199wy.m25142k4().mo24749k4(this);
            m25062k4((Object) mo10039c5());
        } while (mo10039c5().mo24772k4());
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10071k4(C6200wz c6200wz) {
        mo10048k4((AbstractC6123ca) null);
        c6200wz.m25144k4().mo24749k4(this);
        if (mo10039c5() == null || !C7019kk.m27469x1(mo10039c5(), C6198wp.class)) {
            if (!C7019kk.m27469x1(mo10039c5(), C6198wp.class)) {
                throw new C6158m4(mo10078to().mo24982x6().m25165h4("Function expected."));
            }
            return;
        }
        C6198wp c6198wp = (C6198wp) mo10039c5();
        AbstractC6123ca[] abstractC6123caArr = new AbstractC6123ca[c6200wz.m25147x1().size()];
        for (int i = 0; i < c6200wz.m25147x1().size(); i++) {
            ((AbstractC6131e0) c6200wz.m25147x1().get_Item(i)).mo24749k4(this);
            abstractC6123caArr[i] = mo10039c5();
        }
        mo10048k4((AbstractC6123ca) c6198wp.mo24809k4(abstractC6123caArr, (AbstractC14068j5[]) null, this));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25059k4(C6202x3 c6202x3) {
        this.f17472k4.push(c6202x3);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10072k4(C6203x5 c6203x5) {
        if (c6203x5.m25158x1() != null) {
            c6203x5.m25158x1().mo24749k4(this);
        }
        c6203x5.m25156k4().mo24749k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25060k4(C6203x5 c6203x5, AbstractC6123ca abstractC6123ca) {
        AbstractC6211yd abstractC6211ydM25052jd;
        if (!C7019kk.m27469x1(c6203x5.m25156k4(), InterfaceC6207xw.class)) {
            throw new C6208y2("The left member of an assignment must be a member");
        }
        m25062k4((Object) abstractC6123ca);
        if (c6203x5.m25158x1() != null) {
            c6203x5.m25158x1().mo24749k4(this);
            abstractC6211ydM25052jd = (AbstractC6211yd) C7019kk.m27452k4((Object) mo10039c5(), AbstractC6211yd.class);
            if (abstractC6211ydM25052jd == null) {
                throw new C6208y2("Attempt to assign to an undefined variable.");
            }
        } else {
            abstractC6211ydM25052jd = m25052jd();
            m25052jd().m25176k4(((C6217zj) c6203x5.m25156k4()).m25201k4(), new AbstractC6155lr[]{null});
        }
        boolean zM27469x1 = C7019kk.m27469x1(c6203x5.m25156k4(), C6217zj.class);
        AbstractC6131e0 abstractC6131e0M25156k4 = c6203x5.m25156k4();
        if (zM27469x1) {
            abstractC6211ydM25052jd.mo25037k4(((C6217zj) abstractC6131e0M25156k4).m25201k4(), abstractC6123ca);
        } else {
            ((C6174ri) C7019kk.m27452k4((Object) abstractC6131e0M25156k4, C6174ri.class)).m24984k4().mo24749k4(this);
            AbstractC6123ca abstractC6123ca2 = (C6116bs) C7019kk.m27452k4((Object) abstractC6211ydM25052jd, C6116bs.class);
            if (abstractC6123ca2 == null || abstractC6123ca2.m24791b3() == null) {
                abstractC6211ydM25052jd.mo25035k4(mo10039c5(), abstractC6123ca);
            } else {
                abstractC6123ca2.m24791b3().mo25045k4(abstractC6123ca2, mo10039c5(), abstractC6123ca);
            }
        }
        mo10048k4(abstractC6123ca);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10073k4(C6205xi c6205xi) {
        try {
            try {
                c6205xi.m25159k4().mo24749k4(this);
                if (c6205xi.m25164x1() != null) {
                    new C6116bs();
                    c6205xi.m25164x1().m24960k4().mo24749k4(this);
                }
            } catch (RuntimeException e) {
                e = e;
                if (e.getMessage() == null) {
                    e = new RuntimeException(e.getClass().getName(), e);
                }
                if (c6205xi.m25163kk() == null) {
                    throw e;
                }
                C6158m4 c6158m4 = (C6158m4) C7019kk.m27452k4((Object) e, C6158m4.class);
                if (c6158m4 == null) {
                    c6158m4 = new C6158m4(mo10078to().mo24982x6().m25165h4(e.getMessage()));
                }
                if (c6205xi.m25163kk().m24856k4() != null) {
                    m25060k4(new C6203x5(new C6125d4(c6205xi.m25163kk().m24856k4()), null), c6158m4.m24921k4());
                }
                c6205xi.m25163kk().m24857x1().mo24749k4(this);
                if (c6205xi.m25164x1() != null) {
                    new C6116bs();
                    c6205xi.m25164x1().m24960k4().mo24749k4(this);
                }
            }
        } catch (Throwable th) {
            if (c6205xi.m25164x1() != null) {
                new C6116bs();
                c6205xi.m25164x1().m24960k4().mo24749k4(this);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25061k4(AbstractC6211yd abstractC6211yd) {
        this.f17472k4.push(new C6202x3(m25052jd(), abstractC6211yd));
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10074k4(C6215yo c6215yo) {
        C6203x5 c6203x5;
        AbstractC6123ca abstractC6123ca;
        AbstractC6211yd abstractC6211ydM25050dy = m25050dy();
        AbstractC6123ca abstractC6123caMo10039c5 = mo10039c5();
        if ((abstractC6123caMo10039c5 == C6163nh.f17403k4 || mo10039c5() == null) && C14113y2.m67411k4(this.f17466ck)) {
            throw new C6158m4(mo10078to().mo24981wl().m25165h4("Method isn't defined"));
        }
        int size = c6215yo.m25193k4().size();
        AbstractC6123ca[] abstractC6123caArr = new AbstractC6123ca[size];
        if (c6215yo.m25193k4().size() > 0) {
            for (int i = 0; i < c6215yo.m25193k4().size(); i++) {
                ((AbstractC6131e0) c6215yo.m25193k4().get_Item(i)).mo24749k4(this);
                abstractC6123caArr[i] = mo10039c5();
            }
        }
        if (!C7019kk.m27469x1(abstractC6123caMo10039c5, C6198wp.class)) {
            throw new C6158m4(mo10078to().mo24982x6().m25165h4("Function expected."));
        }
        C6198wp c6198wp = (C6198wp) abstractC6123caMo10039c5;
        String strM67408k4 = C14113y2.m67408k4(c6198wp.m25131fa(), "(");
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC6123ca abstractC6123ca2 = abstractC6123caArr[i2];
            if (abstractC6123ca2 != null) {
                strArr[i2] = abstractC6123ca2.mo24790ak();
            } else {
                strArr[i2] = CloudMetaExtra.DEFINE_NON_PARENT_ID;
            }
        }
        m25053k4().push(C14113y2.m67400k4(C14113y2.m67400k4(strM67408k4, C14113y2.m67403k4(", ", strArr)), ")"));
        this.f17473kk = C6163nh.f17403k4;
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[size];
        AbstractC14092to.m67208k4((Object) abstractC6123caArr).copyTo(AbstractC14092to.m67208k4((Object) abstractC6123caArr2), 0);
        mo10069k4(c6198wp, abstractC6211ydM25050dy, abstractC6123caArr);
        for (int i3 = 0; i3 < size; i3++) {
            if (abstractC6123caArr2[i3] != abstractC6123caArr[i3]) {
                if (C7019kk.m27469x1(c6215yo.m25193k4().get_Item(i3), C6203x5.class) && C7019kk.m27469x1(((C6203x5) c6215yo.m25193k4().get_Item(i3)).m25156k4(), InterfaceC6207xw.class)) {
                    c6203x5 = (C6203x5) c6215yo.m25193k4().get_Item(i3);
                    abstractC6123ca = abstractC6123caArr[i3];
                } else if (C7019kk.m27469x1(c6215yo.m25193k4().get_Item(i3), C6217zj.class)) {
                    c6203x5 = new C6203x5((AbstractC6131e0) c6215yo.m25193k4().get_Item(i3), null);
                    abstractC6123ca = abstractC6123caArr[i3];
                }
                m25060k4(c6203x5, abstractC6123ca);
            }
        }
        m25053k4().pop();
        mo10048k4(this.f17473kk);
        this.f17473kk = C6163nh.f17403k4;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10075k4(C6217zj c6217zj) {
        mo10048k4((AbstractC6123ca) null);
        String strM25201k4 = c6217zj.m25201k4();
        this.f17466ck = strM25201k4;
        AbstractC6155lr[] abstractC6155lrArr = {null};
        boolean zM25176k4 = m25052jd().m25176k4(strM25201k4, abstractC6155lrArr);
        AbstractC6155lr abstractC6155lr = abstractC6155lrArr[0];
        if (zM25176k4) {
            if (abstractC6155lr.mo24803m9()) {
                C6146j5 c6146j5 = (C6146j5) C7019kk.m27452k4((Object) abstractC6155lr, C6146j5.class);
                m25057k4(c6146j5.mo24800k4(m25052jd()), c6146j5.m24858ck());
            } else {
                mo10048k4(abstractC6155lr.mo24800k4(m25052jd()));
            }
            if (mo10039c5() != null) {
                return;
            }
        }
        if (CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(strM25201k4)) {
            mo10048k4((AbstractC6123ca) C6185u1.f17479k4);
        }
        if ("undefined".equals(strM25201k4)) {
            mo10048k4((AbstractC6123ca) C6163nh.f17403k4);
        }
        if (mo10039c5() == null) {
            this.f17471jd.m26792k4(strM25201k4);
        }
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6166os
    /* JADX INFO: renamed from: k4 */
    public final void mo10076k4(C6218zm c6218zm) {
        boolean zM27456k4;
        this.f17471jd = new C6765kp();
        this.f17477x1 = false;
        this.f17466ck = C14113y2.f47374k4;
        IGenericEnumerator<Object> it = c6218zm.m24831k4().iterator();
        while (it.hasNext()) {
            try {
                AbstractC6178sq abstractC6178sq = (AbstractC6178sq) ((C6210y9) it.next()).m25167k4();
                this.f17465c5 = abstractC6178sq;
                mo10048k4((AbstractC6123ca) null);
                abstractC6178sq.mo24749k4(this);
                if (this.f17477x1) {
                    this.f17477x1 = false;
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
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

    /* JADX INFO: renamed from: k4 */
    public final void m25062k4(Object obj) {
        if (obj == null) {
            throw new C6158m4(mo10078to().mo24976u4().m25165h4(C14113y2.m67408k4(this.f17466ck, " is not defined")));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25063k4(String str) {
        C6112ar c6112ar = this.f17467du;
        if (c6112ar == null || !C14113y2.m67363du(c6112ar.m25011h4(), str)) {
            return;
        }
        this.f17467du = null;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m25046k4(int i) {
        return mo10078to().mo24971kk(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m25047k4(AbstractC6123ca abstractC6123ca, AbstractC6123ca abstractC6123ca2, int[] iArr) {
        iArr[0] = 0;
        double dMo24775x1 = abstractC6123ca.mo24775x1();
        double dMo24775x12 = abstractC6123ca2.mo24775x1();
        if (C14044b3.m66437kk(dMo24775x1) || C14044b3.m66437kk(dMo24775x12)) {
            return false;
        }
        if (dMo24775x1 < dMo24775x12) {
            iArr[0] = -1;
        } else if (dMo24775x1 == dMo24775x12) {
            iArr[0] = 0;
        } else {
            iArr[0] = 1;
        }
        return true;
    }
}

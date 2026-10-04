package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Stack;
import com.aspose.slides.exceptions.UpaException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ew */
/* JADX INFO: loaded from: classes5.dex */
public final class C12973ew extends C13100m9 {

    /* JADX INFO: renamed from: k4 */
    private boolean f43669k4;

    /* JADX INFO: renamed from: kk */
    private Stack f43670kk;

    /* JADX INFO: renamed from: to */
    private C13282xc f43671to;

    /* JADX INFO: renamed from: x1 */
    private C13005gv f43672x1;

    public C12973ew(AbstractC13883dt abstractC13883dt, AbstractC13319z7 abstractC13319z7) {
        super(abstractC13883dt, null, abstractC13319z7);
        this.f43672x1 = new C13005gv();
        this.f43670kk = new Stack();
    }

    /* JADX INFO: renamed from: du */
    private C13192rv m60550du(C12969en c12969en) {
        String string;
        String string2;
        AbstractC13018hl abstractC13018hl;
        Object particle1;
        if (c12969en.m60419ks() == 1) {
            return C13192rv.f44272k4;
        }
        if (c12969en.m60419ks() == 0) {
            return C13192rv.f44275x1;
        }
        AbstractC12950dp abstractC12950dpM60420ne = c12969en.m60420ne();
        if (abstractC12950dpM60420ne == null || abstractC12950dpM60420ne == AbstractC12950dp.f43531k4) {
            return c12969en.m60419ks() == 2 ? C13192rv.f44272k4 : C13192rv.f44273kk;
        }
        m60602to(c12969en);
        if (C7019kk.m27469x1(abstractC12950dpM60420ne, C13141op.class)) {
            C13141op c13141op = (C13141op) abstractC12950dpM60420ne;
            C13274x1 c13274x1 = new C13274x1(c12969en.m60419ks(), c13141op.mo61012k4().size(), C14046bv.m66453dy(c13141op.m60245g8(), C14046bv.f47165du));
            for (int i = 0; i < c13141op.mo61012k4().size(); i++) {
                C13021hu c13021hu = (C13021hu) c13141op.mo61012k4().get_Item(i);
                if (!c13274x1.m61665k4(c13021hu.m60721qq(), c13021hu, C14046bv.m66453dy(c13021hu.m60245g8(), C14046bv.f47165du))) {
                    m61171k4("The '{0}' element already exists in the content model.", c13021hu.m60721qq().toString(), c13021hu);
                }
            }
            return c13274x1;
        }
        C13123nh c13123nh = new C13123nh(c12969en.m60419ks());
        try {
            c13123nh.m61241du();
            m60579k4(c13123nh, abstractC12950dpM60420ne);
            return c13123nh.m61251x1(this.f43669k4);
        } catch (UpaException e) {
            String str = "Wildcard '{0}' allows element '{1}', and causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.";
            if (C7019kk.m27469x1(e.getParticle1(), C13021hu.class)) {
                if (C7019kk.m27469x1(e.getParticle2(), C13021hu.class)) {
                    m61171k4("Multiple definition of element '{0}' causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.", ((C13021hu) e.getParticle1()).m60721qq().toString(), (C13021hu) e.getParticle2());
                    return C12969en.m60402m9();
                }
                string = ((C12989fu) e.getParticle2()).m60627h4().toString();
                string2 = ((C13021hu) e.getParticle1()).m60721qq().toString();
                particle1 = e.getParticle2();
            } else {
                if (!C7019kk.m27469x1(e.getParticle2(), C13021hu.class)) {
                    string = ((C12989fu) e.getParticle1()).m60627h4().toString();
                    string2 = ((C12989fu) e.getParticle2()).m60627h4().toString();
                    abstractC13018hl = (C12989fu) e.getParticle1();
                    str = "Wildcards '{0}' and '{1}' have not empty intersection, and causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.";
                    m61173k4(str, string, string2, abstractC13018hl);
                    return C12969en.m60402m9();
                }
                string = ((C12989fu) e.getParticle1()).m60627h4().toString();
                string2 = ((C13021hu) e.getParticle2()).m60721qq().toString();
                particle1 = e.getParticle1();
            }
            abstractC13018hl = (C12989fu) particle1;
            m61173k4(str, string, string2, abstractC13018hl);
            return C12969en.m60402m9();
        } catch (UnsupportedOperationException unused) {
            m61170k4("Content model validation resulted in a large number of states, possibly due to large occurrence ranges. Therefore, content model may not be validated accurately.", c12969en, 1);
            return C12969en.m60402m9();
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m60551dy() {
        this.f43671to.m61737yj().m60652x1(AbstractC13279x6.f44531x1, C12969en.m60399k4());
        Iterator it = this.f43672x1.m60648kk().iterator();
        while (it.hasNext()) {
            try {
                m60578k4((C13103mh) it.next());
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        Iterator it2 = this.f43671to.m61735x6().m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                m60608x1((C13147p5) it2.next());
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        Iterator it3 = this.f43671to.m61727up().m60648kk().iterator();
        while (it3.hasNext()) {
            try {
                m60609x1((C13149p8) it3.next());
            } finally {
                if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        Iterator it4 = this.f43671to.m61737yj().m60648kk().iterator();
        while (it4.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it4.next();
                if (C7019kk.m27469x1(c12943dd, C12969en.class)) {
                    m60605x1((C12969en) c12943dd);
                } else {
                    m60610x1((C13164q9) c12943dd);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it4).dispose();
        }
        Iterator it5 = this.f43671to.m61717ks().m60648kk().iterator();
        while (it5.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it5.next();
                if (c13021hu.m60697b3() == null) {
                    m60606x1(c13021hu);
                }
            } finally {
                if (C7019kk.m27456k4(it5, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it5).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it5, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it5).dispose();
        }
        Iterator it6 = this.f43671to.m61701fa().m60648kk().iterator();
        while (it6.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it6.next();
                if (c13146p4.m61369ks() == null) {
                    m60607x1(c13146p4);
                }
            } finally {
                if (C7019kk.m27456k4(it6, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it6).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it6, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it6).dispose();
        }
        Iterator it7 = this.f43671to.m61703ix().m60648kk().iterator();
        while (it7.hasNext()) {
            try {
                C12887a0 c12887a0 = (C12887a0) it7.next();
                if (c12887a0.m59979dy() == null) {
                    m60565k4(c12887a0);
                }
            } finally {
                if (C7019kk.m27456k4(it7, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it7).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it7, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it7).dispose();
        }
        while (this.f43670kk.size() > 0) {
            m60553h4((C12969en) this.f43670kk.pop());
        }
        Iterator it8 = this.f43671to.m61737yj().m60648kk().iterator();
        while (it8.hasNext()) {
            try {
                C12943dd c12943dd2 = (C12943dd) it8.next();
                if (C7019kk.m27469x1(c12943dd2, C12969en.class)) {
                    m60599kk((C12969en) c12943dd2);
                }
            } finally {
                if (C7019kk.m27456k4(it8, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it8).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it8, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it8).dispose();
        }
        Iterator it9 = this.f43671to.m61717ks().m60648kk().iterator();
        while (it9.hasNext()) {
            try {
                C13021hu c13021hu2 = (C13021hu) it9.next();
                if (C7019kk.m27469x1(c13021hu2.m60696ar(), C12969en.class) && C13890ei.m65278k4(c13021hu2.m60724u4(), C13890ei.f46456k4)) {
                    m60599kk((C12969en) c13021hu2.m60696ar());
                }
            } finally {
                if (C7019kk.m27456k4(it9, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it9).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it9, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it9).dispose();
        }
        it8 = this.f43672x1.m60648kk().iterator();
        while (it8.hasNext()) {
            try {
                m60577k4((C13078l0) it8.next());
            } finally {
                if (C7019kk.m27456k4(it8, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it8).dispose();
                }
            }
        }
        this.f43671to.m61737yj().m60646k4(AbstractC13279x6.f44531x1);
    }

    /* JADX INFO: renamed from: h4 */
    private void m60552h4() {
        Iterator it = this.f43671to.m61717ks().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it.next();
                if (!c13021hu.m60705ix().m65287kk()) {
                    C13078l0 c13103mh = (C13078l0) this.f43672x1.m60649kk(c13021hu.m60705ix());
                    if (c13103mh == null) {
                        c13103mh = new C13103mh();
                        c13103mh.m61098k4(c13021hu.m60705ix());
                        this.f43672x1.m60647k4(c13021hu.m60705ix(), c13103mh);
                    }
                    c13103mh.m61097k4().addItem(c13021hu);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m60554k4(AbstractC12950dp abstractC12950dp, C12908be c12908be) {
        for (int i = 0; i < c12908be.size(); i++) {
            if (m60588k4(abstractC12950dp, (AbstractC12950dp) c12908be.get_Item(i))) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    private C12943dd m60598kk(C13890ei c13890ei) {
        C12943dd c12943dd = (C12943dd) this.f43671to.m61737yj().m60649kk(c13890ei);
        if (c12943dd == null) {
            return AbstractC13279x6.m61670k4(c13890ei);
        }
        if (C7019kk.m27469x1(c12943dd, C12969en.class)) {
            m60605x1((C12969en) c12943dd);
            return c12943dd;
        }
        m60610x1((C13164q9) c12943dd);
        return c12943dd;
    }

    /* JADX INFO: renamed from: m9 */
    private void m60601m9() {
        Iterator it = this.f43671to.m61735x6().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                m60581k4((C13147p5) it.next());
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        Iterator it2 = this.f43671to.m61727up().m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                m60582k4((C13149p8) it2.next());
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        Iterator it3 = this.f43671to.m61737yj().m60648kk().iterator();
        while (it3.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it3.next();
                if (C7019kk.m27469x1(c12943dd, C12969en.class)) {
                    m60569k4((C12969en) c12943dd);
                } else {
                    m60583k4((C13164q9) c12943dd);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        Iterator it4 = this.f43671to.m61717ks().m60648kk().iterator();
        while (it4.hasNext()) {
            try {
                m60576k4((C13021hu) it4.next());
            } finally {
                if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it4).dispose();
        }
        it2 = this.f43671to.m61701fa().m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                m60580k4((C13146p4) it2.next());
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m60602to(C12969en c12969en) {
        this.f43670kk.push(c12969en);
    }

    /* JADX INFO: renamed from: x1 */
    private C12969en m60603x1(C13890ei c13890ei) {
        C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) this.f43671to.m61737yj().m60649kk(c13890ei), C12969en.class);
        if (c12969en != null) {
            m60605x1(c12969en);
        }
        return c12969en;
    }

    /* JADX INFO: renamed from: h4 */
    private void m60553h4(C12969en c12969en) {
        if (c12969en.m60679e0()) {
            m61169k4("Circular type reference.", c12969en);
            return;
        }
        c12969en.m60681h4(true);
        if (c12969en.m60420ne() != AbstractC12950dp.f43531k4) {
            m60572k4(c12969en, c12969en.m60420ne());
        }
        c12969en.m60681h4(false);
    }

    /* JADX INFO: renamed from: k4 */
    private int m60555k4(C12969en c12969en, C12935cx c12935cx, AbstractC12950dp abstractC12950dp) {
        if (c12935cx != null && c12935cx.m60147k4()) {
            return 3;
        }
        if (c12935cx == null && c12969en.mo60216jd()) {
            return 3;
        }
        return (abstractC12950dp == null || abstractC12950dp.mo60251x1()) ? 1 : 2;
    }

    /* JADX INFO: renamed from: kk */
    private void m60599kk(C12969en c12969en) {
        C12969en c12969en2 = (C12969en) C7019kk.m27452k4((Object) c12969en.m60231yd(), C12969en.class);
        if (c12969en2 == null || c12969en2 == C12969en.m60399k4() || c12969en.m60209b3() != 4 || m60588k4(c12969en.m60420ne(), c12969en2.m60420ne())) {
            return;
        }
        m61169k4("Invalid particle derivation by restriction.", c12969en);
    }

    /* JADX INFO: renamed from: x1 */
    private C13106mq m60604x1(C13106mq c13106mq, C13106mq c13106mq2) {
        if (c13106mq == null) {
            return c13106mq2;
        }
        if (c13106mq2 == null) {
            return c13106mq;
        }
        C13106mq c13106mqM61181k4 = C13106mq.m61181k4(c13106mq, c13106mq2, true);
        if (c13106mqM61181k4 == null) {
            m61169k4("The 'anyAttribute' is not expressible.", c13106mq);
        }
        return c13106mqM61181k4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m60556k4(AbstractC12950dp abstractC12950dp, boolean z) {
        AbstractC12950dp abstractC12950dpM60557k4 = m60557k4(abstractC12950dp, true, z);
        C13132o2 c13132o2 = (C13132o2) C7019kk.m27452k4((Object) abstractC12950dpM60557k4, C13132o2.class);
        if (c13132o2 == null || c13132o2.mo61012k4().size() != 0) {
            return abstractC12950dpM60557k4;
        }
        if (C14046bv.m66484m9(c13132o2.m60245g8(), C14046bv.f47165du)) {
            m61170k4("Empty choice cannot be satisfied if 'minOccurs' is not equal to 0.", c13132o2, 1);
        }
        return AbstractC12950dp.f43531k4;
    }

    /* JADX INFO: renamed from: kk */
    private C13164q9[] m60600kk(C13164q9 c13164q9) {
        ArrayList arrayList = new ArrayList();
        C12984fe c12984fe = (C12984fe) c13164q9.m61416k4();
        C13890ei[] c13890eiArrM60622x1 = c12984fe.m60622x1();
        if (c13890eiArrM60622x1 != null) {
            for (int i = 0; i < c13890eiArrM60622x1.length; i++) {
                C13164q9 c13164q9M60564k4 = m60564k4(c13890eiArrM60622x1[i]);
                if (c13164q9M60564k4 == null) {
                    throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", c13890eiArrM60622x1[i].toString(), c13164q9);
                }
                if (c13164q9M60564k4.m60211bz().mo60017ck() == 2) {
                    m60584k4(c13164q9M60564k4, arrayList, c13164q9);
                } else {
                    arrayList.addItem(c13164q9M60564k4);
                }
                if ((c13164q9M60564k4.m60225v4() & 16) != 0) {
                    m61169k4("The base type is the final union.", c13164q9);
                }
            }
        }
        C12908be c12908beM60619k4 = c12984fe.m60619k4();
        if (c12908beM60619k4 != null) {
            for (int i2 = 0; i2 < c12908beM60619k4.size(); i2++) {
                C13164q9 c13164q92 = (C13164q9) c12908beM60619k4.get_Item(i2);
                m60610x1(c13164q92);
                if (c13164q92.m60211bz().mo60017ck() == 2) {
                    m60584k4(c13164q92, arrayList, c13164q9);
                } else {
                    arrayList.addItem(c13164q92);
                }
            }
        }
        c12984fe.m60620k4((C13164q9[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(arrayList.toArray(C7019kk.m27443k4((Class<?>) C13164q9.class))), C13164q9[].class));
        return c12984fe.m60618h4();
    }

    /* JADX INFO: renamed from: x1 */
    private void m60605x1(C12969en c12969en) {
        C12969en c12969en2;
        AbstractC12892ae abstractC12892aeM61377yj;
        if (c12969en.m60226wp() != null) {
            return;
        }
        if (c12969en.m60679e0()) {
            m61169k4("Circular type reference.", c12969en);
            return;
        }
        c12969en.m60681h4(true);
        if (c12969en.m60407ck() != null) {
            if (C7019kk.m27469x1(c12969en.m60407ck(), C13268wr.class)) {
                C13268wr c13268wr = (C13268wr) c12969en.m60407ck();
                c12969en.m60212c5(0);
                boolean zM27469x1 = C7019kk.m27469x1(c13268wr.m61663k4(), C13025i2.class);
                AbstractC13101mc abstractC13101mcM61663k4 = c13268wr.m61663k4();
                if (zM27469x1) {
                    m60574k4(c12969en, (C13025i2) abstractC13101mcM61663k4);
                } else {
                    m60575k4(c12969en, (C13039iv) abstractC13101mcM61663k4);
                }
            } else {
                C12935cx c12935cx = (C12935cx) c12969en.m60407ck();
                if (C7019kk.m27469x1(c12935cx.m60148x1(), C13258w2.class)) {
                    m60571k4(c12969en, c12935cx, (C13258w2) c12935cx.m60148x1());
                } else {
                    m60570k4(c12969en, c12935cx, (C12913br) c12935cx.m60148x1());
                }
            }
            c12969en2 = c12969en;
        } else {
            c12969en.m60218k4((C12943dd) C12969en.m60399k4());
            c12969en2 = c12969en;
            m60573k4(C12969en.m60399k4(), c12969en2, c12969en.m60424up(), c12969en.m60431yj(), 4);
            c12969en2.m60214dy(4);
            c12969en2.m60429x1(m60556k4(c12969en2.m60409fa(), true));
            c12969en2.m60212c5(m60555k4(c12969en2, (C12935cx) null, c12969en2.m60420ne()));
        }
        Iterator it = c12969en2.m60423u4().m60648kk().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it.next();
                if (c13146p4.m61356ck() != 2 && (abstractC12892aeM61377yj = c13146p4.m61377yj()) != null && abstractC12892aeM61377yj.mo60016c5() == 1) {
                    if (z) {
                        m61169k4("Two distinct members of the attribute uses must not have type definitions which are both xs:ID or are derived from xs:ID.", c12969en2);
                    } else {
                        z = true;
                    }
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        C13125nk c13125nk = new C13125nk();
        c13125nk.m61269k4(m60550du(c12969en2));
        c13125nk.m61435k4((C12943dd) c12969en2);
        c13125nk.m61278to(c12969en2.m60408dy());
        c13125nk.m61434k4(c12969en2.m60211bz());
        c13125nk.m61264k4(c12969en2.m60410ix());
        c13125nk.m61268k4(c12969en2.m60425uz());
        it = c12969en2.m60423u4().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13146p4 c13146p42 = (C13146p4) it.next();
                if (c13146p42.m61356ck() == 2) {
                    if (!c13125nk.m61282wl().containsKey(c13146p42.m61359fa())) {
                        c13125nk.m61282wl().addItem(c13146p42.m61359fa(), c13146p42.m61359fa());
                    }
                } else if (!c13125nk.m61281uz().containsKey(c13146p42.m61359fa()) && c13146p42.m61369ks() != null && C13890ei.m65281x1(c13146p42.m61369ks().m61443qq(), C13890ei.f46456k4) && c13146p42.m61369ks() != C13061k5.f44035k4) {
                    c13125nk.m61267k4(c13146p42.m61369ks());
                }
            } finally {
            }
        }
        c12969en2.m60219k4(c13125nk);
        c12969en2.m60681h4(false);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m60557k4(AbstractC12950dp abstractC12950dp, boolean z, boolean z2) {
        return (abstractC12950dp == null || abstractC12950dp.mo60251x1()) ? AbstractC12950dp.f43531k4 : C7019kk.m27469x1(abstractC12950dp, C13021hu.class) ? m60559k4((C13021hu) abstractC12950dp, z2) : C7019kk.m27469x1(abstractC12950dp, C12990fw.class) ? m60558k4((C12990fw) abstractC12950dp, z, z2) : C7019kk.m27469x1(abstractC12950dp, C13141op.class) ? m60561k4((C13141op) abstractC12950dp, z, z2) : C7019kk.m27469x1(abstractC12950dp, C13132o2.class) ? m60560k4((C13132o2) abstractC12950dp, z, z2) : C7019kk.m27469x1(abstractC12950dp, C13193s0.class) ? m60562k4((C13193s0) abstractC12950dp, z, z2) : abstractC12950dp;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0124 A[Catch: all -> 0x004f, XmlSchemaException -> 0x0052, TRY_ENTER, TryCatch #0 {XmlSchemaException -> 0x0052, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0035, B:16:0x003e, B:69:0x019f, B:71:0x01a5, B:72:0x01b2, B:74:0x01b8, B:95:0x0224, B:97:0x022a, B:98:0x0236, B:100:0x023c, B:101:0x0251, B:102:0x0254, B:76:0x01be, B:78:0x01c4, B:80:0x01cf, B:82:0x01d5, B:83:0x01dc, B:85:0x01e8, B:87:0x01ee, B:84:0x01e0, B:88:0x0207, B:90:0x0211, B:93:0x021c, B:94:0x0223, B:21:0x0055, B:22:0x0064, B:23:0x0065, B:24:0x0074, B:25:0x0075, B:27:0x007b, B:54:0x0124, B:56:0x012e, B:58:0x013d, B:59:0x0141, B:60:0x0146, B:62:0x0152, B:64:0x0161, B:65:0x0166, B:67:0x0180, B:68:0x018c, B:28:0x0083, B:30:0x008d, B:33:0x00a1, B:34:0x00b0, B:35:0x00b1, B:37:0x00bb, B:39:0x00cd, B:43:0x00d7, B:45:0x00e0, B:46:0x00ef, B:47:0x00f4, B:48:0x0100, B:49:0x010f, B:50:0x0110), top: B:113:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180 A[Catch: all -> 0x004f, XmlSchemaException -> 0x0052, TryCatch #0 {XmlSchemaException -> 0x0052, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0035, B:16:0x003e, B:69:0x019f, B:71:0x01a5, B:72:0x01b2, B:74:0x01b8, B:95:0x0224, B:97:0x022a, B:98:0x0236, B:100:0x023c, B:101:0x0251, B:102:0x0254, B:76:0x01be, B:78:0x01c4, B:80:0x01cf, B:82:0x01d5, B:83:0x01dc, B:85:0x01e8, B:87:0x01ee, B:84:0x01e0, B:88:0x0207, B:90:0x0211, B:93:0x021c, B:94:0x0223, B:21:0x0055, B:22:0x0064, B:23:0x0065, B:24:0x0074, B:25:0x0075, B:27:0x007b, B:54:0x0124, B:56:0x012e, B:58:0x013d, B:59:0x0141, B:60:0x0146, B:62:0x0152, B:64:0x0161, B:65:0x0166, B:67:0x0180, B:68:0x018c, B:28:0x0083, B:30:0x008d, B:33:0x00a1, B:34:0x00b0, B:35:0x00b1, B:37:0x00bb, B:39:0x00cd, B:43:0x00d7, B:45:0x00e0, B:46:0x00ef, B:47:0x00f4, B:48:0x0100, B:49:0x010f, B:50:0x0110), top: B:113:0x0019, outer: #1 }] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m60606x1(C13021hu c13021hu) {
        C13125nk c13125nkM60226wp;
        C13125nk c13125nkM61253c5;
        C12969en c12969en;
        C13125nk c13125nkM60226wp2;
        String strM60706jd;
        if (c13021hu.m60679e0()) {
            m61169k4("Circular element reference.", c13021hu);
            return;
        }
        if (c13021hu.m60697b3() != null) {
            return;
        }
        c13021hu.m60681h4(true);
        try {
            try {
                if (c13021hu.m60720ne().m65287kk()) {
                    if (c13021hu.m60727uz() != null) {
                        c13021hu.m60731x1(c13021hu.m60727uz());
                    } else if (c13021hu.m60724u4().m65287kk()) {
                        if (c13021hu.m60705ix().m65287kk()) {
                            c13021hu.m60731x1(C12969en.m60399k4());
                            c13125nkM60226wp = C12969en.m60399k4().m60226wp();
                        } else {
                            C13021hu c13021hu2 = (C13021hu) this.f43671to.m61717ks().m60649kk(c13021hu.m60705ix());
                            if (c13021hu2 == null) {
                                throw new XmlSchemaException("Substitution group refers to '{0}', an undeclared element.", c13021hu.m60705ix().m65289x1(), c13021hu);
                            }
                            if (c13021hu2.m60679e0()) {
                                c13021hu.m60681h4(false);
                                return;
                            }
                            m60606x1(c13021hu2);
                            if (c13021hu2.m60697b3() == null) {
                                c13021hu.m60731x1(C12969en.m60399k4());
                                c13125nkM60226wp = C12969en.m60399k4().m60226wp();
                            } else {
                                c13021hu.m60731x1(c13021hu2.m60696ar());
                                c13125nkM60226wp = c13021hu2.m60697b3();
                            }
                        }
                        c13125nkM61253c5 = c13125nkM60226wp.m61253c5();
                        if (c13125nkM61253c5 == null) {
                            if (C7019kk.m27469x1(c13021hu.m60696ar(), C12969en.class)) {
                                C12969en c12969en2 = (C12969en) c13021hu.m60696ar();
                                m60605x1(c12969en2);
                                if (c12969en2.m60226wp() != null) {
                                    c13125nkM60226wp2 = c12969en2.m60226wp();
                                    c13125nkM61253c5 = c13125nkM60226wp2.m61253c5();
                                }
                            } else if (C7019kk.m27469x1(c13021hu.m60696ar(), C13164q9.class)) {
                                C13164q9 c13164q9 = (C13164q9) c13021hu.m60696ar();
                                m60610x1(c13164q9);
                                if (c13164q9.m60226wp() != null) {
                                    c13125nkM60226wp2 = c13164q9.m60226wp();
                                    c13125nkM61253c5 = c13125nkM60226wp2.m61253c5();
                                }
                            }
                        }
                        c13125nkM61253c5.m61436k4(c13021hu.m60721qq());
                        c13125nkM61253c5.m61278to(c13021hu.m60713k4());
                        c12969en = (C12969en) C7019kk.m27452k4((Object) c13021hu.m60696ar(), C12969en.class);
                        if (c12969en != null) {
                            c13125nkM61253c5.m61278to(c12969en.m60408dy() | c13125nkM61253c5.m61261jd());
                        }
                        c13125nkM61253c5.m61256du(c13021hu.m60726up());
                        c13125nkM61253c5.m61264k4(c13125nkM61253c5.m61258fa() | c13021hu.m60725um());
                    } else {
                        c13021hu.m60731x1(m60598kk(c13021hu.m60724u4()));
                        if (c13021hu.m60696ar() == null) {
                            throw new XmlSchemaException("Type '{0}' is not declared.", c13021hu.m60724u4().toString(), c13021hu);
                        }
                    }
                    c13125nkM61253c5 = null;
                    if (c13125nkM61253c5 == null) {
                    }
                    c13125nkM61253c5.m61436k4(c13021hu.m60721qq());
                    c13125nkM61253c5.m61278to(c13021hu.m60713k4());
                    c12969en = (C12969en) C7019kk.m27452k4((Object) c13021hu.m60696ar(), C12969en.class);
                    if (c12969en != null) {
                    }
                    c13125nkM61253c5.m61256du(c13021hu.m60726up());
                    c13125nkM61253c5.m61264k4(c13125nkM61253c5.m61258fa() | c13021hu.m60725um());
                } else {
                    C13021hu c13021hu3 = (C13021hu) this.f43671to.m61717ks().m60649kk(c13021hu.m60720ne());
                    if (c13021hu3 == null) {
                        throw new XmlSchemaException("The '{0}' element is not declared.", c13021hu.m60720ne().toString(), c13021hu);
                    }
                    m60606x1(c13021hu3);
                    if (c13021hu3.m60697b3() == null) {
                        throw new XmlSchemaException("Reference to invalid element '{0}'.", c13021hu.m60720ne().toString(), c13021hu);
                    }
                    c13021hu.m60731x1(c13021hu3.m60696ar());
                    c13125nkM61253c5 = c13021hu3.m60697b3().m61253c5();
                }
                if (c13125nkM61253c5.m61429b3() != null) {
                    c13125nkM61253c5.m61429b3().mo60029k4(this.f43671to.m61719ne(), (AbstractC13018hl) c13021hu);
                }
                if ((c13021hu.m60719m9() != null || c13021hu.m60706jd() != null) && c13125nkM61253c5.m61276rv() != null) {
                    if (c13125nkM61253c5.m61276rv().m61460x1() == 0) {
                        if (c13021hu.m60719m9() != null) {
                            c13125nkM61253c5.m61442m9(0);
                            strM60706jd = c13021hu.m60719m9();
                        } else {
                            c13125nkM61253c5.m61442m9(3);
                            strM60706jd = c13021hu.m60706jd();
                        }
                        c13125nkM61253c5.m61444to(strM60706jd);
                        if (c13125nkM61253c5.m61429b3() != null) {
                            c13125nkM61253c5.m61437k4(c13125nkM61253c5.m61429b3().mo60026k4(c13125nkM61253c5.m61427ak(), m61165k4(), (InterfaceC13980t6) new C13270wt(c13021hu), true));
                        }
                    } else if (c13125nkM61253c5.m61276rv().m61460x1() != 3 || !c13125nkM61253c5.m61276rv().mo61457k4()) {
                        throw new XmlSchemaException("Element's type does not allow fixed or default value constraint.", c13021hu);
                    }
                }
                if (c13021hu.m60728v4()) {
                    C12908be c12908beM60729wl = c13021hu.m60729wl();
                    C13241up[] c13241upArr = new C13241up[c12908beM60729wl.size()];
                    int i = 0;
                    int i2 = 0;
                    while (i < c12908beM60729wl.size()) {
                        C12887a0 c12887a0 = (C12887a0) c12908beM60729wl.get_Item(i);
                        m60565k4(c12887a0);
                        c13241upArr[i2] = c12887a0.m59979dy();
                        i++;
                        i2++;
                    }
                    c13125nkM61253c5.m61270k4(c13241upArr);
                }
                c13125nkM61253c5.m61266k4(c13021hu);
                c13021hu.m60710k4(c13125nkM61253c5);
                c13021hu.m60681h4(false);
            } catch (XmlSchemaException e) {
                if (e.getSourceSchemaObject() == null) {
                    e.setSource(c13021hu);
                }
                m61166k4(e);
                c13021hu.m60710k4(C13125nk.f44145k4);
                c13021hu.m60681h4(false);
            }
        } catch (Throwable th) {
            c13021hu.m60681h4(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m60558k4(C12990fw c12990fw, boolean z, boolean z2) {
        C13147p5 c13147p5M60634h4 = c12990fw.m60634h4() != null ? c12990fw.m60634h4() : (C13147p5) this.f43671to.m61735x6().m60649kk(c12990fw.m60635k4());
        if (c13147p5M60634h4 == null) {
            m61171k4("Reference to undeclared model group '{0}'.", c12990fw.m60635k4().toString(), c12990fw);
            return AbstractC12950dp.f43531k4;
        }
        if (c13147p5M60634h4.m61388m9() == null) {
            m60608x1(c13147p5M60634h4);
        }
        AbstractC12950dp abstractC12950dpM61388m9 = c13147p5M60634h4.m61388m9();
        AbstractC12950dp abstractC12950dp = AbstractC12950dp.f43531k4;
        if (abstractC12950dpM61388m9 != abstractC12950dp) {
            AbstractC13054jn abstractC13054jn = (AbstractC13054jn) c13147p5M60634h4.m61388m9();
            if (C7019kk.m27469x1(abstractC13054jn, C13141op.class)) {
                if (!z) {
                    m61171k4("The group ref to 'all' is not the root particle, or it is being used as an extension.", "", c12990fw);
                    return abstractC12950dp;
                }
                C14046bv c14046bvM60245g8 = c12990fw.m60245g8();
                C14046bv c14046bv = C14046bv.f47169to;
                if (C14046bv.m66484m9(c14046bvM60245g8, c14046bv) || C14046bv.m66484m9(c12990fw.m60248sv(), c14046bv)) {
                    m61169k4("The group ref to 'all' must have {min occurs}= 0 or 1 and {max occurs}=1.", c12990fw);
                    return abstractC12950dp;
                }
            } else if (C7019kk.m27469x1(abstractC13054jn, C13132o2.class) && abstractC13054jn.mo61012k4().size() == 0) {
                if (C14046bv.m66484m9(c12990fw.m60245g8(), C14046bv.f47165du)) {
                    m61170k4("Empty choice cannot be satisfied if 'minOccurs' is not equal to 0.", c12990fw, 1);
                }
            }
            AbstractC13054jn c13193s0 = C7019kk.m27469x1(abstractC13054jn, C13193s0.class) ? new C13193s0() : C7019kk.m27469x1(abstractC13054jn, C13132o2.class) ? new C13132o2() : new C13141op();
            c13193s0.m60246k4(c12990fw.m60245g8().Clone());
            c13193s0.m60250x1(c12990fw.m60248sv().Clone());
            for (int i = 0; i < abstractC13054jn.mo61012k4().size(); i++) {
                c13193s0.mo61012k4().m60092k4((AbstractC12950dp) abstractC13054jn.mo61012k4().get_Item(i));
            }
            c12990fw.m60636k4(c13193s0);
            return c13193s0;
        }
        return abstractC12950dp;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0199 A[Catch: all -> 0x007f, XmlSchemaException -> 0x0082, TryCatch #0 {XmlSchemaException -> 0x0082, blocks: (B:10:0x0019, B:12:0x0024, B:14:0x0036, B:16:0x003f, B:18:0x004d, B:20:0x0053, B:22:0x0059, B:24:0x005f, B:27:0x006f, B:28:0x007e, B:33:0x0085, B:34:0x00a7, B:35:0x00ab, B:36:0x00ba, B:37:0x00bb, B:39:0x00c1, B:41:0x00c7, B:43:0x00cd, B:44:0x00f0, B:45:0x00f4, B:61:0x0193, B:63:0x0199, B:64:0x01a6, B:66:0x01ac, B:69:0x01b3, B:84:0x0204, B:74:0x01be, B:75:0x01c2, B:76:0x01c7, B:78:0x01cd, B:79:0x01d7, B:81:0x01e6, B:83:0x01ec, B:80:0x01db, B:46:0x00f9, B:47:0x0108, B:48:0x0109, B:49:0x0118, B:50:0x0119, B:52:0x0128, B:53:0x0149, B:55:0x0153, B:57:0x015d, B:58:0x016b, B:59:0x017a, B:60:0x017b), top: B:95:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac A[Catch: all -> 0x007f, XmlSchemaException -> 0x0082, TryCatch #0 {XmlSchemaException -> 0x0082, blocks: (B:10:0x0019, B:12:0x0024, B:14:0x0036, B:16:0x003f, B:18:0x004d, B:20:0x0053, B:22:0x0059, B:24:0x005f, B:27:0x006f, B:28:0x007e, B:33:0x0085, B:34:0x00a7, B:35:0x00ab, B:36:0x00ba, B:37:0x00bb, B:39:0x00c1, B:41:0x00c7, B:43:0x00cd, B:44:0x00f0, B:45:0x00f4, B:61:0x0193, B:63:0x0199, B:64:0x01a6, B:66:0x01ac, B:69:0x01b3, B:84:0x0204, B:74:0x01be, B:75:0x01c2, B:76:0x01c7, B:78:0x01cd, B:79:0x01d7, B:81:0x01e6, B:83:0x01ec, B:80:0x01db, B:46:0x00f9, B:47:0x0108, B:48:0x0109, B:49:0x0118, B:50:0x0119, B:52:0x0128, B:53:0x0149, B:55:0x0153, B:57:0x015d, B:58:0x016b, B:59:0x017a, B:60:0x017b), top: B:95:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c7 A[Catch: all -> 0x007f, XmlSchemaException -> 0x0082, TryCatch #0 {XmlSchemaException -> 0x0082, blocks: (B:10:0x0019, B:12:0x0024, B:14:0x0036, B:16:0x003f, B:18:0x004d, B:20:0x0053, B:22:0x0059, B:24:0x005f, B:27:0x006f, B:28:0x007e, B:33:0x0085, B:34:0x00a7, B:35:0x00ab, B:36:0x00ba, B:37:0x00bb, B:39:0x00c1, B:41:0x00c7, B:43:0x00cd, B:44:0x00f0, B:45:0x00f4, B:61:0x0193, B:63:0x0199, B:64:0x01a6, B:66:0x01ac, B:69:0x01b3, B:84:0x0204, B:74:0x01be, B:75:0x01c2, B:76:0x01c7, B:78:0x01cd, B:79:0x01d7, B:81:0x01e6, B:83:0x01ec, B:80:0x01db, B:46:0x00f9, B:47:0x0108, B:48:0x0109, B:49:0x0118, B:50:0x0119, B:52:0x0128, B:53:0x0149, B:55:0x0153, B:57:0x015d, B:58:0x016b, B:59:0x017a, B:60:0x017b), top: B:95:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd A[Catch: all -> 0x007f, XmlSchemaException -> 0x0082, TryCatch #0 {XmlSchemaException -> 0x0082, blocks: (B:10:0x0019, B:12:0x0024, B:14:0x0036, B:16:0x003f, B:18:0x004d, B:20:0x0053, B:22:0x0059, B:24:0x005f, B:27:0x006f, B:28:0x007e, B:33:0x0085, B:34:0x00a7, B:35:0x00ab, B:36:0x00ba, B:37:0x00bb, B:39:0x00c1, B:41:0x00c7, B:43:0x00cd, B:44:0x00f0, B:45:0x00f4, B:61:0x0193, B:63:0x0199, B:64:0x01a6, B:66:0x01ac, B:69:0x01b3, B:84:0x0204, B:74:0x01be, B:75:0x01c2, B:76:0x01c7, B:78:0x01cd, B:79:0x01d7, B:81:0x01e6, B:83:0x01ec, B:80:0x01db, B:46:0x00f9, B:47:0x0108, B:48:0x0109, B:49:0x0118, B:50:0x0119, B:52:0x0128, B:53:0x0149, B:55:0x0153, B:57:0x015d, B:58:0x016b, B:59:0x017a, B:60:0x017b), top: B:95:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db A[Catch: all -> 0x007f, XmlSchemaException -> 0x0082, TryCatch #0 {XmlSchemaException -> 0x0082, blocks: (B:10:0x0019, B:12:0x0024, B:14:0x0036, B:16:0x003f, B:18:0x004d, B:20:0x0053, B:22:0x0059, B:24:0x005f, B:27:0x006f, B:28:0x007e, B:33:0x0085, B:34:0x00a7, B:35:0x00ab, B:36:0x00ba, B:37:0x00bb, B:39:0x00c1, B:41:0x00c7, B:43:0x00cd, B:44:0x00f0, B:45:0x00f4, B:61:0x0193, B:63:0x0199, B:64:0x01a6, B:66:0x01ac, B:69:0x01b3, B:84:0x0204, B:74:0x01be, B:75:0x01c2, B:76:0x01c7, B:78:0x01cd, B:79:0x01d7, B:81:0x01e6, B:83:0x01ec, B:80:0x01db, B:46:0x00f9, B:47:0x0108, B:48:0x0109, B:49:0x0118, B:50:0x0119, B:52:0x0128, B:53:0x0149, B:55:0x0153, B:57:0x015d, B:58:0x016b, B:59:0x017a, B:60:0x017b), top: B:95:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ec A[Catch: all -> 0x007f, XmlSchemaException -> 0x0082, TryCatch #0 {XmlSchemaException -> 0x0082, blocks: (B:10:0x0019, B:12:0x0024, B:14:0x0036, B:16:0x003f, B:18:0x004d, B:20:0x0053, B:22:0x0059, B:24:0x005f, B:27:0x006f, B:28:0x007e, B:33:0x0085, B:34:0x00a7, B:35:0x00ab, B:36:0x00ba, B:37:0x00bb, B:39:0x00c1, B:41:0x00c7, B:43:0x00cd, B:44:0x00f0, B:45:0x00f4, B:61:0x0193, B:63:0x0199, B:64:0x01a6, B:66:0x01ac, B:69:0x01b3, B:84:0x0204, B:74:0x01be, B:75:0x01c2, B:76:0x01c7, B:78:0x01cd, B:79:0x01d7, B:81:0x01e6, B:83:0x01ec, B:80:0x01db, B:46:0x00f9, B:47:0x0108, B:48:0x0109, B:49:0x0118, B:50:0x0119, B:52:0x0128, B:53:0x0149, B:55:0x0153, B:57:0x015d, B:58:0x016b, B:59:0x017a, B:60:0x017b), top: B:95:0x0019, outer: #1 }] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m60607x1(C13146p4 c13146p4) {
        C13061k5 c13061k5;
        C13164q9 c13164q9M61669k4;
        String strM61372x1;
        Object objMo60026k4;
        if (c13146p4.m60679e0()) {
            m61169k4("Circular attribute reference.", c13146p4);
            return;
        }
        if (c13146p4.m61369ks() != null) {
            return;
        }
        c13146p4.m60681h4(true);
        try {
            try {
                if (c13146p4.m61358dy().m65287kk()) {
                    c13061k5 = new C13061k5(c13146p4.m61359fa());
                    if (c13146p4.m61361jd() != null) {
                        m60610x1(c13146p4.m61361jd());
                        c13146p4.m61374x1(c13146p4.m61361jd());
                        c13061k5.m61435k4((C12943dd) c13146p4.m61361jd());
                        c13061k5.m61434k4(c13146p4.m61361jd().m60211bz());
                    } else if (c13146p4.m61355c5().m65287kk()) {
                        c13061k5.m61435k4((C12943dd) AbstractC13279x6.m61669k4());
                        c13061k5.m61434k4(AbstractC13279x6.m61669k4().m60211bz());
                        c13164q9M61669k4 = AbstractC13279x6.m61669k4();
                    } else {
                        C13164q9 c13164q9M60564k4 = m60564k4(c13146p4.m61355c5());
                        if (c13164q9M60564k4 == null) {
                            throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", c13146p4.m61355c5().toString(), c13146p4);
                        }
                        c13146p4.m61374x1(c13164q9M60564k4);
                        c13061k5.m61434k4(c13164q9M60564k4.m60211bz());
                        c13061k5.m61435k4((C12943dd) c13164q9M60564k4);
                    }
                    if (c13061k5.m61429b3() != null) {
                    }
                    if (c13146p4.m61362k4() == null) {
                        if (c13146p4.m61362k4() == null) {
                        }
                        c13061k5.m61444to(strM61372x1);
                        if (c13061k5.m61429b3() != null) {
                        }
                    }
                    c13061k5.m61035k4(c13146p4);
                    c13146p4.m61364k4(c13061k5);
                    c13146p4.m60681h4(false);
                }
                C13146p4 c13146p42 = (C13146p4) this.f43671to.m61701fa().m60649kk(c13146p4.m61358dy());
                if (c13146p42 == null) {
                    throw new XmlSchemaException("The '{0}' attribute is not declared.", c13146p4.m61358dy().toString(), c13146p4);
                }
                m60607x1(c13146p42);
                if (c13146p42.m61369ks() == null) {
                    throw new XmlSchemaException("Reference to invalid attribute '{0}'.", c13146p4.m61358dy().toString(), c13146p4);
                }
                c13061k5 = c13146p42.m61369ks().m61048uz();
                if (c13061k5.m61429b3() != null) {
                    if (c13146p42.m61372x1() != null) {
                        if (c13146p4.m61362k4() != null) {
                            throw new XmlSchemaException("The default value constraint cannot be present on the '{0}' attribute reference if the fixed value constraint is present on the declaration.", c13146p4.m61358dy().toString(), c13146p4);
                        }
                        if (c13146p4.m61372x1() == null) {
                            c13061k5.m61442m9(3);
                            String strM61372x12 = c13146p42.m61372x1();
                            c13061k5.m61037k4(strM61372x12);
                            c13061k5.m61444to(strM61372x12);
                            objMo60026k4 = c13061k5.m61429b3().mo60026k4(c13061k5.m61427ak(), m61165k4(), (InterfaceC13980t6) new C13270wt(c13146p4), true);
                            c13061k5.m61437k4(objMo60026k4);
                        } else if (!C14113y2.m67363du(c13146p4.m61372x1(), c13146p42.m61372x1())) {
                            throw new XmlSchemaException("The fixed value constraint on the '{0}' attribute reference must match the fixed value constraint on the declaration.", c13146p4.m61358dy().toString(), c13146p4);
                        }
                    } else if (c13146p42.m61362k4() != null && c13146p4.m61362k4() == null && c13146p4.m61372x1() == null) {
                        c13061k5.m61442m9(0);
                        String strM61362k4 = c13146p42.m61362k4();
                        c13061k5.m61037k4(strM61362k4);
                        c13061k5.m61444to(strM61362k4);
                        objMo60026k4 = c13061k5.m61429b3().mo60026k4(c13061k5.m61427ak(), m61165k4(), (InterfaceC13980t6) new C13270wt(c13146p4), true);
                        c13061k5.m61437k4(objMo60026k4);
                    }
                    if (c13061k5.m61429b3() != null) {
                        c13061k5.m61429b3().mo60029k4(this.f43671to.m61719ne(), (AbstractC13018hl) c13146p4);
                    }
                    if (c13146p4.m61362k4() == null && c13146p4.m61372x1() == null) {
                        int iM61356ck = c13146p4.m61356ck();
                        if (iM61356ck == 0 || iM61356ck == 1) {
                            c13061k5.m61442m9(2);
                        } else if (iM61356ck == 3) {
                            c13061k5.m61442m9(1);
                        }
                    } else {
                        if (c13146p4.m61362k4() == null) {
                            c13061k5.m61442m9(0);
                            strM61372x1 = c13146p4.m61362k4();
                            c13061k5.m61037k4(strM61372x1);
                        } else {
                            c13061k5.m61442m9(3);
                            strM61372x1 = c13146p4.m61372x1();
                            c13061k5.m61037k4(strM61372x1);
                        }
                        c13061k5.m61444to(strM61372x1);
                        if (c13061k5.m61429b3() != null) {
                            c13061k5.m61437k4(c13061k5.m61429b3().mo60026k4(c13061k5.m61427ak(), m61165k4(), (InterfaceC13980t6) new C13270wt(c13146p4), true));
                        }
                    }
                    c13061k5.m61035k4(c13146p4);
                    c13146p4.m61364k4(c13061k5);
                    c13146p4.m60681h4(false);
                }
                c13164q9M61669k4 = c13146p42.m61371up();
                c13146p4.m61374x1(c13164q9M61669k4);
                if (c13061k5.m61429b3() != null) {
                }
                if (c13146p4.m61362k4() == null) {
                }
                c13061k5.m61035k4(c13146p4);
                c13146p4.m61364k4(c13061k5);
                c13146p4.m60681h4(false);
            } catch (XmlSchemaException e) {
                if (e.getSourceSchemaObject() == null) {
                    e.setSource(c13146p4);
                }
                m61166k4(e);
                c13146p4.m61364k4(C13061k5.f44035k4);
                c13146p4.m60681h4(false);
            }
        } catch (Throwable th) {
            c13146p4.m60681h4(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m60559k4(C13021hu c13021hu, boolean z) {
        C13103mh c13103mh;
        if (c13021hu.m60720ne().m65287kk() || !z || (c13021hu.m60725um() & 1) != 0 || (c13103mh = (C13103mh) this.f43672x1.m60649kk(c13021hu.m60721qq())) == null) {
            return c13021hu;
        }
        C13132o2 c13132o2 = (C13132o2) c13103mh.m61180kk().mo60427wy();
        c13132o2.m60246k4(c13021hu.m60245g8().Clone());
        c13132o2.m60250x1(c13021hu.m60248sv().Clone());
        return c13132o2;
    }

    /* JADX INFO: renamed from: x1 */
    private void m60608x1(C13147p5 c13147p5) {
        if (c13147p5.m60679e0()) {
            m61169k4("Circular group reference.", c13147p5);
            c13147p5.m61384k4(AbstractC12950dp.f43531k4);
        } else {
            c13147p5.m60681h4(true);
            if (c13147p5.m61388m9() == null) {
                c13147p5.m61384k4(m60557k4((AbstractC12950dp) c13147p5.m61389x1(), true, true));
            }
            c13147p5.m60681h4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m60560k4(C13132o2 c13132o2, boolean z, boolean z2) {
        C13132o2 c13132o22;
        if (c13132o2.mo61012k4().size() > 0) {
            c13132o22 = new C13132o2();
            c13132o22.m60246k4(c13132o2.m60245g8().Clone());
            c13132o22.m60250x1(c13132o2.m60248sv().Clone());
            for (int i = 0; i < c13132o2.mo61012k4().size(); i++) {
                AbstractC12950dp abstractC12950dpM60557k4 = m60557k4((AbstractC12950dp) c13132o2.mo61012k4().get_Item(i), false, z2);
                if (abstractC12950dpM60557k4 != AbstractC12950dp.f43531k4) {
                    C14046bv c14046bvM60245g8 = abstractC12950dpM60557k4.m60245g8();
                    C14046bv c14046bv = C14046bv.f47169to;
                    if (C14046bv.m66453dy(c14046bvM60245g8, c14046bv) && C14046bv.m66453dy(abstractC12950dpM60557k4.m60248sv(), c14046bv) && C7019kk.m27469x1(abstractC12950dpM60557k4, C13132o2.class)) {
                        C13132o2 c13132o23 = (C13132o2) abstractC12950dpM60557k4;
                        for (int i2 = 0; i2 < c13132o23.mo61012k4().size(); i2++) {
                            c13132o22.mo61012k4().m60092k4(c13132o23.mo61012k4().get_Item(i2));
                        }
                    } else {
                        c13132o22.mo61012k4().m60092k4(abstractC12950dpM60557k4);
                    }
                }
            }
        } else {
            c13132o22 = c13132o2;
        }
        if (!z && c13132o22.mo61012k4().size() == 0) {
            if (C14046bv.m66484m9(c13132o22.m60245g8(), C14046bv.f47165du)) {
                m61170k4("Empty choice cannot be satisfied if 'minOccurs' is not equal to 0.", c13132o2, 1);
            }
            return AbstractC12950dp.f43531k4;
        }
        if (!z && c13132o22.mo61012k4().size() == 1) {
            C14046bv c14046bvM60245g82 = c13132o22.m60245g8();
            C14046bv c14046bv2 = C14046bv.f47169to;
            if (C14046bv.m66453dy(c14046bvM60245g82, c14046bv2) && C14046bv.m66453dy(c13132o22.m60248sv(), c14046bv2)) {
                return (AbstractC12950dp) c13132o22.mo61012k4().get_Item(0);
            }
        }
        return c13132o22;
    }

    /* JADX INFO: renamed from: x1 */
    private void m60609x1(C13149p8 c13149p8) {
        if (c13149p8.m60679e0()) {
            m61169k4("Circular attribute group reference.", c13149p8);
            return;
        }
        if (c13149p8.m61393dy().m60651x1() > 0) {
            return;
        }
        c13149p8.m60681h4(true);
        C13106mq c13106mqM61394h4 = c13149p8.m61394h4();
        for (int i = 0; i < c13149p8.m61402x1().size(); i++) {
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c13149p8.m61402x1().get_Item(i), C13146p4.class);
            if (c13146p4 != null) {
                if (c13146p4.m61356ck() != 2) {
                    m60607x1(c13146p4);
                }
                if (c13149p8.m61393dy().m60649kk(c13146p4.m61359fa()) == null) {
                    c13149p8.m61393dy().m60647k4(c13146p4.m61359fa(), c13146p4);
                } else {
                    m61171k4("The attribute '{0}' already exists.", c13146p4.m61359fa().toString(), c13146p4);
                }
            } else {
                C13161q1 c13161q1 = (C13161q1) c13149p8.m61402x1().get_Item(i);
                C13149p8 c13149p8M61395jd = (c13149p8.m61395jd() == null || !C13890ei.m65278k4(c13161q1.m61409k4(), c13149p8.m61395jd().m61401m9())) ? (C13149p8) this.f43671to.m61727up().m60649kk(c13161q1.m61409k4()) : c13149p8.m61395jd();
                if (c13149p8M61395jd != null) {
                    m60609x1(c13149p8M61395jd);
                    Iterator it = c13149p8M61395jd.m61393dy().m60648kk().iterator();
                    while (it.hasNext()) {
                        try {
                            C13146p4 c13146p42 = (C13146p4) it.next();
                            if (c13149p8.m61393dy().m60649kk(c13146p42.m61359fa()) == null) {
                                c13149p8.m61393dy().m60647k4(c13146p42.m61359fa(), c13146p42);
                            } else {
                                m61171k4("The attribute '{0}' already exists.", c13146p42.m61359fa().toString(), c13146p42);
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it).dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    c13106mqM61394h4 = m60604x1(c13106mqM61394h4, c13149p8M61395jd.m61391c5());
                } else {
                    m61171k4("Reference to undeclared attribute group '{0}'.", c13161q1.m61409k4().toString(), c13161q1);
                }
            }
        }
        c13149p8.m61403x1(c13106mqM61394h4);
        c13149p8.m60681h4(false);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m60561k4(C13141op c13141op, boolean z, boolean z2) {
        if (c13141op.mo61012k4().size() > 0) {
            C13141op c13141op2 = new C13141op();
            c13141op2.m60246k4(c13141op.m60245g8().Clone());
            c13141op2.m60250x1(c13141op.m60248sv().Clone());
            c13141op2.m60688m9(c13141op.m60693xk());
            c13141op2.m60680h4(c13141op.m60676ak());
            c13141op2.m60687m9(c13141op.m60678dq());
            for (int i = 0; i < c13141op.mo61012k4().size(); i++) {
                AbstractC12950dp abstractC12950dpM60557k4 = m60557k4((AbstractC12950dp) c13141op.mo61012k4().get_Item(i), false, z2);
                if (abstractC12950dpM60557k4 != AbstractC12950dp.f43531k4) {
                    c13141op2.mo61012k4().m60092k4(abstractC12950dpM60557k4);
                }
            }
            c13141op = c13141op2;
        }
        if (c13141op.mo61012k4().size() == 0) {
            return AbstractC12950dp.f43531k4;
        }
        if (z && c13141op.mo61012k4().size() == 1) {
            C13193s0 c13193s0 = new C13193s0();
            c13193s0.m60246k4(c13141op.m60245g8().Clone());
            c13193s0.m60250x1(c13141op.m60248sv().Clone());
            c13193s0.mo61012k4().m60092k4((AbstractC12950dp) c13141op.mo61012k4().get_Item(0));
            return c13193s0;
        }
        if (!z && c13141op.mo61012k4().size() == 1) {
            C14046bv c14046bvM60245g8 = c13141op.m60245g8();
            C14046bv c14046bv = C14046bv.f47169to;
            if (C14046bv.m66453dy(c14046bvM60245g8, c14046bv) && C14046bv.m66453dy(c13141op.m60248sv(), c14046bv)) {
                return (AbstractC12950dp) c13141op.mo61012k4().get_Item(0);
            }
        }
        if (z) {
            return c13141op;
        }
        m61169k4("'all' is not the only particle in a group, or is being used as an extension.", c13141op);
        return AbstractC12950dp.f43531k4;
    }

    /* JADX INFO: renamed from: x1 */
    private void m60610x1(C13164q9 c13164q9) {
        int i;
        AbstractC12892ae abstractC12892aeM60211bz;
        C12943dd c12943ddM60221ss;
        AbstractC12892ae abstractC12892aeM60211bz2;
        if (c13164q9.m60679e0()) {
            throw new XmlSchemaException("Circular type reference.", c13164q9);
        }
        if (c13164q9.m60226wp() != null) {
            return;
        }
        c13164q9.m60681h4(true);
        try {
            try {
                if (C7019kk.m27469x1(c13164q9.m61416k4(), C13263wh.class)) {
                    C13263wh c13263wh = (C13263wh) c13164q9.m61416k4();
                    c13164q9.m60218k4((C12943dd) AbstractC13279x6.m61669k4());
                    i = 8;
                    if (c13263wh.m61658k4().m65287kk()) {
                        m60610x1(c13263wh.m61661x1());
                        c13263wh.m61662x1(c13263wh.m61661x1());
                        abstractC12892aeM60211bz2 = c13263wh.m61661x1().m60211bz();
                    } else {
                        C13164q9 c13164q9M60564k4 = m60564k4(c13263wh.m61658k4());
                        if (c13164q9M60564k4 == null) {
                            throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", c13263wh.m61658k4().toString(), c13164q9);
                        }
                        if ((c13164q9M60564k4.m60225v4() & 8) != 0) {
                            m61169k4("The base type is the final list.", c13164q9);
                        }
                        c13263wh.m61662x1(c13164q9M60564k4);
                        abstractC12892aeM60211bz2 = c13164q9M60564k4.m60211bz();
                    }
                    c13164q9.m60217k4(abstractC12892aeM60211bz2.mo60024k4((C12943dd) c13164q9));
                } else {
                    if (!C7019kk.m27469x1(c13164q9.m61416k4(), C13261w8.class)) {
                        C13164q9[] c13164q9ArrM60600kk = m60600kk(c13164q9);
                        c13164q9.m60218k4((C12943dd) AbstractC13279x6.m61669k4());
                        c13164q9.m60217k4(AbstractC12892ae.m60014x1(c13164q9ArrM60600kk, (C12943dd) c13164q9));
                        c13164q9.m60214dy(16);
                        C13125nk c13125nk = new C13125nk();
                        c13125nk.m61269k4(C13192rv.f44275x1);
                        c13125nk.m61435k4((C12943dd) c13164q9);
                        c13125nk.m61434k4(c13164q9.m60211bz());
                        c13164q9.m60219k4(c13125nk);
                        c13164q9.m60681h4(false);
                    }
                    C13261w8 c13261w8 = (C13261w8) c13164q9.m61416k4();
                    i = 4;
                    if (c13261w8.m61653k4().m65287kk()) {
                        m60610x1(c13261w8.m61656x1());
                        c13164q9.m60218k4((C12943dd) c13261w8.m61656x1());
                        c12943ddM60221ss = c13261w8.m61656x1();
                    } else if (c13164q9.m60221ss() != null && C13890ei.m65278k4(c13261w8.m61653k4(), c13164q9.m60221ss().m60210bv())) {
                        m60610x1((C13164q9) c13164q9.m60221ss());
                        c13164q9.m60218k4(c13164q9.m60221ss().m60231yd());
                        c12943ddM60221ss = c13164q9.m60221ss();
                    } else {
                        if (c13261w8.m61653k4().equals(AbstractC13279x6.f44493k4)) {
                            throw new XmlSchemaException("Restriction of 'anySimpleType' is not allowed.", c13261w8.m61653k4().toString(), c13164q9);
                        }
                        C13164q9 c13164q9M60564k42 = m60564k4(c13261w8.m61653k4());
                        if (c13164q9M60564k42 == null) {
                            throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", c13261w8.m61653k4().toString(), c13164q9);
                        }
                        if ((c13164q9M60564k42.m60225v4() & 4) != 0) {
                            m61169k4("The base type is final restriction.", c13164q9);
                        }
                        c13164q9.m60218k4((C12943dd) c13164q9M60564k42);
                        abstractC12892aeM60211bz = c13164q9M60564k42.m60211bz();
                        c13164q9.m60217k4(abstractC12892aeM60211bz.mo60023k4(c13261w8.m61652h4(), m61165k4(), c13164q9));
                    }
                    abstractC12892aeM60211bz = c12943ddM60221ss.m60211bz();
                    c13164q9.m60217k4(abstractC12892aeM60211bz.mo60023k4(c13261w8.m61652h4(), m61165k4(), c13164q9));
                }
                c13164q9.m60214dy(i);
                C13125nk c13125nk2 = new C13125nk();
                c13125nk2.m61269k4(C13192rv.f44275x1);
                c13125nk2.m61435k4((C12943dd) c13164q9);
                c13125nk2.m61434k4(c13164q9.m60211bz());
                c13164q9.m60219k4(c13125nk2);
                c13164q9.m60681h4(false);
            } catch (XmlSchemaException e) {
                if (e.getSourceSchemaObject() == null) {
                    e.setSource(c13164q9);
                }
                m61166k4(e);
                c13164q9.m60217k4(AbstractC13279x6.m61669k4().m60211bz());
                C13125nk c13125nk3 = new C13125nk();
                c13125nk3.m61269k4(C13192rv.f44275x1);
                c13125nk3.m61435k4((C12943dd) c13164q9);
                c13125nk3.m61434k4(c13164q9.m60211bz());
                c13164q9.m60219k4(c13125nk3);
                c13164q9.m60681h4(false);
            }
        } catch (Throwable th) {
            C13125nk c13125nk4 = new C13125nk();
            c13125nk4.m61269k4(C13192rv.f44275x1);
            c13125nk4.m61435k4((C12943dd) c13164q9);
            c13125nk4.m61434k4(c13164q9.m60211bz());
            c13164q9.m60219k4(c13125nk4);
            c13164q9.m60681h4(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m60562k4(C13193s0 c13193s0, boolean z, boolean z2) {
        if (c13193s0.mo61012k4().size() > 0) {
            C13193s0 c13193s02 = new C13193s0();
            c13193s02.m60246k4(c13193s0.m60245g8().Clone());
            c13193s02.m60250x1(c13193s0.m60248sv().Clone());
            for (int i = 0; i < c13193s0.mo61012k4().size(); i++) {
                AbstractC12950dp abstractC12950dpM60557k4 = m60557k4((AbstractC12950dp) c13193s0.mo61012k4().get_Item(i), false, z2);
                if (abstractC12950dpM60557k4 != AbstractC12950dp.f43531k4) {
                    C14046bv c14046bvM60245g8 = abstractC12950dpM60557k4.m60245g8();
                    C14046bv c14046bv = C14046bv.f47169to;
                    if (C14046bv.m66453dy(c14046bvM60245g8, c14046bv) && C14046bv.m66453dy(abstractC12950dpM60557k4.m60248sv(), c14046bv) && C7019kk.m27469x1(abstractC12950dpM60557k4, C13193s0.class)) {
                        C13193s0 c13193s03 = (C13193s0) abstractC12950dpM60557k4;
                        for (int i2 = 0; i2 < c13193s03.mo61012k4().size(); i2++) {
                            c13193s02.mo61012k4().m60092k4(c13193s03.mo61012k4().get_Item(i2));
                        }
                    } else {
                        c13193s02.mo61012k4().m60092k4(abstractC12950dpM60557k4);
                    }
                }
            }
            c13193s0 = c13193s02;
        }
        if (c13193s0.mo61012k4().size() == 0) {
            return AbstractC12950dp.f43531k4;
        }
        if (z || c13193s0.mo61012k4().size() != 1) {
            return c13193s0;
        }
        C14046bv c14046bvM60245g82 = c13193s0.m60245g8();
        C14046bv c14046bv2 = C14046bv.f47169to;
        return (C14046bv.m66453dy(c14046bvM60245g82, c14046bv2) && C14046bv.m66453dy(c13193s0.m60248sv(), c14046bv2)) ? (AbstractC12950dp) c13193s0.mo61012k4().get_Item(0) : c13193s0;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m60611x1(AbstractC12950dp abstractC12950dp) {
        C14046bv[] c14046bvArr = {new C14046bv()};
        m60568k4(abstractC12950dp, c14046bvArr, new C14046bv[]{new C14046bv()});
        return C14046bv.m66453dy(c14046bvArr[0], C14046bv.f47165du);
    }

    /* JADX INFO: renamed from: k4 */
    private C13106mq m60563k4(C13106mq c13106mq, C13106mq c13106mq2) {
        if (c13106mq == null) {
            return c13106mq2;
        }
        if (c13106mq2 == null) {
            return c13106mq;
        }
        C13106mq c13106mqM61183x1 = C13106mq.m61183x1(c13106mq, c13106mq2, true);
        if (c13106mqM61183x1 == null) {
            m61169k4("The 'anyAttribute' is not expressible.", c13106mq);
        }
        return c13106mqM61183x1;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m60612x1(AbstractC12950dp abstractC12950dp, AbstractC12950dp abstractC12950dp2) {
        return m60597k4(abstractC12950dp.m60245g8().Clone(), abstractC12950dp.m60248sv().Clone(), abstractC12950dp2.m60245g8().Clone(), abstractC12950dp2.m60248sv().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private C13164q9 m60564k4(C13890ei c13890ei) {
        C13164q9 c13164q9 = (C13164q9) C7019kk.m27452k4((Object) this.f43671to.m61737yj().m60649kk(c13890ei), C13164q9.class);
        if (c13164q9 != null) {
            m60610x1(c13164q9);
            return c13164q9;
        }
        C13164q9 c13164q9M61670k4 = AbstractC13279x6.m61670k4(c13890ei);
        return c13164q9M61670k4 != null ? c13164q9M61670k4.m60220qm() == 31 ? AbstractC13279x6.m61680to() : c13164q9M61670k4.m60220qm() == 32 ? AbstractC13279x6.m61667du() : c13164q9M61670k4 : c13164q9M61670k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m60565k4(C12887a0 c12887a0) {
        if (c12887a0.m60679e0()) {
            c12887a0.m59984k4(C13241up.f44416kk);
            m61169k4("Circular identity constraint reference.", c12887a0);
            return;
        }
        if (c12887a0.m59979dy() != null) {
            return;
        }
        c12887a0.m60681h4(true);
        try {
            try {
                C13241up c13241up = new C13241up(c12887a0, new C13270wt(c12887a0));
                if (C7019kk.m27469x1(c12887a0, C13145p3.class)) {
                    C12887a0 c12887a02 = (C12887a0) this.f43671to.m61703ix().m60649kk(((C13145p3) c12887a0).m61353c5());
                    if (c12887a02 == null) {
                        throw new XmlSchemaException("The '{0}' identity constraint is not declared.", ((C13145p3) c12887a0).m61353c5().toString(), c12887a0);
                    }
                    m60565k4(c12887a02);
                    if (c12887a02.m59979dy() == null) {
                        throw new XmlSchemaException("Reference to an invalid identity constraint, '{0}'.", ((C13145p3) c12887a0).m61353c5().toString(), c12887a0);
                    }
                    if (c12887a02.m59980h4().size() != c12887a0.m59980h4().size()) {
                        throw new XmlSchemaException("Keyref '{0}' has different cardinality as the referred key or unique element.", c12887a0.m59986m9().toString(), c12887a0);
                    }
                    if (c12887a02.m59979dy().m61636k4() == 2) {
                        throw new XmlSchemaException("The '{0}' Keyref can refer to key or unique only.", c12887a0.m59986m9().toString(), c12887a0);
                    }
                }
                c12887a0.m59984k4(c13241up);
                c12887a0.m60681h4(false);
            } catch (XmlSchemaException e) {
                if (e.getSourceSchemaObject() == null) {
                    e.setSource(c12887a0);
                }
                m61166k4(e);
                c12887a0.m59984k4(C13241up.f44416kk);
                c12887a0.m60681h4(false);
            }
        } catch (Throwable th) {
            c12887a0.m60681h4(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m60566k4(C12908be c12908be) {
        for (int i = 0; i < c12908be.size(); i++) {
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12908be.get_Item(i), C13146p4.class);
            if (c13146p4 != null) {
                m60580k4(c13146p4);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m60567k4(AbstractC12950dp abstractC12950dp) {
        if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
            m60576k4((C13021hu) abstractC12950dp);
            return;
        }
        if (C7019kk.m27469x1(abstractC12950dp, AbstractC13054jn.class)) {
            C12908be c12908beMo61012k4 = ((AbstractC13054jn) abstractC12950dp).mo61012k4();
            for (int i = 0; i < c12908beMo61012k4.size(); i++) {
                m60567k4((AbstractC12950dp) c12908beMo61012k4.get_Item(i));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60568k4(AbstractC12950dp abstractC12950dp, C14046bv[] c14046bvArr, C14046bv[] c14046bvArr2) {
        if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class) || C7019kk.m27469x1(abstractC12950dp, C12989fu.class)) {
            abstractC12950dp.m60245g8().CloneTo(c14046bvArr[0]);
            abstractC12950dp.m60248sv().CloneTo(c14046bvArr2[0]);
            return;
        }
        if (C7019kk.m27469x1(abstractC12950dp, C13132o2.class)) {
            C13132o2 c13132o2 = (C13132o2) abstractC12950dp;
            if (c13132o2.mo61012k4().size() == 0) {
                C14046bv c14046bvClone = C14046bv.f47165du.Clone();
                c14046bvClone.CloneTo(c14046bvArr2[0]);
                c14046bvClone.CloneTo(c14046bvArr[0]);
                return;
            }
            C14046bv.f47170x1.CloneTo(c14046bvArr[0]);
            C14046bv.f47165du.CloneTo(c14046bvArr2[0]);
            for (int i = 0; i < c13132o2.mo61012k4().size(); i++) {
                C14046bv[] c14046bvArr3 = {new C14046bv()};
                C14046bv[] c14046bvArr4 = {new C14046bv()};
                m60568k4((AbstractC12950dp) c13132o2.mo61012k4().get_Item(i), c14046bvArr3, c14046bvArr4);
                C14046bv c14046bv = c14046bvArr3[0];
                C14046bv c14046bv2 = c14046bvArr4[0];
                if (C14046bv.m66448ck(c14046bv, c14046bvArr[0])) {
                    c14046bv.CloneTo(c14046bvArr[0]);
                }
                if (C14046bv.m66447c5(c14046bv2, c14046bvArr2[0])) {
                    c14046bv2.CloneTo(c14046bvArr2[0]);
                }
            }
            C14046bv.m66451du(c14046bvArr[0], abstractC12950dp.m60245g8()).CloneTo(c14046bvArr[0]);
            C14046bv c14046bv3 = c14046bvArr2[0];
            C14046bv c14046bv4 = C14046bv.f47170x1;
            if (C14046bv.m66484m9(c14046bv3, c14046bv4)) {
                if (C14046bv.m66453dy(abstractC12950dp.m60248sv(), c14046bv4)) {
                    c14046bv4.CloneTo(c14046bvArr2[0]);
                    return;
                } else {
                    C14046bv.m66451du(c14046bvArr2[0], abstractC12950dp.m60248sv()).CloneTo(c14046bvArr2[0]);
                    return;
                }
            }
            return;
        }
        C12908be c12908beMo61012k4 = ((AbstractC13054jn) abstractC12950dp).mo61012k4();
        if (c12908beMo61012k4.size() == 0) {
            C14046bv c14046bvClone2 = C14046bv.f47165du.Clone();
            c14046bvClone2.CloneTo(c14046bvArr2[0]);
            c14046bvClone2.CloneTo(c14046bvArr[0]);
            return;
        }
        C7019kk.m27440jd(0, 9).CloneTo(c14046bvArr[0]);
        C7019kk.m27440jd(0, 9).CloneTo(c14046bvArr2[0]);
        for (int i2 = 0; i2 < c12908beMo61012k4.size(); i2++) {
            C14046bv[] c14046bvArr5 = {new C14046bv()};
            C14046bv[] c14046bvArr6 = {new C14046bv()};
            m60568k4((AbstractC12950dp) c12908beMo61012k4.get_Item(i2), c14046bvArr5, c14046bvArr6);
            C14046bv c14046bv5 = c14046bvArr5[0];
            C14046bv c14046bv6 = c14046bvArr6[0];
            C14046bv.m66480kk(c14046bvArr[0], c14046bv5).CloneTo(c14046bvArr[0]);
            C14046bv c14046bv7 = c14046bvArr2[0];
            C14046bv c14046bv8 = C14046bv.f47170x1;
            if (C14046bv.m66484m9(c14046bv7, c14046bv8)) {
                if (C14046bv.m66453dy(c14046bv6, c14046bv8)) {
                    c14046bv8.CloneTo(c14046bvArr2[0]);
                } else {
                    C14046bv.m66480kk(c14046bvArr2[0], c14046bv6).CloneTo(c14046bvArr2[0]);
                }
            }
        }
        C14046bv.m66451du(c14046bvArr[0], abstractC12950dp.m60245g8()).CloneTo(c14046bvArr[0]);
        C14046bv c14046bv9 = c14046bvArr2[0];
        C14046bv c14046bv10 = C14046bv.f47170x1;
        if (C14046bv.m66484m9(c14046bv9, c14046bv10)) {
            if (C14046bv.m66453dy(abstractC12950dp.m60248sv(), c14046bv10)) {
                c14046bv10.CloneTo(c14046bvArr2[0]);
            } else {
                C14046bv.m66451du(c14046bvArr2[0], abstractC12950dp.m60248sv()).CloneTo(c14046bvArr2[0]);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m60569k4(C12969en c12969en) {
        C12908be c12908beM60424up;
        if (c12969en.m60407ck() == null) {
            m60567k4(c12969en.m60409fa());
            c12908beM60424up = c12969en.m60424up();
        } else if (C7019kk.m27469x1(c12969en.m60407ck(), C13268wr.class)) {
            C13268wr c13268wr = (C13268wr) c12969en.m60407ck();
            boolean zM27469x1 = C7019kk.m27469x1(c13268wr.m61663k4(), C13025i2.class);
            AbstractC13101mc abstractC13101mcM61663k4 = c13268wr.m61663k4();
            c12908beM60424up = zM27469x1 ? ((C13025i2) abstractC13101mcM61663k4).m60745x1() : ((C13039iv) abstractC13101mcM61663k4).m60757m9();
        } else {
            C12935cx c12935cx = (C12935cx) c12969en.m60407ck();
            boolean zM27469x12 = C7019kk.m27469x1(c12935cx.m60148x1(), C13258w2.class);
            AbstractC13101mc abstractC13101mcM60148x1 = c12935cx.m60148x1();
            if (zM27469x12) {
                C13258w2 c13258w2 = (C13258w2) abstractC13101mcM60148x1;
                m60567k4(c13258w2.m61651x1());
                c12908beM60424up = c13258w2.m61644h4();
            } else {
                C12913br c12913br = (C12913br) abstractC13101mcM60148x1;
                m60567k4(c12913br.m60105x1());
                c12908beM60424up = c12913br.m60098h4();
            }
        }
        m60566k4(c12908beM60424up);
        c12969en.m60426wl().m60645k4();
        c12969en.m60423u4().m60645k4();
        c12969en.m60430x1((C13106mq) null);
        c12969en.m60429x1(AbstractC12950dp.f43531k4);
        c12969en.m60219k4((C13125nk) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60570k4(C12969en c12969en, C12935cx c12935cx, C12913br c12913br) {
        C12969en c12969enM60603x1;
        if (c12969en.m60221ss() == null || !C13890ei.m65278k4(c12913br.m60099k4(), c12969en.m60221ss().m60210bv())) {
            c12969enM60603x1 = m60603x1(c12913br.m60099k4());
            if (c12969enM60603x1 == null) {
                m61171k4("Undefined complexType '{0}' is used as a base for complex type restriction.", c12913br.m60099k4().toString(), c12913br);
                return;
            }
        } else {
            c12969enM60603x1 = (C12969en) c12969en.m60221ss();
            m60605x1(c12969enM60603x1);
        }
        C12969en c12969en2 = c12969enM60603x1;
        if (c12969en2 != null && c12969en2.m60226wp() != null && c12969en2.m60419ks() == 0) {
            m61169k4("The content type of the base type must not be a simple type definition.", c12969en);
            return;
        }
        c12969en.m60218k4((C12943dd) c12969en2);
        if ((c12969en2.m60225v4() & 4) != 0) {
            m61169k4("The base type is final restriction.", c12969en);
        }
        m60573k4(c12969en2, c12969en, c12913br.m60098h4(), c12913br.m60104m9(), 4);
        c12969en.m60429x1(m60556k4(c12913br.m60105x1(), true));
        c12969en.m60212c5(m60555k4(c12969en, c12935cx, c12969en.m60420ne()));
        if (c12969en.m60419ks() == 1) {
            c12969en2.m60226wp();
            if (c12969en2.m60226wp() != null && !c12969en2.m60226wp().m61276rv().mo61457k4()) {
                m61169k4("Invalid content type derivation by restriction.", c12969en);
            }
        }
        c12969en.m60214dy(4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60571k4(C12969en c12969en, C12935cx c12935cx, C13258w2 c13258w2) {
        C12969en c12969enM60603x1;
        if (c12969en.m60221ss() == null || !C13890ei.m65278k4(c13258w2.m61645k4(), c12969en.m60221ss().m60210bv())) {
            c12969enM60603x1 = m60603x1(c13258w2.m61645k4());
            if (c12969enM60603x1 == null) {
                m61171k4("Undefined complexType '{0}' is used as a base for complex type extension.", c13258w2.m61645k4().toString(), c13258w2);
                return;
            }
        } else {
            c12969enM60603x1 = (C12969en) c12969en.m60221ss();
            m60605x1(c12969enM60603x1);
        }
        C12969en c12969en2 = c12969enM60603x1;
        if (c12969en2 != null && c12969en2.m60226wp() != null && c12969en2.m60419ks() == 0) {
            m61169k4("The content type of the base type must not be a simple type definition.", c12969en);
            return;
        }
        c12969en.m60218k4((C12943dd) c12969en2);
        if ((c12969en2.m60225v4() & 2) != 0) {
            m61169k4("The base type is the final extension.", c12969en);
        }
        m60573k4(c12969en2, c12969en, c13258w2.m61644h4(), c13258w2.m61650m9(), 2);
        AbstractC12950dp abstractC12950dpM60420ne = c12969en2.m60420ne();
        AbstractC12950dp abstractC12950dpM60557k4 = m60557k4(c13258w2.m61651x1(), true, true);
        AbstractC12950dp abstractC12950dp = AbstractC12950dp.f43531k4;
        if (abstractC12950dpM60420ne != abstractC12950dp) {
            if (abstractC12950dpM60557k4 != abstractC12950dp) {
                C13193s0 c13193s0 = new C13193s0();
                c13193s0.mo61012k4().m60092k4(abstractC12950dpM60420ne);
                c13193s0.mo61012k4().m60092k4(abstractC12950dpM60557k4);
                abstractC12950dpM60420ne = m60556k4((AbstractC12950dp) c13193s0, false);
            }
            c12969en.m60429x1(abstractC12950dpM60420ne);
            int iM60555k4 = m60555k4(c12969en, c12935cx, abstractC12950dpM60557k4);
            if (iM60555k4 == 1) {
                iM60555k4 = c12969en2.m60419ks();
            }
            c12969en.m60212c5(iM60555k4);
            if (c12969en.m60419ks() != c12969en2.m60419ks()) {
                m61169k4("The derived type and the base type must have the same content type.", c12969en);
            }
        } else {
            c12969en.m60429x1(abstractC12950dpM60557k4);
            c12969en.m60212c5(m60555k4(c12969en, c12935cx, c12969en.m60420ne()));
        }
        c12969en.m60214dy(2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60572k4(C12969en c12969en, AbstractC12950dp abstractC12950dp) {
        if (!C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
            if (C7019kk.m27469x1(abstractC12950dp, AbstractC13054jn.class)) {
                C12908be c12908beMo61012k4 = ((AbstractC13054jn) abstractC12950dp).mo61012k4();
                for (int i = 0; i < c12908beMo61012k4.size(); i++) {
                    m60572k4(c12969en, (AbstractC12950dp) c12908beMo61012k4.get_Item(i));
                }
                return;
            }
            return;
        }
        C13021hu c13021hu = (C13021hu) abstractC12950dp;
        m60606x1(c13021hu);
        AbstractC13018hl abstractC13018hlM60649kk = c12969en.m60426wl().m60649kk(c13021hu.m60721qq());
        C13005gv c13005gvM60426wl = c12969en.m60426wl();
        if (abstractC13018hlM60649kk == null) {
            c13005gvM60426wl.m60647k4(c13021hu.m60721qq(), c13021hu);
        } else if (((C13021hu) c13005gvM60426wl.m60649kk(c13021hu.m60721qq())).m60696ar() != c13021hu.m60696ar()) {
            m61169k4("Elements with the same name and in the same scope must have the same type.", abstractC12950dp);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60573k4(C12969en c12969en, C12969en c12969en2, C12908be c12908be, C13106mq c13106mq, int i) {
        Iterator it;
        C12908be c12908be2 = c12908be;
        C13106mq c13106mqM60425uz = c12969en != null ? c12969en.m60425uz() : null;
        C13106mq c13106mqM60604x1 = c13106mq;
        int i2 = 0;
        while (true) {
            int i3 = 2;
            if (i2 >= c12908be2.size()) {
                break;
            }
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12908be2.get_Item(i2), C13146p4.class);
            if (c13146p4 != null) {
                if (c13146p4.m61356ck() != 2) {
                    m60607x1(c13146p4);
                }
                if (c13146p4.m61356ck() == 2 && (c13146p4.m61356ck() != 2 || i != 4 || c12969en == C12969en.m60399k4())) {
                    m61172k4("The '{0}' attribute is ignored, because the value of 'prohibited' for attribute use only prevents inheritance of an identically named attribute from the base type definition.", c13146p4.m61359fa().toString(), c13146p4, 1);
                } else if (c12969en2.m60423u4().m60649kk(c13146p4.m61359fa()) == null) {
                    c12969en2.m60423u4().m60647k4(c13146p4.m61359fa(), c13146p4);
                } else {
                    m61171k4("The attribute '{0}' already exists.", c13146p4.m61359fa().toString(), c13146p4);
                }
            } else {
                C13161q1 c13161q1 = (C13161q1) c12908be2.get_Item(i2);
                C13149p8 c13149p8 = (C13149p8) this.f43671to.m61727up().m60649kk(c13161q1.m61409k4());
                if (c13149p8 != null) {
                    m60609x1(c13149p8);
                    it = c13149p8.m61393dy().m60648kk().iterator();
                    while (it.hasNext()) {
                        try {
                            C13146p4 c13146p42 = (C13146p4) it.next();
                            if (c13146p42.m61356ck() == i3 && (c13146p42.m61356ck() != i3 || i != 4 || c12969en == C12969en.m60399k4())) {
                                m61172k4("The '{0}' attribute is ignored, because the value of 'prohibited' for attribute use only prevents inheritance of an identically named attribute from the base type definition.", c13146p42.m61359fa().toString(), c13146p42, 1);
                            } else if (c12969en2.m60423u4().m60649kk(c13146p42.m61359fa()) == null) {
                                c12969en2.m60423u4().m60647k4(c13146p42.m61359fa(), c13146p42);
                            } else {
                                m61171k4("The attribute '{0}' already exists.", c13146p42.m61359fa().toString(), c13161q1);
                            }
                            i3 = 2;
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    c13106mqM60604x1 = m60604x1(c13106mqM60604x1, c13149p8.m61391c5());
                } else {
                    m61171k4("Reference to undeclared attribute group '{0}'.", c13161q1.m61409k4().toString(), c13161q1);
                }
            }
            i2++;
            c12908be2 = c12908be;
        }
        if (c12969en == null) {
            c12969en2.m60430x1(c13106mqM60604x1);
            return;
        }
        if (i == 2) {
            c12969en2.m60430x1(m60563k4(c13106mqM60604x1, c13106mqM60425uz));
            Iterator it2 = c12969en.m60423u4().m60648kk().iterator();
            while (it2.hasNext()) {
                try {
                    C13146p4 c13146p43 = (C13146p4) it2.next();
                    C13146p4 c13146p44 = (C13146p4) c12969en2.m60423u4().m60649kk(c13146p43.m61359fa());
                    if (c13146p44 == null) {
                        c12969en2.m60423u4().m60647k4(c13146p43.m61359fa(), c13146p43);
                    } else if (c13146p44.m61371up() != c13146p43.m61371up() || c13146p43.m61356ck() == 2) {
                        m61169k4("Invalid attribute extension.", c13146p44);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it2).dispose();
                return;
            }
            return;
        }
        if (c13106mqM60604x1 == null || (c13106mqM60425uz != null && C13106mq.m61182k4(c13106mqM60604x1, c13106mqM60425uz))) {
            c12969en2.m60430x1(c13106mqM60604x1);
        } else {
            m61169k4("The base any attribute must be a superset of the derived 'anyAttribute'.", c12969en2);
        }
        Iterator it3 = c12969en.m60423u4().m60648kk().iterator();
        while (it3.hasNext()) {
            try {
                C13146p4 c13146p45 = (C13146p4) it3.next();
                C13146p4 c13146p46 = (C13146p4) c12969en2.m60423u4().m60649kk(c13146p45.m61359fa());
                if (c13146p46 == null) {
                    c12969en2.m60423u4().m60647k4(c13146p45.m61359fa(), c13146p45);
                } else if (c13146p45.m61356ck() == 2 && c13146p46.m61356ck() != 2) {
                    m61169k4("Invalid attribute restriction. Attribute restriction is prohibited in base type.", c13146p46);
                } else if (c13146p46.m61356ck() != 2) {
                    if (c13146p45.m61371up() == null || c13146p46.m61371up() == null) {
                        m61169k4("Invalid attribute restriction. Derived attribute's type is not a valid restriction of the base attribute's type.", c13146p46);
                    } else if (!C12943dd.m60206k4(c13146p46.m61371up(), c13146p45.m61371up(), 0)) {
                        m61169k4("Invalid attribute restriction. Derived attribute's type is not a valid restriction of the base attribute's type.", c13146p46);
                    }
                }
            } finally {
                if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        it = c12969en2.m60423u4().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13146p4 c13146p47 = (C13146p4) it.next();
                if (((C13146p4) c12969en.m60423u4().m60649kk(c13146p47.m61359fa())) == null && (c13106mqM60425uz == null || !c13106mqM60425uz.m61188k4(c13146p47.m61359fa()))) {
                    m61169k4("The {base type definition} must have an {attribute wildcard} and the {target namespace} of the R's {attribute declaration} must be valid with respect to that wildcard.", c13146p47);
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60574k4(C12969en c12969en, C13025i2 c13025i2) {
        C12969en c12969en2;
        if (c12969en.m60221ss() == null || !C13890ei.m65278k4(c13025i2.m60741k4(), c12969en.m60221ss().m60210bv())) {
            C12943dd c12943ddM60598kk = m60598kk(c13025i2.m60741k4());
            if (c12943ddM60598kk == null) {
                m61171k4("Type '{0}' is not declared.", c13025i2.m60741k4().toString(), c12969en);
            } else {
                c12969en.m60218k4(c12943ddM60598kk);
                c12969en.m60217k4(c12943ddM60598kk.m60211bz());
            }
            c12969en2 = (C12969en) C7019kk.m27452k4((Object) c12943ddM60598kk, C12969en.class);
        } else {
            c12969en2 = (C12969en) c12969en.m60221ss();
            m60605x1(c12969en2);
            c12969en.m60218k4((C12943dd) c12969en2);
            c12969en.m60217k4(c12969en2.m60211bz());
        }
        C12969en c12969en3 = c12969en2;
        if (c12969en3 != null) {
            if ((c12969en3.m60225v4() & 2) != 0) {
                m61169k4("The base type is the final extension.", c12969en);
            }
            if (c12969en3.m60419ks() != 0) {
                m61169k4("The content type of the base type must be a simple type definition or it must be mixed, and simpleType child must be present.", c12969en);
            }
        }
        c12969en.m60214dy(2);
        m60573k4(c12969en3, c12969en, c13025i2.m60745x1(), c13025i2.m60740h4(), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m60575k4(C12969en c12969en, C13039iv c13039iv) {
        C12969en c12969enM60603x1;
        AbstractC12892ae abstractC12892aeM60211bz;
        C12969en c12969en2;
        if (c12969en.m60221ss() == null || !C13890ei.m65278k4(c13039iv.m60752k4(), c12969en.m60221ss().m60210bv())) {
            c12969enM60603x1 = m60603x1(c13039iv.m60752k4());
            if (c12969enM60603x1 == null) {
                m61171k4("Undefined complexType '{0}' is used as a base for complex type restriction.", c13039iv.m60752k4().toString(), c13039iv);
                return;
            }
            if (c12969enM60603x1.m60419ks() != 0) {
                if (c12969enM60603x1.m60419ks() != 3 || !c12969enM60603x1.m60226wp().m61276rv().mo61457k4()) {
                    m61169k4("The content type of the base type must be a simple type definition or it must be mixed, and simpleType child must be present.", c12969en);
                } else if (c13039iv.m60758x1() != null) {
                    m60610x1(c13039iv.m60758x1());
                    c12969en.m60218k4((C12943dd) c13039iv.m60758x1());
                } else {
                    m61169k4("Simple content restriction must have a simple type child if the content type of the base type is not a simple type definition.", c13039iv);
                }
                abstractC12892aeM60211bz = null;
                c12969en2 = c12969enM60603x1;
                if (c12969en2.m60226wp() != null && (c12969en2.m60225v4() & 4) != 0) {
                    m61169k4("The base type is final restriction.", c12969en);
                }
                c12969en.m60218k4((C12943dd) c12969en2);
                if (abstractC12892aeM60211bz != null) {
                    try {
                        c12969en.m60217k4(abstractC12892aeM60211bz.mo60023k4(c13039iv.m60751h4(), m61165k4(), c12969en));
                    } catch (XmlSchemaException e) {
                        if (e.getSourceSchemaObject() == null) {
                            e.setSource(c12969en);
                        }
                        m61166k4(e);
                        c12969en.m60217k4(AbstractC13279x6.m61669k4().m60211bz());
                    }
                }
                c12969en.m60214dy(4);
                m60573k4(c12969en2, c12969en, c13039iv.m60757m9(), c13039iv.m60750dy(), 4);
            }
            if (c13039iv.m60758x1() != null) {
                m60610x1(c13039iv.m60758x1());
                if (!C12943dd.m60205k4(c13039iv.m60758x1().m60211bz(), c12969enM60603x1.m60211bz(), 256)) {
                    m61169k4("The data type of the simple content is not a valid restriction of the base complex type.", c13039iv);
                }
            }
            abstractC12892aeM60211bz = c13039iv.m60758x1().m60211bz();
            c12969en2 = c12969enM60603x1;
            if (c12969en2.m60226wp() != null) {
                m61169k4("The base type is final restriction.", c12969en);
            }
            c12969en.m60218k4((C12943dd) c12969en2);
            if (abstractC12892aeM60211bz != null) {
            }
            c12969en.m60214dy(4);
            m60573k4(c12969en2, c12969en, c13039iv.m60757m9(), c13039iv.m60750dy(), 4);
        }
        c12969enM60603x1 = (C12969en) c12969en.m60221ss();
        m60605x1(c12969enM60603x1);
        abstractC12892aeM60211bz = c12969enM60603x1.m60211bz();
        c12969en2 = c12969enM60603x1;
        if (c12969en2.m60226wp() != null) {
        }
        c12969en.m60218k4((C12943dd) c12969en2);
        if (abstractC12892aeM60211bz != null) {
        }
        c12969en.m60214dy(4);
        m60573k4(c12969en2, c12969en, c13039iv.m60757m9(), c13039iv.m60750dy(), 4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m60576k4(C13021hu c13021hu) {
        if (c13021hu.m60727uz() != null) {
            C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) c13021hu.m60727uz(), C12969en.class);
            if (c12969en != null) {
                m60569k4(c12969en);
            } else {
                m60583k4((C13164q9) c13021hu.m60727uz());
            }
        }
        for (int i = 0; i < c13021hu.m60729wl().size(); i++) {
            ((C12887a0) c13021hu.m60729wl().get_Item(i)).m59984k4((C13241up) null);
        }
        c13021hu.m60710k4((C13125nk) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60577k4(C13078l0 c13078l0) {
        C13021hu c13021hu = (C13021hu) this.f43671to.m61717ks().m60649kk(c13078l0.m61099x1());
        if (c13021hu != null) {
            for (int i = 0; i < c13078l0.m61097k4().size(); i++) {
                C13021hu c13021hu2 = (C13021hu) c13078l0.m61097k4().get_Item(i);
                if (c13021hu2 != c13021hu && !C12943dd.m60206k4(c13021hu2.m60696ar(), c13021hu.m60696ar(), c13021hu.m60698bv())) {
                    m61173k4("'{0}' cannot be a member of substitution group with head element '{1}'.", c13021hu2.m60721qq().toString(), c13021hu.m60721qq().toString(), c13021hu2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60578k4(C13103mh c13103mh) {
        if (c13103mh.m60679e0() && c13103mh.m61097k4().size() > 0) {
            m61169k4("Circular substitution group affiliation.", (C13021hu) c13103mh.m61097k4().get_Item(0));
            return;
        }
        C13021hu c13021hu = (C13021hu) this.f43671to.m61717ks().m60649kk(c13103mh.m61099x1());
        if (c13103mh.m61097k4().contains(c13021hu)) {
            return;
        }
        c13103mh.m60681h4(true);
        if (c13021hu != null) {
            if (c13021hu.m60698bv() == 255) {
                m61169k4("Cannot be nominated as the {substitution group affiliation} of any other declaration.", c13021hu);
            }
            for (int i = 0; i < c13103mh.m61097k4().size(); i++) {
                C13021hu c13021hu2 = (C13021hu) c13103mh.m61097k4().get_Item(i);
                C13103mh c13103mh2 = (C13103mh) this.f43672x1.m60649kk(c13021hu2.m60721qq());
                if (c13103mh2 != null) {
                    m60578k4(c13103mh2);
                    for (int i2 = 0; i2 < c13103mh2.m61180kk().mo61012k4().size(); i2++) {
                        c13103mh.m61180kk().mo61012k4().m60092k4(c13103mh2.m61180kk().mo61012k4().get_Item(i2));
                    }
                } else {
                    c13103mh.m61180kk().mo61012k4().m60092k4(c13021hu2);
                }
            }
            c13103mh.m61180kk().mo61012k4().m60092k4(c13021hu);
            c13103mh.m61097k4().addItem(c13021hu);
        } else if (c13103mh.m61097k4().size() > 0) {
            m61169k4("Reference to undeclared substitution group affiliation.", (C13021hu) c13103mh.m61097k4().get_Item(0));
        }
        c13103mh.m60681h4(false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60579k4(C13123nh c13123nh, AbstractC12950dp abstractC12950dp) {
        if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
            C13021hu c13021hu = (C13021hu) abstractC12950dp;
            c13123nh.m61247k4(c13021hu.m60721qq(), c13021hu);
        } else if (C7019kk.m27469x1(abstractC12950dp, C12989fu.class)) {
            C12989fu c12989fu = (C12989fu) abstractC12950dp;
            c13123nh.m61246k4(c12989fu.m60627h4(), c12989fu);
        } else if (C7019kk.m27469x1(abstractC12950dp, AbstractC13054jn.class)) {
            C12908be c12908beMo61012k4 = ((AbstractC13054jn) abstractC12950dp).mo61012k4();
            boolean zM27469x1 = C7019kk.m27469x1(abstractC12950dp, C13132o2.class);
            c13123nh.m61244h4();
            boolean z = true;
            for (int i = 0; i < c12908beMo61012k4.size(); i++) {
                AbstractC12950dp abstractC12950dp2 = (AbstractC12950dp) c12908beMo61012k4.get_Item(i);
                if (z) {
                    z = false;
                } else if (zM27469x1) {
                    c13123nh.m61242dy();
                } else {
                    c13123nh.m61239c5();
                }
                m60579k4(c13123nh, abstractC12950dp2);
            }
            c13123nh.m61250m9();
        }
        C14046bv c14046bvM60245g8 = abstractC12950dp.m60245g8();
        C14046bv c14046bv = C14046bv.f47169to;
        if (C14046bv.m66453dy(c14046bvM60245g8, c14046bv) && C14046bv.m66453dy(abstractC12950dp.m60248sv(), c14046bv)) {
            return;
        }
        C14046bv c14046bvM60245g82 = abstractC12950dp.m60245g8();
        C14046bv c14046bv2 = C14046bv.f47165du;
        if (C14046bv.m66453dy(c14046bvM60245g82, c14046bv2) && C14046bv.m66453dy(abstractC12950dp.m60248sv(), c14046bv)) {
            c13123nh.m61243fa();
            return;
        }
        if (C14046bv.m66453dy(abstractC12950dp.m60245g8(), c14046bv2) && C14046bv.m66453dy(abstractC12950dp.m60248sv(), C14046bv.f47170x1)) {
            c13123nh.m61245jd();
        } else if (C14046bv.m66453dy(abstractC12950dp.m60245g8(), c14046bv) && C14046bv.m66453dy(abstractC12950dp.m60248sv(), C14046bv.f47170x1)) {
            c13123nh.m61240ck();
        } else {
            c13123nh.m61248k4(abstractC12950dp.m60245g8().Clone(), abstractC12950dp.m60248sv().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m60580k4(C13146p4 c13146p4) {
        if (c13146p4.m61361jd() != null) {
            m60583k4(c13146p4.m61361jd());
        }
        c13146p4.m61364k4((C13061k5) null);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m60581k4(C13147p5 c13147p5) {
        m60567k4(c13147p5.m61389x1());
        c13147p5.m61384k4((AbstractC12950dp) null);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m60582k4(C13149p8 c13149p8) {
        m60566k4(c13149p8.m61402x1());
        c13149p8.m61393dy().m60645k4();
        c13149p8.m61403x1((C13106mq) null);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m60583k4(C13164q9 c13164q9) {
        c13164q9.m60219k4((C13125nk) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60584k4(C13164q9 c13164q9, ArrayList arrayList, C13164q9 c13164q92) {
        AbstractC12892ae abstractC12892aeM60211bz = c13164q9.m60211bz();
        if (c13164q9.m60209b3() == 4 && (abstractC12892aeM60211bz.mo60036yj() || abstractC12892aeM60211bz.mo60032ks())) {
            m61169k4("It is an error if a union type has a member with variety union and this member cannot be substituted with its own members. This may be due to the fact that the union member is a restriction of a union with facets.", c13164q92);
        } else {
            arrayList.addRange(AbstractC14092to.m67208k4((Object) ((C13301y9) C7019kk.m27452k4((Object) c13164q9.m60211bz(), C13301y9.class)).m61769wl()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60585k4(C13193s0 c13193s0, C14046bv[] c14046bvArr, C14046bv[] c14046bvArr2) {
        C14046bv c14046bv = C14046bv.f47165du;
        c14046bv.CloneTo(c14046bvArr[0]);
        c14046bv.CloneTo(c14046bvArr2[0]);
        for (int i = 0; i < c13193s0.mo61012k4().size(); i++) {
            AbstractC12950dp abstractC12950dp = (AbstractC12950dp) c13193s0.mo61012k4().get_Item(i);
            C14046bv.m66480kk(c14046bvArr[0], abstractC12950dp.m60245g8()).CloneTo(c14046bvArr[0]);
            C14046bv c14046bvM60248sv = abstractC12950dp.m60248sv();
            C14046bv c14046bv2 = C14046bv.f47170x1;
            if (C14046bv.m66453dy(c14046bvM60248sv, c14046bv2)) {
                c14046bv2.CloneTo(c14046bvArr2[0]);
            } else if (C14046bv.m66484m9(c14046bvArr2[0], c14046bv2)) {
                C14046bv.m66480kk(c14046bvArr2[0], abstractC12950dp.m60248sv()).CloneTo(c14046bvArr2[0]);
            }
        }
        C14046bv.m66451du(c14046bvArr[0], c13193s0.m60245g8()).CloneTo(c14046bvArr[0]);
        C14046bv c14046bvM60248sv2 = c13193s0.m60248sv();
        C14046bv c14046bv3 = C14046bv.f47170x1;
        if (C14046bv.m66453dy(c14046bvM60248sv2, c14046bv3)) {
            c14046bv3.CloneTo(c14046bvArr2[0]);
        } else if (C14046bv.m66484m9(c14046bvArr2[0], c14046bv3)) {
            C14046bv.m66451du(c14046bvArr2[0], c13193s0.m60248sv()).CloneTo(c14046bvArr2[0]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m60586k4(C13282xc c13282xc) {
        for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
            AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
            if (abstractC13218th.m61618x1() != null) {
                m60586k4(abstractC13218th.m61618x1());
            }
            C12995g6 c12995g6 = (C12995g6) C7019kk.m27452k4((Object) abstractC13218th, C12995g6.class);
            if (c12995g6 != null) {
                c12995g6.m60643m9().m60645k4();
                c12995g6.m60639c5().m60645k4();
                c12995g6.m60640dy().m60645k4();
                for (int i2 = 0; i2 < c12995g6.m60641h4().size(); i2++) {
                    AbstractC13018hl abstractC13018hl = c12995g6.m60641h4().get_Item(i2);
                    C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) abstractC13018hl, C13146p4.class);
                    if (c13146p4 != null) {
                        m60580k4(c13146p4);
                    } else {
                        C13149p8 c13149p8 = (C13149p8) C7019kk.m27452k4((Object) abstractC13018hl, C13149p8.class);
                        if (c13149p8 != null) {
                            m60582k4(c13149p8);
                        } else {
                            C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) abstractC13018hl, C12969en.class);
                            if (c12969en != null) {
                                m60569k4(c12969en);
                            } else {
                                C13164q9 c13164q9 = (C13164q9) C7019kk.m27452k4((Object) abstractC13018hl, C13164q9.class);
                                if (c13164q9 != null) {
                                    m60583k4(c13164q9);
                                } else {
                                    C13021hu c13021hu = (C13021hu) C7019kk.m27452k4((Object) abstractC13018hl, C13021hu.class);
                                    if (c13021hu != null) {
                                        m60576k4(c13021hu);
                                    } else {
                                        C13147p5 c13147p5 = (C13147p5) C7019kk.m27452k4((Object) abstractC13018hl, C13147p5.class);
                                        if (c13147p5 != null) {
                                            m60581k4(c13147p5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i3 = 0; i3 < c13282xc.m61700dy().size(); i3++) {
            C13146p4 c13146p42 = (C13146p4) C7019kk.m27452k4((Object) c13282xc.m61700dy().get_Item(i3), C13146p4.class);
            if (c13146p42 != null) {
                m60580k4(c13146p42);
            } else {
                C13149p8 c13149p82 = (C13149p8) C7019kk.m27452k4((Object) c13282xc.m61700dy().get_Item(i3), C13149p8.class);
                if (c13149p82 != null) {
                    m60582k4(c13149p82);
                } else {
                    C12969en c12969en2 = (C12969en) C7019kk.m27452k4((Object) c13282xc.m61700dy().get_Item(i3), C12969en.class);
                    if (c12969en2 != null) {
                        m60569k4(c12969en2);
                    } else {
                        C13164q9 c13164q92 = (C13164q9) C7019kk.m27452k4((Object) c13282xc.m61700dy().get_Item(i3), C13164q9.class);
                        if (c13164q92 != null) {
                            m60583k4(c13164q92);
                        } else {
                            C13021hu c13021hu2 = (C13021hu) C7019kk.m27452k4((Object) c13282xc.m61700dy().get_Item(i3), C13021hu.class);
                            if (c13021hu2 != null) {
                                m60576k4(c13021hu2);
                            } else {
                                C13147p5 c13147p52 = (C13147p5) C7019kk.m27452k4((Object) c13282xc.m61700dy().get_Item(i3), C13147p5.class);
                                if (c13147p52 != null) {
                                    m60581k4(c13147p52);
                                }
                            }
                        }
                    }
                }
            }
        }
        c13282xc.m61701fa().m60645k4();
        c13282xc.m61727up().m60645k4();
        c13282xc.m61737yj().m60645k4();
        c13282xc.m61717ks().m60645k4();
        c13282xc.m61735x6().m60645k4();
        c13282xc.m61719ne().m60645k4();
        c13282xc.m61720qq().clear();
        c13282xc.m61703ix().m60645k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m60587k4(C13322zd c13322zd) {
        Iterator it = this.f43671to.m61717ks().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it.next();
                c13322zd.m61872fa().set_Item(c13021hu.m60721qq().m65284k4(), Boolean.TRUE);
                c13322zd.m61888m9().addItem(c13021hu.m60721qq(), c13021hu.m60697b3());
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        Iterator it2 = this.f43671to.m61701fa().m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it2.next();
                c13322zd.m61872fa().set_Item(c13146p4.m61359fa().m65284k4(), Boolean.TRUE);
                c13322zd.m61899yj().addItem(c13146p4.m61359fa(), c13146p4.m61369ks());
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        Iterator it3 = this.f43671to.m61737yj().m60648kk().iterator();
        while (it3.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it3.next();
                c13322zd.m61872fa().set_Item(c12943dd.m60210bv().m65284k4(), Boolean.TRUE);
                C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) c12943dd, C12969en.class);
                if (c12969en == null || (!c12969en.m60408dy() && c12943dd != C12969en.m60399k4())) {
                    c13322zd.m61893up().addItem(c12943dd.m60210bv(), c12943dd.m60226wp());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        it = this.f43671to.m61719ne().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13237ul c13237ul = (C13237ul) it.next();
                c13322zd.m61872fa().set_Item(c13237ul.m61633m9().m65284k4(), Boolean.TRUE);
                C13226tw c13226tw = new C13226tw(c13237ul.m61633m9());
                c13226tw.m61624k4(c13237ul.m61629h4());
                c13226tw.m61627x1(c13237ul.m61634x1());
                if (!c13322zd.m61887ks().containsKey(c13226tw.m61623k4().m65289x1())) {
                    c13322zd.m61887ks().addItem(c13226tw.m61623k4().m65289x1(), c13226tw);
                }
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60588k4(AbstractC12950dp abstractC12950dp, AbstractC12950dp abstractC12950dp2) {
        AbstractC12950dp abstractC12950dp3;
        if (abstractC12950dp == abstractC12950dp2) {
            return true;
        }
        if (abstractC12950dp == null || abstractC12950dp == (abstractC12950dp3 = AbstractC12950dp.f43531k4)) {
            return m60611x1(abstractC12950dp2);
        }
        if (abstractC12950dp2 != null && abstractC12950dp2 != abstractC12950dp3) {
            if (C7019kk.m27469x1(abstractC12950dp2, C13021hu.class)) {
                if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                    return m60591k4((C13021hu) abstractC12950dp, (C13021hu) abstractC12950dp2);
                }
                return false;
            }
            if (C7019kk.m27469x1(abstractC12950dp2, C12989fu.class)) {
                return C7019kk.m27469x1(abstractC12950dp, C13021hu.class) ? m60590k4((C13021hu) abstractC12950dp, (C12989fu) abstractC12950dp2) : C7019kk.m27469x1(abstractC12950dp, C12989fu.class) ? m60589k4((C12989fu) abstractC12950dp, (C12989fu) abstractC12950dp2) : m60593k4((AbstractC13054jn) abstractC12950dp, (C12989fu) abstractC12950dp2);
            }
            if (C7019kk.m27469x1(abstractC12950dp2, C13141op.class)) {
                if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                    return m60592k4((C13021hu) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2, true);
                }
                if (C7019kk.m27469x1(abstractC12950dp, C13141op.class)) {
                    return m60594k4((AbstractC13054jn) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2, true);
                }
                if (C7019kk.m27469x1(abstractC12950dp, C13193s0.class)) {
                    return m60596k4((C13193s0) abstractC12950dp, (C13141op) abstractC12950dp2);
                }
            } else if (C7019kk.m27469x1(abstractC12950dp2, C13132o2.class)) {
                if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                    return m60592k4((C13021hu) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2, false);
                }
                if (C7019kk.m27469x1(abstractC12950dp, C13132o2.class)) {
                    return m60594k4((AbstractC13054jn) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2, false);
                }
                if (C7019kk.m27469x1(abstractC12950dp, C13193s0.class)) {
                    return m60595k4((C13193s0) abstractC12950dp, (C13132o2) abstractC12950dp2);
                }
            } else if (C7019kk.m27469x1(abstractC12950dp2, C13193s0.class)) {
                if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                    return m60592k4((C13021hu) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2, true);
                }
                if (C7019kk.m27469x1(abstractC12950dp, C13193s0.class)) {
                    return m60594k4((AbstractC13054jn) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2, true);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60589k4(C12989fu c12989fu, C12989fu c12989fu2) {
        return m60612x1(c12989fu, c12989fu2) && C13086lm.m61102k4(c12989fu.m60627h4(), c12989fu2.m60627h4());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60590k4(C13021hu c13021hu, C12989fu c12989fu) {
        return c12989fu.m60630k4(c13021hu.m60721qq()) && m60612x1(c13021hu, c12989fu);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60591k4(C13021hu c13021hu, C13021hu c13021hu2) {
        if (C13890ei.m65278k4(c13021hu.m60721qq(), c13021hu2.m60721qq()) && c13021hu.m60726up() == c13021hu2.m60726up() && m60612x1(c13021hu, c13021hu2)) {
            return (c13021hu2.m60706jd() == null || C14113y2.m67363du(c13021hu2.m60706jd(), c13021hu.m60706jd())) && (c13021hu.m60725um() | c13021hu2.m60725um()) == c13021hu.m60725um() && c13021hu.m60696ar() != null && c13021hu2.m60696ar() != null && C12943dd.m60206k4(c13021hu.m60696ar(), c13021hu2.m60696ar(), -5);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60592k4(C13021hu c13021hu, AbstractC13054jn abstractC13054jn, boolean z) {
        boolean z2 = false;
        for (int i = 0; i < abstractC13054jn.mo61012k4().size(); i++) {
            AbstractC12950dp abstractC12950dp = (AbstractC12950dp) abstractC13054jn.mo61012k4().get_Item(i);
            if (!z2) {
                String strM60241bz = abstractC12950dp.m60241bz();
                String strM60247qm = abstractC12950dp.m60247qm();
                abstractC12950dp.m60246k4(C14046bv.m66451du(abstractC12950dp.m60245g8(), abstractC13054jn.m60245g8()).Clone());
                C14046bv c14046bvM60248sv = abstractC12950dp.m60248sv();
                C14046bv c14046bv = C14046bv.f47170x1;
                if (C14046bv.m66484m9(c14046bvM60248sv, c14046bv)) {
                    abstractC12950dp.m60250x1(C14046bv.m66453dy(abstractC13054jn.m60248sv(), c14046bv) ? c14046bv.Clone() : C14046bv.m66451du(abstractC12950dp.m60248sv(), abstractC13054jn.m60248sv()).Clone());
                }
                boolean zM60588k4 = m60588k4(c13021hu, abstractC12950dp);
                abstractC12950dp.m60244dy(strM60241bz);
                abstractC12950dp.m60243c5(strM60247qm);
                z2 = zM60588k4;
            } else if (z && !m60611x1(abstractC12950dp)) {
                return false;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60593k4(AbstractC13054jn abstractC13054jn, C12989fu c12989fu) {
        C14046bv[] c14046bvArr = {new C14046bv()};
        C14046bv[] c14046bvArr2 = {new C14046bv()};
        m60568k4(abstractC13054jn, c14046bvArr, c14046bvArr2);
        if (!m60597k4(c14046bvArr[0].Clone(), c14046bvArr2[0].Clone(), c12989fu.m60245g8().Clone(), c12989fu.m60248sv().Clone())) {
            return false;
        }
        String strM60241bz = c12989fu.m60241bz();
        c12989fu.m60246k4(C14046bv.f47165du.Clone());
        for (int i = 0; i < abstractC13054jn.mo61012k4().size(); i++) {
            if (!m60588k4((AbstractC12950dp) abstractC13054jn.mo61012k4().get_Item(i), c12989fu)) {
                c12989fu.m60244dy(strM60241bz);
                return false;
            }
        }
        c12989fu.m60244dy(strM60241bz);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60594k4(AbstractC13054jn abstractC13054jn, AbstractC13054jn abstractC13054jn2, boolean z) {
        if (!m60612x1(abstractC13054jn, abstractC13054jn2) || abstractC13054jn.mo61012k4().size() > abstractC13054jn2.mo61012k4().size()) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < abstractC13054jn2.mo61012k4().size(); i2++) {
            AbstractC12950dp abstractC12950dp = (AbstractC12950dp) abstractC13054jn2.mo61012k4().get_Item(i2);
            if (i < abstractC13054jn.mo61012k4().size() && m60588k4((AbstractC12950dp) abstractC13054jn.mo61012k4().get_Item(i), abstractC12950dp)) {
                i++;
            } else if (z && !m60611x1(abstractC12950dp)) {
                return false;
            }
        }
        return i >= abstractC13054jn.mo61012k4().size();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60595k4(C13193s0 c13193s0, C13132o2 c13132o2) {
        C14046bv[] c14046bvArr = {new C14046bv()};
        C14046bv[] c14046bvArr2 = {new C14046bv()};
        m60585k4(c13193s0, c14046bvArr, c14046bvArr2);
        if (!m60597k4(c14046bvArr[0].Clone(), c14046bvArr2[0].Clone(), c13132o2.m60245g8().Clone(), c13132o2.m60248sv().Clone()) || c13193s0.mo61012k4().size() > c13132o2.mo61012k4().size()) {
            return false;
        }
        for (int i = 0; i < c13193s0.mo61012k4().size(); i++) {
            if (m60554k4((AbstractC12950dp) c13193s0.mo61012k4().get_Item(i), c13132o2.mo61012k4()) < 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60596k4(C13193s0 c13193s0, C13141op c13141op) {
        if (!m60612x1(c13193s0, c13141op) || c13193s0.mo61012k4().size() > c13141op.mo61012k4().size()) {
            return false;
        }
        C13047jd c13047jd = new C13047jd(c13141op.mo61012k4().size());
        for (int i = 0; i < c13193s0.mo61012k4().size(); i++) {
            int iM60554k4 = m60554k4((AbstractC12950dp) c13193s0.mo61012k4().get_Item(i), c13141op.mo61012k4());
            if (iM60554k4 < 0 || c13047jd.m60999k4(iM60554k4)) {
                return false;
            }
            c13047jd.m61006x1(iM60554k4);
        }
        for (int i2 = 0; i2 < c13141op.mo61012k4().size(); i2++) {
            if (!c13047jd.m60999k4(i2) && !m60611x1((AbstractC12950dp) c13141op.mo61012k4().get_Item(i2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m60613k4(C13282xc c13282xc, C13322zd c13322zd, boolean z) {
        this.f43669k4 = z;
        this.f43671to = c13282xc;
        m60552h4();
        m60601m9();
        m60551dy();
        if (!m61164du()) {
            m60587k4(c13322zd);
        }
        return !m61164du();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60597k4(C14046bv c14046bv, C14046bv c14046bv2, C14046bv c14046bv3, C14046bv c14046bv4) {
        return C14046bv.m66455fa(c14046bv3, c14046bv) && C14046bv.m66455fa(c14046bv2, c14046bv4);
    }
}

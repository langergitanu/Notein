package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.Collections.Stack;
import com.aspose.slides.exceptions.UpaException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.yj */
/* JADX INFO: loaded from: classes5.dex */
public final class C13306yj extends C13100m9 {

    /* JADX INFO: renamed from: c5 */
    private C13005gv f44607c5;

    /* JADX INFO: renamed from: ck */
    private Hashtable f44608ck;

    /* JADX INFO: renamed from: du */
    private C13005gv f44609du;

    /* JADX INFO: renamed from: dy */
    private C13005gv f44610dy;

    /* JADX INFO: renamed from: fa */
    private Hashtable f44611fa;

    /* JADX INFO: renamed from: h4 */
    private C13005gv f44612h4;

    /* JADX INFO: renamed from: jd */
    private Stack f44613jd;

    /* JADX INFO: renamed from: k4 */
    private String f44614k4;

    /* JADX INFO: renamed from: kk */
    private C13005gv f44615kk;

    /* JADX INFO: renamed from: m9 */
    private C13005gv f44616m9;

    /* JADX INFO: renamed from: to */
    private C13005gv f44617to;

    /* JADX INFO: renamed from: up */
    private C13282xc f44618up;

    /* JADX INFO: renamed from: x1 */
    private C13005gv f44619x1;

    public C13306yj(AbstractC13883dt abstractC13883dt, AbstractC13319z7 abstractC13319z7, C13282xc c13282xc, C12903b2 c12903b2) {
        super(abstractC13883dt, null, abstractC13319z7, c12903b2);
        this.f44619x1 = new C13005gv();
        this.f44615kk = new C13005gv();
        this.f44617to = new C13005gv();
        this.f44609du = new C13005gv();
        this.f44612h4 = new C13005gv();
        this.f44616m9 = new C13005gv();
        this.f44610dy = new C13005gv();
        this.f44607c5 = new C13005gv();
        this.f44613jd = new Stack();
        this.f44608ck = new Hashtable();
        this.f44611fa = new Hashtable();
        this.f44618up = c13282xc;
    }

    /* JADX INFO: renamed from: du */
    private C13192rv m61773du(C12969en c12969en) {
        String strM60632m9;
        String strM60632m92;
        AbstractC13018hl abstractC13018hl;
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
        m61830to(c12969en);
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
        C13123nh c13123nh = new C13123nh(c12969en.m60419ks(), m61177to().m60057k4());
        try {
            c13123nh.m61241du();
            c12969en.m60418kk(m61817k4(c13123nh, abstractC12950dpM60420ne));
            return c13123nh.m61251x1(true);
        } catch (UpaException e) {
            String str = "Wildcard '{0}' allows element '{1}', and causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.";
            if (C7019kk.m27469x1(e.getParticle1(), C13021hu.class)) {
                if (C7019kk.m27469x1(e.getParticle2(), C13021hu.class)) {
                    m61171k4("Multiple definition of element '{0}' causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.", ((C13021hu) e.getParticle1()).m60721qq().toString(), (C13021hu) e.getParticle2());
                    return C12969en.m60402m9();
                }
                strM60632m9 = ((C12989fu) e.getParticle2()).m60632m9();
                strM60632m92 = ((C13021hu) e.getParticle1()).m60721qq().toString();
                abstractC13018hl = (C12989fu) e.getParticle2();
            } else if (C7019kk.m27469x1(e.getParticle2(), C13021hu.class)) {
                strM60632m9 = ((C12989fu) e.getParticle1()).m60632m9();
                strM60632m92 = ((C13021hu) e.getParticle2()).m60721qq().toString();
                abstractC13018hl = (C13021hu) e.getParticle2();
            } else {
                strM60632m9 = ((C12989fu) e.getParticle1()).m60632m9();
                strM60632m92 = ((C12989fu) e.getParticle2()).m60632m9();
                abstractC13018hl = (C12989fu) e.getParticle2();
                str = "Wildcards '{0}' and '{1}' have not empty intersection, and causes the content model to become ambiguous. A content model must be formed such that during validation of an element information item sequence, the particle contained directly, indirectly or implicitly therein with which to attempt to validate each item in the sequence in turn can be uniquely determined without examining the content or attributes of that item, and without any information about the items in the remainder of the sequence.";
            }
            m61173k4(str, strM60632m9, strM60632m92, abstractC13018hl);
            return C12969en.m60402m9();
        } catch (UnsupportedOperationException unused) {
            m61170k4("Content model validation resulted in a large number of states, possibly due to large occurrence ranges. Therefore, content model may not be validated accurately.", c12969en, 1);
            return C12969en.m60402m9();
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m61775dy() {
        Iterator it = this.f44617to.m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it.next();
                if (!c13021hu.m60705ix().m65287kk()) {
                    C13021hu c13021hu2 = (C13021hu) C7019kk.m27452k4((Object) this.f44617to.m60649kk(c13021hu.m60705ix()), C13021hu.class);
                    if (c13021hu2 == null) {
                        m61169k4("Reference to undeclared substitution group affiliation.", c13021hu);
                    } else {
                        if (!C12943dd.m60206k4(c13021hu.m60696ar(), c13021hu2.m60696ar(), c13021hu2.m60698bv())) {
                            m61173k4("'{0}' cannot be a member of substitution group with head element '{1}'.", c13021hu.m60721qq().toString(), c13021hu2.m60721qq().toString(), c13021hu);
                        }
                        C13078l0 c13078l0 = (C13078l0) this.f44610dy.m60649kk(c13021hu.m60705ix());
                        if (c13078l0 == null) {
                            c13078l0 = new C13078l0();
                            c13078l0.m61098k4(c13021hu.m60705ix());
                            this.f44610dy.m60647k4(c13021hu.m60705ix(), c13078l0);
                        }
                        ArrayList arrayListM61097k4 = c13078l0.m61097k4();
                        if (!arrayListM61097k4.contains(c13021hu)) {
                            arrayListM61097k4.addItem(c13021hu);
                        }
                    }
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
        Iterator it2 = this.f44610dy.m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                m61799k4((C13078l0) it2.next());
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m61776h4(C12969en c12969en) {
        if (c12969en.m60679e0()) {
            m61169k4("Circular type reference.", c12969en);
            return;
        }
        c12969en.m60681h4(true);
        try {
            if (c12969en.m60420ne() != AbstractC12950dp.f43531k4) {
                m61794k4(c12969en, c12969en.m60420ne());
            }
        } finally {
            c12969en.m60681h4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m61777k4(AbstractC12950dp abstractC12950dp, C12908be c12908be) {
        for (int i = 0; i < c12908be.size(); i++) {
            if (m61842x1(abstractC12950dp, (AbstractC12950dp) c12908be.get_Item(i))) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    private C12943dd m61823kk(C13890ei c13890ei) throws Throwable {
        C12943dd c12943dd = (C12943dd) this.f44609du.m60649kk(c13890ei);
        if (c12943dd == null) {
            return AbstractC13279x6.m61670k4(c13890ei);
        }
        if (C7019kk.m27469x1(c12943dd, C12969en.class)) {
            m61836x1((C12969en) c12943dd);
            return c12943dd;
        }
        m61841x1((C13164q9) c12943dd);
        return c12943dd;
    }

    /* JADX INFO: renamed from: m9 */
    private void m61829m9() {
        C13164q9[] c13164q9ArrM61668h4 = AbstractC13279x6.m61668h4();
        int length = c13164q9ArrM61668h4.length - 3;
        for (int i = 12; i < length; i++) {
            C13164q9 c13164q9 = c13164q9ArrM61668h4[i];
            this.f44618up.m61737yj().m60650kk(c13164q9.m60210bv(), c13164q9);
            this.f44609du.m60650kk(c13164q9.m60210bv(), c13164q9);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m61830to(C12969en c12969en) {
        this.f44613jd.push(c12969en);
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC12950dp m61832x1(AbstractC12950dp abstractC12950dp) {
        AbstractC12950dp abstractC12950dpM61779k4 = m61779k4(abstractC12950dp, true);
        C13132o2 c13132o2 = (C13132o2) C7019kk.m27452k4((Object) abstractC12950dpM61779k4, C13132o2.class);
        if (c13132o2 == null || c13132o2.mo61012k4().size() != 0) {
            return abstractC12950dpM61779k4;
        }
        if (C14046bv.m66484m9(c13132o2.m60245g8(), C14046bv.f47165du)) {
            m61170k4("Empty choice cannot be satisfied if 'minOccurs' is not equal to 0.", c13132o2, 1);
        }
        return AbstractC12950dp.f43531k4;
    }

    /* JADX INFO: renamed from: du */
    private void m61774du(AbstractC12950dp abstractC12950dp) {
        if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
            m61826kk((C13021hu) abstractC12950dp);
            return;
        }
        if (C7019kk.m27469x1(abstractC12950dp, AbstractC13054jn.class)) {
            C12908be c12908beMo61012k4 = ((AbstractC13054jn) abstractC12950dp).mo61012k4();
            for (int i = 0; i < c12908beMo61012k4.size(); i++) {
                m61774du((AbstractC12950dp) c12908beMo61012k4.get_Item(i));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m61778k4(C12969en c12969en, C12935cx c12935cx, AbstractC12950dp abstractC12950dp) {
        if (c12935cx != null && c12935cx.m60147k4()) {
            return 3;
        }
        if (c12935cx == null && c12969en.mo60216jd()) {
            return 3;
        }
        return (abstractC12950dp == null || abstractC12950dp.mo60251x1()) ? 1 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (com.aspose.slides.p559ms.System.C14046bv.m66453dy(r1.m60248sv(), r0) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return (com.aspose.slides.internal.p532yu.AbstractC12950dp) r4.get_Item(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (com.aspose.slides.p559ms.System.C14046bv.m66453dy(r1.m60248sv(), r0) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (com.aspose.slides.p559ms.System.C14046bv.m66453dy(r1.m60248sv(), r0) != false) goto L13;
     */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC12950dp m61824kk(AbstractC12950dp abstractC12950dp) {
        C12908be c12908beMo61012k4;
        if (abstractC12950dp == null) {
            return null;
        }
        C14046bv c14046bvClone = C14046bv.f47169to.Clone();
        C13193s0 c13193s0 = (C13193s0) C7019kk.m27452k4((Object) abstractC12950dp, C13193s0.class);
        if (c13193s0 != null) {
            c12908beMo61012k4 = c13193s0.mo61012k4();
            if (c12908beMo61012k4.size() == 1) {
                if (C14046bv.m66453dy(c13193s0.m60245g8(), c14046bvClone)) {
                }
            }
            return abstractC12950dp;
        }
        C13132o2 c13132o2 = (C13132o2) C7019kk.m27452k4((Object) abstractC12950dp, C13132o2.class);
        if (c13132o2 == null) {
            C13141op c13141op = (C13141op) C7019kk.m27452k4((Object) abstractC12950dp, C13141op.class);
            if (c13141op != null) {
                c12908beMo61012k4 = c13141op.mo61012k4();
                if (c12908beMo61012k4.size() == 1) {
                    if (C14046bv.m66453dy(c13141op.m60245g8(), c14046bvClone)) {
                    }
                }
            }
            return abstractC12950dp;
        }
        c12908beMo61012k4 = c13132o2.mo61012k4();
        int size = c12908beMo61012k4.size();
        if (size == 1) {
            if (C14046bv.m66453dy(c13132o2.m60245g8(), c14046bvClone)) {
            }
        } else if (size == 0) {
            return AbstractC12950dp.f43531k4;
        }
        return abstractC12950dp;
    }

    /* JADX INFO: renamed from: to */
    private boolean m61831to(AbstractC12950dp abstractC12950dp) {
        C14046bv[] c14046bvArr = {new C14046bv()};
        m61790k4(abstractC12950dp, c14046bvArr, new C14046bv[]{new C14046bv()});
        return C14046bv.m66453dy(c14046bvArr[0], C14046bv.f47165du);
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC12950dp m61833x1(C13021hu c13021hu) {
        C13078l0 c13078l0;
        if (c13021hu.m60720ne().m65287kk() || (c13021hu.m60697b3().m61258fa() & 1) != 0 || (c13078l0 = (C13078l0) this.f44610dy.m60649kk(c13021hu.m60721qq())) == null) {
            return c13021hu;
        }
        C13132o2 c13132o2 = new C13132o2();
        for (int i = 0; i < c13078l0.m61097k4().size(); i++) {
            c13132o2.mo61012k4().m60092k4((C13021hu) c13078l0.m61097k4().get_Item(i));
        }
        c13132o2.m60246k4(c13021hu.m60245g8().Clone());
        c13132o2.m60250x1(c13021hu.m60248sv().Clone());
        m61800k4((C13126nm) c13132o2, (C13126nm) c13021hu, false);
        return c13132o2;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m61843h4() {
        this.f44609du.m60652x1(AbstractC13279x6.f44531x1, C12969en.m60399k4());
        C13282xc c13282xc = this.f44618up;
        if (c13282xc != null) {
            c13282xc.m61737yj().m60650kk(AbstractC13279x6.f44531x1, C12969en.m60399k4());
            m61829m9();
        }
        Iterator it = this.f44612h4.m60648kk().iterator();
        while (it.hasNext()) {
            try {
                m61838x1((C13147p5) it.next());
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        Iterator it2 = this.f44615kk.m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                m61839x1((C13149p8) it2.next());
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        Iterator it3 = this.f44609du.m60648kk().iterator();
        while (it3.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it3.next();
                C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) c12943dd, C12969en.class);
                if (c12969en != null) {
                    m61836x1(c12969en);
                } else {
                    m61841x1((C13164q9) c12943dd);
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
        Iterator it4 = this.f44617to.m60648kk().iterator();
        while (it4.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it4.next();
                if (c13021hu.m60697b3() == null) {
                    m61826kk(c13021hu);
                }
            } finally {
                if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it4).dispose();
        }
        Iterator it5 = this.f44619x1.m60648kk().iterator();
        while (it5.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it5.next();
                if (c13146p4.m61369ks() == null) {
                    m61837x1(c13146p4);
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
        Iterator it6 = this.f44607c5.m60648kk().iterator();
        while (it6.hasNext()) {
            try {
                C12887a0 c12887a0 = (C12887a0) it6.next();
                if (c12887a0.m59979dy() == null) {
                    m61786k4(c12887a0);
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
        while (this.f44613jd.size() > 0) {
            m61776h4((C12969en) this.f44613jd.pop());
        }
        m61775dy();
        Iterator it7 = this.f44609du.m60648kk().iterator();
        while (it7.hasNext()) {
            try {
                C12969en c12969en2 = (C12969en) C7019kk.m27452k4(it7.next(), C12969en.class);
                if (c12969en2 != null) {
                    m61825kk(c12969en2);
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
        Iterator it8 = this.f44617to.m60648kk().iterator();
        while (it8.hasNext()) {
            try {
                C13021hu c13021hu2 = (C13021hu) it8.next();
                C12969en c12969en3 = (C12969en) C7019kk.m27452k4((Object) c13021hu2.m60696ar(), C12969en.class);
                if (c12969en3 != null && C13890ei.m65278k4(c13021hu2.m60724u4(), C13890ei.f46456k4)) {
                    m61825kk(c12969en3);
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
        Iterator it9 = this.f44612h4.m60648kk().iterator();
        while (it9.hasNext()) {
            try {
                C13147p5 c13147p5 = (C13147p5) it9.next();
                C13147p5 c13147p5M61379dy = c13147p5.m61379dy();
                if (c13147p5M61379dy != null) {
                    m61804k4(c13147p5, c13147p5M61379dy);
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
        it7 = this.f44615kk.m60648kk().iterator();
        while (it7.hasNext()) {
            try {
                C13149p8 c13149p8 = (C13149p8) it7.next();
                C13149p8 c13149p8M61395jd = c13149p8.m61395jd();
                if (c13149p8M61395jd != null) {
                    m61806k4(c13149p8, c13149p8M61395jd);
                }
            } finally {
                if (C7019kk.m27456k4(it7, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it7).dispose();
                }
            }
        }
        return !m61164du();
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m61779k4(AbstractC12950dp abstractC12950dp, boolean z) {
        return (abstractC12950dp == null || abstractC12950dp.mo60251x1()) ? AbstractC12950dp.f43531k4 : C7019kk.m27469x1(abstractC12950dp, C13021hu.class) ? abstractC12950dp : C7019kk.m27469x1(abstractC12950dp, C12990fw.class) ? m61780k4((C12990fw) abstractC12950dp, z) : C7019kk.m27469x1(abstractC12950dp, C13141op.class) ? m61782k4((C13141op) abstractC12950dp, z) : C7019kk.m27469x1(abstractC12950dp, C13132o2.class) ? m61781k4((C13132o2) abstractC12950dp, z) : C7019kk.m27469x1(abstractC12950dp, C13193s0.class) ? m61783k4((C13193s0) abstractC12950dp, z) : abstractC12950dp;
    }

    /* JADX INFO: renamed from: kk */
    private void m61825kk(C12969en c12969en) {
        C12969en c12969en2;
        C12969en c12969en3 = (C12969en) C7019kk.m27452k4((Object) c12969en.m60231yd(), C12969en.class);
        this.f44614k4 = null;
        if (c12969en3 != null && c12969en3 != C12969en.m60399k4() && c12969en.m60209b3() == 4) {
            if (m61842x1(m61824kk(c12969en.m60420ne()), m61824kk(c12969en3.m60420ne()))) {
                return;
            }
            String str = this.f44614k4;
            if (str != null) {
                m61171k4("Invalid particle derivation by restriction - '{0}'.", str, c12969en);
                return;
            } else {
                m61169k4("Invalid particle derivation by restriction.", c12969en);
                return;
            }
        }
        if (c12969en3 == C12969en.m60399k4()) {
            Iterator it = c12969en.m60426wl().m60648kk().iterator();
            while (it.hasNext()) {
                try {
                    C13021hu c13021hu = (C13021hu) it.next();
                    if (!c13021hu.m60735yd() && (c12969en2 = (C12969en) C7019kk.m27452k4((Object) c13021hu.m60696ar(), C12969en.class)) != null) {
                        C13890ei c13890eiM60724u4 = c13021hu.m60724u4();
                        C13890ei c13890ei = C13890ei.f46456k4;
                        if (C13890ei.m65278k4(c13890eiM60724u4, c13890ei) && C13890ei.m65278k4(c13021hu.m60720ne(), c13890ei)) {
                            c13021hu.m60717kk(true);
                            m61825kk(c12969en2);
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C12969en m61834x1(C13890ei c13890ei) throws Throwable {
        C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) this.f44609du.m60649kk(c13890ei), C12969en.class);
        if (c12969en != null) {
            m61836x1(c12969en);
        }
        return c12969en;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m61780k4(C12990fw c12990fw, boolean z) {
        C13147p5 c13147p5M60634h4 = c12990fw.m60634h4() != null ? c12990fw.m60634h4() : (C13147p5) this.f44612h4.m60649kk(c12990fw.m60635k4());
        if (c13147p5M60634h4 == null) {
            m61171k4("Reference to undeclared model group '{0}'.", c12990fw.m60635k4().toString(), c12990fw);
            return AbstractC12950dp.f43531k4;
        }
        if (c13147p5M60634h4.m61388m9() == null) {
            m61838x1(c13147p5M60634h4);
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
                if (C14046bv.m66447c5(c14046bvM60245g8, c14046bv) || C14046bv.m66484m9(c12990fw.m60248sv(), c14046bv)) {
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
            m61800k4((C13126nm) c13193s0, (C13126nm) c12990fw, true);
            for (int i = 0; i < abstractC13054jn.mo61012k4().size(); i++) {
                c13193s0.mo61012k4().m60092k4(abstractC13054jn.mo61012k4().get_Item(i));
            }
            c12990fw.m60636k4(c13193s0);
            return c13193s0;
        }
        return abstractC12950dp;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011c A[Catch: all -> 0x004b, XmlSchemaException -> 0x004e, TRY_ENTER, TryCatch #0 {XmlSchemaException -> 0x004e, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0031, B:16:0x003a, B:69:0x0197, B:71:0x019d, B:72:0x01a6, B:74:0x01ac, B:100:0x0244, B:102:0x024a, B:103:0x0256, B:105:0x025c, B:106:0x0271, B:107:0x0274, B:76:0x01b2, B:78:0x01b8, B:80:0x01c3, B:82:0x01cd, B:85:0x01d8, B:86:0x01df, B:87:0x01e0, B:89:0x01e6, B:90:0x01ed, B:92:0x01f9, B:94:0x01ff, B:96:0x020b, B:97:0x0211, B:98:0x0226, B:99:0x022a, B:91:0x01f1, B:21:0x0051, B:22:0x0060, B:23:0x0061, B:24:0x0070, B:25:0x0071, B:27:0x0077, B:54:0x011c, B:56:0x0126, B:58:0x0135, B:59:0x0139, B:60:0x013e, B:62:0x014a, B:64:0x0159, B:65:0x015e, B:67:0x0178, B:68:0x0184, B:28:0x007f, B:30:0x0089, B:33:0x009d, B:34:0x00ac, B:35:0x00ad, B:37:0x00b7, B:39:0x00c5, B:43:0x00cf, B:45:0x00d8, B:46:0x00e7, B:47:0x00ec, B:48:0x00f8, B:49:0x0107, B:50:0x0108), top: B:118:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178 A[Catch: all -> 0x004b, XmlSchemaException -> 0x004e, TryCatch #0 {XmlSchemaException -> 0x004e, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0031, B:16:0x003a, B:69:0x0197, B:71:0x019d, B:72:0x01a6, B:74:0x01ac, B:100:0x0244, B:102:0x024a, B:103:0x0256, B:105:0x025c, B:106:0x0271, B:107:0x0274, B:76:0x01b2, B:78:0x01b8, B:80:0x01c3, B:82:0x01cd, B:85:0x01d8, B:86:0x01df, B:87:0x01e0, B:89:0x01e6, B:90:0x01ed, B:92:0x01f9, B:94:0x01ff, B:96:0x020b, B:97:0x0211, B:98:0x0226, B:99:0x022a, B:91:0x01f1, B:21:0x0051, B:22:0x0060, B:23:0x0061, B:24:0x0070, B:25:0x0071, B:27:0x0077, B:54:0x011c, B:56:0x0126, B:58:0x0135, B:59:0x0139, B:60:0x013e, B:62:0x014a, B:64:0x0159, B:65:0x015e, B:67:0x0178, B:68:0x0184, B:28:0x007f, B:30:0x0089, B:33:0x009d, B:34:0x00ac, B:35:0x00ad, B:37:0x00b7, B:39:0x00c5, B:43:0x00cf, B:45:0x00d8, B:46:0x00e7, B:47:0x00ec, B:48:0x00f8, B:49:0x0107, B:50:0x0108), top: B:118:0x0019, outer: #1 }] */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61826kk(C13021hu c13021hu) {
        C13125nk c13125nkM60226wp;
        C13125nk c13125nkM61253c5;
        C12969en c12969en;
        C13125nk c13125nkM60226wp2;
        String strM60706jd;
        Object objMo60025k4;
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
                            C13021hu c13021hu2 = (C13021hu) this.f44617to.m60649kk(c13021hu.m60705ix());
                            if (c13021hu2 == null) {
                                throw new XmlSchemaException("Substitution group refers to '{0}', an undeclared element.", c13021hu.m60705ix().m65289x1(), c13021hu);
                            }
                            if (c13021hu2.m60679e0()) {
                                c13021hu.m60681h4(false);
                                return;
                            }
                            m61826kk(c13021hu2);
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
                                m61836x1(c12969en2);
                                if (c12969en2.m60226wp() != null) {
                                    c13125nkM60226wp2 = c12969en2.m60226wp();
                                    c13125nkM61253c5 = c13125nkM60226wp2.m61253c5();
                                }
                            } else if (C7019kk.m27469x1(c13021hu.m60696ar(), C13164q9.class)) {
                                C13164q9 c13164q9 = (C13164q9) c13021hu.m60696ar();
                                m61841x1(c13164q9);
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
                        c13021hu.m60731x1(m61823kk(c13021hu.m60724u4()));
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
                    C13021hu c13021hu3 = (C13021hu) this.f44617to.m60649kk(c13021hu.m60720ne());
                    if (c13021hu3 == null) {
                        throw new XmlSchemaException("The '{0}' element is not declared.", c13021hu.m60720ne().toString(), c13021hu);
                    }
                    m61826kk(c13021hu3);
                    if (c13021hu3.m60697b3() == null) {
                        throw new XmlSchemaException("Reference to invalid element '{0}'.", c13021hu.m60720ne().toString(), c13021hu);
                    }
                    c13021hu.m60731x1(c13021hu3.m60696ar());
                    c13125nkM61253c5 = c13021hu3.m60697b3().m61253c5();
                }
                if (c13125nkM61253c5.m61429b3() != null) {
                    c13125nkM61253c5.m61429b3().mo60029k4(this.f44616m9, (AbstractC13018hl) c13021hu);
                }
                if ((c13021hu.m60719m9() != null || c13021hu.m60706jd() != null) && c13125nkM61253c5.m61276rv() != null) {
                    if (c13125nkM61253c5.m61276rv().m61460x1() != 0 && (c13125nkM61253c5.m61276rv().m61460x1() != 3 || !c13125nkM61253c5.m61276rv().mo61457k4())) {
                        throw new XmlSchemaException("Element's type does not allow fixed or default value constraint.", c13021hu);
                    }
                    if (c13021hu.m60719m9() != null) {
                        c13125nkM61253c5.m61442m9(0);
                        strM60706jd = c13021hu.m60719m9();
                    } else {
                        c13125nkM61253c5.m61442m9(3);
                        strM60706jd = c13021hu.m60706jd();
                    }
                    c13125nkM61253c5.m61444to(strM60706jd);
                    if (c13125nkM61253c5.m61429b3() == null) {
                        objMo60025k4 = AbstractC13279x6.m61669k4().m60211bz().mo60025k4(c13125nkM61253c5.m61427ak(), m61165k4(), new C13270wt(c13021hu));
                    } else if (c13125nkM61253c5.m61429b3().mo60020fa() == 37) {
                        m61169k4("An attribute or element of type xs:ID or derived from xs:ID, should not have a value constraint.", c13021hu);
                    } else {
                        objMo60025k4 = c13125nkM61253c5.m61429b3().mo60026k4(c13125nkM61253c5.m61427ak(), m61165k4(), (InterfaceC13980t6) new C13270wt(c13021hu), true);
                    }
                    c13125nkM61253c5.m61437k4(objMo60025k4);
                }
                if (c13021hu.m60728v4()) {
                    C12908be c12908beM60729wl = c13021hu.m60729wl();
                    C13241up[] c13241upArr = new C13241up[c12908beM60729wl.size()];
                    int i = 0;
                    int i2 = 0;
                    while (i < c12908beM60729wl.size()) {
                        C12887a0 c12887a0 = (C12887a0) c12908beM60729wl.get_Item(i);
                        m61786k4(c12887a0);
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

    /* JADX INFO: renamed from: x1 */
    private C13106mq m61835x1(C13106mq c13106mq, C13106mq c13106mq2) {
        if (c13106mq == null) {
            return c13106mq2;
        }
        if (c13106mq2 == null) {
            return c13106mq;
        }
        C13106mq c13106mqM61181k4 = C13106mq.m61181k4(c13106mq, c13106mq2, false);
        if (c13106mqM61181k4 == null) {
            m61169k4("The 'anyAttribute' is not expressible.", c13106mq);
        }
        return c13106mqM61181k4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m61781k4(C13132o2 c13132o2, boolean z) {
        C13132o2 c13132o22;
        if (c13132o2.mo61012k4().size() > 0) {
            c13132o22 = new C13132o2();
            c13132o22.m60246k4(c13132o2.m60245g8().Clone());
            c13132o22.m60250x1(c13132o2.m60248sv().Clone());
            m61800k4((C13126nm) c13132o22, (C13126nm) c13132o2, true);
            for (int i = 0; i < c13132o2.mo61012k4().size(); i++) {
                AbstractC12950dp abstractC12950dpM61779k4 = m61779k4((AbstractC12950dp) c13132o2.mo61012k4().get_Item(i), false);
                if (abstractC12950dpM61779k4 != AbstractC12950dp.f43531k4) {
                    C14046bv c14046bvM60245g8 = abstractC12950dpM61779k4.m60245g8();
                    C14046bv c14046bv = C14046bv.f47169to;
                    if (C14046bv.m66453dy(c14046bvM60245g8, c14046bv) && C14046bv.m66453dy(abstractC12950dpM61779k4.m60248sv(), c14046bv) && C7019kk.m27469x1(abstractC12950dpM61779k4, C13132o2.class)) {
                        C13132o2 c13132o23 = (C13132o2) C7019kk.m27452k4((Object) abstractC12950dpM61779k4, C13132o2.class);
                        for (int i2 = 0; i2 < c13132o23.mo61012k4().size(); i2++) {
                            c13132o22.mo61012k4().m60092k4(c13132o23.mo61012k4().get_Item(i2));
                        }
                    } else {
                        c13132o22.mo61012k4().m60092k4(abstractC12950dpM61779k4);
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

    /* JADX INFO: renamed from: kk */
    private boolean m61827kk(AbstractC12950dp abstractC12950dp, AbstractC12950dp abstractC12950dp2) {
        return m61822k4(abstractC12950dp.m60245g8().Clone(), abstractC12950dp.m60248sv().Clone(), abstractC12950dp2.m60245g8().Clone(), abstractC12950dp2.m60248sv().Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private void m61836x1(C12969en c12969en) throws Throwable {
        C12969en c12969en2;
        if (c12969en.m60226wp() != null) {
            return;
        }
        if (c12969en.m60679e0()) {
            m61169k4("Circular type reference.", c12969en);
            return;
        }
        c12969en.m60681h4(true);
        try {
            if (c12969en.m60407ck() != null) {
                if (C7019kk.m27469x1(c12969en.m60407ck(), C13268wr.class)) {
                    C13268wr c13268wr = (C13268wr) c12969en.m60407ck();
                    c12969en.m60212c5(0);
                    if (C7019kk.m27469x1(c13268wr.m61663k4(), C13025i2.class)) {
                        m61796k4(c12969en, (C13025i2) c13268wr.m61663k4());
                    } else {
                        m61797k4(c12969en, (C13039iv) c13268wr.m61663k4());
                    }
                } else {
                    C12935cx c12935cx = (C12935cx) c12969en.m60407ck();
                    if (C7019kk.m27469x1(c12935cx.m60148x1(), C13258w2.class)) {
                        m61793k4(c12969en, c12935cx, (C13258w2) c12935cx.m60148x1());
                    } else {
                        m61792k4(c12969en, c12935cx, (C12913br) c12935cx.m60148x1());
                    }
                }
                c12969en2 = c12969en;
            } else {
                c12969en.m60218k4((C12943dd) C12969en.m60399k4());
                c12969en2 = c12969en;
                try {
                    m61795k4(C12969en.m60399k4(), c12969en2, c12969en.m60424up(), c12969en.m60431yj(), 4);
                    c12969en2.m60214dy(4);
                    c12969en2.m60429x1(m61832x1(c12969en2.m60409fa()));
                    c12969en2.m60212c5(m61778k4(c12969en2, (C12935cx) null, c12969en2.m60420ne()));
                } catch (Throwable th) {
                    th = th;
                    c12969en2.m60681h4(false);
                    throw th;
                }
            }
            if (c12969en2.m60422to(true)) {
                m61169k4("Two distinct members of the attribute uses must not have type definitions which are both xs:ID or are derived from xs:ID.", c12969en2);
            }
            C13125nk c13125nk = new C13125nk();
            c13125nk.m61269k4(m61773du(c12969en2));
            c13125nk.m61435k4((C12943dd) c12969en2);
            c13125nk.m61278to(c12969en2.m60408dy());
            c13125nk.m61434k4(c12969en2.m60211bz());
            c13125nk.m61264k4(c12969en2.m60410ix());
            c13125nk.m61268k4(c12969en2.m60425uz());
            Iterator it = c12969en2.m60423u4().m60648kk().iterator();
            while (it.hasNext()) {
                try {
                    C13146p4 c13146p4 = (C13146p4) it.next();
                    if (c13146p4.m61356ck() == 2) {
                        if (!c13125nk.m61282wl().containsKey(c13146p4.m61359fa())) {
                            c13125nk.m61282wl().addItem(c13146p4.m61359fa(), c13146p4.m61359fa());
                        }
                    } else if (!c13125nk.m61281uz().containsKey(c13146p4.m61359fa()) && c13146p4.m61369ks() != null && C13890ei.m65281x1(c13146p4.m61369ks().m61443qq(), C13890ei.f46456k4) && c13146p4.m61369ks() != C13061k5.f44035k4) {
                        c13125nk.m61267k4(c13146p4.m61369ks());
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
            c12969en2.m60219k4(c13125nk);
            c12969en2.m60681h4(false);
        } catch (Throwable th2) {
            th = th2;
            c12969en2 = c12969en;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12950dp m61782k4(C13141op c13141op, boolean z) {
        if (c13141op.mo61012k4().size() > 0) {
            C13141op c13141op2 = new C13141op();
            c13141op2.m60246k4(c13141op.m60245g8().Clone());
            c13141op2.m60250x1(c13141op.m60248sv().Clone());
            m61800k4((C13126nm) c13141op2, (C13126nm) c13141op, true);
            for (int i = 0; i < c13141op.mo61012k4().size(); i++) {
                AbstractC12950dp abstractC12950dpM61779k4 = m61779k4((AbstractC12950dp) c13141op.mo61012k4().get_Item(i), false);
                if (abstractC12950dpM61779k4 != AbstractC12950dp.f43531k4) {
                    c13141op2.mo61012k4().m60092k4(abstractC12950dpM61779k4);
                }
            }
            c13141op = c13141op2;
        }
        if (c13141op.mo61012k4().size() == 0) {
            return AbstractC12950dp.f43531k4;
        }
        if (z) {
            return c13141op;
        }
        m61169k4("'all' is not the only particle in a group, or is being used as an extension.", c13141op);
        return AbstractC12950dp.f43531k4;
    }

    /* JADX INFO: renamed from: kk */
    private C13164q9[] m61828kk(C13164q9 c13164q9) {
        ArrayList arrayList = new ArrayList();
        C12984fe c12984fe = (C12984fe) c13164q9.m61416k4();
        C13890ei[] c13890eiArrM60622x1 = c12984fe.m60622x1();
        if (c13890eiArrM60622x1 != null) {
            for (int i = 0; i < c13890eiArrM60622x1.length; i++) {
                C13164q9 c13164q9M61785k4 = m61785k4(c13890eiArrM60622x1[i]);
                if (c13164q9M61785k4 == null) {
                    throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", c13890eiArrM60622x1[i].toString(), c12984fe);
                }
                if (c13164q9M61785k4.m60211bz().mo60017ck() == 2) {
                    m61808k4(c13164q9M61785k4, arrayList, c13164q9);
                } else {
                    arrayList.addItem(c13164q9M61785k4);
                }
                if ((c13164q9M61785k4.m60225v4() & 16) != 0) {
                    m61169k4("The base type is the final union.", c13164q9);
                }
            }
        }
        C12908be c12908beM60619k4 = c12984fe.m60619k4();
        if (c12908beM60619k4 != null) {
            for (int i2 = 0; i2 < c12908beM60619k4.size(); i2++) {
                C13164q9 c13164q92 = (C13164q9) c12908beM60619k4.get_Item(i2);
                m61841x1(c13164q92);
                if (c13164q92.m60211bz().mo60017ck() == 2) {
                    m61808k4(c13164q92, arrayList, c13164q9);
                } else {
                    arrayList.addItem(c13164q92);
                }
            }
        }
        c12984fe.m60620k4((C13164q9[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(arrayList.toArray(C7019kk.m27443k4((Class<?>) C13164q9.class))), C13164q9[].class));
        return c12984fe.m60618h4();
    }

    /* JADX INFO: renamed from: x1 */
    private void m61837x1(C13146p4 c13146p4) {
        C13061k5 c13061k5;
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
                        m61841x1(c13146p4.m61361jd());
                        c13146p4.m61374x1(c13146p4.m61361jd());
                        c13061k5.m61435k4((C12943dd) c13146p4.m61361jd());
                        c13061k5.m61434k4(c13146p4.m61361jd().m60211bz());
                    } else if (c13146p4.m61355c5().m65287kk()) {
                        c13061k5.m61435k4((C12943dd) AbstractC13279x6.m61669k4());
                        c13061k5.m61434k4(AbstractC13279x6.m61669k4().m60211bz());
                        c13146p4.m61374x1(AbstractC13279x6.m61669k4());
                    } else {
                        C13164q9 c13164q9M61785k4 = m61785k4(c13146p4.m61355c5());
                        if (c13164q9M61785k4 == null) {
                            throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", c13146p4.m61355c5().toString(), c13146p4);
                        }
                        c13146p4.m61374x1(c13164q9M61785k4);
                        c13061k5.m61434k4(c13164q9M61785k4.m60211bz());
                        c13061k5.m61435k4((C12943dd) c13164q9M61785k4);
                    }
                    if (c13061k5.m61429b3() != null) {
                        c13061k5.m61429b3().mo60029k4(this.f44616m9, (AbstractC13018hl) c13146p4);
                    }
                    m61802k4(c13146p4, c13061k5);
                } else {
                    C13146p4 c13146p42 = (C13146p4) this.f44619x1.m60649kk(c13146p4.m61358dy());
                    if (c13146p42 == null) {
                        throw new XmlSchemaException("The '{0}' attribute is not declared.", c13146p4.m61358dy().toString(), c13146p4);
                    }
                    m61837x1(c13146p42);
                    if (c13146p42.m61369ks() == null) {
                        throw new XmlSchemaException("Reference to invalid attribute '{0}'.", c13146p4.m61358dy().toString(), c13146p4);
                    }
                    c13061k5 = c13146p42.m61369ks().m61048uz();
                    AbstractC12892ae abstractC12892aeM61429b3 = c13061k5.m61429b3();
                    if (abstractC12892aeM61429b3 != null) {
                        if (c13146p42.m61372x1() == null && c13146p42.m61362k4() == null) {
                            m61802k4(c13146p4, c13061k5);
                        } else if (c13146p42.m61372x1() != null) {
                            if (c13146p4.m61362k4() != null) {
                                throw new XmlSchemaException("The default value constraint cannot be present on the '{0}' attribute reference if the fixed value constraint is present on the declaration.", c13146p4.m61358dy().toString(), c13146p4);
                            }
                            if (c13146p4.m61372x1() != null) {
                                if (!abstractC12892aeM61429b3.mo60031k4(c13061k5.m61431dq(), abstractC12892aeM61429b3.mo60026k4(c13146p4.m61372x1(), m61165k4(), (InterfaceC13980t6) new C13270wt(c13146p4), true))) {
                                    throw new XmlSchemaException("The fixed value constraint on the '{0}' attribute reference must match the fixed value constraint on the declaration.", c13146p4.m61358dy().toString(), c13146p4);
                                }
                            }
                        }
                    }
                    c13146p4.m61374x1(c13146p42.m61371up());
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
    private AbstractC12950dp m61783k4(C13193s0 c13193s0, boolean z) {
        if (c13193s0.mo61012k4().size() > 0) {
            C13193s0 c13193s02 = new C13193s0();
            c13193s02.m60246k4(c13193s0.m60245g8().Clone());
            c13193s02.m60250x1(c13193s0.m60248sv().Clone());
            m61800k4((C13126nm) c13193s02, (C13126nm) c13193s0, true);
            for (int i = 0; i < c13193s0.mo61012k4().size(); i++) {
                AbstractC12950dp abstractC12950dpM61779k4 = m61779k4((AbstractC12950dp) c13193s0.mo61012k4().get_Item(i), false);
                if (abstractC12950dpM61779k4 != AbstractC12950dp.f43531k4) {
                    C13193s0 c13193s03 = (C13193s0) C7019kk.m27452k4((Object) abstractC12950dpM61779k4, C13193s0.class);
                    C14046bv c14046bvM60245g8 = abstractC12950dpM61779k4.m60245g8();
                    C14046bv c14046bv = C14046bv.f47169to;
                    if (C14046bv.m66453dy(c14046bvM60245g8, c14046bv) && C14046bv.m66453dy(abstractC12950dpM61779k4.m60248sv(), c14046bv) && c13193s03 != null) {
                        for (int i2 = 0; i2 < c13193s03.mo61012k4().size(); i2++) {
                            c13193s02.mo61012k4().m60092k4(c13193s03.mo61012k4().get_Item(i2));
                        }
                    } else {
                        c13193s02.mo61012k4().m60092k4(abstractC12950dpM61779k4);
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
    private void m61838x1(C13147p5 c13147p5) {
        if (c13147p5.m60679e0()) {
            m61169k4("Circular group reference.", c13147p5);
            c13147p5.m61384k4(AbstractC12950dp.f43531k4);
        } else {
            c13147p5.m60681h4(true);
            if (c13147p5.m61388m9() == null) {
                c13147p5.m61384k4(m61779k4((AbstractC12950dp) c13147p5.m61389x1(), true));
            }
            c13147p5.m60681h4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C13106mq m61784k4(C13106mq c13106mq, C13106mq c13106mq2) {
        if (c13106mq == null) {
            return c13106mq2;
        }
        if (c13106mq2 == null) {
            return c13106mq;
        }
        C13106mq c13106mqM61183x1 = C13106mq.m61183x1(c13106mq, c13106mq2, false);
        if (c13106mqM61183x1 == null) {
            m61169k4("The 'anyAttribute' is not expressible.", c13106mq);
        }
        return c13106mqM61183x1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m61839x1(C13149p8 c13149p8) {
        String string;
        AbstractC13018hl abstractC13018hl;
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
            try {
                C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c13149p8.m61402x1().get_Item(i), C13146p4.class);
                String str = "The attribute '{0}' already exists.";
                if (c13146p4 == null) {
                    C13161q1 c13161q1 = (C13161q1) c13149p8.m61402x1().get_Item(i);
                    C13149p8 c13149p8M61395jd = (c13149p8.m61395jd() == null || !C13890ei.m65278k4(c13161q1.m61409k4(), c13149p8.m61395jd().m61401m9())) ? (C13149p8) this.f44615kk.m60649kk(c13161q1.m61409k4()) : c13149p8.m61395jd();
                    if (c13149p8M61395jd != null) {
                        m61839x1(c13149p8M61395jd);
                        Iterator it = c13149p8M61395jd.m61393dy().m60648kk().iterator();
                        while (it.hasNext()) {
                            try {
                                C13146p4 c13146p42 = (C13146p4) it.next();
                                if (c13149p8.m61393dy().m60649kk(c13146p42.m61359fa()) == null) {
                                    c13149p8.m61393dy().m60647k4(c13146p42.m61359fa(), c13146p42);
                                } else {
                                    m61171k4("The attribute '{0}' already exists.", c13146p42.m61359fa().toString(), c13146p42);
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
                        c13106mqM61394h4 = m61835x1(c13106mqM61394h4, c13149p8M61395jd.m61391c5());
                    } else {
                        str = "Reference to undeclared attribute group '{0}'.";
                        string = c13161q1.m61409k4().toString();
                        abstractC13018hl = c13161q1;
                        m61171k4(str, string, abstractC13018hl);
                    }
                } else if (c13146p4.m61356ck() != 2) {
                    m61837x1(c13146p4);
                    if (c13149p8.m61393dy().m60649kk(c13146p4.m61359fa()) == null) {
                        c13149p8.m61393dy().m60647k4(c13146p4.m61359fa(), c13146p4);
                    } else {
                        string = c13146p4.m61359fa().toString();
                        abstractC13018hl = c13146p4;
                        m61171k4(str, string, abstractC13018hl);
                    }
                }
            } catch (Throwable th) {
                c13149p8.m60681h4(false);
                throw th;
            }
        }
        c13149p8.m61403x1(c13106mqM61394h4);
        c13149p8.m60681h4(false);
    }

    /* JADX INFO: renamed from: k4 */
    private C13164q9 m61785k4(C13890ei c13890ei) {
        C13164q9 c13164q9 = (C13164q9) C7019kk.m27452k4((Object) this.f44609du.m60649kk(c13890ei), C13164q9.class);
        if (c13164q9 == null) {
            return AbstractC13279x6.m61670k4(c13890ei);
        }
        m61841x1(c13164q9);
        return c13164q9;
    }

    /* JADX INFO: renamed from: x1 */
    private void m61840x1(C13149p8 c13149p8, C13149p8 c13149p82) {
        String str;
        C13106mq c13106mqM61391c5 = c13149p8.m61391c5();
        C13106mq c13106mqM61391c52 = c13149p82.m61391c5();
        if (c13106mqM61391c52 != null && (c13106mqM61391c5 == null || !C13106mq.m61182k4(c13106mqM61391c52, c13106mqM61391c5) || !m61810k4((C12969en) null, c13106mqM61391c52, c13106mqM61391c5))) {
            m61169k4("The base any attribute must be a superset of the derived 'anyAttribute'.", c13149p82);
        }
        Iterator it = c13149p8.m61393dy().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it.next();
                C13146p4 c13146p42 = (C13146p4) c13149p82.m61393dy().m60649kk(c13146p4.m61359fa());
                if (c13146p42 != null) {
                    if (c13146p4.m61356ck() == 2 && c13146p42.m61356ck() != 2) {
                        str = "Invalid attribute restriction. Attribute restriction is prohibited in base type.";
                    } else if (c13146p4.m61356ck() == 3 && c13146p42.m61356ck() != 3) {
                        str = "Derived attribute's use has to be required if base attribute's use is required.";
                    } else if (c13146p42.m61356ck() != 2) {
                        if (c13146p4.m61371up() == null || c13146p42.m61371up() == null || !C12943dd.m60206k4(c13146p42.m61371up(), c13146p4.m61371up(), 0)) {
                            str = "Invalid attribute restriction. Derived attribute's type is not a valid restriction of the base attribute's type.";
                        } else if (!m61819k4(c13146p4.m61369ks(), c13146p42.m61369ks())) {
                            str = "Invalid attribute restriction. Derived attribute's fixed value must be the same as the base attribute's fixed value.";
                        }
                    }
                    m61169k4(str, c13146p42);
                } else if (c13146p4.m61356ck() == 3) {
                    m61173k4("The base attribute '{0}' whose use = 'required' does not have a corresponding derived attribute while redefining attribute group '{1}'.", c13146p4.m61359fa().toString(), c13149p8.m61401m9().toString(), c13149p82);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        it = c13149p82.m61393dy().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13146p4 c13146p43 = (C13146p4) it.next();
                if (((C13146p4) c13149p8.m61393dy().m60649kk(c13146p43.m61359fa())) == null && (c13106mqM61391c5 == null || !c13106mqM61391c5.m61188k4(c13146p43.m61359fa()))) {
                    m61169k4("The {base type definition} must have an {attribute wildcard} and the {target namespace} of the R's {attribute declaration} must be valid with respect to that wildcard.", c13146p43);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61786k4(C12887a0 c12887a0) {
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
                    C12887a0 c12887a02 = (C12887a0) this.f44607c5.m60649kk(((C13145p3) c12887a0).m61353c5());
                    if (c12887a02 == null) {
                        throw new XmlSchemaException("The '{0}' identity constraint is not declared.", ((C13145p3) c12887a0).m61353c5().toString(), c12887a0);
                    }
                    m61786k4(c12887a02);
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

    /* JADX INFO: renamed from: x1 */
    private void m61841x1(C13164q9 c13164q9) {
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
                        m61841x1(c13263wh.m61661x1());
                        c13263wh.m61662x1(c13263wh.m61661x1());
                        abstractC12892aeM60211bz2 = c13263wh.m61661x1().m60211bz();
                    } else {
                        C13164q9 c13164q9M61785k4 = m61785k4(c13263wh.m61658k4());
                        if (c13164q9M61785k4 == null) {
                            throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", c13263wh.m61658k4().toString(), c13263wh);
                        }
                        if ((c13164q9M61785k4.m60225v4() & 8) != 0) {
                            m61169k4("The base type is the final list.", c13164q9);
                        }
                        c13263wh.m61662x1(c13164q9M61785k4);
                        abstractC12892aeM60211bz2 = c13164q9M61785k4.m60211bz();
                    }
                    c13164q9.m60217k4(abstractC12892aeM60211bz2.mo60024k4((C12943dd) c13164q9));
                } else {
                    if (!C7019kk.m27469x1(c13164q9.m61416k4(), C13261w8.class)) {
                        C13164q9[] c13164q9ArrM61828kk = m61828kk(c13164q9);
                        c13164q9.m60218k4((C12943dd) AbstractC13279x6.m61669k4());
                        c13164q9.m60217k4(AbstractC12892ae.m60014x1(c13164q9ArrM61828kk, (C12943dd) c13164q9));
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
                        m61841x1(c13261w8.m61656x1());
                        c13164q9.m60218k4((C12943dd) c13261w8.m61656x1());
                        c12943ddM60221ss = c13261w8.m61656x1();
                    } else if (c13164q9.m60221ss() == null || !C13890ei.m65278k4(c13261w8.m61653k4(), c13164q9.m60221ss().m60210bv())) {
                        if (c13261w8.m61653k4().equals(AbstractC13279x6.f44493k4) && !"http://www.w3.org/2001/XMLSchema".equals(C13091ly.m61115k4((AbstractC13018hl) c13164q9).m61697du())) {
                            throw new XmlSchemaException("Restriction of 'anySimpleType' is not allowed.", c13261w8.m61653k4().toString(), c13164q9);
                        }
                        C13164q9 c13164q9M61785k42 = m61785k4(c13261w8.m61653k4());
                        if (c13164q9M61785k42 == null) {
                            throw new XmlSchemaException("Type '{0}' is not declared, or is not a simple type.", c13261w8.m61653k4().toString(), c13261w8);
                        }
                        if ((c13164q9M61785k42.m60225v4() & 4) != 0) {
                            m61169k4("The base type is final restriction.", c13164q9);
                        }
                        c13164q9.m60218k4((C12943dd) c13164q9M61785k42);
                        abstractC12892aeM60211bz = c13164q9M61785k42.m60211bz();
                        c13164q9.m60217k4(abstractC12892aeM60211bz.mo60023k4(c13261w8.m61652h4(), m61165k4(), c13164q9));
                    } else {
                        m61841x1((C13164q9) c13164q9.m60221ss());
                        c13164q9.m60218k4(c13164q9.m60221ss().m60231yd());
                        c12943ddM60221ss = c13164q9.m60221ss();
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
    private void m61787k4(C12908be c12908be) {
        for (int i = 0; i < c12908be.size(); i++) {
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12908be.get_Item(i), C13146p4.class);
            if (c13146p4 != null) {
                m61801k4(c13146p4);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m61842x1(AbstractC12950dp abstractC12950dp, AbstractC12950dp abstractC12950dp2) {
        AbstractC12950dp abstractC12950dp3;
        String strM65818k4;
        String strM65818k42;
        if (abstractC12950dp == abstractC12950dp2) {
            return true;
        }
        if (abstractC12950dp == null || abstractC12950dp == (abstractC12950dp3 = AbstractC12950dp.f43531k4)) {
            return m61831to(abstractC12950dp2);
        }
        if (abstractC12950dp2 != null && abstractC12950dp2 != abstractC12950dp3) {
            if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                abstractC12950dp = m61833x1((C13021hu) abstractC12950dp);
            }
            if (C7019kk.m27469x1(abstractC12950dp2, C13021hu.class)) {
                C13021hu c13021hu = (C13021hu) abstractC12950dp2;
                AbstractC12950dp abstractC12950dpM61833x1 = m61833x1(c13021hu);
                if (C7019kk.m27469x1(abstractC12950dpM61833x1, C13132o2.class)) {
                    return m61842x1(abstractC12950dp, abstractC12950dpM61833x1);
                }
                if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                    return m61813k4((C13021hu) abstractC12950dp, c13021hu);
                }
                this.f44614k4 = C13968ri.m65818k4("Only 'element' is valid as derived particle when the base particle is 'element'.");
                return false;
            }
            if (C7019kk.m27469x1(abstractC12950dp2, C12989fu.class)) {
                return C7019kk.m27469x1(abstractC12950dp, C13021hu.class) ? m61812k4((C13021hu) abstractC12950dp, (C12989fu) abstractC12950dp2) : C7019kk.m27469x1(abstractC12950dp, C12989fu.class) ? m61811k4((C12989fu) abstractC12950dp, (C12989fu) abstractC12950dp2) : m61815k4((AbstractC13054jn) abstractC12950dp, (C12989fu) abstractC12950dp2);
            }
            if (C7019kk.m27469x1(abstractC12950dp2, C13141op.class)) {
                if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                    return m61814k4((C13021hu) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2);
                }
                if (!C7019kk.m27469x1(abstractC12950dp, C13141op.class)) {
                    if (C7019kk.m27469x1(abstractC12950dp, C13193s0.class)) {
                        if (m61821k4((C13193s0) abstractC12950dp, (C13141op) abstractC12950dp2)) {
                            return true;
                        }
                        strM65818k42 = C13968ri.m65819k4("The derived sequence particle at ({0}, {1}) is not a valid restriction of the base all particle at ({2}, {3}) according to Sequence:All -- RecurseUnordered.", C14057f9.m66586k4(abstractC12950dp.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC12950dp.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC12950dp2.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC12950dp2.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()));
                    } else if (C7019kk.m27469x1(abstractC12950dp, C13132o2.class) || C7019kk.m27469x1(abstractC12950dp, C12989fu.class)) {
                        strM65818k42 = C13968ri.m65818k4("'Choice' or 'any' is forbidden as derived particle when the base particle is 'all'.");
                    }
                    this.f44614k4 = strM65818k42;
                } else if (m61816k4((AbstractC13054jn) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2, true)) {
                    return true;
                }
                return false;
            }
            if (C7019kk.m27469x1(abstractC12950dp2, C13132o2.class)) {
                if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                    return m61814k4((C13021hu) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2);
                }
                if (C7019kk.m27469x1(abstractC12950dp, C13132o2.class)) {
                    C13132o2 c13132o2 = (C13132o2) C7019kk.m27452k4((Object) abstractC12950dp2, C13132o2.class);
                    C13132o2 c13132o22 = (C13132o2) C7019kk.m27452k4((Object) abstractC12950dp, C13132o2.class);
                    if (c13132o2.m60677c6() == null || c13132o22.m60677c6() == null) {
                        return m61818k4(c13132o22, c13132o2);
                    }
                    if (m61816k4((AbstractC13054jn) c13132o22, (AbstractC13054jn) c13132o2, false)) {
                        return true;
                    }
                } else {
                    if (!C7019kk.m27469x1(abstractC12950dp, C13193s0.class)) {
                        strM65818k4 = C13968ri.m65818k4("'All' or 'any' is forbidden as derived particle when the base particle is 'choice'.");
                    } else {
                        if (m61820k4((C13193s0) abstractC12950dp, (C13132o2) abstractC12950dp2)) {
                            return true;
                        }
                        strM65818k4 = C13968ri.m65819k4("The derived sequence particle at ({0}, {1}) is not a valid restriction of the base choice particle at ({2}, {3}) according to Sequence:Choice -- MapAndSum.", C14057f9.m66586k4(abstractC12950dp.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC12950dp.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC12950dp2.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC12950dp2.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()));
                    }
                    this.f44614k4 = strM65818k4;
                }
                return false;
            }
            if (C7019kk.m27469x1(abstractC12950dp2, C13193s0.class)) {
                if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
                    return m61814k4((C13021hu) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2);
                }
                if (!C7019kk.m27469x1(abstractC12950dp, C13193s0.class) && (!C7019kk.m27469x1(abstractC12950dp, C13141op.class) || ((AbstractC13054jn) abstractC12950dp).mo61012k4().size() != 1)) {
                    this.f44614k4 = C13968ri.m65818k4("'All', 'any', and 'choice' are forbidden as derived particles when the base particle is 'sequence'.");
                } else if (m61816k4((AbstractC13054jn) abstractC12950dp, (AbstractC13054jn) abstractC12950dp2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61788k4(AbstractC12950dp abstractC12950dp) {
        C13021hu c13021hu = (C13021hu) C7019kk.m27452k4((Object) abstractC12950dp, C13021hu.class);
        if (c13021hu != null) {
            m61798k4(c13021hu);
            return;
        }
        AbstractC13054jn abstractC13054jn = (AbstractC13054jn) C7019kk.m27452k4((Object) abstractC12950dp, AbstractC13054jn.class);
        if (abstractC13054jn != null) {
            for (int i = 0; i < abstractC13054jn.mo61012k4().size(); i++) {
                m61788k4((AbstractC12950dp) abstractC13054jn.mo61012k4().get_Item(i));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61789k4(AbstractC12950dp abstractC12950dp, AbstractC12950dp abstractC12950dp2) {
        this.f44614k4 = null;
        AbstractC12950dp abstractC12950dpM61824kk = m61824kk(abstractC12950dp);
        if (m61842x1(abstractC12950dpM61824kk, m61824kk(abstractC12950dp2))) {
            return;
        }
        String str = this.f44614k4;
        if (str != null) {
            m61171k4("Invalid particle derivation by restriction - '{0}'.", str, abstractC12950dpM61824kk);
        } else {
            m61169k4("Invalid particle derivation by restriction.", abstractC12950dpM61824kk);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61790k4(AbstractC12950dp abstractC12950dp, C14046bv[] c14046bvArr, C14046bv[] c14046bvArr2) {
        C13132o2 c13132o2 = (C13132o2) C7019kk.m27452k4((Object) abstractC12950dp, C13132o2.class);
        if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class) || C7019kk.m27469x1(abstractC12950dp, C12989fu.class)) {
            abstractC12950dp.m60245g8().CloneTo(c14046bvArr[0]);
            abstractC12950dp.m60248sv().CloneTo(c14046bvArr2[0]);
            return;
        }
        if (c13132o2 != null) {
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
                m61790k4((AbstractC12950dp) c13132o2.mo61012k4().get_Item(i), c14046bvArr3, c14046bvArr4);
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
            m61790k4((AbstractC12950dp) c12908beMo61012k4.get_Item(i2), c14046bvArr5, c14046bvArr6);
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
    private void m61791k4(C12969en c12969en) {
        C12908be c12908beM60424up;
        if (C13890ei.m65278k4(c12969en.m60210bv(), AbstractC13279x6.f44531x1)) {
            return;
        }
        if (c12969en.m60407ck() == null) {
            m61788k4(c12969en.m60409fa());
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
                m61788k4(c13258w2.m61651x1());
                c12908beM60424up = c13258w2.m61644h4();
            } else {
                C12913br c12913br = (C12913br) abstractC13101mcM60148x1;
                m61788k4(c12913br.m60105x1());
                c12908beM60424up = c12913br.m60098h4();
            }
        }
        m61787k4(c12908beM60424up);
        c12969en.m60426wl().m60645k4();
        c12969en.m60423u4().m60645k4();
        c12969en.m60430x1((C13106mq) null);
        c12969en.m60429x1(AbstractC12950dp.f43531k4);
        c12969en.m60219k4((C13125nk) null);
        c12969en.m60418kk(false);
        if (c12969en.m60221ss() != null) {
            m61791k4((C12969en) C7019kk.m27452k4((Object) c12969en.m60221ss(), C12969en.class));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61792k4(C12969en c12969en, C12935cx c12935cx, C12913br c12913br) throws Throwable {
        C12969en c12969enM61834x1;
        String str;
        if (c12969en.m60221ss() == null || !C13890ei.m65278k4(c12913br.m60099k4(), c12969en.m60221ss().m60210bv())) {
            c12969enM61834x1 = m61834x1(c12913br.m60099k4());
            if (c12969enM61834x1 == null) {
                m61171k4("Undefined complexType '{0}' is used as a base for complex type restriction.", c12913br.m60099k4().toString(), c12913br);
                return;
            }
        } else {
            c12969enM61834x1 = (C12969en) c12969en.m60221ss();
            m61836x1(c12969enM61834x1);
        }
        C12969en c12969en2 = c12969enM61834x1;
        c12969en.m60218k4((C12943dd) c12969en2);
        if ((c12969en2.m60225v4() & 4) != 0) {
            m61169k4("The base type is final restriction.", c12969en);
        }
        m61795k4(c12969en2, c12969en, c12913br.m60098h4(), c12913br.m60104m9(), 4);
        c12969en.m60429x1(m61832x1(c12913br.m60105x1()));
        int iM61778k4 = m61778k4(c12969en, c12935cx, c12969en.m60420ne());
        c12969en.m60212c5(iM61778k4);
        if (iM61778k4 != 1) {
            if (iM61778k4 == 3 && c12969en2.m60419ks() != 3) {
                str = "If the derived content type is Mixed, then the base content type should also be Mixed according to rule 5.4 of Schema Component Constraint: Derivation Valid (Restriction, Complex).";
                m61171k4("Invalid content type derivation by restriction. {0}", C13968ri.m65818k4(str), c12969en);
            }
        } else if (c12969en2.m60226wp() != null && !c12969en2.m60226wp().m61276rv().mo61457k4()) {
            str = "If the derived content type is Empty, then the base content type should also be Empty or Mixed with Emptiable particle according to rule 5.3 of Schema Component Constraint: Derivation Valid (Restriction, Complex).";
            m61171k4("Invalid content type derivation by restriction. {0}", C13968ri.m65818k4(str), c12969en);
        }
        c12969en.m60214dy(4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61793k4(C12969en c12969en, C12935cx c12935cx, C13258w2 c13258w2) throws Throwable {
        C12969en c12969enM61834x1;
        if (c12969en.m60221ss() == null || !C13890ei.m65278k4(c13258w2.m61645k4(), c12969en.m60221ss().m60210bv())) {
            c12969enM61834x1 = m61834x1(c13258w2.m61645k4());
            if (c12969enM61834x1 == null) {
                m61171k4("Undefined complexType '{0}' is used as a base for complex type extension.", c13258w2.m61645k4().toString(), c13258w2);
                return;
            }
        } else {
            c12969enM61834x1 = (C12969en) c12969en.m60221ss();
            m61836x1(c12969enM61834x1);
        }
        C12969en c12969en2 = c12969enM61834x1;
        if ((c12969en2.m60225v4() & 2) != 0) {
            m61169k4("The base type is the final extension.", c12969en);
        }
        m61795k4(c12969en2, c12969en, c13258w2.m61644h4(), c13258w2.m61650m9(), 2);
        AbstractC12950dp abstractC12950dpM60420ne = c12969en2.m60420ne();
        AbstractC12950dp abstractC12950dpM61779k4 = m61779k4(c13258w2.m61651x1(), true);
        AbstractC12950dp abstractC12950dp = AbstractC12950dp.f43531k4;
        if (abstractC12950dpM60420ne != abstractC12950dp) {
            if (abstractC12950dpM61779k4 != abstractC12950dp) {
                C13193s0 c13193s0 = new C13193s0();
                c13193s0.mo61012k4().m60092k4(abstractC12950dpM60420ne);
                c13193s0.mo61012k4().m60092k4(abstractC12950dpM61779k4);
                abstractC12950dpM60420ne = m61832x1(c13193s0);
            }
            c12969en.m60429x1(abstractC12950dpM60420ne);
        } else {
            c12969en.m60429x1(abstractC12950dpM61779k4);
        }
        int iM61778k4 = m61778k4(c12969en, c12935cx, abstractC12950dpM61779k4);
        if (iM61778k4 == 1 && (iM61778k4 = c12969en2.m60419ks()) == 0) {
            c12969en.m60217k4(c12969en2.m60211bz());
        }
        c12969en.m60212c5(iM61778k4);
        if (c12969en2.m60419ks() != 1 && c12969en.m60419ks() != c12969en2.m60419ks()) {
            m61169k4("The derived type and the base type must have the same content type.", c12969en);
        } else {
            c12969en.m60218k4((C12943dd) c12969en2);
            c12969en.m60214dy(2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61794k4(C12969en c12969en, AbstractC12950dp abstractC12950dp) {
        if (!C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
            if (C7019kk.m27469x1(abstractC12950dp, AbstractC13054jn.class)) {
                C12908be c12908beMo61012k4 = ((AbstractC13054jn) abstractC12950dp).mo61012k4();
                for (int i = 0; i < c12908beMo61012k4.size(); i++) {
                    m61794k4(c12969en, (AbstractC12950dp) c12908beMo61012k4.get_Item(i));
                }
                return;
            }
            return;
        }
        C13021hu c13021hu = (C13021hu) abstractC12950dp;
        m61826kk(c13021hu);
        AbstractC13018hl abstractC13018hlM60649kk = c12969en.m60426wl().m60649kk(c13021hu.m60721qq());
        C13005gv c13005gvM60426wl = c12969en.m60426wl();
        if (abstractC13018hlM60649kk == null) {
            c13005gvM60426wl.m60647k4(c13021hu.m60721qq(), c13021hu);
        } else if (((C13021hu) c13005gvM60426wl.m60649kk(c13021hu.m60721qq())).m60696ar() != c13021hu.m60696ar()) {
            m61169k4("Elements with the same name and in the same scope must have the same type.", abstractC12950dp);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61795k4(C12969en c12969en, C12969en c12969en2, C12908be c12908be, C13106mq c13106mq, int i) {
        Iterator it;
        String str;
        String str2;
        C12908be c12908be2 = c12908be;
        C13106mq c13106mqM60425uz = c12969en != null ? c12969en.m60425uz() : null;
        C13106mq c13106mqM61835x1 = c13106mq;
        int i2 = 0;
        while (true) {
            int i3 = 2;
            if (i2 >= c12908be2.size()) {
                break;
            }
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12908be2.get_Item(i2), C13146p4.class);
            if (c13146p4 != null) {
                if (c13146p4.m61356ck() != 2) {
                    m61837x1(c13146p4);
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
                C13149p8 c13149p8 = (C13149p8) this.f44615kk.m60649kk(c13161q1.m61409k4());
                if (c13149p8 != null) {
                    m61839x1(c13149p8);
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
                    c13106mqM61835x1 = m61835x1(c13106mqM61835x1, c13149p8.m61391c5());
                } else {
                    m61171k4("Reference to undeclared attribute group '{0}'.", c13161q1.m61409k4().toString(), c13161q1);
                }
            }
            i2++;
            c12908be2 = c12908be;
        }
        if (c12969en == null) {
            c12969en2.m60430x1(c13106mqM61835x1);
            return;
        }
        if (i == 2) {
            c12969en2.m60430x1(m61784k4(c13106mqM61835x1, c13106mqM60425uz));
            Iterator it2 = c12969en.m60423u4().m60648kk().iterator();
            while (it2.hasNext()) {
                try {
                    C13146p4 c13146p43 = (C13146p4) it2.next();
                    C13146p4 c13146p44 = (C13146p4) c12969en2.m60423u4().m60649kk(c13146p43.m61359fa());
                    if (c13146p44 == null) {
                        c12969en2.m60423u4().m60647k4(c13146p43.m61359fa(), c13146p43);
                    } else if (c13146p43.m61356ck() != 2 && c13146p44.m61371up() != c13146p43.m61371up()) {
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
        if (c13106mqM61835x1 == null || (c13106mqM60425uz != null && C13106mq.m61182k4(c13106mqM61835x1, c13106mqM60425uz) && m61810k4(c12969en, c13106mqM61835x1, c13106mqM60425uz))) {
            c12969en2.m60430x1(c13106mqM61835x1);
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
                } else {
                    if (c13146p45.m61356ck() == 2 && c13146p46.m61356ck() != 2) {
                        str2 = "Invalid attribute restriction. Attribute restriction is prohibited in base type.";
                    } else if (c13146p45.m61356ck() == 3 && c13146p46.m61356ck() != 3) {
                        str2 = "Derived attribute's use has to be required if base attribute's use is required.";
                    } else if (c13146p46.m61356ck() != 2) {
                        if (c13146p45.m61371up() == null || c13146p46.m61371up() == null) {
                            str = "Invalid attribute restriction. Derived attribute's type is not a valid restriction of the base attribute's type.";
                            m61169k4(str, c13146p46);
                        } else if (!C12943dd.m60206k4(c13146p46.m61371up(), c13146p45.m61371up(), 0)) {
                            str = "Invalid attribute restriction. Derived attribute's type is not a valid restriction of the base attribute's type.";
                            m61169k4(str, c13146p46);
                        } else if (!m61819k4(c13146p45.m61369ks(), c13146p46.m61369ks())) {
                            str = "Invalid attribute restriction. Derived attribute's fixed value must be the same as the base attribute's fixed value.";
                            m61169k4(str, c13146p46);
                        }
                    }
                    m61169k4(str2, c13146p46);
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
    private void m61796k4(C12969en c12969en, C13025i2 c13025i2) throws Throwable {
        C12969en c12969en2;
        if (c12969en.m60221ss() == null || !C13890ei.m65278k4(c13025i2.m60741k4(), c12969en.m60221ss().m60210bv())) {
            C12943dd c12943ddM61823kk = m61823kk(c13025i2.m60741k4());
            if (c12943ddM61823kk == null) {
                m61171k4("Type '{0}' is not declared.", c13025i2.m60741k4().toString(), c13025i2);
            } else {
                c12969en.m60218k4(c12943ddM61823kk);
                c12969en.m60217k4(c12943ddM61823kk.m60211bz());
            }
            c12969en2 = (C12969en) C7019kk.m27452k4((Object) c12943ddM61823kk, C12969en.class);
        } else {
            c12969en2 = (C12969en) c12969en.m60221ss();
            m61836x1(c12969en2);
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
        m61795k4(c12969en3, c12969en, c13025i2.m60745x1(), c13025i2.m60740h4(), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61797k4(C12969en c12969en, C13039iv c13039iv) throws Throwable {
        C12969en c12969enM61834x1;
        AbstractC12892ae abstractC12892aeM60211bz;
        C12969en c12969en2;
        if (c12969en.m60221ss() == null || !C13890ei.m65278k4(c13039iv.m60752k4(), c12969en.m60221ss().m60210bv())) {
            c12969enM61834x1 = m61834x1(c13039iv.m60752k4());
            if (c12969enM61834x1 == null) {
                m61171k4("Undefined complexType '{0}' is used as a base for complex type restriction.", c13039iv.m60752k4().toString(), c13039iv);
                return;
            }
            if (c12969enM61834x1.m60419ks() != 0) {
                if (c12969enM61834x1.m60419ks() != 3 || !c12969enM61834x1.m60226wp().m61276rv().mo61457k4()) {
                    m61169k4("The content type of the base type must be a simple type definition or it must be mixed, and simpleType child must be present.", c12969en);
                } else if (c13039iv.m60758x1() != null) {
                    m61841x1(c13039iv.m60758x1());
                    c12969en.m60218k4((C12943dd) c13039iv.m60758x1());
                } else {
                    m61169k4("Simple content restriction must have a simple type child if the content type of the base type is not a simple type definition.", c13039iv);
                }
                abstractC12892aeM60211bz = null;
                c12969en2 = c12969enM61834x1;
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
                m61795k4(c12969en2, c12969en, c13039iv.m60757m9(), c13039iv.m60750dy(), 4);
            }
            if (c13039iv.m60758x1() != null) {
                m61841x1(c13039iv.m60758x1());
                if (!C12943dd.m60205k4(c13039iv.m60758x1().m60211bz(), c12969enM61834x1.m60211bz(), 256)) {
                    m61169k4("The data type of the simple content is not a valid restriction of the base complex type.", c13039iv);
                }
            }
            abstractC12892aeM60211bz = c13039iv.m60758x1().m60211bz();
            c12969en2 = c12969enM61834x1;
            if (c12969en2.m60226wp() != null) {
                m61169k4("The base type is final restriction.", c12969en);
            }
            c12969en.m60218k4((C12943dd) c12969en2);
            if (abstractC12892aeM60211bz != null) {
            }
            c12969en.m60214dy(4);
            m61795k4(c12969en2, c12969en, c13039iv.m60757m9(), c13039iv.m60750dy(), 4);
        }
        c12969enM61834x1 = (C12969en) c12969en.m60221ss();
        m61836x1(c12969enM61834x1);
        abstractC12892aeM60211bz = c12969enM61834x1.m60211bz();
        c12969en2 = c12969enM61834x1;
        if (c12969en2.m60226wp() != null) {
        }
        c12969en.m60218k4((C12943dd) c12969en2);
        if (abstractC12892aeM60211bz != null) {
        }
        c12969en.m60214dy(4);
        m61795k4(c12969en2, c12969en, c13039iv.m60757m9(), c13039iv.m60750dy(), 4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61798k4(C13021hu c13021hu) {
        if (c13021hu.m60727uz() != null) {
            C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) c13021hu.m60727uz(), C12969en.class);
            if (c12969en != null) {
                m61791k4(c12969en);
            } else {
                m61807k4((C13164q9) c13021hu.m60727uz());
            }
        }
        for (int i = 0; i < c13021hu.m60729wl().size(); i++) {
            ((C12887a0) c13021hu.m60729wl().get_Item(i)).m59984k4((C13241up) null);
        }
        c13021hu.m60710k4((C13125nk) null);
        c13021hu.m60717kk(false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61799k4(C13078l0 c13078l0) {
        C13078l0 c13078l02;
        if (c13078l0.m60679e0() && c13078l0.m61097k4().size() > 0) {
            m61169k4("Circular substitution group affiliation.", (C13021hu) c13078l0.m61097k4().get_Item(0));
            return;
        }
        C13021hu c13021hu = (C13021hu) this.f44617to.m60649kk(c13078l0.m61099x1());
        if (c13078l0.m61097k4().contains(c13021hu)) {
            return;
        }
        c13078l0.m60681h4(true);
        try {
            if (c13021hu.m60698bv() == 255) {
                m61169k4("Cannot be nominated as the {substitution group affiliation} of any other declaration.", c13021hu);
            }
            ArrayList arrayList = null;
            for (int i = 0; i < c13078l0.m61097k4().size(); i++) {
                C13021hu c13021hu2 = (C13021hu) c13078l0.m61097k4().get_Item(i);
                if ((c13021hu2.m60697b3().m61258fa() & 1) == 0 && (c13078l02 = (C13078l0) this.f44610dy.m60649kk(c13021hu2.m60721qq())) != null) {
                    m61799k4(c13078l02);
                    for (int i2 = 0; i2 < c13078l02.m61097k4().size(); i2++) {
                        if (c13078l02.m61097k4().get_Item(i2) != c13021hu2) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.addItem(c13078l02.m61097k4().get_Item(i2));
                        }
                    }
                }
            }
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    c13078l0.m61097k4().addItem(arrayList.get_Item(i3));
                }
            }
            c13078l0.m61097k4().addItem(c13021hu);
            c13078l0.m60681h4(false);
        } catch (Throwable th) {
            c13078l0.m60681h4(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61800k4(C13126nm c13126nm, C13126nm c13126nm2, boolean z) {
        c13126nm.m60688m9(c13126nm2.m60693xk());
        c13126nm.m60687m9(c13126nm2.m60678dq());
        c13126nm.m60680h4(c13126nm2.m60676ak());
        c13126nm.mo60685k4(c13126nm2.m61289du());
        if (z) {
            c13126nm.m60684k4(c13126nm2.m60677c6());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61844k4(C13129ny c13129ny) {
        SortedList sortedListM61336rv = c13129ny.m61336rv();
        for (int i = 0; i < sortedListM61336rv.size(); i++) {
            C13282xc c13282xc = (C13282xc) sortedListM61336rv.getByIndex(i);
            if (c13282xc.m61695c5()) {
                m61845k4(c13282xc, false);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61801k4(C13146p4 c13146p4) {
        if (c13146p4.m61361jd() != null) {
            m61807k4(c13146p4.m61361jd());
        }
        c13146p4.m61364k4((C13061k5) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61802k4(C13146p4 c13146p4, C13061k5 c13061k5) {
        String strM61372x1;
        if (c13146p4.m61362k4() == null && c13146p4.m61372x1() == null) {
            int iM61356ck = c13146p4.m61356ck();
            if (iM61356ck == 0 || iM61356ck == 1) {
                c13061k5.m61442m9(2);
                return;
            } else {
                if (iM61356ck != 3) {
                    return;
                }
                c13061k5.m61442m9(1);
                return;
            }
        }
        if (c13146p4.m61362k4() != null) {
            c13061k5.m61442m9(0);
            strM61372x1 = c13146p4.m61362k4();
        } else {
            if (c13146p4.m61356ck() == 3) {
                c13061k5.m61442m9(4);
            } else {
                c13061k5.m61442m9(3);
            }
            strM61372x1 = c13146p4.m61372x1();
        }
        c13061k5.m61037k4(strM61372x1);
        c13061k5.m61444to(strM61372x1);
        if (c13061k5.m61429b3() != null) {
            if (c13061k5.m61429b3().mo60020fa() == 37) {
                m61169k4("An attribute or element of type xs:ID or derived from xs:ID, should not have a value constraint.", c13146p4);
            } else {
                c13061k5.m61437k4(c13061k5.m61429b3().mo60026k4(c13061k5.m61427ak(), m61165k4(), (InterfaceC13980t6) new C13270wt(c13146p4), true));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61803k4(C13147p5 c13147p5) {
        m61788k4(c13147p5.m61389x1());
        c13147p5.m61384k4((AbstractC12950dp) null);
        if (c13147p5.m61379dy() != null) {
            m61803k4(c13147p5.m61379dy());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61804k4(C13147p5 c13147p5, C13147p5 c13147p52) {
        if (c13147p52.m61379dy() != null) {
            m61804k4(c13147p52, c13147p52.m61379dy());
        }
        if (c13147p5.m61378c5() == 0) {
            if (c13147p52.m61388m9() == null) {
                c13147p52.m61384k4(m61779k4((AbstractC12950dp) c13147p52.m61389x1(), true));
            }
            if (c13147p5.m61388m9() == null) {
                c13147p5.m61384k4(m61779k4((AbstractC12950dp) c13147p5.m61389x1(), true));
            }
            m61774du(c13147p5.m61388m9());
            m61774du(c13147p52.m61388m9());
            m61789k4(c13147p5.m61388m9(), c13147p52.m61388m9());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61805k4(C13149p8 c13149p8) {
        m61787k4(c13149p8.m61402x1());
        c13149p8.m61393dy().m60645k4();
        c13149p8.m61403x1((C13106mq) null);
        if (c13149p8.m61395jd() != null) {
            m61805k4(c13149p8.m61395jd());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61806k4(C13149p8 c13149p8, C13149p8 c13149p82) {
        if (c13149p82.m61395jd() != null) {
            m61806k4(c13149p82, c13149p82.m61395jd());
        }
        if (c13149p8.m61392ck() == 0) {
            m61839x1(c13149p82);
            m61839x1(c13149p8);
            m61840x1(c13149p82, c13149p8);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61807k4(C13164q9 c13164q9) {
        if (c13164q9 == C12943dd.m60207kk(c13164q9.m60220qm())) {
            return;
        }
        c13164q9.m60219k4((C13125nk) null);
        if (c13164q9.m60221ss() != null) {
            m61807k4((C13164q9) C7019kk.m27452k4((Object) c13164q9.m60221ss(), C13164q9.class));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61808k4(C13164q9 c13164q9, ArrayList arrayList, C13164q9 c13164q92) {
        AbstractC12892ae abstractC12892aeM60211bz = c13164q9.m60211bz();
        if (c13164q9.m60209b3() == 4 && (abstractC12892aeM60211bz.mo60036yj() || abstractC12892aeM60211bz.mo60032ks())) {
            m61169k4("It is an error if a union type has a member with variety union and this member cannot be substituted with its own members. This may be due to the fact that the union member is a restriction of a union with facets.", c13164q92);
        } else {
            arrayList.addRange(AbstractC14092to.m67208k4((Object) ((C13301y9) C7019kk.m27452k4((Object) c13164q9.m60211bz(), C13301y9.class)).m61769wl()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61845k4(C13282xc c13282xc, boolean z) {
        if (this.f44608ck.get_Item(c13282xc) != null) {
            return;
        }
        this.f44608ck.addItem(c13282xc, c13282xc);
        Iterator it = c13282xc.m61717ks().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it.next();
                if (z) {
                    m61798k4(c13021hu);
                }
                m61168k4(this.f44617to, c13021hu.m60721qq(), c13021hu);
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        Iterator it2 = c13282xc.m61701fa().m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it2.next();
                if (z) {
                    m61801k4(c13146p4);
                }
                m61168k4(this.f44619x1, c13146p4.m61359fa(), c13146p4);
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        Iterator it3 = c13282xc.m61735x6().m60648kk().iterator();
        while (it3.hasNext()) {
            try {
                C13147p5 c13147p5 = (C13147p5) it3.next();
                if (z) {
                    m61803k4(c13147p5);
                }
                m61168k4(this.f44612h4, c13147p5.m61380h4(), c13147p5);
            } finally {
                if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        Iterator it4 = c13282xc.m61727up().m60648kk().iterator();
        while (it4.hasNext()) {
            try {
                C13149p8 c13149p8 = (C13149p8) it4.next();
                if (z) {
                    m61805k4(c13149p8);
                }
                m61168k4(this.f44615kk, c13149p8.m61401m9(), c13149p8);
            } finally {
            }
        }
        if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it4).dispose();
        }
        it = c13282xc.m61737yj().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it.next();
                if (z) {
                    C12969en c12969en = (C12969en) C7019kk.m27452k4((Object) c12943dd, C12969en.class);
                    if (c12969en != null) {
                        m61791k4(c12969en);
                    } else {
                        m61807k4((C13164q9) C7019kk.m27452k4((Object) c12943dd, C13164q9.class));
                    }
                }
                m61168k4(this.f44609du, c12943dd.m60210bv(), c12943dd);
            } finally {
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        Iterator it5 = c13282xc.m61719ne().m60648kk().iterator();
        while (it5.hasNext()) {
            try {
                C13237ul c13237ul = (C13237ul) it5.next();
                m61168k4(this.f44616m9, c13237ul.m61633m9(), c13237ul);
            } finally {
            }
        }
        if (C7019kk.m27456k4(it5, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it5).dispose();
        }
        it5 = c13282xc.m61703ix().m60648kk().iterator();
        while (it5.hasNext()) {
            try {
                C12887a0 c12887a0 = (C12887a0) it5.next();
                m61168k4(this.f44607c5, c12887a0.m59986m9(), c12887a0);
            } finally {
            }
        }
        if (C7019kk.m27456k4(it5, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it5).dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61809k4(C13322zd c13322zd) {
        Iterator it = this.f44608ck.getValues().iterator();
        while (it.hasNext()) {
            try {
                String strM61697du = ((C13282xc) it.next()).m61697du();
                if (strM61697du == null) {
                    strM61697du = C14113y2.f47374k4;
                }
                c13322zd.m61872fa().set_Item(strM61697du, Boolean.TRUE);
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
        Iterator it2 = this.f44617to.m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it2.next();
                c13322zd.m61888m9().addItem(c13021hu.m60721qq(), c13021hu.m60697b3());
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        Iterator it3 = this.f44619x1.m60648kk().iterator();
        while (it3.hasNext()) {
            try {
                C13146p4 c13146p4 = (C13146p4) it3.next();
                c13322zd.m61899yj().addItem(c13146p4.m61359fa(), c13146p4.m61369ks());
            } finally {
                if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        Iterator it4 = this.f44609du.m60648kk().iterator();
        while (it4.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it4.next();
                c13322zd.m61893up().addItem(c12943dd.m60210bv(), c12943dd.m60226wp());
            } finally {
                if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it4).dispose();
        }
        it2 = this.f44616m9.m60648kk().iterator();
        while (it2.hasNext()) {
            try {
                C13237ul c13237ul = (C13237ul) it2.next();
                C13226tw c13226tw = new C13226tw(c13237ul.m61633m9());
                c13226tw.m61624k4(c13237ul.m61629h4());
                c13226tw.m61627x1(c13237ul.m61634x1());
                if (!c13322zd.m61887ks().containsKey(c13226tw.m61623k4().m65289x1())) {
                    c13322zd.m61887ks().addItem(c13226tw.m61623k4().m65289x1(), c13226tw);
                }
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61810k4(C12969en c12969en, C13106mq c13106mq, C13106mq c13106mq2) {
        return c12969en == C12969en.m60399k4() || c13106mq.m61185h4() >= c13106mq2.m61185h4();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61811k4(C12989fu c12989fu, C12989fu c12989fu2) {
        String str;
        if (!m61827kk(c12989fu, c12989fu2)) {
            str = "The derived wildcard's occurrence range is not a valid restriction of the base wildcard's occurrence range, Any:Any -- NSSubset Rule 1.";
        } else if (!C13086lm.m61102k4(c12989fu.m60627h4(), c12989fu2.m60627h4())) {
            str = "The derived wildcard's namespace constraint must be an intensional subset of the base wildcard's namespace constraint, Any:Any -- NSSubset Rule2.";
        } else {
            if (c12989fu.m60626dy() >= c12989fu2.m60626dy()) {
                return true;
            }
            str = "The derived wildcard's 'processContents' must be identical to or stronger than the base wildcard's 'processContents', where 'strict' is stronger than 'lax' and 'lax' is stronger than 'skip', Any:Any -- NSSubset Rule 3.";
        }
        this.f44614k4 = C13968ri.m65818k4(str);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61812k4(C13021hu c13021hu, C12989fu c12989fu) {
        String strM65819k4;
        if (!c12989fu.m60630k4(c13021hu.m60721qq())) {
            strM65819k4 = C13968ri.m65819k4("The namespace of element '{0}'is not valid with respect to the wildcard's namespace constraint in the base, Elt:Any -- NSCompat Rule 1.", c13021hu.m60721qq().toString());
        } else {
            if (m61827kk(c13021hu, c12989fu)) {
                return true;
            }
            strM65819k4 = C13968ri.m65819k4("The occurrence range of element '{0}'is not a valid restriction of the wildcard's occurrence range in the base, Elt:Any -- NSCompat Rule2.", c13021hu.m60721qq().toString());
        }
        this.f44614k4 = strM65819k4;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61813k4(C13021hu c13021hu, C13021hu c13021hu2) {
        int iM61258fa = c13021hu2.m60697b3().m61258fa() == 255 ? 7 : c13021hu2.m60697b3().m61258fa();
        int iM61258fa2 = c13021hu.m60697b3().m61258fa() != 255 ? c13021hu.m60697b3().m61258fa() : 7;
        if (C13890ei.m65278k4(c13021hu.m60721qq(), c13021hu2.m60721qq()) && ((c13021hu2.m60726up() || !c13021hu.m60726up()) && m61827kk(c13021hu, c13021hu2) && ((c13021hu2.m60706jd() == null || m61819k4(c13021hu2.m60697b3(), c13021hu.m60697b3())) && (iM61258fa | iM61258fa2) == iM61258fa2 && c13021hu.m60696ar() != null && c13021hu2.m60696ar() != null && C12943dd.m60206k4(c13021hu.m60696ar(), c13021hu2.m60696ar(), -29)))) {
            return true;
        }
        this.f44614k4 = C13968ri.m65819k4("Derived element '{0}' is not a valid restriction of base element '{1}' according to Elt:Elt -- NameAndTypeOK.", c13021hu.m60721qq(), c13021hu2.m60721qq());
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61814k4(C13021hu c13021hu, AbstractC13054jn abstractC13054jn) {
        String strM65819k4;
        if (C7019kk.m27469x1(abstractC13054jn, C13193s0.class)) {
            C13193s0 c13193s0 = new C13193s0();
            c13193s0.m60246k4(C7019kk.m27440jd(1, 9).Clone());
            c13193s0.m60250x1(C7019kk.m27440jd(1, 9).Clone());
            c13193s0.mo61012k4().m60092k4(c13021hu);
            if (m61816k4((AbstractC13054jn) c13193s0, abstractC13054jn, true)) {
                return true;
            }
            strM65819k4 = C13968ri.m65819k4("The derived element {0} at ({1}, {2}) is not a valid restriction of the base sequence particle at ({3}, {4}) according to Elt:All/Choice/Sequence -- RecurseAsIfGroup.", c13021hu.m60721qq().toString(), C14057f9.m66586k4(c13021hu.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(c13021hu.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC13054jn.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC13054jn.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()));
        } else {
            if (!C7019kk.m27469x1(abstractC13054jn, C13132o2.class)) {
                if (C7019kk.m27469x1(abstractC13054jn, C13141op.class)) {
                    C13141op c13141op = new C13141op();
                    c13141op.m60246k4(C7019kk.m27440jd(1, 9).Clone());
                    c13141op.m60250x1(C7019kk.m27440jd(1, 9).Clone());
                    c13141op.mo61012k4().m60092k4(c13021hu);
                    if (m61816k4((AbstractC13054jn) c13141op, abstractC13054jn, true)) {
                        return true;
                    }
                    strM65819k4 = C13968ri.m65819k4("The derived element {0} at ({1}, {2}) is not a valid restriction of the base all particle at ({3}, {4}) according to Elt:All/Choice/Sequence -- RecurseAsIfGroup.", c13021hu.m60721qq().toString(), C14057f9.m66586k4(c13021hu.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(c13021hu.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC13054jn.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC13054jn.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()));
                }
                return false;
            }
            C13132o2 c13132o2 = new C13132o2();
            c13132o2.m60246k4(C7019kk.m27440jd(1, 9).Clone());
            c13132o2.m60250x1(C7019kk.m27440jd(1, 9).Clone());
            c13132o2.mo61012k4().m60092k4(c13021hu);
            if (m61816k4((AbstractC13054jn) c13132o2, abstractC13054jn, false)) {
                return true;
            }
            strM65819k4 = C13968ri.m65819k4("The derived element {0} at ({1}, {2}) is not a valid restriction of the base choice particle at ({3}, {4}) according to Elt:All/Choice/Sequence -- RecurseAsIfGroup.", c13021hu.m60721qq().toString(), C14057f9.m66586k4(c13021hu.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(c13021hu.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC13054jn.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC13054jn.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()));
        }
        this.f44614k4 = strM65819k4;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61815k4(AbstractC13054jn abstractC13054jn, C12989fu c12989fu) {
        C14046bv[] c14046bvArr = {new C14046bv()};
        C14046bv[] c14046bvArr2 = {new C14046bv()};
        m61790k4(abstractC13054jn, c14046bvArr, c14046bvArr2);
        if (!m61822k4(c14046bvArr[0].Clone(), c14046bvArr2[0].Clone(), c12989fu.m60245g8().Clone(), c12989fu.m60248sv().Clone())) {
            this.f44614k4 = C13968ri.m65819k4("The derived particle's occurrence range at ({0}, {1}) is not a valid restriction of the base wildcard's occurrence range at ({2}, {3}), NSRecurseCheckCardinality Rule 2.", C14057f9.m66586k4(abstractC13054jn.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(abstractC13054jn.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(c12989fu.m60676ak(), (InterfaceC14073kp) C11683c5.m55033ck()), C14057f9.m66586k4(c12989fu.m60678dq(), (InterfaceC14073kp) C11683c5.m55033ck()));
            return false;
        }
        String strM60241bz = c12989fu.m60241bz();
        c12989fu.m60246k4(C14046bv.f47165du.Clone());
        for (int i = 0; i < abstractC13054jn.mo61012k4().size(); i++) {
            if (!m61842x1((AbstractC12950dp) abstractC13054jn.mo61012k4().get_Item(i), c12989fu)) {
                this.f44614k4 = C13968ri.m65818k4("Every member of the derived group particle must be a valid restriction of the base wildcard, NSRecurseCheckCardinality Rule 1.");
                c12989fu.m60244dy(strM60241bz);
                return false;
            }
        }
        c12989fu.m60244dy(strM60241bz);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61816k4(AbstractC13054jn abstractC13054jn, AbstractC13054jn abstractC13054jn2, boolean z) {
        String str;
        if (!m61827kk(abstractC13054jn, abstractC13054jn2)) {
            str = "The derived particle's range is not a valid restriction of the base particle's range according to All:All,Sequence:Sequence -- Recurse Rule 1 or Choice:Choice -- RecurseLax.";
        } else {
            if (abstractC13054jn.mo61012k4().size() <= abstractC13054jn2.mo61012k4().size()) {
                int i = 0;
                for (int i2 = 0; i2 < abstractC13054jn2.mo61012k4().size(); i2++) {
                    AbstractC12950dp abstractC12950dp = (AbstractC12950dp) abstractC13054jn2.mo61012k4().get_Item(i2);
                    if (i < abstractC13054jn.mo61012k4().size() && m61842x1((AbstractC12950dp) abstractC13054jn.mo61012k4().get_Item(i), abstractC12950dp)) {
                        i++;
                    } else if (z && !m61831to(abstractC12950dp)) {
                        if (this.f44614k4 == null) {
                            this.f44614k4 = C13968ri.m65818k4("All particles in the {particles} of the base particle which are not mapped to by any particle in the {particles} of the derived particle should be emptiable - All:All,Sequence:Sequence -- Recurse Rule 2 / Choice:Choice -- RecurseLax.");
                        }
                        return false;
                    }
                }
                return i >= abstractC13054jn.mo61012k4().size();
            }
            str = "The derived particle cannot have more members than the base particle - All:All,Sequence:Sequence -- Recurse Rule 2 / Choice:Choice -- RecurseLax.";
        }
        this.f44614k4 = C13968ri.m65818k4(str);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61817k4(C13123nh c13123nh, AbstractC12950dp abstractC12950dp) {
        boolean z = false;
        if (C7019kk.m27469x1(abstractC12950dp, C13021hu.class)) {
            C13021hu c13021hu = (C13021hu) abstractC12950dp;
            c13123nh.m61247k4(c13021hu.m60721qq(), c13021hu);
        } else {
            boolean z2 = true;
            if (C7019kk.m27469x1(abstractC12950dp, C12989fu.class)) {
                C12989fu c12989fu = (C12989fu) abstractC12950dp;
                c13123nh.m61246k4(c12989fu.m60627h4(), c12989fu);
                z = true;
            } else if (C7019kk.m27469x1(abstractC12950dp, AbstractC13054jn.class)) {
                C12908be c12908beMo61012k4 = ((AbstractC13054jn) abstractC12950dp).mo61012k4();
                boolean zM27469x1 = C7019kk.m27469x1(abstractC12950dp, C13132o2.class);
                c13123nh.m61244h4();
                boolean zM61817k4 = false;
                for (int i = 0; i < c12908beMo61012k4.size(); i++) {
                    if (z2) {
                        z2 = false;
                    } else if (zM27469x1) {
                        c13123nh.m61242dy();
                    } else {
                        c13123nh.m61239c5();
                    }
                    zM61817k4 = m61817k4(c13123nh, (AbstractC12950dp) c12908beMo61012k4.get_Item(i));
                }
                c13123nh.m61250m9();
                z = zM61817k4;
            }
        }
        C14046bv c14046bvM60245g8 = abstractC12950dp.m60245g8();
        C14046bv c14046bv = C14046bv.f47169to;
        if (C14046bv.m66453dy(c14046bvM60245g8, c14046bv) && C14046bv.m66453dy(abstractC12950dp.m60248sv(), c14046bv)) {
            return z;
        }
        C14046bv c14046bvM60245g82 = abstractC12950dp.m60245g8();
        C14046bv c14046bv2 = C14046bv.f47165du;
        if (C14046bv.m66453dy(c14046bvM60245g82, c14046bv2) && C14046bv.m66453dy(abstractC12950dp.m60248sv(), c14046bv)) {
            c13123nh.m61243fa();
            return z;
        }
        if (C14046bv.m66453dy(abstractC12950dp.m60245g8(), c14046bv2) && C14046bv.m66453dy(abstractC12950dp.m60248sv(), C14046bv.f47170x1)) {
            c13123nh.m61245jd();
            return z;
        }
        if (C14046bv.m66453dy(abstractC12950dp.m60245g8(), c14046bv) && C14046bv.m66453dy(abstractC12950dp.m60248sv(), C14046bv.f47170x1)) {
            c13123nh.m61240ck();
            return z;
        }
        c13123nh.m61248k4(abstractC12950dp.m60245g8().Clone(), abstractC12950dp.m60248sv().Clone());
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61846k4(C13129ny c13129ny, C13322zd c13322zd) {
        m61843h4();
        if (!m61164du()) {
            m61809k4(c13322zd);
            c13129ny.f44171k4 = this.f44617to;
            c13129ny.f44182x1 = this.f44619x1;
            c13129ny.f44172kk = this.f44609du;
            c13129ny.f44177to = this.f44610dy;
        }
        return !m61164du();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61818k4(C13132o2 c13132o2, C13132o2 c13132o22) {
        if (!m61827kk(c13132o2, c13132o22)) {
            this.f44614k4 = C13968ri.m65818k4("The derived particle's range is not a valid restriction of the base particle's range according to All:All,Sequence:Sequence -- Recurse Rule 1 or Choice:Choice -- RecurseLax.");
            return false;
        }
        for (int i = 0; i < c13132o2.mo61012k4().size(); i++) {
            if (m61777k4((AbstractC12950dp) c13132o2.mo61012k4().get_Item(i), c13132o22.mo61012k4()) < 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61819k4(AbstractC13183r7 abstractC13183r7, AbstractC13183r7 abstractC13183r72) {
        if (abstractC13183r7.m61430bv() != 3 && abstractC13183r7.m61430bv() != 4) {
            return true;
        }
        Object objM61431dq = abstractC13183r7.m61431dq();
        Object objM61431dq2 = abstractC13183r72.m61431dq();
        if (abstractC13183r72.m61430bv() != 3 && abstractC13183r72.m61430bv() != 4) {
            return false;
        }
        AbstractC12892ae abstractC12892aeM61429b3 = abstractC13183r7.m61429b3();
        AbstractC12892ae abstractC12892aeM61429b32 = abstractC13183r72.m61429b3();
        if (abstractC12892aeM61429b3.mo60017ck() != 2) {
            return abstractC12892aeM61429b32.mo60031k4(objM61431dq, objM61431dq2);
        }
        if (abstractC12892aeM61429b32.mo60017ck() == 2) {
            return abstractC12892aeM61429b32.mo60031k4(objM61431dq, objM61431dq2);
        }
        C13165qa c13165qa = (C13165qa) C7019kk.m27452k4(abstractC13183r7.m61431dq(), C13165qa.class);
        return c13165qa.m61418k4().m60211bz().mo60035x1(abstractC12892aeM61429b32) && abstractC12892aeM61429b32.mo60031k4(c13165qa.m61419x1(), objM61431dq2);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61820k4(C13193s0 c13193s0, C13132o2 c13132o2) {
        C14046bv c14046bv = new C14046bv();
        C14046bv c14046bv2 = new C14046bv();
        C14046bv.m66451du(c13193s0.m60245g8(), C7019kk.m27440jd(Integer.valueOf(c13193s0.mo61012k4().size()), 9)).CloneTo(c14046bv);
        C14046bv c14046bvM60248sv = c13193s0.m60248sv();
        C14046bv c14046bv3 = C14046bv.f47170x1;
        if (C14046bv.m66453dy(c14046bvM60248sv, c14046bv3)) {
            c14046bv3.CloneTo(c14046bv2);
        } else {
            C14046bv.m66451du(c13193s0.m60248sv(), C7019kk.m27440jd(Integer.valueOf(c13193s0.mo61012k4().size()), 9)).CloneTo(c14046bv2);
        }
        if (!m61822k4(c14046bv.Clone(), c14046bv2.Clone(), c13132o2.m60245g8().Clone(), c13132o2.m60248sv().Clone()) || c13193s0.mo61012k4().size() > c13132o2.mo61012k4().size()) {
            return false;
        }
        for (int i = 0; i < c13193s0.mo61012k4().size(); i++) {
            if (m61777k4((AbstractC12950dp) c13193s0.mo61012k4().get_Item(i), c13132o2.mo61012k4()) < 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61821k4(C13193s0 c13193s0, C13141op c13141op) {
        if (!m61827kk(c13193s0, c13141op) || c13193s0.mo61012k4().size() > c13141op.mo61012k4().size()) {
            return false;
        }
        C13047jd c13047jd = new C13047jd(c13141op.mo61012k4().size());
        for (int i = 0; i < c13193s0.mo61012k4().size(); i++) {
            int iM61777k4 = m61777k4((AbstractC12950dp) c13193s0.mo61012k4().get_Item(i), c13141op.mo61012k4());
            if (iM61777k4 < 0 || c13047jd.m60999k4(iM61777k4)) {
                return false;
            }
            c13047jd.m61006x1(iM61777k4);
        }
        for (int i2 = 0; i2 < c13141op.mo61012k4().size(); i2++) {
            if (!c13047jd.m60999k4(i2) && !m61831to((AbstractC12950dp) c13141op.mo61012k4().get_Item(i2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61822k4(C14046bv c14046bv, C14046bv c14046bv2, C14046bv c14046bv3, C14046bv c14046bv4) {
        return C14046bv.m66455fa(c14046bv3, c14046bv) && C14046bv.m66455fa(c14046bv2, c14046bv4);
    }
}

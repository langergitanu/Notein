package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.C13969rq;
import com.aspose.slides.p559ms.System.Xml.C13988u1;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.b5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12905b5 extends C13100m9 {

    /* JADX INFO: renamed from: c5 */
    private Hashtable f43426c5;

    /* JADX INFO: renamed from: ck */
    private AbstractC13943n5 f43427ck;

    /* JADX INFO: renamed from: du */
    private int f43428du;

    /* JADX INFO: renamed from: dy */
    private Hashtable f43429dy;

    /* JADX INFO: renamed from: h4 */
    private int f43430h4;

    /* JADX INFO: renamed from: jd */
    private String f43431jd;

    /* JADX INFO: renamed from: k4 */
    private C13282xc f43432k4;

    /* JADX INFO: renamed from: kk */
    private boolean f43433kk;

    /* JADX INFO: renamed from: m9 */
    private int f43434m9;

    /* JADX INFO: renamed from: to */
    private int f43435to;

    /* JADX INFO: renamed from: x1 */
    private String f43436x1;

    public C12905b5(AbstractC13883dt abstractC13883dt, C13058k1 c13058k1, AbstractC13319z7 abstractC13319z7) {
        super(abstractC13883dt, c13058k1, abstractC13319z7);
        this.f43433kk = false;
        this.f43427ck = null;
    }

    /* JADX INFO: renamed from: k4 */
    private int m60058k4(C12908be c12908be, C13890ei c13890ei) {
        int iM60058k4 = 0;
        for (int i = 0; i < c12908be.size(); i++) {
            C12990fw c12990fw = (C12990fw) C7019kk.m27452k4((Object) c12908be.get_Item(i), C12990fw.class);
            if (c12990fw != null) {
                if (C13890ei.m65278k4(c12990fw.m60635k4(), c13890ei)) {
                    C14046bv c14046bvM60245g8 = c12990fw.m60245g8();
                    C14046bv c14046bv = C14046bv.f47169to;
                    if (C14046bv.m66484m9(c14046bvM60245g8, c14046bv) || C14046bv.m66484m9(c12990fw.m60248sv(), c14046bv)) {
                        m61169k4("When group is redefined, the real value of both minOccurs and maxOccurs attribute must be 1 (or absent).", c12990fw);
                    }
                    iM60058k4++;
                }
            } else if (C7019kk.m27469x1(c12908be.get_Item(i), AbstractC13054jn.class)) {
                iM60058k4 += m60058k4(((AbstractC13054jn) c12908be.get_Item(i)).mo61012k4(), c13890ei);
            }
            if (iM60058k4 > 1) {
                return iM60058k4;
            }
        }
        return iM60058k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m60080kk(AbstractC13018hl abstractC13018hl) {
        C13126nm c13126nm = (C13126nm) C7019kk.m27452k4((Object) abstractC13018hl, C13126nm.class);
        if (c13126nm == null || c13126nm.m61292to() == null) {
            return;
        }
        c13126nm.m61292to().m60684k4(abstractC13018hl);
        for (int i = 0; i < c13126nm.m61292to().m61759x1().size(); i++) {
            c13126nm.m61292to().m61759x1().get_Item(i).m60684k4((AbstractC13018hl) c13126nm.m61292to());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m60083x1(AbstractC13018hl abstractC13018hl) {
        String strAe_ = abstractC13018hl.ae_();
        if (strAe_ == null || strAe_.length() == 0) {
            m61173k4("Invalid 'name' attribute value '{0}': '{1}'.", (String) null, C13968ri.m65818k4("Value cannot be null."), abstractC13018hl);
        }
        String strM65820k4 = C13969rq.m65820k4(strAe_);
        int iM66230to = C13988u1.m66230to(strM65820k4, 0);
        if (iM66230to == strM65820k4.length()) {
            abstractC13018hl.mo59981h4(m61165k4().mo65266k4(strM65820k4));
        } else {
            String[] strArrBuildCharExceptionArgs = XmlException.buildCharExceptionArgs(strM65820k4, iM66230to);
            m61173k4("Invalid 'name' attribute value '{0}': '{1}'.", strM65820k4, C13968ri.m65819k4("The '{0}' character, hexadecimal value {1}, at position {2} within the name, cannot be included in a name.", strArrBuildCharExceptionArgs[0], strArrBuildCharExceptionArgs[1], Integer.valueOf(iM66230to)), abstractC13018hl);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 m60059k4(C14062gk c14062gk) {
        try {
            return (AbstractC3150x6) this.f43427ck.mo5312k4(c14062gk, null, null);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m60081kk(C13021hu c13021hu) {
        int iM60704h4;
        m60080kk((AbstractC13018hl) c13021hu);
        if (!c13021hu.m60720ne().m65287kk()) {
            m61171k4("The '{0}' attribute cannot be present.", "ref", c13021hu);
        }
        if (c13021hu.m60704h4() != 255) {
            if (c13021hu.m60704h4() == 256) {
                iM60704h4 = this.f43430h4;
                if (iM60704h4 == 255) {
                    c13021hu.m60722to(255);
                }
            } else {
                if ((c13021hu.m60704h4() & (-8)) != 0) {
                    m61169k4("The values 'list' and 'union' are invalid for the block attribute on element.", c13021hu);
                }
                iM60704h4 = c13021hu.m60704h4();
            }
            c13021hu.m60722to(iM60704h4 & 7);
        }
        if (c13021hu.m60727uz() != null) {
            m60068k4(c13021hu.m60727uz(), c13021hu);
            if (!c13021hu.m60724u4().m65287kk()) {
                m61169k4("The type attribute cannot be present with either simpleType or complexType.", c13021hu);
            }
            if (C7019kk.m27469x1(c13021hu.m60727uz(), C12969en.class)) {
                m60065k4((C12969en) c13021hu.m60727uz(), true);
            } else {
                m60075k4((C13164q9) c13021hu.m60727uz(), true);
            }
        }
        if (!c13021hu.m60724u4().m65287kk()) {
            m60069k4(c13021hu, C18437z2.f56754h, c13021hu.m60724u4());
        }
        if (c13021hu.m60719m9() != null && c13021hu.m60706jd() != null) {
            m61169k4("The fixed and default attributes cannot both be present.", c13021hu);
        }
        for (int i = 0; i < c13021hu.m60729wl().size(); i++) {
            m60068k4(c13021hu.m60729wl().get_Item(i), c13021hu);
            m60061k4((C12887a0) c13021hu.m60729wl().get_Item(i));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m60084x1(C13021hu c13021hu) {
        C13890ei c13890eiM60720ne;
        if (c13021hu.m60703fa() != null) {
            m60083x1((AbstractC13018hl) c13021hu);
            m60081kk(c13021hu);
            c13890eiM60720ne = new C13890ei(c13021hu.m60703fa(), (c13021hu.m60699ck() == 1 || (c13021hu.m60699ck() == 0 && this.f43435to == 1)) ? this.f43436x1 : null);
        } else {
            m60080kk((AbstractC13018hl) c13021hu);
            if (c13021hu.m60720ne().m65287kk()) {
                m61169k4("For element declaration, either the name or the ref attribute must be present.", c13021hu);
            } else {
                m60069k4(c13021hu, "ref", c13021hu.m60720ne());
            }
            if (!c13021hu.m60724u4().m65287kk() || c13021hu.m60713k4() || c13021hu.m60704h4() != 256 || c13021hu.m60727uz() != null || c13021hu.m60728v4() || c13021hu.m60719m9() != null || c13021hu.m60699ck() != 0 || c13021hu.m60706jd() != null || c13021hu.m60736yj()) {
                m61169k4("If ref is present, all of <complexType>, <simpleType>, <key>, <keyref>, <unique>, nillable, default, fixed, form, block, and type must be absent.", c13021hu);
            }
            if (c13021hu.m60719m9() != null && c13021hu.m60706jd() != null) {
                m61169k4("The fixed and default attributes cannot both be present.", c13021hu);
            }
            c13890eiM60720ne = c13021hu.m60720ne();
        }
        c13021hu.m60723to(c13890eiM60720ne);
        if (C14046bv.m66447c5(c13021hu.m60245g8(), c13021hu.m60248sv())) {
            c13021hu.m60246k4(C14046bv.f47165du.Clone());
            m61169k4("minOccurs value cannot be greater than maxOccurs value.", c13021hu);
        }
        if (c13021hu.m60713k4()) {
            m61171k4("The '{0}' attribute cannot be present.", "abstract", c13021hu);
        }
        if (c13021hu.m60702dy() != 256) {
            m61171k4("The '{0}' attribute cannot be present.", "final", c13021hu);
        }
        if (!c13021hu.m60705ix().m65287kk()) {
            m61171k4("The '{0}' attribute cannot be present.", "substitutionGroup", c13021hu);
        }
        m60067k4((AbstractC13018hl) c13021hu);
    }

    /* JADX INFO: renamed from: k4 */
    private C14062gk m60060k4(C13282xc c13282xc, String str) {
        try {
            return this.f43427ck.mo65674k4(c13282xc.m61725u4(), str);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m60082kk(C13146p4 c13146p4) {
        m60080kk((AbstractC13018hl) c13146p4);
        if ("http://www.w3.org/2001/XMLSchema-instance".equals(this.f43432k4.m61697du())) {
            m61169k4("The target namespace of an attribute declaration, whether local or global, must not match http://www.w3.org/2001/XMLSchema-instance.", c13146p4);
        }
        if (!c13146p4.m61358dy().m65287kk()) {
            m61171k4("The '{0}' attribute cannot be present.", "ref", c13146p4);
        }
        if (c13146p4.m61362k4() != null && c13146p4.m61372x1() != null) {
            m61169k4("The fixed and default attributes cannot both be present.", c13146p4);
        }
        if (c13146p4.m61362k4() != null && c13146p4.m61356ck() != 1 && c13146p4.m61356ck() != 0) {
            m61169k4("The 'use' attribute must be optional (or absent) if the default attribute is present.", c13146p4);
        }
        if (C14113y2.m67363du(c13146p4.m61370m9(), this.f43431jd)) {
            m61169k4("The value 'xmlns' cannot be used as the name of an attribute declaration.", c13146p4);
        }
        if (c13146p4.m61361jd() != null) {
            m60068k4(c13146p4.m61361jd(), c13146p4);
            if (!c13146p4.m61355c5().m65287kk()) {
                m61169k4("The type attribute cannot be present with either simpleType or complexType.", c13146p4);
            }
            m60075k4(c13146p4.m61361jd(), true);
        }
        if (c13146p4.m61355c5().m65287kk()) {
            return;
        }
        m60069k4(c13146p4, C18437z2.f56754h, c13146p4.m61355c5());
    }

    /* JADX INFO: renamed from: x1 */
    private void m60085x1(C13146p4 c13146p4) {
        C13890ei c13890eiM61358dy;
        if (c13146p4.m61370m9() != null) {
            m60083x1((AbstractC13018hl) c13146p4);
            m60082kk(c13146p4);
            c13890eiM61358dy = new C13890ei(c13146p4.m61370m9(), (c13146p4.m61360h4() == 1 || (c13146p4.m61360h4() == 0 && this.f43428du == 1)) ? this.f43436x1 : null);
        } else {
            m60080kk((AbstractC13018hl) c13146p4);
            if (c13146p4.m61358dy().m65287kk()) {
                m61171k4("For attribute '{0}', either the name or the ref attribute must be present, but not both.", "???", c13146p4);
            } else {
                m60069k4(c13146p4, "ref", c13146p4.m61358dy());
            }
            if (!c13146p4.m61355c5().m65287kk() || c13146p4.m61361jd() != null || c13146p4.m61360h4() != 0) {
                m61169k4("If ref is present, all of 'simpleType', 'form', 'type', and 'use' must be absent.", c13146p4);
            }
            c13890eiM61358dy = c13146p4.m61358dy();
        }
        c13146p4.m61367kk(c13890eiM61358dy);
        m60067k4((AbstractC13018hl) c13146p4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60061k4(C12887a0 c12887a0) {
        boolean z;
        m60080kk(c12887a0);
        if (c12887a0.m59982k4() != null) {
            m60083x1(c12887a0);
            c12887a0.m59985k4(new C13890ei(c12887a0.m59982k4(), this.f43436x1));
            z = true;
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c12887a0);
            z = false;
        }
        if (this.f43432k4.m61703ix().m60649kk(c12887a0.m59986m9()) != null) {
            m61171k4("The identity constraint '{0}' has already been declared.", c12887a0.m59986m9().toString(), c12887a0);
            z = false;
        } else {
            this.f43432k4.m61703ix().m60647k4(c12887a0.m59986m9(), c12887a0);
        }
        if (c12887a0.m59987x1() == null) {
            m61169k4("Selector must be present.", c12887a0);
            z = false;
        }
        if (c12887a0.m59980h4().size() == 0) {
            m61169k4("At least one field must be present.", c12887a0);
            z = false;
        }
        if (C7019kk.m27469x1(c12887a0, C13145p3.class)) {
            C13145p3 c13145p3 = (C13145p3) c12887a0;
            if (c13145p3.m61353c5().m65287kk()) {
                m61169k4("The referring attribute must be present.", c12887a0);
                z = false;
            } else {
                m60069k4(c13145p3, "refer", c13145p3.m61353c5());
            }
        }
        if (z) {
            m60067k4((AbstractC13018hl) c12887a0);
            m60067k4(c12887a0.m59987x1());
            m60068k4(c12887a0.m59987x1(), c12887a0);
            for (int i = 0; i < c12887a0.m59980h4().size(); i++) {
                m60068k4(c12887a0.m59980h4().get_Item(i), c12887a0);
                m60067k4(c12887a0.m59980h4().get_Item(i));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m60086x1(C13147p5 c13147p5) {
        if (c13147p5.m61382k4() != null) {
            m60083x1((AbstractC13018hl) c13147p5);
            c13147p5.m61387k4(new C13890ei(c13147p5.m61382k4(), this.f43436x1));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13147p5);
        }
        if (c13147p5.m61389x1() == null) {
            m61169k4("'sequence', 'choice', or 'all' child is required.", c13147p5);
            return;
        }
        if (c13147p5.m61389x1().m60241bz() != null) {
            m61171k4("The '{0}' attribute cannot be present.", "minOccurs", c13147p5.m61389x1());
        }
        if (c13147p5.m61389x1().m60247qm() != null) {
            m61171k4("The '{0}' attribute cannot be present.", "maxOccurs", c13147p5.m61389x1());
        }
        m60063k4((AbstractC12950dp) c13147p5.m61389x1());
        m60080kk(c13147p5);
        m60067k4((AbstractC13018hl) c13147p5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60062k4(C12908be c12908be, C13106mq c13106mq, AbstractC13018hl abstractC13018hl) {
        for (int i = 0; i < c12908be.size(); i++) {
            m60068k4(c12908be.get_Item(i), abstractC13018hl);
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12908be.get_Item(i), C13146p4.class);
            if (c13146p4 != null) {
                m60085x1(c13146p4);
            } else {
                C13161q1 c13161q1 = (C13161q1) c12908be.get_Item(i);
                if (c13161q1.m61409k4().m65287kk()) {
                    m61171k4("The '{0}' attribute is either invalid or missing.", "ref", c13161q1);
                } else {
                    m60069k4(c13161q1, "ref", c13161q1.m61409k4());
                }
                m60080kk(c12908be.get_Item(i));
                m60067k4(c12908be.get_Item(i));
            }
        }
        if (c13106mq != null) {
            try {
                m60068k4(c13106mq, abstractC13018hl);
                m60080kk(c13106mq);
                c13106mq.m61184du(this.f43436x1);
            } catch (RuntimeException unused) {
                m61169k4("Invalid namespace in 'anyAttribute'.", c13106mq);
            }
            m60067k4(c13106mq);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m60087x1(C13149p8 c13149p8) {
        if (c13149p8.m61396k4() != null) {
            m60083x1((AbstractC13018hl) c13149p8);
            c13149p8.m61400k4(new C13890ei(c13149p8.m61396k4(), this.f43436x1));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13149p8);
        }
        m60062k4(c13149p8.m61402x1(), c13149p8.m61394h4(), c13149p8);
        m60080kk(c13149p8);
        m60067k4((AbstractC13018hl) c13149p8);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60063k4(AbstractC12950dp abstractC12950dp) {
        C13141op c13141op = (C13141op) C7019kk.m27452k4((Object) abstractC12950dp, C13141op.class);
        int i = 0;
        if (c13141op != null) {
            if (C14046bv.m66484m9(abstractC12950dp.m60245g8(), C14046bv.f47165du)) {
                C14046bv c14046bvM60245g8 = abstractC12950dp.m60245g8();
                C14046bv c14046bv = C14046bv.f47169to;
                if (C14046bv.m66484m9(c14046bvM60245g8, c14046bv)) {
                    abstractC12950dp.m60246k4(c14046bv.Clone());
                    m61169k4("'all' must have 'minOccurs' value of 0 or 1.", abstractC12950dp);
                }
            }
            C14046bv c14046bvM60248sv = abstractC12950dp.m60248sv();
            C14046bv c14046bv2 = C14046bv.f47169to;
            if (C14046bv.m66484m9(c14046bvM60248sv, c14046bv2)) {
                abstractC12950dp.m60250x1(c14046bv2.Clone());
                m61169k4("'all' must have {max occurs}=1.", abstractC12950dp);
            }
            while (i < c13141op.mo61012k4().size()) {
                C13021hu c13021hu = (C13021hu) c13141op.mo61012k4().get_Item(i);
                if (C14046bv.m66484m9(c13021hu.m60248sv(), C14046bv.f47165du)) {
                    C14046bv c14046bvM60248sv2 = c13021hu.m60248sv();
                    C14046bv c14046bv3 = C14046bv.f47169to;
                    if (C14046bv.m66484m9(c14046bvM60248sv2, c14046bv3)) {
                        c13021hu.m60250x1(c14046bv3.Clone());
                        m61169k4("The {max occurs} of all the particles in the {particles} of an all group must be 0 or 1.", c13021hu);
                    }
                }
                m60068k4(c13021hu, abstractC12950dp);
                m60084x1(c13021hu);
                i++;
            }
        } else {
            if (C14046bv.m66447c5(abstractC12950dp.m60245g8(), abstractC12950dp.m60248sv())) {
                abstractC12950dp.m60246k4(abstractC12950dp.m60248sv().Clone());
                m61169k4("minOccurs value cannot be greater than maxOccurs value.", abstractC12950dp);
            }
            C13132o2 c13132o2 = (C13132o2) C7019kk.m27452k4((Object) abstractC12950dp, C13132o2.class);
            if (c13132o2 != null) {
                C12908be c12908beMo61012k4 = c13132o2.mo61012k4();
                while (i < c12908beMo61012k4.size()) {
                    m60068k4(c12908beMo61012k4.get_Item(i), abstractC12950dp);
                    C13021hu c13021hu2 = (C13021hu) C7019kk.m27452k4((Object) c12908beMo61012k4.get_Item(i), C13021hu.class);
                    if (c13021hu2 != null) {
                        m60084x1(c13021hu2);
                    } else {
                        m60063k4((AbstractC12950dp) c12908beMo61012k4.get_Item(i));
                    }
                    i++;
                }
            } else if (C7019kk.m27469x1(abstractC12950dp, C13193s0.class)) {
                C12908be c12908beMo61012k42 = ((C13193s0) abstractC12950dp).mo61012k4();
                while (i < c12908beMo61012k42.size()) {
                    m60068k4(c12908beMo61012k42.get_Item(i), abstractC12950dp);
                    C13021hu c13021hu3 = (C13021hu) C7019kk.m27452k4((Object) c12908beMo61012k42.get_Item(i), C13021hu.class);
                    if (c13021hu3 != null) {
                        m60084x1(c13021hu3);
                    } else {
                        m60063k4((AbstractC12950dp) c12908beMo61012k42.get_Item(i));
                    }
                    i++;
                }
            } else if (C7019kk.m27469x1(abstractC12950dp, C12990fw.class)) {
                C12990fw c12990fw = (C12990fw) abstractC12950dp;
                if (c12990fw.m60635k4().m65287kk()) {
                    m61171k4("The '{0}' attribute is either invalid or missing.", "ref", c12990fw);
                } else {
                    m60069k4(c12990fw, "ref", c12990fw.m60635k4());
                }
            } else if (C7019kk.m27469x1(abstractC12950dp, C12989fu.class)) {
                try {
                    ((C12989fu) abstractC12950dp).m60625du(this.f43436x1);
                } catch (RuntimeException unused) {
                    m61169k4("Invalid namespace in 'any'.", abstractC12950dp);
                }
            }
        }
        m60080kk(abstractC12950dp);
        m60067k4((AbstractC13018hl) abstractC12950dp);
    }

    /* JADX INFO: renamed from: x1 */
    private void m60088x1(C13282xc c13282xc) {
        String strM61621h4;
        Hashtable hashtable = new Hashtable();
        this.f43426c5 = hashtable;
        hashtable.addItem("http://www.w3.org/2001/XMLSchema", "http://www.w3.org/2001/XMLSchema");
        Hashtable hashtable2 = this.f43426c5;
        String str = C14113y2.f47374k4;
        hashtable2.addItem(str, str);
        for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
            C13221tp c13221tp = (C13221tp) C7019kk.m27452k4((Object) c13282xc.m61718m9().get_Item(i), C13221tp.class);
            if (c13221tp != null && (strM61621h4 = c13221tp.m61621h4()) != null && this.f43426c5.get_Item(strM61621h4) == null) {
                this.f43426c5.addItem(strM61621h4, strM61621h4);
            }
        }
        if (c13282xc.m61697du() == null || this.f43426c5.get_Item(c13282xc.m61697du()) != null) {
            return;
        }
        this.f43426c5.addItem(c13282xc.m61697du(), c13282xc.m61697du());
    }

    /* JADX INFO: renamed from: k4 */
    private void m60064k4(C12969en c12969en) {
        C13890ei c13890eiM60752k4;
        if (c12969en.m60407ck() != null) {
            if (C7019kk.m27469x1(c12969en.m60407ck(), C12935cx.class)) {
                C12935cx c12935cx = (C12935cx) c12969en.m60407ck();
                boolean zM27469x1 = C7019kk.m27469x1(c12935cx.m60148x1(), C12913br.class);
                AbstractC13101mc abstractC13101mcM60148x1 = c12935cx.m60148x1();
                c13890eiM60752k4 = zM27469x1 ? ((C12913br) abstractC13101mcM60148x1).m60099k4() : ((C13258w2) abstractC13101mcM60148x1).m61645k4();
            } else {
                C13268wr c13268wr = (C13268wr) c12969en.m60407ck();
                boolean zM27469x12 = C7019kk.m27469x1(c13268wr.m61663k4(), C13039iv.class);
                AbstractC13101mc abstractC13101mcM61663k4 = c13268wr.m61663k4();
                c13890eiM60752k4 = zM27469x12 ? ((C13039iv) abstractC13101mcM61663k4).m60752k4() : ((C13025i2) abstractC13101mcM61663k4).m60741k4();
            }
            if (C13890ei.m65278k4(c13890eiM60752k4, c12969en.m60210bv())) {
                return;
            }
        }
        m61169k4("If type is being redefined, the base type has to be self-referenced.", c12969en);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m60065k4(C12969en c12969en, boolean z) {
        int iM60406c5;
        int iM60224um;
        C12908be c12908beM60098h4;
        C13106mq c13106mqM60104m9;
        AbstractC13018hl abstractC13018hl;
        AbstractC13018hl abstractC13018hl2;
        AbstractC13018hl abstractC13018hl3;
        if (!z) {
            if (c12969en.m60208ar() != null) {
                m60083x1(c12969en);
                c12969en.m60228x1(new C13890ei(c12969en.m60208ar(), this.f43436x1));
            } else {
                m61171k4("The required attribute '{0}' is missing.", "name", c12969en);
            }
            if (c12969en.m60406c5() == 255) {
                c12969en.m60428x1(255);
            } else {
                if (c12969en.m60406c5() == 256) {
                    iM60406c5 = this.f43430h4;
                } else {
                    if ((c12969en.m60406c5() & (-7)) != 0) {
                        m61169k4("The values 'substitution', 'list', and 'union' are invalid for the block attribute on complexType.", c12969en);
                    }
                    iM60406c5 = c12969en.m60406c5();
                }
                c12969en.m60428x1(iM60406c5 & 6);
            }
            if (c12969en.m60224um() != 255) {
                if (c12969en.m60224um() == 256) {
                    iM60224um = this.f43434m9;
                    if (iM60224um == 255) {
                        c12969en.m60213du(255);
                    }
                } else {
                    if ((c12969en.m60224um() & (-7)) != 0) {
                        m61169k4("The values 'substitution', 'list', and 'union' are invalid for the final attribute on complexType.", c12969en);
                    }
                    iM60224um = c12969en.m60224um();
                }
                c12969en.m60213du(iM60224um & 6);
            }
        } else if (c12969en.m60208ar() != null) {
            m61171k4("The '{0}' attribute cannot be present.", "name", c12969en);
        }
        if (c12969en.m60407ck() != null) {
            m60068k4(c12969en.m60407ck(), c12969en);
            m60080kk(c12969en.m60407ck());
            if (c12969en.m60409fa() == null) {
                c12969en.m60424up();
            }
            if (C7019kk.m27469x1(c12969en.m60407ck(), C13268wr.class)) {
                C13268wr c13268wr = (C13268wr) c12969en.m60407ck();
                if (c13268wr.m61663k4() != null) {
                    m60068k4(c13268wr.m61663k4(), c13268wr);
                    m60080kk(c13268wr.m61663k4());
                    if (C7019kk.m27469x1(c13268wr.m61663k4(), C13025i2.class)) {
                        C13025i2 c13025i2 = (C13025i2) c13268wr.m61663k4();
                        if (c13025i2.m60741k4().m65287kk()) {
                            m61171k4("The '{0}' attribute is either invalid or missing.", "base", c13025i2);
                        } else {
                            m60069k4(c13025i2, "base", c13025i2.m60741k4());
                        }
                        c12908beM60098h4 = c13025i2.m60745x1();
                        c13106mqM60104m9 = c13025i2.m60740h4();
                        abstractC13018hl2 = c13025i2;
                        abstractC13018hl = c13268wr;
                    } else {
                        C13039iv c13039iv = (C13039iv) c13268wr.m61663k4();
                        if (c13039iv.m60752k4().m65287kk()) {
                            m61171k4("The '{0}' attribute is either invalid or missing.", "base", c13039iv);
                        } else {
                            m60069k4(c13039iv, "base", c13039iv.m60752k4());
                        }
                        if (c13039iv.m60758x1() != null) {
                            m60068k4(c13039iv.m60758x1(), c13039iv);
                            m60075k4(c13039iv.m60758x1(), true);
                        }
                        m60062k4(c13039iv.m60757m9(), c13039iv.m60750dy(), c13039iv);
                        m60067k4(c13039iv);
                        abstractC13018hl3 = c13268wr;
                    }
                } else if (C13890ei.m65278k4(c12969en.m60210bv(), C13890ei.f46456k4)) {
                    m61169k4("'restriction' or 'extension' child is required for complexType with simpleContent or complexContent child.", c12969en);
                    abstractC13018hl3 = c13268wr;
                } else {
                    m61173k4("'restriction' or 'extension' child is required for complexType '{0}' in namespace '{1}', because it has a simpleContent or complexContent child.", c12969en.m60210bv().m65289x1(), c12969en.m60210bv().m65284k4(), c12969en);
                    abstractC13018hl3 = c13268wr;
                }
                m60067k4(abstractC13018hl3);
            } else {
                C12935cx c12935cx = (C12935cx) c12969en.m60407ck();
                if (c12935cx.m60148x1() != null) {
                    if (!c12935cx.m60144h4() && c12969en.mo60216jd()) {
                        c12935cx.m60146k4(true);
                    }
                    m60068k4(c12935cx.m60148x1(), c12935cx);
                    m60080kk(c12935cx.m60148x1());
                    if (C7019kk.m27469x1(c12935cx.m60148x1(), C13258w2.class)) {
                        C13258w2 c13258w2 = (C13258w2) c12935cx.m60148x1();
                        if (c13258w2.m61645k4().m65287kk()) {
                            m61171k4("The '{0}' attribute is either invalid or missing.", "base", c13258w2);
                        } else {
                            m60069k4(c13258w2, "base", c13258w2.m61645k4());
                        }
                        if (c13258w2.m61651x1() != null) {
                            m60068k4(c13258w2.m61651x1(), c13258w2);
                            m60063k4(c13258w2.m61651x1());
                        }
                        c12908beM60098h4 = c13258w2.m61644h4();
                        c13106mqM60104m9 = c13258w2.m61650m9();
                        abstractC13018hl2 = c13258w2;
                        abstractC13018hl = c12935cx;
                    } else {
                        C12913br c12913br = (C12913br) c12935cx.m60148x1();
                        if (c12913br.m60099k4().m65287kk()) {
                            m61171k4("The '{0}' attribute is either invalid or missing.", "base", c12913br);
                        } else {
                            m60069k4(c12913br, "base", c12913br.m60099k4());
                        }
                        if (c12913br.m60105x1() != null) {
                            m60068k4(c12913br.m60105x1(), c12913br);
                            m60063k4(c12913br.m60105x1());
                        }
                        c12908beM60098h4 = c12913br.m60098h4();
                        c13106mqM60104m9 = c12913br.m60104m9();
                        abstractC13018hl2 = c12913br;
                        abstractC13018hl = c12935cx;
                    }
                } else if (C13890ei.m65278k4(c12969en.m60210bv(), C13890ei.f46456k4)) {
                    m61169k4("'restriction' or 'extension' child is required for complexType with simpleContent or complexContent child.", c12969en);
                } else {
                    m61173k4("'restriction' or 'extension' child is required for complexType '{0}' in namespace '{1}', because it has a simpleContent or complexContent child.", c12969en.m60210bv().m65289x1(), c12969en.m60210bv().m65284k4(), c12969en);
                }
            }
            m60062k4(c12908beM60098h4, c13106mqM60104m9, abstractC13018hl2);
            m60067k4(abstractC13018hl2);
            abstractC13018hl3 = abstractC13018hl;
            m60067k4(abstractC13018hl3);
        } else {
            if (c12969en.m60409fa() != null) {
                m60068k4(c12969en.m60409fa(), c12969en);
                m60063k4(c12969en.m60409fa());
            }
            m60062k4(c12969en.m60424up(), c12969en.m60431yj(), c12969en);
        }
        m60067k4((AbstractC13018hl) c12969en);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60066k4(C12995g6 c12995g6) {
        String str;
        AbstractC13018hl abstractC13018hl;
        for (int i = 0; i < c12995g6.m60641h4().size(); i++) {
            m60068k4(c12995g6.m60641h4().get_Item(i), c12995g6);
            C13147p5 c13147p5 = (C13147p5) C7019kk.m27452k4((Object) c12995g6.m60641h4().get_Item(i), C13147p5.class);
            if (c13147p5 != null) {
                m60086x1(c13147p5);
                if (c12995g6.m60639c5().m60649kk(c13147p5.m61380h4()) != null) {
                    str = "Double redefine for group.";
                    abstractC13018hl = c13147p5;
                } else {
                    m61168k4(c12995g6.m60639c5(), c13147p5.m61380h4(), c13147p5);
                    c13147p5.m61386k4((C13147p5) c12995g6.m61618x1().m61735x6().m60649kk(c13147p5.m61380h4()));
                    if (c13147p5.m61379dy() != null) {
                        m60072k4(c13147p5);
                    } else {
                        str = "No group to redefine.";
                        abstractC13018hl = c13147p5;
                    }
                }
                m61169k4(str, abstractC13018hl);
            } else if (C7019kk.m27469x1(c12995g6.m60641h4().get_Item(i), C13149p8.class)) {
                C13149p8 c13149p8 = (C13149p8) c12995g6.m60641h4().get_Item(i);
                m60087x1(c13149p8);
                if (c12995g6.m60643m9().m60649kk(c13149p8.m61401m9()) != null) {
                    str = "Double redefine for attribute group.";
                    abstractC13018hl = c13149p8;
                } else {
                    m61168k4(c12995g6.m60643m9(), c13149p8.m61401m9(), c13149p8);
                    c13149p8.m61399k4((C13149p8) c12995g6.m61618x1().m61727up().m60649kk(c13149p8.m61401m9()));
                    if (c13149p8.m61395jd() != null) {
                        m60073k4(c13149p8);
                    } else {
                        str = "No attribute group to redefine.";
                        abstractC13018hl = c13149p8;
                    }
                }
                m61169k4(str, abstractC13018hl);
            } else if (C7019kk.m27469x1(c12995g6.m60641h4().get_Item(i), C12969en.class)) {
                C12969en c12969en = (C12969en) c12995g6.m60641h4().get_Item(i);
                m60065k4(c12969en, false);
                if (c12995g6.m60640dy().m60649kk(c12969en.m60210bv()) != null) {
                    str = "Double redefine for complex type.";
                    abstractC13018hl = c12969en;
                } else {
                    m61168k4(c12995g6.m60640dy(), c12969en.m60210bv(), c12969en);
                    C12943dd c12943dd = (C12943dd) c12995g6.m61618x1().m61737yj().m60649kk(c12969en.m60210bv());
                    if (c12943dd == null) {
                        str = "No complex type to redefine.";
                        abstractC13018hl = c12969en;
                    } else if (C7019kk.m27469x1(c12943dd, C12969en.class)) {
                        c12969en.m60227x1(c12943dd);
                        m60064k4(c12969en);
                    } else {
                        str = "Cannot redefine a simple type as complex type.";
                        abstractC13018hl = c12969en;
                    }
                }
                m61169k4(str, abstractC13018hl);
            } else if (C7019kk.m27469x1(c12995g6.m60641h4().get_Item(i), C13164q9.class)) {
                C13164q9 c13164q9 = (C13164q9) c12995g6.m60641h4().get_Item(i);
                m60075k4(c13164q9, false);
                if (c12995g6.m60640dy().m60649kk(c13164q9.m60210bv()) != null) {
                    str = "Double redefine for simple type.";
                    abstractC13018hl = c13164q9;
                } else {
                    m61168k4(c12995g6.m60640dy(), c13164q9.m60210bv(), c13164q9);
                    C12943dd c12943dd2 = (C12943dd) c12995g6.m61618x1().m61737yj().m60649kk(c13164q9.m60210bv());
                    if (c12943dd2 == null) {
                        str = "No simple type to redefine.";
                        abstractC13018hl = c13164q9;
                    } else if (C7019kk.m27469x1(c12943dd2, C13164q9.class)) {
                        c13164q9.m60227x1(c12943dd2);
                        m60074k4(c13164q9);
                    } else {
                        str = "Cannot redefine a complex type as simple type.";
                        abstractC13018hl = c13164q9;
                    }
                }
                m61169k4(str, abstractC13018hl);
            }
        }
        for (DictionaryEntry dictionaryEntry : (Iterable) c12995g6.m60639c5()) {
            c12995g6.m61618x1().m61735x6().m60652x1((C13890ei) dictionaryEntry.getKey(), (AbstractC13018hl) dictionaryEntry.getValue());
        }
        for (DictionaryEntry dictionaryEntry2 : (Iterable) c12995g6.m60643m9()) {
            c12995g6.m61618x1().m61727up().m60652x1((C13890ei) dictionaryEntry2.getKey(), (AbstractC13018hl) dictionaryEntry2.getValue());
        }
        for (DictionaryEntry dictionaryEntry3 : (Iterable) c12995g6.m60640dy()) {
            c12995g6.m61618x1().m61737yj().m60652x1((C13890ei) dictionaryEntry3.getKey(), (AbstractC13018hl) dictionaryEntry3.getValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60067k4(AbstractC13018hl abstractC13018hl) {
        if (abstractC13018hl.mo60686lr() != null) {
            try {
                abstractC13018hl.mo60690to(m61165k4().mo65266k4(C13850af.m65120kk(abstractC13018hl.mo60686lr())));
                if (this.f43432k4.m61720qq().get_Item(abstractC13018hl.mo60686lr()) != null) {
                    m61169k4("Duplicate ID attribute.", abstractC13018hl);
                } else {
                    this.f43432k4.m61720qq().addItem(abstractC13018hl.mo60686lr(), abstractC13018hl);
                }
            } catch (RuntimeException e) {
                m61171k4("Invalid 'id' attribute value: {0}", e.getMessage(), abstractC13018hl);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60068k4(AbstractC13018hl abstractC13018hl, AbstractC13018hl abstractC13018hl2) {
        abstractC13018hl.m60684k4(abstractC13018hl2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60069k4(AbstractC13018hl abstractC13018hl, String str, C13890ei c13890ei) {
        try {
            c13890ei.m65288to();
            c13890ei.m65285k4(m61165k4());
            if (this.f43426c5.get_Item(c13890ei.m65284k4()) == null) {
                m61172k4("Namespace '{0}' is not available to be referenced in this Schema.", c13890ei.m65284k4(), abstractC13018hl, 1);
            }
        } catch (RuntimeException e) {
            m61173k4("Invalid '{0}' attribute: '{1}'.", str, e.getMessage(), abstractC13018hl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m60070k4(C13021hu c13021hu) {
        int iM60702dy;
        if (c13021hu.m60703fa() != null) {
            m60083x1((AbstractC13018hl) c13021hu);
            c13021hu.m60723to(new C13890ei(c13021hu.m60703fa(), this.f43436x1));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13021hu);
        }
        m60081kk(c13021hu);
        if (c13021hu.m60702dy() != 255) {
            if (c13021hu.m60702dy() == 256) {
                iM60702dy = this.f43434m9;
                if (iM60702dy == 255) {
                    c13021hu.m60700du(255);
                }
            } else {
                if ((c13021hu.m60702dy() & (-7)) != 0) {
                    m61169k4("The values 'substitution', 'list', and 'union' are invalid for the final attribute on element.", c13021hu);
                }
                iM60702dy = c13021hu.m60702dy();
            }
            c13021hu.m60700du(iM60702dy & 6);
        }
        if (c13021hu.m60699ck() != 0) {
            m61171k4("The '{0}' attribute cannot be present.", "form", c13021hu);
        }
        if (c13021hu.m60241bz() != null) {
            m61171k4("The '{0}' attribute cannot be present.", "minOccurs", c13021hu);
        }
        if (c13021hu.m60247qm() != null) {
            m61171k4("The '{0}' attribute cannot be present.", "maxOccurs", c13021hu);
        }
        if (!c13021hu.m60705ix().m65287kk()) {
            m60069k4(c13021hu, C18437z2.f56754h, c13021hu.m60705ix());
        }
        m60067k4((AbstractC13018hl) c13021hu);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60071k4(C13146p4 c13146p4) {
        if (c13146p4.m61370m9() != null) {
            m60083x1((AbstractC13018hl) c13146p4);
            c13146p4.m61367kk(new C13890ei(c13146p4.m61370m9(), this.f43436x1));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13146p4);
        }
        if (c13146p4.m61356ck() != 0) {
            m61171k4("The '{0}' attribute cannot be present.", AbstractJwtRequest.ClaimNames.USE, c13146p4);
        }
        if (c13146p4.m61360h4() != 0) {
            m61171k4("The '{0}' attribute cannot be present.", "form", c13146p4);
        }
        m60082kk(c13146p4);
        m60067k4((AbstractC13018hl) c13146p4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60072k4(C13147p5 c13147p5) {
        if ((c13147p5.m61389x1() != null ? m60058k4(c13147p5.m61389x1().mo61012k4(), c13147p5.m61380h4()) : 0) > 1) {
            m61169k4("Multiple self-reference within a group is redefined.", c13147p5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60073k4(C13149p8 c13149p8) {
        int i = 0;
        for (int i2 = 0; i2 < c13149p8.m61402x1().size(); i2++) {
            C13161q1 c13161q1 = (C13161q1) C7019kk.m27452k4((Object) c13149p8.m61402x1().get_Item(i2), C13161q1.class);
            if (c13161q1 != null && C13890ei.m65278k4(c13161q1.m61409k4(), c13149p8.m61401m9())) {
                i++;
            }
        }
        if (i > 1) {
            m61169k4("Multiple self-reference within an attribute group is redefined.", c13149p8);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m60074k4(C13164q9 c13164q9) {
        if (c13164q9.m61416k4() != null && C7019kk.m27469x1(c13164q9.m61416k4(), C13261w8.class) && C13890ei.m65278k4(((C13261w8) c13164q9.m61416k4()).m61653k4(), c13164q9.m60210bv())) {
            return;
        }
        m61169k4("If type is being redefined, the base type has to be self-referenced.", c13164q9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.aspose.slides.internal.yu.b5, com.aspose.slides.internal.yu.m9] */
    /* JADX WARN: Type inference failed for: r8v19, types: [com.aspose.slides.internal.yu.fe, com.aspose.slides.internal.yu.hl] */
    /* JADX WARN: Type inference failed for: r8v22, types: [com.aspose.slides.internal.yu.hl] */
    /* JADX WARN: Type inference failed for: r8v23, types: [com.aspose.slides.internal.yu.hl] */
    /* JADX WARN: Type inference failed for: r8v24, types: [com.aspose.slides.internal.yu.hl] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m60075k4(C13164q9 c13164q9, boolean z) {
        int iM60224um;
        ?? r8;
        String str;
        C13890ei c13890eiM61658k4;
        String str2;
        C13164q9 c13164q9M61661x1;
        if (!z) {
            if (c13164q9.m60208ar() != null) {
                m60083x1(c13164q9);
                c13164q9.m60228x1(new C13890ei(c13164q9.m60208ar(), this.f43436x1));
            } else {
                m61171k4("The required attribute '{0}' is missing.", "name", c13164q9);
            }
            if (c13164q9.m60224um() != 255) {
                if (c13164q9.m60224um() == 256) {
                    iM60224um = this.f43434m9;
                    if (iM60224um == 255) {
                        c13164q9.m60213du(255);
                    }
                } else {
                    if ((c13164q9.m60224um() & (-29)) != 0) {
                        m61169k4("The values 'substitution' and 'extension' are invalid for the final attribute on simpleType.", c13164q9);
                    }
                    iM60224um = c13164q9.m60224um();
                }
                c13164q9.m60213du(iM60224um & 28);
            }
        } else if (c13164q9.m60208ar() != null) {
            m61171k4("The '{0}' attribute cannot be present.", "name", c13164q9);
        }
        if (c13164q9.m61416k4() == null) {
            m61169k4("SimpleType content is missing.", c13164q9);
        } else {
            int i = 0;
            if (C7019kk.m27469x1(c13164q9.m61416k4(), C13261w8.class)) {
                C13261w8 c13261w8 = (C13261w8) c13164q9.m61416k4();
                m60068k4(c13261w8, c13164q9);
                while (i < c13261w8.m61652h4().size()) {
                    m60068k4(c13261w8.m61652h4().get_Item(i), c13261w8);
                    i++;
                }
                if (c13261w8.m61656x1() != null) {
                    if (!c13261w8.m61653k4().m65287kk()) {
                        m61169k4("SimpleType restriction should have either the base attribute or a simpleType child, but not both.", c13261w8);
                    }
                    c13164q9M61661x1 = c13261w8.m61656x1();
                    r8 = c13261w8;
                    m60075k4(c13164q9M61661x1, true);
                } else if (c13261w8.m61653k4().m65287kk()) {
                    str2 = "SimpleType restriction should have either the base attribute or a simpleType child to indicate the base type for the derivation.";
                    r8 = c13261w8;
                    m61169k4(str2, r8);
                } else {
                    str = "base";
                    c13890eiM61658k4 = c13261w8.m61653k4();
                    r8 = c13261w8;
                    m60069k4(r8, str, c13890eiM61658k4);
                }
            } else if (C7019kk.m27469x1(c13164q9.m61416k4(), C13263wh.class)) {
                C13263wh c13263wh = (C13263wh) c13164q9.m61416k4();
                m60068k4(c13263wh, c13164q9);
                if (c13263wh.m61661x1() != null) {
                    if (!c13263wh.m61658k4().m65287kk()) {
                        m61169k4("SimpleType list should have either the itemType attribute or a simpleType child, but not both.", c13263wh);
                    }
                    m60068k4(c13263wh.m61661x1(), c13263wh);
                    c13164q9M61661x1 = c13263wh.m61661x1();
                    r8 = c13263wh;
                    m60075k4(c13164q9M61661x1, true);
                } else if (c13263wh.m61658k4().m65287kk()) {
                    str2 = "SimpleType list should have either the itemType attribute or a simpleType child to indicate the itemType of the list.";
                    r8 = c13263wh;
                    m61169k4(str2, r8);
                } else {
                    str = "itemType";
                    c13890eiM61658k4 = c13263wh.m61658k4();
                    r8 = c13263wh;
                    m60069k4(r8, str, c13890eiM61658k4);
                }
            } else {
                r8 = (C12984fe) c13164q9.m61416k4();
                m60068k4(r8, c13164q9);
                int size = r8.m60619k4().size();
                if (r8.m60622x1() != null) {
                    size += r8.m60622x1().length;
                    for (int i2 = 0; i2 < r8.m60622x1().length; i2++) {
                        m60069k4(r8, "memberTypes", r8.m60622x1()[i2]);
                    }
                }
                if (size == 0) {
                    m61169k4("Either the memberTypes attribute must be non-empty or there must be at least one simpleType child.", r8);
                }
                while (i < r8.m60619k4().size()) {
                    m60068k4(r8.m60619k4().get_Item(i), r8);
                    m60075k4((C13164q9) r8.m60619k4().get_Item(i), true);
                    i++;
                }
            }
            m60080kk(r8);
            m60067k4(r8);
        }
        m60067k4(c13164q9);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60076k4(C13237ul c13237ul) {
        if (c13237ul.m61630k4() != null) {
            m60083x1(c13237ul);
            c13237ul.m61631k4(new C13890ei(c13237ul.m61630k4(), this.f43436x1));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13237ul);
        }
        if (c13237ul.m61634x1() != null) {
            try {
                C13850af.m65125qq(c13237ul.m61634x1());
            } catch (RuntimeException unused) {
                m61171k4("Public attribute '{0}' is an invalid URI.", c13237ul.m61634x1(), c13237ul);
            }
        } else {
            m61171k4("The required attribute '{0}' is missing.", "public", c13237ul);
        }
        if (c13237ul.m61629h4() != null) {
            try {
                C13850af.m65125qq(c13237ul.m61629h4());
            } catch (RuntimeException unused2) {
                m61171k4("System attribute '{0}' is an invalid URI.", c13237ul.m61629h4(), c13237ul);
            }
        }
        m60080kk(c13237ul);
        m60067k4((AbstractC13018hl) c13237ul);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60077k4(C13282xc c13282xc) {
        if (c13282xc.m60679e0()) {
            return;
        }
        c13282xc.m60681h4(true);
        for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
            AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
            if (abstractC13218th.m61618x1() != null) {
                m60077k4(abstractC13218th.m61618x1());
            }
            if (C7019kk.m27469x1(abstractC13218th, C12995g6.class)) {
                C12995g6 c12995g6 = (C12995g6) C7019kk.m27452k4((Object) abstractC13218th, C12995g6.class);
                c12995g6.m60643m9().m60645k4();
                c12995g6.m60639c5().m60645k4();
                c12995g6.m60640dy().m60645k4();
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
        c13282xc.m60681h4(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m60078k4(C13282xc c13282xc, C13287xo c13287xo) {
        C14062gk c14062gkM60060k4;
        if (c13282xc.m60679e0()) {
            return;
        }
        c13282xc.m60681h4(true);
        for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
            AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
            if (abstractC13218th.m61618x1() != null) {
                if (!C7019kk.m27469x1(abstractC13218th, C13221tp.class) || !"http://www.w3.org/XML/1998/namespace".equals(((C13221tp) abstractC13218th).m61621h4())) {
                    C14062gk c14062gkM61617to = abstractC13218th.m61617to();
                    if (c14062gkM61617to != null && this.f43429dy.get_Item(c14062gkM61617to) == null) {
                        this.f43429dy.addItem(c14062gkM61617to, c14062gkM61617to);
                    }
                    m60078k4(abstractC13218th.m61618x1(), c13287xo);
                } else {
                    this.f43433kk = true;
                }
            } else if (c13287xo != null && C7019kk.m27469x1(abstractC13218th, C13221tp.class)) {
                C13221tp c13221tp = (C13221tp) abstractC13218th;
                abstractC13218th.m61613k4(c13287xo.m61749k4(c13221tp.m61621h4() != null ? c13221tp.m61621h4() : C14113y2.f47374k4));
                if (abstractC13218th.m61618x1() != null) {
                    abstractC13218th.m61613k4(abstractC13218th.m61618x1().m61694bv());
                    if (abstractC13218th.m61618x1().m61725u4() != null && this.f43429dy.get_Item(abstractC13218th.m61618x1().m61725u4()) == null) {
                        this.f43429dy.addItem(abstractC13218th.m61618x1().m61725u4(), abstractC13218th.m61618x1().m61725u4());
                    }
                    for (int i2 = 0; i2 < abstractC13218th.m61618x1().m61718m9().size(); i2++) {
                        AbstractC13218th abstractC13218th2 = (AbstractC13218th) abstractC13218th.m61618x1().m61718m9().get_Item(i2);
                        if (C7019kk.m27469x1(abstractC13218th2, C13221tp.class)) {
                            C13221tp c13221tp2 = (C13221tp) abstractC13218th2;
                            C14062gk c14062gkM61617to2 = c13221tp2.m61617to() != null ? c13221tp2.m61617to() : (c13221tp2.m61618x1() == null || c13221tp2.m61618x1().m61725u4() == null) ? null : c13221tp2.m61618x1().m61725u4();
                            if (c14062gkM61617to2 != null) {
                                if (this.f43429dy.get_Item(c14062gkM61617to2) != null) {
                                    c13221tp2.m61613k4((C13282xc) null);
                                } else {
                                    this.f43429dy.addItem(c14062gkM61617to2, c14062gkM61617to2);
                                }
                            }
                        }
                    }
                }
            } else if (!C7019kk.m27469x1(abstractC13218th, C13221tp.class) || !"http://www.w3.org/XML/1998/namespace".equals(((C13221tp) abstractC13218th).m61621h4())) {
                String strM61611k4 = abstractC13218th.m61611k4();
                if (strM61611k4 != null && (c14062gkM60060k4 = m60060k4(c13282xc, strM61611k4)) != null && this.f43429dy.get_Item(c14062gkM60060k4) == null) {
                    AbstractC3150x6 abstractC3150x6M60059k4 = m60059k4(c14062gkM60060k4);
                    if (abstractC3150x6M60059k4 != null) {
                        abstractC13218th.m61614k4(c14062gkM60060k4);
                        this.f43429dy.addItem(c14062gkM60060k4, c14062gkM60060k4);
                        C13938ms c13938ms = new C13938ms(c14062gkM60060k4.toString(), abstractC3150x6M60059k4, m61165k4());
                        c13938ms.m65615k4(this.f43427ck);
                        try {
                            try {
                                C12915bu c12915bu = new C12915bu(3, m61165k4(), m61178x1(), m61176kk());
                                c12915bu.m60113k4(c13938ms, (String) null);
                                do {
                                } while (c13938ms.mo65026h4());
                                abstractC13218th.m61613k4(c12915bu.m60117x1());
                                m60078k4(abstractC13218th.m61618x1(), c13287xo);
                            } catch (XmlSchemaException e) {
                                m61179x1(new XmlSchemaException("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{strM61611k4, e.getMessage()}, e.getSourceUri(), e.getLineNumber(), e.getLinePosition()), 0);
                            } catch (RuntimeException unused) {
                                m61170k4("Cannot resolve the 'schemaLocation' attribute.", abstractC13218th, 1);
                            }
                        } finally {
                            c13938ms.mo65049um();
                        }
                    } else {
                        m61170k4("Cannot resolve the 'schemaLocation' attribute.", abstractC13218th, 1);
                    }
                }
            } else if (!this.f43433kk) {
                this.f43433kk = true;
                abstractC13218th.m61613k4(C13091ly.m61144m9());
            }
        }
        c13282xc.m60681h4(false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60079k4(C13282xc c13282xc, String str, int i) {
        String str2;
        C13005gv c13005gvM61719ne;
        C13890ei c13890eiM61633m9;
        C12969en c12969en;
        AbstractC13018hl abstractC13018hl;
        String strM61621h4;
        String str3;
        if (c13282xc.m60679e0()) {
            return;
        }
        c13282xc.m60681h4(true);
        String strM61697du = c13282xc.m61697du();
        if (strM61697du != null) {
            String strMo65266k4 = m61165k4().mo65266k4(strM61697du);
            c13282xc.m61710k4(strMo65266k4);
            if (strMo65266k4.length() == 0) {
                m61169k4("The targetNamespace attribute cannot have empty string as its value.", c13282xc);
            } else {
                try {
                    C13850af.m65125qq(strMo65266k4);
                } catch (RuntimeException unused) {
                    m61171k4("The Namespace '{0}' is an invalid URI.", c13282xc.m61697du(), c13282xc);
                }
            }
        }
        if (c13282xc.m61702h4() != null) {
            try {
                C13850af.m65070du(c13282xc.m61702h4());
            } catch (RuntimeException unused2) {
                m61171k4("The '{0}' attribute has an invalid value according to its data type.", "version", c13282xc);
            }
        }
        if (i == 0) {
            if (str == null && c13282xc.m61697du() != null) {
                str = c13282xc.m61697du();
            } else if (c13282xc.m61697du() == null && str != null && str.length() == 0) {
                str = null;
            }
            if (!C14113y2.m67363du(str, c13282xc.m61697du())) {
                str2 = "The targetNamespace parameter '{0}' should be the same value as the targetNamespace '{1}' of the Schema.";
                m61173k4(str2, str, c13282xc.m61697du(), c13282xc);
            }
        } else if (i != 1) {
            if (i == 2 && !C14113y2.m67363du(str, c13282xc.m61697du())) {
                str2 = "The namespace attribute '{0}' of an import should be the same value as the targetNamespace '{1}' of the imported Schema.";
                m61173k4(str2, str, c13282xc.m61697du(), c13282xc);
            }
        } else if (c13282xc.m61697du() != null && !C14113y2.m67363du(str, c13282xc.m61697du())) {
            str2 = "The targetNamespace '{0}' of included/redefined Schema should be the same as the targetNamespace '{1}' of the including Schema.";
            m61173k4(str2, str, c13282xc.m61697du(), c13282xc);
        }
        for (int i2 = 0; i2 < c13282xc.m61718m9().size(); i2++) {
            AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i2);
            m60068k4(abstractC13218th, c13282xc);
            m60080kk(abstractC13218th);
            String strM61611k4 = abstractC13218th.m61611k4();
            if (strM61611k4 != null) {
                try {
                    C13850af.m65125qq(strM61611k4);
                } catch (RuntimeException unused3) {
                    m61171k4("The SchemaLocation '{0}' is an invalid URI.", strM61611k4, abstractC13218th);
                }
            } else if ((C7019kk.m27469x1(abstractC13218th, C12995g6.class) || C7019kk.m27469x1(abstractC13218th, C13191ru.class)) && abstractC13218th.m61618x1() == null) {
                m61171k4("The required attribute '{0}' is missing.", "schemaLocation", abstractC13218th);
            }
            if (abstractC13218th.m61618x1() != null) {
                if (!C7019kk.m27469x1(abstractC13218th, C12995g6.class) && C7019kk.m27469x1(abstractC13218th, C13221tp.class)) {
                    C13221tp c13221tp = (C13221tp) abstractC13218th;
                    if (c13221tp.m61621h4() != null || c13282xc.m61697du() != null) {
                        str3 = C14113y2.m67363du(c13221tp.m61621h4(), c13282xc.m61697du()) ? "Namespace attribute of an import must not match the real value of the enclosing targetNamespace of the <Schema>." : "The enclosing <Schema> must have a targetNamespace, if the Namespace attribute is absent on the import element.";
                        m60079k4(abstractC13218th.m61618x1(), c13221tp.m61621h4(), 2);
                    }
                    m61169k4(str3, abstractC13218th);
                    m60079k4(abstractC13218th.m61618x1(), c13221tp.m61621h4(), 2);
                } else {
                    m60079k4(abstractC13218th.m61618x1(), c13282xc.m61697du(), 1);
                }
            } else if (C7019kk.m27469x1(abstractC13218th, C13221tp.class) && (strM61621h4 = ((C13221tp) abstractC13218th).m61621h4()) != null) {
                if (strM61621h4.length() == 0) {
                    m61171k4("The namespace attribute cannot have empty string as its value.", strM61621h4, abstractC13218th);
                } else {
                    try {
                        C13850af.m65125qq(strM61621h4);
                    } catch (FormatException unused4) {
                        m61171k4("The Namespace '{0}' is an invalid URI.", strM61621h4, abstractC13218th);
                    }
                }
            }
        }
        m60088x1(c13282xc);
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        this.f43436x1 = str;
        if (c13282xc.m61731x1() == 255) {
            this.f43430h4 = 255;
        } else if (c13282xc.m61731x1() == 256) {
            this.f43430h4 = 0;
        } else {
            if ((c13282xc.m61731x1() & (-8)) != 0) {
                m61169k4("The values 'list' and 'union' are invalid for the blockDefault attribute.", c13282xc);
            }
            this.f43430h4 = c13282xc.m61731x1() & 7;
        }
        if (c13282xc.m61713kk() == 255) {
            this.f43434m9 = 255;
        } else if (c13282xc.m61713kk() == 256) {
            this.f43434m9 = 0;
        } else {
            if ((c13282xc.m61713kk() & (-31)) != 0) {
                m61169k4("The value 'substitution' is invalid for the finalDefault attribute.", c13282xc);
            }
            this.f43434m9 = c13282xc.m61713kk() & 30;
        }
        int iM61722to = c13282xc.m61722to();
        this.f43435to = iM61722to;
        if (iM61722to == 0) {
            this.f43435to = 2;
        }
        int iM61705k4 = c13282xc.m61705k4();
        this.f43428du = iM61705k4;
        if (iM61705k4 == 0) {
            this.f43428du = 2;
        }
        for (int i3 = 0; i3 < c13282xc.m61718m9().size(); i3++) {
            AbstractC13218th abstractC13218th2 = (AbstractC13218th) c13282xc.m61718m9().get_Item(i3);
            if (C7019kk.m27469x1(abstractC13218th2, C12995g6.class)) {
                C12995g6 c12995g6 = (C12995g6) abstractC13218th2;
                if (abstractC13218th2.m61618x1() != null) {
                    m60066k4(c12995g6);
                } else {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= c12995g6.m60641h4().size()) {
                            break;
                        }
                        if (!C7019kk.m27469x1(c12995g6.m60641h4().get_Item(i4), C13289xq.class)) {
                            m61169k4("'SchemaLocation' must successfully resolve if <redefine> contains any child other than <annotation>.", c12995g6);
                            break;
                        }
                        i4++;
                    }
                }
            }
            C13282xc c13282xcM61618x1 = abstractC13218th2.m61618x1();
            if (c13282xcM61618x1 != null) {
                Iterator it = c13282xcM61618x1.m61717ks().m60648kk().iterator();
                while (it.hasNext()) {
                    try {
                        C13021hu c13021hu = (C13021hu) it.next();
                        m61168k4(c13282xc.m61717ks(), c13021hu.m60721qq(), c13021hu);
                    } finally {
                        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                Iterator it2 = c13282xcM61618x1.m61701fa().m60648kk().iterator();
                while (it2.hasNext()) {
                    try {
                        C13146p4 c13146p4 = (C13146p4) it2.next();
                        m61168k4(c13282xc.m61701fa(), c13146p4.m61359fa(), c13146p4);
                    } finally {
                        if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it2).dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
                Iterator it3 = c13282xcM61618x1.m61735x6().m60648kk().iterator();
                while (it3.hasNext()) {
                    try {
                        C13147p5 c13147p5 = (C13147p5) it3.next();
                        m61168k4(c13282xc.m61735x6(), c13147p5.m61380h4(), c13147p5);
                    } finally {
                        if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it3).dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4(it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
                Iterator it4 = c13282xcM61618x1.m61727up().m60648kk().iterator();
                while (it4.hasNext()) {
                    try {
                        C13149p8 c13149p8 = (C13149p8) it4.next();
                        m61168k4(c13282xc.m61727up(), c13149p8.m61401m9(), c13149p8);
                    } finally {
                        if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it4).dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
                Iterator it5 = c13282xcM61618x1.m61737yj().m60648kk().iterator();
                while (it5.hasNext()) {
                    try {
                        C12943dd c12943dd = (C12943dd) it5.next();
                        m61168k4(c13282xc.m61737yj(), c12943dd.m60210bv(), c12943dd);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4(it5, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it5).dispose();
                }
                Iterator it6 = c13282xcM61618x1.m61719ne().m60648kk().iterator();
                while (it6.hasNext()) {
                    try {
                        C13237ul c13237ul = (C13237ul) it6.next();
                        m61168k4(c13282xc.m61719ne(), c13237ul.m61633m9(), c13237ul);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4(it6, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it6).dispose();
                }
            }
            m60067k4(abstractC13218th2);
        }
        List list = new List();
        for (int i5 = 0; i5 < c13282xc.m61700dy().size(); i5++) {
            m60068k4(c13282xc.m61700dy().get_Item(i5), c13282xc);
            C13146p4 c13146p42 = (C13146p4) C7019kk.m27452k4((Object) c13282xc.m61700dy().get_Item(i5), C13146p4.class);
            if (c13146p42 != null) {
                m60071k4(c13146p42);
                c13005gvM61719ne = c13282xc.m61701fa();
                c13890eiM61633m9 = c13146p42.m61359fa();
                abstractC13018hl = c13146p42;
            } else if (C7019kk.m27469x1(c13282xc.m61700dy().get_Item(i5), C13149p8.class)) {
                C13149p8 c13149p82 = (C13149p8) c13282xc.m61700dy().get_Item(i5);
                m60087x1(c13149p82);
                c13005gvM61719ne = c13282xc.m61727up();
                c13890eiM61633m9 = c13149p82.m61401m9();
                abstractC13018hl = c13149p82;
            } else {
                if (C7019kk.m27469x1(c13282xc.m61700dy().get_Item(i5), C12969en.class)) {
                    C12969en c12969en2 = (C12969en) c13282xc.m61700dy().get_Item(i5);
                    m60065k4(c12969en2, false);
                    c12969en = c12969en2;
                } else if (C7019kk.m27469x1(c13282xc.m61700dy().get_Item(i5), C13164q9.class)) {
                    C13164q9 c13164q9 = (C13164q9) c13282xc.m61700dy().get_Item(i5);
                    m60075k4(c13164q9, false);
                    c12969en = c13164q9;
                } else if (C7019kk.m27469x1(c13282xc.m61700dy().get_Item(i5), C13021hu.class)) {
                    C13021hu c13021hu2 = (C13021hu) c13282xc.m61700dy().get_Item(i5);
                    m60070k4(c13021hu2);
                    c13005gvM61719ne = c13282xc.m61717ks();
                    c13890eiM61633m9 = c13021hu2.m60721qq();
                    abstractC13018hl = c13021hu2;
                } else if (C7019kk.m27469x1(c13282xc.m61700dy().get_Item(i5), C13147p5.class)) {
                    C13147p5 c13147p52 = (C13147p5) c13282xc.m61700dy().get_Item(i5);
                    m60086x1(c13147p52);
                    c13005gvM61719ne = c13282xc.m61735x6();
                    c13890eiM61633m9 = c13147p52.m61380h4();
                    abstractC13018hl = c13147p52;
                } else if (C7019kk.m27469x1(c13282xc.m61700dy().get_Item(i5), C13237ul.class)) {
                    C13237ul c13237ul2 = (C13237ul) c13282xc.m61700dy().get_Item(i5);
                    m60076k4(c13237ul2);
                    c13005gvM61719ne = c13282xc.m61719ne();
                    c13890eiM61633m9 = c13237ul2.m61633m9();
                    abstractC13018hl = c13237ul2;
                } else {
                    if (!C7019kk.m27469x1(c13282xc.m61700dy().get_Item(i5), C13289xq.class)) {
                        m61169k4("The Schema items collection cannot contain an object of type 'XmlSchemaInclude', 'XmlSchemaImport', or 'XmlSchemaRedefine'.", c13282xc.m61700dy().get_Item(i5));
                        list.addItem(c13282xc.m61700dy().get_Item(i5));
                    }
                }
                c13005gvM61719ne = c13282xc.m61737yj();
                c13890eiM61633m9 = c12969en.m60210bv();
                abstractC13018hl = c12969en;
            }
            m61168k4(c13005gvM61719ne, c13890eiM61633m9, abstractC13018hl);
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            c13282xc.m61700dy().m60097x1((AbstractC13018hl) list.get_Item(i6));
        }
        c13282xc.m60681h4(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60089k4(AbstractC13943n5 abstractC13943n5) {
        this.f43427ck = abstractC13943n5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m60090k4(C13282xc c13282xc, String str, boolean z, C13287xo c13287xo) {
        this.f43432k4 = c13282xc;
        this.f43431jd = m61165k4().mo65266k4("xmlns");
        m60077k4(c13282xc);
        if (z && this.f43427ck != null) {
            this.f43429dy = new Hashtable();
            if (c13282xc.m61725u4() != null) {
                this.f43429dy.addItem(c13282xc.m61725u4(), c13282xc.m61725u4());
            }
            m60078k4(c13282xc, c13287xo);
        }
        m60067k4((AbstractC13018hl) c13282xc);
        m60079k4(c13282xc, str, 0);
        if (!m61164du()) {
            c13282xc.m61734x1(true);
            for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
                AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
                if (abstractC13218th.m61618x1() != null) {
                    abstractC13218th.m61618x1().m61734x1(true);
                }
            }
        }
        return !m61164du();
    }
}

package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p205ji.C5465to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13906gx;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.C13969rq;
import com.aspose.slides.p559ms.System.Xml.C13988u1;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ly */
/* JADX INFO: loaded from: classes5.dex */
public final class C13091ly extends C13100m9 {

    /* JADX INFO: renamed from: ne */
    private static AtomicReference<C13282xc> f44086ne = new AtomicReference<>();

    /* JADX INFO: renamed from: c5 */
    private int f44087c5;

    /* JADX INFO: renamed from: ck */
    private Hashtable f44088ck;

    /* JADX INFO: renamed from: du */
    private C13282xc f44089du;

    /* JADX INFO: renamed from: dy */
    private int f44090dy;

    /* JADX INFO: renamed from: fa */
    private Hashtable f44091fa;

    /* JADX INFO: renamed from: h4 */
    private int f44092h4;

    /* JADX INFO: renamed from: ix */
    private AbstractC13943n5 f44093ix;

    /* JADX INFO: renamed from: jd */
    private Hashtable f44094jd;

    /* JADX INFO: renamed from: k4 */
    private String f44095k4;

    /* JADX INFO: renamed from: kk */
    private String f44096kk;

    /* JADX INFO: renamed from: ks */
    private C13906gx f44097ks;

    /* JADX INFO: renamed from: m9 */
    private int f44098m9;

    /* JADX INFO: renamed from: rv */
    private C13282xc f44099rv;

    /* JADX INFO: renamed from: to */
    private C13282xc f44100to;

    /* JADX INFO: renamed from: up */
    private Hashtable f44101up;

    /* JADX INFO: renamed from: x1 */
    private String f44102x1;

    /* JADX INFO: renamed from: x6 */
    private ArrayList f44103x6;

    /* JADX INFO: renamed from: yj */
    private SortedList f44104yj;

    public C13091ly(AbstractC13883dt abstractC13883dt, C13058k1 c13058k1, AbstractC13319z7 abstractC13319z7, C12903b2 c12903b2) {
        super(abstractC13883dt, c13058k1, abstractC13319z7, c12903b2);
        this.f44099rv = null;
        this.f44093ix = null;
        this.f44091fa = new Hashtable();
        this.f44101up = new Hashtable();
        this.f44104yj = new SortedList();
    }

    /* JADX INFO: renamed from: du */
    private void m61113du(C13282xc c13282xc) {
        if (c13282xc.m61731x1() == 255) {
            this.f44090dy = 255;
        } else if (c13282xc.m61731x1() == 256) {
            this.f44090dy = 0;
        } else {
            if ((c13282xc.m61731x1() & (-8)) != 0) {
                m61169k4("The values 'list' and 'union' are invalid for the blockDefault attribute.", (AbstractC13018hl) c13282xc);
            }
            this.f44090dy = c13282xc.m61731x1() & 7;
        }
        if (c13282xc.m61713kk() == 255) {
            this.f44087c5 = 255;
        } else if (c13282xc.m61713kk() == 256) {
            this.f44087c5 = 0;
        } else {
            if ((c13282xc.m61713kk() & (-31)) != 0) {
                m61169k4("The value 'substitution' is invalid for the finalDefault attribute.", (AbstractC13018hl) c13282xc);
            }
            this.f44087c5 = c13282xc.m61713kk() & 30;
        }
        int iM61722to = c13282xc.m61722to();
        this.f44092h4 = iM61722to;
        if (iM61722to == 0) {
            this.f44092h4 = 2;
        }
        int iM61705k4 = c13282xc.m61705k4();
        this.f44098m9 = iM61705k4;
        if (iM61705k4 == 0) {
            this.f44098m9 = 2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m61114k4(C12908be c12908be, C13890ei c13890ei, C13147p5 c13147p5) {
        int iM61114k4 = 0;
        for (int i = 0; i < c12908be.size(); i++) {
            C12990fw c12990fw = (C12990fw) C7019kk.m27452k4((Object) c12908be.get_Item(i), C12990fw.class);
            if (c12990fw != null) {
                if (C13890ei.m65278k4(c12990fw.m60635k4(), c13890ei)) {
                    c12990fw.m60637k4(c13147p5);
                    C14046bv c14046bvM60245g8 = c12990fw.m60245g8();
                    C14046bv c14046bv = C14046bv.f47169to;
                    if (C14046bv.m66484m9(c14046bvM60245g8, c14046bv) || C14046bv.m66484m9(c12990fw.m60248sv(), c14046bv)) {
                        m61169k4("When group is redefined, the real value of both minOccurs and maxOccurs attribute must be 1 (or absent).", c12990fw);
                    }
                    iM61114k4++;
                }
            } else if (C7019kk.m27469x1(c12908be.get_Item(i), AbstractC13054jn.class)) {
                iM61114k4 += m61114k4(((AbstractC13054jn) c12908be.get_Item(i)).mo61012k4(), c13890ei, c13147p5);
            }
            if (iM61114k4 > 1) {
                return iM61114k4;
            }
        }
        return iM61114k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m61140kk(AbstractC13018hl abstractC13018hl) {
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

    /* JADX INFO: renamed from: m9 */
    public static C13282xc m61144m9() {
        if (f44086ne.get() == null) {
            C13282xc c13282xc = new C13282xc();
            c13282xc.m61710k4("http://www.w3.org/XML/1998/namespace");
            c13282xc.m60691ts().m49779k4("xml", "http://www.w3.org/XML/1998/namespace");
            C13146p4 c13146p4 = new C13146p4();
            c13146p4.m61357du(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);
            c13146p4.m61375x1(new C13890ei("language", "http://www.w3.org/2001/XMLSchema"));
            c13282xc.m61700dy().m60092k4(c13146p4);
            C13146p4 c13146p42 = new C13146p4();
            c13146p42.m61357du("base");
            c13146p42.m61375x1(new C13890ei("anyURI", "http://www.w3.org/2001/XMLSchema"));
            c13282xc.m61700dy().m60092k4(c13146p42);
            C13146p4 c13146p43 = new C13146p4();
            c13146p43.m61357du("space");
            C13164q9 c13164q9 = new C13164q9();
            C13261w8 c13261w8 = new C13261w8();
            c13261w8.m61655k4(new C13890ei("NCName", "http://www.w3.org/2001/XMLSchema"));
            C13046j8 c13046j8 = new C13046j8();
            c13046j8.m60236x1("default");
            c13261w8.m61652h4().m60092k4(c13046j8);
            C13046j8 c13046j82 = new C13046j8();
            c13046j82.m60236x1("preserve");
            c13261w8.m61652h4().m60092k4(c13046j82);
            c13164q9.m61417k4((AbstractC13079l6) c13261w8);
            c13146p43.m61365k4(c13164q9);
            c13146p43.m61376x1("preserve");
            c13282xc.m61700dy().m60092k4(c13146p43);
            C13149p8 c13149p8 = new C13149p8();
            c13149p8.m61404x1("specialAttrs");
            C13146p4 c13146p44 = new C13146p4();
            c13146p44.m61366k4(new C13890ei(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "http://www.w3.org/XML/1998/namespace"));
            c13149p8.m61402x1().m60092k4(c13146p44);
            C13146p4 c13146p45 = new C13146p4();
            c13146p45.m61366k4(new C13890ei("space", "http://www.w3.org/XML/1998/namespace"));
            c13149p8.m61402x1().m60092k4(c13146p45);
            C13146p4 c13146p46 = new C13146p4();
            c13146p46.m61366k4(new C13890ei("base", "http://www.w3.org/XML/1998/namespace"));
            c13149p8.m61402x1().m60092k4(c13146p46);
            c13282xc.m61700dy().m60092k4(c13149p8);
            c13282xc.m61734x1(true);
            c13282xc.m61708k4(new C13963qw(), null, null);
            f44086ne.set(c13282xc);
        }
        return f44086ne.get();
    }

    /* JADX INFO: renamed from: to */
    private void m61145to(AbstractC13018hl abstractC13018hl) {
        C13289xq c13289xqM61292to;
        if (!C7019kk.m27469x1(abstractC13018hl, C13126nm.class) || (c13289xqM61292to = ((C13126nm) C7019kk.m27452k4((Object) abstractC13018hl, C13126nm.class)).m61292to()) == null) {
            return;
        }
        m61139k4(c13289xqM61292to);
        c13289xqM61292to.m60684k4(abstractC13018hl);
    }

    /* JADX INFO: renamed from: h4 */
    public final C13282xc m61154h4() {
        return this.f44100to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61159x1(Hashtable hashtable) {
        this.f44088ck = hashtable;
    }

    /* JADX INFO: renamed from: k4 */
    public static C13282xc m61115k4(AbstractC13018hl abstractC13018hl) {
        C13282xc c13282xc = null;
        while (c13282xc == null && abstractC13018hl != null) {
            abstractC13018hl = abstractC13018hl.m60677c6();
            c13282xc = (C13282xc) C7019kk.m27452k4((Object) abstractC13018hl, C13282xc.class);
        }
        return c13282xc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61141kk(C13021hu c13021hu) {
        int iM60704h4;
        m61145to(c13021hu);
        if (!c13021hu.m60720ne().m65287kk()) {
            m61171k4("The '{0}' attribute cannot be present.", "ref", c13021hu);
        }
        if (c13021hu.m60704h4() != 255) {
            if (c13021hu.m60704h4() == 256) {
                iM60704h4 = this.f44090dy;
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
            m61125k4(c13021hu.m60727uz(), c13021hu);
            if (!c13021hu.m60724u4().m65287kk()) {
                m61169k4("The type attribute cannot be present with either simpleType or complexType.", c13021hu);
            }
            if (C7019kk.m27469x1(c13021hu.m60727uz(), C12969en.class)) {
                m61124k4((C12969en) c13021hu.m60727uz(), true);
            } else {
                m61132k4((C13164q9) c13021hu.m60727uz(), true);
            }
        }
        if (!c13021hu.m60724u4().m65287kk()) {
            m61126k4(c13021hu, C18437z2.f56754h, c13021hu.m60724u4());
        }
        if (c13021hu.m60719m9() != null && c13021hu.m60706jd() != null) {
            m61169k4("The fixed and default attributes cannot both be present.", c13021hu);
        }
        for (int i = 0; i < c13021hu.m60729wl().size(); i++) {
            C12887a0 c12887a0 = (C12887a0) c13021hu.m60729wl().get_Item(i);
            m61125k4(c12887a0, c13021hu);
            m61119k4(c12887a0);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m61146to(C13282xc c13282xc) {
        this.f44091fa.clear();
        this.f44091fa.addItem("http://www.w3.org/2001/XMLSchema", "http://www.w3.org/2001/XMLSchema");
        for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
            AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
            if (C7019kk.m27469x1(abstractC13218th, C13221tp.class)) {
                String strM61621h4 = ((C13221tp) C7019kk.m27452k4((Object) abstractC13218th, C13221tp.class)).m61621h4();
                if (strM61621h4 == null) {
                    strM61621h4 = C14113y2.f47374k4;
                }
                if (this.f44091fa.get_Item(strM61621h4) == null) {
                    this.f44091fa.addItem(strM61621h4, strM61621h4);
                }
            }
        }
        String strM61697du = c13282xc.m61697du();
        if (strM61697du == null) {
            strM61697du = C14113y2.f47374k4;
        }
        if (this.f44091fa.get_Item(strM61697du) == null) {
            this.f44091fa.addItem(strM61697du, strM61697du);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m61147x1(AbstractC13018hl abstractC13018hl) {
        if (abstractC13018hl.mo60686lr() != null) {
            try {
                abstractC13018hl.mo60690to(m61165k4().mo65266k4(C13850af.m65120kk(abstractC13018hl.mo60686lr())));
                try {
                    this.f44089du.m61720qq().addItem(abstractC13018hl.mo60686lr(), abstractC13018hl);
                } catch (ArgumentException unused) {
                    m61169k4("Duplicate ID attribute.", abstractC13018hl);
                }
            } catch (ArgumentNullException unused2) {
                m61171k4("Invalid 'id' attribute value: {0}", C13968ri.m65818k4("Value cannot be null."), abstractC13018hl);
            } catch (XmlException e) {
                m61175k4("Invalid 'id' attribute value: {0}", new String[]{e.getMessage()}, e, abstractC13018hl);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C13282xc m61116k4(String str, C13282xc c13282xc) {
        C12931ck c12931ck = new C12931ck(str, c13282xc);
        C13282xc c13282xc2 = (C13282xc) this.f44088ck.get_Item(c12931ck);
        if (c13282xc2 != null) {
            return c13282xc2;
        }
        C13282xc c13282xcMo60427wy = c13282xc.mo60427wy();
        c13282xcMo60427wy.m61724to(true);
        c13282xcMo60427wy.m61710k4(str);
        this.f44088ck.addItem(c12931ck, c13282xcMo60427wy);
        c13282xcMo60427wy.m60688m9(c13282xc.m60693xk());
        c13282xc.m60681h4(false);
        return c13282xcMo60427wy;
    }

    /* JADX INFO: renamed from: kk */
    private void m61142kk(C13146p4 c13146p4) {
        m61145to(c13146p4);
        if (C13851ai.m65152k4(this.f44089du.m61697du(), this.f44102x1)) {
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
        if (C14113y2.m67363du(c13146p4.m61370m9(), this.f44095k4)) {
            m61169k4("The value 'xmlns' cannot be used as the name of an attribute declaration.", c13146p4);
        }
        if (c13146p4.m61361jd() != null) {
            m61125k4(c13146p4.m61361jd(), c13146p4);
            if (!c13146p4.m61355c5().m65287kk()) {
                m61169k4("The type attribute cannot be present with either simpleType or complexType.", c13146p4);
            }
            m61132k4(c13146p4.m61361jd(), true);
        }
        if (c13146p4.m61355c5().m65287kk()) {
            return;
        }
        m61126k4(c13146p4, C18437z2.f56754h, c13146p4.m61355c5());
    }

    /* JADX INFO: renamed from: x1 */
    private void m61148x1(C13021hu c13021hu) {
        C13890ei c13890eiM60720ne;
        if (c13021hu.m60703fa() != null) {
            m61140kk((AbstractC13018hl) c13021hu);
            m61141kk(c13021hu);
            c13890eiM60720ne = new C13890ei(c13021hu.m60703fa(), (c13021hu.m60699ck() == 1 || (c13021hu.m60699ck() == 0 && this.f44092h4 == 1)) ? this.f44096kk : null);
        } else {
            m61145to(c13021hu);
            if (c13021hu.m60720ne().m65287kk()) {
                m61169k4("For element declaration, either the name or the ref attribute must be present.", c13021hu);
            } else {
                m61126k4(c13021hu, "ref", c13021hu.m60720ne());
            }
            if (!c13021hu.m60724u4().m65287kk() || c13021hu.m60718ks() || c13021hu.m60704h4() != 256 || c13021hu.m60727uz() != null || c13021hu.m60728v4() || c13021hu.m60719m9() != null || c13021hu.m60699ck() != 0 || c13021hu.m60706jd() != null || c13021hu.m60736yj()) {
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
        if (c13021hu.m60718ks()) {
            m61171k4("The '{0}' attribute cannot be present.", "abstract", c13021hu);
        }
        if (c13021hu.m60702dy() != 256) {
            m61171k4("The '{0}' attribute cannot be present.", "final", c13021hu);
        }
        if (!c13021hu.m60705ix().m65287kk()) {
            m61171k4("The '{0}' attribute cannot be present.", "substitutionGroup", c13021hu);
        }
        m61147x1((AbstractC13018hl) c13021hu);
    }

    /* JADX INFO: renamed from: k4 */
    private C14062gk m61117k4(C13282xc c13282xc, String str) {
        if (str.length() == 0) {
            return null;
        }
        return this.f44093ix.mo65674k4(c13282xc.m61725u4(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61143kk(C13282xc c13282xc) throws Throwable {
        RuntimeException runtimeException;
        C14062gk c14062gkM61117k4;
        Object objM61118k4;
        AbstractC13912i5 abstractC13912i5;
        AbstractC13912i5 abstractC13912i5M65468k4;
        Throwable th;
        if (!c13282xc.m60679e0()) {
            c13282xc.m60681h4(true);
            for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
                AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
                C13282xc c13282xcM61618x1 = abstractC13218th.m61618x1();
                if (c13282xcM61618x1 != null) {
                    C14062gk c14062gkM61725u4 = c13282xcM61618x1.m61725u4();
                    if (c14062gkM61725u4 != null && this.f44094jd.get_Item(c14062gkM61725u4) == null) {
                        this.f44094jd.addItem(c14062gkM61725u4, c13282xcM61618x1);
                    }
                } else {
                    String strM61611k4 = abstractC13218th.m61611k4();
                    if (strM61611k4 != null) {
                        try {
                            c14062gkM61117k4 = m61117k4(c13282xc, strM61611k4);
                            runtimeException = null;
                        } catch (RuntimeException e) {
                            runtimeException = e;
                            c14062gkM61117k4 = null;
                        }
                    } else {
                        c14062gkM61117k4 = null;
                        runtimeException = null;
                    }
                    if (abstractC13218th.m61610du() == 2) {
                        C13221tp c13221tp = (C13221tp) C7019kk.m27452k4((Object) abstractC13218th, C13221tp.class);
                        String strM61621h4 = c13221tp.m61621h4() != null ? c13221tp.m61621h4() : C14113y2.f47374k4;
                        if (!c13282xc.m61693b3().contains(strM61621h4)) {
                            c13282xc.m61693b3().addItem(strM61621h4);
                        }
                        if ("http://www.w3.org/XML/1998/namespace".equals(strM61621h4) && c14062gkM61117k4 == null) {
                            abstractC13218th.m61613k4(m61144m9());
                        } else if (c14062gkM61117k4 == null) {
                            if (strM61611k4 != null) {
                                m61167k4(new XmlSchemaException("Cannot resolve the 'schemaLocation' attribute.", null, runtimeException, abstractC13218th.m60693xk(), abstractC13218th.m60676ak(), abstractC13218th.m60678dq(), abstractC13218th), 1);
                            }
                        } else if (this.f44094jd.get_Item(c14062gkM61117k4) == null) {
                            try {
                                objM61118k4 = m61118k4(c14062gkM61117k4);
                            } catch (RuntimeException e2) {
                                runtimeException = e2;
                                objM61118k4 = null;
                            }
                            if (objM61118k4 != null) {
                                abstractC13218th.m61614k4(c14062gkM61117k4);
                                AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(objM61118k4);
                                if (C7019kk.m27443k4((Class<?>) C13282xc.class).m66761x1(abstractC14068j5M66727k4)) {
                                    abstractC13218th.m61613k4((C13282xc) objM61118k4);
                                    this.f44094jd.addItem(c14062gkM61117k4, abstractC13218th.m61618x1());
                                    c13282xcM61618x1 = abstractC13218th.m61618x1();
                                } else {
                                    if (abstractC14068j5M66727k4.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC3150x6.class))) {
                                        this.f44097ks.m65377h4(true);
                                        this.f44097ks.m65389k4(this.f44093ix);
                                        abstractC13912i5M65468k4 = AbstractC13912i5.m65464k4((AbstractC3150x6) objM61118k4, this.f44097ks, c14062gkM61117k4.toString());
                                    } else if (abstractC14068j5M66727k4.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC13912i5.class))) {
                                        abstractC13912i5M65468k4 = (AbstractC13912i5) objM61118k4;
                                    } else if (abstractC14068j5M66727k4.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC3151yd.class))) {
                                        this.f44097ks.m65377h4(true);
                                        this.f44097ks.m65389k4(this.f44093ix);
                                        abstractC13912i5M65468k4 = AbstractC13912i5.m65468k4((AbstractC3151yd) objM61118k4, this.f44097ks, c14062gkM61117k4.toString());
                                    } else {
                                        abstractC13912i5 = null;
                                        if (abstractC13912i5 != null) {
                                            m61170k4("Cannot resolve the 'schemaLocation' attribute.", abstractC13218th, 1);
                                        } else {
                                            try {
                                                try {
                                                    C12915bu c12915bu = new C12915bu(3, m61165k4(), m61178x1(), m61176kk());
                                                    c12915bu.m60113k4(abstractC13912i5, (String) null);
                                                    do {
                                                    } while (abstractC13912i5.mo65026h4());
                                                    C13282xc c13282xcM60117x1 = c12915bu.m60117x1();
                                                    abstractC13218th.m61613k4(c13282xcM60117x1);
                                                    this.f44094jd.addItem(c14062gkM61117k4, c13282xcM60117x1);
                                                    m61143kk(c13282xcM60117x1);
                                                } catch (XmlSchemaException e3) {
                                                    try {
                                                        try {
                                                            m61174k4("Cannot load the Schema from the location '{0}' - {1}", strM61611k4, e3.getMessage(), e3.getSourceUri(), e3.getLineNumber(), e3.getLinePosition());
                                                            abstractC13912i5.mo65049um();
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            th = th;
                                                            abstractC13912i5.mo65049um();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                    }
                                                } catch (RuntimeException e4) {
                                                    m61167k4(new XmlSchemaException("Cannot resolve the 'schemaLocation' attribute.", null, e4, abstractC13218th.m60693xk(), abstractC13218th.m60676ak(), abstractC13218th.m60678dq(), abstractC13218th), 1);
                                                }
                                                abstractC13912i5.mo65049um();
                                            } catch (Throwable th4) {
                                                th = th4;
                                                abstractC13912i5.mo65049um();
                                                throw th;
                                            }
                                        }
                                    }
                                    abstractC13912i5 = abstractC13912i5M65468k4;
                                    if (abstractC13912i5 != null) {
                                    }
                                }
                            } else {
                                m61167k4(new XmlSchemaException("Cannot resolve the 'schemaLocation' attribute.", null, runtimeException, abstractC13218th.m60693xk(), abstractC13218th.m60676ak(), abstractC13218th.m60678dq(), abstractC13218th), 1);
                            }
                        } else {
                            abstractC13218th.m61613k4((C13282xc) this.f44094jd.get_Item(c14062gkM61117k4));
                        }
                    }
                }
                m61143kk(c13282xcM61618x1);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m61149x1(C13146p4 c13146p4) {
        C13890ei c13890eiM61358dy;
        if (c13146p4.m61370m9() != null) {
            m61140kk((AbstractC13018hl) c13146p4);
            m61142kk(c13146p4);
            c13890eiM61358dy = new C13890ei(c13146p4.m61370m9(), (c13146p4.m61360h4() == 1 || (c13146p4.m61360h4() == 0 && this.f44098m9 == 1)) ? this.f44096kk : null);
        } else {
            m61145to(c13146p4);
            if (c13146p4.m61358dy().m65287kk()) {
                m61171k4("For attribute '{0}', either the name or the ref attribute must be present, but not both.", "???", c13146p4);
            } else {
                m61126k4(c13146p4, "ref", c13146p4.m61358dy());
            }
            if (!c13146p4.m61355c5().m65287kk() || c13146p4.m61361jd() != null || c13146p4.m61360h4() != 0) {
                m61169k4("If ref is present, all of 'simpleType', 'form', 'type', and 'use' must be absent.", c13146p4);
            }
            c13890eiM61358dy = c13146p4.m61358dy();
        }
        c13146p4.m61367kk(c13890eiM61358dy);
        m61147x1((AbstractC13018hl) c13146p4);
    }

    /* JADX INFO: renamed from: k4 */
    private Object m61118k4(C14062gk c14062gk) {
        return this.f44093ix.mo5312k4(c14062gk, null, null);
    }

    /* JADX INFO: renamed from: x1 */
    private void m61150x1(C13147p5 c13147p5) {
        if (c13147p5.m61382k4() != null) {
            m61140kk(c13147p5);
            c13147p5.m61387k4(new C13890ei(c13147p5.m61382k4(), this.f44096kk));
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
        m61121k4((AbstractC12950dp) c13147p5.m61389x1());
        m61145to(c13147p5);
        m61147x1((AbstractC13018hl) c13147p5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m61151x1(C13149p8 c13149p8) {
        if (c13149p8.m61396k4() != null) {
            m61140kk(c13149p8);
            c13149p8.m61400k4(new C13890ei(c13149p8.m61396k4(), this.f44096kk));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13149p8);
        }
        m61120k4(c13149p8.m61402x1(), c13149p8.m61394h4(), c13149p8);
        m61145to(c13149p8);
        m61147x1((AbstractC13018hl) c13149p8);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61155k4(Hashtable hashtable) {
        this.f44094jd = hashtable;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61119k4(C12887a0 c12887a0) {
        boolean z;
        m61145to(c12887a0);
        if (c12887a0.m59982k4() != null) {
            m61140kk(c12887a0);
            c12887a0.m59985k4(new C13890ei(c12887a0.m59982k4(), this.f44096kk));
            z = true;
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c12887a0);
            z = false;
        }
        if (this.f44100to.m61703ix().m60649kk(c12887a0.m59986m9()) != null) {
            m61171k4("The identity constraint '{0}' has already been declared.", c12887a0.m59986m9().toString(), c12887a0);
            z = false;
        } else {
            this.f44100to.m61703ix().m60647k4(c12887a0.m59986m9(), c12887a0);
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
                m61126k4(c13145p3, "refer", c13145p3.m61353c5());
            }
        }
        if (z) {
            m61147x1(c12887a0);
            m61147x1(c12887a0.m59987x1());
            m61125k4(c12887a0.m59987x1(), c12887a0);
            for (int i = 0; i < c12887a0.m59980h4().size(); i++) {
                m61125k4(c12887a0.m59980h4().get_Item(i), c12887a0);
                m61147x1(c12887a0.m59980h4().get_Item(i));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m61152x1(C13282xc c13282xc) {
        if (this.f44104yj.contains(Integer.valueOf(c13282xc.m61728uz()))) {
            return;
        }
        this.f44104yj.addItem(Integer.valueOf(c13282xc.m61728uz()), c13282xc);
        for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
            AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
            if (abstractC13218th.m61618x1() != null) {
                m61152x1(abstractC13218th.m61618x1());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61120k4(C12908be c12908be, C13106mq c13106mq, AbstractC13018hl abstractC13018hl) {
        for (int i = 0; i < c12908be.size(); i++) {
            m61125k4(c12908be.get_Item(i), abstractC13018hl);
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12908be.get_Item(i), C13146p4.class);
            if (c13146p4 != null) {
                m61149x1(c13146p4);
            } else {
                C13161q1 c13161q1 = (C13161q1) c12908be.get_Item(i);
                if (c13161q1.m61409k4().m65287kk()) {
                    m61171k4("The '{0}' attribute is either invalid or missing.", "ref", c13161q1);
                } else {
                    m61126k4(c13161q1, "ref", c13161q1.m61409k4());
                }
                m61145to(c12908be.get_Item(i));
                m61147x1(c12908be.get_Item(i));
            }
        }
        if (c13106mq != null) {
            try {
                m61125k4(c13106mq, abstractC13018hl);
                m61145to(c13106mq);
                c13106mq.m61189kk(this.f44096kk);
            } catch (FormatException e) {
                m61175k4("The value of the namespace attribute of the element or attribute wildcard is invalid - {0}", new String[]{e.getMessage()}, e, c13106mq);
            }
            m61147x1(c13106mq);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m61153x1(String str, String str2, AbstractC13018hl abstractC13018hl) {
        try {
            C13850af.m65125qq(str);
        } catch (FormatException e) {
            m61175k4(str2, new String[]{str}, e, abstractC13018hl);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61121k4(AbstractC12950dp abstractC12950dp) {
        int i = 0;
        if (C7019kk.m27469x1(abstractC12950dp, C13141op.class)) {
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
            C12908be c12908beMo61012k4 = ((C13141op) abstractC12950dp).mo61012k4();
            while (i < c12908beMo61012k4.size()) {
                C13021hu c13021hu = (C13021hu) c12908beMo61012k4.get_Item(i);
                if (C14046bv.m66484m9(c13021hu.m60248sv(), C14046bv.f47165du)) {
                    C14046bv c14046bvM60248sv2 = c13021hu.m60248sv();
                    C14046bv c14046bv3 = C14046bv.f47169to;
                    if (C14046bv.m66484m9(c14046bvM60248sv2, c14046bv3)) {
                        c13021hu.m60250x1(c14046bv3.Clone());
                        m61169k4("The {max occurs} of all the particles in the {particles} of an all group must be 0 or 1.", c13021hu);
                    }
                }
                m61125k4(c13021hu, abstractC12950dp);
                m61148x1(c13021hu);
                i++;
            }
        } else {
            if (C14046bv.m66447c5(abstractC12950dp.m60245g8(), abstractC12950dp.m60248sv())) {
                abstractC12950dp.m60246k4(abstractC12950dp.m60248sv().Clone());
                m61169k4("minOccurs value cannot be greater than maxOccurs value.", abstractC12950dp);
            }
            if (C7019kk.m27469x1(abstractC12950dp, C13132o2.class)) {
                C12908be c12908beMo61012k42 = ((C13132o2) abstractC12950dp).mo61012k4();
                while (i < c12908beMo61012k42.size()) {
                    m61125k4(c12908beMo61012k42.get_Item(i), abstractC12950dp);
                    C13021hu c13021hu2 = (C13021hu) C7019kk.m27452k4((Object) c12908beMo61012k42.get_Item(i), C13021hu.class);
                    if (c13021hu2 != null) {
                        m61148x1(c13021hu2);
                    } else {
                        m61121k4((AbstractC12950dp) c12908beMo61012k42.get_Item(i));
                    }
                    i++;
                }
            } else if (C7019kk.m27469x1(abstractC12950dp, C13193s0.class)) {
                C12908be c12908beMo61012k43 = ((C13193s0) abstractC12950dp).mo61012k4();
                while (i < c12908beMo61012k43.size()) {
                    m61125k4(c12908beMo61012k43.get_Item(i), abstractC12950dp);
                    C13021hu c13021hu3 = (C13021hu) C7019kk.m27452k4((Object) c12908beMo61012k43.get_Item(i), C13021hu.class);
                    if (c13021hu3 != null) {
                        m61148x1(c13021hu3);
                    } else {
                        m61121k4((AbstractC12950dp) c12908beMo61012k43.get_Item(i));
                    }
                    i++;
                }
            } else if (C7019kk.m27469x1(abstractC12950dp, C12990fw.class)) {
                C12990fw c12990fw = (C12990fw) abstractC12950dp;
                if (c12990fw.m60635k4().m65287kk()) {
                    m61171k4("The '{0}' attribute is either invalid or missing.", "ref", c12990fw);
                } else {
                    m61126k4(c12990fw, "ref", c12990fw.m60635k4());
                }
            } else if (C7019kk.m27469x1(abstractC12950dp, C12989fu.class)) {
                try {
                    ((C12989fu) abstractC12950dp).m60631kk(this.f44096kk);
                } catch (FormatException e) {
                    m61175k4("The value of the namespace attribute of the element or attribute wildcard is invalid - {0}", new String[]{e.getMessage()}, e, abstractC12950dp);
                }
            }
        }
        m61145to(abstractC12950dp);
        m61147x1(abstractC12950dp);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61122k4(C12961e8 c12961e8) {
        String string;
        String str;
        String str2;
        AbstractC13018hl abstractC13018hl;
        AbstractC13018hl abstractC13018hl2;
        C12995g6 c12995g6 = c12961e8.f43556k4;
        C13282xc c13282xcM61618x1 = c12995g6.m61618x1();
        C13282xc c13282xcM61115k4 = m61115k4((AbstractC13018hl) c12995g6);
        this.f44089du = c13282xcM61115k4;
        m61113du(c13282xcM61115k4);
        if (c13282xcM61618x1.m61696ck()) {
            m61170k4("Multiple redefines of the same Schema will be ignored.", c12995g6, 1);
            return;
        }
        c13282xcM61618x1.m61716kk(true);
        C13282xc c13282xc = c12961e8.f43557x1;
        ArrayList arrayList = new ArrayList();
        m61136k4(c13282xcM61618x1, arrayList);
        String strM61697du = c13282xc.m61697du() == null ? C14113y2.f47374k4 : c13282xc.m61697du();
        C12908be c12908beM60641h4 = c12995g6.m60641h4();
        for (int i = 0; i < c12908beM60641h4.size(); i++) {
            m61125k4(c12908beM60641h4.get_Item(i), c12995g6);
            C13147p5 c13147p5 = (C13147p5) C7019kk.m27452k4((Object) c12908beM60641h4.get_Item(i), C13147p5.class);
            if (c13147p5 != null) {
                m61150x1(c13147p5);
                c13147p5.m61380h4().m65286k4(strM61697du);
                if (c12995g6.m60639c5().m60649kk(c13147p5.m61380h4()) != null) {
                    str2 = "Double redefine for group.";
                    abstractC13018hl2 = c13147p5;
                    m61169k4(str2, abstractC13018hl2);
                } else {
                    m61168k4(c12995g6.m60639c5(), c13147p5.m61380h4(), c13147p5);
                    C13147p5 c13147p52 = (C13147p5) c13282xc.m61735x6().m60649kk(c13147p5.m61380h4());
                    C13282xc c13282xcM61115k42 = m61115k4((AbstractC13018hl) c13147p52);
                    if (c13147p52 == null || !(c13282xcM61115k42 == c13282xcM61618x1 || arrayList.contains(c13282xcM61115k42))) {
                        string = c13147p5.m61380h4().toString();
                        str = "<group>";
                        abstractC13018hl = c13147p5;
                        m61173k4("Cannot find a {0} with name '{1}' to redefine.", str, string, abstractC13018hl);
                    } else {
                        c13147p5.m61386k4(c13147p52);
                        c13282xc.m61735x6().m60652x1(c13147p5.m61380h4(), c13147p5);
                        m61129k4(c13147p5);
                    }
                }
            } else if (C7019kk.m27469x1(c12908beM60641h4.get_Item(i), C13149p8.class)) {
                C13149p8 c13149p8 = (C13149p8) c12908beM60641h4.get_Item(i);
                m61151x1(c13149p8);
                c13149p8.m61401m9().m65286k4(strM61697du);
                if (c12995g6.m60643m9().m60649kk(c13149p8.m61401m9()) != null) {
                    str2 = "Double redefine for attribute group.";
                    abstractC13018hl2 = c13149p8;
                    m61169k4(str2, abstractC13018hl2);
                } else {
                    m61168k4(c12995g6.m60643m9(), c13149p8.m61401m9(), c13149p8);
                    C13149p8 c13149p82 = (C13149p8) c13282xc.m61727up().m60649kk(c13149p8.m61401m9());
                    C13282xc c13282xcM61115k43 = m61115k4((AbstractC13018hl) c13149p82);
                    if (c13149p82 == null || !(c13282xcM61115k43 == c13282xcM61618x1 || arrayList.contains(c13282xcM61115k43))) {
                        string = c13149p8.m61401m9().toString();
                        str = "<attributeGroup>";
                        abstractC13018hl = c13149p8;
                        m61173k4("Cannot find a {0} with name '{1}' to redefine.", str, string, abstractC13018hl);
                    } else {
                        c13149p8.m61399k4(c13149p82);
                        c13282xc.m61727up().m60652x1(c13149p8.m61401m9(), c13149p8);
                        m61130k4(c13149p8);
                    }
                }
            } else if (C7019kk.m27469x1(c12908beM60641h4.get_Item(i), C12969en.class)) {
                C12969en c12969en = (C12969en) c12908beM60641h4.get_Item(i);
                m61124k4(c12969en, false);
                c12969en.m60210bv().m65286k4(strM61697du);
                if (c12995g6.m60640dy().m60649kk(c12969en.m60210bv()) != null) {
                    str2 = "Double redefine for complex type.";
                    abstractC13018hl2 = c12969en;
                } else {
                    m61168k4(c12995g6.m60640dy(), c12969en.m60210bv(), c12969en);
                    C12943dd c12943dd = (C12943dd) c13282xc.m61737yj().m60649kk(c12969en.m60210bv());
                    C13282xc c13282xcM61115k44 = m61115k4(c12943dd);
                    if (c12943dd == null || !(c13282xcM61115k44 == c13282xcM61618x1 || arrayList.contains(c13282xcM61115k44))) {
                        string = c12969en.m60210bv().toString();
                        str = "<complexType>";
                        abstractC13018hl = c12969en;
                        m61173k4("Cannot find a {0} with name '{1}' to redefine.", str, string, abstractC13018hl);
                    } else if (C7019kk.m27469x1(c12943dd, C12969en.class)) {
                        c12969en.m60227x1(c12943dd);
                        c13282xc.m61737yj().m60652x1(c12969en.m60210bv(), c12969en);
                        m61123k4(c12969en);
                    } else {
                        str2 = "Cannot redefine a simple type as complex type.";
                        abstractC13018hl2 = c12969en;
                    }
                }
                m61169k4(str2, abstractC13018hl2);
            } else if (C7019kk.m27469x1(c12908beM60641h4.get_Item(i), C13164q9.class)) {
                C13164q9 c13164q9 = (C13164q9) c12908beM60641h4.get_Item(i);
                m61132k4(c13164q9, false);
                c13164q9.m60210bv().m65286k4(strM61697du);
                if (c12995g6.m60640dy().m60649kk(c13164q9.m60210bv()) != null) {
                    str2 = "Double redefine for simple type.";
                    abstractC13018hl2 = c13164q9;
                } else {
                    m61168k4(c12995g6.m60640dy(), c13164q9.m60210bv(), c13164q9);
                    C12943dd c12943dd2 = (C12943dd) c13282xc.m61737yj().m60649kk(c13164q9.m60210bv());
                    C13282xc c13282xcM61115k45 = m61115k4(c12943dd2);
                    if (c12943dd2 == null || !(c13282xcM61115k45 == c13282xcM61618x1 || arrayList.contains(c13282xcM61115k45))) {
                        string = c13164q9.m60210bv().toString();
                        str = "<simpleType>";
                        abstractC13018hl = c13164q9;
                        m61173k4("Cannot find a {0} with name '{1}' to redefine.", str, string, abstractC13018hl);
                    } else if (C7019kk.m27469x1(c12943dd2, C13164q9.class)) {
                        c13164q9.m60227x1(c12943dd2);
                        c13282xc.m61737yj().m60652x1(c13164q9.m60210bv(), c13164q9);
                        m61131k4(c13164q9);
                    } else {
                        str2 = "Cannot redefine a complex type as simple type.";
                        abstractC13018hl2 = c13164q9;
                    }
                }
                m61169k4(str2, abstractC13018hl2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61123k4(C12969en c12969en) {
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
    private void m61124k4(C12969en c12969en, boolean z) {
        int iM60406c5;
        int iM60224um;
        C12908be c12908beM60098h4;
        C13106mq c13106mqM60104m9;
        AbstractC13018hl abstractC13018hl;
        AbstractC13018hl abstractC13018hl2;
        AbstractC13018hl abstractC13018hl3;
        if (!z) {
            if (c12969en.m60208ar() != null) {
                m61140kk(c12969en);
                c12969en.m60228x1(new C13890ei(c12969en.m60208ar(), this.f44096kk));
            } else {
                m61171k4("The required attribute '{0}' is missing.", "name", c12969en);
            }
            if (c12969en.m60406c5() == 255) {
                c12969en.m60428x1(255);
            } else {
                if (c12969en.m60406c5() == 256) {
                    iM60406c5 = this.f44090dy;
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
                    iM60224um = this.f44087c5;
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
            m61125k4(c12969en.m60407ck(), c12969en);
            m61145to(c12969en.m60407ck());
            if (c12969en.m60409fa() == null) {
                c12969en.m60424up();
            }
            if (C7019kk.m27469x1(c12969en.m60407ck(), C13268wr.class)) {
                C13268wr c13268wr = (C13268wr) c12969en.m60407ck();
                if (c13268wr.m61663k4() != null) {
                    m61125k4(c13268wr.m61663k4(), c13268wr);
                    m61145to(c13268wr.m61663k4());
                    if (C7019kk.m27469x1(c13268wr.m61663k4(), C13025i2.class)) {
                        C13025i2 c13025i2 = (C13025i2) c13268wr.m61663k4();
                        if (c13025i2.m60741k4().m65287kk()) {
                            m61171k4("The '{0}' attribute is either invalid or missing.", "base", c13025i2);
                        } else {
                            m61126k4(c13025i2, "base", c13025i2.m60741k4());
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
                            m61126k4(c13039iv, "base", c13039iv.m60752k4());
                        }
                        if (c13039iv.m60758x1() != null) {
                            m61125k4(c13039iv.m60758x1(), c13039iv);
                            m61132k4(c13039iv.m60758x1(), true);
                        }
                        m61120k4(c13039iv.m60757m9(), c13039iv.m60750dy(), c13039iv);
                        m61147x1(c13039iv);
                        abstractC13018hl3 = c13268wr;
                    }
                } else if (C13890ei.m65278k4(c12969en.m60210bv(), C13890ei.f46456k4)) {
                    m61169k4("'restriction' or 'extension' child is required for complexType with simpleContent or complexContent child.", c12969en);
                    abstractC13018hl3 = c13268wr;
                } else {
                    m61173k4("'restriction' or 'extension' child is required for complexType '{0}' in namespace '{1}', because it has a simpleContent or complexContent child.", c12969en.m60210bv().m65289x1(), c12969en.m60210bv().m65284k4(), c12969en);
                    abstractC13018hl3 = c13268wr;
                }
                m61147x1(abstractC13018hl3);
            } else {
                C12935cx c12935cx = (C12935cx) c12969en.m60407ck();
                if (c12935cx.m60148x1() != null) {
                    if (!c12935cx.m60144h4() && c12969en.mo60216jd()) {
                        c12935cx.m60146k4(true);
                    }
                    m61125k4(c12935cx.m60148x1(), c12935cx);
                    m61145to(c12935cx.m60148x1());
                    if (C7019kk.m27469x1(c12935cx.m60148x1(), C13258w2.class)) {
                        C13258w2 c13258w2 = (C13258w2) c12935cx.m60148x1();
                        if (c13258w2.m61645k4().m65287kk()) {
                            m61171k4("The '{0}' attribute is either invalid or missing.", "base", c13258w2);
                        } else {
                            m61126k4(c13258w2, "base", c13258w2.m61645k4());
                        }
                        if (c13258w2.m61651x1() != null) {
                            m61125k4(c13258w2.m61651x1(), c13258w2);
                            m61121k4(c13258w2.m61651x1());
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
                            m61126k4(c12913br, "base", c12913br.m60099k4());
                        }
                        if (c12913br.m60105x1() != null) {
                            m61125k4(c12913br.m60105x1(), c12913br);
                            m61121k4(c12913br.m60105x1());
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
            m61120k4(c12908beM60098h4, c13106mqM60104m9, abstractC13018hl2);
            m61147x1(abstractC13018hl2);
            abstractC13018hl3 = abstractC13018hl;
            m61147x1(abstractC13018hl3);
        } else {
            if (c12969en.m60409fa() != null) {
                m61125k4(c12969en.m60409fa(), c12969en);
                m61121k4(c12969en.m60409fa());
            }
            m61120k4(c12969en.m60424up(), c12969en.m60431yj(), c12969en);
        }
        m61147x1(c12969en);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61125k4(AbstractC13018hl abstractC13018hl, AbstractC13018hl abstractC13018hl2) {
        abstractC13018hl.m60684k4(abstractC13018hl2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61126k4(AbstractC13018hl abstractC13018hl, String str, C13890ei c13890ei) {
        try {
            c13890ei.m65288to();
            c13890ei.m65285k4(m61165k4());
            if (this.f44089du.m61730wl() && c13890ei.m65284k4().length() == 0) {
                c13890ei.m65286k4(this.f44089du.m61697du());
            }
            if (this.f44091fa.get_Item(c13890ei.m65284k4()) == null) {
                m61172k4("Namespace '{0}' is not available to be referenced in this Schema.", c13890ei.m65284k4(), abstractC13018hl, 1);
            }
        } catch (FormatException e) {
            m61175k4("Invalid '{0}' attribute: '{1}'.", new String[]{str, e.getMessage()}, e, abstractC13018hl);
        } catch (XmlException e2) {
            m61175k4("Invalid '{0}' attribute: '{1}'.", new String[]{str, e2.getMessage()}, e2, abstractC13018hl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61127k4(C13021hu c13021hu) {
        int iM60702dy;
        if (c13021hu.m60703fa() != null) {
            m61140kk((AbstractC13018hl) c13021hu);
            c13021hu.m60723to(new C13890ei(c13021hu.m60703fa(), this.f44096kk));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13021hu);
        }
        m61141kk(c13021hu);
        if (c13021hu.m60702dy() != 255) {
            if (c13021hu.m60702dy() == 256) {
                iM60702dy = this.f44087c5;
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
            m61126k4(c13021hu, C18437z2.f56754h, c13021hu.m60705ix());
        }
        m61147x1((AbstractC13018hl) c13021hu);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61128k4(C13146p4 c13146p4) {
        if (c13146p4.m61370m9() != null) {
            m61140kk((AbstractC13018hl) c13146p4);
            c13146p4.m61367kk(new C13890ei(c13146p4.m61370m9(), this.f44096kk));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13146p4);
        }
        if (c13146p4.m61356ck() != 0) {
            m61171k4("The '{0}' attribute cannot be present.", AbstractJwtRequest.ClaimNames.USE, c13146p4);
        }
        if (c13146p4.m61360h4() != 0) {
            m61171k4("The '{0}' attribute cannot be present.", "form", c13146p4);
        }
        m61142kk(c13146p4);
        m61147x1((AbstractC13018hl) c13146p4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61129k4(C13147p5 c13147p5) {
        int iM61114k4 = c13147p5.m61389x1() != null ? m61114k4(c13147p5.m61389x1().mo61012k4(), c13147p5.m61380h4(), c13147p5.m61379dy()) : 0;
        if (iM61114k4 > 1) {
            m61169k4("Multiple self-reference within a group is redefined.", c13147p5);
        }
        c13147p5.m61383k4(iM61114k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61130k4(C13149p8 c13149p8) {
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
        c13149p8.m61397k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61131k4(C13164q9 c13164q9) {
        if (c13164q9.m61416k4() != null && C7019kk.m27469x1(c13164q9.m61416k4(), C13261w8.class) && C13890ei.m65278k4(((C13261w8) c13164q9.m61416k4()).m61653k4(), c13164q9.m60210bv())) {
            return;
        }
        m61169k4("If type is being redefined, the base type has to be self-referenced.", c13164q9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.aspose.slides.internal.yu.ly, com.aspose.slides.internal.yu.m9] */
    /* JADX WARN: Type inference failed for: r9v19, types: [com.aspose.slides.internal.yu.fe, com.aspose.slides.internal.yu.hl] */
    /* JADX WARN: Type inference failed for: r9v22, types: [com.aspose.slides.internal.yu.hl] */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.aspose.slides.internal.yu.hl] */
    /* JADX WARN: Type inference failed for: r9v24, types: [com.aspose.slides.internal.yu.hl] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61132k4(C13164q9 c13164q9, boolean z) {
        int iM60224um;
        ?? r9;
        String str;
        C13890ei c13890eiM61658k4;
        String str2;
        C13164q9 c13164q9M61661x1;
        if (!z) {
            if (c13164q9.m60208ar() != null) {
                m61140kk(c13164q9);
                c13164q9.m60228x1(new C13890ei(c13164q9.m60208ar(), this.f44096kk));
            } else {
                m61171k4("The required attribute '{0}' is missing.", "name", c13164q9);
            }
            if (c13164q9.m60224um() != 255) {
                if (c13164q9.m60224um() == 256) {
                    iM60224um = this.f44087c5;
                    if (iM60224um == 255) {
                        c13164q9.m60213du(255);
                    }
                } else {
                    if ((c13164q9.m60224um() & (-31)) != 0) {
                        m61169k4("The values 'substitution' and 'extension' are invalid for the final attribute on simpleType.", c13164q9);
                    }
                    iM60224um = c13164q9.m60224um();
                }
                c13164q9.m60213du(iM60224um & 30);
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
                m61125k4(c13261w8, c13164q9);
                while (i < c13261w8.m61652h4().size()) {
                    m61125k4(c13261w8.m61652h4().get_Item(i), c13261w8);
                    i++;
                }
                if (c13261w8.m61656x1() != null) {
                    if (!c13261w8.m61653k4().m65287kk()) {
                        m61169k4("SimpleType restriction should have either the base attribute or a simpleType child, but not both.", c13261w8);
                    }
                    c13164q9M61661x1 = c13261w8.m61656x1();
                    r9 = c13261w8;
                    m61132k4(c13164q9M61661x1, true);
                } else if (c13261w8.m61653k4().m65287kk()) {
                    str2 = "SimpleType restriction should have either the base attribute or a simpleType child to indicate the base type for the derivation.";
                    r9 = c13261w8;
                    m61169k4(str2, r9);
                } else {
                    str = "base";
                    c13890eiM61658k4 = c13261w8.m61653k4();
                    r9 = c13261w8;
                    m61126k4(r9, str, c13890eiM61658k4);
                }
            } else if (C7019kk.m27469x1(c13164q9.m61416k4(), C13263wh.class)) {
                C13263wh c13263wh = (C13263wh) c13164q9.m61416k4();
                m61125k4(c13263wh, c13164q9);
                if (c13263wh.m61661x1() != null) {
                    if (!c13263wh.m61658k4().m65287kk()) {
                        m61169k4("SimpleType list should have either the itemType attribute or a simpleType child, but not both.", c13263wh);
                    }
                    m61125k4(c13263wh.m61661x1(), c13263wh);
                    c13164q9M61661x1 = c13263wh.m61661x1();
                    r9 = c13263wh;
                    m61132k4(c13164q9M61661x1, true);
                } else if (c13263wh.m61658k4().m65287kk()) {
                    str2 = "SimpleType list should have either the itemType attribute or a simpleType child to indicate the itemType of the list.";
                    r9 = c13263wh;
                    m61169k4(str2, r9);
                } else {
                    str = "itemType";
                    c13890eiM61658k4 = c13263wh.m61658k4();
                    r9 = c13263wh;
                    m61126k4(r9, str, c13890eiM61658k4);
                }
            } else {
                r9 = (C12984fe) c13164q9.m61416k4();
                m61125k4(r9, c13164q9);
                int size = r9.m60619k4().size();
                if (r9.m60622x1() != null) {
                    size += r9.m60622x1().length;
                    for (C13890ei c13890ei : r9.m60622x1()) {
                        m61126k4(r9, "memberTypes", c13890ei);
                    }
                }
                if (size == 0) {
                    m61169k4("Either the memberTypes attribute must be non-empty or there must be at least one simpleType child.", r9);
                }
                while (i < r9.m60619k4().size()) {
                    C13164q9 c13164q92 = (C13164q9) r9.m60619k4().get_Item(i);
                    m61125k4(c13164q92, r9);
                    m61132k4(c13164q92, true);
                    i++;
                }
            }
            m61145to(r9);
            m61147x1(r9);
        }
        m61147x1(c13164q9);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61133k4(AbstractC13218th abstractC13218th) {
        C12995g6 c12995g6 = (C12995g6) C7019kk.m27452k4((Object) abstractC13218th, C12995g6.class);
        c12995g6.m60643m9().m60645k4();
        c12995g6.m60639c5().m60645k4();
        c12995g6.m60640dy().m60645k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m61134k4(C13237ul c13237ul) {
        if (c13237ul.m61630k4() != null) {
            m61140kk(c13237ul);
            c13237ul.m61631k4(new C13890ei(c13237ul.m61630k4(), this.f44096kk));
        } else {
            m61171k4("The required attribute '{0}' is missing.", "name", c13237ul);
        }
        if (c13237ul.m61634x1() == null && c13237ul.m61629h4() == null) {
            m61169k4("NOTATION must have either the Public or System attribute present.", c13237ul);
        } else {
            if (c13237ul.m61634x1() != null) {
                try {
                    C13850af.m65070du(c13237ul.m61634x1());
                } catch (XmlException e) {
                    m61175k4("Public attribute '{0}' is an invalid URI.", new String[]{c13237ul.m61634x1()}, e, c13237ul);
                }
            }
            if (c13237ul.m61629h4() != null) {
                m61153x1(c13237ul.m61629h4(), "System attribute '{0}' is an invalid URI.", c13237ul);
            }
        }
        m61145to(c13237ul);
        m61147x1(c13237ul);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61135k4(C13282xc c13282xc) {
        if (c13282xc == m61144m9()) {
            return;
        }
        c13282xc.m61701fa().m60645k4();
        c13282xc.m61727up().m60645k4();
        c13282xc.m61737yj().m60645k4();
        c13282xc.m61717ks().m60645k4();
        c13282xc.m61735x6().m60645k4();
        c13282xc.m61719ne().m60645k4();
        c13282xc.m61720qq().clear();
        c13282xc.m61703ix().m60645k4();
        c13282xc.m61716kk(false);
        c13282xc.m61711k4(false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61136k4(C13282xc c13282xc, ArrayList arrayList) {
        if (arrayList.contains(c13282xc)) {
            return;
        }
        arrayList.addItem(c13282xc);
        for (int i = 0; i < c13282xc.m61718m9().size(); i++) {
            AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
            if ((abstractC13218th.m61610du() == 1 || abstractC13218th.m61610du() == 3) && abstractC13218th.m61618x1() != null) {
                m61136k4(abstractC13218th.m61618x1(), arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61137k4(C13282xc c13282xc, C13282xc c13282xc2) {
        Iterator it = c13282xc.m61717ks().m60648kk().iterator();
        while (it.hasNext()) {
            try {
                C13021hu c13021hu = (C13021hu) it.next();
                m61168k4(c13282xc2.m61717ks(), c13021hu.m60721qq(), c13021hu);
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
                m61168k4(c13282xc2.m61701fa(), c13146p4.m61359fa(), c13146p4);
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
                m61168k4(c13282xc2.m61735x6(), c13147p5.m61380h4(), c13147p5);
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
                m61168k4(c13282xc2.m61727up(), c13149p8.m61401m9(), c13149p8);
            } finally {
                if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it4, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it4).dispose();
        }
        Iterator it5 = c13282xc.m61737yj().m60648kk().iterator();
        while (it5.hasNext()) {
            try {
                C12943dd c12943dd = (C12943dd) it5.next();
                m61168k4(c13282xc2.m61737yj(), c12943dd.m60210bv(), c12943dd);
            } finally {
                if (C7019kk.m27456k4(it5, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it5).dispose();
                }
            }
        }
        if (C7019kk.m27456k4(it5, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it5).dispose();
        }
        it5 = c13282xc.m61719ne().m60648kk().iterator();
        while (it5.hasNext()) {
            try {
                C13237ul c13237ul = (C13237ul) it5.next();
                m61168k4(c13282xc2.m61719ne(), c13237ul.m61633m9(), c13237ul);
            } finally {
                if (C7019kk.m27456k4(it5, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it5).dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61138k4(C13282xc c13282xc, String str, ArrayList arrayList) {
        int i;
        C13005gv c13005gvM61719ne;
        C13890ei c13890eiM61633m9;
        C12969en c12969en;
        AbstractC13018hl abstractC13018hl;
        if (c13282xc.m60679e0()) {
            return;
        }
        c13282xc.m60681h4(true);
        String strM61697du = c13282xc.m61697du();
        if (strM61697du != null) {
            String strMo65266k4 = m61165k4().mo65266k4(strM61697du);
            c13282xc.m61710k4(strMo65266k4);
            if (strMo65266k4.length() == 0) {
                m61169k4("The targetNamespace attribute cannot have empty string as its value.", (AbstractC13018hl) c13282xc);
            } else {
                m61153x1(strMo65266k4, "The Namespace '{0}' is an invalid URI.", c13282xc);
            }
        }
        if (c13282xc.m61702h4() != null) {
            AbstractC12892ae abstractC12892aeM60211bz = AbstractC13279x6.m61676kk(32).m60211bz();
            Object[] objArr = {null};
            RuntimeException runtimeExceptionMo60028k4 = abstractC12892aeM60211bz.mo60028k4(c13282xc.m61702h4(), (AbstractC13883dt) null, (InterfaceC13980t6) null, objArr);
            Object obj = objArr[0];
            if (runtimeExceptionMo60028k4 != null) {
                m61175k4("The '{0}' attribute is invalid - The value '{1}' is invalid according to its datatype '{2}' - {3}", new String[]{"version", c13282xc.m61702h4(), abstractC12892aeM60211bz.m60015ar(), runtimeExceptionMo60028k4.getMessage()}, runtimeExceptionMo60028k4, c13282xc);
            } else {
                c13282xc.m61733x1((String) obj);
            }
        }
        m61135k4(c13282xc);
        for (int i2 = 0; i2 < c13282xc.m61718m9().size(); i2++) {
            AbstractC13218th abstractC13218th = (AbstractC13218th) c13282xc.m61718m9().get_Item(i2);
            C13282xc c13282xcM61618x1 = abstractC13218th.m61618x1();
            m61125k4(abstractC13218th, c13282xc);
            m61145to(abstractC13218th);
            String strM61611k4 = abstractC13218th.m61611k4();
            if (strM61611k4 != null) {
                m61153x1(strM61611k4, "The SchemaLocation '{0}' is an invalid URI.", abstractC13218th);
            } else if ((abstractC13218th.m61610du() == 1 || abstractC13218th.m61610du() == 3) && c13282xcM61618x1 == null) {
                m61171k4("The required attribute '{0}' is missing.", "schemaLocation", abstractC13218th);
            }
            int iM61610du = abstractC13218th.m61610du();
            if (iM61610du != 1) {
                if (iM61610du == 2) {
                    C13221tp c13221tp = (C13221tp) C7019kk.m27452k4((Object) abstractC13218th, C13221tp.class);
                    String strM61621h4 = c13221tp.m61621h4();
                    if (C14113y2.m67363du(strM61621h4, c13282xc.m61697du())) {
                        m61169k4("Namespace attribute of an import must not match the real value of the enclosing targetNamespace of the <Schema>.", abstractC13218th);
                    }
                    if (c13282xcM61618x1 != null) {
                        if (!C14113y2.m67363du(strM61621h4, c13282xcM61618x1.m61697du())) {
                            m61173k4("The namespace attribute '{0}' of an import should be the same value as the targetNamespace '{1}' of the imported Schema.", strM61621h4, c13282xcM61618x1.m61697du(), c13221tp);
                        }
                        C13282xc c13282xc2 = this.f44099rv;
                        this.f44099rv = c13282xcM61618x1;
                        m61138k4(c13282xcM61618x1, strM61621h4, arrayList);
                        this.f44099rv = c13282xc2;
                    } else if (strM61621h4 != null) {
                        if (strM61621h4.length() == 0) {
                            m61171k4("The namespace attribute cannot have empty string as its value.", strM61621h4, abstractC13218th);
                        } else {
                            m61153x1(strM61621h4, "The Namespace '{0}' is an invalid URI.", abstractC13218th);
                        }
                    }
                } else if (iM61610du != 3) {
                    if (c13282xcM61618x1.m61697du() != null) {
                        if (!C14113y2.m67363du(c13282xc.m61697du(), c13282xcM61618x1.m61697du())) {
                            m61173k4("The targetNamespace '{0}' of included/redefined Schema should be the same as the targetNamespace '{1}' of the including Schema.", c13282xcM61618x1.m61697du(), c13282xc.m61697du(), abstractC13218th);
                        }
                    } else if (str != null && str.length() != 0) {
                        c13282xcM61618x1 = m61116k4(str, c13282xcM61618x1);
                        abstractC13218th.m61613k4(c13282xcM61618x1);
                    }
                    m61138k4(c13282xcM61618x1, c13282xc.m61697du(), arrayList);
                } else if (c13282xcM61618x1 != null) {
                    m61133k4(abstractC13218th);
                    if (c13282xcM61618x1.m61697du() != null) {
                        if (!C14113y2.m67363du(c13282xc.m61697du(), c13282xcM61618x1.m61697du())) {
                        }
                    } else if (str != null && str.length() != 0) {
                    }
                    m61138k4(c13282xcM61618x1, c13282xc.m61697du(), arrayList);
                }
            } else if (abstractC13218th.m61618x1() != null) {
                if (c13282xcM61618x1.m61697du() != null) {
                    if (!C14113y2.m67363du(c13282xc.m61697du(), c13282xcM61618x1.m61697du())) {
                    }
                } else if (str != null && str.length() != 0) {
                }
                m61138k4(c13282xcM61618x1, c13282xc.m61697du(), arrayList);
            }
        }
        this.f44089du = c13282xc;
        m61146to(c13282xc);
        m61147x1((AbstractC13018hl) c13282xc);
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        this.f44096kk = str;
        m61113du(c13282xc);
        this.f44101up.clear();
        for (0; i < c13282xc.m61718m9().size(); i + 1) {
            AbstractC13218th abstractC13218th2 = (AbstractC13218th) c13282xc.m61718m9().get_Item(i);
            C13282xc c13282xcM61618x12 = abstractC13218th2.m61618x1();
            if (c13282xcM61618x12 != null) {
                int iM61610du2 = abstractC13218th2.m61610du();
                if (iM61610du2 == 1) {
                    i = this.f44101up.get_Item(c13282xcM61618x12) != null ? i + 1 : 0;
                    this.f44101up.addItem(c13282xcM61618x12, abstractC13218th2);
                    m61137k4(c13282xcM61618x12, c13282xc);
                } else if (iM61610du2 != 2) {
                    if (iM61610du2 == 3) {
                        if (this.f44103x6 == null) {
                            this.f44103x6 = new ArrayList();
                        }
                        this.f44103x6.addItem(new C12961e8((C12995g6) C7019kk.m27452k4((Object) abstractC13218th2, C12995g6.class), this.f44099rv));
                        if (this.f44101up.get_Item(c13282xcM61618x12) != null) {
                        }
                        this.f44101up.addItem(c13282xcM61618x12, abstractC13218th2);
                        m61137k4(c13282xcM61618x12, c13282xc);
                    }
                } else if (c13282xcM61618x12 != this.f44100to) {
                    C13221tp c13221tp2 = (C13221tp) C7019kk.m27452k4((Object) abstractC13218th2, C13221tp.class);
                    String strM61621h42 = c13221tp2.m61621h4() != null ? c13221tp2.m61621h4() : C14113y2.f47374k4;
                    if (!arrayList.contains(c13282xcM61618x12)) {
                        arrayList.addItem(c13282xcM61618x12);
                    }
                    if (!this.f44100to.m61693b3().contains(strM61621h42)) {
                        this.f44100to.m61693b3().addItem(strM61621h42);
                    }
                }
            } else if (abstractC13218th2.m61610du() == 3) {
                C12995g6 c12995g6 = (C12995g6) C7019kk.m27452k4((Object) abstractC13218th2, C12995g6.class);
                if (c12995g6.m61617to() == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= c12995g6.m60641h4().size()) {
                            break;
                        }
                        if (!C7019kk.m27469x1(c12995g6.m60641h4().get_Item(i3), C13289xq.class)) {
                            m61169k4("'SchemaLocation' must successfully resolve if <redefine> contains any child other than <annotation>.", c12995g6);
                            break;
                        }
                        i3++;
                    }
                }
            }
            m61147x1(abstractC13218th2);
        }
        List list = new List();
        C12908be c12908beM61700dy = c13282xc.m61700dy();
        for (int i4 = 0; i4 < c12908beM61700dy.size(); i4++) {
            m61125k4(c12908beM61700dy.get_Item(i4), c13282xc);
            C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12908beM61700dy.get_Item(i4), C13146p4.class);
            if (c13146p4 != null) {
                m61128k4(c13146p4);
                c13005gvM61719ne = c13282xc.m61701fa();
                c13890eiM61633m9 = c13146p4.m61359fa();
                abstractC13018hl = c13146p4;
            } else if (C7019kk.m27469x1(c12908beM61700dy.get_Item(i4), C13149p8.class)) {
                C13149p8 c13149p8 = (C13149p8) c12908beM61700dy.get_Item(i4);
                m61151x1(c13149p8);
                c13005gvM61719ne = c13282xc.m61727up();
                c13890eiM61633m9 = c13149p8.m61401m9();
                abstractC13018hl = c13149p8;
            } else {
                if (C7019kk.m27469x1(c12908beM61700dy.get_Item(i4), C12969en.class)) {
                    C12969en c12969en2 = (C12969en) c12908beM61700dy.get_Item(i4);
                    m61124k4(c12969en2, false);
                    c12969en = c12969en2;
                } else if (C7019kk.m27469x1(c12908beM61700dy.get_Item(i4), C13164q9.class)) {
                    C13164q9 c13164q9 = (C13164q9) c12908beM61700dy.get_Item(i4);
                    m61132k4(c13164q9, false);
                    c12969en = c13164q9;
                } else if (C7019kk.m27469x1(c12908beM61700dy.get_Item(i4), C13021hu.class)) {
                    C13021hu c13021hu = (C13021hu) c12908beM61700dy.get_Item(i4);
                    m61127k4(c13021hu);
                    c13005gvM61719ne = c13282xc.m61717ks();
                    c13890eiM61633m9 = c13021hu.m60721qq();
                    abstractC13018hl = c13021hu;
                } else if (C7019kk.m27469x1(c12908beM61700dy.get_Item(i4), C13147p5.class)) {
                    C13147p5 c13147p5 = (C13147p5) c12908beM61700dy.get_Item(i4);
                    m61150x1(c13147p5);
                    c13005gvM61719ne = c13282xc.m61735x6();
                    c13890eiM61633m9 = c13147p5.m61380h4();
                    abstractC13018hl = c13147p5;
                } else if (C7019kk.m27469x1(c12908beM61700dy.get_Item(i4), C13237ul.class)) {
                    C13237ul c13237ul = (C13237ul) c12908beM61700dy.get_Item(i4);
                    m61134k4(c13237ul);
                    c13005gvM61719ne = c13282xc.m61719ne();
                    c13890eiM61633m9 = c13237ul.m61633m9();
                    abstractC13018hl = c13237ul;
                } else {
                    if (C7019kk.m27469x1(c12908beM61700dy.get_Item(i4), C13289xq.class)) {
                        m61139k4((C13289xq) C7019kk.m27452k4((Object) c12908beM61700dy.get_Item(i4), C13289xq.class));
                    } else {
                        m61169k4("The Schema items collection cannot contain an object of type 'XmlSchemaInclude', 'XmlSchemaImport', or 'XmlSchemaRedefine'.", c12908beM61700dy.get_Item(i4));
                        list.addItem(c12908beM61700dy.get_Item(i4));
                    }
                }
                c13005gvM61719ne = c13282xc.m61737yj();
                c13890eiM61633m9 = c12969en.m60210bv();
                abstractC13018hl = c12969en;
            }
            m61168k4(c13005gvM61719ne, c13890eiM61633m9, abstractC13018hl);
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            c13282xc.m61700dy().m60097x1((AbstractC13018hl) list.get_Item(i5));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61139k4(C13289xq c13289xq) {
        m61147x1(c13289xq);
        for (int i = 0; i < c13289xq.m61759x1().size(); i++) {
            c13289xq.m61759x1().get_Item(i).m60684k4((AbstractC13018hl) c13289xq);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61156k4(C13906gx c13906gx) {
        this.f44097ks = c13906gx;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61157k4(AbstractC13943n5 abstractC13943n5) {
        this.f44093ix = abstractC13943n5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61158k4(C13282xc c13282xc, String str, boolean z) {
        int i;
        int i2;
        this.f44100to = c13282xc;
        this.f44095k4 = m61165k4().mo65266k4("xmlns");
        this.f44102x1 = m61165k4().mo65266k4("http://www.w3.org/2001/XMLSchema-instance");
        this.f44100to.m61736yd().clear();
        this.f44100to.m61693b3().clear();
        if (this.f44100to.m61725u4() != null && this.f44094jd.get_Item(this.f44100to.m61725u4()) == null) {
            this.f44094jd.addItem(this.f44100to.m61725u4(), this.f44100to);
        }
        if (this.f44100to.m61697du() != null) {
            C13282xc c13282xc2 = this.f44100to;
            if (str == null) {
                str = c13282xc2.m61697du();
            } else if (!C14113y2.m67363du(str, c13282xc2.m61697du())) {
                m61173k4("The targetNamespace parameter '{0}' should be the same value as the targetNamespace '{1}' of the Schema.", str, this.f44100to.m61697du(), this.f44100to);
            }
        } else if (str != null && str.length() != 0) {
            this.f44100to = m61116k4(str, this.f44100to);
        }
        if (z && this.f44093ix != null) {
            m61143kk(this.f44100to);
        }
        m61152x1(this.f44100to);
        int i3 = 0;
        while (i3 < this.f44104yj.size()) {
            try {
                C13282xc c13282xc3 = (C13282xc) this.f44104yj.getByIndex(i3);
                C5465to.m22552k4(c13282xc3);
                c13282xc3.m60681h4(false);
                i3++;
            } catch (Throwable th) {
                if (i3 != this.f44104yj.size()) {
                    i = i3 - 1;
                    while (i >= 0) {
                        C13282xc c13282xc4 = (C13282xc) this.f44104yj.getByIndex(i);
                        c13282xc4.m60681h4(false);
                        if (c13282xc4 != m61144m9()) {
                            c13282xc4.m61711k4(false);
                            c13282xc4.m61734x1(!m61164du());
                        }
                        C5465to.m22553x1(c13282xc4);
                    }
                    throw th;
                }
                i--;
            }
        }
        C13282xc c13282xc5 = this.f44100to;
        this.f44099rv = c13282xc5;
        m61138k4(c13282xc5, str, c13282xc5.m61736yd());
        if (this.f44103x6 != null) {
            for (int i4 = 0; i4 < this.f44103x6.size(); i4++) {
                m61122k4((C12961e8) this.f44103x6.get_Item(i4));
            }
        }
        if (i3 != this.f44104yj.size()) {
            i2 = i3 - 1;
            while (i2 >= 0) {
                C13282xc c13282xc6 = (C13282xc) this.f44104yj.getByIndex(i2);
                c13282xc6.m60681h4(false);
                if (c13282xc6 != m61144m9()) {
                    c13282xc6.m61711k4(false);
                    c13282xc6.m61734x1(!m61164du());
                }
                C5465to.m22553x1(c13282xc6);
            }
            this.f44100to.m61734x1(!m61164du());
            return !m61164du();
        }
        i2--;
    }
}

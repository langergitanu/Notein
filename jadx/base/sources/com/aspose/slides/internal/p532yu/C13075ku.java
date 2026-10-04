package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13849aa;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13858b3;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13972s7;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ku */
/* JADX INFO: loaded from: classes5.dex */
public final class C13075ku extends C12957dy {

    /* JADX INFO: renamed from: ix */
    private static final AbstractC12892ae f44056ix;

    /* JADX INFO: renamed from: ne */
    private static final AbstractC12892ae f44057ne;

    /* JADX INFO: renamed from: u4 */
    private static final AbstractC12892ae f44058u4;

    /* JADX INFO: renamed from: ar */
    private String f44059ar;

    /* JADX INFO: renamed from: bv */
    private String f44060bv;

    /* JADX INFO: renamed from: c5 */
    private int f44061c5;

    /* JADX INFO: renamed from: ck */
    private Hashtable f44062ck;

    /* JADX INFO: renamed from: fa */
    private C13950o3 f44063fa;

    /* JADX INFO: renamed from: jd */
    private C13858b3 f44064jd;

    /* JADX INFO: renamed from: ks */
    private C13256vw f44065ks;

    /* JADX INFO: renamed from: lr */
    private String f44066lr;

    /* JADX INFO: renamed from: qq */
    private String f44067qq;

    /* JADX INFO: renamed from: rv */
    private C12915bu f44068rv;

    /* JADX INFO: renamed from: um */
    private String f44069um;

    /* JADX INFO: renamed from: up */
    private boolean f44070up;

    /* JADX INFO: renamed from: uz */
    private String f44071uz;

    /* JADX INFO: renamed from: v4 */
    private String f44072v4;

    /* JADX INFO: renamed from: wl */
    private String f44073wl;

    /* JADX INFO: renamed from: x6 */
    private int f44074x6;

    /* JADX INFO: renamed from: yj */
    private Hashtable f44075yj;

    static {
        AbstractC12892ae abstractC12892aeM60009h4 = AbstractC12892ae.m60009h4(0);
        f44057ne = abstractC12892aeM60009h4;
        f44056ix = AbstractC12892ae.m60012m9(10);
        f44058u4 = abstractC12892aeM60009h4.mo60024k4((C12943dd) null);
    }

    public C13075ku(C12957dy c12957dy) {
        super(c12957dy);
        this.f44061c5 = -1;
        this.f44070up = false;
        this.f44068rv = null;
        m61079ks();
    }

    /* JADX INFO: renamed from: ar */
    private void m61066ar() {
        if (this.f44064jd.m65182to() > 1) {
            this.f44064jd.m65183x1();
            if (this.f44061c5 == this.f44064jd.m65182to()) {
                this.f44061c5 = -1;
            }
            C13190rs c13190rs = (C13190rs) this.f44064jd.m65181kk();
            this.f43552to = c13190rs;
            this.f44074x6 = c13190rs.f44258h4;
        }
    }

    /* JADX INFO: renamed from: b3 */
    private void m61067b3() {
        int i;
        Hashtable hashtable;
        C13073ks c13073ks;
        XmlSchemaException xmlSchemaException;
        int iM65182to = this.f44064jd.m65182to() - 1;
        while (true) {
            if (iM65182to < this.f44061c5) {
                break;
            }
            if (((C13190rs) this.f44064jd.m65178k4(iM65182to)).f44257fa != null) {
                C13073ks[] c13073ksArr = ((C13190rs) this.f44064jd.m65178k4(iM65182to)).f44257fa;
                for (int i2 = 0; i2 < c13073ksArr.length; i2++) {
                    for (int i3 = 0; i3 < c13073ksArr[i2].f44053kk.size(); i3++) {
                        C13207sq c13207sq = (C13207sq) c13073ksArr[i2].f44053kk.get_Item(i3);
                        if (c13207sq.f44376k4) {
                            C6005k4.m24264to("Element Field Filling Value!");
                            C6005k4.m24264to(C14113y2.m67407k4("Name: ", this.f43554x1.mo65023fa(), "\t|\tURI: ", this.f43554x1.mo65050up(), "\t|\tValue: ", this.f43554x1.m65022f9(), IOUtils.LINE_SEPARATOR_UNIX));
                            c13207sq.f44376k4 = false;
                            if (c13207sq.f44378x1.m61423k4(c13207sq.m61596kk()) != null) {
                                m60273k4("The field '{0}' is expecting at the most one value.", this.f43554x1.mo65023fa());
                            } else {
                                String string = !this.f43551m9 ? this.f43546h4 : this.f43543du.toString();
                                if (this.f43554x1.m65022f9() != null && string.length() != 0) {
                                    c13207sq.f44378x1.m61424k4(c13207sq.m61596kk(), new C13211sz(this.f43554x1.m65022f9(), string, this.f43552to.f44256dy.m61429b3()));
                                }
                            }
                        }
                        c13207sq.mo61022x1(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up());
                    }
                    if (c13073ksArr[i2].f44055x1.mo61022x1(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up())) {
                        C13172qk c13172qkM61766to = c13073ksArr[i2].f44055x1.m61766to();
                        int iM61636k4 = c13073ksArr[i2].f44052k4.m61636k4();
                        if (iM61636k4 != 0) {
                            if (iM61636k4 == 1) {
                                if (!c13172qkM61766to.m61425kk()) {
                                    xmlSchemaException = new XmlSchemaException("The identity constraint '{0}' validation has failed. Either a key is missing or the existing key has an empty node.", c13073ksArr[i2].f44052k4.f44419k4.toString(), this.f43554x1.mo65040ne(), c13172qkM61766to.m61422k4(), c13172qkM61766to.m61426x1());
                                } else if (c13073ksArr[i2].f44054to.contains(c13172qkM61766to)) {
                                    xmlSchemaException = new XmlSchemaException("There is a duplicate key sequence '{0}' for the '{1}' key or unique identity constraint.", new String[]{c13172qkM61766to.toString(), c13073ksArr[i2].f44052k4.f44419k4.toString()}, this.f43554x1.mo65040ne(), c13172qkM61766to.m61422k4(), c13172qkM61766to.m61426x1());
                                } else {
                                    c13073ks = c13073ksArr[i2];
                                }
                                m60268k4(xmlSchemaException);
                            } else if (iM61636k4 == 2 && c13073ksArr[i2].f44054to != null && c13172qkM61766to.m61425kk() && !c13073ksArr[i2].f44054to.contains(c13172qkM61766to)) {
                                c13073ks = c13073ksArr[i2];
                            }
                            c13073ks.f44054to.addItem(c13172qkM61766to, c13172qkM61766to);
                        } else if (c13172qkM61766to.m61425kk()) {
                            if (c13073ksArr[i2].f44054to.contains(c13172qkM61766to)) {
                                xmlSchemaException = new XmlSchemaException("There is a duplicate key sequence '{0}' for the '{1}' key or unique identity constraint.", new String[]{c13172qkM61766to.toString(), c13073ksArr[i2].f44052k4.f44419k4.toString()}, this.f43554x1.mo65040ne(), c13172qkM61766to.m61422k4(), c13172qkM61766to.m61426x1());
                                m60268k4(xmlSchemaException);
                            } else {
                                c13073ks = c13073ksArr[i2];
                                c13073ks.f44054to.addItem(c13172qkM61766to, c13172qkM61766to);
                            }
                        }
                    }
                }
            }
            iM65182to--;
        }
        C13858b3 c13858b3 = this.f44064jd;
        C13073ks[] c13073ksArr2 = ((C13190rs) c13858b3.m65178k4(c13858b3.m65182to() - 1)).f44257fa;
        if (c13073ksArr2 != null) {
            for (i = 0; i < c13073ksArr2.length; i++) {
                if (c13073ksArr2[i].f44052k4.m61636k4() != 2 && (hashtable = c13073ksArr2[i].f44050du) != null) {
                    Iterator it = hashtable.getKeys().iterator();
                    while (it.hasNext()) {
                        try {
                            C13172qk c13172qk = (C13172qk) it.next();
                            if (!c13073ksArr2[i].f44054to.contains(c13172qk)) {
                                m60268k4(new XmlSchemaException("The key sequence '{0}' in '{1}' Keyref fails to refer to some key.", new String[]{c13172qk.toString(), c13073ksArr2[i].f44052k4.f44419k4.toString()}, this.f43554x1.mo65040ne(), c13172qk.m61422k4(), c13172qk.m61426x1()));
                            }
                        } finally {
                            if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it).dispose();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: bv */
    private void m61068bv() {
        C13125nk c13125nk = this.f43552to.f44256dy;
        if (c13125nk != null) {
            if (c13125nk.m61275ne() != null) {
                m61080lr();
            }
            if (m61088v4()) {
                m61092yd();
            }
        }
    }

    /* JADX INFO: renamed from: ix */
    private Object m61069ix() {
        C13190rs c13190rs = this.f43552to;
        if (!c13190rs.f44261kk) {
            return null;
        }
        if (c13190rs.f44260k4) {
            m60273k4("Element '{0}' must have no character or element children.", this.f43549kk.toString());
            return null;
        }
        int[] iArr = {0};
        Object objMo60051k4 = c13190rs.f44256dy.m61276rv().mo60051k4(this.f43549kk, this.f43552to, iArr);
        int i = iArr[0];
        if (objMo60051k4 == null) {
            this.f43552to.f44258h4 = 1;
            this.f44074x6 = 1;
            if (i == -2) {
                m60273k4("Element '{0}' cannot appear more than once if content model type is \"all\".", this.f43549kk.toString());
            }
            C13890ei c13890ei = this.f43549kk;
            C13190rs c13190rs2 = this.f43552to;
            AbstractC13319z7 abstractC13319z7M60261ck = m60261ck();
            C13849aa c13849aa = this.f43554x1;
            C12962eb.m60316k4(c13890ei, c13190rs2, abstractC13319z7M60261ck, c13849aa, c13849aa.mo65040ne(), m60263dy().ah_(), m60263dy().ai_(), null);
        }
        return objMo60051k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C13125nk m61070k4(C13125nk c13125nk, C13890ei c13890ei, String str) {
        C13164q9 c13164q9M61670k4;
        String str2;
        if (c13125nk == null) {
            c13125nk = this.f43548k4.m61894x1(this.f43549kk);
        }
        if (c13125nk != null) {
            if (c13890ei.m65287kk()) {
                if (c13125nk.m61261jd()) {
                    C13190rs c13190rs = this.f43552to;
                    m60273k4("The element '{0}' is abstract or its type is abstract.", C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck));
                    c13125nk = null;
                }
                if (c13125nk == null && c13125nk.m61254ck()) {
                    if (str != null) {
                        this.f43552to.f44260k4 = C13850af.m65068c5(str);
                        if (this.f43552to.f44260k4 && c13125nk.m61431dq() != null) {
                            str2 = "There must be no fixed value when an attribute is 'xsi:nil' and has a value of 'true'.";
                            m60283x1(str2);
                            return c13125nk;
                        }
                    }
                } else if (str != null) {
                    str2 = "If the 'nillable' attribute is false in the Schema, the 'xsi:nil' attribute must not be present in the instance.";
                    m60283x1(str2);
                    return c13125nk;
                }
            } else {
                if (str == null || !C14113y2.m67363du(str, TelemetryEventStrings.Value.TRUE)) {
                    C13125nk[] c13125nkArr = {null};
                    boolean z = !this.f43548k4.m61893up().tryGetValue(c13890ei, c13125nkArr) && C14113y2.m67363du(c13890ei.m65284k4(), this.f44073wl);
                    C13125nk c13125nkM60226wp = c13125nkArr[0];
                    if (z && (c13164q9M61670k4 = AbstractC13279x6.m61670k4(new C13890ei(c13890ei.m65289x1(), this.f44073wl))) != null) {
                        c13125nkM60226wp = c13164q9M61670k4.m60226wp();
                    }
                    if (c13125nkM60226wp == null) {
                        m60273k4("This is an invalid xsi:type '{0}'.", c13890ei.toString());
                    } else if (C12943dd.m60206k4(c13125nkM60226wp.m61451yd(), c13125nk.m61451yd(), c13125nk.m61258fa())) {
                        c13125nk = c13125nkM60226wp;
                    } else {
                        String string = c13890ei.toString();
                        C13190rs c13190rs2 = this.f43552to;
                        m60275k4("The xsi:type attribute value '{0}' is not valid for the element '{1}', either because it is not a type validly derived from the type in the Schema, or because it has xsi:type derivation blocked.", new String[]{string, C12962eb.m60304k4(c13190rs2.f44259jd, c13190rs2.f44254ck)});
                    }
                    c13125nk = null;
                } else {
                    m60283x1("There can be no type value when attribute is 'xsi:nil' and has value 'true'.");
                }
                if (c13125nk == null) {
                }
                if (str != null) {
                }
            }
        }
        return c13125nk;
    }

    /* JADX INFO: renamed from: kk */
    private Object m61077kk(Object obj) {
        C13165qa c13165qa = (C13165qa) C7019kk.m27452k4(obj, C13165qa.class);
        return c13165qa != null ? c13165qa.m61419x1() : obj;
    }

    /* JADX INFO: renamed from: ks */
    private void m61079ks() {
        C13950o3 c13950o3Mo65017bz = this.f43554x1.mo65017bz();
        this.f44063fa = c13950o3Mo65017bz;
        if (c13950o3Mo65017bz == null) {
            this.f44063fa = new C13950o3(m60265h4());
            this.f44070up = true;
        }
        this.f44064jd = new C13858b3(10);
        this.f43543du = new C6765kp();
        this.f44062ck = new Hashtable();
        this.f43548k4 = new C13322zd();
        this.f43544dy = false;
        this.f44074x6 = 3;
        m61072k4(C13890ei.f46456k4);
        this.f44071uz = m60265h4().mo65266k4("http://www.w3.org/2000/xmlns/");
        this.f44073wl = m60265h4().mo65266k4("http://www.w3.org/2001/XMLSchema");
        this.f44067qq = m60265h4().mo65266k4("http://www.w3.org/2001/XMLSchema-instance");
        this.f44059ar = m60265h4().mo65266k4(C18437z2.f56754h);
        this.f44069um = m60265h4().mo65266k4("nil");
        this.f44060bv = m60265h4().mo65266k4("schemaLocation");
        this.f44072v4 = m60265h4().mo65266k4("noNamespaceSchemaLocation");
        this.f44066lr = m60265h4().mo65266k4("Schema");
    }

    /* JADX INFO: renamed from: lr */
    private void m61080lr() {
        C13190rs c13190rs = this.f43552to;
        c13190rs.f44257fa = new C13073ks[c13190rs.f44256dy.m61275ne().length];
        int i = 0;
        int i2 = 0;
        while (i < this.f43552to.f44256dy.m61275ne().length) {
            C13190rs c13190rs2 = this.f43552to;
            c13190rs2.f44257fa[i2] = new C13073ks(c13190rs2.f44256dy.m61275ne()[i]);
            i++;
            i2++;
        }
        int i3 = 0;
        while (true) {
            C13073ks[] c13073ksArr = this.f43552to.f44257fa;
            if (i3 >= c13073ksArr.length) {
                break;
            }
            if (c13073ksArr[i3].f44052k4.m61636k4() == 2) {
                int iM65182to = this.f44064jd.m65182to() - 1;
                boolean z = false;
                while (true) {
                    int iM65182to2 = this.f44061c5;
                    if (iM65182to2 < 0) {
                        iM65182to2 = this.f44064jd.m65182to() - 1;
                    }
                    if (iM65182to < iM65182to2) {
                        break;
                    }
                    if (((C13190rs) this.f44064jd.m65178k4(iM65182to)).f44257fa != null) {
                        C13073ks[] c13073ksArr2 = ((C13190rs) this.f44064jd.m65178k4(iM65182to)).f44257fa;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= c13073ksArr2.length) {
                                break;
                            }
                            if (C13890ei.m65278k4(c13073ksArr2[i4].f44052k4.f44419k4, this.f43552to.f44257fa[i3].f44052k4.f44421x1)) {
                                C13073ks c13073ks = c13073ksArr2[i4];
                                if (c13073ks.f44050du == null) {
                                    c13073ks.f44050du = new Hashtable();
                                }
                                this.f43552to.f44257fa[i3].f44054to = c13073ksArr2[i4].f44050du;
                                z = true;
                            } else {
                                i4++;
                            }
                        }
                        if (z) {
                            break;
                        }
                    }
                    iM65182to--;
                }
                if (!z) {
                    C13190rs c13190rs3 = this.f43552to;
                    m60273k4("The Keyref '{0}' cannot find the referred key or unique in scope.", C12962eb.m60304k4(c13190rs3.f44259jd, c13190rs3.f44254ck));
                }
            }
            i3++;
        }
        if (this.f44061c5 == -1) {
            this.f44061c5 = this.f44064jd.m65182to() - 1;
        }
    }

    /* JADX INFO: renamed from: ne */
    private void m61081ne() throws Throwable {
        this.f43549kk.m65290x1(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up());
        Object objM61069ix = m61069ix();
        if (!m61094x1(this.f43549kk.m65289x1(), this.f43549kk.m65284k4()) || this.f43554x1.mo65058x6() <= 0) {
            m61073k4(objM61069ix);
            return;
        }
        C12915bu c12915bu = new C12915bu(3, m60265h4(), m60279m9(), m60261ck());
        this.f44068rv = c12915bu;
        c12915bu.m60118x1(this.f43554x1, null);
        m61091x6();
    }

    /* JADX INFO: renamed from: qq */
    private boolean m61082qq() {
        return this.f43548k4.m61869ck() != 0;
    }

    /* JADX INFO: renamed from: rv */
    private boolean m61083rv() {
        return this.f44068rv != null;
    }

    /* JADX INFO: renamed from: to */
    private void m61084to(String str, String str2) throws Throwable {
        if (m60260c5() == null) {
            return;
        }
        if (!m60264fa().m61872fa().containsKey(str) || this.f44063fa.mo52700x1(str) == null) {
            C13322zd c13322zdM61756x1 = m60262du() != null ? m60262du().m61756x1(str) : null;
            if (c13322zdM61756x1 != null) {
                if (c13322zdM61756x1.m61869ck() != 3) {
                    throw new XmlException("Unsupported combination of validation types.", C14113y2.f47374k4, m60263dy().ah_(), m60263dy().ai_());
                }
                m60264fa().m61882k4(c13322zdM61756x1, m60261ck());
            } else if (str2 != null) {
                m61078kk(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    private void m61085u4() {
        if (this.f44070up) {
            this.f44063fa.mo65709to();
        }
        C13190rs c13190rs = this.f43552to;
        C13125nk c13125nk = c13190rs.f44256dy;
        if (c13125nk != null) {
            if (!c13190rs.f44260k4) {
                if (c13190rs.f44261kk && !c13125nk.m61276rv().mo60053x1(this.f43552to)) {
                    C13190rs c13190rs2 = this.f43552to;
                    AbstractC13319z7 abstractC13319z7M60261ck = m60261ck();
                    C13849aa c13849aa = this.f43554x1;
                    C12962eb.m60314k4(c13190rs2, abstractC13319z7M60261ck, c13849aa, c13849aa.mo65040ne(), m60263dy().ah_(), m60263dy().ai_(), (C13129ny) null);
                }
                if (this.f43544dy && !this.f43552to.f44260k4) {
                    String string = !this.f43551m9 ? this.f43546h4 : this.f43543du.toString();
                    if (string.length() != 0 || this.f43552to.f44256dy.m61431dq() == null) {
                        m61074k4(string, (C13061k5) null);
                        this.f43544dy = false;
                    }
                }
            }
            if (m61088v4()) {
                m61067b3();
            }
        }
        m61066ar();
    }

    /* JADX INFO: renamed from: um */
    private void m61086um() {
        C13256vw c13256vw = this.f44065ks;
        while (c13256vw != null) {
            if (mo60267k4(c13256vw.f44431k4) == null) {
                m60268k4(new XmlSchemaException("Reference to undeclared ID is '{0}'.", c13256vw.f44431k4, this.f43554x1.mo65040ne(), c13256vw.f44434x1, c13256vw.f44432kk));
            }
            C13256vw c13256vw2 = c13256vw.f44433to;
            c13256vw.f44433to = null;
            c13256vw = c13256vw2;
        }
        this.f44065ks = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX INFO: renamed from: uz */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m61087uz() {
        C13075ku c13075ku;
        C13125nk c13125nk = this.f43552to.f44256dy;
        if (c13125nk != null) {
            if (c13125nk.m61261jd()) {
                C13190rs c13190rs = this.f43552to;
                m60273k4("The element '{0}' is abstract or its type is abstract.", C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck));
            }
            this.f43554x1.m65032k4(this.f43552to.f44256dy.m61451yd());
            if (this.f43554x1.mo65048u4()) {
                C13190rs c13190rs2 = this.f43552to;
                if (c13190rs2.f44260k4 || c13190rs2.f44256dy.m61431dq() == null) {
                    this.f43554x1.m65056x1((Object) null);
                } else {
                    this.f43554x1.m65056x1(m61077kk(this.f43552to.f44256dy.m61431dq()));
                    this.f43552to.f44260k4 = true;
                }
                if (this.f43552to.f44256dy.m61273ks() || m61088v4()) {
                    this.f44062ck.clear();
                }
            }
        }
        if (this.f43554x1.mo65035kk()) {
            do {
                if (this.f43554x1.mo65050up() != this.f44071uz && this.f43554x1.mo65050up() != this.f44067qq) {
                    try {
                        this.f43554x1.m65032k4((Object) null);
                        C13890ei c13890ei = new C13890ei(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up());
                        boolean[] zArr = {this.f44074x6 == 1};
                        C13061k5 c13061k5M61877k4 = this.f43548k4.m61877k4(this.f43552to.f44256dy, c13890ei, zArr);
                        boolean z = zArr[0];
                        if (c13061k5M61877k4 != null) {
                            C13125nk c13125nk2 = this.f43552to.f44256dy;
                            if (c13125nk2 != null && (c13125nk2.m61273ks() || this.f44061c5 != -1)) {
                                this.f44062ck.addItem(c13061k5M61877k4.m61443qq(), c13061k5M61877k4);
                            }
                            this.f43554x1.m65032k4(c13061k5M61877k4.m61451yd());
                            if (c13061k5M61877k4.m61429b3() != null) {
                                m61074k4(this.f43554x1.mo65042rv(), c13061k5M61877k4);
                            }
                            if (m61088v4()) {
                                c13075ku = this;
                                try {
                                    c13075ku.m61075k4(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up(), this.f43554x1.m65022f9(), this.f43554x1.mo65042rv(), c13061k5M61877k4);
                                } catch (XmlSchemaException e) {
                                    e = e;
                                    e.setSource(c13075ku.f43554x1.mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
                                    m60268k4(e);
                                }
                            } else {
                                c13075ku = this;
                            }
                        } else {
                            c13075ku = this;
                            if (!z) {
                                if (c13075ku.f43552to.f44256dy == null && c13075ku.f44074x6 == 3 && c13890ei.m65284k4().length() != 0 && c13075ku.f43548k4.m61892to(c13890ei.m65284k4())) {
                                    m60273k4("The '{0}' attribute is not declared.", c13890ei.toString());
                                } else {
                                    m60274k4("Could not find Schema information for the attribute '{0}'.", c13890ei.toString(), 1);
                                }
                            }
                        }
                    } catch (XmlSchemaException e2) {
                        e = e2;
                        c13075ku = this;
                    }
                }
            } while (c13075ku.f43554x1.mo65047to());
            c13075ku.f43554x1.mo65020du();
        }
    }

    /* JADX INFO: renamed from: v4 */
    private boolean m61088v4() {
        return this.f44061c5 != -1;
    }

    /* JADX INFO: renamed from: wl */
    private void m61089wl() {
        if (this.f43552to.f44256dy.m61288yj()) {
            for (int i = 0; i < this.f43552to.f44256dy.m61279u4().size(); i++) {
                C13061k5 c13061k5 = (C13061k5) this.f43552to.f44256dy.m61279u4().get_Item(i);
                this.f43554x1.m65033k4(c13061k5);
                if (m61088v4() && !this.f44062ck.contains(c13061k5.m61443qq())) {
                    m61075k4(c13061k5.m61443qq().m65289x1(), c13061k5.m61443qq().m65284k4(), m61077kk(c13061k5.m61431dq()), c13061k5.m61427ak(), c13061k5);
                }
            }
        }
        if (this.f43552to.f44256dy.m61273ks()) {
            try {
                this.f43552to.f44256dy.m61265k4(this.f44062ck, this.f43554x1.m65043s7());
            } catch (XmlSchemaException e) {
                e.setSource(this.f43554x1.mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
                m60268k4(e);
            }
        }
        if (this.f43552to.f44256dy.m61429b3() != null) {
            this.f43544dy = true;
            this.f43551m9 = false;
            this.f43546h4 = C14113y2.f47374k4;
            this.f43543du.m26801k4(0);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C13125nk m61090x1(Object obj) {
        if (obj != null) {
            C13021hu c13021hu = (C13021hu) C7019kk.m27452k4(obj, C13021hu.class);
            if (c13021hu != null) {
                return c13021hu.m60697b3();
            }
            this.f44074x6 = ((C12989fu) obj).m60626dy();
        }
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    private void m61091x6() {
        if (this.f44068rv.m60116to()) {
            return;
        }
        this.f44068rv.m60112k4();
        C13282xc c13282xcM60117x1 = this.f44068rv.m60117x1();
        if (c13282xcM60117x1 != null && c13282xcM60117x1.m61726um() == 0) {
            try {
                C13322zd c13322zd = new C13322zd();
                c13322zd.m61881k4(3);
                String strM61697du = c13282xcM60117x1.m61697du() == null ? C14113y2.f47374k4 : c13282xcM60117x1.m61697du();
                if (!m60264fa().m61872fa().containsKey(strM61697du) && m60262du().m61750k4(strM61697du, c13322zd, c13282xcM60117x1, true) != null) {
                    m60264fa().m61882k4(c13322zd, m60261ck());
                }
            } catch (XmlSchemaException e) {
                m60276k4("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{m60266jd().m66697x1(), e.getMessage()}, 0);
            }
        }
        this.f44068rv = null;
    }

    /* JADX INFO: renamed from: yd */
    private void m61092yd() {
        for (int i = this.f44061c5; i < this.f44064jd.m65182to(); i++) {
            if (((C13190rs) this.f44064jd.m65178k4(i)).f44257fa != null) {
                C13073ks[] c13073ksArr = ((C13190rs) this.f44064jd.m65178k4(i)).f44257fa;
                for (int i2 = 0; i2 < c13073ksArr.length; i2++) {
                    if (c13073ksArr[i2].f44055x1.m61019k4(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up())) {
                        C6005k4.m24264to("Selector Match!");
                        C6005k4.m24264to(C14113y2.m67408k4("Name: ", this.f43554x1.mo65023fa(), "\t|\tURI: ", this.f43554x1.mo65050up(), IOUtils.LINE_SEPARATOR_UNIX));
                        c13073ksArr[i2].f44055x1.m61764k4(m60263dy().ah_(), m60263dy().ai_());
                    }
                    for (int i3 = 0; i3 < c13073ksArr[i2].f44053kk.size(); i3++) {
                        C13207sq c13207sq = (C13207sq) c13073ksArr[i2].f44053kk.get_Item(i3);
                        if (c13207sq.m61019k4(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up())) {
                            C6005k4.m24264to("Element Field Match!");
                            C13125nk c13125nk = this.f43552to.f44256dy;
                            if (c13125nk != null) {
                                if (c13125nk.m61429b3() == null) {
                                    m60273k4("The field '{0}' is expecting an element or attribute with simple type or simple content.", this.f43554x1.mo65023fa());
                                } else {
                                    c13207sq.f44376k4 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C13075ku(C13849aa c13849aa, C13287xo c13287xo, InterfaceC13972s7 interfaceC13972s7) {
        super(c13849aa, c13287xo, interfaceC13972s7);
        this.f44061c5 = -1;
        this.f44070up = false;
        this.f44068rv = null;
        m61079ks();
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: k4 */
    public Object mo60267k4(String str) {
        Hashtable hashtable = this.f44075yj;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get_Item(str);
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: kk */
    public void mo60278kk() {
        m61086um();
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: x1 */
    public void mo60282x1() throws Throwable {
        if (m61083rv()) {
            m61091x6();
            return;
        }
        int iMo65028jd = this.f43554x1.mo65028jd();
        if (iMo65028jd == 1) {
            m61081ne();
            if (this.f43554x1.mo65048u4()) {
                m61085u4();
                return;
            }
            return;
        }
        if (iMo65028jd != 3 && iMo65028jd != 4) {
            switch (iMo65028jd) {
                case 13:
                    m60284yj();
                    break;
                case 15:
                    m61085u4();
                    break;
            }
            return;
        }
        m60281up();
    }

    /* JADX INFO: renamed from: k4 */
    private void m61071k4(int i, String str) {
        if (i == 1) {
            if (mo60267k4(str) != null) {
                m60273k4("'{0}' is already used as an ID.", str);
                return;
            } else {
                m61093k4(str, (Object) this.f43552to.f44259jd);
                return;
            }
        }
        if (i != 2) {
            if (i != 4) {
                return;
            }
            C12957dy.m60258k4(this.f43548k4, str, this, m60261ck(), this.f43554x1.mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
        } else if (mo60267k4(str) == null) {
            this.f44065ks = new C13256vw(this.f44065ks, str, m60263dy().ah_(), m60263dy().ai_());
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m61078kk(String str, String str2) throws Throwable {
        C13938ms c13938ms;
        C13938ms c13938ms2 = null;
        try {
            try {
                C14062gk c14062gkMo65674k4 = m60260c5().mo65674k4(m60266jd(), str2);
                c13938ms = new C13938ms(c14062gkMo65674k4.toString(), (AbstractC3150x6) m60260c5().mo5312k4(c14062gkMo65674k4, null, null), m60265h4());
            } catch (Throwable th) {
                th = th;
            }
            try {
                C12915bu c12915bu = new C12915bu(3, m60265h4(), m60279m9(), m60261ck());
                c12915bu.m60114k4(m60260c5());
                int iM60113k4 = c12915bu.m60113k4(c13938ms, str);
                C13322zd c13322zd = new C13322zd();
                c13322zd.m61881k4(iM60113k4);
                if (iM60113k4 == 3) {
                    if (m60262du().m61754kk() == null) {
                        m60262du().m61752k4(m60261ck());
                    }
                    m60262du().m61750k4(str, c13322zd, c12915bu.m60117x1(), true);
                }
                m60264fa().m61882k4(c13322zd, m60261ck());
                do {
                } while (c13938ms.mo65026h4());
                c13938ms.mo65049um();
            } catch (XmlSchemaException e) {
                e = e;
                c13938ms2 = c13938ms;
                m60276k4("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{str, e.getMessage()}, 0);
                if (c13938ms2 == null) {
                    return;
                }
                c13938ms2.mo65049um();
            } catch (RuntimeException e2) {
                e = e2;
                c13938ms2 = c13938ms;
                m60276k4("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{str, e.getMessage()}, 1);
                if (c13938ms2 == null) {
                    return;
                }
                c13938ms2.mo65049um();
            } catch (Throwable th2) {
                th = th2;
                c13938ms2 = c13938ms;
                if (c13938ms2 != null) {
                    c13938ms2.mo65049um();
                }
                throw th;
            }
        } catch (XmlSchemaException e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m61094x1(String str, String str2) {
        return C13851ai.m65152k4(str2, this.f44073wl) && C13851ai.m65152k4(str, this.f44066lr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61072k4(C13890ei c13890ei) {
        C13190rs c13190rs = (C13190rs) this.f44064jd.m65177k4();
        this.f43552to = c13190rs;
        if (c13190rs == null) {
            C13190rs c13190rs2 = new C13190rs();
            this.f43552to = c13190rs2;
            this.f44064jd.m65180k4(c13190rs2);
        }
        this.f43552to.f44259jd = c13890ei.m65289x1();
        this.f43552to.f44254ck = c13890ei.m65284k4();
        C13190rs c13190rs3 = this.f43552to;
        c13190rs3.f44270yj = false;
        c13190rs3.f44260k4 = false;
        c13190rs3.f44258h4 = this.f44074x6;
        c13190rs3.f44261kk = false;
        c13190rs3.f44257fa = null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61073k4(Object obj) throws Throwable {
        C13125nk c13125nkM61090x1 = m61090x1(obj);
        m61072k4(this.f43549kk);
        if (this.f44070up) {
            this.f44063fa.mo65708kk();
        }
        C13890ei[] c13890eiArr = {null};
        String[] strArr = {null};
        m61076k4(c13890eiArr, strArr);
        C13890ei c13890ei = c13890eiArr[0];
        String str = strArr[0];
        if (this.f44074x6 != 1) {
            if (c13125nkM61090x1 == null || !c13890ei.m65287kk() || str != null) {
                c13125nkM61090x1 = m61070k4(c13125nkM61090x1, c13890ei, str);
            }
            if (c13125nkM61090x1 == null) {
                if (m61082qq() && this.f44074x6 == 3) {
                    C13190rs c13190rs = this.f43552to;
                    m60273k4("The '{0}' element is not declared.", C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck));
                } else {
                    C13190rs c13190rs2 = this.f43552to;
                    m60274k4("Could not find Schema information for the element '{0}'.", C12962eb.m60304k4(c13190rs2.f44259jd, c13190rs2.f44254ck), 1);
                }
            }
        }
        this.f43552to.f44256dy = c13125nkM61090x1;
        m61068bv();
        m61087uz();
        if (this.f43552to.f44256dy != null) {
            m61089wl();
            C13190rs c13190rs3 = this.f43552to;
            c13190rs3.f44261kk = this.f44074x6 != 1;
            c13190rs3.f44256dy.m61276rv().mo60052k4(this.f43552to);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61074k4(String str, C13061k5 c13061k5) {
        String strM60304k4;
        String str2;
        String str3;
        String strM60304k42;
        try {
            this.f43554x1.m65056x1((Object) null);
            boolean z = c13061k5 != null;
            AbstractC12892ae abstractC12892aeM61429b3 = z ? c13061k5.m61429b3() : this.f43552to.f44256dy.m61429b3();
            if (abstractC12892aeM61429b3 == null) {
                return;
            }
            Object objMo60026k4 = abstractC12892aeM61429b3.mo60026k4(str, m60265h4(), (InterfaceC13980t6) this.f44063fa, true);
            int iMo60016c5 = abstractC12892aeM61429b3.mo60016c5();
            if (iMo60016c5 == 4 || iMo60016c5 == 1 || iMo60016c5 == 2) {
                if (abstractC12892aeM61429b3.mo60017ck() == 1) {
                    for (String str4 : (String[]) C7019kk.m27458kk(objMo60026k4, String[].class)) {
                        m61071k4(abstractC12892aeM61429b3.mo60016c5(), str4);
                    }
                } else {
                    m61071k4(abstractC12892aeM61429b3.mo60016c5(), (String) objMo60026k4);
                }
            }
            if (!(z ? c13061k5 : this.f43552to.f44256dy).m61440kk(objMo60026k4)) {
                if (z) {
                    str3 = "The value of the '{0}' attribute does not equal its fixed value.";
                    strM60304k42 = c13061k5.m61443qq().toString();
                } else {
                    str3 = "The value of the '{0}' element does not equal its fixed value.";
                    C13190rs c13190rs = this.f43552to;
                    strM60304k42 = C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck);
                }
                m60273k4(str3, strM60304k42);
            }
            if (abstractC12892aeM61429b3.mo60017ck() == 2) {
                objMo60026k4 = m61077kk(objMo60026k4);
            }
            this.f43554x1.m65056x1(objMo60026k4);
        } catch (XmlSchemaException unused) {
            if (c13061k5 != null) {
                strM60304k4 = c13061k5.m61443qq().toString();
                str2 = "The '{0}' attribute has an invalid value according to its data type.";
            } else {
                C13190rs c13190rs2 = this.f43552to;
                strM60304k4 = C12962eb.m60304k4(c13190rs2.f44259jd, c13190rs2.f44254ck);
                str2 = "The '{0}' element has an invalid value according to its data type.";
            }
            m60273k4(str2, strM60304k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61093k4(String str, Object obj) {
        if (this.f44075yj == null) {
            this.f44075yj = new Hashtable();
        }
        this.f44075yj.addItem(str, obj);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61075k4(String str, String str2, Object obj, String str3, C13061k5 c13061k5) {
        for (int i = this.f44061c5; i < this.f44064jd.m65182to(); i++) {
            if (((C13190rs) this.f44064jd.m65178k4(i)).f44257fa != null) {
                C13073ks[] c13073ksArr = ((C13190rs) this.f44064jd.m65178k4(i)).f44257fa;
                for (int i2 = 0; i2 < c13073ksArr.length; i2++) {
                    for (int i3 = 0; i3 < c13073ksArr[i2].f44053kk.size(); i3++) {
                        C13207sq c13207sq = (C13207sq) c13073ksArr[i2].f44053kk.get_Item(i3);
                        if (c13207sq.m61020kk(str, str2)) {
                            C6005k4.m24264to("Attribute Field Match!");
                            C6005k4.m24264to("Attribute Field Filling Value!");
                            C6005k4.m24264to(C14113y2.m67407k4("Name: ", str, "\t|\tURI: ", str2, "\t|\tValue: ", obj, IOUtils.LINE_SEPARATOR_UNIX));
                            if (c13207sq.f44378x1.m61423k4(c13207sq.m61596kk()) != null) {
                                m60273k4("The field '{0}' is expecting at the most one value.", str);
                            } else if (c13061k5 != null && c13061k5.m61429b3() != null) {
                                c13207sq.f44378x1.m61424k4(c13207sq.m61596kk(), new C13211sz(obj, str3, c13061k5.m61429b3()));
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61076k4(C13890ei[] c13890eiArr, String[] strArr) throws Throwable {
        String[] strArr2;
        c13890eiArr[0] = C13890ei.f46456k4;
        String str = null;
        strArr[0] = null;
        if (this.f43554x1.mo65058x6() == 0) {
            m61084to(C14113y2.f47374k4, null);
            IGenericEnumerator<String> it = this.f44063fa.mo52690k4(1).getValues().iterator();
            while (it.hasNext()) {
                try {
                    m61084to(it.next(), null);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (this.f43554x1.mo65035kk()) {
            strArr2 = null;
            String strMo65042rv = null;
            do {
                String strMo65050up = this.f43554x1.mo65050up();
                String strMo65023fa = this.f43554x1.mo65023fa();
                if (C13851ai.m65152k4(strMo65050up, this.f44071uz)) {
                    m61084to(this.f43554x1.mo65042rv(), null);
                    if (this.f44070up) {
                        this.f44063fa.mo65707k4(this.f43554x1.mo65060yj().length() == 0 ? C14113y2.f47374k4 : this.f43554x1.mo65023fa(), this.f43554x1.mo65042rv());
                    }
                } else if (C13851ai.m65152k4(strMo65050up, this.f44067qq)) {
                    if (C13851ai.m65152k4(strMo65023fa, this.f44060bv)) {
                        strArr2 = (String[]) C7019kk.m27458kk(f44058u4.mo60025k4(this.f43554x1.mo65042rv(), m60265h4(), this.f44063fa), String[].class);
                    } else if (C13851ai.m65152k4(strMo65023fa, this.f44072v4)) {
                        strMo65042rv = this.f43554x1.mo65042rv();
                    } else if (C13851ai.m65152k4(strMo65023fa, this.f44059ar)) {
                        c13890eiArr[0] = (C13890ei) f44056ix.mo60025k4(this.f43554x1.mo65042rv(), m60265h4(), this.f44063fa);
                    } else if (C13851ai.m65152k4(strMo65023fa, this.f44069um)) {
                        strArr[0] = this.f43554x1.mo65042rv();
                    }
                }
            } while (this.f43554x1.mo65047to());
            this.f43554x1.mo65020du();
            str = strMo65042rv;
        } else {
            strArr2 = null;
        }
        if (str != null) {
            m61084to(C14113y2.f47374k4, str);
        }
        if (strArr2 != null) {
            for (int i = 0; i < strArr2.length - 1; i += 2) {
                m61084to(strArr2[i], strArr2[i + 1]);
            }
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo60277k4() {
        C13125nk c13125nk = this.f43552to.f44256dy;
        if (c13125nk != null) {
            return c13125nk.m61276rv().m61458kk();
        }
        return false;
    }
}

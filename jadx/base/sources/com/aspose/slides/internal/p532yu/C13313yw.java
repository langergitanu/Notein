package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13849aa;
import com.aspose.slides.p559ms.System.Xml.C13858b3;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13927kp;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13972s7;
import com.aspose.slides.p559ms.System.Xml.InterfaceC14006wp;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.yw */
/* JADX INFO: loaded from: classes5.dex */
public final class C13313yw extends C12957dy {

    /* JADX INFO: renamed from: c5 */
    private static k4 f44620c5 = new k4();

    /* JADX INFO: renamed from: ck */
    private Hashtable f44621ck;

    /* JADX INFO: renamed from: fa */
    private C13890ei f44622fa;

    /* JADX INFO: renamed from: jd */
    private C13858b3 f44623jd;

    /* JADX INFO: renamed from: ks */
    private boolean f44624ks;

    /* JADX INFO: renamed from: up */
    private Hashtable f44625up;

    /* JADX INFO: renamed from: yj */
    private C13256vw f44626yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.yw$k4 */
    public static class k4 extends C13950o3 {
        private k4() {
        }

        @Override // com.aspose.slides.p559ms.System.Xml.C13950o3, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
        /* JADX INFO: renamed from: k4 */
        public String mo13292k4(String str) {
            return str;
        }
    }

    public C13313yw(C13849aa c13849aa, InterfaceC13972s7 interfaceC13972s7, boolean z) {
        super(c13849aa, null, interfaceC13972s7);
        this.f44622fa = C13890ei.f46456k4;
        this.f44624ks = z;
        m61855ks();
    }

    /* JADX INFO: renamed from: ar */
    private void m61847ar() {
        C13256vw c13256vw = this.f44626yj;
        while (c13256vw != null) {
            if (mo60267k4(c13256vw.f44431k4) == null) {
                m60268k4(new XmlSchemaException("Reference to undeclared ID is '{0}'.", c13256vw.f44431k4, this.f43554x1.mo65040ne(), c13256vw.f44434x1, c13256vw.f44432kk));
            }
            C13256vw c13256vw2 = c13256vw.f44433to;
            c13256vw.f44433to = null;
            c13256vw = c13256vw2;
        }
        this.f44626yj = null;
    }

    /* JADX INFO: renamed from: ix */
    private void m61848ix() {
        C13190rs c13190rs = this.f43552to;
        if (c13190rs.f44261kk) {
            int[] iArr = {0};
            c13190rs.f44256dy.m61276rv().mo60051k4(this.f43549kk, this.f43552to, iArr);
            if (iArr[0] < 0) {
                C13890ei c13890ei = this.f43549kk;
                C13190rs c13190rs2 = this.f43552to;
                AbstractC13319z7 abstractC13319z7M60261ck = m60261ck();
                C13849aa c13849aa = this.f43554x1;
                C12962eb.m60316k4(c13890ei, c13190rs2, abstractC13319z7M60261ck, c13849aa, c13849aa.mo65040ne(), m60263dy().ah_(), m60263dy().ai_(), null);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C13116n3 m61849k4(C13890ei c13890ei, boolean z) {
        if (z) {
            C13116n3[] c13116n3Arr = {null};
            boolean zTryGetValue = this.f43548k4.m61874jd().tryGetValue(c13890ei, c13116n3Arr);
            C13116n3 c13116n3 = c13116n3Arr[0];
            if (zTryGetValue) {
                return c13116n3;
            }
        } else {
            C13116n3[] c13116n3Arr2 = {null};
            boolean zTryGetValue2 = this.f43548k4.m61868c5().tryGetValue(c13890ei, c13116n3Arr2);
            C13116n3 c13116n32 = c13116n3Arr2[0];
            if (zTryGetValue2) {
                return c13116n32;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ks */
    private void m61855ks() {
        this.f44623jd = new C13858b3(10);
        this.f43543du = new C6765kp();
        this.f44622fa = C13890ei.f46456k4;
        this.f44621ck = new Hashtable();
        this.f43548k4 = new C13322zd();
        this.f43544dy = false;
        m61863x1(this.f44622fa);
    }

    /* JADX INFO: renamed from: ne */
    private void m61856ne() {
        this.f43549kk.m65290x1(this.f43554x1.mo65023fa(), this.f43554x1.mo65060yj());
        if (this.f43554x1.mo65058x6() != 0 || this.f43548k4.m61873h4().m65287kk() || this.f43548k4.m61873h4().equals(this.f43549kk)) {
            m61848ix();
        } else {
            m60283x1("Root element name must match the DocType name.");
        }
        m61862wl();
    }

    /* JADX INFO: renamed from: qq */
    private void m61857qq() {
        C13190rs c13190rs = this.f43552to;
        C13125nk c13125nk = c13190rs.f44256dy;
        if (c13125nk != null) {
            if (c13190rs.f44261kk && !c13125nk.m61276rv().mo60053x1(this.f43552to)) {
                C13190rs c13190rs2 = this.f43552to;
                AbstractC13319z7 abstractC13319z7M60261ck = m60261ck();
                C13849aa c13849aa = this.f43554x1;
                C12962eb.m60314k4(c13190rs2, abstractC13319z7M60261ck, c13849aa, c13849aa.mo65040ne(), m60263dy().ah_(), m60263dy().ai_(), (C13129ny) null);
            }
            if (this.f43544dy) {
                m61853k4(!this.f43551m9 ? this.f43546h4 : this.f43543du.toString(), (C13061k5) null);
                this.f43544dy = false;
                this.f43543du.m26801k4(0);
                this.f43546h4 = C14113y2.f47374k4;
            }
        }
        m61860um();
    }

    /* JADX INFO: renamed from: rv */
    private boolean m61858rv() {
        C13125nk c13125nk;
        if (!this.f43554x1.m65043s7() || (c13125nk = this.f43552to.f44256dy) == null || !c13125nk.m61445um() || this.f43552to.f44256dy.m61276rv().m61460x1() != 2) {
            return true;
        }
        m60283x1("The standalone document declaration must have a value of 'no'.");
        return false;
    }

    /* JADX INFO: renamed from: u4 */
    private void m61859u4() {
        if (this.f43552to.f44256dy != null) {
            m60280to().m65032k4(this.f43552to.f44256dy.m61451yd());
            if (m60280to().mo65048u4() && this.f43552to.f44256dy.m61431dq() != null) {
                m60280to().m65056x1(this.f43552to.f44256dy.m61431dq());
                this.f43552to.f44260k4 = true;
            }
            if (this.f43552to.f44256dy.m61273ks()) {
                this.f44621ck.clear();
            }
        }
        if (m60280to().mo65035kk()) {
            do {
                try {
                    this.f43554x1.m65032k4((Object) null);
                    C13061k5 c13061k5M61283x1 = this.f43552to.f44256dy.m61283x1(new C13890ei(this.f43554x1.mo65023fa(), this.f43554x1.mo65060yj()));
                    if (c13061k5M61283x1 != null) {
                        C13125nk c13125nk = this.f43552to.f44256dy;
                        if (c13125nk != null && c13125nk.m61273ks()) {
                            this.f44621ck.addItem(c13061k5M61283x1.m61443qq(), c13061k5M61283x1);
                        }
                        m60280to().m65032k4(c13061k5M61283x1.m61451yd());
                        if (c13061k5M61283x1.m61429b3() != null && !this.f43554x1.mo65057x1()) {
                            m61853k4(m60280to().mo65042rv(), c13061k5M61283x1);
                        }
                    } else {
                        m60273k4("The '{0}' attribute is not declared.", this.f43554x1.mo65019ck());
                    }
                } catch (XmlSchemaException e) {
                    e.setSource(m60280to().mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
                    m60268k4(e);
                }
            } while (m60280to().mo65047to());
            m60280to().mo65020du();
        }
    }

    /* JADX INFO: renamed from: um */
    private boolean m61860um() {
        if (this.f44623jd.m65182to() <= 1) {
            return false;
        }
        this.f44623jd.m65183x1();
        this.f43552to = (C13190rs) this.f44623jd.m65181kk();
        return true;
    }

    /* JADX INFO: renamed from: uz */
    private void m61861uz() {
        if (this.f43552to.f44256dy.m61273ks()) {
            try {
                this.f43552to.f44256dy.m61265k4(this.f44621ck, m60280to().m65043s7());
            } catch (XmlSchemaException e) {
                e.setSource(m60280to().mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
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

    /* JADX INFO: renamed from: wl */
    private void m61862wl() {
        C13125nk c13125nkM61894x1 = this.f43548k4.m61894x1(this.f43549kk);
        m61863x1(this.f43549kk);
        if (c13125nkM61894x1 == null) {
            C13190rs c13190rs = this.f43552to;
            m60273k4("The '{0}' element is not declared.", C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck));
            this.f43552to.f44256dy = null;
        } else {
            this.f43552to.f44256dy = c13125nkM61894x1;
            m61859u4();
            m61861uz();
            this.f43552to.f44261kk = true;
            c13125nkM61894x1.m61276rv().mo60052k4(this.f43552to);
        }
    }

    /* JADX INFO: renamed from: x6 */
    private void m61864x6() {
        C13190rs c13190rs = this.f43552to;
        if (c13190rs.f44261kk && c13190rs.f44256dy.m61276rv() == C13192rv.f44272k4) {
            m60283x1("The element cannot contain comment or processing instruction. Content model is empty.");
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: kk */
    public void mo60278kk() {
        if (this.f43548k4.m61869ck() == 1) {
            do {
                m61857qq();
            } while (m61860um());
            m61847ar();
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: x1 */
    public void mo60282x1() {
        if (this.f43548k4.m61869ck() != 1) {
            if (this.f43554x1.mo65058x6() == 0 && this.f43554x1.mo65028jd() == 1) {
                m60274k4("No DTD found.", this.f44622fa.toString(), 1);
                return;
            }
            return;
        }
        int iMo65028jd = this.f43554x1.mo65028jd();
        if (iMo65028jd == 1) {
            m61856ne();
            if (this.f43554x1.mo65048u4()) {
                m61857qq();
                return;
            }
            return;
        }
        if (iMo65028jd == 3 || iMo65028jd == 4) {
            m60281up();
            return;
        }
        if (iMo65028jd != 5) {
            if (iMo65028jd == 7 || iMo65028jd == 8) {
                m61864x6();
                return;
            }
            switch (iMo65028jd) {
                case 13:
                case 14:
                    if (m61858rv()) {
                        m60284yj();
                    }
                    break;
                case 15:
                    m61857qq();
                    break;
            }
        } else {
            if (m61854k4(new C13890ei(this.f43554x1.mo65023fa(), this.f43554x1.mo65060yj()))) {
                return;
            }
            m60281up();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m61863x1(C13890ei c13890ei) {
        C13190rs c13190rs = (C13190rs) this.f44623jd.m65177k4();
        this.f43552to = c13190rs;
        if (c13190rs == null) {
            C13190rs c13190rs2 = new C13190rs();
            this.f43552to = c13190rs2;
            this.f44623jd.m65180k4(c13190rs2);
        }
        this.f43552to.f44259jd = c13890ei.m65289x1();
        this.f43552to.f44254ck = c13890ei.m65284k4();
        C13190rs c13190rs3 = this.f43552to;
        c13190rs3.f44270yj = false;
        c13190rs3.f44260k4 = false;
        c13190rs3.f44261kk = false;
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: k4 */
    public Object mo60267k4(String str) {
        Hashtable hashtable = this.f44625up;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get_Item(str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61850k4(int i, String str) {
        if (i == 1) {
            if (this.f44624ks) {
                if (mo60267k4(str) != null) {
                    m60273k4("'{0}' is already used as an ID.", str);
                    return;
                } else {
                    m61865k4(str, (Object) this.f43552to.f44259jd);
                    return;
                }
            }
            return;
        }
        if (i != 2) {
            if (i != 4) {
                return;
            }
            C12957dy.m60258k4(this.f43548k4, str, this, m60261ck(), m60280to().mo65040ne(), m60263dy().ah_(), m60263dy().ai_());
        } else if (this.f44624ks && mo60267k4(str) == null) {
            this.f44626yj = new C13256vw(this.f44626yj, str, m60263dy().ah_(), m60263dy().ai_());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m61851k4(C13061k5 c13061k5, C13322zd c13322zd, InterfaceC13972s7 interfaceC13972s7, String str) {
        InterfaceC13972s7 interfaceC13972s72;
        if (str == null) {
            try {
                str = C14113y2.f47374k4;
            } catch (RuntimeException unused) {
                interfaceC13972s72 = interfaceC13972s7;
            }
        }
        String str2 = str;
        AbstractC12892ae abstractC12892aeM61429b3 = c13061k5.m61429b3();
        if (abstractC12892aeM61429b3 == null) {
            return;
        }
        Object objM61431dq = c13061k5.m61431dq();
        int iMo60016c5 = abstractC12892aeM61429b3.mo60016c5();
        if (iMo60016c5 == 4) {
            try {
                if (abstractC12892aeM61429b3.mo60017ck() != 1) {
                    C12957dy.m60257k4(c13322zd, (String) objM61431dq, interfaceC13972s7, str2, c13061k5.m61040ks(), c13061k5.m61053yj());
                    return;
                }
                String[] strArr = (String[]) C7019kk.m27458kk(objM61431dq, String[].class);
                int i = 0;
                while (i < strArr.length) {
                    C13322zd c13322zd2 = c13322zd;
                    InterfaceC13972s7 interfaceC13972s73 = interfaceC13972s7;
                    C12957dy.m60257k4(c13322zd2, strArr[i], interfaceC13972s73, str2, c13061k5.m61040ks(), c13061k5.m61053yj());
                    c13322zd = c13322zd2;
                    i++;
                    interfaceC13972s7 = interfaceC13972s73;
                }
                return;
            } catch (RuntimeException unused2) {
                interfaceC13972s72 = 4;
            }
        } else {
            interfaceC13972s72 = interfaceC13972s7;
            if (iMo60016c5 != 9) {
                return;
            }
            try {
                if (c13061k5.m61450x1(objM61431dq) || interfaceC13972s72 == 0) {
                    return;
                }
                interfaceC13972s72.mo65063k4(new XmlSchemaException("'{0}' is not in the enumeration list.", objM61431dq.toString(), str2, c13061k5.m61040ks(), c13061k5.m61053yj()), 0);
                return;
            } catch (RuntimeException unused3) {
            }
        }
        if (interfaceC13972s72 != 0) {
            interfaceC13972s72.mo65063k4(new XmlSchemaException("The default value of '{0}' attribute is invalid according to its datatype.", c13061k5.m61443qq().toString()), 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m61852k4(C13061k5 c13061k5, InterfaceC14006wp interfaceC14006wp) {
        try {
            String strM61043rv = c13061k5.m61043rv();
            AbstractC12892ae abstractC12892aeM61429b3 = c13061k5.m61429b3();
            if (abstractC12892aeM61429b3 == null) {
                return;
            }
            if (abstractC12892aeM61429b3.mo60016c5() != 0) {
                strM61043rv = C14113y2.m67440x1(strM61043rv);
            }
            c13061k5.m61437k4(abstractC12892aeM61429b3.mo60025k4(strM61043rv, interfaceC14006wp.mo66177k4(), interfaceC14006wp.mo66188x1()));
        } catch (RuntimeException unused) {
            InterfaceC13972s7 interfaceC13972s7Mo65506x6 = ((InterfaceC13927kp) interfaceC14006wp).mo65506x6();
            if (interfaceC13972s7Mo65506x6 != null) {
                interfaceC13972s7Mo65506x6.mo65063k4(new XmlSchemaException("The default value of '{0}' attribute is invalid according to its datatype.", c13061k5.m61443qq().toString()), 0);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61853k4(String str, C13061k5 c13061k5) {
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
            if (abstractC12892aeM61429b3.mo60016c5() != 0) {
                str = C14113y2.m67440x1(str);
            }
            Object objMo60025k4 = abstractC12892aeM61429b3.mo60025k4(str, m60265h4(), f44620c5);
            this.f43554x1.m65056x1(objMo60025k4);
            int iMo60016c5 = abstractC12892aeM61429b3.mo60016c5();
            if (iMo60016c5 == 4 || iMo60016c5 == 1 || iMo60016c5 == 2) {
                if (abstractC12892aeM61429b3.mo60017ck() == 1) {
                    for (String str4 : (String[]) C7019kk.m27458kk(objMo60025k4, String[].class)) {
                        m61850k4(abstractC12892aeM61429b3.mo60016c5(), str4);
                    }
                } else {
                    m61850k4(abstractC12892aeM61429b3.mo60016c5(), (String) objMo60025k4);
                }
            }
            AbstractC13183r7 abstractC13183r7 = z ? c13061k5 : this.f43552to.f44256dy;
            if (abstractC13183r7.m61447wy() != null && !abstractC13183r7.m61450x1(objMo60025k4)) {
                m60273k4(abstractC12892aeM61429b3.mo60016c5() == 8 ? "'{0}' is not in the notation list." : "'{0}' is not in the enumeration list.", objMo60025k4.toString());
            }
            if (abstractC13183r7.m61440kk(objMo60025k4)) {
                return;
            }
            if (z) {
                str3 = "The value of the '{0}' attribute does not equal its fixed value.";
                strM60304k42 = c13061k5.m61443qq().toString();
            } else {
                str3 = "The value of the '{0}' element does not equal its fixed value.";
                C13190rs c13190rs = this.f43552to;
                strM60304k42 = C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck);
            }
            m60273k4(str3, strM60304k42);
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
    public final void m61865k4(String str, Object obj) {
        if (this.f44625up == null) {
            this.f44625up = new Hashtable();
        }
        this.f44625up.addItem(str, obj);
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

    /* JADX INFO: renamed from: k4 */
    private boolean m61854k4(C13890ei c13890ei) {
        String strM65289x1 = c13890ei.m65289x1();
        if (strM65289x1.charAt(0) == '#' || C13116n3.m61195k4(strM65289x1)) {
            return false;
        }
        C13116n3 c13116n3M61849k4 = m61849k4(c13890ei, false);
        if (c13116n3M61849k4 == null) {
            throw new XmlException("Reference to undeclared entity '{0}'.", strM65289x1);
        }
        if (!c13116n3M61849k4.m61216ne().m65287kk()) {
            throw new XmlException("Reference to unparsed entity '{0}'.", strM65289x1);
        }
        if (!this.f43554x1.m65043s7() || !c13116n3M61849k4.m61229x6()) {
            return true;
        }
        m60283x1("The standalone document declaration must have a value of 'no'.");
        return true;
    }
}

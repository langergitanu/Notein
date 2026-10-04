package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13849aa;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C14004w6;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13972s7;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12957dy {

    /* JADX INFO: renamed from: c5 */
    private C13287xo f43541c5;

    /* JADX INFO: renamed from: ck */
    private AbstractC13883dt f43542ck;

    /* JADX INFO: renamed from: du */
    protected C6765kp f43543du;

    /* JADX INFO: renamed from: dy */
    protected boolean f43544dy;

    /* JADX INFO: renamed from: fa */
    private C13058k1 f43545fa;

    /* JADX INFO: renamed from: h4 */
    protected String f43546h4;

    /* JADX INFO: renamed from: jd */
    private InterfaceC13972s7 f43547jd;

    /* JADX INFO: renamed from: k4 */
    protected C13322zd f43548k4;

    /* JADX INFO: renamed from: kk */
    protected C13890ei f43549kk;

    /* JADX INFO: renamed from: ks */
    private C14062gk f43550ks;

    /* JADX INFO: renamed from: m9 */
    protected boolean f43551m9;

    /* JADX INFO: renamed from: to */
    protected C13190rs f43552to;

    /* JADX INFO: renamed from: up */
    private C14004w6 f43553up;

    /* JADX INFO: renamed from: x1 */
    protected C13849aa f43554x1;

    /* JADX INFO: renamed from: yj */
    private AbstractC13943n5 f43555yj;

    public C12957dy(C12957dy c12957dy) {
        this.f43554x1 = c12957dy.f43554x1;
        this.f43541c5 = c12957dy.f43541c5;
        this.f43547jd = c12957dy.f43547jd;
        this.f43542ck = c12957dy.f43542ck;
        this.f43545fa = c12957dy.f43545fa;
        this.f43553up = c12957dy.f43553up;
        this.f43555yj = c12957dy.f43555yj;
        this.f43550ks = c12957dy.f43550ks;
        this.f43549kk = c12957dy.f43549kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12957dy m60256k4(int i, C13849aa c13849aa, C13287xo c13287xo, InterfaceC13972s7 interfaceC13972s7, boolean z) {
        if (i == 0) {
            return new C12957dy(c13849aa, c13287xo, interfaceC13972s7);
        }
        if (i == 1) {
            return new C13220to(c13849aa, c13287xo, interfaceC13972s7);
        }
        if (i == 2) {
            return new C13313yw(c13849aa, interfaceC13972s7, z);
        }
        if (i == 3) {
            return new C13334zz(c13849aa, c13287xo, interfaceC13972s7);
        }
        if (i != 4) {
            return null;
        }
        return new C13075ku(c13849aa, c13287xo, interfaceC13972s7);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC13943n5 m60260c5() {
        return this.f43555yj;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC13319z7 m60261ck() {
        return (AbstractC13319z7) this.f43547jd.mo65062k4();
    }

    /* JADX INFO: renamed from: du */
    public final C13287xo m60262du() {
        return this.f43541c5;
    }

    /* JADX INFO: renamed from: dy */
    public final C14004w6 m60263dy() {
        return this.f43553up;
    }

    /* JADX INFO: renamed from: fa */
    public final C13322zd m60264fa() {
        return this.f43548k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC13883dt m60265h4() {
        return this.f43542ck;
    }

    /* JADX INFO: renamed from: jd */
    public final C14062gk m60266jd() {
        return this.f43550ks;
    }

    /* JADX INFO: renamed from: kk */
    public void mo60278kk() {
    }

    /* JADX INFO: renamed from: m9 */
    public final C13058k1 m60279m9() {
        C13058k1 c13058k1 = this.f43545fa;
        if (c13058k1 != null) {
            return c13058k1;
        }
        C13287xo c13287xo = this.f43541c5;
        this.f43545fa = c13287xo != null ? c13287xo.m61748k4(this.f43542ck) : new C13058k1(this.f43542ck);
        return this.f43545fa;
    }

    /* JADX INFO: renamed from: to */
    public final C13849aa m60280to() {
        return this.f43554x1;
    }

    /* JADX INFO: renamed from: up */
    public final void m60281up() {
        C13190rs c13190rs = this.f43552to;
        if (c13190rs.f44261kk) {
            if (c13190rs.f44260k4) {
                m60273k4("Element '{0}' must have no character or element children.", C12962eb.m60304k4(c13190rs.f44259jd, c13190rs.f44254ck));
                return;
            }
            C13192rv c13192rvM61276rv = c13190rs.f44256dy.m61276rv();
            int iM61460x1 = c13192rvM61276rv.m61460x1();
            if (iM61460x1 == 2) {
                ArrayList arrayListMo60049k4 = c13192rvM61276rv.mo60049k4(this.f43552to, false);
                if (arrayListMo60049k4 == null) {
                    C13190rs c13190rs2 = this.f43552to;
                    m60273k4("The element {0} cannot contain text.", C12962eb.m60345x1(c13190rs2.f44259jd, c13190rs2.f44254ck));
                } else {
                    C13190rs c13190rs3 = this.f43552to;
                    m60275k4("The element {0} cannot contain text. List of possible elements expected: {1}.", new String[]{C12962eb.m60345x1(c13190rs3.f44259jd, c13190rs3.f44254ck), C12962eb.m60344x1(arrayListMo60049k4, false)});
                }
            } else if (iM61460x1 == 1) {
                m60273k4("The element cannot contain text. Content model is empty.", C14113y2.f47374k4);
            }
            if (this.f43544dy) {
                m60259kk(this.f43554x1.mo65042rv());
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo60282x1() {
    }

    /* JADX INFO: renamed from: yj */
    public final void m60284yj() {
        C13190rs c13190rs = this.f43552to;
        if (c13190rs.f44261kk) {
            int iM61460x1 = c13190rs.f44256dy.m61276rv().m61460x1();
            C13190rs c13190rs2 = this.f43552to;
            if (c13190rs2.f44260k4) {
                m60273k4("Element '{0}' must have no character or element children.", C12962eb.m60304k4(c13190rs2.f44259jd, c13190rs2.f44254ck));
            }
            if (iM61460x1 == 1) {
                m60273k4("The element cannot contain white space. Content model is empty.", C14113y2.f47374k4);
            }
            if (this.f43544dy) {
                m60259kk(this.f43554x1.mo65042rv());
            }
        }
    }

    public C12957dy(C13849aa c13849aa, C13287xo c13287xo, InterfaceC13972s7 interfaceC13972s7) {
        this.f43554x1 = c13849aa;
        this.f43541c5 = c13287xo;
        this.f43547jd = interfaceC13972s7;
        this.f43542ck = c13849aa.mo65059yd();
        this.f43553up = C14004w6.m66285k4(c13849aa);
        this.f43549kk = new C13890ei();
    }

    /* JADX INFO: renamed from: kk */
    private void m60259kk(String str) {
        if (this.f43546h4.length() == 0) {
            this.f43546h4 = str;
            return;
        }
        if (!this.f43551m9) {
            this.f43543du.m26792k4(this.f43546h4);
            this.f43551m9 = true;
        }
        this.f43543du.m26792k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo60267k4(String str) {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60283x1(String str) {
        m60273k4(str, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60268k4(XmlSchemaException xmlSchemaException) {
        m60269k4(xmlSchemaException, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60269k4(XmlSchemaException xmlSchemaException, int i) {
        InterfaceC13972s7 interfaceC13972s7 = this.f43547jd;
        if (interfaceC13972s7 != null) {
            interfaceC13972s7.mo65063k4(xmlSchemaException, i);
        } else if (i == 0) {
            throw xmlSchemaException;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m60257k4(C13322zd c13322zd, String str, InterfaceC13972s7 interfaceC13972s7, String str2, int i, int i2) {
        String str3 = null;
        C13116n3[] c13116n3Arr = {null};
        boolean zTryGetValue = c13322zd.m61868c5().tryGetValue(new C13890ei(str), c13116n3Arr);
        C13116n3 c13116n3 = c13116n3Arr[0];
        if (!zTryGetValue) {
            str3 = "Reference to an undeclared entity, '{0}'.";
        } else if (c13116n3.m61216ne().m65287kk()) {
            str3 = "Reference to an unparsed entity, '{0}'.";
        }
        String str4 = str3;
        if (str4 != null) {
            XmlSchemaException xmlSchemaException = new XmlSchemaException(str4, str, str2, i, i2);
            if (interfaceC13972s7 == null) {
                throw xmlSchemaException;
            }
            interfaceC13972s7.mo65063k4(xmlSchemaException, 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m60258k4(C13322zd c13322zd, String str, Object obj, AbstractC13319z7 abstractC13319z7, String str2, int i, int i2) {
        XmlSchemaException xmlSchemaException = null;
        C13116n3[] c13116n3Arr = {null};
        boolean zTryGetValue = c13322zd.m61868c5().tryGetValue(new C13890ei(str), c13116n3Arr);
        C13116n3 c13116n3 = c13116n3Arr[0];
        if (!zTryGetValue) {
            xmlSchemaException = new XmlSchemaException("Reference to an undeclared entity, '{0}'.", str, str2, i, i2);
        } else if (c13116n3.m61216ne().m65287kk()) {
            xmlSchemaException = new XmlSchemaException("Reference to an unparsed entity, '{0}'.", str, str2, i, i2);
        }
        if (xmlSchemaException != null) {
            if (abstractC13319z7 == null) {
                throw xmlSchemaException;
            }
            abstractC13319z7.mo12838k4(obj, new C13020hq(xmlSchemaException));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60270k4(InterfaceC13899g8 interfaceC13899g8) {
        C13322zd c13322zd = (C13322zd) C7019kk.m27452k4((Object) interfaceC13899g8, C13322zd.class);
        if (c13322zd == null) {
            throw new XmlException("An internal error has occurred.", C14113y2.f47374k4);
        }
        this.f43548k4 = c13322zd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60271k4(AbstractC13943n5 abstractC13943n5) {
        this.f43555yj = abstractC13943n5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60272k4(C14062gk c14062gk) {
        this.f43550ks = c14062gk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60273k4(String str, String str2) {
        m60268k4(new XmlSchemaException(str, str2, this.f43554x1.mo65040ne(), this.f43553up.ah_(), this.f43553up.ai_()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60274k4(String str, String str2, int i) {
        m60269k4(new XmlSchemaException(str, str2, this.f43554x1.mo65040ne(), this.f43553up.ah_(), this.f43553up.ai_()), i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60275k4(String str, String[] strArr) {
        m60268k4(new XmlSchemaException(str, strArr, this.f43554x1.mo65040ne(), this.f43553up.ah_(), this.f43553up.ai_()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60276k4(String str, String[] strArr, int i) {
        m60269k4(new XmlSchemaException(str, strArr, this.f43554x1.mo65040ne(), this.f43553up.ah_(), this.f43553up.ai_()), i);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo60277k4() {
        return false;
    }
}

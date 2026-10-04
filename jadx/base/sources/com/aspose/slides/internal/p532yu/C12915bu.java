package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p343pr.C9483k4;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13857b1;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13947nk;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C13987tw;
import com.aspose.slides.p559ms.System.Xml.C14004w6;
import com.aspose.slides.p559ms.System.Xml.C14022y4;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.bu */
/* JADX INFO: loaded from: classes5.dex */
public final class C12915bu {

    /* JADX INFO: renamed from: ck */
    private AbstractC12938d3 f43458ck;

    /* JADX INFO: renamed from: du */
    private C13950o3 f43459du;

    /* JADX INFO: renamed from: dy */
    private boolean f43460dy;

    /* JADX INFO: renamed from: fa */
    private C13282xc f43461fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC13912i5 f43462h4;

    /* JADX INFO: renamed from: ix */
    private String f43463ix;

    /* JADX INFO: renamed from: jd */
    private int f43464jd;

    /* JADX INFO: renamed from: k4 */
    private int f43465k4;

    /* JADX INFO: renamed from: kk */
    private C13058k1 f43466kk;

    /* JADX INFO: renamed from: m9 */
    private C14004w6 f43468m9;

    /* JADX INFO: renamed from: ne */
    private C13950o3 f43469ne;

    /* JADX INFO: renamed from: to */
    private AbstractC13319z7 f43471to;

    /* JADX INFO: renamed from: up */
    private C13322zd f43473up;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13883dt f43474x1;

    /* JADX INFO: renamed from: x6 */
    private AbstractC13901ga f43475x6;

    /* JADX INFO: renamed from: yj */
    private AbstractC13943n5 f43476yj;

    /* JADX INFO: renamed from: c5 */
    private int f43457c5 = 0;

    /* JADX INFO: renamed from: u4 */
    private C14022y4 f43472u4 = C14022y4.m66318k4().Clone();

    /* JADX INFO: renamed from: rv */
    private boolean f43470rv = true;

    /* JADX INFO: renamed from: ks */
    private XmlDocument f43467ks = new XmlDocument();

    public C12915bu(int i, AbstractC13883dt abstractC13883dt, C13058k1 c13058k1, AbstractC13319z7 abstractC13319z7) {
        this.f43476yj = null;
        this.f43465k4 = i;
        this.f43474x1 = abstractC13883dt;
        this.f43466kk = c13058k1;
        this.f43471to = abstractC13319z7;
        this.f43476yj = C9483k4.m46681x1();
    }

    /* JADX INFO: renamed from: du */
    private C13940my m60106du() {
        AbstractC13901ga abstractC13901gaCreateTextNode;
        AbstractC13912i5 abstractC13912i5 = this.f43462h4;
        C13940my c13940myCreateAttribute = this.f43467ks.createAttribute(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up());
        while (abstractC13912i5.mo65021dy()) {
            int iMo65028jd = abstractC13912i5.mo65028jd();
            if (iMo65028jd == 3) {
                abstractC13901gaCreateTextNode = this.f43467ks.createTextNode(abstractC13912i5.mo65042rv());
            } else {
                if (iMo65028jd != 5) {
                    throw C13987tw.m66198k4(abstractC13912i5.mo65028jd());
                }
                abstractC13901gaCreateTextNode = m60107h4();
            }
            c13940myCreateAttribute.appendChild(abstractC13901gaCreateTextNode);
        }
        return c13940myCreateAttribute;
    }

    /* JADX INFO: renamed from: h4 */
    private C13947nk m60107h4() {
        AbstractC13901ga abstractC13901gaCreateTextNode;
        C13947nk c13947nkCreateEntityReference = this.f43467ks.createEntityReference(this.f43462h4.mo65023fa());
        if (this.f43462h4.mo65027ix()) {
            this.f43462h4.mo65016b3();
            while (this.f43462h4.mo65021dy()) {
                int iMo65028jd = this.f43462h4.mo65028jd();
                if (iMo65028jd == 3) {
                    abstractC13901gaCreateTextNode = this.f43467ks.createTextNode(this.f43462h4.mo65042rv());
                } else {
                    if (iMo65028jd != 5) {
                        if (iMo65028jd != 16) {
                            throw C13987tw.m66198k4(this.f43462h4.mo65028jd());
                        }
                        if (c13947nkCreateEntityReference.getChildNodes().mo23932k4() == 0) {
                            c13947nkCreateEntityReference.appendChild(this.f43467ks.createTextNode(C14113y2.f47374k4));
                        }
                        return c13947nkCreateEntityReference;
                    }
                    abstractC13901gaCreateTextNode = m60107h4();
                }
                c13947nkCreateEntityReference.appendChild(abstractC13901gaCreateTextNode);
            }
        }
        return c13947nkCreateEntityReference;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m60112k4() {
        return this.f43465k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13322zd m60115kk() {
        return this.f43473up;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m60116to() {
        if (this.f43462h4.mo65058x6() > this.f43464jd) {
            if (this.f43470rv) {
                m60109k4(false);
            }
            return true;
        }
        if (this.f43462h4.mo65028jd() == 1) {
            if (this.f43458ck.mo60153k4(this.f43462h4.mo65060yj(), this.f43462h4.mo65023fa(), this.f43462h4.mo65050up())) {
                this.f43459du.mo65708kk();
                if (this.f43462h4.mo65035kk()) {
                    do {
                        this.f43458ck.mo60150k4(this.f43462h4.mo65060yj(), this.f43462h4.mo65023fa(), this.f43462h4.mo65050up(), this.f43462h4.mo65042rv());
                        if (C13851ai.m65152k4(this.f43462h4.mo65050up(), this.f43466kk.f43916du) && this.f43460dy) {
                            this.f43459du.mo65707k4(this.f43462h4.mo65060yj().length() == 0 ? C14113y2.f47374k4 : this.f43462h4.mo65023fa(), this.f43462h4.mo65042rv());
                        }
                    } while (this.f43462h4.mo65047to());
                    this.f43462h4.mo65020du();
                }
                this.f43458ck.mo60155x1();
                if (this.f43462h4.mo65048u4()) {
                    this.f43459du.mo65709to();
                    this.f43458ck.mo60154kk();
                    if (this.f43462h4.mo65058x6() == this.f43457c5) {
                        return false;
                    }
                } else if (!this.f43458ck.mo60152k4()) {
                    this.f43464jd = this.f43462h4.mo65058x6();
                    this.f43470rv = true;
                    if (this.f43469ne == null) {
                        this.f43469ne = new C13950o3(this.f43474x1);
                        this.f43463ix = this.f43474x1.mo65266k4("xmlns");
                    }
                    m60109k4(true);
                }
            } else if (!this.f43462h4.mo65048u4()) {
                this.f43464jd = this.f43462h4.mo65058x6();
                this.f43470rv = false;
            }
        } else if (this.f43462h4.mo65028jd() == 3) {
            if (!this.f43472u4.m66334k4(this.f43462h4.mo65042rv())) {
                this.f43458ck.mo60149k4(this.f43462h4.mo65042rv());
            }
        } else if (this.f43462h4.mo65028jd() != 5 && this.f43462h4.mo65028jd() != 14 && this.f43462h4.mo65028jd() != 4) {
            if (this.f43462h4.mo65028jd() == 15) {
                if (this.f43462h4.mo65058x6() == this.f43464jd) {
                    if (this.f43470rv) {
                        AbstractC13911hq childNodes = this.f43475x6.getChildNodes();
                        AbstractC13901ga[] abstractC13901gaArr = new AbstractC13901ga[childNodes.mo23932k4()];
                        for (int i = 0; i < childNodes.mo23932k4(); i++) {
                            abstractC13901gaArr[i] = childNodes.m65457kk(i);
                        }
                        this.f43458ck.mo60151k4(abstractC13901gaArr);
                        this.f43459du.mo65709to();
                        this.f43458ck.mo60154kk();
                    }
                    this.f43464jd = Integer.MAX_VALUE;
                } else {
                    this.f43459du.mo65709to();
                    this.f43458ck.mo60154kk();
                }
                if (this.f43462h4.mo65058x6() == this.f43457c5) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13282xc m60117x1() {
        return this.f43461fa;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c3 -> B:19:0x0072). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C13981tl m60111x1(boolean z) {
        C13940my c13940myM60108k4;
        AbstractC13912i5 abstractC13912i5 = this.f43462h4;
        boolean zMo65048u4 = abstractC13912i5.mo65048u4();
        C13981tl c13981tlCreateElement = this.f43467ks.createElement(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up());
        c13981tlCreateElement.m65915x1(zMo65048u4);
        if (z) {
            this.f43475x6 = c13981tlCreateElement;
            return c13981tlCreateElement;
        }
        C13857b1 attributes = c13981tlCreateElement.getAttributes();
        if (abstractC13912i5.mo65035kk()) {
            do {
                if (C13851ai.m65152k4(abstractC13912i5.mo65050up(), this.f43466kk.f43916du)) {
                    this.f43469ne.mo65707k4(abstractC13912i5.mo65060yj().length() == 0 ? C14113y2.f47374k4 : this.f43462h4.mo65023fa(), this.f43462h4.mo65042rv());
                }
                attributes.m65175x1(m60106du());
            } while (abstractC13912i5.mo65047to());
        }
        abstractC13912i5.mo65020du();
        String strMo13292k4 = this.f43469ne.mo13292k4(abstractC13912i5.mo65060yj());
        if (strMo13292k4 != null) {
            if (strMo13292k4.length() == 0) {
                String strMo13292k42 = this.f43459du.mo13292k4(abstractC13912i5.mo65060yj());
                if (!C14113y2.m67363du(strMo13292k42, C14113y2.f47374k4)) {
                    c13940myM60108k4 = m60108k4(abstractC13912i5.mo65060yj(), strMo13292k42);
                }
            }
            while (abstractC13912i5.mo65047to()) {
                if (abstractC13912i5.mo65060yj().length() != 0 && this.f43469ne.mo13292k4(abstractC13912i5.mo65060yj()) == null) {
                    c13940myM60108k4 = m60108k4(abstractC13912i5.mo65060yj(), this.f43459du.mo13292k4(abstractC13912i5.mo65060yj()));
                }
            }
            abstractC13912i5.mo65020du();
            this.f43475x6.appendChild(c13981tlCreateElement);
            if (!abstractC13912i5.mo65048u4()) {
                this.f43475x6 = c13981tlCreateElement;
            }
            return c13981tlCreateElement;
        }
        c13940myM60108k4 = m60108k4(abstractC13912i5.mo65060yj(), this.f43459du.mo13292k4(abstractC13912i5.mo65060yj()));
        attributes.m65175x1(c13940myM60108k4);
        while (abstractC13912i5.mo65047to()) {
        }
        abstractC13912i5.mo65020du();
        this.f43475x6.appendChild(c13981tlCreateElement);
        if (!abstractC13912i5.mo65048u4()) {
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m60113k4(AbstractC13912i5 abstractC13912i5, String str) {
        m60118x1(abstractC13912i5, str);
        while (m60116to() && abstractC13912i5.mo65026h4()) {
        }
        return m60112k4();
    }

    /* JADX INFO: renamed from: k4 */
    private C13940my m60108k4(String str, String str2) {
        C13940my c13940myCreateAttribute = str.length() == 0 ? this.f43467ks.createAttribute(C14113y2.f47374k4, this.f43463ix, "http://www.w3.org/2000/xmlns/") : this.f43467ks.createAttribute(this.f43463ix, str, "http://www.w3.org/2000/xmlns/");
        c13940myCreateAttribute.appendChild(this.f43467ks.createTextNode(str2));
        this.f43469ne.mo65707k4(str, str2);
        return c13940myCreateAttribute;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60118x1(AbstractC13912i5 abstractC13912i5, String str) {
        this.f43462h4 = abstractC13912i5;
        this.f43468m9 = C14004w6.m66285k4(abstractC13912i5);
        C13950o3 c13950o3Mo65017bz = abstractC13912i5.mo65017bz();
        this.f43459du = c13950o3Mo65017bz;
        if (c13950o3Mo65017bz == null) {
            this.f43459du = new C13950o3(this.f43474x1);
            this.f43460dy = true;
        } else {
            this.f43460dy = false;
        }
        while (abstractC13912i5.mo65028jd() != 1 && abstractC13912i5.mo65026h4()) {
        }
        this.f43464jd = Integer.MAX_VALUE;
        this.f43457c5 = abstractC13912i5.mo65058x6();
        String[] strArr = {null};
        boolean zM60110k4 = m60110k4(this.f43466kk.m61014k4(abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up()), strArr);
        String str2 = strArr[0];
        if (!zM60110k4) {
            throw new XmlSchemaException(str2, abstractC13912i5.mo65040ne(), this.f43468m9.ah_(), this.f43468m9.ai_());
        }
        if (this.f43465k4 == 3) {
            C13282xc c13282xc = new C13282xc();
            this.f43461fa = c13282xc;
            c13282xc.m61709k4(new C14062gk(abstractC13912i5.mo65040ne(), 0));
            this.f43458ck = new C13042j0(abstractC13912i5, this.f43459du, this.f43461fa, this.f43474x1, this.f43466kk, this.f43471to);
            return;
        }
        C13322zd c13322zd = new C13322zd();
        this.f43473up = c13322zd;
        c13322zd.m61881k4(2);
        C13206so c13206so = new C13206so(abstractC13912i5, this.f43459du, this.f43473up, str, this.f43474x1, this.f43466kk, this.f43471to);
        this.f43458ck = c13206so;
        c13206so.m61591k4(this.f43476yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60114k4(AbstractC13943n5 abstractC13943n5) {
        this.f43476yj = abstractC13943n5;
    }

    /* JADX INFO: renamed from: k4 */
    private void m60109k4(boolean z) {
        int iMo65028jd = this.f43462h4.mo65028jd();
        if (iMo65028jd == 1) {
            this.f43469ne.mo65708kk();
            m60111x1(z);
            return;
        }
        if (iMo65028jd == 3) {
            this.f43475x6.appendChild(this.f43467ks.createTextNode(this.f43462h4.mo65042rv()));
            return;
        }
        if (iMo65028jd == 4) {
            this.f43475x6.appendChild(this.f43467ks.createCDataSection(this.f43462h4.mo65042rv()));
            return;
        }
        if (iMo65028jd == 5) {
            this.f43475x6.appendChild(this.f43467ks.createEntityReference(this.f43462h4.mo65019ck()));
            return;
        }
        if (iMo65028jd == 7) {
            this.f43475x6.appendChild(this.f43467ks.createProcessingInstruction(this.f43462h4.mo65019ck(), this.f43462h4.mo65042rv()));
            return;
        }
        if (iMo65028jd == 8) {
            this.f43475x6.appendChild(this.f43467ks.createComment(this.f43462h4.mo65042rv()));
            return;
        }
        switch (iMo65028jd) {
            case 13:
            case 16:
                break;
            case 14:
                this.f43475x6.appendChild(this.f43467ks.createSignificantWhitespace(this.f43462h4.mo65042rv()));
                break;
            case 15:
                this.f43469ne.mo65709to();
                this.f43475x6 = this.f43475x6.getParentNode();
                break;
            default:
                this.f43475x6.appendChild(null);
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m60110k4(int i, String[] strArr) {
        strArr[0] = null;
        if (this.f43465k4 == 0) {
            this.f43465k4 = i;
        }
        if (i == 0 || i == 1) {
            strArr[0] = "Expected Schema root. Make sure the root element is <Schema> and the namespace is 'http://www.w3.org/2001/XMLSchema' for an XSD Schema or 'urn:schemas-microsoft-com:xml-data' for an XDR Schema.";
            if (this.f43465k4 == 3) {
                strArr[0] = "The root element of a W3C XML Schema should be <Schema> and its namespace should be 'http://www.w3.org/2001/XMLSchema'.";
            }
            return false;
        }
        if (i == 2) {
            int i2 = this.f43465k4;
            if (i2 == 3) {
                strArr[0] = "'XmlSchemaSet' can load only W3C XML Schemas.";
                return false;
            }
            if (i2 != 2) {
                strArr[0] = "Different Schema types cannot be mixed.";
                return false;
            }
        } else if (i == 3 && this.f43465k4 != 3) {
            strArr[0] = "Different Schema types cannot be mixed.";
            return false;
        }
        return true;
    }
}

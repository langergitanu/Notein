package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.providers.oauth2.OpenIdProviderConfiguration;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.x5 */
/* JADX INFO: loaded from: classes.dex */
public class C5976x5 extends AbstractC5920ca {

    /* JADX INFO: renamed from: x1 */
    private AbstractC14068j5[] f16871x1 = {C7019kk.m27443k4((Class<?>) XmlDocument.class)};

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5[] f16869kk = {C7019kk.m27443k4((Class<?>) XmlDocument.class)};

    /* JADX INFO: renamed from: to */
    private C13950o3 f16870to = null;

    /* JADX INFO: renamed from: du */
    private XmlDocument f16867du = null;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC5963ts f16868h4 = null;

    public C5976x5() {
        m23931x1("urn:mpeg:mpeg21:2003:01-REL-R-NS:licenseTransform");
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: c5 */
    public Object mo23909c5() {
        return this.f16867du;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: dy */
    public AbstractC13911hq mo23912dy() {
        return null;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23920k4(AbstractC13911hq abstractC13911hq) {
        if (abstractC13911hq != null && abstractC13911hq.mo23932k4() > 0) {
            throw new CryptographicException("Unknown transform has been encountered.");
        }
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: m9 */
    public AbstractC14068j5[] mo23927m9() {
        return this.f16871x1;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: x1 */
    public Object mo23930x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) XmlDocument.class) || abstractC14068j5.m66749k4(C7019kk.m27443k4((Class<?>) XmlDocument.class))) {
            return mo23909c5();
        }
        throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
    }

    /* JADX INFO: renamed from: k4 */
    private void m24137k4(AbstractC13911hq abstractC13911hq, InterfaceC5963ts interfaceC5963ts) throws Throwable {
        AbstractC3150x6 abstractC3150x6M24120k4;
        C3148wl c3148wl;
        int iMo23932k4 = abstractC13911hq.mo23932k4();
        for (int i = 0; i < iMo23932k4; i++) {
            C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hq.m65457kk(i).selectSingleNode("//r:encryptedGrant/enc:EncryptionMethod", this.f16870to), C13981tl.class);
            C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hq.m65457kk(i).selectSingleNode("//r:encryptedGrant/dsig:KeyInfo", this.f16870to), C13981tl.class);
            C13981tl c13981tl3 = (C13981tl) C7019kk.m27452k4((Object) abstractC13911hq.m65457kk(i).selectSingleNode("//r:encryptedGrant/enc:CipherData", this.f16870to), C13981tl.class);
            if (c13981tl != null && c13981tl2 != null && c13981tl3 != null) {
                C5914b3 c5914b3 = new C5914b3();
                C5925e0 c5925e0 = new C5925e0();
                C5977x6 c5977x6 = new C5977x6();
                c5914b3.m23885k4(c13981tl);
                c5925e0.m23943k4(c13981tl2);
                c5977x6.m24140k4(c13981tl3);
                C3152yj c3152yj = null;
                try {
                    C3152yj c3152yj2 = new C3152yj(c5977x6.m24141x1());
                    try {
                        abstractC3150x6M24120k4 = this.f16868h4.m24120k4(c5914b3, c5925e0, c3152yj2);
                        if (abstractC3150x6M24120k4 != null) {
                            try {
                                if (abstractC3150x6M24120k4.getLength() != 0) {
                                    c3148wl = new C3148wl(abstractC3150x6M24120k4);
                                    try {
                                        abstractC13911hq.m65457kk(i).getParentNode().setInnerXml(c3148wl.mo13427dy());
                                        c3152yj2.close();
                                        abstractC3150x6M24120k4.close();
                                        c3148wl.mo13059to();
                                    } catch (Throwable th) {
                                        th = th;
                                        c3152yj = c3152yj2;
                                        if (c3152yj != null) {
                                            c3152yj.close();
                                        }
                                        if (abstractC3150x6M24120k4 != null) {
                                            abstractC3150x6M24120k4.close();
                                        }
                                        if (c3148wl != null) {
                                            c3148wl.mo13059to();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c3148wl = null;
                            }
                        }
                        throw new CryptographicException("Unable to decrypt grant content.");
                    } catch (Throwable th3) {
                        th = th3;
                        abstractC3150x6M24120k4 = null;
                        c3148wl = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    abstractC3150x6M24120k4 = null;
                    c3148wl = null;
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23922k4(Object obj) throws Throwable {
        if (m23914jd() == null) {
            throw new CryptographicException("Null Context property encountered.");
        }
        XmlDocument xmlDocument = new XmlDocument();
        this.f16867du = xmlDocument;
        xmlDocument.setPreserveWhitespace(true);
        C13950o3 c13950o3 = new C13950o3(this.f16867du.getNameTable());
        this.f16870to = c13950o3;
        c13950o3.mo65707k4("dsig", "http://www.w3.org/2000/09/xmldsig#");
        this.f16870to.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
        this.f16870to.mo65707k4("r", "urn:mpeg:mpeg21:2003:01-REL-R-NS");
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) m23914jd().selectSingleNode("ancestor-or-self::r:issuer[1]", this.f16870to), C13981tl.class);
        if (c13981tl == null) {
            throw new CryptographicException("Issuer node is required.");
        }
        AbstractC13901ga abstractC13901ga = (AbstractC13901ga) C7019kk.m27452k4((Object) c13981tl.selectSingleNode("descendant-or-self::dsig:Signature[1]", this.f16870to), C13981tl.class);
        if (abstractC13901ga != null) {
            abstractC13901ga.getParentNode().removeChild(abstractC13901ga);
        }
        C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) c13981tl.selectSingleNode("ancestor-or-self::r:license[1]", this.f16870to), C13981tl.class);
        if (c13981tl2 == null) {
            throw new CryptographicException("License node is required.");
        }
        AbstractC13911hq abstractC13911hqSelectNodes = c13981tl2.selectNodes("descendant-or-self::r:license[1]/r:issuer", this.f16870to);
        int iMo23932k4 = abstractC13911hqSelectNodes.mo23932k4();
        for (int i = 0; i < iMo23932k4; i++) {
            if (abstractC13911hqSelectNodes.m65457kk(i) != c13981tl && OpenIdProviderConfiguration.SerializedNames.ISSUER.equals(abstractC13911hqSelectNodes.m65457kk(i).getLocalName()) && "urn:mpeg:mpeg21:2003:01-REL-R-NS".equals(abstractC13911hqSelectNodes.m65457kk(i).getNamespaceURI())) {
                abstractC13911hqSelectNodes.m65457kk(i).getParentNode().removeChild(abstractC13911hqSelectNodes.m65457kk(i));
            }
        }
        AbstractC13911hq abstractC13911hqSelectNodes2 = c13981tl2.selectNodes("/r:license/r:grant/r:encryptedGrant", this.f16870to);
        if (abstractC13911hqSelectNodes2.mo23932k4() > 0) {
            InterfaceC5963ts interfaceC5963ts = this.f16868h4;
            if (interfaceC5963ts == null) {
                throw new CryptographicException("IRelDecryptor is required.");
            }
            m24137k4(abstractC13911hqSelectNodes2, interfaceC5963ts);
        }
        this.f16867du.setInnerXml(c13981tl2.getOuterXml());
    }
}

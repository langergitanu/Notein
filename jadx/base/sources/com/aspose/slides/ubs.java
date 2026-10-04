package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p077d8.C3091u4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11724d4;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.internal.p482wr.C12247b3;
import com.aspose.slides.internal.p482wr.C12249c5;
import com.aspose.slides.internal.p482wr.C12251ck;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
class ubs {

    /* JADX INFO: renamed from: k4 */
    private qye f49296k4;

    /* JADX INFO: renamed from: kk */
    private IGenericList<com.aspose.slides.internal.p332p7.w6f> f49297kk;

    /* JADX INFO: renamed from: x1 */
    private psc f49298x1;

    /* JADX INFO: renamed from: du */
    private void m71632du(C11724d4 c11724d4, Presentation presentation) {
        if (c11724d4.m55314c5() == null) {
            return;
        }
        if (c11724d4.m55314c5().m55431up()) {
            m71640k4(c11724d4.m55314c5(), m71633k4(c11724d4.m55314c5().m55427x1()));
        }
        new C14354qo(c11724d4.m55314c5(), this.f49296k4).m69718k4(presentation);
    }

    /* JADX INFO: renamed from: k4 */
    private com.aspose.slides.internal.p332p7.w6f m71633k4(String str) {
        String strM67431to = C14113y2.m67431to(str, IOUtils.DIR_SEPARATOR_UNIX);
        com.aspose.slides.internal.p332p7.w6f w6fVar = null;
        for (int i = 0; i < this.f49297kk.size(); i++) {
            w6fVar = this.f49297kk.get_Item(i);
            if (C14113y2.m67363du(w6fVar.m43523x1(), strM67431to)) {
                return w6fVar;
            }
        }
        return w6fVar;
    }

    /* JADX INFO: renamed from: kk */
    private void m71642kk(C11724d4 c11724d4, Presentation presentation) {
        if (c11724d4.m55315ck() == null) {
            return;
        }
        if (c11724d4.m55315ck().m55431up()) {
            m71640k4(c11724d4.m55315ck(), m71633k4(c11724d4.m55315ck().m55427x1()));
        }
        new fzv(c11724d4.m55315ck(), this.f49296k4).m6399k4(presentation);
    }

    /* JADX INFO: renamed from: to */
    private void m71644to(C11724d4 c11724d4, Presentation presentation) {
        if (c11724d4.m55317fa() == null) {
            return;
        }
        if (c11724d4.m55317fa().m55431up()) {
            m71640k4(c11724d4.m55317fa(), m71633k4(c11724d4.m55317fa().m55427x1()));
        }
        new hj7(c11724d4.m55317fa(), this.f49296k4).m7213k4(presentation);
    }

    /* JADX INFO: renamed from: x1 */
    private void m71645x1(C11724d4 c11724d4, Presentation presentation) {
        if (c11724d4.m55318jd() == null) {
            return;
        }
        if (c11724d4.m55318jd().m55431up()) {
            m71640k4(c11724d4.m55318jd(), m71633k4(c11724d4.m55318jd().m55427x1()));
        }
        new coj(c11724d4.m55318jd(), this.f49296k4).m4696k4(presentation.getDocumentProperties());
    }

    /* JADX INFO: renamed from: k4 */
    public static C11724d4 m71634k4(AbstractC3150x6 abstractC3150x6) {
        C11724d4 c11724d4 = new C11724d4();
        try {
            XmlDocument xmlDocument = new XmlDocument();
            AbstractC13901ga abstractC13901gaM65457kk = null;
            xmlDocument.setXmlResolver(null);
            xmlDocument.load(abstractC3150x6);
            C13940my c13940myM65165k4 = xmlDocument.getElementsByTagName("office:document").m65457kk(0).getAttributes().m65165k4("office:mimetype");
            if (c13940myM65165k4 == null || !C14113y2.m67363du("application/vnd.oasis.opendocument.presentation", c13940myM65165k4.getValue())) {
                throw new PptxUnsupportedFormatException("Unknown file format.");
            }
            XmlDocument xmlDocument2 = new XmlDocument();
            xmlDocument2.setXmlResolver(null);
            AbstractC13911hq elementsByTagName = xmlDocument.getElementsByTagName("office:meta");
            if (elementsByTagName.mo23932k4() > 0) {
                C13981tl c13981tlCreateElement = xmlDocument2.createElement("document-meta");
                c13981tlCreateElement.setInnerXml(elementsByTagName.m65457kk(0).getOuterXml());
                c11724d4.m55320k4(C14113y2.m67402k4("/{0}", "meta.xml"), "text/xml", AbstractC6747ar.m26635ix().mo26677to(c13981tlCreateElement.getOuterXml()));
            }
            AbstractC13911hq elementsByTagName2 = xmlDocument.getElementsByTagName("office:settings");
            if (elementsByTagName2.mo23932k4() > 0) {
                C13981tl c13981tlCreateElement2 = xmlDocument2.createElement("document-settings");
                c13981tlCreateElement2.setInnerXml(elementsByTagName2.m65457kk(0).getOuterXml());
                c11724d4.m55320k4(C14113y2.m67402k4("/{0}", "settings.xml"), "text/xml", AbstractC6747ar.m26635ix().mo26677to(c13981tlCreateElement2.getOuterXml()));
            }
            AbstractC13911hq elementsByTagName3 = xmlDocument.getElementsByTagName("office:styles");
            if (elementsByTagName3.mo23932k4() > 0) {
                C6765kp c6765kp = new C6765kp(elementsByTagName3.m65457kk(0).getOuterXml());
                AbstractC13911hq elementsByTagName4 = xmlDocument.getElementsByTagName("office:automatic-styles");
                if (elementsByTagName4.mo23932k4() > 0) {
                    abstractC13901gaM65457kk = elementsByTagName4.m65457kk(0);
                    c6765kp.m26804kk();
                    c6765kp.m26792k4(elementsByTagName4.m65457kk(0).getOuterXml());
                }
                AbstractC13911hq elementsByTagName5 = xmlDocument.getElementsByTagName("office:master-styles");
                if (elementsByTagName5.mo23932k4() > 0) {
                    c6765kp.m26804kk();
                    c6765kp.m26792k4(elementsByTagName5.m65457kk(0).getOuterXml());
                }
                C13981tl c13981tlCreateElement3 = xmlDocument2.createElement("document-styles");
                c13981tlCreateElement3.setInnerXml(c6765kp.toString());
                c11724d4.m55320k4(C14113y2.m67402k4("/{0}", "styles.xml"), "text/xml", AbstractC6747ar.m26635ix().mo26677to(c13981tlCreateElement3.getOuterXml()));
            }
            AbstractC13911hq elementsByTagName6 = xmlDocument.getElementsByTagName("office:body");
            if (elementsByTagName6.mo23932k4() > 0) {
                C13981tl c13981tlCreateElement4 = xmlDocument2.createElement("document-content");
                C6765kp c6765kp2 = new C6765kp();
                if (abstractC13901gaM65457kk != null) {
                    c6765kp2.m26792k4(abstractC13901gaM65457kk.getOuterXml());
                    c6765kp2.m26804kk();
                }
                c6765kp2.m26792k4(elementsByTagName6.m65457kk(0).getOuterXml());
                c13981tlCreateElement4.setInnerXml(c6765kp2.toString());
                c11724d4.m55320k4(C14113y2.m67402k4("/{0}", "content.xml"), "text/xml", AbstractC6747ar.m26635ix().mo26677to(c13981tlCreateElement4.getOuterXml()));
            }
            return c11724d4;
        } catch (RuntimeException e) {
            if (C7019kk.m27469x1(e, PptxUnsupportedFormatException.class)) {
                throw e;
            }
            throw new PptxReadException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m71643kk(AbstractC3150x6 abstractC3150x6) {
        try {
            XmlDocument xmlDocument = new XmlDocument();
            xmlDocument.setXmlResolver(null);
            abstractC3150x6.seek(0L, 0);
            C12275wy c12275wyM57431k4 = C12275wy.m57431k4(abstractC3150x6);
            try {
                C12262lr c12262lrM57505x1 = c12275wyM57431k4.m57505x1("META-INF/manifest.xml");
                if (c12262lrM57505x1 == null) {
                    c12275wyM57431k4.dispose();
                    return false;
                }
                C3152yj c3152yj = new C3152yj();
                try {
                    c12262lrM57505x1.m57338k4(c3152yj);
                    c3152yj.seek(0L, 0);
                    xmlDocument.load(c3152yj);
                    c12275wyM57431k4.dispose();
                    C13950o3 c13950o3 = new C13950o3(xmlDocument.getNameTable());
                    c13950o3.mo65707k4("manifest", "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0");
                    AbstractC13911hq abstractC13911hqSelectNodes = xmlDocument.selectNodes("/manifest:manifest/manifest:file-entry[@manifest:full-path=\"content.xml\"]/manifest:encryption-data", c13950o3);
                    return abstractC13911hqSelectNodes != null && abstractC13911hqSelectNodes.mo23932k4() > 0;
                } finally {
                    c3152yj.dispose();
                }
            } catch (Throwable th) {
                if (c12275wyM57431k4 != null) {
                    c12275wyM57431k4.dispose();
                }
                throw th;
            }
        } catch (RuntimeException e) {
            throw new OdpReadException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m71646x1(C11724d4 c11724d4, qye qyeVar) {
        for (C11839vw c11839vw : c11724d4.m55327x1("/Object ")) {
            qyeVar.m69957to().throwIfInterruptionRequested();
            if (c11839vw.m55431up()) {
                m71640k4(c11839vw, m71633k4(c11839vw.m55427x1()));
            }
            qyeVar.m69947h4().addItem(c11839vw);
        }
        for (C11839vw c11839vw2 : c11724d4.m55327x1("/Media")) {
            if (!c11839vw2.m55413c5()) {
                qyeVar.m69957to().throwIfInterruptionRequested();
                if (c11839vw2.m55431up()) {
                    m71640k4(c11839vw2, m71633k4(c11839vw2.m55427x1()));
                }
                qyeVar.m69947h4().addItem(c11839vw2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m71635k4(Presentation presentation) {
        int i;
        for (int i2 = 0; i2 < this.f49296k4.m69956m9().size(); i2++) {
            Hyperlink hyperlink = this.f49296k4.m69956m9().get_Item(i2);
            if (hyperlink.m1698m9() != null && hyperlink.m1698m9().length() > 0) {
                String[] strArrM67414k4 = C14113y2.m67414k4(hyperlink.m1698m9(), ControlChar.SPACE_CHAR);
                if (strArrM67414k4.length == 2) {
                    int[] iArr = {0};
                    IThemeable iThemeable = (!(C14057f9.m66590k4(strArrM67414k4[1], iArr) && iArr[0] > 0) || (i = iArr[0] - 1) >= presentation.getSlides().size()) ? null : (BaseSlide) presentation.getSlides().get_Item(i);
                    if (iThemeable != null) {
                        hyperlink.m1699to().m4794k4((ISlide) iThemeable);
                    } else if (C14113y2.m67448x1(hyperlink.m1698m9(), "#")) {
                        hyperlink.m1695k4((String) null);
                        hyperlink.m1696k4(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m71647x1(AbstractC3150x6 abstractC3150x6) {
        return m71641k4(abstractC3150x6, new int[]{0});
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71648k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, final InterruptionToken interruptionToken, boolean z) {
        C11724d4 c11724d4M71634k4 = z ? m71634k4(abstractC3150x6) : new C11724d4(abstractC3150x6, new AbstractC3174jd() { // from class: com.aspose.slides.ubs.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(interruptionToken) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
            }

            @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
            /* JADX INFO: renamed from: k4 */
            public void mo4791k4() {
                interruptionToken.throwIfInterruptionRequested();
            }
        });
        this.f49296k4 = new qye(presentation, interruptionToken);
        presentation.f3084k4 = 2;
        presentation.m2351fa().m68366k4(0);
        if (presentation.m2349du().m1923x1()) {
            this.f49298x1 = new psc(presentation.m2349du().getPassword());
        }
        m71638k4(c11724d4M71634k4, presentation);
        m71645x1(c11724d4M71634k4, presentation);
        m71639k4(c11724d4M71634k4, this.f49296k4);
        m71646x1(c11724d4M71634k4, this.f49296k4);
        m71642kk(c11724d4M71634k4, presentation);
        m71644to(c11724d4M71634k4, presentation);
        m71632du(c11724d4M71634k4, presentation);
        m71635k4(presentation);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71636k4(AbstractC3150x6 abstractC3150x6, String str, String str2, String str3) {
        if (C14113y2.m67411k4(str)) {
            throw new InvalidDataException(C14113y2.m67402k4("A checksum type is not specified for decrypting the package part '{0}'.", str3));
        }
        if (C14113y2.m67411k4(str2)) {
            throw new InvalidDataException(C14113y2.m67402k4("Checksum is not specified for decrypting the package part '{0}'.", str3));
        }
        if (str3 == null) {
            throw new ArgumentNullException("fileName");
        }
        if (C14113y2.m67363du(str3, C14113y2.f47374k4)) {
            throw new ArgumentException("A file name of a package part is not specified.", "fileName");
        }
        if (!C14113y2.m67363du(C14080ne.m66952k4(this.f49298x1.m69225k4(abstractC3150x6, str)), str2)) {
            throw new InvalidDataException(C14113y2.m67402k4("Data checksum is not match for the package part {0}.", str3));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71637k4(com.aspose.slides.internal.p332p7.w6f w6fVar) {
        com.aspose.slides.internal.p332p7.ks6 ks6VarM43522to = w6fVar.m43522to();
        if (ks6VarM43522to == null || ks6VarM43522to.m35677to() == null || ks6VarM43522to.m35673h4() == null || ks6VarM43522to.m35672du() == null) {
            throw new InvalidDataException(C14113y2.m67402k4("Encryption data is not found or not completed for decrypting the package part '{0}'.", w6fVar.m43523x1()));
        }
        if (!"http://www.w3.org/2001/04/xmlenc#aes256-cbc".equals(ks6VarM43522to.m35677to().m45007k4())) {
            throw new NotSupportedException(C14113y2.m67402k4("Encryption algorithm '{0}' is not supported for decrypting the package part '{1}'.", ks6VarM43522to.m35677to().m45007k4(), w6fVar.m43523x1()));
        }
        if (C14113y2.m67411k4(ks6VarM43522to.m35677to().m45009x1())) {
            throw new InvalidDataException(C14113y2.m67402k4("Initialisation vector is not specified for decrypting the package part '{0}'.", w6fVar.m43523x1()));
        }
        if (C14113y2.m67411k4(ks6VarM43522to.m35672du().m36418k4())) {
            throw new NotSupportedException(C14113y2.m67402k4("Start key generation name is not specified for decrypting the package part '{0}'.", w6fVar.m43523x1()));
        }
        if (!"PBKDF2".equals(ks6VarM43522to.m35673h4().m29677k4())) {
            throw new NotSupportedException(C14113y2.m67402k4("Key derivation name '{0}' is not supported for decrypting the package part '{1}'.", ks6VarM43522to.m35673h4().m29677k4(), w6fVar.m43523x1()));
        }
        if (C14113y2.m67411k4(ks6VarM43522to.m35673h4().m29682x1())) {
            throw new InvalidDataException(C14113y2.m67402k4("Salt is not specified for decrypting the package part '{0}'.", w6fVar.m43523x1()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71638k4(C11724d4 c11724d4, Presentation presentation) {
        if (c11724d4.m55316dy() == null) {
            return;
        }
        this.f49297kk = new List();
        new bvr(c11724d4.m55316dy(), this.f49296k4, this.f49297kk).m4324k4(presentation);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71639k4(C11724d4 c11724d4, qye qyeVar) {
        for (C11839vw c11839vw : c11724d4.m55327x1("/Pictures")) {
            qyeVar.m69957to().throwIfInterruptionRequested();
            if (c11839vw.m55431up()) {
                m71640k4(c11839vw, m71633k4(c11839vw.m55427x1()));
            }
            try {
                qyeVar.m69948k4(c11839vw);
            } catch (ArgumentException unused) {
                qyeVar.m69954k4(C14113y2.m67402k4("Unexpected content: {0}", c11839vw.m55427x1()), 99);
            }
        }
        if (qyeVar.m69945du().size() == 0) {
            for (C11839vw c11839vw2 : c11724d4.m55327x1("/media")) {
                qyeVar.m69957to().throwIfInterruptionRequested();
                if (c11839vw2.m55431up()) {
                    m71640k4(c11839vw2, m71633k4(c11839vw2.m55427x1()));
                }
                try {
                    qyeVar.m69948k4(c11839vw2);
                } catch (ArgumentException unused2) {
                    qyeVar.m69954k4(C14113y2.m67402k4("Unexpected content: {0}", c11839vw2.m55427x1()), 99);
                }
            }
        }
        for (C11839vw c11839vw3 : c11724d4.m55327x1("/ObjectReplacements")) {
            if (c11839vw3.m55431up()) {
                m71640k4(c11839vw3, m71633k4(c11839vw3.m55427x1()));
            }
            try {
                qyeVar.m69948k4(c11839vw3);
            } catch (ArgumentException unused3) {
                qyeVar.m69954k4(C14113y2.m67402k4("Unexpected content: {0}", c11839vw3.m55427x1()), 99);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71640k4(C11839vw c11839vw, com.aspose.slides.internal.p332p7.w6f w6fVar) {
        if (this.f49298x1 == null) {
            throw new OdpReadException("Some file content was encrypted, a password is required.");
        }
        m71637k4(w6fVar);
        com.aspose.slides.internal.p332p7.ks6 ks6VarM43522to = w6fVar.m43522to();
        int iM43521kk = (int) w6fVar.m43521kk();
        byte[] bArr = new byte[iM43521kk];
        byte[] bArrM66934jd = C14080ne.m66934jd(ks6VarM43522to.m35673h4().m29682x1());
        byte[] bArrM66934jd2 = C14080ne.m66934jd(ks6VarM43522to.m35677to().m45009x1());
        this.f49298x1.m69224k4(ks6VarM43522to.m35672du().m36418k4());
        this.f49298x1.m69230x1((int) ks6VarM43522to.m35673h4().m29681to());
        this.f49298x1.m69223k4((int) ks6VarM43522to.m35673h4().m29680kk());
        AbstractC3150x6 abstractC3150x6M69222k4 = this.f49298x1.m69222k4(c11839vw.m55426to(), bArrM66934jd, bArrM66934jd2);
        try {
            m71636k4(abstractC3150x6M69222k4, ks6VarM43522to.m35678x1(), ks6VarM43522to.m35676kk(), w6fVar.m43523x1());
            C12251ck c12251ck = new C12251ck(abstractC3150x6M69222k4, 1, true);
            try {
                if (c12251ck.read(bArr, 0, iM43521kk) != iM43521kk) {
                    throw new InvalidDataException(C14113y2.m67402k4("Data length is not match for the package part {0}.", c11839vw.m55427x1()));
                }
                c11839vw.m55423k4(bArr);
                c11839vw.m55432x1(false);
            } finally {
                c12251ck.dispose();
            }
        } finally {
            if (abstractC3150x6M69222k4 != null) {
                abstractC3150x6M69222k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m71641k4(AbstractC3150x6 abstractC3150x6, int[] iArr) {
        AbstractC3150x6 abstractC3150x6M13133k4 = C3091u4.m13133k4(abstractC3150x6);
        abstractC3150x6M13133k4.seek(0L, 0);
        try {
            C12275wy c12275wyM57434k4 = C12275wy.m57434k4(abstractC3150x6M13133k4, true);
            if (c12275wyM57434k4.m57505x1("mimetype") == null) {
                iArr[0] = 255;
                return false;
            }
            C12249c5 c12249c5M57327bv = c12275wyM57434k4.m57505x1("mimetype").m57327bv();
            try {
                byte[] bArr = new byte[(int) c12249c5M57327bv.getLength()];
                c12249c5M57327bv.read(bArr, 0, (int) c12249c5M57327bv.getLength());
                String strM26681x1 = AbstractC6747ar.m26644to(1252).m26681x1(bArr);
                if ("application/vnd.oasis.opendocument.presentation".equals(strM26681x1)) {
                    iArr[0] = 5;
                } else {
                    if (!"application/vnd.oasis.opendocument.presentation-template".equals(strM26681x1)) {
                        throw new PptUnsupportedFormatException("Not a Open Office presentation");
                    }
                    iArr[0] = 10;
                }
                c12249c5M57327bv.dispose();
                return true;
            } catch (Throwable th) {
                if (c12249c5M57327bv != null) {
                    c12249c5M57327bv.dispose();
                }
                throw th;
            }
        } catch (C12247b3 e) {
            throw new PptUnsupportedFormatException("Unknown file format.", e);
        }
    }
}

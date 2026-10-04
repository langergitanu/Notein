package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p118ex.C3823m9;
import com.aspose.slides.internal.p121f3.C3844k4;
import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.AbstractC4771y2;
import com.aspose.slides.internal.p174hz.AbstractC4778yw;
import com.aspose.slides.internal.p174hz.C4712em;
import com.aspose.slides.internal.p174hz.C4728k4;
import com.aspose.slides.internal.p174hz.C4740os;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.yd */
/* JADX INFO: loaded from: classes.dex */
public class C5982yd {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f16889ck = new C7017h4("http://www.w3.org/2001/04/xmlenc#des-cbc", "http://www.w3.org/2001/04/xmlenc#tripledes-cbc", "http://www.w3.org/2001/04/xmlenc#aes128-cbc", "http://www.w3.org/2001/04/xmlenc#aes192-cbc", "http://www.w3.org/2001/04/xmlenc#aes256-cbc");

    /* JADX INFO: renamed from: c5 */
    private int f16890c5;

    /* JADX INFO: renamed from: du */
    private int f16891du;

    /* JADX INFO: renamed from: dy */
    private String f16892dy;

    /* JADX INFO: renamed from: h4 */
    private int f16893h4;

    /* JADX INFO: renamed from: jd */
    private int f16894jd;

    /* JADX INFO: renamed from: k4 */
    private XmlDocument f16895k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13943n5 f16896kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC6747ar f16897m9;

    /* JADX INFO: renamed from: to */
    private Hashtable f16898to;

    /* JADX INFO: renamed from: x1 */
    private C3844k4 f16899x1;

    public C5982yd() {
        this(new XmlDocument());
    }

    /* JADX INFO: renamed from: to */
    private boolean m24159to() {
        return this.f16890c5 > m24160k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m24160k4() {
        return this.f16894jd;
    }

    /* JADX INFO: renamed from: kk */
    public final String m24166kk() {
        if (this.f16892dy == null) {
            this.f16892dy = C14113y2.f47374k4;
        }
        return this.f16892dy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public AbstractC4736my m24167x1(C5965um c5965um, String str) {
        C5916bv c5916bv;
        if (c5965um == null) {
            throw new ArgumentNullException("encryptedData");
        }
        if (c5965um.m24058jd() == null) {
            return null;
        }
        IEnumerator it = c5965um.m24058jd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C5929g8 c5929g8 = (C5929g8) C7019kk.m27452k4(it.next(), C5929g8.class);
            if (c5929g8 != null) {
                String strM23958k4 = c5929g8.m23958k4();
                if (((AbstractC4736my) this.f16898to.get_Item(strM23958k4)) != null) {
                    return (AbstractC4736my) this.f16898to.get_Item(strM23958k4);
                }
                C13950o3 c13950o3 = new C13950o3(this.f16895k4.getNameTable());
                c13950o3.mo65707k4("enc", "http://www.w3.org/2001/04/xmlenc#");
                AbstractC13911hq abstractC13911hqSelectNodes = this.f16895k4.selectNodes("//enc:EncryptedKey", c13950o3);
                if (abstractC13911hqSelectNodes != null) {
                    IEnumerator it2 = abstractC13911hqSelectNodes.iterator();
                    while (true) {
                        try {
                            if (!it2.hasNext()) {
                                c5916bv = null;
                                break;
                            }
                            C13981tl c13981tl = (C13981tl) C7019kk.m27452k4(it2.next(), C13981tl.class);
                            c5916bv = new C5916bv();
                            c5916bv.m23896k4(c13981tl);
                            if (C14113y2.m67363du(c5916bv.m23900x1(), strM23958k4) && C14113y2.m67363du(c5916bv.m23895k4(), m24166kk())) {
                                break;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it2).dispose();
                            }
                        }
                    }
                }
            } else {
                C5973wp c5973wp = (C5973wp) C7019kk.m27452k4(it.next(), C5973wp.class);
                if (c5973wp != null) {
                    String strM24000x1 = C5934he.m24000x1(c5973wp.m24134k4());
                    c5916bv = new C5916bv();
                    c5916bv.m23896k4(m24161k4(this.f16895k4, strM24000x1));
                    break;
                }
                C5952qm c5952qm = (C5952qm) C7019kk.m27452k4(it.next(), C5952qm.class);
                if (c5952qm != null) {
                    c5916bv = c5952qm.m24090k4();
                    break;
                }
            }
        }
        c5916bv = null;
        if (c5916bv == null) {
            return null;
        }
        if (str == null) {
            if (c5965um.m24051ck() == null) {
                throw new CryptographicException("Symmetric algorithm is not specified.");
            }
            str = c5965um.m24051ck().m23883k4();
        }
        byte[] bArrM24163k4 = m24163k4(c5916bv);
        if (bArrM24163k4 == null) {
            throw new CryptographicException("Unable to retrieve the decryption key.");
        }
        AbstractC4736my abstractC4736my = (AbstractC4736my) C5936ix.m24008k4(AbstractC4736my.class, str);
        if (abstractC4736my == null) {
            throw new CryptographicException("Symmetric algorithm is not specified.");
        }
        abstractC4736my.mo19688kk(bArrM24163k4);
        return abstractC4736my;
    }

    public C5982yd(XmlDocument xmlDocument) {
        this(xmlDocument, null);
    }

    /* JADX INFO: renamed from: k4 */
    public C13981tl m24161k4(XmlDocument xmlDocument, String str) {
        return C5984zj.m24185x1(xmlDocument, str);
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6747ar m24168x1() {
        return this.f16897m9;
    }

    public C5982yd(XmlDocument xmlDocument, C3844k4 c3844k4) {
        this.f16890c5 = 0;
        this.f16895k4 = xmlDocument;
        this.f16899x1 = c3844k4;
        this.f16896kk = null;
        this.f16891du = 5;
        this.f16893h4 = 1;
        this.f16897m9 = AbstractC6747ar.m26635ix();
        this.f16898to = new Hashtable(4);
        this.f16894jd = 20;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24162k4(C13981tl c13981tl, byte[] bArr) {
        if (c13981tl == null) {
            throw new ArgumentNullException("inputElement");
        }
        if (bArr == null) {
            throw new ArgumentNullException("decryptedData");
        }
        AbstractC13901ga parentNode = c13981tl.getParentNode();
        if (parentNode.getNodeType() != 9) {
            C13981tl c13981tlCreateElement = parentNode.getOwnerDocument().createElement(parentNode.getPrefix(), parentNode.getLocalName(), parentNode.getNamespaceURI());
            try {
                parentNode.appendChild(c13981tlCreateElement);
                c13981tlCreateElement.setInnerXml(this.f16897m9.m26681x1(bArr));
                AbstractC13901ga firstChild = c13981tlCreateElement.getFirstChild();
                AbstractC13901ga nextSibling = c13981tl.getNextSibling();
                while (firstChild != null) {
                    AbstractC13901ga nextSibling2 = firstChild.getNextSibling();
                    parentNode.insertBefore(firstChild, nextSibling);
                    firstChild = nextSibling2;
                }
                parentNode.removeChild(c13981tlCreateElement);
                parentNode.removeChild(c13981tl);
                return;
            } catch (Throwable th) {
                parentNode.removeChild(c13981tlCreateElement);
                throw th;
            }
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setPreserveWhitespace(true);
        C3144um c3144um = new C3144um(this.f16897m9.m26681x1(bArr));
        try {
            AbstractC13912i5 abstractC13912i5M65466k4 = AbstractC13912i5.m65466k4(c3144um, C5934he.m23974k4(this.f16896kk));
            try {
                xmlDocument.load(abstractC13912i5M65466k4);
                c3144um.dispose();
                AbstractC13901ga abstractC13901gaImportNode = c13981tl.getOwnerDocument().importNode(xmlDocument.getDocumentElement(), true);
                parentNode.removeChild(c13981tl);
                parentNode.appendChild(abstractC13901gaImportNode);
            } finally {
                if (abstractC13912i5M65466k4 != null) {
                    abstractC13912i5M65466k4.dispose();
                }
            }
        } catch (Throwable th2) {
            c3144um.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m24163k4(C5916bv c5916bv) {
        byte[] bArrM24163k4;
        if (c5916bv == null) {
            throw new ArgumentNullException("encryptedKey");
        }
        if (c5916bv.m24058jd() == null) {
            return null;
        }
        IEnumerator it = c5916bv.m24058jd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C5929g8 c5929g8 = (C5929g8) C7019kk.m27452k4(it.next(), C5929g8.class);
            boolean z = false;
            if (c5929g8 != null) {
                Object obj = this.f16898to.get_Item(c5929g8.m23958k4());
                if (obj != null) {
                    if (c5916bv.m24065up() == null || c5916bv.m24065up().m24141x1() == null) {
                        throw new CryptographicException("Symmetric algorithm is not specified.");
                    }
                    if (C7019kk.m27469x1(obj, AbstractC4736my.class)) {
                        return m24157k4(c5916bv.m24065up().m24141x1(), (AbstractC4736my) obj);
                    }
                    if (c5916bv.m24051ck() != null && "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p".equals(c5916bv.m24051ck().m23883k4())) {
                        z = true;
                    }
                    return m24158k4(c5916bv.m24065up().m24141x1(), (AbstractC4751tq) obj, z);
                }
            } else {
                C5958ss c5958ss = (C5958ss) C7019kk.m27452k4(it.next(), C5958ss.class);
                if (c5958ss != null) {
                    Iterator<T> it2 = C5934he.m23966k4(c5958ss, 1).iterator();
                    while (it2.hasNext()) {
                        AbstractC4751tq abstractC4751tqM52826dy = ((C3823m9) it2.next()).m15314bv().m52826dy();
                        if (abstractC4751tqM52826dy != null) {
                            try {
                                if (c5916bv.m24065up() == null || c5916bv.m24065up().m24141x1() == null) {
                                    throw new CryptographicException("Symmetric algorithm is not specified.");
                                }
                                if (c5916bv.m24051ck() != null && "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p".equals(c5916bv.m24051ck().m23883k4())) {
                                    z = true;
                                }
                                byte[] bArrM24158k4 = m24158k4(c5916bv.m24065up().m24141x1(), abstractC4751tqM52826dy, z);
                                abstractC4751tqM52826dy.dispose();
                                return bArrM24158k4;
                            } catch (Throwable th) {
                                abstractC4751tqM52826dy.dispose();
                                throw th;
                            }
                        }
                        if (abstractC4751tqM52826dy != null) {
                            abstractC4751tqM52826dy.dispose();
                        }
                    }
                } else {
                    C5973wp c5973wp = (C5973wp) C7019kk.m27452k4(it.next(), C5973wp.class);
                    if (c5973wp != null) {
                        String strM24000x1 = C5934he.m24000x1(c5973wp.m24134k4());
                        C5916bv c5916bv2 = new C5916bv();
                        c5916bv2.m23896k4(m24161k4(this.f16895k4, strM24000x1));
                        try {
                            this.f16890c5++;
                            if (m24159to()) {
                                throw new C5964u4();
                            }
                            return m24163k4(c5916bv2);
                        } finally {
                            this.f16890c5--;
                        }
                    }
                    C5952qm c5952qm = (C5952qm) C7019kk.m27452k4(it.next(), C5952qm.class);
                    if (c5952qm != null && (bArrM24163k4 = m24163k4(c5952qm.m24090k4())) != null) {
                        AbstractC4736my abstractC4736my = (AbstractC4736my) C5936ix.m24008k4(AbstractC4736my.class, c5916bv.m24051ck().m23883k4());
                        if (abstractC4736my == null) {
                            throw new CryptographicException("Symmetric algorithm is not specified.");
                        }
                        abstractC4736my.mo19688kk(bArrM24163k4);
                        if (c5916bv.m24065up() == null || c5916bv.m24065up().m24141x1() == null) {
                            throw new CryptographicException("Symmetric algorithm is not specified.");
                        }
                        abstractC4736my.mo19688kk(bArrM24163k4);
                        return m24157k4(c5916bv.m24065up().m24141x1(), abstractC4736my);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m24164k4(C5965um c5965um, AbstractC4736my abstractC4736my) {
        int length;
        if (c5965um == null) {
            throw new ArgumentNullException("encryptedData");
        }
        if (abstractC4736my == null) {
            throw new ArgumentNullException("symmetricAlgorithm");
        }
        byte[] bArrM24156k4 = m24156k4(c5965um.m24065up());
        int iM19684fa = abstractC4736my.m19684fa();
        int iM19694up = abstractC4736my.m19694up();
        byte[] bArrMo19685jd = abstractC4736my.mo19685jd();
        byte[] bArrM24165k4 = this.f16893h4 != 2 ? m24165k4(c5965um, (String) null) : null;
        if (bArrM24165k4 != null) {
            try {
                abstractC4736my.mo19692to(bArrM24165k4);
                length = bArrM24165k4.length;
            } catch (Throwable th) {
                abstractC4736my.m19687kk(iM19684fa);
                abstractC4736my.m19691to(iM19694up);
                abstractC4736my.mo19692to(bArrMo19685jd);
                throw th;
            }
        } else {
            length = 0;
        }
        abstractC4736my.m19687kk(this.f16893h4);
        abstractC4736my.m19691to(this.f16891du);
        byte[] bArrMo19564k4 = abstractC4736my.m19696yj().mo19564k4(bArrM24156k4, length, bArrM24156k4.length - length);
        abstractC4736my.m19687kk(iM19684fa);
        abstractC4736my.m19691to(iM19694up);
        abstractC4736my.mo19692to(bArrMo19685jd);
        return bArrMo19564k4;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m24165k4(C5965um c5965um, String str) {
        int i;
        if (c5965um == null) {
            throw new ArgumentNullException("encryptedData");
        }
        if (str == null) {
            if (c5965um.m24051ck() == null) {
                throw new CryptographicException("Symmetric algorithm is not specified.");
            }
            str = c5965um.m24051ck().m23883k4();
        }
        int iM27428k4 = f16889ck.m27428k4(str);
        if (iM27428k4 == 0 || iM27428k4 == 1) {
            i = 8;
        } else {
            if (iM27428k4 != 2 && iM27428k4 != 3 && iM27428k4 != 4) {
                throw new CryptographicException("The specified Uri is not supported.");
            }
            i = 16;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(m24156k4(c5965um.m24065up()), 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m24156k4(C5977x6 c5977x6) {
        AbstractC3150x6 abstractC3150x6M23887k4;
        if (c5977x6 == null) {
            throw new ArgumentNullException("cipherData");
        }
        if (c5977x6.m24141x1() != null) {
            return c5977x6.m24141x1();
        }
        if (c5977x6.m24138k4() == null) {
            throw new CryptographicException("Cipher data is not specified.");
        }
        if (c5977x6.m24138k4().m24073k4() != null) {
            return c5977x6.m24138k4().m24073k4();
        }
        if (c5977x6.m24138k4().m24130x1() == null) {
            throw new CryptographicException("The specified Uri is not supported.");
        }
        C3152yj c3152yj = null;
        if (c5977x6.m24138k4().m24130x1().length() == 0) {
            XmlDocument xmlDocument = this.f16895k4;
            String baseURI = xmlDocument == null ? null : xmlDocument.getBaseURI();
            C5915bs c5915bsM24127kk = c5977x6.m24138k4().m24127kk();
            if (c5915bsM24127kk == null) {
                throw new CryptographicException("The specified Uri is not supported.");
            }
            abstractC3150x6M23887k4 = c5915bsM24127kk.m23888k4(this.f16895k4, this.f16896kk, baseURI);
        } else {
            if (c5977x6.m24138k4().m24130x1().charAt(0) != '#') {
                throw new ArgumentNullException("Unable to resolve Uri {0}.", c5977x6.m24138k4().m24130x1());
            }
            C13981tl c13981tlM24161k4 = m24161k4(this.f16895k4, C5934he.m24000x1(c5977x6.m24138k4().m24130x1()));
            if (c13981tlM24161k4 == null || c13981tlM24161k4.getOuterXml() == null) {
                throw new CryptographicException("The specified Uri is not supported.");
            }
            C3152yj c3152yj2 = new C3152yj(this.f16897m9.mo26677to(c13981tlM24161k4.getOuterXml()));
            XmlDocument xmlDocument2 = this.f16895k4;
            String baseURI2 = xmlDocument2 != null ? xmlDocument2.getBaseURI() : null;
            C5915bs c5915bsM24127kk2 = c5977x6.m24138k4().m24127kk();
            if (c5915bsM24127kk2 == null) {
                throw new CryptographicException("The specified Uri is not supported.");
            }
            abstractC3150x6M23887k4 = c5915bsM24127kk2.m23887k4(c3152yj2, this.f16896kk, baseURI2);
            c3152yj = c3152yj2;
        }
        C3152yj c3152yj3 = new C3152yj();
        try {
            C5934he.m23965k4(abstractC3150x6M23887k4, c3152yj3);
            byte[] array = c3152yj3.toArray();
            if (c3152yj != null) {
                c3152yj.close();
            }
            abstractC3150x6M23887k4.close();
            c3152yj3.dispose();
            c5977x6.m24138k4().m24072k4(array);
            return array;
        } catch (Throwable th) {
            c3152yj3.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m24157k4(byte[] bArr, AbstractC4736my abstractC4736my) {
        if (bArr == null) {
            throw new ArgumentNullException("keyData");
        }
        if (abstractC4736my == null) {
            throw new ArgumentNullException("symmetricAlgorithm");
        }
        if (C7019kk.m27469x1(abstractC4736my, AbstractC4778yw.class)) {
            return C5955ri.m24095k4(abstractC4736my.mo19693to(), bArr);
        }
        if (C7019kk.m27469x1(abstractC4736my, AbstractC4771y2.class) || C7019kk.m27469x1(abstractC4736my, C4728k4.class)) {
            return C5955ri.m24096x1(abstractC4736my.mo19693to(), bArr);
        }
        throw new CryptographicException("The specified cryptographic transform is not supported.");
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m24158k4(byte[] bArr, AbstractC4751tq abstractC4751tq, boolean z) {
        if (bArr == null) {
            throw new ArgumentNullException("keyData");
        }
        if (abstractC4751tq != null) {
            return z ? new C4740os(abstractC4751tq).m19713k4(bArr) : new C4712em(abstractC4751tq).m19604k4(bArr);
        }
        throw new ArgumentNullException("rsa");
    }
}

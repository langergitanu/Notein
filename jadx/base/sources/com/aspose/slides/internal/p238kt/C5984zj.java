package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.ObjectModel.Collection;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p118ex.C3813ck;
import com.aspose.slides.internal.p118ex.C3815dy;
import com.aspose.slides.internal.p118ex.C3823m9;
import com.aspose.slides.internal.p118ex.C3828u4;
import com.aspose.slides.internal.p174hz.AbstractC4703bz;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4732lr;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4774yg;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.zj */
/* JADX INFO: loaded from: classes.dex */
public class C5984zj {

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f16901ix = new C7017h4("SHA1", "SHA256", "SHA384", "SHA512", "MD5", "RIPEMD160");

    /* JADX INFO: renamed from: ks */
    private static IGenericList<String> f16902ks;

    /* JADX INFO: renamed from: yj */
    private static IGenericList<String> f16903yj;

    /* JADX INFO: renamed from: k4 */
    protected C5951os f16911k4;

    /* JADX INFO: renamed from: to */
    private AbstractC4709du f16916to;

    /* JADX INFO: renamed from: up */
    private Collection<String> f16917up;

    /* JADX INFO: renamed from: du */
    private XmlDocument f16906du = null;

    /* JADX INFO: renamed from: h4 */
    private IEnumerator f16909h4 = null;

    /* JADX INFO: renamed from: m9 */
    private C3815dy f16913m9 = null;

    /* JADX INFO: renamed from: dy */
    private IEnumerator f16907dy = null;

    /* JADX INFO: renamed from: c5 */
    private boolean[] f16904c5 = null;

    /* JADX INFO: renamed from: jd */
    private int[] f16910jd = null;

    /* JADX INFO: renamed from: x1 */
    public AbstractC13943n5 f16918x1 = null;

    /* JADX INFO: renamed from: kk */
    public C13981tl f16912kk = null;

    /* JADX INFO: renamed from: ck */
    private boolean f16905ck = false;

    /* JADX INFO: renamed from: fa */
    private x1<C5984zj, Boolean> f16908fa = new C5911ai(this);

    /* JADX INFO: renamed from: rv */
    private C5982yd f16915rv = null;

    /* JADX INFO: renamed from: x6 */
    private boolean f16919x6 = false;

    /* JADX INFO: renamed from: ne */
    private byte[] f16914ne = null;

    /* JADX INFO: renamed from: com.aspose.slides.internal.kt.zj$k4 */
    public static class k4 implements Comparator {

        /* JADX INFO: renamed from: k4 */
        private ArrayList f16920k4 = null;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C5937j2 c5937j2 = (C5937j2) C7019kk.m27452k4(obj, C5937j2.class);
            C5937j2 c5937j22 = (C5937j2) C7019kk.m27452k4(obj2, C5937j2.class);
            IEnumerator it = m24206k4().iterator();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                try {
                    C5937j2 c5937j23 = (C5937j2) it.next();
                    if (c5937j23 == c5937j2) {
                        i = i3;
                    }
                    if (c5937j23 == c5937j22) {
                        i2 = i3;
                    }
                    i3++;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
            return C14057f9.m66580k4(c5937j2.m24025m9().m24173k4(i, m24206k4()), c5937j22.m24025m9().m24173k4(i2, m24206k4()));
        }

        /* JADX INFO: renamed from: k4 */
        public final ArrayList m24206k4() {
            return this.f16920k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m24207k4(ArrayList arrayList) {
            this.f16920k4 = arrayList;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.kt.zj$x1 */
    public static abstract class x1<T, TResult> extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract TResult mo23879k4(T t);
    }

    public C5984zj() {
        m24186x1((C13981tl) null);
    }

    /* JADX INFO: renamed from: ck */
    private boolean m24170ck() {
        AbstractC4732lr abstractC4732lr;
        if (m24192du().m23944du() == null || (abstractC4732lr = (AbstractC4732lr) C5936ix.m24008k4(AbstractC4732lr.class, m24194h4())) == null) {
            return false;
        }
        int[] iArr = {0};
        return (C14057f9.m66590k4(m24192du().m23944du(), iArr) && iArr[0] == abstractC4732lr.m19587up()) ? false : true;
    }

    /* JADX INFO: renamed from: fa */
    private boolean m24171fa() {
        IGenericEnumerator<String> it = m24204x1().iterator();
        while (it.hasNext()) {
            try {
                if (C14113y2.m67432to(it.next(), m24192du().m23956x1(), (short) 5)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: jd */
    private C3815dy m24172jd() {
        boolean zM27456k4;
        C3815dy c3815dy = new C3815dy();
        if (m24202m9() != null) {
            IEnumerator it = m24202m9().iterator();
            while (it.hasNext()) {
                try {
                    C5958ss c5958ss = (C5958ss) C7019kk.m27452k4(it.next(), C5958ss.class);
                    if (c5958ss != null) {
                        c3815dy.m15265k4(C5934he.m23966k4(c5958ss, 0));
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
            if (zM27456k4) {
                return c3815dy;
            }
        }
        return c3815dy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public int m24173k4(int i, ArrayList arrayList) {
        boolean[] zArr = this.f16904c5;
        if (zArr[i]) {
            return this.f16910jd[i];
        }
        zArr[i] = true;
        C5937j2 c5937j2 = (C5937j2) arrayList.get_Item(i);
        if (c5937j2.m24027x1() == null || c5937j2.m24027x1().length() == 0 || (c5937j2.m24027x1().length() > 0 && c5937j2.m24027x1().charAt(0) != '#')) {
            this.f16910jd[i] = 0;
            return 0;
        }
        if (c5937j2.m24027x1().length() <= 0 || c5937j2.m24027x1().charAt(0) != '#') {
            throw new CryptographicException("Malformed reference element.");
        }
        String strM24000x1 = C5934he.m24000x1(c5937j2.m24027x1());
        if ("xpointer(/)".equals(strM24000x1)) {
            this.f16910jd[i] = 0;
            return 0;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (C14113y2.m67363du(((C5937j2) arrayList.get_Item(i2)).m24015k4(), strM24000x1)) {
                this.f16910jd[i] = m24173k4(i2, arrayList) + 1;
                return this.f16910jd[i];
            }
        }
        this.f16910jd[i] = 0;
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ks */
    private void m24182ks() {
        ArrayList arrayListM23946h4 = m24192du().m23946h4();
        this.f16904c5 = new boolean[arrayListM23946h4.size()];
        this.f16910jd = new int[arrayListM23946h4.size()];
        k4 k4Var = new k4();
        k4Var.m24207k4(arrayListM23946h4);
        ArrayList arrayList = new ArrayList();
        IEnumerator it = arrayListM23946h4.iterator();
        while (it.hasNext()) {
            try {
                arrayList.addItem((C5937j2) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        arrayList.sort(k4Var);
        C5921ck c5921ck = new C5921ck();
        Iterator it2 = this.f16911k4.m24078du().iterator();
        while (it2.hasNext()) {
            try {
                c5921ck.addItem(((C5953qq) it2.next()).m24092k4());
            } finally {
                if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                C5937j2 c5937j2 = (C5937j2) it.next();
                if (c5937j2.m24023kk() == null) {
                    c5937j2.m24024kk("http://www.w3.org/2000/09/xmldsig#sha1");
                }
                c5937j2.m24019k4(this.f16906du, c5921ck);
                if (c5937j2.m24015k4() != null) {
                    c5921ck.addItem(c5937j2.m24010c5());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: rv */
    private boolean m24183rv() {
        ArrayList arrayListM23946h4 = this.f16911k4.m24089x1().m23946h4();
        for (int i = 0; i < arrayListM23946h4.size(); i++) {
            C5937j2 c5937j2 = (C5937j2) arrayListM23946h4.get_Item(i);
            if (!m24187x1(c5937j2)) {
                return false;
            }
            try {
                if (!m24179k4(c5937j2.m24029x1(this.f16906du, this.f16911k4.m24079h4()), c5937j2.m24026to())) {
                    return false;
                }
            } catch (C5964u4 unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: up */
    private static IGenericList<String> m24184up() {
        if (f16903yj == null) {
            List list = new List();
            list.addItem("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
            list.addItem("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
            list.addItem("http://www.w3.org/2001/10/xml-exc-c14n#");
            list.addItem("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
            f16903yj = list;
        }
        return f16903yj;
    }

    /* JADX INFO: renamed from: x6 */
    private boolean m24189x6() {
        x1<C5984zj, Boolean> x1Var = this.f16908fa;
        if (x1Var == null) {
            return true;
        }
        return x1Var.mo23879k4(this).booleanValue();
    }

    /* JADX INFO: renamed from: yj */
    private static IGenericList<String> m24190yj() {
        if (f16902ks == null) {
            List list = new List();
            list.addItem("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
            list.addItem("http://www.w3.org/2000/09/xmldsig#base64");
            list.addItem("urn:mpeg:mpeg21:2003:01-REL-R-NS:licenseTransform");
            list.addItem("http://www.w3.org/2002/07/decrypt#XML");
            f16902ks = list;
        }
        return f16902ks;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m24191c5() {
        C5926em c5926emM24192du;
        String str;
        m24182ks();
        AbstractC4709du abstractC4709duM24201kk = m24201kk();
        if (abstractC4709duM24201kk == null) {
            throw new CryptographicException("Signing key is not loaded.");
        }
        if (m24192du().m23955to() == null) {
            if (C7019kk.m27469x1(abstractC4709duM24201kk, AbstractC4723ix.class)) {
                c5926emM24192du = m24192du();
                str = "http://www.w3.org/2000/09/xmldsig#dsa-sha1";
            } else {
                if (!C7019kk.m27469x1(abstractC4709duM24201kk, AbstractC4751tq.class)) {
                    throw new CryptographicException("Failed to create signing key.");
                }
                if (m24192du().m23955to() == null) {
                    c5926emM24192du = m24192du();
                    str = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
                }
            }
            c5926emM24192du.m23952k4(str);
        }
        C4774yg c4774yg = (C4774yg) C5936ix.m24008k4(C4774yg.class, m24192du().m23955to());
        if (c4774yg == null) {
            throw new CryptographicException("SignatureDescription could not be created for the signature algorithm supplied.");
        }
        AbstractC4705c6 abstractC4705c6Mo19824du = c4774yg.mo19824du();
        if (abstractC4705c6Mo19824du == null) {
            throw new CryptographicException("Could not create hash algorithm object.");
        }
        m24180k4(abstractC4705c6Mo19824du);
        this.f16911k4.m24085k4(c4774yg.mo19831x1(abstractC4709duM24201kk).m19580k4(abstractC4705c6Mo19824du));
    }

    /* JADX INFO: renamed from: du */
    public final C5926em m24192du() {
        return this.f16911k4.m24089x1();
    }

    /* JADX INFO: renamed from: dy */
    public final C13981tl m24193dy() {
        XmlDocument xmlDocument = this.f16906du;
        return xmlDocument != null ? this.f16911k4.m24081k4(xmlDocument) : this.f16911k4.m24087m9();
    }

    /* JADX INFO: renamed from: h4 */
    public final String m24194h4() {
        return this.f16911k4.m24089x1().m23955to();
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC4709du m24201kk() {
        return this.f16916to;
    }

    /* JADX INFO: renamed from: m9 */
    public final C5925e0 m24202m9() {
        return this.f16911k4.m24088to();
    }

    /* JADX INFO: renamed from: to */
    public final C5982yd m24203to() {
        if (this.f16915rv == null) {
            this.f16915rv = new C5982yd(this.f16906du);
        }
        return this.f16915rv;
    }

    /* JADX INFO: renamed from: x1 */
    public final Collection<String> m24204x1() {
        return this.f16917up;
    }

    public C5984zj(XmlDocument xmlDocument) {
        if (xmlDocument == null) {
            throw new ArgumentNullException("document");
        }
        m24186x1(xmlDocument.getDocumentElement());
    }

    /* JADX INFO: renamed from: kk */
    private boolean m24181kk(AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            throw new ArgumentNullException("key");
        }
        C4774yg c4774yg = (C4774yg) C5936ix.m24008k4(C4774yg.class, m24194h4());
        if (c4774yg == null) {
            throw new CryptographicException("SignatureDescription could not be created for the signature algorithm supplied.");
        }
        if (!m24176k4(abstractC4709du, AbstractC14068j5.m66735x1(c4774yg.m19829to()))) {
            return false;
        }
        AbstractC4705c6 abstractC4705c6Mo19824du = c4774yg.mo19824du();
        if (abstractC4705c6Mo19824du == null) {
            throw new CryptographicException("Could not create hash algorithm object.");
        }
        return c4774yg.mo19552k4(abstractC4709du).mo19597k4(m24180k4(abstractC4705c6Mo19824du), this.f16911k4.m24086kk());
    }

    /* JADX INFO: renamed from: x1 */
    public static C13981tl m24185x1(XmlDocument xmlDocument, String str) {
        if (xmlDocument == null) {
            return null;
        }
        try {
            C13850af.m65120kk(str);
            C13981tl elementById = xmlDocument.getElementById(str);
            if (elementById == null) {
                C13981tl c13981tlM24175k4 = m24175k4(xmlDocument, "Id", str);
                if (c13981tlM24175k4 != null) {
                    return c13981tlM24175k4;
                }
                C13981tl c13981tlM24175k42 = m24175k4(xmlDocument, "id", str);
                return c13981tlM24175k42 != null ? c13981tlM24175k42 : m24175k4(xmlDocument, "ID", str);
            }
            XmlDocument xmlDocument2 = (XmlDocument) xmlDocument.cloneNode(true);
            C13981tl elementById2 = xmlDocument2.getElementById(str);
            C6005k4.m24261k4(elementById2 != null);
            if (elementById2 != null) {
                elementById2.getAttributes().m65167k4();
                if (xmlDocument2.getElementById(str) != null) {
                    throw new CryptographicException("Malformed reference element.");
                }
            }
            return elementById;
        } catch (XmlException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m24186x1(C13981tl c13981tl) {
        this.f16906du = c13981tl == null ? null : c13981tl.getOwnerDocument();
        this.f16912kk = c13981tl;
        C5951os c5951os = new C5951os();
        this.f16911k4 = c5951os;
        c5951os.m24083k4(this);
        this.f16911k4.m24082k4(new C5926em());
        this.f16916to = null;
        this.f16917up = new Collection<>(m24184up());
    }

    /* JADX INFO: renamed from: k4 */
    public C13981tl m24195k4(XmlDocument xmlDocument, String str) {
        return m24185x1(xmlDocument, str);
    }

    /* JADX INFO: renamed from: k4 */
    private static C13981tl m24175k4(XmlDocument xmlDocument, String str, String str2) {
        AbstractC13911hq abstractC13911hqSelectNodes = xmlDocument.selectNodes(C14113y2.m67408k4("//*[@", str, "=\"", str2, "\"]"));
        if (abstractC13911hqSelectNodes == null || abstractC13911hqSelectNodes.mo23932k4() == 0) {
            return null;
        }
        if (abstractC13911hqSelectNodes.mo23932k4() == 1) {
            return (C13981tl) C7019kk.m27452k4((Object) abstractC13911hqSelectNodes.m65457kk(0), C13981tl.class);
        }
        throw new CryptographicException("Malformed reference element.");
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m24205x1(AbstractC4709du abstractC4709du) {
        return m24189x6() && m24181kk(abstractC4709du) && m24183rv();
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m24187x1(C5937j2 c5937j2) {
        C5915bs c5915bsM24011du = c5937j2.m24011du();
        int iM23886k4 = c5915bsM24011du.m23886k4();
        for (int i = 0; i < iM23886k4; i++) {
            if (!m24178k4(c5915bsM24011du.m23890k4(i).m23928to())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24196k4(AbstractC4709du abstractC4709du) {
        this.f16916to = abstractC4709du;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static boolean m24188x1(C5984zj c5984zj) {
        return !c5984zj.m24170ck() && c5984zj.m24171fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24197k4(C5937j2 c5937j2) {
        this.f16911k4.m24089x1().m23949k4(c5937j2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24198k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            throw new ArgumentNullException("value");
        }
        this.f16911k4.m24084k4(c13981tl);
        if (this.f16912kk == null) {
            this.f16912kk = c13981tl;
        }
        this.f16919x6 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24199k4() {
        return this.f16905ck;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if ((r3.m15330kk() & 128) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if ((r3.m15330kk() & 64) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r3 = new com.aspose.slides.internal.p118ex.C3825qq();
        r3.mo15257k4(r2);
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m24200k4(C3823m9 c3823m9, boolean z) {
        if (!z) {
            IEnumerator iEnumeratorM15357k4 = c3823m9.m15324up().iterator();
            while (true) {
                try {
                    if (!iEnumeratorM15357k4.hasNext()) {
                        break;
                    }
                    C3828u4 c3828u4 = (C3828u4) iEnumeratorM15357k4.next();
                    if (C14113y2.m67360du(c3828u4.m19730k4().m19795x1(), "2.5.29.15", (short) 5) == 0) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) iEnumeratorM15357k4, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) iEnumeratorM15357k4).dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) iEnumeratorM15357k4, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) iEnumeratorM15357k4).dispose();
            }
            C3813ck c3813ck = new C3813ck();
            c3813ck.m15253k4().m15304k4().m15265k4(m24172jd());
            if (!c3813ck.m15254k4(c3823m9)) {
                return false;
            }
        }
        AbstractC4709du abstractC4709duM23967k4 = C5934he.m23967k4(c3823m9);
        try {
            if (!m24205x1(abstractC4709duM23967k4)) {
                return false;
            }
            if (abstractC4709duM23967k4 == null) {
                return true;
            }
            abstractC4709duM23967k4.dispose();
            return true;
        } finally {
            if (abstractC4709duM23967k4 != null) {
                abstractC4709duM23967k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m24176k4(AbstractC4709du abstractC4709du, AbstractC14068j5 abstractC14068j5) {
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(abstractC4709du);
        if (abstractC14068j5M66727k4 == abstractC14068j5 || abstractC14068j5.m66749k4(abstractC14068j5M66727k4)) {
            return true;
        }
        while (abstractC14068j5 != null && abstractC14068j5.mo48620k4() != C7019kk.m27443k4((Class<?>) AbstractC4709du.class)) {
            abstractC14068j5 = abstractC14068j5.mo48620k4();
        }
        return abstractC14068j5 != null && abstractC14068j5M66727k4.m66749k4(abstractC14068j5);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m24178k4(String str) {
        IGenericEnumerator<String> it = m24204x1().iterator();
        while (it.hasNext()) {
            try {
                if (C14113y2.m67432to(it.next(), str, (short) 5)) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<String> it2 = m24190yj().iterator();
        while (it2.hasNext()) {
            try {
                if (C14113y2.m67432to(it2.next(), str, (short) 5)) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it2.dispose();
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m24179k4(byte[] bArr, byte[] bArr2) {
        C6005k4.m24261k4(bArr != null);
        C6005k4.m24261k4(bArr2 != null);
        if (bArr.length != bArr2.length) {
            return false;
        }
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i |= (bArr[i2] & 255) - (bArr2[i2] & 255);
        }
        return i == 0;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m24180k4(AbstractC4705c6 abstractC4705c6) {
        boolean zM27469x1 = C7019kk.m27469x1(abstractC4705c6, AbstractC4703bz.class);
        if (zM27469x1 || !this.f16919x6 || !m24192du().m23954m9()) {
            XmlDocument xmlDocument = this.f16906du;
            String baseURI = xmlDocument == null ? null : xmlDocument.getBaseURI();
            AbstractC13943n5 c14010x0 = this.f16905ck ? this.f16918x1 : new C14010x0();
            XmlDocument xmlDocumentM23973k4 = C5934he.m23973k4(m24192du().m23945dy(), c14010x0, baseURI);
            C13981tl c13981tl = this.f16912kk;
            C5934he.m23984k4(xmlDocumentM23973k4.getDocumentElement(), c13981tl != null ? C5934he.m23968k4(c13981tl) : null);
            AbstractC5920ca abstractC5920caM23953kk = m24192du().m23953kk();
            abstractC5920caM23953kk.m23921k4(c14010x0);
            abstractC5920caM23953kk.m23923k4(baseURI);
            abstractC5920caM23953kk.mo23922k4((Object) xmlDocumentM23973k4);
            this.f16914ne = abstractC5920caM23953kk.mo23925k4(abstractC4705c6);
            this.f16919x6 = !zM27469x1;
        }
        return this.f16914ne;
    }
}

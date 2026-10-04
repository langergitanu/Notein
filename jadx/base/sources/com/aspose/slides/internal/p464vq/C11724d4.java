package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.d4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11724d4 extends AbstractC11760jd {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f39713jd = new C7017h4("text/xml", "image/png", "image/jpeg", "image/gif", "image/tiff", "image/x-emf", "image/x-wmf", "META-INF/manifest.xml", "meta.xml", "settings.xml", "styles.xml", "content.xml");

    /* JADX INFO: renamed from: du */
    private C11839vw f39715du;

    /* JADX INFO: renamed from: dy */
    private C11839vw f39716dy;

    /* JADX INFO: renamed from: h4 */
    private C11839vw f39717h4;

    /* JADX INFO: renamed from: m9 */
    private C11839vw f39719m9;

    /* JADX INFO: renamed from: to */
    private C11839vw f39720to;

    /* JADX INFO: renamed from: x1 */
    C11798qn f39721x1 = new C11798qn();

    /* JADX INFO: renamed from: kk */
    private SortedList<String, C11839vw> f39718kk = new SortedList<>(AbstractC14070jw.m66790x1());

    /* JADX INFO: renamed from: c5 */
    private List<C11839vw> f39714c5 = new List<>();

    public C11724d4() {
        m55340du();
        m55345k4(false);
    }

    /* JADX INFO: renamed from: c5 */
    public final C11839vw m55314c5() {
        return this.f39716dy;
    }

    /* JADX INFO: renamed from: ck */
    public final C11839vw m55315ck() {
        return this.f39717h4;
    }

    /* JADX INFO: renamed from: dy */
    public final C11839vw m55316dy() {
        return this.f39720to;
    }

    /* JADX INFO: renamed from: fa */
    public final C11839vw m55317fa() {
        return this.f39719m9;
    }

    /* JADX INFO: renamed from: jd */
    public final C11839vw m55318jd() {
        return this.f39715du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11839vw m55319k4(String str, String str2) {
        return m55320k4(str, str2, (byte[]) null);
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd
    /* JADX INFO: renamed from: to */
    public void mo55326to() {
        IGenericEnumerator<C12262lr> it = m55347kk().iterator();
        while (it.hasNext()) {
            try {
                C12262lr next = it.next();
                if (!next.m57329ck()) {
                    m55341h4();
                    next.m57343k4(C14113y2.m67393k4(next.m57356to(), IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX));
                    m55324k4(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C11706b1.m55276k4(this.f39718kk);
        m55321k4(this.f39718kk.getValues());
    }

    /* JADX INFO: renamed from: x1 */
    public final C11839vw[] m55327x1(String str) {
        List list = new List();
        IGenericEnumerator<KeyValuePair<String, C11839vw>> it = this.f39718kk.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, C11839vw> next = it.next();
                if (C14113y2.m67448x1(next.getKey(), str)) {
                    list.addItem(next.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (C11839vw[]) list.toArray(new C11839vw[0]);
    }

    public C11724d4(AbstractC3150x6 abstractC3150x6, AbstractC3174jd abstractC3174jd) {
        m55344k4(abstractC3150x6, true, abstractC3174jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11839vw m55320k4(String str, String str2, byte[] bArr) {
        C11839vw c11839vw = new C11839vw(this, str, str2, bArr);
        this.f39718kk.addItem(c11839vw.m55427x1(), c11839vw);
        m55323k4(c11839vw);
        return c11839vw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55321k4(IGenericList<C11839vw> iGenericList) {
        IGenericEnumerator<C11839vw> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                m55323k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m55322k4(AbstractC3150x6 abstractC3150x6) {
        XmlDocument xmlDocument = new XmlDocument();
        AbstractC13901ga abstractC13901gaAppendChild = null;
        xmlDocument.setXmlResolver(null);
        xmlDocument.appendChild(xmlDocument.createXmlDeclaration("1.0", "utf-8", null));
        C13981tl c13981tlCreateElement = xmlDocument.createElement("office:document", "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
        c13981tlCreateElement.m65907k4("mimetype", "urn:oasis:names:tc:opendocument:xmlns:office:1.0", "application/vnd.oasis.opendocument.presentation");
        xmlDocument.appendChild(c13981tlCreateElement);
        XmlDocument xmlDocument2 = new XmlDocument();
        xmlDocument2.setXmlResolver(null);
        xmlDocument2.load(m55318jd().m55417h4());
        IEnumerator it = xmlDocument2.getDocumentElement().getChildNodes().iterator();
        while (it.hasNext()) {
            try {
                c13981tlCreateElement.appendChild(xmlDocument.importNode((AbstractC13901ga) it.next(), true));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        xmlDocument2.load(m55315ck().m55417h4());
        IEnumerator it2 = xmlDocument2.getDocumentElement().getChildNodes().iterator();
        while (it2.hasNext()) {
            try {
                c13981tlCreateElement.appendChild(xmlDocument.importNode((AbstractC13901ga) it2.next(), true));
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        xmlDocument2.load(m55317fa().m55417h4());
        IEnumerator it3 = xmlDocument2.getDocumentElement().getChildNodes().iterator();
        while (it3.hasNext()) {
            try {
                AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it3.next();
                if (C14113y2.m67363du("office:automatic-styles", abstractC13901ga.getName())) {
                    abstractC13901gaAppendChild = c13981tlCreateElement.appendChild(xmlDocument.importNode(abstractC13901ga, true));
                } else {
                    c13981tlCreateElement.appendChild(xmlDocument.importNode(abstractC13901ga, true));
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        xmlDocument2.load(m55314c5().m55417h4());
        IEnumerator it4 = xmlDocument2.getDocumentElement().getAttributes().iterator();
        while (it4.hasNext()) {
            try {
                C13940my c13940my = (C13940my) it4.next();
                c13981tlCreateElement.m65910kk(c13940my.getName(), c13940my.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
            }
        }
        it = xmlDocument2.getDocumentElement().getChildNodes().iterator();
        while (it.hasNext()) {
            try {
                AbstractC13901ga abstractC13901ga2 = (AbstractC13901ga) it.next();
                if (abstractC13901gaAppendChild == null || !C14113y2.m67363du("office:automatic-styles", abstractC13901ga2.getName())) {
                    c13981tlCreateElement.appendChild(xmlDocument.importNode(abstractC13901ga2, true));
                } else {
                    it = abstractC13901ga2.getChildNodes().iterator();
                    while (it.hasNext()) {
                        try {
                            abstractC13901gaAppendChild.appendChild(xmlDocument.importNode((AbstractC13901ga) it.next(), true));
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            } finally {
            }
        }
        xmlDocument.save(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55323k4(C11839vw c11839vw) {
        C7017h4 c7017h4 = f39713jd;
        switch (c7017h4.m27428k4(c11839vw.m55429fa())) {
            case 0:
                switch (c7017h4.m27428k4(c11839vw.m55424kk())) {
                    case 7:
                        this.f39720to = c11839vw;
                        break;
                    case 8:
                        if (C14113y2.m67364dy(C14113y2.m67368h4(c11839vw.m55427x1()), "object") != -1) {
                            this.f39721x1.m55381k4(this.f39721x1.m55380k4(c11839vw)).f39912k4 = c11839vw;
                        } else {
                            this.f39715du = c11839vw;
                        }
                        break;
                    case 9:
                        this.f39717h4 = c11839vw;
                        break;
                    case 10:
                        if (C14113y2.m67364dy(C14113y2.m67368h4(c11839vw.m55427x1()), "object") != -1) {
                            this.f39721x1.m55381k4(this.f39721x1.m55380k4(c11839vw)).f39915x1 = c11839vw;
                        } else {
                            this.f39719m9 = c11839vw;
                        }
                        break;
                    case 11:
                        if (C14113y2.m67364dy(C14113y2.m67368h4(c11839vw.m55427x1()), "object") != -1) {
                            this.f39721x1.m55381k4(this.f39721x1.m55380k4(c11839vw)).f39913kk = c11839vw;
                        } else {
                            this.f39716dy = c11839vw;
                        }
                        break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.f39714c5.addItem(c11839vw);
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55324k4(C12262lr c12262lr) {
        C11839vw c11839vw = new C11839vw(this, c12262lr);
        this.f39718kk.addItem(c11839vw.m55427x1(), c11839vw);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55325k4(C12275wy c12275wy) {
        c12275wy.m57479k4(false);
        IGenericEnumerator<C11839vw> it = this.f39718kk.getValues().iterator();
        while (it.hasNext()) {
            try {
                C11839vw next = it.next();
                C12262lr c12262lrM57473k4 = c12275wy.m57473k4(C14113y2.m67431to(next.m55427x1(), IOUtils.DIR_SEPARATOR_UNIX), (String) null, next.m55426to());
                if (next.m55431up()) {
                    c12262lrM57473k4.m57345k4((short) 0);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}

package com.aspose.slides.internal.p238kt;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.ca */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5920ca {

    /* JADX INFO: renamed from: x1 */
    private String f16746x1;

    /* JADX INFO: renamed from: kk */
    private String f16743kk = null;

    /* JADX INFO: renamed from: k4 */
    public AbstractC13943n5 f16742k4 = null;

    /* JADX INFO: renamed from: to */
    private boolean f16745to = false;

    /* JADX INFO: renamed from: du */
    private C5984zj f16739du = null;

    /* JADX INFO: renamed from: h4 */
    private C5937j2 f16741h4 = null;

    /* JADX INFO: renamed from: m9 */
    private Hashtable f16744m9 = null;

    /* JADX INFO: renamed from: dy */
    private C13981tl f16740dy = null;

    /* JADX INFO: renamed from: c5 */
    public abstract Object mo23909c5();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ck */
    public final Hashtable m23910ck() {
        C13981tl c13981tl;
        Hashtable hashtable;
        Hashtable hashtable2 = this.f16744m9;
        if (hashtable2 != null) {
            return hashtable2;
        }
        C5937j2 c5937j2M23926kk = m23926kk();
        C5984zj c5984zjM23929x1 = c5937j2M23926kk == null ? m23929x1() : c5937j2M23926kk.m24025m9();
        if (c5937j2M23926kk == null || (c5937j2M23926kk.m24012dy() == 2 && !C14113y2.m67411k4(c5937j2M23926kk.m24027x1()) && c5937j2M23926kk.m24027x1().charAt(0) == '#')) {
            C5921ck c5921ckM23968k4 = c5937j2M23926kk != null ? c5937j2M23926kk.f16789k4 : (c5984zjM23929x1 == null || (c13981tl = c5984zjM23929x1.f16912kk) == null) ? null : C5934he.m23968k4(c13981tl);
            if (c5921ckM23968k4 != null) {
                this.f16744m9 = new Hashtable(c5921ckM23968k4.mo23932k4());
                IEnumerator it = c5921ckM23968k4.iterator();
                while (it.hasNext()) {
                    try {
                        AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                        String strM67408k4 = abstractC13901ga.getPrefix().length() > 0 ? C14113y2.m67408k4(abstractC13901ga.getPrefix(), C18241k5.f55433h, abstractC13901ga.getLocalName()) : abstractC13901ga.getLocalName();
                        if (!this.f16744m9.contains(strM67408k4)) {
                            this.f16744m9.addItem(strM67408k4, abstractC13901ga.getValue());
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                return this.f16744m9;
            }
            hashtable = new Hashtable(0);
        } else {
            hashtable = new Hashtable(0);
        }
        this.f16744m9 = hashtable;
        return hashtable;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC13943n5 m23911du() {
        return this.f16742k4;
    }

    /* JADX INFO: renamed from: dy */
    public abstract AbstractC13911hq mo23912dy();

    /* JADX INFO: renamed from: h4 */
    public final boolean m23913h4() {
        return this.f16745to;
    }

    /* JADX INFO: renamed from: jd */
    public final C13981tl m23914jd() {
        C13981tl c13981tl = this.f16740dy;
        if (c13981tl != null) {
            return c13981tl;
        }
        C5937j2 c5937j2M23926kk = m23926kk();
        C5984zj c5984zjM23929x1 = c5937j2M23926kk == null ? m23929x1() : c5937j2M23926kk.m24025m9();
        if (c5984zjM23929x1 == null) {
            return null;
        }
        return c5984zjM23929x1.f16912kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m23915k4(XmlDocument xmlDocument) {
        return m23916k4(xmlDocument, "Transform");
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23920k4(AbstractC13911hq abstractC13911hq);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23922k4(Object obj);

    /* JADX INFO: renamed from: kk */
    public final C5937j2 m23926kk() {
        return this.f16741h4;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract AbstractC14068j5[] mo23927m9();

    /* JADX INFO: renamed from: to */
    public final String m23928to() {
        return this.f16746x1;
    }

    public String toString() {
        return OooO00o.OooO00o("System.Security.Cryptography.Xml.", C14067j2.m66727k4(this).mo48540du().substring(C14067j2.m66727k4(this).mo48540du().lastIndexOf(46) + 1));
    }

    /* JADX INFO: renamed from: x1 */
    public final C5984zj m23929x1() {
        return this.f16739du;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract Object mo23930x1(AbstractC14068j5 abstractC14068j5);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C13981tl m23916k4(XmlDocument xmlDocument, String str) {
        boolean zM27456k4;
        C13981tl c13981tlCreateElement = xmlDocument.createElement(str, "http://www.w3.org/2000/09/xmldsig#");
        if (!C14113y2.m67411k4(m23928to())) {
            c13981tlCreateElement.m65910kk("Algorithm", m23928to());
        }
        AbstractC13911hq abstractC13911hqMo23912dy = mo23912dy();
        if (abstractC13911hqMo23912dy != null) {
            IEnumerator it = abstractC13911hqMo23912dy.iterator();
            while (it.hasNext()) {
                try {
                    c13981tlCreateElement.appendChild(xmlDocument.importNode((AbstractC13901ga) it.next(), true));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
            if (zM27456k4) {
                return c13981tlCreateElement;
            }
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m23931x1(String str) {
        this.f16746x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m23917k4() {
        return this.f16743kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23918k4(C5937j2 c5937j2) {
        this.f16741h4 = c5937j2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23919k4(C5984zj c5984zj) {
        this.f16739du = c5984zj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23921k4(AbstractC13943n5 abstractC13943n5) {
        this.f16742k4 = abstractC13943n5;
        this.f16745to = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23923k4(String str) {
        this.f16743kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m23924k4(AbstractC14068j5 abstractC14068j5) {
        if (mo23927m9() != null) {
            for (int i = 0; i < mo23927m9().length; i++) {
                if (abstractC14068j5 == mo23927m9()[i] || abstractC14068j5.m66749k4(mo23927m9()[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] mo23925k4(AbstractC4705c6 abstractC4705c6) {
        return abstractC4705c6.m19585k4((AbstractC3150x6) mo23930x1(C7019kk.m27443k4((Class<?>) AbstractC3150x6.class)));
    }
}

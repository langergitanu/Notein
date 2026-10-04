package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.C7200kk;
import com.aspose.slides.internal.p331p6.C7202to;
import com.aspose.slides.internal.p418tf.C10931x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13906gx;
import com.aspose.slides.p559ms.System.Xml.C13939mt;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.gk */
/* JADX INFO: loaded from: classes.dex */
public class C5932gk extends AbstractC5920ca {

    /* JADX INFO: renamed from: du */
    private String f16765du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC3150x6 f16766h4;

    /* JADX INFO: renamed from: to */
    private AbstractC13911hq f16769to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14068j5[] f16770x1 = {C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), C7019kk.m27443k4((Class<?>) XmlDocument.class), C7019kk.m27443k4((Class<?>) AbstractC13911hq.class)};

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5[] f16767kk = {C7019kk.m27443k4((Class<?>) AbstractC3150x6.class)};

    /* JADX INFO: renamed from: m9 */
    private boolean f16768m9 = false;

    public C5932gk() {
        m23931x1("http://www.w3.org/TR/1999/REC-xslt-19991116");
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: c5 */
    public Object mo23909c5() {
        AbstractC13943n5 abstractC13943n5M23911du = m23911du();
        C7200kk c7200kk = new C7200kk();
        C13906gx c13906gx = new C13906gx();
        c13906gx.m65389k4((AbstractC13943n5) null);
        c13906gx.m65408x1(C5934he.f16772k4);
        c13906gx.m65386k4(0L);
        C3144um c3144um = new C3144um(this.f16765du);
        try {
            c7200kk.m27868k4(AbstractC13912i5.m65468k4(c3144um, c13906gx, (String) null), abstractC13943n5M23911du);
            C10931x1 c10931x1 = new C10931x1(AbstractC13912i5.m65464k4(this.f16766h4, c13906gx, m23917k4()), 2);
            C3152yj c3152yj = new C3152yj();
            c7200kk.m27866k4(c10931x1, (C7202to) null, new C13991ub(c3152yj, (AbstractC6747ar) null));
            c3152yj.setPosition(0L);
            return c3152yj;
        } finally {
            c3144um.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: dy */
    public AbstractC13911hq mo23912dy() {
        return this.f16769to;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23920k4(AbstractC13911hq abstractC13911hq) {
        if (abstractC13911hq == null) {
            throw new CryptographicException("Unknown transform has been encountered.");
        }
        IEnumerator it = abstractC13911hq.iterator();
        int i = 0;
        C13981tl c13981tl = null;
        while (it.hasNext()) {
            try {
                AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                if (!C7019kk.m27469x1(abstractC13901ga, C13939mt.class)) {
                    if (C7019kk.m27469x1(abstractC13901ga, C13981tl.class)) {
                        if (i != 0) {
                            throw new CryptographicException("Unknown transform has been encountered.");
                        }
                        c13981tl = (C13981tl) C7019kk.m27452k4((Object) abstractC13901ga, C13981tl.class);
                    }
                    i++;
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
        if (i != 1 || c13981tl == null) {
            throw new CryptographicException("Unknown transform has been encountered.");
        }
        this.f16769to = abstractC13911hq;
        this.f16765du = C14113y2.m67423kk(c13981tl.getOuterXml(), (char[]) null);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: m9 */
    public AbstractC14068j5[] mo23927m9() {
        return this.f16770x1;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: x1 */
    public Object mo23930x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC3150x6.class) || abstractC14068j5.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC3150x6.class))) {
            return (AbstractC3150x6) mo23909c5();
        }
        throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23922k4(Object obj) {
        byte[] bArrM24118k4;
        AbstractC3150x6 abstractC3150x6 = this.f16766h4;
        if (abstractC3150x6 != null) {
            abstractC3150x6.close();
        }
        this.f16766h4 = new C3152yj();
        if (C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
            this.f16766h4 = (AbstractC3150x6) obj;
            return;
        }
        if (C7019kk.m27469x1(obj, AbstractC13911hq.class)) {
            byte[] bArrM24118k42 = new C5961to((AbstractC13911hq) obj, (AbstractC13943n5) null, this.f16768m9).m24118k4();
            if (bArrM24118k42 == null) {
                return;
            }
            this.f16766h4.write(bArrM24118k42, 0, bArrM24118k42.length);
            this.f16766h4.flush();
            this.f16766h4.setPosition(0L);
            return;
        }
        if (!C7019kk.m27469x1(obj, XmlDocument.class) || (bArrM24118k4 = new C5961to((XmlDocument) obj, (AbstractC13943n5) null, this.f16768m9).m24118k4()) == null) {
            return;
        }
        this.f16766h4.write(bArrM24118k4, 0, bArrM24118k4.length);
        this.f16766h4.flush();
        this.f16766h4.setPosition(0L);
    }
}

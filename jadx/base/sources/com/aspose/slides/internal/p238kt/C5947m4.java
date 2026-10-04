package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p174hz.C4758v4;
import com.aspose.slides.internal.p174hz.C4775yj;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.m4 */
/* JADX INFO: loaded from: classes.dex */
public class C5947m4 extends AbstractC5920ca {

    /* JADX INFO: renamed from: x1 */
    private AbstractC14068j5[] f16815x1 = {C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), C7019kk.m27443k4((Class<?>) AbstractC13911hq.class), C7019kk.m27443k4((Class<?>) XmlDocument.class)};

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5[] f16813kk = {C7019kk.m27443k4((Class<?>) AbstractC3150x6.class)};

    /* JADX INFO: renamed from: to */
    private C4775yj f16814to = null;

    public C5947m4() {
        m23931x1("http://www.w3.org/2000/09/xmldsig#base64");
    }

    /* JADX INFO: renamed from: k4 */
    private void m24066k4(AbstractC3150x6 abstractC3150x6) {
        int i;
        if (abstractC3150x6 == null) {
            throw new ArgumentException("obj");
        }
        C3152yj c3152yj = new C3152yj();
        byte[] bArr = new byte[1024];
        do {
            i = abstractC3150x6.read(bArr, 0, 1024);
            if (i > 0) {
                int i2 = 0;
                while (i2 < i && !C14117yj.m67534ks((char) (bArr[i2] & 255))) {
                    i2++;
                }
                for (int i3 = i2 + 1; i3 < i; i3++) {
                    if (!C14117yj.m67534ks((char) (bArr[i3] & 255))) {
                        bArr[i2] = bArr[i3];
                        i2++;
                    }
                }
                c3152yj.write(bArr, 0, i2);
            }
        } while (i > 0);
        c3152yj.setPosition(0L);
        this.f16814to = new C4775yj(c3152yj, new C4758v4(), 0);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: c5 */
    public Object mo23909c5() {
        return this.f16814to;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: dy */
    public AbstractC13911hq mo23912dy() {
        return null;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: m9 */
    public AbstractC14068j5[] mo23927m9() {
        return this.f16815x1;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: x1 */
    public Object mo23930x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC3150x6.class) || abstractC14068j5.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC3150x6.class))) {
            return this.f16814to;
        }
        throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private void m24067x1(AbstractC13911hq abstractC13911hq) {
        C6765kp c6765kp = new C6765kp();
        IEnumerator it = abstractC13911hq.iterator();
        while (it.hasNext()) {
            try {
                AbstractC13901ga abstractC13901gaSelectSingleNode = ((AbstractC13901ga) it.next()).selectSingleNode("self::text()");
                if (abstractC13901gaSelectSingleNode != null) {
                    c6765kp.m26792k4(abstractC13901gaSelectSingleNode.getOuterXml());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        byte[] bArrMo26677to = new C6783wp(false).mo26677to(c6765kp.toString());
        int i = 0;
        while (i < bArrMo26677to.length && !C14117yj.m67534ks((char) (bArrMo26677to[i] & 255))) {
            i++;
        }
        for (int i2 = i + 1; i2 < bArrMo26677to.length; i2++) {
            if (!C14117yj.m67534ks((char) (bArrMo26677to[i2] & 255))) {
                bArrMo26677to[i] = bArrMo26677to[i2];
                i++;
            }
        }
        this.f16814to = new C4775yj(new C3152yj(bArrMo26677to, 0, i), new C4758v4(), 0);
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23920k4(AbstractC13911hq abstractC13911hq) {
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23922k4(Object obj) {
        if (C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
            m24066k4((AbstractC3150x6) obj);
        } else if (C7019kk.m27469x1(obj, AbstractC13911hq.class)) {
            m24067x1((AbstractC13911hq) obj);
        } else if (C7019kk.m27469x1(obj, XmlDocument.class)) {
            m24067x1(((XmlDocument) obj).selectNodes("//."));
        }
    }
}

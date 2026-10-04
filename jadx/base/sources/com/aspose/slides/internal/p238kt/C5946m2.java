package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.m2 */
/* JADX INFO: loaded from: classes.dex */
public class C5946m2 extends AbstractC5920ca {

    /* JADX INFO: renamed from: du */
    private boolean f16809du;

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5[] f16810kk;

    /* JADX INFO: renamed from: to */
    private C5961to f16811to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14068j5[] f16812x1;

    public C5946m2() {
        this.f16812x1 = new AbstractC14068j5[]{C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), C7019kk.m27443k4((Class<?>) XmlDocument.class), C7019kk.m27443k4((Class<?>) AbstractC13911hq.class)};
        this.f16810kk = new AbstractC14068j5[]{C7019kk.m27443k4((Class<?>) AbstractC3150x6.class)};
        this.f16809du = false;
        m23931x1("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: c5 */
    public Object mo23909c5() {
        return new C3152yj(this.f16811to.m24118k4());
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
        return this.f16812x1;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: x1 */
    public Object mo23930x1(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC3150x6.class) || abstractC14068j5.m66749k4(C7019kk.m27443k4((Class<?>) AbstractC3150x6.class))) {
            return new C3152yj(this.f16811to.m24118k4());
        }
        throw new ArgumentException("The input type was invalid for this transform.", C18437z2.f56754h);
    }

    public C5946m2(boolean z) {
        this.f16812x1 = new AbstractC14068j5[]{C7019kk.m27443k4((Class<?>) AbstractC3150x6.class), C7019kk.m27443k4((Class<?>) XmlDocument.class), C7019kk.m27443k4((Class<?>) AbstractC13911hq.class)};
        this.f16810kk = new AbstractC14068j5[]{C7019kk.m27443k4((Class<?>) AbstractC3150x6.class)};
        this.f16809du = z;
        m23931x1(z ? "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments" : "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public void mo23922k4(Object obj) {
        C5961to c5961to;
        AbstractC13943n5 c14010x0 = m23913h4() ? this.f16742k4 : new C14010x0();
        if (C7019kk.m27469x1(obj, AbstractC3150x6.class)) {
            c5961to = new C5961to((AbstractC3150x6) obj, this.f16809du, c14010x0, m23917k4());
        } else if (C7019kk.m27469x1(obj, XmlDocument.class)) {
            c5961to = new C5961to((XmlDocument) obj, c14010x0, this.f16809du);
        } else {
            if (!C7019kk.m27469x1(obj, AbstractC13911hq.class)) {
                throw new ArgumentException("Type of input object is invalid.", "obj");
            }
            c5961to = new C5961to((AbstractC13911hq) obj, c14010x0, this.f16809du);
        }
        this.f16811to = c5961to;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5920ca
    /* JADX INFO: renamed from: k4 */
    public byte[] mo23925k4(AbstractC4705c6 abstractC4705c6) {
        return this.f16811to.m24119k4(abstractC4705c6);
    }
}

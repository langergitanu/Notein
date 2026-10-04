package com.aspose.slides.internal.p055c4;

import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.AbstractC6155lr;
import com.aspose.slides.internal.p253lm.C6116bs;
import com.aspose.slides.internal.p253lm.C6165o9;
import com.aspose.slides.internal.p253lm.InterfaceC6173qw;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.c4.dy */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1943dy extends AbstractC1946kk {

    /* JADX INFO: renamed from: k4 */
    private C1947m9 f6912k4;

    /* JADX INFO: renamed from: x1 */
    private C6116bs f6913x1;

    /* JADX INFO: renamed from: dy */
    public final AbstractC6123ca m10028dy() {
        AbstractC6123ca abstractC6123caM10092jd = this.f6912k4.m10092jd();
        mo10031k4(abstractC6123caM10092jd);
        return abstractC6123caM10092jd;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        return m10080h4();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC14068j5 mo10030k4();

    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return null;
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: m9 */
    public void mo10023m9() {
        C1947m9 c1947m9 = new C1947m9(m10089to(), mo10025du(), new AbstractC1949x1() { // from class: com.aspose.slides.internal.c4.dy.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.JavaScript.Extensions.TypeExtension.Execute(System.String,Aspose.JavaScript.Instance,Aspose.JavaScript.Instance[])";
            }

            @Override // com.aspose.slides.internal.p055c4.AbstractC1949x1
            /* JADX INFO: renamed from: k4 */
            public AbstractC6123ca mo10024k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
                return AbstractC1943dy.this.mo10029k4(str, abstractC6123ca, abstractC6123caArr);
            }
        });
        this.f6912k4 = c1947m9;
        c1947m9.mo10093k4((InterfaceC6173qw) m10089to());
        if (mo10034kk() != null) {
            C6116bs c6116bs = (C6116bs) m10081k4(mo10034kk()).m10028dy();
            this.f6913x1 = c6116bs;
            this.f6912k4.m25133k4(c6116bs);
        }
        mo10027x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m10036x1(Object obj) {
        AbstractC6123ca abstractC6123caM10095x1 = this.f6912k4.m10095x1(obj);
        mo10031k4(abstractC6123caM10095x1);
        return abstractC6123caM10095x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo10031k4(AbstractC6123ca abstractC6123ca) {
    }

    /* JADX INFO: renamed from: kk */
    public final void m10035kk(String str) {
        this.f6912k4.m10091h4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10032k4(AbstractC6123ca abstractC6123ca, String str, AbstractC6123ca abstractC6123ca2) {
        C6116bs c6116bs = (C6116bs) abstractC6123ca;
        c6116bs.mo25036k4((AbstractC6155lr) new C6165o9(c6116bs, str, abstractC6123ca2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10033k4(String str, int i) {
        this.f6912k4.m10094k4(str, i);
    }
}

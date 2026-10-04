package com.aspose.slides.internal.p253lm;

import androidx.core.app.NotificationCompat;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C6179ss extends AbstractC6172qq {

    /* JADX INFO: renamed from: du */
    private C6198wp f17445du;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f17446h4;

    /* JADX INFO: renamed from: m9 */
    private C6198wp f17447m9;

    /* JADX INFO: renamed from: to */
    private C6198wp f17448to;

    public C6179ss(InterfaceC6173qw interfaceC6173qw, C6116bs c6116bs) {
        super(interfaceC6173qw, c6116bs);
        m25137m9("Function");
        m25174k4("prototype", c6116bs, 7);
    }

    /* JADX INFO: renamed from: jd */
    public final C6198wp m25013jd() {
        C6198wp c6198wp = new C6198wp(m25138rv());
        c6198wp.m25133k4(m24965ck().mo24967fa().m24760k4(c6198wp));
        return c6198wp;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public C6116bs mo24809k4(AbstractC6123ca[] abstractC6123caArr, AbstractC14068j5[] abstractC14068j5Arr, InterfaceC6132em interfaceC6132em) {
        C6198wp c6198wpM25013jd = m25013jd();
        for (int i = 0; i < abstractC6123caArr.length - 1; i++) {
            for (String str : C14113y2.m67414k4(abstractC6123caArr[i].toString(), ',')) {
                c6198wpM25013jd.m25141yj().addItem(C14113y2.m67440x1(str));
            }
        }
        if (abstractC6123caArr.length >= 1) {
            c6198wpM25013jd.m25134k4((AbstractC6178sq) new C6135fa(C6149jw.m24870k4(abstractC6123caArr[abstractC6123caArr.length - 1].mo24769C_().toString()).m24831k4()));
        }
        return c6198wpM25013jd;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return interfaceC6132em.mo10079x1(mo24809k4(abstractC6123caArr, (AbstractC14068j5[]) null, interfaceC6132em));
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
        C6116bs c6116bsM25138rv = m25138rv();
        this.f17448to = new C6204x6(this);
        this.f17445du = new C6150k4(this);
        this.f17446h4 = new C6134f9(interfaceC6173qw, null, "toString", c6116bsM25138rv);
        this.f17447m9 = new C6134f9(interfaceC6173qw, null, "toLocaleString", c6116bsM25138rv);
        c6116bsM25138rv.m25174k4("constructor", this, 2);
        c6116bsM25138rv.m25174k4(NotificationCompat.CATEGORY_CALL, this.f17448to, 2);
        c6116bsM25138rv.m25174k4("apply", this.f17445du, 2);
        c6116bsM25138rv.m25174k4("toString", this.f17446h4, 2);
        c6116bsM25138rv.m25174k4("toLocaleString", this.f17447m9, 2);
        c6116bsM25138rv.mo25036k4((AbstractC6155lr) new C6181t6(interfaceC6173qw, c6116bsM25138rv, "length"));
    }
}

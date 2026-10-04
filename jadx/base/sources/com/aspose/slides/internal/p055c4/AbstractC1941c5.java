package com.aspose.slides.internal.p055c4;

import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.AbstractC6172qq;
import com.aspose.slides.internal.p253lm.C6116bs;

/* JADX INFO: renamed from: com.aspose.slides.internal.c4.c5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1941c5 extends AbstractC1946kk {

    /* JADX INFO: renamed from: k4 */
    private AbstractC6172qq f6907k4;

    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10019k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        return m10080h4();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract String mo10020k4();

    /* JADX INFO: renamed from: kk */
    public final C6116bs m10021kk() {
        return this.f6907k4.m25138rv();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: m9 */
    public void mo10023m9() {
        this.f6907k4 = (AbstractC6172qq) m10089to().mo25032k4(mo10020k4());
        mo10027x1();
    }

    /* JADX INFO: renamed from: kk */
    public final void m10022kk(String str) {
        m10021kk().m25174k4(str, new C1944h4(m10089to(), str, m10021kk(), new AbstractC1949x1() { // from class: com.aspose.slides.internal.c4.c5.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.JavaScript.Extensions.TypeWrapperExtension.Execute(System.String,Aspose.JavaScript.Instance,Aspose.JavaScript.Instance[])";
            }

            @Override // com.aspose.slides.internal.p055c4.AbstractC1949x1
            /* JADX INFO: renamed from: k4 */
            public AbstractC6123ca mo10024k4(String str2, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
                return AbstractC1941c5.this.mo10019k4(str2, abstractC6123ca, abstractC6123caArr);
            }
        }), 2);
    }
}

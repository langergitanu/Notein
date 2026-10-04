package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.jw */
/* JADX INFO: loaded from: classes4.dex */
public class C11196jw implements InterfaceC11225vh {

    /* JADX INFO: renamed from: k4 */
    private C11234xw f38591k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3124b3 f38592x1;

    public C11196jw(C11234xw c11234xw, AbstractC3124b3 abstractC3124b3) {
        if (abstractC3124b3 == null) {
            throw new ArgumentNullException("writer");
        }
        this.f38591k4 = c11234xw;
        this.f38592x1 = abstractC3124b3;
    }

    @Override // com.aspose.slides.internal.p430tx.InterfaceC11225vh
    /* JADX INFO: renamed from: k4 */
    public final int mo53837k4(C11226vj c11226vj) {
        C11195jd c11195jdM54067to = c11226vj.m54067to();
        int iM53820du = c11195jdM54067to.m53820du();
        if (iM53820du == 3 || iM53820du == 13 || iM53820du == 14) {
            this.f38592x1.mo13304k4(c11195jdM54067to.m53832to());
        }
        c11226vj.m54066m9();
        return 0;
    }

    @Override // com.aspose.slides.internal.p430tx.InterfaceC11225vh
    /* JADX INFO: renamed from: x1 */
    public final void mo53839x1() {
        this.f38592x1.mo13308kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3124b3 m53838k4() {
        return this.f38592x1;
    }
}

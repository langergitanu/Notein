package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11220u4 extends AbstractC11197k4 {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f38710k4 = new ArrayList();

    /* JADX INFO: renamed from: k4 */
    public final void m54020k4(ArrayList arrayList) {
        this.f38710k4.addRange(arrayList);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54021k4(AbstractC11201lr abstractC11201lr) {
        this.f38710k4.addItem(abstractC11201lr);
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53717k4(C11212rv c11212rv) {
        int size = this.f38710k4.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC11201lr) this.f38710k4.get_Item(i)).mo53683k4(c11212rv);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk == 0) {
            c11231x1.m54114x1(0);
            c11231x1.m54094k4(2);
            while (c11234xw.m54211yj() && ((AbstractC11201lr) this.f38710k4.get_Item(c11231x1.m54111to())).mo53684k4(c11234xw, c11231x1)) {
                if (c11231x1.m54089dy() >= this.f38710k4.size()) {
                    c11231x1.m54091jd();
                    return;
                }
            }
            return;
        }
        if (iM54107kk != 2) {
            C6005k4.m24259k4("Invalid CopyCodeAction execution state");
            return;
        }
        while (c11234xw.m54211yj() && ((AbstractC11201lr) this.f38710k4.get_Item(c11231x1.m54111to())).mo53684k4(c11234xw, c11231x1)) {
            if (c11231x1.m54089dy() >= this.f38710k4.size()) {
                c11231x1.m54091jd();
                return;
            }
        }
    }
}

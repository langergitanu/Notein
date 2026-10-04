package com.aspose.slides.internal.p020ae;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7184h4;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7189m9;
import com.aspose.slides.internal.p329p4.C7190to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ae.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1366x1 extends C1364kk {

    /* JADX INFO: renamed from: k4 */
    private List<C7185jd> f5930k4;

    /* JADX INFO: renamed from: kk */
    private C7180ck f5931kk;

    /* JADX INFO: renamed from: x1 */
    private List<Long> f5932x1;

    public C1366x1(C7180ck c7180ck, C7190to c7190to) {
        super(c7180ck.mo27760kk());
        this.f5931kk = c7180ck;
        m8102k4(c7190to);
    }

    /* JADX INFO: renamed from: kk */
    public final void m8105kk() {
        try {
            int iM27790c5 = this.f5931kk.m27790c5(C7182dy.m27763k4("N"));
            this.f5932x1 = new List<>(iM27790c5);
            this.f5930k4 = new List<>(iM27790c5);
            int i = 0;
            for (int i2 = 0; i2 < iM27790c5; i2++) {
                long jM46112c5 = m8081k4().m46112c5();
                m8081k4().m46113ck();
                this.f5932x1.addItem(Long.valueOf(jM46112c5));
            }
            while (true) {
                C7185jd c7185jdM8103m9 = m8103m9();
                if (c7185jdM8103m9 == null) {
                    break;
                }
                C7184h4 c7184h4 = new C7184h4(c7185jdM8103m9);
                c7184h4.m27774x1(C7189m9.m27821k4());
                if (i < this.f5932x1.size()) {
                    c7184h4.m27770k4((C7179c5) C7189m9.m27822k4(this.f5932x1.get_Item(i).longValue()));
                    this.f5930k4.addItem(c7184h4);
                    if (!m8081k4().m46132x1() && m8081k4().m46126m9() == 'e') {
                        m8081k4().m46129to();
                    }
                    i++;
                }
            }
        } finally {
            m8081k4().dispose();
        }
    }

    /* JADX INFO: renamed from: to */
    public final List<C7185jd> m8106to() {
        return this.f5930k4;
    }
}

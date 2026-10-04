package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4890bz;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C6660ts extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18434k4 = C7019kk.m27443k4((Class<?>) C4890bz.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18435x1 = new C7017h4("get_compact", "set_compact", "get_start", "set_start", "get_type", "set_type");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4890bz c4890bz = (C4890bz) abstractC6123ca.mo24769C_();
        int iM27428k4 = f18435x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10086k4(c4890bz.m20285qw());
        }
        if (iM27428k4 == 1) {
            c4890bz.m20284k4(abstractC6123caArr[0].mo24772k4());
        } else {
            if (iM27428k4 == 2) {
                return m10082k4(c4890bz.m20286tq());
            }
            if (iM27428k4 == 3) {
                c4890bz.m20283k4(abstractC6123caArr[0].m24794wy());
            } else {
                if (iM27428k4 == 4) {
                    return m10085k4(c4890bz.m20282j2());
                }
                if (iM27428k4 != 5) {
                    throw new C6208y2("unknown function");
                }
                c4890bz.m20288wl(abstractC6123caArr[0].toString());
            }
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C12804k4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("compact", 3);
        m10033k4("start", 3);
        m10033k4(C18437z2.f56754h, 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18434k4;
    }
}

package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4917m9;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6647m9 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18408k4 = C7019kk.m27443k4((Class<?>) C4917m9.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18409x1 = new C7017h4("get_color", "set_color", "get_face", "set_face", "get_size", "set_size");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4917m9 c4917m9 = (C4917m9) abstractC6123ca.mo24769C_();
        int iM27428k4 = f18409x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10085k4(c4917m9.m20457qw());
        }
        if (iM27428k4 == 1) {
            c4917m9.m20459wl(abstractC6123caArr[0].toString());
        } else {
            if (iM27428k4 == 2) {
                return m10085k4(c4917m9.m20458tq());
            }
            if (iM27428k4 == 3) {
                c4917m9.m20456qq(abstractC6123caArr[0].toString());
            } else {
                if (iM27428k4 == 4) {
                    return m10082k4(c4917m9.m20454j2());
                }
                if (iM27428k4 != 5) {
                    throw new C6208y2("unknown function");
                }
                c4917m9.m20455k4(abstractC6123caArr[0].m24794wy());
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
        m10033k4("color", 3);
        m10033k4(OptionalModuleUtils.FACE, 3);
        m10033k4("size", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18408k4;
    }
}

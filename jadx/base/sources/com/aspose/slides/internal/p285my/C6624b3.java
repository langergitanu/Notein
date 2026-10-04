package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4918ne;
import com.aspose.slides.internal.p182ii.C4942wy;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.b3 */
/* JADX INFO: loaded from: classes4.dex */
public class C6624b3 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18363k4 = C7019kk.m27443k4((Class<?>) C4942wy.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18364x1 = new C7017h4("get_form", "get_accessKey", "set_accessKey", "get_align", "set_align");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4942wy c4942wy = (C4942wy) abstractC6123ca.mo24769C_();
        int iM27428k4 = f18364x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10084k4(c4942wy.m20717qw(), C7019kk.m27443k4((Class<?>) C4918ne.class));
        }
        if (iM27428k4 == 1) {
            return m10085k4(c4942wy.m20718tq());
        }
        if (iM27428k4 == 2) {
            c4942wy.m20719wl(abstractC6123caArr[0].toString());
        } else {
            if (iM27428k4 == 3) {
                return m10085k4(c4942wy.m20715j2());
            }
            if (iM27428k4 != 4) {
                throw new C6208y2("unknown function");
            }
            c4942wy.m20716qq(abstractC6123caArr[0].toString());
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
        m10033k4("form", 1);
        m10033k4("accessKey", 3);
        m10033k4("align", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18363k4;
    }
}

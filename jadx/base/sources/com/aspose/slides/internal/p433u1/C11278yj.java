package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5550ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12785wl;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C11278yj extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38855k4 = C7019kk.m27443k4((Class<?>) C5550ne.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38856x1 = new C7017h4("get_name", "get_entities", "get_notations", "get_publicId", "get_systemId", "get_internalSubset");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5550ne c5550ne = (C5550ne) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38856x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10085k4(c5550ne.m22767k4());
        }
        if (iM27428k4 == 1) {
            return m10084k4(c5550ne.m22770x1(), C7019kk.m27443k4((Class<?>) InterfaceC12785wl.class));
        }
        if (iM27428k4 == 2) {
            return m10084k4(c5550ne.m22768kk(), C7019kk.m27443k4((Class<?>) InterfaceC12785wl.class));
        }
        if (iM27428k4 == 3) {
            return m10085k4(c5550ne.mo22769to());
        }
        if (iM27428k4 == 4) {
            return m10085k4(c5550ne.mo22765du());
        }
        if (iM27428k4 == 5) {
            return m10085k4(c5550ne.m22766h4());
        }
        throw new C6208y2("unknown function");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5535bv.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("name", 1);
        m10033k4("entities", 1);
        m10033k4("notations", 1);
        m10033k4("publicId", 1);
        m10033k4("systemId", 1);
        m10033k4("internalSubset", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38855k4;
    }
}

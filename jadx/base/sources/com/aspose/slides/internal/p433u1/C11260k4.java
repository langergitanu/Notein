package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5538dq;
import com.aspose.slides.internal.p213jw.C5545k4;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11260k4 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38825k4 = C7019kk.m27443k4((Class<?>) C5545k4.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38826x1 = new C7017h4("get_name", "get_specified", "get_value", "set_value", "get_ownerElement", "get_schemaTypeInfo", "get_isId");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5545k4 c5545k4 = (C5545k4) abstractC6123ca.mo24769C_();
        switch (f38826x1.m27428k4(str)) {
            case 0:
                return m10085k4(c5545k4.mo22738k4());
            case 1:
                return m10086k4(c5545k4.m22743x1());
            case 2:
                return m10085k4(c5545k4.mo22741kk());
            case 3:
                c5545k4.mo22739k4(abstractC6123caArr[0].toString());
                return m10080h4();
            case 4:
                InterfaceC12769ix interfaceC12769ixM22742to = c5545k4.m22742to();
                return interfaceC12769ixM22742to == null ? m10080h4() : m10084k4(interfaceC12769ixM22742to, C14067j2.m66727k4(interfaceC12769ixM22742to));
            case 5:
                return m10084k4(c5545k4.m22736du(), C7019kk.m27443k4((Class<?>) C5538dq.class));
            case 6:
                return m10086k4(c5545k4.mo22737h4());
            default:
                throw new C6208y2("unknown function");
        }
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
        m10033k4("specified", 1);
        m10033k4("value", 3);
        m10033k4("ownerElement", 1);
        m10033k4("schemaTypeInfo", 1);
        m10033k4("isId", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38825k4;
    }
}

package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4891c5;
import com.aspose.slides.internal.p182ii.C4918ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6627c5 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18369k4 = C7019kk.m27443k4((Class<?>) C4891c5.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18370x1 = new C7017h4("get_form", "get_accessKey", "set_accessKey", "get_disabled", "set_disabled", "get_name", "set_name", "get_tabIndex", "set_tabIndex", "get_type", "get_value", "set_value");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4891c5 c4891c5 = (C4891c5) abstractC6123ca.mo24769C_();
        switch (f18370x1.m27428k4(str)) {
            case 0:
                return m10084k4(c4891c5.m20296qw(), C7019kk.m27443k4((Class<?>) C4918ne.class));
            case 1:
                return m10085k4(c4891c5.m20297tq());
            case 2:
                c4891c5.m20299wl(abstractC6123caArr[0].toString());
                break;
            case 3:
                return m10086k4(c4891c5.m20291j2());
            case 4:
                c4891c5.m20293k4(abstractC6123caArr[0].mo24772k4());
                break;
            case 5:
                return m10085k4(c4891c5.m20298w6());
            case 6:
                c4891c5.m20295qq(abstractC6123caArr[0].toString());
                break;
            case 7:
                return m10082k4(c4891c5.m20294os());
            case 8:
                c4891c5.m20292k4(abstractC6123caArr[0].m24794wy());
                break;
            case 9:
                return m10085k4(c4891c5.m20290em());
            case 10:
                return m10085k4(c4891c5.m20300zj());
            case 11:
                c4891c5.m20289ar(abstractC6123caArr[0].toString());
                break;
            default:
                throw new C6208y2("unknown function");
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
        m10033k4("disabled", 3);
        m10033k4("name", 3);
        m10033k4("tabIndex", 3);
        m10033k4(C18437z2.f56754h, 1);
        m10033k4("value", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18369k4;
    }
}

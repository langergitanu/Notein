package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4903gi;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.wp */
/* JADX INFO: loaded from: classes4.dex */
public class C6670wp extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18454k4 = C7019kk.m27443k4((Class<?>) C4903gi.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18455x1 = new C7017h4("get_name", "set_name", "get_type", "set_type", "get_value", "set_value", "get_valueType", "set_valueType");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM20358qw;
        C4903gi c4903gi = (C4903gi) abstractC6123ca.mo24769C_();
        switch (f18455x1.m27428k4(str)) {
            case 0:
                strM20358qw = c4903gi.m20358qw();
                return m10085k4(strM20358qw);
            case 1:
                c4903gi.m20362wl(abstractC6123caArr[0].toString());
                return m10080h4();
            case 2:
                strM20358qw = c4903gi.m20359tq();
                return m10085k4(strM20358qw);
            case 3:
                c4903gi.m20357qq(abstractC6123caArr[0].toString());
                return m10080h4();
            case 4:
                strM20358qw = c4903gi.m20356j2();
                return m10085k4(strM20358qw);
            case 5:
                c4903gi.m20355ar(abstractC6123caArr[0].toString());
                return m10080h4();
            case 6:
                strM20358qw = c4903gi.m20361w6();
                return m10085k4(strM20358qw);
            case 7:
                c4903gi.m20360um(abstractC6123caArr[0].toString());
                return m10080h4();
            default:
                throw new C6208y2("unknown function");
        }
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C12804k4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("name", 3);
        m10033k4(C18437z2.f56754h, 3);
        m10033k4("value", 3);
        m10033k4("valueType", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18454k4;
    }
}

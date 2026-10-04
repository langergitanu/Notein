package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.AbstractC4908jd;
import com.aspose.slides.internal.p182ii.C4918ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6673x6 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18460k4 = C7019kk.m27443k4((Class<?>) C4918ne.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18461x1 = new C7017h4("get_elements", "get_length", "get_name", "set_name", "get_acceptCharset", "set_acceptCharset", "get_action", "set_action", "get_enctype", "set_enctype", "get_method", "set_method", "get_target", "set_target", "submit", "reset");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4918ne c4918ne = (C4918ne) abstractC6123ca.mo24769C_();
        switch (f18461x1.m27428k4(str)) {
            case 0:
                return m10084k4(c4918ne.m20467qw(), C7019kk.m27443k4((Class<?>) AbstractC4908jd.class));
            case 1:
                return m10082k4(c4918ne.m20468tq());
            case 2:
                return m10085k4(c4918ne.m20464j2());
            case 3:
                c4918ne.m20472wl(abstractC6123caArr[0].toString());
                break;
            case 4:
                return m10085k4(c4918ne.m20471w6());
            case 5:
                c4918ne.m20466qq(abstractC6123caArr[0].toString());
                break;
            case 6:
                return m10085k4(c4918ne.m20465os());
            case 7:
                c4918ne.m20461ar(abstractC6123caArr[0].toString());
                break;
            case 8:
                return m10085k4(c4918ne.m20463em());
            case 9:
                c4918ne.m20469um(abstractC6123caArr[0].toString());
                break;
            case 10:
                return m10085k4(c4918ne.m20473zj());
            case 11:
                c4918ne.m20462bv(abstractC6123caArr[0].toString());
                break;
            case 12:
                return m10085k4(c4918ne.m20460ai());
            case 13:
                c4918ne.m20470v4(abstractC6123caArr[0].toString());
                break;
            case 14:
            case 15:
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
        m10035kk("Submit");
        m10035kk("Reset");
        m10033k4("elements", 1);
        m10033k4("length", 1);
        m10033k4("name", 3);
        m10033k4("acceptCharset", 3);
        m10033k4("action", 3);
        m10033k4("enctype", 3);
        m10033k4("method", 3);
        m10033k4("target", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18460k4;
    }
}

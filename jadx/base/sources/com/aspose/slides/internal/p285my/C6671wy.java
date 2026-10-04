package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4885ak;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C6671wy extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18456k4 = C7019kk.m27443k4((Class<?>) C4885ak.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18457x1 = new C7017h4("get_disabled", "set_disabled", "get_charset", "set_charset", "get_href", "set_href", "get_hreflang", "set_hreflang", "get_media", "set_media", "get_rel", "set_rel", "get_rev", "set_rev", "get_target", "set_target", "get_type", "set_type");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4885ak c4885ak = (C4885ak) abstractC6123ca.mo24769C_();
        switch (f18457x1.m27428k4(str)) {
            case 0:
                return m10086k4(c4885ak.m20219qw());
            case 1:
                c4885ak.m20215k4(abstractC6123caArr[0].mo24772k4());
                break;
            case 2:
                return m10085k4(c4885ak.m20221tq());
            case 3:
                c4885ak.m20225wl(abstractC6123caArr[0].toString());
                break;
            case 4:
                return m10085k4(c4885ak.m20214j2());
            case 5:
                c4885ak.m20218qq(abstractC6123caArr[0].toString());
                break;
            case 6:
                return m10085k4(c4885ak.m20224w6());
            case 7:
                c4885ak.m20211ar(abstractC6123caArr[0].toString());
                break;
            case 8:
                return m10085k4(c4885ak.m20217os());
            case 9:
                c4885ak.m20222um(abstractC6123caArr[0].toString());
                break;
            case 10:
                return m10085k4(c4885ak.m20213em());
            case 11:
                c4885ak.m20212bv(abstractC6123caArr[0].toString());
                break;
            case 12:
                return m10085k4(c4885ak.m20227zj());
            case 13:
                c4885ak.m20223v4(abstractC6123caArr[0].toString());
                break;
            case 14:
                return m10085k4(c4885ak.m20210ai());
            case 15:
                c4885ak.m20216lr(abstractC6123caArr[0].toString());
                break;
            case 16:
                return m10085k4(c4885ak.m20220ri());
            case 17:
                c4885ak.m20226yd(abstractC6123caArr[0].toString());
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
        m10033k4("disabled", 3);
        m10033k4("charset", 3);
        m10033k4("href", 3);
        m10033k4("hreflang", 3);
        m10033k4("media", 3);
        m10033k4("rel", 3);
        m10033k4("rev", 3);
        m10033k4("target", 3);
        m10033k4(C18437z2.f56754h, 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18456k4;
    }
}

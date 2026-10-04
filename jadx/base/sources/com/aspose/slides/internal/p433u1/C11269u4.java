package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11269u4 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38840k4 = C7019kk.m27443k4((Class<?>) C12804k4.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38841x1 = new C7017h4("get_id", "set_id", "get_title", "set_title", "get_lang", "set_lang", "get_dir", "set_dir", "get_className", "set_className", "get_style", "set_style");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM59506wl;
        C12804k4 c12804k4 = (C12804k4) abstractC6123ca.mo24769C_();
        switch (f38841x1.m27428k4(str)) {
            case 0:
                strM59506wl = c12804k4.m59506wl();
                return m10085k4(strM59506wl);
            case 1:
                c12804k4.m59495jd(abstractC6123caArr[0].toString());
                return m10080h4();
            case 2:
                strM59506wl = c12804k4.m59501qq();
                return m10085k4(strM59506wl);
            case 3:
                c12804k4.m59491ck(abstractC6123caArr[0].toString());
                return m10080h4();
            case 4:
                strM59506wl = c12804k4.m59489bv();
                return m10085k4(strM59506wl);
            case 5:
                c12804k4.m59493fa(abstractC6123caArr[0].toString());
                return m10080h4();
            case 6:
                strM59506wl = c12804k4.m59494gi();
                return m10085k4(strM59506wl);
            case 7:
                c12804k4.m59504up(abstractC6123caArr[0].toString());
                return m10080h4();
            case 8:
                strM59506wl = c12804k4.m59502s7();
                return m10085k4(strM59506wl);
            case 9:
                c12804k4.m59508yj(abstractC6123caArr[0].toString());
                return m10080h4();
            case 10:
                strM59506wl = c12804k4.m59492f9();
                return m10085k4(strM59506wl);
            case 11:
                c12804k4.m59503u4(abstractC6123caArr[0].toString());
                return m10080h4();
            default:
                throw new C6208y2("unknown function");
        }
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C5543ix.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("id", 3);
        m10033k4(NoteMeta.PROPERTY_TITLE, 3);
        m10033k4(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, 3);
        m10033k4("dir", 3);
        m10033k4("className", 3);
        m10033k4("style", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38840k4;
    }
}

package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.AbstractC5539du;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11261kk extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38827k4 = C7019kk.m27443k4((Class<?>) AbstractC5539du.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38828x1 = new C7017h4("get_data", "set_data", "get_length", "substringData", "appendData", "insertData", "deleteData", "replaceData");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC5539du abstractC5539du = (AbstractC5539du) abstractC6123ca.mo24769C_();
        switch (f38828x1.m27428k4(str)) {
            case 0:
                return m10085k4(abstractC5539du.mo22687k4());
            case 1:
                abstractC5539du.m22691k4(abstractC6123caArr[0].toString());
                break;
            case 2:
                return m10082k4(abstractC5539du.m22693x1());
            case 3:
                if (abstractC6123caArr.length == 2) {
                    return m10085k4(abstractC5539du.m22688k4(abstractC6123caArr[0].m24794wy(), abstractC6123caArr[1].m24794wy()));
                }
                throw new C6208y2("invalid arguments count.");
            case 4:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                abstractC5539du.mo22692to(abstractC6123caArr[0].toString());
                break;
                break;
            case 5:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                abstractC5539du.m22690k4(abstractC6123caArr[0].m24794wy(), abstractC6123caArr[1].toString());
                break;
                break;
            case 6:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                abstractC5539du.m22694x1(abstractC6123caArr[0].m24794wy(), abstractC6123caArr[1].m24794wy());
                break;
                break;
            case 7:
                if (abstractC6123caArr.length != 3) {
                    throw new C6208y2("invalid arguments count.");
                }
                abstractC5539du.m22689k4(abstractC6123caArr[0].m24794wy(), abstractC6123caArr[1].m24794wy(), abstractC6123caArr[2].toString());
                break;
                break;
            default:
                throw new C6208y2("unknown function");
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5535bv.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("substringData");
        m10035kk("appendData");
        m10035kk("insertData");
        m10035kk("deleteData");
        m10035kk("replaceData");
        m10033k4(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, 3);
        m10033k4("length", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38827k4;
    }
}

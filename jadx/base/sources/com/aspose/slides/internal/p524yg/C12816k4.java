package com.aspose.slides.internal.p524yg;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p304nv.C6951k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yg.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12816k4 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f42637k4 = C7019kk.m27443k4((Class<?>) C6951k4.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f42638x1 = new C7017h4("get_bubbles", "get_cancelable", "get_currentTarget", "get_eventPhase", "get_target", "get_timeStamp", "get_type", "initEvent", "preventDefault", "stopPropagation");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C6951k4 c6951k4 = (C6951k4) abstractC6123ca.mo24769C_();
        switch (f42638x1.m27428k4(str)) {
            case 0:
                return m10086k4(c6951k4.m27203x1());
            case 1:
                return m10086k4(c6951k4.m27200kk());
            case 2:
                AbstractC5535bv abstractC5535bv = (AbstractC5535bv) C7019kk.m27452k4((Object) c6951k4.m27195du(), AbstractC5535bv.class);
                return abstractC5535bv == null ? m10080h4() : m10084k4(abstractC5535bv, C14067j2.m66727k4(abstractC5535bv));
            case 3:
                return m10082k4(c6951k4.m27202to());
            case 4:
                AbstractC5535bv abstractC5535bv2 = (AbstractC5535bv) C7019kk.m27452k4((Object) c6951k4.m27195du(), AbstractC5535bv.class);
                return abstractC5535bv2 == null ? m10080h4() : m10084k4(abstractC5535bv2, C14067j2.m66727k4(abstractC5535bv2));
            case 5:
                return m10082k4(C7019kk.m27433c5(Long.valueOf(c6951k4.m27197h4()), 12));
            case 6:
                return m10085k4(c6951k4.mo25861k4());
            case 7:
                if (abstractC6123caArr.length != 3) {
                    throw new C6208y2("invalid arguments count.");
                }
                c6951k4.m27199k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].mo24772k4(), abstractC6123caArr[2].mo24772k4());
                return m10080h4();
            case 8:
                if (abstractC6123caArr.length != 0) {
                    throw new C6208y2("invalid arguments count.");
                }
                c6951k4.m27201m9();
                return m10080h4();
            case 9:
                if (abstractC6123caArr.length != 0) {
                    throw new C6208y2("invalid arguments count.");
                }
                c6951k4.m27196dy();
                return m10080h4();
            default:
                throw new C6208y2("unknown function");
        }
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("initEvent");
        m10035kk("preventDefault");
        m10035kk("stopPropagation");
        m10033k4("bubbles", 1);
        m10033k4("cancelable", 1);
        m10033k4("currentTarget", 1);
        m10033k4("eventPhase", 1);
        m10033k4("target", 1);
        m10033k4("timeStamp", 1);
        m10033k4(C18437z2.f56754h, 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f42637k4;
    }
}

package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p407st.AbstractC10456gv;

/* JADX INFO: renamed from: com.aspose.slides.is */
/* JADX INFO: loaded from: classes3.dex */
class C13658is {
    /* JADX INFO: renamed from: k4 */
    public static void m63092k4(ICustomData iCustomData, AbstractC10456gv abstractC10456gv) {
        if (abstractC10456gv == null) {
            return;
        }
        CustomData customData = (CustomData) iCustomData;
        customData.m1276k4().m67742k4(abstractC10456gv.m50854c5());
        ctl.m4807k4(customData.getTags(), abstractC10456gv);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m63093x1(ICustomData iCustomData, AbstractC10456gv abstractC10456gv) {
        if (iCustomData == null || iCustomData.getTags() == null || iCustomData.getTags().size() == 0) {
            return;
        }
        if (abstractC10456gv == null) {
            throw new InvalidOperationException();
        }
        ctl.m4808x1(iCustomData.getTags(), abstractC10456gv);
    }
}

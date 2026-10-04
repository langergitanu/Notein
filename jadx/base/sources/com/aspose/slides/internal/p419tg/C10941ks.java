package com.aspose.slides.internal.p419tg;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C10941ks {

    /* JADX INFO: renamed from: k4 */
    private String f38092k4;

    /* JADX INFO: renamed from: x1 */
    private C10946yj f38093x1;

    public C10941ks(String str) {
        this.f38092k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public C10946yj m52790k4() {
        if (this.f38093x1 == null) {
            this.f38093x1 = new C10946yj(C3141rv.m13412x1(this.f38092k4, "Trust"), true);
        }
        return this.f38093x1;
    }

    /* JADX INFO: renamed from: k4 */
    public C10946yj m52791k4(String str, boolean z) {
        if (str == null) {
            throw new ArgumentNullException("storeName");
        }
        String strM13412x1 = C3141rv.m13412x1(this.f38092k4, str);
        if (z || C3142to.m13421kk(strM13412x1)) {
            return new C10946yj(strM13412x1, true);
        }
        return null;
    }
}

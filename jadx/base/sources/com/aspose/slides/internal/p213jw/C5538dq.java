package com.aspose.slides.internal.p213jw;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p517y2.InterfaceC12774lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.dq */
/* JADX INFO: loaded from: classes.dex */
public class C5538dq implements InterfaceC12774lr {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5535bv f15209k4;

    public C5538dq(AbstractC5535bv abstractC5535bv) {
        this.f15209k4 = abstractC5535bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m22684k4() {
        if (this.f15209k4.mo22608fa() == 2) {
            return "attribute";
        }
        if (this.f15209k4.mo22608fa() == 1) {
            return "element";
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m22686x1() {
        if (this.f15209k4.mo22608fa() == 2 || this.f15209k4.mo22608fa() == 1) {
            return this.f15209k4.mo22634jd();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m22685k4(String str, String str2, byte b) {
        throw new NotImplementedException();
    }
}

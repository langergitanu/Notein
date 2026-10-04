package com.aspose.slides.internal.p072d2;

import android.graphics.Bitmap;
import com.aspose.slides.internal.p066cl.AbstractC2619c5;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p490x2.C12372k4;
import java.io.IOException;

/* JADX INFO: renamed from: com.aspose.slides.internal.d2.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3004k4 extends AbstractC2619c5 {
    /* JADX INFO: renamed from: x1 */
    private Bitmap.CompressFormat m12650x1(C3977ck c3977ck) {
        return c3977ck.equals(C3977ck.m15678dy()) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.graphics.Bitmap$CompressFormat, com.alipay.share.sdk.openapi.BaseReq] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.graphics.Bitmap, com.alipay.share.sdk.openapi.IAPAPIEventHandler] */
    @Override // com.aspose.slides.internal.p066cl.AbstractC2619c5
    /* JADX INFO: renamed from: k4 */
    public void mo11957k4(InterfaceC2624k4 interfaceC2624k4) throws IOException {
        ?? Mo11984k4 = ((C12372k4) interfaceC2624k4).mo11984k4();
        if (this.f8431x1.equals(C3977ck.m15682kk())) {
            try {
                C3007x1.m12666k4(Mo11984k4, this.f8430k4.toOutputStream());
            } catch (IOException e) {
                throw new com.aspose.slides.exceptions.IOException("IOException while saving BMP", e);
            }
        } else {
            ?? M12650x1 = m12650x1(this.f8431x1);
            this.f8430k4.toOutputStream();
            Mo11984k4.onReq(M12650x1);
        }
    }
}

package com.aspose.slides.p559ms.backend.android.System.Drawing;

import android.graphics.PointF;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14123kk;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C14127ck implements InterfaceC14123kk<PointF> {

    /* JADX INFO: renamed from: k4 */
    private PointF f47402k4;

    public C14127ck(PointF pointF) {
        this.f47402k4 = new PointF(0.0f, 0.0f);
        if (pointF != null) {
            this.f47402k4 = pointF;
        }
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14123kk
    /* JADX INFO: renamed from: k4 */
    public float mo67605k4() {
        return this.f47402k4.x;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14123kk
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public PointF mo67607kk() {
        return this.f47402k4;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14123kk
    /* JADX INFO: renamed from: x1 */
    public float mo67608x1() {
        return this.f47402k4.y;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14123kk
    /* JADX INFO: renamed from: k4 */
    public void mo67606k4(float f) {
        this.f47402k4.x = f;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14123kk
    /* JADX INFO: renamed from: x1 */
    public void mo67609x1(float f) {
        this.f47402k4.y = f;
    }
}

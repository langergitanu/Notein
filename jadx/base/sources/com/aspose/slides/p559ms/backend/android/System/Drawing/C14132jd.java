package com.aspose.slides.p559ms.backend.android.System.Drawing;

import android.graphics.Point;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14125x1;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.jd */
/* JADX INFO: loaded from: classes5.dex */
class C14132jd implements InterfaceC14125x1<Point> {

    /* JADX INFO: renamed from: k4 */
    private Point f47403k4;

    public C14132jd(Point point) {
        this.f47403k4 = new Point(0, 0);
        if (point != null) {
            this.f47403k4 = point;
        }
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14125x1
    /* JADX INFO: renamed from: k4 */
    public int mo67653k4() {
        return this.f47403k4.x;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14125x1
    /* JADX INFO: renamed from: x1 */
    public int mo67655x1() {
        return this.f47403k4.y;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14125x1
    /* JADX INFO: renamed from: k4 */
    public void mo67654k4(int i) {
        this.f47403k4.x = i;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14125x1
    /* JADX INFO: renamed from: x1 */
    public void mo67656x1(int i) {
        this.f47403k4.y = i;
    }
}

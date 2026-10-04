package com.aspose.slides.internal.p490x2;

import android.graphics.Bitmap;
import com.aspose.slides.internal.p066cl.InterfaceC2622h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.x2.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12370dy extends C12372k4 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC2622h4<Bitmap> f41350k4 = null;

    /* JADX INFO: renamed from: x1 */
    private int f41351x1;

    private C12370dy() {
    }

    /* JADX INFO: renamed from: k4 */
    public static C12370dy m57951k4(InterfaceC2622h4<Bitmap> interfaceC2622h4, int i) {
        C12370dy c12370dy = new C12370dy();
        c12370dy.f41350k4 = interfaceC2622h4;
        c12370dy.f41351x1 = i;
        return c12370dy;
    }

    @Override // com.aspose.slides.internal.p490x2.C12372k4
    /* JADX INFO: renamed from: yj */
    public Bitmap mo57952yj() {
        Bitmap bitmapMo57952yj = super.mo57952yj();
        if (bitmapMo57952yj != null) {
            return bitmapMo57952yj;
        }
        m57964x1(this.f41350k4.mo8291k4(this.f41351x1));
        return super.mo57952yj();
    }
}

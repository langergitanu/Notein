package com.aspose.slides.internal.p332p7;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.inappmessaging.internal.Logging;
import oO00o00o.InterfaceC32329OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0O0 implements ShapeAppearanceModel.CornerSizeUnaryOperator, InterfaceC32329OooO00o {
    public static double OooO00o(int i, int i2, String str, String str2) {
        return C13850af.m65132uz(C14113y2.m67443x1(str2, i2, str.length() - i));
    }

    public static String OooO0O0(String str, boolean z) {
        return str + z;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    @Override // oO00o00o.InterfaceC32329OooO00o
    public void run() {
        Logging.logd("Wrote to cache");
    }
}

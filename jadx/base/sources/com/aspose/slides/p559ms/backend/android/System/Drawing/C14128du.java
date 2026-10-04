package com.aspose.slides.p559ms.backend.android.System.Drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.du */
/* JADX INFO: loaded from: classes5.dex */
class C14128du implements AbstractC14124to.x1<Bitmap, Canvas> {
    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.x1
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public InterfaceC14122k4 mo67651k4(Bitmap bitmap) {
        return new C14137to(new Canvas(bitmap));
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.x1
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public InterfaceC14122k4 mo67652x1(Canvas canvas) {
        return new C14137to(canvas);
    }
}

package com.aspose.slides.p559ms.backend.android.System.Drawing;

import android.graphics.Rect;
import android.graphics.RectF;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.up */
/* JADX INFO: loaded from: classes5.dex */
class C14138up implements AbstractC14124to.dy<Rect, RectF> {
    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.dy
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C12007ix mo67636k4(RectF rectF) {
        return new C12007ix(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.dy
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public RectF mo67637k4(C12007ix c12007ix) {
        return new RectF(c12007ix.m56571to(), c12007ix.m56554dy(), c12007ix.m56556h4(), c12007ix.m56558k4());
    }
}

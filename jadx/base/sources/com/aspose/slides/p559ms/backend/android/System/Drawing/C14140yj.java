package com.aspose.slides.p559ms.backend.android.System.Drawing;

import com.aspose.slides.android.Size;
import com.aspose.slides.android.SizeF;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.yj */
/* JADX INFO: loaded from: classes5.dex */
class C14140yj implements AbstractC14124to.c5<Size, SizeF> {
    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.c5
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12015qq mo67633x1(SizeF sizeF) {
        return new C12015qq(sizeF.getWidth(), sizeF.getHeight());
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.c5
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public Size mo67632k4(C12023wl c12023wl) {
        return new Size(c12023wl.m56865x1(), c12023wl.m56862kk());
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.c5
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C12023wl mo67630k4(Size size) {
        return new C12023wl(size.getWidth(), size.getHeight());
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.c5
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public SizeF mo67631k4(C12015qq c12015qq) {
        return new SizeF(c12015qq.m56699x1(), c12015qq.m56697kk());
    }
}

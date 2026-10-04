package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p129fe.C3988to;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.up */
/* JADX INFO: loaded from: classes5.dex */
public class C12484up extends AbstractC12465du {
    public C12484up(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12465du, com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: kk */
    public int mo58020kk(int i) {
        return C3988to.f10879x1[Math.round(((((i >> 16) & 255) + ((i >> 8) & 255)) + (i & 255)) / 3.0f)];
    }
}

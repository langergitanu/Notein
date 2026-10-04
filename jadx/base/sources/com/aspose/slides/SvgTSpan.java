package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class SvgTSpan implements ISvgTSpan {

    /* JADX INFO: renamed from: k4 */
    private String f3484k4;

    @Override // com.aspose.slides.ISvgTSpan
    public final String getId() {
        return this.f3484k4;
    }

    @Override // com.aspose.slides.ISvgTSpan
    public final void setId(String str) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentNullException("value");
        }
        this.f3484k4 = str;
    }
}

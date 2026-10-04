package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class b2l extends tf7 {

    /* JADX INFO: renamed from: m9 */
    private final byte f4072m9;

    public b2l(ajz ajzVar, C12003du c12003du, C12003du c12003du2, byte b, boolean z) {
        super(ajzVar, z);
        this.f4865k4 = (byte) 3;
        m5678k4(c12003du.Clone());
        m5683x1(c12003du2.Clone());
        this.f4072m9 = b;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC12002ck m3942ck() {
        if (m5681to() == 3) {
            return PatternFormat.m2211k4(false, this.f4072m9, m5682x1().Clone(), m5676k4().Clone());
        }
        throw new InvalidOperationException(C14113y2.m67408k4("GetPatternImage for ", C14042ak.m66410k4(FillType.class, m5681to()), " filling called"));
    }

    /* JADX INFO: renamed from: jd */
    public final byte m3943jd() {
        return this.f4072m9;
    }
}

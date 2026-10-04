package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.sl */
/* JADX INFO: loaded from: classes3.dex */
class C2292sl {

    /* JADX INFO: renamed from: k4 */
    public C2007b2 f7900k4;

    /* JADX INFO: renamed from: kk */
    public byte[] f7901kk;

    /* JADX INFO: renamed from: to */
    public byte[] f7902to;

    /* JADX INFO: renamed from: x1 */
    public byte[] f7903x1;

    public C2292sl(byte[] bArr) {
        C2007b2 c2007b2 = new C2007b2(bArr);
        this.f7900k4 = c2007b2;
        if (C7019kk.m27462to(Byte.valueOf(c2007b2.f6988k4), 6) != 3) {
            throw new InvalidOperationException(C14113y2.m67408k4("Mtx font version is incorrect. Supported '3' but was ", C14098up.m67323x1(this.f7900k4.f6988k4)));
        }
        C2007b2 c2007b22 = this.f7900k4;
        int i = c2007b22.f6990to;
        int i2 = c2007b22.f6989kk;
        if (i <= i2) {
            throw new InvalidOperationException("Incorrect structure of Mtx font. CodeBlockOffset less or equal to DataBlockOffset.");
        }
        this.f7903x1 = new byte[i2 - C7019kk.m27462to((Object) (byte) 10, 6)];
        C2007b2 c2007b23 = this.f7900k4;
        int i3 = c2007b23.f6990to;
        this.f7901kk = new byte[i3 - c2007b23.f6989kk];
        this.f7902to = new byte[bArr.length - i3];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), C7019kk.m27462to((Object) (byte) 10, 6), AbstractC14092to.m67208k4((Object) this.f7903x1), 0, this.f7903x1.length);
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), this.f7900k4.f6989kk, AbstractC14092to.m67208k4((Object) this.f7901kk), 0, this.f7901kk.length);
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), this.f7900k4.f6990to, AbstractC14092to.m67208k4((Object) this.f7902to), 0, this.f7902to.length);
    }
}

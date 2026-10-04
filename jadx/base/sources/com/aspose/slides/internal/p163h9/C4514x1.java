package com.aspose.slides.internal.p163h9;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p130fh.C3993k4;
import com.aspose.slides.internal.p130fh.C3995to;
import com.aspose.slides.internal.p130fh.C3996x1;
import com.aspose.slides.internal.p151gj.C4325rv;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.h9.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4514x1 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 f12574k4;

    /* JADX INFO: renamed from: x1 */
    private C4513kk f12575x1 = null;

    private C4514x1(AbstractC3150x6 abstractC3150x6) {
        this.f12574k4 = abstractC3150x6;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C4513kk m18605k4(int i) {
        if (this.f12575x1 != null) {
            throw new InvalidOperationException("GifFrameEncoder begun already.");
        }
        this.f12574k4.writeByte((byte) 33);
        this.f12574k4.writeByte((byte) -7);
        C3996x1 c3996x1 = new C3996x1();
        c3996x1.f10914k4 = i;
        c3996x1.f10916x1 = -1;
        c3996x1.m15788k4(this.f12574k4);
        C4513kk c4513kk = new C4513kk(this);
        this.f12575x1 = c4513kk;
        return c4513kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4514x1 m18603k4(AbstractC3150x6 abstractC3150x6, C4329x6 c4329x6, IGenericList<C4325rv> iGenericList, byte b) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to(C14113y2.m67408k4("GIF", "89a"));
        abstractC3150x6.write(bArrMo26677to, 0, bArrMo26677to.length);
        C3995to c3995to = new C3995to();
        c3995to.f10910k4 = c4329x6.f11827kk & 65535;
        c3995to.f10913x1 = c4329x6.f11828to & 65535;
        c3995to.f10911kk = b;
        if (iGenericList != null && iGenericList.size() > 0) {
            int size = iGenericList.size();
            c3995to.f10912to = size;
            int[] iArr = {size};
            m18604k4(iArr);
            c3995to.f10912to = iArr[0];
        }
        c3995to.m15782k4(abstractC3150x6);
        int i = c3995to.f10912to;
        if (i > 0) {
            C3993k4.m15774k4(abstractC3150x6, i, iGenericList, new C4325rv());
        }
        return new C4514x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18606k4(C4513kk c4513kk) {
        if (this.f12575x1 != c4513kk) {
            return;
        }
        this.f12575x1 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18604k4(int[] iArr) {
        int i = 2;
        if (iArr[0] < 2) {
            iArr[0] = 2;
        }
        while (i < iArr[0]) {
            i *= 2;
        }
        iArr[0] = i;
    }
}

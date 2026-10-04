package com.aspose.slides.internal.p049bx;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.internal.p488x0.C12333du;
import com.aspose.slides.internal.p488x0.C12346to;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.bx.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1879h4 {

    /* JADX INFO: renamed from: du */
    private long f6749du;

    /* JADX INFO: renamed from: h4 */
    private long f6750h4;

    /* JADX INFO: renamed from: k4 */
    private long f6751k4;

    /* JADX INFO: renamed from: kk */
    private long f6752kk;

    /* JADX INFO: renamed from: m9 */
    private int f6753m9;

    /* JADX INFO: renamed from: to */
    private long f6754to;

    /* JADX INFO: renamed from: x1 */
    private int f6755x1;

    public C1879h4() {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9797k4(C3149x1 c3149x1, C12331c5 c12331c5) {
        if ((c12331c5.m57630k4().m57756k4() & 4294967295L) == 12) {
            new C1893x1().m9813k4(c3149x1, c12331c5.m57630k4());
        } else {
            new C1883kk().m9803k4(c3149x1, c12331c5.m57630k4());
        }
        if (c12331c5.m57637to() != null) {
            c3149x1.m13450k4(c12331c5.m57637to());
        }
        c3149x1.m13450k4(c12331c5.m57629h4());
    }

    public C1879h4(long j, int i, long j2, long j3, long j4, long j5, int i2) {
        this.f6751k4 = j;
        this.f6755x1 = i;
        this.f6752kk = j2;
        this.f6754to = j3;
        this.f6749du = j4;
        this.f6750h4 = j5;
        this.f6753m9 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9798k4(C3149x1 c3149x1, C12535to c12535to) {
        int position = (int) ((this.f6751k4 + ((long) this.f6755x1)) - c3149x1.m13442k4().getPosition());
        if (this.f6755x1 > c3149x1.m13442k4().getPosition() - this.f6751k4) {
            C12331c5 c12331c5 = (C12331c5) c12535to;
            if ((this.f6754to & 4294967295L) <= 0) {
                c3149x1.m13442k4().seek(position, 1);
                return;
            }
            c3149x1.m13442k4().seek(this.f6751k4 + (this.f6752kk & 4294967295L), 0);
            if (C7019kk.m27469x1(c12331c5.m57630k4(), C12346to.class)) {
                C12346to c12346to = (C12346to) C7019kk.m27452k4((Object) c12331c5.m57630k4(), C12346to.class);
                c3149x1.m13447k4(c12346to.m57756k4() & 4294967295L);
                c3149x1.m13446k4(c12346to.m57805to() & 65535);
                c3149x1.m13446k4(c12346to.m57802h4() & 65535);
                c3149x1.m13446k4(c12346to.m57760x1() & 65535);
                c3149x1.m13446k4(c12346to.m57759kk() & 65535);
            } else {
                C12333du c12333du = (C12333du) C7019kk.m27452k4((Object) c12331c5.m57630k4(), C12333du.class);
                if (c12333du == null) {
                    throw new InvalidOperationException("Unexpected DeviceIndependentBitmap Header");
                }
                c3149x1.m13447k4(c12333du.m57756k4() & 4294967295L);
                c3149x1.m13455x1(c12333du.m57662to());
                c3149x1.m13455x1(c12333du.m57654h4());
                c3149x1.m13446k4(c12333du.m57760x1() & 65535);
                c3149x1.m13446k4(c12333du.m57759kk() & 65535);
                c3149x1.m13447k4(c12333du.m57661m9() & 4294967295L);
                c3149x1.m13447k4(c12333du.m57652dy() & 4294967295L);
                c3149x1.m13455x1(c12333du.m57648c5());
                c3149x1.m13455x1(c12333du.m57656jd());
                c3149x1.m13447k4(c12333du.m57649ck() & 4294967295L);
                c3149x1.m13447k4(c12333du.m57653fa() & 4294967295L);
            }
            if (((int) ((this.f6754to & 4294967295L) - ((c3149x1.m13442k4().getPosition() - (this.f6751k4 + (this.f6752kk & 4294967295L))) & 4294967295L))) > 3) {
                c3149x1.m13450k4(c12331c5.m57637to());
            }
            c3149x1.m13442k4().seek(this.f6751k4 + (4294967295L & this.f6749du), 0);
            c3149x1.m13450k4(c12331c5.m57629h4());
        }
    }
}

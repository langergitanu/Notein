package com.aspose.slides.internal.p075d5;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d5.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3020k4 extends C3019h4 {

    /* JADX INFO: renamed from: k4 */
    private byte f8852k4;

    public C3020k4(byte b, byte b2, byte b3, byte b4) {
        super(b2, b3, b4);
        this.f8852k4 = b;
        if ((b & 255) == 0) {
            m12702k4((byte) 0);
            m12708x1((byte) 0);
            m12705kk((byte) 0);
        }
    }

    @Override // com.aspose.slides.internal.p075d5.C3019h4
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m12710k4((C3020k4) obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m12709k4() {
        return this.f8852k4;
    }

    @Override // com.aspose.slides.internal.p075d5.C3019h4
    /* JADX INFO: renamed from: x1 */
    public C12003du mo12707x1() {
        return C12003du.m56398k4(m12709k4() & 255, m12704kk() & 255, m12706to() & 255, m12701du() & 255);
    }

    public C3020k4(C12003du c12003du) {
        super(c12003du.Clone());
        this.f8852k4 = c12003du.m56501c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m12710k4(C3020k4 c3020k4) {
        return m12703k4((C3019h4) c3020k4) && this.f8852k4 == c3020k4.f8852k4;
    }
}

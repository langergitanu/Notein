package com.aspose.slides.internal.p500xi;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xi.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12532k4 extends C12534m9 {

    /* JADX INFO: renamed from: k4 */
    private byte f41965k4;

    public C12532k4(byte b, byte b2, byte b3, byte b4) {
        super(b2, b3, b4);
        this.f41965k4 = b;
        if ((b & 255) == 0) {
            m58356k4((byte) 0);
            m58361x1((byte) 0);
            m58359kk((byte) 0);
        }
    }

    @Override // com.aspose.slides.internal.p500xi.C12534m9
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
        return m58348k4((C12532k4) obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m58347k4() {
        return this.f41965k4;
    }

    @Override // com.aspose.slides.internal.p500xi.C12534m9
    /* JADX INFO: renamed from: x1 */
    public C12003du mo58349x1() {
        return C12003du.m56398k4(m58347k4() & 255, m58358kk() & 255, m58360to() & 255, m58355du() & 255);
    }

    public C12532k4(C12003du c12003du) {
        super(c12003du.Clone());
        this.f41965k4 = c12003du.m56501c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58348k4(C12532k4 c12532k4) {
        return m58357k4((C12534m9) c12532k4) && this.f41965k4 == c12532k4.f41965k4;
    }
}

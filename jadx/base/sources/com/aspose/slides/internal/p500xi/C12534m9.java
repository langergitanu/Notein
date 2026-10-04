package com.aspose.slides.internal.p500xi;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xi.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12534m9 {

    /* JADX INFO: renamed from: k4 */
    private byte f41968k4;

    /* JADX INFO: renamed from: kk */
    private byte f41969kk;

    /* JADX INFO: renamed from: x1 */
    private byte f41970x1;

    public C12534m9(byte b, byte b2, byte b3) {
        this.f41968k4 = b;
        this.f41970x1 = b2;
        this.f41969kk = b3;
    }

    /* JADX INFO: renamed from: du */
    public final byte m58355du() {
        return this.f41969kk;
    }

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
        return m58357k4((C12534m9) obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58356k4(byte b) {
        this.f41968k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m58358kk() {
        return this.f41968k4;
    }

    /* JADX INFO: renamed from: to */
    public final byte m58360to() {
        return this.f41970x1;
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du mo58349x1() {
        return C12003du.m56398k4(255, this.f41968k4 & 255, this.f41970x1 & 255, this.f41969kk & 255);
    }

    public C12534m9(C12003du c12003du) {
        this.f41968k4 = c12003du.m56507jd();
        this.f41970x1 = c12003du.m56502ck();
        this.f41969kk = c12003du.m56505fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58357k4(C12534m9 c12534m9) {
        return this.f41968k4 == c12534m9.f41968k4 && this.f41970x1 == c12534m9.f41970x1 && this.f41969kk == c12534m9.f41969kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m58359kk(byte b) {
        this.f41969kk = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58361x1(byte b) {
        this.f41970x1 = b;
    }
}

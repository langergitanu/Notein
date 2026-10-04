package com.aspose.slides.internal.p488x0;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12353x6 {

    /* JADX INFO: renamed from: k4 */
    private byte f41322k4;

    /* JADX INFO: renamed from: kk */
    private byte f41323kk;

    /* JADX INFO: renamed from: x1 */
    private byte f41324x1;

    public C12353x6(byte b) {
        m57886k4(b);
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
        return m57887k4((C12353x6) obj);
    }

    public int hashCode() {
        return (((C14098up.m67317k4(this.f41322k4) * 397) ^ (this.f41324x1 & 255)) * 397) ^ (this.f41323kk & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m57885k4() {
        return this.f41322k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m57888kk() {
        return this.f41323kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m57889x1() {
        return this.f41324x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57886k4(byte b) {
        this.f41322k4 = b;
        this.f41324x1 = (byte) ((b & 255) >> 4);
        this.f41323kk = (byte) (b & 3);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57887k4(C12353x6 c12353x6) {
        return this.f41322k4 == c12353x6.f41322k4 && this.f41324x1 == c12353x6.f41324x1 && this.f41323kk == c12353x6.f41323kk;
    }
}

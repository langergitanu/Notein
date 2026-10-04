package com.aspose.slides.internal.p498xe;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12505dy extends C3023to {

    /* JADX INFO: renamed from: du */
    private int f41848du = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: k4 */
    private byte f41849k4;

    /* JADX INFO: renamed from: kk */
    private byte f41850kk;

    /* JADX INFO: renamed from: to */
    private byte f41851to;

    /* JADX INFO: renamed from: x1 */
    private byte f41852x1;

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
        return m58101k4((C12505dy) obj);
    }

    public int hashCode() {
        return (((((((C14098up.m67317k4(this.f41849k4) * 397) ^ C14098up.m67317k4(this.f41852x1)) * 397) ^ C14098up.m67317k4(this.f41850kk)) * 397) ^ C14098up.m67317k4(this.f41851to)) * 397) ^ this.f41848du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m58099k4() {
        return C12003du.m56396k4(this.f41848du);
    }

    /* JADX INFO: renamed from: kk */
    public final void m58102kk(byte b) {
        this.f41850kk = b;
        this.f41848du = (b & 255) | (this.f41848du & InputDeviceCompat.SOURCE_ANY);
    }

    /* JADX INFO: renamed from: to */
    public final void m58103to(byte b) {
        this.f41851to = b;
    }

    public String toString() {
        return C14113y2.m67402k4("[Red: {0}, Green: {1}, Blue: {2}, Reserved: {3}]", Byte.valueOf(this.f41849k4), Byte.valueOf(this.f41852x1), Byte.valueOf(this.f41850kk), Byte.valueOf(this.f41851to));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58104x1(byte b) {
        this.f41852x1 = b;
        this.f41848du = ((b & 255) << 8) | (this.f41848du & (-65281));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58100k4(byte b) {
        this.f41849k4 = b;
        this.f41848du = ((b & 255) << 16) | (this.f41848du & (-16711681));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58101k4(C12505dy c12505dy) {
        return this.f41849k4 == c12505dy.f41849k4 && this.f41852x1 == c12505dy.f41852x1 && this.f41850kk == c12505dy.f41850kk && this.f41851to == c12505dy.f41851to && this.f41848du == c12505dy.f41848du;
    }
}

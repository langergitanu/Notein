package com.aspose.slides.internal.p488x0;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12334dy extends C12535to {

    /* JADX INFO: renamed from: du */
    private int f41224du = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: k4 */
    private byte f41225k4;

    /* JADX INFO: renamed from: kk */
    private byte f41226kk;

    /* JADX INFO: renamed from: to */
    private byte f41227to;

    /* JADX INFO: renamed from: x1 */
    private byte f41228x1;

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
        return m57669k4((C12334dy) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m57666h4() {
        return C12003du.m56396k4(this.f41224du);
    }

    public int hashCode() {
        return (((((((C14098up.m67317k4(this.f41225k4) * 397) ^ C14098up.m67317k4(this.f41228x1)) * 397) ^ C14098up.m67317k4(this.f41226kk)) * 397) ^ C14098up.m67317k4(this.f41227to)) * 397) ^ this.f41224du;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m57667k4() {
        return this.f41225k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m57670kk() {
        return this.f41226kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m57672to() {
        return this.f41227to;
    }

    public String toString() {
        return C14113y2.m67402k4("[Red: {0}, Green: {1}, Blue: {2}, Reserved: {3}]", Byte.valueOf(this.f41225k4), Byte.valueOf(this.f41228x1), Byte.valueOf(this.f41226kk), Byte.valueOf(this.f41227to));
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m57674x1() {
        return this.f41228x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57668k4(byte b) {
        this.f41225k4 = b;
        this.f41224du = ((b & 255) << 16) | (this.f41224du & (-16711681));
    }

    /* JADX INFO: renamed from: kk */
    public final void m57671kk(byte b) {
        this.f41226kk = b;
        this.f41224du = (b & 255) | (this.f41224du & InputDeviceCompat.SOURCE_ANY);
    }

    /* JADX INFO: renamed from: to */
    public final void m57673to(byte b) {
        this.f41227to = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57675x1(byte b) {
        this.f41228x1 = b;
        this.f41224du = ((b & 255) << 8) | (this.f41224du & (-65281));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57669k4(C12334dy c12334dy) {
        return this.f41225k4 == c12334dy.f41225k4 && this.f41228x1 == c12334dy.f41228x1 && this.f41226kk == c12334dy.f41226kk && this.f41227to == c12334dy.f41227to && this.f41224du == c12334dy.f41224du;
    }
}

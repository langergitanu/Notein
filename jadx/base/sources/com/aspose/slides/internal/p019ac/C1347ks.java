package com.aspose.slides.internal.p019ac;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.ks */
/* JADX INFO: loaded from: classes3.dex */
public class C1347ks extends AbstractC1349ne {

    /* JADX INFO: renamed from: du */
    private int f5848du;

    /* JADX INFO: renamed from: k4 */
    private byte f5849k4;

    /* JADX INFO: renamed from: kk */
    private byte f5850kk;

    /* JADX INFO: renamed from: to */
    private byte f5851to;

    /* JADX INFO: renamed from: x1 */
    private byte f5852x1;

    public C1347ks() {
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
        return m7944k4((C1347ks) obj);
    }

    public int hashCode() {
        return (((((((C14098up.m67317k4(this.f5849k4) * 397) ^ C14098up.m67317k4(this.f5852x1)) * 397) ^ C14098up.m67317k4(this.f5850kk)) * 397) ^ C14098up.m67317k4(this.f5851to)) * 397) ^ this.f5848du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m7942k4() {
        return this.f5848du;
    }

    /* JADX INFO: renamed from: kk */
    public final void m7945kk(byte b) {
        this.f5850kk = b;
        this.f5848du = ((b & 255) << 8) | (this.f5848du & (-65281));
    }

    /* JADX INFO: renamed from: to */
    public final void m7946to(byte b) {
        this.f5851to = b;
        this.f5848du = ((b & 255) << 16) | (this.f5848du & (-16711681));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7947x1(byte b) {
        this.f5852x1 = b;
        this.f5848du = (b & 255) | (this.f5848du & InputDeviceCompat.SOURCE_ANY);
    }

    public C1347ks(int i) {
        this.f5848du = i;
        this.f5852x1 = (byte) (i & 255);
        this.f5850kk = (byte) ((i >> 8) & 255);
        this.f5851to = (byte) ((i >> 16) & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7943k4(byte b) {
        this.f5849k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7944k4(C1347ks c1347ks) {
        return this.f5849k4 == c1347ks.f5849k4 && this.f5852x1 == c1347ks.f5852x1 && this.f5850kk == c1347ks.f5850kk && this.f5851to == c1347ks.f5851to && this.f5848du == c1347ks.f5848du;
    }
}

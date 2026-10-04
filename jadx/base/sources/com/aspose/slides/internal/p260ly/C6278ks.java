package com.aspose.slides.internal.p260ly;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C6278ks extends AbstractC6280ne {

    /* JADX INFO: renamed from: du */
    private int f17832du;

    /* JADX INFO: renamed from: k4 */
    private byte f17833k4;

    /* JADX INFO: renamed from: kk */
    private byte f17834kk;

    /* JADX INFO: renamed from: to */
    private byte f17835to;

    /* JADX INFO: renamed from: x1 */
    private byte f17836x1;

    public C6278ks() {
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
        return m25585k4((C6278ks) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m25582h4() {
        return this.f17832du;
    }

    public int hashCode() {
        return (((((((C14098up.m67317k4(this.f17833k4) * 397) ^ C14098up.m67317k4(this.f17836x1)) * 397) ^ C14098up.m67317k4(this.f17834kk)) * 397) ^ C14098up.m67317k4(this.f17835to)) * 397) ^ this.f17832du;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m25583k4() {
        return this.f17833k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m25586kk() {
        return this.f17834kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m25588to() {
        return this.f17835to;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m25590x1() {
        return this.f17836x1;
    }

    public C6278ks(int i) {
        this.f17832du = i;
        this.f17836x1 = (byte) (i & 255);
        this.f17834kk = (byte) ((i >> 8) & 255);
        this.f17835to = (byte) ((i >> 16) & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25584k4(byte b) {
        this.f17833k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25587kk(byte b) {
        this.f17834kk = b;
        this.f17832du = ((b & 255) << 8) | (this.f17832du & (-65281));
    }

    /* JADX INFO: renamed from: to */
    public final void m25589to(byte b) {
        this.f17835to = b;
        this.f17832du = ((b & 255) << 16) | (this.f17832du & (-16711681));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25591x1(byte b) {
        this.f17836x1 = b;
        this.f17832du = (b & 255) | (this.f17832du & InputDeviceCompat.SOURCE_ANY);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25585k4(C6278ks c6278ks) {
        return this.f17833k4 == c6278ks.f17833k4 && this.f17836x1 == c6278ks.f17836x1 && this.f17834kk == c6278ks.f17834kk && this.f17835to == c6278ks.f17835to && this.f17832du == c6278ks.f17832du;
    }
}

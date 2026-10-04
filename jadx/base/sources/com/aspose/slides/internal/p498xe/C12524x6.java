package com.aspose.slides.internal.p498xe;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12524x6 {

    /* JADX INFO: renamed from: k4 */
    private byte f41946k4;

    /* JADX INFO: renamed from: kk */
    private byte f41947kk;

    /* JADX INFO: renamed from: x1 */
    private byte f41948x1;

    public C12524x6(byte b) {
        m58289k4(b);
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
        return m58290k4((C12524x6) obj);
    }

    public int hashCode() {
        return (((C14098up.m67317k4(this.f41946k4) * 397) ^ (this.f41948x1 & 255)) * 397) ^ (this.f41947kk & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m58288k4() {
        return this.f41946k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m58291kk() {
        return this.f41947kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m58292x1() {
        return this.f41948x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58289k4(byte b) {
        this.f41946k4 = b;
        this.f41948x1 = (byte) ((b & 255) >> 4);
        this.f41947kk = (byte) (b & 3);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58290k4(C12524x6 c12524x6) {
        return this.f41946k4 == c12524x6.f41946k4 && this.f41948x1 == c12524x6.f41948x1 && this.f41947kk == c12524x6.f41947kk;
    }
}

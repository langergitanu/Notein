package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: loaded from: classes3.dex */
class ue7 {

    /* JADX INFO: renamed from: k4 */
    private IMathElement f49320k4;

    /* JADX INFO: renamed from: kk */
    private final boolean f49321kk;

    /* JADX INFO: renamed from: x1 */
    private byte f49322x1;

    private ue7(IMathElement iMathElement, boolean z, byte b) {
        m71680k4(iMathElement);
        this.f49321kk = z;
        this.f49322x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m71678k4() {
        return this.f49322x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final IMathElement m71681x1() {
        return this.f49320k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static ue7 m71676k4(IMathElement iMathElement, byte b) {
        return new ue7(iMathElement, true, b);
    }

    /* JADX INFO: renamed from: x1 */
    public static ue7 m71677x1(IMathElement iMathElement) {
        return new ue7(iMathElement, false, (byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71679k4(byte b) {
        if (!this.f49321kk) {
            throw new InvalidOperationException("The argument size cannot be changed on that argument by specification");
        }
        if (b < -2 || b > 2) {
            throw new ArgumentOutOfRangeException("ArgumentSize");
        }
        this.f49322x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71680k4(IMathElement iMathElement) {
        this.f49320k4 = iMathElement;
    }
}

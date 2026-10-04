package com.aspose.slides.internal.p498xe;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12517to extends AbstractC12511kk {

    /* JADX INFO: renamed from: k4 */
    private int f41909k4;

    /* JADX INFO: renamed from: x1 */
    private int f41910x1;

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
        return m58219k4((C12517to) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m58218h4() {
        return this.f41910x1;
    }

    public int hashCode() {
        return (C14081nv.m67061k4(this.f41909k4) * 397) ^ C14081nv.m67061k4(this.f41910x1);
    }

    @Override // com.aspose.slides.internal.p498xe.AbstractC12511kk
    /* JADX INFO: renamed from: k4 */
    public void mo58090k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(m58172k4());
        c3149x1.m13446k4(this.f41909k4);
        c3149x1.m13446k4(this.f41910x1);
        c3149x1.m13446k4(m58176x1());
        c3149x1.m13446k4(m58175kk() & 65535);
    }

    /* JADX INFO: renamed from: kk */
    public final void m58220kk(int i) {
        this.f41909k4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final int m58221to() {
        return this.f41909k4;
    }

    public String toString() {
        return C14113y2.m67402k4("{0}, Width: {1}, Height: {2}", super.toString(), Integer.valueOf(this.f41909k4), Integer.valueOf(this.f41910x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58219k4(C12517to c12517to) {
        return this.f41909k4 == c12517to.f41909k4 && this.f41910x1 == c12517to.f41910x1 && m58176x1() == c12517to.m58176x1() && m58175kk() == c12517to.m58175kk() && m58172k4() == c12517to.m58172k4();
    }

    /* JADX INFO: renamed from: to */
    public final void m58222to(int i) {
        this.f41910x1 = i;
    }
}

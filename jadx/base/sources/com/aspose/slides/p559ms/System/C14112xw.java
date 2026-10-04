package com.aspose.slides.p559ms.System;

import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p463vm.C11697x1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.xw */
/* JADX INFO: loaded from: classes5.dex */
public class C14112xw {

    /* JADX INFO: renamed from: k4 */
    public static final C14112xw f47372k4 = new C14112xw(AbstractC4786k4.f13368k4);

    /* JADX INFO: renamed from: x1 */
    private final AbstractC4786k4 f47373x1;

    public C14112xw(long j) {
        this.f47373x1 = AbstractC4786k4.m19845k4(j);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14112xw) {
            return m67354k4(this, (C14112xw) obj);
        }
        return false;
    }

    public int hashCode() {
        AbstractC4786k4 abstractC4786k4 = this.f47373x1;
        if (abstractC4786k4 != null) {
            return abstractC4786k4.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m67355k4() {
        return AbstractC4786k4.f13368k4.equals(this.f47373x1);
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC4786k4 m67356kk() {
        return this.f47373x1;
    }

    public String toString() {
        return C14091t6.m67186k4(m67357x1(), (InterfaceC14073kp) C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: x1 */
    public long m67357x1() {
        return (((long) this.f47373x1.m19853x1()) << 32) | ((long) this.f47373x1.m19851kk());
    }

    public C14112xw(AbstractC4786k4 abstractC4786k4) {
        this.f47373x1 = abstractC4786k4 == null ? AbstractC4786k4.f13368k4 : abstractC4786k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67354k4(C14112xw c14112xw, C14112xw c14112xw2) {
        return c14112xw.f47373x1.equals(c14112xw2.f47373x1);
    }
}

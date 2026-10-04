package com.aspose.slides.internal.p057c6;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.c6.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1980dy {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC1984kk f6941k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC1984kk f6942kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC1984kk f6943to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1984kk f6944x1;

    public C1980dy(InterfaceC1984kk interfaceC1984kk, InterfaceC1984kk interfaceC1984kk2, InterfaceC1984kk interfaceC1984kk3, InterfaceC1984kk interfaceC1984kk4) {
        this.f6941k4 = interfaceC1984kk;
        this.f6944x1 = interfaceC1984kk2;
        this.f6942kk = interfaceC1984kk3;
        this.f6943to = interfaceC1984kk4;
    }

    /* JADX INFO: renamed from: du */
    private InterfaceC1984kk m10101du() {
        return this.f6943to;
    }

    /* JADX INFO: renamed from: kk */
    private InterfaceC1984kk m10102kk() {
        return this.f6944x1;
    }

    /* JADX INFO: renamed from: to */
    private InterfaceC1984kk m10103to() {
        return this.f6942kk;
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1984kk m10104x1() {
        return this.f6941k4;
    }

    public boolean equals(Object obj) {
        C1980dy c1980dy = (C1980dy) C7019kk.m27452k4(obj, C1980dy.class);
        if (C14067j2.m66729x1(c1980dy, obj)) {
            return false;
        }
        return C14067j2.m66729x1(this, c1980dy) || hashCode() == c1980dy.hashCode();
    }

    public int hashCode() {
        return m10101du().hashCode() + ((m10103to().hashCode() + ((m10102kk().hashCode() + ((m10104x1().hashCode() + 629) * 37)) * 37)) * 37);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m10105k4() {
        return C12007ix.m56541k4(this.f6943to.mo9884to(), this.f6941k4.mo9884to(), this.f6944x1.mo9884to(), this.f6942kk.mo9884to());
    }

    public String toString() {
        return C14113y2.m67402k4("rect({0}, {1}, {2}, {3})", m10104x1(), m10102kk(), m10103to(), m10101du());
    }
}

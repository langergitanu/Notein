package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.u4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1924u4 {
    /* JADX INFO: renamed from: du */
    public static InterfaceC1986to m9889du(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        return (interfaceC1986to.mo9883kk() && interfaceC1986to2.mo9883kk()) ? m9892h4(interfaceC1986to, interfaceC1986to2, null) : new C1918lr(8, interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: h4 */
    public static InterfaceC1986to m9891h4(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        return (interfaceC1986to.mo9883kk() && interfaceC1986to2.mo9883kk()) ? m9900m9(interfaceC1986to, interfaceC1986to2, null) : new C1918lr(9, interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC1986to m9893k4(double d, int i) {
        return new C1927uz(d, i);
    }

    /* JADX INFO: renamed from: kk */
    public static InterfaceC1986to m9898kk(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        return (interfaceC1986to.mo9883kk() && interfaceC1986to2.mo9883kk()) ? m9899kk(interfaceC1986to, interfaceC1986to2, null) : new C1918lr(3, interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: m9 */
    public static InterfaceC1986to m9900m9(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2, InterfaceC1981h4 interfaceC1981h4) {
        if (interfaceC1986to.mo9885x1() == interfaceC1986to2.mo9885x1()) {
            return interfaceC1986to.mo9880k4(interfaceC1981h4) <= interfaceC1986to2.mo9880k4(interfaceC1981h4) ? interfaceC1986to : interfaceC1986to2;
        }
        throw new C1921qq("Arguments to min() must have same dimensions");
    }

    /* JADX INFO: renamed from: to */
    public static InterfaceC1986to m9901to(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        return (interfaceC1986to.mo9883kk() && interfaceC1986to2.mo9883kk()) ? m9902to(interfaceC1986to, interfaceC1986to2, null) : new C1918lr(4, interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC1986to m9903x1(InterfaceC1986to interfaceC1986to) {
        return interfaceC1986to.mo9883kk() ? m9904x1(interfaceC1986to, (InterfaceC1981h4) null) : new C1918lr(6, interfaceC1986to);
    }

    /* JADX INFO: renamed from: du */
    public static InterfaceC1986to m9890du(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2, InterfaceC1981h4 interfaceC1981h4) {
        return m9893k4(interfaceC1986to.mo9880k4(interfaceC1981h4) % interfaceC1986to2.mo9880k4(interfaceC1981h4), interfaceC1986to.mo9885x1());
    }

    /* JADX INFO: renamed from: h4 */
    public static InterfaceC1986to m9892h4(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2, InterfaceC1981h4 interfaceC1981h4) {
        if (interfaceC1986to.mo9885x1() == interfaceC1986to2.mo9885x1()) {
            return interfaceC1986to.mo9880k4(interfaceC1981h4) > interfaceC1986to2.mo9880k4(interfaceC1981h4) ? interfaceC1986to : interfaceC1986to2;
        }
        throw new C1921qq("Arguments to max() must have same dimensions");
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC1986to m9894k4(InterfaceC1986to interfaceC1986to) {
        return interfaceC1986to.mo9883kk() ? m9895k4(interfaceC1986to, (InterfaceC1981h4) null) : new C1918lr(7, interfaceC1986to);
    }

    /* JADX INFO: renamed from: kk */
    public static InterfaceC1986to m9899kk(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2, InterfaceC1981h4 interfaceC1981h4) {
        return m9893k4(interfaceC1986to2.mo9880k4(interfaceC1981h4) * interfaceC1986to.mo9880k4(interfaceC1981h4), interfaceC1986to2.mo9885x1() + interfaceC1986to.mo9885x1());
    }

    /* JADX INFO: renamed from: to */
    public static InterfaceC1986to m9902to(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2, InterfaceC1981h4 interfaceC1981h4) {
        return m9893k4(interfaceC1986to.mo9880k4(interfaceC1981h4) / interfaceC1986to2.mo9880k4(interfaceC1981h4), interfaceC1986to.mo9885x1() - interfaceC1986to2.mo9885x1());
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC1986to m9904x1(InterfaceC1986to interfaceC1986to, InterfaceC1981h4 interfaceC1981h4) {
        return m9893k4(-interfaceC1986to.mo9880k4(interfaceC1981h4), interfaceC1986to.mo9885x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC1986to m9895k4(InterfaceC1986to interfaceC1986to, InterfaceC1981h4 interfaceC1981h4) {
        return m9893k4(C14116yg.m67475k4(interfaceC1986to.mo9880k4(interfaceC1981h4)), interfaceC1986to.mo9885x1());
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC1986to m9905x1(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        return (interfaceC1986to.mo9883kk() && interfaceC1986to2.mo9883kk()) ? m9906x1(interfaceC1986to, interfaceC1986to2, null) : new C1918lr(2, interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC1986to m9896k4(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        return (interfaceC1986to.mo9883kk() && interfaceC1986to2.mo9883kk()) ? m9897k4(interfaceC1986to, interfaceC1986to2, null) : new C1918lr(1, interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC1986to m9906x1(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2, InterfaceC1981h4 interfaceC1981h4) {
        if (interfaceC1986to.mo9885x1() == interfaceC1986to2.mo9885x1()) {
            return m9893k4(interfaceC1986to.mo9880k4(interfaceC1981h4) - interfaceC1986to2.mo9880k4(interfaceC1981h4), interfaceC1986to.mo9885x1());
        }
        throw new C1921qq("Can't subtract Numerics of different dimensions");
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC1986to m9897k4(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2, InterfaceC1981h4 interfaceC1981h4) {
        if (interfaceC1986to.mo9885x1() != interfaceC1986to2.mo9885x1()) {
            throw new C1921qq("Can't subtract Numerics of different dimensions");
        }
        return m9893k4(interfaceC1986to2.mo9880k4(interfaceC1981h4) + interfaceC1986to.mo9880k4(interfaceC1981h4), interfaceC1986to.mo9885x1());
    }
}

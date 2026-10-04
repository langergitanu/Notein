package com.aspose.slides.internal.p315od;

import com.aspose.slides.internal.p140fz.C4149kk;
import com.aspose.slides.internal.p140fz.InterfaceC4146h4;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.od.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7026h4 {

    /* JADX INFO: renamed from: kk */
    public C7024du f19096kk;

    /* JADX INFO: renamed from: to */
    public C12025x6 f19097to;

    /* JADX INFO: renamed from: x1 */
    public C12025x6 f19098x1;

    public C7026h4(InterfaceC4146h4 interfaceC4146h4, C12025x6 c12025x6, C12025x6 c12025x62) {
        this.f19098x1 = c12025x6;
        this.f19096kk = interfaceC4146h4.mo16588x1(c12025x62.m56897x1(), c12025x62.m56895kk());
        this.f19097to = c12025x62;
    }

    /* JADX INFO: renamed from: k4 */
    public static C7026h4 m27477k4(InterfaceC4146h4 interfaceC4146h4, float f, float f2, float f3, float f4) {
        return m27478k4(interfaceC4146h4, new C12025x6(f, f2), new C12025x6(f3, f4));
    }

    /* JADX INFO: renamed from: x1 */
    public List<C7026h4> mo27480x1() {
        throw new UnsupportedOperationException("Not CompoundMarginData does not support CompoundMargins");
    }

    /* JADX INFO: renamed from: k4 */
    public static C7026h4 m27478k4(InterfaceC4146h4 interfaceC4146h4, C12025x6 c12025x6, C12025x6 c12025x62) {
        return interfaceC4146h4.mo16592k4() ? new C7027k4((C4149kk) interfaceC4146h4, c12025x6, c12025x62) : new C7026h4(interfaceC4146h4, c12025x6, c12025x62);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo27479k4() {
        return false;
    }
}

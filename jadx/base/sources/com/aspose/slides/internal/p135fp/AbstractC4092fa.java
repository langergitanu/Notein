package com.aspose.slides.internal.p135fp;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p038bb.C1675du;
import com.aspose.slides.internal.p038bb.C1676k4;
import com.aspose.slides.internal.p038bb.C1677kk;
import com.aspose.slides.internal.p038bb.C1678to;
import com.aspose.slides.internal.p038bb.C1679x1;
import com.aspose.slides.internal.p291n4.C6739k4;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.internal.p550zi.C13623yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.fa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4092fa implements InterfaceC6899c5, InterfaceC6908m9 {

    /* JADX INFO: renamed from: k4 */
    protected InterfaceC6899c5 f11178k4;

    /* JADX INFO: renamed from: x1 */
    protected C13609qq f11179x1;

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4092fa m16291k4(InterfaceC6899c5 interfaceC6899c5, C6739k4 c6739k4) {
        int iM26532m9 = c6739k4.m26532m9();
        if (iM26532m9 == 0) {
            return new C1679x1(interfaceC6899c5);
        }
        if (iM26532m9 == 1) {
            return new C1675du(interfaceC6899c5);
        }
        if (iM26532m9 == 2) {
            return new C1676k4(interfaceC6899c5);
        }
        if (iM26532m9 != 3) {
            if (iM26532m9 == 4) {
                return new C1677kk(interfaceC6899c5);
            }
            throw new ArgumentOutOfRangeException();
        }
        if (c6739k4.m26521c5() == null) {
            c6739k4.m26527k4(C13623yj.m62876x1());
        } else {
            c6739k4.m26521c5().m14472k4().seek(0L, 0);
        }
        if (c6739k4.m26525jd() == null) {
            c6739k4.m26535x1(C13623yj.m62875k4());
        } else {
            c6739k4.m26525jd().m14472k4().seek(0L, 0);
        }
        return new C1678to(interfaceC6899c5, c6739k4.m26521c5().m14472k4(), c6739k4.m26525jd().m14472k4());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo9080k4(int[] iArr, byte[] bArr);

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6899c5
    /* JADX INFO: renamed from: k4 */
    public void mo16292k4(C12014ne c12014ne, byte[] bArr, C12016rv c12016rv, C12016rv c12016rv2) {
        this.f11178k4.mo16292k4(c12014ne.Clone(), bArr, c12016rv.Clone(), c12016rv2.Clone());
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6908m9
    /* JADX INFO: renamed from: k4 */
    public void mo9843k4(C12014ne c12014ne, int[] iArr, C12016rv c12016rv, C12016rv c12016rv2) {
        byte[] bArr = new byte[this.f11179x1.m62786du() * c12014ne.m56683x1() * c12014ne.m56663c5()];
        mo9080k4(iArr, bArr);
        this.f11178k4.mo16292k4(c12014ne.Clone(), bArr, c12016rv.Clone(), c12016rv2.Clone());
    }
}

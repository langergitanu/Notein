package com.aspose.slides.internal.p319ok;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p498xe.AbstractC12511kk;
import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.internal.p498xe.C12504du;
import com.aspose.slides.internal.p498xe.C12517to;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ok.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7105h4 extends AbstractC7101ck {

    /* JADX INFO: renamed from: du */
    private long f19224du;

    /* JADX INFO: renamed from: h4 */
    private long f19225h4;

    /* JADX INFO: renamed from: k4 */
    private final long f19226k4;

    /* JADX INFO: renamed from: kk */
    private long f19227kk;

    /* JADX INFO: renamed from: m9 */
    private int f19228m9;

    /* JADX INFO: renamed from: to */
    private long f19229to;

    /* JADX INFO: renamed from: x1 */
    private final int f19230x1;

    public C7105h4(long j, int i) {
        this.f19226k4 = j;
        this.f19230x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m27625k4(C12502c5 c12502c5) {
        boolean zM27469x1 = C7019kk.m27469x1(c12502c5.m58068k4(), C12504du.class);
        AbstractC12511kk abstractC12511kkM58068k4 = c12502c5.m58068k4();
        if (!zM27469x1) {
            C12517to c12517to = (C12517to) C7019kk.m27452k4((Object) abstractC12511kkM58068k4, C12517to.class);
            return C14116yg.m67482k4(c12517to.m58218h4() & 65535) * ((((((c12517to.m58221to() & 65535) * (c12517to.m58176x1() & 65535)) * (c12517to.m58175kk() & 65535)) + 31) & (-32)) / 8);
        }
        C12504du c12504du = (C12504du) C7019kk.m27452k4((Object) abstractC12511kkM58068k4, C12504du.class);
        int iM58094m9 = (int) c12504du.m58094m9();
        if (iM58094m9 != 0 && iM58094m9 != 3 && iM58094m9 != 11) {
            return (int) c12504du.m58087dy();
        }
        return C14116yg.m67482k4(c12504du.m58088h4()) * (((((c12504du.m58095to() * (c12504du.m58176x1() & 65535)) * (c12504du.m58175kk() & 65535)) + 31) & (-32)) / 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C12502c5 m27626kk(C3134k4 c3134k4) {
        int iM58088h4;
        AbstractC12511kk abstractC12511kk;
        int position;
        AbstractC12511kk abstractC12511kk2;
        c3134k4.m13371ck().seek(this.f19226k4 + (this.f19227kk & 4294967295L), 0);
        C12502c5 c12502c5 = new C12502c5();
        long jM13384uz = c3134k4.m13384uz();
        c3134k4.m13371ck().seek(this.f19226k4 + (this.f19227kk & 4294967295L) + 4, 0);
        if ((jM13384uz & 4294967295L) == 12) {
            C12517to c12517to = new C12517to();
            c12517to.m58174k4(jM13384uz);
            c12517to.m58220kk(c3134k4.m13382u4());
            c12517to.m58222to(c3134k4.m13382u4());
            c12517to.m58173k4(c3134k4.m13382u4());
            c12517to.m58177x1(c3134k4.m13382u4() & 65535);
            c12517to.m58221to();
            c12517to.m58176x1();
            c12517to.m58175kk();
            iM58088h4 = c12517to.m58218h4() & 65535;
            abstractC12511kk2 = c12517to;
        } else {
            C12504du c12504du = new C12504du();
            c12504du.m58174k4(jM13384uz);
            c12504du.m58092kk(c3134k4.m13386x6());
            c12504du.m58096to(c3134k4.m13386x6());
            c12504du.m58173k4(c3134k4.m13382u4());
            c12504du.m58177x1(c3134k4.m13382u4() & 65535);
            c12504du.m58098x1(c3134k4.m13384uz() & 4294967295L);
            c12504du.m58093kk(c3134k4.m13384uz());
            c12504du.m58085du(c3134k4.m13386x6());
            c12504du.m58089h4(c3134k4.m13386x6());
            c12504du.m58097to(c3134k4.m13384uz());
            c12504du.m58086du(c3134k4.m13384uz());
            int iM58094m9 = (int) c12504du.m58094m9();
            if (iM58094m9 != 0 && iM58094m9 != 3 && iM58094m9 != 11) {
                c12504du.m58087dy();
                abstractC12511kk = c12504du;
                position = (int) ((this.f19229to & 4294967295L) - ((c3134k4.m13371ck().getPosition() - (this.f19226k4 + (this.f19227kk & 4294967295L))) & 4294967295L));
                if (position > 3) {
                    int i = this.f19228m9;
                    c12502c5.m58070k4(c3134k4.m13372dy(i != 0 ? i != 1 ? 0 : position & (-2) : position & (-4)));
                }
                c3134k4.m13371ck().seek(this.f19226k4 + (4294967295L & this.f19224du), 0);
                c12502c5.m58069k4(abstractC12511kk);
                c12502c5.m58077x1(c3134k4.m13372dy((int) this.f19225h4));
                return c12502c5;
            }
            c12504du.m58095to();
            c12504du.m58176x1();
            c12504du.m58175kk();
            iM58088h4 = c12504du.m58088h4();
            abstractC12511kk2 = c12504du;
        }
        C14116yg.m67482k4(iM58088h4);
        abstractC12511kk = abstractC12511kk2;
        position = (int) ((this.f19229to & 4294967295L) - ((c3134k4.m13371ck().getPosition() - (this.f19226k4 + (this.f19227kk & 4294967295L))) & 4294967295L));
        if (position > 3) {
        }
        c3134k4.m13371ck().seek(this.f19226k4 + (4294967295L & this.f19224du), 0);
        c12502c5.m58069k4(abstractC12511kk);
        c12502c5.m58077x1(c3134k4.m13372dy((int) this.f19225h4));
        return c12502c5;
    }

    /* JADX INFO: renamed from: x1 */
    public C3023to m27628x1(C3134k4 c3134k4) {
        long position = c3134k4.m13371ck().getPosition();
        C12502c5 c12502c5 = new C12502c5();
        long jM13384uz = c3134k4.m13384uz();
        c3134k4.m13371ck().seek(position, 0);
        c12502c5.m58069k4((4294967295L & jM13384uz) == 12 ? (C12517to) new C7119x1().m27643k4(c3134k4) : (C12504du) new C7109kk().m27633k4(c3134k4));
        long position2 = c3134k4.m13371ck().getPosition();
        int iM27625k4 = m27625k4(c12502c5);
        long j = (this.f19226k4 + ((long) this.f19230x1)) - (position2 + ((long) iM27625k4));
        if (j > 0) {
            c12502c5.m58070k4(c3134k4.m13372dy((int) j));
        }
        c12502c5.m58077x1(c3134k4.m13372dy(iM27625k4));
        return c12502c5;
    }

    public C7105h4(long j, int i, long j2, long j3, long j4, long j5, int i2) {
        this.f19226k4 = j;
        this.f19230x1 = i;
        this.f19227kk = j2;
        this.f19229to = j3;
        this.f19224du = j4;
        this.f19225h4 = j5;
        this.f19228m9 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12502c5 m27627k4(C3134k4 c3134k4) {
        int position = (int) ((this.f19226k4 + ((long) this.f19230x1)) - c3134k4.m13371ck().getPosition());
        if (position <= 0) {
            if (position >= 0) {
                return null;
            }
            throw new C12537k4("Readed more bytes than the object size.");
        }
        if ((this.f19229to & 4294967295L) > 0) {
            return m27626kk(c3134k4);
        }
        c3134k4.m13371ck().seek(position, 1);
        return null;
    }
}

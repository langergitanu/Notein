package com.aspose.slides.internal.p018aa;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p488x0.AbstractC12340kk;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.internal.p488x0.C12333du;
import com.aspose.slides.internal.p488x0.C12346to;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.aa.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1319h4 extends AbstractC1315ck {

    /* JADX INFO: renamed from: du */
    private long f5769du;

    /* JADX INFO: renamed from: h4 */
    private long f5770h4;

    /* JADX INFO: renamed from: k4 */
    private final long f5771k4;

    /* JADX INFO: renamed from: kk */
    private long f5772kk;

    /* JADX INFO: renamed from: m9 */
    private int f5773m9;

    /* JADX INFO: renamed from: to */
    private long f5774to;

    /* JADX INFO: renamed from: x1 */
    private final int f5775x1;

    public C1319h4(long j, int i) {
        this.f5771k4 = j;
        this.f5775x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m7800k4(C12331c5 c12331c5) {
        boolean zM27469x1 = C7019kk.m27469x1(c12331c5.m57630k4(), C12333du.class);
        AbstractC12340kk abstractC12340kkM57630k4 = c12331c5.m57630k4();
        if (!zM27469x1) {
            C12346to c12346to = (C12346to) C7019kk.m27452k4((Object) abstractC12340kkM57630k4, C12346to.class);
            return C14116yg.m67482k4(c12346to.m57802h4() & 65535) * ((((((c12346to.m57805to() & 65535) * (c12346to.m57760x1() & 65535)) * (c12346to.m57759kk() & 65535)) + 31) & (-32)) / 8);
        }
        C12333du c12333du = (C12333du) C7019kk.m27452k4((Object) abstractC12340kkM57630k4, C12333du.class);
        int iM57661m9 = (int) c12333du.m57661m9();
        if (iM57661m9 != 0 && iM57661m9 != 3 && iM57661m9 != 11) {
            return (int) c12333du.m57652dy();
        }
        return C14116yg.m67482k4(c12333du.m57654h4()) * (((((c12333du.m57662to() * (c12333du.m57760x1() & 65535)) * (c12333du.m57759kk() & 65535)) + 31) & (-32)) / 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C12331c5 m7801kk(C3134k4 c3134k4) {
        int iM57654h4;
        AbstractC12340kk abstractC12340kk;
        int position;
        AbstractC12340kk abstractC12340kk2;
        c3134k4.m13371ck().seek(this.f5771k4 + (this.f5772kk & 4294967295L), 0);
        C12331c5 c12331c5 = new C12331c5();
        long jM13384uz = c3134k4.m13384uz();
        c3134k4.m13371ck().seek(this.f5771k4 + (this.f5772kk & 4294967295L) + 4, 0);
        if ((jM13384uz & 4294967295L) == 12) {
            C12346to c12346to = new C12346to();
            c12346to.m57758k4(jM13384uz);
            c12346to.m57804kk(c3134k4.m13382u4());
            c12346to.m57806to(c3134k4.m13382u4());
            c12346to.m57757k4(c3134k4.m13382u4());
            c12346to.m57761x1(c3134k4.m13382u4() & 65535);
            c12346to.m57805to();
            c12346to.m57760x1();
            c12346to.m57759kk();
            iM57654h4 = c12346to.m57802h4() & 65535;
            abstractC12340kk2 = c12346to;
        } else {
            C12333du c12333du = new C12333du();
            c12333du.m57758k4(jM13384uz);
            c12333du.m57659kk(c3134k4.m13386x6());
            c12333du.m57663to(c3134k4.m13386x6());
            c12333du.m57757k4(c3134k4.m13382u4());
            c12333du.m57761x1(c3134k4.m13382u4() & 65535);
            c12333du.m57665x1(c3134k4.m13384uz() & 4294967295L);
            c12333du.m57660kk(c3134k4.m13384uz());
            c12333du.m57650du(c3134k4.m13386x6());
            c12333du.m57655h4(c3134k4.m13386x6());
            c12333du.m57664to(c3134k4.m13384uz());
            c12333du.m57651du(c3134k4.m13384uz());
            int iM57661m9 = (int) c12333du.m57661m9();
            if (iM57661m9 != 0 && iM57661m9 != 3 && iM57661m9 != 11) {
                c12333du.m57652dy();
                abstractC12340kk = c12333du;
                position = (int) ((this.f5774to & 4294967295L) - ((c3134k4.m13371ck().getPosition() - (this.f5771k4 + (this.f5772kk & 4294967295L))) & 4294967295L));
                if (position > 3) {
                    int i = this.f5773m9;
                    c12331c5.m57632k4(c3134k4.m13372dy(i != 0 ? i != 1 ? 0 : position & (-2) : position & (-4)));
                }
                c3134k4.m13371ck().seek(this.f5771k4 + (4294967295L & this.f5769du), 0);
                c12331c5.m57631k4(abstractC12340kk);
                c12331c5.m57640x1(c3134k4.m13372dy((int) this.f5770h4));
                return c12331c5;
            }
            c12333du.m57662to();
            c12333du.m57760x1();
            c12333du.m57759kk();
            iM57654h4 = c12333du.m57654h4();
            abstractC12340kk2 = c12333du;
        }
        C14116yg.m67482k4(iM57654h4);
        abstractC12340kk = abstractC12340kk2;
        position = (int) ((this.f5774to & 4294967295L) - ((c3134k4.m13371ck().getPosition() - (this.f5771k4 + (this.f5772kk & 4294967295L))) & 4294967295L));
        if (position > 3) {
        }
        c3134k4.m13371ck().seek(this.f5771k4 + (4294967295L & this.f5769du), 0);
        c12331c5.m57631k4(abstractC12340kk);
        c12331c5.m57640x1(c3134k4.m13372dy((int) this.f5770h4));
        return c12331c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12535to m7803x1(C3134k4 c3134k4) {
        long j;
        long jM57649ck;
        long position = c3134k4.m13371ck().getPosition();
        C12331c5 c12331c5 = new C12331c5();
        long jM13384uz = c3134k4.m13384uz();
        c3134k4.m13371ck().seek(position, 0);
        c12331c5.m57631k4((jM13384uz & 4294967295L) == 12 ? (C12346to) new C1333x1().m7818k4(c3134k4) : (C12333du) new C1323kk().m7808k4(c3134k4));
        long position2 = c3134k4.m13371ck().getPosition();
        int iM7800k4 = m7800k4(c12331c5);
        long j2 = (this.f5771k4 + ((long) this.f5775x1)) - (position2 + ((long) iM7800k4));
        C12333du c12333du = (C12333du) C7019kk.m27452k4((Object) c12331c5.m57630k4(), C12333du.class);
        if (c12333du == null) {
            j = 0;
        } else {
            int iM57759kk = c12333du.m57759kk() > 0 ? 2 : 0;
            if (c12333du.m57759kk() > 1) {
                iM57759kk <<= (c12333du.m57759kk() & 65535) - 1;
            }
            if ((c12333du.m57649ck() & 4294967295L) != 0) {
                jM57649ck = 4294967295L & (c12333du.m57759kk() < 16 ? (c12333du.m57649ck() & 4294967295L) << 2 : c12333du.m57649ck());
            } else {
                jM57649ck = iM57759kk > 0 ? iM57759kk << 2 : 0L;
            }
            if (jM57649ck > 0 && jM57649ck < j2) {
                long j3 = j2 - jM57649ck;
                j2 = jM57649ck;
                j = j3;
            }
        }
        if (j2 > 0) {
            c12331c5.m57632k4(c3134k4.m13372dy((int) j2));
        }
        c12331c5.m57640x1(c3134k4.m13372dy(iM7800k4));
        if (j > 0) {
            c3134k4.m13372dy((int) j);
        }
        return c12331c5;
    }

    public C1319h4(long j, int i, long j2, long j3, long j4, long j5, int i2) {
        this.f5771k4 = j;
        this.f5775x1 = i;
        this.f5772kk = j2;
        this.f5774to = j3;
        this.f5769du = j4;
        this.f5770h4 = j5;
        this.f5773m9 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12331c5 m7802k4(C3134k4 c3134k4) {
        int position = (int) ((this.f5771k4 + ((long) this.f5775x1)) - c3134k4.m13371ck().getPosition());
        if (position <= 0) {
            if (position >= 0) {
                return null;
            }
            throw new C6490k4("Readed more bytes than the object size.");
        }
        if ((this.f5774to & 4294967295L) > 0) {
            return m7801kk(c3134k4);
        }
        c3134k4.m13371ck().seek(position, 1);
        return null;
    }
}

package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4610b3;
import com.aspose.slides.internal.p171hq.C4647os;
import com.aspose.slides.internal.p171hq.C4661um;
import com.aspose.slides.internal.p171hq.C4668wl;
import com.aspose.slides.internal.p171hq.C4670wy;
import com.aspose.slides.internal.p171hq.C4680yo;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C10282ss extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f36720k4;

    public C10282ss(long j) {
        this.f36720k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50236k4(C3134k4 c3134k4) {
        C4647os c4647os = new C4647os();
        if ((this.f36720k4 & 1) > 0) {
            c4647os.m19293k4((C4680yo) new C10279ri().m50233k4(c3134k4));
        }
        if ((this.f36720k4 & 2) > 0) {
            c4647os.m19288k4(((long) c3134k4.m13386x6()) & 4294967295L);
        }
        if ((this.f36720k4 & 4) > 0) {
            c4647os.m19305x1(((long) c3134k4.m13386x6()) & 4294967295L);
        }
        if ((this.f36720k4 & 8) > 0) {
            c4647os.m19287k4(c3134k4.m13386x6());
        }
        if ((this.f36720k4 & 16) > 0) {
            c4647os.m19286k4(c3134k4.m13374ix());
        }
        if ((this.f36720k4 & 32) > 0) {
            c4647os.m19304x1(c3134k4.m13386x6());
        }
        if ((this.f36720k4 & 64) > 0) {
            c4647os.m19297kk(c3134k4.m13386x6());
        }
        if ((this.f36720k4 & 128) > 0) {
            c4647os.m19303x1(c3134k4.m13374ix());
        }
        if ((this.f36720k4 & 256) > 0) {
            c4647os.m19292k4((C4670wy) new C10248ar().m50203k4(c3134k4));
        }
        if ((this.f36720k4 & 512) > 0) {
            c4647os.m19300to(c3134k4.m13386x6());
        }
        if ((this.f36720k4 & 1024) > 0) {
            c4647os.m19291k4((C4668wl) new C10280rv().m50234k4(c3134k4));
        }
        if ((this.f36720k4 & 2048) > 0) {
            c4647os.m19289k4((C4610b3) new C10277qq().m50231k4(c3134k4));
        }
        if ((this.f36720k4 & 4096) > 0) {
            c4647os.m19290k4((C4661um) new C10274ne().m50228k4(c3134k4));
        }
        return c4647os;
    }
}

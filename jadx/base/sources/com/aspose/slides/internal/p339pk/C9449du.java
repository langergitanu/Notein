package com.aspose.slides.internal.p339pk;

import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p504xm.C12549du;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9449du implements InterfaceC9461x1 {

    /* JADX INFO: renamed from: dy */
    private int f34351dy;

    /* JADX INFO: renamed from: h4 */
    private C4328x1 f34352h4;

    /* JADX INFO: renamed from: k4 */
    private int f34353k4;

    /* JADX INFO: renamed from: m9 */
    private byte[] f34355m9;

    /* JADX INFO: renamed from: x1 */
    private int f34357x1 = 0;

    /* JADX INFO: renamed from: kk */
    private C5656k4 f34354kk = C5656k4.f15627z7;

    /* JADX INFO: renamed from: to */
    private C5656k4 f34356to = C5656k4.f15629ze;

    /* JADX INFO: renamed from: du */
    private int f34350du = 0;

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final int mo46244k4() {
        return 1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m46264kk() {
        return this.f34357x1;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: x1 */
    public final int mo46249x1() {
        return this.f34353k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4328x1 m46260k4(C4317dy c4317dy) {
        C4328x1 c4318fa;
        int i = this.f34357x1;
        if (i == 0) {
            c4318fa = new C4318fa(this.f34354kk);
        } else {
            if (i == 1) {
                return null;
            }
            if (i != 2) {
                if (i == 240) {
                    C4327up c4327up = new C4327up(this.f34355m9, this.f34351dy);
                    c4327up.m17387k4(c4317dy);
                    this.f34352h4 = c4327up;
                }
                return this.f34352h4;
            }
            c4318fa = new C4316du(this.f34350du, this.f34354kk, this.f34356to);
        }
        this.f34352h4 = c4318fa;
        return this.f34352h4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m46265kk(C9458rv c9458rv) {
        this.f34357x1 = 240;
        this.f34351dy = 0;
        this.f34355m9 = C12549du.m58503k4(c9458rv, (int) (c9458rv.m13371ck().getLength() - c9458rv.m13371ck().getPosition()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46266x1(int i) {
        this.f34357x1 = i;
    }

    @Override // com.aspose.slides.internal.p339pk.InterfaceC9461x1
    /* JADX INFO: renamed from: k4 */
    public final void mo46246k4(int i) {
        this.f34353k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46267x1(C5656k4 c5656k4) {
        this.f34356to = c5656k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46261k4(C5656k4 c5656k4) {
        this.f34354kk = c5656k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46268x1(C9456ks c9456ks) {
        int position = ((int) c9456ks.m13371ck().getPosition()) - 8;
        this.f34353k4 = c9456ks.m13386x6();
        this.f34357x1 = 240;
        this.f34351dy = 0;
        c9456ks.m13386x6();
        int iM13386x6 = c9456ks.m13386x6();
        int iM13386x62 = c9456ks.m13386x6();
        c9456ks.m13386x6();
        int iM13386x63 = c9456ks.m13386x6();
        c9456ks.m13371ck().setPosition(position + iM13386x6);
        this.f34355m9 = C12549du.m58504k4(c9456ks, iM13386x62, iM13386x63);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46262k4(C9456ks c9456ks) {
        this.f34353k4 = c9456ks.m13386x6();
        this.f34357x1 = (int) c9456ks.m13384uz();
        this.f34354kk = c9456ks.m46361du();
        this.f34350du = c9456ks.m13386x6();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46269x1(C9458rv c9458rv) {
        this.f34357x1 = 240;
        this.f34351dy = 0;
        this.f34355m9 = c9458rv.m13372dy((int) c9458rv.m13371ck().getLength());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46263k4(C9458rv c9458rv) {
        this.f34357x1 = c9458rv.m13381rv();
        this.f34354kk = c9458rv.m46389h4();
        this.f34350du = c9458rv.m13381rv();
    }
}

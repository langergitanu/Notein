package com.aspose.slides.internal.p389s0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10126x1 {

    /* JADX INFO: renamed from: c5 */
    public long f36273c5;

    /* JADX INFO: renamed from: ck */
    public long f36274ck;

    /* JADX INFO: renamed from: du */
    public long f36275du;

    /* JADX INFO: renamed from: dy */
    public long f36276dy;

    /* JADX INFO: renamed from: fa */
    public long f36277fa;

    /* JADX INFO: renamed from: h4 */
    public long f36278h4;

    /* JADX INFO: renamed from: jd */
    public long f36279jd;

    /* JADX INFO: renamed from: k4 */
    public String f36280k4;

    /* JADX INFO: renamed from: kk */
    public int f36281kk;

    /* JADX INFO: renamed from: m9 */
    public C14047bz f36282m9;

    /* JADX INFO: renamed from: to */
    public long f36283to;

    /* JADX INFO: renamed from: up */
    public boolean f36284up;

    /* JADX INFO: renamed from: x1 */
    public int f36285x1;

    public C10126x1() {
        C14047bz c14047bz = new C14047bz();
        this.f36282m9 = c14047bz;
        this.f36285x1 = 0;
        this.f36281kk = 1;
        this.f36283to = 4294967295L;
        this.f36275du = 4294967295L;
        this.f36278h4 = 4294967295L;
        C14047bz.f47172k4.CloneTo(c14047bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49731k4(C3149x1 c3149x1) {
        int length;
        byte[] bArr = new byte[64];
        if (C12565ks.m58630x1(this.f36280k4)) {
            byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(this.f36280k4);
            if (bArrMo26677to.length > 62) {
                throw new InvalidOperationException(C14113y2.m67402k4("The name '{0}' is too long for writing to structured storage.", this.f36280k4));
            }
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrMo26677to), 0, AbstractC14092to.m67208k4((Object) bArr), 0, bArrMo26677to.length);
            length = bArrMo26677to.length + 2;
        } else {
            length = 0;
        }
        c3149x1.m13450k4(bArr);
        c3149x1.m13446k4(65535 & length);
        c3149x1.m13443k4((byte) this.f36285x1);
        c3149x1.m13443k4((byte) this.f36281kk);
        c3149x1.m13447k4(this.f36283to & 4294967295L);
        c3149x1.m13447k4(this.f36275du & 4294967295L);
        c3149x1.m13447k4(this.f36278h4 & 4294967295L);
        c3149x1.m13450k4(this.f36282m9.m66539k4());
        c3149x1.m13447k4(this.f36276dy & 4294967295L);
        c3149x1.m13456x1(this.f36273c5);
        c3149x1.m13456x1(this.f36279jd);
        c3149x1.m13447k4(this.f36274ck & 4294967295L);
        c3149x1.m13447k4(this.f36277fa & 4294967295L);
        c3149x1.m13455x1(0);
    }

    public C10126x1(C3134k4 c3134k4) {
        String strMo26682x1;
        this.f36282m9 = new C14047bz();
        int position = (int) c3134k4.m13371ck().getPosition();
        byte[] bArrM13372dy = c3134k4.m13372dy(64);
        if (bArrM13372dy.length < 64) {
            return;
        }
        int iM13382u4 = c3134k4.m13382u4() & 65535;
        if (iM13382u4 <= 0) {
            strMo26682x1 = null;
        } else if (iM13382u4 > bArrM13372dy.length) {
            return;
        } else {
            strMo26682x1 = AbstractC6747ar.m26643rv().mo26682x1(bArrM13372dy, 0, iM13382u4 - 2);
        }
        this.f36280k4 = strMo26682x1;
        int iM13387yj = c3134k4.m13387yj() & 255;
        this.f36285x1 = iM13387yj;
        if (iM13387yj == 0) {
            c3134k4.m13371ck().setPosition(position + 128);
            return;
        }
        this.f36281kk = c3134k4.m13387yj() & 255;
        this.f36283to = c3134k4.m13384uz();
        this.f36275du = c3134k4.m13384uz();
        this.f36278h4 = c3134k4.m13384uz();
        this.f36282m9 = new C14047bz(c3134k4.m13372dy(16));
        this.f36276dy = c3134k4.m13384uz();
        this.f36273c5 = c3134k4.m13380ne();
        if (C12565ks.m58619k4(c3134k4, 20)) {
            this.f36279jd = c3134k4.m13380ne();
            this.f36274ck = c3134k4.m13384uz();
            this.f36277fa = c3134k4.m13384uz() & 4294967295L;
            c3134k4.m13386x6();
        }
    }

    public C10126x1(String str, int i, long j) {
        this();
        this.f36280k4 = str;
        this.f36285x1 = i;
        this.f36277fa = j;
        this.f36274ck = 4294967295L;
    }

    public C10126x1(String str, boolean z, C14047bz c14047bz) {
        this();
        this.f36280k4 = str;
        this.f36285x1 = z ? 5 : 1;
        c14047bz.CloneTo(this.f36282m9);
        this.f36274ck = z ? 4294967295L : 0L;
    }
}

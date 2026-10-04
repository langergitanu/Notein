package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p406ss.C10336ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C1586fa extends C1593lr {

    /* JADX INFO: renamed from: c5 */
    private C1585dy f6150c5;

    /* JADX INFO: renamed from: ck */
    private C1597rv f6151ck;

    /* JADX INFO: renamed from: fa */
    private int f6152fa;

    /* JADX INFO: renamed from: jd */
    private C1596qq f6153jd;

    /* JADX INFO: renamed from: up */
    private int f6154up;

    /* JADX INFO: renamed from: yj */
    private C1605wy f6155yj;

    public C1586fa(int i, String str, C1608yd c1608yd, int i2, int i3) {
        super(i, str, c1608yd);
        this.f6154up = i2;
        this.f6152fa = i3;
        this.f6153jd = new C1596qq(this);
    }

    /* JADX INFO: renamed from: ar */
    public final boolean m8564ar() {
        C1596qq c1596qq = this.f6153jd;
        if (c1596qq != null && !c1596qq.m8618wl()) {
            return false;
        }
        C1597rv c1597rv = this.f6151ck;
        if (c1597rv != null && !c1597rv.m8583lr()) {
            return false;
        }
        C1585dy c1585dy = this.f6150c5;
        return c1585dy == null || c1585dy.m8583lr();
    }

    /* JADX INFO: renamed from: bv */
    public final C1597rv m8565bv() {
        if (this.f6151ck == null) {
            this.f6151ck = new C1597rv();
        }
        return this.f6151ck;
    }

    @Override // com.aspose.slides.internal.p034b3.C1593lr
    public Object clone() {
        C1586fa c1586fa = (C1586fa) super.clone();
        c1586fa.f6153jd = new C1596qq(c1586fa);
        return c1586fa;
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8475k4(InterfaceC1380to interfaceC1380to) {
        if (m8566qq() != null) {
            m8566qq().mo8475k4(interfaceC1380to);
        }
    }

    /* JADX INFO: renamed from: qq */
    public final C1596qq m8566qq() {
        return this.f6153jd;
    }

    /* JADX INFO: renamed from: u4 */
    public final C1605wy m8567u4() {
        if (this.f6155yj == null) {
            this.f6155yj = new C1605wy();
        }
        return this.f6155yj;
    }

    /* JADX INFO: renamed from: um */
    public final C1585dy m8568um() {
        if (this.f6150c5 == null) {
            this.f6150c5 = new C1585dy();
        }
        return this.f6150c5;
    }

    /* JADX INFO: renamed from: uz */
    public final int m8569uz() {
        return this.f6154up;
    }

    /* JADX INFO: renamed from: v4 */
    public final int m8570v4() {
        List<C1577ak> listM8616u4 = m8566qq().m8616u4();
        int size = listM8616u4.size() - 1;
        int iM8482wl = 0;
        for (int i = 0; i < size; i++) {
            iM8482wl += listM8616u4.get_Item(i).m8482wl();
        }
        return mo8658e_() - iM8482wl;
    }

    /* JADX INFO: renamed from: wl */
    public final int m8571wl() {
        return this.f6152fa;
    }

    public C1586fa(C10336ks c10336ks, C1608yd c1608yd) {
        this(c10336ks.mo14084ix(), c10336ks.m50335bz(), c1608yd, c10336ks.m50369ss(), c10336ks.m50368kp());
    }
}

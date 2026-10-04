package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ks */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2167ks implements InterfaceC2191m8 {

    /* JADX INFO: renamed from: ck */
    private InterfaceC2191m8 f7505ck;

    /* JADX INFO: renamed from: dy */
    private AbstractC2167ks f7507dy;

    /* JADX INFO: renamed from: fa */
    private InterfaceC2290sd f7508fa;

    /* JADX INFO: renamed from: k4 */
    protected byte[][] f7511k4;

    /* JADX INFO: renamed from: kk */
    protected int f7512kk;

    /* JADX INFO: renamed from: to */
    protected byte[] f7514to;

    /* JADX INFO: renamed from: x1 */
    protected byte[][] f7515x1;

    /* JADX INFO: renamed from: du */
    private AbstractC2167ks[] f7506du = new AbstractC2167ks[0];

    /* JADX INFO: renamed from: h4 */
    private boolean f7509h4 = true;

    /* JADX INFO: renamed from: jd */
    private boolean f7510jd = false;

    /* JADX INFO: renamed from: m9 */
    private boolean f7513m9 = false;

    /* JADX INFO: renamed from: c5 */
    private boolean f7504c5 = false;

    public AbstractC2167ks(AbstractC2167ks abstractC2167ks, byte[] bArr) {
        this.f7514to = bArr;
        this.f7507dy = abstractC2167ks;
    }

    /* JADX INFO: renamed from: k4 */
    private void m10967k4() {
        for (AbstractC2167ks abstractC2167ks : this.f7506du) {
            abstractC2167ks.m10976k4((InterfaceC2191m8) this);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m10968to() {
        AbstractC2167ks[] abstractC2167ksArr = this.f7506du;
        if (abstractC2167ksArr == null || abstractC2167ksArr.length <= 0) {
            return;
        }
        for (AbstractC2167ks abstractC2167ks : abstractC2167ksArr) {
            abstractC2167ks.m10976k4((InterfaceC2191m8) null);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m10969c5() {
        return this.f7509h4;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m10970ck() {
        return this.f7504c5;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC2167ks m10971du() {
        return this.f7507dy;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC2167ks[] m10972dy() {
        return this.f7506du;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m10973fa() {
        return this.f7513m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[][] m10974h4() {
        return this.f7515x1;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m10975jd() {
        return this.f7510jd;
    }

    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        m10984x1(false);
        InterfaceC2074ev interfaceC2074ev = (InterfaceC2074ev) C7019kk.m27452k4((Object) this, InterfaceC2074ev.class);
        if (interfaceC2074ev != null) {
            interfaceC2074ev.mo10499kk(0);
            interfaceC2074ev.mo10501x1(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: renamed from: ks */
    public void mo10980ks() {
        InterfaceC2067eg interfaceC2067eg;
        InterfaceC2074ev interfaceC2074ev = (InterfaceC2074ev) C7019kk.m27452k4((Object) this, InterfaceC2074ev.class);
        if (interfaceC2074ev != null && (interfaceC2067eg = (InterfaceC2067eg) C7019kk.m27452k4((Object) m10971du(), InterfaceC2067eg.class)) != null && interfaceC2067eg.mo10228x1().size() > 0) {
            Double dPop = interfaceC2067eg.mo10228x1().pop();
            if (C7019kk.m27469x1(dPop, Double.class)) {
                interfaceC2074ev.mo10501x1(C7019kk.m27462to(C7019kk.m27464to(dPop, Double.TYPE), 14));
            }
        }
        if (m10985yj() != null) {
            m10985yj().m11414k4(this);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[][] m10981m9() {
        return this.f7511k4;
    }

    /* JADX INFO: renamed from: up */
    public final InterfaceC2191m8 m10983up() {
        return this.f7505ck;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo10280x1(int i, int[] iArr) {
        AbstractC2167ks abstractC2167ks;
        mo10227kk();
        mo10980ks();
        this.f7512kk = i;
        if (!m10970ck() || mo10279k4(i, iArr) == null) {
            byte[] bArr = null;
            int i2 = 0;
            int i3 = 0;
            do {
                mo10225k4(i);
                AbstractC2167ks[] abstractC2167ksArrM10972dy = m10972dy();
                int length = abstractC2167ksArrM10972dy.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        abstractC2167ks = null;
                        break;
                    }
                    abstractC2167ks = abstractC2167ksArrM10972dy[i4];
                    byte[][] bArr2 = {bArr};
                    int[] iArr2 = {i2};
                    boolean z = abstractC2167ks.m10969c5() && abstractC2167ks.mo10302k4(i, bArr2, iArr2);
                    bArr = bArr2[0];
                    i2 = iArr2[0];
                    if (z) {
                        int[] iArr3 = {i3};
                        abstractC2167ks.mo10280x1(i2, iArr3);
                        i = iArr3[0];
                        i3 = i;
                        break;
                    }
                    i4++;
                }
                if (abstractC2167ks == null || !abstractC2167ks.m10973fa()) {
                    i++;
                }
                if (mo10279k4(i, iArr) != null) {
                    break;
                }
            } while (i < this.f7514to.length - 1);
        }
        if (iArr[0] == -1 && i >= this.f7514to.length - 1) {
            iArr[0] = i;
        }
        mo10281z_();
        mo10227kk();
    }

    /* JADX INFO: renamed from: yj */
    public final InterfaceC2290sd m10985yj() {
        return this.f7508fa;
    }

    /* JADX INFO: renamed from: z_ */
    public void mo10281z_() {
        if (m10983up() != null) {
            m10983up().mo10226k4(this);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        InterfaceC2074ev interfaceC2074ev = (InterfaceC2074ev) C7019kk.m27452k4((Object) this, InterfaceC2074ev.class);
        if (interfaceC2074ev != null) {
            interfaceC2074ev.mo10499kk(interfaceC2074ev.mo10500to() + 1);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m10979kk(boolean z) {
        this.f7504c5 = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m10982to(boolean z) {
        this.f7513m9 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10984x1(boolean z) {
        this.f7510jd = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10976k4(InterfaceC2191m8 interfaceC2191m8) {
        this.f7505ck = interfaceC2191m8;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10977k4(boolean z) {
        this.f7509h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10978k4(AbstractC2167ks[] abstractC2167ksArr) {
        m10968to();
        this.f7506du = abstractC2167ksArr;
        m10967k4();
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo10302k4(int i, byte[][] bArr, int[] iArr) {
        bArr[0] = null;
        iArr[0] = -1;
        for (byte[] bArr2 : m10974h4()) {
            if (C2266qq.m11311k4(this.f7514to, i, bArr2)) {
                iArr[0] = i + bArr2.length;
                bArr[0] = bArr2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] mo10279k4(int i, int[] iArr) {
        InterfaceC2074ev interfaceC2074ev;
        for (byte[] bArr : m10981m9()) {
            if (m10975jd()) {
                iArr[0] = i;
                return new byte[0];
            }
            if (C2266qq.m11311k4(this.f7514to, i, bArr) && ((interfaceC2074ev = (InterfaceC2074ev) C7019kk.m27452k4((Object) this, InterfaceC2074ev.class)) == null || interfaceC2074ev.mo10500to() >= interfaceC2074ev.mo10498k4())) {
                if (m10973fa()) {
                    iArr[0] = i;
                    return bArr;
                }
                iArr[0] = (i + bArr.length) - 1;
                return bArr;
            }
        }
        iArr[0] = -1;
        return null;
    }
}

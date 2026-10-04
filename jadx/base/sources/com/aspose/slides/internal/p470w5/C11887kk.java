package com.aspose.slides.internal.p470w5;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p245la.C6015h4;
import com.aspose.slides.internal.p245la.C6017kk;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p392s4.C10136dy;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p550zi.AbstractC13591ar;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.internal.p550zi.C13614up;
import com.aspose.slides.internal.p550zi.C13617wl;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13619x1;
import com.aspose.slides.internal.p550zi.C13622yd;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.w5.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C11887kk extends AbstractC13591ar implements InterfaceC6018m9 {

    /* JADX INFO: renamed from: du */
    private int f40029du;

    /* JADX INFO: renamed from: h4 */
    private byte f40030h4;

    /* JADX INFO: renamed from: k4 */
    private byte f40031k4;

    /* JADX INFO: renamed from: kk */
    private int f40032kk;

    /* JADX INFO: renamed from: to */
    private int f40033to;

    /* JADX INFO: renamed from: x1 */
    private int f40034x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.w5.kk$k4 */
    public static class k4 extends C13614up implements InterfaceC6899c5, InterfaceC6902dy, InterfaceC6906k4, InterfaceC6908m9 {

        /* JADX INFO: renamed from: c5 */
        private int f40035c5;

        /* JADX INFO: renamed from: du */
        private final int f40036du;

        /* JADX INFO: renamed from: dy */
        private int f40037dy;

        /* JADX INFO: renamed from: h4 */
        private byte[] f40038h4;

        /* JADX INFO: renamed from: k4 */
        private final C13618wy f40039k4;

        /* JADX INFO: renamed from: kk */
        private final C13622yd f40040kk;

        /* JADX INFO: renamed from: m9 */
        private final AbstractC13613um f40041m9;

        /* JADX INFO: renamed from: to */
        private final C10136dy f40042to;

        /* JADX INFO: renamed from: x1 */
        private final InterfaceC6901du f40043x1;

        public k4(AbstractC13613um abstractC13613um, C13618wy c13618wy, InterfaceC6901du interfaceC6901du, int i, int i2, int i3) {
            this.f40038h4 = null;
            this.f40041m9 = abstractC13613um;
            this.f40043x1 = interfaceC6901du;
            this.f40040kk = new C13622yd(interfaceC6901du);
            C13618wy c13618wy2 = new C13618wy(c13618wy.m62861x1());
            this.f40039k4 = c13618wy2;
            c13618wy2.m62851jd();
            C10136dy c10136dy = new C10136dy(this, i);
            this.f40042to = c10136dy;
            c10136dy.m49796kk();
            this.f40036du = i3;
            this.f40035c5 = i2 * i3;
            if (m55495x1()) {
                return;
            }
            this.f40038h4 = C13619x1.m62865k4(this.f40035c5);
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m55495x1() {
            return C7019kk.m27469x1(this.f40041m9, C11887kk.class) && C7019kk.m27469x1(((C11887kk) C7019kk.m27452k4((Object) this.f40041m9, C11887kk.class)).m62815wl(), C6017kk.class);
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27037k4() {
        }

        @Override // com.aspose.slides.internal.p550zi.C13614up
        /* JADX INFO: renamed from: to */
        public void mo24306to() {
            this.f40039k4.dispose();
            super.mo24306to();
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27038k4(int i) {
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            if (m55495x1()) {
                ((C6017kk) ((C11887kk) this.f40041m9).m62815wl()).m24315k4(c12014ne.Clone(), this);
            } else {
                this.f40041m9.mo10018x1(c12014ne.Clone(), this);
            }
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6899c5
        /* JADX INFO: renamed from: k4 */
        public void mo16292k4(C12014ne c12014ne, byte[] bArr, C12016rv c12016rv, C12016rv c12016rv2) {
            this.f40042to.m49795k4(bArr, bArr.length);
            int length = this.f40035c5 - bArr.length;
            this.f40035c5 = length;
            if (length == 0) {
                this.f40042to.mo49794k4(this.f40036du);
            }
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6908m9
        /* JADX INFO: renamed from: k4 */
        public void mo9843k4(C12014ne c12014ne, int[] iArr, C12016rv c12016rv, C12016rv c12016rv2) {
            int iM67507x1 = C14116yg.m67507x1(this.f40038h4.length - this.f40037dy, iArr.length);
            int i = 0;
            do {
                int i2 = 0;
                while (i2 < iM67507x1) {
                    int i3 = i + 1;
                    int i4 = iArr[i];
                    byte[] bArr = this.f40038h4;
                    int i5 = this.f40037dy;
                    this.f40037dy = i5 + 1;
                    bArr[i5] = (byte) this.f40040kk.mo27030k4(i4);
                    i2++;
                    i = i3;
                }
                byte[] bArr2 = this.f40038h4;
                int length = bArr2.length;
                int i6 = this.f40037dy;
                if (length - i6 == 0) {
                    this.f40042to.m49795k4(bArr2, i6);
                    this.f40037dy = 0;
                }
                iM67507x1 = C14116yg.m67507x1(this.f40038h4.length - this.f40037dy, iArr.length - i);
            } while (iM67507x1 > 0);
            int length2 = this.f40035c5 - iArr.length;
            this.f40035c5 = length2;
            if (length2 == 0) {
                this.f40042to.m49795k4(this.f40038h4, this.f40037dy);
                this.f40042to.mo49794k4(this.f40036du);
            }
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6910x1
        /* JADX INFO: renamed from: k4 */
        public void mo27041k4(byte[] bArr, int i) {
            this.f40039k4.m62863x1(bArr, 0, i);
        }
    }

    public C11887kk(int i, int i2) {
        this(0, 0, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m55484k4(InterfaceC6901du interfaceC6901du, boolean z, boolean z2) {
        byte bM27462to = 0;
        if (interfaceC6901du != null) {
            if (interfaceC6901du.mo27029k4() == 1) {
                throw new ArgumentOutOfRangeException("colorPalette", "The color palette must contain entries count equal to the power of 2. Minimal entries count are 2 and maximal 256.");
            }
            int iMo27029k4 = interfaceC6901du.mo27029k4();
            byte b = 0;
            while (iMo27029k4 > 2) {
                if ((iMo27029k4 & 1) == 1) {
                    throw new ArgumentOutOfRangeException("colorPalette", "The color palette must contain entries count equal to the power of 2. Minimal entries count are 2 and maximal 256.");
                }
                iMo27029k4 >>= 1;
                b = (byte) (b + 1);
            }
            bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf((byte) (C7019kk.m27462to((Object) (byte) 0, 6) | C7019kk.m27462to(Byte.valueOf(b), 6))), 6) | 128);
        }
        if (z) {
            bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf(bM27462to), 6) | 32);
        }
        return z2 ? (byte) (C7019kk.m27462to(Byte.valueOf(bM27462to), 6) | 64) : bM27462to;
    }

    /* JADX INFO: renamed from: kk */
    public static InterfaceC6901du m55488kk(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2) {
        if (interfaceC6901du == null) {
            interfaceC6901du = interfaceC6901du2 != null ? interfaceC6901du2 : null;
        }
        if (interfaceC6901du != null) {
            return interfaceC6901du;
        }
        throw new C5102k4("Cannot work with GIF frame pixels since palette is not present neither in GIF image nor in GIF frame. Tip: setup color palette first.");
    }

    /* JADX INFO: renamed from: v4 */
    private InterfaceC6901du m55489v4() {
        return m55488kk(m62755ck(), m62754c5() != null ? m62754c5().m62755ck() : null);
    }

    /* JADX INFO: renamed from: ar */
    public int m55491ar() {
        m62823m9();
        return this.f40033to;
    }

    /* JADX INFO: renamed from: bv */
    public C11888to m55492bv() {
        if (!C7019kk.m27469x1(m62754c5(), C6015h4.class)) {
            return null;
        }
        InterfaceC6018m9[] interfaceC6018m9ArrM24304ks = ((C6015h4) C7019kk.m27452k4((Object) m62754c5(), C6015h4.class)).m24304ks();
        for (int i = 0; i < interfaceC6018m9ArrM24304ks.length; i++) {
            if (interfaceC6018m9ArrM24304ks[i] == this) {
                if (i <= 0) {
                    return null;
                }
                InterfaceC6018m9 interfaceC6018m9 = interfaceC6018m9ArrM24304ks[i - 1];
                if (C7019kk.m27469x1(interfaceC6018m9, C11888to.class)) {
                    return (C11888to) interfaceC6018m9;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: jd */
    public int mo10009jd() {
        return this.f40032kk;
    }

    /* JADX INFO: renamed from: qq */
    public boolean m55493qq() {
        m62823m9();
        return (C7019kk.m27462to(Byte.valueOf(this.f40030h4), 6) & 64) != 0;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um
    /* JADX INFO: renamed from: u4 */
    public boolean mo24307u4() {
        C11888to c11888toM55492bv = m55492bv();
        if (c11888toM55492bv == null) {
            return false;
        }
        return c11888toM55492bv.m55498x1();
    }

    /* JADX INFO: renamed from: um */
    public int m55494um() {
        m62823m9();
        return this.f40029du;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: up */
    public int mo10012up() {
        return this.f40034x1;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um
    /* JADX INFO: renamed from: uz */
    public int mo24308uz() {
        InterfaceC6901du interfaceC6901duM55489v4;
        C11888to c11888toM55492bv = m55492bv();
        if (c11888toM55492bv == null || (interfaceC6901duM55489v4 = m55489v4()) == null || C7019kk.m27462to(Byte.valueOf(c11888toM55492bv.m55497k4()), 6) >= interfaceC6901duM55489v4.mo27029k4()) {
            return 0;
        }
        return interfaceC6901duM55489v4.mo27031x1(C7019kk.m27462to(Byte.valueOf(c11888toM55492bv.m55497k4()), 6));
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public void mo10013x1(AbstractC3150x6 abstractC3150x6) {
        m62823m9();
        C13618wy c13618wy = new C13618wy(abstractC3150x6);
        try {
            m55487k4(c13618wy, new C12014ne(C7019kk.m27462to(Integer.valueOf(this.f40033to), 8), C7019kk.m27462to(Integer.valueOf(this.f40029du), 8), this.f40034x1, this.f40032kk), this.f40030h4);
            InterfaceC6901du interfaceC6901duM62755ck = m62755ck();
            if (interfaceC6901duM62755ck != null) {
                C6013du.m24295k4(c13618wy, interfaceC6901duM62755ck);
            }
            m55486k4(this, c13618wy, m55489v4(), this.f40031k4, m55493qq());
            c13618wy.dispose();
        } catch (Throwable th) {
            c13618wy.dispose();
            throw th;
        }
    }

    public C11887kk(int i, int i2, int i3, int i4) {
        this(null, i, i2, i3, i4, null, false, false, (byte) 8);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m55490x1(AbstractC13613um abstractC13613um, C13618wy c13618wy, InterfaceC6901du interfaceC6901du, byte b, boolean z) {
        k4 k4Var = new k4(abstractC13613um, c13618wy, interfaceC6901du, C7019kk.m27462to(Byte.valueOf(b), 6), abstractC13613um.mo10012up(), abstractC13613um.mo10009jd());
        try {
            if (z) {
                C13617wl.m62839k4(abstractC13613um.m62756dy().Clone(), abstractC13613um.mo10012up(), abstractC13613um.mo10009jd(), k4Var);
            } else {
                C13617wl.m62840k4(abstractC13613um.m62756dy().Clone(), k4Var);
            }
            k4Var.dispose();
        } catch (Throwable th) {
            k4Var.dispose();
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13591ar
    /* JADX INFO: renamed from: k4 */
    public void mo16381k4(int i, int i2) {
        this.f40034x1 = i;
        this.f40032kk = i2;
    }

    public C11887kk(int i, int i2, int i3, int i4, InterfaceC6901du interfaceC6901du, boolean z, boolean z2, byte b) {
        this(null, i, i2, i3, i4, interfaceC6901du, z, z2, b);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55485k4(InterfaceC6901du interfaceC6901du, int i, int i2, int i3, int i4, boolean z, boolean z2, byte b) {
        this.f40030h4 = m55484k4(interfaceC6901du, z, z2);
        this.f40033to = i;
        this.f40029du = i2;
        if (C7019kk.m27462to(Byte.valueOf(b), 6) > 8) {
            this.f40031k4 = (byte) 8;
        } else if (C7019kk.m27462to(Byte.valueOf(b), 6) < 2) {
            this.f40031k4 = (byte) 2;
        } else {
            this.f40031k4 = b;
        }
        this.f40034x1 = i3;
        this.f40032kk = i4;
    }

    public C11887kk(C6017kk c6017kk, int i, int i2, int i3, int i4, InterfaceC6901du interfaceC6901du, boolean z, boolean z2, byte b) {
        super(interfaceC6901du);
        m55485k4(interfaceC6901du, i, i2, C7019kk.m27462to(Integer.valueOf(i3), 8), C7019kk.m27462to(Integer.valueOf(i4), 8), z, z2, b);
        if (c6017kk != null) {
            m62805k4(c6017kk);
            c6017kk.m24314k4(this);
        }
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13591ar, com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: k4 */
    public void mo24303k4(InterfaceC6901du interfaceC6901du, InterfaceC6901du interfaceC6901du2) {
        this.f40030h4 = m55484k4(interfaceC6901du2, (C7019kk.m27462to(Byte.valueOf(this.f40030h4), 6) & 32) > 0, (C7019kk.m27462to(Byte.valueOf(this.f40030h4), 6) & 64) > 0);
        super.mo24303k4(interfaceC6901du, interfaceC6901du2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55486k4(AbstractC13613um abstractC13613um, C13618wy c13618wy, InterfaceC6901du interfaceC6901du, byte b, boolean z) {
        if (interfaceC6901du == null) {
            throw new ArgumentNullException("palette");
        }
        c13618wy.m62855k4(b);
        m55490x1(abstractC13613um, c13618wy, interfaceC6901du, b, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55487k4(C13618wy c13618wy, C12014ne c12014ne, byte b) {
        c13618wy.m62855k4(PatternStyle.Weave);
        c13618wy.m62857k4(C14069jd.m66775k4(C7019kk.m27457kk(Integer.valueOf(c12014ne.m56681to()), 9)));
        c13618wy.m62857k4(C14069jd.m66775k4(C7019kk.m27457kk(Integer.valueOf(c12014ne.m56666dy()), 9)));
        c13618wy.m62857k4(C14069jd.m66775k4(C7019kk.m27457kk(Integer.valueOf(c12014ne.m56663c5()), 9)));
        c13618wy.m62857k4(C14069jd.m66775k4(C7019kk.m27457kk(Integer.valueOf(c12014ne.m56683x1()), 9)));
        c13618wy.m62855k4(b);
    }
}

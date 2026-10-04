package com.aspose.slides.internal.p383rp;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p262m1.C6303kk;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p450uu.C11557k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p483ws.C12282ck;
import com.aspose.slides.internal.p483ws.C12285fa;
import com.aspose.slides.internal.p515xz.C12754k4;
import com.aspose.slides.internal.p550zi.AbstractC13591ar;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.internal.p550zi.C13596dq;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.m9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10037m9 extends AbstractC13591ar {

    /* JADX INFO: renamed from: k4 */
    private C6740x1 f36160k4;

    /* JADX INFO: renamed from: kk */
    private int f36161kk;

    /* JADX INFO: renamed from: to */
    private C11557k4 f36162to;

    /* JADX INFO: renamed from: x1 */
    private int f36163x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.m9$k4 */
    public static class k4 implements InterfaceC6908m9 {

        /* JADX INFO: renamed from: k4 */
        private final x1 f36164k4;

        /* JADX INFO: renamed from: x1 */
        private final AbstractC10036kk f36165x1;

        public k4(C6740x1 c6740x1, long j, C6304x1 c6304x1, int i, int i2) {
            AbstractC10036kk abstractC10036kkM49308k4 = C10033h4.m49308k4(c6740x1, i, i2);
            this.f36165x1 = abstractC10036kkM49308k4;
            this.f36164k4 = new x1(c6304x1, j, abstractC10036kkM49308k4.m49329x1(), c6740x1.m26564fa(), abstractC10036kkM49308k4.m49327kk().m26562dy() == 2);
        }

        /* JADX INFO: renamed from: k4 */
        public x1 m49352k4() {
            return this.f36164k4;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6908m9
        /* JADX INFO: renamed from: k4 */
        public void mo9843k4(C12014ne c12014ne, int[] iArr, C12016rv c12016rv, C12016rv c12016rv2) {
            try {
                this.f36165x1.mo49347k4(iArr, c12014ne.Clone(), this.f36164k4);
            } catch (OutOfMemoryError e) {
                throw new C12754k4("Fatal error", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.m9$x1 */
    public static class x1 implements InterfaceC6906k4 {

        /* JADX INFO: renamed from: c5 */
        private long f36166c5;

        /* JADX INFO: renamed from: du */
        private final long f36167du;

        /* JADX INFO: renamed from: dy */
        private long f36168dy;

        /* JADX INFO: renamed from: h4 */
        private final boolean f36169h4;

        /* JADX INFO: renamed from: jd */
        private long f36170jd;

        /* JADX INFO: renamed from: k4 */
        private final C6304x1 f36171k4;

        /* JADX INFO: renamed from: kk */
        private final long[] f36172kk;

        /* JADX INFO: renamed from: m9 */
        private long f36173m9;

        /* JADX INFO: renamed from: to */
        private final long[] f36174to;

        /* JADX INFO: renamed from: x1 */
        private final long f36175x1;

        public x1(C6304x1 c6304x1, long j, long j2, long j3, boolean z) {
            this.f36169h4 = z;
            this.f36171k4 = c6304x1;
            this.f36173m9 = j;
            j3 = j3 == 0 ? j2 : j3;
            this.f36175x1 = j3;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3 != 0 ? j4 + 1 : j4);
            long[] jArr = new long[i];
            this.f36172kk = jArr;
            this.f36174to = new long[i];
            jArr[0] = j;
            this.f36167du = j2;
        }

        /* JADX INFO: renamed from: du */
        public long m49353du() {
            return this.f36173m9;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27037k4() {
            long j = this.f36168dy + 1;
            this.f36168dy = j;
            if (j % this.f36175x1 == 0 || j == this.f36167du) {
                long[] jArr = this.f36174to;
                long j2 = this.f36166c5;
                long j3 = 1 + j2;
                this.f36166c5 = j3;
                jArr[(int) j2] = this.f36170jd;
                long[] jArr2 = this.f36172kk;
                if (j3 < jArr2.length) {
                    jArr2[(int) j3] = this.f36173m9;
                }
                this.f36170jd = 0L;
            }
        }

        /* JADX INFO: renamed from: kk */
        public long[] m49354kk() {
            return this.f36174to;
        }

        /* JADX INFO: renamed from: to */
        public long m49355to() {
            return this.f36175x1;
        }

        /* JADX INFO: renamed from: x1 */
        public long[] m49356x1() {
            return this.f36172kk;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6906k4
        /* JADX INFO: renamed from: k4 */
        public void mo27038k4(int i) {
            long j = this.f36168dy + ((long) i);
            this.f36168dy = j;
            if (j % this.f36175x1 == 0 || j == this.f36167du) {
                long[] jArr = this.f36174to;
                long j2 = this.f36166c5;
                long j3 = 1 + j2;
                this.f36166c5 = j3;
                jArr[(int) j2] = this.f36170jd;
                long[] jArr2 = this.f36172kk;
                if (j3 < jArr2.length) {
                    jArr2[(int) j3] = this.f36173m9;
                }
                this.f36170jd = 0L;
            }
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6910x1
        /* JADX INFO: renamed from: k4 */
        public void mo27041k4(byte[] bArr, int i) {
            if (this.f36169h4) {
                AbstractC10035k4.m49316k4(bArr, 0, i);
            }
            this.f36171k4.m62854k4(this.f36173m9, 0);
            this.f36171k4.m62863x1(bArr, 0, i);
            long j = i;
            this.f36173m9 += j;
            this.f36170jd += j;
        }
    }

    public C10037m9(C6740x1 c6740x1, int i, int i2) {
        if (c6740x1 == null) {
            throw new ArgumentNullException("options");
        }
        this.f36160k4 = c6740x1;
        this.f36161kk = i;
        this.f36163x1 = i2;
    }

    /* JADX INFO: renamed from: ar */
    public C11557k4 m49349ar() {
        return this.f36162to;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: jd */
    public int mo10009jd() {
        return this.f36163x1;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13591ar
    /* JADX INFO: renamed from: k4 */
    public void mo16381k4(int i, int i2) {
        this.f36161kk = i;
        this.f36163x1 = i2;
    }

    /* JADX INFO: renamed from: qq */
    public C6740x1 m49351qq() {
        m62823m9();
        return this.f36160k4;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um, com.aspose.slides.internal.p550zi.AbstractC13605ks, com.aspose.slides.internal.p550zi.AbstractC13599fa, com.aspose.slides.internal.p550zi.C13614up
    /* JADX INFO: renamed from: to */
    public void mo24306to() {
        this.f36160k4 = null;
        super.mo24306to();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: up */
    public int mo10012up() {
        return this.f36161kk;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public void mo10013x1(AbstractC3150x6 abstractC3150x6) {
        m62823m9();
        m49348k4((AbstractC13613um) this, C6303kk.m25828k4(abstractC3150x6, C7019kk.m27469x1(m62754c5(), C10032dy.class) ? ((C10032dy) C7019kk.m27452k4((Object) m62754c5(), C10032dy.class)).m49306ks() : 18761), true, this.f36160k4, this.f36162to);
    }

    public C10037m9(C6740x1 c6740x1, int i, int i2, InterfaceC6900ck interfaceC6900ck) {
        if (c6740x1 == null) {
            throw new ArgumentNullException("options");
        }
        this.f36160k4 = c6740x1;
        this.f36161kk = i;
        this.f36163x1 = i2;
        if (interfaceC6900ck != null) {
            m62805k4(interfaceC6900ck);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m49350k4(C11557k4 c11557k4) {
        this.f36162to = c11557k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49348k4(AbstractC13613um abstractC13613um, C6304x1 c6304x1, boolean z, C6740x1 c6740x1, C11557k4 c11557k4) {
        AbstractC10031du[] abstractC10031duArrM54547x1;
        AbstractC10031du[] abstractC10031duArrM54545kk;
        c6740x1.m26588um();
        c6740x1.m26578kk(abstractC13613um.mo10012up());
        c6740x1.m26594x1(abstractC13613um.mo10009jd());
        if (c6740x1.m26560du() == 7) {
            c6740x1.m26570k4(abstractC13613um.mo10009jd());
            C12282ck c12282ck = new C12282ck(530);
            c12282ck.m57544k4(new short[]{2, 2});
            C12285fa c12285fa = new C12285fa(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1);
            c12285fa.m57545k4(new int[]{1});
            c6740x1.m26572k4(c12282ck);
            c6740x1.m26572k4(c12285fa);
        }
        c6740x1.m26574k4(new long[]{0});
        c6740x1.m26597x1(new long[]{0});
        if (!c6740x1.m26575k4(StyleIdentifier.GRID_TABLE_6_COLORFUL)) {
            c6740x1.m26570k4(4294967295L);
        }
        if (c11557k4 != null) {
            abstractC10031duArrM54547x1 = c11557k4.m54547x1();
            abstractC10031duArrM54545kk = c11557k4.m54545kk();
        } else {
            abstractC10031duArrM54547x1 = null;
            abstractC10031duArrM54545kk = null;
        }
        C10030ck c10030ck = new C10030ck(c6740x1.m26583qq(), abstractC10031duArrM54547x1, abstractC10031duArrM54545kk);
        long jM62853k4 = c6304x1.m62853k4();
        k4 k4Var = new k4(c6740x1, C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(c10030ck.m49281x1()), 10) + C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM62853k4), 11)), 10)), 10), c6304x1, abstractC13613um.mo10012up(), abstractC13613um.mo10009jd());
        if (abstractC13613um.mo24307u4()) {
            abstractC13613um.mo10018x1(abstractC13613um.m62756dy().Clone(), new C13596dq(abstractC13613um.mo24308uz(), abstractC13613um.mo24310yj(), k4Var));
        } else {
            abstractC13613um.mo10018x1(abstractC13613um.m62756dy().Clone(), k4Var);
        }
        c6740x1.m26574k4(k4Var.m49352k4().m49354kk());
        c6740x1.m26597x1(k4Var.m49352k4().m49356x1());
        c6740x1.m26570k4(k4Var.m49352k4().m49355to());
        c10030ck.m49280k4(new AbstractC10031du[]{c6740x1.m26557c5(StyleIdentifier.GRID_TABLE_6_COLORFUL), c6740x1.m26557c5(StyleIdentifier.GRID_TABLE_7_COLORFUL), c6740x1.m26557c5(StyleIdentifier.GRID_TABLE_1_LIGHT)});
        long jM49353du = k4Var.m49352k4().m49353du();
        c6304x1.m62854k4(jM62853k4, 0);
        c10030ck.m49279k4(c6304x1, jM49353du, z);
    }
}

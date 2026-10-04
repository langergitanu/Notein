package com.aspose.slides.internal.p050by;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p135fp.C4090du;
import com.aspose.slides.internal.p135fp.C4101qq;
import com.aspose.slides.internal.p135fp.C4108v4;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p381rm.C10019k4;
import com.aspose.slides.internal.p383rp.AbstractC10039x1;
import com.aspose.slides.internal.p402sn.C10243kk;
import com.aspose.slides.internal.p402sn.C10245x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p512xv.C12679k4;
import com.aspose.slides.internal.p550zi.C13590ak;
import com.aspose.slides.internal.p550zi.C13617wl;
import com.aspose.slides.internal.p550zi.C13618wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.by.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1900kk extends AbstractC10039x1 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f6805k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.by.kk$k4 */
    public static class k4 implements InterfaceC6902dy {

        /* JADX INFO: renamed from: du */
        private final int f6806du;

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC6908m9 f6807k4;

        /* JADX INFO: renamed from: kk */
        private final long[] f6808kk;

        /* JADX INFO: renamed from: to */
        private final byte[] f6809to;

        /* JADX INFO: renamed from: x1 */
        private final C6304x1 f6810x1;

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.kk$k4$k4, reason: collision with other inner class name */
        public static class C19054k4 implements InterfaceC6908m9 {

            /* JADX INFO: renamed from: k4 */
            private final C12016rv f6811k4;

            /* JADX INFO: renamed from: x1 */
            private final InterfaceC6908m9 f6812x1;

            public C19054k4(C12016rv c12016rv, InterfaceC6908m9 interfaceC6908m9) {
                C12016rv c12016rv2 = new C12016rv();
                this.f6811k4 = c12016rv2;
                c12016rv.CloneTo(c12016rv2);
                this.f6812x1 = interfaceC6908m9;
            }

            @Override // com.aspose.slides.internal.p299ni.InterfaceC6908m9
            /* JADX INFO: renamed from: k4 */
            public void mo9843k4(C12014ne c12014ne, int[] iArr, C12016rv c12016rv, C12016rv c12016rv2) {
                c12014ne.m56678kk(this.f6811k4.Clone());
                c12016rv.m56715x1(this.f6811k4.Clone());
                c12016rv2.m56715x1(this.f6811k4.Clone());
                this.f6812x1.mo9843k4(c12014ne.Clone(), iArr, c12016rv.Clone(), c12016rv2.Clone());
            }
        }

        public k4(C1900kk c1900kk, C6304x1 c6304x1, InterfaceC6908m9 interfaceC6908m9, byte[] bArr) {
            this.f6810x1 = c6304x1;
            this.f6807k4 = interfaceC6908m9;
            this.f6809to = bArr;
            this.f6808kk = c1900kk.m49327kk().m26579ks();
            this.f6806du = c1900kk.m49327kk().m26568jd();
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            long jM62853k4 = this.f6810x1.m62853k4();
            int i = 0;
            int iM50168x1 = 0;
            while (true) {
                long[] jArr = this.f6808kk;
                if (i >= jArr.length) {
                    this.f6810x1.m62856k4(jM62853k4);
                    return;
                }
                this.f6810x1.m62856k4(jArr[i]);
                C12679k4 c12679k4 = new C12679k4();
                c12679k4.m58829k4(C13590ak.m62705k4(this.f6806du));
                if (this.f6809to != null) {
                    C4090du[] c4090duArrM49194k4 = C10019k4.m49194k4(new C4101qq(new C3152yj(this.f6809to)));
                    C4108v4[] c4108v4ArrM49202x1 = C10019k4.m49202x1(new C4101qq(new C3152yj(this.f6809to)));
                    c12679k4.m58830k4(c4090duArrM49194k4);
                    c12679k4.m58831k4(c4108v4ArrM49202x1);
                }
                C13618wy c13618wy = new C13618wy(this.f6810x1.m62861x1());
                try {
                    C10243kk c10243kkM50198x1 = C10245x1.m50198x1(c13618wy, c12679k4);
                    C12014ne c12014ne2 = new C12014ne(0, iM50168x1, c10243kkM50198x1.m50157k4(), c10243kkM50198x1.m50168x1());
                    C19054k4 c19054k4 = new C19054k4(new C12016rv(0, iM50168x1), this.f6807k4);
                    if (c12014ne2.m56686x1(c12014ne.Clone())) {
                        C12014ne c12014neClone = C12014ne.m56656k4(c12014ne2.Clone(), c12014ne.Clone()).Clone();
                        c10243kkM50198x1.m50167to().mo10018x1(new C12014ne(c12014neClone.m56669jd(), c12014neClone.m56665du().m56713x1() - iM50168x1, c12014neClone.m56663c5(), c12014neClone.m56683x1()).Clone(), c19054k4);
                    }
                    iM50168x1 += c10243kkM50198x1.m50168x1();
                    c13618wy.dispose();
                    i++;
                } catch (Throwable th) {
                    c13618wy.dispose();
                    throw th;
                }
            }
        }
    }

    public C1900kk(C6740x1 c6740x1, int i, int i2) {
        super(c6740x1, i, i2);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10039x1
    /* JADX INFO: renamed from: k4 */
    public void mo9816k4(C6304x1 c6304x1, C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        C13617wl.m62840k4(c12014ne.Clone(), new k4(this, c6304x1, interfaceC6908m9, this.f6805k4));
    }

    /* JADX INFO: renamed from: k4 */
    public void m9842k4(byte[] bArr) {
        this.f6805k4 = bArr;
    }
}

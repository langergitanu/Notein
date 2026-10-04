package com.aspose.slides.internal.p245la;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p392s4.C10143m9;
import com.aspose.slides.internal.p470w5.C11887kk;
import com.aspose.slides.internal.p470w5.C11888to;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p550zi.C13594c5;
import com.aspose.slides.internal.p550zi.C13616v4;
import com.aspose.slides.internal.p550zi.C13617wl;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13619x1;
import com.aspose.slides.internal.p550zi.C13621xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.la.kk */
/* JADX INFO: loaded from: classes.dex */
public class C6017kk implements InterfaceC6900ck {

    /* JADX INFO: renamed from: du */
    private final int f17028du;

    /* JADX INFO: renamed from: dy */
    private C11887kk f17029dy;

    /* JADX INFO: renamed from: h4 */
    private final boolean f17030h4;

    /* JADX INFO: renamed from: k4 */
    private final C13618wy f17031k4;

    /* JADX INFO: renamed from: kk */
    private final int f17032kk;

    /* JADX INFO: renamed from: m9 */
    private final long f17033m9;

    /* JADX INFO: renamed from: to */
    private final int f17034to;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC6901du f17035x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.la.kk$k4 */
    public static class k4 implements InterfaceC6902dy {

        /* JADX INFO: renamed from: k4 */
        private final byte[] f17036k4;

        /* JADX INFO: renamed from: kk */
        private final int[] f17037kk;

        /* JADX INFO: renamed from: to */
        private C12014ne f17038to;

        /* JADX INFO: renamed from: x1 */
        private final InterfaceC6908m9 f17039x1;

        public k4(byte[] bArr, C12014ne c12014ne, int[] iArr, InterfaceC6908m9 interfaceC6908m9) {
            C12014ne c12014ne2 = new C12014ne();
            this.f17038to = c12014ne2;
            this.f17037kk = iArr;
            this.f17036k4 = bArr;
            c12014ne.CloneTo(c12014ne2);
            this.f17039x1 = interfaceC6908m9;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            C12014ne c12014neClone = C12014ne.m56656k4(this.f17038to.Clone(), c12014ne.Clone()).Clone();
            if (c12014neClone.m56679kk()) {
                return;
            }
            int[] iArr = new int[c12014neClone.m56683x1() * c12014neClone.m56663c5()];
            for (int iM56666dy = c12014neClone.m56666dy(); iM56666dy < c12014neClone.m56670k4(); iM56666dy++) {
                int iM56663c5 = this.f17038to.m56663c5() * (iM56666dy - this.f17038to.m56666dy());
                int iM56663c52 = c12014neClone.m56663c5() * (iM56666dy - c12014neClone.m56666dy());
                for (int i = 0; i < c12014neClone.m56663c5(); i++) {
                    iArr[i + iM56663c52] = this.f17037kk[this.f17036k4[i + iM56663c5] & 255];
                }
            }
            this.f17039x1.mo9843k4(c12014neClone.Clone(), iArr, c12014neClone.m56665du().Clone(), new C12016rv(c12014neClone.m56668h4(), c12014neClone.m56670k4()));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.la.kk$kk */
    public static class kk implements InterfaceC6902dy {

        /* JADX INFO: renamed from: jd */
        private final C12014ne f17044jd;

        /* JADX INFO: renamed from: k4 */
        private final C10143m9 f17045k4;

        /* JADX INFO: renamed from: x1 */
        private final InterfaceC6899c5 f17049x1;

        /* JADX INFO: renamed from: kk */
        private final InterfaceC6901du f17046kk = null;

        /* JADX INFO: renamed from: to */
        private final C13594c5 f17048to = null;

        /* JADX INFO: renamed from: du */
        private final int[] f17041du = null;

        /* JADX INFO: renamed from: h4 */
        private final byte f17043h4 = 0;

        /* JADX INFO: renamed from: m9 */
        private final int f17047m9 = 0;

        /* JADX INFO: renamed from: dy */
        private final int f17042dy = 0;

        /* JADX INFO: renamed from: c5 */
        private final boolean f17040c5 = false;

        public kk(C10143m9 c10143m9, InterfaceC6899c5 interfaceC6899c5, C12014ne c12014ne) {
            C12014ne c12014ne2 = new C12014ne();
            this.f17044jd = c12014ne2;
            c12014ne.CloneTo(c12014ne2);
            this.f17045k4 = c10143m9;
            this.f17049x1 = interfaceC6899c5;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            byte[] bArr;
            int iM56663c5 = c12014ne.m56663c5();
            int iM56683x1 = c12014ne.m56683x1();
            int i = iM56663c5 * iM56683x1;
            if (C13619x1.m62864k4() > 0 && i > C13619x1.m62864k4()) {
                throw new OutOfMemoryException();
            }
            C12014ne c12014neClone = C12014ne.m56656k4(c12014ne.Clone(), this.f17044jd.Clone()).Clone();
            byte[] bArr2 = new byte[i];
            if (c12014neClone.m56663c5() <= 0 || c12014neClone.m56683x1() <= 0 || c12014neClone.equals(C7019kk.m27451k4(c12014ne))) {
                bArr = null;
            } else {
                bArr = new byte[c12014neClone.m56683x1() * c12014neClone.m56663c5()];
            }
            C13621xk c13621xkClone = this.f17045k4.m49890k4(bArr2, i).Clone();
            if (i != c13621xkClone.f45230x1 || !c13621xkClone.f45228k4) {
                throw new C5102k4("Found inconsistency in image data. The image data contained has incorrect pixels count.");
            }
            if (c12014neClone.m56663c5() <= 0 || c12014neClone.m56683x1() <= 0) {
                return;
            }
            C12014ne c12014ne2 = new C12014ne(c12014neClone.m56681to() - c12014ne.m56681to(), c12014neClone.m56666dy() - c12014ne.m56666dy(), c12014neClone.m56663c5(), c12014neClone.m56683x1());
            byte[] bArrM62866k4 = C13619x1.m62866k4(bArr2, iM56663c5, iM56683x1, bArr, c12014ne2.Clone(), false);
            c12014ne2.m56678kk(c12014ne.m56665du().Clone());
            this.f17049x1.mo16292k4(c12014ne2.Clone(), bArrM62866k4, c12014ne2.m56665du().Clone(), new C12016rv(c12014ne2.m56668h4(), c12014ne2.m56670k4()));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.la.kk$x1 */
    public static class x1 implements InterfaceC6899c5 {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC6908m9 f17050k4;

        /* JADX INFO: renamed from: kk */
        private final C12014ne f17051kk;

        /* JADX INFO: renamed from: x1 */
        private final C6017kk f17052x1;

        public x1(C12014ne c12014ne, C6017kk c6017kk, InterfaceC6908m9 interfaceC6908m9) {
            C12014ne c12014ne2 = new C12014ne();
            this.f17051kk = c12014ne2;
            c12014ne.CloneTo(c12014ne2);
            this.f17052x1 = c6017kk;
            this.f17050k4 = interfaceC6908m9;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6899c5
        /* JADX INFO: renamed from: k4 */
        public void mo16292k4(C12014ne c12014ne, byte[] bArr, C12016rv c12016rv, C12016rv c12016rv2) {
            C11888to c11888toM55492bv;
            int iM55497k4;
            int[] iArrMo27032x1 = this.f17052x1.f17035x1.mo27032x1();
            if (this.f17052x1.f17029dy != null && (c11888toM55492bv = this.f17052x1.f17029dy.m55492bv()) != null && c11888toM55492bv.m55498x1() && (iM55497k4 = c11888toM55492bv.m55497k4() & 255) >= 0 && iM55497k4 < iArrMo27032x1.length) {
                iArrMo27032x1[iM55497k4] = iArrMo27032x1[iM55497k4] & 16777215;
            }
            C13617wl.m62840k4(this.f17051kk.Clone(), new k4(bArr, c12014ne.Clone(), iArrMo27032x1, this.f17050k4));
        }
    }

    public C6017kk(C13618wy c13618wy, long j, boolean z, InterfaceC6901du interfaceC6901du, int i, int i2, int i3) {
        if (c13618wy == null) {
            throw new ArgumentNullException("loadPixelsDataStream");
        }
        if (interfaceC6901du == null) {
            throw new ArgumentNullException("pixelsPalette");
        }
        this.f17033m9 = j;
        this.f17031k4 = c13618wy;
        this.f17035x1 = interfaceC6901du;
        this.f17032kk = i;
        this.f17034to = i2;
        this.f17028du = i3;
        this.f17030h4 = z;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: ix */
    public boolean mo10016ix() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24314k4(C11887kk c11887kk) {
        this.f17029dy = c11887kk;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
    /* JADX INFO: renamed from: x1 */
    public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        m24315k4(c12014ne.Clone(), new x1(c12014ne.Clone(), this, interfaceC6908m9));
    }

    /* JADX INFO: renamed from: k4 */
    public void m24315k4(C12014ne c12014ne, InterfaceC6899c5 interfaceC6899c5) {
        this.f17031k4.m62854k4(this.f17033m9, 0);
        C10143m9 c10143m9 = new C10143m9(this.f17031k4, this.f17028du);
        c10143m9.m49891ks();
        kk kkVar = new kk(c10143m9, interfaceC6899c5, c12014ne.Clone());
        C12014ne.m56654k4(0, 0, this.f17032kk & 65535, c12014ne.m56670k4()).CloneTo(c12014ne);
        boolean z = this.f17030h4;
        C12014ne c12014neClone = c12014ne.Clone();
        if (z) {
            C13617wl.m62839k4(c12014neClone, this.f17032kk & 65535, 65535 & this.f17034to, kkVar);
        } else {
            C13617wl.m62840k4(c12014neClone, kkVar);
        }
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: k4 */
    public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
        throw new NotImplementedException();
    }
}

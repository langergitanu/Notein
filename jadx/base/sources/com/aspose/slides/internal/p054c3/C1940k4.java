package com.aspose.slides.internal.p054c3;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p515xz.C12757x1;
import com.aspose.slides.internal.p550zi.AbstractC13605ks;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.internal.p550zi.C13598dy;
import com.aspose.slides.internal.p550zi.C13607m9;
import com.aspose.slides.internal.p550zi.C13611to;
import com.aspose.slides.internal.p550zi.C13616v4;
import com.aspose.slides.internal.p550zi.C13619x1;
import com.aspose.slides.internal.p550zi.C13622yd;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.c3.k4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1940k4 extends AbstractC13613um {

    /* JADX INFO: renamed from: k4 */
    private static int f6901k4;

    /* JADX INFO: renamed from: du */
    private int[] f6902du;

    /* JADX INFO: renamed from: kk */
    private final int f6903kk;

    /* JADX INFO: renamed from: to */
    private byte[] f6904to;

    /* JADX INFO: renamed from: x1 */
    private final int f6905x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.c3.k4$k4 */
    public static class k4 implements InterfaceC6900ck {

        /* JADX INFO: renamed from: k4 */
        private final C1940k4 f6906k4;

        public k4(C1940k4 c1940k4) {
            this.f6906k4 = c1940k4;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
        /* JADX INFO: renamed from: ix */
        public boolean mo10016ix() {
            return false;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
        /* JADX INFO: renamed from: k4 */
        public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
        /* JADX INFO: renamed from: x1 */
        public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
            int iM56683x1 = c12014ne.m56683x1() * c12014ne.m56663c5();
            if (C13598dy.m62722k4() > 0 && iM56683x1 > C13598dy.m62722k4()) {
                throw new OutOfMemoryException();
            }
            int iM56681to = c12014ne.m56681to();
            int iM56668h4 = c12014ne.m56668h4();
            int iM56666dy = c12014ne.m56666dy();
            int iM56670k4 = c12014ne.m56670k4();
            int iM56683x12 = c12014ne.m56683x1();
            int iM56663c5 = c12014ne.m56663c5();
            int[] iArr = new int[iM56683x1];
            int i = 0;
            if (iM56681to == 0 && iM56668h4 == this.f6906k4.f6905x1) {
                if (this.f6906k4.f6902du != null) {
                    System.arraycopy(this.f6906k4.f6902du, iM56666dy * iM56668h4, iArr, 0, iM56683x12 * iM56668h4);
                } else {
                    int i2 = iM56683x12 * iM56668h4;
                    if (this.f6906k4.f6904to != null) {
                        int i3 = iM56666dy * iM56668h4 * 4;
                        while (i < i2) {
                            iArr[i] = C13611to.m62789k4(this.f6906k4.f6904to, i3);
                            i3 += 4;
                            i++;
                        }
                    } else {
                        int i4 = i2 * 4;
                        byte[] bArrM62865k4 = C13619x1.m62865k4(i4);
                        int length = (bArrM62865k4.length / 4) * 4;
                        if (length == 0) {
                            throw new OutOfMemoryException("The buffer allocated is too small to continue partial loading.");
                        }
                        int i5 = iM56666dy * iM56668h4 * 4;
                        int i6 = 0;
                        while (i4 > 0) {
                            length = C14116yg.m67507x1(i4, length);
                            this.f6906k4.m62727k4().m62854k4(i5, 0);
                            if (this.f6906k4.m62727k4().m62852k4(bArrM62865k4, 0, length) != length) {
                                throw new C12757x1("Cannot read the cached color data. Cannot continue execution.");
                            }
                            i5 += length;
                            i4 -= length;
                            int i7 = 0;
                            while (i7 < length) {
                                iArr[i6] = C13611to.m62789k4(bArrM62865k4, i7);
                                i7 += 4;
                                i6++;
                            }
                        }
                    }
                }
            } else if (this.f6906k4.f6902du != null) {
                int i8 = (this.f6906k4.f6905x1 * iM56666dy) + iM56681to;
                while (i < iM56683x12) {
                    System.arraycopy(this.f6906k4.f6902du, i8, iArr, i * iM56663c5, iM56663c5);
                    i8 += this.f6906k4.f6905x1;
                    i++;
                }
            } else if (this.f6906k4.f6904to != null) {
                int i9 = 0;
                for (int i10 = 0; i10 < iM56683x12; i10++) {
                    int i11 = ((this.f6906k4.f6905x1 * (iM56666dy + i10)) + iM56681to) * 4;
                    int i12 = 0;
                    while (i12 < iM56663c5) {
                        iArr[i9] = C13611to.m62789k4(this.f6906k4.f6904to, i11);
                        i11 += 4;
                        i12++;
                        i9++;
                    }
                }
            } else {
                int i13 = iM56663c5 * 4;
                byte[] bArrM62865k42 = C13619x1.m62865k4(i13);
                int length2 = (bArrM62865k42.length / 4) * 4;
                if (length2 == 0) {
                    throw new OutOfMemoryException("The buffer allocated is too small to continue partial loading.");
                }
                int i14 = 0;
                int i15 = 0;
                while (i14 < iM56683x12) {
                    int i16 = ((this.f6906k4.f6905x1 * (iM56666dy + i14)) + iM56681to) * 4;
                    int i17 = i13;
                    int iM67507x1 = length2;
                    while (i17 > 0) {
                        iM67507x1 = C14116yg.m67507x1(i17, iM67507x1);
                        int i18 = iM56681to;
                        int i19 = iM56683x12;
                        int i20 = i13;
                        int i21 = iM56666dy;
                        this.f6906k4.m62727k4().m62854k4(i16, 0);
                        if (this.f6906k4.m62727k4().m62852k4(bArrM62865k42, 0, iM67507x1) != iM67507x1) {
                            throw new C12757x1("Cannot read the cached color data. Cannot continue execution.");
                        }
                        i16 += iM67507x1;
                        i17 -= iM67507x1;
                        int i22 = 0;
                        while (i22 < iM67507x1) {
                            iArr[i15] = C13611to.m62789k4(bArrM62865k42, i22);
                            i22 += 4;
                            i15++;
                        }
                        iM56681to = i18;
                        iM56683x12 = i19;
                        i13 = i20;
                        iM56666dy = i21;
                    }
                    i14++;
                    iM56666dy = iM56666dy;
                }
            }
            if (this.f6906k4.m62755ck() != null) {
                m10015k4(iArr);
            }
            interfaceC6908m9.mo9843k4(c12014ne.Clone(), iArr, c12014ne.m56665du().Clone(), new C12016rv(iM56668h4, iM56670k4));
        }

        /* JADX INFO: renamed from: k4 */
        private void m10015k4(int[] iArr) {
            InterfaceC6901du interfaceC6901duM62755ck = this.f6906k4.m62755ck();
            C13622yd c13622yd = new C13622yd(interfaceC6901duM62755ck);
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = interfaceC6901duM62755ck.mo27031x1(c13622yd.mo27030k4(iArr[i]));
            }
        }
    }

    public C1940k4(int i, int i2) {
        this.f6905x1 = i;
        this.f6903kk = i2;
        m10007ks();
        m62805k4(new k4(this));
    }

    /* JADX INFO: renamed from: ks */
    private void m10007ks() {
        int i = this.f6905x1 * this.f6903kk;
        if (C13607m9.m62770to() == 1) {
            m62729k4(C13607m9.m62764k4(i * 4));
            return;
        }
        if (f6901k4 != 0) {
            throw new OutOfMemoryException();
        }
        this.f6902du = new int[i];
        if (this.f6902du == null) {
            int i2 = i * 4;
            if (f6901k4 != 1) {
                throw new OutOfMemoryException();
            }
            this.f6904to = new byte[i2];
            if (this.f6904to == null) {
                m62729k4(C13607m9.m62764k4(i2));
            }
        }
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: jd */
    public int mo10009jd() {
        return this.f6903kk;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: kk */
    public void mo10011kk() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: up */
    public int mo10012up() {
        return this.f6905x1;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public void mo10013x1(AbstractC3150x6 abstractC3150x6) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13613um
    /* JADX INFO: renamed from: k4 */
    public void mo10010k4(C12014ne c12014ne, int[] iArr) {
        C1940k4 c1940k4 = this;
        int[] iArr2 = iArr;
        AbstractC13605ks.m62753k4(c12014ne.Clone(), iArr2, c1940k4.f6905x1, c1940k4.f6903kk).CloneTo(c12014ne);
        int iM56681to = c12014ne.m56681to();
        int iM56668h4 = c12014ne.m56668h4();
        int iM56666dy = c12014ne.m56666dy();
        int iM56663c5 = c12014ne.m56663c5();
        int iM56683x1 = c12014ne.m56683x1();
        int i = 0;
        if (iM56681to == 0 && iM56668h4 == c1940k4.f6905x1) {
            int[] iArr3 = c1940k4.f6902du;
            if (iArr3 != null) {
                System.arraycopy(iArr2, 0, iArr3, iM56666dy * iM56668h4, iM56683x1 * iM56668h4);
                return;
            }
            int i2 = iM56683x1 * iM56668h4;
            if (c1940k4.f6904to != null) {
                int i3 = iM56666dy * iM56668h4 * 4;
                while (i < i2) {
                    C13611to.m62792k4(iArr2[i], c1940k4.f6904to, i3);
                    i3 += 4;
                    i++;
                }
                return;
            }
            int i4 = i2 * 4;
            byte[] bArrM62865k4 = C13619x1.m62865k4(i4);
            int length = (bArrM62865k4.length / 4) * 4;
            if (length == 0) {
                throw new OutOfMemoryException("The buffer allocated is too small to continue partial saving.");
            }
            int i5 = iM56666dy * iM56668h4 * 4;
            int i6 = 0;
            while (i4 > 0) {
                int iM67507x1 = C14116yg.m67507x1(length, i4);
                int i7 = 0;
                while (i7 < iM67507x1) {
                    C13611to.m62792k4(iArr2[i6], bArrM62865k4, i7);
                    i7 += 4;
                    i6++;
                }
                c1940k4.m62727k4().m62854k4(i5, 0);
                c1940k4.m62727k4().m62863x1(bArrM62865k4, 0, iM67507x1);
                i5 += iM67507x1;
                i4 -= iM67507x1;
            }
            return;
        }
        if (c1940k4.f6902du != null) {
            int i8 = (iM56666dy * c1940k4.f6905x1) + iM56681to;
            while (i < iM56683x1) {
                System.arraycopy(iArr2, i * iM56663c5, c1940k4.f6902du, i8, iM56663c5);
                i8 += c1940k4.f6905x1;
                i++;
            }
            return;
        }
        if (c1940k4.f6904to != null) {
            int i9 = 0;
            for (int i10 = 0; i10 < iM56683x1; i10++) {
                int i11 = (((iM56666dy + i10) * c1940k4.f6905x1) + iM56681to) * 4;
                int i12 = 0;
                while (i12 < iM56663c5) {
                    C13611to.m62792k4(iArr2[i9], c1940k4.f6904to, i11);
                    i11 += 4;
                    i12++;
                    i9++;
                }
            }
            return;
        }
        int i13 = iM56663c5 * 4;
        byte[] bArrM62865k42 = C13619x1.m62865k4(i13);
        int length2 = (bArrM62865k42.length / 4) * 4;
        if (length2 == 0) {
            throw new OutOfMemoryException("The buffer allocated is too small to continue partial saving.");
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < iM56683x1) {
            int i16 = (((iM56666dy + i14) * c1940k4.f6905x1) + iM56681to) * 4;
            int i17 = i13;
            while (i17 > 0) {
                int iM67507x12 = C14116yg.m67507x1(i17, length2);
                int i18 = 0;
                while (i18 < iM67507x12) {
                    C13611to.m62792k4(iArr2[i15], bArrM62865k42, i18);
                    i18 += 4;
                    i15++;
                }
                c1940k4.m62727k4().m62854k4(i16, 0);
                m62727k4().m62863x1(bArrM62865k42, 0, iM67507x12);
                i16 += iM67507x12;
                i17 -= iM67507x12;
                c1940k4 = this;
                iArr2 = iArr;
            }
            i14++;
            c1940k4 = this;
            iArr2 = iArr;
        }
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public boolean mo10014x1() {
        throw new NotImplementedException();
    }
}

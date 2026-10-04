package com.aspose.slides.internal.p050by;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p236kq.C5898k4;
import com.aspose.slides.internal.p236kq.InterfaceC5899kk;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p383rp.AbstractC10035k4;
import com.aspose.slides.internal.p383rp.AbstractC10039x1;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p550zi.C13604kk;
import com.aspose.slides.internal.p550zi.C13612u4;
import com.aspose.slides.internal.p550zi.C13617wl;
import com.aspose.slides.internal.p550zi.C13620x6;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.by.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1897dy extends AbstractC10039x1 {

    /* JADX INFO: renamed from: k4 */
    private static int f6761k4;

    /* JADX INFO: renamed from: x1 */
    private final C13620x6 f6762x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.by.dy$k4 */
    public static class k4 implements InterfaceC6902dy {

        /* JADX INFO: renamed from: c5 */
        private final int f6763c5;

        /* JADX INFO: renamed from: ck */
        private final int f6764ck;

        /* JADX INFO: renamed from: du */
        private final int f6765du;

        /* JADX INFO: renamed from: dy */
        private int f6766dy;

        /* JADX INFO: renamed from: fa */
        private final int f6767fa;

        /* JADX INFO: renamed from: h4 */
        private final InterfaceC5899kk f6768h4;

        /* JADX INFO: renamed from: jd */
        private final int f6769jd;

        /* JADX INFO: renamed from: k4 */
        private final C6304x1 f6770k4;

        /* JADX INFO: renamed from: kk */
        private final InterfaceC6908m9 f6771kk;

        /* JADX INFO: renamed from: m9 */
        private final C13620x6 f6772m9;

        /* JADX INFO: renamed from: to */
        private final C5898k4 f6773to;

        /* JADX INFO: renamed from: up */
        private int f6774up;

        /* JADX INFO: renamed from: x1 */
        private final long[] f6775x1;

        /* JADX INFO: renamed from: yj */
        private int f6776yj;

        public k4(C1897dy c1897dy, C6304x1 c6304x1, InterfaceC6908m9 interfaceC6908m9, C12014ne c12014ne) {
            this.f6766dy = C12003du.m56385i5().m56506h4();
            this.f6764ck = c12014ne.m56681to();
            this.f6769jd = c12014ne.m56668h4();
            this.f6771kk = interfaceC6908m9;
            this.f6770k4 = c6304x1;
            long[] jArrM26579ks = c1897dy.m49327kk().m26579ks();
            this.f6775x1 = jArrM26579ks;
            this.f6773to = new C5898k4(c1897dy.m49329x1(), jArrM26579ks.length, c1897dy.m49324du());
            this.f6768h4 = c1897dy.m49326k4(c1897dy.m49327kk(), AbstractC10035k4.m49323x1(c1897dy.m49327kk()), c12014ne.Clone());
            int iM26556ar = c1897dy.m49327kk().m26556ar();
            this.f6763c5 = iM26556ar;
            this.f6765du = ((c1897dy.m49325k4() * iM26556ar) + 7) / 8;
            C13620x6 c13620x6 = c1897dy.f6762x1;
            this.f6772m9 = c13620x6;
            this.f6767fa = ((c1897dy.m49325k4() * iM26556ar) - 1) / 8;
            if (c13620x6 == null || c13620x6.m62868k4() == 0) {
                return;
            }
            this.f6766dy = c13620x6.m62869x1();
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            int i;
            int iM56663c5 = c12014ne.m56663c5();
            int iM56681to = c12014ne.m56681to();
            int iM56683x1 = c12014ne.m56683x1();
            int iM56668h4 = c12014ne.m56668h4();
            int iM56666dy = c12014ne.m56666dy();
            int iM56670k4 = c12014ne.m56670k4();
            int i2 = iM56663c5 * iM56683x1;
            if (C1897dy.f6761k4 > 0 && i2 > C1897dy.f6761k4) {
                throw new OutOfMemoryException();
            }
            int[] iArrM49684k4 = C10052k4.m49684k4(i2);
            if (this.f6774up == iM56666dy) {
                int[] iArr = {0};
                this.f6768h4.mo23757k4(iArrM49684k4, iArr);
                i = iArr[0];
            } else {
                i = 0;
            }
            if (i < i2) {
                int i3 = this.f6763c5;
                int i4 = ((iM56681to + i) * i3) / 8;
                int i5 = ((i3 * iM56668h4) - 1) / 8;
                int i6 = (i5 - i4) + 1;
                int iM23753x1 = iM56666dy > 0 ? this.f6773to.m23753x1(iM56666dy) : 0;
                int iM67507x1 = iM56666dy;
                while (i < i2 && iM67507x1 < iM56670k4) {
                    int i7 = iM56670k4;
                    int i8 = iM23753x1 + 1;
                    if (iM67507x1 == this.f6773to.m23752k4(i8) && this.f6769jd == iM56668h4) {
                        iM23753x1 = i8;
                    }
                    if (iM67507x1 < this.f6776yj) {
                        int[] iArr2 = {i};
                        m9821k4(iArrM49684k4, iM56666dy, iM56663c5, iArr2);
                        i = iArr2[0];
                        iM67507x1 = (i / iM56663c5) + iM56666dy;
                        iM56670k4 = i7;
                    } else {
                        if (iM56681to == this.f6764ck) {
                            this.f6768h4.mo23755k4(iM56681to, iM67507x1);
                        }
                        int i9 = i2;
                        long jM23752k4 = (this.f6775x1[iM23753x1] & 4294967295L) + ((long) ((iM67507x1 - this.f6773to.m23752k4(iM23753x1)) * this.f6765du)) + ((long) i4);
                        iM67507x1 += (i4 == 0 && i5 == this.f6767fa) ? C14116yg.m67507x1(this.f6773to.m23752k4(iM23753x1 + 1) - iM67507x1, iM56683x1) : 1;
                        int i10 = iM56681to;
                        int i11 = iM56683x1;
                        long j = (iM67507x1 - iM56666dy) * iM56663c5;
                        C13612u4 c13612u4 = new C13612u4(this.f6770k4.m62861x1(), jM23752k4, r6 * i6);
                        while (true) {
                            C13604kk c13604kkClone = c13612u4.m62799k4().Clone();
                            if (c13604kkClone.f45170kk != 0) {
                                C13620x6 c13620x6 = this.f6772m9;
                                if (c13620x6 == null || c13620x6.m62868k4() == 0) {
                                    throw new InvalidOperationException(C14113y2.m67408k4("TiffImageException: Failed to decode the image strip ", C14057f9.m66591x1(iM23753x1), ". Details: ", c13604kkClone.f45171to));
                                }
                                this.f6776yj = this.f6773to.m23752k4(iM23753x1 + 1);
                                int[] iArr3 = {i};
                                m9821k4(iArrM49684k4, iM56666dy, iM56663c5, iArr3);
                                i = iArr3[0];
                            } else {
                                int[] iArr4 = {i};
                                this.f6768h4.mo23756k4(c13604kkClone.f45169k4, c13604kkClone.f45172x1, iArrM49684k4, iArr4);
                                i = iArr4[0];
                                if (i >= j) {
                                    break;
                                }
                            }
                        }
                        i2 = i9;
                        iM56670k4 = i7;
                        iM56681to = i10;
                        iM56683x1 = i11;
                    }
                }
            }
            this.f6774up = iM56666dy;
            this.f6771kk.mo9843k4(c12014ne.Clone(), iArrM49684k4, c12014ne.m56665du().Clone(), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
        }

        /* JADX INFO: renamed from: k4 */
        private void m9821k4(int[] iArr, int i, int i2, int[] iArr2) {
            int i3 = (this.f6776yj - i) * i2;
            int length = iArr.length;
            int i4 = iArr2[0];
            int iM67507x1 = C14116yg.m67507x1(length - i4, i3 - i4);
            for (int i5 = 0; i5 < iM67507x1; i5++) {
                int i6 = iArr2[0];
                iArr2[0] = i6 + 1;
                iArr[i6] = this.f6766dy;
            }
        }
    }

    public C1897dy(C6740x1 c6740x1, int i, int i2, C13620x6 c13620x6) {
        super(c6740x1, i, i2);
        this.f6762x1 = c13620x6;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10039x1
    /* JADX INFO: renamed from: k4 */
    public void mo9816k4(C6304x1 c6304x1, C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        C13617wl.m62840k4(c12014ne.Clone(), new k4(this, c6304x1, interfaceC6908m9, c12014ne.Clone()));
    }
}

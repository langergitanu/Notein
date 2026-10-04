package com.aspose.slides.internal.p050by;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p236kq.InterfaceC5899kk;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p383rp.AbstractC10035k4;
import com.aspose.slides.internal.p383rp.AbstractC10039x1;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p439ug.C11306h4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p550zi.C13617wl;
import com.aspose.slides.internal.p550zi.C13619x1;
import com.aspose.slides.internal.p550zi.C13620x6;
import com.aspose.slides.internal.p550zi.C13621xk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.by.m9 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1901m9 extends AbstractC10039x1 {

    /* JADX INFO: renamed from: k4 */
    private static int f6813k4;

    /* JADX INFO: renamed from: du */
    private int f6814du;

    /* JADX INFO: renamed from: h4 */
    private int f6815h4;

    /* JADX INFO: renamed from: kk */
    private int f6816kk;

    /* JADX INFO: renamed from: to */
    private int f6817to;

    /* JADX INFO: renamed from: x1 */
    private final C13620x6 f6818x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.by.m9$k4 */
    public static class k4 implements InterfaceC6902dy {

        /* JADX INFO: renamed from: c5 */
        private int f6819c5;

        /* JADX INFO: renamed from: ck */
        private int f6820ck;

        /* JADX INFO: renamed from: du */
        private final C12014ne f6821du;

        /* JADX INFO: renamed from: dy */
        private final C13620x6 f6822dy;

        /* JADX INFO: renamed from: fa */
        private boolean f6823fa;

        /* JADX INFO: renamed from: h4 */
        private final int f6824h4;

        /* JADX INFO: renamed from: jd */
        private InterfaceC5899kk f6825jd;

        /* JADX INFO: renamed from: k4 */
        private final AbstractC1901m9 f6826k4;

        /* JADX INFO: renamed from: kk */
        private final C11306h4 f6827kk;

        /* JADX INFO: renamed from: m9 */
        private final int[][] f6828m9;

        /* JADX INFO: renamed from: to */
        private final int f6829to;

        /* JADX INFO: renamed from: x1 */
        private final InterfaceC6908m9 f6830x1;

        public k4(AbstractC1901m9 abstractC1901m9, C6304x1 c6304x1, InterfaceC6908m9 interfaceC6908m9, C12014ne c12014ne) {
            C12014ne c12014ne2 = new C12014ne();
            this.f6821du = c12014ne2;
            c12014ne.CloneTo(c12014ne2);
            this.f6830x1 = interfaceC6908m9;
            this.f6826k4 = abstractC1901m9;
            long[] jArrM26579ks = abstractC1901m9.m49327kk().m26579ks();
            int iM49324du = abstractC1901m9.m49324du();
            this.f6829to = iM49324du;
            this.f6824h4 = ((abstractC1901m9.m49325k4() * abstractC1901m9.m49327kk().m26556ar()) + 7) / 8;
            this.f6827kk = new C11306h4(c6304x1.m62861x1(), abstractC1901m9.m49327kk(), abstractC1901m9.m49329x1(), jArrM26579ks.length, iM49324du);
            this.f6828m9 = AbstractC10035k4.m49323x1(abstractC1901m9.m49327kk());
            this.f6822dy = abstractC1901m9.f6818x1;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            int iMo23759x1;
            boolean zMo23758to;
            int iM56683x1 = c12014ne.m56683x1() * c12014ne.m56663c5();
            if (AbstractC1901m9.f6813k4 > 0 && iM56683x1 > AbstractC1901m9.f6813k4) {
                throw new OutOfMemoryException();
            }
            int[] iArrM49684k4 = C10052k4.m49684k4(iM56683x1);
            byte[] bArrM62865k4 = C13619x1.m62865k4(this.f6824h4 * this.f6829to);
            int i = 0;
            while (i < iM56683x1) {
                try {
                    int iM56663c5 = (i / c12014ne.m56663c5()) + c12014ne.m56666dy();
                    if (iM56663c5 < this.f6819c5) {
                        InterfaceC5899kk interfaceC5899kk = this.f6825jd;
                        if (interfaceC5899kk != null) {
                            int[] iArr = {i};
                            interfaceC5899kk.mo23757k4(iArrM49684k4, iArr);
                            i = iArr[0];
                            if (i == iM56683x1) {
                            }
                        }
                        int iM62869x1 = this.f6822dy.m62869x1();
                        int iM67507x1 = C14116yg.m67507x1(((this.f6827kk.m54305kk(iM56663c5) - c12014ne.m56666dy()) * c12014ne.m56663c5()) - i, iM56683x1 - i);
                        int i2 = 0;
                        while (i2 < iM67507x1) {
                            iArrM49684k4[i] = iM62869x1;
                            i2++;
                            i++;
                        }
                        this.f6823fa = true;
                    } else {
                        InterfaceC5899kk interfaceC5899kk2 = this.f6825jd;
                        if (interfaceC5899kk2 != null) {
                            iMo23759x1 = interfaceC5899kk2.mo23759x1();
                            zMo23758to = this.f6825jd.mo23758to();
                        } else {
                            iMo23759x1 = 0;
                            zMo23758to = false;
                        }
                        if (this.f6823fa || (iMo23759x1 == this.f6820ck && !zMo23758to)) {
                            int iM54307to = this.f6827kk.m54307to(iM56663c5);
                            this.f6826k4.mo9824k4(this.f6827kk);
                            AbstractC1901m9 abstractC1901m9 = this.f6826k4;
                            this.f6825jd = abstractC1901m9.m49326k4(abstractC1901m9.m49327kk(), this.f6828m9, this.f6821du.Clone());
                            this.f6820ck = C14116yg.m67507x1(this.f6826k4.m49329x1() - iM54307to, this.f6829to) * this.f6824h4;
                            this.f6825jd.mo23754k4(iM54307to);
                            this.f6823fa = false;
                        }
                        int[] iArr2 = {i};
                        this.f6825jd.mo23757k4(iArrM49684k4, iArr2);
                        i = iArr2[0];
                        if (i < iM56683x1) {
                            C13621xk c13621xkClone = this.f6826k4.mo9822k4(bArrM62865k4, C14116yg.m67507x1(this.f6825jd.mo23759x1() + bArrM62865k4.length, this.f6820ck) - this.f6825jd.mo23759x1()).Clone();
                            int i3 = c13621xkClone.f45230x1;
                            iArr2[0] = i;
                            this.f6825jd.mo23756k4(bArrM62865k4, i3, iArrM49684k4, iArr2);
                            i = iArr2[0];
                            if (c13621xkClone.f45228k4) {
                                continue;
                            } else {
                                C13620x6 c13620x6 = this.f6822dy;
                                if (c13620x6 == null || c13620x6.m62868k4() == 0) {
                                    throw new InvalidOperationException(C14113y2.m67408k4("TiffImageException: The strip ", C14057f9.m66591x1(this.f6827kk.m54306to()), " has corrupt data and cannot be decoded. Error: ", c13621xkClone.f45229kk));
                                }
                                this.f6819c5 = this.f6827kk.m54305kk(iM56663c5);
                                this.f6823fa = true;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (OutOfMemoryError e) {
                    throw new OutOfMemoryException("FrameworkException: Fatal error", e);
                }
            }
            this.f6830x1.mo9843k4(c12014ne.Clone(), iArrM49684k4, c12014ne.m56665du().Clone(), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
        }
    }

    public AbstractC1901m9(C6740x1 c6740x1, int i, int i2, C13620x6 c13620x6) {
        super(c6740x1, i, i2);
        this.f6818x1 = c13620x6;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C13621xk mo9822k4(byte[] bArr, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo9824k4(C11306h4 c11306h4);

    /* JADX INFO: renamed from: kk */
    public void mo9825kk(int i) {
        this.f6817to = i;
    }

    /* JADX INFO: renamed from: to */
    public void mo9826to(int i) {
        this.f6816kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo9827x1(int i) {
        this.f6814du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo9823k4(int i) {
        this.f6815h4 = i;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10039x1
    /* JADX INFO: renamed from: k4 */
    public void mo9816k4(C6304x1 c6304x1, C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        C13617wl.m62840k4(c12014ne.Clone(), new k4(this, c6304x1, interfaceC6908m9, c12014ne.Clone()));
    }
}

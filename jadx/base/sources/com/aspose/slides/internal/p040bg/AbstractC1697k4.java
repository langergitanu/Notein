package com.aspose.slides.internal.p040bg;

import com.aspose.slides.internal.p073d3.C3008c5;
import com.aspose.slides.internal.p102e8.AbstractC3589to;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p102e8.C3590x1;
import com.aspose.slides.internal.p123f5.C3859m9;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p218k5.AbstractC5612k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p377r9.C9975bv;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14112xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.bg.k4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1697k4 extends AbstractC3589to {

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5612k4 f6409k4;

    public AbstractC1697k4(AbstractC5612k4 abstractC5612k4) {
        this.f6409k4 = abstractC5612k4;
    }

    /* JADX INFO: renamed from: k4 */
    private C12014ne m9140k4(C12014ne c12014ne, C3585h4 c3585h4) {
        C12014ne c12014neClone = c12014ne.Clone();
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            if (f >= 1.0f && f2 >= 1.0f) {
                return c12014neClone;
            }
            C12007ix c12007ixClone = this.f6409k4.mo12675k4(c12014neClone.Clone(), c3585h4).Clone();
            float fM56550c5 = c12007ixClone.m56550c5();
            float fM56575x1 = c12007ixClone.m56575x1();
            if (fM56550c5 < 1.0f) {
                c12014neClone.m56684x1(c12014neClone.m56663c5() + 1);
            }
            if (fM56575x1 < 1.0f) {
                c12014neClone.m56671k4(c12014neClone.m56683x1() + 1);
            }
            f2 = fM56575x1;
            f = fM56550c5;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public abstract void mo9143h4(C9723vw c9723vw, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p102e8.AbstractC3589to
    /* JADX INFO: renamed from: kk */
    public void mo7750kk(C9723vw c9723vw, C3585h4 c3585h4) {
        this.f6409k4.mo12683x1(c9723vw, c3585h4);
    }

    @Override // com.aspose.slides.internal.p102e8.AbstractC3589to
    /* JADX INFO: renamed from: to */
    public final void mo9134to(C9723vw c9723vw, C3585h4 c3585h4) {
        this.f6409k4.mo12677k4(c9723vw, this, c3585h4);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9145x1(long j, C12009k4 c12009k4, C12014ne c12014ne, C12014ne c12014ne2, C12003du c12003du, C11913yj c11913yj, C3585h4 c3585h4) {
        C3976c5 c3976c5;
        int i;
        int i2;
        C12018u4 c12018u4;
        long jM56506h4;
        Class<C11999ar> cls;
        boolean z;
        int i3;
        AbstractC1697k4 abstractC1697k4 = this;
        boolean zM49088x1 = C9975bv.m49088x1(j);
        AbstractC12024x1 abstractC12024x1M14479c5 = c3585h4.m14479c5();
        if (abstractC12024x1M14479c5 == null) {
            abstractC12024x1M14479c5 = new C11999ar(c3585h4.m14539ne().Clone());
        }
        AbstractC12024x1 abstractC12024x1 = abstractC12024x1M14479c5;
        Class<C11999ar> cls2 = C11999ar.class;
        boolean zM27469x1 = C7019kk.m27469x1(abstractC12024x1, cls2);
        C12018u4 c12018u42 = new C12018u4(c12014ne.Clone());
        c12018u42.m56771x1(c11913yj);
        C12014ne c12014neClone = C12014ne.m56661x1(C12007ix.m56544k4(abstractC1697k4.f6409k4.mo12676k4(c12018u42, c3585h4)).Clone()).Clone();
        if (C12014ne.m56660to(c12014neClone, C12014ne.f40546k4)) {
            c12014neClone.CloneTo(c12014ne);
        }
        if (j == 170) {
            return;
        }
        if (j == 240) {
            if (C7019kk.m27469x1(abstractC12024x1, C12012lr.class)) {
                C11913yj c11913yjMo17577u4 = ((AbstractC12008jd) c3585h4.m14502k4()).mo17577u4();
                ((C12012lr) abstractC12024x1).m56623kk(new C11913yj(c3585h4.m14579xw().m17051k4().m56699x1() * (1.0f / c11913yjMo17577u4.m55776k4()[0]), c11913yjMo17577u4.m55776k4()[1], c11913yjMo17577u4.m55776k4()[2], c3585h4.m14579xw().m17051k4().m56697kk() * (1.0f / c11913yjMo17577u4.m55776k4()[3]), c11913yjMo17577u4.m55776k4()[4], c11913yjMo17577u4.m55776k4()[5]));
            }
            abstractC1697k4.f6409k4.mo12681k4(abstractC12024x1, c12014ne2.Clone(), c3585h4);
            return;
        }
        if (j == 255) {
            abstractC1697k4.f6409k4.mo12681k4(new C11999ar(C12003du.m56385i5().Clone()), c12014ne2.Clone(), c3585h4);
            return;
        }
        if (j == 0) {
            abstractC1697k4.f6409k4.mo12681k4(new C11999ar(C12003du.m56460uz().Clone()), c12014ne2.Clone(), c3585h4);
            return;
        }
        if (j == 204) {
            abstractC1697k4 = this;
        } else if (c3585h4.m14494g8().mo15757m9() > 1) {
            if (c3585h4.m14494g8() == null || c12009k4 == null) {
                return;
            }
            C12018u4 c12018u4Mo12682x1 = abstractC1697k4.f6409k4.mo12682x1(c3585h4);
            C12014ne c12014neClone2 = C12014ne.m56661x1(abstractC1697k4.f6409k4.mo12675k4(c12014ne2.Clone(), c3585h4).Clone()).Clone();
            if (c12014neClone2.m56663c5() == 0 || c12014neClone2.m56683x1() == 0) {
                return;
            }
            if (c12014neClone2.m56669jd() < 0) {
                c12014neClone2.m56676kk(0);
            }
            if (c12014neClone2.m56664ck() < 0) {
                c12014neClone2.m56682to(0);
            }
            if (c3585h4.m14494g8().mo15760yj() >= c12014neClone2.m56663c5() + c12014neClone2.m56669jd()) {
                if (c3585h4.m14494g8().mo15757m9() < c12014neClone2.m56683x1() + c12014neClone2.m56664ck()) {
                    return;
                }
                C12009k4 c12009k42 = new C12009k4(c12014neClone2.m56663c5(), c12014neClone2.m56683x1(), 2498570);
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                try {
                    c3976c5 = new C3976c5();
                    try {
                        c3976c5.m15673x1(3);
                        abstractC12008jdM56582k4.mo17511k4((AbstractC12002ck) c12009k4, new C12014ne(0, 0, c12014neClone2.m56663c5(), c12014neClone2.m56683x1()), 0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2, c3976c5);
                        abstractC12008jdM56582k4.dispose();
                        int[] iArr = new int[0];
                        if (!zM49088x1 || zM27469x1) {
                            i = 1;
                            i2 = 2498570;
                        } else {
                            i2 = 2498570;
                            C12009k4 c12009k43 = new C12009k4(c12009k42.mo15760yj(), c12009k42.mo15757m9(), 2498570);
                            abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k43);
                            try {
                                abstractC12008jdM56582k4.mo17594x1(abstractC12024x1, new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()));
                                abstractC12008jdM56582k4.dispose();
                                i = 1;
                                C3983k4 c3983k4M56597k4 = c12009k43.m56597k4(new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), 1, 2498570);
                                int iM15716k4 = c3983k4M56597k4.m15716k4() * c3983k4M56597k4.m15722x1();
                                int[] iArr2 = new int[iM15716k4];
                                C3914k4.m15619k4(c3983k4M56597k4.m15721to(), iArr2, 0, iM15716k4);
                                c12009k43.m56605k4(c3983k4M56597k4);
                                iArr = iArr2;
                            } finally {
                            }
                        }
                        C3983k4 c3983k4M56597k42 = c12009k42.m56597k4(new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), i, i2);
                        C14112xw c14112xwM15721to = c3983k4M56597k42.m15721to();
                        int iMo15757m9 = c12009k42.mo15757m9() * c12009k42.mo15760yj();
                        int[] iArr3 = new int[iMo15757m9];
                        C3914k4.m15619k4(c14112xwM15721to, iArr3, 0, iMo15757m9);
                        C3983k4 c3983k4M56597k43 = c3585h4.m14494g8().m56597k4(new C12014ne(0, 0, c3585h4.m14494g8().mo15760yj(), c3585h4.m14494g8().mo15757m9()), 3, i2);
                        C14112xw c14112xwM15721to2 = c3983k4M56597k43.m15721to();
                        int iMo15757m92 = c3585h4.m14494g8().mo15757m9() * c3585h4.m14494g8().mo15760yj();
                        int[] iArr4 = new int[iMo15757m92];
                        C3914k4.m15619k4(c14112xwM15721to2, iArr4, 0, iMo15757m92);
                        long jM56506h42 = ((long) c3585h4.m14539ne().m56506h4()) & 4294967295L;
                        C11913yj c11913yjM58557k4 = C12556ck.m58557k4(c12018u4Mo12682x1, (AbstractC12008jd) c3585h4.m14502k4());
                        c12018u4Mo12682x1.m56771x1(c11913yjM58557k4);
                        int[] iArr5 = iArr;
                        int i4 = 0;
                        while (i4 < c3983k4M56597k42.m15716k4()) {
                            C11913yj c11913yj2 = c11913yjM58557k4;
                            int i5 = 0;
                            while (i5 < c3983k4M56597k42.m15722x1()) {
                                int i6 = i5;
                                if (c12018u4Mo12682x1.m56754k4(i5 * c11913yj2.m55776k4()[0], i4 * c11913yj2.m55776k4()[3])) {
                                    int iM56669jd = c12014neClone2.m56669jd() + (c3983k4M56597k43.m15722x1() * (c12014neClone2.m56664ck() + i4)) + i6;
                                    c12018u4 = c12018u4Mo12682x1;
                                    long j2 = ((long) iArr3[(c3983k4M56597k42.m15722x1() * i4) + i6]) & 4294967295L;
                                    if (zM49088x1) {
                                        jM56506h4 = ((long) (zM27469x1 ? ((C11999ar) C7019kk.m27452k4((Object) abstractC12024x1, (Class) cls2)).m56305h4().m56506h4() : iArr5[(c3983k4M56597k42.m15722x1() * i4) + i6])) & 4294967295L;
                                    } else {
                                        jM56506h4 = 4278190080L;
                                    }
                                    long j3 = jM56506h4;
                                    long jM58328k4 = iArr4[iM56669jd] & 4294967295L;
                                    cls = cls2;
                                    z = zM27469x1;
                                    byte b = (byte) (((r0 & 4294967295L) >> 24) & 255);
                                    int i7 = b & 255;
                                    i3 = i4;
                                    if (i7 > 0 && i7 < 255) {
                                        jM58328k4 = C12530dy.m58328k4(jM58328k4, jM56506h42, b);
                                    }
                                    iArr4[iM56669jd] = (int) C3590x1.m14685k4(j2, jM58328k4, j3, j);
                                } else {
                                    c12018u4 = c12018u4Mo12682x1;
                                    i3 = i4;
                                    cls = cls2;
                                    z = zM27469x1;
                                }
                                i5 = i6 + 1;
                                i4 = i3;
                                c12018u4Mo12682x1 = c12018u4;
                                cls2 = cls;
                                zM27469x1 = z;
                            }
                            i4++;
                            c11913yjM58557k4 = c11913yj2;
                        }
                        C3914k4.m15622k4(iArr4, 0, c14112xwM15721to2, iMo15757m92);
                        c3585h4.m14494g8().m56605k4(c3983k4M56597k43);
                        c12009k42.m56605k4(c3983k4M56597k42);
                        return;
                    } finally {
                        c3976c5.dispose();
                    }
                } finally {
                }
            }
            return;
        }
        C11893c5 c11893c5Mo12674k4 = abstractC1697k4.f6409k4.mo12674k4(c3585h4);
        C3859m9.m15552k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9())).CloneTo(c12014ne);
        c3976c5 = new C3976c5();
        try {
            if (c11913yj.m55776k4()[0] == -1.0f) {
                if (c11913yj.m55776k4()[3] == -1.0f) {
                    c12009k4.m56342to(2);
                } else {
                    c12009k4.m56342to(4);
                }
            } else if (c11913yj.m55776k4()[3] == -1.0f) {
                c12009k4.m56342to(6);
            } else {
                c3976c5.m15673x1(3);
            }
            abstractC1697k4.f6409k4.mo12680k4(c12009k4, c12014ne2.Clone(), c12014ne.Clone(), c3976c5, c3585h4);
            c3976c5.dispose();
            abstractC1697k4.f6409k4.mo12679k4(c11893c5Mo12674k4, c3585h4);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m9141k4(C12025x6 c12025x6, C11913yj c11913yj) {
        float[] fArrM55776k4 = c11913yj.m55776k4();
        return new C12025x6(OooO00o.OooO00o(c12025x6, fArrM55776k4[1], c12025x6.m56897x1() * fArrM55776k4[0]) + fArrM55776k4[4], OooO00o.OooO00o(c12025x6, fArrM55776k4[3], c12025x6.m56897x1() * fArrM55776k4[2]) + fArrM55776k4[5]);
    }

    @Override // com.aspose.slides.internal.p102e8.AbstractC3589to
    /* JADX INFO: renamed from: x1 */
    public void mo7752x1(C9723vw c9723vw, C3585h4 c3585h4) {
        this.f6409k4.mo12678k4(c9723vw, c3585h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9144k4(long j, C12009k4 c12009k4, C12014ne c12014ne, C12014ne c12014ne2, C12003du c12003du, C11913yj c11913yj, C3585h4 c3585h4) throws Throwable {
        C3976c5 c3976c5;
        boolean zM49088x1 = C9975bv.m49088x1(j);
        AbstractC12024x1 abstractC12024x1M14479c5 = c3585h4.m14479c5();
        if (abstractC12024x1M14479c5 == null) {
            abstractC12024x1M14479c5 = new C11999ar(c3585h4.m14539ne().Clone());
        }
        AbstractC12024x1 abstractC12024x1 = abstractC12024x1M14479c5;
        boolean zM27469x1 = C7019kk.m27469x1(abstractC12024x1, C11999ar.class);
        C12018u4 c12018u4 = new C12018u4(c12014ne.Clone());
        c12018u4.m56771x1(c11913yj);
        C12014ne c12014neClone = C12014ne.m56661x1(C12007ix.m56544k4(this.f6409k4.mo12676k4(c12018u4, c3585h4)).Clone()).Clone();
        if (C12014ne.m56660to(c12014neClone, C12014ne.f40546k4)) {
            c12014neClone.CloneTo(c12014ne);
        }
        if (j == 170) {
            return;
        }
        if (j == 240) {
            if (C7019kk.m27469x1(abstractC12024x1, C12012lr.class) && C7019kk.m27469x1(this.f6409k4, C3008c5.class)) {
                C11913yj c11913yjMo17577u4 = ((AbstractC12008jd) c3585h4.m14502k4()).mo17577u4();
                ((C12012lr) abstractC12024x1).m56623kk(new C11913yj(c3585h4.m14579xw().m17051k4().m56699x1() * (1.0f / c11913yjMo17577u4.m55776k4()[0]), c11913yjMo17577u4.m55776k4()[1], c11913yjMo17577u4.m55776k4()[2], c3585h4.m14579xw().m17051k4().m56697kk() * (1.0f / c11913yjMo17577u4.m55776k4()[3]), c11913yjMo17577u4.m55776k4()[4], c11913yjMo17577u4.m55776k4()[5]));
            }
            this.f6409k4.mo12681k4(abstractC12024x1, m9140k4(c12014ne2.Clone(), c3585h4), c3585h4);
            return;
        }
        if (j == 255) {
            this.f6409k4.mo12681k4(new C11999ar(C12003du.m56385i5().Clone()), m9140k4(c12014ne2.Clone(), c3585h4), c3585h4);
            return;
        }
        if (j == 0) {
            this.f6409k4.mo12681k4(new C11999ar(C12003du.m56460uz().Clone()), m9140k4(c12014ne2.Clone(), c3585h4), c3585h4);
            return;
        }
        if (j == 204 || c3585h4.m14494g8().mo15757m9() <= 1) {
            C11893c5 c11893c5Mo12674k4 = this.f6409k4.mo12674k4(c3585h4);
            C3859m9.m15552k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9())).CloneTo(c12014ne);
            C3976c5 c3976c52 = new C3976c5();
            try {
                if (c11913yj.m55776k4()[0] == -1.0f) {
                    if (c11913yj.m55776k4()[3] == -1.0f) {
                        c12009k4.m56342to(2);
                    } else {
                        c12009k4.m56342to(4);
                    }
                } else if (c11913yj.m55776k4()[3] == -1.0f) {
                    c12009k4.m56342to(6);
                } else {
                    c3976c52.m15673x1(3);
                }
                c3976c5 = c3976c52;
            } catch (Throwable th) {
                th = th;
                c3976c5 = c3976c52;
            }
            try {
                this.f6409k4.mo12680k4(c12009k4, c12014ne2.Clone(), c12014ne.Clone(), c3976c5, c3585h4);
                c3976c5.dispose();
                this.f6409k4.mo12679k4(c11893c5Mo12674k4, c3585h4);
                return;
            } catch (Throwable th2) {
                th = th2;
                c3976c5.dispose();
                throw th;
            }
        }
        if (c3585h4.m14494g8() == null || c12009k4 == null) {
            return;
        }
        this.f6409k4.mo12682x1(c3585h4);
        C12007ix c12007ixClone = this.f6409k4.mo12675k4(c12014ne2.Clone(), c3585h4).Clone();
        if (c12007ixClone.m56575x1() > 0.0f && c12007ixClone.m56575x1() < 1.0f) {
            c12007ixClone.m56560k4(1.0f);
        }
        if (c12007ixClone.m56550c5() > 0.0f && c12007ixClone.m56550c5() < 1.0f) {
            c12007ixClone.m56576x1(1.0f);
        }
        C12014ne c12014neM56661x1 = C12014ne.m56661x1(c12007ixClone.Clone());
        if (c12014neM56661x1.m56663c5() == 0 || c12014neM56661x1.m56683x1() == 0) {
            return;
        }
        if (c12014neM56661x1.m56669jd() < 0) {
            c12014neM56661x1.m56676kk(0);
        }
        if (c12014neM56661x1.m56664ck() < 0) {
            c12014neM56661x1.m56682to(0);
        }
        if (c3585h4.m14494g8().mo15760yj() >= c12014neM56661x1.m56663c5() + c12014neM56661x1.m56669jd()) {
            if (c3585h4.m14494g8().mo15757m9() < c12014neM56661x1.m56683x1() + c12014neM56661x1.m56664ck()) {
                return;
            }
            C12009k4 c12009k42 = new C12009k4(c12014neM56661x1.m56663c5(), c12014neM56661x1.m56683x1(), 2498570);
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
            try {
                C3976c5 c3976c53 = new C3976c5();
                try {
                    c3976c53.m15673x1(3);
                    abstractC12008jdM56582k4.mo17511k4((AbstractC12002ck) c12009k4, new C12014ne(0, 0, c12014neM56661x1.m56663c5(), c12014neM56661x1.m56683x1()), 0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2, c3976c53);
                    abstractC12008jdM56582k4.dispose();
                    if (zM49088x1 && !zM27469x1) {
                        C12009k4 c12009k43 = new C12009k4(c12009k42.mo15760yj(), c12009k42.mo15757m9(), 2498570);
                        abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k43);
                        try {
                            abstractC12008jdM56582k4.mo17594x1(abstractC12024x1, new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()));
                            abstractC12008jdM56582k4.dispose();
                            C3983k4 c3983k4M56597k4 = c12009k43.m56597k4(new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), 1, 2498570);
                            int iM15716k4 = c3983k4M56597k4.m15716k4() * c3983k4M56597k4.m15722x1();
                            C3914k4.m15619k4(c3983k4M56597k4.m15721to(), new int[iM15716k4], 0, iM15716k4);
                            c12009k43.m56605k4(c3983k4M56597k4);
                        } finally {
                        }
                    }
                    abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c3585h4.m14494g8());
                    try {
                        abstractC12008jdM56582k4.mo17512k4(c12009k42, c12014neM56661x1, new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), 2);
                        abstractC12008jdM56582k4.dispose();
                    } finally {
                    }
                } finally {
                    c3976c53.dispose();
                }
            } finally {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static float[] m9142k4(float f, float f2, float[] fArr) {
        return new float[]{(fArr[1] * f2) + (fArr[0] * f) + fArr[4], (fArr[3] * f2) + (fArr[2] * f) + fArr[5]};
    }
}

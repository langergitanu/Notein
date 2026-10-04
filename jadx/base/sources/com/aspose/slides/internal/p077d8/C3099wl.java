package com.aspose.slides.internal.p077d8;

import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3979dy;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p146g9.AbstractC4229kk;
import com.aspose.slides.internal.p146g9.C4230to;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p500xi.C12531h4;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.wl */
/* JADX INFO: loaded from: classes3.dex */
public class C3099wl {

    /* JADX INFO: renamed from: k4 */
    public static final C12003du f9216k4 = C12003du.m56398k4(255, 255, 255, 255).Clone();

    /* JADX INFO: renamed from: x1 */
    private static final byte[] f9217x1 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: c5 */
    public static boolean m13168c5(byte[] bArr) {
        if (!m13171dy(bArr)) {
            return false;
        }
        AbstractC12002ck abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(new C3152yj(bArr, false));
        return abstractC12002ckM56312k4.m56331k4(new C3979dy(abstractC12002ckM56312k4.m56330h4()[0].Clone())) > 1;
    }

    /* JADX INFO: renamed from: ck */
    public static AbstractC12002ck m13169ck(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes");
        }
        if (m13195m9(bArr)) {
            return m13180k4(bArr, null, new C12015qq(), new C12015qq(1.0f, 1.0f), 4.0f, true);
        }
        try {
            return AbstractC12002ck.m56312k4(new C3152yj(bArr));
        } catch (Exception e) {
            C3085sv.m13082k4(e);
            return m13181k4(bArr, new C12015qq());
        }
    }

    /* JADX INFO: renamed from: du */
    public static boolean m13170du(byte[] bArr) {
        return bArr.length >= 4 && (bArr[0] & 255) == 255 && (bArr[1] & 255) == 216;
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m13171dy(byte[] bArr) {
        if (bArr.length >= 6 && (bArr[0] & 255) == 71 && (bArr[1] & 255) == 73 && (bArr[2] & 255) == 70 && (bArr[3] & 255) == 56) {
            byte b = bArr[4];
            if (((b & 255) == 55 || (b & 255) == 57) && (bArr[5] & 255) == 97) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m13172h4(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        byte b = bArr[0];
        return ((b & 255) == 73 && (bArr[1] & 255) == 73) || ((b & 255) == 77 && (bArr[1] & 255) == 77);
    }

    /* JADX INFO: renamed from: jd */
    public static C12014ne m13173jd(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(c3152yj);
            try {
                C12014ne c12014ne = new C12014ne(0, 0, abstractC12536x1M58363k4.mo13502h4(), abstractC12536x1M58363k4.mo13504m9());
                abstractC12536x1M58363k4.dispose();
                return c12014ne;
            } catch (Throwable th) {
                if (abstractC12536x1M58363k4 != null) {
                    abstractC12536x1M58363k4.dispose();
                }
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13174k4(float f, float f2) {
        float f3 = (f2 / 540.0f) * 72.0f;
        return C7019kk.m27462to(Float.valueOf(((0.75f * f3) / ((f / 720.0f) * 72.0f)) * f3), 13);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m13193kk(AbstractC12002ck abstractC12002ck) {
        return abstractC12002ck.mo15753jd() == 8207;
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m13195m9(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        byte b = bArr[0];
        if ((b & 255) == 215 && (bArr[1] & 255) == 205 && (bArr[2] & 255) == 198 && (bArr[3] & 255) == 154) {
            return true;
        }
        if (b == 1 && bArr[1] == 0 && bArr[2] == 9 && bArr[3] == 0) {
            return true;
        }
        return bArr.length >= 48 && bArr[40] == 32 && bArr[41] == 69 && bArr[42] == 77 && bArr[43] == 70 && bArr[44] == 0 && bArr[45] == 0 && bArr[46] == 1 && bArr[47] == 0;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m13196to(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        byte b = bArr2[0];
        byte[] bArr3 = f9217x1;
        return b == bArr3[0] && bArr2[1] == bArr3[1] && bArr2[2] == bArr3[2] && bArr2[3] == bArr3[3] && bArr2[4] == bArr3[4] && bArr2[5] == bArr3[5] && bArr2[6] == bArr3[6] && bArr2[7] == bArr3[7];
    }

    /* JADX INFO: renamed from: x1 */
    public static C12014ne m13197x1(C12009k4 c12009k4) {
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, 2498570);
        int iMo15760yj = c12009k4.mo15760yj();
        int iMo15760yj2 = c12009k4.mo15760yj();
        int iMo15757m9 = c12009k4.mo15757m9();
        try {
            int iM15715du = c3983k4M56597k4.m15715du() * c3983k4M56597k4.m15716k4();
            byte[] bArr = new byte[iM15715du];
            C3914k4.m15618k4(c3983k4M56597k4.m15721to(), bArr, 0, iM15715du);
            int i = 0;
            int i2 = iMo15757m9;
            int i3 = 0;
            for (int i4 = 0; i4 < iM15715du; i4 += 4) {
                if ((bArr[i4 + 3] & 255) != 0) {
                    int i5 = (i4 / 4) % iMo15760yj;
                    int i6 = (i4 / 4) / iMo15760yj;
                    if (i5 < iMo15760yj2) {
                        iMo15760yj2 = i5;
                    }
                    if (i5 > i3) {
                        i3 = i5;
                    }
                    if (i6 < i2) {
                        i2 = i6;
                    }
                    if (i6 > i) {
                        i = i6;
                    }
                }
            }
            return (i3 == 0 && i == 0) ? C12014ne.f40546k4 : new C12014ne(iMo15760yj2, i2, (i3 - iMo15760yj2) + 1, (i - i2) + 1);
        } finally {
            c12009k4.m56605k4(c3983k4M56597k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m13175k4(int i) {
        return 914400 / i;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m13194kk(byte[] bArr) {
        return bArr.length >= 48 && (bArr[40] & 255) == 32 && (bArr[41] & 255) == 69 && (bArr[42] & 255) == 77 && (bArr[43] & 255) == 70 && (bArr[44] & 255) == 0 && (bArr[45] & 255) == 0 && (bArr[46] & 255) == 1 && (bArr[47] & 255) == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m13198x1(AbstractC12002ck abstractC12002ck) {
        C14047bz c14047bz = new C14047bz();
        try {
            abstractC12002ck.mo15750ck().m15685k4().CloneTo(c14047bz);
            return !C14047bz.m66537x1(c14047bz, C3977ck.m15680h4().m15685k4()) && abstractC12002ck.m56331k4(new C3979dy(abstractC12002ck.m56330h4()[0].Clone())) > 1;
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13176k4(C3989up c3989up, C12015qq c12015qq) {
        C3152yj c3152yj = new C3152yj();
        try {
            c3989up.m56333k4(c3152yj, c3989up.mo15750ck());
            return m13181k4(c3152yj.toArray(), c12015qq.Clone());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m13199x1(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        byte b = bArr[0];
        if ((b & 255) == 215 && (bArr[1] & 255) == 205 && (bArr[2] & 255) == 198 && (bArr[3] & 255) == 154) {
            return true;
        }
        return (b & 255) == 1 && (bArr[1] & 255) == 0 && (bArr[2] & 255) == 9 && (bArr[3] & 255) == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13177k4(C12009k4 c12009k4) throws Throwable {
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, 2498570);
        int iMo15760yj = c12009k4.mo15760yj();
        int iMo15760yj2 = c12009k4.mo15760yj();
        int iMo15757m9 = c12009k4.mo15757m9();
        try {
            int iM15715du = c3983k4M56597k4.m15715du() * c3983k4M56597k4.m15716k4();
            byte[] bArr = new byte[iM15715du];
            System.arraycopy((byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4(), 0, bArr, 0, iM15715du);
            int i = iMo15760yj2;
            int i2 = iMo15757m9;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < iM15715du; i5 += 4) {
                if ((bArr[i5 + 3] & 255) != 0) {
                    int i6 = (i5 / 4) % iMo15760yj;
                    int i7 = (i5 / 4) / iMo15760yj;
                    if (i6 < i) {
                        i = i6;
                    }
                    if (i6 > i3) {
                        i3 = i6;
                    }
                    if (i7 < i2) {
                        i2 = i7;
                    }
                    if (i7 > i4) {
                        i4 = i7;
                    }
                }
            }
            if (i3 == 0 && i4 == 0) {
                return null;
            }
            int i8 = i3 - i;
            int i9 = i4 - i2;
            C12009k4 c12009k42 = new C12009k4(i8 + 1, i9 + 1, 2498570);
            c12009k42.m56606k4(C12003du.m56385i5().Clone());
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
            try {
                abstractC12008jdM56582k4.mo17507k4(c12009k4, new C12007ix(0.0f, 0.0f, c12009k42.mo15760yj(), c12009k42.mo15757m9()).Clone(), new C12007ix(i, i2, i8 + 1.0f, i9 + 1.0f).Clone(), 2);
                abstractC12008jdM56582k4.dispose();
                return c12009k42;
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } finally {
            c12009k4.m56605k4(c3983k4M56597k4);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m13200x1(byte[] bArr, String[] strArr) {
        return C12531h4.m58345x1(new C3152yj(bArr), strArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13178k4(byte[] bArr, int i, int i2) {
        AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(new C3152yj(bArr));
        boolean z = i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE;
        try {
            AbstractC4229kk abstractC4229kkM17035k4 = AbstractC4229kk.m17035k4(abstractC12536x1M58363k4, z ? C4230to.m17042x1() : new C4230to(new C12023wl(i, i2)));
            C12009k4 c12009k4Mo17032to = z ? abstractC4229kkM17035k4.mo17032to() : abstractC4229kkM17035k4.mo17028k4(i, i2);
            if (abstractC12536x1M58363k4 != null) {
                abstractC12536x1M58363k4.dispose();
            }
            return c12009k4Mo17032to;
        } catch (Throwable th) {
            if (abstractC12536x1M58363k4 != null) {
                abstractC12536x1M58363k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13179k4(byte[] bArr, AbstractC12008jd abstractC12008jd, C12015qq c12015qq, C12015qq c12015qq2) {
        return m13180k4(bArr, abstractC12008jd, c12015qq.Clone(), c12015qq2.Clone(), 4.0f, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13180k4(byte[] bArr, AbstractC12008jd abstractC12008jd, C12015qq c12015qq, C12015qq c12015qq2, float f, boolean z) {
        C12009k4 c12009k4Mo17028k4;
        int iMo13504m9;
        AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(new C3152yj(bArr));
        try {
            if (c12015qq.m56696k4()) {
                if (c12015qq2.m56699x1() == 1.0f && c12015qq2.m56697kk() == 1.0f) {
                    c12015qq.m56695k4(Math.abs(abstractC12536x1M58363k4.mo13623kk().m56663c5()));
                    c12015qq.m56700x1(Math.abs(abstractC12536x1M58363k4.mo13623kk().m56683x1()));
                    if (c12015qq.m56697kk() == 0.0f || c12015qq.m56699x1() == 0.0f) {
                        c12015qq.m56695k4(abstractC12536x1M58363k4.mo13502h4() * f);
                        c12015qq.m56700x1(abstractC12536x1M58363k4.mo13504m9() * f);
                    }
                    if (C14116yg.m67480k4(c12015qq.m56699x1() - abstractC12536x1M58363k4.mo13502h4()) < 100.0f && C14116yg.m67480k4(c12015qq.m56697kk() - abstractC12536x1M58363k4.mo13504m9()) < 100.0f) {
                        c12015qq.m56695k4(abstractC12536x1M58363k4.mo13502h4() * f);
                        iMo13504m9 = abstractC12536x1M58363k4.mo13504m9();
                    }
                } else {
                    c12015qq.m56695k4(abstractC12536x1M58363k4.mo13502h4() * f);
                    iMo13504m9 = abstractC12536x1M58363k4.mo13504m9();
                }
                c12015qq.m56700x1(iMo13504m9 * f);
            }
            float f2 = z ? 1000.0f : 9000.0f;
            while (true) {
                if (c12015qq.m56699x1() <= f2 && c12015qq.m56697kk() <= f2) {
                    break;
                }
                c12015qq.m56695k4(c12015qq.m56699x1() * 0.95f);
                c12015qq.m56700x1(c12015qq.m56697kk() * 0.95f);
            }
            C4230to c4230to = abstractC12536x1M58363k4.mo13625x1() == 1 ? new C4230to(C12003du.f40505to.Clone(), new C12023wl(C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13))) : new C4230to(C12003du.f40505to.Clone());
            if (abstractC12008jd != null) {
                c4230to.m17053k4(new C14093tq<>(Integer.valueOf(abstractC12008jd.mo17477dy())));
                c4230to.m17060x1(new C14093tq<>(Integer.valueOf(abstractC12008jd.mo17473c5())));
                c4230to.m17055kk(new C14093tq<>(Integer.valueOf(abstractC12008jd.mo17479fa())));
                c4230to.m17059to(new C14093tq<>(Integer.valueOf(abstractC12008jd.mo17566ks())));
                c4230to.m17046du(new C14093tq<>(Integer.valueOf(abstractC12008jd.mo17603x6())));
                c4230to.m17049h4(new C14093tq<>(Integer.valueOf(abstractC12008jd.mo17482ix())));
                c4230to.m17057m9(new C14093tq<>(Integer.valueOf(abstractC12008jd.mo17570ne())));
            } else {
                c4230to.m17053k4(new C14093tq<>(0));
                c4230to.m17060x1(new C14093tq<>(0));
                c4230to.m17055kk(new C14093tq<>(3));
                c4230to.m17059to(new C14093tq<>(0));
                c4230to.m17046du(new C14093tq<>(3));
                c4230to.m17049h4(new C14093tq<>(3));
                c4230to.m17057m9(new C14093tq<>(4));
            }
            c4230to.m17052k4(c12015qq2.Clone());
            if (abstractC12536x1M58363k4.mo13625x1() == 2) {
                c12009k4Mo17028k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13));
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4Mo17028k4);
                try {
                    abstractC12008jdM56582k4.mo17495k4(0);
                    abstractC12008jdM56582k4.mo17586x1(4);
                    abstractC12008jdM56582k4.mo17560kk(7);
                    abstractC12008jdM56582k4.mo17481h4(4);
                    abstractC12008jdM56582k4.mo17476du(0);
                    abstractC12008jdM56582k4.mo17478dy(4);
                    m13186k4(abstractC12008jdM56582k4, bArr, new C12007ix(new C12025x6(), c12015qq.Clone()).Clone());
                    abstractC12008jdM56582k4.dispose();
                } catch (Throwable th) {
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    throw th;
                }
            } else {
                c12009k4Mo17028k4 = AbstractC4229kk.m17035k4(abstractC12536x1M58363k4, c4230to).mo17028k4(c12015qq.m56699x1(), c12015qq.m56697kk());
            }
            abstractC12536x1M58363k4.dispose();
            return c12009k4Mo17028k4;
        } catch (Throwable th2) {
            if (abstractC12536x1M58363k4 != null) {
                abstractC12536x1M58363k4.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13181k4(byte[] bArr, C12015qq c12015qq) {
        return m13179k4(bArr, null, c12015qq.Clone(), new C12015qq(1.0f, 1.0f));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13182k4(byte[] bArr, C12015qq c12015qq, float f) {
        return m13180k4(bArr, null, c12015qq.Clone(), new C12015qq(1.0f, 1.0f), f, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13183k4(byte[] bArr, C12015qq c12015qq, C12007ix c12007ix) {
        AbstractC12008jd abstractC12008jdM56582k4;
        C12009k4 c12009k4;
        AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(new C3152yj(bArr));
        try {
            C4230to c4230to = abstractC12536x1M58363k4.mo13625x1() == 1 ? new C4230to(C12003du.f40505to.Clone(), new C12023wl(C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13))) : new C4230to(C12003du.f40505to.Clone());
            c4230to.m17053k4(new C14093tq<>(0));
            c4230to.m17060x1(new C14093tq<>(0));
            c4230to.m17055kk(new C14093tq<>(3));
            c4230to.m17059to(new C14093tq<>(0));
            c4230to.m17046du(new C14093tq<>(3));
            c4230to.m17049h4(new C14093tq<>(3));
            c4230to.m17057m9(new C14093tq<>(4));
            if (abstractC12536x1M58363k4.mo13625x1() == 2) {
                c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qq.m56697kk()), 13));
                abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    abstractC12008jdM56582k4.mo17495k4(0);
                    abstractC12008jdM56582k4.mo17586x1(4);
                    abstractC12008jdM56582k4.mo17560kk(7);
                    abstractC12008jdM56582k4.mo17481h4(4);
                    abstractC12008jdM56582k4.mo17476du(0);
                    abstractC12008jdM56582k4.mo17478dy(4);
                    m13186k4(abstractC12008jdM56582k4, bArr, new C12007ix(new C12025x6(), c12015qq.Clone()).Clone());
                    abstractC12008jdM56582k4.dispose();
                } finally {
                }
            } else {
                C12009k4 c12009k42 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13));
                abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                try {
                    AbstractC4229kk abstractC4229kkM17035k4 = AbstractC4229kk.m17035k4(abstractC12536x1M58363k4, c4230to);
                    abstractC4229kkM17035k4.mo17030k4(c12009k42);
                    abstractC4229kkM17035k4.mo17031k4(abstractC12008jdM56582k4, new C11913yj(c12015qq.m56699x1() / abstractC12536x1M58363k4.mo13502h4(), 0.0f, 0.0f, c12015qq.m56697kk() / abstractC12536x1M58363k4.mo13504m9(), -c12007ix.m56557jd(), -c12007ix.m56551ck()));
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    c12009k4 = c12009k42;
                } finally {
                }
            }
            abstractC12536x1M58363k4.dispose();
            return c12009k4;
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m13184k4(int i, C12015qq c12015qq) {
        if (i < 0) {
            throw new ArgumentException("dpi");
        }
        if (i == 0 || i == 72) {
            return c12015qq;
        }
        float fM13175k4 = 12700.0f / m13175k4(i);
        return new C12015qq(c12015qq.m56699x1() * fM13175k4, c12015qq.m56697kk() * fM13175k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m13185k4(AbstractC4229kk abstractC4229kk, AbstractC12008jd abstractC12008jd, C12007ix c12007ix) {
        C11913yj c11913yjMo17577u4 = abstractC12008jd.mo17577u4();
        abstractC12008jd.mo17588x1(new C11913yj());
        C11913yj c11913yjM55760h4 = c11913yjMo17577u4.m55760h4();
        c11913yjM55760h4.m55780m9();
        C12018u4 c12018u4 = new C12018u4();
        c12018u4.m56771x1(c11913yjM55760h4);
        c12018u4.m56772x1(c12007ix.Clone());
        c12018u4.m56771x1(c11913yjMo17577u4);
        C12007ix c12007ixClone = c12018u4.m56749k4(abstractC12008jd).Clone();
        int iM27462to = C7019kk.m27462to(Float.valueOf(c12007ixClone.m56557jd()), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(c12007ixClone.m56551ck()), 13);
        c12018u4.m56771x1(new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -iM27462to, -iM27462to2));
        c12018u4.m56771x1(c11913yjM55760h4);
        C12007ix c12007ixClone2 = c12018u4.m56749k4(abstractC12008jd).Clone();
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5()), 13) + 3, C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1()), 13) + 3);
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                abstractC12008jdM56582k4.mo17495k4(abstractC12008jd.mo17477dy());
                abstractC12008jdM56582k4.mo17586x1(abstractC12008jd.mo17473c5());
                abstractC12008jdM56582k4.mo17560kk(abstractC12008jd.mo17479fa());
                abstractC12008jdM56582k4.mo17476du(abstractC12008jd.mo17566ks());
                abstractC12008jdM56582k4.mo17481h4(abstractC12008jd.mo17603x6());
                abstractC12008jdM56582k4.mo17478dy(abstractC12008jd.mo17482ix());
                abstractC12008jdM56582k4.mo17569m9(abstractC12008jd.mo17570ne());
                abstractC12008jdM56582k4.mo17588x1(c11913yjMo17577u4);
                abstractC4229kk.mo17029k4(abstractC12008jdM56582k4, c12009k4, c12007ixClone2.Clone());
                abstractC12008jd.mo17503k4((AbstractC12002ck) c12009k4, iM27462to, iM27462to2);
                abstractC12008jd.mo17495k4(abstractC12008jdM56582k4.mo17477dy());
                abstractC12008jd.mo17586x1(abstractC12008jdM56582k4.mo17473c5());
                abstractC12008jd.mo17560kk(abstractC12008jdM56582k4.mo17479fa());
                abstractC12008jd.mo17476du(abstractC12008jdM56582k4.mo17566ks());
                abstractC12008jd.mo17481h4(abstractC12008jdM56582k4.mo17603x6());
                abstractC12008jd.mo17478dy(abstractC12008jdM56582k4.mo17482ix());
                abstractC12008jd.mo17569m9(abstractC12008jdM56582k4.mo17570ne());
                abstractC12008jd.mo17588x1(c11913yjMo17577u4);
                abstractC12008jdM56582k4.dispose();
                c12009k4.dispose();
            } finally {
            }
        } catch (Throwable th) {
            c12009k4.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13186k4(AbstractC12008jd abstractC12008jd, byte[] bArr, C12007ix c12007ix) {
        int iMo17477dy = abstractC12008jd.mo17477dy();
        int iMo17473c5 = abstractC12008jd.mo17473c5();
        int iMo17479fa = abstractC12008jd.mo17479fa();
        int iMo17566ks = abstractC12008jd.mo17566ks();
        int iMo17603x6 = abstractC12008jd.mo17603x6();
        int iMo17482ix = abstractC12008jd.mo17482ix();
        int iMo17570ne = abstractC12008jd.mo17570ne();
        AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(new C3152yj(bArr));
        try {
            C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
            try {
                C4230to c4230to = abstractC12536x1M58363k4.mo13625x1() == 1 ? new C4230to(C12003du.f40505to.Clone(), new C12023wl(C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13))) : new C4230to(C12003du.f40505to.Clone());
                c4230to.m17053k4(new C14093tq<>(0));
                c4230to.m17060x1(new C14093tq<>(0));
                c4230to.m17055kk(new C14093tq<>(3));
                c4230to.m17059to(new C14093tq<>(0));
                c4230to.m17046du(new C14093tq<>(3));
                c4230to.m17049h4(new C14093tq<>(3));
                c4230to.m17057m9(new C14093tq<>(4));
                m13185k4(AbstractC4229kk.m17035k4(abstractC12536x1M58363k4, c4230to), abstractC12008jd, c12007ix.Clone());
                abstractC12008jd.mo17495k4(iMo17477dy);
                abstractC12008jd.mo17586x1(iMo17473c5);
                abstractC12008jd.mo17560kk(iMo17479fa);
                abstractC12008jd.mo17476du(iMo17566ks);
                abstractC12008jd.mo17481h4(iMo17603x6);
                abstractC12008jd.mo17478dy(iMo17482ix);
                abstractC12008jd.mo17569m9(iMo17570ne);
                abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
                abstractC12536x1M58363k4.dispose();
            } catch (Throwable th) {
                abstractC12008jd.mo17495k4(iMo17477dy);
                abstractC12008jd.mo17586x1(iMo17473c5);
                abstractC12008jd.mo17560kk(iMo17479fa);
                abstractC12008jd.mo17476du(iMo17566ks);
                abstractC12008jd.mo17481h4(iMo17603x6);
                abstractC12008jd.mo17478dy(iMo17482ix);
                abstractC12008jd.mo17569m9(iMo17570ne);
                abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC12536x1M58363k4 != null) {
                abstractC12536x1M58363k4.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13187k4(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        return m13196to(bArr) || m13170du(bArr) || m13194kk(bArr) || m13199x1(bArr) || m13172h4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13188k4(AbstractC12002ck abstractC12002ck) {
        return m13189k4(abstractC12002ck, C3977ck.m15681jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13189k4(AbstractC12002ck abstractC12002ck, C3977ck c3977ck) {
        C3152yj c3152yj = new C3152yj();
        try {
            abstractC12002ck.m56333k4(c3152yj, c3977ck);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13190k4(byte[] bArr, C12015qq c12015qq, C6921dy c6921dy) {
        C12009k4 c12009k4 = new C12009k4(OooO.OooO00o(c12015qq.m56699x1(), 14), OooO.OooO00o(c12015qq.m56697kk(), 14));
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                abstractC12008jdM56582k4.mo17495k4(0);
                abstractC12008jdM56582k4.mo17586x1(0);
                abstractC12008jdM56582k4.mo17560kk(3);
                abstractC12008jdM56582k4.mo17476du(0);
                abstractC12008jdM56582k4.mo17481h4(3);
                abstractC12008jdM56582k4.mo17569m9(4);
                abstractC12008jdM56582k4.mo17478dy(4);
                m13186k4(abstractC12008jdM56582k4, bArr, new C12007ix(new C12025x6(0.0f, 0.0f), c12015qq.Clone()));
                C3152yj c3152yj = new C3152yj();
                try {
                    c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                    c3152yj.setPosition(0L);
                    int length = (int) c3152yj.getLength();
                    byte[] bArr2 = new byte[length];
                    c3152yj.read(bArr2, 0, length);
                    c3152yj.setLength(0L);
                    abstractC12008jdM56582k4.dispose();
                    return bArr2;
                } finally {
                    c3152yj.dispose();
                }
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13191k4(byte[] bArr, String str, boolean z, AbstractC3150x6 abstractC3150x6, int i) {
        C3152yj c3152yj = new C3152yj(bArr);
        if (z) {
            return C12531h4.m58342k4(C12549du.m58501k4(bArr) ? m13181k4(bArr, new C12015qq(256.0f, 256.0f)) : (C12009k4) AbstractC12002ck.m56312k4(c3152yj), str, abstractC3150x6, i);
        }
        return C12531h4.m58344k4(str, c3152yj, abstractC3150x6, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13192k4(byte[] bArr, String[] strArr) {
        return C12531h4.m58341k4(new C3152yj(bArr), strArr);
    }
}

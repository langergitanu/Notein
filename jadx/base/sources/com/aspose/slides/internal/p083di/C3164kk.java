package com.aspose.slides.internal.p083di;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p138fu.C4120c5;
import com.aspose.slides.internal.p138fu.C4123dy;
import com.aspose.slides.internal.p138fu.C4125h4;
import com.aspose.slides.internal.p138fu.C4126jd;
import com.aspose.slides.internal.p138fu.C4128kk;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p420th.C10978x6;
import com.aspose.slides.internal.p420th.InterfaceC10954dq;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.di.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3164kk extends AbstractC10972up {

    /* JADX INFO: renamed from: du */
    private static int f9395du;

    /* JADX INFO: renamed from: jd */
    private static final C12019um f9396jd;

    /* JADX INFO: renamed from: ck */
    private C4126jd f9398ck;

    /* JADX INFO: renamed from: k4 */
    private AbstractC12008jd f9401k4;

    /* JADX INFO: renamed from: kk */
    private C12009k4 f9402kk;

    /* JADX INFO: renamed from: to */
    private AbstractC12008jd f9404to;

    /* JADX INFO: renamed from: x1 */
    private C12009k4 f9405x1;

    /* JADX INFO: renamed from: h4 */
    private final C3165x1 f9400h4 = new C3165x1();

    /* JADX INFO: renamed from: m9 */
    private final Stack<C11913yj> f9403m9 = new Stack<>();

    /* JADX INFO: renamed from: dy */
    private final Stack<C12018u4> f9399dy = new Stack<>();

    /* JADX INFO: renamed from: c5 */
    private final Stack<Integer> f9397c5 = new Stack<>();

    static {
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        f9396jd = c12019um;
        c12019um.m56817kk(c12019um.m56816kk() | 2048);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13521k4(C10950bv c10950bv) {
        this.f9400h4.mo13521k4(c10950bv);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13529x1(C10950bv c10950bv) {
        this.f9400h4.mo13529x1(c10950bv);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13522k4(C10951c5 c10951c5) {
        if (c10951c5.m52908m9() != null) {
            this.f9401k4.mo17517k4(c10951c5.m52908m9().m23101k4().Clone());
        }
        m13517k4((InterfaceC10954dq) c10951c5);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13530x1(C10951c5 c10951c5) {
        m13519x1((InterfaceC10954dq) c10951c5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m13517k4(InterfaceC10954dq interfaceC10954dq) {
        if (C10978x6.m53139x1(interfaceC10954dq)) {
            this.f9403m9.push(this.f9401k4.mo17577u4().m55760h4());
            C11913yj c11913yjM16495k4 = C4123dy.m16495k4(interfaceC10954dq.mo52909to());
            try {
                C12556ck.m58564k4(this.f9401k4, c11913yjM16495k4, 0);
            } finally {
                if (c11913yjM16495k4 != null) {
                    c11913yjM16495k4.dispose();
                }
            }
        }
        if (C10978x6.m53138kk(interfaceC10954dq)) {
            this.f9399dy.push(this.f9401k4.mo17480h4().m56768x1());
            C3163k4 c3163k4 = new C3163k4();
            c3163k4.m53112x1((AbstractC10973uz) interfaceC10954dq.mo52902du());
            C12556ck.m58566k4(this.f9401k4, c3163k4.m13514k4(), c3163k4.m13532x1(), 1);
        }
        this.f9397c5.push(Integer.valueOf(this.f9401k4.mo17477dy()));
    }

    /* JADX INFO: renamed from: x1 */
    private void m13519x1(InterfaceC10954dq interfaceC10954dq) {
        if (C10978x6.m53138kk(interfaceC10954dq)) {
            this.f9401k4.mo17590x1(this.f9399dy.pop());
        }
        if (C10978x6.m53139x1(interfaceC10954dq)) {
            this.f9401k4.mo17588x1(this.f9403m9.pop());
        }
        this.f9401k4.mo17495k4(this.f9397c5.pop().intValue());
    }

    /* JADX INFO: renamed from: x1 */
    private void m13520x1(C10970u4 c10970u4) {
        C3976c5 c3976c5;
        C12009k4 c12009k4 = new C12009k4(new C3152yj(c10970u4.m53082to()));
        try {
            if (c10970u4.m53065c5() == 1) {
                c12009k4.m56603k4();
            }
            C6921dy c6921dyM53069h4 = c10970u4.m53069h4();
            if (c10970u4.m53068dy() != null) {
                c3976c5 = new C3976c5();
                c3976c5.m15668k4(c10970u4.m53068dy().m27121k4().m23101k4().Clone(), c10970u4.m53068dy().m27123x1().m23101k4().Clone());
            } else {
                c3976c5 = null;
            }
            C3976c5 c3976c52 = c3976c5;
            int[] iArr = {2};
            C12007ix c12007ixClone = c12009k4.mo15755k4(iArr).Clone();
            int i = iArr[0];
            C12007ix c12007ixClone2 = c10970u4.m53080kk().Clone();
            C12025x6[] c12025x6Arr = {c12007ixClone2.m56552du(), new C12025x6(c12007ixClone2.m56557jd() + c12007ixClone2.m56550c5(), c12007ixClone2.m56551ck()), new C12025x6(c12007ixClone2.m56557jd(), c12007ixClone2.m56551ck() + c12007ixClone2.m56575x1())};
            if (!C6921dy.m27126k4(c6921dyM53069h4)) {
                c6921dyM53069h4.m27128k4(c12007ixClone.Clone()).CloneTo(c12007ixClone);
            }
            C12556ck.m58563k4(c12009k4, c12025x6Arr, c12007ixClone.Clone(), i, c3976c52, this.f9401k4);
            c12009k4.dispose();
        } catch (Throwable th) {
            c12009k4.dispose();
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        this.f9400h4.mo13523k4(c10955du);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13524k4(C10963ks c10963ks) {
        C12013m9 c12013m9M16500k4;
        m13517k4((InterfaceC10954dq) c10963ks);
        C12025x6 c12025x6 = new C12025x6(c10963ks.m52996ks(), c10963ks.m53008yj());
        if (c10963ks.m52980h4() != null && (c10963ks.m52980h4().m17417k4() != 0 || C5656k4.m23097to(((C4318fa) c10963ks.m52980h4()).m17352x1(), C5656k4.f15629ze))) {
            AbstractC12024x1 abstractC12024x1M16560k4 = C4128kk.m16560k4(c10963ks.m52980h4());
            try {
                c12013m9M16500k4 = C4125h4.m16500k4(c10963ks.m53005x1(), this.f9398ck);
                try {
                    C12556ck.m58570k4(c10963ks.m52977ck(), c12013m9M16500k4, abstractC12024x1M16560k4, c12025x6.Clone(), f9396jd, this.f9401k4);
                    if (c12013m9M16500k4 != null) {
                        c12013m9M16500k4.dispose();
                    }
                    if (abstractC12024x1M16560k4 != null) {
                        abstractC12024x1M16560k4.dispose();
                    }
                } finally {
                }
            } finally {
            }
        }
        if (c10963ks.m52978dy() != null && c10963ks.m52978dy().m17362h4() != null && (c10963ks.m52978dy().m17362h4().m17417k4() != 0 || C5656k4.m23097to(((C4318fa) c10963ks.m52978dy().m17362h4()).m17352x1(), C5656k4.f15629ze))) {
            C11896dy c11896dy = new C11896dy();
            c12013m9M16500k4 = C4125h4.m16500k4(c10963ks.m53005x1(), this.f9398ck);
            try {
                c11896dy.m55552k4(c10963ks.m52977ck(), c12013m9M16500k4.m56651x1(), c12013m9M16500k4.m56642jd(), c10963ks.m53005x1().m23114dy(), c12025x6.Clone(), f9396jd);
                c12013m9M16500k4.dispose();
                C12026yj c12026yjM16484k4 = C4120c5.m16484k4(c10963ks.m52978dy());
                try {
                    this.f9401k4.mo17540k4(c12026yjM16484k4, c11896dy);
                    if (c12026yjM16484k4 != null) {
                        c12026yjM16484k4.dispose();
                    }
                } finally {
                }
            } finally {
            }
        }
        m13519x1((InterfaceC10954dq) c10963ks);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        m13517k4((InterfaceC10954dq) c10971um);
        this.f9400h4.mo13516x1(c10971um);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13525k4(C10970u4 c10970u4) {
        try {
            m13520x1(c10970u4);
        } catch (RuntimeException unused) {
            m13520x1(C10970u4.m53060k4(c10970u4));
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13515k4(C10971um c10971um) {
        C12009k4 c12009k4;
        C12009k4 c12009k42;
        this.f9400h4.mo13515k4(c10971um);
        if (c10971um.m53107x1() != null) {
            AbstractC12024x1 abstractC12024x1M16560k4 = C4128kk.m16560k4(c10971um.m53107x1());
            try {
                if (c10971um.m53104kk() == 7 && (c12009k42 = this.f9405x1) != null && c12009k42.mo15753jd() == 2498570) {
                    f9395du++;
                    if (this.f9402kk == null) {
                        C12009k4 c12009k43 = new C12009k4(this.f9405x1.mo15760yj(), this.f9405x1.mo15757m9(), 2498570);
                        this.f9402kk = c12009k43;
                        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k43);
                        this.f9404to = abstractC12008jdM56582k4;
                        abstractC12008jdM56582k4.mo17574to(this.f9401k4.mo17605yj());
                        this.f9404to.mo17588x1(this.f9401k4.mo17577u4().m55760h4());
                    }
                    this.f9404to.mo17527k4(abstractC12024x1M16560k4, this.f9400h4.m13532x1());
                    if (f9395du > 90) {
                        m13518k4(this.f9402kk);
                        this.f9402kk = null;
                        f9395du = 0;
                    }
                } else {
                    C12009k4 c12009k44 = this.f9402kk;
                    if (c12009k44 != null) {
                        m13518k4(c12009k44);
                        this.f9402kk = null;
                        f9395du = 0;
                    }
                    this.f9401k4.mo17527k4(abstractC12024x1M16560k4, this.f9400h4.m13532x1());
                }
                if (abstractC12024x1M16560k4 != null) {
                    abstractC12024x1M16560k4.dispose();
                }
            } catch (Throwable th) {
                if (abstractC12024x1M16560k4 != null) {
                    abstractC12024x1M16560k4.dispose();
                }
                throw th;
            }
        }
        if (c10971um.m53098k4() != null) {
            C12026yj c12026yjM16484k4 = C4120c5.m16484k4(c10971um.m53098k4());
            try {
                if (c10971um.m53104kk() == 7 && (c12009k4 = this.f9405x1) != null && c12009k4.mo15753jd() == 2498570) {
                    C12009k4 c12009k45 = new C12009k4(this.f9405x1.mo15760yj(), this.f9405x1.mo15757m9(), this.f9405x1.mo15753jd());
                    try {
                        AbstractC12008jd abstractC12008jdM56582k42 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k45);
                        abstractC12008jdM56582k42.mo17574to(this.f9401k4.mo17605yj());
                        abstractC12008jdM56582k42.mo17588x1(this.f9401k4.mo17577u4().m55760h4());
                        abstractC12008jdM56582k42.mo17540k4(c12026yjM16484k4, this.f9400h4.m13532x1());
                        m13518k4(c12009k45);
                        c12009k45.dispose();
                    } catch (Throwable th2) {
                        c12009k45.dispose();
                        throw th2;
                    }
                } else {
                    C12009k4 c12009k46 = this.f9402kk;
                    if (c12009k46 != null) {
                        m13518k4(c12009k46);
                        this.f9402kk = null;
                        f9395du = 0;
                    }
                    this.f9401k4.mo17540k4(c12026yjM16484k4, this.f9400h4.m13532x1());
                }
                if (c12026yjM16484k4 != null) {
                    c12026yjM16484k4.dispose();
                }
            } catch (Throwable th3) {
                if (c12026yjM16484k4 != null) {
                    c12026yjM16484k4.dispose();
                }
                throw th3;
            }
        }
        m13519x1((InterfaceC10954dq) c10971um);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13526k4(AbstractC10973uz abstractC10973uz, AbstractC12008jd abstractC12008jd) {
        m13527k4(abstractC10973uz, abstractC12008jd, 3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13527k4(AbstractC10973uz abstractC10973uz, AbstractC12008jd abstractC12008jd, int i) {
        if (abstractC10973uz == null) {
            throw new ArgumentNullException("node");
        }
        if (abstractC12008jd == null) {
            throw new ArgumentNullException("graphics");
        }
        int iMo17605yj = abstractC12008jd.mo17605yj();
        abstractC12008jd.mo17574to(i);
        float fMo17579up = abstractC12008jd.mo17579up();
        abstractC12008jd.mo17491k4(1.0f);
        this.f9401k4 = abstractC12008jd;
        C4126jd c4126jd = new C4126jd();
        this.f9398ck = c4126jd;
        try {
            m53112x1(abstractC10973uz);
            c4126jd.dispose();
            abstractC12008jd.mo17491k4(fMo17579up);
            abstractC12008jd.mo17574to(iMo17605yj);
        } catch (Throwable th) {
            c4126jd.dispose();
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        this.f9400h4.mo13528k4(c10974v4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m13518k4(C12009k4 c12009k4) {
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, 2498570);
        int iMo15757m9 = c12009k4.mo15757m9() * c3983k4M56597k4.m15715du();
        byte[] bArr = new byte[iMo15757m9];
        C3914k4.m15618k4(c3983k4M56597k4.m15721to(), bArr, 0, iMo15757m9);
        c12009k4.m56605k4(c3983k4M56597k4);
        C3983k4 c3983k4M56597k42 = this.f9405x1.m56597k4(new C12014ne(0, 0, this.f9405x1.mo15760yj(), this.f9405x1.mo15757m9()), 3, 2498570);
        int iMo15757m92 = this.f9405x1.mo15757m9() * c3983k4M56597k42.m15715du();
        byte[] bArr2 = new byte[iMo15757m92];
        C3914k4.m15618k4(c3983k4M56597k42.m15721to(), bArr2, 0, iMo15757m92);
        for (int i = 0; i < iMo15757m92; i += 4) {
            if ((bArr[i + 3] & 255) != 0) {
                bArr2[i] = (byte) ((bArr2[i] & 255) ^ (bArr[i] & 255));
                int i2 = i + 1;
                bArr2[i2] = (byte) ((bArr2[i2] & 255) ^ (bArr[i2] & 255));
                int i3 = i + 2;
                bArr2[i3] = (byte) ((bArr2[i3] & 255) ^ (bArr[i3] & 255));
            }
        }
        C3914k4.m15621k4(bArr2, 0, c3983k4M56597k42.m15721to(), iMo15757m92);
        this.f9405x1.m56605k4(c3983k4M56597k42);
    }
}

package com.aspose.slides.internal.p135fp;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p101e6.C3583k4;
import com.aspose.slides.internal.p185il.C5104x1;
import com.aspose.slides.internal.p262m1.C6302k4;
import com.aspose.slides.internal.p291n4.C6739k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p381rm.C10020x1;
import com.aspose.slides.internal.p383rp.C10029c5;
import com.aspose.slides.internal.p450uu.C11560x1;
import com.aspose.slides.internal.p550zi.AbstractC13591ar;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.internal.p550zi.C13593bv;
import com.aspose.slides.internal.p550zi.C13596dq;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.internal.p550zi.C13616v4;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13623yj;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.rv */
/* JADX INFO: loaded from: classes.dex */
public final class C4102rv extends AbstractC13591ar {

    /* JADX INFO: renamed from: du */
    private C3583k4 f11227du;

    /* JADX INFO: renamed from: h4 */
    private C3583k4 f11228h4;

    /* JADX INFO: renamed from: k4 */
    private int f11229k4;

    /* JADX INFO: renamed from: kk */
    private int f11230kk;

    /* JADX INFO: renamed from: to */
    private boolean f11231to;

    /* JADX INFO: renamed from: x1 */
    private C6739k4 f11232x1;

    public C4102rv(int i, int i2) {
        this(new C6739k4(), i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C13609qq m16371k4(int i) {
        if (i == 0) {
            return C13609qq.m62784m9();
        }
        if (i == 1) {
            return C13609qq.m62782h4();
        }
        if (i == 2) {
            return C13609qq.m62783k4();
        }
        if (i == 3) {
            return C13609qq.m62781dy();
        }
        if (i == 4) {
            return C13609qq.m62785x1();
        }
        throw new ArgumentOutOfRangeException("colorType");
    }

    /* JADX INFO: renamed from: kk */
    public static void m16377kk(C13618wy c13618wy) {
        c13618wy.m62855k4((byte) -1);
        c13618wy.m62855k4((byte) -40);
    }

    /* JADX INFO: renamed from: ar */
    public C11560x1 m16379ar() {
        return this.f11232x1.m26522du();
    }

    /* JADX INFO: renamed from: bv */
    public C3583k4 m16380bv() {
        return this.f11227du;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: jd */
    public int mo10009jd() {
        return this.f11229k4;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m16386lr() {
        return this.f11231to;
    }

    /* JADX INFO: renamed from: qq */
    public String m16387qq() {
        return this.f11232x1.m26533to();
    }

    /* JADX INFO: renamed from: um */
    public C4091dy m16388um() {
        return this.f11232x1.m26531kk();
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13605ks
    /* JADX INFO: renamed from: up */
    public int mo10012up() {
        return this.f11230kk;
    }

    /* JADX INFO: renamed from: v4 */
    public C3583k4 m16389v4() {
        return this.f11228h4;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13599fa
    /* JADX INFO: renamed from: x1 */
    public void mo10013x1(AbstractC3150x6 abstractC3150x6) {
        m16374k4(this, abstractC3150x6, m16388um(), m16379ar(), this.f11232x1);
    }

    public C4102rv(int i, int i2, int i3, InterfaceC6900ck interfaceC6900ck) {
        m16373k4(interfaceC6900ck, i, i2);
        if (i3 == 0) {
            this.f11232x1.m26526k4(0);
            return;
        }
        if (i3 == 1) {
            this.f11232x1.m26526k4(4);
            return;
        }
        if (i3 == 3) {
            this.f11232x1.m26526k4(1);
        } else if (i3 == 4) {
            this.f11232x1.m26526k4(2);
        } else {
            if (i3 != 5) {
                throw new ArgumentOutOfRangeException("pixelFormat");
            }
            this.f11232x1.m26526k4(3);
        }
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13591ar
    /* JADX INFO: renamed from: k4 */
    public void mo16381k4(int i, int i2) {
        this.f11230kk = i;
        this.f11229k4 = i2;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16390x1(C3583k4 c3583k4) {
        this.f11228h4 = c3583k4;
    }

    public C4102rv(C6739k4 c6739k4, int i, int i2) {
        this.f11232x1 = c6739k4;
        this.f11230kk = i;
        this.f11229k4 = i2;
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m16378x1(C11560x1 c11560x1) {
        byte[] bArrM54566to = c11560x1.m54566to();
        if (bArrM54566to.length > 65528) {
            throw new C5104x1("Exif segment is excessively big to be stored in jpeg file. Consider JpegExifData.SerializeExifData() method for result data size estimation.");
        }
        C6302k4 c6302k4 = new C6302k4(new C3152yj());
        c6302k4.m62855k4((byte) -1);
        c6302k4.m62855k4((byte) -31);
        c6302k4.m25836h4(C7019kk.m27457kk(Integer.valueOf(bArrM54566to.length + 8), 9));
        c6302k4.m62857k4(new byte[]{69, 120, 105, 102, 0, 0});
        c6302k4.m62857k4(bArrM54566to);
        return c6302k4.m62849dy();
    }

    /* JADX INFO: renamed from: k4 */
    public void m16382k4(C3583k4 c3583k4) {
        this.f11227du = c3583k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16383k4(C4091dy c4091dy) {
        this.f11232x1.m26528k4(c4091dy);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16372k4(C4101qq c4101qq) {
        c4101qq.m62855k4((byte) -1);
        c4101qq.m62855k4((byte) -39);
    }

    /* JADX INFO: renamed from: k4 */
    private void m16373k4(InterfaceC6900ck interfaceC6900ck, int i, int i2) {
        C4102rv c4102rv;
        m62805k4(interfaceC6900ck);
        this.f11230kk = i;
        this.f11229k4 = i2;
        this.f11232x1 = new C6739k4();
        C13593bv c13593bv = (C13593bv) C7019kk.m27452k4((Object) interfaceC6900ck, C13593bv.class);
        if (c13593bv == null || c13593bv.m62708k4() == null || (c4102rv = (C4102rv) C7019kk.m27452k4((Object) c13593bv.m62708k4(), C4102rv.class)) == null) {
            return;
        }
        this.f11232x1.m26529k4(c4102rv.m16379ar());
        this.f11232x1.m26530k4(c4102rv.m16387qq());
        this.f11232x1.m26528k4(c4102rv.m16388um());
    }

    /* JADX INFO: renamed from: k4 */
    public void m16384k4(C11560x1 c11560x1) {
        this.f11232x1.m26529k4(c11560x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16374k4(AbstractC13613um abstractC13613um, AbstractC3150x6 abstractC3150x6, C4091dy c4091dy, C11560x1 c11560x1, C6739k4 c6739k4) {
        C4101qq c4101qq = new C4101qq(abstractC3150x6);
        m16377kk(c4101qq);
        if (c6739k4.mo26592x1() != null) {
            if (c11560x1 != null) {
                c11560x1.m54564k4(new C10029c5(C7019kk.m27435du(Double.valueOf(c6739k4.mo26592x1().m62761k4()), 14), 1L));
                c11560x1.m54567x1(new C10029c5(C7019kk.m27435du(Double.valueOf(c6739k4.mo26592x1().m62762x1()), 14), 1L));
                c11560x1.m54563k4(2);
            } else {
                if (c4091dy == null) {
                    c4091dy = new C4091dy();
                }
                c4091dy.m16289k4(C7019kk.m27468x1(Double.valueOf(c6739k4.mo26592x1().m62761k4()), 14));
                c4091dy.m16290x1(C7019kk.m27468x1(Double.valueOf(c6739k4.mo26592x1().m62762x1()), 14));
            }
        }
        if (c4091dy != null) {
            C4091dy.m16287k4(c4091dy, c4101qq);
        }
        m16375k4(c4101qq, c11560x1);
        if (!C14113y2.m67411k4(c6739k4.m26533to())) {
            m16376k4(c4101qq, c6739k4.m26533to());
        }
        if (c6739k4.m26532m9() == 3) {
            AbstractC3150x6 abstractC3150x6M14472k4 = (c6739k4.m26525jd() != null ? c6739k4.m26525jd() : C13623yj.m62875k4()).m14472k4();
            C4099m9.m16363k4(abstractC3150x6M14472k4, abstractC3150x6);
            C4096k4 c4096k4 = new C4096k4();
            c4096k4.m16340kk(100);
            c4096k4.m16339k4(0);
            c4096k4.m16341x1(0);
            c4096k4.m16338k4((byte) 2);
            C4096k4.m16336k4(abstractC3150x6, c4096k4);
            c6739k4.m26535x1(new C3583k4(abstractC3150x6M14472k4));
            if (c6739k4.m26521c5() == null) {
                c6739k4.m26527k4(C13623yj.m62876x1());
            }
        }
        if (c6739k4.m26532m9() == 4) {
            C4096k4 c4096k42 = new C4096k4();
            c4096k42.m16340kk(100);
            c4096k42.m16339k4(0);
            c4096k42.m16341x1(0);
            c4096k42.m16338k4((byte) 0);
            C4096k4.m16336k4(abstractC3150x6, c4096k42);
        }
        C13616v4 c13616v4 = new C13616v4();
        C13609qq c13609qqM16371k4 = m16371k4(c6739k4.m26532m9());
        C4107uz c4107uz = new C4107uz(c4101qq, c6739k4, abstractC13613um, c13609qqM16371k4, new C10020x1(abstractC13613um.m62756dy().Clone(), c6739k4, c4101qq, c13609qqM16371k4));
        c13616v4.m62829k4(c13609qqM16371k4);
        AbstractC4092fa abstractC4092faM16291k4 = AbstractC4092fa.m16291k4(c4107uz, c6739k4);
        if (abstractC13613um.mo10016ix() && c6739k4.m26532m9() != 3) {
            c13616v4.m62826k4((InterfaceC6901du) null);
            c13616v4.m62828k4(abstractC13613um.m62818x6());
            c13616v4.m62833x1(abstractC13613um.m62812ne());
            c13616v4.m62827k4(abstractC13613um.m62813rv());
            c13616v4.m62831kk(c13616v4.m62824k4().m62786du() * abstractC13613um.mo10012up());
            abstractC13613um.mo10017k4(abstractC13613um.m62756dy().Clone(), c13616v4, c4107uz);
        } else if (abstractC13613um.mo24307u4()) {
            abstractC13613um.mo10018x1(abstractC13613um.m62756dy().Clone(), new C13596dq(abstractC13613um.mo24308uz(), abstractC13613um.mo24310yj(), abstractC4092faM16291k4));
        } else {
            abstractC13613um.mo10018x1(abstractC13613um.m62756dy().Clone(), abstractC4092faM16291k4);
        }
        m16372k4(c4101qq);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16375k4(C13618wy c13618wy, C11560x1 c11560x1) {
        if (c11560x1 == null) {
            return;
        }
        byte[] bArrM16378x1 = m16378x1(c11560x1);
        c13618wy.m62863x1(bArrM16378x1, 0, bArrM16378x1.length);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m16376k4(C13618wy c13618wy, String str) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        byte[] bArrMo26677to = AbstractC6747ar.m26635ix().mo26677to(str);
        C6302k4 c6302k4 = new C6302k4(new C3152yj());
        c6302k4.m62855k4((byte) -1);
        c6302k4.m62855k4((byte) -2);
        c6302k4.m25836h4(C7019kk.m27457kk(Integer.valueOf(bArrMo26677to.length + 2), 9));
        c6302k4.m62857k4(bArrMo26677to);
        byte[] bArrM62849dy = c6302k4.m62849dy();
        c13618wy.m62863x1(bArrM62849dy, 0, bArrM62849dy.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void m16385k4(String str) {
        this.f11232x1.m26530k4(str);
    }
}

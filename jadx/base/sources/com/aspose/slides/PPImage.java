package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p052c0.C1937to;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p456v5.C11610to;
import com.aspose.slides.internal.p464vq.AbstractC11747gf;
import com.aspose.slides.internal.p464vq.C11749gk;
import com.aspose.slides.internal.p464vq.C11755ig;
import com.aspose.slides.internal.p464vq.C11759j5;
import com.aspose.slides.internal.p464vq.C11775m2;
import com.aspose.slides.internal.p464vq.C11783na;
import com.aspose.slides.internal.p464vq.C11787nv;
import com.aspose.slides.internal.p464vq.C11858y9;
import com.aspose.slides.internal.p464vq.C11862yn;
import com.aspose.slides.internal.p464vq.C11863yo;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12558dy;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.C13449m9;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
public class PPImage implements IPPImage, IDisposable {

    /* JADX INFO: renamed from: c5 */
    private boolean f2925c5;

    /* JADX INFO: renamed from: ck */
    private long f2926ck;

    /* JADX INFO: renamed from: du */
    private InterfaceC13443dy f2927du;

    /* JADX INFO: renamed from: dy */
    private C12014ne f2928dy;

    /* JADX INFO: renamed from: fa */
    private long f2929fa;

    /* JADX INFO: renamed from: h4 */
    private final IPresentation f2930h4;

    /* JADX INFO: renamed from: jd */
    private boolean f2931jd;

    /* JADX INFO: renamed from: k4 */
    private ISvgImage f2932k4;

    /* JADX INFO: renamed from: kk */
    private final jj3 f2933kk;

    /* JADX INFO: renamed from: m9 */
    private C12025x6 f2934m9;

    /* JADX INFO: renamed from: to */
    private final C14047bz f2935to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC11747gf f2936x1;

    private PPImage(IPresentation iPresentation) {
        this.f2936x1 = null;
        this.f2933kk = new jj3();
        this.f2935to = C14047bz.m66536x1().Clone();
        this.f2934m9 = new C12025x6();
        this.f2928dy = new C12014ne();
        this.f2925c5 = false;
        this.f2931jd = false;
        if (iPresentation == null) {
            throw new ArgumentNullException("presentation");
        }
        this.f2930h4 = iPresentation;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m2114k4(byte[] bArr) {
        return C11610to.m54691k4(bArr);
    }

    /* JADX INFO: renamed from: ks */
    private void m2120ks() {
        this.f2929fa++;
    }

    /* JADX INFO: renamed from: yj */
    private void m2122yj() {
        ((ImageCollection) this.f2930h4.getImages()).m1733k4(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final C12025x6 m2123c5() {
        m2119k4(false);
        return this.f2934m9;
    }

    /* JADX INFO: renamed from: ck */
    public final IPresentation m2124ck() {
        return this.f2930h4;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        InterfaceC13443dy interfaceC13443dy = this.f2927du;
        if (interfaceC13443dy != null) {
            interfaceC13443dy.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC13443dy m2125du() {
        if (this.f2927du == null && getSvgImage() != null) {
            this.f2927du = ((Presentation) this.f2930h4).m2388qq().m62581k4(C13447k4.m62559k4(((ImageCollection) this.f2930h4.getImages()).m1731k4(getSvgImage(), Float.NaN, Float.NaN, 4.0f, new boolean[]{false})));
        }
        return this.f2927du;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC12002ck m2126dy() {
        return C3099wl.m13169ck(m2134m9());
    }

    /* JADX INFO: renamed from: fa */
    public final C14047bz m2127fa() {
        return this.f2935to;
    }

    @Override // com.aspose.slides.IPPImage
    public final byte[] getBinaryData() {
        AbstractC3150x6 abstractC3150x6Mo18614x1 = m2125du().mo18614x1();
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13447k4.m62557k4(abstractC3150x6Mo18614x1, c3152yj, C13447k4.f45030k4);
                return c3152yj.toArray();
            } finally {
                c3152yj.dispose();
            }
        } finally {
            if (abstractC3150x6Mo18614x1 != null) {
                abstractC3150x6Mo18614x1.dispose();
            }
        }
    }

    @Override // com.aspose.slides.IPPImage
    public final String getContentType() {
        return m2137x1().mo55273k4();
    }

    @Override // com.aspose.slides.IPPImage
    public final int getHeight() {
        return m2133kk().m56683x1();
    }

    @Override // com.aspose.slides.IPPImage
    public final IImage getImage() {
        return new yyn(m2131k4());
    }

    @Override // com.aspose.slides.IPPImage
    public final ISvgImage getSvgImage() {
        return this.f2932k4;
    }

    @Override // com.aspose.slides.IPPImage
    public final Bitmap getSystemImage() {
        C3152yj c3152yj = new C3152yj();
        try {
            m2131k4().m56333k4(c3152yj, C3977ck.m15681jd());
        } catch (ArgumentException unused) {
            m2131k4().m56333k4(c3152yj, C3977ck.m15681jd());
        }
        return (Bitmap) C12009k4.m56588k4((C12009k4) AbstractC12002ck.m56312k4(c3152yj));
    }

    @Override // com.aspose.slides.IPPImage
    public final int getWidth() {
        return m2133kk().m56663c5();
    }

    @Override // com.aspose.slides.IPPImage
    public final int getX() {
        return m2133kk().m56669jd();
    }

    @Override // com.aspose.slides.IPPImage
    public final int getY() {
        return m2133kk().m56664ck();
    }

    /* JADX INFO: renamed from: h4 */
    public final long m2128h4() {
        if ((this.f2926ck & 4294967295L) == 0) {
            this.f2926ck = m2114k4(m2134m9());
        }
        return this.f2926ck;
    }

    public int hashCode() {
        return (int) m2128h4();
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m2129jd() {
        m2119k4(false);
        return this.f2925c5;
    }

    /* JADX INFO: renamed from: kk */
    public final C12014ne m2133kk() {
        m2119k4(false);
        return this.f2928dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m2134m9() {
        return m2125du().mo18611k4();
    }

    @Override // com.aspose.slides.IPPImage
    public final void replaceImage(IImage iImage) {
        m2132k4(((yyn) iImage).m74148k4());
    }

    @Override // com.aspose.slides.IPPImage
    public final void setSvgImage(ISvgImage iSvgImage) {
        this.f2932k4 = iSvgImage;
    }

    /* JADX INFO: renamed from: to */
    public final jj3 m2135to() {
        return this.f2933kk;
    }

    /* JADX INFO: renamed from: up */
    public final long m2136up() {
        return ((this.f2929fa & 4294967295L) + (this.f2933kk.m63345kk() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC11747gf m2137x1() {
        if (this.f2936x1 == null) {
            this.f2936x1 = m2116k4(m2125du());
        }
        return this.f2936x1;
    }

    public PPImage(IPresentation iPresentation, InterfaceC13443dy interfaceC13443dy) {
        this(iPresentation);
        this.f2927du = interfaceC13443dy;
        m2122yj();
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC11747gf m2121x1(byte[] bArr) {
        switch (C12549du.m58515x1(bArr)) {
            case 1:
                return new C11759j5();
            case 2:
                return new C11862yn();
            case 3:
                return new C11755ig();
            case 4:
                return new C11858y9();
            case 5:
                return new C11749gk();
            case 6:
                return new C11775m2();
            case 7:
                return new C11787nv();
            case 8:
                return new C11863yo();
            default:
                return new C11783na();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C6921dy m2130k4(pj5 pj5Var, C6921dy c6921dy) {
        double d;
        double d2;
        if (!c6921dy.m27130k4() && !"image/x-emf".equals(getContentType()) && !"image/x-wmf".equals(getContentType())) {
            if (C7019kk.m27462to(Float.valueOf((m2123c5().m56897x1() * new C1937to(getBinaryData()).m9991ks().m56699x1()) / 96.0f), 13) > C12558dy.m58577k4().Clone().m56865x1()) {
                double dM56865x1 = r1.m56865x1() / getWidth();
                double dM56862kk = r1.m56862kk() / getHeight();
                if (dM56865x1 < 0.98d) {
                    float f = pj5Var.f48081x1;
                    double d3 = ((double) f) * dM56865x1;
                    double d4 = (100.0d - d3) - (((100.0d - ((double) f)) - ((double) pj5Var.f48080to)) * dM56865x1);
                    if (dM56862kk < 0.98d) {
                        double d5 = dM56862kk * 0.98d;
                        float f2 = pj5Var.f48079kk;
                        d = ((double) f2) * d5;
                        d2 = (100.0d - d) - (((100.0d - ((double) f2)) - ((double) pj5Var.f48078du)) * d5);
                    } else {
                        d = 0.0d;
                        d2 = 0.0d;
                    }
                    return new C6921dy(d3 / 100.0d, d4 / 100.0d, d / 100.0d, d2 / 100.0d);
                }
            }
        }
        return c6921dy;
    }

    @Override // com.aspose.slides.IPPImage
    public final void replaceImage(IPPImage iPPImage) {
        InterfaceC13443dy interfaceC13443dyM62563k4;
        if (iPPImage == null) {
            throw new ArgumentNullException("newImage");
        }
        if (m2124ck() == null) {
            interfaceC13443dyM62563k4 = C13449m9.m62563k4(iPPImage.getBinaryData());
        } else {
            if (C14047bz.m66535k4(m2127fa(), ((PPImage) iPPImage).m2127fa())) {
                return;
            }
            ((Presentation) m2124ck()).m2388qq().m62582k4(this.f2927du);
            interfaceC13443dyM62563k4 = ((Presentation) m2124ck()).m2388qq().m62581k4(iPPImage.getBinaryData());
        }
        this.f2927du = interfaceC13443dyM62563k4;
        m2119k4(true);
        setSvgImage(iPPImage.getSvgImage());
    }

    public PPImage(IPresentation iPresentation, InterfaceC13443dy interfaceC13443dy, long j, C12014ne c12014ne) {
        this(iPresentation);
        this.f2927du = interfaceC13443dy;
        this.f2926ck = j;
        c12014ne.CloneTo(this.f2928dy);
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC11747gf m2115k4(AbstractC3150x6 abstractC3150x6) {
        int i = (int) C13447k4.f45030k4;
        byte[] bArr = new byte[i];
        abstractC3150x6.read(bArr, 0, i);
        return m2121x1(bArr);
    }

    @Override // com.aspose.slides.IPPImage
    public final void replaceImage(byte[] bArr) {
        byte[] array;
        InterfaceC13443dy interfaceC13443dyM62563k4;
        if (bArr == null) {
            throw new ArgumentNullException("newImageData");
        }
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            AbstractC12002ck abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(c3152yj);
            try {
                if (C14047bz.m66535k4(abstractC12002ckM56312k4.mo15750ck().m15685k4(), C3977ck.m15684to().m15685k4()) || C14047bz.m66535k4(abstractC12002ckM56312k4.mo15750ck().m15685k4(), C3977ck.m15679fa().m15685k4())) {
                    array = bArr;
                } else if (C14047bz.m66535k4(abstractC12002ckM56312k4.mo15750ck().m15685k4(), C3977ck.m15678dy().m15685k4())) {
                    C3152yj c3152yj2 = new C3152yj();
                    try {
                        C12009k4 c12009k4 = new C12009k4(abstractC12002ckM56312k4);
                        try {
                            c12009k4.m56333k4(c3152yj2, abstractC12002ckM56312k4.mo15750ck());
                            c12009k4.dispose();
                            array = c3152yj2.toArray();
                        } catch (Throwable th) {
                            c12009k4.dispose();
                            throw th;
                        }
                    } finally {
                        c3152yj2.dispose();
                    }
                } else {
                    array = c3152yj.toArray();
                }
                abstractC12002ckM56312k4.dispose();
                if (m2124ck() != null) {
                    ((Presentation) m2124ck()).m2388qq().m62582k4(this.f2927du);
                    interfaceC13443dyM62563k4 = ((Presentation) m2124ck()).m2388qq().m62581k4(array);
                } else {
                    interfaceC13443dyM62563k4 = C13449m9.m62563k4(bArr);
                }
                this.f2927du = interfaceC13443dyM62563k4;
                c3152yj.dispose();
                m2119k4(true);
            } catch (Throwable th2) {
                if (abstractC12002ckM56312k4 != null) {
                    abstractC12002ckM56312k4.dispose();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            c3152yj.dispose();
            throw th3;
        }
    }

    public PPImage(IPresentation iPresentation, InterfaceC13443dy interfaceC13443dy, C12014ne c12014ne, long j) {
        this(iPresentation);
        this.f2927du = interfaceC13443dy;
        this.f2926ck = j;
        c12014ne.CloneTo(this.f2928dy);
        m2122yj();
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC11747gf m2116k4(InterfaceC13443dy interfaceC13443dy) {
        AbstractC3150x6 abstractC3150x6Mo18614x1 = interfaceC13443dy.mo18614x1();
        try {
            return m2115k4(abstractC3150x6Mo18614x1);
        } finally {
            if (abstractC3150x6Mo18614x1 != null) {
                abstractC3150x6Mo18614x1.dispose();
            }
        }
    }

    public PPImage(IPresentation iPresentation, byte[] bArr) {
        this(iPresentation);
        this.f2927du = C13449m9.m62563k4(bArr);
        m2122yj();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC12002ck m2131k4() {
        C3152yj c3152yj;
        AbstractC3150x6 abstractC3150x6Mo18614x1 = m2125du().mo18614x1();
        if (C7019kk.m27469x1(abstractC3150x6Mo18614x1, C3152yj.class)) {
            c3152yj = (C3152yj) abstractC3150x6Mo18614x1;
        } else {
            C3152yj c3152yj2 = new C3152yj();
            C13447k4.m62557k4(abstractC3150x6Mo18614x1, c3152yj2, C13447k4.f45030k4);
            abstractC3150x6Mo18614x1.dispose();
            c3152yj = c3152yj2;
        }
        c3152yj.setPosition(0L);
        return C3099wl.m13195m9(c3152yj.toArray()) ? AbstractC12536x1.m58363k4(c3152yj).mo13505to() : AbstractC12002ck.m56312k4(c3152yj);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m2117k4(AbstractC3150x6 abstractC3150x6, AbstractC11747gf[] abstractC11747gfArr, C12014ne[] c12014neArr) {
        C12025x6 c12025x6 = new C12025x6();
        C12025x6[] c12025x6Arr = {c12025x6};
        m2118k4(abstractC3150x6, abstractC11747gfArr, c12025x6Arr, new boolean[]{false}, c12014neArr);
        c12025x6Arr[0].CloneTo(c12025x6);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m2118k4(AbstractC3150x6 abstractC3150x6, AbstractC11747gf[] abstractC11747gfArr, C12025x6[] c12025x6Arr, boolean[] zArr, C12014ne[] c12014neArr) {
        C1937to c1937to = new C1937to(abstractC3150x6);
        abstractC3150x6.setPosition(0L);
        abstractC11747gfArr[0] = m2115k4(abstractC3150x6);
        abstractC3150x6.setPosition(0L);
        if (c1937to.m9994rv() != 0) {
            c12025x6Arr[0] = new C12025x6(c1937to.m9988jd(), c1937to.m9983ck());
            zArr[0] = true;
            C12014ne.m56655k4(c1937to.m9986fa().Clone()).CloneTo(c12014neArr[0]);
            return;
        }
        abstractC3150x6.setPosition(0L);
        try {
            AbstractC12002ck abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(abstractC3150x6);
            try {
                c12025x6Arr[0] = new C12025x6(C12567ne.m58657k4(abstractC12002ckM56312k4), C12567ne.m58660x1(abstractC12002ckM56312k4));
                zArr[0] = false;
                c12014neArr[0] = new C12014ne(0, 0, abstractC12002ckM56312k4.mo15760yj(), abstractC12002ckM56312k4.mo15757m9());
                abstractC12002ckM56312k4.dispose();
            } catch (Throwable th) {
                if (abstractC12002ckM56312k4 != null) {
                    abstractC12002ckM56312k4.dispose();
                }
                throw th;
            }
        } catch (RuntimeException unused) {
            abstractC3150x6.seek(0L, 0);
            c12025x6Arr[0] = new C12025x6(96.0f, 96.0f);
            zArr[0] = false;
            C12014ne.f40546k4.CloneTo(c12014neArr[0]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2132k4(AbstractC12002ck abstractC12002ck) {
        InterfaceC13443dy interfaceC13443dyM62563k4;
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("newImage");
        }
        C3152yj c3152yj = new C3152yj();
        try {
            abstractC12002ck.m56333k4(c3152yj, abstractC12002ck.mo15750ck());
            if (m2124ck() != null) {
                ((Presentation) m2124ck()).m2388qq().m62582k4(this.f2927du);
                interfaceC13443dyM62563k4 = ((Presentation) m2124ck()).m2388qq().m62581k4(c3152yj.toArray());
            } else {
                interfaceC13443dyM62563k4 = C13449m9.m62563k4(c3152yj.toArray());
            }
            this.f2927du = interfaceC13443dyM62563k4;
            c3152yj.dispose();
            m2119k4(true);
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m2119k4(boolean z) {
        if (!this.f2931jd || z) {
            C3152yj c3152yj = new C3152yj(m2125du().mo18611k4());
            try {
                AbstractC11747gf[] abstractC11747gfArr = {this.f2936x1};
                C12025x6[] c12025x6Arr = {this.f2934m9};
                boolean[] zArr = {this.f2925c5};
                C12014ne[] c12014neArr = {this.f2928dy};
                m2118k4(c3152yj, abstractC11747gfArr, c12025x6Arr, zArr, c12014neArr);
                this.f2936x1 = abstractC11747gfArr[0];
                c12025x6Arr[0].CloneTo(this.f2934m9);
                this.f2925c5 = zArr[0];
                c12014neArr[0].CloneTo(this.f2928dy);
                this.f2931jd = true;
                m2120ks();
            } finally {
                c3152yj.dispose();
            }
        }
    }
}

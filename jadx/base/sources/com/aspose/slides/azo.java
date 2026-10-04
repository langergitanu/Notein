package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3074na;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
final class azo implements IGenericCloneable<azo>, Cloneable {

    /* JADX INFO: renamed from: dy */
    static final C3074na<Byte, Integer> f4041dy;

    /* JADX INFO: renamed from: ar */
    private byte f4050ar;

    /* JADX INFO: renamed from: bv */
    private byte f4051bv;

    /* JADX INFO: renamed from: c5 */
    private float[] f4052c5;

    /* JADX INFO: renamed from: du */
    float f4053du;

    /* JADX INFO: renamed from: h4 */
    C0962es f4054h4;

    /* JADX INFO: renamed from: ix */
    private byte f4055ix;

    /* JADX INFO: renamed from: ks */
    private double f4056ks;

    /* JADX INFO: renamed from: m9 */
    boolean f4057m9;

    /* JADX INFO: renamed from: ne */
    private byte f4058ne;

    /* JADX INFO: renamed from: qq */
    private byte f4059qq;

    /* JADX INFO: renamed from: rv */
    private byte f4060rv;

    /* JADX INFO: renamed from: u4 */
    private byte f4061u4;

    /* JADX INFO: renamed from: um */
    private byte f4062um;

    /* JADX INFO: renamed from: uz */
    private byte f4063uz;

    /* JADX INFO: renamed from: wl */
    private byte f4064wl;

    /* JADX INFO: renamed from: x6 */
    private short f4065x6;

    /* JADX INFO: renamed from: jd */
    private static final C12025x6[] f4043jd = {new C12025x6(0.0f, 0.0f), new C12025x6(-5.0f, -10.0f), new C12025x6(5.0f, -10.0f), new C12025x6(0.0f, 0.0f)};

    /* JADX INFO: renamed from: ck */
    private static final C12025x6[] f4040ck = {new C12025x6(0.0f, -6.0f), new C12025x6(5.0f, -10.0f), new C12025x6(0.0f, 0.0f), new C12025x6(-5.0f, -10.0f), new C12025x6(0.0f, -6.0f)};

    /* JADX INFO: renamed from: fa */
    private static final C12025x6[] f4042fa = {new C12025x6(-5.0f, 0.0f), new C12025x6(0.0f, -5.0f), new C12025x6(5.0f, 0.0f), new C12025x6(0.0f, 5.0f), new C12025x6(-5.0f, 0.0f)};

    /* JADX INFO: renamed from: up */
    private static final float[] f4047up = {1.25f, 1.75f, 2.5f};

    /* JADX INFO: renamed from: yj */
    private static final float[] f4049yj = {2.0f, 3.0f, 4.5f};

    /* JADX INFO: renamed from: k4 */
    static final float[] f4044k4 = {0.0f, 0.16666667f, 0.33333334f, 0.6666667f, 0.8333333f, 1.0f};

    /* JADX INFO: renamed from: x1 */
    static final float[] f4048x1 = {0.0f, 0.6f, 0.8f, 1.0f};

    /* JADX INFO: renamed from: kk */
    static final float[] f4045kk = {0.0f, 0.2f, 0.4f, 1.0f};

    /* JADX INFO: renamed from: to */
    static final float[] f4046to = {0.0f, 0.33333334f, 0.6666667f, 1.0f};

    static {
        C3074na<Byte, Integer> c3074na = new C3074na<>();
        f4041dy = c3074na;
        c3074na.m13009k4(OooOOO0.OooO0O0(0, c3074na, OooOOO0.OooO0O0(1, c3074na, (byte) 1, (byte) 2), (byte) 0), 2);
    }

    public azo(ajz ajzVar, ILineFormatEffectiveData iLineFormatEffectiveData, int i) {
        this.f4057m9 = false;
        this.f4065x6 = (short) -1;
        this.f4053du = 72.0f;
        this.f4060rv = iLineFormatEffectiveData.getStyle();
        this.f4055ix = iLineFormatEffectiveData.getBeginArrowheadStyle();
        this.f4061u4 = iLineFormatEffectiveData.getEndArrowheadStyle();
        this.f4063uz = iLineFormatEffectiveData.getBeginArrowheadLength();
        this.f4064wl = iLineFormatEffectiveData.getEndArrowheadLength();
        this.f4059qq = iLineFormatEffectiveData.getBeginArrowheadWidth();
        this.f4050ar = iLineFormatEffectiveData.getEndArrowheadWidth();
        this.f4051bv = iLineFormatEffectiveData.getCapStyle();
        this.f4062um = iLineFormatEffectiveData.getJoinStyle();
        this.f4058ne = iLineFormatEffectiveData.getDashStyle();
        if (iLineFormatEffectiveData.getDashStyle() == 11) {
            m3912k4(iLineFormatEffectiveData.getCustomDashPattern());
        }
        this.f4054h4 = C0962es.m5663k4(ajzVar, (erk) iLineFormatEffectiveData.getFillFormat());
        this.f4056ks = iLineFormatEffectiveData.getWidth();
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: ar, reason: merged with bridge method [inline-methods] */
    public final azo cloneT() {
        azo azoVar = (azo) m3923um();
        azoVar.f4054h4 = this.f4054h4.cloneT();
        return azoVar;
    }

    /* JADX INFO: renamed from: c5 */
    public final byte m3897c5() {
        byte b = this.f4055ix;
        if (b != -1) {
            return b;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ck */
    public final byte m3898ck() {
        byte b = this.f4063uz;
        if (b != -1) {
            return b;
        }
        return (byte) 1;
    }

    /* JADX INFO: renamed from: du */
    public final byte m3899du() {
        byte b = this.f4062um;
        if (b != -1) {
            return b;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: dy */
    public final C0962es m3901dy() {
        return this.f4054h4;
    }

    /* JADX INFO: renamed from: fa */
    public final byte m3902fa() {
        byte b = this.f4064wl;
        if (b != -1) {
            return b;
        }
        return (byte) 1;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m3903h4() {
        short s = this.f4065x6;
        return s < 0 ? this.f4054h4.m5681to() != 0 : s != 0;
    }

    /* JADX INFO: renamed from: ix */
    public final C11896dy m3904ix() {
        return m3892k4(m3897c5(), m3898ck(), m3924up(), (((float) m3906k4()) * this.f4053du) / 72.0f);
    }

    /* JADX INFO: renamed from: jd */
    public final byte m3905jd() {
        byte b = this.f4061u4;
        if (b != -1) {
            return b;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m3906k4() {
        double d = this.f4056ks;
        if (d < 0.0d) {
            return 1.0d;
        }
        return d;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m3913kk() {
        byte b = this.f4058ne;
        if (b == -1) {
            return (byte) 0;
        }
        return b;
    }

    /* JADX INFO: renamed from: ks */
    public final float[] m3915ks() {
        return this.f4052c5;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12003du m3916m9() {
        return this.f4054h4.m5676k4();
    }

    /* JADX INFO: renamed from: ne */
    public final C0962es m3917ne() {
        return this.f4054h4;
    }

    /* JADX INFO: renamed from: qq */
    public final int m3918qq() {
        switch (m3913kk()) {
            case 1:
            case 8:
                return 2;
            case 2:
            case 3:
            case 7:
                return 1;
            case 4:
            case 5:
            case 9:
                return 3;
            case 6:
            case 10:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: rv */
    public final C4320jd m3919rv() {
        return m3907k4(this.f4053du);
    }

    /* JADX INFO: renamed from: to */
    public final byte m3920to() {
        byte b = this.f4051bv;
        if (b != -1) {
            return b;
        }
        return (byte) 2;
    }

    /* JADX INFO: renamed from: u4 */
    public final C11896dy m3922u4() {
        return m3892k4(m3905jd(), m3902fa(), m3931yj(), (((float) m3906k4()) * this.f4053du) / 72.0f);
    }

    /* JADX INFO: renamed from: um */
    public Object m3923um() {
        try {
            azo azoVar = (azo) clone();
            C0962es c0962es = this.f4054h4;
            if (c0962es == null) {
                return azoVar;
            }
            azoVar.f4054h4 = c0962es.cloneT();
            return azoVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: up */
    public final byte m3924up() {
        byte b = this.f4059qq;
        if (b != -1) {
            return b;
        }
        return (byte) 1;
    }

    /* JADX INFO: renamed from: uz */
    public final C11898h4 m3925uz() {
        return m3894k4(m3897c5(), m3898ck(), m3924up());
    }

    /* JADX INFO: renamed from: wl */
    public final C11898h4 m3926wl() {
        return m3894k4(m3905jd(), m3902fa(), m3931yj());
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m3927x1() {
        byte b = this.f4060rv;
        if (b == -1) {
            return (byte) 0;
        }
        return b;
    }

    /* JADX INFO: renamed from: x6 */
    public final C12026yj m3930x6() {
        return m3928x1(this.f4053du);
    }

    /* JADX INFO: renamed from: yj */
    public final byte m3931yj() {
        byte b = this.f4050ar;
        if (b != -1) {
            return b;
        }
        return (byte) 1;
    }

    public azo(ajz ajzVar, ILineParamSource iLineParamSource) {
        this.f4057m9 = false;
        this.f4056ks = -1.0d;
        this.f4060rv = (byte) -1;
        this.f4051bv = (byte) -1;
        this.f4062um = (byte) -1;
        this.f4065x6 = (short) -1;
        this.f4061u4 = (byte) -1;
        this.f4055ix = (byte) -1;
        this.f4064wl = (byte) -1;
        this.f4063uz = (byte) -1;
        this.f4050ar = (byte) -1;
        this.f4059qq = (byte) -1;
        this.f4058ne = (byte) -1;
        this.f4053du = 72.0f;
        if (!C7019kk.m27469x1(iLineParamSource, ILineFormat.class)) {
            if (C7019kk.m27469x1(iLineParamSource, skr.class)) {
                this.f4054h4 = new C0962es(ajzVar);
                m3895k4((skr) iLineParamSource);
                return;
            } else {
                if (C7019kk.m27469x1(iLineParamSource, xxf.class)) {
                    this.f4054h4 = new C0962es(ajzVar);
                    m3895k4(((xxf) iLineParamSource).f50226k4);
                    return;
                }
                return;
            }
        }
        ILineFormat iLineFormat = (ILineFormat) iLineParamSource;
        if (iLineFormat.getStyle() != -1) {
            this.f4060rv = iLineFormat.getStyle();
        }
        if (iLineFormat.getBeginArrowheadStyle() != -1) {
            this.f4055ix = iLineFormat.getBeginArrowheadStyle();
        }
        if (iLineFormat.getEndArrowheadStyle() != -1) {
            this.f4061u4 = iLineFormat.getEndArrowheadStyle();
        }
        if (iLineFormat.getBeginArrowheadLength() != -1) {
            this.f4063uz = iLineFormat.getBeginArrowheadLength();
        }
        if (iLineFormat.getEndArrowheadLength() != -1) {
            this.f4064wl = iLineFormat.getEndArrowheadLength();
        }
        if (iLineFormat.getBeginArrowheadWidth() != -1) {
            this.f4059qq = iLineFormat.getBeginArrowheadWidth();
        }
        if (iLineFormat.getEndArrowheadWidth() != -1) {
            this.f4050ar = iLineFormat.getEndArrowheadWidth();
        }
        if (iLineFormat.getCapStyle() != -1) {
            this.f4051bv = iLineFormat.getCapStyle();
        }
        if (iLineFormat.getJoinStyle() != -1) {
            this.f4062um = iLineFormat.getJoinStyle();
        }
        if (iLineFormat.getDashStyle() != -1) {
            this.f4058ne = iLineFormat.getDashStyle();
            if (iLineFormat.getDashStyle() == 11) {
                m3912k4(iLineFormat.getCustomDashPattern());
            }
        }
        this.f4054h4 = C0962es.m5662k4(ajzVar, (LineFillFormat) iLineFormat.getFillFormat());
        if (C14044b3.m66437kk(iLineFormat.getWidth())) {
            return;
        }
        this.f4056ks = iLineFormat.getWidth();
    }

    /* JADX INFO: renamed from: du */
    public final void m3900du(byte b) {
        this.f4061u4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4320jd m3907k4(float f) {
        C0962es c0962es = this.f4054h4;
        if (c0962es instanceof C14478sy) {
            C14478sy c14478sy = (C14478sy) c0962es;
            if (((tf7) c14478sy).f49119h4.m56550c5() > 1.0f && ((tf7) c14478sy).f49119h4.m56575x1() == 0.0f) {
                ((tf7) c14478sy).f49119h4.m56560k4((float) this.f4056ks);
            }
            if (((tf7) c14478sy).f49119h4.m56575x1() > 1.0f && ((tf7) c14478sy).f49119h4.m56550c5() == 0.0f) {
                ((tf7) c14478sy).f49119h4.m56576x1((float) this.f4056ks);
            }
        }
        C4328x1 c4328x1M73540k4 = C14814xq.m73540k4(this.f4054h4);
        if (c4328x1M73540k4.m17417k4() == 3) {
            C4324m9 c4324m9 = (C4324m9) c4328x1M73540k4;
            float fM3906k4 = (float) m3906k4();
            float f2 = fM3906k4 / 2.0f;
            c4324m9.m17397k4(new C12007ix(c4324m9.m17391du().m56557jd() - f2, c4324m9.m17391du().m56551ck() - f2, c4324m9.m17391du().m56550c5() + fM3906k4, c4324m9.m17391du().m56575x1() + fM3906k4));
        }
        C4320jd c4320jd = new C4320jd(c4328x1M73540k4, (((float) m3906k4()) * f) / 72.0f);
        c4320jd.m17359du(m3920to() == 0 ? 2 : 0);
        c4320jd.m17374to(f4041dy.m13012x1(Byte.valueOf(m3899du())).intValue());
        c4320jd.m17363h4(5);
        byte bM3927x1 = m3927x1();
        if (bM3927x1 == 1) {
            c4320jd.m17378x1(f4046to);
        } else if (bM3927x1 == 2) {
            c4320jd.m17378x1(this.f4057m9 ? f4045kk : f4048x1);
        } else if (bM3927x1 == 3) {
            c4320jd.m17378x1(this.f4057m9 ? f4048x1 : f4045kk);
        } else if (bM3927x1 == 4) {
            c4320jd.m17378x1(f4044k4);
        }
        byte bM3913kk = m3913kk();
        if (bM3913kk != 11) {
            switch (bM3913kk) {
                case 1:
                    c4320jd.m17368k4(new float[]{1.0f, 3.0f});
                    break;
                case 2:
                    c4320jd.m17368k4(new float[]{4.0f, 3.0f});
                    break;
                case 3:
                    c4320jd.m17368k4(new float[]{8.0f, 3.0f});
                    break;
                case 4:
                    c4320jd.m17368k4(new float[]{4.0f, 3.0f, 1.0f, 3.0f});
                    break;
                case 5:
                    c4320jd.m17368k4(new float[]{8.0f, 3.0f, 1.0f, 3.0f});
                    break;
                case 6:
                    c4320jd.m17368k4(new float[]{8.0f, 3.0f, 1.0f, 3.0f, 1.0f, 3.0f});
                    break;
                default:
                    c4320jd.m17363h4(m3918qq());
                    break;
            }
        } else if (m3915ks().length > 0) {
            c4320jd.m17368k4(m3915ks());
        }
        C11898h4 c11898h4M3925uz = m3925uz();
        C11898h4 c11898h4M3926wl = m3926wl();
        if (c11898h4M3925uz != null) {
            c4320jd.m17377x1(255);
        } else {
            c4320jd.m17377x1(m3920to() == 0 ? 2 : 16);
        }
        if (c11898h4M3926wl != null) {
            c4320jd.m17371kk(255);
            return c4320jd;
        }
        c4320jd.m17371kk(m3920to() != 0 ? 16 : 2);
        return c4320jd;
    }

    /* JADX INFO: renamed from: kk */
    public final void m3914kk(byte b) {
        this.f4051bv = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m3921to(byte b) {
        this.f4055ix = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12026yj m3928x1(float f) {
        int iM3918qq;
        C12026yj c12026yj = new C12026yj(C14814xq.m73548kk(this.f4054h4), (((float) m3906k4()) * f) / 72.0f);
        c12026yj.m56937x1(m3920to() == 0 ? 2 : 0);
        c12026yj.m56914h4(f4041dy.m13012x1(Byte.valueOf(m3899du())).intValue());
        byte bM3927x1 = m3927x1();
        if (bM3927x1 == 1) {
            c12026yj.m56924k4(f4046to);
        } else if (bM3927x1 == 2) {
            c12026yj.m56924k4(this.f4057m9 ? f4045kk : f4048x1);
        } else if (bM3927x1 == 3) {
            c12026yj.m56924k4(this.f4057m9 ? f4048x1 : f4045kk);
        } else if (bM3927x1 == 4) {
            c12026yj.m56924k4(f4044k4);
        }
        byte bM3913kk = m3913kk();
        if (bM3913kk != 11) {
            switch (bM3913kk) {
                case 1:
                    c12026yj.m56939x1(new float[]{1.0f, 3.0f});
                    break;
                case 2:
                    c12026yj.m56939x1(new float[]{4.0f, 3.0f});
                    break;
                case 3:
                    c12026yj.m56939x1(new float[]{8.0f, 3.0f});
                    break;
                case 4:
                    c12026yj.m56939x1(new float[]{4.0f, 3.0f, 1.0f, 3.0f});
                    break;
                case 5:
                    c12026yj.m56939x1(new float[]{8.0f, 3.0f, 1.0f, 3.0f});
                    break;
                case 6:
                    c12026yj.m56939x1(new float[]{8.0f, 3.0f, 1.0f, 3.0f, 1.0f, 3.0f});
                    break;
                default:
                    iM3918qq = m3918qq();
                    c12026yj.m56927kk(iM3918qq);
                    break;
            }
        } else if (m3915ks().length > 0) {
            c12026yj.m56939x1(m3915ks());
            iM3918qq = 5;
            c12026yj.m56927kk(iM3918qq);
        }
        C11898h4 c11898h4M3925uz = m3925uz();
        C11898h4 c11898h4M3926wl = m3926wl();
        if (c11898h4M3925uz != null) {
            c12026yj.m56932to(255);
            c12026yj.m56938x1(c11898h4M3925uz);
        } else {
            c12026yj.m56932to(16);
        }
        if (c11898h4M3926wl == null) {
            c12026yj.m56909du(16);
            return c12026yj;
        }
        c12026yj.m56909du(255);
        c12026yj.m56921k4(c11898h4M3926wl);
        return c12026yj;
    }

    public azo(C12003du c12003du, float f) {
        this.f4053du = 576.0f;
        this.f4057m9 = false;
        this.f4064wl = (byte) -1;
        this.f4063uz = (byte) -1;
        this.f4050ar = (byte) -1;
        this.f4059qq = (byte) -1;
        this.f4056ks = f;
        this.f4054h4 = new C0962es(c12003du.Clone());
        this.f4060rv = (byte) 0;
        this.f4065x6 = (short) 1;
        this.f4058ne = (byte) 0;
        this.f4061u4 = (byte) 0;
        this.f4055ix = (byte) 0;
        this.f4051bv = (byte) 2;
        this.f4062um = (byte) 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11896dy m3892k4(byte b, byte b2, byte b3, float f) {
        C11896dy c11896dyM3893k4 = m3893k4(b, b2, b3, new float[]{0.0f});
        if (c11896dyM3893k4 == null) {
            return null;
        }
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55763k4(f, f);
        c11896dyM3893k4.m55577x1(c11913yj);
        if (b == 5) {
            C12026yj c12026yj = new C12026yj(C12003du.m56460uz().Clone(), f);
            c12026yj.m56932to(2);
            c12026yj.m56909du(2);
            c11896dyM3893k4.m55549k4(c12026yj);
        }
        return c11896dyM3893k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3929x1(byte b) {
        this.f4058ne = b;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11896dy m3893k4(byte b, byte b2, byte b3, float[] fArr) {
        float f;
        fArr[0] = 0.0f;
        if (b == 0) {
            return null;
        }
        C11896dy c11896dy = new C11896dy(1);
        float f2 = (1 << b2) + 1.0f;
        float f3 = (1 << b3) + 1.0f;
        if (b == 1) {
            c11896dy.m55564kk(f4043jd);
            c11896dy.m55567m9();
            f = 0.9f;
        } else if (b != 2) {
            f = 0.3f;
            if (b == 3) {
                c11896dy.m55564kk(f4042fa);
            } else if (b == 4) {
                c11896dy.m55534k4(-5.0f, -5.0f, 10.0f, 10.0f);
            } else {
                if (b != 5) {
                    return null;
                }
                float f4 = f4049yj[b2];
                float f5 = f4047up[b3];
                float fM67496rv = (float) ((C14116yg.m67496rv((f4 * f4) + (f5 * f5)) / 2.0d) / ((double) f5));
                float f6 = -fM67496rv;
                float f7 = ((f6 - f4) * 10.0f) / f2;
                float f8 = (f6 * 10.0f) / f2;
                c11896dy.m55574x1(((-f5) * 10.0f) / f3, f7, 0.0f, f8);
                c11896dy.m55574x1(0.0f, f8, (f5 * 10.0f) / f3, f7);
                f = fM67496rv / f2;
            }
            c11896dy.m55567m9();
        } else {
            c11896dy.m55564kk(f4040ck);
            c11896dy.m55567m9();
            f = 0.55f;
        }
        fArr[0] = f * f2;
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55763k4(f3 / 10.0f, f2 / 10.0f);
        c11896dy.m55577x1(c11913yj);
        return c11896dy;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11898h4 m3894k4(byte b, byte b2, byte b3) {
        float[] fArr = {0.0f};
        C11896dy c11896dyM3893k4 = m3893k4(b, b2, b3, fArr);
        float f = fArr[0];
        if (c11896dyM3893k4 == null) {
            return null;
        }
        if (b != 5) {
            return new C11898h4(c11896dyM3893k4, null, 3, f);
        }
        C11898h4 c11898h4 = new C11898h4(null, c11896dyM3893k4, 2, f);
        c11898h4.m55604k4(2, 2);
        return c11898h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3908k4(byte b) {
        this.f4060rv = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3909k4(double d) {
        this.f4056ks = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3910k4(C12003du c12003du) {
        this.f4054h4 = new C0962es(c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m3895k4(skr skrVar) {
        if (skrVar == null) {
            return;
        }
        this.f4056ks = skrVar.getWidth();
        this.f4060rv = skrVar.getStyle();
        this.f4055ix = skrVar.getBeginArrowheadStyle();
        this.f4061u4 = skrVar.getEndArrowheadStyle();
        this.f4063uz = skrVar.getBeginArrowheadLength();
        this.f4064wl = skrVar.getEndArrowheadLength();
        this.f4059qq = skrVar.getBeginArrowheadWidth();
        this.f4050ar = skrVar.getEndArrowheadWidth();
        this.f4051bv = skrVar.getCapStyle();
        this.f4062um = skrVar.getJoinStyle();
        this.f4058ne = skrVar.getDashStyle();
        if (skrVar.getDashStyle() == 11) {
            m3912k4(skrVar.getCustomDashPattern());
        }
        skrVar.getFillFormat();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3911k4(boolean z) {
        this.f4065x6 = z ? (short) 1 : (short) 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3912k4(float[] fArr) {
        this.f4052c5 = fArr;
    }
}

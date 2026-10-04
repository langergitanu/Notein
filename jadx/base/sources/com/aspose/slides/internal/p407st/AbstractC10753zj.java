package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p138fu.C4129ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.zj */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10753zj extends AbstractC10657tu {

    /* JADX INFO: renamed from: c5 */
    protected byte f37574c5;

    /* JADX INFO: renamed from: du */
    int f37575du;

    /* JADX INFO: renamed from: dy */
    int f37576dy;

    /* JADX INFO: renamed from: h4 */
    int f37577h4;

    /* JADX INFO: renamed from: k4 */
    protected long f37578k4;

    /* JADX INFO: renamed from: kk */
    int f37579kk;

    /* JADX INFO: renamed from: m9 */
    int f37580m9;

    /* JADX INFO: renamed from: to */
    int f37581to;

    /* JADX INFO: renamed from: x1 */
    int f37582x1;

    public AbstractC10753zj(int i, short s) {
        super(i, (byte) 0);
        m51409um().m51917k4(i);
        m51409um().m51920k4(s);
    }

    /* JADX INFO: renamed from: du */
    public final int m52157du() {
        return this.f37577h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m52158h4() {
        return this.f37580m9;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10657tu, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return m51779m9().m66539k4().length + 34 + m51776dy().length;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10657tu
    /* JADX INFO: renamed from: kk */
    public byte[] mo50778kk() {
        int i = this.f37576dy;
        if (i == 0) {
            return C4129ks.m16569k4(m51776dy(), 0, 1);
        }
        if (i != 254) {
            return null;
        }
        return m51776dy();
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m52160to() {
        C3152yj c3152yj = new C3152yj();
        if (m51775c5() != 2) {
            byte[] bArrM52161x1 = m52161x1();
            c3152yj.write(bArrM52161x1, 0, bArrM52161x1.length);
        }
        m52159k4(c3152yj);
        return c3152yj.toArray();
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m52161x1() {
        int i;
        byte[] bArr = new byte[22];
        C3110yd.m13244k4(bArr, 0, 2596720087L);
        C3110yd.m13243k4(bArr, 4, 0);
        C3110yd.m13243k4(bArr, 6, this.f37582x1);
        int i2 = (this.f37582x1 & 65535) ^ 22289;
        C3110yd.m13243k4(bArr, 8, this.f37579kk);
        int i3 = (i2 & 65535) ^ (this.f37579kk & 65535);
        C3110yd.m13243k4(bArr, 10, this.f37581to);
        int i4 = (i3 & 65535) ^ (this.f37581to & 65535);
        C3110yd.m13243k4(bArr, 12, this.f37575du);
        int i5 = (i4 & 65535) ^ (this.f37575du & 65535);
        if (this.f37577h4 == 0 || this.f37580m9 == 0) {
            i = 96;
        } else {
            long jM27461m9 = (C7019kk.m27461m9(1828800, 9) * C7019kk.m27461m9(Integer.valueOf(this.f37581to - this.f37582x1), 9)) / (((long) this.f37577h4) & 4294967295L);
            long jM27461m92 = (C7019kk.m27461m9(1828800, 9) * C7019kk.m27461m9(Integer.valueOf(this.f37575du - this.f37579kk), 9)) / (((long) this.f37580m9) & 4294967295L);
            i = (((((int) (jM27461m9 + (jM27461m9 & 1))) >> 1) + (((int) (jM27461m92 + (1 & jM27461m92))) >> 1)) >> 1) & 65535;
        }
        int i6 = i & 65535;
        C3110yd.m13243k4(bArr, 14, i6);
        C3110yd.m13243k4(bArr, 16, 0);
        C3110yd.m13243k4(bArr, 18, 0);
        C3110yd.m13243k4(bArr, 20, ((i5 & 65535) ^ i6) & 65535);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10753zj m52153k4(C3989up c3989up, int i, int i2, AbstractC3150x6 abstractC3150x6) {
        AbstractC10753zj c10596pt;
        int i3;
        C3152yj c3152yj;
        int length = (int) abstractC3150x6.getLength();
        byte[] bArr = new byte[length];
        abstractC3150x6.read(bArr, 0, length);
        try {
            if (!C3099wl.m13194kk(bArr)) {
                c10596pt = new C10596pt();
                int iM13257x1 = C3110yd.m13257x1(bArr, 0);
                int iM13257x12 = C3110yd.m13257x1(bArr, 2);
                if (iM13257x1 == 52695 && iM13257x12 == 39622) {
                    i3 = 22;
                }
                c3152yj = new C3152yj(bArr, i3, length - i3, false);
                c10596pt.m51778k4(C4129ks.m16566k4(c3152yj, 1));
                c3152yj.dispose();
                c10596pt.f37578k4 = ((long) length) & 4294967295L;
                C12014ne c12014neClone = c3989up.m15754k4().m15765k4().Clone();
                c10596pt.f37582x1 = c12014neClone.m56681to();
                c10596pt.f37579kk = c12014neClone.m56666dy();
                c10596pt.f37581to = c12014neClone.m56668h4();
                c10596pt.f37575du = c12014neClone.m56670k4();
                c10596pt.f37577h4 = i;
                c10596pt.f37580m9 = i2;
                c10596pt.f37576dy = 0;
                c10596pt.f37574c5 = (byte) -2;
                c10596pt.m51780x1(bArr);
                return c10596pt;
            }
            c10596pt = new C10440fj();
            c10596pt.m51778k4(C4129ks.m16566k4(c3152yj, 1));
            c3152yj.dispose();
            c10596pt.f37578k4 = ((long) length) & 4294967295L;
            C12014ne c12014neClone2 = c3989up.m15754k4().m15765k4().Clone();
            c10596pt.f37582x1 = c12014neClone2.m56681to();
            c10596pt.f37579kk = c12014neClone2.m56666dy();
            c10596pt.f37581to = c12014neClone2.m56668h4();
            c10596pt.f37575du = c12014neClone2.m56670k4();
            c10596pt.f37577h4 = i;
            c10596pt.f37580m9 = i2;
            c10596pt.f37576dy = 0;
            c10596pt.f37574c5 = (byte) -2;
            c10596pt.m51780x1(bArr);
            return c10596pt;
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
        i3 = 0;
        c3152yj = new C3152yj(bArr, i3, length - i3, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10753zj m52154k4(C3989up c3989up, AbstractC3150x6 abstractC3150x6) {
        C12014ne c12014neClone = c3989up.m15754k4().m15765k4().Clone();
        return m52153k4(c3989up, c12014neClone.m56663c5() * 12700, c12014neClone.m56683x1() * 12700, abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10753zj m52155k4(AbstractC12536x1 abstractC12536x1, int i, int i2, AbstractC3150x6 abstractC3150x6) {
        AbstractC10753zj c10596pt;
        int i3;
        C3152yj c3152yj;
        int length = (int) abstractC3150x6.getLength();
        byte[] bArr = new byte[length];
        abstractC3150x6.read(bArr, 0, length);
        try {
            if (!C3099wl.m13194kk(bArr)) {
                c10596pt = new C10596pt();
                int iM13257x1 = C3110yd.m13257x1(bArr, 0);
                int iM13257x12 = C3110yd.m13257x1(bArr, 2);
                if (iM13257x1 == 52695 && iM13257x12 == 39622) {
                    i3 = 22;
                }
                c3152yj = new C3152yj(bArr, i3, length - i3, false);
                c10596pt.m51778k4(C4129ks.m16566k4(c3152yj, 1));
                c3152yj.dispose();
                c10596pt.f37578k4 = ((long) length) & 4294967295L;
                C12014ne c12014neClone = abstractC12536x1.mo13623kk().Clone();
                c10596pt.f37582x1 = c12014neClone.m56681to();
                c10596pt.f37579kk = c12014neClone.m56666dy();
                c10596pt.f37581to = c12014neClone.m56668h4();
                c10596pt.f37575du = c12014neClone.m56670k4();
                c10596pt.f37577h4 = i;
                c10596pt.f37580m9 = i2;
                c10596pt.f37576dy = 0;
                c10596pt.f37574c5 = (byte) -2;
                c10596pt.m51780x1(bArr);
                return c10596pt;
            }
            c10596pt = new C10440fj();
            c10596pt.m51778k4(C4129ks.m16566k4(c3152yj, 1));
            c3152yj.dispose();
            c10596pt.f37578k4 = ((long) length) & 4294967295L;
            C12014ne c12014neClone2 = abstractC12536x1.mo13623kk().Clone();
            c10596pt.f37582x1 = c12014neClone2.m56681to();
            c10596pt.f37579kk = c12014neClone2.m56666dy();
            c10596pt.f37581to = c12014neClone2.m56668h4();
            c10596pt.f37575du = c12014neClone2.m56670k4();
            c10596pt.f37577h4 = i;
            c10596pt.f37580m9 = i2;
            c10596pt.f37576dy = 0;
            c10596pt.f37574c5 = (byte) -2;
            c10596pt.m51780x1(bArr);
            return c10596pt;
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
        i3 = 0;
        c3152yj = new C3152yj(bArr, i3, length - i3, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10753zj m52156k4(AbstractC12536x1 abstractC12536x1, AbstractC3150x6 abstractC3150x6) {
        C12014ne c12014neClone = abstractC12536x1.mo13623kk().Clone();
        return m52155k4(abstractC12536x1, c12014neClone.m56663c5() * 12700, c12014neClone.m56683x1() * 12700, abstractC3150x6);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int position = (int) c3134k4.m13371ck().getPosition();
        if ((m51409um().m51922kk() & 1) > 0) {
            c3134k4.m13372dy(16);
            m51409um().m51920k4((short) (m51409um().m51922kk() & (-2)));
        }
        m51777k4(AbstractC10657tu.m51774x1(c3134k4).Clone());
        this.f37578k4 = c3134k4.m13384uz();
        this.f37582x1 = c3134k4.m13386x6();
        this.f37579kk = c3134k4.m13386x6();
        this.f37581to = c3134k4.m13386x6();
        this.f37575du = c3134k4.m13386x6();
        this.f37577h4 = c3134k4.m13386x6();
        this.f37580m9 = c3134k4.m13386x6();
        int iM13386x6 = c3134k4.m13386x6();
        this.f37576dy = c3134k4.m13387yj() & 255;
        this.f37574c5 = c3134k4.m13387yj();
        m51778k4(c3134k4.m13372dy(iM13386x6));
        c3134k4.m13371ck().setPosition(((long) position) + ((long) m51409um().m51914du()));
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13450k4(m51779m9().m66539k4());
        c3149x1.m13447k4(this.f37578k4 & 4294967295L);
        c3149x1.m13455x1(this.f37582x1);
        c3149x1.m13455x1(this.f37579kk);
        c3149x1.m13455x1(this.f37581to);
        c3149x1.m13455x1(this.f37575du);
        c3149x1.m13455x1(this.f37577h4);
        c3149x1.m13455x1(this.f37580m9);
        c3149x1.m13455x1(m51776dy().length);
        c3149x1.m13443k4((byte) this.f37576dy);
        c3149x1.m13443k4(this.f37574c5);
        c3149x1.m13450k4(m51776dy());
    }

    /* JADX INFO: renamed from: k4 */
    public void m52159k4(AbstractC3150x6 abstractC3150x6) {
        int i = this.f37576dy;
        if (i == 0) {
            byte[] bArrM16569k4 = C4129ks.m16569k4(m51776dy(), 0, 1);
            abstractC3150x6.write(bArrM16569k4, 0, bArrM16569k4.length);
        } else {
            if (i != 254) {
                throw new Exception("Unknown metafile compression method.");
            }
            abstractC3150x6.write(m51776dy(), 0, m51776dy().length);
        }
    }
}

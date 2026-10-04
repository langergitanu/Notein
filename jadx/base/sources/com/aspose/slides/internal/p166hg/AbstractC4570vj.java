package com.aspose.slides.internal.p166hg;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p174hz.AbstractC4703bz;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4713f9;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.AbstractC4745rv;
import com.aspose.slides.internal.p174hz.AbstractC4771y2;
import com.aspose.slides.internal.p174hz.AbstractC4778yw;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12819c5;
import com.aspose.slides.internal.p525yi.C12827k4;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.vj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4570vj {

    /* JADX INFO: renamed from: k4 */
    public static byte[] f12762k4 = new byte[0];

    /* JADX INFO: renamed from: c5 */
    private byte f12763c5;

    /* JADX INFO: renamed from: ck */
    private byte f12764ck;

    /* JADX INFO: renamed from: du */
    private int f12765du;

    /* JADX INFO: renamed from: dy */
    private int f12766dy;

    /* JADX INFO: renamed from: fa */
    private short f12767fa;

    /* JADX INFO: renamed from: h4 */
    private int f12768h4;

    /* JADX INFO: renamed from: ix */
    private InterfaceC4752ts f12769ix;

    /* JADX INFO: renamed from: jd */
    private int f12770jd;

    /* JADX INFO: renamed from: kk */
    private String f12771kk;

    /* JADX INFO: renamed from: ks */
    private AbstractC4523ai f12772ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f12773m9;

    /* JADX INFO: renamed from: ne */
    private AbstractC4736my f12774ne;

    /* JADX INFO: renamed from: rv */
    private AbstractC4736my f12775rv;

    /* JADX INFO: renamed from: to */
    private int f12776to;

    /* JADX INFO: renamed from: u4 */
    private AbstractC4703bz f12777u4;

    /* JADX INFO: renamed from: up */
    private byte f12778up;

    /* JADX INFO: renamed from: uz */
    private AbstractC4703bz f12779uz;

    /* JADX INFO: renamed from: x1 */
    private short f12780x1;

    /* JADX INFO: renamed from: x6 */
    private InterfaceC4752ts f12781x6;

    /* JADX INFO: renamed from: yj */
    private byte f12782yj;

    public AbstractC4570vj(short s, String str, int i, int i2, int i3, boolean z, boolean z2, byte b, byte b2, short s2, byte b3, byte b4) {
        this.f12780x1 = s;
        this.f12771kk = str;
        this.f12776to = i;
        this.f12765du = i2;
        this.f12768h4 = i3;
        this.f12773m9 = z;
        if (z2) {
            this.f12766dy = 1;
        }
        this.f12763c5 = b;
        this.f12764ck = b2;
        this.f12767fa = s2;
        this.f12778up = b3;
        this.f12782yj = b4;
        this.f12770jd = (C7019kk.m27462to(Byte.valueOf(this.f12778up), 6) + (m18897m9() + C7019kk.m27462to(Byte.valueOf(b), 6))) << 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX INFO: renamed from: u4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m18878u4() {
        AbstractC4736my abstractC4736myM19718kk;
        int i;
        int i2 = this.f12776to;
        if (i2 == 0) {
            abstractC4736myM19718kk = AbstractC4745rv.m19718kk();
        } else if (i2 == 6) {
            abstractC4736myM19718kk = AbstractC4778yw.m19839kk();
        } else if (i2 == 2) {
            abstractC4736myM19718kk = AbstractC4713f9.m19606kk();
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    abstractC4736myM19718kk = AbstractC4771y2.m19823kk();
                }
                i = this.f12766dy;
                if (i == 1) {
                    this.f12775rv.m19687kk(i);
                    this.f12775rv.m19691to(1);
                    this.f12775rv.mo19609k4(C7019kk.m27462to(Byte.valueOf(this.f12764ck), 6) * 8);
                    this.f12775rv.m19695x1(C7019kk.m27462to(Byte.valueOf(this.f12782yj), 6) * 8);
                }
                if (C7019kk.m27469x1(this.f12772ks, C4562tq.class)) {
                    this.f12775rv.mo19688kk(this.f12772ks.m18675v4());
                    this.f12775rv.mo19692to(this.f12772ks.m18685yd());
                } else {
                    this.f12775rv.mo19688kk(this.f12772ks.m18628bv());
                    this.f12775rv.mo19692to(this.f12772ks.m18660lr());
                }
                this.f12781x6 = this.f12775rv.m19689ks();
                if (C7019kk.m27469x1(this.f12772ks, C4562tq.class)) {
                    this.f12779uz = new C12819c5(m18885h4(), this.f12772ks.m18684xk().m18757kk());
                    return;
                } else {
                    this.f12777u4 = new C12819c5(m18885h4(), this.f12772ks.m18684xk().m18760x1());
                    return;
                }
            }
            abstractC4736myM19718kk = new C12827k4();
        }
        this.f12775rv = abstractC4736myM19718kk;
        i = this.f12766dy;
        if (i == 1) {
        }
        if (C7019kk.m27469x1(this.f12772ks, C4562tq.class)) {
        }
        this.f12781x6 = this.f12775rv.m19689ks();
        if (C7019kk.m27469x1(this.f12772ks, C4562tq.class)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX INFO: renamed from: uz */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m18879uz() {
        AbstractC4736my abstractC4736myM19718kk;
        int i;
        int i2 = this.f12776to;
        if (i2 == 0) {
            abstractC4736myM19718kk = AbstractC4745rv.m19718kk();
        } else if (i2 == 6) {
            abstractC4736myM19718kk = AbstractC4778yw.m19839kk();
        } else if (i2 == 2) {
            abstractC4736myM19718kk = AbstractC4713f9.m19606kk();
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    abstractC4736myM19718kk = AbstractC4771y2.m19823kk();
                }
                i = this.f12766dy;
                if (i == 1) {
                    this.f12774ne.m19687kk(i);
                    this.f12774ne.m19691to(1);
                    this.f12774ne.mo19609k4(C7019kk.m27462to(Byte.valueOf(this.f12764ck), 6) * 8);
                    this.f12774ne.m19695x1(C7019kk.m27462to(Byte.valueOf(this.f12782yj), 6) * 8);
                }
                if (C7019kk.m27469x1(this.f12772ks, C4562tq.class)) {
                    this.f12774ne.mo19688kk(this.f12772ks.m18628bv());
                    this.f12774ne.mo19692to(this.f12772ks.m18660lr());
                } else {
                    this.f12774ne.mo19688kk(this.f12772ks.m18675v4());
                    this.f12774ne.mo19692to(this.f12772ks.m18685yd());
                }
                this.f12769ix = this.f12774ne.m19696yj();
                if (C7019kk.m27469x1(this.f12772ks, C4562tq.class)) {
                    this.f12777u4 = new C12819c5(m18885h4(), this.f12772ks.m18684xk().m18760x1());
                    return;
                } else {
                    this.f12779uz = new C12819c5(m18885h4(), this.f12772ks.m18684xk().m18757kk());
                    return;
                }
            }
            abstractC4736myM19718kk = new C12827k4();
        }
        this.f12774ne = abstractC4736myM19718kk;
        i = this.f12766dy;
        if (i == 1) {
        }
        if (C7019kk.m27469x1(this.f12772ks, C4562tq.class)) {
        }
        this.f12769ix = this.f12774ne.m19696yj();
        if (C7019kk.m27469x1(this.f12772ks, C4562tq.class)) {
        }
    }

    /* JADX INFO: renamed from: c5 */
    public int m18880c5() {
        return this.f12766dy;
    }

    /* JADX INFO: renamed from: ck */
    public String m18881ck() {
        return this.f12771kk;
    }

    /* JADX INFO: renamed from: du */
    public AbstractC4703bz m18882du() {
        return this.f12779uz;
    }

    /* JADX INFO: renamed from: dy */
    public int m18883dy() {
        return this.f12768h4;
    }

    /* JADX INFO: renamed from: fa */
    public boolean m18884fa() {
        return this.f12773m9;
    }

    /* JADX INFO: renamed from: h4 */
    public AbstractC4705c6 m18885h4() {
        int i = this.f12765du;
        if (i == 0) {
            return AbstractC4715g8.m19610du();
        }
        if (i != 2) {
            return null;
        }
        return AbstractC4739nv.m19710du();
    }

    /* JADX INFO: renamed from: ix */
    public byte[] m18886ix() {
        AbstractC4523ai abstractC4523ai = this.f12772ks;
        C4562tq c4562tq = (C4562tq) abstractC4523ai;
        byte[] bArrM18669to = abstractC4523ai.m18669to(48);
        bArrM18669to[0] = C7019kk.m27442k4(Integer.valueOf(c4562tq.m18844x1() >> 8), 9);
        bArrM18669to[1] = C7019kk.m27442k4(Short.valueOf(c4562tq.m18844x1()), 7);
        return bArrM18669to;
    }

    /* JADX INFO: renamed from: jd */
    public short m18887jd() {
        return this.f12780x1;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo18733k4();

    /* JADX INFO: renamed from: k4 */
    public void m18888k4(AbstractC4523ai abstractC4523ai) {
        this.f12772ks = abstractC4523ai;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo18734k4(byte[] bArr);

    /* JADX INFO: renamed from: k4 */
    public abstract byte[] mo18735k4(byte b, byte[] bArr);

    /* JADX INFO: renamed from: kk */
    public InterfaceC4752ts m18895kk() {
        return this.f12769ix;
    }

    /* JADX INFO: renamed from: ks */
    public byte m18896ks() {
        return this.f12764ck;
    }

    /* JADX INFO: renamed from: m9 */
    public int m18897m9() {
        int i = this.f12765du;
        if (i != 0) {
            return i != 2 ? 0 : 20;
        }
        return 16;
    }

    /* JADX INFO: renamed from: ne */
    public void m18898ne() {
        m18878u4();
        m18879uz();
    }

    /* JADX INFO: renamed from: rv */
    public byte m18899rv() {
        return this.f12778up;
    }

    /* JADX INFO: renamed from: to */
    public AbstractC4703bz m18900to() {
        return this.f12777u4;
    }

    /* JADX INFO: renamed from: up */
    public byte m18901up() {
        return this.f12763c5;
    }

    /* JADX INFO: renamed from: x1 */
    public InterfaceC4752ts m18902x1() {
        return this.f12781x6;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract byte[] mo18736x1(byte b, byte[] bArr);

    /* JADX INFO: renamed from: x6 */
    public AbstractC4523ai m18903x6() {
        return this.f12772ks;
    }

    /* JADX INFO: renamed from: yj */
    public int m18904yj() {
        return this.f12770jd;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18889k4(byte[] bArr, int i, long j) {
        if (i > bArr.length - 8) {
            throw new ArgumentException("offset");
        }
        bArr[i] = C7019kk.m27442k4(Long.valueOf(j >> 56), 12);
        bArr[i + 1] = C7019kk.m27442k4(Long.valueOf(j >> 48), 12);
        bArr[i + 2] = C7019kk.m27442k4(Long.valueOf(j >> 40), 12);
        bArr[i + 3] = C7019kk.m27442k4(Long.valueOf(j >> 32), 12);
        bArr[i + 4] = C7019kk.m27442k4(Long.valueOf(j >> 24), 12);
        bArr[i + 5] = C7019kk.m27442k4(Long.valueOf(j >> 16), 12);
        bArr[i + 6] = C7019kk.m27442k4(Long.valueOf(j >> 8), 12);
        bArr[i + 7] = C7019kk.m27442k4(Long.valueOf(j), 12);
    }

    /* JADX INFO: renamed from: k4 */
    public void m18890k4(byte[] bArr, int i, short s) {
        if (i > bArr.length - 2) {
            throw new ArgumentException("offset");
        }
        bArr[i] = C7019kk.m27442k4(Integer.valueOf(s >> 8), 9);
        bArr[i + 1] = C7019kk.m27442k4(Short.valueOf(s), 7);
    }

    /* JADX INFO: renamed from: k4 */
    public void m18891k4(byte[] bArr, byte[][] bArr2, byte[][] bArr3) {
        int length;
        m18895kk().mo19562k4(bArr, 0, bArr.length, bArr, 0);
        if (m18880c5() == 1) {
            length = (bArr.length - (C7019kk.m27462to(Byte.valueOf(bArr[bArr.length - 1]), 6) + 1)) - m18897m9();
        } else {
            length = bArr.length - m18897m9();
        }
        bArr2[0] = new byte[length];
        bArr3[0] = new byte[m18897m9()];
        byte[] bArr4 = bArr2[0];
        C14058fa.m66596k4(bArr, 0, bArr4, 0, bArr4.length);
        int length2 = bArr2[0].length;
        byte[] bArr5 = bArr3[0];
        C14058fa.m66596k4(bArr, length2, bArr5, 0, bArr5.length);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m18892k4(AbstractC4705c6 abstractC4705c6, byte[] bArr, byte[] bArr2, int i) {
        int iM19587up = abstractC4705c6.m19587up() / 8;
        int i2 = i / iM19587up;
        if (i % iM19587up > 0) {
            i2++;
        }
        C12819c5 c12819c5 = new C12819c5(abstractC4705c6, bArr);
        C4540gi c4540gi = new C4540gi();
        byte[][] bArr3 = new byte[i2 + 1][];
        bArr3[0] = bArr2;
        for (int i3 = 1; i3 <= i2; i3++) {
            C4540gi c4540gi2 = new C4540gi();
            byte[] bArr4 = bArr3[i3 - 1];
            c12819c5.mo19564k4(bArr4, 0, bArr4.length);
            byte[] bArrM19584fa = c12819c5.m19584fa();
            bArr3[i3] = bArrM19584fa;
            c4540gi2.m18742k4(bArrM19584fa);
            c4540gi2.m18742k4(bArr2);
            c12819c5.mo19564k4(c4540gi2.m18739h4(), 0, C7019kk.m27462to(Long.valueOf(c4540gi2.getLength()), 11));
            c4540gi.m18742k4(c12819c5.m19584fa());
            c4540gi2.m18738du();
        }
        byte[] bArr5 = new byte[i];
        C14058fa.m66596k4(c4540gi.m18739h4(), 0, bArr5, 0, i);
        c4540gi.m18738du();
        return bArr5;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m18893k4(byte[] bArr, String str, byte[] bArr2, int i) {
        int length = bArr.length >> 1;
        if ((bArr.length & 1) == 1) {
            length++;
        }
        C4540gi c4540gi = new C4540gi();
        c4540gi.m18742k4(AbstractC6747ar.m26650yj().mo26677to(str));
        c4540gi.m18742k4(bArr2);
        byte[] bArrM18739h4 = c4540gi.m18739h4();
        c4540gi.m18738du();
        byte[] bArr3 = new byte[length];
        C14058fa.m66596k4(bArr, 0, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        C14058fa.m66596k4(bArr, bArr.length - length, bArr4, 0, length);
        byte[] bArrM18892k4 = m18892k4(AbstractC4715g8.m19610du(), bArr3, bArrM18739h4, i);
        byte[] bArrM18892k42 = m18892k4(AbstractC4739nv.m19710du(), bArr4, bArrM18739h4, i);
        byte[] bArr5 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr5[i2] = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArrM18892k4[i2]), 6) ^ C7019kk.m27462to(Byte.valueOf(bArrM18892k42[i2]), 6)), 9);
        }
        return bArr5;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m18894k4(byte[] bArr, byte[] bArr2) {
        int iM27462to;
        int length = bArr.length + bArr2.length;
        if (m18880c5() == 1) {
            int i = length + 1;
            iM27462to = C7019kk.m27462to(Byte.valueOf(this.f12782yj), 6) - (i % C7019kk.m27462to(Byte.valueOf(this.f12782yj), 6));
            if (iM27462to == C7019kk.m27462to(Byte.valueOf(this.f12782yj), 6)) {
                iM27462to = 0;
            }
            length = i + iM27462to;
        } else {
            iM27462to = 0;
        }
        int i2 = length;
        byte[] bArr3 = new byte[i2];
        C14058fa.m66596k4(bArr, 0, bArr3, 0, bArr.length);
        C14058fa.m66596k4(bArr2, 0, bArr3, bArr.length, bArr2.length);
        if (iM27462to > 0) {
            int length2 = bArr.length + bArr2.length;
            for (int i3 = length2; i3 < length2 + iM27462to + 1; i3++) {
                bArr3[i3] = C7019kk.m27442k4(Integer.valueOf(iM27462to), 9);
            }
        }
        m18902x1().mo19562k4(bArr3, 0, i2, bArr3, 0);
        return bArr3;
    }
}

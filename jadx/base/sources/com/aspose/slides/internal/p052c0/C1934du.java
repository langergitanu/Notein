package com.aspose.slides.internal.p052c0;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p339pk.AbstractC9448ck;
import com.aspose.slides.internal.p339pk.AbstractC9451fa;
import com.aspose.slides.internal.p339pk.C9455kk;
import com.aspose.slides.internal.p339pk.C9462x6;
import com.aspose.slides.internal.p372qx.C9963x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.c0.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1934du extends AbstractC9448ck {

    /* JADX INFO: renamed from: k4 */
    private AbstractC9451fa f6859k4;

    /* JADX INFO: renamed from: x1 */
    private float f6863x1 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: kk */
    private float f6860kk = Float.MAX_VALUE;

    /* JADX INFO: renamed from: to */
    private float f6862to = -3.4028235E38f;

    /* JADX INFO: renamed from: du */
    private float f6857du = -3.4028235E38f;

    /* JADX INFO: renamed from: h4 */
    private boolean f6858h4 = false;

    /* JADX INFO: renamed from: m9 */
    private int f6861m9 = 0;

    public C1934du(AbstractC9451fa abstractC9451fa) {
        this.f6859k4 = abstractC9451fa;
    }

    /* JADX INFO: renamed from: ks */
    private static void m9927ks() {
        throw new InvalidOperationException("Metafile size scanning is expected to be used for WMF only.");
    }

    /* JADX INFO: renamed from: rv */
    private float m9929rv() {
        C4320jd c4320jdM46354x1 = this.f6859k4.m46282du().m46354x1();
        if (c4320jdM46354x1 != null) {
            return c4320jdM46354x1.m17375x1() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m9931x1(C12025x6 c12025x6) {
        if (c12025x6.m56897x1() > 0.0f && c12025x6.m56895kk() >= 0.0f) {
            return 1;
        }
        if (c12025x6.m56897x1() > 0.0f || c12025x6.m56895kk() <= 0.0f) {
            return (c12025x6.m56897x1() >= 0.0f || c12025x6.m56895kk() > 0.0f) ? 4 : 3;
        }
        return 2;
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: c5 */
    public void mo9934c5() {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: du */
    public void mo9935du() {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: dy */
    public void mo9936dy() {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: h4 */
    public void mo9937h4() {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9938k4(int i) {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: kk */
    public void mo9955kk() {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: m9 */
    public void mo9959m9() {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: to */
    public void mo9960to() {
        m9927ks();
    }

    /* JADX INFO: renamed from: up */
    public final boolean m9962up() {
        return this.f6858h4;
    }

    /* JADX INFO: renamed from: yj */
    public final int m9970yj() {
        return this.f6861m9;
    }

    /* JADX INFO: renamed from: m9 */
    private void m9928m9(C12007ix c12007ix) {
        m9952k4(new C12025x6[]{new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck())}, m9929rv());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9939k4(C9462x6 c9462x6, C4320jd c4320jd, C4328x1 c4328x1) {
        m9928m9(c9462x6.m46457kk().Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: kk */
    public void mo9956kk(C12007ix c12007ix) {
        m9928m9(c12007ix.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: to */
    public void mo9961to(C12007ix c12007ix) {
        m9928m9(c12007ix.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12007ix m9963x1() {
        return C12007ix.m56541k4(this.f6863x1, this.f6860kk, this.f6862to, this.f6857du);
    }

    /* JADX INFO: renamed from: to */
    private void m9930to(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        C12025x6 c12025x63;
        float fM9929rv = m9929rv();
        m9952k4(new C12025x6[]{c12025x6, c12025x62}, fM9929rv);
        C12025x6 c12025x64 = new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck());
        C12025x6 c12025x65 = new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck());
        C12025x6 c12025x66 = new C12025x6((c12025x65.m56897x1() + c12025x64.m56897x1()) / 2.0f, (c12025x65.m56895kk() + c12025x64.m56895kk()) / 2.0f);
        C12025x6 c12025x67 = new C12025x6(c12025x6.m56897x1() - c12025x66.m56897x1(), c12025x6.m56895kk() - c12025x66.m56895kk());
        C12025x6 c12025x68 = new C12025x6(c12025x62.m56897x1() - c12025x66.m56897x1(), c12025x62.m56895kk() - c12025x66.m56895kk());
        int iM9931x1 = m9931x1(c12025x67.Clone());
        int iM9931x12 = m9931x1(c12025x68.Clone());
        if (iM9931x1 != 1) {
            if (iM9931x1 != 2) {
                if (iM9931x1 != 3) {
                    if (iM9931x1 != 4) {
                        throw new InvalidOperationException("Unknown quarter.");
                    }
                    if (iM9931x12 == 1) {
                        c12025x63 = new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk());
                    } else if (iM9931x12 == 2) {
                        m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk()), fM9929rv);
                        c12025x63 = new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk());
                    } else if (iM9931x12 == 3) {
                        m9946k4(new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                        m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk()), fM9929rv);
                        c12025x63 = new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk());
                    } else {
                        if (iM9931x12 != 4) {
                            throw new InvalidOperationException("Unknown quarter.");
                        }
                        if (c12025x68.m56897x1() > c12025x67.m56897x1() && c12025x68.m56895kk() < c12025x67.m56895kk()) {
                            return;
                        }
                        m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk()), fM9929rv);
                        m9946k4(new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                        m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk()), fM9929rv);
                        c12025x63 = new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk());
                    }
                } else if (iM9931x12 == 1) {
                    m9946k4(new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                    c12025x63 = new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk());
                } else if (iM9931x12 == 2) {
                    m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk()), fM9929rv);
                    m9946k4(new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                    c12025x63 = new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk());
                } else if (iM9931x12 != 3) {
                    if (iM9931x12 != 4) {
                        throw new InvalidOperationException("Unknown quarter.");
                    }
                    c12025x63 = new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk());
                } else {
                    if (c12025x68.m56897x1() > c12025x67.m56897x1() && c12025x68.m56895kk() > c12025x67.m56895kk()) {
                        return;
                    }
                    m9946k4(new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                    m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk()), fM9929rv);
                    m9946k4(new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                    c12025x63 = new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk());
                }
            } else if (iM9931x12 == 1) {
                m9946k4(new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk()), fM9929rv);
                c12025x63 = new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk());
            } else if (iM9931x12 != 2) {
                if (iM9931x12 == 3) {
                    c12025x63 = new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk());
                } else {
                    if (iM9931x12 != 4) {
                        throw new InvalidOperationException("Unknown quarter.");
                    }
                    m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk()), fM9929rv);
                    c12025x63 = new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk());
                }
            } else {
                if (c12025x68.m56897x1() < c12025x67.m56897x1() && c12025x68.m56895kk() > c12025x67.m56895kk()) {
                    return;
                }
                m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk()), fM9929rv);
                m9946k4(new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk()), fM9929rv);
                c12025x63 = new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk());
            }
        } else if (iM9931x12 != 1) {
            if (iM9931x12 == 2) {
                c12025x63 = new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk());
            } else if (iM9931x12 == 3) {
                m9946k4(new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                c12025x63 = new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk());
            } else {
                if (iM9931x12 != 4) {
                    throw new InvalidOperationException("Unknown quarter.");
                }
                m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk()), fM9929rv);
                m9946k4(new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk()), fM9929rv);
                c12025x63 = new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk());
            }
        } else {
            if (c12025x68.m56897x1() < c12025x67.m56897x1() && c12025x68.m56895kk() < c12025x67.m56895kk()) {
                return;
            }
            m9946k4(new C12025x6(c12025x65.m56897x1(), c12025x66.m56895kk()), fM9929rv);
            m9946k4(new C12025x6(c12025x66.m56897x1(), c12025x65.m56895kk()), fM9929rv);
            m9946k4(new C12025x6(c12025x64.m56897x1(), c12025x66.m56895kk()), fM9929rv);
            c12025x63 = new C12025x6(c12025x66.m56897x1(), c12025x64.m56895kk());
        }
        m9946k4(c12025x63, fM9929rv);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9940k4(C12007ix c12007ix) {
        m9928m9(c12007ix.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: kk */
    public void mo9957kk(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        m9930to(c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9964x1(int i) {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9941k4(C12007ix c12007ix, C12007ix c12007ix2, C4317dy c4317dy, C5656k4 c5656k4, int i, byte[] bArr) {
        m9927ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: kk */
    public void mo9958kk(C12025x6[] c12025x6Arr) {
        m9952k4(c12025x6Arr, m9929rv());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9965x1(C12007ix c12007ix) {
        m9928m9(c12007ix.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9942k4(C12007ix c12007ix, C12007ix c12007ix2, byte[] bArr) {
        m9928m9(c12007ix2.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9966x1(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        m9930to(c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private void m9932x1(C12025x6 c12025x6, float f) {
        this.f6863x1 = C14116yg.m67504x1(this.f6863x1, c12025x6.m56897x1() - f);
        this.f6860kk = C14116yg.m67504x1(this.f6860kk, c12025x6.m56895kk() - f);
        this.f6862to = C14116yg.m67481k4(this.f6862to, c12025x6.m56897x1() + f);
        this.f6857du = C14116yg.m67481k4(this.f6857du, c12025x6.m56895kk() + f);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9943k4(C12007ix c12007ix, C12015qq c12015qq) {
        m9928m9(c12007ix.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private void m9933x1(C12025x6 c12025x6, String str, short[] sArr) {
        if (sArr != null) {
            this.f6858h4 = true;
        }
        C9455kk c9455kkM46282du = this.f6859k4.m46282du();
        C12015qq c12015qqClone = c9455kkM46282du.m46335k4(str).Clone();
        if ((c9455kkM46282du.m46332jd() & 1) != 0) {
            this.f6859k4.m46304m9().CloneTo(c12025x6);
            this.f6859k4.m46289h4(new C12025x6(c12015qqClone.m56699x1() + c12025x6.m56897x1(), c12025x6.m56895kk()));
        }
        C12015qq c12015qq = new C12015qq(c12015qqClone.m56699x1() + (str.length() * c9455kkM46282du.m46353up()), c12015qqClone.m56697kk());
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 1);
        c12025x6.CloneTo(c12025x6Arr[0]);
        C4317dy c4317dyM49074k4 = C9963x1.m49074k4(c12025x6Arr[0].Clone(), c9455kkM46282du.m46350rv(), c12015qq.Clone(), c9455kkM46282du.m46324du(), c9455kkM46282du.m46332jd(), c9455kkM46282du.m46351to().m46379du());
        c12025x6Arr[0].CloneTo(c12025x6);
        C12025x6[] c12025x6Arr2 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), 4));
        c12025x6Arr2[0] = new C12025x6(c12025x6.m56897x1(), c12025x6.m56895kk());
        c12025x6Arr2[1] = new C12025x6(c12015qq.m56699x1() + c12025x6.m56897x1(), c12025x6.m56895kk());
        c12025x6Arr2[2] = new C12025x6(c12025x6.m56897x1(), (c12015qq.m56697kk() * C14116yg.m67505x1(c12025x6.m56895kk())) + c12025x6.m56895kk());
        c12025x6Arr2[3] = new C12025x6(c12015qq.m56699x1() + c12025x6.m56897x1(), (c12015qq.m56697kk() * C14116yg.m67505x1(c12025x6.m56895kk())) + c12025x6.m56895kk());
        c4317dyM49074k4.m17342k4(c12025x6Arr2);
        m9968x1(c12025x6Arr2, 0.0f);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9944k4(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        m9930to(c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9945k4(C12025x6 c12025x6) {
        m9952k4(new C12025x6[]{this.f6859k4.m46304m9(), c12025x6}, m9929rv());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9946k4(C12025x6 c12025x6, float f) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 1);
        c12025x6.CloneTo(c12025x6Arr[0]);
        this.f6859k4.m46282du().m46350rv().m17342k4(c12025x6Arr);
        c12025x6Arr[0].CloneTo(c12025x6);
        m9932x1(c12025x6.Clone(), f);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9967x1(C12025x6[] c12025x6Arr) {
        m9952k4(c12025x6Arr, m9929rv());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9968x1(C12025x6[] c12025x6Arr, float f) {
        for (C12025x6 c12025x6 : c12025x6Arr) {
            m9932x1(c12025x6.Clone(), f);
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9947k4(C12025x6 c12025x6, C5656k4 c5656k4) {
        m9946k4(c12025x6.Clone(), m9929rv());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9969x1(C12025x6[][] c12025x6Arr) {
        m9954k4(c12025x6Arr, m9929rv());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9948k4(C12025x6 c12025x6, String str) {
        this.f6861m9++;
        m9933x1(c12025x6.Clone(), str, (short[]) null);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9949k4(C12025x6 c12025x6, String str, short[] sArr) {
        this.f6861m9++;
        m9933x1(c12025x6.Clone(), str, sArr);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9950k4(boolean z) {
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9951k4(C12025x6[] c12025x6Arr) {
        m9952k4(c12025x6Arr, m9929rv());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9952k4(C12025x6[] c12025x6Arr, float f) {
        this.f6859k4.m46282du().m46350rv().m17342k4(c12025x6Arr);
        for (C12025x6 c12025x6 : c12025x6Arr) {
            m9932x1(c12025x6.Clone(), f);
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9953k4(C12025x6[][] c12025x6Arr) {
        m9954k4(c12025x6Arr, m9929rv());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9954k4(C12025x6[][] c12025x6Arr, float f) {
        for (C12025x6[] c12025x6Arr2 : c12025x6Arr) {
            m9952k4(c12025x6Arr2, f);
        }
    }
}

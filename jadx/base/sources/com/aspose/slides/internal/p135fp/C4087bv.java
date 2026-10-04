package com.aspose.slides.internal.p135fp;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p225ke.C5667to;
import com.aspose.slides.internal.p279mr.AbstractC6416c5;
import com.aspose.slides.internal.p279mr.C6414bv;
import com.aspose.slides.internal.p279mr.C6437jd;
import com.aspose.slides.internal.p279mr.C6447my;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p381rm.C10019k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p515xz.C12754k4;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.internal.p550zi.C13616v4;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13623yj;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.bv */
/* JADX INFO: loaded from: classes.dex */
class C4087bv implements InterfaceC6902dy {

    /* JADX INFO: renamed from: c5 */
    private final InterfaceC6899c5 f11143c5;

    /* JADX INFO: renamed from: ck */
    private final C13616v4 f11144ck;

    /* JADX INFO: renamed from: dy */
    private final C10019k4 f11146dy;

    /* JADX INFO: renamed from: jd */
    private final C4102rv f11148jd;

    /* JADX INFO: renamed from: m9 */
    private final boolean f11151m9;

    /* JADX INFO: renamed from: k4 */
    private int f11149k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private byte[][] f11153x1 = new byte[C5667to.f15657x1][];

    /* JADX INFO: renamed from: kk */
    private int f11150kk = 1;

    /* JADX INFO: renamed from: to */
    private int f11152to = 0;

    /* JADX INFO: renamed from: du */
    private int f11145du = 0;

    /* JADX INFO: renamed from: h4 */
    private C12014ne f11147h4 = new C12014ne();

    public C4087bv(C10019k4 c10019k4, InterfaceC6899c5 interfaceC6899c5, C13616v4 c13616v4, C4102rv c4102rv) {
        boolean z = false;
        this.f11146dy = c10019k4;
        this.f11143c5 = interfaceC6899c5;
        this.f11148jd = c4102rv;
        this.f11144ck = c13616v4 == null ? c10019k4.m49216to() : c13616v4;
        if (c13616v4 != null && c10019k4.m49216to().m62824k4().m62787kk() != c13616v4.m62824k4().m62787kk()) {
            z = true;
        }
        this.f11151m9 = z;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
    /* JADX INFO: renamed from: k4 */
    public void mo9818k4(C12014ne c12014ne) throws Throwable {
        int i;
        int i2;
        this.f11146dy.m49217x1().m16404ck().m16298h4();
        try {
            C12014ne c12014ne2 = new C12014ne(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
            C10019k4 c10019k4 = this.f11146dy;
            c10019k4.m49210k4(c10019k4.m49217x1().m16404ck(), c12014ne2.Clone(), -1, -1, -1, false);
            this.f11146dy.m49204dy();
            int i3 = 0;
            C12014ne.m56656k4(new C12014ne(0, 0, C7019kk.m27462to(Integer.valueOf(this.f11146dy.m49217x1().m16422to().m16351dy()), 8), C7019kk.m27462to(Integer.valueOf(this.f11146dy.m49217x1().m16422to().m16348c5()), 8)), c12014ne.Clone()).CloneTo(c12014ne);
            int iM56713x1 = c12014ne.m56665du().m56713x1() / (this.f11146dy.m49217x1().m16422to().m16358m9() * 8);
            this.f11152to = C5666m9.m23130x1(C7019kk.m27462to(Integer.valueOf(this.f11146dy.m49217x1().m16422to().m16348c5()), 8), this.f11146dy.m49217x1().m16422to().m16358m9() * 8);
            int iM23130x1 = C5666m9.m23130x1(c12014ne.m56683x1(), this.f11146dy.m49217x1().m16422to().m16358m9() * 8);
            this.f11150kk = iM23130x1;
            int iM23129to = C5666m9.m23129to(C7019kk.m27462to(Integer.valueOf(this.f11146dy.m49217x1().m16422to().m16351dy()), 8), this.f11146dy.m49217x1().m16422to().m16359to() * 8);
            int iM16358m9 = 8 * this.f11146dy.m49217x1().m16422to().m16358m9();
            boolean z = false;
            while (!z) {
                this.f11149k4 = i3;
                int i4 = i3;
                while (true) {
                    i = 1;
                    try {
                        if (i4 >= this.f11146dy.m49217x1().m16422to().m16362x1().length) {
                            break;
                        }
                        this.f11153x1[i4] = new byte[this.f11150kk * iM23129to * iM16358m9];
                        i4++;
                    } catch (OutOfMemoryError e) {
                        int i5 = this.f11150kk;
                        if (i5 == 1) {
                            throw e;
                        }
                        this.f11150kk = i5 >> 1;
                        for (int i6 = 0; i6 < this.f11146dy.m49217x1().m16422to().m16362x1().length; i6++) {
                            this.f11153x1[i6] = null;
                        }
                        i3 = 0;
                    }
                }
                int i7 = iM23130x1;
                while (this.f11150kk % i7 != 0) {
                    i7--;
                }
                this.f11145du = iM56713x1;
                int i8 = (iM23130x1 > i7 ? iM56713x1 + i7 : iM56713x1 + iM23130x1) - 1;
                AbstractC14049c6<C10019k4.x1> abstractC14049c6 = new AbstractC14049c6<C10019k4.x1>() { // from class: com.aspose.slides.internal.fp.bv.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14049c6
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public void mo1379k4(Object obj, C10019k4.x1 x1Var) {
                        C4087bv.this.m16255k4(obj, x1Var);
                    }
                };
                AbstractC14049c6<C10019k4.kk> abstractC14049c62 = new AbstractC14049c6<C10019k4.kk>() { // from class: com.aspose.slides.internal.fp.bv.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14049c6
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public void mo1379k4(Object obj, C10019k4.kk kkVar) {
                        C4087bv.this.m16254k4(obj, kkVar);
                    }
                };
                int i9 = i7;
                int i10 = i8;
                int i11 = iM56713x1;
                int i12 = i3;
                int i13 = iM23130x1;
                while (i12 == 0) {
                    try {
                        this.f11146dy.f36034k4.mo27432x1(abstractC14049c6);
                        this.f11146dy.f36044x1.mo27432x1(abstractC14049c62);
                        while (true) {
                            i2 = i;
                            try {
                                try {
                                    this.f11146dy.m49207k4(i11, i10, this.f11152to - 1, c12014ne.Clone());
                                    i13 -= i13 > i9 ? i9 : i13;
                                    i11 = i10 + 1;
                                    i10 = (i13 > i9 ? i11 + i9 : i11 + i13) - 1;
                                    if (i13 == 0) {
                                        break;
                                    } else {
                                        i = i2;
                                    }
                                } catch (OutOfMemoryError e2) {
                                    e = e2;
                                    int i14 = i2;
                                    if (i9 == i14) {
                                        throw e;
                                    }
                                    int iM67483k4 = C14116yg.m67483k4(i14, i9 - 1);
                                    while (this.f11150kk % iM67483k4 != 0) {
                                        iM67483k4--;
                                    }
                                    int i15 = (iM23130x1 > iM67483k4 ? iM56713x1 + iM67483k4 : iM56713x1 + iM23130x1) - 1;
                                    this.f11146dy.f36034k4.mo27429k4(abstractC14049c6);
                                    this.f11146dy.f36044x1.mo27429k4(abstractC14049c62);
                                    i9 = iM67483k4;
                                    i10 = i15;
                                    i11 = iM56713x1;
                                    i13 = iM23130x1;
                                }
                            } catch (Throwable th) {
                                th = th;
                                this.f11146dy.f36034k4.mo27429k4(abstractC14049c6);
                                this.f11146dy.f36044x1.mo27429k4(abstractC14049c62);
                                throw th;
                            }
                        }
                        this.f11146dy.f36034k4.mo27429k4(abstractC14049c6);
                        this.f11146dy.f36044x1.mo27429k4(abstractC14049c62);
                        i12 = i2;
                    } catch (OutOfMemoryError e3) {
                        e = e3;
                        i2 = i;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f11146dy.f36034k4.mo27429k4(abstractC14049c6);
                        this.f11146dy.f36044x1.mo27429k4(abstractC14049c62);
                        throw th;
                    }
                    i3 = 0;
                    i = 1;
                }
                z = true;
            }
        } catch (OutOfMemoryError e4) {
            throw new C12754k4("Cannot allocate image in memory. Image size exceeds memory size", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m16254k4(Object obj, C10019k4.kk kkVar) {
        int iM49235k4 = (kkVar.m49235k4() - this.f11145du) + 1;
        this.f11149k4 = iM49235k4;
        if (iM49235k4 % this.f11150kk == 0 || iM49235k4 == this.f11152to) {
            byte[][][] bArr = {this.f11153x1};
            m16256k4(bArr);
            byte[][] bArr2 = bArr[0];
            this.f11153x1 = bArr2;
            bArr[0] = bArr2;
            m16257k4(bArr, this.f11147h4.Clone());
            this.f11153x1 = bArr[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m16255k4(Object obj, C10019k4.x1 x1Var) {
        this.f11149k4 = (x1Var.m49240kk() - this.f11145du) + 1;
        if (x1Var.m49239k4() == null) {
            throw new ArgumentNullException("e.ImageData");
        }
        if (x1Var.m49239k4().length == 0) {
            return;
        }
        int i = 0;
        for (byte[] bArr : x1Var.m49239k4()) {
            if (bArr != null) {
                i++;
            }
        }
        int length = x1Var.m49239k4()[0].length;
        int i2 = this.f11149k4 % this.f11150kk;
        for (int i3 = 0; i3 < i; i3++) {
            C4095jd c4095jd = this.f11146dy.m49217x1().m16422to().m16362x1()[i3];
            int i4 = this.f11150kk;
            C4093h4.m16293k4(x1Var.m49239k4()[i3], 0, this.f11153x1[i3], (((i4 == 1 ? 0 : (this.f11149k4 - 1) % i4) * length) * (c4095jd.m16316fa() & 255)) / this.f11146dy.m49217x1().m16422to().m16358m9(), ((c4095jd.m16316fa() & 255) * length) / this.f11146dy.m49217x1().m16422to().m16358m9());
        }
        if (i2 == 1 || this.f11150kk == 1) {
            this.f11147h4 = new C12014ne(x1Var.m49241x1().m56669jd(), x1Var.m49241x1().m56664ck(), x1Var.m49241x1().m56663c5(), x1Var.m49241x1().m56683x1());
        } else if (this.f11147h4.m56670k4() < x1Var.m49241x1().m56670k4()) {
            C12014ne c12014ne = this.f11147h4;
            c12014ne.m56671k4(x1Var.m49241x1().m56683x1() + c12014ne.m56683x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m16256k4(byte[][][] bArr) {
        for (C4095jd c4095jd : this.f11146dy.m49217x1().m16422to().m16362x1()) {
            this.f11146dy.m49203du().m24372k4(c4095jd).mo24374k4(bArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m16257k4(byte[][][] bArr, C12014ne c12014ne) {
        C13609qq c13609qqM62780c5;
        byte[] bArr2;
        int iM27462to = C7019kk.m27462to(Integer.valueOf(this.f11146dy.m49217x1().m16422to().m16351dy()), 8);
        int iM23129to = C5666m9.m23129to(C7019kk.m27462to(Integer.valueOf(this.f11146dy.m49217x1().m16422to().m16351dy()), 8), this.f11146dy.m49217x1().m16422to().m16359to() * 8);
        int length = this.f11146dy.m49217x1().m16422to().m16362x1().length;
        int iM56663c5 = c12014ne.m56663c5() * c12014ne.m56683x1() * length;
        byte[] bArr3 = new byte[iM56663c5];
        int iM56670k4 = c12014ne.m56670k4() - c12014ne.m56666dy();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iM56670k4; i3++) {
            for (int iM56681to = c12014ne.m56681to(); iM56681to < c12014ne.m56668h4(); iM56681to++) {
                int i4 = 0;
                while (i4 < length) {
                    bArr3[i2] = bArr[0][i4][(i3 * iM23129to) + iM56681to];
                    i4++;
                    i2++;
                }
            }
        }
        if (this.f11151m9) {
            C13609qq c13609qqM62824k4 = this.f11146dy.m49216to().m62824k4();
            if (this.f11146dy.m49216to().m62824k4().m62787kk() == 5) {
                while (i < iM56663c5) {
                    bArr3[i] = (byte) (255 - (bArr3[i] & 255));
                    i++;
                }
                byte[] bArr4 = new byte[iM56663c5];
                new C6447my(c12014ne.m56663c5(), c12014ne.m56683x1(), C13609qq.m62781dy().m62786du() * c12014ne.m56663c5(), this.f11146dy.m49216to().m62824k4(), c12014ne.Clone(), C13609qq.m62783k4(), C13609qq.m62783k4().m62786du() * iM27462to).m26313k4(c12014ne.Clone(), bArr3, 0, bArr4, 0);
                byte[] bArr5 = new byte[(iM56663c5 / 4) * 3];
                new C6414bv(c12014ne.m56663c5(), c12014ne.m56683x1(), C13609qq.m62783k4().m62786du() * c12014ne.m56663c5(), this.f11146dy.m49216to().m62824k4(), c12014ne.Clone(), C13609qq.m62785x1(), C13609qq.m62785x1().m62786du() * c12014ne.m56663c5(), new C13618wy(((this.f11148jd.m16389v4() == null || this.f11148jd.m16386lr()) ? C13623yj.m62875k4() : this.f11148jd.m16389v4()).m14472k4()), new C13618wy(((this.f11148jd.m16380bv() == null || this.f11148jd.m16386lr()) ? C13623yj.m62876x1() : this.f11148jd.m16380bv()).m14472k4())).m26313k4(c12014ne.Clone(), bArr4, 0, bArr5, 0);
                c13609qqM62780c5 = C13609qq.m62780c5();
                bArr2 = bArr5;
            } else if (this.f11146dy.m49216to().m62824k4().m62787kk() == 4) {
                while (i < iM56663c5) {
                    bArr3[i] = (byte) (255 - (bArr3[i] & 255));
                    i++;
                }
                byte[] bArr6 = new byte[(iM56663c5 / 4) * 3];
                new C6414bv(c12014ne.m56663c5(), c12014ne.m56683x1(), C13609qq.m62783k4().m62786du() * c12014ne.m56663c5(), this.f11146dy.m49216to().m62824k4(), c12014ne.Clone(), C13609qq.m62785x1(), C13609qq.m62785x1().m62786du() * c12014ne.m56663c5(), new C13618wy(((this.f11148jd.m16389v4() == null || this.f11148jd.m16386lr()) ? C13623yj.m62875k4() : this.f11148jd.m16389v4()).m14472k4()), new C13618wy(((this.f11148jd.m16380bv() == null || this.f11148jd.m16386lr()) ? C13623yj.m62876x1() : this.f11148jd.m16380bv()).m14472k4())).m26313k4(c12014ne.Clone(), bArr3, 0, bArr6, 0);
                c13609qqM62780c5 = C13609qq.m62780c5();
                bArr2 = bArr6;
            } else {
                c13609qqM62780c5 = c13609qqM62824k4;
                bArr2 = bArr3;
            }
            AbstractC6416c5 abstractC6416c5M26317k4 = C6437jd.m26317k4(c12014ne.m56663c5(), c12014ne.m56683x1(), c12014ne.m56663c5() * c13609qqM62780c5.m62786du() * (C7019kk.m27462to(Byte.valueOf(this.f11146dy.m49217x1().m16422to().m16353k4()), 6) / 8), null, c13609qqM62780c5, c12014ne.Clone(), this.f11144ck.m62832x1(), this.f11144ck.m62824k4(), c12014ne.m56663c5() * this.f11144ck.m62824k4().m62786du(), 0, null, null, 0);
            byte[] bArr7 = new byte[(this.f11144ck.m62824k4().m62786du() * bArr2.length) / c13609qqM62780c5.m62786du()];
            abstractC6416c5M26317k4.m26313k4(c12014ne.Clone(), bArr2, 0, bArr7, 0);
            this.f11143c5.mo16292k4(c12014ne.Clone(), bArr7, c12014ne.m56665du().Clone(), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
            return;
        }
        this.f11143c5.mo16292k4(c12014ne.Clone(), bArr3, c12014ne.m56665du().Clone(), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
    }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.mw */
/* JADX INFO: loaded from: classes3.dex */
class C14146mw {

    /* JADX INFO: renamed from: k4 */
    private IFillOverlayEffectiveData f47449k4;

    public C14146mw(IFillOverlayEffectiveData iFillOverlayEffectiveData) {
        this.f47449k4 = iFillOverlayEffectiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int, java.lang.Object] */
    /* JADX INFO: renamed from: du */
    private void m67745du(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new ArgumentNullException("sourceBits is null.");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("overlayBits is null.");
        }
        if (bArr.length != bArr2.length) {
            throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
        }
        for (int i = 0; i < bArr.length; i += 4) {
            if ((bArr[i + 3] & 255) != 0) {
                byte b = bArr[i];
                boolean z = b & 255;
                boolean z2 = bArr2[i] & 255;
                bArr[i] = String.equals(255 - (b & 255)) ? (byte) 1 : (byte) 0;
                int i2 = i + 1;
                byte b2 = bArr[i2];
                boolean z3 = b2 & 255;
                boolean z4 = bArr2[i2] & 255;
                bArr[i2] = String.equals(255 - (b2 & 255)) ? (byte) 1 : (byte) 0;
                int i3 = i + 2;
                byte b3 = bArr[i3];
                boolean z5 = b3 & 255;
                boolean z6 = bArr2[i3] & 255;
                bArr[i3] = String.equals(255 - (b3 & 255)) ? (byte) 1 : (byte) 0;
                bArr[i + 3] = -1;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private float m67746k4(C0962es c0962es) {
        if (c0962es.m5679kk() == null) {
            return 1.0f;
        }
        IGenericEnumerator<IEffectEffectiveData> it = c0962es.m5679kk().iterator();
        while (it.hasNext()) {
            try {
                C14352qm c14352qm = (C14352qm) C7019kk.m27452k4((Object) it.next(), C14352qm.class);
                if (c14352qm != null) {
                    return c14352qm.getAmount() / 100.0f;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return 1.0f;
        }
        it.dispose();
        return 1.0f;
    }

    /* JADX INFO: renamed from: kk */
    private void m67750kk(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new ArgumentNullException("sourceBits is null.");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("overlayBits is null.");
        }
        if (bArr.length != bArr2.length) {
            throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
        }
        for (int i = 0; i < bArr.length; i += 4) {
            if ((bArr[i + 3] & 255) != 0) {
                bArr[i] = (byte) (((bArr[i] & 255) * (bArr2[i] & 255)) >> 8);
                int i2 = i + 1;
                bArr[i2] = (byte) (((bArr[i2] & 255) * (bArr2[i2] & 255)) >> 8);
                int i3 = i + 2;
                bArr[i3] = (byte) (((bArr[i3] & 255) * (bArr2[i3] & 255)) >> 8);
                bArr[i + 3] = -1;
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m67751to(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new ArgumentNullException("sourceBits is null.");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("overlayBits is null.");
        }
        if (bArr.length != bArr2.length) {
            throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
        }
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 3;
            if ((bArr[i2] & 255) != 0) {
                while (i < i2) {
                    int i3 = bArr[i] & 255;
                    int i4 = bArr2[i] & 255;
                    if (i3 <= 127) {
                        bArr[i] = (byte) (((i3 * 2) * i4) / 255);
                    } else {
                        bArr[i] = (byte) (255 - (((255 - i4) * ((255 - i3) * 2)) / 255));
                    }
                    i++;
                }
                bArr[i] = -1;
                i++;
            } else {
                i += 4;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC12024x1 m67752x1(C0962es c0962es) {
        return C14814xq.m73548kk(C0962es.m5664k4(c0962es.m5674h4(), (C14176nc) this.f47449k4.getFillFormat()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m67747k4(C12009k4 c12009k4, C12009k4 c12009k42, float f) {
        byte[] bArrM70057k4 = C14381rb.m70057k4(c12009k4);
        byte[] bArrM70057k42 = C14381rb.m70057k4(c12009k42);
        float f2 = (1.0f - f) * 255.0f;
        for (int i = 0; i < bArrM70057k4.length; i += 4) {
            bArrM70057k4[i] = OooO0o.OooO00o(bArrM70057k4[i] & 255, f, f2, 13);
            bArrM70057k4[i + 1] = OooO0o.OooO00o(bArrM70057k4[r3] & 255, f, f2, 13);
            bArrM70057k4[i + 2] = OooO0o.OooO00o(bArrM70057k4[r3] & 255, f, f2, 13);
        }
        int blend = this.f47449k4.getBlend();
        if (blend == 0) {
            m67749k4(bArrM70057k4, bArrM70057k42);
        } else if (blend == 1) {
            m67753x1(bArrM70057k4, bArrM70057k42);
        } else if (blend == 2) {
            m67750kk(bArrM70057k4, bArrM70057k42);
        } else if (blend == 3) {
            m67751to(bArrM70057k4, bArrM70057k42);
        } else {
            if (blend != 4) {
                throw new ArgumentOutOfRangeException("m_blendMode");
            }
            m67745du(bArrM70057k4, bArrM70057k42);
        }
        C14381rb.m70053k4(c12009k4, bArrM70057k4);
    }

    /* JADX INFO: renamed from: x1 */
    private void m67753x1(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new ArgumentNullException("sourceBits is null.");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("overlayBits is null.");
        }
        if (bArr.length != bArr2.length) {
            throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
        }
        for (int i = 0; i < bArr.length; i += 4) {
            if ((bArr[i + 3] & 255) != 0) {
                byte b = bArr2[i];
                if ((b & 255) > (bArr[i] & 255)) {
                    bArr[i] = b;
                }
                int i2 = i + 1;
                byte b2 = bArr2[i2];
                if ((b2 & 255) > (bArr[i2] & 255)) {
                    bArr[i2] = b2;
                }
                int i3 = i + 2;
                byte b3 = bArr2[i3];
                if ((b3 & 255) > (bArr[i3] & 255)) {
                    bArr[i3] = b3;
                }
                bArr[i + 3] = -1;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [double, int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [double, int] */
    /* JADX WARN: Type inference failed for: r9v6, types: [int, java.lang.StringBuffer] */
    /* JADX INFO: renamed from: k4 */
    public final void m67754k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar, ShapeFrame shapeFrame) {
        if ((c0962es == null || c0962es.m5681to() == 0) && (azoVar == null || !azoVar.m3903h4())) {
            return;
        }
        C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        C12007ix c12007ixClone = c11896dy2.m55523c5().Clone();
        float fM3906k4 = ((azoVar == null || !azoVar.m3903h4()) ? 0.0f : (float) azoVar.m3906k4()) + 2;
        C12025x6 c12025x6 = new C12025x6(c12007ixClone.m56557jd() - fM3906k4, c12007ixClone.m56551ck() - fM3906k4);
        float f = fM3906k4 * 2.0f;
        C12009k4 c12009k4 = new C12009k4((int) StringBuffer.append((int) (c12007ixClone.m56550c5() + f)), (int) StringBuffer.append((int) (c12007ixClone.m56575x1() + f)), 2498570);
        try {
            if (abstractC14897zn.m74625qq() != null) {
                c12009k4.m56332k4(abstractC14897zn.m74625qq().mo15758up(), abstractC14897zn.m74625qq().mo15752dy());
            }
            C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk());
            c11896dy2.m55577x1(c11913yj);
            C11913yj c11913yj2 = new C11913yj();
            c11913yj2.m55769k4(c11913yj, 1);
            AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
            try {
                abstractC12008jdM70048k4.mo17517k4(C12003du.m56398k4(0, 0, 0, 0).Clone());
                if (c0962es != null && c0962es.m5681to() != 0) {
                    AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(c0962es);
                    try {
                        C11913yj c11913yjM70045k4 = C14381rb.m70045k4(abstractC12024x1M73548kk);
                        c11913yjM70045k4.m55769k4(c11913yj2, 1);
                        C14381rb.m70054k4(abstractC12024x1M73548kk, c11913yjM70045k4);
                        abstractC12008jdM70048k4.mo17527k4(abstractC12024x1M73548kk, c11896dy2);
                        if (abstractC12024x1M73548kk != null) {
                            abstractC12024x1M73548kk.dispose();
                        }
                    } catch (Throwable th) {
                        if (abstractC12024x1M73548kk != null) {
                            abstractC12024x1M73548kk.dispose();
                        }
                        throw th;
                    }
                }
                abstractC12008jdM70048k4.dispose();
                c12009k4 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), c12009k4.mo15753jd());
                try {
                    c12009k4.m56332k4(c12009k4.mo15752dy(), c12009k4.mo15758up());
                    abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
                    try {
                        abstractC12008jdM70048k4.mo17517k4(C12003du.m56398k4(0, 0, 0, 0).Clone());
                        AbstractC12024x1 abstractC12024x1M67752x1 = m67752x1(c0962es);
                        try {
                            if (C7019kk.m27469x1(abstractC12024x1M67752x1, C11909up.class)) {
                                C11909up c11909up = (C11909up) abstractC12024x1M67752x1;
                                C11902kk c11902kkM55721dy = c11909up.m55721dy();
                                int iM56506h4 = C12003du.m56385i5().m56506h4();
                                if (c11909up.m55723h4() == null && c11902kkM55721dy.m55668k4().length == 2 && c11902kkM55721dy.m55668k4()[0].m56506h4() == iM56506h4 && c11902kkM55721dy.m55668k4()[1].m56506h4() == iM56506h4) {
                                    C11902kk c11902kk = new C11902kk();
                                    c11902kk.m55667k4(new C12003du[]{C12003du.m56385i5(), C12003du.m56460uz()});
                                    c11902kk.m55666k4(c11909up.m55721dy().m55669x1());
                                    c11909up.m55726k4(c11902kk);
                                }
                            }
                            C11913yj c11913yjM70045k42 = C14381rb.m70045k4(abstractC12024x1M67752x1);
                            c11913yjM70045k42.m55769k4(c11913yj2, 1);
                            C14381rb.m70054k4(abstractC12024x1M67752x1, c11913yjM70045k42);
                            abstractC12008jdM70048k4.mo17527k4(abstractC12024x1M67752x1, c11896dy2);
                            if (abstractC12024x1M67752x1 != null) {
                                abstractC12024x1M67752x1.dispose();
                            }
                            abstractC12008jdM70048k4.dispose();
                            m67747k4(c12009k4, c12009k4, m67746k4(c0962es));
                            c12009k4.dispose();
                            m67748k4(abstractC14897zn, c12009k4, c12025x6.m56897x1(), c12025x6.m56895kk());
                            c12009k4.dispose();
                            c11896dy2.dispose();
                        } catch (Throwable th2) {
                            if (abstractC12024x1M67752x1 != null) {
                                abstractC12024x1M67752x1.dispose();
                            }
                            throw th2;
                        }
                    } finally {
                        if (abstractC12008jdM70048k4 != null) {
                            abstractC12008jdM70048k4.dispose();
                        }
                    }
                } finally {
                    c12009k4.dispose();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m67748k4(AbstractC14897zn abstractC14897zn, C12009k4 c12009k4, float f, float f2) {
        C12007ix c12007ix;
        new C12007ix();
        if (C7019kk.m27469x1(abstractC14897zn, vhx.class)) {
            float fM27462to = C7019kk.m27462to(Float.valueOf(f), 13);
            float fM27462to2 = C7019kk.m27462to(Float.valueOf(f2), 13);
            if (fM27462to < 0.0f) {
                fM27462to -= 1.5f;
            }
            c12007ix = new C12007ix(fM27462to, fM27462to2, c12009k4.mo15760yj(), c12009k4.mo15757m9());
        } else {
            c12007ix = new C12007ix(f, f2, c12009k4.mo15760yj(), c12009k4.mo15757m9());
        }
        abstractC14897zn.mo64339k4(c12009k4, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m67749k4(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new ArgumentNullException("sourceBits is null.");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("overlayBits is null.");
        }
        if (bArr.length != bArr2.length) {
            throw new ArgumentException("sourceBits and overlayBits doesn't have the same size");
        }
        for (int i = 0; i < bArr.length; i += 4) {
            if ((bArr[i + 3] & 255) != 0) {
                byte b = bArr2[i];
                if ((b & 255) < (bArr[i] & 255)) {
                    bArr[i] = b;
                }
                int i2 = i + 1;
                byte b2 = bArr2[i2];
                if ((b2 & 255) < (bArr[i2] & 255)) {
                    bArr[i2] = b2;
                }
                int i3 = i + 2;
                byte b3 = bArr2[i3];
                if ((b3 & 255) < (bArr[i3] & 255)) {
                    bArr[i3] = b3;
                }
                bArr[i + 3] = -1;
            }
        }
    }
}

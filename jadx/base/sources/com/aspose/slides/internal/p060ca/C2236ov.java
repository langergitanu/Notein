package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ov */
/* JADX INFO: loaded from: classes3.dex */
public class C2236ov {

    /* JADX INFO: renamed from: du */
    private long f7708du;

    /* JADX INFO: renamed from: dy */
    private boolean f7709dy;

    /* JADX INFO: renamed from: h4 */
    private long f7710h4;

    /* JADX INFO: renamed from: kk */
    private C2377xv f7712kk;

    /* JADX INFO: renamed from: to */
    private long f7714to;

    /* JADX INFO: renamed from: x1 */
    private C2092fz f7715x1;

    /* JADX INFO: renamed from: m9 */
    private Object f7713m9 = new Object();

    /* JADX INFO: renamed from: k4 */
    private boolean f7711k4 = true;

    public C2236ov(C2092fz c2092fz, C2132iq c2132iq) {
        this.f7715x1 = c2092fz;
        this.f7712kk = new C2377xv(null, c2132iq, c2092fz);
    }

    /* JADX INFO: renamed from: k4 */
    public static long m11215k4(byte[] bArr) {
        int length = bArr.length / 4;
        int iM27462to = 0;
        int iM27462to2 = 0;
        int iM27462to3 = 0;
        int iM27462to4 = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iM27462to4 += C7019kk.m27462to(Byte.valueOf(bArr[i]), 6) & 255;
            iM27462to3 += C7019kk.m27462to(Byte.valueOf(bArr[i + 1]), 6) & 255;
            int i3 = i + 3;
            iM27462to2 += C7019kk.m27462to(Byte.valueOf(bArr[i + 2]), 6) & 255;
            i += 4;
            iM27462to += C7019kk.m27462to(Byte.valueOf(bArr[i3]), 6) & 255;
        }
        return C7019kk.m27435du(Integer.valueOf(iM27462to + (iM27462to2 << 8) + (iM27462to3 << 16) + (iM27462to4 << 24)), 9);
    }

    /* JADX INFO: renamed from: ak */
    public final long m11216ak() {
        return this.f7710h4;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m11217b3() {
        return this.f7711k4;
    }

    /* JADX INFO: renamed from: dq */
    public final void m11218dq() {
        if (this.f7709dy) {
            return;
        }
        synchronized (this.f7713m9) {
            if (!this.f7709dy) {
                try {
                    try {
                        if (m11217b3()) {
                            mo10300x1(null);
                        } else {
                            C2212n9 c2212n9 = new C2212n9(m11223yd().mo11248k4());
                            try {
                                mo10300x1(c2212n9);
                                c2212n9.dispose();
                            } catch (Throwable th) {
                                c2212n9.dispose();
                                throw th;
                            }
                        }
                    } catch (EndOfStreamException e) {
                        if (C2063e8.m10448k4().m10449kk() != 1) {
                            throw e;
                        }
                    }
                    this.f7709dy = true;
                } catch (Throwable th2) {
                    this.f7709dy = true;
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public final C2092fz m11221lr() {
        return this.f7715x1;
    }

    /* JADX INFO: renamed from: wy */
    public final long m11222wy() {
        return this.f7708du;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo10300x1(C2212n9 c2212n9) {
    }

    /* JADX INFO: renamed from: yd */
    public final C2377xv m11223yd() {
        return this.f7712kk;
    }

    public C2236ov(C2377xv c2377xv, long j, long j2, long j3) {
        this.f7712kk = c2377xv;
        this.f7715x1 = c2377xv.m11705x1();
        this.f7714to = j;
        this.f7708du = j2;
        this.f7710h4 = j3;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11219k4(C2362x4 c2362x4, C3152yj c3152yj, byte[][] bArr, long[] jArr, long[] jArr2) {
        jArr[0] = C7019kk.m27435du(Long.valueOf(c2362x4.m11654k4()), 11);
        while (c2362x4.m11654k4() % 4 != 0) {
            c2362x4.m11655k4((byte) 0);
        }
        c3152yj.close();
        byte[] array = c3152yj.toArray();
        bArr[0] = array;
        jArr2[0] = m11215k4(array);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11220k4(boolean z) {
        this.f7711k4 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        try {
            try {
                C2212n9 c2212n9 = new C2212n9(m11223yd().mo11248k4());
                try {
                    try {
                        c2212n9.m11159k4(C7019kk.m27438h4(Long.valueOf(m11222wy()), 10));
                        C3152yj c3152yj = new C3152yj();
                        try {
                            try {
                                C2362x4 c2362x4 = new C2362x4(c3152yj);
                                try {
                                    c2362x4.m11657k4(c2212n9.m11160k4(C7019kk.m27462to(Long.valueOf(m11216ak()), 10)));
                                    try {
                                        m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                                        c2362x4.dispose();
                                        c3152yj.dispose();
                                        c2212n9.dispose();
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        c2362x4.dispose();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                Throwable th5 = th;
                                c3152yj.dispose();
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            Throwable th52 = th;
                            c3152yj.dispose();
                            throw th52;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        Throwable th8 = th;
                        c2212n9.dispose();
                        throw th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    Throwable th82 = th;
                    c2212n9.dispose();
                    throw th82;
                }
            } catch (EndOfStreamException e) {
                e = e;
                EndOfStreamException endOfStreamException = e;
                if (C2063e8.m10448k4().m10449kk() == 1) {
                    throw endOfStreamException;
                }
                byte[] bArr2 = new byte[0];
                bArr[0] = bArr2;
                jArr[0] = 0;
                jArr2[0] = m11215k4(bArr2);
            }
        } catch (EndOfStreamException e2) {
            e = e2;
            EndOfStreamException endOfStreamException2 = e;
            if (C2063e8.m10448k4().m10449kk() == 1) {
            }
        }
    }
}

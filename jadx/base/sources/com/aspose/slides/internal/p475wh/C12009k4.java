package com.aspose.slides.internal.p475wh;

import OooOoo.C20593OooO0Oo;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3979dy;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p477wk.C12084x1;
import com.aspose.slides.internal.p556zr.C13630k4;
import com.aspose.slides.internal.p556zr.C13631kk;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.k4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12009k4 extends AbstractC12002ck {

    /* JADX INFO: renamed from: to */
    private static final C12003du f40525to = C12003du.m56349b1().Clone();

    /* JADX INFO: renamed from: du */
    private C12084x1 f40526du;

    /* JADX INFO: renamed from: k4 */
    protected int f40527k4;

    public C12009k4(int i, int i2) {
        this(i, i2, 2498570);
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC2624k4 m56585k4(AbstractC12002ck abstractC12002ck, int i, int i2) {
        if (abstractC12002ck != null) {
            return abstractC12002ck.mo15751du().m62930k4().mo11993x1(i, i2);
        }
        throw new ArgumentNullException("original");
    }

    /* JADX INFO: renamed from: ks */
    private boolean m56594ks() {
        return this.f40526du.m56966k4();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        return m56601k4(new C12014ne(0, 0, mo15760yj(), mo15757m9()));
    }

    /* JADX INFO: renamed from: kk */
    public <T> T m56607kk() {
        return (T) mo15751du().m62930k4().mo11984k4();
    }

    /* JADX INFO: renamed from: x1 */
    public InterfaceC2624k4 m56608x1() {
        return mo15751du().m62930k4();
    }

    public C12009k4(int i, int i2, int i3) {
        super(AbstractC14124to.m67612dy().mo67644k4(i, i2, i3), C3977ck.m15675c5());
        this.f40527k4 = 0;
        this.f40526du = new C12084x1(this);
        this.f40527k4 = i3;
    }

    /* JADX INFO: renamed from: kk */
    private static String m56591kk(String str) {
        if (str != null) {
            return str;
        }
        throw new ArgumentNullException("Value of 'filename' cannot be null");
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC3150x6 m56595x1(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentException("Value of null is not valid for 'stream'");
        }
        abstractC3150x6.setPosition(0L);
        return abstractC3150x6;
    }

    /* JADX INFO: renamed from: k4 */
    public synchronized C3983k4 m56597k4(C12014ne c12014ne, int i, int i2) {
        return m56598k4(c12014ne, i, i2, false);
    }

    public C12009k4(InterfaceC2624k4 interfaceC2624k4, C3977ck c3977ck) {
        super(interfaceC2624k4, c3977ck);
        this.f40527k4 = 0;
        this.f40526du = new C12084x1(this);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m56592kk(int i, int i2) {
        return m56590k4(i, i2, mo15760yj(), mo15757m9());
    }

    /* JADX INFO: renamed from: k4 */
    public synchronized C3983k4 m56598k4(C12014ne c12014ne, int i, int i2, boolean z) {
        return this.f40526du.m56964k4(c12014ne, i, i2, z);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.lang.StringBuilder] */
    /* JADX INFO: renamed from: x1 */
    public C12003du m56609x1(int i, int i2) {
        if (m56592kk(i, i2)) {
            if (m56594ks()) {
                throw new InvalidOperationException("Bitmap region is already locked");
            }
            return m56599k4(i, i2);
        }
        ?? byteArray = ByteArrayOutputStream.toByteArray();
        byteArray.append(mo15760yj());
        byteArray.append(",");
        byteArray.append(mo15757m9());
        byteArray.append(")");
        throw new ArgumentOutOfRangeException(byteArray.toString());
    }

    public C12009k4(AbstractC3150x6 abstractC3150x6) {
        this(m56595x1(abstractC3150x6), false, (C3977ck) null);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m56593kk(AbstractC3150x6 abstractC3150x6) {
        try {
            m56339k4(new C13631kk(new C3989up(abstractC3150x6).m15759x1().m56608x1(), null, C3977ck.m15675c5(), C4375kk.m17632kk(), C4375kk.m17633to(), C3979dy.m15690x1()), false);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m56599k4(int i, int i2) {
        return C12003du.m56396k4(m56608x1().mo11980k4(i, i2));
    }

    public C12009k4(AbstractC3150x6 abstractC3150x6, boolean z) {
        this(m56595x1(abstractC3150x6), z, (C3977ck) null);
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m56600k4(C12007ix c12007ix, int i) {
        C13631kk c13631kkM62945kk;
        boolean z = mo15753jd() == i;
        C12009k4 c12009k4 = null;
        for (C13631kk c13631kk : m56341to()) {
            if (z) {
                c13631kkM62945kk = m56587k4(c12007ix, c13631kk);
            } else {
                C3983k4 c3983k4M56597k4 = new C12009k4(c13631kk).m56597k4(C12014ne.m56657kk(c12007ix), 1, i);
                C12009k4 c12009k42 = new C12009k4((int) c12007ix.m56550c5(), (int) c12007ix.m56575x1(), i);
                c12009k42.m56597k4(C12014ne.m56657kk(c12007ix), 1, i);
                c12009k42.m56605k4(c3983k4M56597k4);
                c13631kkM62945kk = c12009k42.m56341to().m62945kk();
            }
            if (c12009k4 == null) {
                c12009k4 = new C12009k4(c13631kkM62945kk);
            } else {
                c12009k4.m56339k4(c13631kkM62945kk, true);
            }
        }
        return c12009k4;
    }

    public C12009k4(AbstractC3150x6 abstractC3150x6, boolean z, C3977ck c3977ck) {
        this.f40527k4 = 0;
        this.f40526du = new C12084x1(this);
        m56596x1(abstractC3150x6, c3977ck);
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m56601k4(C12014ne c12014ne) {
        return m56602k4(c12014ne, mo15753jd());
    }

    public C12009k4(AbstractC12002ck abstractC12002ck) {
        this(abstractC12002ck, abstractC12002ck.m56329fa());
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m56602k4(C12014ne c12014ne, int i) {
        return m56600k4(new C12007ix(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1()), i);
    }

    public C12009k4(AbstractC12002ck abstractC12002ck, int i, int i2) {
        super(m56585k4(abstractC12002ck, i, i2), C3977ck.m15675c5());
        this.f40527k4 = 0;
        this.f40526du = new C12084x1(this);
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> C12009k4 m56586k4(T t) {
        if (t == null) {
            return null;
        }
        return new C12009k4(AbstractC14124to.m67612dy().mo67645k4(t), C3977ck.m15682kk());
    }

    public C12009k4(AbstractC12002ck abstractC12002ck, C12023wl c12023wl) {
        this(abstractC12002ck, c12023wl.m56865x1(), c12023wl.m56862kk());
    }

    /* JADX INFO: renamed from: k4 */
    private C13631kk m56587k4(C12007ix c12007ix, C13631kk c13631kk) {
        InterfaceC2624k4 interfaceC2624k4Mo11981k4 = c13631kk.m62930k4().mo11981k4((int) c12007ix.m56557jd(), (int) c12007ix.m56551ck(), (int) c12007ix.m56550c5(), (int) c12007ix.m56575x1());
        C13631kk c13631kkM62931k4 = c13631kk.m62931k4(false);
        c13631kkM62931k4.m62935k4(interfaceC2624k4Mo11981k4);
        return c13631kkM62931k4;
    }

    public C12009k4(C13631kk c13631kk) {
        this.f40527k4 = 0;
        this.f40526du = new C12084x1(this);
        super.m56339k4(c13631kk, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> T m56588k4(C12009k4 c12009k4) {
        if (c12009k4 == null) {
            return null;
        }
        return (T) c12009k4.m56607kk();
    }

    public C12009k4(String str) {
        this(m56591kk(str), false, (C3977ck) null);
    }

    /* JADX INFO: renamed from: x1 */
    private void m56596x1(AbstractC3150x6 abstractC3150x6, C3977ck c3977ck) {
        C13630k4 c13630k4M62908x1 = c3977ck == null ? C13630k4.m62908x1(abstractC3150x6) : C13630k4.m62898k4(c3977ck);
        if (c13630k4M62908x1 == null && c3977ck == null) {
            if (!m56593kk(abstractC3150x6)) {
                throw new ArgumentException("Error loading file: Unsupported file format", "input");
            }
            return;
        }
        if (c13630k4M62908x1 == null) {
            throw new ArgumentNullException("ImageCodec was not found for format: " + c3977ck.toString());
        }
        try {
            c13630k4M62908x1.m62919k4(abstractC3150x6);
            if (!c13630k4M62908x1.m62912c5().equals(C3977ck.m15683m9()) || c3977ck != null) {
                C13631kk c13631kkM62913du = c13630k4M62908x1.m62913du();
                m56589k4(c13631kkM62913du);
                super.m56339k4(c13631kkM62913du, false);
                while (true) {
                    C13631kk c13631kkM62915h4 = c13630k4M62908x1.m62915h4();
                    if (c13631kkM62915h4 == null) {
                        break;
                    } else {
                        super.m56339k4(c13631kkM62915h4, true);
                    }
                }
            } else {
                C13631kk c13631kkM62913du2 = c13630k4M62908x1.m62913du();
                C13631kk c13631kk = c13631kkM62913du2;
                while (c13631kkM62913du2 != null) {
                    c13631kk = c13631kkM62913du2;
                    c13631kkM62913du2 = c13630k4M62908x1.m62915h4();
                }
                m56589k4(c13631kk);
                super.m56339k4(c13631kk, false);
            }
            this.f40503x1 |= 73728;
            c13630k4M62908x1.dispose();
        } catch (Throwable th) {
            c13630k4M62908x1.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56603k4() throws Throwable {
        C12003du c12003duM56609x1 = f40525to;
        if (mo15760yj() > 0 && mo15757m9() > 0) {
            c12003duM56609x1 = m56609x1(0, mo15757m9() - 1);
        }
        if ((c12003duM56609x1.m56501c5() & 255) < 255) {
            return;
        }
        m56606k4(c12003duM56609x1);
    }

    public C12009k4(String str, boolean z) {
        this(m56591kk(str), z, (C3977ck) null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56604k4(int i, int i2, C12003du c12003du) {
        if (AbstractC12002ck.m56327x1(mo15753jd())) {
            throw new InvalidOperationException("SetPixel is not supported for images with indexed pixel formats.");
        }
        if (!m56592kk(i, i2)) {
            throw new ArgumentOutOfRangeException("x/y must be non-negative and less than width/height");
        }
        if (m56594ks()) {
            throw new InvalidOperationException("Bitmap region is already locked");
        }
        m56608x1().mo11985k4(i, i2, c12003du.m56506h4());
    }

    public C12009k4(String str, boolean z, C3977ck c3977ck) {
        this.f40527k4 = 0;
        this.f40526du = new C12084x1(this);
        try {
            C3130fa c3130fa = new C3130fa(str, 3, 1);
            try {
                m56596x1(c3130fa, c3977ck);
            } finally {
                c3130fa.close();
            }
        } catch (FileNotFoundException unused) {
            throw new ArgumentException(C20593OooO0Oo.OooO0O0("Parameter value is not valid <", str, ">"));
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: k4 */
    public void mo15756k4(AbstractC3150x6 abstractC3150x6, C13630k4 c13630k4, C3986m9 c3986m9) {
        C13631kk c13631kkMo15751du = mo15751du();
        m56336k4(c3986m9, c13631kkMo15751du);
        c13630k4.m62919k4(abstractC3150x6);
        if (c13630k4.m62912c5().equals(C3977ck.m15676ck())) {
            if (!this.f40501kk) {
                c13630k4.m62926x1(c13631kkMo15751du);
                return;
            } else {
                c13630k4.m62924m9();
                c13630k4.m62920k4(c13631kkMo15751du);
                return;
            }
        }
        if (!c13630k4.m62912c5().equals(C3977ck.m15680h4())) {
            c13630k4.m62921k4(m56341to());
        } else if (!this.f40501kk) {
            c13630k4.m62921k4(m56341to());
        } else {
            c13630k4.m62924m9();
            c13630k4.m62920k4(c13631kkMo15751du);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public synchronized void m56605k4(C3983k4 c3983k4) {
        this.f40526du.m56965k4(c3983k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56606k4(C12003du c12003du) throws Throwable {
        if (C3977ck.m15683m9().m15685k4().equals(mo15750ck().m15685k4())) {
            throw new InvalidOperationException("The image format of the Bitmap is an icon format");
        }
        int iMo15760yj = mo15760yj();
        int iMo15757m9 = mo15757m9();
        C12009k4 c12009k4 = new C12009k4(iMo15760yj, iMo15757m9, 2498570);
        try {
            try {
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    try {
                        abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up());
                        C12014ne c12014ne = new C12014ne(0, 0, iMo15760yj, iMo15757m9);
                        C3976c5 c3976c5 = new C3976c5();
                        try {
                            c3976c5.m15668k4(c12003du, c12003du);
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            abstractC12008jdM56582k4.mo17511k4((AbstractC12002ck) this, c12014ne, 0, 0, iMo15760yj, iMo15757m9, 2, c3976c5);
                            c3976c5.dispose();
                            abstractC12008jdM56582k4.dispose();
                            m56339k4(c12009k4.mo15751du(), false);
                            c12009k4.dispose();
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            c3976c5.dispose();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        Throwable th5 = th;
                        abstractC12008jdM56582k4.dispose();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    Throwable th52 = th;
                    abstractC12008jdM56582k4.dispose();
                    throw th52;
                }
            } catch (Throwable th7) {
                th = th7;
                Throwable th8 = th;
                c12009k4.dispose();
                throw th8;
            }
        } catch (Throwable th9) {
            th = th9;
            Throwable th82 = th;
            c12009k4.dispose();
            throw th82;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m56589k4(C13631kk c13631kk) {
        if (c13631kk == null || c13631kk.m62932k4("pixelFormat") == null) {
            return;
        }
        this.f40527k4 = ((Integer) c13631kk.m62932k4("pixelFormat")).intValue();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56590k4(int i, int i2, int i3, int i4) {
        return i >= 0 && i < i3 && i2 >= 0 && i2 < i4;
    }
}

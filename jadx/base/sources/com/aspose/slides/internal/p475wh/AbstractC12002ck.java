package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3979dy;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p129fe.C3988to;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p556zr.C13630k4;
import com.aspose.slides.internal.p556zr.C13631kk;
import com.aspose.slides.internal.p556zr.C13632to;
import com.aspose.slides.internal.p556zr.C13633x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.ck */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12002ck implements IDisposable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    private final C13632to f40500k4 = new C13632to();

    /* JADX INFO: renamed from: x1 */
    protected int f40503x1 = 0;

    /* JADX INFO: renamed from: kk */
    protected boolean f40501kk = false;

    /* JADX INFO: renamed from: to */
    private AbstractC3150x6 f40502to = null;

    /* JADX INFO: renamed from: du */
    private C13630k4 f40499du = null;

    public AbstractC12002ck() {
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m56310h4(C3986m9 c3986m9) {
        return m56318k4(c3986m9, 22);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m56311k4(int i) {
        if ((65280 & i) > 0) {
            return (i >> 8) & 255;
        }
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m56321kk(int i) {
        return (i & 262144) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    private void m56325x1(AbstractC3150x6 abstractC3150x6, C3977ck c3977ck) {
        m56317k4(abstractC3150x6, c3977ck, false);
    }

    /* JADX INFO: renamed from: c5 */
    public C3988to mo15749c5() {
        return C3988to.m15745kk();
    }

    /* JADX INFO: renamed from: ck */
    public C3977ck mo15750ck() {
        return mo15751du().m62938x1();
    }

    public abstract Object deepClone();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f40500k4.m62946x1();
    }

    /* JADX INFO: renamed from: du */
    public C13631kk mo15751du() {
        return m56341to().m62945kk();
    }

    /* JADX INFO: renamed from: dy */
    public float mo15752dy() {
        return mo15751du().m62937to() <= 1.0f ? C4375kk.m17634x1() : mo15751du().m62937to();
    }

    /* JADX INFO: renamed from: fa */
    public C12023wl m56329fa() {
        return new C12023wl(mo15760yj(), mo15757m9());
    }

    /* JADX INFO: renamed from: jd */
    public int mo15753jd() {
        return mo15751du().m62930k4().mo11990to();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo15756k4(AbstractC3150x6 abstractC3150x6, C13630k4 c13630k4, C3986m9 c3986m9);

    /* JADX INFO: renamed from: m9 */
    public int mo15757m9() {
        return mo15751du().m62930k4().mo11978h4();
    }

    /* JADX INFO: renamed from: to */
    public C13632to m56341to() {
        return this.f40500k4;
    }

    /* JADX INFO: renamed from: up */
    public float mo15758up() {
        if (mo15751du().m62929du() <= 1.0f) {
            return 96.0f;
        }
        return mo15751du().m62929du();
    }

    /* JADX INFO: renamed from: yj */
    public int mo15760yj() {
        return mo15751du().m62930k4().mo11975du();
    }

    public AbstractC12002ck(InterfaceC2624k4 interfaceC2624k4, C3977ck c3977ck) {
        m56339k4(new C13631kk(interfaceC2624k4, null, c3977ck, interfaceC2624k4.mo11992x1(), interfaceC2624k4.mo11988kk(), C3979dy.m15690x1()), false);
    }

    /* JADX INFO: renamed from: du */
    private boolean m56309du(C3986m9 c3986m9) {
        return m56318k4(c3986m9, 21);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m56322kk(C3986m9 c3986m9) {
        return m56318k4(c3986m9, 20);
    }

    /* JADX INFO: renamed from: x1 */
    private void m56326x1(C3979dy c3979dy) {
        for (C3979dy c3979dy2 : m56320k4()) {
            if (C14047bz.m66535k4(c3979dy.m15691k4(), c3979dy2.m15691k4())) {
                return;
            }
        }
        throw new ExternalException("A generic error occurred in GDI+.");
    }

    /* JADX INFO: renamed from: h4 */
    public C14047bz[] m56330h4() {
        return new C14047bz[]{mo15751du().m62936kk().m15691k4()};
    }

    /* JADX INFO: renamed from: k4 */
    public int m56331k4(C3979dy c3979dy) {
        m56326x1(c3979dy);
        return m56341to().m62942k4();
    }

    /* JADX INFO: renamed from: to */
    public void m56342to(int i) {
        C11913yj c11913yjM55749k4;
        if (!mo15751du().m62930k4().mo11976dy()) {
            throw new NotImplementedException("Only raster formats are supported");
        }
        switch (i) {
            case 0:
                return;
            case 1:
                c11913yjM55749k4 = C11913yj.m55749k4(1.5707963267948966d);
                c11913yjM55749k4.m55777kk(0.0f, -mo15757m9());
                mo15751du().m62935k4(mo15751du().m62930k4().mo11982k4(c11913yjM55749k4));
                return;
            case 2:
                c11913yjM55749k4 = C11913yj.m55748du(-1.0f, -1.0f);
                c11913yjM55749k4.m55777kk(-mo15760yj(), -mo15757m9());
                mo15751du().m62935k4(mo15751du().m62930k4().mo11982k4(c11913yjM55749k4));
                return;
            case 3:
                c11913yjM55749k4 = C11913yj.m55749k4(-1.5707963267948966d);
                c11913yjM55749k4.m55777kk(-mo15760yj(), 0.0f);
                mo15751du().m62935k4(mo15751du().m62930k4().mo11982k4(c11913yjM55749k4));
                return;
            case 4:
                c11913yjM55749k4 = C11913yj.m55748du(-1.0f, 1.0f);
                c11913yjM55749k4.m55777kk(-mo15760yj(), 0.0f);
                mo15751du().m62935k4(mo15751du().m62930k4().mo11982k4(c11913yjM55749k4));
                return;
            case 5:
                c11913yjM55749k4 = C11913yj.m55749k4(1.5707963267948966d);
                c11913yjM55749k4.m55763k4(1.0f, -1.0f);
                mo15751du().m62935k4(mo15751du().m62930k4().mo11982k4(c11913yjM55749k4));
                return;
            case 6:
                c11913yjM55749k4 = C11913yj.m55748du(1.0f, -1.0f);
                c11913yjM55749k4.m55777kk(0.0f, -mo15757m9());
                mo15751du().m62935k4(mo15751du().m62930k4().mo11982k4(c11913yjM55749k4));
                return;
            case 7:
                c11913yjM55749k4 = C11913yj.m55749k4(1.5707963267948966d);
                c11913yjM55749k4.m55763k4(-1.0f, 1.0f);
                c11913yjM55749k4.m55777kk(-mo15760yj(), -mo15757m9());
                mo15751du().m62935k4(mo15751du().m62930k4().mo11982k4(c11913yjM55749k4));
                return;
            default:
                throw new ArgumentException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12002ck m56312k4(AbstractC3150x6 abstractC3150x6) {
        return m56313k4(abstractC3150x6, false);
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m56323kk(String str) throws Throwable {
        C3130fa c3130fa = null;
        try {
            C3130fa c3130fa2 = new C3130fa(str, 3, 1);
            try {
                boolean zM62950k4 = C13633x1.m62950k4(c3130fa2);
                c3130fa2.close();
                return zM62950k4;
            } catch (FileNotFoundException unused) {
                c3130fa = c3130fa2;
                if (c3130fa == null) {
                    return false;
                }
                c3130fa.close();
                return false;
            } catch (Throwable th) {
                th = th;
                c3130fa = c3130fa2;
                if (c3130fa != null) {
                    c3130fa.close();
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: to */
    private boolean m56324to(C3986m9 c3986m9) {
        return m56318k4(c3986m9, 23);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56343x1(String str) throws Throwable {
        m56340k4(str, mo15750ck());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12002ck m56313k4(AbstractC3150x6 abstractC3150x6, boolean z) {
        return m56314k4(abstractC3150x6, z, true);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m56327x1(int i) {
        return (i & 65536) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12002ck m56314k4(AbstractC3150x6 abstractC3150x6, boolean z, boolean z2) {
        return C13633x1.m62950k4(abstractC3150x6) ? new C3989up(abstractC3150x6) : new C12009k4(abstractC3150x6, z);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m56328x1(C3986m9 c3986m9) {
        return m56318k4(c3986m9, 18);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12002ck m56315k4(String str) {
        return m56316k4(str, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12002ck m56316k4(String str, boolean z) {
        if (str == null) {
            throw new ArgumentNullException();
        }
        if (str.length() == 0) {
            throw new ArgumentException();
        }
        if (C3131h4.m13361kk(str)) {
            return m56323kk(str) ? new C3989up(str) : new C12009k4(str, z);
        }
        throw new FileNotFoundException(str);
    }

    /* JADX INFO: renamed from: k4 */
    public C12007ix mo15755k4(int[] iArr) {
        iArr[0] = 2;
        return new C12007ix(0.0f, 0.0f, mo15760yj(), mo15757m9());
    }

    /* JADX INFO: renamed from: k4 */
    public void m56332k4(float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f || Float.valueOf(f).isNaN() || Float.valueOf(f2).isNaN()) {
            throw new ArgumentException("Parameter is not valid");
        }
        mo15751du().m62934k4(f);
        mo15751du().m62939x1(f2);
        this.f40503x1 |= 4096;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56333k4(AbstractC3150x6 abstractC3150x6, C3977ck c3977ck) {
        m56317k4(abstractC3150x6, c3977ck, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m56317k4(AbstractC3150x6 abstractC3150x6, C3977ck c3977ck, boolean z) {
        if (!mo15750ck().m15685k4().equals(C3977ck.m15683m9().m15685k4()) && C3977ck.m15683m9().m15685k4().equals(c3977ck.m15685k4())) {
            c3977ck = C3977ck.m15681jd();
        }
        C3982jd c3982jdM62907x1 = C13630k4.m62907x1(C13630k4.m62909x1(c3977ck).Clone());
        if (!z || c3982jdM62907x1 == null || c3982jdM62907x1.m15708x1().equals(C13630k4.m62909x1(c3977ck).Clone())) {
            m56334k4(abstractC3150x6, c3982jdM62907x1, (C3986m9) null);
            return;
        }
        throw new ArgumentNullException("codec not found (" + c3977ck.m15685k4().toString() + ") codec=" + c3982jdM62907x1.m15704kk() + C18241k5.f55433h + c3982jdM62907x1.m15698du());
    }

    /* JADX INFO: renamed from: k4 */
    public void m56334k4(AbstractC3150x6 abstractC3150x6, C3982jd c3982jd, C3986m9 c3986m9) {
        if (c3982jd == null) {
            throw new ArgumentNullException("encoder", "Value cannot be null.");
        }
        this.f40501kk = m56328x1(c3986m9);
        C13630k4 c13630k4M62899k4 = C13630k4.m62899k4(c3982jd.m15708x1().Clone());
        c13630k4M62899k4.m62922k4(this.f40501kk);
        mo15756k4(abstractC3150x6, c13630k4M62899k4, c3986m9);
        abstractC3150x6.flush();
        if (this.f40501kk) {
            this.f40502to = abstractC3150x6;
            this.f40499du = c13630k4M62899k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56335k4(C3986m9 c3986m9) {
        if (c3986m9 == null) {
            throw new ArgumentException("Parameter is not valid.", "encoderParams");
        }
        if (!this.f40501kk) {
            throw new InvalidOperationException("Save method should be called before");
        }
        boolean zM56322kk = m56322kk(c3986m9);
        try {
            if (zM56322kk) {
                this.f40499du.m62914dy();
            } else {
                if (!m56319k4(this.f40499du, c3986m9)) {
                    throw new ArgumentException("Parameter is not valid.", "encoderParams");
                }
                C13631kk c13631kkMo15751du = mo15751du();
                m56336k4(c3986m9, c13631kkMo15751du);
                this.f40499du.m62920k4(c13631kkMo15751du);
            }
            if (zM56322kk) {
                this.f40499du.m62922k4(false);
                this.f40499du.dispose();
                this.f40499du = null;
                try {
                    this.f40502to.flush();
                    this.f40502to = null;
                } catch (IOException unused) {
                }
            }
        } catch (Throwable th) {
            if (zM56322kk) {
                this.f40499du.m62922k4(false);
                this.f40499du.dispose();
                this.f40499du = null;
                try {
                    this.f40502to.flush();
                    this.f40502to = null;
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56336k4(C3986m9 c3986m9, C13631kk c13631kk) {
        int iMo15753jd = mo15753jd();
        c13631kk.m62933k4("pixelFormat", Integer.valueOf(iMo15753jd));
        c13631kk.m62933k4("bitspPixel", Integer.valueOf(m56311k4(iMo15753jd)));
        c13631kk.m62933k4("dpiX", Float.valueOf(mo15752dy()));
        c13631kk.m62933k4("dpiY", Float.valueOf(mo15758up()));
        if (c3986m9 != null) {
            C3981h4[] c3981h4ArrM15744k4 = c3986m9.m15744k4();
            Object[] objArr = new Object[c3981h4ArrM15744k4.length];
            int length = c3981h4ArrM15744k4.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                C3981h4 c3981h4 = c3981h4ArrM15744k4[i];
                objArr[i2] = new Object[]{c3981h4.m15693k4().m15687k4(), Integer.valueOf(c3981h4.m15696x1()), Integer.valueOf(c3981h4.m15695to()), Integer.valueOf(c3981h4.m15694kk())};
                i++;
                i2++;
            }
            c13631kk.m62933k4("encoderParameters", objArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56337k4(C3988to c3988to) {
    }

    /* JADX INFO: renamed from: k4 */
    public void m56338k4(AbstractC12002ck abstractC12002ck, C3986m9 c3986m9) {
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("image");
        }
        if (c3986m9 == null) {
            throw new ArgumentException("Parameter is not valid.", "encoderParams");
        }
        if (!this.f40501kk) {
            throw new InvalidOperationException("Save method should be called before");
        }
        if (!m56319k4(this.f40499du, c3986m9)) {
            throw new ArgumentException("Parameter is not valid.", "encoderParams");
        }
        C13632to c13632toM56341to = abstractC12002ck.m56341to();
        if (c13632toM56341to == null || c13632toM56341to.m62942k4() <= 0) {
            return;
        }
        C13631kk c13631kkM62945kk = c13632toM56341to.m62945kk();
        m56336k4(c3986m9, c13631kkM62945kk);
        this.f40499du.m62920k4(c13631kkM62945kk);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56339k4(C13631kk c13631kk, boolean z) {
        if (!z) {
            m56341to().m62946x1();
        }
        m56341to().m62944k4(c13631kk);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56340k4(String str, C3977ck c3977ck) throws Throwable {
        C3130fa c3130fa;
        C3130fa c3130fa2 = null;
        try {
            c3130fa = new C3130fa(str, 2);
        } catch (Throwable th) {
            th = th;
        }
        try {
            m56325x1(c3130fa, c3977ck);
            c3130fa.close();
        } catch (Throwable th2) {
            th = th2;
            c3130fa2 = c3130fa;
            if (c3130fa2 != null) {
                c3130fa2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56318k4(C3986m9 c3986m9, int i) {
        if (c3986m9 == null || c3986m9.m15744k4() == null) {
            return false;
        }
        boolean z = false;
        for (C3981h4 c3981h4 : c3986m9.m15744k4()) {
            if (c3981h4 == null) {
                throw new ArgumentNullException("param can't be null");
            }
            if (c3981h4.m15693k4().equals(C3978du.f10789m9) && c3981h4.m15696x1() == i) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56319k4(C13630k4 c13630k4, C3986m9 c3986m9) {
        if (c13630k4.m62912c5().equals(C3977ck.m15676ck())) {
            return m56324to(c3986m9);
        }
        if (c13630k4.m62912c5().equals(C3977ck.m15680h4())) {
            return m56309du(c3986m9);
        }
        if (c13630k4.m62912c5().equals(C3977ck.m15683m9())) {
            return m56310h4(c3986m9);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private C3979dy[] m56320k4() {
        C3977ck c3977ckMo15750ck = mo15750ck();
        return c3977ckMo15750ck.equals(C3977ck.m15676ck()) ? new C3979dy[]{C3979dy.m15690x1()} : c3977ckMo15750ck.equals(C3977ck.m15680h4()) ? new C3979dy[]{C3979dy.m15689to()} : c3977ckMo15750ck.equals(C3977ck.m15683m9()) ? new C3979dy[]{C3979dy.m15690x1(), C3979dy.m15689to(), C3979dy.m15688kk()} : new C3979dy[]{C3979dy.m15690x1()};
    }
}

package com.aspose.slides.internal.p472w8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p154gr.C4368c5;
import com.aspose.slides.internal.p154gr.C4378x1;
import com.aspose.slides.internal.p156gw.AbstractC4392c5;
import com.aspose.slides.internal.p156gw.AbstractC4409u4;
import com.aspose.slides.internal.p156gw.AbstractC4415wy;
import com.aspose.slides.internal.p156gw.AbstractC4416x1;
import com.aspose.slides.internal.p156gw.AbstractC4419yj;
import com.aspose.slides.internal.p156gw.C4405ne;
import com.aspose.slides.internal.p156gw.C4407rv;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p282mu.C6542kk;
import com.aspose.slides.internal.p282mu.C6544x1;
import com.aspose.slides.internal.p316of.C7035kk;
import com.aspose.slides.internal.p390s1.C10130to;
import com.aspose.slides.internal.p390s1.InterfaceC10128k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p531yq.InterfaceC12886x1;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C11896dy implements IDisposable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12886x1 f40063k4;

    /* JADX INFO: renamed from: kk */
    private int f40064kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f40065x1;

    public C11896dy() {
        this(0);
    }

    /* JADX INFO: renamed from: u4 */
    private boolean m55517u4() {
        boolean z = this.f40065x1;
        this.f40065x1 = false;
        return z;
    }

    /* JADX INFO: renamed from: uz */
    private boolean m55518uz() {
        return this.f40063k4.mo59951ck();
    }

    /* JADX INFO: renamed from: wl */
    private InterfaceC12886x1 m55519wl() {
        return AbstractC14124to.m67613h4().mo67638k4(null);
    }

    /* JADX INFO: renamed from: c5 */
    public C12007ix m55523c5() {
        return m55530jd();
    }

    /* JADX INFO: renamed from: ck */
    public C12025x6 m55524ck() {
        return this.f40063k4.mo59950c5();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11896dy c11896dy = new C11896dy((InterfaceC12886x1) this.f40063k4.deepClone());
        c11896dy.f40065x1 = this.f40065x1;
        return c11896dy;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f40063k4.mo59968ks();
    }

    /* JADX INFO: renamed from: du */
    public int m55525du() {
        return this.f40063k4.mo59953dy();
    }

    /* JADX INFO: renamed from: dy */
    public void m55526dy() {
        m55541k4((C11913yj) null, 0.25f);
    }

    /* JADX INFO: renamed from: fa */
    public void m55527fa() {
        this.f40063k4.mo59978yj();
        m55537k4(0);
    }

    /* JADX INFO: renamed from: h4 */
    public void m55528h4() {
        if (m55525du() < 1) {
            return;
        }
        this.f40063k4.mo59972up();
        if (!this.f40063k4.mo59956jd()) {
            this.f40063k4.mo59954fa();
        }
        this.f40065x1 = true;
    }

    /* JADX INFO: renamed from: ix */
    public InterfaceC12886x1 m55529ix() {
        return this.f40063k4;
    }

    /* JADX INFO: renamed from: jd */
    public C12007ix m55530jd() {
        return m55568ne().mo8355dy();
    }

    /* JADX INFO: renamed from: k4 */
    public int m55531k4() {
        return this.f40064kk;
    }

    /* JADX INFO: renamed from: kk */
    public void m55562kk(float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f || f4 <= 0.0f) {
            return;
        }
        this.f40063k4.mo59958k4(f, f2);
        float f5 = f3 + f;
        this.f40063k4.mo59975x1(f5, f2);
        float f6 = f2 + f4;
        this.f40063k4.mo59975x1(f5, f6);
        this.f40063k4.mo59975x1(f, f6);
        this.f40063k4.mo59954fa();
        this.f40065x1 = true;
    }

    /* JADX INFO: renamed from: ks */
    public boolean m55566ks() {
        if (!this.f40063k4.mo59956jd()) {
            return true;
        }
        byte[] bArrM55571to = m55571to();
        for (int i = 1; i < bArrM55571to.length; i++) {
            if (bArrM55571to[i] == 0 && (bArrM55571to[i - 1] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public void m55567m9() {
        if (new C11903ks(this.f40063k4).m55673x1().length > 0) {
            this.f40063k4.mo59954fa();
        }
        this.f40065x1 = true;
    }

    /* JADX INFO: renamed from: ne */
    public InterfaceC1565x1 m55568ne() {
        return this.f40063k4.mo59973x1();
    }

    /* JADX INFO: renamed from: rv */
    public boolean m55569rv() {
        if (m55525du() == 0) {
            return false;
        }
        if (this.f40063k4.mo59956jd()) {
            return true;
        }
        for (byte b : m55571to()) {
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: to */
    public void m55570to(C12025x6[] c12025x6Arr) {
        m55516kk(C6544x1.m26371k4(c12025x6Arr));
    }

    /* JADX INFO: renamed from: up */
    public void m55572up() {
        this.f40063k4.mo59955h4();
    }

    /* JADX INFO: renamed from: x1 */
    public C11903ks m55573x1() {
        return new C11903ks(this.f40063k4);
    }

    /* JADX INFO: renamed from: x6 */
    public boolean m55584x6() {
        int i;
        C12025x6 c12025x6;
        if (!m55529ix().mo59956jd()) {
            return false;
        }
        byte[] bArrM55571to = m55571to();
        C12025x6[] c12025x6ArrM55565kk = m55565kk();
        int i2 = 0;
        for (int i3 = 0; i3 < bArrM55571to.length; i3++) {
            if ((bArrM55571to[i3] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                if (i3 - i2 >= 2) {
                    do {
                        i = i2 + 2;
                        if (i <= i3) {
                            c12025x6 = c12025x6ArrM55565kk[i2];
                            i2++;
                        }
                    } while (C6542kk.m26359k4(c12025x6, c12025x6ArrM55565kk[i2], c12025x6ArrM55565kk[i], 0.499f));
                    return true;
                }
                i2 = i3 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: yj */
    public void m55585yj() {
        this.f40065x1 = true;
    }

    public C11896dy(int i) {
        this.f40065x1 = true;
        this.f40064kk = 0;
        InterfaceC12886x1 interfaceC12886x1M55519wl = m55519wl();
        this.f40063k4 = interfaceC12886x1M55519wl;
        this.f40064kk = i;
        interfaceC12886x1M55519wl.mo59961k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11896dy m55503k4(InterfaceC1565x1 interfaceC1565x1) {
        C11896dy c11896dy = new C11896dy();
        c11896dy.f40063k4.mo59962k4(interfaceC1565x1);
        return c11896dy;
    }

    /* JADX INFO: renamed from: kk */
    private void m55516kk(C6544x1[] c6544x1Arr) {
        if (c6544x1Arr == null) {
            throw new ArgumentNullException("points");
        }
        if (c6544x1Arr.length < 3) {
            throw new ArgumentException("Invalid parameter used.");
        }
        this.f40063k4.mo59958k4(c6544x1Arr[0].m26377k4().floatValue(), c6544x1Arr[0].m26379x1().floatValue());
        for (int i = 1; i < c6544x1Arr.length && (c6544x1Arr.length <= 3 || i != c6544x1Arr.length - 1 || !c6544x1Arr[i].m26376h4(c6544x1Arr[0])); i++) {
            this.f40063k4.mo59975x1(c6544x1Arr[i].m26377k4().floatValue(), c6544x1Arr[i].m26379x1().floatValue());
        }
        this.f40063k4.mo59954fa();
        this.f40065x1 = true;
    }

    /* JADX INFO: renamed from: to */
    public byte[] m55571to() {
        if (m55525du() >= 1) {
            return m55573x1().m55673x1();
        }
        throw new ArgumentException("Parameter is invalid");
    }

    /* JADX INFO: renamed from: x1 */
    public void m55574x1(float f, float f2, float f3, float f4) {
        m55529ix().mo59963k4(new AbstractC4409u4.k4(f, f2, f3, f4), !m55517u4());
    }

    private C11896dy(InterfaceC12886x1 interfaceC12886x1) {
        this.f40065x1 = true;
        this.f40064kk = 0;
        this.f40063k4 = interfaceC12886x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> C11896dy m55504k4(T t) {
        if (t == null) {
            return null;
        }
        return t instanceof InterfaceC1565x1 ? m55503k4((InterfaceC1565x1) t) : new C11896dy(AbstractC14124to.m67613h4().mo67638k4(t));
    }

    /* JADX INFO: renamed from: kk */
    public void m55563kk(C12016rv[] c12016rvArr) {
        m55516kk(C6544x1.m26370k4(c12016rvArr));
    }

    /* JADX INFO: renamed from: x1 */
    public void m55575x1(float f, float f2, float f3, float f4, float f5, float f6) {
        double d = f3 / f4;
        double dM17966k4 = C4405ne.m17966k4(d * d, f5);
        AbstractC4416x1.k4 k4Var = new AbstractC4416x1.k4(f, f2, f3, f4, (float) (-dM17966k4), (float) (-(C4405ne.m17966k4(r5, f5 + f6) - dM17966k4)), 2);
        C11896dy c11896dy = new C11896dy();
        c11896dy.f40063k4.mo59963k4((InterfaceC1565x1) k4Var, false);
        C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
        byte[] bArrM55571to = c11896dy.m55571to();
        C12025x6 c12025x6 = c12025x6ArrM55565kk[c12025x6ArrM55565kk.length - 1];
        for (int length = bArrM55571to.length - 1; length >= 1; length--) {
            c12025x6ArrM55565kk[length] = c12025x6ArrM55565kk[length - 1];
        }
        c12025x6ArrM55565kk[0] = c12025x6;
        bArrM55571to[1] = 1;
        bArrM55571to[bArrM55571to.length - 1] = -125;
        if (f5 == 0.0f && f6 % 360.0f == 0.0f) {
            c12025x6.m56898x1((int) ((f4 / 2.0f) + f2));
            c12025x6ArrM55565kk[1].m56898x1(c12025x6ArrM55565kk[0].m56895kk());
            c12025x6ArrM55565kk[c12025x6ArrM55565kk.length - 1].m56898x1(c12025x6ArrM55565kk[0].m56895kk());
        }
        this.f40063k4.mo59963k4(new C11896dy(c12025x6ArrM55565kk, bArrM55571to).f40063k4.mo59973x1(), false);
        this.f40065x1 = true;
    }

    private C11896dy(C6544x1[] c6544x1Arr, byte[] bArr, int i) {
        this(i);
        m55514k4(c6544x1Arr, bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private C11896dy m55505k4(boolean z, C11896dy c11896dy, C12013m9 c12013m9, C12013m9 c12013m92, String str, float f, float f2, float f3, float f4, C12019um c12019um) {
        C11896dy c11896dy2 = z ? new C11896dy() : this;
        C10130to c10130to = new C10130to(null, str, c12013m9, c12013m92, AbstractC14124to.m67614jd().mo67639k4((C11913yj) null, true, true), c12019um, f3, f4);
        c11896dy2.f40063k4.mo59955h4();
        int iMo59969m9 = c11896dy2.f40063k4.mo59969m9();
        if (c11896dy == null) {
            while (true) {
                InterfaceC10128k4 interfaceC10128k4M49754dy = c10130to.m49754dy();
                if (interfaceC10128k4M49754dy == null) {
                    break;
                }
                c11896dy2.f40063k4.mo59963k4(interfaceC10128k4M49754dy.mo46211k4(f, f2), false);
            }
        } else {
            c11896dy2.m55540k4(c11896dy, false);
        }
        c11896dy2.m55572up();
        C11913yj c11913yjM49765ks = c10130to.m49765ks();
        if (c11913yjM49765ks != null) {
            InterfaceC12886x1 interfaceC12886x1 = c11896dy2.f40063k4;
            interfaceC12886x1.mo59966k4(c11913yjM49765ks, iMo59969m9, interfaceC12886x1.mo59969m9() - iMo59969m9);
        }
        return c11896dy2;
    }

    /* JADX INFO: renamed from: kk */
    public void m55564kk(C12025x6[] c12025x6Arr) {
        m55521x1(C6544x1.m26371k4(c12025x6Arr));
    }

    /* JADX INFO: renamed from: x1 */
    public void m55576x1(int i, int i2, int i3, int i4) {
        m55574x1(i, i2, i3, i4);
    }

    public C11896dy(C12016rv[] c12016rvArr, byte[] bArr) {
        this(c12016rvArr, bArr, 0);
    }

    /* JADX INFO: renamed from: x1 */
    private void m55520x1(C11896dy c11896dy) {
        C11896dy c11896dy2 = new C11896dy();
        this.f40063k4.mo59955h4();
        c11896dy2.m55540k4(c11896dy, false);
        m55540k4(c11896dy2, false);
        m55572up();
    }

    /* JADX INFO: renamed from: k4 */
    public C12007ix m55532k4(C11913yj c11913yj) {
        C11896dy c11896dy = (C11896dy) deepClone();
        if (c11913yj != null) {
            c11896dy.m55577x1(c11913yj);
        }
        return c11896dy.m55530jd();
    }

    /* JADX INFO: renamed from: kk */
    public C12025x6[] m55565kk() {
        if (m55525du() >= 1) {
            return m55573x1().m55672k4();
        }
        throw new ArgumentException("Parameter is invalid");
    }

    public C11896dy(C12016rv[] c12016rvArr, byte[] bArr, int i) {
        this(C6544x1.m26370k4(c12016rvArr), bArr, i);
    }

    /* JADX INFO: renamed from: k4 */
    public C12007ix m55533k4(C11913yj c11913yj, C12026yj c12026yj) {
        if (c12026yj != null) {
            C11896dy c11896dy = (C11896dy) deepClone();
            c11896dy.m55550k4(c12026yj, c11913yj);
            return c11896dy.m55530jd();
        }
        C12025x6[] c12025x6ArrM55672k4 = m55573x1().m55672k4();
        if (c12025x6ArrM55672k4.length == 0) {
            return C12007ix.f40519k4.Clone();
        }
        float fM56897x1 = c12025x6ArrM55672k4[0].m56897x1();
        float fM56895kk = c12025x6ArrM55672k4[0].m56895kk();
        float fM56897x12 = fM56897x1;
        float fM56895kk2 = fM56895kk;
        float fM56897x13 = fM56897x12;
        for (int i = 1; i < c12025x6ArrM55672k4.length; i++) {
            if (c12025x6ArrM55672k4[i].m56897x1() < fM56897x13) {
                fM56897x13 = c12025x6ArrM55672k4[i].m56897x1();
            }
            if (c12025x6ArrM55672k4[i].m56895kk() < fM56895kk) {
                fM56895kk = c12025x6ArrM55672k4[i].m56895kk();
            }
            if (c12025x6ArrM55672k4[i].m56897x1() > fM56897x12) {
                fM56897x12 = c12025x6ArrM55672k4[i].m56897x1();
            }
            if (c12025x6ArrM55672k4[i].m56895kk() > fM56895kk2) {
                fM56895kk2 = c12025x6ArrM55672k4[i].m56895kk();
            }
        }
        return (c11913yj == null || c11913yj.m55789x1()) ? C12007ix.m56541k4(fM56897x13, fM56895kk, fM56897x12, fM56895kk2) : C6541k4.m26346k4(c11913yj, new AbstractC4415wy.x1(fM56897x13, fM56895kk, fM56897x12 - fM56897x13, fM56895kk2 - fM56895kk)).mo8355dy();
    }

    /* JADX INFO: renamed from: x1 */
    public void m55577x1(C11913yj c11913yj) {
        if (c11913yj == null) {
            throw new ArgumentNullException("matrix");
        }
        this.f40063k4.mo59965k4(c11913yj);
    }

    public C11896dy(C12025x6[] c12025x6Arr, byte[] bArr) {
        this(c12025x6Arr, bArr, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> T m55506k4(C11896dy c11896dy) {
        if (c11896dy == null) {
            return null;
        }
        return (T) c11896dy.f40063k4.mo59967kk();
    }

    /* JADX INFO: renamed from: x1 */
    public void m55578x1(C12007ix c12007ix) {
        m55562kk(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
    }

    public C11896dy(C12025x6[] c12025x6Arr, byte[] bArr, int i) {
        this(C6544x1.m26371k4(c12025x6Arr), bArr, i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55534k4(float f, float f2, float f3, float f4) {
        this.f40063k4.mo59963k4((InterfaceC1565x1) new AbstractC4419yj.k4(f, f2, f3, f4), false);
        this.f40065x1 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55579x1(C12014ne c12014ne) {
        m55562kk(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55535k4(float f, float f2, float f3, float f4, float f5, float f6) {
        C12025x6 c12025x6Mo59950c5;
        double d = f3 / f4;
        double dM17966k4 = C4405ne.m17966k4(d * d, f5);
        this.f40063k4.mo59963k4(new AbstractC4416x1.k4(f, f2, f3, f4, (float) (-dM17966k4), (float) (-(C4405ne.m17966k4(r4, f5 + f6) - dM17966k4)), 0), !m55517u4());
        if (f3 != f4) {
            if ((f5 == 270.0f || f5 == 90.0f) && f6 == 90.0f && (c12025x6Mo59950c5 = this.f40063k4.mo59950c5()) != null) {
                this.f40063k4.mo59960k4(c12025x6Mo59950c5.m56897x1(), c12025x6Mo59950c5.m56895kk(), c12025x6Mo59950c5.m56897x1(), c12025x6Mo59950c5.m56895kk(), c12025x6Mo59950c5.m56897x1(), c12025x6Mo59950c5.m56895kk());
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m55580x1(C12014ne c12014ne, float f, float f2) {
        m55575x1(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1(), f, f2);
    }

    /* JADX INFO: renamed from: x1 */
    private void m55521x1(C6544x1[] c6544x1Arr) {
        if (c6544x1Arr == null) {
            throw new ArgumentNullException("Value of 'points' cannot be null");
        }
        if (c6544x1Arr.length == 0) {
            throw new ArgumentException("Value of 'points' cannot be empty");
        }
        if (m55517u4() || this.f40063k4.mo59956jd()) {
            this.f40063k4.mo59958k4(c6544x1Arr[0].m26377k4().floatValue(), c6544x1Arr[0].m26379x1().floatValue());
        } else if (c6544x1Arr[0].m26377k4().floatValue() != m55524ck().m56897x1() || c6544x1Arr[0].m26379x1().floatValue() != m55524ck().m56895kk()) {
            this.f40063k4.mo59975x1(c6544x1Arr[0].m26377k4().floatValue(), c6544x1Arr[0].m26379x1().floatValue());
        }
        for (int i = 1; i < c6544x1Arr.length; i++) {
            this.f40063k4.mo59975x1(c6544x1Arr[i].m26377k4().floatValue(), c6544x1Arr[i].m26379x1().floatValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55536k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f40063k4.mo59963k4(new AbstractC4392c5.k4(f, f2, f3, f4, f5, f6, f7, f8), !m55517u4());
    }

    /* JADX INFO: renamed from: x1 */
    private void m55522x1(C6544x1[] c6544x1Arr, float f) {
        if (c6544x1Arr == null) {
            throw new ArgumentNullException("Value of 'points' cannot be null");
        }
        m55513k4(c6544x1Arr, 0, c6544x1Arr.length - 1, f);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55537k4(int i) {
        if (i < 0 || i > 1) {
            throw new InvalidEnumArgumentException("value");
        }
        this.f40064kk = i;
        this.f40063k4.mo59961k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55538k4(int i, int i2, int i3, int i4) {
        m55534k4(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55581x1(C12016rv[] c12016rvArr) {
        m55521x1(C6544x1.m26370k4(c12016rvArr));
    }

    /* JADX INFO: renamed from: k4 */
    public void m55539k4(int i, int i2, int i3, int i4, float f, float f2) {
        m55535k4(i, i2, i3, i4, f, f2);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55582x1(C12025x6[] c12025x6Arr) {
        m55583x1(c12025x6Arr, 0.5f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55507k4(C4407rv c4407rv) {
        InterfaceC12886x1 interfaceC12886x1Mo67638k4 = AbstractC14124to.m67613h4().mo67638k4(null);
        interfaceC12886x1Mo67638k4.mo59964k4((InterfaceC4413v4) c4407rv, false);
        InterfaceC12886x1 interfaceC12886x1 = this.f40063k4;
        if (interfaceC12886x1 != null) {
            interfaceC12886x1.mo59968ks();
        }
        this.f40063k4 = interfaceC12886x1Mo67638k4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55583x1(C12025x6[] c12025x6Arr, float f) {
        m55522x1(C6544x1.m26371k4(c12025x6Arr), f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55508k4(C11896dy c11896dy, C12013m9 c12013m9, C12013m9 c12013m92, String str, float f, float f2, float f3, float f4, C12019um c12019um) {
        m55505k4(false, c11896dy, c12013m9, c12013m92, str, f, f2, f3, f4, c12019um);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55540k4(C11896dy c11896dy, boolean z) {
        if (c11896dy == null) {
            throw new ArgumentNullException("Value of 'addingPath' cannot be null");
        }
        if (m55517u4() || this.f40063k4.mo59956jd() || c11896dy.f40063k4.mo59956jd()) {
            z = false;
        }
        this.f40063k4.mo59963k4(c11896dy.f40063k4.mo59973x1(), z);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55541k4(C11913yj c11913yj, float f) {
        if (m55518uz()) {
            m55507k4((C4407rv) m55568ne().mo8356k4(c11913yj, f));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55542k4(C12007ix c12007ix) {
        m55534k4(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55543k4(C12007ix c12007ix, float f, float f2) {
        m55535k4(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1(), f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55544k4(C12014ne c12014ne) {
        m55538k4(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55545k4(C12014ne c12014ne, float f, float f2) {
        m55539k4(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1(), f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55546k4(C12016rv c12016rv, C12016rv c12016rv2) {
        m55576x1(c12016rv.m56708k4(), c12016rv.m56713x1(), c12016rv2.m56708k4(), c12016rv2.m56713x1());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55547k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        m55574x1(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55548k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        m55536k4(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk(), c12025x63.m56897x1(), c12025x63.m56895kk(), c12025x64.m56897x1(), c12025x64.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55549k4(C12026yj c12026yj) {
        m55550k4(c12026yj, (C11913yj) null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55550k4(C12026yj c12026yj, C11913yj c11913yj) {
        m55551k4(c12026yj, c11913yj, 0.6666667f);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55551k4(C12026yj c12026yj, C11913yj c11913yj, float f) {
        if (c12026yj == null) {
            throw new ArgumentNullException("pen");
        }
        if (m55525du() == 0) {
            return;
        }
        if (m55525du() <= 1) {
            throw new OutOfMemoryException("Path count must be greater than 1");
        }
        C4368c5.m17435k4(this, c12026yj, c11913yj, f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55509k4(String str, C12004dy c12004dy, float f, int i, int i2, float f2, float f3, float f4, float f5, C12019um c12019um) {
        C12013m9 c12013m9M27503x1;
        String strM27498k4;
        float fM56639dy;
        C12013m9 c12013m9;
        C12013m9 c12013m92;
        C12013m9 c12013m93;
        if (str == null) {
            throw new NullReferenceException("Value of 's' cannot be null");
        }
        if (c12004dy == null) {
            throw new ArgumentException("Value of 'family' cannot be null");
        }
        String strReplaceAll = str.replaceAll("\u0000", "");
        if (f <= 0.0f) {
            C12013m9 c12013m94 = new C12013m9(c12004dy, 1.0E-4f, i, i2);
            String strM27497k4 = C7035kk.m27497k4(c12013m94, strReplaceAll);
            c12013m9M27503x1 = C7035kk.m27503x1(c12013m94, strM27497k4);
            strM27498k4 = C7035kk.m27498k4(c12013m9M27503x1.m56648m9(), strM27497k4);
            c12013m92 = null;
            fM56639dy = f;
            c12013m9 = c12013m94;
            c12013m93 = null;
        } else {
            C12013m9 c12013m95 = new C12013m9(c12004dy, f, i, i2);
            String strM27497k42 = C7035kk.m27497k4(c12013m95, strReplaceAll);
            c12013m9M27503x1 = C7035kk.m27503x1(c12013m95, strM27497k42);
            strM27498k4 = C7035kk.m27498k4(c12013m9M27503x1.m56648m9(), strM27497k42);
            fM56639dy = c12013m9M27503x1.m56639dy();
            float f6 = 128;
            c12013m9 = c12013m95;
            c12013m92 = new C12013m9(c12013m9M27503x1.m56651x1(), fM56639dy * f6, i, i2);
            c12013m93 = new C12013m9(c12013m95.m56651x1(), c12013m95.m56639dy() * f6, i, i2);
        }
        if (c12013m92 == null || fM56639dy >= 80.0f) {
            m55508k4(null, C4378x1.m17685k4(c12013m9M27503x1, c12019um, 4), c12013m9, strM27498k4, f2, f3, f4, f5, c12019um);
            return;
        }
        C11896dy c11896dy = new C11896dy();
        float f7 = 128;
        c11896dy.m55508k4(null, C4378x1.m17685k4(c12013m92, c12019um, 4), c12013m93, strM27498k4, f2 * f7, f3 * f7, f4 * f7, f5 * f7, c12019um);
        float f8 = 1.0f / f7;
        c11896dy.m55577x1(new C11913yj(f8, 0.0f, 0.0f, f8, 0.0f, 0.0f));
        m55520x1(c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55552k4(String str, C12004dy c12004dy, int i, float f, C12025x6 c12025x6, C12019um c12019um) {
        m55509k4(str, c12004dy, f, i, 2, c12025x6.m56897x1(), c12025x6.m56895kk(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, c12019um);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55510k4(float[] fArr, boolean z, float f) {
        float f2 = f / 3.0f;
        if (!z) {
            this.f40063k4.mo59958k4(fArr[2], fArr[3]);
        } else if (fArr[2] != m55524ck().m56897x1() || fArr[3] != m55524ck().m56895kk()) {
            this.f40063k4.mo59975x1(fArr[2], fArr[3]);
        }
        float f3 = fArr[4] - fArr[0];
        float f4 = fArr[5] - fArr[1];
        float f5 = (f3 * f2) + fArr[2];
        float f6 = (f4 * f2) + fArr[3];
        int length = fArr.length - 4;
        float f7 = f6;
        float f8 = f5;
        for (int i = 2; i < length; i += 2) {
            int i2 = i + 2;
            int i3 = i + 3;
            float f9 = fArr[i + 4] - fArr[i];
            float f10 = fArr[i + 5] - fArr[i + 1];
            float f11 = fArr[i2];
            float f12 = f2 * f9;
            float f13 = fArr[i3];
            float f14 = f2 * f10;
            this.f40063k4.mo59960k4(f8, f7, f11 - f12, f13 - f14, f11, f13);
            f8 = fArr[i2] + f12;
            f7 = fArr[i3] + f14;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55511k4(C6544x1[] c6544x1Arr) {
        if (c6544x1Arr == null) {
            throw new ArgumentNullException("points");
        }
        if (c6544x1Arr.length < 4 || c6544x1Arr.length % 3 != 1) {
            throw new ArgumentException("points");
        }
        m55536k4(c6544x1Arr[0].m26377k4().floatValue(), c6544x1Arr[0].m26379x1().floatValue(), c6544x1Arr[1].m26377k4().floatValue(), c6544x1Arr[1].m26379x1().floatValue(), c6544x1Arr[2].m26377k4().floatValue(), c6544x1Arr[2].m26379x1().floatValue(), c6544x1Arr[3].m26377k4().floatValue(), c6544x1Arr[3].m26379x1().floatValue());
        for (int i = 4; i < c6544x1Arr.length; i += 3) {
            InterfaceC12886x1 interfaceC12886x1 = this.f40063k4;
            float fFloatValue = c6544x1Arr[i].m26377k4().floatValue();
            float fFloatValue2 = c6544x1Arr[i].m26379x1().floatValue();
            int i2 = i + 1;
            float fFloatValue3 = c6544x1Arr[i2].m26377k4().floatValue();
            float fFloatValue4 = c6544x1Arr[i2].m26379x1().floatValue();
            int i3 = i + 2;
            interfaceC12886x1.mo59960k4(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, c6544x1Arr[i3].m26377k4().floatValue(), c6544x1Arr[i3].m26379x1().floatValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55512k4(C6544x1[] c6544x1Arr, float f) {
        if (c6544x1Arr == null) {
            throw new ArgumentNullException("Value of 'points' cannot be null");
        }
        if (c6544x1Arr.length < 3) {
            throw new ArgumentException("Value of 'points' is not valid");
        }
        int length = (c6544x1Arr.length + 3) * 2;
        float[] fArr = new float[length];
        fArr[length - 1] = c6544x1Arr[1].m26379x1().floatValue();
        fArr[length - 2] = c6544x1Arr[1].m26377k4().floatValue();
        fArr[length - 3] = c6544x1Arr[0].m26379x1().floatValue();
        int i = length - 4;
        fArr[i] = c6544x1Arr[0].m26377k4().floatValue();
        for (int length2 = c6544x1Arr.length - 1; length2 >= 0; length2--) {
            fArr[i - 1] = c6544x1Arr[length2].m26379x1().floatValue();
            i -= 2;
            fArr[i] = c6544x1Arr[length2].m26377k4().floatValue();
        }
        fArr[i - 1] = c6544x1Arr[c6544x1Arr.length - 1].m26379x1().floatValue();
        fArr[i - 2] = c6544x1Arr[c6544x1Arr.length - 1].m26377k4().floatValue();
        m55510k4(fArr, false, f);
        m55567m9();
    }

    /* JADX INFO: renamed from: k4 */
    private void m55513k4(C6544x1[] c6544x1Arr, int i, int i2, float f) {
        if (c6544x1Arr == null) {
            throw new ArgumentNullException("Value of 'points' cannot be null");
        }
        if (c6544x1Arr.length < 2) {
            throw new ArgumentException("Value of 'points' is not valid");
        }
        if (i2 <= 0) {
            throw new ArgumentException("Value of 'numberOfSegments' is not valid");
        }
        if (i < 0) {
            throw new ArgumentException("Value of 'offset' is not valid");
        }
        if (i + i2 >= c6544x1Arr.length) {
            throw new ArgumentException("Value of 'offset' or 'numberOfSegments' is not valid");
        }
        int i3 = i2 + 1;
        int i4 = i3 * 2;
        int i5 = i4 + 4;
        float[] fArr = new float[i5];
        int i6 = i + i3;
        if (i6 == c6544x1Arr.length) {
            i6--;
            fArr[i4 + 3] = c6544x1Arr[i6].m26379x1().floatValue();
            i5 = i4 + 2;
            fArr[i5] = c6544x1Arr[i6].m26377k4().floatValue();
        }
        while (i5 > 0 && i6 >= 0) {
            fArr[i5 - 1] = c6544x1Arr[i6].m26379x1().floatValue();
            i5 -= 2;
            fArr[i5] = c6544x1Arr[i6].m26377k4().floatValue();
            i6--;
        }
        if (i5 > 0) {
            fArr[1] = c6544x1Arr[0].m26379x1().floatValue();
            fArr[0] = c6544x1Arr[0].m26377k4().floatValue();
        }
        m55510k4(fArr, (m55517u4() || this.f40063k4.mo59956jd()) ? false : true, f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55514k4(C6544x1[] c6544x1Arr, byte[] bArr) {
        if (c6544x1Arr == null) {
            throw new ArgumentNullException("Value of 'pts' cannot be null");
        }
        if (bArr == null) {
            throw new NullReferenceException("Value of 'types' cannot be null");
        }
        if (c6544x1Arr.length != bArr.length) {
            throw new ArgumentException("Value of 'pts.length' must be equal to 'types.length'");
        }
        this.f40063k4.mo59978yj();
        if (bArr.length > 0 && (bArr[0] & 7) != 0) {
            bArr[0] = 0;
        }
        int i = 0;
        while (i < c6544x1Arr.length) {
            int i2 = bArr[i] & 7;
            if (i2 == 0) {
                this.f40063k4.mo59958k4(c6544x1Arr[i].m26377k4().floatValue(), c6544x1Arr[i].m26379x1().floatValue());
            } else if (i2 == 1) {
                this.f40063k4.mo59975x1(c6544x1Arr[i].m26377k4().floatValue(), c6544x1Arr[i].m26379x1().floatValue());
            } else if (i2 == 3) {
                int i3 = i + 2;
                if (i3 < c6544x1Arr.length) {
                    int i4 = i + 1;
                    if ((bArr[i4] & 7) == 3 && (bArr[i3] & 7) == 3) {
                        i += 2;
                        this.f40063k4.mo59960k4(c6544x1Arr[i].m26377k4().floatValue(), c6544x1Arr[i].m26379x1().floatValue(), c6544x1Arr[i4].m26377k4().floatValue(), c6544x1Arr[i4].m26379x1().floatValue(), c6544x1Arr[i].m26377k4().floatValue(), c6544x1Arr[i].m26379x1().floatValue());
                    }
                }
                m55515k4(new C12025x6[0], new byte[0]);
                return;
            }
            if ((bArr[i] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                this.f40063k4.mo59954fa();
            }
            if ((bArr[i] & 4) != 0) {
                this.f40063k4.mo59954fa();
            }
            if (i == c6544x1Arr.length - 1 && c6544x1Arr.length == bArr.length - 1) {
                int i5 = i + 1;
                if ((bArr[i5] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                    this.f40063k4.mo59954fa();
                }
                if ((bArr[i5] & 4) != 0) {
                    this.f40063k4.mo59954fa();
                }
            }
            if ((bArr[i] & 32) != 0) {
                this.f40063k4.mo59955h4();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55553k4(C12016rv[] c12016rvArr) {
        m55511k4(C6544x1.m26370k4(c12016rvArr));
    }

    /* JADX INFO: renamed from: k4 */
    public void m55554k4(C12016rv[] c12016rvArr, int i, int i2, float f) {
        m55513k4(C6544x1.m26370k4(c12016rvArr), i, i2, f);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55555k4(C12025x6[] c12025x6Arr) {
        m55511k4(C6544x1.m26371k4(c12025x6Arr));
    }

    /* JADX INFO: renamed from: k4 */
    public void m55556k4(C12025x6[] c12025x6Arr, float f) {
        m55512k4(C6544x1.m26371k4(c12025x6Arr), f);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55557k4(C12025x6[] c12025x6Arr, int i, int i2, float f) {
        m55513k4(C6544x1.m26371k4(c12025x6Arr), i, i2, f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55515k4(C12025x6[] c12025x6Arr, byte[] bArr) {
        m55514k4(C6544x1.m26371k4(c12025x6Arr), bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55558k4(double d, double d2, double d3, double d4) {
        return m55568ne().mo8358k4(d, d2, d3, d4);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55559k4(float f, float f2, AbstractC12008jd abstractC12008jd) {
        return m55568ne().mo8357k4(Math.round(f), Math.round(f2));
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55560k4(C12025x6 c12025x6) {
        return m55559k4(c12025x6.m56897x1(), c12025x6.m56895kk(), (AbstractC12008jd) null);
    }

    /* JADX INFO: renamed from: k4 */
    public C11896dy[] m55561k4(boolean z) {
        if (this.f40063k4.mo59953dy() < 2) {
            return new C11896dy[]{(C11896dy) deepClone()};
        }
        byte[] bArrM55571to = m55571to();
        int[] iArr = new int[bArrM55571to.length];
        int i = 0;
        for (int i2 = 0; i2 < bArrM55571to.length; i2++) {
            if (bArrM55571to[i2] == 0) {
                iArr[i] = i2;
                i++;
            }
        }
        if (i == 1) {
            return new C11896dy[]{(C11896dy) deepClone()};
        }
        C12025x6[] c12025x6ArrM55565kk = m55565kk();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < i) {
            int length = (i3 == i + (-1) ? bArrM55571to.length : iArr[i3 + 1]) - iArr[i3];
            byte[] bArr = new byte[length];
            C12025x6[] c12025x6Arr = new C12025x6[length];
            for (int i4 = 0; i4 < length; i4++) {
                c12025x6Arr[i4] = c12025x6ArrM55565kk[iArr[i3] + i4].Clone();
                bArr[i4] = bArrM55571to[iArr[i3] + i4];
            }
            C11896dy c11896dy = new C11896dy(c12025x6Arr, bArr);
            if (z) {
                throw new NotImplementedException();
            }
            arrayList.add(c11896dy);
            i3++;
        }
        return (C11896dy[]) arrayList.toArray(new C11896dy[arrayList.size()]);
    }
}

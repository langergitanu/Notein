package com.aspose.slides.internal.p138fu;

import Oooo0.C20855OooooOO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p089dp.C3209k4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p151gj.C4315ck;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p302nm.C6920du;
import com.aspose.slides.internal.p302nm.C6926m9;
import com.aspose.slides.internal.p302nm.C6928x1;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4127k4 implements IDisposable {

    /* JADX INFO: renamed from: du */
    protected C12009k4 f11299du;

    /* JADX INFO: renamed from: dy */
    private boolean f11300dy;

    /* JADX INFO: renamed from: h4 */
    protected int f11301h4;

    /* JADX INFO: renamed from: m9 */
    protected boolean f11302m9;

    /* JADX INFO: renamed from: k4 */
    public static final x1 f11295k4 = new x1() { // from class: com.aspose.slides.internal.fu.k4.1
        @Override // com.aspose.slides.internal.p138fu.C4127k4.x1
        /* JADX INFO: renamed from: k4 */
        public byte[] mo16550k4(C3983k4 c3983k4) {
            return new byte[C4127k4.m16511k4(c3983k4)];
        }
    };

    /* JADX INFO: renamed from: x1 */
    public static final x1 f11298x1 = new x1() { // from class: com.aspose.slides.internal.fu.k4.2
        @Override // com.aspose.slides.internal.p138fu.C4127k4.x1
        /* JADX INFO: renamed from: k4 */
        public byte[] mo16550k4(C3983k4 c3983k4) {
            return new byte[C4127k4.m16527x1(c3983k4)];
        }
    };

    /* JADX INFO: renamed from: kk */
    public static final x1 f11296kk = new x1() { // from class: com.aspose.slides.internal.fu.k4.3
        @Override // com.aspose.slides.internal.p138fu.C4127k4.x1
        /* JADX INFO: renamed from: k4 */
        public byte[] mo16550k4(C3983k4 c3983k4) {
            return new byte[C4127k4.m16522kk(c3983k4)];
        }
    };

    /* JADX INFO: renamed from: to */
    public static final k4 f11297to = new k4() { // from class: com.aspose.slides.internal.fu.k4.4
        @Override // com.aspose.slides.internal.p138fu.C4127k4.k4
        /* JADX INFO: renamed from: k4 */
        public byte[] mo16551k4(C3983k4 c3983k4, boolean z) {
            return new byte[C4127k4.m16513k4(c3983k4, z)];
        }
    };

    /* JADX INFO: renamed from: com.aspose.slides.internal.fu.k4$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract byte[] mo16551k4(C3983k4 c3983k4, boolean z);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.fu.k4$x1 */
    public static abstract class x1 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract byte[] mo16550k4(C3983k4 c3983k4);
    }

    public C4127k4() {
        this.f11300dy = false;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m16509k4(int i) {
        switch (i) {
            case 135173:
            case 135174:
            case 1060876:
                return 137224;
            case 137224:
            case 139273:
            case 196865:
            case 197634:
            case 198659:
            case 2498570:
                return i;
            case 1052676:
                return 137224;
            default:
                return 2498570;
        }
    }

    /* JADX INFO: renamed from: up */
    private void m16525up() throws Throwable {
        if (this.f11302m9) {
            C12009k4 c12009k4M16537jd = m16537jd();
            this.f11299du.dispose();
            this.f11299du = c12009k4M16537jd;
            this.f11302m9 = false;
        }
    }

    /* JADX INFO: renamed from: yj */
    private void m16530yj() {
        C12009k4 c12009k4M16535fa = m16535fa();
        this.f11299du.dispose();
        this.f11299du = c12009k4M16535fa;
    }

    /* JADX INFO: renamed from: c5 */
    public final C12014ne m16531c5() {
        return new C12014ne(0, 0, this.f11299du.mo15760yj(), this.f11299du.mo15757m9());
    }

    /* JADX INFO: renamed from: ck */
    public final C5656k4[] m16532ck() {
        C12003du[] c12003duArrM15746k4 = this.f11299du.mo15749c5().m15746k4();
        C5656k4[] c5656k4Arr = new C5656k4[c12003duArrM15746k4.length];
        for (int i = 0; i < c12003duArrM15746k4.length; i++) {
            c5656k4Arr[i] = C5656k4.m23095k4(c12003duArrM15746k4[i].Clone());
        }
        return c5656k4Arr;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        mo16490k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: du */
    public float m16533du() {
        if (this.f11302m9) {
            return 96.0f;
        }
        return this.f11299du.mo15758up();
    }

    /* JADX INFO: renamed from: dy */
    public final C12009k4 m16534dy() {
        return this.f11299du;
    }

    /* JADX INFO: renamed from: fa */
    public final C12009k4 m16535fa() {
        C4127k4 c4127k4 = new C4127k4(m16549x1(), m16546kk(), m16548to(), m16533du(), 137224);
        C12014ne c12014neClone = m16531c5().Clone();
        m16545k4(c12014neClone.Clone(), c4127k4, c12014neClone.Clone());
        C12009k4 c12009k4 = c4127k4.f11299du;
        c4127k4.f11299du = null;
        return c12009k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m16536h4() {
        return this.f11301h4;
    }

    /* JADX INFO: renamed from: jd */
    public final C12009k4 m16537jd() throws Throwable {
        C12009k4 c12009k4M16523kk = m16523kk(this.f11299du);
        c12009k4M16523kk.m56332k4(96.0f, 96.0f);
        return c12009k4M16523kk;
    }

    /* JADX INFO: renamed from: kk */
    public final int m16546kk() {
        return this.f11299du.mo15757m9();
    }

    /* JADX INFO: renamed from: m9 */
    public final int m16547m9() {
        return m16526x1(m16509k4(this.f11299du.mo15753jd()));
    }

    /* JADX INFO: renamed from: to */
    public float m16548to() {
        if (this.f11302m9) {
            return 96.0f;
        }
        return this.f11299du.mo15752dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m16549x1() {
        return this.f11299du.mo15760yj();
    }

    public C4127k4(int i, int i2) {
        this(i, i2, 96.0f, 96.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m16510k4(C3977ck c3977ck) {
        if (c3977ck.equals(C3977ck.m15678dy())) {
            return 4;
        }
        if (c3977ck.equals(C3977ck.m15681jd())) {
            return 5;
        }
        if (c3977ck.equals(C3977ck.m15684to())) {
            return 1;
        }
        if (c3977ck.equals(C3977ck.m15679fa())) {
            return 2;
        }
        if (c3977ck.equals(C3977ck.m15682kk()) || c3977ck.equals(C3977ck.m15675c5())) {
            return 6;
        }
        if (c3977ck.equals(C3977ck.m15680h4())) {
            return 7;
        }
        return c3977ck.equals(C3977ck.m15676ck()) ? 8 : 0;
    }

    /* JADX INFO: renamed from: kk */
    public static int m16522kk(C3983k4 c3983k4) {
        return c3983k4.m15716k4() * m16512k4(c3983k4, m16524to(c3983k4));
    }

    /* JADX INFO: renamed from: to */
    private static int m16524to(C3983k4 c3983k4) {
        int iM15720kk = c3983k4.m15720kk();
        if (iM15720kk == 196865) {
            return 1;
        }
        if (iM15720kk == 197634) {
            return 4;
        }
        if (iM15720kk == 198659) {
            return 8;
        }
        throw new InvalidOperationException("Cannot parse this pixel format.");
    }

    /* JADX INFO: renamed from: x1 */
    private static int m16526x1(int i) {
        switch (i) {
            case 135173:
            case 135174:
            case 137224:
            case 139273:
            case 397319:
            case 925707:
            case 1060876:
            case 1851406:
            case 2498570:
            case 3424269:
                return 0;
            case 196865:
            case 197634:
            case 198659:
                return 1;
            case 1052676:
                return 2;
            default:
                throw new InvalidOperationException("Unknown pixel format.");
        }
    }

    public C4127k4(int i, int i2, float f, float f2) {
        this(i, i2, f, f2, 2498570);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m16511k4(C3983k4 c3983k4) {
        return c3983k4.m15716k4() * c3983k4.m15722x1() * 3;
    }

    /* JADX INFO: renamed from: kk */
    private static C12009k4 m16523kk(C12009k4 c12009k4) throws Throwable {
        C3983k4 c3983k4;
        C3983k4 c3983k4M56597k4;
        if (m16526x1(c12009k4.mo15753jd()) != 0) {
            return new C12009k4(c12009k4);
        }
        C12009k4 c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), c12009k4.mo15753jd());
        C3983k4 c3983k4M56597k42 = null;
        try {
            c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        } catch (Throwable th) {
            th = th;
            c3983k4 = null;
        }
        try {
            c3983k4M56597k42 = c12009k42.m56597k4(new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), 2, c12009k42.mo15753jd());
            byte[] bArr = new byte[c3983k4M56597k4.m15715du()];
            long jM67357x1 = c3983k4M56597k4.m15721to().m67357x1();
            long jM67357x12 = c3983k4M56597k42.m15721to().m67357x1();
            int iM15715du = c3983k4M56597k4.m15715du();
            for (int i = 0; i < c3983k4M56597k4.m15716k4(); i++) {
                C3914k4.m15618k4(new C14112xw(jM67357x1), bArr, 0, iM15715du);
                C3914k4.m15621k4(bArr, 0, new C14112xw(jM67357x12), iM15715du);
                long j = iM15715du;
                jM67357x1 += j;
                jM67357x12 += j;
            }
            c12009k4.m56605k4(c3983k4M56597k4);
            c12009k42.m56605k4(c3983k4M56597k42);
            return c12009k42;
        } catch (Throwable th2) {
            th = th2;
            c3983k4 = c3983k4M56597k42;
            c3983k4M56597k42 = c3983k4M56597k4;
            if (c3983k4M56597k42 != null) {
                c12009k4.m56605k4(c3983k4M56597k42);
            }
            if (c3983k4 != null) {
                c12009k42.m56605k4(c3983k4);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static int m16527x1(C3983k4 c3983k4) {
        if ((c3983k4.m15720kk() & 262144) == 0) {
            return 0;
        }
        return c3983k4.m15716k4() * c3983k4.m15722x1();
    }

    public C4127k4(int i, int i2, float f, float f2, int i3) {
        this.f11300dy = false;
        i3 = m16526x1(i3) == 1 ? 2498570 : i3;
        if (i < 1 || i2 < 1) {
            i = 1;
            i2 = 1;
        }
        C12009k4 c12009k4 = new C12009k4(i, i2, i3);
        c12009k4.m56332k4(f, f2);
        m16544k4(c12009k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m16512k4(C3983k4 c3983k4, int i) {
        if (c3983k4.m15715du() >= 0) {
            return C20855OooooOO.OooO0O0((c3983k4.m15722x1() * i) / 8.0f, 14);
        }
        throw new InvalidOperationException("A bitmap has a negative stride and this is not yet supported.");
    }

    /* JADX INFO: renamed from: kk */
    public void mo16491kk(AbstractC3150x6 abstractC3150x6, int i) throws Throwable {
        m16525up();
        C4133up c4133up = new C4133up();
        try {
            c4133up.m16580k4(this.f11299du, abstractC3150x6, i, false);
        } finally {
            c4133up.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo16492x1(AbstractC3150x6 abstractC3150x6) throws Throwable {
        m16525up();
        m16528x1(this.f11299du, abstractC3150x6);
    }

    public C4127k4(C4327up c4327up) {
        this.f11300dy = false;
        if (c4327up.m17417k4() != 2) {
            throw new ArgumentException("Texture brush is expected.");
        }
        C12012lr c12012lr = (C12012lr) C4128kk.m16560k4((C4328x1) c4327up);
        try {
            m16544k4((C12009k4) c12012lr.m56619h4());
            this.f11302m9 = C12549du.m58492ix(c4327up.m17416x1()).m58546to() || C12549du.m58501k4(c4327up.m17416x1());
            c12012lr.dispose();
        } catch (Throwable th) {
            if (c12012lr != null) {
                c12012lr.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo16493x1(AbstractC3150x6 abstractC3150x6, int i) throws Throwable {
        m16525up();
        if (this.f11299du.mo15753jd() == 8207) {
            m16530yj();
        }
        m16521k4(this.f11299du, abstractC3150x6, i);
    }

    public C4127k4(byte[] bArr) {
        this.f11300dy = false;
        m16544k4(m16518k4(bArr));
        this.f11302m9 = C12549du.m58492ix(bArr).m58546to();
    }

    /* JADX INFO: renamed from: x1 */
    public static void m16528x1(AbstractC12002ck abstractC12002ck, AbstractC3150x6 abstractC3150x6) {
        abstractC12002ck.m56334k4(abstractC3150x6, C6926m9.m27185k4(C3977ck.m15682kk()), (C3986m9) null);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m16529x1(C12009k4 c12009k4) {
        return AbstractC12002ck.m56321kk(c12009k4.mo15753jd()) && m16516k4(c12009k4, false, false).m17310kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m16513k4(C3983k4 c3983k4, boolean z) {
        if (!z) {
            return 0;
        }
        return c3983k4.m15716k4() * c3983k4.m15722x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C4127k4 m16538k4(C12014ne c12014ne) {
        C4127k4 c4127k4 = new C4127k4(c12014ne.m56663c5(), c12014ne.m56683x1(), m16548to(), m16533du(), this.f11299du.mo15753jd());
        m16545k4(c12014ne.Clone(), c4127k4, c4127k4.m16531c5().Clone());
        return c4127k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4315ck m16514k4(C3983k4 c3983k4, boolean z, x1 x1Var, k4 k4Var) {
        int iM16524to = m16524to(c3983k4);
        int iM16512k4 = m16512k4(c3983k4, iM16524to);
        byte[] bArrMo16550k4 = x1Var.mo16550k4(c3983k4);
        byte[] bArrMo16551k4 = k4Var.mo16551k4(c3983k4, z);
        long jM67357x1 = c3983k4.m15721to().m67357x1();
        int i = 0;
        for (int i2 = 0; i2 < c3983k4.m15716k4(); i2++) {
            C3914k4.m15618k4(new C14112xw(jM67357x1), bArrMo16550k4, i, iM16512k4);
            i += iM16512k4;
            jM67357x1 += (long) c3983k4.m15715du();
        }
        return new C4315ck(bArrMo16550k4, bArrMo16551k4, false, 1, iM16524to);
    }

    /* JADX INFO: renamed from: k4 */
    private static C4315ck m16515k4(C3983k4 c3983k4, boolean z, x1 x1Var, x1 x1Var2) {
        boolean z2;
        byte b;
        C3983k4 c3983k42 = c3983k4;
        switch (c3983k42.m15720kk()) {
            case 137224:
            case 139273:
            case 925707:
            case 2498570:
                if (c3983k42.m15715du() < 0) {
                    throw new InvalidOperationException("A bitmap has a negative stride and this is not yet supported.");
                }
                byte[] bArrMo16550k4 = x1Var.mo16550k4(c3983k42);
                byte[] bArrMo16550k42 = x1Var2.mo16550k4(c3983k42);
                int iM15715du = c3983k42.m15715du();
                byte[] bArr = new byte[iM15715du];
                long jM67357x1 = c3983k42.m15721to().m67357x1();
                boolean z3 = c3983k42.m15720kk() == 139273;
                boolean z4 = (c3983k42.m15720kk() & 262144) != 0;
                int i = 0;
                boolean z5 = false;
                boolean z6 = false;
                int i2 = 0;
                int i3 = 0;
                while (i < c3983k42.m15716k4()) {
                    C3914k4.m15618k4(new C14112xw(jM67357x1), bArr, 0, iM15715du);
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < c3983k4.m15722x1()) {
                        byte b2 = bArr[i4];
                        int i6 = iM15715du;
                        byte b3 = bArr[i4 + 1];
                        int i7 = i4 + 3;
                        byte[] bArr2 = bArr;
                        byte b4 = bArr2[i4 + 2];
                        long j = jM67357x1;
                        if ((b2 & 255) > 0 || (b3 & 255) > 0 || (b4 & 255) > 0) {
                            z6 = true;
                        }
                        if (z4) {
                            i4 += 4;
                            byte b5 = bArr2[i7];
                            b = b2;
                            if ((b5 & 255) < 255) {
                                z5 = true;
                            }
                            bArrMo16550k42[i3] = b5;
                            i3++;
                        } else {
                            b = b2;
                            i4 = z3 ? i4 + 4 : i7;
                        }
                        bArrMo16550k4[i2 + 2] = b;
                        bArrMo16550k4[i2 + 1] = b3;
                        bArrMo16550k4[i2] = b4;
                        i2 += 3;
                        i5++;
                        iM15715du = i6;
                        bArr = bArr2;
                        jM67357x1 = j;
                    }
                    jM67357x1 += (long) c3983k4.m15715du();
                    i++;
                    c3983k42 = c3983k4;
                    iM15715du = iM15715du;
                    bArr = bArr;
                }
                if (z && z5 && !z6) {
                    for (int i8 = 0; i8 < bArrMo16550k42.length; i8++) {
                        byte b6 = (byte) ((bArrMo16550k42[i8] & 255) ^ 255);
                        int i9 = i8 * 3;
                        bArrMo16550k4[i9] = b6;
                        bArrMo16550k4[i9 + 1] = b6;
                        bArrMo16550k4[i9 + 2] = b6;
                    }
                    bArrMo16550k42 = C12565ks.f42077k4;
                    C3209k4.m13903k4(bArrMo16550k4.length, bArrMo16550k42.length).m13904k4(0);
                    z2 = false;
                } else {
                    z2 = z5;
                }
                return new C4315ck(bArrMo16550k4, bArrMo16550k42, z2, 0, 8);
            default:
                throw new InvalidOperationException("Cannot parse this pixel format.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C4315ck m16516k4(C12009k4 c12009k4, boolean z, boolean z2) {
        return m16517k4(c12009k4, z, z2, f11295k4, f11298x1, f11296kk, f11297to);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4315ck m16517k4(C12009k4 c12009k4, boolean z, boolean z2, x1 x1Var, x1 x1Var2, x1 x1Var3, k4 k4Var) {
        if (z) {
            return new C4315ck(new C6928x1().m27193k4(c12009k4), null, false, 2, 1);
        }
        try {
            int iM16509k4 = m16509k4(c12009k4.mo15753jd());
            C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, iM16509k4);
            int iM16526x1 = m16526x1(iM16509k4);
            if (iM16526x1 == 0) {
                C4315ck c4315ckM16515k4 = m16515k4(c3983k4M56597k4, z2, x1Var, x1Var2);
                if (c3983k4M56597k4 != null) {
                    c12009k4.m56605k4(c3983k4M56597k4);
                }
                return c4315ckM16515k4;
            }
            if (iM16526x1 != 1) {
                if (iM16526x1 != 2) {
                    throw new InvalidOperationException("Unknown color space.");
                }
                throw new InvalidOperationException("Have not seen any gray scale images yet.");
            }
            C4315ck c4315ckM16514k4 = m16514k4(c3983k4M56597k4, (c12009k4.mo15749c5().m15747x1() & 1) == 1, x1Var3, k4Var);
            if (c3983k4M56597k4 != null) {
                c12009k4.m56605k4(c3983k4M56597k4);
            }
            return c4315ckM16514k4;
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m16518k4(byte[] bArr) {
        C12009k4 c12009k4;
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            try {
                c12009k4 = new C12009k4((AbstractC3150x6) c3152yj, true);
            } catch (RuntimeException unused) {
                c12009k4 = new C12009k4(1, 1);
            }
            if (c12009k4.mo15753jd() != 8207) {
                return c12009k4;
            }
            C12009k4 c12009k42 = new C12009k4(c12009k4);
            c12009k4.dispose();
            return c12009k42;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16539k4() {
        C12009k4 c12009k4 = this.f11299du;
        if (c12009k4 != null) {
            c12009k4.dispose();
            this.f11299du = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16540k4(int i, int i2, C5656k4 c5656k4) {
        this.f11299du.m56604k4(i, i2, c5656k4.m23101k4().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo16489k4(AbstractC3150x6 abstractC3150x6) throws Throwable {
        m16525up();
        m16520k4(this.f11299du, abstractC3150x6, m16548to(), m16533du());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16541k4(AbstractC3150x6 abstractC3150x6, int i) throws Throwable {
        if (i == 4) {
            mo16493x1(abstractC3150x6, 80);
            return;
        }
        if (i == 5) {
            mo16489k4(abstractC3150x6);
        } else if (i == 6) {
            mo16492x1(abstractC3150x6);
        } else {
            if (i != 8) {
                throw new InvalidOperationException("Cannot save in this image format.");
            }
            mo16491kk(abstractC3150x6, 5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16542k4(C5656k4 c5656k4) {
        if (m16529x1(m16534dy())) {
            byte bM23102kk = (byte) c5656k4.m23102kk();
            byte bM23104to = (byte) c5656k4.m23104to();
            byte bM23099du = (byte) c5656k4.m23099du();
            C3983k4 c3983k4M56597k4 = null;
            try {
                int i = 0;
                c3983k4M56597k4 = this.f11299du.m56597k4(new C12014ne(0, 0, this.f11299du.mo15760yj(), this.f11299du.mo15757m9()), 3, this.f11299du.mo15753jd());
                if (m16526x1(this.f11299du.mo15753jd()) == 0) {
                    int iM15715du = c3983k4M56597k4.m15715du();
                    byte[] bArr = new byte[iM15715du];
                    long jM67357x1 = c3983k4M56597k4.m15721to().m67357x1();
                    int i2 = 0;
                    while (i2 < c3983k4M56597k4.m15716k4()) {
                        C3914k4.m15618k4(new C14112xw(jM67357x1), bArr, i, iM15715du);
                        int i3 = i;
                        int i4 = i3;
                        while (i3 < c3983k4M56597k4.m15722x1()) {
                            byte b = bArr[i4];
                            byte b2 = bArr[i4 + 1];
                            byte b3 = bArr[i4 + 2];
                            int i5 = i4 + 4;
                            if ((bArr[i4 + 3] & 255) == 0) {
                                if ((b3 & 255) != (bM23102kk & 255)) {
                                    bArr[i4 + 2] = bM23102kk;
                                }
                                if ((b2 & 255) != (bM23104to & 255)) {
                                    bArr[i4 + 1] = bM23104to;
                                }
                                if ((b & 255) != (bM23099du & 255)) {
                                    bArr[i4] = bM23099du;
                                }
                            }
                            i3++;
                            i4 = i5;
                        }
                        C3914k4.m15621k4(bArr, 0, new C14112xw(jM67357x1), iM15715du);
                        jM67357x1 += (long) c3983k4M56597k4.m15715du();
                        i2++;
                        i = 0;
                    }
                }
                if (c3983k4M56597k4 != null) {
                    this.f11299du.m56605k4(c3983k4M56597k4);
                }
            } catch (Throwable th) {
                if (c3983k4M56597k4 != null) {
                    this.f11299du.m56605k4(c3983k4M56597k4);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16543k4(C6920du c6920du) {
        C12003du c12003duClone = C12003du.m56398k4(0, 0, 0, 0).Clone();
        C12003du c12003duClone2 = C12003du.m56460uz().Clone();
        C4127k4 c4127k4 = new C4127k4(m16549x1(), m16546kk(), m16548to(), m16533du(), 2498570);
        for (int i = 0; i < this.f11299du.mo15760yj(); i++) {
            for (int i2 = 0; i2 < this.f11299du.mo15757m9(); i2++) {
                c4127k4.f11299du.m56604k4(i, i2, (c6920du.m27122k4(C5656k4.m23095k4(this.f11299du.m56609x1(i, i2).Clone())) ? c12003duClone : c12003duClone2).Clone());
            }
        }
        this.f11299du.dispose();
        this.f11299du = c4127k4.f11299du;
        c4127k4.f11299du = null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16519k4(AbstractC12002ck abstractC12002ck, AbstractC3150x6 abstractC3150x6) {
        abstractC12002ck.m56334k4(abstractC3150x6, C6926m9.m27185k4(C3977ck.m15681jd()), (C3986m9) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16520k4(AbstractC12002ck abstractC12002ck, AbstractC3150x6 abstractC3150x6, float f, float f2) {
        m16519k4(abstractC12002ck, abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16521k4(AbstractC12002ck abstractC12002ck, AbstractC3150x6 abstractC3150x6, int i) {
        C3982jd c3982jdM27185k4 = C6926m9.m27185k4(C3977ck.m15678dy());
        C3986m9 c3986m9 = new C3986m9();
        c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10783du, i);
        try {
            abstractC12002ck.m56334k4(abstractC3150x6, c3982jdM27185k4, c3986m9);
        } catch (RuntimeException unused) {
            abstractC3150x6.setPosition(0L);
            C12009k4 c12009k4 = new C12009k4(abstractC12002ck);
            try {
                c12009k4.m56334k4(abstractC3150x6, c3982jdM27185k4, c3986m9);
            } finally {
                c12009k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16544k4(C12009k4 c12009k4) {
        this.f11299du = c12009k4;
        this.f11301h4 = m16510k4(c12009k4.mo15750ck());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16545k4(C12014ne c12014ne, C4127k4 c4127k4, C12014ne c12014ne2) {
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c4127k4.f11299du);
        try {
            abstractC12008jdM56582k4.mo17560kk(7);
            abstractC12008jdM56582k4.mo17512k4(this.f11299du, c12014ne2.Clone(), c12014ne.Clone(), 2);
            abstractC12008jdM56582k4.dispose();
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo16490k4(boolean z) {
        if (this.f11300dy) {
            return;
        }
        m16539k4();
        this.f11300dy = true;
    }
}

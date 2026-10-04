package com.aspose.slides.internal.p166hg;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p205ji.AbstractC5470v4;
import com.aspose.slides.internal.p205ji.C5458kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.m9 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC4550m9 {

    /* JADX INFO: renamed from: kk */
    private static C5458kk f12693kk = new C5458kk(true);

    /* JADX INFO: renamed from: k4 */
    protected AbstractC3150x6 f12694k4;

    /* JADX INFO: renamed from: x1 */
    protected AbstractC4523ai f12695x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.hg.m9$k4 */
    public static class k4 implements InterfaceC14083qm {

        /* JADX INFO: renamed from: c5 */
        private byte[] f12696c5;

        /* JADX INFO: renamed from: du */
        private C5458kk f12697du;

        /* JADX INFO: renamed from: dy */
        private boolean f12698dy;

        /* JADX INFO: renamed from: h4 */
        private byte[] f12699h4;

        /* JADX INFO: renamed from: k4 */
        private Object f12700k4 = new Object();

        /* JADX INFO: renamed from: kk */
        private Object f12701kk;

        /* JADX INFO: renamed from: m9 */
        private AbstractC3150x6 f12702m9;

        /* JADX INFO: renamed from: to */
        private Exception f12703to;

        /* JADX INFO: renamed from: x1 */
        private AbstractC14078m9 f12704x1;

        public k4(AbstractC14078m9 abstractC14078m9, Object obj, byte[] bArr, AbstractC3150x6 abstractC3150x6) {
            this.f12704x1 = abstractC14078m9;
            this.f12701kk = obj;
            this.f12696c5 = bArr;
            this.f12702m9 = abstractC3150x6;
        }

        /* JADX INFO: renamed from: du */
        public byte[] m18810du() {
            return this.f12699h4;
        }

        /* JADX INFO: renamed from: dy */
        public boolean m18811dy() {
            return mo18728kk() && this.f12703to != null;
        }

        /* JADX INFO: renamed from: h4 */
        public byte[] m18812h4() {
            return this.f12696c5;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: k4 */
        public Object mo18725k4() {
            return this.f12701kk;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: kk */
        public boolean mo18728kk() {
            boolean z;
            synchronized (this.f12700k4) {
                z = this.f12698dy;
            }
            return z;
        }

        /* JADX INFO: renamed from: m9 */
        public Exception m18815m9() {
            return this.f12703to;
        }

        /* JADX INFO: renamed from: to */
        public AbstractC3150x6 m18816to() {
            return this.f12702m9;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: x1 */
        public AbstractC5470v4 mo18731x1() {
            synchronized (this.f12700k4) {
                try {
                    if (this.f12697du == null) {
                        this.f12697du = new C5458kk(this.f12698dy);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.f12697du;
        }

        /* JADX INFO: renamed from: k4 */
        public void m18813k4(Exception exception) {
            m18809k4(exception, null);
        }

        /* JADX INFO: renamed from: k4 */
        private void m18809k4(Exception exception, byte[] bArr) {
            synchronized (this.f12700k4) {
                try {
                    if (!this.f12698dy) {
                        this.f12698dy = true;
                        this.f12703to = exception;
                        this.f12699h4 = bArr;
                        C5458kk c5458kk = this.f12697du;
                        if (c5458kk != null) {
                            c5458kk.mo22555x1();
                        }
                        AbstractC14078m9 abstractC14078m9 = this.f12704x1;
                        if (abstractC14078m9 != null) {
                            abstractC14078m9.m66837k4(this, null, null);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        public void m18814k4(byte[] bArr) {
            m18809k4(null, bArr);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.hg.m9$x1 */
    public static class x1 implements InterfaceC14083qm {

        /* JADX INFO: renamed from: du */
        private C5458kk f12705du;

        /* JADX INFO: renamed from: h4 */
        private AbstractC2417k4 f12706h4;

        /* JADX INFO: renamed from: k4 */
        private final Object f12707k4 = new Object();

        /* JADX INFO: renamed from: kk */
        private Object f12708kk;

        /* JADX INFO: renamed from: m9 */
        private boolean f12709m9;

        /* JADX INFO: renamed from: to */
        private Exception f12710to;

        /* JADX INFO: renamed from: x1 */
        private AbstractC14078m9 f12711x1;

        public x1(AbstractC14078m9 abstractC14078m9, Object obj, AbstractC2417k4 abstractC2417k4) {
            this.f12711x1 = abstractC14078m9;
            this.f12708kk = obj;
            this.f12706h4 = abstractC2417k4;
        }

        /* JADX INFO: renamed from: du */
        public Exception m18817du() {
            return this.f12710to;
        }

        /* JADX INFO: renamed from: h4 */
        public boolean m18818h4() {
            return mo18728kk() && this.f12710to != null;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: k4 */
        public Object mo18725k4() {
            return this.f12708kk;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: kk */
        public boolean mo18728kk() {
            boolean z;
            synchronized (this.f12707k4) {
                z = this.f12709m9;
            }
            return z;
        }

        /* JADX INFO: renamed from: m9 */
        public void m18820m9() {
            m18819k4(null);
        }

        /* JADX INFO: renamed from: to */
        public AbstractC2417k4 m18821to() {
            return this.f12706h4;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: x1 */
        public AbstractC5470v4 mo18731x1() {
            synchronized (this.f12707k4) {
                try {
                    if (this.f12705du == null) {
                        this.f12705du = new C5458kk(this.f12709m9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.f12705du;
        }

        /* JADX INFO: renamed from: k4 */
        public void m18819k4(Exception exception) {
            synchronized (this.f12707k4) {
                try {
                    if (!this.f12709m9) {
                        this.f12709m9 = true;
                        C5458kk c5458kk = this.f12705du;
                        if (c5458kk != null) {
                            c5458kk.mo22555x1();
                        }
                        AbstractC14078m9 abstractC14078m9 = this.f12711x1;
                        if (abstractC14078m9 != null) {
                            abstractC14078m9.m66837k4(this, null, null);
                        }
                        this.f12710to = exception;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AbstractC4550m9(AbstractC3150x6 abstractC3150x6, AbstractC4523ai abstractC4523ai) {
        this.f12694k4 = abstractC3150x6;
        this.f12695x1 = abstractC4523ai;
        abstractC4523ai.m18650k4(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public void m18778du(InterfaceC14083qm interfaceC14083qm) {
        x1 x1Var = (x1) C7019kk.m27452k4(interfaceC14083qm.mo18725k4(), x1.class);
        try {
            m18802kk(interfaceC14083qm);
            x1Var.m18821to().mo11835dy();
            x1Var.m18821to().m18738du();
            x1Var.m18820m9();
        } catch (Exception e) {
            x1Var.m18819k4(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: to */
    public void m18786to(InterfaceC14083qm interfaceC14083qm) {
        k4 k4Var = (k4) C7019kk.m27452k4(interfaceC14083qm.mo18725k4(), k4.class);
        AbstractC3150x6 abstractC3150x6M18816to = k4Var.m18816to();
        try {
            byte[] bArr = null;
            if (k4Var.m18816to().endRead(interfaceC14083qm) == 0) {
                k4Var.m18814k4((byte[]) C7019kk.m27458kk((Object) null, byte[].class));
                return;
            }
            int iM27462to = C7019kk.m27462to(Byte.valueOf(k4Var.m18812h4()[0]), 6);
            this.f12695x1.m18647k4((byte) 1);
            byte b = (byte) iM27462to;
            byte[] bArrM18783k4 = m18783k4(iM27462to, abstractC3150x6M18816to);
            if (bArrM18783k4 == null) {
                k4Var.m18814k4((byte[]) C7019kk.m27458kk((Object) null, byte[].class));
                return;
            }
            if ((b != 21 || bArrM18783k4.length != 2) && m18791k4().m18631c6() != null && m18791k4().m18631c6().m18754k4() != null) {
                bArrM18783k4 = m18787to(b, bArrM18783k4);
            }
            if (b != -128) {
                switch (b) {
                    case 20:
                        m18804x1();
                        break;
                    case 21:
                        m18789x1(C7019kk.m27442k4(Byte.valueOf(bArrM18783k4[0]), 6), C7019kk.m27442k4(Byte.valueOf(bArrM18783k4[1]), 6));
                        if (abstractC3150x6M18816to.canSeek()) {
                            abstractC3150x6M18816to.setLength(0L);
                        }
                        k4Var.m18814k4(bArr);
                    case 22:
                        C4540gi c4540gi = new C4540gi(bArrM18783k4);
                        while (!c4540gi.m18743k4()) {
                            mo18753k4(c4540gi);
                        }
                        break;
                    case 23:
                        break;
                    default:
                        throw new C4545k4((byte) 10, "Unknown record received from server.");
                }
            } else {
                this.f12695x1.m18663ne().m18742k4(bArrM18783k4);
            }
            bArr = bArrM18783k4;
            k4Var.m18814k4(bArr);
        } catch (Exception e) {
            k4Var.m18813k4(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC2417k4 mo18752k4(byte b) {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo18753k4(C4540gi c4540gi);

    /* JADX INFO: renamed from: kk */
    public void m18802kk(InterfaceC14083qm interfaceC14083qm) {
        if (!C7019kk.m27469x1(interfaceC14083qm, x1.class)) {
            this.f12694k4.endWrite(interfaceC14083qm);
            return;
        }
        x1 x1Var = (x1) C7019kk.m27452k4((Object) interfaceC14083qm, x1.class);
        if (!x1Var.mo18728kk()) {
            x1Var.mo18731x1().m22558du();
        }
        if (x1Var.m18818h4()) {
            throw x1Var.m18817du();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m18804x1() {
        AbstractC4523ai abstractC4523aiM18791k4 = m18791k4();
        abstractC4523aiM18791k4.m18680x1(0L);
        if (C7019kk.m27469x1(abstractC4523aiM18791k4, C4562tq.class)) {
            abstractC4523aiM18791k4.m18641h4(true);
        } else {
            abstractC4523aiM18791k4.m18634du(false);
        }
    }

    /* JADX INFO: renamed from: to */
    private byte[] m18787to(byte b, byte[] bArr) {
        try {
            byte[][] bArr2 = {null};
            byte[][] bArr3 = {null};
            this.f12695x1.m18631c6().m18754k4().m18891k4(bArr, bArr2, bArr3);
            byte[] bArr4 = bArr2[0];
            if (!m18782k4(C7019kk.m27469x1(m18791k4(), C4562tq.class) ? this.f12695x1.m18631c6().m18754k4().mo18735k4(b, bArr4) : this.f12695x1.m18631c6().m18754k4().mo18736x1(b, bArr4), bArr3[0])) {
                throw new C4545k4((byte) 20, "Bad record MAC");
            }
            AbstractC4523ai abstractC4523ai = this.f12695x1;
            abstractC4523ai.m18680x1(abstractC4523ai.m18671u4() + 1);
            return bArr4;
        } catch (RuntimeException e) {
            if (C7019kk.m27469x1(this.f12695x1, C4531ck.class)) {
                m18791k4().m18627b3().m18805x1((byte) 21);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4523ai m18791k4() {
        return this.f12695x1;
    }

    /* JADX INFO: renamed from: kk */
    public byte[] m18803kk(byte b) {
        AbstractC2417k4 abstractC2417k4Mo18752k4 = mo18752k4(b);
        abstractC2417k4Mo18752k4.m11840yj();
        byte[] bArrM18808x1 = m18808x1(abstractC2417k4Mo18752k4.m11839up(), abstractC2417k4Mo18752k4.m11838ks());
        abstractC2417k4Mo18752k4.mo11835dy();
        abstractC2417k4Mo18752k4.m18738du();
        return bArrM18808x1;
    }

    /* JADX INFO: renamed from: x1 */
    public void m18805x1(byte b) {
        m18798k4(new C4575x1(b));
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4570vj m18779k4(String str, int i) {
        C4569vh c4569vhM18683x6;
        String strM67408k4;
        try {
            switch (i) {
                case 65664:
                    c4569vhM18683x6 = m18791k4().m18683x6();
                    strM67408k4 = C14113y2.m67408k4(str, "RSA_WITH_RC4_128_MD5");
                    break;
                case 131200:
                    c4569vhM18683x6 = m18791k4().m18683x6();
                    strM67408k4 = C14113y2.m67408k4(str, "RSA_EXPORT_WITH_RC4_40_MD5");
                    break;
                case 196736:
                    c4569vhM18683x6 = m18791k4().m18683x6();
                    strM67408k4 = C14113y2.m67408k4(str, "RSA_EXPORT_WITH_RC2_CBC_40_MD5");
                    break;
                case 262272:
                    c4569vhM18683x6 = m18791k4().m18683x6();
                    strM67408k4 = C14113y2.m67408k4(str, "RSA_EXPORT_WITH_RC2_CBC_40_MD5");
                    break;
                default:
                    return null;
            }
            return c4569vhM18683x6.m18873k4(strM67408k4);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: kk */
    private byte[] m18784kk(byte b, byte[] bArr) {
        byte[] bArrM18894k4 = this.f12695x1.m18670ts().m18754k4().m18894k4(bArr, C7019kk.m27469x1(m18791k4(), C4562tq.class) ? this.f12695x1.m18670ts().m18754k4().mo18736x1(b, bArr) : this.f12695x1.m18670ts().m18754k4().mo18735k4(b, bArr));
        AbstractC4523ai abstractC4523ai = this.f12695x1;
        abstractC4523ai.m18649k4(abstractC4523ai.m18643ix() + 1);
        return bArrM18894k4;
    }

    /* JADX INFO: renamed from: to */
    private byte[] m18788to(AbstractC3150x6 abstractC3150x6) {
        byte[] bArr = new byte[4];
        if (abstractC3150x6.read(bArr, 0, 4) != 4) {
            throw new C4545k4("buffer underrun");
        }
        short sM27468x1 = C7019kk.m27468x1(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(bArr[1]), 6)), 9);
        int iM27468x1 = C7019kk.m27468x1(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArr[3]), 6) | (C7019kk.m27462to(Byte.valueOf(bArr[2]), 6) << 8)), 9);
        if (abstractC3150x6.canSeek() && iM27468x1 + 5 > abstractC3150x6.getLength()) {
            return null;
        }
        byte[] bArr2 = new byte[iM27468x1];
        int i = 0;
        while (i != iM27468x1) {
            int i2 = abstractC3150x6.read(bArr2, i, iM27468x1 - i);
            if (i2 == 0) {
                throw new C4545k4((byte) 0, "Received 0 bytes from stream. It must be closed.");
            }
            i += i2;
        }
        if (sM27468x1 == this.f12695x1.m18637dy() || !this.f12695x1.m18636du()) {
            return bArr2;
        }
        throw new C4545k4((byte) 70, "Invalid protocol version on message received");
    }

    /* JADX INFO: renamed from: x1 */
    private void m18789x1(byte b, byte b2) {
        if (b == 2) {
            throw new C4545k4(b, b2);
        }
        if (b2 != 0) {
            return;
        }
        this.f12695x1.m18657kk(true);
    }

    /* JADX INFO: renamed from: kk */
    private byte[] m18785kk(AbstractC3150x6 abstractC3150x6) {
        int i = abstractC3150x6.readByte();
        if (abstractC3150x6.canSeek() && i + 1 > abstractC3150x6.getLength()) {
            return null;
        }
        byte[] bArr = new byte[i];
        abstractC3150x6.read(bArr, 0, i);
        if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 1) {
            throw new C4545k4(PatternStyle.Vertical);
        }
        int iM27462to = (C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(bArr[2]), 6);
        int iM27462to2 = (C7019kk.m27462to(Byte.valueOf(bArr[3]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(bArr[4]), 6);
        int iM27462to3 = (C7019kk.m27462to(Byte.valueOf(bArr[5]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(bArr[6]), 6);
        int iM27462to4 = C7019kk.m27462to(Byte.valueOf(bArr[8]), 6) | (C7019kk.m27462to(Byte.valueOf(bArr[7]), 6) << 8);
        int i2 = iM27462to4 > 32 ? 32 : iM27462to4;
        byte[] bArr2 = new byte[iM27462to2];
        C14058fa.m66596k4(bArr, 9, bArr2, 0, iM27462to2);
        byte[] bArr3 = new byte[iM27462to3];
        int i3 = iM27462to2 + 9;
        C14058fa.m66596k4(bArr, i3, bArr3, 0, iM27462to3);
        byte[] bArr4 = new byte[iM27462to4];
        C14058fa.m66596k4(bArr, i3 + iM27462to3, bArr4, 0, iM27462to4);
        if (iM27462to4 < 16 || iM27462to2 == 0 || iM27462to2 % 3 != 0) {
            throw new C4545k4(PatternStyle.Vertical);
        }
        if (iM27462to3 > 0) {
            this.f12695x1.m18653k4(bArr3);
        }
        m18791k4().m18656kk(C7019kk.m27468x1(Integer.valueOf(iM27462to), 9));
        m18780k4(m18791k4().m18640h4(), bArr2);
        this.f12695x1.m18682x1(new byte[32]);
        C14058fa.m66596k4(bArr4, iM27462to4 - i2, this.f12695x1.m18674uz(), 32 - i2, i2);
        this.f12695x1.m18647k4((byte) 1);
        this.f12695x1.m18681x1(true);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm m18792k4(byte b, AbstractC14078m9 abstractC14078m9, Object obj) {
        AbstractC2417k4 abstractC2417k4Mo18752k4 = mo18752k4(b);
        abstractC2417k4Mo18752k4.m11840yj();
        x1 x1Var = new x1(abstractC14078m9, obj, abstractC2417k4Mo18752k4);
        m18793k4(abstractC2417k4Mo18752k4.m11839up(), abstractC2417k4Mo18752k4.m11838ks(), new C4529c5(this), x1Var);
        return x1Var;
    }

    /* JADX INFO: renamed from: x1 */
    public void m18806x1(AbstractC3150x6 abstractC3150x6) {
        byte[] bArrM18808x1 = m18808x1((byte) 20, new byte[]{1});
        abstractC3150x6.write(bArrM18808x1, 0, bArrM18808x1.length);
        AbstractC4523ai abstractC4523ai = this.f12695x1;
        abstractC4523ai.m18649k4(0L);
        if (C7019kk.m27469x1(abstractC4523ai, C4562tq.class)) {
            abstractC4523ai.m18634du(true);
        } else {
            abstractC4523ai.m18641h4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm m18793k4(byte b, byte[] bArr, AbstractC14078m9 abstractC14078m9, Object obj) {
        if (this.f12695x1.m18665rv()) {
            throw new C4545k4((byte) 80, "The session is finished and it's no longer valid.");
        }
        byte[] bArrM18808x1 = m18808x1(b, bArr);
        return this.f12694k4.beginWrite(bArrM18808x1, 0, bArrM18808x1.length, abstractC14078m9, obj);
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm m18794k4(AbstractC3150x6 abstractC3150x6, AbstractC14078m9 abstractC14078m9, Object obj) {
        if (this.f12695x1.m18659ks()) {
            throw new C4545k4((byte) 80, "The session is finished and it's no longer valid.");
        }
        f12693kk.m22563k4();
        k4 k4Var = new k4(abstractC14078m9, obj, new byte[1], abstractC3150x6);
        abstractC3150x6.beginRead(k4Var.m18812h4(), 0, k4Var.m18812h4().length, new C4534dy(this), k4Var);
        return k4Var;
    }

    /* JADX INFO: renamed from: x1 */
    public void m18807x1(InterfaceC14083qm interfaceC14083qm) {
        m18802kk(interfaceC14083qm);
        AbstractC4523ai abstractC4523ai = this.f12695x1;
        abstractC4523ai.m18649k4(0L);
        if (C7019kk.m27469x1(abstractC4523ai, C4562tq.class)) {
            abstractC4523ai.m18634du(true);
        } else {
            abstractC4523ai.m18641h4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm m18795k4(AbstractC14078m9 abstractC14078m9, Object obj) {
        return m18793k4((byte) 20, new byte[]{1}, abstractC14078m9, obj);
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m18808x1(byte b, byte[] bArr) {
        return m18799k4(b, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void m18796k4(byte b, byte b2) {
        m18798k4(new C4575x1(b, b2));
    }

    /* JADX INFO: renamed from: k4 */
    public void m18797k4(byte b, byte[] bArr) {
        m18802kk(m18793k4(b, bArr, (AbstractC14078m9) null, (Object) null));
    }

    /* JADX INFO: renamed from: k4 */
    private void m18780k4(int i, byte[] bArr) {
        C4544jd c4544jdM18684xk;
        AbstractC4570vj abstractC4570vjM18779k4;
        C4540gi c4540gi = new C4540gi(bArr);
        String str = i == 48 ? "SSL_" : "TLS_";
        while (c4540gi.getPosition() < c4540gi.getLength()) {
            byte bM18748x1 = c4540gi.m18748x1();
            if (C7019kk.m27462to(Byte.valueOf(bM18748x1), 6) == 0) {
                int iM18877x1 = m18791k4().m18683x6().m18877x1(c4540gi.m18745kk());
                if (iM18877x1 != -1) {
                    c4544jdM18684xk = m18791k4().m18684xk();
                    abstractC4570vjM18779k4 = m18791k4().m18683x6().get_Item(iM18877x1);
                    c4544jdM18684xk.m18755k4(abstractC4570vjM18779k4);
                    break;
                }
            } else {
                byte[] bArr2 = new byte[2];
                c4540gi.read(bArr2, 0, 2);
                abstractC4570vjM18779k4 = m18779k4(str, ((C7019kk.m27462to(Byte.valueOf(bM18748x1), 6) & 255) << 16) | ((C7019kk.m27462to(Byte.valueOf(bArr2[0]), 6) & 255) << 8) | (C7019kk.m27462to(Byte.valueOf(bArr2[1]), 6) & 255));
                if (abstractC4570vjM18779k4 != null) {
                    c4544jdM18684xk = m18791k4().m18684xk();
                    c4544jdM18684xk.m18755k4(abstractC4570vjM18779k4);
                    break;
                }
            }
        }
        if (m18791k4().m18684xk() == null) {
            throw new C4545k4((byte) 71, "Insuficient Security");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m18798k4(C4575x1 c4575x1) {
        boolean zM18914to;
        byte b;
        byte b2;
        if (c4575x1 == null) {
            b = 80;
            b2 = 2;
            zM18914to = true;
        } else {
            byte bM18912k4 = c4575x1.m18912k4();
            byte bM18915x1 = c4575x1.m18915x1();
            zM18914to = c4575x1.m18914to();
            b = bM18915x1;
            b2 = bM18912k4;
        }
        m18797k4((byte) 21, new byte[]{b2, b});
        if (zM18914to) {
            this.f12695x1.m18666to(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m18782k4(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (C7019kk.m27462to(Byte.valueOf(bArr[i]), 6) != C7019kk.m27462to(Byte.valueOf(bArr2[i]), 6)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m18799k4(byte b, byte[] bArr, int i, int i2) {
        if (this.f12695x1.m18665rv()) {
            throw new C4545k4((byte) 80, "The session is finished and it's no longer valid.");
        }
        C4540gi c4540gi = new C4540gi();
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                return c4540gi.m18739h4();
            }
            int i5 = i4 - i3;
            int iM27468x1 = i5 <= 16384 ? C7019kk.m27468x1(Integer.valueOf(i5), 9) : 16384;
            byte[] bArrM18784kk = new byte[iM27468x1];
            C14058fa.m66596k4(bArr, i3, bArrM18784kk, 0, iM27468x1);
            if (m18791k4().m18670ts() != null && m18791k4().m18670ts().m18754k4() != null) {
                bArrM18784kk = m18784kk(b, bArrM18784kk);
            }
            c4540gi.m18740k4(b);
            c4540gi.m18741k4(this.f12695x1.m18637dy());
            c4540gi.m18741k4(C7019kk.m27468x1(Integer.valueOf(bArrM18784kk.length), 9));
            c4540gi.m18742k4(bArrM18784kk);
            i3 += iM27468x1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m18783k4(int i, AbstractC3150x6 abstractC3150x6) {
        if (i == 128) {
            return m18785kk(abstractC3150x6);
        }
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C4536em.class), C7019kk.m27445k4((byte) i))) {
            return m18788to(abstractC3150x6);
        }
        throw new C4545k4(PatternStyle.Vertical);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    public byte[] m18800k4(AbstractC3150x6 abstractC3150x6) {
        if (this.f12695x1.m18659ks()) {
            throw new C4545k4((byte) 80, "The session is finished and it's no longer valid.");
        }
        f12693kk.m22563k4();
        byte[] bArr = new byte[1];
        byte[] bArr2 = null;
        if (abstractC3150x6.read(bArr, 0, 1) == 0) {
            return null;
        }
        int iM27462to = C7019kk.m27462to(Byte.valueOf(bArr[0]), 6);
        this.f12695x1.m18647k4((byte) 1);
        byte b = (byte) iM27462to;
        byte[] bArrM18783k4 = m18783k4(iM27462to, abstractC3150x6);
        if (bArrM18783k4 == null) {
            return null;
        }
        if ((b != 21 || bArrM18783k4.length != 2) && m18791k4().m18631c6() != null && m18791k4().m18631c6().m18754k4() != null) {
            bArrM18783k4 = m18787to(b, bArrM18783k4);
        }
        if (b != -128) {
            switch (b) {
                case 20:
                    m18804x1();
                    break;
                case 21:
                    m18789x1(C7019kk.m27442k4(Byte.valueOf(bArrM18783k4[0]), 6), C7019kk.m27442k4(Byte.valueOf(bArrM18783k4[1]), 6));
                    if (abstractC3150x6.canSeek()) {
                        abstractC3150x6.setLength(0L);
                    }
                    f12693kk.mo22555x1();
                    return bArr2;
                case 22:
                    C4540gi c4540gi = new C4540gi(bArrM18783k4);
                    while (!c4540gi.m18743k4()) {
                        mo18753k4(c4540gi);
                    }
                    break;
                case 23:
                    break;
                default:
                    throw new C4545k4((byte) 10, "Unknown record received from server.");
            }
        } else {
            this.f12695x1.m18663ne().m18742k4(bArrM18783k4);
        }
        bArr2 = bArrM18783k4;
        f12693kk.mo22555x1();
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m18801k4(InterfaceC14083qm interfaceC14083qm) {
        k4 k4Var = (k4) C7019kk.m27452k4((Object) interfaceC14083qm, k4.class);
        if (k4Var == null) {
            throw new ArgumentException("Either the provided async result is null or was not created by this RecordProtocol.");
        }
        if (!k4Var.mo18728kk()) {
            k4Var.mo18731x1().m22558du();
        }
        if (k4Var.m18811dy()) {
            throw k4Var.m18815m9();
        }
        byte[] bArrM18810du = k4Var.m18810du();
        f12693kk.mo22555x1();
        return bArrM18810du;
    }
}

package com.aspose.slides.internal.p289n2;

import com.aspose.slides.Collections.Queue;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p205ji.AbstractC5470v4;
import com.aspose.slides.internal.p205ji.C5458kk;
import com.aspose.slides.internal.p205ji.C5464rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p338pi.C9446x1;
import com.aspose.slides.internal.p338pi.InterfaceC9443k4;
import com.aspose.slides.internal.p395sa.C10167k4;
import com.aspose.slides.internal.p474wg.AbstractC11958ne;
import com.aspose.slides.internal.p474wg.C11932e0;
import com.aspose.slides.internal.p474wg.C11933em;
import com.aspose.slides.internal.p474wg.C11972ts;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.n2.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6695m9 implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    private static int f18528c5 = -1;

    /* JADX INFO: renamed from: jd */
    private static int f18529jd = -1;

    /* JADX INFO: renamed from: up */
    private static Object f18530up;

    /* JADX INFO: renamed from: yj */
    private static AbstractC14068j5 f18531yj;

    /* JADX INFO: renamed from: du */
    private int f18533du;

    /* JADX INFO: renamed from: fa */
    private boolean f18535fa;

    /* JADX INFO: renamed from: h4 */
    private int f18536h4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC9443k4 f18538kk;

    /* JADX INFO: renamed from: to */
    private int f18540to;

    /* JADX INFO: renamed from: x1 */
    boolean f18541x1;

    /* JADX INFO: renamed from: k4 */
    boolean f18537k4 = true;

    /* JADX INFO: renamed from: m9 */
    private Queue f18539m9 = new Queue(2);

    /* JADX INFO: renamed from: dy */
    private Queue f18534dy = new Queue(2);

    /* JADX INFO: renamed from: ck */
    private boolean f18532ck = false;

    /* JADX INFO: renamed from: com.aspose.slides.internal.n2.m9$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public final InterfaceC14083qm m26495k4(AbstractC14078m9 abstractC14078m9, Object obj) {
            return C10167k4.m50006k4(new C6691jd(this, this, abstractC14078m9, obj));
        }

        /* JADX INFO: renamed from: k4 */
        public abstract void mo26443k4();
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n2.m9$kk */
    public static final class kk {

        /* JADX INFO: renamed from: k4 */
        x1 f18542k4;

        /* JADX INFO: renamed from: x1 */
        private int f18543x1;

        public kk(x1 x1Var) {
            this.f18542k4 = x1Var;
        }

        /* JADX INFO: renamed from: k4 */
        public void m26497k4() {
            try {
                x1 x1Var = this.f18542k4;
                this.f18542k4.m26507k4(x1Var.f18551k4.m26465kk(x1Var.f18556to, x1Var.f18546du, x1Var.f18549h4, x1Var.f18554m9));
            } catch (RuntimeException e) {
                this.f18542k4.m26508k4(e);
            }
        }

        /* JADX INFO: renamed from: kk */
        public void m26498kk() {
            try {
                x1 x1Var = this.f18542k4;
                m26496k4(x1Var.f18551k4.m26467to(x1Var.f18556to, x1Var.f18546du, x1Var.f18549h4, x1Var.f18554m9));
                x1 x1Var2 = this.f18542k4;
                if (x1Var2.f18549h4 > 0) {
                    new C6697rv(this).m26495k4(null, this.f18542k4);
                } else {
                    x1Var2.m26511x1(this.f18543x1);
                    this.f18542k4.m26505du();
                }
            } catch (RuntimeException e) {
                this.f18542k4.m26508k4(e);
            }
        }

        /* JADX INFO: renamed from: to */
        public void m26499to() {
            try {
                x1 x1Var = this.f18542k4;
                m26496k4(x1Var.f18551k4.m26456k4(x1Var.f18556to, x1Var.f18546du, x1Var.f18549h4, x1Var.f18554m9, x1Var.f18552kk));
                x1 x1Var2 = this.f18542k4;
                if (x1Var2.f18549h4 > 0) {
                    new C6701x6(this).m26495k4(null, this.f18542k4);
                } else {
                    x1Var2.m26511x1(this.f18543x1);
                    this.f18542k4.m26505du();
                }
            } catch (RuntimeException e) {
                this.f18542k4.m26508k4(e);
            }
        }

        /* JADX INFO: renamed from: x1 */
        public void m26500x1() {
            try {
                x1 x1Var = this.f18542k4;
                AbstractC11958ne[] abstractC11958neArr = {x1Var.f18552kk};
                int iM26457k4 = x1Var.f18551k4.m26457k4(x1Var.f18556to, x1Var.f18546du, x1Var.f18549h4, x1Var.f18554m9, abstractC11958neArr);
                x1 x1Var2 = this.f18542k4;
                x1Var2.f18552kk = abstractC11958neArr[0];
                x1Var2.m26507k4(iM26457k4);
            } catch (RuntimeException e) {
                this.f18542k4.m26508k4(e);
            }
        }

        /* JADX INFO: renamed from: k4 */
        private void m26496k4(int i) {
            x1 x1Var = this.f18542k4;
            if (x1Var.f18544c5 == 0) {
                this.f18543x1 += i;
                x1Var.f18546du += i;
                x1Var.f18549h4 -= i;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n2.m9$x1 */
    public static final class x1 implements InterfaceC14083qm {

        /* JADX INFO: renamed from: c5 */
        int f18544c5;

        /* JADX INFO: renamed from: ck */
        private AbstractC14078m9 f18545ck;

        /* JADX INFO: renamed from: du */
        public int f18546du;

        /* JADX INFO: renamed from: dy */
        public boolean f18547dy;

        /* JADX INFO: renamed from: fa */
        private AbstractC5470v4 f18548fa;

        /* JADX INFO: renamed from: h4 */
        public int f18549h4;

        /* JADX INFO: renamed from: jd */
        private Object f18550jd;

        /* JADX INFO: renamed from: k4 */
        public C6695m9 f18551k4;

        /* JADX INFO: renamed from: kk */
        public AbstractC11958ne f18552kk;

        /* JADX INFO: renamed from: ks */
        private boolean f18553ks;

        /* JADX INFO: renamed from: m9 */
        public int f18554m9;

        /* JADX INFO: renamed from: rv */
        private int f18555rv;

        /* JADX INFO: renamed from: to */
        public byte[] f18556to;

        /* JADX INFO: renamed from: up */
        private RuntimeException f18557up;

        /* JADX INFO: renamed from: x1 */
        public InterfaceC9443k4 f18558x1;

        /* JADX INFO: renamed from: yj */
        private int f18559yj;

        public x1() {
        }

        /* JADX INFO: renamed from: k4 */
        private k4 m26501k4(kk kkVar, int i) {
            if (i == 2) {
                return new C6689fa(this, kkVar);
            }
            if (i == 3) {
                return new C6699up(this, kkVar);
            }
            if (i == 4) {
                return new C6702yj(this, kkVar);
            }
            if (i != 5) {
                return null;
            }
            return new C6694ks(this, kkVar);
        }

        /* JADX INFO: renamed from: du */
        public void m26505du() {
            x1 x1Var;
            k4 k4VarM26501k4;
            if (this.f18555rv != 2 && this.f18551k4.f18541x1) {
                this.f18557up = new ObjectDisposedException(C7019kk.m27443k4(this.f18551k4.getClass()).toString());
            }
            m26509k4(true);
            int i = this.f18555rv;
            Queue queue = (i == 2 || i == 3) ? this.f18551k4.f18539m9 : (i == 4 || i == 5) ? this.f18551k4.f18534dy : null;
            if (queue != null) {
                synchronized (queue) {
                    try {
                        queue.dequeue();
                        if (queue.size() > 0) {
                            x1Var = (x1) queue.peek();
                            if (this.f18551k4.f18541x1) {
                                m26502k4(queue);
                                k4VarM26501k4 = null;
                            } else {
                                k4VarM26501k4 = m26501k4(new kk(x1Var), x1Var.f18555rv);
                            }
                        } else {
                            x1Var = null;
                            k4VarM26501k4 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (k4VarM26501k4 != null) {
                    k4VarM26501k4.m26495k4(null, x1Var);
                }
            }
            AbstractC14078m9 abstractC14078m9 = this.f18545ck;
            if (abstractC14078m9 != null) {
                abstractC14078m9.mo18688k4(this);
            }
        }

        /* JADX INFO: renamed from: h4 */
        public int m26506h4() {
            return this.f18559yj;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: kk */
        public boolean mo18728kk() {
            return this.f18553ks;
        }

        /* JADX INFO: renamed from: to */
        public void m26510to() {
            RuntimeException runtimeException = this.f18557up;
            if (runtimeException != null) {
                throw runtimeException;
            }
            if (this.f18544c5 != 0) {
                throw new C6696ne(this.f18544c5);
            }
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: x1 */
        public AbstractC5470v4 mo18731x1() {
            synchronized (this) {
                try {
                    if (this.f18548fa == null) {
                        this.f18548fa = new C5458kk(this.f18553ks);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.f18548fa;
        }

        public x1(C6695m9 c6695m9, Object obj, AbstractC14078m9 abstractC14078m9, int i) {
            this.f18551k4 = c6695m9;
            this.f18547dy = c6695m9.f18537k4;
            this.f18558x1 = c6695m9.f18538kk;
            this.f18550jd = obj;
            this.f18545ck = abstractC14078m9;
            this.f18555rv = i;
            this.f18554m9 = 0;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: k4 */
        public Object mo18725k4() {
            return this.f18550jd;
        }

        /* JADX INFO: renamed from: x1 */
        public void m26511x1(int i) {
            this.f18559yj = i;
        }

        /* JADX INFO: renamed from: k4 */
        public void m26507k4(int i) {
            this.f18559yj = i;
            m26505du();
        }

        /* JADX INFO: renamed from: k4 */
        private void m26502k4(Queue queue) {
            Object[] array = queue.toArray(new Object[0]);
            queue.clear();
            for (int i = 0; i < AbstractC14092to.m67208k4((Object) array).m67265du(); i++) {
                C5464rv.m22547k4(new C6686ck(this, (x1) array[i]), (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k4 */
        public void m26504k4(Object obj) {
            m26505du();
        }

        /* JADX INFO: renamed from: k4 */
        public void m26508k4(RuntimeException runtimeException) {
            this.f18557up = runtimeException;
            m26505du();
        }

        /* JADX INFO: renamed from: k4 */
        public void m26509k4(boolean z) {
            this.f18553ks = z;
            synchronized (this) {
                try {
                    AbstractC5470v4 abstractC5470v4 = this.f18548fa;
                    if (abstractC5470v4 != null && z) {
                        ((C5458kk) abstractC5470v4).mo22555x1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C6695m9(int i, int i2, int i3) {
        this.f18540to = i;
        this.f18533du = i2;
        this.f18536h4 = i3;
        int[] iArr = {0};
        this.f18538kk = m26458k4(i, i2, i3, iArr);
        int i4 = iArr[0];
        if (i4 != 0) {
            throw new C6696ne(i4);
        }
    }

    /* JADX INFO: renamed from: du */
    public static boolean m26447du() {
        m26448h4();
        return f18529jd == 1;
    }

    /* JADX INFO: renamed from: h4 */
    public static void m26448h4() {
        if (f18528c5 == -1) {
            try {
                new C6695m9(2, 1, 6).m26487m9();
                f18528c5 = 1;
            } catch (RuntimeException unused) {
                f18528c5 = 0;
            }
        }
        int i = f18529jd;
        if (i != -1 || i == 0) {
            return;
        }
        try {
            new C6695m9(23, 1, 6).m26487m9();
            f18529jd = 1;
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: renamed from: jd */
    private void m26449jd() {
        if (this.f18541x1 && this.f18535fa) {
            throw new ObjectDisposedException(C14067j2.m66727k4(this).mo48629x6());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public int m26467to(byte[] bArr, int i, int i2, int i3) {
        if (i2 == 0) {
            return 0;
        }
        int[] iArr = {0};
        int iM26470x1 = m26470x1(this.f18538kk, bArr, i, i2, i3, iArr);
        int i4 = iArr[0];
        if (i4 == 0) {
            this.f18532ck = true;
            return iM26470x1;
        }
        if (i4 != 10035 && i4 != 10036) {
            this.f18532ck = false;
        }
        throw new C6696ne(i4);
    }

    /* JADX INFO: renamed from: c5 */
    public int m26473c5() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m26493x1(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: dy */
    public int m26474dy() {
        throw new NotImplementedException();
    }

    public void finalize() throws Throwable {
        m26493x1(false);
        super.finalize();
    }

    public int hashCode() {
        InterfaceC9443k4 interfaceC9443k4 = this.f18538kk;
        if (interfaceC9443k4 == null) {
            return -1;
        }
        return interfaceC9443k4.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public int m26475k4(long j, byte[] bArr, byte[] bArr2) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: kk */
    public int m26485kk() {
        return this.f18533du;
    }

    /* JADX INFO: renamed from: m9 */
    public void m26487m9() {
        dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public int m26465kk(byte[] bArr, int i, int i2, int i3) {
        int[] iArr = {0};
        int iM26454k4 = m26454k4(this.f18538kk, bArr, i, i2, i3, iArr);
        int i4 = iArr[0];
        if (i4 == 0) {
            this.f18532ck = true;
            return iM26454k4;
        }
        if (i4 != 10035 && i4 != 10036) {
            this.f18532ck = false;
        }
        throw new C6696ne(i4);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m26468to() {
        m26448h4();
        return f18528c5 == 1;
    }

    /* JADX INFO: renamed from: x1 */
    private int m26470x1(InterfaceC9443k4 interfaceC9443k4, byte[] bArr, int i, int i2, int i3, int[] iArr) {
        return interfaceC9443k4.mo46234x1(bArr, i, i2, i3, iArr);
    }

    /* JADX INFO: renamed from: x1 */
    public int m26488x1(InterfaceC14083qm interfaceC14083qm) {
        m26449jd();
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("result");
        }
        x1 x1Var = (x1) C7019kk.m27452k4((Object) interfaceC14083qm, x1.class);
        if (x1Var == null) {
            throw new ArgumentException("Invalid IAsyncResult", "result");
        }
        if (!interfaceC14083qm.mo18728kk()) {
            interfaceC14083qm.mo18731x1().m22558du();
        }
        x1Var.m26510to();
        return x1Var.m26506h4();
    }

    /* JADX INFO: renamed from: kk */
    public void m26486kk(boolean z) {
        m26480k4(6, 1, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: x1 */
    public int m26489x1(byte[] bArr, int i, int i2, int i3) {
        m26449jd();
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0 || i > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("offset");
        }
        if (i2 < 0 || i + i2 > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("size");
        }
        return m26467to(bArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    private int m26453k4(InterfaceC9443k4 interfaceC9443k4, byte[] bArr, int i, int i2, int i3, AbstractC11958ne abstractC11958ne, int[] iArr) {
        return interfaceC9443k4.mo46226k4(bArr, i, i2, i3, abstractC11958ne, iArr);
    }

    /* JADX INFO: renamed from: k4 */
    private int m26454k4(InterfaceC9443k4 interfaceC9443k4, byte[] bArr, int i, int i2, int i3, int[] iArr) {
        return interfaceC9443k4.mo46227k4(bArr, i, i2, i3, iArr);
    }

    /* JADX INFO: renamed from: x1 */
    public InterfaceC14083qm m26490x1(byte[] bArr, int i, int i2, int i3, AbstractC14078m9 abstractC14078m9, Object obj) {
        x1 x1Var;
        m26449jd();
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset must be >= 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("size must be >= 0");
        }
        if (i + i2 > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("offset + size exceeds the buffer length");
        }
        synchronized (this.f18534dy) {
            try {
                x1Var = new x1(this, obj, abstractC14078m9, 4);
                x1Var.f18556to = bArr;
                x1Var.f18546du = i;
                x1Var.f18549h4 = i2;
                x1Var.f18554m9 = i3;
                this.f18534dy.enqueue(x1Var);
                if (this.f18534dy.size() == 1) {
                    new C6685c5(this, new kk(x1Var)).m26495k4(null, x1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x1Var;
    }

    /* JADX INFO: renamed from: k4 */
    private int m26455k4(InterfaceC9443k4 interfaceC9443k4, byte[] bArr, int i, int i2, int i3, C11933em[] c11933emArr, int[] iArr) {
        return interfaceC9443k4.mo46228k4(bArr, i, i2, i3, c11933emArr, iArr);
    }

    /* JADX INFO: renamed from: x1 */
    public void m26491x1(int i) {
    }

    /* JADX INFO: renamed from: x1 */
    private void m26472x1(InterfaceC9443k4 interfaceC9443k4, AbstractC11958ne abstractC11958ne, int[] iArr) {
        interfaceC9443k4.mo46235x1(abstractC11958ne, iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public int m26476k4(InterfaceC14083qm interfaceC14083qm) {
        m26449jd();
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("result");
        }
        x1 x1Var = (x1) C7019kk.m27452k4((Object) interfaceC14083qm, x1.class);
        if (x1Var == null) {
            throw new ArgumentException("Invalid IAsyncResult", "result");
        }
        if (!interfaceC14083qm.mo18728kk()) {
            interfaceC14083qm.mo18731x1().m22558du();
        }
        x1Var.m26510to();
        return x1Var.m26506h4();
    }

    /* JADX INFO: renamed from: k4 */
    public int m26477k4(byte[] bArr, int i, int i2, int i3) {
        m26449jd();
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0 || i > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("offset");
        }
        if (i2 < 0 || i + i2 > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("size");
        }
        return m26465kk(bArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: x1 */
    public void m26492x1(AbstractC11958ne abstractC11958ne) {
        m26449jd();
        if (abstractC11958ne == null) {
            throw new ArgumentNullException("remoteEP");
        }
        if (C7019kk.m27469x1(abstractC11958ne, C11932e0.class)) {
            C11932e0 c11932e0 = (C11932e0) abstractC11958ne;
            if (c11932e0.m55933to().equals(C11972ts.f40358k4) || c11932e0.m55933to().equals(C11972ts.f40356du)) {
                throw new C6696ne(10049);
            }
        }
        int[] iArr = {0};
        m26472x1(this.f18538kk, abstractC11958ne, iArr);
        int i = iArr[0];
        if (i != 0) {
            throw new C6696ne(i);
        }
        this.f18532ck = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public int m26456k4(byte[] bArr, int i, int i2, int i3, AbstractC11958ne abstractC11958ne) {
        int[] iArr = {0};
        int iM26453k4 = m26453k4(this.f18538kk, bArr, i, i2, i3, abstractC11958ne, iArr);
        int i4 = iArr[0];
        if (i4 == 0) {
            this.f18532ck = true;
            return iM26453k4;
        }
        if (i4 != 10035 && i4 != 10036) {
            this.f18532ck = false;
        }
        throw new C6696ne(i4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m26493x1(boolean z) {
        if (this.f18541x1) {
            return;
        }
        this.f18541x1 = true;
        this.f18532ck = false;
        InterfaceC9443k4 interfaceC9443k4 = this.f18538kk;
        if (interfaceC9443k4 != null) {
            this.f18535fa = true;
            this.f18538kk = null;
            int[] iArr = {0};
            m26463k4(interfaceC9443k4, iArr);
            int i = iArr[0];
            if (i != 0) {
                throw new C6696ne(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public int m26457k4(byte[] bArr, int i, int i2, int i3, AbstractC11958ne[] abstractC11958neArr) {
        m26449jd();
        C11933em[] c11933emArr = {abstractC11958neArr[0].mo55934x1()};
        int[] iArr = {0};
        int iM26455k4 = m26455k4(this.f18538kk, bArr, i, i2, i3, c11933emArr, iArr);
        C11933em c11933em = c11933emArr[0];
        int i4 = iArr[0];
        if (i4 != 0) {
            if (i4 != 10035 && i4 != 10036) {
                this.f18532ck = false;
            }
            throw new C6696ne(i4);
        }
        this.f18532ck = true;
        if (c11933em != null) {
            abstractC11958neArr[0] = abstractC11958neArr[0].mo55930k4(c11933em);
        }
        return iM26455k4;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m26494x1() {
        return this.f18532ck;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9443k4 m26458k4(int i, int i2, int i3, int[] iArr) {
        return C9446x1.m46238k4(i, i2, i3, iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm m26478k4(byte[] bArr, int i, int i2, int i3, AbstractC14078m9 abstractC14078m9, Object obj) {
        x1 x1Var;
        m26449jd();
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0 || i > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("offset");
        }
        if (i2 < 0 || i + i2 > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("size");
        }
        synchronized (this.f18539m9) {
            try {
                x1Var = new x1(this, obj, abstractC14078m9, 2);
                x1Var.f18556to = bArr;
                x1Var.f18546du = i;
                x1Var.f18549h4 = i2;
                x1Var.f18554m9 = i3;
                this.f18539m9.enqueue(x1Var);
                if (this.f18539m9.size() == 1) {
                    new C6688dy(this, new kk(x1Var)).m26495k4(null, x1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x1Var;
    }

    /* JADX INFO: renamed from: k4 */
    public void m26479k4(int i) {
        int[] iArr = {0};
        this.f18538kk.mo46229k4(65535, 4102, (Object) null, (byte[]) null, i, iArr);
        int i2 = iArr[0];
        if (i2 != 0) {
            throw new C6696ne(i2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m26480k4(int i, int i2, int i3) {
        m26449jd();
        int[] iArr = {0};
        m26460k4(this.f18538kk, i, i2, (Object) null, (byte[]) null, i3, iArr);
        int i4 = iArr[0];
        if (i4 != 0) {
            throw new C6696ne(i4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m26460k4(InterfaceC9443k4 interfaceC9443k4, int i, int i2, Object obj, byte[] bArr, int i3, int[] iArr) {
        interfaceC9443k4.mo46229k4(i, i2, obj, bArr, i3, iArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26461k4(InterfaceC9443k4 interfaceC9443k4, AbstractC11958ne abstractC11958ne, int[] iArr) {
        interfaceC9443k4.mo46230k4(abstractC11958ne, iArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26462k4(InterfaceC9443k4 interfaceC9443k4, boolean z, int[] iArr) {
        interfaceC9443k4.mo46231k4(z, iArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26463k4(InterfaceC9443k4 interfaceC9443k4, int[] iArr) {
        interfaceC9443k4.mo46232k4(iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void m26481k4(AbstractC11958ne abstractC11958ne) {
        m26449jd();
        if (abstractC11958ne == null) {
            throw new ArgumentNullException("local_end");
        }
        int[] iArr = {0};
        m26461k4(this.f18538kk, abstractC11958ne, iArr);
        int i = iArr[0];
        if (i != 0) {
            throw new C6696ne(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m26482k4(boolean z) {
        m26449jd();
        int[] iArr = {0};
        m26462k4(this.f18538kk, z, iArr);
        int i = iArr[0];
        if (i != 0) {
            throw new C6696ne(i);
        }
        this.f18537k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m26483k4() {
        return this.f18537k4;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m26484k4(int i, int i2) {
        m26449jd();
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new NotSupportedException("'mode' parameter is not valid.");
        }
        int[] iArr = {0};
        boolean zM26464k4 = m26464k4(this.f18538kk, i2, i, iArr);
        int i3 = iArr[0];
        if (i3 != 0) {
            throw new C6696ne(i3);
        }
        if (zM26464k4) {
            this.f18532ck = true;
        }
        return zM26464k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26464k4(InterfaceC9443k4 interfaceC9443k4, int i, int i2, int[] iArr) {
        return interfaceC9443k4.mo46233k4(i, i2, this, iArr);
    }
}

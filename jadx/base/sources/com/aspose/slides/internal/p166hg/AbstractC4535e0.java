package com.aspose.slides.internal.p166hg;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p118ex.C3819jd;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p205ji.AbstractC5470v4;
import com.aspose.slides.internal.p205ji.C5458kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10940kk;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4535e0 extends AbstractC3150x6 implements IDisposable {

    /* JADX INFO: renamed from: du */
    static C5458kk f12642du = new C5458kk(true);

    /* JADX INFO: renamed from: c5 */
    AbstractC4550m9 f12643c5;

    /* JADX INFO: renamed from: ck */
    private Object f12644ck;

    /* JADX INFO: renamed from: dy */
    AbstractC4523ai f12645dy;

    /* JADX INFO: renamed from: fa */
    private C5458kk f12646fa;

    /* JADX INFO: renamed from: h4 */
    AbstractC3150x6 f12647h4;

    /* JADX INFO: renamed from: jd */
    boolean f12648jd;

    /* JADX INFO: renamed from: k4 */
    private volatile boolean f12649k4;

    /* JADX INFO: renamed from: kk */
    private final Object f12650kk;

    /* JADX INFO: renamed from: m9 */
    C3152yj f12651m9;

    /* JADX INFO: renamed from: to */
    private Object f12652to;

    /* JADX INFO: renamed from: x1 */
    private boolean f12654x1;

    /* JADX INFO: renamed from: up */
    private byte[] f12653up = new byte[16384];

    /* JADX INFO: renamed from: yj */
    private C3152yj f12655yj = new C3152yj();

    /* JADX INFO: renamed from: com.aspose.slides.internal.hg.e0$k4 */
    public static class k4 implements InterfaceC14083qm {

        /* JADX INFO: renamed from: c5 */
        private boolean f12656c5;

        /* JADX INFO: renamed from: ck */
        private int f12657ck;

        /* JADX INFO: renamed from: du */
        private C5458kk f12658du;

        /* JADX INFO: renamed from: dy */
        private boolean f12659dy;

        /* JADX INFO: renamed from: fa */
        private int f12660fa;

        /* JADX INFO: renamed from: h4 */
        private boolean f12661h4;

        /* JADX INFO: renamed from: jd */
        private byte[] f12662jd;

        /* JADX INFO: renamed from: k4 */
        private final Object f12663k4 = new Object();

        /* JADX INFO: renamed from: kk */
        private Object f12664kk;

        /* JADX INFO: renamed from: m9 */
        private int f12665m9;

        /* JADX INFO: renamed from: to */
        private Exception f12666to;

        /* JADX INFO: renamed from: x1 */
        private AbstractC14078m9 f12667x1;

        public k4(AbstractC14078m9 abstractC14078m9, Object obj, byte[] bArr, int i, int i2, boolean z, boolean z2) {
            this.f12667x1 = abstractC14078m9;
            this.f12664kk = obj;
            this.f12662jd = bArr;
            this.f12657ck = i;
            this.f12660fa = i2;
            this.f12659dy = z;
            this.f12656c5 = z2;
        }

        /* JADX INFO: renamed from: c5 */
        public int m18718c5() {
            return this.f12665m9;
        }

        /* JADX INFO: renamed from: ck */
        public boolean m18719ck() {
            return mo18728kk() && this.f12666to != null;
        }

        /* JADX INFO: renamed from: du */
        public boolean m18720du() {
            return this.f12659dy;
        }

        /* JADX INFO: renamed from: dy */
        public int m18721dy() {
            return this.f12660fa;
        }

        /* JADX INFO: renamed from: fa */
        public void m18722fa() {
            m18717k4(null, 0);
        }

        /* JADX INFO: renamed from: h4 */
        public byte[] m18723h4() {
            return this.f12662jd;
        }

        /* JADX INFO: renamed from: jd */
        public Exception m18724jd() {
            return this.f12666to;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: k4 */
        public Object mo18725k4() {
            return this.f12664kk;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: kk */
        public boolean mo18728kk() {
            boolean z;
            synchronized (this.f12663k4) {
                z = this.f12661h4;
            }
            return z;
        }

        /* JADX INFO: renamed from: m9 */
        public int m18729m9() {
            return this.f12657ck;
        }

        /* JADX INFO: renamed from: to */
        public boolean m18730to() {
            return this.f12656c5;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
        /* JADX INFO: renamed from: x1 */
        public AbstractC5470v4 mo18731x1() {
            synchronized (this.f12663k4) {
                try {
                    if (this.f12658du == null) {
                        this.f12658du = new C5458kk(this.f12661h4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this.f12658du;
        }

        /* JADX INFO: renamed from: k4 */
        public void m18726k4(int i) {
            m18717k4(null, i);
        }

        /* JADX INFO: renamed from: k4 */
        public void m18727k4(Exception exception) {
            m18717k4(exception, 0);
        }

        /* JADX INFO: renamed from: k4 */
        private void m18717k4(Exception exception, int i) {
            synchronized (this.f12663k4) {
                try {
                    if (this.f12661h4) {
                        return;
                    }
                    this.f12661h4 = true;
                    this.f12666to = exception;
                    this.f12665m9 = i;
                    C5458kk c5458kk = this.f12658du;
                    if (c5458kk != null) {
                        c5458kk.mo22555x1();
                    }
                    AbstractC14078m9 abstractC14078m9 = this.f12667x1;
                    if (abstractC14078m9 != null) {
                        abstractC14078m9.m66837k4(this, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AbstractC4535e0(AbstractC3150x6 abstractC3150x6, boolean z) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream is null.");
        }
        if (!abstractC3150x6.canRead() || !abstractC3150x6.canWrite()) {
            throw new ArgumentNullException("stream is not both readable and writable.");
        }
        this.f12651m9 = new C3152yj();
        this.f12647h4 = abstractC3150x6;
        this.f12648jd = z;
        this.f12650kk = new Object();
        this.f12652to = new Object();
        this.f12644ck = new Object();
        this.f12646fa = new C5458kk(false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m18691k4() {
        this.f12651m9.setLength(0L);
        this.f12651m9.setPosition(0L);
    }

    /* JADX INFO: renamed from: to */
    private void m18697to(k4 k4Var) {
        try {
            synchronized (this.f12644ck) {
                byte[] bArrM18799k4 = this.f12643c5.m18799k4((byte) 23, k4Var.m18723h4(), k4Var.m18729m9(), k4Var.m18721dy());
                this.f12647h4.beginWrite(bArrM18799k4, 0, bArrM18799k4.length, new C4559sv(this), k4Var);
            }
        } catch (C4545k4 e) {
            this.f12643c5.m18798k4(e.m18761k4());
            close();
            throw new IOException("The authentication or decryption has failed.", e);
        } catch (RuntimeException e2) {
            throw new IOException("IO exception during Write.", e2);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m18699x1(k4 k4Var) {
        if (!k4Var.mo18728kk()) {
            k4Var.mo18731x1().m22558du();
        }
        if (k4Var.m18719ck()) {
            throw k4Var.m18724jd();
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginRead(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        m18703dy();
        if (bArr == null) {
            throw new ArgumentNullException("buffer is a null reference.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset is less than 0.");
        }
        if (i > bArr.length) {
            throw new ArgumentOutOfRangeException("offset is greater than the length of buffer.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0.");
        }
        if (i2 > bArr.length - i) {
            throw new ArgumentOutOfRangeException("count is less than the length of buffer minus the value of the offset parameter.");
        }
        k4 k4Var = new k4(abstractC14078m9, obj, bArr, i, i2, false, true);
        if (!m18702du()) {
            m18694kk(k4Var);
            return k4Var;
        }
        if (!m18693k4(k4Var)) {
            this.f12646fa.m22558du();
            m18694kk(k4Var);
        }
        return k4Var;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginWrite(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        m18703dy();
        if (bArr == null) {
            throw new ArgumentNullException("buffer is a null reference.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset is less than 0.");
        }
        if (i > bArr.length) {
            throw new ArgumentOutOfRangeException("offset is greater than the length of buffer.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0.");
        }
        if (i2 > bArr.length - i) {
            throw new ArgumentOutOfRangeException("count is less than the length of buffer minus the value of the offset parameter.");
        }
        k4 k4Var = new k4(abstractC14078m9, obj, bArr, i, i2, true, true);
        if (!m18702du()) {
            m18697to(k4Var);
            return k4Var;
        }
        if (!m18693k4(k4Var)) {
            this.f12646fa.m22558du();
            m18697to(k4Var);
        }
        return k4Var;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f12647h4.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f12647h4.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        super.close();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        if (this.f12649k4) {
            return;
        }
        if (z) {
            if (this.f12647h4 != null) {
                if (this.f12645dy.m18686yj() == 2 && !this.f12645dy.m18665rv()) {
                    try {
                        this.f12643c5.m18805x1((byte) 0);
                    } catch (RuntimeException unused) {
                    }
                }
                if (this.f12648jd) {
                    this.f12647h4.close();
                }
            }
            this.f12648jd = false;
            this.f12647h4 = null;
        }
        this.f12649k4 = true;
        super.dispose(z);
    }

    /* JADX INFO: renamed from: du */
    public boolean m18702du() {
        boolean z;
        if (this.f12645dy.m18686yj() == 2) {
            return false;
        }
        synchronized (this.f12650kk) {
            z = this.f12645dy.m18686yj() != 2;
        }
        return z;
    }

    /* JADX INFO: renamed from: dy */
    public void m18703dy() {
        if (this.f12649k4) {
            throw new ObjectDisposedException("The Stream is closed.");
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int endRead(InterfaceC14083qm interfaceC14083qm) {
        m18703dy();
        k4 k4Var = (k4) C7019kk.m27452k4((Object) interfaceC14083qm, k4.class);
        if (k4Var == null) {
            throw new ArgumentNullException("asyncResult is null or was not obtained by calling BeginRead.");
        }
        if (!interfaceC14083qm.mo18728kk() && !interfaceC14083qm.mo18731x1().m22558du()) {
            throw new C4545k4((byte) 80, "Couldn't complete EndRead");
        }
        if (k4Var.m18719ck()) {
            throw k4Var.m18724jd();
        }
        return k4Var.m18718c5();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void endWrite(InterfaceC14083qm interfaceC14083qm) {
        m18703dy();
        k4 k4Var = (k4) C7019kk.m27452k4((Object) interfaceC14083qm, k4.class);
        if (k4Var == null) {
            throw new ArgumentNullException("asyncResult is null or was not obtained by calling BeginWrite.");
        }
        if (!interfaceC14083qm.mo18728kk() && !k4Var.mo18731x1().m22558du()) {
            throw new C4545k4((byte) 80, "Couldn't complete EndWrite");
        }
        if (k4Var.m18719ck()) {
            throw k4Var.m18724jd();
        }
    }

    public void finalize() throws Throwable {
        dispose(false);
        super.finalize();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        m18703dy();
        this.f12647h4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: h4 */
    public void m18704h4() {
        if (m18702du()) {
            k4 k4Var = new k4(null, null, null, 0, 0, false, false);
            if (m18693k4(k4Var)) {
                m18699x1(k4Var);
            } else {
                this.f12646fa.m22558du();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C3817h4 mo18705k4(C3819jd c3819jd, C3817h4 c3817h4, String str, C3819jd c3819jd2);

    /* JADX INFO: renamed from: k4 */
    public abstract C4557s7 mo18706k4(C10940kk c10940kk);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC4709du mo18707k4(C3817h4 c3817h4, String str);

    /* JADX INFO: renamed from: k4 */
    public abstract InterfaceC14083qm mo18708k4(AbstractC14078m9 abstractC14078m9, Object obj);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo18709k4(InterfaceC14083qm interfaceC14083qm);

    /* JADX INFO: renamed from: kk */
    public C3817h4 m18711kk(C3819jd c3819jd, C3817h4 c3817h4, String str, C3819jd c3819jd2) {
        return mo18705k4(c3819jd, c3817h4, str, c3819jd2);
    }

    /* JADX INFO: renamed from: m9 */
    public C3817h4 m18715m9() {
        if (this.f12645dy.m18686yj() != 2 || this.f12645dy.m18632ck().m18775x1() == null || this.f12645dy.m18632ck().m18775x1().size() <= 0) {
            return null;
        }
        return new C3817h4(this.f12645dy.m18632ck().m18775x1().get_Item(0).m52823c5());
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte[] bArrM18800k4;
        byte[] bArr2;
        m18703dy();
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset is less than 0.");
        }
        if (i > bArr.length) {
            throw new ArgumentOutOfRangeException("offset is greater than the length of buffer.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0.");
        }
        if (i2 > bArr.length - i) {
            throw new ArgumentOutOfRangeException("count is less than the length of buffer minus the value of the offset parameter.");
        }
        int i6 = 2;
        if (this.f12645dy.m18686yj() != 2) {
            m18704h4();
        }
        synchronized (this.f12652to) {
            try {
                try {
                    f12642du.m22563k4();
                    if (this.f12651m9.getPosition() > 0) {
                        if (this.f12651m9.getPosition() == this.f12651m9.getLength()) {
                            this.f12651m9.setLength(0L);
                        } else {
                            int i7 = this.f12651m9.read(bArr, i, i2);
                            if (i7 > 0) {
                                f12642du.mo22555x1();
                                return i7;
                            }
                        }
                    }
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (this.f12655yj.getPosition() == 0 || i9 != 0) {
                            byte[] bArr3 = new byte[16384];
                            if (i2 == 1) {
                                int i10 = this.f12647h4.readByte();
                                if (i10 >= 0) {
                                    bArr3[i8] = C7019kk.m27442k4(Integer.valueOf(i10), 9);
                                    i3 = 1;
                                } else {
                                    i3 = i8;
                                }
                            } else {
                                i3 = this.f12647h4.read(bArr3, i8, 16384);
                            }
                            if (i3 <= 0) {
                                f12642du.mo22555x1();
                                return 0;
                            }
                            if (this.f12655yj.getLength() > 0 && this.f12655yj.getPosition() != this.f12655yj.getLength()) {
                                this.f12655yj.seek(0L, i6);
                            }
                            this.f12655yj.write(bArr3, i8, i3);
                            i9 = i8;
                        }
                        this.f12655yj.setPosition(0L);
                        if (this.f12655yj.getLength() >= 5) {
                            bArrM18800k4 = this.f12643c5.m18800k4(this.f12655yj);
                            i5 = bArrM18800k4 == null ? 1 : i8;
                            i4 = i8;
                        } else {
                            i4 = i8;
                            i5 = i9;
                            bArrM18800k4 = null;
                        }
                        while (bArrM18800k4 != null) {
                            long length = this.f12655yj.getLength() - this.f12655yj.getPosition();
                            if (length > 0) {
                                int i11 = (int) length;
                                bArr2 = new byte[i11];
                                this.f12655yj.read(bArr2, i8, i11);
                            } else {
                                bArr2 = null;
                            }
                            long position = this.f12651m9.getPosition();
                            if (bArrM18800k4.length > 0) {
                                this.f12651m9.seek(0L, 2);
                                this.f12651m9.write(bArrM18800k4, 0, bArrM18800k4.length);
                                this.f12651m9.seek(position, 0);
                                i4 = 1;
                            }
                            this.f12655yj.setLength(0L);
                            if (length > 0) {
                                this.f12655yj.write(bArr2, 0, bArr2.length);
                            }
                            if (i4 != 0) {
                                int i12 = this.f12651m9.read(bArr, i, i2);
                                f12642du.mo22555x1();
                                return i12;
                            }
                            i6 = 2;
                            i8 = 0;
                            bArrM18800k4 = null;
                        }
                        i9 = i5;
                    }
                } catch (C4545k4 e) {
                    throw new IOException("The authentication or decryption has failed.", e);
                } catch (RuntimeException e2) {
                    throw new IOException("IO exception during read.", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        m18703dy();
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset is less than 0.");
        }
        if (i > bArr.length) {
            throw new ArgumentOutOfRangeException("offset is greater than the length of buffer.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0.");
        }
        if (i2 > bArr.length - i) {
            throw new ArgumentOutOfRangeException("count is less than the length of buffer minus the value of the offset parameter.");
        }
        if (this.f12645dy.m18686yj() != 2) {
            m18704h4();
        }
        synchronized (this.f12644ck) {
            try {
                try {
                    try {
                        byte[] bArrM18799k4 = this.f12643c5.m18799k4((byte) 23, bArr, i, i2);
                        this.f12647h4.write(bArrM18799k4, 0, bArrM18799k4.length);
                    } catch (RuntimeException e) {
                        throw new IOException("IO exception during Write.", e);
                    }
                } catch (C4545k4 e2) {
                    this.f12643c5.m18798k4(e2.m18761k4());
                    close();
                    throw new IOException("The authentication or decryption has failed.", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo18716x1(C3817h4 c3817h4, int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m18698to(InterfaceC14083qm interfaceC14083qm) {
        if (this.f12649k4) {
            return;
        }
        k4 k4Var = (k4) interfaceC14083qm.mo18725k4();
        try {
            this.f12647h4.endWrite(interfaceC14083qm);
            k4Var.m18722fa();
        } catch (Exception e) {
            k4Var.m18727k4(e);
        }
    }

    /* JADX INFO: renamed from: kk */
    public C4557s7 m18712kk(C10940kk c10940kk) {
        return mo18706k4(c10940kk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m18701x1(InterfaceC14083qm interfaceC14083qm) {
        k4 k4Var = (k4) C7019kk.m27452k4(interfaceC14083qm.mo18725k4(), k4.class);
        try {
            try {
                mo18709k4(interfaceC14083qm);
                if (!k4Var.m18730to()) {
                    this.f12646fa.mo22555x1();
                    k4Var.m18722fa();
                } else {
                    if (k4Var.m18720du()) {
                        m18697to(k4Var);
                    } else {
                        m18694kk(k4Var);
                    }
                    this.f12646fa.mo22555x1();
                }
            } catch (C4545k4 e) {
                this.f12643c5.m18798k4(e.m18761k4());
                throw new IOException("The authentication or decryption has failed.", e);
            } catch (RuntimeException e2) {
                this.f12643c5.m18805x1((byte) 80);
                throw new IOException("The authentication or decryption has failed.", e2);
            }
        } catch (Exception e3) {
            this.f12646fa.mo22555x1();
            k4Var.m18727k4(e3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m18710k4(boolean z) {
        this.f12654x1 = z;
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC4709du m18713kk(C3817h4 c3817h4, String str) {
        return mo18707k4(c3817h4, str);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m18693k4(k4 k4Var) {
        try {
            synchronized (this.f12650kk) {
                try {
                    if (this.f12645dy.m18686yj() != 0) {
                        return false;
                    }
                    mo18708k4(new C4528bz(this), k4Var);
                    return true;
                } finally {
                }
            }
        } catch (C4545k4 e) {
            this.f12646fa.mo22555x1();
            this.f12643c5.m18798k4(e.m18761k4());
            throw new IOException("The authentication or decryption has failed.", e);
        } catch (RuntimeException e2) {
            this.f12646fa.mo22555x1();
            this.f12643c5.m18805x1((byte) 80);
            throw new IOException("The authentication or decryption has failed.", e2);
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m18694kk(k4 k4Var) {
        int i;
        try {
            synchronized (this.f12652to) {
                try {
                    boolean z = true;
                    boolean z2 = this.f12651m9.getPosition() == this.f12651m9.getLength() && this.f12651m9.getLength() > 0;
                    if (this.f12651m9.getLength() <= 0 || k4Var.m18721dy() <= 0) {
                        z = false;
                    }
                    if (z2) {
                        m18691k4();
                    } else if (z) {
                        i = this.f12651m9.read(k4Var.m18723h4(), k4Var.m18729m9(), k4Var.m18721dy());
                    }
                    i = 0;
                } finally {
                }
            }
            if (i > 0) {
                k4Var.m18726k4(i);
            } else {
                if (this.f12645dy.m18659ks()) {
                    k4Var.m18726k4(0);
                    return;
                }
                AbstractC3150x6 abstractC3150x6 = this.f12647h4;
                byte[] bArr = this.f12653up;
                abstractC3150x6.beginRead(bArr, 0, bArr.length, new C4553qm(this), new Object[]{this.f12653up, k4Var});
            }
        } catch (C4545k4 e) {
            this.f12643c5.m18798k4(e.m18761k4());
            throw new IOException("The authentication or decryption has failed.", e);
        } catch (RuntimeException e2) {
            throw new IOException("IO exception during read.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:? -> B:26:0x00a9). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: kk */
    public void m18696kk(InterfaceC14083qm interfaceC14083qm) throws Throwable {
        boolean z;
        byte[] bArrM18800k4;
        int i;
        long j;
        byte[] bArr;
        AbstractC4535e0 abstractC4535e0;
        long j2;
        long j3;
        AbstractC4535e0 abstractC4535e02 = this;
        if (abstractC4535e02.f12649k4) {
            return;
        }
        Object[] objArr = (Object[]) C7019kk.m27458kk(interfaceC14083qm.mo18725k4(), Object[].class);
        int i2 = 0;
        byte[] bArr2 = (byte[]) C7019kk.m27458kk(objArr[0], byte[].class);
        k4 k4Var = (k4) objArr[1];
        try {
            int iEndRead = abstractC4535e02.f12647h4.endRead(interfaceC14083qm);
            try {
                if (iEndRead <= 0) {
                    k4Var.m18726k4(0);
                    return;
                }
                abstractC4535e02.f12655yj.write(bArr2, 0, iEndRead);
                long position = abstractC4535e02.f12655yj.getPosition();
                long j4 = 0;
                abstractC4535e02.f12655yj.setPosition(0L);
                long j5 = 5;
                if (abstractC4535e02.f12655yj.getLength() >= 5) {
                    bArrM18800k4 = abstractC4535e02.f12643c5.m18800k4(abstractC4535e02.f12655yj);
                    z = false;
                } else {
                    z = false;
                    bArrM18800k4 = null;
                }
                while (bArrM18800k4 != null) {
                    boolean z2 = z;
                    long length = abstractC4535e02.f12655yj.getLength() - abstractC4535e02.f12655yj.getPosition();
                    if (length > j4) {
                        j = j5;
                        int i3 = (int) length;
                        bArr = new byte[i3];
                        abstractC4535e02.f12655yj.read(bArr, i2, i3);
                    } else {
                        j = j5;
                        bArr = null;
                    }
                    synchronized (abstractC4535e02.f12652to) {
                        try {
                            try {
                                long position2 = abstractC4535e02.f12651m9.getPosition();
                                if (bArrM18800k4.length > 0) {
                                    abstractC4535e0 = this;
                                    try {
                                        j2 = length;
                                        abstractC4535e0.f12651m9.seek(0L, 2);
                                        abstractC4535e0.f12651m9.write(bArrM18800k4, 0, bArrM18800k4.length);
                                        abstractC4535e0.f12651m9.seek(position2, 0);
                                        z = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                } else {
                                    abstractC4535e0 = this;
                                    j2 = length;
                                    z = z2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    abstractC4535e0.f12655yj.setLength(0L);
                    if (length > j4) {
                        abstractC4535e0.f12655yj.write(bArr, 0, bArr.length);
                        if (abstractC4535e0.f12655yj.getLength() >= j) {
                            j3 = 0;
                            abstractC4535e0.f12655yj.setPosition(0L);
                            byte[] bArrM18800k42 = abstractC4535e0.f12643c5.m18800k4(abstractC4535e0.f12655yj);
                            if (bArrM18800k42 == null) {
                                position = abstractC4535e0.f12655yj.getLength();
                            }
                            bArrM18800k4 = bArrM18800k42;
                            long j6 = j3;
                            abstractC4535e02 = abstractC4535e0;
                            j4 = j6;
                            j5 = j;
                            i2 = 0;
                        } else {
                            j3 = 0;
                            position = j2;
                        }
                    } else {
                        j3 = 0;
                        position = 0;
                    }
                    bArrM18800k4 = null;
                    long j62 = j3;
                    abstractC4535e02 = abstractC4535e0;
                    j4 = j62;
                    j5 = j;
                    i2 = 0;
                }
                AbstractC4535e0 abstractC4535e03 = abstractC4535e02;
                if (z || iEndRead <= 0) {
                    abstractC4535e03.f12655yj.setPosition(position);
                    synchronized (abstractC4535e03.f12652to) {
                        i = abstractC4535e03.f12651m9.read(k4Var.m18723h4(), k4Var.m18729m9(), k4Var.m18721dy());
                    }
                    k4Var.m18726k4(i);
                    return;
                }
                if (abstractC4535e03.f12645dy.m18659ks()) {
                    k4Var.m18726k4(0);
                    return;
                }
                C3152yj c3152yj = abstractC4535e03.f12655yj;
                c3152yj.setPosition(c3152yj.getLength());
                abstractC4535e03.f12647h4.beginRead(bArr2, 0, bArr2.length, new C4539g8(abstractC4535e03), objArr);
            } catch (Exception e) {
                e = e;
                k4Var.m18727k4(e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: kk */
    public boolean m18714kk(C3817h4 c3817h4, int[] iArr) {
        return mo18716x1(c3817h4, iArr);
    }
}

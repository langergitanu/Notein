package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p205ji.C5458kk;
import com.aspose.slides.internal.p289n2.C6696ne;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;
import com.google.common.net.HttpHeaders;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.m2 */
/* JADX INFO: loaded from: classes5.dex */
class C11953m2 extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    static byte[] f40283k4 = {C7019kk.m27442k4((Object) 13, 9), C7019kk.m27442k4((Object) 10, 9)};

    /* JADX INFO: renamed from: ar */
    private Object f40284ar = new Object();

    /* JADX INFO: renamed from: b3 */
    private AbstractC14078m9 f40285b3;

    /* JADX INFO: renamed from: bv */
    private boolean f40286bv;

    /* JADX INFO: renamed from: c5 */
    private int f40287c5;

    /* JADX INFO: renamed from: ck */
    private int f40288ck;

    /* JADX INFO: renamed from: du */
    private C11917ai f40289du;

    /* JADX INFO: renamed from: dy */
    private int f40290dy;

    /* JADX INFO: renamed from: fa */
    private int f40291fa;

    /* JADX INFO: renamed from: h4 */
    private C11975um f40292h4;

    /* JADX INFO: renamed from: ix */
    private C3152yj f40293ix;

    /* JADX INFO: renamed from: jd */
    private int f40294jd;

    /* JADX INFO: renamed from: kk */
    boolean f40295kk;

    /* JADX INFO: renamed from: ks */
    private int f40296ks;

    /* JADX INFO: renamed from: lr */
    private int f40297lr;

    /* JADX INFO: renamed from: m9 */
    private byte[] f40298m9;

    /* JADX INFO: renamed from: ne */
    private boolean f40299ne;

    /* JADX INFO: renamed from: qq */
    private boolean f40300qq;

    /* JADX INFO: renamed from: rv */
    private C5458kk f40301rv;

    /* JADX INFO: renamed from: to */
    private boolean f40302to;

    /* JADX INFO: renamed from: u4 */
    private boolean f40303u4;

    /* JADX INFO: renamed from: um */
    private boolean f40304um;

    /* JADX INFO: renamed from: up */
    private boolean f40305up;

    /* JADX INFO: renamed from: uz */
    private byte[] f40306uz;

    /* JADX INFO: renamed from: v4 */
    private boolean f40307v4;

    /* JADX INFO: renamed from: wl */
    private boolean f40308wl;

    /* JADX INFO: renamed from: x1 */
    long f40309x1;

    /* JADX INFO: renamed from: x6 */
    private boolean f40310x6;

    /* JADX INFO: renamed from: yd */
    private int f40311yd;

    /* JADX INFO: renamed from: yj */
    private int f40312yj;

    public C11953m2(C11917ai c11917ai, C11941he c11941he) {
        if (c11941he == null) {
            throw new InvalidOperationException("data was not initialized");
        }
        if (c11941he.f40251kk == null) {
            throw new InvalidOperationException("data.Headers was not initialized");
        }
        if (c11941he.m55975k4() == null) {
            throw new InvalidOperationException("data.request was not initialized");
        }
        this.f40302to = true;
        this.f40285b3 = new C11945j5(this);
        this.f40301rv = new C5458kk(true);
        C11975um c11975umM55975k4 = c11941he.m55975k4();
        this.f40292h4 = c11975umM55975k4;
        int iM56201ck = c11975umM55975k4.m56201ck();
        this.f40297lr = iM56201ck;
        this.f40311yd = iM56201ck;
        this.f40289du = c11917ai;
        String str = c11941he.f40251kk.get_Item(HttpHeaders.TRANSFER_ENCODING);
        boolean z = (str == null || C14113y2.m67367h4(str, "chunked", (short) 5) == -1) ? false : true;
        String str2 = c11941he.f40251kk.get_Item("Content-Length");
        if (z || str2 == null || "".equals(str2)) {
            this.f40288ck = Integer.MAX_VALUE;
        } else {
            try {
                int iM66582k4 = C14057f9.m66582k4(str2);
                this.f40288ck = iM66582k4;
                if (iM66582k4 == 0 && !m56013fa()) {
                    m56034dy();
                }
            } catch (RuntimeException unused) {
                this.f40288ck = Integer.MAX_VALUE;
            }
        }
        int[] iArr = {this.f40294jd};
        boolean zM66590k4 = C14057f9.m66590k4(str2, iArr);
        this.f40294jd = iArr[0];
        if (zM66590k4) {
            return;
        }
        this.f40294jd = -1;
    }

    /* JADX INFO: renamed from: fa */
    private boolean m56013fa() {
        if (this.f40292h4.mo56233up() == null || this.f40292h4.mo56233up().mo56113x1(this.f40292h4.m56209k4()) || !m56021k4(HttpHeaders.PROXY_AUTHENTICATE)) {
            return m56021k4("WWW-Authenticate");
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginRead(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        int i3;
        int i4;
        if (!this.f40302to) {
            throw new NotSupportedException("this stream does not allow reading");
        }
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        int iM67265du = AbstractC14092to.m67208k4((Object) bArr).m67265du();
        if (i < 0 || iM67265du < i) {
            throw new ArgumentOutOfRangeException("offset");
        }
        if (i2 < 0 || iM67265du - i < i2) {
            throw new ArgumentOutOfRangeException("size");
        }
        synchronized (this.f40284ar) {
            this.f40312yj++;
            this.f40301rv.m22563k4();
        }
        C11998zj c11998zj = new C11998zj(abstractC14078m9, obj, bArr, i, i2);
        if (this.f40291fa >= this.f40288ck) {
            c11998zj.m56297k4(true, -1);
            c11998zj.m56292ck();
            return c11998zj;
        }
        int i5 = this.f40287c5;
        int i6 = this.f40290dy;
        int i7 = i5 - i6;
        if (i7 > 0) {
            if (i7 > i2) {
                i7 = i2;
            }
            C14058fa.m66596k4(this.f40298m9, i6, bArr, i, i7);
            this.f40290dy += i7;
            int i8 = i + i7;
            i4 = i2 - i7;
            int i9 = this.f40291fa + i7;
            this.f40291fa = i9;
            if (i4 == 0 || i9 >= this.f40288ck) {
                c11998zj.m56297k4(true, i7);
                c11998zj.m56292ck();
                return c11998zj;
            }
            c11998zj.m56295k4(i7);
            i3 = i8;
        } else {
            i3 = i;
            i4 = i2;
        }
        AbstractC14078m9 abstractC14078m92 = abstractC14078m9 != null ? this.f40285b3 : abstractC14078m9;
        int i10 = this.f40288ck;
        if (i10 != Integer.MAX_VALUE) {
            int i11 = this.f40291fa;
            if (i10 - i11 < i4) {
                i4 = i10 - i11;
            }
        }
        int i12 = i4;
        if (!this.f40286bv) {
            c11998zj.m56296k4(this.f40289du.m55853k4(this.f40292h4, bArr, i3, i12, abstractC14078m92, c11998zj));
            return c11998zj;
        }
        c11998zj.m56297k4(true, c11998zj.m56293fa());
        c11998zj.m56292ck();
        return c11998zj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:13|(3:15|2c|19)|23|(3:25|(3:27|(1:29)|30)|31)(2:33|(4:35|(1:37)|38|(2:44|45)(1:43))(9:46|78|47|48|76|49|(3:51|(1:53)|56)|63|64))|32|78|47|48|76|49|(0)|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015f, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
    
        if (r15.f40295kk != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
    
        r9.m56297k4(true, 0);
        r9.m56292ck();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0178, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e A[Catch: RuntimeException -> 0x0158, TryCatch #0 {RuntimeException -> 0x0158, blocks: (B:49:0x0141, B:51:0x014e, B:53:0x0154, B:56:0x015a), top: B:76:0x0141 }] */
    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC14083qm beginWrite(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        byte[] buffer;
        int i3;
        int iM27462to;
        C11998zj c11998zj;
        if (this.f40292h4.m56232um()) {
            throw new C11997yo("The request was canceled.", null, 6);
        }
        if (this.f40302to) {
            throw new NotSupportedException("this stream does not allow writing");
        }
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        int iM67265du = AbstractC14092to.m67208k4((Object) bArr).m67265du();
        if (i < 0 || iM67265du < i) {
            throw new ArgumentOutOfRangeException("offset");
        }
        if (i2 < 0 || iM67265du - i < i2) {
            throw new ArgumentOutOfRangeException("size");
        }
        if (this.f40299ne) {
            synchronized (this.f40284ar) {
                this.f40296ks++;
                this.f40301rv.m22563k4();
            }
        }
        C11998zj c11998zj2 = new C11998zj(abstractC14078m9, obj);
        C11992y9 c11992y9 = new C11992y9(this);
        if (this.f40299ne) {
            this.f40303u4 = true;
            byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to(C14113y2.m67402k4("{0:X}\r\n", C7019kk.m27466x1(i2)));
            int iM67265du2 = AbstractC14092to.m67208k4((Object) bArrMo26677to).m67265du() + i2 + 2;
            byte[] bArr2 = new byte[iM67265du2];
            C14058fa.m66596k4(bArrMo26677to, 0, bArr2, 0, AbstractC14092to.m67208k4((Object) bArrMo26677to).m67265du());
            C14058fa.m66596k4(bArr, i, bArr2, AbstractC14092to.m67208k4((Object) bArrMo26677to).m67265du(), i2);
            C14058fa.m66596k4(f40283k4, 0, bArr2, AbstractC14092to.m67208k4((Object) bArrMo26677to).m67265du() + i2, AbstractC14092to.m67208k4((Object) f40283k4).m67265du());
            if (this.f40310x6) {
                if (this.f40293ix == null) {
                    this.f40293ix = new C3152yj();
                }
                this.f40293ix.write(bArr, i, i2);
                this.f40309x1 = C7019kk.m27438h4(Integer.valueOf(i2), 9) + this.f40309x1;
            }
            buffer = bArr2;
            iM27462to = iM67265du2;
        } else {
            m56015k4(this.f40292h4.mo56202du(), this.f40309x1, C7019kk.m27438h4(Integer.valueOf(i2), 9));
            if (!this.f40310x6) {
                buffer = bArr;
                i3 = i;
                iM27462to = i2;
                c11998zj = c11998zj2;
                c11998zj.m56296k4(this.f40289du.m55862x1(this.f40292h4, buffer, i3, iM27462to, c11992y9, c11998zj));
                if (c11998zj.m56302up() == null) {
                    if (!c11998zj.mo18728kk()) {
                        c11998zj.m56297k4(true, 0);
                    }
                    c11998zj.m56292ck();
                }
                this.f40309x1 = C7019kk.m27438h4(Integer.valueOf(iM27462to), 9) + this.f40309x1;
                return c11998zj;
            }
            if (this.f40293ix == null) {
                this.f40293ix = new C3152yj();
            }
            this.f40293ix.write(bArr, i, i2);
            this.f40309x1 = C7019kk.m27438h4(Integer.valueOf(i2), 9) + this.f40309x1;
            if (this.f40292h4.mo56202du() <= 0 || this.f40309x1 < this.f40292h4.mo56202du()) {
                c11998zj2.m56297k4(true, 0);
                c11998zj2.m56292ck();
                return c11998zj2;
            }
            c11998zj2.f40496x1 = true;
            this.f40303u4 = true;
            buffer = this.f40293ix.getBuffer();
            iM27462to = C7019kk.m27462to(Long.valueOf(this.f40309x1), 11);
        }
        i3 = 0;
        c11998zj = c11998zj2;
        c11998zj.m56296k4(this.f40289du.m55862x1(this.f40292h4, buffer, i3, iM27462to, c11992y9, c11998zj));
        if (c11998zj.m56302up() == null) {
        }
        this.f40309x1 = C7019kk.m27438h4(Integer.valueOf(iM27462to), 9) + this.f40309x1;
        return c11998zj;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m56031c5() {
        return this.f40303u4;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return !this.f40308wl && this.f40302to;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canTimeout() {
        return true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return (this.f40308wl || this.f40302to) ? false : true;
    }

    /* JADX INFO: renamed from: ck */
    public void m56032ck() {
        this.f40293ix = null;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        if (this.f40299ne) {
            if (this.f40308wl) {
                return;
            }
            this.f40308wl = true;
            this.f40301rv.m22558du();
            byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to("0\r\n\r\n");
            this.f40289du.m55858k4(this.f40292h4, bArrMo26677to, 0, AbstractC14092to.m67208k4((Object) bArrMo26677to).m67265du(), new String[]{null});
            return;
        }
        if (this.f40302to) {
            if (this.f40305up) {
                return;
            }
            m56044m9();
            if (this.f40305up) {
                return;
            }
            this.f40305up = true;
            this.f40289du.m55856k4(true);
            return;
        }
        if (!this.f40310x6) {
            this.f40307v4 = true;
            if (this.f40304um) {
                return;
            }
            this.f40304um = true;
            C11917ai.m55839k4((Object) this.f40289du);
            return;
        }
        if (this.f40308wl || this.f40303u4) {
            return;
        }
        long jMo56202du = this.f40292h4.mo56202du();
        if (this.f40299ne || jMo56202du == -1 || this.f40309x1 == jMo56202du) {
            this.f40308wl = true;
            return;
        }
        IOException iOException = new IOException("Cannot close the stream until all bytes are written");
        this.f40305up = true;
        this.f40289du.m55856k4(true);
        throw new C11997yo("Request was cancelled.", iOException, 6);
    }

    /* JADX INFO: renamed from: du */
    public int m56033du() {
        C3152yj c3152yj = this.f40293ix;
        if (c3152yj != null) {
            return C7019kk.m27462to(Long.valueOf(c3152yj.getLength()), 11);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:13:0x001d, B:15:0x0023, B:19:0x0028, B:21:0x0033, B:24:0x0040, B:26:0x0049, B:29:0x004f, B:30:0x0051, B:32:0x0063, B:33:0x0067, B:44:0x009e, B:45:0x00a8, B:34:0x007c, B:39:0x0089, B:40:0x008c, B:43:0x0093), top: B:55:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[Catch: all -> 0x0025, LOOP:0: B:30:0x0051->B:32:0x0063, LOOP_END, TryCatch #0 {all -> 0x0025, blocks: (B:13:0x001d, B:15:0x0023, B:19:0x0028, B:21:0x0033, B:24:0x0040, B:26:0x0049, B:29:0x004f, B:30:0x0051, B:32:0x0063, B:33:0x0067, B:44:0x009e, B:45:0x00a8, B:34:0x007c, B:39:0x0089, B:40:0x008c, B:43:0x0093), top: B:55:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0067 A[EDGE_INSN: B:56:0x0067->B:33:0x0067 BREAK  A[LOOP:0: B:30:0x0051->B:32:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: dy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m56034dy() {
        int iM27462to;
        byte[] buffer;
        byte[] bArr;
        int iM55851k4;
        boolean z = this.f40302to;
        if (z && !this.f40286bv && this.f40291fa < this.f40288ck && !this.f40305up) {
            this.f40301rv.m22558du();
            synchronized (this.f40284ar) {
                try {
                    int i = this.f40291fa;
                    int i2 = this.f40288ck;
                    if (i >= i2) {
                        return;
                    }
                    int i3 = this.f40287c5;
                    int i4 = this.f40290dy;
                    int i5 = i3 - i4;
                    if (i2 == Integer.MAX_VALUE) {
                        C3152yj c3152yj = new C3152yj();
                        byte[] bArr2 = this.f40298m9;
                        if (bArr2 == null || i5 <= 0) {
                            bArr = null;
                            if (bArr == null) {
                                bArr = new byte[8192];
                            }
                            while (true) {
                                iM55851k4 = this.f40289du.m55851k4(this.f40292h4, bArr, 0, AbstractC14092to.m67208k4((Object) bArr).m67265du());
                                if (iM55851k4 != 0) {
                                    break;
                                } else {
                                    c3152yj.write(bArr, 0, iM55851k4);
                                }
                            }
                            buffer = c3152yj.getBuffer();
                            iM27462to = C7019kk.m27462to(Long.valueOf(c3152yj.getLength()), 11);
                            this.f40288ck = iM27462to;
                        } else {
                            c3152yj.write(bArr2, this.f40290dy, i5);
                            if (this.f40287c5 >= 8192) {
                                bArr = this.f40298m9;
                            }
                            if (bArr == null) {
                            }
                            while (true) {
                                iM55851k4 = this.f40289du.m55851k4(this.f40292h4, bArr, 0, AbstractC14092to.m67208k4((Object) bArr).m67265du());
                                if (iM55851k4 != 0) {
                                }
                                c3152yj.write(bArr, 0, iM55851k4);
                            }
                            buffer = c3152yj.getBuffer();
                            iM27462to = C7019kk.m27462to(Long.valueOf(c3152yj.getLength()), 11);
                            this.f40288ck = iM27462to;
                        }
                    } else {
                        iM27462to = i2 - i;
                        buffer = new byte[iM27462to];
                        byte[] bArr3 = this.f40298m9;
                        if (bArr3 != null && i5 > 0) {
                            if (i5 > iM27462to) {
                                i5 = iM27462to;
                            }
                            C14058fa.m66596k4(bArr3, i4, buffer, 0, i5);
                        }
                        int i6 = iM27462to - i5;
                        int iM55851k42 = -1;
                        while (i6 > 0 && iM55851k42 != 0) {
                            iM55851k42 = this.f40289du.m55851k4(this.f40292h4, buffer, i5, i6);
                            i6 -= iM55851k42;
                            i5 += iM55851k42;
                        }
                    }
                    this.f40298m9 = buffer;
                    this.f40290dy = 0;
                    this.f40287c5 = iM27462to;
                    this.f40291fa = 0;
                    this.f40305up = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (!z || this.f40305up) {
            return;
        } else {
            this.f40305up = true;
        }
        this.f40289du.m55863x1();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int endRead(InterfaceC14083qm interfaceC14083qm) {
        C11998zj c11998zj = (C11998zj) interfaceC14083qm;
        if (c11998zj.f40492k4) {
            int iM56293fa = c11998zj.m56293fa();
            if (iM56293fa >= 0) {
                return iM56293fa;
            }
            return 0;
        }
        c11998zj.f40492k4 = true;
        if (!c11998zj.mo18728kk()) {
            try {
                int iM55850k4 = this.f40289du.m55850k4(this.f40292h4, c11998zj);
                if (iM55850k4 < 0) {
                    this.f40286bv = true;
                    iM55850k4 = 0;
                }
                this.f40291fa += iM55850k4;
                c11998zj.m56297k4(false, c11998zj.m56293fa() + iM55850k4);
                c11998zj.m56292ck();
                if (iM55850k4 == 0) {
                    this.f40288ck = this.f40291fa;
                }
            } catch (Exception e) {
                synchronized (this.f40284ar) {
                    try {
                        int i = this.f40312yj - 1;
                        this.f40312yj = i;
                        if (i == 0) {
                            this.f40301rv.mo22555x1();
                        }
                        this.f40305up = true;
                        this.f40289du.m55856k4(true);
                        c11998zj.m56123k4(false, e);
                        c11998zj.m56292ck();
                        throw e;
                    } finally {
                    }
                }
            }
        }
        synchronized (this.f40284ar) {
            try {
                int i2 = this.f40312yj - 1;
                this.f40312yj = i2;
                if (i2 == 0) {
                    this.f40301rv.mo22555x1();
                }
            } finally {
            }
        }
        if (this.f40291fa >= this.f40288ck && !this.f40305up) {
            m56034dy();
        }
        int iM56293fa2 = c11998zj.m56293fa();
        if (iM56293fa2 >= 0) {
            return iM56293fa2;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void endWrite(InterfaceC14083qm interfaceC14083qm) {
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("r");
        }
        C11998zj c11998zj = (C11998zj) C7019kk.m27452k4((Object) interfaceC14083qm, C11998zj.class);
        if (c11998zj == null) {
            throw new ArgumentException("Invalid IAsyncResult");
        }
        if (c11998zj.f40492k4) {
            return;
        }
        c11998zj.f40492k4 = true;
        if (c11998zj.f40496x1) {
            c11998zj.m56121h4();
            if (c11998zj.m56120dy()) {
                throw c11998zj.m56118c5();
            }
            return;
        }
        if (!this.f40310x6 || this.f40299ne) {
            if (c11998zj.m56120dy()) {
                throw c11998zj.m56118c5();
            }
            if (this.f40299ne) {
                synchronized (this.f40284ar) {
                    try {
                        int i = this.f40296ks - 1;
                        this.f40296ks = i;
                        if (i == 0) {
                            this.f40301rv.mo22555x1();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        if (this.f40302to) {
            return C7019kk.m27438h4(Integer.valueOf(this.f40294jd), 9);
        }
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int getReadTimeout() {
        return this.f40297lr;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int getWriteTimeout() {
        return this.f40311yd;
    }

    /* JADX INFO: renamed from: h4 */
    public void m56035h4() {
        if (this.f40305up) {
            return;
        }
        if (this.f40288ck == Integer.MAX_VALUE) {
            this.f40288ck = 0;
        }
        this.f40305up = true;
        this.f40289du.m55863x1();
    }

    /* JADX INFO: renamed from: jd */
    public void m56036jd() {
        this.f40308wl = true;
    }

    /* JADX INFO: renamed from: m9 */
    public void m56044m9() {
        if (this.f40305up || this.f40287c5 - this.f40290dy != this.f40288ck) {
            return;
        }
        this.f40305up = true;
        this.f40289du.m55863x1();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        C11998zj c11998zj = (C11998zj) beginRead(bArr, i, i2, this.f40285b3, null);
        if (c11998zj.mo18728kk() || c11998zj.m56124k4(getReadTimeout(), false)) {
            return endRead(c11998zj);
        }
        this.f40305up = true;
        this.f40289du.m55856k4(true);
        throw new C11997yo("The operation has timed out.", 14);
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
    public void setReadTimeout(int i) {
        if (i < -1) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f40297lr = i;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setWriteTimeout(int i) {
        if (i < -1) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f40311yd = i;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        C11998zj c11998zj = (C11998zj) beginWrite(bArr, i, i2, this.f40285b3, null);
        if (c11998zj.mo18728kk() || c11998zj.m56124k4(getWriteTimeout(), false)) {
            endWrite(c11998zj);
            return;
        }
        m56032ck();
        this.f40305up = true;
        this.f40289du.m55856k4(true);
        throw new IOException("Write timed out.");
    }

    /* JADX INFO: renamed from: x1 */
    public C11917ai m56046x1() {
        return this.f40289du;
    }

    public C11953m2(C11917ai c11917ai, C11975um c11975um) {
        int iM56201ck = c11975um.m56201ck();
        this.f40297lr = iM56201ck;
        this.f40311yd = iM56201ck;
        this.f40302to = false;
        this.f40285b3 = new C11959nv(this);
        this.f40289du = c11917ai;
        this.f40292h4 = c11975um;
        this.f40310x6 = c11975um.m56222kk();
        boolean zM56223ks = c11975um.m56223ks();
        this.f40299ne = zM56223ks;
        if (zM56223ks) {
            this.f40301rv = new C5458kk(true);
        } else if (this.f40310x6) {
            this.f40293ix = new C3152yj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public void m56023kk(InterfaceC14083qm interfaceC14083qm) {
        C11998zj c11998zj = (C11998zj) interfaceC14083qm.mo18725k4();
        c11998zj.m56296k4((InterfaceC14083qm) null);
        try {
            this.f40289du.m55857k4(this.f40292h4, true, interfaceC14083qm);
            c11998zj.m56297k4(false, 0);
            if (!this.f40304um) {
                this.f40304um = true;
                C11917ai.m55839k4((Object) this.f40289du);
            }
        } catch (Exception e) {
            e = e;
            m56032ck();
            this.f40305up = true;
            this.f40289du.m55856k4(true);
            if (C7019kk.m27469x1(e, C6696ne.class)) {
                e = new IOException("Error writing request", e);
            }
            c11998zj.m56123k4(false, e);
        }
        if (this.f40310x6 && !this.f40299ne && this.f40292h4.mo56202du() > 0 && this.f40309x1 == this.f40292h4.mo56202du()) {
            this.f40307v4 = true;
        }
        c11998zj.m56292ck();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56037k4() {
        int i = this.f40288ck;
        if (i <= 0 || this.f40287c5 - this.f40290dy < i || m56013fa()) {
            return;
        }
        m56034dy();
    }

    /* JADX INFO: renamed from: to */
    public byte[] m56045to() {
        return this.f40293ix.getBuffer();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56038k4(int i) {
        this.f40290dy = i;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m56043kk() {
        return this.f40307v4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m56047x1(int i) {
        this.f40287c5 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m56015k4(long j, long j2, long j3) {
        if (j != -1 && j3 > j - j2) {
            m56032ck();
            this.f40305up = true;
            this.f40289du.m55856k4(true);
            throw new C11966s7(C14113y2.m67408k4("The number of bytes to be written is greater than ", "the specified ContentLength."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m56029x1(InterfaceC14083qm interfaceC14083qm) {
        if (interfaceC14083qm.mo18725k4() == null) {
            try {
                endRead(interfaceC14083qm);
            } catch (RuntimeException unused) {
            }
        } else {
            C11998zj c11998zj = (C11998zj) interfaceC14083qm.mo18725k4();
            c11998zj.m56296k4(interfaceC14083qm);
            c11998zj.m56292ck();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m56017k4(InterfaceC14083qm interfaceC14083qm) {
        C11998zj c11998zj = (C11998zj) C7019kk.m27452k4((Object) interfaceC14083qm, C11998zj.class);
        if (c11998zj == null || !c11998zj.f40496x1) {
            if (interfaceC14083qm.mo18725k4() == null) {
                try {
                    endWrite(interfaceC14083qm);
                } catch (RuntimeException unused) {
                }
            } else {
                C11998zj c11998zj2 = (C11998zj) interfaceC14083qm.mo18725k4();
                c11998zj2.m56296k4(interfaceC14083qm);
                c11998zj2.m56292ck();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m56039k4(boolean z) {
        this.f40299ne = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56040k4(boolean z, AbstractC11979vh abstractC11979vh) {
        C11971tq.m56116k4(new C11937gf(this, z), abstractC11979vh);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56041k4(byte[] bArr) {
        this.f40298m9 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56042k4(C11971tq c11971tq) {
        C3152yj c3152yj;
        if (this.f40303u4) {
            return false;
        }
        this.f40303u4 = true;
        if (this.f40299ne || !this.f40310x6 || (c3152yj = this.f40293ix) == null) {
            return false;
        }
        byte[] buffer = c3152yj.getBuffer();
        int iM27462to = C7019kk.m27462to(Long.valueOf(this.f40293ix.getLength()), 11);
        if (this.f40292h4.mo56202du() == -1 || this.f40292h4.mo56202du() >= iM27462to) {
            m56040k4(true, (AbstractC11979vh) new C11939gk(this, c11971tq, iM27462to, buffer));
            return true;
        }
        this.f40305up = true;
        this.f40289du.m55856k4(true);
        throw new C11997yo("Specified Content-Length is less than the number of bytes to write", null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public boolean m56020k4(C11971tq c11971tq, boolean z) {
        C3152yj c3152yj;
        if (this.f40300qq) {
            return false;
        }
        String strMo56204fa = this.f40292h4.mo56204fa();
        boolean z2 = "GET".equals(strMo56204fa) || "CONNECT".equals(strMo56204fa) || "HEAD".equals(strMo56204fa) || "TRACE".equals(strMo56204fa);
        boolean z3 = "PROPFIND".equals(strMo56204fa) || "PROPPATCH".equals(strMo56204fa) || "MKCOL".equals(strMo56204fa) || "COPY".equals(strMo56204fa) || "MOVE".equals(strMo56204fa) || "LOCK".equals(strMo56204fa) || "UNLOCK".equals(strMo56204fa);
        if (z && !z2 && (c3152yj = this.f40293ix) != null) {
            this.f40292h4.m56214k4(c3152yj.getLength());
        }
        if (!this.f40299ne && this.f40292h4.mo56202du() <= -1 && !z2 && !z3) {
            return false;
        }
        this.f40300qq = true;
        byte[] bArrM56235v4 = this.f40292h4.m56235v4();
        this.f40306uz = bArrM56235v4;
        return this.f40289du.m55862x1(this.f40292h4, bArrM56235v4, 0, AbstractC14092to.m67208k4((Object) bArrM56235v4).m67265du(), new C11942ig(this, c11971tq), null) != null;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56021k4(String str) {
        String str2 = this.f40289du.f40156kk.f40251kk.get_Item(str);
        return (str2 == null || C14113y2.m67367h4(str2, "NTLM", (short) 4) == -1) ? false : true;
    }
}

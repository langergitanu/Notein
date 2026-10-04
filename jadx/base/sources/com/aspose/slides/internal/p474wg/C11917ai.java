package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Queue;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p166hg.C4546kk;
import com.aspose.slides.internal.p166hg.C4566up;
import com.aspose.slides.internal.p205ji.AbstractC5448bv;
import com.aspose.slides.internal.p205ji.C5464rv;
import com.aspose.slides.internal.p205ji.C5475yj;
import com.aspose.slides.internal.p289n2.C6690h4;
import com.aspose.slides.internal.p289n2.C6695m9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14107wz;
import com.aspose.slides.p559ms.System.C14111xk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;
import com.aspose.words.ControlChar;
import com.google.common.net.HttpHeaders;
import com.google.firebase.vertexai.common.util.KtorKt;
import com.huawei.hms.network.embedded.C18190ga;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.ai */
/* JADX INFO: loaded from: classes5.dex */
class C11917ai {

    /* JADX INFO: renamed from: ar */
    private int f40145ar;

    /* JADX INFO: renamed from: bv */
    private boolean f40146bv;

    /* JADX INFO: renamed from: c5 */
    private int f40147c5;

    /* JADX INFO: renamed from: ck */
    private boolean f40148ck;

    /* JADX INFO: renamed from: du */
    private C11934f9 f40149du;

    /* JADX INFO: renamed from: dy */
    private InterfaceC11936g8 f40150dy;

    /* JADX INFO: renamed from: h4 */
    private AbstractC3150x6 f40152h4;

    /* JADX INFO: renamed from: ix */
    private int f40153ix;

    /* JADX INFO: renamed from: k4 */
    C6695m9 f40155k4;

    /* JADX INFO: renamed from: ks */
    private boolean f40157ks;

    /* JADX INFO: renamed from: lr */
    private Exception f40158lr;

    /* JADX INFO: renamed from: ne */
    private boolean f40160ne;

    /* JADX INFO: renamed from: qq */
    private boolean f40161qq;

    /* JADX INFO: renamed from: rv */
    private C11930du f40162rv;

    /* JADX INFO: renamed from: u4 */
    private C11975um f40163u4;

    /* JADX INFO: renamed from: um */
    private C11975um f40164um;

    /* JADX INFO: renamed from: up */
    private AbstractC14049c6 f40165up;

    /* JADX INFO: renamed from: uz */
    private C11950kp f40166uz;

    /* JADX INFO: renamed from: v4 */
    private boolean f40167v4;

    /* JADX INFO: renamed from: wl */
    private boolean f40168wl;

    /* JADX INFO: renamed from: x6 */
    private Queue f40169x6;

    /* JADX INFO: renamed from: yj */
    private k4 f40170yj;

    /* JADX INFO: renamed from: x1 */
    static AbstractC14078m9 f40144x1 = new C11964ri();

    /* JADX INFO: renamed from: to */
    static Object f40143to = new Object();

    /* JADX INFO: renamed from: m9 */
    private Object f40159m9 = new Object();

    /* JADX INFO: renamed from: fa */
    private byte[] f40151fa = new byte[4096];

    /* JADX INFO: renamed from: kk */
    C11941he f40156kk = new C11941he();

    /* JADX INFO: renamed from: jd */
    private AbstractC5448bv f40154jd = new C11927ca(this);

    /* JADX INFO: renamed from: com.aspose.slides.internal.wg.ai$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public C11917ai f40171k4;

        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public void m55866k4(Object obj, C14111xk c14111xk) {
            C11917ai c11917ai = ((C11975um) obj).f40393k4;
            if (c11917ai == null) {
                c11917ai = this.f40171k4;
            }
            c11917ai.m55840k4(obj, c14111xk);
        }

        public /* synthetic */ k4(C11964ri c11964ri) {
            this();
        }
    }

    public C11917ai(InterfaceC11936g8 interfaceC11936g8, C11934f9 c11934f9) {
        this.f40150dy = interfaceC11936g8;
        this.f40149du = c11934f9;
        this.f40169x6 = interfaceC11936g8.mo55970k4().m55988x1();
        k4 k4Var = new k4(null);
        this.f40170yj = k4Var;
        k4Var.f40171k4 = this;
        this.f40165up = new C11922bs(this);
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m55827c5() {
        if (this.f40157ks && this.f40162rv != null) {
            while (this.f40162rv.m55920x1()) {
                AbstractC3150x6 abstractC3150x6 = this.f40152h4;
                byte[] bArr = this.f40151fa;
                int i = abstractC3150x6.read(bArr, 0, AbstractC14092to.m67208k4((Object) bArr).m67265du());
                if (i <= 0) {
                    return false;
                }
                this.f40162rv.m55919x1(this.f40151fa, 0, i);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: dy */
    private void m55828dy() {
        synchronized (this.f40169x6) {
            try {
                if (this.f40169x6.size() > 0) {
                    m55852k4((C11975um) this.f40169x6.dequeue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m55829k4(C11941he c11941he, C11934f9 c11934f9, byte[] bArr, int i) {
        String str = null;
        int i2 = 0;
        boolean z = false;
        while (c11941he.m55978x1() != 4) {
            boolean z2 = true;
            if (c11941he.m55978x1() == 0) {
                int[] iArr = {i2};
                String[] strArr = {str};
                boolean zM55843k4 = m55843k4(bArr, iArr, i, strArr);
                i2 = iArr[0];
                str = strArr[0];
                if (!zM55843k4) {
                    return 0;
                }
                if (str != null) {
                    c11941he.m55976k4(1);
                    String[] strArrM67414k4 = C14113y2.m67414k4(str, ControlChar.SPACE_CHAR);
                    if (AbstractC14092to.m67208k4((Object) strArrM67414k4).m67265du() < 2) {
                        return -1;
                    }
                    C14107wz c14107wz = C14113y2.m67382k4(strArrM67414k4[0], "HTTP/1.1", true) == 0 ? C11919ar.f40173x1 : C11919ar.f40172k4;
                    c11941he.f40253to = c14107wz;
                    c11934f9.m55953k4(c14107wz);
                    c11941he.f40250k4 = C7019kk.m27462to(Long.valueOf(C14114y9.m67456k4(strArrM67414k4[1])), 10);
                    c11941he.f40254x1 = AbstractC14092to.m67208k4((Object) strArrM67414k4).m67265du() >= 3 ? C14113y2.m67404k4(" ", strArrM67414k4, 2, AbstractC14092to.m67208k4((Object) strArrM67414k4).m67265du() - 2) : "";
                    if (i2 >= i) {
                        return i2;
                    }
                    if (c11941he.m55978x1() == 1) {
                        c11941he.m55976k4(2);
                        c11941he.f40251kk = new C11973u1();
                        ArrayList arrayList = new ArrayList();
                        boolean z3 = false;
                        while (!z3) {
                            int[] iArr2 = {i2};
                            String[] strArr2 = {str};
                            boolean zM55843k42 = m55843k4(bArr, iArr2, i, strArr2);
                            i2 = iArr2[0];
                            str = strArr2[0];
                            if (!zM55843k42) {
                                break;
                            }
                            if (str == null) {
                                z3 = true;
                            } else if (str.length() <= 0 || !(str.charAt(0) == ' ' || str.charAt(0) == '\t')) {
                                arrayList.addItem(str);
                            } else {
                                int size = arrayList.size() - 1;
                                if (size < 0) {
                                    break;
                                }
                                arrayList.set_Item(size, C14113y2.m67408k4((String) arrayList.get_Item(size), str));
                            }
                        }
                        if (!z3) {
                            return 0;
                        }
                        Iterator<E> it = arrayList.iterator();
                        while (it.hasNext()) {
                            c11941he.f40251kk.m56156x1((String) it.next());
                        }
                        if (c11941he.f40250k4 != 100) {
                            c11941he.m55976k4(3);
                            return i2;
                        }
                        c11934f9.m55959kk(true);
                        if (i2 >= i) {
                            return i2;
                        }
                        if (c11941he.m55975k4().m56206ix()) {
                            c11941he.m55975k4().m56213k4(c11941he.f40250k4, c11941he.f40251kk);
                            c11941he.m55975k4().m56238x1(false);
                        }
                        c11941he.m55976k4(0);
                        z = true;
                    }
                    z2 = false;
                }
            } else {
                if (c11941he.m55978x1() == 1) {
                }
                z2 = false;
            }
            if (!z2 && !z) {
                return -1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m55845m9() {
        return !this.f40155k4.m26484k4(0, 0);
    }

    /* JADX INFO: renamed from: du */
    public C11950kp m55848du() {
        return this.f40166uz;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m55849h4() {
        return this.f40161qq;
    }

    /* JADX INFO: renamed from: kk */
    public void m55859kk() {
        this.f40168wl = false;
        this.f40166uz = null;
        this.f40161qq = false;
    }

    /* JADX INFO: renamed from: to */
    public boolean m55861to() {
        return this.f40168wl;
    }

    /* JADX INFO: renamed from: x1 */
    public InterfaceC14083qm m55862x1(C11975um c11975um, byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        synchronized (this) {
            try {
                if (this.f40156kk.m55975k4() != c11975um) {
                    throw new ObjectDisposedException(C7019kk.m27443k4((Class<?>) C6690h4.class).mo48629x6());
                }
                AbstractC3150x6 abstractC3150x6 = this.f40152h4;
                if (abstractC3150x6 == null) {
                    return null;
                }
                try {
                    return abstractC3150x6.beginWrite(bArr, i, i2, abstractC14078m9, obj);
                } catch (Exception e) {
                    this.f40147c5 = 4;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m55844kk(C11975um c11975um) {
        synchronized (this.f40159m9) {
            try {
                C6695m9 c6695m9 = this.f40155k4;
                if (c6695m9 != null && c6695m9.m26494x1() && this.f40147c5 == 0 && m55845m9() && m55827c5()) {
                    this.f40160ne = true;
                } else {
                    this.f40160ne = false;
                    C6695m9 c6695m92 = this.f40155k4;
                    if (c6695m92 != null) {
                        c6695m92.m26487m9();
                        this.f40155k4 = null;
                    }
                    this.f40162rv = null;
                    C11924bz c11924bzM55947dy = this.f40149du.m55947dy();
                    if (c11924bzM55947dy != null) {
                        for (C11972ts c11972ts : c11924bzM55947dy.m55881k4()) {
                            try {
                                this.f40155k4 = new C6695m9(c11972ts.m56141du(), 1, 6);
                                C11932e0 c11932e0 = new C11932e0(c11972ts, this.f40149du.m55950k4().m66695up());
                                this.f40155k4.m26486kk(!this.f40149du.m55962to());
                                try {
                                    this.f40149du.m55952k4(this.f40155k4);
                                } catch (RuntimeException unused) {
                                }
                                if (this.f40149du.m55956k4(this.f40155k4, c11932e0)) {
                                    try {
                                        if (!c11975um.m56232um()) {
                                            this.f40155k4.m26492x1(c11932e0);
                                            this.f40147c5 = 0;
                                            break;
                                        }
                                        break;
                                    } catch (ObjectDisposedException unused2) {
                                    } catch (C5475yj unused3) {
                                        C6695m9 c6695m93 = this.f40155k4;
                                        this.f40155k4 = null;
                                        if (c6695m93 != null) {
                                            c6695m93.m26487m9();
                                        }
                                    } catch (Exception e) {
                                        C6695m9 c6695m94 = this.f40155k4;
                                        this.f40155k4 = null;
                                        if (c6695m94 != null) {
                                            c6695m94.m26487m9();
                                        }
                                        if (!c11975um.m56232um()) {
                                            this.f40147c5 = 2;
                                        }
                                        this.f40158lr = e;
                                    }
                                } else {
                                    this.f40155k4.m26487m9();
                                    this.f40155k4 = null;
                                    this.f40147c5 = 2;
                                }
                            } catch (Exception e2) {
                                if (!c11975um.m56232um()) {
                                    this.f40147c5 = 2;
                                }
                                this.f40158lr = e2;
                            }
                        }
                        return;
                    }
                    this.f40147c5 = this.f40149du.m55948h4() ? 15 : 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private boolean m55846to(C11975um c11975um) {
        AbstractC3150x6 abstractC3150x6;
        if (this.f40160ne && this.f40152h4 != null) {
            return true;
        }
        try {
            C6690h4 c6690h4 = new C6690h4(this.f40155k4, false);
            if (C14113y2.m67363du(c11975um.m56209k4().m66689ks(), C14062gk.f47211h4)) {
                this.f40146bv = true;
                m55833k4();
                if (!this.f40160ne || (abstractC3150x6 = this.f40152h4) == null || C14067j2.m66727k4(abstractC3150x6).m66761x1(C7019kk.m27443k4((Class<?>) C4546kk.class))) {
                    byte[] bArr = null;
                    if (this.f40149du.m55960m9()) {
                        byte[][] bArr2 = {null};
                        boolean zM55842k4 = m55842k4(c11975um, this.f40149du.m55950k4(), c6690h4, bArr2);
                        byte[] bArr3 = bArr2[0];
                        if (!zM55842k4) {
                            return false;
                        }
                        bArr = bArr3;
                    }
                    this.f40152h4 = new C4546kk(c6690h4, c11975um.m56229to(), c11975um, bArr);
                    this.f40167v4 = false;
                }
            } else {
                this.f40146bv = false;
                this.f40152h4 = c6690h4;
            }
            return true;
        } catch (RuntimeException unused) {
            if (!c11975um.m56232um()) {
                this.f40147c5 = 2;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[PHI: r8 r9
      0x003b: PHI (r8v18 int) = (r8v5 int), (r8v19 int) binds: [B:23:0x0049, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r9v18 com.aspose.slides.internal.wg.zj) = (r9v7 com.aspose.slides.internal.wg.zj), (r9v20 com.aspose.slides.internal.wg.zj) binds: [B:23:0x0049, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m55850k4(C11975um c11975um, InterfaceC14083qm interfaceC14083qm) {
        AbstractC3150x6 abstractC3150x6;
        int iEndRead;
        synchronized (this) {
            if (this.f40156kk.m55975k4() != c11975um) {
                throw new ObjectDisposedException(C7019kk.m27443k4((Class<?>) C6690h4.class).mo48629x6());
            }
            abstractC3150x6 = this.f40152h4;
            if (abstractC3150x6 == null) {
                throw new ObjectDisposedException(C7019kk.m27443k4((Class<?>) C6690h4.class).mo48629x6());
            }
        }
        C11998zj c11998zj = (C11998zj) interfaceC14083qm;
        InterfaceC14083qm interfaceC14083qmM56302up = c11998zj.m56302up();
        boolean z = true;
        if (this.f40157ks && C7019kk.m27469x1(interfaceC14083qmM56302up, C11998zj.class)) {
            c11998zj = (C11998zj) interfaceC14083qmM56302up;
            InterfaceC14083qm interfaceC14083qmM56302up2 = c11998zj.m56302up();
            if (interfaceC14083qmM56302up2 == null || C7019kk.m27469x1(interfaceC14083qmM56302up2, C11998zj.class)) {
                iEndRead = 0;
                z = false;
            } else {
                iEndRead = abstractC3150x6.endRead(interfaceC14083qmM56302up2);
                if (iEndRead != 0) {
                }
            }
        } else if (C7019kk.m27469x1(interfaceC14083qmM56302up, C11998zj.class)) {
            c11998zj = null;
            iEndRead = 0;
            z = false;
        } else {
            iEndRead = abstractC3150x6.endRead(interfaceC14083qmM56302up);
            if (iEndRead != 0) {
                z = false;
            }
        }
        if (this.f40157ks) {
            try {
                int[] iArr = {iEndRead};
                this.f40162rv.m55916k4(c11998zj.m56300ks(), c11998zj.m56301rv(), c11998zj.m56303x6(), iArr);
                iEndRead = iArr[0];
                if (!z && iEndRead == 0 && this.f40162rv.m55920x1()) {
                    iEndRead = m55830k4(c11998zj.m56300ks(), c11998zj.m56301rv(), c11998zj.m56303x6());
                }
                if ((z || iEndRead == 0) && this.f40162rv.m55918to() != 0) {
                    m55834k4(3, (Exception) null, "chunked EndRead");
                    throw new C11997yo("Read error", null, 3, null);
                }
            } catch (Exception e) {
                if (C7019kk.m27469x1(e, C11997yo.class)) {
                    throw e;
                }
                throw new C11997yo("Invalid chunked data.", e, 11, null);
            }
        }
        if (iEndRead != 0) {
            return iEndRead;
        }
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55863x1() {
        synchronized (this) {
            try {
                boolean z = true;
                if (this.f40156kk.m55975k4() != null) {
                    this.f40156kk.m55975k4().m56221kk(true);
                }
                String str = this.f40149du.m55948h4() ? "Proxy-Connection" : HttpHeaders.CONNECTION;
                C11973u1 c11973u1 = this.f40156kk.f40251kk;
                String strM67368h4 = c11973u1 != null ? c11973u1.get_Item(str) : null;
                C14107wz c14107wz = this.f40156kk.f40253to;
                C14107wz c14107wz2 = C11919ar.f40173x1;
                boolean z2 = C14107wz.m67337k4(c14107wz, c14107wz2) && this.f40148ck;
                C14107wz c14107wz3 = this.f40156kk.f40247du;
                if (c14107wz3 != null && C14107wz.m67339x1(c14107wz3, c14107wz2)) {
                    z2 = false;
                }
                if (strM67368h4 != null) {
                    strM67368h4 = C14113y2.m67368h4(strM67368h4);
                    if (!this.f40148ck || C14113y2.m67367h4(strM67368h4, C18190ga.f54965j, (short) 4) == -1) {
                        z = false;
                    }
                    z2 = z;
                }
                C6695m9 c6695m9 = this.f40155k4;
                if ((c6695m9 != null && !c6695m9.m26494x1()) || !z2 || (strM67368h4 != null && C14113y2.m67367h4(strM67368h4, "close", (short) 4) != -1)) {
                    m55856k4(false);
                }
                this.f40150dy.mo55971kk();
                C11975um c11975um = this.f40163u4;
                if (c11975um != null) {
                    m55852k4(c11975um);
                    this.f40163u4 = null;
                } else {
                    m55828dy();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX INFO: renamed from: k4 */
    public int m55851k4(C11975um c11975um, byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        synchronized (this) {
            try {
                if (this.f40156kk.m55975k4() != c11975um) {
                    throw new ObjectDisposedException(C7019kk.m27443k4((Class<?>) C6690h4.class).mo48629x6());
                }
                AbstractC3150x6 abstractC3150x6 = this.f40152h4;
                ?? M55920x1 = 0;
                M55920x1 = 0;
                if (abstractC3150x6 == null) {
                    return 0;
                }
                try {
                    if (this.f40157ks) {
                        i3 = 0;
                        z = false;
                    } else {
                        i3 = abstractC3150x6.read(bArr, i, i2);
                        z = i3 == 0;
                    }
                    try {
                        if (!this.f40157ks) {
                            return i3;
                        }
                        try {
                            int[] iArr = {i3};
                            this.f40162rv.m55916k4(bArr, i, i2, iArr);
                            int iM55830k4 = iArr[0];
                            if (!z && iM55830k4 == 0 && (M55920x1 = this.f40162rv.m55920x1()) != 0) {
                                iM55830k4 = m55830k4(bArr, i, i2);
                            }
                            int i4 = iM55830k4;
                            if ((!z && i4 != 0) || !this.f40162rv.m55920x1()) {
                                return i4;
                            }
                            m55834k4(3, (Exception) null, "chunked Read2");
                            throw new C11997yo("Read error", null, 3, null);
                        } catch (Exception e) {
                            m55834k4(3, e, "chunked Read1");
                            throw e;
                        }
                    } catch (Exception e2) {
                        M55920x1 = i3;
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                m55834k4(3, e, "Read");
                return M55920x1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public void m55860kk(boolean z) {
        this.f40161qq = z;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55864x1(C11975um c11975um) {
        this.f40163u4 = c11975um;
    }

    /* JADX INFO: renamed from: k4 */
    private int m55830k4(byte[] bArr, int i, int i2) {
        byte[] bArr2 = null;
        int iM55914k4 = 0;
        while (iM55914k4 == 0 && this.f40162rv.m55920x1()) {
            int iM55918to = this.f40162rv.m55918to();
            if (iM55918to <= 0) {
                iM55918to = 1024;
            } else if (iM55918to > 16384) {
                iM55918to = 16384;
            }
            if (bArr2 == null || AbstractC14092to.m67208k4((Object) bArr2).m67265du() < iM55918to) {
                bArr2 = new byte[iM55918to];
            }
            int i3 = this.f40152h4.read(bArr2, 0, iM55918to);
            if (i3 <= 0) {
                return 0;
            }
            this.f40162rv.m55919x1(bArr2, 0, i3);
            iM55914k4 += this.f40162rv.m55914k4(bArr, i + iM55914k4, i2 - iM55914k4);
        }
        return iM55914k4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m55847x1(Object obj) {
        int i;
        C11975um c11975um = (C11975um) obj;
        c11975um.f40393k4 = this;
        if (c11975um.m56224lr()) {
            c11975um.f40394kk = this;
        }
        if (c11975um.m56232um()) {
            return;
        }
        this.f40148ck = c11975um.m56207jd();
        this.f40156kk = new C11941he(c11975um);
        do {
            m55844kk(c11975um);
            if (c11975um.m56232um()) {
                return;
            }
            if (this.f40147c5 != 0) {
                if (c11975um.m56232um()) {
                    return;
                }
                c11975um.m56211k4(this.f40147c5, this.f40158lr);
                m55856k4(true);
                return;
            }
            if (m55846to(c11975um)) {
                c11975um.m56217k4(new C11953m2(this, c11975um));
                return;
            } else if (c11975um.m56232um()) {
                return;
            } else {
                i = this.f40147c5;
            }
        } while (this.f40156kk.f40252m9 != null);
        Exception exception = this.f40158lr;
        this.f40158lr = null;
        c11975um.m56211k4(i, exception);
        m55856k4(true);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55865x1(boolean z) {
        this.f40168wl = z;
    }

    /* JADX INFO: renamed from: k4 */
    private C11973u1 m55832k4(AbstractC3150x6 abstractC3150x6, byte[][] bArr, int[] iArr) {
        int iM66582k4;
        C11941he c11941he;
        C14107wz c14107wz;
        bArr[0] = null;
        iArr[0] = 200;
        byte[] bArr2 = new byte[1024];
        C3152yj c3152yj = new C3152yj();
        while (true) {
            int i = abstractC3150x6.read(bArr2, 0, 1024);
            if (i == 0) {
                m55834k4(11, (Exception) null, "ReadHeaders");
                return null;
            }
            c3152yj.write(bArr2, 0, i);
            int[] iArr2 = {0};
            String[] strArr = {null};
            C11973u1 c11973u1 = new C11973u1();
            boolean z = false;
            while (m55843k4(c3152yj.getBuffer(), iArr2, C7019kk.m27462to(Long.valueOf(c3152yj.getLength()), 11), strArr)) {
                String str = strArr[0];
                if (str == null) {
                    try {
                        iM66582k4 = C14057f9.m66582k4(c11973u1.get_Item("Content-Length"));
                    } catch (RuntimeException unused) {
                        iM66582k4 = 0;
                    }
                    if ((c3152yj.getLength() - C7019kk.m27438h4(Integer.valueOf(iArr2[0]), 9)) - C7019kk.m27438h4(Integer.valueOf(iM66582k4), 9) > 0) {
                        bArr[0] = new byte[(int) ((c3152yj.getLength() - C7019kk.m27438h4(Integer.valueOf(iArr2[0]), 9)) - C7019kk.m27438h4(Integer.valueOf(iM66582k4), 9))];
                        byte[] buffer = c3152yj.getBuffer();
                        int i2 = iArr2[0] + iM66582k4;
                        byte[] bArr3 = bArr[0];
                        C14058fa.m66596k4(buffer, i2, bArr3, 0, AbstractC14092to.m67208k4((Object) bArr3).m67265du());
                    } else {
                        m55835k4(abstractC3150x6, iM66582k4 - C7019kk.m27462to(Long.valueOf(c3152yj.getLength() - C7019kk.m27438h4(Integer.valueOf(iArr2[0]), 9)), 11));
                    }
                    return c11973u1;
                }
                if (z) {
                    c11973u1.m56151k4(str);
                } else {
                    String[] strArrM67414k4 = C14113y2.m67414k4(str, ControlChar.SPACE_CHAR);
                    if (AbstractC14092to.m67208k4((Object) strArrM67414k4).m67265du() < 2) {
                        m55834k4(11, (Exception) null, "ReadHeaders2");
                        return null;
                    }
                    if (C14113y2.m67382k4(strArrM67414k4[0], "HTTP/1.1", true) == 0) {
                        c11941he = this.f40156kk;
                        c14107wz = C11919ar.f40173x1;
                    } else if (C14113y2.m67382k4(strArrM67414k4[0], "HTTP/1.0", true) == 0) {
                        c11941he = this.f40156kk;
                        c14107wz = C11919ar.f40172k4;
                    } else {
                        m55834k4(11, (Exception) null, "ReadHeaders2");
                        return null;
                    }
                    c11941he.f40247du = c14107wz;
                    iArr[0] = C7019kk.m27462to(Long.valueOf(C14114y9.m67456k4(strArrM67414k4[1])), 10);
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC14049c6 m55852k4(C11975um c11975um) {
        if (c11975um.m56232um()) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.f40150dy.mo55972x1()) {
                    this.f40147c5 = 0;
                    C5464rv.m22547k4(this.f40154jd, c11975um);
                } else {
                    synchronized (this.f40169x6) {
                        this.f40169x6.enqueue(c11975um);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f40165up;
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm m55853k4(C11975um c11975um, byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        InterfaceC14083qm interfaceC14083qmBeginRead;
        AbstractC14078m9 abstractC14078m92;
        synchronized (this) {
            try {
                if (this.f40156kk.m55975k4() != c11975um) {
                    throw new ObjectDisposedException(C7019kk.m27443k4((Class<?>) C6690h4.class).mo48629x6());
                }
                AbstractC3150x6 abstractC3150x6 = this.f40152h4;
                if (abstractC3150x6 == null) {
                    return null;
                }
                if (!this.f40157ks || (!this.f40162rv.m55917kk() && this.f40162rv.m55920x1())) {
                    try {
                        interfaceC14083qmBeginRead = abstractC3150x6.beginRead(bArr, i, i2, abstractC14078m9, obj);
                        abstractC14078m92 = null;
                    } catch (Exception e) {
                        m55834k4(3, (Exception) null, "chunked BeginRead");
                        throw e;
                    }
                } else {
                    abstractC14078m92 = abstractC14078m9;
                    interfaceC14083qmBeginRead = null;
                }
                if (!this.f40157ks) {
                    return interfaceC14083qmBeginRead;
                }
                C11998zj c11998zj = new C11998zj(abstractC14078m92, obj, bArr, i, i2);
                c11998zj.m56296k4(interfaceC14083qmBeginRead);
                if (interfaceC14083qmBeginRead == null) {
                    c11998zj.m56123k4(true, (Exception) null);
                    c11998zj.m56292ck();
                }
                return c11998zj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55833k4() {
        synchronized (f40143to) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55834k4(int i, Exception e, String str) {
        this.f40147c5 = i;
        synchronized (this) {
            if (i == 6) {
                try {
                    this.f40156kk = new C11941he();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (e == null) {
            try {
                throw new Exception();
            } catch (Exception e2) {
                e = e2;
            }
        }
        C11941he c11941he = this.f40156kk;
        C11975um c11975umM55975k4 = (c11941he == null || c11941he.m55975k4() == null) ? null : this.f40156kk.m55975k4();
        m55856k4(true);
        if (c11975umM55975k4 != null) {
            c11975umM55975k4.m56221kk(true);
            c11975umM55975k4.m56212k4(i, e, str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55854k4(AbstractC3150x6 abstractC3150x6) {
        C4566up c4566up = (C4566up) abstractC3150x6;
        C3817h4 c3817h4M18859kk = c4566up.m18859kk();
        C3817h4 c3817h4M18715m9 = c4566up.m18715m9();
        this.f40149du.m55951k4(c3817h4M18859kk, c3817h4M18715m9);
        this.f40167v4 = c3817h4M18715m9 != null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m55835k4(AbstractC3150x6 abstractC3150x6, int i) {
        while (i > 0) {
            int i2 = abstractC3150x6.read(new byte[i], 0, i);
            if (i2 <= 0) {
                return;
            } else {
                i -= i2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55855k4(C11950kp c11950kp) {
        this.f40166uz = c11950kp;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55838k4(InterfaceC14083qm interfaceC14083qm) {
        int iM55829k4;
        C11917ai c11917ai = (C11917ai) interfaceC14083qm.mo18725k4();
        C11941he c11941he = c11917ai.f40156kk;
        AbstractC3150x6 abstractC3150x6 = c11917ai.f40152h4;
        if (abstractC3150x6 == null) {
            c11917ai.m55856k4(true);
            return;
        }
        try {
            int iEndRead = abstractC3150x6.endRead(interfaceC14083qm);
            if (iEndRead == 0) {
                c11917ai.m55834k4(3, (Exception) null, "ReadDone2");
                return;
            }
            if (iEndRead < 0) {
                c11917ai.m55834k4(11, (Exception) null, "ReadDone3");
                return;
            }
            int i = iEndRead + c11917ai.f40153ix;
            if (c11941he.m55978x1() == 0) {
                try {
                    iM55829k4 = m55829k4(c11941he, c11917ai.f40149du, c11917ai.f40151fa, i);
                    e = null;
                } catch (Exception e) {
                    e = e;
                    iM55829k4 = -1;
                }
                if (e != null || iM55829k4 == -1) {
                    c11917ai.m55834k4(11, e, "ReadDone4");
                    return;
                }
            } else {
                iM55829k4 = -1;
            }
            if (c11941he.m55978x1() == 4) {
                c11917ai.m55834k4(6, (Exception) null, "ReadDone");
                return;
            }
            if (c11941he.m55978x1() != 3) {
                int iM67265du = i * 2;
                if (iM67265du < AbstractC14092to.m67208k4((Object) c11917ai.f40151fa).m67265du()) {
                    iM67265du = AbstractC14092to.m67208k4((Object) c11917ai.f40151fa).m67265du();
                }
                byte[] bArr = new byte[iM67265du];
                C14058fa.m66596k4(c11917ai.f40151fa, 0, bArr, 0, i);
                c11917ai.f40151fa = bArr;
                c11917ai.f40153ix = i;
                c11941he.m55976k4(0);
                m55839k4((Object) c11917ai);
                return;
            }
            c11917ai.f40153ix = 0;
            C11953m2 c11953m2 = new C11953m2(c11917ai, c11941he);
            boolean zM55841k4 = m55841k4(c11941he.f40250k4, c11941he.m55975k4().mo56204fa());
            String str = zM55841k4 ? c11941he.f40251kk.get_Item(HttpHeaders.TRANSFER_ENCODING) : null;
            boolean z = (str == null || C14113y2.m67367h4(str, "chunked", (short) 5) == -1) ? false : true;
            c11917ai.f40157ks = z;
            if (z) {
                C11930du c11930du = c11917ai.f40162rv;
                if (c11930du == null) {
                    try {
                        c11917ai.f40162rv = new C11930du(c11917ai.f40151fa, iM55829k4, i, c11941he.f40251kk);
                    } catch (Exception e2) {
                        c11917ai.m55834k4(11, e2, "ReadDone5");
                        return;
                    }
                } else {
                    c11930du.m55915k4();
                    try {
                        c11917ai.f40162rv.m55919x1(c11917ai.f40151fa, iM55829k4, i);
                    } catch (Exception e3) {
                        c11917ai.m55834k4(11, e3, "ReadDone6");
                        return;
                    }
                }
            } else {
                c11953m2.m56041k4(c11917ai.f40151fa);
                c11953m2.m56038k4(iM55829k4);
                c11953m2.m56047x1(i);
                try {
                    c11953m2.m56037k4();
                } catch (Exception e4) {
                    c11917ai.m55834k4(3, e4, "ReadDone7");
                }
            }
            c11941he.f40249h4 = c11953m2;
            if (!zM55841k4) {
                c11953m2.m56035h4();
            }
            c11941he.m55975k4().m56216k4(c11941he);
        } catch (ObjectDisposedException unused) {
        } catch (Exception e5) {
            if (C7019kk.m27469x1(e5.getInnerException(), ObjectDisposedException.class)) {
                return;
            }
            c11917ai.m55834k4(3, e5, "ReadDone1");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55839k4(Object obj) {
        C11917ai c11917ai = (C11917ai) obj;
        AbstractC3150x6 abstractC3150x6 = c11917ai.f40152h4;
        try {
            int iM67265du = AbstractC14092to.m67208k4((Object) c11917ai.f40151fa).m67265du();
            int i = c11917ai.f40153ix;
            abstractC3150x6.beginRead(c11917ai.f40151fa, i, iM67265du - i, f40144x1, c11917ai);
        } catch (Exception e) {
            c11917ai.m55834k4(3, e, "InitRead");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m55840k4(Object obj, C14111xk c14111xk) {
        synchronized (this) {
            synchronized (this.f40169x6) {
                try {
                    C11975um c11975um = (C11975um) obj;
                    if (this.f40156kk.m55975k4() != c11975um && this.f40156kk.m55975k4() != null) {
                        c11975um.m56221kk(true);
                        c11975um.m56212k4(6, (Exception) null, "User aborted");
                        if (this.f40169x6.size() > 0 && this.f40169x6.peek() == obj) {
                            this.f40169x6.dequeue();
                        } else if (this.f40169x6.size() > 0) {
                            Object[] array = this.f40169x6.toArray(new Object[0]);
                            this.f40169x6.clear();
                            for (int iM67265du = AbstractC14092to.m67208k4((Object) array).m67265du() - 1; iM67265du >= 0; iM67265du--) {
                                Object obj2 = array[iM67265du];
                                if (obj2 != obj) {
                                    this.f40169x6.enqueue(obj2);
                                }
                            }
                        }
                    } else if (!c11975um.m56198ar()) {
                        this.f40147c5 = 6;
                        m55856k4(false);
                        if (this.f40169x6.size() > 0) {
                            this.f40156kk.m55977k4((C11975um) this.f40169x6.dequeue());
                            m55852k4(this.f40156kk.m55975k4());
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55856k4(boolean z) {
        synchronized (this) {
            try {
                C11941he c11941he = this.f40156kk;
                if (c11941he != null && c11941he.m55975k4() != null && this.f40156kk.m55975k4().m56224lr()) {
                    this.f40156kk.m55975k4().m56230to(false);
                    return;
                }
                AbstractC3150x6 abstractC3150x6 = this.f40152h4;
                if (abstractC3150x6 != null) {
                    try {
                        abstractC3150x6.close();
                    } catch (RuntimeException unused) {
                    }
                    this.f40152h4 = null;
                }
                C6695m9 c6695m9 = this.f40155k4;
                if (c6695m9 != null) {
                    try {
                        c6695m9.m26487m9();
                    } catch (RuntimeException unused2) {
                    }
                    this.f40155k4 = null;
                }
                if (this.f40168wl) {
                    m55859kk();
                }
                C11941he c11941he2 = this.f40156kk;
                if (c11941he2 != null) {
                    synchronized (c11941he2) {
                        this.f40156kk.m55976k4(4);
                    }
                }
                this.f40150dy.mo55971kk();
                this.f40156kk = new C11941he();
                if (z) {
                    m55828dy();
                }
                this.f40164um = null;
                this.f40145ar = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m55841k4(int i, String str) {
        return ("HEAD".equals(str) || i < 200 || i == 204 || i == 304) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m55842k4(C11975um c11975um, C14062gk c14062gk, AbstractC3150x6 abstractC3150x6, byte[][] bArr) {
        boolean zEquals;
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("CONNECT ");
        c6765kpOooO00o.m26792k4(c11975um.m56209k4().m66678du());
        c6765kpOooO00o.m26780k4(':');
        c6765kpOooO00o.m26805kk(c11975um.m56209k4().m66695up());
        c6765kpOooO00o.m26792k4(" HTTP/");
        c6765kpOooO00o.m26792k4(C14107wz.m67337k4(c11975um.m56228rv().m55958kk(), C11919ar.f40173x1) ? "1.1" : "1.0");
        c6765kpOooO00o.m26792k4("\r\nHost: ");
        c6765kpOooO00o.m26792k4(c11975um.m56209k4().m66688kk());
        C11941he c11941he = this.f40156kk;
        String[] strArr = c11941he.f40252m9;
        c11941he.f40252m9 = null;
        String str = c11975um.mo56203dy().get_Item(HttpHeaders.PROXY_AUTHORIZATION);
        boolean z = str != null;
        if (z) {
            c6765kpOooO00o.m26792k4("\r\nProxy-Authorization: ");
            c6765kpOooO00o.m26792k4(str);
            zEquals = C14113y2.m67359c5(C14113y2.m67358c5(str), "NTLM");
        } else if (strArr == null || this.f40156kk.f40250k4 != 407) {
            zEquals = false;
        } else {
            InterfaceC11926c6 interfaceC11926c6Mo56111k4 = c11975um.mo56233up().mo56111k4();
            if (this.f40164um == null) {
                C11975um c11975um2 = (C11975um) AbstractC11994yg.m56286x1(C14113y2.m67408k4(c14062gk.m66689ks(), "://", c14062gk.m66678du(), C18241k5.f55433h, C14057f9.m66591x1(c14062gk.m66695up()), "/"));
                this.f40164um = c11975um2;
                c11975um2.mo56219k4("CONNECT");
                this.f40164um.mo56215k4(interfaceC11926c6Mo56111k4);
            }
            for (int i = 0; i < AbstractC14092to.m67208k4((Object) strArr).m67265du(); i++) {
                C11986x1 c11986x1M55996k4 = C11948k4.m55996k4(strArr[i], this.f40164um, interfaceC11926c6Mo56111k4);
                if (c11986x1M55996k4 != null) {
                    zEquals = "NTLM".equals(c11986x1M55996k4.m56269kk().mo15101k4());
                    c6765kpOooO00o.m26792k4("\r\nProxy-Authorization: ");
                    c6765kpOooO00o.m26792k4(c11986x1M55996k4.m56267k4());
                    z = true;
                    break;
                }
            }
            z = true;
            zEquals = false;
        }
        if (zEquals) {
            c6765kpOooO00o.m26792k4("\r\nProxy-Connection: keep-alive");
            this.f40145ar++;
        }
        c6765kpOooO00o.m26792k4(KtorKt.SSE_SEPARATOR);
        this.f40156kk.f40250k4 = 0;
        byte[] bArrMo26677to = AbstractC6747ar.m26634h4().mo26677to(c6765kpOooO00o.toString());
        abstractC3150x6.write(bArrMo26677to, 0, AbstractC14092to.m67208k4((Object) bArrMo26677to).m67265du());
        int[] iArr = {0};
        C11973u1 c11973u1M55832k4 = m55832k4(abstractC3150x6, bArr, iArr);
        int i2 = iArr[0];
        if ((z && this.f40145ar != 1) || c11973u1M55832k4 == null || i2 != 407) {
            if (i2 == 200) {
                return c11973u1M55832k4 != null;
            }
            m55834k4(10, (Exception) null, C14113y2.m67402k4("The remote server returned a {0} status code.", C7019kk.m27466x1(i2)));
            return false;
        }
        String str2 = c11973u1M55832k4.get_Item(HttpHeaders.CONNECTION);
        if (this.f40155k4 != null && !C14113y2.m67411k4(str2) && "close".equals(C14113y2.m67368h4(str2))) {
            this.f40155k4.m26487m9();
            this.f40155k4 = null;
        }
        C11941he c11941he2 = this.f40156kk;
        c11941he2.f40250k4 = i2;
        c11941he2.f40252m9 = c11973u1M55832k4.m56152k4(HttpHeaders.PROXY_AUTHENTICATE, false);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55857k4(C11975um c11975um, boolean z, InterfaceC14083qm interfaceC14083qm) {
        AbstractC3150x6 abstractC3150x6;
        if (c11975um.m56198ar()) {
            return true;
        }
        synchronized (this) {
            if (this.f40156kk.m55975k4() != c11975um) {
                throw new ObjectDisposedException(C7019kk.m27443k4((Class<?>) C6690h4.class).mo48629x6());
            }
            abstractC3150x6 = this.f40152h4;
            if (abstractC3150x6 == null) {
                throw new ObjectDisposedException(C7019kk.m27443k4((Class<?>) C6690h4.class).mo48629x6());
            }
        }
        try {
            abstractC3150x6.endWrite(interfaceC14083qm);
            return true;
        } catch (Exception e) {
            this.f40147c5 = 4;
            if (!z || e.getInnerException() == null) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55858k4(C11975um c11975um, byte[] bArr, int i, int i2, String[] strArr) {
        strArr[0] = null;
        synchronized (this) {
            try {
                if (this.f40156kk.m55975k4() != c11975um) {
                    throw new ObjectDisposedException(C7019kk.m27443k4((Class<?>) C6690h4.class).mo48629x6());
                }
                AbstractC3150x6 abstractC3150x6 = this.f40152h4;
                if (abstractC3150x6 == null) {
                    return false;
                }
                try {
                    abstractC3150x6.write(bArr, i, i2);
                    if (!this.f40146bv || this.f40167v4) {
                        return true;
                    }
                    m55854k4(abstractC3150x6);
                    return true;
                } catch (Exception e) {
                    String message = e.getMessage();
                    strArr[0] = message;
                    String strM67408k4 = C14113y2.m67408k4("Write: ", message);
                    int i3 = 4;
                    if (C7019kk.m27469x1(e, C11997yo.class)) {
                        m55834k4(4, e, strM67408k4);
                        return false;
                    }
                    if (this.f40146bv && ((C4546kk) abstractC3150x6).m18762k4()) {
                        strM67408k4 = "Trust failure";
                        i3 = 9;
                    }
                    m55834k4(i3, e, strM67408k4);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m55843k4(byte[] bArr, int[] iArr, int i, String[] strArr) {
        C6765kp c6765kp = new C6765kp();
        boolean z = false;
        int iM27462to = 0;
        while (true) {
            int i2 = iArr[0];
            if (i2 >= i) {
                break;
            }
            iArr[0] = i2 + 1;
            iM27462to = C7019kk.m27462to(Byte.valueOf(bArr[i2]), 6);
            if (iM27462to == 10) {
                if (c6765kp.m26807x1() > 0 && c6765kp.m26806x1(c6765kp.m26807x1() - 1) == '\r') {
                    c6765kp.m26801k4(c6765kp.m26807x1() - 1);
                }
                z = false;
            } else {
                if (z) {
                    c6765kp.m26801k4(c6765kp.m26807x1() - 1);
                    break;
                }
                if (iM27462to == 13) {
                    z = true;
                }
                c6765kp.m26780k4(C7019kk.m27434ck(Integer.valueOf(iM27462to), 9));
            }
        }
        if (iM27462to != 10 && iM27462to != 13) {
            return false;
        }
        if (c6765kp.m26807x1() == 0) {
            strArr[0] = null;
            return iM27462to == 10 || iM27462to == 13;
        }
        if (z) {
            c6765kp.m26801k4(c6765kp.m26807x1() - 1);
        }
        strArr[0] = c6765kp.toString();
        return true;
    }
}

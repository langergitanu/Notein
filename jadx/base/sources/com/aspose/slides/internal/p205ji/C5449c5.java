package com.aspose.slides.internal.p205ji;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.SecurityException;
import com.aspose.slides.internal.p053c1.AbstractC1939k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14100v4;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Locale;

/* JADX INFO: renamed from: com.aspose.slides.internal.ji.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class C5449c5 extends AbstractC1939k4 {

    /* JADX INFO: renamed from: ck */
    private static int f15005ck;

    /* JADX INFO: renamed from: fa */
    private static final ThreadLocal<C5449c5> f15006fa = new ThreadLocal<>();

    /* JADX INFO: renamed from: up */
    private static final ThreadLocal<Object> f15007up = new ThreadLocal<>();

    /* JADX INFO: renamed from: h4 */
    private String f15011h4;

    /* JADX INFO: renamed from: k4 */
    private Thread f15013k4;

    /* JADX INFO: renamed from: kk */
    private C11697x1 f15014kk;

    /* JADX INFO: renamed from: x1 */
    private C11697x1 f15017x1;

    /* JADX INFO: renamed from: yj */
    private AbstractC14085qw f15018yj;

    /* JADX INFO: renamed from: to */
    private int f15016to = 2;

    /* JADX INFO: renamed from: du */
    private boolean f15009du = false;

    /* JADX INFO: renamed from: m9 */
    private int f15015m9 = 8;

    /* JADX INFO: renamed from: dy */
    private final Object f15010dy = new Object();

    /* JADX INFO: renamed from: c5 */
    private Object f15008c5 = null;

    /* JADX INFO: renamed from: jd */
    private boolean f15012jd = false;

    public C5449c5(AbstractC5454h4 abstractC5454h4) {
        if (abstractC5454h4 == null) {
            throw new ArgumentNullException("start");
        }
        C5450ck c5450ck = new C5450ck(this, abstractC5454h4);
        this.f15018yj = c5450ck;
        this.f15013k4 = m22525k4((AbstractC5454h4) c5450ck);
    }

    /* JADX INFO: renamed from: ck */
    private String m22521ck() {
        synchronized (this.f15010dy) {
            f15005ck++;
        }
        return C14113y2.m67402k4("{0}_{1}", m22522jd(), Integer.valueOf(f15005ck));
    }

    /* JADX INFO: renamed from: jd */
    private ThreadGroup m22522jd() {
        return Thread.currentThread().getThreadGroup();
    }

    /* JADX INFO: renamed from: k4 */
    public static C5449c5 m22523k4() {
        ThreadLocal<C5449c5> threadLocal = f15006fa;
        C5449c5 c5449c5 = threadLocal.get();
        if (c5449c5 != null) {
            return c5449c5;
        }
        C5449c5 c5449c52 = new C5449c5(Thread.currentThread());
        threadLocal.set(c5449c52);
        return c5449c52;
    }

    /* JADX INFO: renamed from: c5 */
    public int m22528c5() {
        if (this.f15013k4.isAlive() || (!this.f15013k4.isInterrupted() && (this.f15015m9 & 8) == 8)) {
            return this.f15015m9;
        }
        return 16;
    }

    /* JADX INFO: renamed from: du */
    public void m22529du() {
        try {
            if (this.f15012jd) {
                throw new C5471wl("Thread was aborted");
            }
            if (this.f15013k4.isAlive()) {
                throw new C5471wl();
            }
            this.f15013k4.checkAccess();
            this.f15013k4.start();
            this.f15015m9 = 0;
        } catch (IllegalThreadStateException e) {
            throw new C5471wl(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: dy */
    public long m22530dy() {
        return this.f15013k4.getId();
    }

    @Override // com.aspose.slides.internal.p053c1.AbstractC1939k4
    public void finalize() throws Throwable {
        super.finalize();
    }

    /* JADX INFO: renamed from: h4 */
    public C11697x1 m22531h4() {
        C11697x1 c11697x1 = this.f15017x1;
        if (c11697x1 == null || !C14067j2.m66728k4(C11697x1.m55246k4(c11697x1), C14100v4.m67325k4())) {
            this.f15017x1 = C11697x1.m55245k4(C14100v4.m67325k4());
        }
        return this.f15017x1;
    }

    /* JADX INFO: renamed from: kk */
    public void m22536kk() {
        try {
            this.f15015m9 = 16;
            this.f15013k4.interrupt();
        } catch (SecurityException e) {
            throw new SecurityException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: m9 */
    public C11697x1 m22537m9() {
        if (this.f15014kk == null) {
            this.f15014kk = C11697x1.m55252to();
        }
        return this.f15014kk;
    }

    /* JADX INFO: renamed from: to */
    public void m22538to() {
        try {
            this.f15015m9 |= 32;
            this.f15013k4.join();
        } catch (InterruptedException unused) {
            throw new C5459ks();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m22539x1() {
        try {
            this.f15015m9 |= 128;
            this.f15013k4.checkAccess();
            if (!this.f15013k4.isAlive()) {
                this.f15012jd = true;
            } else {
                if ((this.f15015m9 & 64) == 64) {
                    throw new C5471wl();
                }
                this.f15013k4.stop();
                this.f15015m9 = 256;
                throw new C5475yj();
            }
        } catch (SecurityException e) {
            throw new SecurityException(e.getMessage());
        }
    }

    public C5449c5(AbstractC5466u4 abstractC5466u4) {
        if (abstractC5466u4 == null) {
            throw new ArgumentNullException("Null ThreadStart");
        }
        C5456jd c5456jd = new C5456jd(this, abstractC5466u4);
        this.f15018yj = c5456jd;
        this.f15013k4 = m22526k4((AbstractC5466u4) c5456jd);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m22527x1(int i) {
        if (i < -1) {
            throw new ArgumentOutOfRangeException("timeout");
        }
        try {
            m22523k4().f15015m9 |= 32;
            if (i == -1) {
                Thread.sleep(LocationRequestCompat.PASSIVE_INTERVAL);
            } else {
                Thread.sleep(i);
            }
            m22523k4().f15015m9 ^= 32;
        } catch (InterruptedException e) {
            throw new C5459ks(e.getMessage());
        } catch (SecurityException e2) {
            throw new SecurityException(e2.getMessage());
        }
    }

    private C5449c5(Thread thread) {
        this.f15013k4 = thread;
        this.f15011h4 = thread.getName();
    }

    /* JADX INFO: renamed from: k4 */
    private Thread m22525k4(AbstractC5454h4 abstractC5454h4) {
        return new Thread(m22522jd(), new RunnableC5468up(this, abstractC5454h4), m22521ck());
    }

    /* JADX INFO: renamed from: k4 */
    private Thread m22526k4(AbstractC5466u4 abstractC5466u4) {
        return new Thread(m22522jd(), new RunnableC5453fa(this, abstractC5466u4), m22521ck());
    }

    /* JADX INFO: renamed from: k4 */
    public void m22532k4(C11697x1 c11697x1) {
        if (c11697x1 == null) {
            throw new ArgumentNullException("value");
        }
        if (c11697x1.m55264h4()) {
            throw new NotSupportedException("Neutral cultures cannot be used in formatting and parsing and therefore cannot be set as the thread's current culture");
        }
        this.f15017x1 = c11697x1;
        Locale.setDefault(C11697x1.m55246k4(c11697x1));
    }

    /* JADX INFO: renamed from: k4 */
    public void m22533k4(Object obj) {
        if (this.f15018yj instanceof AbstractC5466u4) {
            throw new InvalidOperationException("The thread was created with a ThreadStart delegate that does not accept a parameter.");
        }
        this.f15008c5 = obj;
        try {
            if (this.f15012jd) {
                return;
            }
            if (this.f15013k4.isAlive()) {
                throw new C5471wl();
            }
            this.f15013k4.checkAccess();
            this.f15013k4.start();
            this.f15015m9 = 0;
        } catch (IllegalThreadStateException e) {
            throw new C5471wl(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m22534k4(String str) {
        if (this.f15009du) {
            throw new InvalidOperationException("This property has already been set and cannot be modified.");
        }
        if (str != null) {
            this.f15013k4.setName(str);
        }
        this.f15011h4 = str;
        this.f15009du = true;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m22535k4(int i) {
        if (i < -1) {
            throw new ArgumentOutOfRangeException("timeout");
        }
        if (i == -1) {
            i = 0;
        } else if (i == 0) {
            i = 1;
        }
        try {
            this.f15015m9 |= 32;
            this.f15013k4.join(i);
            return !this.f15013k4.isAlive();
        } catch (InterruptedException unused) {
            throw new C5459ks();
        }
    }
}

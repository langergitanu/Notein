package com.aspose.slides.internal.p205ji;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.aspose.slides.internal.ji.v4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5470v4 implements IDisposable {

    /* JADX INFO: renamed from: du */
    protected static final C14112xw f15045du = new C14112xw(-1);

    /* JADX INFO: renamed from: k4 */
    private CountDownLatch f15047k4;

    /* JADX INFO: renamed from: x1 */
    protected final Object f15050x1 = new Object();

    /* JADX INFO: renamed from: kk */
    protected boolean f15048kk = false;

    /* JADX INFO: renamed from: to */
    protected int f15049to = 0;

    /* JADX INFO: renamed from: h4 */
    private boolean f15046h4 = false;

    public AbstractC5470v4() {
        this.f15047k4 = null;
        this.f15047k4 = new CountDownLatch(1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m22557k4() {
        synchronized (this.f15050x1) {
            try {
                if (this.f15049to == 0 && this.f15048kk) {
                    this.f15048kk = false;
                    m22559k4(new CountDownLatch(1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f15046h4 = true;
    }

    /* JADX INFO: renamed from: du */
    public boolean m22558du() {
        return m22560k4(-1, false);
    }

    /* JADX INFO: renamed from: kk */
    public CountDownLatch m22561kk() {
        return this.f15047k4;
    }

    /* JADX INFO: renamed from: to */
    public void m22562to() {
        dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public void m22559k4(CountDownLatch countDownLatch) {
        this.f15047k4 = countDownLatch;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m22560k4(int i, boolean z) {
        if (i < -1) {
            throw new ArgumentOutOfRangeException("timeout");
        }
        synchronized (this.f15050x1) {
            if (this.f15048kk) {
                m22557k4();
            } else {
                try {
                    if (i != -1) {
                        this.f15050x1.wait(i == 0 ? 1L : i);
                        boolean z2 = this.f15048kk;
                        m22557k4();
                        return z2;
                    }
                    this.f15050x1.wait();
                    m22557k4();
                } catch (InterruptedException e) {
                    throw new C5459ks(e.getMessage());
                }
            }
            return true;
        }
    }
}

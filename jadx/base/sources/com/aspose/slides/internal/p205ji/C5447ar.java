package com.aspose.slides.internal.p205ji;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.aspose.slides.internal.ji.ar */
/* JADX INFO: loaded from: classes.dex */
public final class C5447ar implements IDisposable {

    /* JADX INFO: renamed from: du */
    private boolean f14997du;

    /* JADX INFO: renamed from: k4 */
    private Timer f14998k4;

    /* JADX INFO: renamed from: kk */
    private long f14999kk;

    /* JADX INFO: renamed from: to */
    private long f15000to;

    /* JADX INFO: renamed from: x1 */
    private k4 f15001x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ji.ar$k4 */
    public class k4 extends TimerTask {

        /* JADX INFO: renamed from: kk */
        private AbstractC5467um f15003kk;

        /* JADX INFO: renamed from: x1 */
        private Object f15004x1;

        public k4(AbstractC5467um abstractC5467um, Object obj) {
            this.f15003kk = abstractC5467um;
            this.f15004x1 = obj;
        }

        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 clone() {
            return C5447ar.this.new k4(this.f15003kk, this.f15004x1);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f15003kk.mo22556k4(this.f15004x1);
        }
    }

    public C5447ar(AbstractC5467um abstractC5467um, Object obj, int i, int i2) {
        int i3 = C5463qq.f15028k4;
        this.f14999kk = i3;
        this.f15000to = i3;
        this.f14997du = false;
        m22516k4(abstractC5467um, obj, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m22516k4(AbstractC5467um abstractC5467um, Object obj, long j, long j2) {
        if (abstractC5467um == null) {
            throw new ArgumentNullException("callback");
        }
        int i = C5463qq.f15028k4;
        if (j < i) {
            throw new ArgumentOutOfRangeException("dueTime");
        }
        if (j2 < i) {
            throw new ArgumentOutOfRangeException("period");
        }
        this.f14999kk = j;
        this.f15000to = j2;
        this.f14998k4 = new Timer(true);
        k4 k4Var = new k4(abstractC5467um, obj);
        this.f15001x1 = k4Var;
        long j3 = this.f14999kk;
        int i2 = C5463qq.f15028k4;
        if (j3 != i2) {
            long j4 = this.f15000to;
            if (j4 == i2 || j4 == 0) {
                this.f14998k4.schedule(k4Var, j3);
            } else {
                this.f14998k4.schedule(k4Var, j3, j4);
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        if (this.f14997du) {
            return;
        }
        this.f14997du = true;
        this.f14998k4.cancel();
        this.f15001x1 = null;
        this.f14998k4 = null;
        int i = C5463qq.f15028k4;
        this.f14999kk = i;
        this.f15000to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m22518k4(int i, int i2) {
        return m22517k4(i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m22517k4(long j, long j2) {
        if (j > 4294967294L) {
            throw new ArgumentOutOfRangeException("dueTime", "Due time too large");
        }
        if (j2 > 4294967294L) {
            throw new ArgumentOutOfRangeException("period", "Period too large");
        }
        int i = C5463qq.f15028k4;
        if (j < i) {
            throw new ArgumentOutOfRangeException("dueTime");
        }
        if (j2 < i) {
            throw new ArgumentOutOfRangeException("period");
        }
        if (this.f14997du) {
            return false;
        }
        this.f14999kk = j;
        this.f15000to = j2;
        this.f14998k4.cancel();
        this.f15001x1.cancel();
        Timer timer = new Timer(true);
        this.f14998k4 = timer;
        long j3 = this.f14999kk;
        int i2 = C5463qq.f15028k4;
        if (j3 != i2) {
            long j4 = this.f15000to;
            if (j4 == i2 || j4 == 0) {
                timer.schedule(this.f15001x1.clone(), this.f14999kk);
            } else {
                timer.schedule(this.f15001x1.clone(), this.f14999kk, this.f15000to);
            }
        }
        return true;
    }
}

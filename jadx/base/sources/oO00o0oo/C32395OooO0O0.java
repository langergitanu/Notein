package oO00o0oo;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import oO00o.AbstractC32318OooO0o;
import oO00oO0.EnumC32398OooO0OO;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oO00o0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32395OooO0O0 extends AbstractC32318OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Handler f116493OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f116494OooO0O0 = true;

    /* JADX INFO: renamed from: oO00o0oo.OooO0O0$OooO00o */
    public static final class OooO00o extends AbstractC32318OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final boolean f116495OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f116496OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile boolean f116497OooOoO0;

        public OooO00o(Handler handler, boolean z) {
            this.f116496OooOo0o = handler;
            this.f116495OooOo = z;
        }

        @Override // oO00o.AbstractC32318OooO0o.OooO0O0
        public final InterfaceC32925OooO0O0 OooO00o(Runnable runnable, long j, TimeUnit timeUnit) {
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            boolean z = this.f116497OooOoO0;
            EnumC32398OooO0OO enumC32398OooO0OO = EnumC32398OooO0OO.f116503OooOo0o;
            if (z) {
                return enumC32398OooO0OO;
            }
            Handler handler = this.f116496OooOo0o;
            RunnableC20226OooO0O0 runnableC20226OooO0O0 = new RunnableC20226OooO0O0(handler, runnable);
            Message messageObtain = Message.obtain(handler, runnableC20226OooO0O0);
            messageObtain.obj = this;
            if (this.f116495OooOo) {
                messageObtain.setAsynchronous(true);
            }
            this.f116496OooOo0o.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.f116497OooOoO0) {
                return runnableC20226OooO0O0;
            }
            this.f116496OooOo0o.removeCallbacks(runnableC20226OooO0O0);
            return enumC32398OooO0OO;
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            this.f116497OooOoO0 = true;
            this.f116496OooOo0o.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: oO00o0oo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class RunnableC20226OooO0O0 implements Runnable, InterfaceC32925OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Runnable f116498OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f116499OooOo0o;

        public RunnableC20226OooO0O0(Handler handler, Runnable runnable) {
            this.f116499OooOo0o = handler;
            this.f116498OooOo = runnable;
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            this.f116499OooOo0o.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f116498OooOo.run();
            } catch (Throwable th) {
                C32430OooO00o.OooO00o(th);
            }
        }
    }

    public C32395OooO0O0(Handler handler) {
        this.f116493OooO00o = handler;
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final AbstractC32318OooO0o.OooO0O0 OooO00o() {
        return new OooO00o(this.f116493OooO00o, this.f116494OooO0O0);
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final InterfaceC32925OooO0O0 OooO0OO(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f116493OooO00o;
        RunnableC20226OooO0O0 runnableC20226OooO0O0 = new RunnableC20226OooO0O0(handler, runnable);
        Message messageObtain = Message.obtain(handler, runnableC20226OooO0O0);
        if (this.f116494OooO0O0) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return runnableC20226OooO0O0;
    }
}

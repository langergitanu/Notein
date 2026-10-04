package oO0OoOo0;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import oO0OooOO.AbstractC33500OooOOOo;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO0OoOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33289OooO0O0 extends AbstractC33500OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Handler f120510OooO00o;

    /* JADX INFO: renamed from: oO0OoOo0.OooO0O0$OooO00o */
    public static final class OooO00o extends AbstractC33500OooOOOo.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public volatile boolean f120511OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f120512OooOo0o;

        public OooO00o(Handler handler) {
            this.f120512OooOo0o = handler;
        }

        @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
        public final oO0OOO00.OooO0O0 OooO00o(Runnable runnable, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit2 == null) {
                throw new NullPointerException("unit == null");
            }
            boolean z = this.f120511OooOo;
            EnumC35110OooO0OO enumC35110OooO0OO = EnumC35110OooO0OO.f126094OooOo0o;
            if (z) {
                return enumC35110OooO0OO;
            }
            Handler handler = this.f120512OooOo0o;
            RunnableC20312OooO0O0 runnableC20312OooO0O0 = new RunnableC20312OooO0O0(handler, runnable);
            Message messageObtain = Message.obtain(handler, runnableC20312OooO0O0);
            messageObtain.obj = this;
            this.f120512OooOo0o.sendMessageDelayed(messageObtain, timeUnit2.toMillis(0L));
            if (!this.f120511OooOo) {
                return runnableC20312OooO0O0;
            }
            this.f120512OooOo0o.removeCallbacks(runnableC20312OooO0O0);
            return enumC35110OooO0OO;
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f120511OooOo = true;
            this.f120512OooOo0o.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: oO0OoOo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class RunnableC20312OooO0O0 implements Runnable, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Runnable f120513OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f120514OooOo0o;

        public RunnableC20312OooO0O0(Handler handler, Runnable runnable) {
            this.f120514OooOo0o = handler;
            this.f120513OooOo = runnable;
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f120514OooOo0o.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f120513OooOo.run();
            } catch (Throwable th) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            }
        }
    }

    public C33289OooO0O0(Handler handler) {
        this.f120510OooO00o = handler;
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final AbstractC33500OooOOOo.OooO0O0 OooO00o() {
        return new OooO00o(this.f120510OooO00o);
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final oO0OOO00.OooO0O0 OooO0OO(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f120510OooO00o;
        RunnableC20312OooO0O0 runnableC20312OooO0O0 = new RunnableC20312OooO0O0(handler, runnable);
        handler.postDelayed(runnableC20312OooO0O0, timeUnit.toMillis(0L));
        return runnableC20312OooO0O0;
    }
}

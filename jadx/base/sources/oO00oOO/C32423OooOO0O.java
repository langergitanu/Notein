package oO00oOO;

import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import oO00o.AbstractC32318OooO0o;
import oO00oO0.EnumC32398OooO0OO;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.C32928OooO0o0;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oO00oOO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32423OooOO0O extends AbstractC32318OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f116585OooO00o = 0;

    /* JADX INFO: renamed from: oO00oOO.OooOO0O$OooO00o */
    public static final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0OO f116586OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Runnable f116587OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final long f116588OooOoO0;

        public OooO00o(Runnable runnable, OooO0OO oooO0OO, long j) {
            this.f116587OooOo0o = runnable;
            this.f116586OooOo = oooO0OO;
            this.f116588OooOoO0 = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f116586OooOo.f116595OooOoO) {
                return;
            }
            OooO0OO oooO0OO = this.f116586OooOo;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            oooO0OO.getClass();
            long jConvert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
            long j = this.f116588OooOoO0;
            if (j > jConvert) {
                try {
                    Thread.sleep(j - jConvert);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    C32430OooO00o.OooO00o(e);
                    return;
                }
            }
            if (this.f116586OooOo.f116595OooOoO) {
                return;
            }
            this.f116587OooOo0o.run();
        }
    }

    /* JADX INFO: renamed from: oO00oOO.OooOO0O$OooO0O0 */
    public static final class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final long f116589OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Runnable f116590OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public volatile boolean f116591OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f116592OooOoO0;

        public OooO0O0(Runnable runnable, Long l, int i) {
            this.f116590OooOo0o = runnable;
            this.f116589OooOo = l.longValue();
            this.f116592OooOoO0 = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0O0 oooO0O0) {
            OooO0O0 oooO0O02 = oooO0O0;
            int iCompare = Long.compare(this.f116589OooOo, oooO0O02.f116589OooOo);
            return iCompare == 0 ? Integer.compare(this.f116592OooOoO0, oooO0O02.f116592OooOoO0) : iCompare;
        }
    }

    /* JADX INFO: renamed from: oO00oOO.OooOO0O$OooO0OO */
    public static final class OooO0OO extends AbstractC32318OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public volatile boolean f116595OooOoO;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final PriorityBlockingQueue<OooO0O0> f116594OooOo0o = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AtomicInteger f116593OooOo = new AtomicInteger();

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final AtomicInteger f116596OooOoO0 = new AtomicInteger();

        /* JADX INFO: renamed from: oO00oOO.OooOO0O$OooO0OO$OooO00o */
        public final class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final OooO0O0 f116598OooOo0o;

            public OooO00o(OooO0O0 oooO0O0) {
                this.f116598OooOo0o = oooO0O0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f116598OooOo0o.f116591OooOoO = true;
                OooO0OO.this.f116594OooOo0o.remove(this.f116598OooOo0o);
            }
        }

        @Override // oO00o.AbstractC32318OooO0o.OooO0O0
        public final InterfaceC32925OooO0O0 OooO00o(Runnable runnable, long j, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long millis = timeUnit.toMillis(j) + timeUnit2.convert(System.currentTimeMillis(), timeUnit2);
            return OooO0OO(new OooO00o(runnable, this, millis), millis);
        }

        @Override // oO00o.AbstractC32318OooO0o.OooO0O0
        public final void OooO0O0(Runnable runnable) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OooO0OO(runnable, timeUnit.convert(System.currentTimeMillis(), timeUnit));
        }

        public final InterfaceC32925OooO0O0 OooO0OO(Runnable runnable, long j) {
            boolean z = this.f116595OooOoO;
            EnumC32398OooO0OO enumC32398OooO0OO = EnumC32398OooO0OO.f116503OooOo0o;
            if (!z) {
                OooO0O0 oooO0O0 = new OooO0O0(runnable, Long.valueOf(j), this.f116596OooOoO0.incrementAndGet());
                this.f116594OooOo0o.add(oooO0O0);
                if (this.f116593OooOo.getAndIncrement() != 0) {
                    return new C32928OooO0o0(new OooO00o(oooO0O0));
                }
                int iAddAndGet = 1;
                while (!this.f116595OooOoO) {
                    OooO0O0 oooO0O0Poll = this.f116594OooOo0o.poll();
                    if (oooO0O0Poll == null) {
                        iAddAndGet = this.f116593OooOo.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (!oooO0O0Poll.f116591OooOoO) {
                        oooO0O0Poll.f116590OooOo0o.run();
                    }
                }
                this.f116594OooOo0o.clear();
                return enumC32398OooO0OO;
            }
            return enumC32398OooO0OO;
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            this.f116595OooOoO = true;
        }
    }

    static {
        new C32423OooOO0O();
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final AbstractC32318OooO0o.OooO0O0 OooO00o() {
        return new OooO0OO();
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final InterfaceC32925OooO0O0 OooO0O0(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return EnumC32398OooO0OO.f116503OooOo0o;
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final InterfaceC32925OooO0O0 OooO0OO(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C32430OooO00o.OooO00o(e);
        }
        return EnumC32398OooO0OO.f116503OooOo0o;
    }
}

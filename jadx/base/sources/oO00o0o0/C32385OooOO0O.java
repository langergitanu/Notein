package oO00o0o0;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import oO0OOO00.C32938OooO0Oo;
import oO0OOOOo.C32978OooOOo0;
import oO0OooOO.AbstractC33500OooOOOo;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO00o0o0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32385OooOO0O extends AbstractC33500OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f116461OooO00o = 0;

    /* JADX INFO: renamed from: oO00o0o0.OooOO0O$OooO00o */
    public static final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0OO f116462OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Runnable f116463OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final long f116464OooOoO0;

        public OooO00o(Runnable runnable, OooO0OO oooO0OO, long j) {
            this.f116463OooOo0o = runnable;
            this.f116462OooOo = oooO0OO;
            this.f116464OooOoO0 = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f116462OooOo.f116471OooOoO) {
                return;
            }
            OooO0OO oooO0OO = this.f116462OooOo;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            oooO0OO.getClass();
            long jConvert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
            long j = this.f116464OooOoO0;
            if (j > jConvert) {
                try {
                    Thread.sleep(j - jConvert);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    oO0OOO0O.OooO00o.OooO0O0(e);
                    return;
                }
            }
            if (this.f116462OooOo.f116471OooOoO) {
                return;
            }
            this.f116463OooOo0o.run();
        }
    }

    /* JADX INFO: renamed from: oO00o0o0.OooOO0O$OooO0O0 */
    public static final class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final long f116465OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Runnable f116466OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public volatile boolean f116467OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f116468OooOoO0;

        public OooO0O0(Runnable runnable, Long l, int i) {
            this.f116466OooOo0o = runnable;
            this.f116465OooOo = l.longValue();
            this.f116468OooOoO0 = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0O0 oooO0O0) {
            OooO0O0 oooO0O02 = oooO0O0;
            long j = oooO0O02.f116465OooOo;
            long j2 = this.f116465OooOo;
            int i = j2 < j ? -1 : j2 > j ? 1 : 0;
            if (i != 0) {
                return i;
            }
            int i2 = this.f116468OooOoO0;
            int i3 = oooO0O02.f116468OooOoO0;
            if (i2 < i3) {
                return -1;
            }
            return i2 > i3 ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: oO00o0o0.OooOO0O$OooO0OO */
    public static final class OooO0OO extends AbstractC33500OooOOOo.OooO0O0 {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public volatile boolean f116471OooOoO;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final PriorityBlockingQueue<OooO0O0> f116470OooOo0o = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AtomicInteger f116469OooOo = new AtomicInteger();

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final AtomicInteger f116472OooOoO0 = new AtomicInteger();

        /* JADX INFO: renamed from: oO00o0o0.OooOO0O$OooO0OO$OooO00o */
        public final class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final OooO0O0 f116474OooOo0o;

            public OooO00o(OooO0O0 oooO0O0) {
                this.f116474OooOo0o = oooO0O0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f116474OooOo0o.f116467OooOoO = true;
                OooO0OO.this.f116470OooOo0o.remove(this.f116474OooOo0o);
            }
        }

        @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
        public final oO0OOO00.OooO0O0 OooO00o(Runnable runnable, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            long millis = timeUnit2.toMillis(0L) + timeUnit3.convert(System.currentTimeMillis(), timeUnit3);
            return OooO0OO(new OooO00o(runnable, this, millis), millis);
        }

        @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
        public final void OooO0O0(C32978OooOOo0.OooO00o oooO00o) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OooO0OO(oooO00o, timeUnit.convert(System.currentTimeMillis(), timeUnit));
        }

        public final oO0OOO00.OooO0O0 OooO0OO(Runnable runnable, long j) {
            boolean z = this.f116471OooOoO;
            EnumC35110OooO0OO enumC35110OooO0OO = EnumC35110OooO0OO.f126094OooOo0o;
            if (!z) {
                OooO0O0 oooO0O0 = new OooO0O0(runnable, Long.valueOf(j), this.f116472OooOoO0.incrementAndGet());
                this.f116470OooOo0o.add(oooO0O0);
                if (this.f116469OooOo.getAndIncrement() != 0) {
                    return new C32938OooO0Oo(new OooO00o(oooO0O0));
                }
                int iAddAndGet = 1;
                while (!this.f116471OooOoO) {
                    OooO0O0 oooO0O0Poll = this.f116470OooOo0o.poll();
                    if (oooO0O0Poll == null) {
                        iAddAndGet = this.f116469OooOo.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (!oooO0O0Poll.f116467OooOoO) {
                        oooO0O0Poll.f116466OooOo0o.run();
                    }
                }
                this.f116470OooOo0o.clear();
                return enumC35110OooO0OO;
            }
            return enumC35110OooO0OO;
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f116471OooOoO = true;
        }
    }

    static {
        new C32385OooOO0O();
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final AbstractC33500OooOOOo.OooO0O0 OooO00o() {
        return new OooO0OO();
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final oO0OOO00.OooO0O0 OooO0O0(Runnable runnable) {
        runnable.run();
        return EnumC35110OooO0OO.f126094OooOo0o;
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final oO0OOO00.OooO0O0 OooO0OO(Runnable runnable) {
        try {
            TimeUnit.NANOSECONDS.sleep(0L);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            oO0OOO0O.OooO00o.OooO0O0(e);
        }
        return EnumC35110OooO0OO.f126094OooOo0o;
    }
}

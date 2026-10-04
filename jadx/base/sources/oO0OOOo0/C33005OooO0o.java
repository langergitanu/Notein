package oO0OOOo0;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o00000.OooOO0;
import o0Oo0oOo.o00Oo0;
import oO00o00O.C32327OooO0Oo;

/* JADX INFO: renamed from: oO0OOOo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33005OooO0o extends AtomicInteger implements oOO00OOO.OooO0OO {
    private static final long serialVersionUID = -2189523197179400958L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f119392OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public oOO00OOO.OooO0OO f119393OooOo0o;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f119397OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile boolean f119398OooOoo0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReference<oOO00OOO.OooO0OO> f119395OooOoO0 = new AtomicReference<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicLong f119394OooOoO = new AtomicLong();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicLong f119396OooOoOO = new AtomicLong();

    public final void OooO00o() {
        if (getAndIncrement() != 0) {
            return;
        }
        OooO0O0();
    }

    public final void OooO0O0() {
        int iAddAndGet = 1;
        long jOooO0OO = 0;
        oOO00OOO.OooO0OO oooO0OO = null;
        do {
            oOO00OOO.OooO0OO andSet = this.f119395OooOoO0.get();
            if (andSet != null) {
                andSet = this.f119395OooOoO0.getAndSet(null);
            }
            long andSet2 = this.f119394OooOoO.get();
            if (andSet2 != 0) {
                andSet2 = this.f119394OooOoO.getAndSet(0L);
            }
            long andSet3 = this.f119396OooOoOO.get();
            if (andSet3 != 0) {
                andSet3 = this.f119396OooOoOO.getAndSet(0L);
            }
            oOO00OOO.OooO0OO oooO0OO2 = this.f119393OooOo0o;
            if (this.f119398OooOoo0) {
                if (oooO0OO2 != null) {
                    oooO0OO2.cancel();
                    this.f119393OooOo0o = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jOooO0OO2 = this.f119392OooOo;
                if (jOooO0OO2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                    jOooO0OO2 = OooOO0.OooO0OO(jOooO0OO2, andSet2);
                    if (jOooO0OO2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                        jOooO0OO2 -= andSet3;
                        if (jOooO0OO2 < 0) {
                            oO0OOO0O.OooO00o.OooO0O0(new C32327OooO0Oo(androidx.concurrent.futures.OooO00o.OooO0O0(jOooO0OO2, "More produced than requested: ")));
                            jOooO0OO2 = 0;
                        }
                    }
                    this.f119392OooOo = jOooO0OO2;
                }
                if (andSet != null) {
                    if (oooO0OO2 != null) {
                        oooO0OO2.cancel();
                    }
                    this.f119393OooOo0o = andSet;
                    if (jOooO0OO2 != 0) {
                        jOooO0OO = OooOO0.OooO0OO(jOooO0OO, jOooO0OO2);
                        oooO0OO = andSet;
                    }
                } else if (oooO0OO2 != null && andSet2 != 0) {
                    jOooO0OO = OooOO0.OooO0OO(jOooO0OO, andSet2);
                    oooO0OO = oooO0OO2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jOooO0OO != 0) {
            oooO0OO.request(jOooO0OO);
        }
    }

    public void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        OooO0o(oooO0OO);
    }

    public final void OooO0o(oOO00OOO.OooO0OO oooO0OO) {
        if (this.f119398OooOoo0) {
            oooO0OO.cancel();
            return;
        }
        o00Oo0.OooO00o(oooO0OO, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            oOO00OOO.OooO0OO andSet = this.f119395OooOoO0.getAndSet(oooO0OO);
            if (andSet != null) {
                andSet.cancel();
            }
            OooO00o();
            return;
        }
        oOO00OOO.OooO0OO oooO0OO2 = this.f119393OooOo0o;
        if (oooO0OO2 != null) {
            oooO0OO2.cancel();
        }
        this.f119393OooOo0o = oooO0OO;
        long j = this.f119392OooOo;
        if (decrementAndGet() != 0) {
            OooO0O0();
        }
        if (j != 0) {
            oooO0OO.request(j);
        }
    }

    public final void OooO0o0(long j) {
        if (this.f119397OooOoo) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            OooOO0.OooO0O0(this.f119396OooOoOO, j);
            OooO00o();
            return;
        }
        long j2 = this.f119392OooOo;
        if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
            long j3 = j2 - j;
            if (j3 < 0) {
                oO0OOO0O.OooO00o.OooO0O0(new C32327OooO0Oo(androidx.concurrent.futures.OooO00o.OooO0O0(j3, "More produced than requested: ")));
                j3 = 0;
            }
            this.f119392OooOo = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        OooO0O0();
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        if (this.f119398OooOoo0) {
            return;
        }
        this.f119398OooOoo0 = true;
        OooO00o();
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        if (!EnumC33007OooO0oO.OooO0OO(j) || this.f119397OooOoo) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            OooOO0.OooO0O0(this.f119394OooOoO, j);
            OooO00o();
            return;
        }
        long j2 = this.f119392OooOo;
        if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
            long jOooO0OO = OooOO0.OooO0OO(j2, j);
            this.f119392OooOo = jOooO0OO;
            if (jOooO0OO == LocationRequestCompat.PASSIVE_INTERVAL) {
                this.f119397OooOoo = true;
            }
        }
        oOO00OOO.OooO0OO oooO0OO = this.f119393OooOo0o;
        if (decrementAndGet() != 0) {
            OooO0O0();
        }
        if (oooO0OO != null) {
            oooO0OO.request(j);
        }
    }
}

package oO0o0Ooo;

import OooO0Oo.C20398OooO0O0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o000o0o.C24613OooO0OO;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33634Oooo000;
import oO0o0OO.C33641Oooo0oO;
import oO0o0OO.InterfaceC33645OoooO00;
import oO0o0OO.InterfaceC33651OoooOoO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33827OooO0oo extends AbstractC33630OooOooO implements InterfaceC33645OoooO00 {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121926OooOooO = AtomicIntegerFieldUpdater.newUpdater(C33827OooO0oo.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC33630OooOooO f121927OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33645OoooO00 f121928OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f121929OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Object f121930OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33830OooOO0o<Runnable> f121931OooOoo0;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: oO0o0Ooo.OooO0oo$OooO00o */
    public final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Runnable f121933OooOo0o;

        public OooO00o(Runnable runnable) {
            this.f121933OooOo0o = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.f121933OooOo0o.run();
                } catch (Throwable th) {
                    C33634Oooo000.OooO00o(th, oOo0000O.OooO.f123416OooOo0o);
                }
                C33827OooO0oo c33827OooO0oo = C33827OooO0oo.this;
                Runnable runnableO000OOoO = c33827OooO0oo.o000OOoO();
                if (runnableO000OOoO == null) {
                    return;
                }
                this.f121933OooOo0o = runnableO000OOoO;
                i++;
                if (i >= 16) {
                    AbstractC33630OooOooO abstractC33630OooOooO = c33827OooO0oo.f121927OooOoO;
                    if (abstractC33630OooOooO.o000OOO(c33827OooO0oo)) {
                        abstractC33630OooOooO.o0OoO0o(c33827OooO0oo, this);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33827OooO0oo(AbstractC33630OooOooO abstractC33630OooOooO, int i) {
        InterfaceC33645OoooO00 interfaceC33645OoooO00 = abstractC33630OooOooO instanceof InterfaceC33645OoooO00 ? (InterfaceC33645OoooO00) abstractC33630OooOooO : null;
        this.f121928OooOoO0 = interfaceC33645OoooO00 == null ? C33641Oooo0oO.f121324OooO00o : interfaceC33645OoooO00;
        this.f121927OooOoO = abstractC33630OooOooO;
        this.f121929OooOoOO = i;
        this.f121931OooOoo0 = new C33830OooOO0o<>();
        this.f121930OooOoo = new Object();
    }

    @Override // oO0o0OO.InterfaceC33645OoooO00
    public final InterfaceC33651OoooOoO OooOooo(long j, Runnable runnable, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return this.f121928OooOoO0.OooOooo(j, runnable, interfaceC34415OooO0oo);
    }

    @Override // oO0o0OO.InterfaceC33645OoooO00
    public final void o0000o0(long j, C33614OooOOO0 c33614OooOOO0) {
        this.f121928OooOoO0.o0000o0(j, c33614OooOOO0);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o000OO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        Runnable runnableO000OOoO;
        this.f121931OooOoo0.OooO00o(runnable);
        if (f121926OooOooO.get(this) >= this.f121929OooOoOO || !o000Oo00() || (runnableO000OOoO = o000OOoO()) == null) {
            return;
        }
        this.f121927OooOoO.o000OO0o(this, new OooO00o(runnableO000OOoO));
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final AbstractC33630OooOooO o000OOo0(int i) {
        C24613OooO0OO.OooO0O0(1);
        return 1 >= this.f121929OooOoOO ? this : super.o000OOo0(1);
    }

    public final Runnable o000OOoO() {
        while (true) {
            Runnable runnableOooO0Oo = this.f121931OooOoo0.OooO0Oo();
            if (runnableOooO0Oo != null) {
                return runnableOooO0Oo;
            }
            synchronized (this.f121930OooOoo) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f121926OooOooO;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f121931OooOoo0.OooO0OO() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean o000Oo00() {
        synchronized (this.f121930OooOoo) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f121926OooOooO;
            if (atomicIntegerFieldUpdater.get(this) >= this.f121929OooOoOO) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        Runnable runnableO000OOoO;
        this.f121931OooOoo0.OooO00o(runnable);
        if (f121926OooOooO.get(this) >= this.f121929OooOoOO || !o000Oo00() || (runnableO000OOoO = o000OOoO()) == null) {
            return;
        }
        this.f121927OooOoO.o0OoO0o(this, new OooO00o(runnableO000OOoO));
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f121927OooOoO);
        sb.append(".limitedParallelism(");
        return C20398OooO0O0.OooO00o(')', sb, this.f121929OooOoOO);
    }
}

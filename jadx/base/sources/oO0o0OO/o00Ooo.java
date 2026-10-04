package oO0o0OO;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class o00Ooo extends AbstractC33673o0ooOO0 {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121375OooOoo0 = AtomicIntegerFieldUpdater.newUpdater(o00Ooo.class, "_invoked$volatile");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<Throwable, C32460OooOooO> f121376OooOoOO;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public o00Ooo(InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
        this.f121376OooOoOO = interfaceC32507OooOO0o;
    }

    @Override // oO0o0OO.AbstractC33673o0ooOO0
    public final boolean OooO() {
        return true;
    }

    @Override // oO0o0OO.AbstractC33673o0ooOO0
    public final void OooOO0(Throwable th) {
        if (f121375OooOoo0.compareAndSet(this, 0, 1)) {
            this.f121376OooOoOO.invoke(th);
        }
    }
}

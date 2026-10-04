package oO00o0o;

import o0o0OO0.C30416Oooo0OO;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33023OooO00o;
import oO0OOOoo.InterfaceC33029OooO0oO;

/* JADX INFO: renamed from: oO00o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32371OooO00o<T, R> implements InterfaceC33023OooO00o<T>, InterfaceC33029OooO0oO<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oOO00OOO.OooO0OO f116385OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33023OooO00o<? super R> f116386OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f116387OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC33029OooO0oO<T> f116388OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f116389OooOoOO;

    public AbstractC32371OooO00o(InterfaceC33023OooO00o<? super R> interfaceC33023OooO00o) {
        this.f116386OooOo0o = interfaceC33023OooO00o;
    }

    public final void OooO00o(Throwable th) {
        C30416Oooo0OO.OooO00o(th);
        this.f116385OooOo.cancel();
        onError(th);
    }

    @Override // oO0OOOoo.InterfaceC33027OooO0o
    public int OooO0O0(int i) {
        InterfaceC33029OooO0oO<T> interfaceC33029OooO0oO = this.f116388OooOoO0;
        if (interfaceC33029OooO0oO == null || (i & 4) != 0) {
            return 0;
        }
        int iOooO0O0 = interfaceC33029OooO0oO.OooO0O0(i);
        if (iOooO0O0 == 0) {
            return iOooO0O0;
        }
        this.f116389OooOoOO = iOooO0O0;
        return iOooO0O0;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        if (EnumC33007OooO0oO.OooO0Oo(this.f116385OooOo, oooO0OO)) {
            this.f116385OooOo = oooO0OO;
            if (oooO0OO instanceof InterfaceC33029OooO0oO) {
                this.f116388OooOoO0 = (InterfaceC33029OooO0oO) oooO0OO;
            }
            this.f116386OooOo0o.OooO0Oo(this);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        this.f116385OooOo.cancel();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
        this.f116388OooOoO0.clear();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return this.f116388OooOoO0.isEmpty();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oOO00OOO.OooO0O0
    public void onComplete() {
        if (this.f116387OooOoO) {
            return;
        }
        this.f116387OooOoO = true;
        this.f116386OooOo0o.onComplete();
    }

    @Override // oOO00OOO.OooO0O0
    public void onError(Throwable th) {
        if (this.f116387OooOoO) {
            oO0OOO0O.OooO00o.OooO0O0(th);
        } else {
            this.f116387OooOoO = true;
            this.f116386OooOo0o.onError(th);
        }
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        this.f116385OooOo.request(j);
    }
}

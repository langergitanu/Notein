package oO0o0o0;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33614OooOOO0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO0o0o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33851OooO0OO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33855OooO0oO<T> f121970OooOo0o;

    public C33851OooO0OO(C33855OooO0oO<T> c33855OooO0oO) {
        this.f121970OooOo0o = c33855OooO0oO;
    }

    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C33855OooO0oO<T> c33855OooO0oO = this.f121970OooOo0o;
        c33855OooO0oO.f121980OooOoOO.onNext(t);
        if (C33855OooO0oO.f121978OooOoo0.decrementAndGet(c33855OooO0oO) > 0) {
            oO00o00.OooO0OO.OooO0OO(c33855OooO0oO.f121272OooOoO0);
            return C32460OooOooO.f116667OooO00o;
        }
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        C33855OooO0oO.f121977OooOoo.set(c33855OooO0oO, c33614OooOOO0);
        Object objOooOOo = c33614OooOOO0.OooOOo();
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }
}

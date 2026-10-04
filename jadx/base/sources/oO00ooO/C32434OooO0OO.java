package oO00ooO;

import kotlin.coroutines.Continuation;
import oO00ooo0.EnumC32485OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import ooOOoOO0.C35136OooOooO;
import ooOOoOO0.C35137OooOooo;

/* JADX INFO: renamed from: oO00ooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32434OooO0OO<T, R> extends AbstractC32433OooO0O0<T, R> implements Continuation<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C32460OooOooO f116628OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C35136OooOooO f116629OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f116630OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Continuation<Object> f116631OooOoO0;

    @Override // oO00ooO.AbstractC32433OooO0O0
    public final void OooO00o(C32460OooOooO c32460OooOooO, C35137OooOooo c35137OooOooo) {
        this.f116631OooOoO0 = c35137OooOooo;
        this.f116628OooOo = c32460OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return oOo0000O.OooO.f123416OooOo0o;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f116631OooOoO0 = null;
        this.f116630OooOoO = obj;
    }
}

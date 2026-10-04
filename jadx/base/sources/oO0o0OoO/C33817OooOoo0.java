package oO0o0OoO;

import kotlin.coroutines.Continuation;
import oO00ooo.InterfaceC32480OooO0Oo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33817OooOoo0<T> implements Continuation<T>, InterfaceC32480OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f121904OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Continuation<T> f121905OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C33817OooOoo0(Continuation<? super T> continuation, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        this.f121905OooOo0o = continuation;
        this.f121904OooOo = interfaceC34415OooO0oo;
    }

    @Override // oO00ooo.InterfaceC32480OooO0Oo
    public final InterfaceC32480OooO0Oo getCallerFrame() {
        Continuation<T> continuation = this.f121905OooOo0o;
        if (continuation instanceof InterfaceC32480OooO0Oo) {
            return (InterfaceC32480OooO0Oo) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return this.f121904OooOo;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f121905OooOo0o.resumeWith(obj);
    }
}

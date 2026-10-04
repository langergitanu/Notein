package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32460OooOooO;
import oO0o0OoO.C33790OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33752Oooo0O0 implements InterfaceC33723OooO0oO<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O f121675OooOo0o;

    public C33752Oooo0O0(C24034Oooo00O c24034Oooo00O) {
        this.f121675OooOo0o = c24034Oooo00O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(Object obj, Continuation<? super C32460OooOooO> continuation) {
        this.f121675OooOo0o.f80942OooOo0o = obj;
        throw new C33790OooO00o(this);
    }
}

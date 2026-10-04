package oO0o0OO;

import Oooo0oO.o000O0O;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oO0.InterfaceC33889OooO0o0;

/* JADX INFO: renamed from: oO0o0OO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33621OooOo0<T> extends o0ooOOo implements InterfaceC33622OooOo00<T> {
    @Override // oO0o0OO.InterfaceC33622OooOo00
    public final boolean OooO00o(Throwable th) {
        return OoooO00(new C33620OooOo(false, th));
    }

    @Override // oO0o0OO.InterfaceC33642Oooo0oo
    public final Object await(Continuation<? super T> continuation) throws Throwable {
        Object objOooOo00 = OooOo00(continuation);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOo00;
    }

    @Override // oO0o0OO.InterfaceC33642Oooo0oo
    public final InterfaceC33889OooO0o0<T> getOnAwait() {
        C33677o0ooOoO c33677o0ooOoO = C33677o0ooOoO.f121412OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(c33677o0ooOoO, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        C24039Oooo0o0.OooO0o0(3, c33677o0ooOoO);
        o0OOO0o o0ooo0o2 = o0OOO0o.f121381OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(o0ooo0o2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        C24039Oooo0o0.OooO0o0(3, o0ooo0o2);
        return new o000O0O(this, c33677o0ooOoO, o0ooo0o2, null);
    }
}

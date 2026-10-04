package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OoO.C33801OooOOO;

/* JADX INFO: renamed from: oO0o0Oo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33763OoooOOO implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f121738OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f121739OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f121740OooOoO0;

    public C33763OoooOOO(InterfaceC33721OooO0o interfaceC33721OooO0o, InterfaceC33721OooO0o interfaceC33721OooO0o2, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
        this.f121739OooOo0o = interfaceC33721OooO0o;
        this.f121738OooOo = interfaceC33721OooO0o2;
        this.f121740OooOoO0 = interfaceC32510OooOOo0;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oO0O000o.OooOOo0] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        Object objOooO00o = C33801OooOOO.OooO00o(continuation, C33765OoooOo0.f121745OooOo0o, new C33764OoooOOo(this.f121740OooOoO0, null), interfaceC33723OooO0oO, new InterfaceC33721OooO0o[]{this.f121739OooOo0o, this.f121738OooOo});
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}

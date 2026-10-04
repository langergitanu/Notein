package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0oOOooo.C30905OooO0oO;
import o0oOOooo.C30906OooO0oo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class o000000O implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91219OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f91220OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f91221OooOoO0;

    public /* synthetic */ o000000O(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f91220OooOo0o = i;
        this.f91219OooOo = interfaceC33721OooO0o;
        this.f91221OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f91220OooOo0o) {
            case 0:
                Object objCollect = this.f91219OooOo.collect(new o000000(interfaceC33723OooO0oO, (AbstractC24338OooO0o0.OooO00o) this.f91221OooOoO0), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            default:
                ((C33781o00o0O) this.f91219OooOo).collect(new C30905OooO0oO(interfaceC33723OooO0oO, (C30906OooO0oo) this.f91221OooOoO0), continuation);
                return EnumC32485OooO00o.f116726OooOo0o;
        }
    }
}

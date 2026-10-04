package o0OO0O0;

import kotlin.coroutines.Continuation;
import o0oOo00.C30938OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0O0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26710OooOoo0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92283OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f92284OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f92285OooOoO0;

    public /* synthetic */ C26710OooOoo0(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f92284OooOo0o = i;
        this.f92283OooOo = interfaceC33721OooO0o;
        this.f92285OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f92284OooOo0o) {
            case 0:
                Object objCollect = ((C33734OooOOoo) this.f92283OooOo).collect(new C26708OooOoOO(interfaceC33723OooO0oO, (Oooo000) this.f92285OooOoO0), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            default:
                ((C33781o00o0O) this.f92283OooOo).collect(new o0oOo00.OooOOO0(interfaceC33723OooO0oO, (C30938OooOOo) this.f92285OooOoO0), continuation);
                return EnumC32485OooO00o.f116726OooOo0o;
        }
    }
}

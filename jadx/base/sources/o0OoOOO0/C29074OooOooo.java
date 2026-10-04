package o0OoOOO0;

import kotlin.coroutines.Continuation;
import o0OoooOo.C29653OooOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoOOO0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29074OooOooo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f103039OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103040OooOo0o;

    public /* synthetic */ C29074OooOooo(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f103040OooOo0o = i;
        this.f103039OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f103040OooOo0o) {
            case 0:
                Object objCollect = ((C29071OooOoo) this.f103039OooOo).collect(new C29073OooOooO(interfaceC33723OooO0oO), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            default:
                ((C33781o00o0O) this.f103039OooOo).collect(new C29653OooOo(interfaceC33723OooO0oO), continuation);
                return EnumC32485OooO00o.f116726OooOo0o;
        }
    }
}

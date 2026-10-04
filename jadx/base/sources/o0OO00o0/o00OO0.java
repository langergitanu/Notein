package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0OoOO00.C29020Oooo00o;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OO0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91780OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f91781OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f91782OooOoO0;

    public /* synthetic */ o00OO0(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f91781OooOo0o = i;
        this.f91780OooOo = interfaceC33721OooO0o;
        this.f91782OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f91781OooOo0o) {
            case 0:
                Object objCollect = this.f91780OooOo.collect(new C26606o00OO00o(interfaceC33723OooO0oO, (o00OO0O) this.f91782OooOoO0), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            default:
                ((C33781o00o0O) this.f91780OooOo).collect(new C29020Oooo00o(interfaceC33723OooO0oO, (com.orion.notein.p607ui.noteeditor.addpage.OooO0OO) this.f91782OooOoO0), continuation);
                return EnumC32485OooO00o.f116726OooOo0o;
        }
    }
}

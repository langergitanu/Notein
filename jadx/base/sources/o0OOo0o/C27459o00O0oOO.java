package o0OOo0o;

import kotlin.coroutines.Continuation;
import o0Ooooo.C29693Oooo000;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0o.o00O0oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27459o00O0oOO implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f96110OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f96111OooOo0o;

    public /* synthetic */ C27459o00O0oOO(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f96111OooOo0o = i;
        this.f96110OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f96111OooOo0o) {
            case 0:
                Object objCollect = this.f96110OooOo.collect(new C27458o00O0oO(interfaceC33723OooO0oO), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            default:
                ((C33781o00o0O) this.f96110OooOo).collect(new C29693Oooo000(interfaceC33723OooO0oO), continuation);
                return EnumC32485OooO00o.f116726OooOo0o;
        }
    }
}

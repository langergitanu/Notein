package o0OOOO00;

import kotlin.coroutines.Continuation;
import o0OOoOo0.C27810OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94389OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f94390OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f94391OooOoO0;

    public /* synthetic */ OooOOO0(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f94390OooOo0o = i;
        this.f94389OooOo = interfaceC33721OooO0o;
        this.f94391OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f94390OooOo0o) {
            case 0:
                Object objCollect = this.f94389OooOo.collect(new C27089OooOO0o(interfaceC33723OooO0oO, (C27095OooOo0O) this.f94391OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f94389OooOo.collect(new C27810OooOOoo(interfaceC33723OooO0oO, (String) this.f94391OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

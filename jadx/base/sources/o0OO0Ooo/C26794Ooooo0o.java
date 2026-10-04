package o0OO0Ooo;

import kotlin.coroutines.Continuation;
import o0o0OoOo.C30721OooO;
import o0o0OoOo.C30729OooO0oo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0Ooo.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26794Ooooo0o implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92671OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f92672OooOo0o;

    public /* synthetic */ C26794Ooooo0o(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f92672OooOo0o = i;
        this.f92671OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f92672OooOo0o) {
            case 0:
                Object objCollect = this.f92671OooOo.collect(new C26793Ooooo00(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((C30729OooO0oo) this.f92671OooOo).collect(new C30721OooO(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

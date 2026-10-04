package o0OOoOo0;

import kotlin.coroutines.Continuation;
import o0o0O0o0.C30308OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33801OooOOO;

/* JADX INFO: renamed from: o0OOoOo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27801OooOO0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f98199OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f98200OooOo0o;

    public /* synthetic */ C27801OooOO0(Object obj, int i) {
        this.f98200OooOo0o = i;
        this.f98199OooOo = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f98200OooOo0o) {
            case 0:
                InterfaceC33721OooO0o[] interfaceC33721OooO0oArr = (InterfaceC33721OooO0o[]) this.f98199OooOo;
                Object objOooO00o = C33801OooOOO.OooO00o(continuation, new C27800OooO0oo(interfaceC33721OooO0oArr), new C27792OooO(3, null), interfaceC33723OooO0oO, interfaceC33721OooO0oArr);
                if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect = ((InterfaceC33721OooO0o) this.f98199OooOo).collect(new C30308OooOOOo(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

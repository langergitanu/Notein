package o0o0OoOo;

import kotlin.coroutines.Continuation;
import o0oOo0O.C30951OooO0o0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33799OooOO0O;

/* JADX INFO: renamed from: o0o0OoOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30729OooO0oo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f109904OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f109905OooOo0o;

    public /* synthetic */ C30729OooO0oo(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f109905OooOo0o = i;
        this.f109904OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f109905OooOo0o) {
            case 0:
                Object objCollect = this.f109904OooOo.collect(new C30728OooO0oO(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((C33799OooOO0O) this.f109904OooOo).collect(new C30951OooO0o0(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

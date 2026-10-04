package o0OOOO00;

import kotlin.coroutines.Continuation;
import o0OOoOo0.C27813OooOo00;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOOO00.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27091OooOOo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94400OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f94401OooOo0o;

    public /* synthetic */ C27091OooOOo(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f94401OooOo0o = i;
        this.f94400OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f94401OooOo0o) {
            case 0:
                Object objCollect = this.f94400OooOo.collect(new C27092OooOOo0(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f94400OooOo.collect(new C27813OooOo00(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

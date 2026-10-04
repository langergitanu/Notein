package o0OO0o00;

import kotlin.coroutines.Continuation;
import o0o00oOo.oo0o0Oo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0o00.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26894Oooo0o implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f93296OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f93297OooOo0o;

    public /* synthetic */ C26894Oooo0o(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f93297OooOo0o = i;
        this.f93296OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f93297OooOo0o) {
            case 0:
                Object objCollect = this.f93296OooOo.collect(new C26895Oooo0o0(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f93296OooOo.collect(new oo0o0Oo(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

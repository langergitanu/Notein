package o0OO0o0;

import kotlin.coroutines.Continuation;
import o0Ooo000.C29353OooOoO0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0o0.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26845OoooO0O implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92937OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f92938OooOo0o;

    public /* synthetic */ C26845OoooO0O(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f92938OooOo0o = i;
        this.f92937OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f92938OooOo0o) {
            case 0:
                Object objCollect = this.f92937OooOo.collect(new C26843OoooO0(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((com.orion.notein.data.repo.transactions.o000oOoO) this.f92937OooOo).collect(new C29353OooOoO0(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

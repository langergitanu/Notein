package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0Ooo0oo.C29529o0000oO0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class oo0o0Oo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92180OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f92181OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f92182OooOoO0;

    public /* synthetic */ oo0o0Oo(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f92181OooOo0o = i;
        this.f92180OooOo = interfaceC33721OooO0o;
        this.f92182OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f92181OooOo0o) {
            case 0:
                Object objCollect = this.f92180OooOo.collect(new o0OO00O(interfaceC33723OooO0oO, (AbstractC24338OooO0o0.OooO00o) this.f92182OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f92180OooOo.collect(new C29529o0000oO0(interfaceC33723OooO0oO, (com.orion.notein.p607ui.noteeditor.penbar.OooO0O0) this.f92182OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

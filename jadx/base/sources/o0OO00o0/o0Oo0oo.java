package o0OO00o0;

import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0Ooo0oo.C29524o0000o;
import o0o0OO0.C30411OooOooo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class o0Oo0oo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92126OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f92127OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f92128OooOoO0;

    public /* synthetic */ o0Oo0oo(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f92127OooOo0o = i;
        this.f92126OooOo = interfaceC33721OooO0o;
        this.f92128OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f92127OooOo0o) {
            case 0:
                Object objCollect = this.f92126OooOo.collect(new o0OOO0o(interfaceC33723OooO0oO, (AbstractC24338OooO0o0.OooO00o) this.f92128OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f92126OooOo.collect(new C29524o0000o(interfaceC33723OooO0oO, (com.orion.notein.p607ui.noteeditor.penbar.OooO0O0) this.f92128OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f92126OooOo.collect(new C30411OooOooo(interfaceC33723OooO0oO, (Map) this.f92128OooOoO0), continuation);
                if (objCollect3 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

package o0OoOOO0;

import kotlin.coroutines.Continuation;
import o0OO0o00.C26892Oooo0O0;
import o0OoooOo.C29659OooOoO0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoOOO0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29078Oooo00O implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f103049OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103050OooOo0o;

    public /* synthetic */ C29078Oooo00O(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f103050OooOo0o = i;
        this.f103049OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f103050OooOo0o) {
            case 0:
                Object objCollect = ((C33769Ooooo0o) this.f103049OooOo).f121747OooOo0o.collect(new C29077Oooo000(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((C33769Ooooo0o) this.f103049OooOo).f121747OooOo0o.collect(new C29659OooOoO0(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f103049OooOo.collect(new C26892Oooo0O0(interfaceC33723OooO0oO), continuation);
                if (objCollect3 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

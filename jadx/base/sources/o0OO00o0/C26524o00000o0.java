package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0o000OO.C29770Oooo00O;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO00o0.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26524o00000o0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91255OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f91256OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f91257OooOoO0;

    public /* synthetic */ C26524o00000o0(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f91256OooOo0o = i;
        this.f91255OooOo = interfaceC33721OooO0o;
        this.f91257OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f91256OooOo0o) {
            case 0:
                Object objCollect = ((oo000o) this.f91255OooOo).collect(new C26523o00000Oo(interfaceC33723OooO0oO, (C26577o000oo0O) this.f91257OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f91255OooOo.collect(new C29770Oooo00O(interfaceC33723OooO0oO, (AbstractApplicationC26277OooOoOO) this.f91257OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

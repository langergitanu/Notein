package o0OOOO;

import kotlin.coroutines.Continuation;
import o0OoO0oo.C28805o000Oooo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27078OooO0o0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94273OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f94274OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f94275OooOoO0;

    public /* synthetic */ C27078OooO0o0(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f94274OooOo0o = i;
        this.f94273OooOo = interfaceC33721OooO0o;
        this.f94275OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f94274OooOo0o) {
            case 0:
                Object objCollect = ((C33769Ooooo0o) this.f94273OooOo).f121747OooOo0o.collect(new C27077OooO0Oo(interfaceC33723OooO0oO, (C27081OooOO0o) this.f94275OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f94273OooOo.collect(new C28805o000Oooo(interfaceC33723OooO0oO, (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f94275OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

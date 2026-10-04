package o0OO;

import kotlin.coroutines.Continuation;
import o0OOoooO.C28006OooOO0o;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26410OooOOOo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f90671OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90672OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f90673OooOoO0;

    public /* synthetic */ C26410OooOOOo(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f90672OooOo0o = i;
        this.f90671OooOo = interfaceC33721OooO0o;
        this.f90673OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f90672OooOo0o) {
            case 0:
                Object objCollect = ((C33734OooOOoo) this.f90671OooOo).collect(new OooOOOO(interfaceC33723OooO0oO, (C26412OooOOo0) this.f90673OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f90671OooOo.collect(new C28006OooOO0o(interfaceC33723OooO0oO, (C28009OooOOOO) this.f90673OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

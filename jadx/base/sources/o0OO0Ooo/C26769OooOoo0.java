package o0OO0Ooo;

import kotlin.coroutines.Continuation;
import o0oOo0O.C30949OooO0Oo;
import o0oOo0O.C30950OooO0o;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33737OooOo00;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0Ooo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26769OooOoo0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92563OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f92564OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f92565OooOoO0;

    public /* synthetic */ C26769OooOoo0(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f92564OooOo0o = i;
        this.f92563OooOo = interfaceC33721OooO0o;
        this.f92565OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) throws Throwable {
        switch (this.f92564OooOo0o) {
            case 0:
                Object objCollect = ((C33737OooOo00) this.f92563OooOo).collect(new C26767OooOoOO(interfaceC33723OooO0oO, (C26773Oooo0) this.f92565OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f92563OooOo.collect(new C30949OooO0Oo(interfaceC33723OooO0oO, (C30950OooO0o) this.f92565OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

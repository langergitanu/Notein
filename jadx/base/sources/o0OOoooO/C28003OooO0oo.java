package o0OOoooO;

import kotlin.coroutines.Continuation;
import o0oOOoo.C30859OooO0OO;
import o0oOOoo.C30861OooO0o0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOoooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28003OooO0oo implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f99312OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99313OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f99314OooOoO0;

    public /* synthetic */ C28003OooO0oo(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f99313OooOo0o = i;
        this.f99312OooOo = interfaceC33721OooO0o;
        this.f99314OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f99313OooOo0o) {
            case 0:
                Object objCollect = this.f99312OooOo.collect(new C28002OooO0oO(interfaceC33723OooO0oO, (C28009OooOOOO) this.f99314OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f99312OooOo.collect(new C30859OooO0OO(interfaceC33723OooO0oO, (C30861OooO0o0) this.f99314OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33760OoooO00;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class o000Oo0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91503OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f91504OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f91505OooOoO0;

    public /* synthetic */ o000Oo0(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f91504OooOo0o = i;
        this.f91503OooOo = interfaceC33721OooO0o;
        this.f91505OooOoO0 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oO0O000o.OooOOOo] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f91504OooOo0o) {
            case 0:
                Object objCollect = this.f91503OooOo.collect(new o000O0O(interfaceC33723OooO0oO, (AbstractC24338OooO0o0.OooO00o) this.f91505OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f91503OooOo.collect(new C33760OoooO00(interfaceC33723OooO0oO, this.f91505OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

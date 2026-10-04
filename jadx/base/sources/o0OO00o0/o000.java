package o0OO00o0;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.C33735OooOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class o000 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91197OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f91198OooOo0o = 1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f91199OooOoO0;

    /* JADX WARN: Multi-variable type inference failed */
    public o000(InterfaceC32508OooOOOo interfaceC32508OooOOOo, InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f91197OooOo = interfaceC33721OooO0o;
        this.f91199OooOoO0 = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f91198OooOo0o) {
            case 0:
                Object objCollect = this.f91197OooOo.collect(new C26542o0000ooO(interfaceC33723OooO0oO, (AbstractC24338OooO0o0.OooO00o) this.f91199OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f91197OooOo.collect(new C33735OooOo(new C24030OooOoo(), interfaceC33723OooO0oO, (AbstractC32476OooO) this.f91199OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public o000(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC24338OooO0o0.OooO00o oooO00o) {
        this.f91197OooOo = interfaceC33721OooO0o;
        this.f91199OooOoO0 = oooO00o;
    }
}

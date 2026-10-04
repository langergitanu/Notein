package OooOoOO;

import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58796OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<C20525OooOO0O<Object, Object>> f58797OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f58798OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20523OooO0oo<Object, Object> f58799OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C20527OooOOO<Object, Object> f58800OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<C20525OooOO0O<Object, Object>, C32460OooOooO> f58801OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ float f58802OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(C24034Oooo00O<C20525OooOO0O<Object, Object>> c24034Oooo00O, Object obj, InterfaceC20523OooO0oo<Object, Object> interfaceC20523OooO0oo, Object obj2, C20527OooOOO<Object, Object> c20527OooOOO, float f, InterfaceC32507OooOO0o<? super C20525OooOO0O<Object, Object>, C32460OooOooO> interfaceC32507OooOO0o) {
        super(1);
        this.f58797OooOo0o = c24034Oooo00O;
        this.f58796OooOo = obj;
        this.f58799OooOoO0 = interfaceC20523OooO0oo;
        this.f58798OooOoO = obj2;
        this.f58800OooOoOO = c20527OooOOO;
        this.f58802OooOoo0 = f;
        this.f58801OooOoo = interfaceC32507OooOO0o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [OooOoOO.OooOO0O, T] */
    /* JADX WARN: Type inference failed for: r3v0, types: [OooOoOO.OooOOo, java.lang.Object] */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Long l) {
        long jLongValue = l.longValue();
        InterfaceC20523OooO0oo<Object, Object> interfaceC20523OooO0oo = this.f58799OooOoO0;
        InterfaceC20574Ooooooo<Object, V> interfaceC20574OooooooOooO0Oo = interfaceC20523OooO0oo.OooO0Oo();
        Object objOooO0o = interfaceC20523OooO0oo.OooO0o();
        C20558OoooOO0 c20558OoooOO0 = new C20558OoooOO0(this.f58800OooOoOO);
        ?? c20525OooOO0O = new C20525OooOO0O(this.f58796OooOo, interfaceC20574OooooooOooO0Oo, this.f58798OooOoO, jLongValue, objOooO0o, jLongValue, c20558OoooOO0);
        C20562OoooOoO.OooO0OO(c20525OooOO0O, jLongValue, this.f58802OooOoo0, this.f58799OooOoO0, this.f58800OooOoOO, this.f58801OooOoo);
        this.f58797OooOo0o.f80942OooOo0o = c20525OooOO0O;
        return C32460OooOooO.f116667OooO00o;
    }
}

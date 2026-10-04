package o0OOooO0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OOooO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager$saveLockLease$2", m80623f = "CloudLockManager.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27900OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<String> f98642OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f98643OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Long> f98644OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98645OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ long f98646OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27900OooOOOo(AbstractC24338OooO0o0.OooO00o<String> oooO00o, String str, AbstractC24338OooO0o0.OooO00o<Long> oooO00o2, long j, Continuation<? super C27900OooOOOo> continuation) {
        super(2, continuation);
        this.f98642OooOo = oooO00o;
        this.f98645OooOoO0 = str;
        this.f98644OooOoO = oooO00o2;
        this.f98646OooOoOO = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27900OooOOOo c27900OooOOOo = new C27900OooOOOo(this.f98642OooOo, this.f98645OooOoO0, this.f98644OooOoO, this.f98646OooOoOO, continuation);
        c27900OooOOOo.f98643OooOo0o = obj;
        return c27900OooOOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27900OooOOOo) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f98643OooOo0o;
        c24334OooO0O0.OooO0oO(this.f98642OooOo, this.f98645OooOoO0);
        c24334OooO0O0.OooO0oO(this.f98644OooOoO, new Long(this.f98646OooOoOO));
        return C32460OooOooO.f116667OooO00o;
    }
}

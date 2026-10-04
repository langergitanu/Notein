package o0OOoO0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import o0000oOO.C24340OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.migration.MigrationStateStoreImpl$set$2", m80623f = "MigrationStateStoreImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27721OooOOo0 f97791OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f97792OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f97793OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C27721OooOOo0 c27721OooOOo0, OooOO0 oooOO02, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f97791OooOo = c27721OooOOo0;
        this.f97793OooOoO0 = oooOO02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOOOO oooOOOO = new OooOOOO(this.f97791OooOo, this.f97793OooOoO0, continuation);
        oooOOOO.f97792OooOo0o = obj;
        return oooOOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOOO) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f97792OooOo0o;
        OooOO0 oooOO02 = this.f97793OooOoO0;
        this.f97791OooOo.getClass();
        StringBuilder sb = new StringBuilder("migration_phase_");
        String str = oooOO02.f97775OooO00o;
        sb.append(str);
        AbstractC24338OooO0o0.OooO00o<String> oooO00oOooO0o0 = C24340OooO0oo.OooO0o0(sb.toString());
        String strName = oooOO02.f97776OooO0O0.name();
        c24334OooO0O0.getClass();
        c24334OooO0O0.OooO0oo(oooO00oOooO0o0, strName);
        String str2 = oooOO02.f97777OooO0OO;
        if (str2 == null) {
            c24334OooO0O0.OooO0o(C27721OooOOo0.OooO0o(str));
        } else {
            c24334OooO0O0.OooO0oo(C27721OooOOo0.OooO0o(str), str2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

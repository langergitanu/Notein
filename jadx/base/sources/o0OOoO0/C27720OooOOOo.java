package o0OOoO0;

import java.util.Set;
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

/* JADX INFO: renamed from: o0OOoO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.migration.MigrationStateStoreImpl$setMigratingMetaIds$2", m80623f = "MigrationStateStoreImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27720OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27721OooOOo0 f97794OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f97795OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Set<String> f97796OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f97797OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27720OooOOOo(C27721OooOOo0 c27721OooOOo0, String str, Set<String> set, Continuation<? super C27720OooOOOo> continuation) {
        super(2, continuation);
        this.f97794OooOo = c27721OooOOo0;
        this.f97797OooOoO0 = str;
        this.f97796OooOoO = set;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27720OooOOOo c27720OooOOOo = new C27720OooOOOo(this.f97794OooOo, this.f97797OooOoO0, this.f97796OooOoO, continuation);
        c27720OooOOOo.f97795OooOo0o = obj;
        return c27720OooOOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27720OooOOOo) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f97795OooOo0o;
        this.f97794OooOo.getClass();
        AbstractC24338OooO0o0.OooO00o<Set<String>> oooO00oOooO0o = C24340OooO0oo.OooO0o("migration_migrated_ids_" + this.f97797OooOoO0);
        c24334OooO0O0.getClass();
        c24334OooO0O0.OooO0oo(oooO00oOooO0o, this.f97796OooOoO);
        return C32460OooOooO.f116667OooO00o;
    }
}

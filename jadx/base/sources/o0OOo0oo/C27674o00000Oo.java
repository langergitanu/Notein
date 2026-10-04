package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.ResolveConflictUseCase", m80623f = "ResolveConflictUseCase.kt", m80624l = {142}, m80625m = "handleMetaNotFoundConflict-0E7RQCE")
public final class C27674o00000Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97404OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CloudMetaLocal f97405OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97406OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27677o00000oo f97407OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27674o00000Oo(C27677o00000oo c27677o00000oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97407OooOoO0 = c27677o00000oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97404OooOo = obj;
        this.f97406OooOoO |= Integer.MIN_VALUE;
        Object objOooO0O0 = this.f97407OooOoO0.OooO0O0(null, null, this);
        return objOooO0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0O0 : new C32445OooOOOO(objOooO0O0);
    }
}

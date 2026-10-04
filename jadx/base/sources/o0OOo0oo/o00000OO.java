package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.ResolveConflictUseCase", m80623f = "ResolveConflictUseCase.kt", m80624l = {178}, m80625m = "handleCloudDeletedConflict-BWLJW6A")
public final class o00000OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public CloudMetaRemote f97399OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CloudMetaLocal f97400OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27677o00000oo f97401OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97402OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97403OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(C27677o00000oo c27677o00000oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97401OooOoO = c27677o00000oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97402OooOoO0 = obj;
        this.f97403OooOoOO |= Integer.MIN_VALUE;
        Object objOooO00o = this.f97401OooOoO.OooO00o(null, null, null, this);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : new C32445OooOOOO(objOooO00o);
    }
}

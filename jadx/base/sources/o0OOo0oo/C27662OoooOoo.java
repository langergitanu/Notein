package o0OOo0oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.LegacyCloudSyncMigrationUseCase", m80623f = "LegacyCloudSyncMigrationUseCase.kt", m80624l = {200, 211}, m80625m = "cleanupLegacyCloudSyncPlaceholders")
public final class C27662OoooOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97278OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97279OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97280OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27665OooooO0 f97281OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27662OoooOoo(C27665OooooO0 c27665OooooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97281OooOoO0 = c27665OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97278OooOo = obj;
        this.f97280OooOoO |= Integer.MIN_VALUE;
        return this.f97281OooOoO0.OooO00o(this);
    }
}

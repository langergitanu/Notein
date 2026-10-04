package o0OOo0oo;

import o0OOo0Oo.EnumC27285OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.LegacyCloudSyncMigrationUseCase", m80623f = "LegacyCloudSyncMigrationUseCase.kt", m80624l = {44, 45, 52, 72, 75, 79}, m80625m = "runIfNeeded")
public final class C27664Ooooo0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97293OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27665OooooO0 f97294OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97295OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public EnumC27285OooO f97296OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27665OooooO0 f97297OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97298OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27664Ooooo0o(C27665OooooO0 c27665OooooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97297OooOoOO = c27665OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97295OooOoO = obj;
        this.f97298OooOoo0 |= Integer.MIN_VALUE;
        return this.f97297OooOoOO.OooO0OO(this);
    }
}

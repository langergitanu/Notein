package o0OOoO0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.migration.MigrationStateStoreImpl", m80623f = "MigrationStateStoreImpl.kt", m80624l = {23}, m80625m = "get")
public final class C27719OooOO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97778OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27721OooOOo0 f97779OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27721OooOOo0 f97780OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97781OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97782OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27719OooOO0o(C27721OooOOo0 c27721OooOOo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97780OooOoO = c27721OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97781OooOoO0 = obj;
        this.f97782OooOoOO |= Integer.MIN_VALUE;
        return this.f97780OooOoO.OooO0o0(null, this);
    }
}

package o0OOoO0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: o0OOoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.migration.MigrationGuard", m80623f = "MigrationGuard.kt", m80624l = {49, 69}, m80625m = "clearMigratingMetas")
public final class C27711OooO00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97733OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27715OooO0o f97734OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97735OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33898OooO0Oo f97736OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27715OooO0o f97737OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97738OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27711OooO00o(C27715OooO0o c27715OooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97737OooOoOO = c27715OooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97735OooOoO = obj;
        this.f97738OooOoo0 |= Integer.MIN_VALUE;
        return this.f97737OooOoOO.OooO00o(null, this);
    }
}

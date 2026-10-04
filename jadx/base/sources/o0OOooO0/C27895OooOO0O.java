package o0OOooO0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOooO0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager", m80623f = "CloudLockManager.kt", m80624l = {659, 663}, m80625m = "loadLockLease")
public final class C27895OooOO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98620OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27883OooO00o f98621OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27883OooO00o f98622OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98623OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98624OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27895OooOO0O(C27883OooO00o c27883OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98622OooOoO = c27883OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98623OooOoO0 = obj;
        this.f98624OooOoOO |= Integer.MIN_VALUE;
        return this.f98622OooOoO.OooO(null, this);
    }
}

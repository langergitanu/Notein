package o0OOooO0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOooO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager", m80623f = "CloudLockManager.kt", m80624l = {615, 615}, m80625m = "acquireLock")
public final class C27888OooO0OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27883OooO00o f98580OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f98581OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98582OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27888OooO0OO(C27883OooO00o c27883OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98580OooOo = c27883OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98581OooOo0o = obj;
        this.f98582OooOoO0 |= Integer.MIN_VALUE;
        return this.f98580OooOo.OooO0Oo(null, null, this);
    }
}

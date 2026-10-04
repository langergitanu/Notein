package o0OOoO0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.scheduler.SyncScheduler", m80623f = "SyncScheduler.kt", m80624l = {203, 206}, m80625m = "stop")
public final class C27769OooOOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f98089OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27755OooO0Oo f98090OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27755OooO0Oo f98091OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98092OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98093OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27769OooOOo0(C27755OooO0Oo c27755OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98091OooOoO = c27755OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98092OooOoO0 = obj;
        this.f98093OooOoOO |= Integer.MIN_VALUE;
        return this.f98091OooOoO.OooOOo0(false, this);
    }
}

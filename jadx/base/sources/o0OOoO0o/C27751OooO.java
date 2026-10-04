package o0OOoO0o;

import com.orion.notein.domain.models.cloudsync.SyncEvent;
import java.util.concurrent.ConcurrentLinkedDeque;
import o0OOoO0o.C27755OooO0Oo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.scheduler.SyncScheduler", m80623f = "SyncScheduler.kt", m80624l = {414}, m80625m = "processProcessingMetaQueue")
public final class C27751OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97973OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27755OooO0Oo f97974OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ConcurrentLinkedDeque f97975OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C27755OooO0Oo.OooO0O0 f97976OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public SyncEvent f97977OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f97978OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97979OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f97980OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C27755OooO0Oo f97981OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f97982Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27751OooO(C27755OooO0Oo c27755OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97981OooOooo = c27755OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97980OooOooO = obj;
        this.f97982Oooo000 |= Integer.MIN_VALUE;
        return this.f97981OooOooo.OooO(0, null, this);
    }
}

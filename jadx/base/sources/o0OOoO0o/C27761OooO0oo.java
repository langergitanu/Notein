package o0OOoO0o;

import com.aspose.words.StyleIdentifier;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.scheduler.SyncScheduler", m80623f = "SyncScheduler.kt", m80624l = {StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6}, m80625m = "handleWorkerLoopError")
public final class C27761OooO0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98042OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27755OooO0Oo f98043OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27755OooO0Oo f98044OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98045OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98046OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27761OooO0oo(C27755OooO0Oo c27755OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98044OooOoO = c27755OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98045OooOoO0 = obj;
        this.f98046OooOoOO |= Integer.MIN_VALUE;
        return this.f98044OooOoO.OooO0oo(null, this);
    }
}

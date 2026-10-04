package o0OOoO0O;

import com.orion.notein.domain.models.cloudsync.SyncEvent;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0O.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.processor.SyncEventProcessor", m80623f = "SyncEventProcessor.kt", m80624l = {170, 177, 184, 198, 203}, m80625m = "checkPreconditions")
public final class C27748OooOo0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SyncEvent f97947OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97948OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27750OooOoO0 f97949OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97950OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97951OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27748OooOo0o(C27750OooOoO0 c27750OooOoO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97949OooOoO = c27750OooOoO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97950OooOoO0 = obj;
        this.f97951OooOoOO |= Integer.MIN_VALUE;
        return this.f97949OooOoO.OooO00o(null, this);
    }
}

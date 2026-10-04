package o0OOoO0O;

import com.orion.notein.domain.models.cloudsync.SyncContext;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.processor.StateTransition", m80623f = "StateTransition.kt", m80624l = {141}, m80625m = "updateSessionContext")
public final class C27743OooOOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97927OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27746OooOo00 f97928OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public SyncContext f97929OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f97930OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f97931OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f97932OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27746OooOo00 f97933OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27743OooOOoo(C27746OooOo00 c27746OooOo00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97933OooOoo0 = c27746OooOo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97931OooOoOO = obj;
        this.f97932OooOoo |= Integer.MIN_VALUE;
        return this.f97933OooOoo0.OooO0OO(null, null, null, null, this);
    }
}

package o0OOoO0O;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.SyncState;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.processor.StateTransition", m80623f = "StateTransition.kt", m80624l = {67, 81}, m80625m = "execute")
public final class C27742OooOOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f97916OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97917OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public SyncState f97918OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudMetaLocal f97919OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public SyncState f97920OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f97921OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97922OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f97923OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ Object f97924OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ C27746OooOo00 f97925Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f97926Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27742OooOOo0(C27746OooOo00 c27746OooOo00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97925Oooo000 = c27746OooOo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97924OooOooo = obj;
        this.f97926Oooo00O |= Integer.MIN_VALUE;
        return this.f97925Oooo000.OooO00o(null, null, this);
    }
}

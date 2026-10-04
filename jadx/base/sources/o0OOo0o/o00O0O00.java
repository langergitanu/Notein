package o0OOo0o;

import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.INoteinDisplayItem;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {619, 622, 623, 624, 625}, m80625m = "getDualLinkRefBySourceId")
public final class o00O0O00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public INoteinDisplayItem f95972OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f95973OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f95974OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public DualLinkRef f95975OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95976OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f95977OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(C27449o00O0OoO c27449o00O0OoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95976OooOoOO = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95974OooOoO = obj;
        this.f95977OooOoo0 |= Integer.MIN_VALUE;
        return this.f95976OooOoOO.OooOOoo(null, null, this);
    }
}

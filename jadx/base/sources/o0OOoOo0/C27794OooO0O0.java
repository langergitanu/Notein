package o0OOoOo0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.CreateLabelUseCase", m80623f = "CreateLabelUseCase.kt", m80624l = {77}, m80625m = "createItemLabelRef")
public final class C27794OooO0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27798OooO0o0 f98179OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f98180OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98181OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27794OooO0O0(C27798OooO0o0 c27798OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98179OooOo = c27798OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98180OooOo0o = obj;
        this.f98181OooOoO0 |= Integer.MIN_VALUE;
        return this.f98179OooOo.OooO0O0(0, 0L, null, null, this);
    }
}

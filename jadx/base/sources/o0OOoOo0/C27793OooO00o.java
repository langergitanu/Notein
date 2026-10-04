package o0OOoOo0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.CreateLabelUseCase", m80623f = "CreateLabelUseCase.kt", m80624l = {48}, m80625m = "checkLabelNameExist")
public final class C27793OooO00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f98175OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Long f98176OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f98177OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27798OooO0o0 f98178OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27793OooO00o(C27798OooO0o0 c27798OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98178OooOoO0 = c27798OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98175OooOo = obj;
        this.f98177OooOoO |= Integer.MIN_VALUE;
        return this.f98178OooOoO0.OooO00o(null, null, this);
    }
}

package o0OOoo0O;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.AddPaletteToColorSetUseCase", m80623f = "AddPaletteToColorSetUseCase.kt", m80624l = {22}, m80625m = "isApplied")
public final class C27835OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27837OooO0o0 f98337OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f98338OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98339OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27835OooO0Oo(C27837OooO0o0 c27837OooO0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98337OooOo = c27837OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98338OooOo0o = obj;
        this.f98339OooOoO0 |= Integer.MIN_VALUE;
        return this.f98337OooOo.OooO00o(null, this);
    }
}

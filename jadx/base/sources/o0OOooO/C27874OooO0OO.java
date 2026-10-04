package o0OOooO;

import java.util.List;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.pagelayer.PageLayerUseCase", m80623f = "PageLayerUseCase.kt", m80624l = {100, 106}, m80625m = "changePageLayersOrder")
public final class C27874OooO0OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f98510OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27881OooOO0O f98511OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27881OooOO0O f98512OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98513OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98514OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27874OooO0OO(C27881OooOO0O c27881OooOO0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98512OooOoO = c27881OooOO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98513OooOoO0 = obj;
        this.f98514OooOoOO |= Integer.MIN_VALUE;
        return this.f98512OooOoO.OooO0OO(null, null, this);
    }
}

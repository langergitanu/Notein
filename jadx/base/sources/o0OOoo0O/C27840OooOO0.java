package o0OOoo0O;

import com.orion.notein.domain.models.material.MaterialOperationContext;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoo0O.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.ApplyMaterialUseCase", m80623f = "ApplyMaterialUseCase.kt", m80624l = {29, 36, 41}, m80625m = "execute")
public final class C27840OooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f98355OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f98356OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f98357OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public MaterialOperationContext f98358OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27831OooO f98359OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f98360OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27840OooOO0(C27831OooO c27831OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98359OooOoOO = c27831OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98357OooOoO = obj;
        this.f98360OooOoo0 |= Integer.MIN_VALUE;
        return this.f98359OooOoOO.OooO00o(null, this);
    }
}

package o0OOooO;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.pagelayer.PageLayerUseCase", m80623f = "PageLayerUseCase.kt", m80624l = {82, 90}, m80625m = "activePageLayer")
public final class C27872OooO00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98498OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27881OooOO0O f98499OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27881OooOO0O f98500OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98501OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98502OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27872OooO00o(C27881OooOO0O c27881OooOO0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98500OooOoO = c27881OooOO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98501OooOoO0 = obj;
        this.f98502OooOoOO |= Integer.MIN_VALUE;
        return this.f98500OooOoO.OooO00o(null, null, this);
    }
}

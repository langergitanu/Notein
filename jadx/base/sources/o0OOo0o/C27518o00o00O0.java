package o0OOo0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00o00O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase", m80623f = "StickerUseCase.kt", m80624l = {717, 723}, m80625m = "adoptOrphanStickers")
public final class C27518o00o00O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f96440OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27538o00o0o0O f96441OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96442OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f96443OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96444OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27518o00o00O0(C27538o00o0o0O c27538o00o0o0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96442OooOoO = c27538o00o0o0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96443OooOoO0 = obj;
        this.f96444OooOoOO |= Integer.MIN_VALUE;
        return this.f96442OooOoO.OooO0o0(null, this);
    }
}

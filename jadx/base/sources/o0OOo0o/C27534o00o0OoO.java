package o0OOo0o;

import com.orion.notein.domain.models.sticker.StickerCollection;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00o0OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase", m80623f = "StickerUseCase.kt", m80624l = {728, 732, 735, 737, 751}, m80625m = "resetAllStickersUserId")
public final class C27534o00o0OoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f96510OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27538o00o0o0O f96511OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f96512OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public StickerCollection f96513OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96514OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f96515OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27534o00o0OoO(C27538o00o0o0O c27538o00o0o0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96514OooOoOO = c27538o00o0o0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96512OooOoO = obj;
        this.f96515OooOoo0 |= Integer.MIN_VALUE;
        return this.f96514OooOoOO.OooO0oO(null, this);
    }
}

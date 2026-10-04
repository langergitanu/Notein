package o0OOo0o;

import com.orion.notein.domain.models.page.Page;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00O0Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {1901}, m80625m = "getNextPageThemeOld")
public final class C27448o00O0Oo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Page f96029OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f96030OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96031OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f96032OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96033OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27448o00O0Oo0(C27449o00O0OoO c27449o00O0OoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96031OooOoO = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96032OooOoO0 = obj;
        this.f96033OooOoOO |= Integer.MIN_VALUE;
        return this.f96031OooOoO.OooOo0o(null, null, this);
    }
}

package o0OOo0o;

import com.orion.notein.domain.models.page.Image;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {470, 474, 476}, m80625m = "fillPlaceholderImageIfNecessary")
public final class oo00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Image f97017OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97018OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97019OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f97020OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f97021OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97022OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(C27449o00O0OoO c27449o00O0OoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97021OooOoOO = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97019OooOoO = obj;
        this.f97022OooOoo0 |= Integer.MIN_VALUE;
        return C27449o00O0OoO.OooO0O0(this.f97021OooOoOO, null, null, this);
    }
}

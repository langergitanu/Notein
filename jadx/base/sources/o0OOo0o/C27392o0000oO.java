package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteCreationUseCase$createPdfNotesByPlaceholder$2$1", m80623f = "NoteCreationUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL}, m80625m = "invokeSuspend")
public final class C27392o0000oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o000OO f95485OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95486OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ PaperTheme f95487OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NotePlaceHolder f95488OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27392o0000oO(o000OO o000oo2, NotePlaceHolder notePlaceHolder, PaperTheme paperTheme, Continuation<? super C27392o0000oO> continuation) {
        super(2, continuation);
        this.f95485OooOo = o000oo2;
        this.f95488OooOoO0 = notePlaceHolder;
        this.f95487OooOoO = paperTheme;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27392o0000oO(this.f95485OooOo, this.f95488OooOoO0, this.f95487OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27392o0000oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95486OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f95486OooOo0o = 1;
            if (this.f95485OooOo.OooO0o(this.f95488OooOoO0, this.f95487OooOoO, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

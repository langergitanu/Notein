package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00Oo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$updateNoteContent$2", m80623f = "NoteUseCase.kt", m80624l = {StyleIdentifier.BIBLIOGRAPHY, StyleIdentifier.TOC_HEADING}, m80625m = "invokeSuspend")
public final class C27480o00Oo0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96294OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96295OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteContent f96296OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27480o00Oo0O0(C27449o00O0OoO c27449o00O0OoO, NoteContent noteContent, Continuation<? super C27480o00Oo0O0> continuation) {
        super(2, continuation);
        this.f96294OooOo = c27449o00O0OoO;
        this.f96296OooOoO0 = noteContent;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27480o00Oo0O0(this.f96294OooOo, this.f96296OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27480o00Oo0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r3.OoooOo0(r7, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96295OooOo0o;
        NoteContent noteContent = this.f96296OooOoO0;
        C27449o00O0OoO c27449o00O0OoO = this.f96294OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
            this.f96295OooOo0o = 1;
            if (interfaceC27309OooOoO.OooO0oO(noteContent, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        String id = noteContent.getId();
        this.f96295OooOo0o = 2;
    }
}

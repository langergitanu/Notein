package o0o0OO0;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o0OO0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.ScannedPageSelectorViewModel$setNoteInputSource$1", m80623f = "PdfPageSelectorViewModel.kt", m80624l = {194}, m80625m = "invokeSuspend")
public final class C30412Oooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30418Oooo0o0 f108607OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108608OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AiOcrSessionInputSource f108609OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108610OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30412Oooo(C30418Oooo0o0 c30418Oooo0o0, String str, AiOcrSessionInputSource aiOcrSessionInputSource, Continuation<? super C30412Oooo> continuation) {
        super(2, continuation);
        this.f108607OooOo = c30418Oooo0o0;
        this.f108610OooOoO0 = str;
        this.f108609OooOoO = aiOcrSessionInputSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30412Oooo(this.f108607OooOo, this.f108610OooOoO0, this.f108609OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30412Oooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108608OooOo0o;
        C30418Oooo0o0 c30418Oooo0o0 = this.f108607OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = c30418Oooo0o0.f108649OooO0o0;
            this.f108608OooOo0o = 1;
            obj = c27449o00O0OoO.OooOoO0(this.f108610OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        NoteContent noteContent = (NoteContent) obj;
        if (noteContent == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33781o00o0O c33781o00o0O = c30418Oooo0o0.f108656OooOOO0;
        Integer num = new Integer(noteContent.getPages().size());
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, num);
        AiOcrSessionInputSource aiOcrSessionInputSource = this.f108609OooOoO;
        C33781o00o0O c33781o00o0O2 = c30418Oooo0o0.f108652OooOO0;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, aiOcrSessionInputSource);
        return C32460OooOooO.f116667OooO00o;
    }
}

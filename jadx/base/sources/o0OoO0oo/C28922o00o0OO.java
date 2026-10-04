package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27457o00O0o0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.o00o0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$noteHasCover$2", m80623f = "NoteEditorViewModel.kt", m80624l = {754}, m80625m = "invokeSuspend")
public final class C28922o00o0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102461OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102462OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28922o00o0OO(C23344OooOOo c23344OooOOo, Continuation<? super C28922o00o0OO> continuation) {
        super(2, continuation);
        this.f102461OooOo = c23344OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28922o00o0OO(this.f102461OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C28922o00o0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        C23344OooOOo c23344OooOOo = this.f102461OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102462OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Page page = (Page) oOo000Oo.OooOo.Oooo0oO(((NoteContent) c23344OooOOo.f73592OoooOoo.f121747OooOo0o.getValue()).getPages());
                String id = ((NoteContent) c23344OooOOo.f73592OoooOoo.f121747OooOo0o.getValue()).getId();
                C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
                String id2 = page.getId();
                this.f102462OooOo0o = 1;
                c27449o00O0OoO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27457o00O0o0o(id2, id, null, c27449o00O0OoO), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return Boolean.valueOf(((Page) obj).getPaperTheme() instanceof LocalResPaperTheme);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}

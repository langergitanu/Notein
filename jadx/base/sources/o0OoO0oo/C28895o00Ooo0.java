package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00Ooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$addNewPage$2", m80623f = "NoteEditorViewModel.kt", m80624l = {1467, 1477, 1479, 1489}, m80625m = "invokeSuspend")
public final class C28895o00Ooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f102369OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f102370OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102371OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102372OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28895o00Ooo0(C23344OooOOo c23344OooOOo, String str, Continuation<? super C28895o00Ooo0> continuation) {
        super(2, continuation);
        this.f102372OooOoO0 = c23344OooOOo;
        this.f102371OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28895o00Ooo0(this.f102372OooOoO0, this.f102371OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C28895o00Ooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[PHI: r1 r10
      0x00a0: PHI (r1v14 com.orion.notein.domain.models.note.NoteContent) = (r1v13 com.orion.notein.domain.models.note.NoteContent), (r1v19 com.orion.notein.domain.models.note.NoteContent) binds: [B:32:0x009d, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r10v12 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:32:0x009d, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NoteContent noteContent;
        Page page;
        int size;
        C27449o00O0OoO c27449o00O0OoO;
        Page page2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102369OooOo;
        C23344OooOOo c23344OooOOo = this.f102372OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO2 = c23344OooOOo.f73545OooO0Oo;
            String id = ((NoteContent) c23344OooOOo.f73592OoooOoo.f121747OooOo0o.getValue()).getId();
            this.f102369OooOo = 1;
            obj = c27449o00O0OoO2.OooOoO0(id, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                noteContent = (NoteContent) this.f102370OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
                C27449o00O0OoO c27449o00O0OoO3 = c23344OooOOo.f73545OooO0Oo;
                this.f102370OooOo0o = noteContent;
                this.f102369OooOo = 3;
                obj = c27449o00O0OoO3.OooOo0O(noteContent, (Page) obj, this);
                if (obj != enumC32485OooO00o) {
                    page = (Page) obj;
                    size = noteContent.getPages().size();
                    c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
                    this.f102370OooOo0o = page;
                    this.f102369OooOo = 4;
                    if (c27449o00O0OoO.OooO0OO(noteContent, page, size, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                page2 = (Page) this.f102370OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return page2.getId();
            }
            noteContent = (NoteContent) this.f102370OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            page = (Page) obj;
            size = noteContent.getPages().size();
            c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
            this.f102370OooOo0o = page;
            this.f102369OooOo = 4;
            if (c27449o00O0OoO.OooO0OO(noteContent, page, size, this) != enumC32485OooO00o) {
                page2 = page;
                return page2.getId();
            }
            return enumC32485OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent2 = (NoteContent) obj;
        if (noteContent2 == null || noteContent2.getUnboundedNote()) {
            return null;
        }
        String id2 = ((Page) oOo000Oo.OooOo.OoooOOo(noteContent2.getPages())).getId();
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(id2, this.f102371OooOoO)) {
            return null;
        }
        C27020OooOoO0 c27020OooOoO0 = c23344OooOOo.f73552OooOO0o;
        String id3 = noteContent2.getId();
        this.f102370OooOo0o = noteContent2;
        this.f102369OooOo = 2;
        Object objOooO0Oo = c27020OooOoO0.OooO0Oo(id2, id3, this);
        if (objOooO0Oo != enumC32485OooO00o) {
            noteContent = noteContent2;
            obj = objOooO0Oo;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
            C27449o00O0OoO c27449o00O0OoO32 = c23344OooOOo.f73545OooO0Oo;
            this.f102370OooOo0o = noteContent;
            this.f102369OooOo = 3;
            obj = c27449o00O0OoO32.OooOo0O(noteContent, (Page) obj, this);
            if (obj != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}

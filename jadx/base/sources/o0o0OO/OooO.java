package o0o0OO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$addPage$2", m80623f = "TiledPageViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_5, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, StyleIdentifier.GRID_TABLE_2_ACCENT_6}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f108303OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteContent f108304OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30367OooO0o0 f108305OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(Continuation continuation, C30367OooO0o0 c30367OooO0o0) {
        super(2, continuation);
        this.f108305OooOoO0 = c30367OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO(continuation, this.f108305OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r6.OooO0OO(r1, (com.orion.notein.domain.models.page.Page) r10, r2, r9) != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String id;
        NoteContent noteContent;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108303OooOo;
        C30367OooO0o0 c30367OooO0o0 = this.f108305OooOoO0;
        C27449o00O0OoO c27449o00O0OoO = c30367OooO0o0.f108328OooO0Oo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteContent noteContent2 = (NoteContent) c30367OooO0o0.f108339OooOOOo.f121747OooOo0o.getValue();
            Page page = (Page) oOo000Oo.OooOo.OoooOo0(noteContent2.getPages());
            if (page == null || (id = page.getId()) == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            String id2 = noteContent2.getId();
            this.f108304OooOo0o = noteContent2;
            this.f108303OooOo = 1;
            Object objOooO0Oo = c30367OooO0o0.f108329OooO0o.OooO0Oo(id, id2, this);
            if (objOooO0Oo != enumC32485OooO00o) {
                noteContent = noteContent2;
                obj = objOooO0Oo;
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            noteContent = this.f108304OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            noteContent = this.f108304OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            int size = noteContent.getPages().size();
            this.f108304OooOo0o = null;
            this.f108303OooOo = 3;
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
        this.f108304OooOo0o = noteContent;
        this.f108303OooOo = 2;
        obj = c27449o00O0OoO.OooOo0O(noteContent, (Page) obj, this);
        if (obj != enumC32485OooO00o) {
            int size2 = noteContent.getPages().size();
            this.f108304OooOo0o = null;
            this.f108303OooOo = 3;
        }
        return enumC32485OooO00o;
    }
}

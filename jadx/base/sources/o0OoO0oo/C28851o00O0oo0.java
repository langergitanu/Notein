package o0OoO0oo;

import Oooo0.C20860Ooooooo;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00O0oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$handlePageRotateEvent$1", m80623f = "NoteEditorFragment.kt", m80624l = {6096}, m80625m = "invokeSuspend")
public final class C28851o00O0oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f102178OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28694OooOO0O f102179OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Page.RotationDirection f102180OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102181OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28851o00O0oo0(NoteEditorFragment noteEditorFragment, Page.RotationDirection rotationDirection, Continuation<? super C28851o00O0oo0> continuation) {
        super(2, continuation);
        this.f102181OooOoO0 = noteEditorFragment;
        this.f102180OooOoO = rotationDirection;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28851o00O0oo0(this.f102181OooOoO0, this.f102180OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28851o00O0oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        C28694OooOO0O c28694OooOO0O;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102178OooOo;
        NoteEditorFragment noteEditorFragment = this.f102181OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28694OooOO0O c28694OooOO0O2 = (C28694OooOO0O) noteEditorFragment.OoooOO0().f73606o00o0O.f121747OooOo0o.getValue();
            if (c28694OooOO0O2 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorFragment");
                c20358OooO00o.OooOO0O("handlePageRotateEvent, editorVO is null.", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            int currentPage = pDFView.getCurrentPage();
            String str = (String) oOo000Oo.OooOo.OoooO00(currentPage, c28694OooOO0O2.f101668OooO0O0);
            if (str == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o2, "NoteEditorFragment", "handlePageRotateEvent currentPage is null. index: ", currentPage), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(str);
            this.f102179OooOo0o = c28694OooOO0O2;
            this.f102178OooOo = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28930o00o0o(this.f102180OooOoO, c28694OooOO0O2.f101667OooO00o, c23344OooOOoOoooOO0, listOooO0oO, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
            c28694OooOO0O = c28694OooOO0O2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28694OooOO0O = this.f102179OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        noteEditorFragment.OooooOO(c28694OooOO0O, true);
        return C32460OooOooO.f116667OooO00o;
    }
}

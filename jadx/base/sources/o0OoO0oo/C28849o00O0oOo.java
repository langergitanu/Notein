package o0OoO0oo;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.C22212OooOoO0;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.coroutines.Continuation;
import o0Oo00oO.C28038OooO0Oo;
import oO00ooO.C32443OooOOO;
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

/* JADX INFO: renamed from: o0OoO0oo.o00O0oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$handleDualLinkSourceItem$1", m80623f = "NoteEditorFragment.kt", m80624l = {2976, 2978}, m80625m = "invokeSuspend")
public final class C28849o00O0oOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f102171OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public DualLinkRef f102172OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102173OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102174OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28849o00O0oOo(NoteEditorFragment noteEditorFragment, String str, Continuation<? super C28849o00O0oOo> continuation) {
        super(2, continuation);
        this.f102174OooOoO0 = noteEditorFragment;
        this.f102173OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28849o00O0oOo(this.f102174OooOoO0, this.f102173OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28849o00O0oOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final DualLinkRef dualLinkRef;
        Page page;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102171OooOo;
        final NoteEditorFragment noteEditorFragment = this.f102174OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            this.f102171OooOo = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28910o00o000O(c23344OooOOoOoooOO0, this.f102173OooOoO, null), this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dualLinkRef = this.f102172OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            page = (Page) obj;
            if (page != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
            RectF bounds = dualLinkRef.getBounds();
            oooOO02.getClass();
            final PointF pointFOooO0OO = o00OO0O0.OooO0O0.OooO0OO(o0oo000O.OooOO0.OooO0oO(page, bounds));
            if (noteEditorFragment.OoooO0().OooOOOo(dualLinkRef.getNoteId(), dualLinkRef.getPageId(), new PointF(0.0f, 0.0f), dualLinkRef.getId())) {
                noteEditorFragment.Oooooo0(dualLinkRef.getPageId(), dualLinkRef.getId(), pointFOooO0OO, true);
            } else {
                LockNoteFragment lockNoteFragment = noteEditorFragment.f73012Oooo0oO;
                if (lockNoteFragment != null) {
                    LockNoteFragment.OooOoo(lockNoteFragment, C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), com.facebook.soloader.OooOo.OooO0oO(dualLinkRef.getNoteId()), new oO0O000o.OooO00o() { // from class: o0OoO0oo.o00O0oOO
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
                        @Override // oO0O000o.OooO00o
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke() {
                            NoteEditorFragment noteEditorFragment2 = noteEditorFragment;
                            int iIntValue = ((Number) ((C32443OooOOO) noteEditorFragment2.OoooO0().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue();
                            DualLinkRef dualLinkRef2 = dualLinkRef;
                            PointF pointF = pointFOooO0OO;
                            if (iIntValue == 0) {
                                Context contextRequireContext = noteEditorFragment2.requireContext();
                                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                                if (C28038OooO0Oo.OooO0O0(contextRequireContext)) {
                                    noteEditorFragment2.OoooO0().OooOo00(dualLinkRef2.getNoteId(), ((Number) noteEditorFragment2.OoooO0().f73393OoooOOO.getValue()).intValue(), dualLinkRef2.getPageId(), pointF, dualLinkRef2.getId());
                                } else {
                                    noteEditorFragment2.OoooooO(dualLinkRef2.getNoteId(), dualLinkRef2.getPageId(), pointF, dualLinkRef2.getId(), true);
                                }
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    });
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        DualLinkRef dualLinkRef2 = (DualLinkRef) obj;
        if (dualLinkRef2 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C23344OooOOo c23344OooOOoOoooOO02 = noteEditorFragment.OoooOO0();
        String pageId = dualLinkRef2.getPageId();
        String noteId = dualLinkRef2.getNoteId();
        this.f102172OooOo0o = dualLinkRef2;
        this.f102171OooOo = 2;
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28913o00o00Oo(c23344OooOOoOoooOO02, pageId, noteId, null), this);
        if (objOooO0o != enumC32485OooO00o) {
            dualLinkRef = dualLinkRef2;
            obj = objOooO0o;
            page = (Page) obj;
            if (page != null) {
            }
        }
        return enumC32485OooO00o;
    }
}

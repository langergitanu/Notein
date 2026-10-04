package o0o000oo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import o0Oo0o00.C28201OooooO0;
import o0OoO0oo.C28755o00000o0;
import o0OoO0oo.C28758o0000O;
import o0OoO0oo.C28982oo0o0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnDataSyncBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1937, 1943}, m80625m = "invokeSuspend")
public final class C29830OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105824OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105825OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29830OooOooo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29830OooOooo> continuation) {
        super(2, continuation);
        this.f105824OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29830OooOooo(this.f105824OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29830OooOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String id;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105825OooOo0o;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105824OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f105825OooOo0o = 1;
            obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 9, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(baseToolbarChildFragment), o0oo000O.OooOO0O.OooO00o(contextRequireContext) ? R.id.cloudSyncLoginDialogFragment : R.id.cloudSyncLoginContainerFragment, null);
                return C32460OooOooO.f116667OooO00o;
            }
            C28755o00000o0 c28755o00000o0 = baseToolbarChildFragment.f76506o000oOoO;
            if (c28755o00000o0 != null) {
                NoteEditorContainerFragment noteEditorContainerFragment = c28755o00000o0.f101844OooO00o;
                NoteContent noteContent = (NoteContent) noteEditorContainerFragment.Oooo00O().f73396OoooOoO.f121747OooOo0o.getValue();
                if (noteContent != null && (id = noteContent.getId()) != null) {
                    C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C28758o0000O(noteEditorContainerFragment, id, null), 3);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        C28201OooooO0 c28201OooooO0 = (C28201OooooO0) baseToolbarChildFragment.f76478OooOoo0.getValue();
        this.f105825OooOo0o = 2;
        obj = c28201OooooO0.OooO(this);
    }
}

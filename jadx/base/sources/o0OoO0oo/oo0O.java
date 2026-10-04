package o0OoO0oo;

import android.graphics.RectF;
import android.view.View;
import com.aspose.slides.C22212OooOoO0;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditorPanel;
import com.orion.penkit.models.TextBoxInfo;
import kotlin.coroutines.Continuation;
import o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
public final class oo0O implements ViewOnAttachStateChangeListenerC26064o000000o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102698OooO00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$17$onMoveToNextLayer$1", m80623f = "NoteEditorFragment.kt", m80624l = {4140}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102699OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102700OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextBoxInfo f102701OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorFragment noteEditorFragment, TextBoxInfo textBoxInfo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102699OooOo = noteEditorFragment;
            this.f102701OooOoO0 = textBoxInfo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102699OooOo, this.f102701OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102700OooOo0o;
            NoteEditorFragment noteEditorFragment = this.f102699OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f102700OooOo0o = 1;
                obj = NoteEditorFragment.Oooo000(27, noteEditorFragment, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                PageLayer pageLayerOooOO0o = noteEditorFragment.o000oOoO().OooOO0o(com.facebook.soloader.OooOo.OooO0oO(this.f102701OooOoO0));
                if (pageLayerOooOO0o == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                noteEditorFragment.OoooO0().Oooo0o0(true);
                NoteEditorFragment.Oooo0OO(noteEditorFragment, pageLayerOooOO0o.getId());
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$17$onMoveToPreviousLayer$1", m80623f = "NoteEditorFragment.kt", m80624l = {4154}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102702OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102703OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextBoxInfo f102704OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorFragment noteEditorFragment, TextBoxInfo textBoxInfo, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f102702OooOo = noteEditorFragment;
            this.f102704OooOoO0 = textBoxInfo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f102702OooOo, this.f102704OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102703OooOo0o;
            NoteEditorFragment noteEditorFragment = this.f102702OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f102703OooOo0o = 1;
                obj = NoteEditorFragment.Oooo000(27, noteEditorFragment, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                PageLayer pageLayerOooOOO0 = noteEditorFragment.o000oOoO().OooOOO0(com.facebook.soloader.OooOo.OooO0oO(this.f102704OooOoO0));
                if (pageLayerOooOOO0 == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                noteEditorFragment.OoooO0().Oooo0o0(true);
                NoteEditorFragment.Oooo0OO(noteEditorFragment, pageLayerOooOOO0.getId());
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public oo0O(NoteEditorFragment noteEditorFragment) {
        this.f102698OooO00o = noteEditorFragment;
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO(TextBoxInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        TextEditorPanel textEditorPanel = this.f102698OooO00o.f73022OoooOoO;
        if (textEditorPanel != null) {
            textEditorPanel.OooO0oO(0, info);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO00o(View v, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        TextEditorPanel textEditorPanel = this.f102698OooO00o.f73022OoooOoO;
        if (textEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
        if (z) {
            textEditorPanel.f74081OooOoO = new RectF(v.getX(), v.getY(), v.getX() + v.getWidth(), v.getY() + v.getHeight());
        } else {
            textEditorPanel.f74081OooOoO = null;
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0O0(TextBoxInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        TextEditorPanel textEditorPanel = this.f102698OooO00o.f73022OoooOoO;
        if (textEditorPanel != null) {
            textEditorPanel.OooO0oO(3, info);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0OO(TextBoxInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        NoteEditorFragment noteEditorFragment = this.f102698OooO00o;
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO00o(noteEditorFragment, info, null), 3);
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0Oo(TextBoxInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        TextEditorPanel textEditorPanel = this.f102698OooO00o.f73022OoooOoO;
        if (textEditorPanel != null) {
            textEditorPanel.OooO0oO(2, info);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0o(TextBoxInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        TextEditorPanel textEditorPanel = this.f102698OooO00o.f73022OoooOoO;
        if (textEditorPanel != null) {
            textEditorPanel.OooO0oO(4, info);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0o0(TextBoxInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        TextEditorPanel textEditorPanel = this.f102698OooO00o.f73022OoooOoO;
        if (textEditorPanel != null) {
            textEditorPanel.OooO0oO(1, info);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0oO(TextBoxInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        NoteEditorFragment noteEditorFragment = this.f102698OooO00o;
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO0O0(noteEditorFragment, info, null), 3);
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0oo() {
        TextEditorPanel.OooO00o oooO00o;
        TextEditorPanel textEditorPanel = this.f102698OooO00o.f73022OoooOoO;
        if (textEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
        TextEditor textEditor = textEditorPanel.f74079OooOo;
        if (textEditor == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        if (textEditor.getVisibility() == 0 && (oooO00o = textEditorPanel.textEditorEventListener) != null) {
            TextEditor textEditor2 = textEditorPanel.f74079OooOo;
            if (textEditor2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("textEditor");
                throw null;
            }
            oooO00o.OooO0oo(textEditor2.OooO0Oo(), false);
        }
        TextEditor textEditor3 = textEditorPanel.f74079OooOo;
        if (textEditor3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        textEditor3.OooO0o0();
        View view = textEditorPanel.f74080OooOo0o;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("insertTips");
            throw null;
        }
        view.setVisibility(8);
        textEditorPanel.setVisibility(8);
    }
}

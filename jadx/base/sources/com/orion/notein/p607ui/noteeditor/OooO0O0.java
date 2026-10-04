package com.orion.notein.p607ui.noteeditor;

import Oooo0oO.C21030OooOO0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.o0OoOo0;
import com.aspose.words.EditingLanguage;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import kotlin.coroutines.Continuation;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28982oo0o0Oo;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29066OooOo0O;
import o0o00Ooo.C29920OooO0oo;
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

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements TextStyleBox.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f73343OooO00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTextBoxStyleBar$1$onImportFontClick$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {EditingLanguage.f50775YI}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorContainerFragment f73344OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73345OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f73344OooOo = noteEditorContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f73344OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73345OooOo0o;
            NoteEditorContainerFragment noteEditorContainerFragment = this.f73344OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f73345OooOo0o = 1;
                obj = NoteEditorContainerFragment.OooOoo0(noteEditorContainerFragment, 7, this);
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
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorContainerFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_importFontDialogFragment));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTextBoxStyleBar$1$onTextColorSetSelected$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {EditingLanguage.YORUBA}, m80625m = "invokeSuspend")
    public static final class C19262OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29920OooO0oo f73346OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73347OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteEditorContainerFragment f73348OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19262OooO0O0(C29920OooO0oo c29920OooO0oo, NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C19262OooO0O0> continuation) {
            super(2, continuation);
            this.f73346OooOo = c29920OooO0oo;
            this.f73348OooOoO0 = noteEditorContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19262OooO0O0(this.f73346OooOo, this.f73348OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19262OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73347OooOo0o;
            NoteEditorContainerFragment noteEditorContainerFragment = this.f73348OooOoO0;
            C29920OooO0oo c29920OooO0oo = this.f73346OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (c29920OooO0oo.f106162OooO0o == 2) {
                    this.f73347OooOo0o = 1;
                    obj = NoteEditorContainerFragment.OooOoo0(noteEditorContainerFragment, 20, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                C29051OooOO0o c29051OooOO0o = (C29051OooOO0o) noteEditorContainerFragment.f72824OoooO00.getValue();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29051OooOO0o);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29066OooOo0O(c29051OooOO0o, c29920OooO0oo, null), 2);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                C29051OooOO0o c29051OooOO0o2 = (C29051OooOO0o) noteEditorContainerFragment.f72824OoooO00.getValue();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c29051OooOO0o2);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29066OooOo0O(c29051OooOO0o2, c29920OooO0oo, null), 2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO0O0(NoteEditorContainerFragment noteEditorContainerFragment) {
        this.f73343OooO00o = noteEditorContainerFragment;
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox.OooO00o
    public final void OooO00o() {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f73343OooO00o;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(noteEditorContainerFragment), null, null, new OooO00o(noteEditorContainerFragment, null), 3);
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox.OooO00o
    public final void OooO0O0(C29920OooO0oo c29920OooO0oo) {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f73343OooO00o;
        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C19262OooO0O0(c29920OooO0oo, noteEditorContainerFragment, null), 3);
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox.OooO00o
    public final void OooO0OO() {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f73343OooO00o;
        noteEditorContainerFragment.Oooo00O().Oooo0oO(OooO0OO.OooO00o.f73441OooOo0o);
        noteEditorContainerFragment.Oooo0OO(6, Boolean.FALSE);
    }
}

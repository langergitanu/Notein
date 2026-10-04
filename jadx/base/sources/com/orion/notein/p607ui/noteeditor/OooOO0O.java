package com.orion.notein.p607ui.noteeditor;

import androidx.transition.OooOOOO;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditorPanel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooo.C26395Oooo0o0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$20", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f73520OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f73521OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$20$1", m80623f = "NoteEditorFragment.kt", m80624l = {4234}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f73522OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73523OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19265OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73524OooOo0o;

            public C19265OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f73524OooOo0o = noteEditorFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                PenInfo penInfo = (PenInfo) obj;
                if (penInfo != null) {
                    NoteEditorFragment.Oooo00o(this.f73524OooOo0o, penInfo);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f73522OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f73522OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73523OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f73522OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = noteEditorFragment.OoooOOO();
                C19265OooO00o c19265OooO00o = new C19265OooO00o(noteEditorFragment);
                this.f73523OooOo0o = 1;
                if (oooO0O0OoooOOO.f75183OoooOO0.f121747OooOo0o.collect(c19265OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$20$2", m80623f = "NoteEditorFragment.kt", m80624l = {4240}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f73525OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73526OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73527OooOo0o;

            public OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f73527OooOo0o = noteEditorFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                PDFView.EnumC22832OooO0Oo enumC22832OooO0Oo;
                OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) obj;
                NoteEditorFragment noteEditorFragment = this.f73527OooOo0o;
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                if (pDFView.getEditMode() == PDFView.EnumC22832OooO0Oo.f69315OooOo0o) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int iOrdinal = oooO00o.ordinal();
                if (iOrdinal == 0) {
                    enumC22832OooO0Oo = PDFView.EnumC22832OooO0Oo.f69314OooOo;
                } else if (iOrdinal == 1) {
                    enumC22832OooO0Oo = PDFView.EnumC22832OooO0Oo.f69317OooOoO0;
                } else if (iOrdinal == 2) {
                    enumC22832OooO0Oo = PDFView.EnumC22832OooO0Oo.f69316OooOoO;
                } else if (iOrdinal == 3) {
                    enumC22832OooO0Oo = PDFView.EnumC22832OooO0Oo.f69318OooOoOO;
                } else {
                    if (iOrdinal != 4) {
                        throw new C32442OooOO0o();
                    }
                    enumC22832OooO0Oo = PDFView.EnumC22832OooO0Oo.f69320OooOoo0;
                }
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 != null) {
                    pDFView2.setEditMode(enumC22832OooO0Oo);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f73525OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f73525OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73526OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f73525OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                OooO00o oooO00o = new OooO00o(noteEditorFragment);
                this.f73526OooOo0o = 1;
                if (oooO0OOOoooO0.f73422o00Ooo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$20$3", m80623f = "NoteEditorFragment.kt", m80624l = {4257}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f73528OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73529OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$20$3$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73530OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f73531OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73530OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f73530OooOo, continuation);
                oooO00o.f73531OooOo0o = ((Number) obj).intValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                int i = this.f73531OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f73530OooOo;
                if (i == noteEditorFragment.getId()) {
                    PDFView pDFView = noteEditorFragment.f73015OoooO0;
                    if (pDFView == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    if (pDFView.getEditMode() == PDFView.EnumC22832OooO0Oo.f69317OooOoO0) {
                        TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
                        if (textEditorPanel == null) {
                            OooOOO0.OooOOOO("textEditorPanel");
                            throw null;
                        }
                        if (textEditorPanel.getVisibility() != 0) {
                            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                            if (pDFView2 == null) {
                                OooOOO0.OooOOOO("editor");
                                throw null;
                            }
                            pDFView2.setEditMode(PDFView.EnumC22832OooO0Oo.f69314OooOo);
                        }
                    }
                } else {
                    PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
                    if (pDFView3 == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    if (pDFView3.f69177Oooo0O0 == PDFView.OooO.f69293OooOoO0) {
                        C26395Oooo0o0 c26395Oooo0o0 = pDFView3.f69170OooOooO.f69109OooO0O0;
                        if (c26395Oooo0o0 != null ? c26395Oooo0o0.OooO0o0() : false) {
                            pDFView3.f69180Oooo0o0.OooO0O0(true, false);
                        }
                    }
                }
                NoteEditorFragment.Ooooo0o(noteEditorFragment, false, 3);
                noteEditorFragment.f73044o00000oo.sendEmptyMessage(13);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f73528OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f73528OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73529OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f73528OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                this.f73529OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOoooO0.f73394OoooOOo, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOO0O$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$20$4", m80623f = "NoteEditorFragment.kt", m80624l = {4275}, m80625m = "invokeSuspend")
    public static final class C23341OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f73532OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73533OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOO0O$OooO0Oo$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f73534OooOo0o;

            public OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f73534OooOo0o = noteEditorFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PDFView pDFView = this.f73534OooOo0o.f73015OoooO0;
                if (pDFView != null) {
                    pDFView.setLayoutChangingDueToSplitScreen(zBooleanValue);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23341OooO0Oo(NoteEditorFragment noteEditorFragment, Continuation<? super C23341OooO0Oo> continuation) {
            super(2, continuation);
            this.f73532OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23341OooO0Oo(this.f73532OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C23341OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73533OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorFragment noteEditorFragment = this.f73532OooOo;
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
            OooO00o oooO00o = new OooO00o(noteEditorFragment);
            this.f73533OooOo0o = 1;
            oooO0OOOoooO0.f73390OoooO00.collect(oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(NoteEditorFragment noteEditorFragment, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f73520OooOo = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOO0O oooOO0O = new OooOO0O(this.f73520OooOo, continuation);
        oooOO0O.f73521OooOo0o = obj;
        return oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f73521OooOo0o;
        NoteEditorFragment noteEditorFragment = this.f73520OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23341OooO0Oo(noteEditorFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

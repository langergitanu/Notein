package o0OoO0oo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.aspose.slides.C22212OooOoO0;
import com.aspose.words.EditingLanguage;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.overscroll.OverScrollImageView;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00OO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initAddPageIndicator$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28853o00OO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102187OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102188OooOo0o;

    /* JADX INFO: renamed from: o0OoO0oo.o00OO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initAddPageIndicator$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {2071}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102189OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102190OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00OO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initAddPageIndicator$1$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19939OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f102191OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f102192OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19939OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super C19939OooO00o> continuation) {
                super(2, continuation);
                this.f102191OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19939OooO00o c19939OooO00o = new C19939OooO00o(this.f102191OooOo, continuation);
                c19939OooO00o.f102192OooOo0o = ((Number) obj).intValue();
                return c19939OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((C19939OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                int i = this.f102192OooOo0o;
                NoteEditorFragment noteEditorFragment = this.f102191OooOo;
                View view = noteEditorFragment.f73019OoooOOO;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addPageIndicator");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams;
                if (i == 0) {
                    oooO00o.f63876OooO = -1;
                    oooO00o.f63887OooOO0o = 0;
                    oooO00o.f63897OooOo00 = 0;
                    oooO00o.f63898OooOo0O = 0;
                    ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin = 0;
                    oooO00o.setMarginEnd(0);
                } else {
                    oooO00o.f63876OooO = 0;
                    oooO00o.f63887OooOO0o = 0;
                    ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin = 0;
                    oooO00o.f63897OooOo00 = -1;
                    oooO00o.f63898OooOo0O = 0;
                    oooO00o.setMarginEnd(0);
                }
                View view2 = noteEditorFragment.f73019OoooOOO;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addPageIndicator");
                    throw null;
                }
                view2.setLayoutParams(oooO00o);
                ImageView imageView = noteEditorFragment.f73020OoooOOo;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addPageArrowIcon");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) layoutParams2;
                if (i == 0) {
                    OverScrollImageView overScrollImageView = noteEditorFragment.f73021OoooOo0;
                    if (overScrollImageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPageIndicator");
                        throw null;
                    }
                    oooO00o2.f63897OooOo00 = overScrollImageView.getId();
                    OverScrollImageView overScrollImageView2 = noteEditorFragment.f73021OoooOo0;
                    if (overScrollImageView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPageIndicator");
                        throw null;
                    }
                    oooO00o2.f63898OooOo0O = overScrollImageView2.getId();
                    oooO00o2.f63876OooO = -1;
                    oooO00o2.f63887OooOO0o = -1;
                    oooO00o2.f63896OooOo0 = -1;
                    OverScrollImageView overScrollImageView3 = noteEditorFragment.f73021OoooOo0;
                    if (overScrollImageView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPageIndicator");
                        throw null;
                    }
                    oooO00o2.f63886OooOO0O = overScrollImageView3.getId();
                    ((ViewGroup.MarginLayoutParams) oooO00o2).bottomMargin = Oooo0.o000000O.OooO0o(4);
                    oooO00o2.setMarginEnd(0);
                } else {
                    oooO00o2.f63897OooOo00 = -1;
                    oooO00o2.f63898OooOo0O = -1;
                    OverScrollImageView overScrollImageView4 = noteEditorFragment.f73021OoooOo0;
                    if (overScrollImageView4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPageIndicator");
                        throw null;
                    }
                    oooO00o2.f63876OooO = overScrollImageView4.getId();
                    OverScrollImageView overScrollImageView5 = noteEditorFragment.f73021OoooOo0;
                    if (overScrollImageView5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPageIndicator");
                        throw null;
                    }
                    oooO00o2.f63887OooOO0o = overScrollImageView5.getId();
                    OverScrollImageView overScrollImageView6 = noteEditorFragment.f73021OoooOo0;
                    if (overScrollImageView6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPageIndicator");
                        throw null;
                    }
                    oooO00o2.f63896OooOo0 = overScrollImageView6.getId();
                    oooO00o2.f63886OooOO0O = -1;
                    oooO00o2.setMarginEnd(Oooo0.o000000O.OooO0o(4));
                    ((ViewGroup.MarginLayoutParams) oooO00o2).bottomMargin = 0;
                }
                ImageView imageView2 = noteEditorFragment.f73020OoooOOo;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("addPageArrowIcon");
                    throw null;
                }
                imageView2.setLayoutParams(oooO00o2);
                ImageView imageView3 = noteEditorFragment.f73020OoooOOo;
                if (imageView3 != null) {
                    imageView3.setRotation(i == 0 ? 0.0f : -90.0f);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("addPageArrowIcon");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102189OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102189OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102190OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102189OooOo;
                C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                C19939OooO00o c19939OooO00o = new C19939OooO00o(noteEditorFragment, null);
                this.f102190OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23344OooOOoOoooOO0.f73605o00Ooo, c19939OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoO0oo.o00OO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initAddPageIndicator$1$2", m80623f = "NoteEditorFragment.kt", m80624l = {EditingLanguage.TIBETAN_BUTAN}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102193OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102194OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00OO0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initAddPageIndicator$1$2$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f102195OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f102195OooOo0o = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f102195OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102195OooOo0o;
                C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new o00Oo00(((Number) noteEditorFragment.OoooOO0().f73605o00Ooo.f121747OooOo0o.getValue()).intValue(), noteEditorFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f102193OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f102193OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102194OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102193OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                this.f102194OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOoooO0.f73372OooOoOO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28853o00OO0(NoteEditorFragment noteEditorFragment, Continuation<? super C28853o00OO0> continuation) {
        super(2, continuation);
        this.f102187OooOo = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28853o00OO0 c28853o00OO0 = new C28853o00OO0(this.f102187OooOo, continuation);
        c28853o00OO0.f102188OooOo0o = obj;
        return c28853o00OO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28853o00OO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f102188OooOo0o;
        NoteEditorFragment noteEditorFragment = this.f102187OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28026OooO0OO;
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
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.o0000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2", m80623f = "NoteEditorContainerFragment.kt", m80624l = {2038}, m80625m = "invokeSuspend")
public final class C28769o0000Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101871OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101872OooOo0o;

    /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorContainerFragment f101873OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f101874OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {2040}, m80625m = "invokeSuspend")
        public static final class C19925OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f101875OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101876OooOo0o;

            /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19926OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f101877OooOo0o;

                public C19926OooO00o(NoteEditorContainerFragment noteEditorContainerFragment) {
                    this.f101877OooOo0o = noteEditorContainerFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Context context;
                    int iIntValue = ((Number) obj).intValue();
                    final NoteEditorContainerFragment noteEditorContainerFragment = this.f101877OooOo0o;
                    if (noteEditorContainerFragment.f72844o00Ooo != iIntValue && !noteEditorContainerFragment.f72845o00o0O && (context = noteEditorContainerFragment.getContext()) != null) {
                        int dimensionPixelSize = noteEditorContainerFragment.Oooo00O().f73410o000000o.getValue() == OooO0O0.OooO00o.f75496OooOo ? context.getResources().getDimensionPixelSize(R.dimen.property_panel_ai_mode_width) : context.getResources().getDimensionPixelSize(R.dimen.property_panel_default_mode_width);
                        Insets insets = (Insets) noteEditorContainerFragment.Oooo00O().f73365OooOo.f121747OooOo0o.getValue();
                        int i = dimensionPixelSize + (insets != null ? insets.right : 0);
                        C32443OooOOO c32443OooOOO = iIntValue == 1 ? new C32443OooOOO(Integer.valueOf(i), Integer.valueOf(Oooo0.o000000O.OooO0o(0))) : new C32443OooOOO(Integer.valueOf(Oooo0.o000000O.OooO0o(0)), Integer.valueOf(i));
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue());
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoO0oo.o00O0O
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int iIntValue2 = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                NoteEditorContainerFragment noteEditorContainerFragment2 = noteEditorContainerFragment;
                                View view = noteEditorContainerFragment2.f72837Oooooo;
                                if (view == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                                    throw null;
                                }
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                kotlin.jvm.internal.OooOOO0.OooO0o(layoutParams, "getLayoutParams(...)");
                                layoutParams.width = iIntValue2;
                                View view2 = noteEditorContainerFragment2.f72837Oooooo;
                                if (view2 != null) {
                                    view2.requestLayout();
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                                    throw null;
                                }
                            }
                        });
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfInt);
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.setDuration(300L);
                        animatorSet.addListener(new C28756o00000oO(noteEditorContainerFragment, iIntValue));
                        animatorSet.start();
                    }
                    if (noteEditorContainerFragment.f72844o00Ooo == iIntValue && noteEditorContainerFragment.f72845o00o0O) {
                        noteEditorContainerFragment.Oooo00O().Oooo0o(iIntValue == 1 ? 0 : 1);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19925OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C19925OooO00o> continuation) {
                super(2, continuation);
                this.f101875OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19925OooO00o(this.f101875OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19925OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101876OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101875OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                C19926OooO00o c19926OooO00o = new C19926OooO00o(noteEditorContainerFragment);
                this.f101876OooOo0o = 1;
                oooO0OOOooo00O.f73408o000000.collect(c19926OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$2", m80623f = "NoteEditorContainerFragment.kt", m80624l = {2056}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f101878OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101879OooOo0o;

            /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19927OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f101880OooOo0o;

                /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
                public /* synthetic */ class C19928OooO00o {

                    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                    public static final /* synthetic */ int[] f101881OooO00o;

                    static {
                        int[] iArr = new int[OooO0O0.OooO00o.values().length];
                        try {
                            OooO0O0.OooO00o oooO00o = OooO0O0.OooO00o.f75497OooOo0o;
                            iArr[1] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f101881OooO00o = iArr;
                    }
                }

                public C19927OooO00o(NoteEditorContainerFragment noteEditorContainerFragment) {
                    this.f101880OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int i = C19928OooO00o.f101881OooO00o[((OooO0O0.OooO00o) obj).ordinal()];
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101880OooOo0o;
                    if (i == 1) {
                        View view = noteEditorContainerFragment.f72837Oooooo;
                        if (view == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = Oooo0.o000000O.OooO0o(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
                        }
                    } else {
                        View view2 = noteEditorContainerFragment.f72837Oooooo;
                        if (view2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = Oooo0.o000000O.OooO0o(200);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f101878OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f101878OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101879OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101878OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                C19927OooO00o c19927OooO00o = new C19927OooO00o(noteEditorContainerFragment);
                this.f101879OooOo0o = 1;
                oooO0OOOooo00O.f73410o000000o.collect(c19927OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$3", m80623f = "NoteEditorContainerFragment.kt", m80624l = {2069}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f101882OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101883OooOo0o;

            /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$3$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19929OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f101884OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19929OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C19929OooO00o> continuation) {
                    super(2, continuation);
                    this.f101884OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19929OooO00o(this.f101884OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19929OooO00o) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    String id;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101884OooOo0o;
                    NoteContent noteContent = (NoteContent) noteEditorContainerFragment.Oooo00O().f73396OoooOoO.f121747OooOo0o.getValue();
                    if (noteContent == null || (id = noteContent.getId()) == null) {
                        id = noteEditorContainerFragment.OooOooo().f101859OooO00o;
                    }
                    String str = noteEditorContainerFragment.OooOooo().f101860OooO0O0;
                    C21030OooOO0o.OooO0OO(noteEditorContainerFragment).OooOOo0();
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(noteEditorContainerFragment), R.id.noteEditorContainerFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, id), new C32443OooOOO("sourceFolderId", str)));
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f101882OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f101882OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101883OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101882OooOo;
                    C33772OooooOo c33772OooooOo = noteEditorContainerFragment.Oooo00O().f73428o0OO00O;
                    C19929OooO00o c19929OooO00o = new C19929OooO00o(noteEditorContainerFragment, null);
                    this.f101883OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19929OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$4", m80623f = "NoteEditorContainerFragment.kt", m80624l = {2075}, m80625m = "invokeSuspend")
        public static final class C28770OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f101885OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101886OooOo0o;

            /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$4$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19930OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f101887OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19930OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C19930OooO00o> continuation) {
                    super(2, continuation);
                    this.f101887OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19930OooO00o(this.f101887OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19930OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101887OooOo0o;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                    Context contextRequireContext = noteEditorContainerFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(oooO0OOOooo00O);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28822o000oo00(oooO0OOOooo00O, contextRequireContext, null), 2);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28770OooO0Oo(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C28770OooO0Oo> continuation) {
                super(2, continuation);
                this.f101885OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C28770OooO0Oo(this.f101885OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C28770OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101886OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101885OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                    C19930OooO00o c19930OooO00o = new C19930OooO00o(noteEditorContainerFragment, null);
                    this.f101886OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73374OooOoo0, c19930OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$6", m80623f = "NoteEditorContainerFragment.kt", m80624l = {2090}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f101888OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101889OooOo0o;

            /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$6$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19931OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f101890OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f101891OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19931OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C19931OooO00o> continuation) {
                    super(2, continuation);
                    this.f101890OooOo = noteEditorContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19931OooO00o c19931OooO00o = new C19931OooO00o(this.f101890OooOo, continuation);
                    c19931OooO00o.f101891OooOo0o = ((Boolean) obj).booleanValue();
                    return c19931OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19931OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f101891OooOo0o;
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101890OooOo;
                    if (z) {
                        DrawerLayout drawerLayout = noteEditorContainerFragment.f72813Oooo000;
                        if (drawerLayout == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("drawer");
                            throw null;
                        }
                        drawerLayout.OooOOOo();
                    } else {
                        DrawerLayout drawerLayout2 = noteEditorContainerFragment.f72813Oooo000;
                        if (drawerLayout2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("drawer");
                            throw null;
                        }
                        drawerLayout2.OooO0Oo(true);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f101888OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f101888OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101889OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101888OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                    C19931OooO00o c19931OooO00o = new C19931OooO00o(noteEditorContainerFragment, null);
                    this.f101889OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73420o00O0O, c19931OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$5", m80623f = "NoteEditorContainerFragment.kt", m80624l = {2081}, m80625m = "invokeSuspend")
        public static final class C28771OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f101892OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101893OooOo0o;

            /* JADX INFO: renamed from: o0OoO0oo.o0000Ooo$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initTopBarGroup$2$1$5$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19932OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f101894OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f101895OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19932OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C19932OooO00o> continuation) {
                    super(2, continuation);
                    this.f101894OooOo = noteEditorContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19932OooO00o c19932OooO00o = new C19932OooO00o(this.f101894OooOo, continuation);
                    c19932OooO00o.f101895OooOo0o = ((Boolean) obj).booleanValue();
                    return c19932OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19932OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f101895OooOo0o;
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101894OooOo;
                    View view = noteEditorContainerFragment.f72830OoooOoO;
                    if (view != null) {
                        view.setVisibility(z ? 0 : 8);
                    }
                    View view2 = noteEditorContainerFragment.getView();
                    if (view2 != null) {
                        ViewCompat.requestApplyInsets(view2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28771OooO0o0(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C28771OooO0o0> continuation) {
                super(2, continuation);
                this.f101892OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C28771OooO0o0(this.f101892OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C28771OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101893OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101892OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                    C19932OooO00o c19932OooO00o = new C19932OooO00o(noteEditorContainerFragment, null);
                    this.f101893OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73423o00o0O, c19932OooO00o, this) == enumC32485OooO00o) {
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
        public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f101873OooOo = noteEditorContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f101873OooOo, continuation);
            oooO00o.f101874OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f101874OooOo0o;
            NoteEditorContainerFragment noteEditorContainerFragment = this.f101873OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19925OooO00o(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C28770OooO0Oo(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C28771OooO0o0(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(noteEditorContainerFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28769o0000Ooo(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C28769o0000Ooo> continuation) {
        super(2, continuation);
        this.f101871OooOo = noteEditorContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28769o0000Ooo(this.f101871OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28769o0000Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101872OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            NoteEditorContainerFragment noteEditorContainerFragment = this.f101871OooOo;
            OooO00o oooO00o = new OooO00o(noteEditorContainerFragment, null);
            this.f101872OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(noteEditorContainerFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

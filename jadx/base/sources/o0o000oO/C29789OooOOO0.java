package o0o000oO;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OoO0oo.C28971o0OO00O;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOOo.C29096OooO0Oo;
import o0o00Ooo.C29920OooO0oo;
import o0oOoOo.C31083OooooO0;
import o0oOoOo.C31087Oooooo0;
import o0oOoOo.C31089Ooooooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29789OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextStyleBarChildFragment f105710OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f105711OooOo0o;

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$7", m80623f = "TextStyleBarChildFragment.kt", m80624l = {455}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105712OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105713OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$7$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Float, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105714OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ float f105715OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105714OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105714OooOo, continuation);
                oooO00o.f105715OooOo0o = ((Number) obj).floatValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Float f, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(Float.valueOf(f.floatValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                float f = this.f105715OooOo0o;
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105714OooOo;
                Context context = textStyleBarChildFragment.getContext();
                if (context != null) {
                    TextView textView = textStyleBarChildFragment.f76438Oooo0O0;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontLineHeight");
                        throw null;
                    }
                    textView.setText(context.getString(R.string.line_spacing_desc, String.format("%.1f", Arrays.copyOf(new Object[]{new Float(f)}, 1))));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f105712OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO(this.f105712OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105713OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105712OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105713OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102907OooOOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {404}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105716OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105717OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$1$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20023OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29920OooO0oo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105718OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105719OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20023OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super C20023OooO00o> continuation) {
                super(2, continuation);
                this.f105718OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C20023OooO00o c20023OooO00o = new C20023OooO00o(this.f105718OooOo, continuation);
                c20023OooO00o.f105719OooOo0o = obj;
                return c20023OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C29920OooO0oo> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C20023OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<C29920OooO0oo> list = (List) this.f105719OooOo0o;
                o0o00Ooo.OooOO0 oooOO02 = this.f105718OooOo.f76452OoooOoO;
                if (oooOO02 != null) {
                    oooOO02.OooOO0(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105716OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f105716OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105717OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105716OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                C20023OooO00o c20023OooO00o = new C20023OooO00o(textStyleBarChildFragment, null);
                this.f105717OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102901OooOO0O, c20023OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$10", m80623f = "TextStyleBarChildFragment.kt", m80624l = {474}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105720OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105721OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$10$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31089Ooooooo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105722OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105723OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105722OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105722OooOo, continuation);
                oooO00o.f105723OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31089Ooooooo> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f105722OooOo.f76444OoooO.OooO0Oo((List) this.f105723OooOo0o);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f105720OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f105720OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105721OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105720OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105721OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102908OooOOo0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$11", m80623f = "TextStyleBarChildFragment.kt", m80624l = {479}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105724OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105725OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0OO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$11$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31083OooooO0>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105726OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105727OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105726OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105726OooOo, continuation);
                oooO00o.f105727OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31083OooooO0> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List list = (List) this.f105727OooOo0o;
                C29096OooO0Oo c29096OooO0Oo = this.f105726OooOo.f76456OooooO0;
                if (c29096OooO0Oo != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    c29096OooO0Oo.f103116OooO0O0.OooO0Oo(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f105724OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f105724OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105725OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105724OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105725OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102906OooOOOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$2", m80623f = "TextStyleBarChildFragment.kt", m80624l = {410}, m80625m = "invokeSuspend")
    public static final class C29790OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105728OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105729OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$2$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105730OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f105731OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105730OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105730OooOo, continuation);
                oooO00o.f105731OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f105731OooOo0o;
                ImageView imageView = this.f105730OooOo.f76441Oooo0o0;
                if (imageView != null) {
                    imageView.setSelected(z);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("ivStarTextColor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29790OooO0Oo(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super C29790OooO0Oo> continuation) {
            super(2, continuation);
            this.f105728OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29790OooO0Oo(this.f105728OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29790OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105729OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105728OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105729OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102905OooOOOO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$4", m80623f = "TextStyleBarChildFragment.kt", m80624l = {430}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105732OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105733OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$4$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105734OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f105735OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105734OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105734OooOo, continuation);
                oooO00o.f105735OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                int dimensionPixelSize;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f105735OooOo0o;
                final TextStyleBarChildFragment textStyleBarChildFragment = this.f105734OooOo;
                ConstraintLayout constraintLayout = textStyleBarChildFragment.f76432OooOooo;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
                    throw null;
                }
                int height = constraintLayout.getHeight();
                if (z) {
                    ConstraintLayout constraintLayout2 = textStyleBarChildFragment.f76432OooOooo;
                    if (constraintLayout2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
                        throw null;
                    }
                    dimensionPixelSize = constraintLayout2.getResources().getDimensionPixelSize(R.dimen.text_style_bar_height);
                } else {
                    dimensionPixelSize = 0;
                }
                ConstraintLayout constraintLayout3 = textStyleBarChildFragment.f76432OooOooo;
                if (constraintLayout3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
                    throw null;
                }
                if ((constraintLayout3.getVisibility() == 0) == z) {
                    ConstraintLayout constraintLayout4 = textStyleBarChildFragment.f76432OooOooo;
                    if (constraintLayout4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
                        throw null;
                    }
                    constraintLayout4.getLayoutParams().height = dimensionPixelSize;
                    ConstraintLayout constraintLayout5 = textStyleBarChildFragment.f76432OooOooo;
                    if (constraintLayout5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
                        throw null;
                    }
                    constraintLayout5.requestLayout();
                } else {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, dimensionPixelSize);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(valueAnimatorOfInt);
                    valueAnimatorOfInt.addListener(new C29798OooOOoo(textStyleBarChildFragment));
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0o000oO.OooO0O0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int iIntValue = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                            TextStyleBarChildFragment textStyleBarChildFragment2 = textStyleBarChildFragment;
                            ConstraintLayout constraintLayout6 = textStyleBarChildFragment2.f76432OooOooo;
                            if (constraintLayout6 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
                                throw null;
                            }
                            constraintLayout6.getLayoutParams().height = iIntValue;
                            ConstraintLayout constraintLayout7 = textStyleBarChildFragment2.f76432OooOooo;
                            if (constraintLayout7 != null) {
                                constraintLayout7.requestLayout();
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clRootView");
                                throw null;
                            }
                        }
                    });
                    valueAnimatorOfInt.addListener(new C29796OooOOo(textStyleBarChildFragment, z));
                    valueAnimatorOfInt.addListener(new C29797OooOOo0(textStyleBarChildFragment, z));
                    valueAnimatorOfInt.setDuration(150L);
                    valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                    valueAnimatorOfInt.start();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f105732OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0o(this.f105732OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105733OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105732OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.OooO0OO) textStyleBarChildFragment.f76430OooOoo0.getValue();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105733OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OO.f73435oo000o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$3", m80623f = "TextStyleBarChildFragment.kt", m80624l = {416}, m80625m = "invokeSuspend")
    public static final class C29791OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105736OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105737OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$3$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0OO.OooO00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105738OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105739OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105738OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105738OooOo, continuation);
                oooO00o.f105739OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooO0OO.OooO00o oooO00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) this.f105739OooOo0o;
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105738OooOo;
                textStyleBarChildFragment.OooOoo0();
                boolean z = oooO00o == OooO0OO.OooO00o.f73440OooOo;
                ImageView imageView = textStyleBarChildFragment.f76435Oooo000;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivTextBox");
                    throw null;
                }
                imageView.setActivated(z);
                ConstraintLayout constraintLayout = textStyleBarChildFragment.f76436Oooo00O;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clTextBox");
                    throw null;
                }
                constraintLayout.setVisibility(z ? 0 : 8);
                ConstraintLayout constraintLayout2 = textStyleBarChildFragment.f76439Oooo0OO;
                if (constraintLayout2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clFontColorList");
                    throw null;
                }
                constraintLayout2.setVisibility(z ? 0 : 8);
                ConstraintLayout constraintLayout3 = textStyleBarChildFragment.f76440Oooo0o;
                if (constraintLayout3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clTextStyle");
                    throw null;
                }
                constraintLayout3.setVisibility(z ? 0 : 8);
                ConstraintLayout constraintLayout4 = textStyleBarChildFragment.f76445OoooO0;
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(z ? 0 : 8);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29791OooO0o0(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super C29791OooO0o0> continuation) {
            super(2, continuation);
            this.f105736OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29791OooO0o0(this.f105736OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29791OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105737OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105736OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.OooO0OO) textStyleBarChildFragment.f76430OooOoo0.getValue();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105737OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OO.f73422o00Ooo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$5", m80623f = "TextStyleBarChildFragment.kt", m80624l = {436}, m80625m = "invokeSuspend")
    public static final class C29792OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105740OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105741OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$5$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105742OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105743OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105742OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105742OooOo, continuation);
                oooO00o.f105743OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                String string = (String) this.f105743OooOo0o;
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105742OooOo;
                TextView textView = textStyleBarChildFragment.f76437Oooo00o;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontName");
                    throw null;
                }
                if (string.length() == 0) {
                    Context context = textStyleBarChildFragment.getContext();
                    if (context == null || (string = context.getString(R.string.default_font)) == null) {
                        string = "";
                    }
                } else {
                    Integer numOooO00o = C31087Oooooo0.OooO00o.OooO00o(string);
                    if (numOooO00o != null) {
                        int iIntValue = numOooO00o.intValue();
                        Context context2 = textStyleBarChildFragment.getContext();
                        String string2 = context2 != null ? context2.getString(iIntValue) : null;
                        if (string2 != null) {
                            string = string2;
                        }
                    }
                }
                textView.setText(string);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29792OooO0oO(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super C29792OooO0oO> continuation) {
            super(2, continuation);
            this.f105740OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29792OooO0oO(this.f105740OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29792OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105741OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105740OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105741OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102909OooOOoo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$6", m80623f = "TextStyleBarChildFragment.kt", m80624l = {446}, m80625m = "invokeSuspend")
    public static final class C29793OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105744OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105745OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooO0oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$6$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105746OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f105747OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105746OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105746OooOo, continuation);
                oooO00o.f105747OooOo0o = ((Number) obj).intValue();
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
                int i = this.f105747OooOo0o;
                TextView textView = this.f105746OooOo.f76434Oooo0;
                if (textView != null) {
                    textView.setText(i == -1 ? "..." : String.valueOf(i - 10));
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontSize");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29793OooO0oo(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super C29793OooO0oo> continuation) {
            super(2, continuation);
            this.f105744OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29793OooO0oo(this.f105744OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29793OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105745OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105744OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105745OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102914OooOo0o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooOO0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$8", m80623f = "TextStyleBarChildFragment.kt", m80624l = {464}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105748OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105749OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooOO0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$8$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31087Oooooo0>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105750OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105751OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105750OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105750OooOo, continuation);
                oooO00o.f105751OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31087Oooooo0> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<C31087Oooooo0> list = (List) this.f105751OooOo0o;
                com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o = this.f105750OooOo.f76455Ooooo0o;
                if (oooO00o != null) {
                    oooO00o.OooO0Oo(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f105748OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOO0(this.f105748OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105749OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105748OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105749OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102913OooOo0O, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooOO0O */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$9", m80623f = "TextStyleBarChildFragment.kt", m80624l = {469}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextStyleBarChildFragment f105752OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105753OooOo0o;

        /* JADX INFO: renamed from: o0o000oO.OooOOO0$OooOO0O$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textstylebar.TextStyleBarChildFragment$onViewInitialed$13$9$1", m80623f = "TextStyleBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenColorVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBarChildFragment f105754OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105755OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105754OooOo = textStyleBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105754OooOo, continuation);
                oooO00o.f105755OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenColorVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f105754OooOo.f76448OoooOO0.OooO0Oo((List) this.f105755OooOo0o);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f105752OooOo = textStyleBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOO0O(this.f105752OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105753OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextStyleBarChildFragment textStyleBarChildFragment = this.f105752OooOo;
                C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
                OooO00o oooO00o = new OooO00o(textStyleBarChildFragment, null);
                this.f105753OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0oOooOoOO.f102903OooOOO, oooO00o, this) == enumC32485OooO00o) {
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
    public C29789OooOOO0(TextStyleBarChildFragment textStyleBarChildFragment, Continuation<? super C29789OooOOO0> continuation) {
        super(2, continuation);
        this.f105710OooOo = textStyleBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29789OooOOO0 c29789OooOOO0 = new C29789OooOOO0(this.f105710OooOo, continuation);
        c29789OooOOO0.f105711OooOo0o = obj;
        return c29789OooOOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29789OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105711OooOo0o;
        TextStyleBarChildFragment textStyleBarChildFragment = this.f105710OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29790OooO0Oo(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29791OooO0o0(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29792OooO0oO(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29793OooO0oo(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0O(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(textStyleBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(textStyleBarChildFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

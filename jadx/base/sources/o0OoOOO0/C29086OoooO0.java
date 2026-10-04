package o0OoOOO0;

import android.text.Editable;
import android.text.Layout;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor;
import com.orion.notein.p607ui.noteeditor.addtext.richeditor.NoteinRichEditor;
import com.orion.notein.richeditor.effects.Effects;
import com.orion.notein.richeditor.effects.ForegroundColorEffect;
import com.orion.notein.richeditor.effects.SpanCollectMode;
import com.orion.notein.richeditor.effects.TypefaceEffect;
import com.orion.notein.richeditor.fonts.RTTypeface;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.spans.TypefaceSpan;
import com.orion.notein.richeditor.utils.Helper;
import com.orion.notein.richeditor.utils.Selection;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0oOoOo.C31085OooooOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoOOO0.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29086OoooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextEditor f103070OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103071OooOo0o;

    /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$1", m80623f = "TextEditor.kt", m80624l = {662}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103072OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103073OooOo0o;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19956OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103074OooOo0o;

            public C19956OooO00o(TextEditor textEditor) {
                this.f103074OooOo0o = textEditor;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                C31085OooooOo c31085OooooOo = (C31085OooooOo) obj;
                String str = c31085OooooOo.f110942OooO00o;
                TextEditor textEditor = this.f103074OooOo0o;
                NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                if (noteinRichEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                boolean z = !noteinRichEditor.hasFocus();
                NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                if (noteinRichEditor2 != null) {
                    noteinRichEditor2.applyEffect(Effects.TYPEFACE, new RTTypeface(str, c31085OooooOo.f110943OooO0O0), z);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TextEditor textEditor, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103072OooOo = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103072OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103073OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            TextEditor textEditor = this.f103072OooOo;
            C29051OooOO0o c29051OooOO0o = textEditor.f74049OooOo0o;
            if (c29051OooOO0o == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C33772OooooOo c33772OooooOo = c29051OooOO0o.f102920OooOooO;
            C19956OooO00o c19956OooO00o = new C19956OooO00o(textEditor);
            this.f103073OooOo0o = 1;
            c33772OooooOo.collect(c19956OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$2", m80623f = "TextEditor.kt", m80624l = {667}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103075OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103076OooOo0o;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$2$1", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103077OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103078OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextEditor textEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103077OooOo = textEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103077OooOo, continuation);
                oooO00o.f103078OooOo0o = obj;
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
                String str = (String) this.f103078OooOo0o;
                int i = TextEditor.f74047Oooo0o0;
                TextEditor textEditor = this.f103077OooOo;
                textEditor.getClass();
                TypefaceEffect typefaceEffect = Effects.TYPEFACE;
                NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                if (noteinRichEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                Editable text = noteinRichEditor.getText();
                NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                if (noteinRichEditor2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                for (RTSpan rTSpan : typefaceEffect.getSpans(text, new Selection(0, noteinRichEditor2.length()), SpanCollectMode.SPAN_FLAGS)) {
                    if ((rTSpan instanceof TypefaceSpan) && kotlin.jvm.internal.OooOOO0.OooO0O0(((TypefaceSpan) rTSpan).getValue().getName(), str)) {
                        NoteinRichEditor noteinRichEditor3 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        Editable text2 = noteinRichEditor3.getText();
                        if (text2 != null) {
                            text2.removeSpan(rTSpan);
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(TextEditor textEditor, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f103075OooOo = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f103075OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103076OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextEditor textEditor = this.f103075OooOo;
                C29051OooOO0o c29051OooOO0o = textEditor.f74049OooOo0o;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                C33772OooooOo c33772OooooOo = c29051OooOO0o.f102924Oooo000;
                OooO00o oooO00o = new OooO00o(textEditor, null);
                this.f103076OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33772OooooOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$3", m80623f = "TextEditor.kt", m80624l = {673}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103079OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103080OooOo0o;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103081OooOo0o;

            public OooO00o(TextEditor textEditor) {
                this.f103081OooOo0o = textEditor;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                int iIntValue = ((Number) obj).intValue();
                TextEditor textEditor = this.f103081OooOo0o;
                NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                if (noteinRichEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                boolean z = !noteinRichEditor.hasFocus();
                NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                if (noteinRichEditor2 != null) {
                    noteinRichEditor2.applyEffect(Effects.FONT_SIZE, Integer.valueOf(iIntValue), z);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(TextEditor textEditor, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f103079OooOo = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f103079OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103080OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            TextEditor textEditor = this.f103079OooOo;
            C29051OooOO0o c29051OooOO0o = textEditor.f74049OooOo0o;
            if (c29051OooOO0o == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C33772OooooOo c33772OooooOo = c29051OooOO0o.f102926Oooo00o;
            OooO00o oooO00o = new OooO00o(textEditor);
            this.f103080OooOo0o = 1;
            c33772OooooOo.collect(oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$4", m80623f = "TextEditor.kt", m80624l = {679}, m80625m = "invokeSuspend")
    public static final class C29087OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103082OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103083OooOo0o;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$4$1", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Float, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103084OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ float f103085OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextEditor textEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103084OooOo = textEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103084OooOo, continuation);
                oooO00o.f103085OooOo0o = ((Number) obj).floatValue();
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
                float f = this.f103085OooOo0o;
                NoteinRichEditor noteinRichEditor = this.f103084OooOo.f74051OooOoO0;
                if (noteinRichEditor != null) {
                    noteinRichEditor.setLineSpacing(0.0f, f);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29087OooO0Oo(TextEditor textEditor, Continuation<? super C29087OooO0Oo> continuation) {
            super(2, continuation);
            this.f103082OooOo = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29087OooO0Oo(this.f103082OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29087OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103083OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextEditor textEditor = this.f103082OooOo;
                C29051OooOO0o c29051OooOO0o = textEditor.f74049OooOo0o;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                C33772OooooOo c33772OooooOo = c29051OooOO0o.f102927Oooo0O0;
                OooO00o oooO00o = new OooO00o(textEditor, null);
                this.f103083OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33772OooooOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$6", m80623f = "TextEditor.kt", m80624l = {691}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103086OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103087OooOo0o;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$6$1", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends Boolean>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103088OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103089OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextEditor textEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103088OooOo = textEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103088OooOo, continuation);
                oooO00o.f103089OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Integer, ? extends Boolean> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f103089OooOo0o;
                int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                boolean zBooleanValue = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
                TextEditor textEditor = this.f103088OooOo;
                NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                if (noteinRichEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                boolean z = !noteinRichEditor.hasFocus();
                switch (iIntValue) {
                    case 0:
                        NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor2.applyEffect(Effects.BOLD, Boolean.valueOf(zBooleanValue), z);
                        break;
                        break;
                    case 1:
                        NoteinRichEditor noteinRichEditor3 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor3.applyEffect(Effects.ITALIC, Boolean.valueOf(zBooleanValue), z);
                        break;
                        break;
                    case 2:
                        NoteinRichEditor noteinRichEditor4 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor4.applyEffect(Effects.UNDERLINE, Boolean.valueOf(zBooleanValue), z);
                        break;
                        break;
                    case 3:
                        NoteinRichEditor noteinRichEditor5 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor5.applyEffect(Effects.BULLET, Boolean.valueOf(zBooleanValue), z);
                        if (zBooleanValue) {
                            textEditor.requestLayout();
                        }
                        break;
                        break;
                    case 4:
                        NoteinRichEditor noteinRichEditor6 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor6.applyEffect(Effects.NUMBER, Boolean.valueOf(zBooleanValue), z);
                        if (zBooleanValue) {
                            textEditor.requestLayout();
                        }
                        break;
                        break;
                    case 5:
                        NoteinRichEditor noteinRichEditor7 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor7.applyEffect(Effects.INDENTATION, Integer.valueOf(Helper.getLeadingMarging()), z);
                        break;
                        break;
                    case 6:
                        NoteinRichEditor noteinRichEditor8 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor8.applyEffect(Effects.INDENTATION, Integer.valueOf(Helper.getLeadingMarging() * (-1)), z);
                        break;
                        break;
                    case 7:
                        NoteinRichEditor noteinRichEditor9 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor9 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor9.applyEffect(Effects.ALIGNMENT, Layout.Alignment.ALIGN_NORMAL, z);
                        break;
                        break;
                    case 8:
                        NoteinRichEditor noteinRichEditor10 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor10 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor10.applyEffect(Effects.ALIGNMENT, Layout.Alignment.ALIGN_CENTER, z);
                        break;
                        break;
                    case 9:
                        NoteinRichEditor noteinRichEditor11 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor11 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor11.applyEffect(Effects.ALIGNMENT, Layout.Alignment.ALIGN_OPPOSITE, z);
                        break;
                        break;
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(TextEditor textEditor, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f103086OooOo = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0o(this.f103086OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103087OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextEditor textEditor = this.f103086OooOo;
                C29051OooOO0o c29051OooOO0o = textEditor.f74049OooOo0o;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                C33772OooooOo c33772OooooOo = c29051OooOO0o.f102922Oooo;
                OooO00o oooO00o = new OooO00o(textEditor, null);
                this.f103087OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33772OooooOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$5", m80623f = "TextEditor.kt", m80624l = {685}, m80625m = "invokeSuspend")
    public static final class C29088OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103090OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103091OooOo0o;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$5$1", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103092OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f103093OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextEditor textEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103092OooOo = textEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103092OooOo, continuation);
                oooO00o.f103093OooOo0o = ((Number) obj).intValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                int i = this.f103093OooOo0o;
                TextEditor textEditor = this.f103092OooOo;
                NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                if (noteinRichEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor.setTextColor(i);
                NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                if (noteinRichEditor2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                ForegroundColorEffect foregroundColorEffect = Effects.FOREGROUND_COLOR;
                Integer numValueOf = Integer.valueOf(i);
                if (textEditor.f74051OooOoO0 != null) {
                    noteinRichEditor2.applyEffect(foregroundColorEffect, numValueOf, !r0.hasFocus());
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29088OooO0o0(TextEditor textEditor, Continuation<? super C29088OooO0o0> continuation) {
            super(2, continuation);
            this.f103090OooOo = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29088OooO0o0(this.f103090OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29088OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103091OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextEditor textEditor = this.f103090OooOo;
                C29051OooOO0o c29051OooOO0o = textEditor.f74049OooOo0o;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                C33772OooooOo c33772OooooOo = c29051OooOO0o.f102930Oooo0o0;
                OooO00o oooO00o = new OooO00o(textEditor, null);
                this.f103091OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33772OooooOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$7", m80623f = "TextEditor.kt", m80624l = {697}, m80625m = "invokeSuspend")
    public static final class C29089OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103094OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103095OooOo0o;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO0$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$listenTextStyleChangedEvent$1$7$1", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103096OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f103097OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextEditor textEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103096OooOo = textEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103096OooOo, continuation);
                oooO00o.f103097OooOo0o = ((Number) obj).intValue();
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
                int i = this.f103097OooOo0o;
                NoteinRichEditor noteinRichEditor = this.f103096OooOo.f74051OooOoO0;
                if (noteinRichEditor != null) {
                    noteinRichEditor.setBackgroundColor(i);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29089OooO0oO(TextEditor textEditor, Continuation<? super C29089OooO0oO> continuation) {
            super(2, continuation);
            this.f103094OooOo = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29089OooO0oO(this.f103094OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29089OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103095OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TextEditor textEditor = this.f103094OooOo;
                C29051OooOO0o c29051OooOO0o = textEditor.f74049OooOo0o;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                C33772OooooOo c33772OooooOo = c29051OooOO0o.f102931Oooo0oO;
                OooO00o oooO00o = new OooO00o(textEditor, null);
                this.f103095OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33772OooooOo, oooO00o, this) == enumC32485OooO00o) {
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
    public C29086OoooO0(TextEditor textEditor, Continuation<? super C29086OoooO0> continuation) {
        super(2, continuation);
        this.f103070OooOo = textEditor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29086OoooO0 c29086OoooO0 = new C29086OoooO0(this.f103070OooOo, continuation);
        c29086OoooO0.f103071OooOo0o = obj;
        return c29086OoooO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29086OoooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103071OooOo0o;
        TextEditor textEditor = this.f103070OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(textEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(textEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(textEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29087OooO0Oo(textEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29088OooO0o0(textEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(textEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29089OooO0oO(textEditor, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

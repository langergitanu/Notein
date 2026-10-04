package o0OoOOO0;

import Oooo0.o000000O;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor;
import com.orion.notein.p607ui.noteeditor.addtext.richeditor.NoteinRichEditor;
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
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: o0OoOOO0.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$initByViewModel$2", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29090OoooO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f103098OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103099OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TextEditor f103100OooOoO0;

    /* JADX INFO: renamed from: o0OoOOO0.OoooO00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$initByViewModel$2$1", m80623f = "TextEditor.kt", m80624l = {138}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103101OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103102OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103103OooOoO0;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO00$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$initByViewModel$2$1$1", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19957OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103104OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103105OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19957OooO00o(TextEditor textEditor, Continuation<? super C19957OooO00o> continuation) {
                super(2, continuation);
                this.f103104OooOo = textEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19957OooO00o c19957OooO00o = new C19957OooO00o(this.f103104OooOo, continuation);
                c19957OooO00o.f103105OooOo0o = ((Boolean) obj).booleanValue();
                return c19957OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19957OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                RectF rectF;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103105OooOo0o;
                TextEditor textEditor = this.f103104OooOo;
                if (z) {
                    int i = TextEditor.f74047Oooo0o0;
                    textEditor.getClass();
                    int iOooO0o = o000000O.OooO0o(120);
                    Rect rect = new Rect();
                    textEditor.getWindowVisibleDisplayFrame(rect);
                    NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                    if (noteinRichEditor == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    boolean z2 = noteinRichEditor.getRotation() == 0.0f;
                    Matrix matrix = new Matrix();
                    if (!z2) {
                        NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float rotation = noteinRichEditor2.getRotation();
                        NoteinRichEditor noteinRichEditor3 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float x = noteinRichEditor3.getX();
                        NoteinRichEditor noteinRichEditor4 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        matrix.postRotate(rotation, x, noteinRichEditor4.getY());
                    }
                    NoteinRichEditor noteinRichEditor5 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    int selectionEnd = noteinRichEditor5.getSelectionEnd();
                    NoteinRichEditor noteinRichEditor6 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    Layout layout = noteinRichEditor6.getLayout();
                    if (layout == null || selectionEnd <= 0) {
                        NoteinRichEditor noteinRichEditor7 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float x2 = noteinRichEditor7.getX();
                        NoteinRichEditor noteinRichEditor8 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float y = noteinRichEditor8.getY();
                        NoteinRichEditor noteinRichEditor9 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor9 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float x3 = noteinRichEditor9.getX();
                        if (textEditor.f74051OooOoO0 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float width = (r10.getWidth() * textEditor.f74056OooOooo) + x3;
                        NoteinRichEditor noteinRichEditor10 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor10 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float y2 = noteinRichEditor10.getY();
                        if (textEditor.f74051OooOoO0 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        rectF = new RectF(x2, y, width, (r11.getHeight() * textEditor.f74056OooOooo) + y2);
                    } else {
                        int lineForOffset = layout.getLineForOffset(selectionEnd);
                        NoteinRichEditor noteinRichEditor11 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor11 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        int i2 = selectionEnd < noteinRichEditor11.length() ? selectionEnd + 1 : selectionEnd;
                        NoteinRichEditor noteinRichEditor12 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor12 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float primaryHorizontal = (layout.getPrimaryHorizontal(selectionEnd) * textEditor.f74056OooOooo) + noteinRichEditor12.getX();
                        NoteinRichEditor noteinRichEditor13 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor13 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float primaryHorizontal2 = (layout.getPrimaryHorizontal(i2) * textEditor.f74056OooOooo) + noteinRichEditor13.getX();
                        float f = 1 + primaryHorizontal;
                        if (primaryHorizontal2 < f) {
                            primaryHorizontal2 = f;
                        }
                        NoteinRichEditor noteinRichEditor14 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor14 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float lineTop = (layout.getLineTop(lineForOffset) * textEditor.f74056OooOooo) + noteinRichEditor14.getY();
                        NoteinRichEditor noteinRichEditor15 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor15 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        rectF = new RectF(primaryHorizontal, lineTop, primaryHorizontal2, (layout.getLineBottom(lineForOffset) * textEditor.f74056OooOooo) + noteinRichEditor15.getY());
                    }
                    RectF rectF2 = new RectF(rectF);
                    if (!z2) {
                        matrix.mapRect(rectF2);
                    }
                    float f2 = rectF2.bottom + iOooO0o;
                    float f3 = rect.bottom;
                    if (f2 > f3) {
                        float f4 = f3 - f2;
                        textEditor.f74055OooOooO -= f4;
                        NoteinRichEditor noteinRichEditor16 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor16 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor16.setTranslationY(noteinRichEditor16.getTranslationY() + f4);
                        textEditor.OooO();
                    }
                } else {
                    NoteinRichEditor noteinRichEditor17 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor17 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    noteinRichEditor17.setTranslationY(noteinRichEditor17.getTranslationY() + textEditor.f74055OooOooO);
                    textEditor.f74055OooOooO = 0.0f;
                    textEditor.OooO();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C29051OooOO0o c29051OooOO0o, TextEditor textEditor, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103101OooOo = c29051OooOO0o;
            this.f103103OooOoO0 = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103101OooOo, this.f103103OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103102OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = this.f103101OooOo.f102917OooOoOO;
                C19957OooO00o c19957OooO00o = new C19957OooO00o(this.f103103OooOoO0, null);
                this.f103102OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19957OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOO0.OoooO00$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$initByViewModel$2$2", m80623f = "TextEditor.kt", m80624l = {144}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103106OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103107OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextEditor f103108OooOoO0;

        /* JADX INFO: renamed from: o0OoOOO0.OoooO00$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextEditor$initByViewModel$2$2$1", m80623f = "TextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Float, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextEditor f103109OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ float f103110OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextEditor textEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103109OooOo = textEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103109OooOo, continuation);
                oooO00o.f103110OooOo0o = ((Number) obj).floatValue();
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
                float f = this.f103110OooOo0o;
                TextEditor textEditor = this.f103109OooOo;
                textEditor.f74056OooOooo = f;
                if (textEditor.getVisibility() != 0) {
                    return C32460OooOooO.f116667OooO00o;
                }
                NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                if (noteinRichEditor == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor.setScaleX(f);
                NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                if (noteinRichEditor2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor2.setScaleY(f);
                textEditor.OooOO0();
                textEditor.OooO();
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C29051OooOO0o c29051OooOO0o, TextEditor textEditor, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f103106OooOo = c29051OooOO0o;
            this.f103108OooOoO0 = textEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f103106OooOo, this.f103108OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103107OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103106OooOo;
                OooO00o oooO00o = new OooO00o(this.f103108OooOoO0, null);
                this.f103107OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0o.f102933OoooO0, oooO00o, this) == enumC32485OooO00o) {
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
    public C29090OoooO00(C29051OooOO0o c29051OooOO0o, TextEditor textEditor, Continuation<? super C29090OoooO00> continuation) {
        super(2, continuation);
        this.f103098OooOo = c29051OooOO0o;
        this.f103100OooOoO0 = textEditor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29090OoooO00 c29090OoooO00 = new C29090OoooO00(this.f103098OooOo, this.f103100OooOoO0, continuation);
        c29090OoooO00.f103099OooOo0o = obj;
        return c29090OoooO00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29090OoooO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103099OooOo0o;
        C29051OooOO0o c29051OooOO0o = this.f103098OooOo;
        TextEditor textEditor = this.f103100OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(c29051OooOO0o, textEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(c29051OooOO0o, textEditor, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

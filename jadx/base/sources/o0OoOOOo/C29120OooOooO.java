package o0OoOOOo;

import android.widget.ImageView;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OoOOO0.C29051OooOO0o;
import o0o00Ooo.C29920OooO0oo;
import o0oOoOo.C31083OooooO0;
import o0oOoOo.C31087Oooooo0;
import o0oOoOo.C31089Ooooooo;
import oO00ooO.C32438OooO0oO;
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

/* JADX INFO: renamed from: o0OoOOOo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3", m80623f = "TextStyleBox.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29120OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f103194OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103195OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TextStyleBox f103196OooOoO0;

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$8", m80623f = "TextStyleBox.kt", m80624l = {187}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103197OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103198OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103199OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103200OooOo0o;

            public OooO00o(TextStyleBox textStyleBox) {
                this.f103200OooOo0o = textStyleBox;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                String string = (String) obj;
                TextStyleBox textStyleBox = this.f103200OooOo0o;
                TextView textView = textStyleBox.f74134OooOo0o;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontName");
                    throw null;
                }
                if (string.length() == 0) {
                    string = textStyleBox.getContext().getString(R.string.default_font);
                } else {
                    Integer numOooO00o = C31087Oooooo0.OooO00o.OooO00o(string);
                    if (numOooO00o != null) {
                        String string2 = textStyleBox.getContext().getString(numOooO00o.intValue());
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
        public OooO(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f103197OooOo = c29051OooOO0o;
            this.f103199OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO(this.f103197OooOo, this.f103199OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103198OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103197OooOo;
                OooO00o oooO00o = new OooO00o(this.f103199OooOoO0);
                this.f103198OooOo0o = 1;
                if (c29051OooOO0o.f102909OooOOoo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$1", m80623f = "TextStyleBox.kt", m80624l = {149}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103201OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103202OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103203OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19959OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103204OooOo0o;

            public C19959OooO00o(TextStyleBox textStyleBox) {
                this.f103204OooOo0o = textStyleBox;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                this.f103204OooOo0o.f74143Oooo0.OooO0Oo((List) obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103201OooOo = c29051OooOO0o;
            this.f103203OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103201OooOo, this.f103203OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103202OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103201OooOo;
                C19959OooO00o c19959OooO00o = new C19959OooO00o(this.f103203OooOoO0);
                this.f103202OooOo0o = 1;
                if (c29051OooOO0o.f102903OooOOO.f121747OooOo0o.collect(c19959OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$10", m80623f = "TextStyleBox.kt", m80624l = {202}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103205OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103206OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103207OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$10$1", m80623f = "TextStyleBox.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103208OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBox textStyleBox, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103208OooOo0o = textStyleBox;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f103208OooOo0o, continuation);
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
                TextStyleBox.OooO(this.f103208OooOo0o);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f103205OooOo = c29051OooOO0o;
            this.f103207OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f103205OooOo, this.f103207OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103206OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = this.f103205OooOo.f102917OooOoOO;
                OooO00o oooO00o = new OooO00o(this.f103207OooOoO0, null);
                this.f103206OooOo0o = 1;
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$2", m80623f = "TextStyleBox.kt", m80624l = {154}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103209OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103210OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103211OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0OO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$2$1", m80623f = "TextStyleBox.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103212OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103213OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBox textStyleBox, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103212OooOo = textStyleBox;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103212OooOo, continuation);
                oooO00o.f103213OooOo0o = ((Boolean) obj).booleanValue();
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
                boolean z = this.f103213OooOo0o;
                ImageView imageView = this.f103212OooOo.f74137OooOoOO;
                if (imageView != null) {
                    imageView.setSelected(z);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("ivStarColor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f103209OooOo = c29051OooOO0o;
            this.f103211OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f103209OooOo, this.f103211OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103210OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103209OooOo;
                OooO00o oooO00o = new OooO00o(this.f103211OooOoO0, null);
                this.f103210OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0o.f102905OooOOOO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$3", m80623f = "TextStyleBox.kt", m80624l = {159}, m80625m = "invokeSuspend")
    public static final class C29121OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103214OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103215OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103216OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$3$1", m80623f = "TextStyleBox.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31089Ooooooo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103217OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103218OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBox textStyleBox, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103217OooOo = textStyleBox;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103217OooOo, continuation);
                oooO00o.f103218OooOo0o = obj;
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
                this.f103217OooOo.f74152Oooo0oo.OooO0Oo((List) this.f103218OooOo0o);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29121OooO0Oo(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super C29121OooO0Oo> continuation) {
            super(2, continuation);
            this.f103214OooOo = c29051OooOO0o;
            this.f103216OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29121OooO0Oo(this.f103214OooOo, this.f103216OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29121OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103215OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103214OooOo;
                OooO00o oooO00o = new OooO00o(this.f103216OooOoO0, null);
                this.f103215OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0o.f102908OooOOo0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$5", m80623f = "TextStyleBox.kt", m80624l = {168}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103219OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103220OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103221OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0o$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103222OooOo0o;

            public OooO00o(TextStyleBox textStyleBox) {
                this.f103222OooOo0o = textStyleBox;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                float fFloatValue = ((Number) obj).floatValue();
                TextStyleBox textStyleBox = this.f103222OooOo0o;
                TextView textView = textStyleBox.f74136OooOoO0;
                if (textView != null) {
                    textView.setText(textStyleBox.getContext().getString(R.string.line_spacing_desc, String.format("%.1f", Arrays.copyOf(new Object[]{new Float(fFloatValue)}, 1))));
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontLineHeight");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f103219OooOo = c29051OooOO0o;
            this.f103221OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0o(this.f103219OooOo, this.f103221OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103220OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103219OooOo;
                OooO00o oooO00o = new OooO00o(this.f103221OooOoO0);
                this.f103220OooOo0o = 1;
                if (c29051OooOO0o.f102907OooOOo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$4", m80623f = "TextStyleBox.kt", m80624l = {164}, m80625m = "invokeSuspend")
    public static final class C29122OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103223OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103224OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103225OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$4$1", m80623f = "TextStyleBox.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31083OooooO0>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103226OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103227OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBox textStyleBox, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103226OooOo = textStyleBox;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103226OooOo, continuation);
                oooO00o.f103227OooOo0o = obj;
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
                List list = (List) this.f103227OooOo0o;
                C29096OooO0Oo textBoxBgColorPopupWindow = this.f103226OooOo.getTextBoxBgColorPopupWindow();
                textBoxBgColorPopupWindow.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                textBoxBgColorPopupWindow.f103116OooO0O0.OooO0Oo(list);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29122OooO0o0(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super C29122OooO0o0> continuation) {
            super(2, continuation);
            this.f103223OooOo = c29051OooOO0o;
            this.f103225OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29122OooO0o0(this.f103223OooOo, this.f103225OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29122OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103224OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103223OooOo;
                OooO00o oooO00o = new OooO00o(this.f103225OooOoO0, null);
                this.f103224OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0o.f102906OooOOOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$6", m80623f = "TextStyleBox.kt", m80624l = {173}, m80625m = "invokeSuspend")
    public static final class C29123OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103228OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103229OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103230OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0oO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103231OooOo0o;

            public OooO00o(TextStyleBox textStyleBox) {
                this.f103231OooOo0o = textStyleBox;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                TextView textView = this.f103231OooOo0o.f74133OooOo;
                if (textView != null) {
                    textView.setText(iIntValue == -1 ? "..." : String.valueOf(iIntValue - 10));
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontSize");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29123OooO0oO(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super C29123OooO0oO> continuation) {
            super(2, continuation);
            this.f103228OooOo = c29051OooOO0o;
            this.f103230OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29123OooO0oO(this.f103228OooOo, this.f103230OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C29123OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103229OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103228OooOo;
                OooO00o oooO00o = new OooO00o(this.f103230OooOoO0);
                this.f103229OooOo0o = 1;
                if (c29051OooOO0o.f102914OooOo0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$7", m80623f = "TextStyleBox.kt", m80624l = {182}, m80625m = "invokeSuspend")
    public static final class C29124OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103232OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103233OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103234OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooO0oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$7$1", m80623f = "TextStyleBox.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31087Oooooo0>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103235OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103236OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBox textStyleBox, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103235OooOo = textStyleBox;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103235OooOo, continuation);
                oooO00o.f103236OooOo0o = obj;
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
                this.f103235OooOo.getTextFontPopupWindow().OooO0Oo((List) this.f103236OooOo0o);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29124OooO0oo(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super C29124OooO0oo> continuation) {
            super(2, continuation);
            this.f103232OooOo = c29051OooOO0o;
            this.f103234OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29124OooO0oo(this.f103232OooOo, this.f103234OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29124OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103233OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103232OooOo;
                OooO00o oooO00o = new OooO00o(this.f103234OooOoO0, null);
                this.f103233OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0o.f102913OooOo0O, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooOO0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$9", m80623f = "TextStyleBox.kt", m80624l = {196}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103237OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103238OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextStyleBox f103239OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOooO$OooOO0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextStyleBox$initByViewModel$3$9$1", m80623f = "TextStyleBox.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29920OooO0oo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextStyleBox f103240OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103241OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextStyleBox textStyleBox, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103240OooOo = textStyleBox;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103240OooOo, continuation);
                oooO00o.f103241OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C29920OooO0oo> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f103240OooOo.getTextBoxColorPopupWindow().OooOO0((List) this.f103241OooOo0o);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f103237OooOo = c29051OooOO0o;
            this.f103239OooOoO0 = textStyleBox;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOO0(this.f103237OooOo, this.f103239OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103238OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29051OooOO0o c29051OooOO0o = this.f103237OooOo;
                OooO00o oooO00o = new OooO00o(this.f103239OooOoO0, null);
                this.f103238OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29051OooOO0o.f102901OooOO0O, oooO00o, this) == enumC32485OooO00o) {
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
    public C29120OooOooO(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox, Continuation<? super C29120OooOooO> continuation) {
        super(2, continuation);
        this.f103194OooOo = c29051OooOO0o;
        this.f103196OooOoO0 = textStyleBox;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29120OooOooO c29120OooOooO = new C29120OooOooO(this.f103194OooOo, this.f103196OooOoO0, continuation);
        c29120OooOooO.f103195OooOo0o = obj;
        return c29120OooOooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29120OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103195OooOo0o;
        C29051OooOO0o c29051OooOO0o = this.f103194OooOo;
        TextStyleBox textStyleBox = this.f103196OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29121OooO0Oo(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29122OooO0o0(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29123OooO0oO(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29124OooO0oo(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(c29051OooOO0o, textStyleBox, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(c29051OooOO0o, textStyleBox, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

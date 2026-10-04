package o0OoOOOo;

import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOo0.C29181OooO00o;
import o0OoOOo0.C29185OooO0o;
import o0Ooo0oo.C29553o00O0O;
import o0o00Ooo.C29920OooO0oo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoOOOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFullStylePopupWindow$initByViewModel$6", m80623f = "TextFullStylePopupWindow.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29109OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f103153OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103154OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C29108OooOOo f103155OooOoO0;

    /* JADX INFO: renamed from: o0OoOOOo.OooOOo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFullStylePopupWindow$initByViewModel$6$1", m80623f = "TextFullStylePopupWindow.kt", m80624l = {149}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103156OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103157OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C29108OooOOo f103158OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19958OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C29108OooOOo f103159OooOo0o;

            public C19958OooO00o(C29108OooOOo c29108OooOOo) {
                this.f103159OooOo0o = c29108OooOOo;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List<T> list = (List) obj;
                C29181OooO00o c29181OooO00o = this.f103159OooOo0o.f103146OooO0o;
                if (c29181OooO00o != null) {
                    c29181OooO00o.OooO0Oo(list);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("textBoxColorAdapter");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C29051OooOO0o c29051OooOO0o, C29108OooOOo c29108OooOOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103156OooOo = c29051OooOO0o;
            this.f103158OooOoO0 = c29108OooOOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103156OooOo, this.f103158OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103157OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33769Ooooo0o c33769Ooooo0o = this.f103156OooOo.f102906OooOOOo;
                C19958OooO00o c19958OooO00o = new C19958OooO00o(this.f103158OooOoO0);
                this.f103157OooOo0o = 1;
                if (c33769Ooooo0o.f121747OooOo0o.collect(c19958OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOOo0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFullStylePopupWindow$initByViewModel$6$2", m80623f = "TextFullStylePopupWindow.kt", m80624l = {154}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103160OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103161OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C29108OooOOo f103162OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOOo0$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C29108OooOOo f103163OooOo0o;

            public OooO00o(C29108OooOOo c29108OooOOo) {
                this.f103163OooOo0o = c29108OooOOo;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List<T> list = (List) obj;
                C29185OooO0o c29185OooO0o = this.f103163OooOo0o.f103145OooO0Oo;
                if (c29185OooO0o != null) {
                    c29185OooO0o.OooO0Oo(list);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("textStyleAdapter");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C29051OooOO0o c29051OooOO0o, C29108OooOOo c29108OooOOo, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f103160OooOo = c29051OooOO0o;
            this.f103162OooOoO0 = c29108OooOOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f103160OooOo, this.f103162OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103161OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33769Ooooo0o c33769Ooooo0o = this.f103160OooOo.f102908OooOOo0;
                OooO00o oooO00o = new OooO00o(this.f103162OooOoO0);
                this.f103161OooOo0o = 1;
                if (c33769Ooooo0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOOo0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFullStylePopupWindow$initByViewModel$6$3", m80623f = "TextFullStylePopupWindow.kt", m80624l = {159}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103164OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103165OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C29108OooOOo f103166OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOOo0$OooO0OO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFullStylePopupWindow$initByViewModel$6$3$1", m80623f = "TextFullStylePopupWindow.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenColorVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C29108OooOOo f103167OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103168OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(C29108OooOOo c29108OooOOo, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103167OooOo = c29108OooOOo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103167OooOo, continuation);
                oooO00o.f103168OooOo0o = obj;
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
                List list = (List) this.f103168OooOo0o;
                C29553o00O0O c29553o00O0O = this.f103167OooOo.f103149OooO0oo;
                if (c29553o00O0O != null) {
                    c29553o00O0O.OooO0Oo(list);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("textColorAdapter");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C29051OooOO0o c29051OooOO0o, C29108OooOOo c29108OooOOo, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f103164OooOo = c29051OooOO0o;
            this.f103166OooOoO0 = c29108OooOOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f103164OooOo, this.f103166OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103165OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33769Ooooo0o c33769Ooooo0o = this.f103164OooOo.f102903OooOOO;
                OooO00o oooO00o = new OooO00o(this.f103166OooOoO0, null);
                this.f103165OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoOOOo.OooOOo0$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFullStylePopupWindow$initByViewModel$6$4", m80623f = "TextFullStylePopupWindow.kt", m80624l = {164}, m80625m = "invokeSuspend")
    public static final class C29110OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29051OooOO0o f103169OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103170OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C29108OooOOo f103171OooOoO0;

        /* JADX INFO: renamed from: o0OoOOOo.OooOOo0$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFullStylePopupWindow$initByViewModel$6$4$1", m80623f = "TextFullStylePopupWindow.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29920OooO0oo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C29108OooOOo f103172OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103173OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(C29108OooOOo c29108OooOOo, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103172OooOo = c29108OooOOo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103172OooOo, continuation);
                oooO00o.f103173OooOo0o = obj;
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
                List<C29920OooO0oo> list = (List) this.f103173OooOo0o;
                int i = C29108OooOOo.f103137OooOOO0;
                this.f103172OooOo.OooO0O0().OooOO0(list);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29110OooO0Oo(C29051OooOO0o c29051OooOO0o, C29108OooOOo c29108OooOOo, Continuation<? super C29110OooO0Oo> continuation) {
            super(2, continuation);
            this.f103169OooOo = c29051OooOO0o;
            this.f103171OooOoO0 = c29108OooOOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29110OooO0Oo(this.f103169OooOo, this.f103171OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29110OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103170OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33769Ooooo0o c33769Ooooo0o = this.f103169OooOo.f102901OooOO0O;
                OooO00o oooO00o = new OooO00o(this.f103171OooOoO0, null);
                this.f103170OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, oooO00o, this) == enumC32485OooO00o) {
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
    public C29109OooOOo0(C29051OooOO0o c29051OooOO0o, C29108OooOOo c29108OooOOo, Continuation<? super C29109OooOOo0> continuation) {
        super(2, continuation);
        this.f103153OooOo = c29051OooOO0o;
        this.f103155OooOoO0 = c29108OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29109OooOOo0 c29109OooOOo0 = new C29109OooOOo0(this.f103153OooOo, this.f103155OooOoO0, continuation);
        c29109OooOOo0.f103154OooOo0o = obj;
        return c29109OooOOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29109OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103154OooOo0o;
        C29051OooOO0o c29051OooOO0o = this.f103153OooOo;
        C29108OooOOo c29108OooOOo = this.f103155OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(c29051OooOO0o, c29108OooOOo, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(c29051OooOO0o, c29108OooOOo, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(c29051OooOO0o, c29108OooOOo, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29110OooO0Oo(c29051OooOO0o, c29108OooOOo, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

package com.orion.notein.p607ui.noteeditor.textannoeditor;

import androidx.lifecycle.OooOo;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoEditorPanel;
import com.orion.penkit.models.QuoteInfo;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0o000OO.OooOO0O;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel$initByViewModel$1", m80623f = "TextAnnoEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOo f76368OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f76369OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ TextAnnoEditorPanel f76370OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f76371OooOoO0;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textannoeditor.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel$initByViewModel$1$1", m80623f = "TextAnnoEditorPanel.kt", m80624l = {44}, m80625m = "invokeSuspend")
    public static final class C19381OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f76372OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76373OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextAnnoEditorPanel f76374OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textannoeditor.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel$initByViewModel$1$1$1", m80623f = "TextAnnoEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19382OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends QuoteInfo, ? extends QuoteInfo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextAnnoEditorPanel f76375OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f76376OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19382OooO00o(TextAnnoEditorPanel textAnnoEditorPanel, Continuation<? super C19382OooO00o> continuation) {
                super(2, continuation);
                this.f76375OooOo = textAnnoEditorPanel;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19382OooO00o c19382OooO00o = new C19382OooO00o(this.f76375OooOo, continuation);
                c19382OooO00o.f76376OooOo0o = obj;
                return c19382OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends QuoteInfo, ? extends QuoteInfo> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19382OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f76376OooOo0o;
                QuoteInfo quoteInfo = (QuoteInfo) c32443OooOOO.f116638OooOo0o;
                QuoteInfo quoteInfo2 = (QuoteInfo) c32443OooOOO.f116637OooOo;
                TextAnnoEditorPanel textAnnoEditorPanel = this.f76375OooOo;
                TextAnnoEditorPanel.OooO00o eventListener = textAnnoEditorPanel.getEventListener();
                if (eventListener != null) {
                    eventListener.OooO0o(quoteInfo, quoteInfo2, false);
                }
                if (quoteInfo != null && quoteInfo2 == null) {
                    textAnnoEditorPanel.OooO0O0(false);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19381OooO00o(OooOO0O oooOO0O, TextAnnoEditorPanel textAnnoEditorPanel, Continuation<? super C19381OooO00o> continuation) {
            super(2, continuation);
            this.f76372OooOo = oooOO0O;
            this.f76374OooOoO0 = textAnnoEditorPanel;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19381OooO00o(this.f76372OooOo, this.f76374OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19381OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76373OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = this.f76372OooOo.f105551OooOoO;
                C19382OooO00o c19382OooO00o = new C19382OooO00o(this.f76374OooOoO0, null);
                this.f76373OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19382OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel$initByViewModel$1$2", m80623f = "TextAnnoEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f76377OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f76378OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextAnnoEditorPanel f76379OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textannoeditor.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel$initByViewModel$1$2$1", m80623f = "TextAnnoEditorPanel.kt", m80624l = {54}, m80625m = "invokeSuspend")
        public static final class C19383OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooOO0O f76380OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76381OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ TextAnnoEditorPanel f76382OooOoO0;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textannoeditor.OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel$initByViewModel$1$2$1$1", m80623f = "TextAnnoEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19384OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<QuoteInfo, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TextAnnoEditorPanel f76383OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19384OooO00o(TextAnnoEditorPanel textAnnoEditorPanel, Continuation<? super C19384OooO00o> continuation) {
                    super(2, continuation);
                    this.f76383OooOo0o = textAnnoEditorPanel;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19384OooO00o(this.f76383OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(QuoteInfo quoteInfo, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19384OooO00o) create(quoteInfo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f76383OooOo0o.OooO0O0(true);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19383OooO00o(OooOO0O oooOO0O, TextAnnoEditorPanel textAnnoEditorPanel, Continuation<? super C19383OooO00o> continuation) {
                super(2, continuation);
                this.f76380OooOo = oooOO0O;
                this.f76382OooOoO0 = textAnnoEditorPanel;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19383OooO00o(this.f76380OooOo, this.f76382OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19383OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76381OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C33772OooooOo c33772OooooOo = this.f76380OooOo.f105555OooOoo0;
                    C19384OooO00o c19384OooO00o = new C19384OooO00o(this.f76382OooOoO0, null);
                    this.f76381OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19384OooO00o, this) == enumC32485OooO00o) {
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
        public OooO0O0(OooOO0O oooOO0O, TextAnnoEditorPanel textAnnoEditorPanel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f76377OooOo = oooOO0O;
            this.f76379OooOoO0 = textAnnoEditorPanel;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f76377OooOo, this.f76379OooOoO0, continuation);
            oooO0O0.f76378OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f76378OooOo0o, null, null, new C19383OooO00o(this.f76377OooOo, this.f76379OooOoO0, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel$initByViewModel$1$3", m80623f = "TextAnnoEditorPanel.kt", m80624l = {62}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f76384OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76385OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextAnnoEditorPanel f76386OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textannoeditor.OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoEditorPanel$initByViewModel$1$3$1", m80623f = "TextAnnoEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19385OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends Quote>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextAnnoEditorPanel f76387OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f76388OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19385OooO00o(TextAnnoEditorPanel textAnnoEditorPanel, Continuation<? super C19385OooO00o> continuation) {
                super(2, continuation);
                this.f76387OooOo = textAnnoEditorPanel;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19385OooO00o c19385OooO00o = new C19385OooO00o(this.f76387OooOo, continuation);
                c19385OooO00o.f76388OooOo0o = obj;
                return c19385OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Integer, ? extends Quote> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19385OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f76388OooOo0o;
                int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                Quote quote = (Quote) c32443OooOOO.f116637OooOo;
                int i = TextAnnoEditorPanel.f76389OooOoOO;
                TextAnnoEditorPanel textAnnoEditorPanel = this.f76387OooOo;
                textAnnoEditorPanel.OooO0O0(true);
                TextAnnoEditorPanel.OooO00o eventListener = textAnnoEditorPanel.getEventListener();
                if (eventListener != null) {
                    eventListener.OooO0o0(iIntValue, quote);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooOO0O oooOO0O, TextAnnoEditorPanel textAnnoEditorPanel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f76384OooOo = oooOO0O;
            this.f76386OooOoO0 = textAnnoEditorPanel;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f76384OooOo, this.f76386OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76385OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = this.f76384OooOo.f105556OooOooO;
                C19385OooO00o c19385OooO00o = new C19385OooO00o(this.f76386OooOoO0, null);
                this.f76385OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19385OooO00o, this) == enumC32485OooO00o) {
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
    public OooO00o(OooOo oooOo, OooOO0O oooOO0O, TextAnnoEditorPanel textAnnoEditorPanel, Continuation continuation) {
        super(2, continuation);
        this.f76368OooOo = oooOo;
        this.f76371OooOoO0 = oooOO0O;
        this.f76370OooOoO = textAnnoEditorPanel;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO00o oooO00o = new OooO00o(this.f76368OooOo, this.f76371OooOoO0, this.f76370OooOoO, continuation);
        oooO00o.f76369OooOo0o = obj;
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
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f76369OooOo0o;
        OooOO0O oooOO0O = this.f76371OooOoO0;
        TextAnnoEditorPanel textAnnoEditorPanel = this.f76370OooOoO;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19381OooO00o(oooOO0O, textAnnoEditorPanel, null), 3);
        C33609OooO0oo.OooO0OO(this.f76368OooOo, null, null, new OooO0O0(oooOO0O, textAnnoEditorPanel, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(oooOO0O, textAnnoEditorPanel, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}

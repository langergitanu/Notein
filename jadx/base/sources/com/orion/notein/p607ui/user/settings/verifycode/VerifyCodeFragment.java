package com.orion.notein.p607ui.user.settings.verifycode;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.niui.components.button.TextButtonView;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0ooo0.EnumC26248OooOo0;
import o0O0oooo.C26364OooO0oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0ooo.AbstractC28485OooOo00;
import o0Oo0ooo.AbstractC28490OooOoOO;
import o0Oo0ooo.C28480OooOOo;
import o0Oo0ooo.C28482OooOOoo;
import o0Oo0ooo.C28489OooOoO0;
import o0Oo0ooo.C28496OooOooO;
import o0Oo0ooo.EnumC28481OooOOo0;
import o0Oo0ooo.EnumC28488OooOoO;
import o0OoO000.ViewOnClickListenerC28529OooOO0o;
import o0Ooo0oo.C29439OooO00o;
import o0o0O0OO.C30286OooOOO0;
import o0oOo0o0.InterfaceC30981OooO0OO;
import o0oOoOO.C31012OooO0oo;
import o0oOoOO.InterfaceC31009OooO0o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/user/settings/verifycode/VerifyCodeFragment;", "Landroidx/fragment/app/Fragment;", "Lo0oOo0o0/OooO0OO;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class VerifyCodeFragment extends Hilt_VerifyCodeFragment implements InterfaceC30981OooO0OO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f80028OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C24568OooO0oO f80029OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f80030OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C32447OooOOo f80031OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public LabeledTextFieldView f80032Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextButtonView f80033Oooo00O;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f80034OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f80034OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f80034OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$4", m80623f = "VerifyCodeFragment.kt", m80624l = {100}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f80036OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$4$1", m80623f = "VerifyCodeFragment.kt", m80624l = {105}, m80625m = "invokeSuspend")
        public static final class C19575OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ VerifyCodeFragment f80037OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f80038OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$4$1$1", m80623f = "VerifyCodeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19576OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C28480OooOOo, C28482OooOOoo, Continuation<? super C32443OooOOO<? extends C28480OooOOo, ? extends C28482OooOOoo>>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ C28482OooOOoo f80039OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ C28480OooOOo f80040OooOo0o;

                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(C28480OooOOo c28480OooOOo, C28482OooOOoo c28482OooOOoo, Continuation<? super C32443OooOOO<? extends C28480OooOOo, ? extends C28482OooOOoo>> continuation) {
                    C19576OooO00o c19576OooO00o = new C19576OooO00o(3, continuation);
                    c19576OooO00o.f80040OooOo0o = c28480OooOOo;
                    c19576OooO00o.f80039OooOo = c28482OooOOoo;
                    return c19576OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return new C32443OooOOO(this.f80040OooOo0o, this.f80039OooOo);
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO00o$OooO00o$OooO0O0 */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$4$1$2", m80623f = "VerifyCodeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends C28480OooOOo, ? extends C28482OooOOoo>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ VerifyCodeFragment f80041OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f80042OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(VerifyCodeFragment verifyCodeFragment, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f80041OooOo = verifyCodeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO0O0 oooO0O0 = new OooO0O0(this.f80041OooOo, continuation);
                    oooO0O0.f80042OooOo0o = obj;
                    return oooO0O0;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends C28480OooOOo, ? extends C28482OooOOoo> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0O0) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f80042OooOo0o;
                    this.f80041OooOo.OooOooO((C28480OooOOo) c32443OooOOO.f116638OooOo0o, (C28482OooOOoo) c32443OooOOO.f116637OooOo);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19575OooO00o(VerifyCodeFragment verifyCodeFragment, Continuation<? super C19575OooO00o> continuation) {
                super(2, continuation);
                this.f80037OooOo = verifyCodeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19575OooO00o(this.f80037OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19575OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f80038OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    VerifyCodeFragment verifyCodeFragment = this.f80037OooOo;
                    C28489OooOoO0 c28489OooOoO0OooOoOO = verifyCodeFragment.OooOoOO();
                    C28496OooOooO c28496OooOooOOooOoo = verifyCodeFragment.OooOoo();
                    C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(c28489OooOoO0OooOoOO.f100958OooO0oO, c28496OooOooOOooOoo.f100982OooO0o, new C19576OooO00o(3, null));
                    OooO0O0 oooO0O0 = new OooO0O0(verifyCodeFragment, null);
                    this.f80038OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33763OoooOOO, oooO0O0, this) == enumC32485OooO00o) {
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

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return VerifyCodeFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f80036OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                VerifyCodeFragment verifyCodeFragment = VerifyCodeFragment.this;
                C19575OooO00o c19575OooO00o = new C19575OooO00o(verifyCodeFragment, null);
                this.f80036OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(verifyCodeFragment, oooO0O0, c19575OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$5", m80623f = "VerifyCodeFragment.kt", m80624l = {112}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f80044OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$5$1", m80623f = "VerifyCodeFragment.kt", m80624l = {113}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ VerifyCodeFragment f80045OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f80046OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$5$1$1", m80623f = "VerifyCodeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19577OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC28485OooOo00, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ VerifyCodeFragment f80047OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f80048OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19577OooO00o(VerifyCodeFragment verifyCodeFragment, Continuation<? super C19577OooO00o> continuation) {
                    super(2, continuation);
                    this.f80047OooOo = verifyCodeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19577OooO00o c19577OooO00o = new C19577OooO00o(this.f80047OooOo, continuation);
                    c19577OooO00o.f80048OooOo0o = obj;
                    return c19577OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(AbstractC28485OooOo00 abstractC28485OooOo00, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19577OooO00o) create(abstractC28485OooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    AbstractC28485OooOo00 abstractC28485OooOo00 = (AbstractC28485OooOo00) this.f80048OooOo0o;
                    VerifyCodeFragment verifyCodeFragment = this.f80047OooOo;
                    if (abstractC28485OooOo00 instanceof AbstractC28485OooOo00.OooO0O0) {
                        AbstractC28485OooOo00.OooO0O0 oooO0O0 = (AbstractC28485OooOo00.OooO0O0) abstractC28485OooOo00;
                        verifyCodeFragment.OooOoo().OooO0oO(oooO0O0.f100931OooO00o, oooO0O0.f100932OooO0O0);
                        verifyCodeFragment.OooOoo().OooO0o();
                        C28489OooOoO0.OooOO0(verifyCodeFragment.OooOoOO());
                        Context contextRequireContext = verifyCodeFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        String string = verifyCodeFragment.getString(R.string.verification_code_sent);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(contextRequireContext, string);
                    } else {
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC28485OooOo00, AbstractC28485OooOo00.OooO00o.f100930OooO00o)) {
                            throw new C32442OooOO0o();
                        }
                        Context contextRequireContext2 = verifyCodeFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                        String string2 = verifyCodeFragment.getString(R.string.network_error);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(contextRequireContext2, string2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(VerifyCodeFragment verifyCodeFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f80045OooOo = verifyCodeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f80045OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f80046OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    VerifyCodeFragment verifyCodeFragment = this.f80045OooOo;
                    C28489OooOoO0 c28489OooOoO0OooOoOO = verifyCodeFragment.OooOoOO();
                    C19577OooO00o c19577OooO00o = new C19577OooO00o(verifyCodeFragment, null);
                    this.f80046OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c28489OooOoO0OooOoOO.f100954OooO, c19577OooO00o, this) == enumC32485OooO00o) {
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return VerifyCodeFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f80044OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                VerifyCodeFragment verifyCodeFragment = VerifyCodeFragment.this;
                OooO00o oooO00o = new OooO00o(verifyCodeFragment, null);
                this.f80044OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(verifyCodeFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$6", m80623f = "VerifyCodeFragment.kt", m80624l = {120}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f80050OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$6$1", m80623f = "VerifyCodeFragment.kt", m80624l = {121}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ VerifyCodeFragment f80051OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f80052OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$onViewCreated$6$1$1", m80623f = "VerifyCodeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19578OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC28490OooOoOO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ VerifyCodeFragment f80053OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f80054OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19578OooO00o(VerifyCodeFragment verifyCodeFragment, Continuation<? super C19578OooO00o> continuation) {
                    super(2, continuation);
                    this.f80053OooOo = verifyCodeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19578OooO00o c19578OooO00o = new C19578OooO00o(this.f80053OooOo, continuation);
                    c19578OooO00o.f80054OooOo0o = obj;
                    return c19578OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(AbstractC28490OooOoOO abstractC28490OooOoOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19578OooO00o) create(abstractC28490OooOoOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    AbstractC28490OooOoOO abstractC28490OooOoOO = (AbstractC28490OooOoOO) this.f80054OooOo0o;
                    VerifyCodeFragment verifyCodeFragment = this.f80053OooOo;
                    if (!verifyCodeFragment.OooOoo0().OooO0OO(verifyCodeFragment, abstractC28490OooOoOO) && (abstractC28490OooOoOO instanceof AbstractC28490OooOoOO.C28493OooO0oO)) {
                        int iOrdinal = ((AbstractC28490OooOoOO.C28493OooO0oO) abstractC28490OooOoOO).f100969OooO00o.ordinal();
                        if (iOrdinal == 0) {
                            Context contextRequireContext = verifyCodeFragment.requireContext();
                            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                            String string = verifyCodeFragment.getString(R.string.network_error);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(contextRequireContext, string);
                        } else {
                            if (iOrdinal != 1) {
                                throw new C32442OooOO0o();
                            }
                            Context contextRequireContext2 = verifyCodeFragment.requireContext();
                            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                            String string2 = verifyCodeFragment.getString(R.string.phone_not_register_can_not_find_password);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                            C25206OooO0Oo.OooO0oO(contextRequireContext2, string2);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(VerifyCodeFragment verifyCodeFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f80051OooOo = verifyCodeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f80051OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f80052OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    VerifyCodeFragment verifyCodeFragment = this.f80051OooOo;
                    C28496OooOooO c28496OooOooOOooOoo = verifyCodeFragment.OooOoo();
                    C19578OooO00o c19578OooO00o = new C19578OooO00o(verifyCodeFragment, null);
                    this.f80052OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c28496OooOooOOooOoo.f100985OooO0oo, c19578OooO00o, this) == enumC32485OooO00o) {
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

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return VerifyCodeFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f80050OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                VerifyCodeFragment verifyCodeFragment = VerifyCodeFragment.this;
                OooO00o oooO00o = new OooO00o(verifyCodeFragment, null);
                this.f80050OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(verifyCodeFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23902OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23902OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            VerifyCodeFragment verifyCodeFragment = VerifyCodeFragment.this;
            Bundle arguments = verifyCodeFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + verifyCodeFragment + " has null arguments");
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return VerifyCodeFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23903OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f80057OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23903OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f80057OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f80057OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? VerifyCodeFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23904OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f80059OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23904OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f80059OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f80059OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23905OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f80060OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23905OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f80060OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f80060OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f80061OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f80061OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f80061OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? VerifyCodeFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return VerifyCodeFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.verifycode.VerifyCodeFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23906OooOO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f80064OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23906OooOO0o(OooOO0O oooOO0O) {
            super(0);
            this.f80064OooOo0o = oooOO0O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f80064OooOo0o.invoke();
        }
    }

    public static final class OooOOO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f80065OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f80065OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f80065OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOOO0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f80066OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f80066OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f80066OooOo0o.getValue()).getViewModelStore();
        }
    }

    public VerifyCodeFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f80029OooOoo0 = new C24568OooO0oO(oooo0.OooO0O0(C31012OooO0oo.class), new C23902OooO0Oo());
        OooO0o oooO0o = new OooO0o();
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23904OooO0oO(oooO0o));
        this.f80028OooOoo = new C22026ooOO(oooo0.OooO0O0(C28489OooOoO0.class), new C23905OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23906OooOO0o(new OooOO0O()));
        this.f80030OooOooO = new C22026ooOO(oooo0.OooO0O0(C28496OooOooO.class), new OooOOO0(interfaceC32440OooOO0OooO0O02), new C23903OooO0o0(interfaceC32440OooOO0OooO0O02), new OooOOO(interfaceC32440OooOO0OooO0O02));
        this.f80031OooOooo = C20519OooO0Oo.OooO0OO(new C29439OooO00o(this, 3));
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooO0o() {
        return Integer.valueOf(R.color.notein_backgrounds_grouped_secondary);
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooOO0() {
        return OooOoo0().OooO0O0();
    }

    public final C28489OooOoO0 OooOoOO() {
        return (C28489OooOoO0) this.f80028OooOoo.getValue();
    }

    public final C28496OooOooO OooOoo() {
        return (C28496OooOooO) this.f80030OooOooO.getValue();
    }

    public final InterfaceC31009OooO0o OooOoo0() {
        return (InterfaceC31009OooO0o) this.f80031OooOooo.getValue();
    }

    public final void OooOooO(C28480OooOOo c28480OooOOo, C28482OooOOoo c28482OooOOoo) {
        String string;
        if (this.f80032Oooo000 == null) {
            return;
        }
        EnumC28481OooOOo0 enumC28481OooOOo0 = c28480OooOOo.f100913OooO0Oo;
        if (enumC28481OooOOo0 == EnumC28481OooOOo0.f100917OooOo0o) {
            string = getString(R.string.phone_number_is_wrong);
        } else if (enumC28481OooOOo0 == EnumC28481OooOOo0.f100916OooOo) {
            string = getString(R.string.network_error);
        } else if (enumC28481OooOOo0 == EnumC28481OooOOo0.f100919OooOoO0) {
            string = getString(R.string.phone_is_bounded);
        } else {
            EnumC28488OooOoO enumC28488OooOoO = c28482OooOOoo.f100922OooO0OO;
            if (enumC28488OooOoO == EnumC28488OooOoO.f100950OooOo0o) {
                string = getString(R.string.verification_code_error);
            } else if (enumC28488OooOoO == EnumC28488OooOoO.f100949OooOo) {
                string = getString(R.string.has_already_bind_another_account);
            } else if (enumC28488OooOoO == EnumC28488OooOoO.f100952OooOoO0) {
                string = getString(R.string.network_error);
            } else if (enumC28488OooOoO == EnumC28488OooOoO.f100951OooOoO) {
                string = getString(R.string.toast_delete_user_failed_note_exist);
            } else {
                String str = c28480OooOOo.f100910OooO00o;
                boolean zOooo0o0 = C33599OooOo0O.Oooo0o0(str);
                String str2 = c28480OooOOo.f100911OooO0O0;
                string = (zOooo0o0 && C33599OooOo0O.Oooo0o0(str2)) ? "" : getString(R.string.verification_code_sent_tips, str, str2);
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
        LabeledTextFieldView labeledTextFieldView = this.f80032Oooo000;
        if (labeledTextFieldView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
            throw null;
        }
        labeledTextFieldView.setSupportingText(string);
        EnumC26248OooOo0 enumC26248OooOo0 = (c28480OooOOo.f100913OooO0Oo == null && c28482OooOOoo.f100922OooO0OO == null) ? EnumC26248OooOo0.f89694OooOo0o : EnumC26248OooOo0.f89696OooOoO0;
        LabeledTextFieldView labeledTextFieldView2 = this.f80032Oooo000;
        if (labeledTextFieldView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
            throw null;
        }
        if (labeledTextFieldView2.getState() != enumC26248OooOo0) {
            LabeledTextFieldView labeledTextFieldView3 = this.f80032Oooo000;
            if (labeledTextFieldView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView3.setState(enumC26248OooOo0);
        }
        boolean z = false;
        if (c28480OooOOo.f100915OooO0o0) {
            int i = c28480OooOOo.f100914OooO0o;
            if (i < 0) {
                i = 0;
            }
            LabeledTextFieldView labeledTextFieldView4 = this.f80032Oooo000;
            if (labeledTextFieldView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView4.setTrailingText(getString(R.string.resend_in_seconds_format, Integer.valueOf(i)));
            LabeledTextFieldView labeledTextFieldView5 = this.f80032Oooo000;
            if (labeledTextFieldView5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView5.setOnTrailingTextClickListener(null);
        } else if (c28480OooOOo.f100912OooO0OO) {
            LabeledTextFieldView labeledTextFieldView6 = this.f80032Oooo000;
            if (labeledTextFieldView6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView6.setTrailingText(getString(R.string.resend));
            LabeledTextFieldView labeledTextFieldView7 = this.f80032Oooo000;
            if (labeledTextFieldView7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView7.setOnTrailingTextClickListener(null);
        } else {
            LabeledTextFieldView labeledTextFieldView8 = this.f80032Oooo000;
            if (labeledTextFieldView8 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView8.setTrailingText(getString(R.string.resend));
            LabeledTextFieldView labeledTextFieldView9 = this.f80032Oooo000;
            if (labeledTextFieldView9 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView9.setOnTrailingTextClickListener(new C30286OooOOO0(this, 1));
        }
        LabeledTextFieldView labeledTextFieldView10 = this.f80032Oooo000;
        if (labeledTextFieldView10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
            throw null;
        }
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(labeledTextFieldView10.getText(), c28482OooOOoo.f100920OooO00o);
        String str3 = c28482OooOOoo.f100920OooO00o;
        if (!zOooO0O0) {
            LabeledTextFieldView labeledTextFieldView11 = this.f80032Oooo000;
            if (labeledTextFieldView11 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView11.setText(str3);
        }
        if ((str3.length() == 4 || str3.length() == 6) && !c28482OooOOoo.f100921OooO0O0) {
            z = true;
        }
        TextButtonView textButtonView = this.f80033Oooo00O;
        if (textButtonView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        textButtonView.setEnabled(z);
        TextButtonView textButtonView2 = this.f80033Oooo00O;
        if (textButtonView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        textButtonView2.setClickable(z);
        TextButtonView textButtonView3 = this.f80033Oooo00O;
        if (textButtonView3 != null) {
            textButtonView3.setAlpha(z ? 1.0f : 0.6f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_verify_code, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f80032Oooo000 = (LabeledTextFieldView) view.findViewById(R.id.verification_code_field);
        TextButtonView textButtonView = (TextButtonView) view.findViewById(R.id.btn_get_verification_code);
        this.f80033Oooo00O = textButtonView;
        if (textButtonView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        String string = getString(OooOoo0().OooO0o());
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        textButtonView.setText(string);
        Integer numOooO00o = OooOoo0().OooO00o();
        if (numOooO00o != null) {
            int iIntValue = numOooO00o.intValue();
            LabeledTextFieldView labeledTextFieldView = this.f80032Oooo000;
            if (labeledTextFieldView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
                throw null;
            }
            labeledTextFieldView.setLabel(getString(iIntValue));
        }
        LabeledTextFieldView labeledTextFieldView2 = this.f80032Oooo000;
        if (labeledTextFieldView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("verificationCodeField");
            throw null;
        }
        labeledTextFieldView2.setOnValueChangeListener(new C26364OooO0oo(this, 2));
        TextButtonView textButtonView2 = this.f80033Oooo00O;
        if (textButtonView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        textButtonView2.setEnabled(false);
        TextButtonView textButtonView3 = this.f80033Oooo00O;
        if (textButtonView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("confirmButton");
            throw null;
        }
        C28050OooO0OO.OooO00o(textButtonView3, 500L, new ViewOnClickListenerC28529OooOO0o(this, 3));
        OooOoo0().OooO0Oo((C31012OooO0oo) this.f80029OooOoo0.getValue(), OooOoOO(), OooOoo());
        OooOooO((C28480OooOOo) OooOoOO().f100958OooO0oO.f121747OooOo0o.getValue(), (C28482OooOOoo) OooOoo().f100982OooO0o.f121747OooOo0o.getValue());
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0O0(null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new OooO0OO(null), 3);
    }
}

package com.orion.notein.p607ui.login;

import OooOoOO.C20519OooO0Oo;
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
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import io.ktor.utils.p616io.Oooo000;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0ooo0.EnumC26248OooOo0;
import o0O0oooO.ViewOnClickListenerC26295OoooO00;
import o0Oo.C28022OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0ooo.C28467OooO0OO;
import o0Oo0ooo.C28468OooO0Oo;
import o0Oo0ooo.C28469OooO0o;
import o0Oo0ooo.C28470OooO0o0;
import o0Oo0ooo.C28471OooO0oO;
import o0Oo0ooo.C28479OooOOOo;
import o0Oo0ooo.C28480OooOOo;
import o0Oo0ooo.C28489OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/BaseGetPhoneVerificationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class BaseGetPhoneVerificationFragment extends Fragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f72101OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LabeledTextFieldView f72102OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C22026ooOO f72103OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C22026ooOO f72104OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C22026ooOO f72105OooOoOO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72106OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72106OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72106OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$onViewCreated$3", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {75}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72108OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$onViewCreated$3$1", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19215OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseGetPhoneVerificationFragment f72109OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f72110OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$onViewCreated$3$1$1", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {76}, m80625m = "invokeSuspend")
            public static final class C19216OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseGetPhoneVerificationFragment f72111OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72112OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19216OooO00o(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super C19216OooO00o> continuation) {
                    super(2, continuation);
                    this.f72111OooOo = baseGetPhoneVerificationFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19216OooO00o(this.f72111OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19216OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72112OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        this.f72112OooOo0o = 1;
                        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f72111OooOo;
                        C28479OooOOOo c28479OooOOOo = (C28479OooOOOo) baseGetPhoneVerificationFragment.f72104OooOoO0.getValue();
                        C28489OooOoO0 c28489OooOoO0OooOoOO = baseGetPhoneVerificationFragment.OooOoOO();
                        Object objOooO0oO = C25252OooO0Oo.OooO0oO(new C33763OoooOOO(c28479OooOOOo.f100909OooO0o0, c28489OooOoO0OooOoOO.f100958OooO0oO, new C28467OooO0OO(3, null)), new C28468OooO0Oo(baseGetPhoneVerificationFragment, null), this);
                        if (objOooO0oO != obj2) {
                            objOooO0oO = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0oO == obj2) {
                            return obj2;
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

            /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO00o$OooO00o$OooO0O0 */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$onViewCreated$3$1$2", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {77}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseGetPhoneVerificationFragment f72113OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72114OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f72113OooOo = baseGetPhoneVerificationFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0O0(this.f72113OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72114OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        this.f72114OooOo0o = 1;
                        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f72113OooOo;
                        C28489OooOoO0 c28489OooOoO0OooOoOO = baseGetPhoneVerificationFragment.OooOoOO();
                        Object objOooO0oO = C25252OooO0Oo.OooO0oO(c28489OooOoO0OooOoOO.f100958OooO0oO, new C28471OooO0oO(baseGetPhoneVerificationFragment, null), this);
                        if (objOooO0oO != obj2) {
                            objOooO0oO = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0oO == obj2) {
                            return obj2;
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

            /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO00o$OooO00o$OooO0OO */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$onViewCreated$3$1$3", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {78}, m80625m = "invokeSuspend")
            public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseGetPhoneVerificationFragment f72115OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72116OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0OO(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super OooO0OO> continuation) {
                    super(2, continuation);
                    this.f72115OooOo = baseGetPhoneVerificationFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0OO(this.f72115OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72116OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        this.f72116OooOo0o = 1;
                        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f72115OooOo;
                        C28022OooOOO0 c28022OooOOO0 = (C28022OooOOO0) baseGetPhoneVerificationFragment.f72105OooOoOO.getValue();
                        Object objOooO0oO = C25252OooO0Oo.OooO0oO(c28022OooOOO0.f99369OooO0o, new C28470OooO0o0(baseGetPhoneVerificationFragment, null), this);
                        if (objOooO0oO != obj2) {
                            objOooO0oO = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0oO == obj2) {
                            return obj2;
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

            /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO00o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$onViewCreated$3$1$4", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {79}, m80625m = "invokeSuspend")
            public static final class C23142OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseGetPhoneVerificationFragment f72117OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72118OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23142OooO0Oo(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super C23142OooO0Oo> continuation) {
                    super(2, continuation);
                    this.f72117OooOo = baseGetPhoneVerificationFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23142OooO0Oo(this.f72117OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C23142OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72118OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        this.f72118OooOo0o = 1;
                        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f72117OooOo;
                        C28489OooOoO0 c28489OooOoO0OooOoOO = baseGetPhoneVerificationFragment.OooOoOO();
                        Object objOooO0oO = C25252OooO0Oo.OooO0oO(c28489OooOoO0OooOoOO.f100954OooO, new C28469OooO0o(baseGetPhoneVerificationFragment, null), this);
                        if (objOooO0oO != obj2) {
                            objOooO0oO = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0oO == obj2) {
                            return obj2;
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

            /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO00o$OooO00o$OooO0o0, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$onViewCreated$3$1$5", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {80}, m80625m = "invokeSuspend")
            public static final class C23143OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseGetPhoneVerificationFragment f72119OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72120OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23143OooO0o0(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super C23143OooO0o0> continuation) {
                    super(2, continuation);
                    this.f72119OooOo = baseGetPhoneVerificationFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23143OooO0o0(this.f72119OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C23143OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72120OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        this.f72120OooOo0o = 1;
                        if (this.f72119OooOo.OooOoo0(this) == enumC32485OooO00o) {
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
            public C19215OooO00o(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super C19215OooO00o> continuation) {
                super(2, continuation);
                this.f72109OooOo = baseGetPhoneVerificationFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19215OooO00o c19215OooO00o = new C19215OooO00o(this.f72109OooOo, continuation);
                c19215OooO00o.f72110OooOo0o = obj;
                return c19215OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19215OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f72110OooOo0o;
                BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f72109OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19216OooO00o(baseGetPhoneVerificationFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(baseGetPhoneVerificationFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(baseGetPhoneVerificationFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23142OooO0Oo(baseGetPhoneVerificationFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23143OooO0o0(baseGetPhoneVerificationFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseGetPhoneVerificationFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72108OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = BaseGetPhoneVerificationFragment.this;
                C19215OooO00o c19215OooO00o = new C19215OooO00o(baseGetPhoneVerificationFragment, null);
                this.f72108OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(baseGetPhoneVerificationFragment, oooO0O0, c19215OooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return BaseGetPhoneVerificationFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return BaseGetPhoneVerificationFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23144OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23144OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return BaseGetPhoneVerificationFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return BaseGetPhoneVerificationFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23145OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72125OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23145OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72125OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72125OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BaseGetPhoneVerificationFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23146OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f72127OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23146OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f72127OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72127OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23147OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72128OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23147OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72128OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72128OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72129OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72129OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72129OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BaseGetPhoneVerificationFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return BaseGetPhoneVerificationFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23148OooOO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f72132OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23148OooOO0o(OooOO0O oooOO0O) {
            super(0);
            this.f72132OooOo0o = oooOO0O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72132OooOo0o.invoke();
        }
    }

    public static final class OooOOO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72133OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72133OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72133OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOOO0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72134OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72134OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72134OooOo0o.getValue()).getViewModelStore();
        }
    }

    public BaseGetPhoneVerificationFragment() {
        OooO0o oooO0o = new OooO0o();
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23146OooO0oO(oooO0o));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72104OooOoO0 = new C22026ooOO(oooo0.OooO0O0(C28479OooOOOo.class), new C23147OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23148OooOO0o(new OooOO0O()));
        this.f72103OooOoO = new C22026ooOO(oooo0.OooO0O0(C28489OooOoO0.class), new OooOOO0(interfaceC32440OooOO0OooO0O02), new C23145OooO0o0(interfaceC32440OooOO0OooO0O02), new OooOOO(interfaceC32440OooOO0OooO0O02));
        this.f72105OooOoOO = new C22026ooOO(oooo0.OooO0O0(C28022OooOOO0.class), new OooO0O0(), new C23144OooO0Oo(), new OooO0OO());
    }

    public static String OooOooo(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Oooo000.OooO0o0(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public final LabeledTextFieldView OooOoO() {
        LabeledTextFieldView labeledTextFieldView = this.f72102OooOo0o;
        if (labeledTextFieldView != null) {
            return labeledTextFieldView;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("phoneNumberField");
        throw null;
    }

    public EnumC26248OooOo0 OooOoO0(EnumC26248OooOo0 enumC26248OooOo0, C28480OooOOo requestState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestState, "requestState");
        return enumC26248OooOo0;
    }

    public final C28489OooOoO0 OooOoOO() {
        return (C28489OooOoO0) this.f72103OooOoO.getValue();
    }

    public abstract void OooOoo();

    public Object OooOoo0(OooO00o.C19215OooO00o.C23143OooO0o0 c23143OooO0o0) {
        return C32460OooOooO.f116667OooO00o;
    }

    public abstract void OooOooO(String str, String str2);

    public int Oooo000() {
        return R.string.login_by_the_account_after_bind;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_phone_verification_form, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        LabeledTextFieldView labeledTextFieldView = (LabeledTextFieldView) view.findViewById(R.id.phone_number_field);
        labeledTextFieldView.setSupportingText(getString(Oooo000()));
        labeledTextFieldView.setCountryCode("+" + ((C28022OooOOO0) this.f72105OooOoOO.getValue()).f99369OooO0o.getValue());
        labeledTextFieldView.setOnCountryCodeClickListener(new oO0O000o.OooO00o() { // from class: o0Oo0ooo.OooO00o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f100859OooOo0o;
                baseGetPhoneVerificationFragment.OooOoOO().OooO();
                baseGetPhoneVerificationFragment.OooOoo();
                return C32460OooOooO.f116667OooO00o;
            }
        });
        labeledTextFieldView.setOnValueChangeListener(new InterfaceC32507OooOO0o() { // from class: o0Oo0ooo.OooO0O0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                String value = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f100860OooOo0o;
                baseGetPhoneVerificationFragment.OooOoOO().OooO();
                ((C28479OooOOOo) baseGetPhoneVerificationFragment.f72104OooOoO0.getValue()).OooO0o0(BaseGetPhoneVerificationFragment.OooOooo(value));
                return C32460OooOooO.f116667OooO00o;
            }
        });
        this.f72102OooOo0o = labeledTextFieldView;
        View viewFindViewById = view.findViewById(R.id.btn_get_verification_code);
        viewFindViewById.setEnabled(false);
        viewFindViewById.setClickable(false);
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC26295OoooO00(this, 1));
        this.f72101OooOo = viewFindViewById;
        ((C28479OooOOOo) this.f72104OooOoO0.getValue()).OooO0o0(OooOooo(OooOoO().getText()));
        OooOoOO().OooO();
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}

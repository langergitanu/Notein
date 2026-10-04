package com.orion.notein.p607ui.login.thirdparty;

import OooO0oO.C20439OooO0oo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import androidx.transition.OooOOOO;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.WarningType;
import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000o00.AbstractC24555OooO00o;
import o0Oo0ooo.C28477OooOOO0;
import o0OoO0.C28513OooO0oO;
import o0OoO0OO.AlertDialogC28626OooOoO0;
import o0OoO0OO.InterfaceC28618OooOOo;
import o0OoO0OO.InterfaceC28621OooOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/login/thirdparty/LoginByThirdPartyChildFragment;", "Landroidx/fragment/app/Fragment;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LoginByThirdPartyChildFragment extends Fragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC28618OooOOo f72577OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC28621OooOo f72578OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o00000OO f72579OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C22026ooOO f72580OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00000OO f72581OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o00000OO f72582OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o00000OO f72583OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public AlertDialogC28626OooOoO0 f72584OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f72585OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f72586Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f72587Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f72588Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f72589Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f72590Oooo0O0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onCreate$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {302}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72592OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onCreate$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19232OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LoginByThirdPartyChildFragment f72593OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f72594OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onCreate$1$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {304}, m80625m = "invokeSuspend")
            public static final class C19233OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ LoginByThirdPartyChildFragment f72595OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72596OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                public static final class C19234OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ LoginByThirdPartyChildFragment f72597OooOo0o;

                    public C19234OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
                        this.f72597OooOo0o = loginByThirdPartyChildFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f72597OooOo0o.f72588Oooo00O;
                        if (view != null) {
                            view.setVisibility(zBooleanValue ? 0 : 8);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19233OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super C19233OooO00o> continuation) {
                    super(2, continuation);
                    this.f72595OooOo = loginByThirdPartyChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19233OooO00o(this.f72595OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C19233OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72596OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f72595OooOo;
                    C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
                    C19234OooO00o c19234OooO00o = new C19234OooO00o(loginByThirdPartyChildFragment);
                    this.f72596OooOo0o = 1;
                    c28477OooOOO0OooOoOO.f100902OooOO0O.collect(c19234OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o$OooO0O0 */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onCreate$1$1$2", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_5}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ LoginByThirdPartyChildFragment f72598OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72599OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                public static final class C19235OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ LoginByThirdPartyChildFragment f72600OooOo0o;

                    public C19235OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
                        this.f72600OooOo0o = loginByThirdPartyChildFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f72600OooOo0o.f72585OooOooo;
                        if (view != null) {
                            view.setVisibility(zBooleanValue ? 0 : 8);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f72598OooOo = loginByThirdPartyChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0O0(this.f72598OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72599OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f72598OooOo;
                    C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
                    C19235OooO00o c19235OooO00o = new C19235OooO00o(loginByThirdPartyChildFragment);
                    this.f72599OooOo0o = 1;
                    c28477OooOOO0OooOoOO.f100895OooO.collect(c19235OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o$OooO0OO */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onCreate$1$1$3", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_6}, m80625m = "invokeSuspend")
            public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ LoginByThirdPartyChildFragment f72601OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72602OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
                public static final class C19236OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ LoginByThirdPartyChildFragment f72603OooOo0o;

                    public C19236OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
                        this.f72603OooOo0o = loginByThirdPartyChildFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f72603OooOo0o.f72589Oooo00o;
                        if (view != null) {
                            view.setVisibility(zBooleanValue ? 0 : 8);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0OO(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super OooO0OO> continuation) {
                    super(2, continuation);
                    this.f72601OooOo = loginByThirdPartyChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0OO(this.f72601OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72602OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f72601OooOo;
                    C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
                    C19236OooO00o c19236OooO00o = new C19236OooO00o(loginByThirdPartyChildFragment);
                    this.f72602OooOo0o = 1;
                    c28477OooOOO0OooOoOO.f100905OooOOO0.collect(c19236OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onCreate$1$1$4", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT}, m80625m = "invokeSuspend")
            public static final class C23189OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ LoginByThirdPartyChildFragment f72604OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72605OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO00o$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
                public static final class C19237OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ LoginByThirdPartyChildFragment f72606OooOo0o;

                    public C19237OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
                        this.f72606OooOo0o = loginByThirdPartyChildFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f72606OooOo0o.f72587Oooo000;
                        if (view != null) {
                            view.setVisibility(zBooleanValue ? 0 : 8);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23189OooO0Oo(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super C23189OooO0Oo> continuation) {
                    super(2, continuation);
                    this.f72604OooOo = loginByThirdPartyChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23189OooO0Oo(this.f72604OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C23189OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72605OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f72604OooOo;
                    C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
                    C19237OooO00o c19237OooO00o = new C19237OooO00o(loginByThirdPartyChildFragment);
                    this.f72605OooOo0o = 1;
                    c28477OooOOO0OooOoOO.f100906OooOOOO.collect(c19237OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19232OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super C19232OooO00o> continuation) {
                super(2, continuation);
                this.f72593OooOo = loginByThirdPartyChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19232OooO00o c19232OooO00o = new C19232OooO00o(this.f72593OooOo, continuation);
                c19232OooO00o.f72594OooOo0o = obj;
                return c19232OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19232OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f72594OooOo0o;
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f72593OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19233OooO00o(loginByThirdPartyChildFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(loginByThirdPartyChildFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(loginByThirdPartyChildFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23189OooO0Oo(loginByThirdPartyChildFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LoginByThirdPartyChildFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72592OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = LoginByThirdPartyChildFragment.this;
                C19232OooO00o c19232OooO00o = new C19232OooO00o(loginByThirdPartyChildFragment, null);
                this.f72592OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(loginByThirdPartyChildFragment, oooO0O0, c19232OooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return LoginByThirdPartyChildFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return LoginByThirdPartyChildFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23190OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23190OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return LoginByThirdPartyChildFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public LoginByThirdPartyChildFragment(InterfaceC28621OooOo checker, InterfaceC28618OooOOo onAuthorizeListener) {
        OooOOO0.OooO0oO(checker, "checker");
        OooOOO0.OooO0oO(onAuthorizeListener, "onAuthorizeListener");
        this.f72578OooOo0o = checker;
        this.f72577OooOo = onAuthorizeListener;
        this.f72580OooOoO0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28477OooOOO0.class), new OooO0O0(), new C23190OooO0Oo(), new OooO0OO());
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new com.aspose.slides.internal.p284mx.OooO00o());
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f72586Oooo0 = oooO0O0RegisterForActivityResult;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0OoO0OO.OooO0o
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ActivityResult it = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                if (it.f62240OooOo0o == -1) {
                    o0O00OOO.OooO0o<AuthAccount> authResultFromIntent = AccountAuthManager.parseAuthResultFromIntent(it.f62239OooOo);
                    if (authResultFromIntent.OooO()) {
                        String authorizationCode = authResultFromIntent.OooO0oO().getAuthorizationCode();
                        kotlin.jvm.internal.OooOOO0.OooO0o(authorizationCode, "getAuthorizationCode(...)");
                        LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101400OooOo0o;
                        loginByThirdPartyChildFragment.getClass();
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(loginByThirdPartyChildFragment), null, null, new C28602OooO(loginByThirdPartyChildFragment, authorizationCode, null), 3);
                    }
                }
            }
        });
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f72590Oooo0O0 = oooO0O0RegisterForActivityResult2;
    }

    public static final void OooOoO(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
        Context context = loginByThirdPartyChildFragment.getContext();
        if (context != null) {
            C28513OooO0oO.OooO00o(context, R.string.network_error, "getString(...)", context);
        }
    }

    public static final void OooOoO0(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
        Context context = loginByThirdPartyChildFragment.getContext();
        if (context == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setPackage("com.huawei.hwid");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
        OooOOO0.OooO0o(listQueryIntentActivities, "queryIntentActivities(...)");
        if (listQueryIntentActivities.isEmpty()) {
            Intent intentAddFlags = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.hwid")).addFlags(WarningType.HINT);
            OooOOO0.OooO0o(intentAddFlags, "addFlags(...)");
            loginByThirdPartyChildFragment.startActivity(intentAddFlags);
        }
    }

    public final C28477OooOOO0 OooOoOO() {
        return (C28477OooOOO0) this.f72580OooOoO0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO00o(null), 3);
    }
}

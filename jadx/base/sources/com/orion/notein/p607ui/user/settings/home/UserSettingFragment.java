package com.orion.notein.p607ui.user.settings.home;

import OooO0oO.C20439OooO0oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.transition.OooOOOO;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.WarningType;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.remoteconfig.OooOO0;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.BridgeWakeHMSActivity;
import com.orion.notein.domain.models.User;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o0O0o0oO.o00O0O;
import o0O0o0oO.o00Ooo;
import o0O0o0oO.o0OO00O;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.ViewOnClickListenerC28253Oooo00O;
import o0Oo0o0o.oo000o;
import o0OoO000.OooO0o;
import o0OoO000.ViewOnClickListenerC28526OooO0o0;
import o0OoO0oo.C28977o0ooOO0;
import o0OoOOOo.ViewOnClickListenerC29113OooOo0O;
import o0OoOOOo.ViewOnClickListenerC29119OooOoo0;
import o0o00oo.ViewOnClickListenerC30097OooO0Oo;
import o0oOo0o0.InterfaceC30981OooO0OO;
import o0oOoO0.C30999OooO0oO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/user/settings/home/UserSettingFragment;", "Landroidx/fragment/app/Fragment;", "Lo0oOo0o0/OooO0OO;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserSettingFragment extends Hilt_UserSettingFragment implements InterfaceC30981OooO0OO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public SimpleDraweeView f79842OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79843OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C26320o0000OoO.class), new OooO0OO(), new C23890OooO0o0(), new C23889OooO0Oo());

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f79844OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f79845OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f79846Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f79847Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f79848Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f79849Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f79850Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f79851Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f79852Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f79853Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f79854Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f79855Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f79856Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f79857OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View f79858OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f79859OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public TextView f79860OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f79861OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public o00000OO f79862OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public o00000OO f79863OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f79864OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f79865OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TextView f79866o000oOoO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$13", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.TOC_HEADING}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79868OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19550OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ UserSettingFragment f79869OooOo0o;

            public C19550OooO00o(UserSettingFragment userSettingFragment) {
                this.f79869OooOo0o = userSettingFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                String string;
                String string2;
                String avatar;
                User user = (User) obj;
                UserSettingFragment userSettingFragment = this.f79869OooOo0o;
                TextView textView = userSettingFragment.f79851Oooo0O0;
                if (textView == null) {
                    OooOOO0.OooOOOO("txtNickname");
                    throw null;
                }
                if (user == null || (string = user.getNickname()) == null) {
                    string = userSettingFragment.getString(R.string.not_filled);
                    OooOOO0.OooO0o(string, "getString(...)");
                } else {
                    if (C33599OooOo0O.Oooo0o0(string)) {
                        string = null;
                    }
                    if (string == null) {
                    }
                }
                textView.setText(string);
                TextView textView2 = userSettingFragment.f79852Oooo0OO;
                if (textView2 == null) {
                    OooOOO0.OooOOOO("txtMobile");
                    throw null;
                }
                if (user == null || (string2 = user.getMobile()) == null) {
                    string2 = userSettingFragment.getString(R.string.to_bind);
                    OooOOO0.OooO0o(string2, "getString(...)");
                } else {
                    if (C33599OooOo0O.Oooo0o0(string2)) {
                        string2 = null;
                    }
                    if (string2 == null) {
                    }
                }
                textView2.setText(string2);
                if (user == null || (avatar = user.getAvatar()) == null) {
                    avatar = "";
                }
                C25763OooO00o c25763OooO00oOooO00o = C25764OooO0O0.OooO0o(Uri.parse(avatar)).OooO00o();
                SimpleDraweeView simpleDraweeView = userSettingFragment.f79842OooOoo;
                if (simpleDraweeView != null) {
                    simpleDraweeView.setImageRequest(c25763OooO00oOooO00o);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("userAvatar");
                throw null;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return UserSettingFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79868OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                UserSettingFragment userSettingFragment = UserSettingFragment.this;
                C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                C19550OooO00o c19550OooO00o = new C19550OooO00o(userSettingFragment);
                this.f79868OooOo0o = 1;
                if (c26320o0000OoOOooOoOO.f90225OooOoO.f121747OooOo0o.collect(c19550OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.TABLE_GRID_LIGHT}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79871OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1", m80623f = "UserSettingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ UserSettingFragment f79872OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f79873OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$4", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4}, m80625m = "invokeSuspend")
            public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79874OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79875OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO$OooO00o, reason: collision with other inner class name */
                public static final class C19551OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79876OooOo0o;

                    public C19551OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79876OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        UserSettingFragment userSettingFragment = this.f79876OooOo0o;
                        TextView textView = userSettingFragment.f79861OoooOO0;
                        if (textView != null) {
                            textView.setText(zBooleanValue ? userSettingFragment.getString(R.string.already_bound) : userSettingFragment.getString(R.string.to_bind));
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("accountHuawei");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO(UserSettingFragment userSettingFragment, Continuation<? super OooO> continuation) {
                    super(2, continuation);
                    this.f79874OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO(this.f79874OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79875OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        UserSettingFragment userSettingFragment = this.f79874OooOo;
                        C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                        C19551OooO00o c19551OooO00o = new C19551OooO00o(userSettingFragment);
                        this.f79875OooOo0o = 1;
                        if (c26320o0000OoOOooOoOO.f90234Oooo000.collect(c19551OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$1", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_2}, m80625m = "invokeSuspend")
            public static final class C19552OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79877OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79878OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                public static final class C19553OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79879OooOo0o;

                    public C19553OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79879OooOo0o = userSettingFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        String string;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        UserSettingFragment userSettingFragment = this.f79879OooOo0o;
                        TextView textView = userSettingFragment.f79854Oooo0o0;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("txtPassword");
                            throw null;
                        }
                        Context context = userSettingFragment.getContext();
                        if (context == null) {
                            string = "";
                        } else {
                            string = zBooleanValue ? context.getString(R.string.modify_password) : context.getString(R.string.password_not_set);
                            if (string == null) {
                            }
                        }
                        textView.setText(string);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19552OooO00o(UserSettingFragment userSettingFragment, Continuation<? super C19552OooO00o> continuation) {
                    super(2, continuation);
                    this.f79877OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19552OooO00o(this.f79877OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19552OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79878OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        UserSettingFragment userSettingFragment = this.f79877OooOo;
                        C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                        C19553OooO00o c19553OooO00o = new C19553OooO00o(userSettingFragment);
                        this.f79878OooOo0o = 1;
                        if (c26320o0000OoOOooOoOO.f90237Oooo0O0.collect(c19553OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$10", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4}, m80625m = "invokeSuspend")
            public static final class C19554OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79880OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79881OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                public static final class C19555OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79882OooOo0o;

                    public C19555OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79882OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f79882OooOo0o.f79859OoooO00;
                        if (view != null) {
                            view.setVisibility(zBooleanValue ? 0 : 8);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("hwProgressBar");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19554OooO0O0(UserSettingFragment userSettingFragment, Continuation<? super C19554OooO0O0> continuation) {
                    super(2, continuation);
                    this.f79880OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19554OooO0O0(this.f79880OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C19554OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79881OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    UserSettingFragment userSettingFragment = this.f79880OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                    C19555OooO00o c19555OooO00o = new C19555OooO00o(userSettingFragment);
                    this.f79881OooOo0o = 1;
                    c26320o0000OoOOooOoOO.f90238Oooo0OO.collect(c19555OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$11", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4}, m80625m = "invokeSuspend")
            public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79883OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79884OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
                public static final class C19556OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79885OooOo0o;

                    public C19556OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79885OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        TextView textView = this.f79885OooOo0o.f79861OoooOO0;
                        if (textView != null) {
                            textView.setVisibility(zBooleanValue ? 0 : 8);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("accountHuawei");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0OO(UserSettingFragment userSettingFragment, Continuation<? super OooO0OO> continuation) {
                    super(2, continuation);
                    this.f79883OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0OO(this.f79883OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79884OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    UserSettingFragment userSettingFragment = this.f79883OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                    C19556OooO00o c19556OooO00o = new C19556OooO00o(userSettingFragment);
                    this.f79884OooOo0o = 1;
                    c26320o0000OoOOooOoOO.f90240Oooo0o0.collect(c19556OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0Oo, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$12", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
            public static final class C23885OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79886OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79887OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
                public static final class C19557OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79888OooOo0o;

                    public C19557OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79888OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f79888OooOo0o.f79858OoooO0;
                        if (view != null) {
                            view.setVisibility(zBooleanValue ? 0 : 8);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("honorProgressBar");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23885OooO0Oo(UserSettingFragment userSettingFragment, Continuation<? super C23885OooO0Oo> continuation) {
                    super(2, continuation);
                    this.f79886OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23885OooO0Oo(this.f79886OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C23885OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79887OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    UserSettingFragment userSettingFragment = this.f79886OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                    C19557OooO00o c19557OooO00o = new C19557OooO00o(userSettingFragment);
                    this.f79887OooOo0o = 1;
                    c26320o0000OoOOooOoOO.f90245OoooO00.collect(c19557OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$14", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.HASHTAG}, m80625m = "invokeSuspend")
            public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79889OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79890OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$14$1", m80623f = "UserSettingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19558OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79891OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f79892OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19558OooO00o(UserSettingFragment userSettingFragment, Continuation<? super C19558OooO00o> continuation) {
                        super(2, continuation);
                        this.f79891OooOo = userSettingFragment;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19558OooO00o c19558OooO00o = new C19558OooO00o(this.f79891OooOo, continuation);
                        c19558OooO00o.f79892OooOo0o = obj;
                        return c19558OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                        return ((C19558OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        String string = (String) this.f79892OooOo0o;
                        UserSettingFragment userSettingFragment = this.f79891OooOo;
                        TextView textView = userSettingFragment.f79853Oooo0o;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("txtUid");
                            throw null;
                        }
                        if (string == null) {
                            string = userSettingFragment.getString(R.string.loading);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        }
                        textView.setText(string);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0o(UserSettingFragment userSettingFragment, Continuation<? super OooO0o> continuation) {
                    super(2, continuation);
                    this.f79889OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0o(this.f79889OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79890OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        UserSettingFragment userSettingFragment = this.f79889OooOo;
                        C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                        C19558OooO00o c19558OooO00o = new C19558OooO00o(userSettingFragment, null);
                        this.f79890OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c26320o0000OoOOooOoOO.f90247OoooOO0, c19558OooO00o, this) == enumC32485OooO00o) {
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

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$13", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6}, m80625m = "invokeSuspend")
            public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79893OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79894OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
                public static final class C19559OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79895OooOo0o;

                    public C19559OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79895OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        TextView textView = this.f79895OooOo0o.f79866o000oOoO;
                        if (textView != null) {
                            textView.setVisibility(zBooleanValue ? 0 : 8);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("accountHonor");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0o0(UserSettingFragment userSettingFragment, Continuation<? super OooO0o0> continuation) {
                    super(2, continuation);
                    this.f79893OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0o0(this.f79893OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79894OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    UserSettingFragment userSettingFragment = this.f79893OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                    C19559OooO00o c19559OooO00o = new C19559OooO00o(userSettingFragment);
                    this.f79894OooOo0o = 1;
                    c26320o0000OoOOooOoOO.f90244OoooO0.collect(c19559OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0oO, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$2", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1}, m80625m = "invokeSuspend")
            public static final class C23886OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79896OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79897OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0oO$OooO00o, reason: collision with other inner class name */
                public static final class C19560OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79898OooOo0o;

                    public C19560OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79898OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        UserSettingFragment userSettingFragment = this.f79898OooOo0o;
                        TextView textView = userSettingFragment.f79860OoooO0O;
                        if (textView != null) {
                            textView.setText(zBooleanValue ? userSettingFragment.getString(R.string.already_bound) : userSettingFragment.getString(R.string.to_bind));
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("accountWechat");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23886OooO0oO(UserSettingFragment userSettingFragment, Continuation<? super C23886OooO0oO> continuation) {
                    super(2, continuation);
                    this.f79896OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23886OooO0oO(this.f79896OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C23886OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79897OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        UserSettingFragment userSettingFragment = this.f79896OooOo;
                        C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                        C19560OooO00o c19560OooO00o = new C19560OooO00o(userSettingFragment);
                        this.f79897OooOo0o = 1;
                        if (c26320o0000OoOOooOoOO.f90235Oooo00O.collect(c19560OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0oo, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$3", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
            public static final class C23887OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79899OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79900OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooO0oo$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$3$1", m80623f = "UserSettingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19561OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79901OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ boolean f79902OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19561OooO00o(UserSettingFragment userSettingFragment, Continuation<? super C19561OooO00o> continuation) {
                        super(2, continuation);
                        this.f79901OooOo = userSettingFragment;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19561OooO00o c19561OooO00o = new C19561OooO00o(this.f79901OooOo, continuation);
                        c19561OooO00o.f79902OooOo0o = ((Boolean) obj).booleanValue();
                        return c19561OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C19561OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        boolean z = this.f79902OooOo0o;
                        UserSettingFragment userSettingFragment = this.f79901OooOo;
                        TextView textView = userSettingFragment.f79857OoooO;
                        if (textView != null) {
                            textView.setText(z ? userSettingFragment.getString(R.string.already_bound) : userSettingFragment.getString(R.string.to_bind));
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("accountXiaoMi");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23887OooO0oo(UserSettingFragment userSettingFragment, Continuation<? super C23887OooO0oo> continuation) {
                    super(2, continuation);
                    this.f79899OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23887OooO0oo(this.f79899OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C23887OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79900OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        UserSettingFragment userSettingFragment = this.f79899OooOo;
                        C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                        C19561OooO00o c19561OooO00o = new C19561OooO00o(userSettingFragment, null);
                        this.f79900OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c26320o0000OoOOooOoOO.f90233Oooo0, c19561OooO00o, this) == enumC32485OooO00o) {
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

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$5", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_6}, m80625m = "invokeSuspend")
            public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79903OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79904OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooOO0$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$5$1", m80623f = "UserSettingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19562OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79905OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ boolean f79906OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19562OooO00o(UserSettingFragment userSettingFragment, Continuation<? super C19562OooO00o> continuation) {
                        super(2, continuation);
                        this.f79905OooOo = userSettingFragment;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19562OooO00o c19562OooO00o = new C19562OooO00o(this.f79905OooOo, continuation);
                        c19562OooO00o.f79906OooOo0o = ((Boolean) obj).booleanValue();
                        return c19562OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C19562OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        boolean z = this.f79906OooOo0o;
                        UserSettingFragment userSettingFragment = this.f79905OooOo;
                        TextView textView = userSettingFragment.f79866o000oOoO;
                        if (textView != null) {
                            textView.setText(z ? userSettingFragment.getString(R.string.already_bound) : userSettingFragment.getString(R.string.to_bind));
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("accountHonor");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooOO0(UserSettingFragment userSettingFragment, Continuation<? super OooOO0> continuation) {
                    super(2, continuation);
                    this.f79903OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooOO0(this.f79903OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79904OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        UserSettingFragment userSettingFragment = this.f79903OooOo;
                        C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                        C19562OooO00o c19562OooO00o = new C19562OooO00o(userSettingFragment, null);
                        this.f79904OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c26320o0000OoOOooOoOO.f90236Oooo00o, c19562OooO00o, this) == enumC32485OooO00o) {
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

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$6", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK}, m80625m = "invokeSuspend")
            public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79907OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79908OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooOO0O$OooO00o, reason: collision with other inner class name */
                public static final class C19563OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79909OooOo0o;

                    public C19563OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79909OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f79909OooOo0o.f79856Oooo0oo;
                        if (view != null) {
                            view.setVisibility(zBooleanValue ? 0 : 8);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("wxProgressBar");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooOO0O(UserSettingFragment userSettingFragment, Continuation<? super OooOO0O> continuation) {
                    super(2, continuation);
                    this.f79907OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooOO0O(this.f79907OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79908OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    UserSettingFragment userSettingFragment = this.f79907OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                    C19563OooO00o c19563OooO00o = new C19563OooO00o(userSettingFragment);
                    this.f79908OooOo0o = 1;
                    c26320o0000OoOOooOoOO.f90239Oooo0o.collect(c19563OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooOO0o, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$7", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_1}, m80625m = "invokeSuspend")
            public static final class C23888OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79910OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79911OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooOO0o$OooO00o, reason: collision with other inner class name */
                public static final class C19564OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79912OooOo0o;

                    public C19564OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79912OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        TextView textView = this.f79912OooOo0o.f79860OoooO0O;
                        if (textView != null) {
                            textView.setVisibility(zBooleanValue ? 0 : 8);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("accountWechat");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23888OooOO0o(UserSettingFragment userSettingFragment, Continuation<? super C23888OooOO0o> continuation) {
                    super(2, continuation);
                    this.f79910OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23888OooOO0o(this.f79910OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C23888OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79911OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    UserSettingFragment userSettingFragment = this.f79910OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                    C19564OooO00o c19564OooO00o = new C19564OooO00o(userSettingFragment);
                    this.f79911OooOo0o = 1;
                    c26320o0000OoOOooOoOO.f90241Oooo0oO.collect(c19564OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$9", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_3}, m80625m = "invokeSuspend")
            public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79913OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79914OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooOOO$OooO00o, reason: collision with other inner class name */
                public static final class C19565OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79915OooOo0o;

                    public C19565OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79915OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        TextView textView = this.f79915OooOo0o.f79857OoooO;
                        if (textView != null) {
                            textView.setVisibility(zBooleanValue ? 0 : 8);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("accountXiaoMi");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooOOO(UserSettingFragment userSettingFragment, Continuation<? super OooOOO> continuation) {
                    super(2, continuation);
                    this.f79913OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooOOO(this.f79913OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79914OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    UserSettingFragment userSettingFragment = this.f79913OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                    C19565OooO00o c19565OooO00o = new C19565OooO00o(userSettingFragment);
                    this.f79914OooOo0o = 1;
                    c26320o0000OoOOooOoOO.f90232Oooo.collect(c19565OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$onViewCreated$14$1$8", m80623f = "UserSettingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_2}, m80625m = "invokeSuspend")
            public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserSettingFragment f79916OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79917OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0O0$OooO00o$OooOOO0$OooO00o, reason: collision with other inner class name */
                public static final class C19566OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ UserSettingFragment f79918OooOo0o;

                    public C19566OooO00o(UserSettingFragment userSettingFragment) {
                        this.f79918OooOo0o = userSettingFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f79918OooOo0o.f79846Oooo;
                        if (view != null) {
                            view.setVisibility(zBooleanValue ? 0 : 8);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("xiaomiProgressBar");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooOOO0(UserSettingFragment userSettingFragment, Continuation<? super OooOOO0> continuation) {
                    super(2, continuation);
                    this.f79916OooOo = userSettingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooOOO0(this.f79916OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79917OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    UserSettingFragment userSettingFragment = this.f79916OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoOO = userSettingFragment.OooOoOO();
                    C19566OooO00o c19566OooO00o = new C19566OooO00o(userSettingFragment);
                    this.f79917OooOo0o = 1;
                    c26320o0000OoOOooOoOO.f90242Oooo0oo.collect(c19566OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(UserSettingFragment userSettingFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f79872OooOo = userSettingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f79872OooOo, continuation);
                oooO00o.f79873OooOo0o = obj;
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
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79873OooOo0o;
                UserSettingFragment userSettingFragment = this.f79872OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19552OooO00o(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23886OooO0oO(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23887OooO0oo(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0O(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23888OooOO0o(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO0(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19554OooO0O0(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23885OooO0Oo(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(userSettingFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(userSettingFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return UserSettingFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79871OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                UserSettingFragment userSettingFragment = UserSettingFragment.this;
                OooO00o oooO00o = new OooO00o(userSettingFragment, null);
                this.f79871OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(userSettingFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return UserSettingFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23889OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23889OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return UserSettingFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.home.UserSettingFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23890OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23890OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return UserSettingFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public UserSettingFragment() {
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new OooOO0(this));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f79864OoooOo0 = oooO0O0RegisterForActivityResult;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20439OooO0oo(), new C28977o0ooOO0(this, 1));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f79865OoooOoO = oooO0O0RegisterForActivityResult2;
    }

    public static final void OooOoO(UserSettingFragment userSettingFragment) {
        Context context = userSettingFragment.getContext();
        if (context == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setPackage("com.huawei.hwid");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
        OooOOO0.OooO0o(listQueryIntentActivities, "queryIntentActivities(...)");
        if (!listQueryIntentActivities.isEmpty()) {
            userSettingFragment.startActivity(new Intent(context, (Class<?>) BridgeWakeHMSActivity.class));
            return;
        }
        Intent intentAddFlags = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.hwid")).addFlags(WarningType.HINT);
        OooOOO0.OooO0o(intentAddFlags, "addFlags(...)");
        userSettingFragment.startActivity(intentAddFlags);
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooO0o() {
        return Integer.valueOf(R.color.notein_background_secondary);
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooOO0() {
        return Integer.valueOf(R.string.user_settings);
    }

    public final C26320o0000OoO OooOoOO() {
        return (C26320o0000OoO) this.f79843OooOoo0.getValue();
    }

    public final void OooOoo() {
        Context context = getContext();
        if (context != null) {
            String string = context.getString(R.string.un_bind_tip);
            OooOOO0.OooO0o(string, "getString(...)");
            String string2 = context.getString(R.string.can_not_un_bind_message);
            OooOOO0.OooO0o(string2, "getString(...)");
            OooOooO(string, string2, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC26311Ooooooo());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoo0() {
        Uri uriBuild;
        Context context = getContext();
        if (context == null) {
            return;
        }
        User user = (User) OooOoOO().f90225OooOoO.f121747OooOo0o.getValue();
        String avatar = user != null ? user.getAvatar() : null;
        if (avatar == null || avatar.length() == 0) {
            Resources resources = context.getResources();
            uriBuild = new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(R.drawable.ic_logo_png)).appendPath(resources.getResourceTypeName(R.drawable.ic_logo_png)).appendPath(resources.getResourceEntryName(R.drawable.ic_logo_png)).build();
            OooOOO0.OooO0o(uriBuild, "with(...)");
        } else {
            uriBuild = Uri.parse(avatar);
        }
        OooOOO0.OooO0Oo(uriBuild);
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C30999OooO0oO(uriBuild));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.orion.notein.ui.TipsDialogFragment] */
    public final void OooOooO(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        c24034Oooo00O.f80942OooOo0o = new TipsDialogFragment(str, str2, onClickListener, new o00Ooo(2, onClickListener2, c24034Oooo00O));
        if (getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
            ((TipsDialogFragment) c24034Oooo00O.f80942OooOo0o).show(getChildFragmentManager(), "TipsDialogFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_user_setting, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.nickname_wrapper);
        this.f79845OooOooo = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("nicknameWrapper");
            throw null;
        }
        viewFindViewById.setOnClickListener(new o0OoO000.OooO0OO(this, 5));
        View viewFindViewById2 = view.findViewById(R.id.mobile_wrapper);
        this.f79848Oooo000 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("mobileWrapper");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new OooO0o(this, 5));
        View viewFindViewById3 = view.findViewById(R.id.password_wrapper);
        viewFindViewById3.setOnClickListener(new oo000o(this, 8));
        this.f79850Oooo00o = viewFindViewById3;
        this.f79854Oooo0o0 = (TextView) view.findViewById(R.id.txt_password);
        View viewFindViewById4 = view.findViewById(R.id.wx_account_wrapper);
        OooOOO0.OooO0Oo(viewFindViewById4);
        C28050OooO0OO.OooO00o(viewFindViewById4, 1500L, new ViewOnClickListenerC26311Ooooooo());
        View viewFindViewById5 = view.findViewById(R.id.xiaomi_account_wrapper);
        OooOOO0.OooO0Oo(viewFindViewById5);
        C28050OooO0OO.OooO00o(viewFindViewById5, 1500L, new ViewOnClickListenerC26311Ooooooo());
        final View viewFindViewById6 = view.findViewById(R.id.hw_account_wrapper);
        OooOOO0.OooO0Oo(viewFindViewById6);
        viewFindViewById6.setVisibility(!C28039OooO00o.OooO0O0() ? 0 : 8);
        C28050OooO0OO.OooO00o(viewFindViewById6, 1500L, new View.OnClickListener() { // from class: o0oOoO0.OooO00o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String wxOpenID;
                String wxOpenID2;
                String honorOpenID;
                String wxOpenID3;
                String honorOpenID2;
                UserSettingFragment userSettingFragment = this.f110692OooOo0o;
                User user = (User) userSettingFragment.OooOoOO().f90225OooOoO.f121747OooOo0o.getValue();
                if (user != null) {
                    String hwOpenID = user.getHwOpenID();
                    if (hwOpenID == null || hwOpenID.length() == 0) {
                        o00000OO o00000oo2 = userSettingFragment.f79862OoooOOO;
                        if (o00000oo2 != null) {
                            o00000oo2.cancel((CancellationException) null);
                        }
                        InterfaceC21987OooOoo viewLifecycleOwner = userSettingFragment.getViewLifecycleOwner();
                        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        userSettingFragment.f79862OoooOOO = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30994OooO0O0(userSettingFragment, null), 3);
                        return;
                    }
                    Context context = viewFindViewById6.getContext();
                    if (context != null) {
                        if (C28039OooO00o.OooO0O0()) {
                            if (user.getMobile().length() == 0 && (((wxOpenID3 = user.getWxOpenID()) == null || wxOpenID3.length() == 0) && ((honorOpenID2 = user.getHonorOpenID()) == null || honorOpenID2.length() == 0))) {
                                userSettingFragment.OooOoo();
                                return;
                            }
                        } else if (C28039OooO00o.OooO0OO()) {
                            if (user.getMobile().length() == 0 && (((wxOpenID2 = user.getWxOpenID()) == null || wxOpenID2.length() == 0) && ((honorOpenID = user.getHonorOpenID()) == null || honorOpenID.length() == 0))) {
                                userSettingFragment.OooOoo();
                                return;
                            }
                        } else if (user.getMobile().length() == 0 && ((wxOpenID = user.getWxOpenID()) == null || wxOpenID.length() == 0)) {
                            userSettingFragment.OooOoo();
                        }
                        String string = context.getString(R.string.un_bind_tip);
                        OooOOO0.OooO0o(string, "getString(...)");
                        String string2 = context.getString(R.string.un_bind_hw_message);
                        OooOOO0.OooO0o(string2, "getString(...)");
                        userSettingFragment.OooOooO(string, string2, new ViewOnClickListenerC26311Ooooooo(), new o00O0O(userSettingFragment, 5));
                    }
                }
            }
        });
        View viewFindViewById7 = view.findViewById(R.id.honor_account_wrapper);
        OooOOO0.OooO0Oo(viewFindViewById7);
        viewFindViewById7.setVisibility(C33595OooOOo.OooOOo(Build.MANUFACTURER, "HONOR", true) ? 0 : 8);
        C28050OooO0OO.OooO00o(viewFindViewById7, 1500L, new ViewOnClickListenerC29119OooOoo0(this, viewFindViewById7, 1));
        this.f79859OoooO00 = view.findViewById(R.id.pb_hw);
        this.f79846Oooo = view.findViewById(R.id.pb_xiaomi);
        this.f79856Oooo0oo = view.findViewById(R.id.pb_wx);
        this.f79858OoooO0 = view.findViewById(R.id.pb_honor);
        View viewFindViewById8 = view.findViewById(R.id.logoff_wrapper);
        this.f79849Oooo00O = viewFindViewById8;
        if (viewFindViewById8 == null) {
            OooOOO0.OooOOOO("logoffWrapper");
            throw null;
        }
        viewFindViewById8.setOnClickListener(new o0OO00O(this, 7));
        this.f79851Oooo0O0 = (TextView) view.findViewById(R.id.txt_nickname);
        this.f79852Oooo0OO = (TextView) view.findViewById(R.id.txt_mobile);
        this.f79847Oooo0 = view.findViewById(R.id.uid_wrapper);
        this.f79853Oooo0o = (TextView) view.findViewById(R.id.tv_uid);
        View viewFindViewById9 = view.findViewById(R.id.btn_copy_uid);
        this.f79855Oooo0oO = viewFindViewById9;
        if (viewFindViewById9 == null) {
            OooOOO0.OooOOOO("btnCopyUid");
            throw null;
        }
        viewFindViewById9.setOnClickListener(new ViewOnClickListenerC29113OooOo0O(this, 5));
        this.f79860OoooO0O = (TextView) view.findViewById(R.id.txt_wx);
        this.f79857OoooO = (TextView) view.findViewById(R.id.txt_xiaomi);
        this.f79861OoooOO0 = (TextView) view.findViewById(R.id.txt_hw);
        this.f79866o000oOoO = (TextView) view.findViewById(R.id.txt_honor);
        view.findViewById(R.id.avatar_item_wrapper).setOnClickListener(new ViewOnClickListenerC28253Oooo00O(this, 3));
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.iv_user_avatar);
        this.f79842OooOoo = simpleDraweeView;
        if (simpleDraweeView == null) {
            OooOOO0.OooOOOO("userAvatar");
            throw null;
        }
        simpleDraweeView.setOnClickListener(new ViewOnClickListenerC30097OooO0Oo(this, 2));
        View viewFindViewById10 = view.findViewById(R.id.btn_modify_user_avatar);
        this.f79844OooOooO = viewFindViewById10;
        if (viewFindViewById10 == null) {
            OooOOO0.OooOOOO("btnModifyUserAvatar");
            throw null;
        }
        viewFindViewById10.setOnClickListener(new ViewOnClickListenerC28526OooO0o0(this, 5));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0O0(null), 3);
    }
}

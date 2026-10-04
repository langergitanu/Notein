package com.orion.notein.p607ui.user;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.facebook.drawee.view.SimpleDraweeView;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.User;
import com.orion.notein.domain.models.cloud.NoteCloudQuota;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.feedback.FeedbackDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24564OooO00o;
import o00o00O0.C25252OooO0Oo;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o0O0oo0O.ViewOnClickListenerC26210OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28136OooO0O0;
import o0Oo0Ooo.ViewOnClickListenerC28137OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28139OooO0o;
import o0Oo0o00.C28201OooooO0;
import o0Oo0ooO.ViewOnClickListenerC28407OooO00o;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0Oo0ooO.ViewOnClickListenerC28415OooOO0;
import o0OoO0OO.ViewOnClickListenerC28609OooO0oO;
import o0OoO0OO.ViewOnClickListenerC28610OooO0oo;
import o0o00oO0.ViewOnClickListenerC30011Oooo0OO;
import o0oOo0.C30922OooOOO;
import o0oOoOo.o00Oo0;
import o0oo000O.OooOO0O;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/UserInfoFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserInfoFragment extends Hilt_UserInfoFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f79631OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public SimpleDraweeView f79632OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ViewGroup f79633OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f79634OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ViewGroup f79635Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f79636Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f79637Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f79638Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f79639Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f79640Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f79641Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f79642Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f79643Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f79644Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f79645Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final C22026ooOO f79646OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f79647OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f79648OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final C22026ooOO f79649OoooO0O;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.UserInfoFragment$onViewCreated$1", m80623f = "UserInfoFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f79651OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.user.UserInfoFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.UserInfoFragment$onViewCreated$1$1", m80623f = "UserInfoFragment.kt", m80624l = {114}, m80625m = "invokeSuspend")
        public static final class C19540OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ UserInfoFragment f79652OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79653OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.UserInfoFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19541OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ UserInfoFragment f79654OooOo0o;

                public C19541OooO00o(UserInfoFragment userInfoFragment) {
                    this.f79654OooOo0o = userInfoFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    User user = (User) obj;
                    if (user != null) {
                        UserInfoFragment userInfoFragment = this.f79654OooOo0o;
                        String avatar = user.getAvatar();
                        if (avatar == null) {
                            avatar = "";
                        }
                        C25763OooO00o c25763OooO00oOooO00o = C25764OooO0O0.OooO0o(Uri.parse(avatar)).OooO00o();
                        SimpleDraweeView simpleDraweeView = userInfoFragment.f79632OooOoo0;
                        if (simpleDraweeView == null) {
                            OooOOO0.OooOOOO("userAvatar");
                            throw null;
                        }
                        simpleDraweeView.setImageRequest(c25763OooO00oOooO00o);
                        TextView textView = userInfoFragment.f79631OooOoo;
                        if (textView == null) {
                            OooOOO0.OooOOOO("userNickName");
                            throw null;
                        }
                        String nickname = user.getNickname();
                        if (nickname.length() == 0) {
                            nickname = user.getMobile();
                        }
                        textView.setText(nickname);
                        Integer membership = user.getMembership();
                        if (membership != null && membership.intValue() == 0) {
                            ViewGroup viewGroup = userInfoFragment.f79633OooOooO;
                            if (viewGroup == null) {
                                OooOOO0.OooOOOO("userMemberTag");
                                throw null;
                            }
                            viewGroup.setVisibility(8);
                            View view = userInfoFragment.f79634OooOooo;
                            if (view == null) {
                                OooOOO0.OooOOOO("userRegisteredTag");
                                throw null;
                            }
                            view.setVisibility(0);
                            TextView textView2 = userInfoFragment.f79637Oooo000;
                            if (textView2 == null) {
                                OooOOO0.OooOOOO("vipExpireAt");
                                throw null;
                            }
                            textView2.setVisibility(8);
                            userInfoFragment.OooOoo0(false);
                            TextView textView3 = userInfoFragment.f79638Oooo00O;
                            if (textView3 == null) {
                                OooOOO0.OooOOOO("upgradeText");
                                throw null;
                            }
                            textView3.setText(userInfoFragment.getString(R.string.cta_open_vip_unlock_all));
                            userInfoFragment.OooOooo(R.color.color_cta_regular);
                        } else if (membership != null && membership.intValue() == 1) {
                            boolean zIsForeverVip = user.isForeverVip();
                            ViewGroup viewGroup2 = userInfoFragment.f79633OooOooO;
                            if (viewGroup2 == null) {
                                OooOOO0.OooOOOO("userMemberTag");
                                throw null;
                            }
                            viewGroup2.setVisibility(0);
                            View view2 = userInfoFragment.f79634OooOooo;
                            if (view2 == null) {
                                OooOOO0.OooOOOO("userRegisteredTag");
                                throw null;
                            }
                            view2.setVisibility(8);
                            TextView textView4 = userInfoFragment.f79637Oooo000;
                            if (textView4 == null) {
                                OooOOO0.OooOOOO("vipExpireAt");
                                throw null;
                            }
                            textView4.setVisibility(0);
                            if (zIsForeverVip) {
                                TextView textView5 = userInfoFragment.f79637Oooo000;
                                if (textView5 == null) {
                                    OooOOO0.OooOOOO("vipExpireAt");
                                    throw null;
                                }
                                textView5.setText(userInfoFragment.getString(R.string.vip_expire_time));
                            } else {
                                String string = userInfoFragment.getString(R.string.date_format);
                                OooOOO0.OooO0o(string, "getString(...)");
                                String formattedMembershipEndTime = user.getFormattedMembershipEndTime(string);
                                TextView textView6 = userInfoFragment.f79637Oooo000;
                                if (textView6 == null) {
                                    OooOOO0.OooOOOO("vipExpireAt");
                                    throw null;
                                }
                                textView6.setText(userInfoFragment.getString(R.string.vip_expire_time_, formattedMembershipEndTime != null ? formattedMembershipEndTime : ""));
                            }
                            userInfoFragment.OooOoo0(zIsForeverVip);
                            TextView textView7 = userInfoFragment.f79638Oooo00O;
                            if (textView7 == null) {
                                OooOOO0.OooOOOO("upgradeText");
                                throw null;
                            }
                            textView7.setText(userInfoFragment.getString(R.string.upgrade_membership_better_value));
                            userInfoFragment.OooOooo(R.color.color_cta_vip);
                        } else {
                            ViewGroup viewGroup3 = userInfoFragment.f79633OooOooO;
                            if (viewGroup3 == null) {
                                OooOOO0.OooOOOO("userMemberTag");
                                throw null;
                            }
                            viewGroup3.setVisibility(8);
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("UserInfoFragment");
                            c20358OooO00o.OooOO0O("updateUserInfo: unknown membership type: " + user.getMembership(), new Object[0]);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19540OooO00o(UserInfoFragment userInfoFragment, Continuation<? super C19540OooO00o> continuation) {
                super(2, continuation);
                this.f79652OooOo = userInfoFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19540OooO00o(this.f79652OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19540OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79653OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    UserInfoFragment userInfoFragment = this.f79652OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) userInfoFragment.f79649OoooO0O.getValue();
                    C19541OooO00o c19541OooO00o = new C19541OooO00o(userInfoFragment);
                    this.f79653OooOo0o = 1;
                    if (c26320o0000OoO.f90225OooOoO.f121747OooOo0o.collect(c19541OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.UserInfoFragment$onViewCreated$1$2", m80623f = "UserInfoFragment.kt", m80624l = {117}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ UserInfoFragment f79655OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79656OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.UserInfoFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19542OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ UserInfoFragment f79657OooOo0o;

                public C19542OooO00o(UserInfoFragment userInfoFragment) {
                    this.f79657OooOo0o = userInfoFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    o00Oo0 o00oo02 = (o00Oo0) obj;
                    if (o00oo02 != null) {
                        UserInfoFragment userInfoFragment = this.f79657OooOo0o;
                        TextView textView = userInfoFragment.f79636Oooo0;
                        if (textView == null) {
                            OooOOO0.OooOOOO("userDaysOfUse");
                            throw null;
                        }
                        textView.setText(String.valueOf(o00oo02.f110967OooO0O0));
                        TextView textView2 = userInfoFragment.f79640Oooo0O0;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("userNotesOfUse");
                            throw null;
                        }
                        textView2.setText(String.valueOf(o00oo02.f110968OooO0OO));
                        TextView textView3 = userInfoFragment.f79648OoooO00;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("notificationTips");
                            throw null;
                        }
                        int i = o00oo02.f110971OooO0o0;
                        textView3.setText(String.valueOf(i));
                        TextView textView4 = userInfoFragment.f79648OoooO00;
                        if (textView4 == null) {
                            OooOOO0.OooOOOO("notificationTips");
                            throw null;
                        }
                        textView4.setVisibility(i > 0 ? 0 : 8);
                        TextView textView5 = userInfoFragment.f79647OoooO0;
                        if (textView5 == null) {
                            OooOOO0.OooOOOO("myCouponsTxt");
                            throw null;
                        }
                        int i2 = o00oo02.f110969OooO0Oo;
                        textView5.setText(i2 <= 0 ? userInfoFragment.getString(R.string.coupon_unavailable) : userInfoFragment.getString(R.string.num_of_available_coupons, Integer.valueOf(i2)));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(UserInfoFragment userInfoFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f79655OooOo = userInfoFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f79655OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79656OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    UserInfoFragment userInfoFragment = this.f79655OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) userInfoFragment.f79649OoooO0O.getValue();
                    C19542OooO00o c19542OooO00o = new C19542OooO00o(userInfoFragment);
                    this.f79656OooOo0o = 1;
                    if (c26320o0000OoO.f90243OoooO.f121747OooOo0o.collect(c19542OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.UserInfoFragment$onViewCreated$1$3", m80623f = "UserInfoFragment.kt", m80624l = {120}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ UserInfoFragment f79658OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79659OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.UserInfoFragment$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.UserInfoFragment$onViewCreated$1$3$1", m80623f = "UserInfoFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19543OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends NoteCloudQuota>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ UserInfoFragment f79660OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f79661OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19543OooO00o(UserInfoFragment userInfoFragment, Continuation<? super C19543OooO00o> continuation) {
                    super(2, continuation);
                    this.f79660OooOo = userInfoFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19543OooO00o c19543OooO00o = new C19543OooO00o(this.f79660OooOo, continuation);
                    c19543OooO00o.f79661OooOo0o = obj;
                    return c19543OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Boolean, ? extends NoteCloudQuota> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19543OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
                @Override // oO00ooo.AbstractC32477OooO00o
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    String strOooO0OO;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteCloudQuota noteCloudQuota = (NoteCloudQuota) ((C32443OooOOO) this.f79661OooOo0o).f116637OooOo;
                    UserInfoFragment userInfoFragment = this.f79660OooOo;
                    Long lValueOf = noteCloudQuota != null ? Long.valueOf(noteCloudQuota.getUsedSpace()) : null;
                    C32443OooOOO c32443OooOOOOooOooO = UserInfoFragment.OooOooO((lValueOf == null || lValueOf.longValue() <= 0) ? "0MB" : C31430OooO00o.OooO0OO(lValueOf.longValue()));
                    String str = (String) c32443OooOOOOooOooO.f116638OooOo0o;
                    String str2 = (String) c32443OooOOOOooOooO.f116637OooOo;
                    if (str.length() == 0) {
                        str = "0";
                    }
                    TextView textView = userInfoFragment.f79641Oooo0OO;
                    if (textView == null) {
                        OooOOO0.OooOOOO("userCloudSync");
                        throw null;
                    }
                    textView.setText(str);
                    TextView textView2 = userInfoFragment.f79643Oooo0o0;
                    if (textView2 == null) {
                        OooOOO0.OooOOOO("userCloudSyncUnit");
                        throw null;
                    }
                    textView2.setText(str2);
                    TextView textView3 = userInfoFragment.f79643Oooo0o0;
                    if (textView3 == null) {
                        OooOOO0.OooOOOO("userCloudSyncUnit");
                        throw null;
                    }
                    boolean z = true;
                    textView3.setVisibility(str2.length() > 0 ? 0 : 8);
                    if (noteCloudQuota != null) {
                        long userCapacity = noteCloudQuota.getUserCapacity();
                        Long lValueOf2 = Long.valueOf(userCapacity);
                        if (userCapacity <= 0) {
                            lValueOf2 = null;
                        }
                        strOooO0OO = lValueOf2 != null ? C31430OooO00o.OooO0OO(lValueOf2.longValue()) : null;
                    }
                    if (strOooO0OO == null || strOooO0OO.length() == 0) {
                        TextView textView4 = userInfoFragment.f79642Oooo0o;
                        if (textView4 == null) {
                            OooOOO0.OooOOOO("userCloudSyncSeparator");
                            throw null;
                        }
                        textView4.setVisibility(8);
                        TextView textView5 = userInfoFragment.f79644Oooo0oO;
                        if (textView5 == null) {
                            OooOOO0.OooOOOO("userCloudSyncTotal");
                            throw null;
                        }
                        textView5.setVisibility(8);
                        TextView textView6 = userInfoFragment.f79644Oooo0oO;
                        if (textView6 == null) {
                            OooOOO0.OooOOOO("userCloudSyncTotal");
                            throw null;
                        }
                        textView6.setText("");
                        TextView textView7 = userInfoFragment.f79645Oooo0oo;
                        if (textView7 == null) {
                            OooOOO0.OooOOOO("userCloudSyncTotalUnit");
                            throw null;
                        }
                        textView7.setVisibility(8);
                        TextView textView8 = userInfoFragment.f79645Oooo0oo;
                        if (textView8 == null) {
                            OooOOO0.OooOOOO("userCloudSyncTotalUnit");
                            throw null;
                        }
                        textView8.setText("");
                    } else {
                        C32443OooOOO c32443OooOOOOooOooO2 = UserInfoFragment.OooOooO(strOooO0OO);
                        String str3 = (String) c32443OooOOOOooOooO2.f116638OooOo0o;
                        String str4 = (String) c32443OooOOOOooOooO2.f116637OooOo;
                        if (str3.length() <= 0 && str4.length() <= 0) {
                            z = false;
                        }
                        TextView textView9 = userInfoFragment.f79642Oooo0o;
                        if (textView9 == null) {
                            OooOOO0.OooOOOO("userCloudSyncSeparator");
                            throw null;
                        }
                        textView9.setVisibility(z ? 0 : 8);
                        TextView textView10 = userInfoFragment.f79644Oooo0oO;
                        if (textView10 == null) {
                            OooOOO0.OooOOOO("userCloudSyncTotal");
                            throw null;
                        }
                        textView10.setText(str3);
                        TextView textView11 = userInfoFragment.f79644Oooo0oO;
                        if (textView11 == null) {
                            OooOOO0.OooOOOO("userCloudSyncTotal");
                            throw null;
                        }
                        textView11.setVisibility(str3.length() > 0 ? 0 : 8);
                        TextView textView12 = userInfoFragment.f79645Oooo0oo;
                        if (textView12 == null) {
                            OooOOO0.OooOOOO("userCloudSyncTotalUnit");
                            throw null;
                        }
                        textView12.setText(str4);
                        TextView textView13 = userInfoFragment.f79645Oooo0oo;
                        if (textView13 == null) {
                            OooOOO0.OooOOOO("userCloudSyncTotalUnit");
                            throw null;
                        }
                        textView13.setVisibility(str4.length() <= 0 ? 8 : 0);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(UserInfoFragment userInfoFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f79658OooOo = userInfoFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f79658OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79659OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    UserInfoFragment userInfoFragment = this.f79658OooOo;
                    C28201OooooO0 c28201OooooO0 = (C28201OooooO0) userInfoFragment.f79646OoooO.getValue();
                    C19543OooO00o c19543OooO00o = new C19543OooO00o(userInfoFragment, null);
                    this.f79659OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c28201OooooO0.f99964Oooo000, c19543OooO00o, this) == enumC32485OooO00o) {
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
            OooO00o oooO00o = UserInfoFragment.this.new OooO00o(continuation);
            oooO00o.f79651OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79651OooOo0o;
            UserInfoFragment userInfoFragment = UserInfoFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19540OooO00o(userInfoFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(userInfoFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(userInfoFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return UserInfoFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return UserInfoFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.UserInfoFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23862OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23862OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return UserInfoFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return UserInfoFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.UserInfoFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23863OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23863OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return UserInfoFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.UserInfoFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23864OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23864OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return UserInfoFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public UserInfoFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79649OoooO0O = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23862OooO0Oo(), new OooO0OO());
        this.f79646OoooO = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new C23863OooO0o0(), new C23864OooO0oO(), new OooO0o());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(UserInfoFragment userInfoFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30922OooOOO c30922OooOOO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30922OooOOO) {
            c30922OooOOO = (C30922OooOOO) abstractC32479OooO0OO;
            int i2 = c30922OooOOO.f110496OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30922OooOOO.f110496OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30922OooOOO = new C30922OooOOO(userInfoFragment, abstractC32479OooO0OO);
            }
        }
        C30922OooOOO c30922OooOOO2 = c30922OooOOO;
        Object objShowNonVipFeatureLimitedDialog$default = c30922OooOOO2.f110495OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30922OooOOO2.f110496OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = userInfoFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30922OooOOO2.f110496OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30922OooOOO2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public static C32443OooOOO OooOooO(String str) {
        String string = C33599OooOo0O.Oooooo0(str).toString();
        if (string.length() == 0) {
            return new C32443OooOOO("", "");
        }
        int length = string.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (Character.isLetter(string.charAt(i))) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return new C32443OooOOO(string, "");
        }
        String strSubstring = string.substring(0, i);
        OooOOO0.OooO0o(strSubstring, "substring(...)");
        String string2 = C33599OooOo0O.Oooooo0(strSubstring).toString();
        String strSubstring2 = string.substring(i);
        OooOOO0.OooO0o(strSubstring2, "substring(...)");
        return new C32443OooOOO(string2, C33599OooOo0O.Oooooo0(strSubstring2).toString());
    }

    public final void OooOoo() {
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        if (OooOO0O.OooO00o(contextRequireContext)) {
            new FeedbackDialogFragment().show(getParentFragmentManager(), "FeedbackDialogFragment");
        } else {
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C24564OooO00o(R.id.action_to_feedbackContainerFragment));
        }
    }

    public final void OooOoo0(boolean z) {
        View view = getView();
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.user_info_footer);
        View viewFindViewById2 = view.findViewById(R.id.user_info_header);
        int dimensionPixelSize = getResources().getDimensionPixelSize(z ? R.dimen.user_info_header_height_forever : R.dimen.user_info_header_height_default);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            viewFindViewById2.setLayoutParams(layoutParams);
            viewFindViewById2.setBackground(ContextCompat.getDrawable(requireContext(), z ? R.drawable.bg_userinfo_gradient : R.drawable.bg_userinfo_gradient_top));
            viewFindViewById2.requestLayout();
        }
        if (z) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
                return;
            }
            return;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.bg_userinfo_gradient_bottom));
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.user_info_card_section_min_height);
            viewFindViewById.setMinimumHeight(dimensionPixelSize2);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            layoutParams2.height = dimensionPixelSize2;
            viewFindViewById.setLayoutParams(layoutParams2);
            viewFindViewById.requestLayout();
        }
    }

    public final void OooOooo(int i) {
        View view = this.f79639Oooo00o;
        if (view == null) {
            OooOOO0.OooOOOO("userInfoFooter");
            throw null;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_cta_icon);
        View view2 = this.f79639Oooo00o;
        if (view2 == null) {
            OooOOO0.OooOOOO("userInfoFooter");
            throw null;
        }
        TextView textView = (TextView) view2.findViewById(R.id.tv_upgrade_text);
        View view3 = this.f79639Oooo00o;
        if (view3 == null) {
            OooOOO0.OooOOOO("userInfoFooter");
            throw null;
        }
        ImageView imageView2 = (ImageView) view3.findViewById(R.id.iv_cta_arrow);
        int color = ContextCompat.getColor(requireContext(), i);
        imageView.setImageTintList(ColorStateList.valueOf(color));
        imageView2.setImageTintList(ColorStateList.valueOf(color));
        textView.setTextColor(color);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_user_info, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((C26320o0000OoO) this.f79649OoooO0O.getValue()).OooOO0O();
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.btn_back).setOnClickListener(new ViewOnClickListenerC28139OooO0o(this, 6));
        this.f79632OooOoo0 = (SimpleDraweeView) view.findViewById(R.id.iv_user_avatar);
        this.f79631OooOoo = (TextView) view.findViewById(R.id.tv_user_name);
        this.f79633OooOooO = (ViewGroup) view.findViewById(R.id.cl_user_member_tag);
        this.f79634OooOooo = view.findViewById(R.id.tv_user_registered_tag);
        this.f79637Oooo000 = (TextView) view.findViewById(R.id.tv_user_vip_expire_at);
        this.f79638Oooo00O = (TextView) view.findViewById(R.id.tv_upgrade_text);
        View viewFindViewById = view.findViewById(R.id.user_info_footer);
        this.f79639Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("userInfoFooter");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28415OooOO0(this, 3));
        this.f79636Oooo0 = (TextView) view.findViewById(R.id.tv_days);
        this.f79640Oooo0O0 = (TextView) view.findViewById(R.id.tv_notes);
        this.f79641Oooo0OO = (TextView) view.findViewById(R.id.tv_sync);
        this.f79643Oooo0o0 = (TextView) view.findViewById(R.id.tv_sync_unit);
        this.f79642Oooo0o = (TextView) view.findViewById(R.id.tv_sync_separator);
        this.f79644Oooo0oO = (TextView) view.findViewById(R.id.tv_sync_total);
        this.f79645Oooo0oo = (TextView) view.findViewById(R.id.tv_sync_total_unit);
        ViewOnClickListenerC28408OooO0O0 viewOnClickListenerC28408OooO0O0 = new ViewOnClickListenerC28408OooO0O0(this, 7);
        ArrayList arrayList = new ArrayList();
        View viewFindViewById2 = view.findViewById(R.id.sync_value_container);
        if (viewFindViewById2 != null) {
            arrayList.add(viewFindViewById2);
        }
        TextView textView = this.f79641Oooo0OO;
        if (textView == null) {
            OooOOO0.OooOOOO("userCloudSync");
            throw null;
        }
        TextView textView2 = this.f79643Oooo0o0;
        if (textView2 == null) {
            OooOOO0.OooOOOO("userCloudSyncUnit");
            throw null;
        }
        TextView textView3 = this.f79642Oooo0o;
        if (textView3 == null) {
            OooOOO0.OooOOOO("userCloudSyncSeparator");
            throw null;
        }
        TextView textView4 = this.f79644Oooo0oO;
        if (textView4 == null) {
            OooOOO0.OooOOOO("userCloudSyncTotal");
            throw null;
        }
        TextView textView5 = this.f79645Oooo0oo;
        if (textView5 == null) {
            OooOOO0.OooOOOO("userCloudSyncTotalUnit");
            throw null;
        }
        C34431OooOo0.OooOo0o(arrayList, C34429OooOOo0.OooOO0o(textView, textView2, textView3, textView4, textView5));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C28050OooO0OO.OooO00o((View) it.next(), 500L, viewOnClickListenerC28408OooO0O0);
        }
        this.f79635Oooo = (ViewGroup) view.findViewById(R.id.message_wrapper);
        this.f79648OoooO00 = (TextView) view.findViewById(R.id.tv_unread_message_count);
        ViewGroup viewGroup = this.f79635Oooo;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("notification");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup, 500L, new ViewOnClickListenerC28407OooO00o(this, 5));
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.settings_wrapper);
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("userSettings");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup2, 500L, new ViewOnClickListenerC28609OooO0oO(this, 3));
        this.f79647OoooO0 = (TextView) view.findViewById(R.id.tv_coupons);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.coupon_wrapper);
        if (viewGroup3 == null) {
            OooOOO0.OooOOOO("myCoupons");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup3, 500L, new ViewOnClickListenerC26311Ooooooo());
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.feedback_wrapper);
        if (viewGroup4 == null) {
            OooOOO0.OooOOOO("feedback");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup4, 500L, new ViewOnClickListenerC28610OooO0oo(this, 5));
        ViewGroup viewGroup5 = (ViewGroup) view.findViewById(R.id.about_wrapper);
        if (viewGroup5 == null) {
            OooOOO0.OooOOOO("about");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup5, 500L, new ViewOnClickListenerC28413OooO0oO(this, 6));
        ViewGroup viewGroup6 = (ViewGroup) view.findViewById(R.id.help_wrapper);
        if (viewGroup6 == null) {
            OooOOO0.OooOOOO("help");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup6, 500L, new ViewOnClickListenerC26210OooO00o(this, 6));
        View viewFindViewById3 = view.findViewById(R.id.btn_logout);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28136OooO0O0(this, 6));
        }
        View viewFindViewById4 = view.findViewById(R.id.feedback_wrapper);
        if (viewFindViewById4 != null) {
            C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new ViewOnClickListenerC28137OooO0OO(this, 5));
        }
        View viewFindViewById5 = view.findViewById(R.id.about_wrapper);
        if (viewFindViewById5 != null) {
            C28050OooO0OO.OooO00o(viewFindViewById5, 500L, new ViewOnClickListenerC30011Oooo0OO(this, 2));
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}

package com.orion.notein.p607ui.user.firebase;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.bumptech.glide.C22253OooOO0o;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.ViewOnClickListenerC26302OoooOoo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.ViewOnClickListenerC28223OooO;
import o0OoO.ViewOnClickListenerC28501OooO0Oo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/firebase/FirebaseUserSettingsFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseUserSettingsFragment extends Hilt_FirebaseUserSettingsFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ImageView f79736OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79737OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C26320o0000OoO.class), new OooO0OO(), new C23873OooO0o0(), new C23872OooO0Oo());

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ViewGroup f79738OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f79739OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f79740Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f79741Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f79742Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f79743Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f79744Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f79745Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f79746Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f79747Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f79748Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final FirebaseAuth f79749Oooo0oo;

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f79750OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f79751OooO0O0;

        static {
            int[] iArr = new int[FirebaseUserMembership.SubscriptionType.values().length];
            try {
                iArr[FirebaseUserMembership.SubscriptionType.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FirebaseUserMembership.SubscriptionType.YEARLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79750OooO00o = iArr;
            int[] iArr2 = new int[FirebaseUserMembership.MembershipType.values().length];
            try {
                iArr2[FirebaseUserMembership.MembershipType.FREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FirebaseUserMembership.MembershipType.SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FirebaseUserMembership.MembershipType.LIFE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f79751OooO0O0 = iArr2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$onViewCreated$7", m80623f = "FirebaseUserSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f79753OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$onViewCreated$7$1", m80623f = "FirebaseUserSettingsFragment.kt", m80624l = {128}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FirebaseUserSettingsFragment f79754OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79755OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19547OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FirebaseUserSettingsFragment f79756OooOo0o;

                public C19547OooO00o(FirebaseUserSettingsFragment firebaseUserSettingsFragment) {
                    this.f79756OooOo0o = firebaseUserSettingsFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) obj;
                    FirebaseUserSettingsFragment firebaseUserSettingsFragment = this.f79756OooOo0o;
                    Context context = firebaseUserSettingsFragment.getContext();
                    if (context != null) {
                        FirebaseUser currentUser = firebaseUserSettingsFragment.f79749Oooo0oo.getCurrentUser();
                        if (noteinFirebaseUser != null) {
                            if (OooOOO0.OooO0O0(noteinFirebaseUser.getFirebaseUid(), currentUser != null ? currentUser.getUid() : null)) {
                                TextView textView = firebaseUserSettingsFragment.f79741Oooo000;
                                if (textView == null) {
                                    OooOOO0.OooOOOO("txtUserName");
                                    throw null;
                                }
                                String displayName = currentUser.getDisplayName();
                                if (displayName == null) {
                                    displayName = firebaseUserSettingsFragment.getString(R.string.default_user_name);
                                    OooOOO0.OooO0o(displayName, "getString(...)");
                                }
                                textView.setText(displayName);
                                TextView textView2 = firebaseUserSettingsFragment.f79742Oooo00O;
                                if (textView2 == null) {
                                    OooOOO0.OooOOOO("txtEmail");
                                    throw null;
                                }
                                String concatEmail = noteinFirebaseUser.getConcatEmail();
                                String string = "";
                                if (concatEmail == null) {
                                    concatEmail = "";
                                }
                                textView2.setText(concatEmail);
                                List<? extends UserInfo> providerData = currentUser.getProviderData();
                                OooOOO0.OooO0o(providerData, "getProviderData(...)");
                                ArrayList arrayList = new ArrayList();
                                for (T t : providerData) {
                                    if (!OooOOO0.OooO0O0(((UserInfo) t).getProviderId(), "firebase")) {
                                        arrayList.add(t);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((UserInfo) it.next()).getProviderId());
                                }
                                TextView textView3 = firebaseUserSettingsFragment.f79743Oooo00o;
                                if (textView3 == null) {
                                    OooOOO0.OooOOOO("txtProvider");
                                    throw null;
                                }
                                if (arrayList2.size() > 1) {
                                    string = "Multiple Providers";
                                } else if (OooOOO0.OooO0O0(OooOo.Oooo(arrayList2), "google.com")) {
                                    string = firebaseUserSettingsFragment.getString(R.string.google);
                                    OooOOO0.OooO0Oo(string);
                                } else if (OooOOO0.OooO0O0(OooOo.Oooo(arrayList2), "microsoft.com")) {
                                    string = firebaseUserSettingsFragment.getString(R.string.microsoft);
                                    OooOOO0.OooO0Oo(string);
                                } else if (OooOOO0.OooO0O0(OooOo.Oooo(arrayList2), "password")) {
                                    string = firebaseUserSettingsFragment.getString(R.string.email);
                                    OooOOO0.OooO0Oo(string);
                                }
                                textView3.setText(string);
                                ViewGroup viewGroup = firebaseUserSettingsFragment.f79738OooOooO;
                                if (viewGroup == null) {
                                    OooOOO0.OooOOOO("passwordWrapper");
                                    throw null;
                                }
                                viewGroup.setVisibility(arrayList2.contains("password") ? 0 : 8);
                                TextView textView4 = firebaseUserSettingsFragment.f79740Oooo0;
                                if (textView4 == null) {
                                    OooOOO0.OooOOOO("txtUid");
                                    throw null;
                                }
                                textView4.setText(currentUser.getUid());
                                Uri photoUrl = currentUser.getPhotoUrl();
                                String string2 = photoUrl != null ? photoUrl.toString() : null;
                                if (string2 != null) {
                                    C22253OooOO0o c22253OooOO0oOooO0Oo = com.bumptech.glide.OooO0OO.OooO0O0(firebaseUserSettingsFragment.getContext()).OooO0Oo(firebaseUserSettingsFragment).OooOO0O(string2).OooO0Oo();
                                    ImageView imageView = firebaseUserSettingsFragment.f79736OooOoo;
                                    if (imageView == null) {
                                        OooOOO0.OooOOOO("userAvatar");
                                        throw null;
                                    }
                                    c22253OooOO0oOooO0Oo.OoooO0(imageView);
                                } else {
                                    C22253OooOO0o c22253OooOO0oOooO0Oo2 = com.bumptech.glide.OooO0OO.OooO0O0(firebaseUserSettingsFragment.getContext()).OooO0Oo(firebaseUserSettingsFragment).OooO0o(context.getDrawable(R.drawable.ic_login_notein_logo)).OooO0Oo();
                                    ImageView imageView2 = firebaseUserSettingsFragment.f79736OooOoo;
                                    if (imageView2 == null) {
                                        OooOOO0.OooOOOO("userAvatar");
                                        throw null;
                                    }
                                    c22253OooOO0oOooO0Oo2.OoooO0(imageView2);
                                }
                            } else {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("FirebaseUserSettingsFragment");
                                c20358OooO00o.OooO0OO("firebase user uid not match!", new Object[0]);
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FirebaseUserSettingsFragment firebaseUserSettingsFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f79754OooOo = firebaseUserSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f79754OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79755OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FirebaseUserSettingsFragment firebaseUserSettingsFragment = this.f79754OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) firebaseUserSettingsFragment.f79737OooOoo0.getValue();
                    C19547OooO00o c19547OooO00o = new C19547OooO00o(firebaseUserSettingsFragment);
                    this.f79755OooOo0o = 1;
                    if (c26320o0000OoO.f90227OooOoOO.f121747OooOo0o.collect(c19547OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$onViewCreated$7$2", m80623f = "FirebaseUserSettingsFragment.kt", m80624l = {132}, m80625m = "invokeSuspend")
        public static final class C19548OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FirebaseUserSettingsFragment f79757OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79758OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$OooO0O0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$onViewCreated$7$2$1", m80623f = "FirebaseUserSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<FirebaseUserMembership, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ FirebaseUserSettingsFragment f79759OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f79760OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(FirebaseUserSettingsFragment firebaseUserSettingsFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f79759OooOo = firebaseUserSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f79759OooOo, continuation);
                    oooO00o.f79760OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(FirebaseUserMembership firebaseUserMembership, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(firebaseUserMembership, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    FirebaseUserMembership firebaseUserMembership = (FirebaseUserMembership) this.f79760OooOo0o;
                    if (firebaseUserMembership == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    FirebaseUserSettingsFragment firebaseUserSettingsFragment = this.f79759OooOo;
                    Context context = firebaseUserSettingsFragment.getContext();
                    if (context != null) {
                        int i = OooO00o.f79751OooO0O0[firebaseUserMembership.getMembershipType().ordinal()];
                        if (i == 1) {
                            TextView textView = firebaseUserSettingsFragment.f79744Oooo0O0;
                            if (textView == null) {
                                OooOOO0.OooOOOO("txtSubsType");
                                throw null;
                            }
                            textView.setText(context.getString(R.string.none));
                            TextView textView2 = firebaseUserSettingsFragment.f79745Oooo0OO;
                            if (textView2 == null) {
                                OooOOO0.OooOOOO("txtExpireTime");
                                throw null;
                            }
                            textView2.setText("--");
                        } else if (i == 2) {
                            TextView textView3 = firebaseUserSettingsFragment.f79744Oooo0O0;
                            if (textView3 == null) {
                                OooOOO0.OooOOOO("txtSubsType");
                                throw null;
                            }
                            FirebaseUserMembership.SubscriptionType subscriptionType = firebaseUserMembership.getSubscriptionType();
                            int i2 = subscriptionType == null ? -1 : OooO00o.f79750OooO00o[subscriptionType.ordinal()];
                            textView3.setText(i2 != 1 ? i2 != 2 ? context.getString(R.string.subscription) : context.getString(R.string.yearly_) : context.getString(R.string.monthly));
                            TextView textView4 = firebaseUserSettingsFragment.f79745Oooo0OO;
                            if (textView4 == null) {
                                OooOOO0.OooOOOO("txtExpireTime");
                                throw null;
                            }
                            String subscriptionExpiryDate = firebaseUserMembership.getSubscriptionExpiryDate();
                            textView4.setText(subscriptionExpiryDate != null ? subscriptionExpiryDate : "--");
                        } else {
                            if (i != 3) {
                                throw new C32442OooOO0o();
                            }
                            TextView textView5 = firebaseUserSettingsFragment.f79744Oooo0O0;
                            if (textView5 == null) {
                                OooOOO0.OooOOOO("txtSubsType");
                                throw null;
                            }
                            textView5.setText(context.getString(R.string.life_time));
                            TextView textView6 = firebaseUserSettingsFragment.f79745Oooo0OO;
                            if (textView6 == null) {
                                OooOOO0.OooOOOO("txtExpireTime");
                                throw null;
                            }
                            textView6.setText(context.getString(R.string.life_time));
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19548OooO0O0(FirebaseUserSettingsFragment firebaseUserSettingsFragment, Continuation<? super C19548OooO0O0> continuation) {
                super(2, continuation);
                this.f79757OooOo = firebaseUserSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19548OooO0O0(this.f79757OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19548OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79758OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FirebaseUserSettingsFragment firebaseUserSettingsFragment = this.f79757OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) firebaseUserSettingsFragment.f79737OooOoo0.getValue();
                    OooO00o oooO00o = new OooO00o(firebaseUserSettingsFragment, null);
                    this.f79758OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoO.f90255o000oOoO, oooO00o, this) == enumC32485OooO00o) {
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
            OooO0O0 oooO0O0 = FirebaseUserSettingsFragment.this.new OooO0O0(continuation);
            oooO0O0.f79753OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79753OooOo0o;
            FirebaseUserSettingsFragment firebaseUserSettingsFragment = FirebaseUserSettingsFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(firebaseUserSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19548OooO0O0(firebaseUserSettingsFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FirebaseUserSettingsFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23872OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23872OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FirebaseUserSettingsFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserSettingsFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23873OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23873OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FirebaseUserSettingsFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public FirebaseUserSettingsFragment() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        OooOOO0.OooO0o(firebaseAuth, "getInstance(...)");
        this.f79749Oooo0oo = firebaseAuth;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_firebase_user_setting, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.setContentInsetsAbsolute(0, 0);
        this.f79738OooOooO = (ViewGroup) view.findViewById(R.id.password_wrapper);
        View viewFindViewById = view.findViewById(R.id.btn_reset_password);
        this.f79739OooOooo = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnResetPassword");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new o0OoO.OooO0O0(this, 2));
        this.f79741Oooo000 = (TextView) view.findViewById(R.id.txt_username);
        this.f79742Oooo00O = (TextView) view.findViewById(R.id.tv_email);
        this.f79743Oooo00o = (TextView) view.findViewById(R.id.tv_provider);
        this.f79744Oooo0O0 = (TextView) view.findViewById(R.id.tv_subs_type);
        this.f79745Oooo0OO = (TextView) view.findViewById(R.id.tv_membership_expire);
        this.f79740Oooo0 = (TextView) view.findViewById(R.id.tv_uid);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.btn_back_to_parent);
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnBack");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup, 500L, new ViewOnClickListenerC26302OoooOoo(this, 4));
        View viewFindViewById2 = view.findViewById(R.id.btn_copy_uid);
        this.f79746Oooo0o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCopyUid");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new o0OoO.OooO0OO(this, 2));
        View viewFindViewById3 = view.findViewById(R.id.logoff_wrapper);
        this.f79748Oooo0oO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnDeleteAccount");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28501OooO0Oo(this, 2));
        View viewFindViewById4 = view.findViewById(R.id.btn_logout);
        this.f79747Oooo0o0 = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnSignOut");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new ViewOnClickListenerC28223OooO(this, 4));
        this.f79736OooOoo = (ImageView) view.findViewById(R.id.iv_user_avatar);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}

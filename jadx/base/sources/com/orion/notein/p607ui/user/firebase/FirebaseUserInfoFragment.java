package com.orion.notein.p607ui.user.firebase;

import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.bumptech.glide.C22253OooOO0o;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.cloud.NoteCloudQuota;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26349o00o0O;
import o0O0oooO.ViewOnClickListenerC26298OoooOOO;
import o0O0oooO.ViewOnClickListenerC26299OoooOOo;
import o0O0oooO.ViewOnClickListenerC26348o000oOoO;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.C28201OooooO0;
import o0OoO0oo.ViewOnClickListenerC28700OooOOo;
import o0OoO0oo.ViewOnClickListenerC28701OooOOo0;
import o0OoO0oo.ViewOnClickListenerC28702OooOOoo;
import o0OoOOO0.ViewOnClickListenerC29047OooO0oO;
import o0o000oo.o000oOoO;
import o0oOo0OO.C30961OooO0OO;
import o0oOo0OO.C30962OooO0Oo;
import o0oo000O.OooOO0O;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/firebase/FirebaseUserInfoFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseUserInfoFragment extends Hilt_FirebaseUserInfoFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f79693OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ImageView f79694OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ViewGroup f79695OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f79696OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public LinearProgressIndicator f79697Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f79698Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f79699Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f79700Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public CardView f79701Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f79702Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f79703Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f79704Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f79705Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f79706Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f79707Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final C22026ooOO f79708OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C22026ooOO f79709OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final FirebaseAuth f79710OoooO0O;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FirebaseUserInfoFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f79712OooO00o;

        static {
            int[] iArr = new int[FirebaseUserMembership.MembershipType.values().length];
            try {
                iArr[FirebaseUserMembership.MembershipType.FREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FirebaseUserMembership.MembershipType.SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FirebaseUserMembership.MembershipType.LIFE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79712OooO00o = iArr;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$onViewCreated$5$1", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {129, 131}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79714OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FirebaseUserInfoFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79714OooOo0o;
            FirebaseUserInfoFragment firebaseUserInfoFragment = FirebaseUserInfoFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f79714OooOo0o = 1;
                obj = FirebaseUserInfoFragment.OooOoOO(firebaseUserInfoFragment, 9, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    Context contextRequireContext = firebaseUserInfoFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(firebaseUserInfoFragment), OooOO0O.OooO00o(contextRequireContext) ? R.id.cloudSyncLoginDialogFragment : R.id.cloudSyncLoginContainerFragment, null);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                C28201OooooO0 c28201OooooO0 = (C28201OooooO0) firebaseUserInfoFragment.f79708OoooO0.getValue();
                this.f79714OooOo0o = 2;
                obj = c28201OooooO0.OooO(this);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$onViewCreated$6", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f79716OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$onViewCreated$6$1", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {146}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FirebaseUserInfoFragment f79717OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79718OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19545OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FirebaseUserInfoFragment f79719OooOo0o;

                public C19545OooO00o(FirebaseUserInfoFragment firebaseUserInfoFragment) {
                    this.f79719OooOo0o = firebaseUserInfoFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    FirebaseUserInfoFragment firebaseUserInfoFragment;
                    Context context;
                    NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) obj;
                    if (noteinFirebaseUser != null && (context = (firebaseUserInfoFragment = this.f79719OooOo0o).getContext()) != null) {
                        FirebaseUser currentUser = firebaseUserInfoFragment.f79710OoooO0O.getCurrentUser();
                        if (OooOOO0.OooO0O0(noteinFirebaseUser.getFirebaseUid(), currentUser != null ? currentUser.getUid() : null)) {
                            TextView textView = firebaseUserInfoFragment.f79693OooOoo;
                            if (textView == null) {
                                OooOOO0.OooOOOO("userDisplayName");
                                throw null;
                            }
                            String displayName = currentUser.getDisplayName();
                            if (displayName == null) {
                                displayName = firebaseUserInfoFragment.getString(R.string.default_user_name);
                                OooOOO0.OooO0o(displayName, "getString(...)");
                            }
                            textView.setText(displayName);
                            Uri photoUrl = currentUser.getPhotoUrl();
                            String string = photoUrl != null ? photoUrl.toString() : null;
                            if (string != null) {
                                C22253OooOO0o c22253OooOO0oOooO0Oo = com.bumptech.glide.OooO0OO.OooO0O0(firebaseUserInfoFragment.getContext()).OooO0Oo(firebaseUserInfoFragment).OooOO0O(string).OooO0Oo();
                                ImageView imageView = firebaseUserInfoFragment.f79694OooOoo0;
                                if (imageView == null) {
                                    OooOOO0.OooOOOO("userAvatar");
                                    throw null;
                                }
                                c22253OooOO0oOooO0Oo.OoooO0(imageView);
                            } else {
                                C22253OooOO0o c22253OooOO0oOooO0Oo2 = com.bumptech.glide.OooO0OO.OooO0O0(firebaseUserInfoFragment.getContext()).OooO0Oo(firebaseUserInfoFragment).OooO0o(context.getDrawable(R.drawable.ic_login_notein_logo)).OooO0Oo();
                                ImageView imageView2 = firebaseUserInfoFragment.f79694OooOoo0;
                                if (imageView2 == null) {
                                    OooOOO0.OooOOOO("userAvatar");
                                    throw null;
                                }
                                c22253OooOO0oOooO0Oo2.OoooO0(imageView2);
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis() - noteinFirebaseUser.getCreationTime();
                            TextView textView2 = firebaseUserInfoFragment.f79698Oooo0;
                            if (textView2 == null) {
                                OooOOO0.OooOOOO("userDaysOfUse");
                                throw null;
                            }
                            textView2.setText(String.valueOf((int) (jCurrentTimeMillis / C18385v2.f56338j)));
                        } else {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("FirebaseUserInfoFragment");
                            c20358OooO00o.OooO0OO("firebase user uid not match!", new Object[0]);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FirebaseUserInfoFragment firebaseUserInfoFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f79717OooOo = firebaseUserInfoFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f79717OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79718OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FirebaseUserInfoFragment firebaseUserInfoFragment = this.f79717OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoo0 = firebaseUserInfoFragment.OooOoo0();
                    C19545OooO00o c19545OooO00o = new C19545OooO00o(firebaseUserInfoFragment);
                    this.f79718OooOo0o = 1;
                    if (c26320o0000OoOOooOoo0.f90227OooOoOO.f121747OooOo0o.collect(c19545OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$onViewCreated$6$2", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {149}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FirebaseUserInfoFragment f79720OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79721OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FirebaseUserInfoFragment f79722OooOo0o;

                public OooO00o(FirebaseUserInfoFragment firebaseUserInfoFragment) {
                    this.f79722OooOo0o = firebaseUserInfoFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int i;
                    o0oOoOo.o00Oo0 o00oo02 = (o0oOoOo.o00Oo0) obj;
                    if (o00oo02 != null) {
                        FirebaseUserInfoFragment firebaseUserInfoFragment = this.f79722OooOo0o;
                        TextView textView = firebaseUserInfoFragment.f79702Oooo0O0;
                        if (textView == null) {
                            OooOOO0.OooOOOO("userNotesOfUse");
                            throw null;
                        }
                        textView.setText(String.valueOf(o00oo02.f110968OooO0OO));
                        int i2 = o00oo02.f110972OooO0oO;
                        int i3 = o00oo02.f110970OooO0o;
                        int i4 = i2 - i3;
                        int i5 = 100;
                        if (i2 != 0 && (i = (int) ((i3 * 100.0f) / i2)) <= 100) {
                            i5 = i;
                        }
                        TextView textView2 = firebaseUserInfoFragment.f79706Oooo0oO;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("tvRemainingQuota");
                            throw null;
                        }
                        textView2.setText(firebaseUserInfoFragment.getString(R.string.content_remaining_chars, Integer.valueOf(i4), Integer.valueOf(100 - i5)));
                        TextView textView3 = firebaseUserInfoFragment.f79707Oooo0oo;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("tvTotalQuota");
                            throw null;
                        }
                        textView3.setText(firebaseUserInfoFragment.getString(R.string.content_total_chars, Integer.valueOf(i2)));
                        LinearProgressIndicator linearProgressIndicator = firebaseUserInfoFragment.f79697Oooo;
                        if (linearProgressIndicator == null) {
                            OooOOO0.OooOOOO("seekbarQuotaUsage");
                            throw null;
                        }
                        linearProgressIndicator.setProgress(i5);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(FirebaseUserInfoFragment firebaseUserInfoFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f79720OooOo = firebaseUserInfoFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f79720OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79721OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FirebaseUserInfoFragment firebaseUserInfoFragment = this.f79720OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoo0 = firebaseUserInfoFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(firebaseUserInfoFragment);
                    this.f79721OooOo0o = 1;
                    if (c26320o0000OoOOooOoo0.f90243OoooO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$OooO0OO$OooO0OO, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$onViewCreated$6$3", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {152}, m80625m = "invokeSuspend")
        public static final class C19546OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FirebaseUserInfoFragment f79723OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79724OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$OooO0OO$OooO0OO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$onViewCreated$6$3$1", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<FirebaseUserMembership, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ FirebaseUserInfoFragment f79725OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f79726OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(FirebaseUserInfoFragment firebaseUserInfoFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f79725OooOo = firebaseUserInfoFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f79725OooOo, continuation);
                    oooO00o.f79726OooOo0o = obj;
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
                    FirebaseUserMembership firebaseUserMembership = (FirebaseUserMembership) this.f79726OooOo0o;
                    if (firebaseUserMembership == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    final FirebaseUserInfoFragment firebaseUserInfoFragment = this.f79725OooOo;
                    Context context = firebaseUserInfoFragment.getContext();
                    if (context != null) {
                        int i = OooO00o.f79712OooO00o[firebaseUserMembership.getMembershipType().ordinal()];
                        if (i == 1) {
                            TextView textView = firebaseUserInfoFragment.f79696OooOooo;
                            if (textView == null) {
                                OooOOO0.OooOOOO("userMemberTxt");
                                throw null;
                            }
                            textView.setText(firebaseUserInfoFragment.getString(R.string.free));
                            TextView textView2 = firebaseUserInfoFragment.f79696OooOooo;
                            if (textView2 == null) {
                                OooOOO0.OooOOOO("userMemberTxt");
                                throw null;
                            }
                            textView2.setTextColor(context.getColor(R.color.color_secondary_blue));
                            ViewGroup viewGroup = firebaseUserInfoFragment.f79695OooOooO;
                            if (viewGroup == null) {
                                OooOOO0.OooOOOO("userMemberTag");
                                throw null;
                            }
                            viewGroup.setBackground(context.getDrawable(R.drawable.bg_round_tag_blue_normal));
                            TextView textView3 = firebaseUserInfoFragment.f79699Oooo000;
                            if (textView3 == null) {
                                OooOOO0.OooOOOO("upgradeToLifetime");
                                throw null;
                            }
                            textView3.setVisibility(8);
                            CardView cardView = firebaseUserInfoFragment.f79701Oooo00o;
                            if (cardView == null) {
                                OooOOO0.OooOOOO("upgradeToPremium");
                                throw null;
                            }
                            cardView.setVisibility(0);
                            TextView textView4 = firebaseUserInfoFragment.f79700Oooo00O;
                            if (textView4 == null) {
                                OooOOO0.OooOOOO("vipExpireAt");
                                throw null;
                            }
                            textView4.setText(": --");
                        } else if (i == 2) {
                            TextView textView5 = firebaseUserInfoFragment.f79696OooOooo;
                            if (textView5 == null) {
                                OooOOO0.OooOOOO("userMemberTxt");
                                throw null;
                            }
                            textView5.setText(firebaseUserInfoFragment.getString(R.string.premium));
                            TextView textView6 = firebaseUserInfoFragment.f79696OooOooo;
                            if (textView6 == null) {
                                OooOOO0.OooOOOO("userMemberTxt");
                                throw null;
                            }
                            textView6.setTextColor(context.getColor(R.color.white));
                            ViewGroup viewGroup2 = firebaseUserInfoFragment.f79695OooOooO;
                            if (viewGroup2 == null) {
                                OooOOO0.OooOOOO("userMemberTag");
                                throw null;
                            }
                            viewGroup2.setBackground(context.getDrawable(R.drawable.bg_round_tag_black_normal));
                            final NoteinGoogleSubscriptionPurchase firstActiveSubsPurchase = firebaseUserMembership.getFirstActiveSubsPurchase();
                            if (firstActiveSubsPurchase != null) {
                                TextView textView7 = firebaseUserInfoFragment.f79699Oooo000;
                                if (textView7 == null) {
                                    OooOOO0.OooOOOO("upgradeToLifetime");
                                    throw null;
                                }
                                textView7.setVisibility(0);
                                TextView textView8 = firebaseUserInfoFragment.f79699Oooo000;
                                if (textView8 == null) {
                                    OooOOO0.OooOOOO("upgradeToLifetime");
                                    throw null;
                                }
                                C28050OooO0OO.OooO00o(textView8, 500L, new View.OnClickListener() { // from class: o0oOo0OO.OooO00o
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        FirebaseUserInfoFragment firebaseUserInfoFragment2 = firebaseUserInfoFragment;
                                        firebaseUserInfoFragment2.getClass();
                                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(firebaseUserInfoFragment2), new C26349o00o0O(firstActiveSubsPurchase));
                                    }
                                });
                            } else {
                                TextView textView9 = firebaseUserInfoFragment.f79699Oooo000;
                                if (textView9 == null) {
                                    OooOOO0.OooOOOO("upgradeToLifetime");
                                    throw null;
                                }
                                textView9.setVisibility(8);
                            }
                            CardView cardView2 = firebaseUserInfoFragment.f79701Oooo00o;
                            if (cardView2 == null) {
                                OooOOO0.OooOOOO("upgradeToPremium");
                                throw null;
                            }
                            cardView2.setVisibility(8);
                            TextView textView10 = firebaseUserInfoFragment.f79700Oooo00O;
                            if (textView10 == null) {
                                OooOOO0.OooOOOO("vipExpireAt");
                                throw null;
                            }
                            String subscriptionExpiryDate = firebaseUserMembership.getSubscriptionExpiryDate();
                            if (subscriptionExpiryDate == null) {
                                subscriptionExpiryDate = "--";
                            }
                            textView10.setText(": ".concat(subscriptionExpiryDate));
                        } else {
                            if (i != 3) {
                                throw new C32442OooOO0o();
                            }
                            TextView textView11 = firebaseUserInfoFragment.f79696OooOooo;
                            if (textView11 == null) {
                                OooOOO0.OooOOOO("userMemberTxt");
                                throw null;
                            }
                            textView11.setText(firebaseUserInfoFragment.getString(R.string.premium));
                            TextView textView12 = firebaseUserInfoFragment.f79696OooOooo;
                            if (textView12 == null) {
                                OooOOO0.OooOOOO("userMemberTxt");
                                throw null;
                            }
                            textView12.setTextColor(context.getColor(R.color.white));
                            ViewGroup viewGroup3 = firebaseUserInfoFragment.f79695OooOooO;
                            if (viewGroup3 == null) {
                                OooOOO0.OooOOOO("userMemberTag");
                                throw null;
                            }
                            viewGroup3.setBackground(context.getDrawable(R.drawable.bg_round_tag_black_normal));
                            TextView textView13 = firebaseUserInfoFragment.f79699Oooo000;
                            if (textView13 == null) {
                                OooOOO0.OooOOOO("upgradeToLifetime");
                                throw null;
                            }
                            textView13.setVisibility(8);
                            CardView cardView3 = firebaseUserInfoFragment.f79701Oooo00o;
                            if (cardView3 == null) {
                                OooOOO0.OooOOOO("upgradeToPremium");
                                throw null;
                            }
                            cardView3.setVisibility(8);
                            TextView textView14 = firebaseUserInfoFragment.f79700Oooo00O;
                            if (textView14 == null) {
                                OooOOO0.OooOOOO("vipExpireAt");
                                throw null;
                            }
                            textView14.setText(": " + firebaseUserInfoFragment.getString(R.string.life_time));
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19546OooO0OO(FirebaseUserInfoFragment firebaseUserInfoFragment, Continuation<? super C19546OooO0OO> continuation) {
                super(2, continuation);
                this.f79723OooOo = firebaseUserInfoFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19546OooO0OO(this.f79723OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19546OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79724OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FirebaseUserInfoFragment firebaseUserInfoFragment = this.f79723OooOo;
                    C26320o0000OoO c26320o0000OoOOooOoo0 = firebaseUserInfoFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(firebaseUserInfoFragment, null);
                    this.f79724OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoOOooOoo0.f90255o000oOoO, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$onViewCreated$6$4", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {160}, m80625m = "invokeSuspend")
        public static final class OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FirebaseUserInfoFragment f79727OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79728OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$onViewCreated$6$4$1", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends NoteCloudQuota>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ FirebaseUserInfoFragment f79729OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f79730OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(FirebaseUserInfoFragment firebaseUserInfoFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f79729OooOo = firebaseUserInfoFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f79729OooOo, continuation);
                    oooO00o.f79730OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Boolean, ? extends NoteCloudQuota> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    SpannableString spannableString;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f79730OooOo0o;
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                    NoteCloudQuota noteCloudQuota = (NoteCloudQuota) c32443OooOOO.f116637OooOo;
                    FirebaseUserInfoFragment firebaseUserInfoFragment = this.f79729OooOo;
                    Context context = firebaseUserInfoFragment.getContext();
                    if (context == null) {
                        spannableString = null;
                    } else {
                        String string = context.getString(R.string.cloud_non_activated);
                        OooOOO0.OooO0o(string, "getString(...)");
                        spannableString = new SpannableString(string);
                        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.color_primary_blue)), 0, string.length(), 17);
                        if (zBooleanValue && noteCloudQuota != null) {
                            String strOooO0OO = C31430OooO00o.OooO0OO(noteCloudQuota.getUsedSpace());
                            String strOooO0Oo = o0Oo0oo.OooO0Oo(strOooO0OO, "/", C31430OooO00o.OooO0OO(noteCloudQuota.getUserCapacity()));
                            spannableString = new SpannableString(strOooO0Oo);
                            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) (C28038OooO0Oo.OooO00o(context).f116638OooOo0o.intValue() < o000000O.OooO0o(480) ? o000000O.OooO0oo(13.0f) : o000000O.OooO0oo(26.0f)));
                            int length = strOooO0OO.length() - 2;
                            spannableString.setSpan(absoluteSizeSpan, 0, length, 17);
                            int length2 = strOooO0Oo.length();
                            spannableString.setSpan(new AbsoluteSizeSpan((int) o000000O.OooO0oo(13.0f)), length, length2, 17);
                            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.item_text_name_color)), 0, length2, 17);
                        }
                    }
                    if (spannableString != null) {
                        TextView textView = firebaseUserInfoFragment.f79703Oooo0OO;
                        if (textView == null) {
                            OooOOO0.OooOOOO("userCloudSync");
                            throw null;
                        }
                        textView.setText(spannableString);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0Oo(FirebaseUserInfoFragment firebaseUserInfoFragment, Continuation<? super OooO0Oo> continuation) {
                super(2, continuation);
                this.f79727OooOo = firebaseUserInfoFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0Oo(this.f79727OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79728OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FirebaseUserInfoFragment firebaseUserInfoFragment = this.f79727OooOo;
                    C28201OooooO0 c28201OooooO0 = (C28201OooooO0) firebaseUserInfoFragment.f79708OoooO0.getValue();
                    OooO00o oooO00o = new OooO00o(firebaseUserInfoFragment, null);
                    this.f79728OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c28201OooooO0.f99964Oooo000, oooO00o, this) == enumC32485OooO00o) {
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
            OooO0OO oooO0OO = FirebaseUserInfoFragment.this.new OooO0OO(continuation);
            oooO0OO.f79716OooOo0o = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79716OooOo0o;
            FirebaseUserInfoFragment firebaseUserInfoFragment = FirebaseUserInfoFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(firebaseUserInfoFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(firebaseUserInfoFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19546OooO0OO(firebaseUserInfoFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0Oo(firebaseUserInfoFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23868OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23868OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FirebaseUserInfoFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FirebaseUserInfoFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23869OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23869OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FirebaseUserInfoFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23870OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23870OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FirebaseUserInfoFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23871OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23871OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FirebaseUserInfoFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public FirebaseUserInfoFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79709OoooO00 = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new C23868OooO0Oo(), new OooO0o(), new C23869OooO0o0());
        this.f79708OoooO0 = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new C23870OooO0oO(), new OooO(), new C23871OooO0oo());
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        OooOOO0.OooO0o(firebaseAuth, "getInstance(...)");
        this.f79710OoooO0O = firebaseAuth;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(FirebaseUserInfoFragment firebaseUserInfoFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30962OooO0Oo c30962OooO0Oo;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30962OooO0Oo) {
            c30962OooO0Oo = (C30962OooO0Oo) abstractC32479OooO0OO;
            int i2 = c30962OooO0Oo.f110640OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30962OooO0Oo.f110640OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30962OooO0Oo = new C30962OooO0Oo(firebaseUserInfoFragment, abstractC32479OooO0OO);
            }
        }
        C30962OooO0Oo c30962OooO0Oo2 = c30962OooO0Oo;
        Object objShowNonVipFeatureLimitedDialog$default = c30962OooO0Oo2.f110639OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30962OooO0Oo2.f110640OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = firebaseUserInfoFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30962OooO0Oo2.f110640OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30962OooO0Oo2, 6, null);
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

    public final C26320o0000OoO OooOoo0() {
        return (C26320o0000OoO) this.f79709OoooO00.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_firebase_user_info, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        OooOoo0().OooOO0O();
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.btn_back).setOnClickListener(new ViewOnClickListenerC28701OooOOo0(this, 4));
        ((TextView) view.findViewById(R.id.tv_title)).setText(getString(R.string.my_account));
        this.f79694OooOoo0 = (ImageView) view.findViewById(R.id.iv_user_avatar);
        this.f79693OooOoo = (TextView) view.findViewById(R.id.tv_user_name);
        this.f79695OooOooO = (ViewGroup) view.findViewById(R.id.cl_user_member_tag);
        this.f79696OooOooo = (TextView) view.findViewById(R.id.tv_member_txt);
        this.f79699Oooo000 = (TextView) view.findViewById(R.id.tv_upgrade_to_lifetime);
        this.f79700Oooo00O = (TextView) view.findViewById(R.id.tv_content_expire_at);
        CardView cardView = (CardView) view.findViewById(R.id.cv_upgrade_to_premium);
        this.f79701Oooo00o = cardView;
        if (cardView == null) {
            OooOOO0.OooOOOO("upgradeToPremium");
            throw null;
        }
        cardView.setOnClickListener(new ViewOnClickListenerC28700OooOOo(this, 3));
        this.f79698Oooo0 = (TextView) view.findViewById(R.id.tv_days);
        this.f79702Oooo0O0 = (TextView) view.findViewById(R.id.tv_notes);
        this.f79703Oooo0OO = (TextView) view.findViewById(R.id.tv_sync);
        this.f79704Oooo0o = (TextView) view.findViewById(R.id.btn_purchase_more);
        this.f79706Oooo0oO = (TextView) view.findViewById(R.id.tv_content_remaining_quota);
        this.f79707Oooo0oo = (TextView) view.findViewById(R.id.tv_content_total_quota);
        this.f79697Oooo = (LinearProgressIndicator) view.findViewById(R.id.sb_quota_usage);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30961OooO0OO(this, null), 3);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.settings_wrapper);
        OooOOO0.OooO0Oo(viewGroup);
        C28050OooO0OO.OooO00o(viewGroup, 500L, new o000oOoO(this, 3));
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.experience_officer_wrapper);
        OooOOO0.OooO0Oo(viewGroup2);
        C28050OooO0OO.OooO00o(viewGroup2, 500L, new ViewOnClickListenerC26348o000oOoO(this, 4));
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.cl_helper_wrapper);
        OooOOO0.OooO0Oo(viewGroup3);
        C28050OooO0OO.OooO00o(viewGroup3, 500L, new ViewOnClickListenerC26298OoooOOO(this, 2));
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.cl_terms_wrapper);
        OooOOO0.OooO0Oo(viewGroup4);
        C28050OooO0OO.OooO00o(viewGroup4, 500L, new ViewOnClickListenerC26299OoooOOo(this, 2));
        View viewFindViewById = view.findViewById(R.id.btn_view_my_features);
        this.f79705Oooo0o0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnVieMyFeatures");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28702OooOOoo(this, 5));
        TextView textView = this.f79703Oooo0OO;
        if (textView == null) {
            OooOOO0.OooOOOO("userCloudSync");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC29047OooO0oO(this, 3));
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0OO(null), 3);
    }
}

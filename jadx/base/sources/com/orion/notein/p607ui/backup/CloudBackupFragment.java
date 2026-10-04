package com.orion.notein.p607ui.backup;

import Oooo0.o000000O;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.transition.OooOOOO;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo0;
import o0000oOO.AbstractC24338OooO0o0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OOOoo.C27205OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0O00.C28051OooO00o;
import o0Oo0oOo.o00000O0;
import o0OoO000.ViewOnClickListenerC28583o0000OoO;
import o0OoO000.ViewOnClickListenerC28586o0000o0;
import o0OooOoo.ViewOnClickListenerC29578OooO00o;
import o0o000oO.ViewOnClickListenerC29777OooO00o;
import o0oOoo00.C31130OooOOOo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/backup/CloudBackupFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudBackupFragment extends Hilt_CloudBackupFragment {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final BackupFile.DiskVendor f70531Oooo0o = BackupFile.DiskVendor.GoogleDrive;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f70532OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f70533OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f70534OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f70535OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public SwitchMaterial f70536Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextButtonView f70537Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextButtonView f70538Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f70539Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ImageView f70540Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ImageView f70541Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final CloudBackupResultDialogFragment f70542Oooo0o0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$2$1", m80623f = "CloudBackupFragment.kt", m80624l = {78}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70544OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return CloudBackupFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70544OooOo0o;
            CloudBackupFragment cloudBackupFragment = CloudBackupFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f70544OooOo0o = 1;
                obj = CloudBackupFragment.OooOoO(cloudBackupFragment, 18, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                cloudBackupFragment.OooOoOO().OooOO0o(CloudBackupFragment.f70531Oooo0o);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7", m80623f = "CloudBackupFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f70546OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$1", m80623f = "CloudBackupFragment.kt", m80624l = {123}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupFragment f70547OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70548OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19148OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ CloudBackupFragment f70549OooOo0o;

                public C19148OooO00o(CloudBackupFragment cloudBackupFragment) {
                    this.f70549OooOo0o = cloudBackupFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    CloudBackupFragment cloudBackupFragment = this.f70549OooOo0o;
                    if (cloudBackupFragment.getChildFragmentManager().OooOooo("CloudBackupResultDialogFragment") == null) {
                        cloudBackupFragment.f70542Oooo0o0.show(cloudBackupFragment.getChildFragmentManager(), "CloudBackupResultDialogFragment");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(CloudBackupFragment cloudBackupFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f70547OooOo = cloudBackupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f70547OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70548OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                CloudBackupFragment cloudBackupFragment = this.f70547OooOo;
                C33772OooooOo c33772OooooOo = cloudBackupFragment.OooOoOO().f70700OooOOoo;
                C19148OooO00o c19148OooO00o = new C19148OooO00o(cloudBackupFragment);
                this.f70548OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, c19148OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$2", m80623f = "CloudBackupFragment.kt", m80624l = {130}, m80625m = "invokeSuspend")
        public static final class C19149OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupFragment f70550OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70551OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$2$1", m80623f = "CloudBackupFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ CloudBackupFragment f70552OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f70553OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(CloudBackupFragment cloudBackupFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f70552OooOo = cloudBackupFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f70552OooOo, continuation);
                    oooO00o.f70553OooOo0o = ((Number) obj).intValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    if (this.f70553OooOo0o == -111) {
                        ActivityC21897OooOo0 activity = this.f70552OooOo.getActivity();
                        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            mainActivity.showUpgradeTipOnInFileDBVersionNotMatch();
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19149OooO0O0(CloudBackupFragment cloudBackupFragment, Continuation<? super C19149OooO0O0> continuation) {
                super(2, continuation);
                this.f70550OooOo = cloudBackupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19149OooO0O0(this.f70550OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19149OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70551OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                    CloudBackupFragment cloudBackupFragment = this.f70550OooOo;
                    C33772OooooOo c33772OooooOo = cloudBackupFragment.OooOoOO().f70702OooOo0;
                    OooO00o oooO00o = new OooO00o(cloudBackupFragment, null);
                    this.f70551OooOo0o = 1;
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$3", m80623f = "CloudBackupFragment.kt", m80624l = {138}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupFragment f70554OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70555OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ CloudBackupFragment f70556OooOo0o;

                public OooO00o(CloudBackupFragment cloudBackupFragment) {
                    this.f70556OooOo0o = cloudBackupFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    BackupFile.DiskVendor diskVendor = (BackupFile.DiskVendor) obj;
                    CloudBackupFragment cloudBackupFragment = this.f70556OooOo0o;
                    TextButtonView textButtonView = cloudBackupFragment.f70537Oooo000;
                    if (textButtonView == null) {
                        OooOOO0.OooOOOO("btnManuallyBackup");
                        throw null;
                    }
                    textButtonView.setEnabled(diskVendor != null);
                    TextButtonView textButtonView2 = cloudBackupFragment.f70538Oooo00O;
                    if (textButtonView2 == null) {
                        OooOOO0.OooOOOO("btnImport");
                        throw null;
                    }
                    textButtonView2.setEnabled(diskVendor != null);
                    SwitchMaterial switchMaterial = cloudBackupFragment.f70536Oooo0;
                    if (switchMaterial != null) {
                        switchMaterial.setChecked(diskVendor == CloudBackupFragment.f70531Oooo0o);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("switch");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(CloudBackupFragment cloudBackupFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f70554OooOo = cloudBackupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f70554OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70555OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                    CloudBackupFragment cloudBackupFragment = this.f70554OooOo;
                    com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoOO = cloudBackupFragment.OooOoOO();
                    OooO00o oooO00o = new OooO00o(cloudBackupFragment);
                    this.f70555OooOo0o = 1;
                    if (oooO00oOooOoOO.f70714Oooo000.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$4", m80623f = "CloudBackupFragment.kt", m80624l = {145}, m80625m = "invokeSuspend")
        public static final class C22989OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupFragment f70557OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70558OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ CloudBackupFragment f70559OooOo0o;

                public OooO00o(CloudBackupFragment cloudBackupFragment) {
                    this.f70559OooOo0o = cloudBackupFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Long l = (Long) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95006OooO0o);
                    long jLongValue = l != null ? l.longValue() : 0L;
                    BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                    CloudBackupFragment cloudBackupFragment = this.f70559OooOo0o;
                    Context context = cloudBackupFragment.getContext();
                    if (context != null) {
                        TextView textView = cloudBackupFragment.f70539Oooo00o;
                        if (textView == null) {
                            OooOOO0.OooOOOO("tvLastBackup");
                            throw null;
                        }
                        textView.setTextColor(context.getColor(R.color.item_text_description_color));
                    }
                    TextButtonView textButtonView = cloudBackupFragment.f70538Oooo00O;
                    if (textButtonView == null) {
                        OooOOO0.OooOOOO("btnImport");
                        throw null;
                    }
                    if (!textButtonView.isEnabled()) {
                        TextView textView2 = cloudBackupFragment.f70539Oooo00o;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("tvLastBackup");
                            throw null;
                        }
                        textView2.setText(cloudBackupFragment.getString(R.string.last_backup_time, cloudBackupFragment.getString(R.string.none)));
                    } else if (jLongValue == 0) {
                        TextView textView3 = cloudBackupFragment.f70539Oooo00o;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("tvLastBackup");
                            throw null;
                        }
                        textView3.setText(cloudBackupFragment.getString(R.string.perform_auto_backup_after_xx_sec));
                    } else if (jLongValue == -1) {
                        Context context2 = cloudBackupFragment.getContext();
                        if (context2 != null) {
                            TextView textView4 = cloudBackupFragment.f70539Oooo00o;
                            if (textView4 == null) {
                                OooOOO0.OooOOOO("tvLastBackup");
                                throw null;
                            }
                            textView4.setTextColor(context2.getColor(R.color.warning_color));
                        }
                        TextView textView5 = cloudBackupFragment.f70539Oooo00o;
                        if (textView5 == null) {
                            OooOOO0.OooOOOO("tvLastBackup");
                            throw null;
                        }
                        textView5.setText(cloudBackupFragment.getString(R.string.auto_backup_failed));
                    } else {
                        String str = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA).format(Long.valueOf(jLongValue));
                        TextView textView6 = cloudBackupFragment.f70539Oooo00o;
                        if (textView6 == null) {
                            OooOOO0.OooOOOO("tvLastBackup");
                            throw null;
                        }
                        textView6.setText(cloudBackupFragment.getString(R.string.last_backup_time, str));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22989OooO0Oo(CloudBackupFragment cloudBackupFragment, Continuation<? super C22989OooO0Oo> continuation) {
                super(2, continuation);
                this.f70557OooOo = cloudBackupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22989OooO0Oo(this.f70557OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C22989OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                InterfaceC33721OooO0o<AbstractC24338OooO0o0> data;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70558OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    CloudBackupFragment cloudBackupFragment = this.f70557OooOo;
                    Context context = cloudBackupFragment.getContext();
                    if (context != null && (data = C28051OooO00o.OooO00o(context).getData()) != null) {
                        OooO00o oooO00o = new OooO00o(cloudBackupFragment);
                        this.f70558OooOo0o = 1;
                        if (data.collect(oooO00o, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$6", m80623f = "CloudBackupFragment.kt", m80624l = {155}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupFragment f70560OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70561OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$6$1", m80623f = "CloudBackupFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ CloudBackupFragment f70562OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f70563OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(CloudBackupFragment cloudBackupFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f70562OooOo = cloudBackupFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f70562OooOo, continuation);
                    oooO00o.f70563OooOo0o = ((Number) obj).intValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    int i = this.f70563OooOo0o;
                    CloudBackupFragment cloudBackupFragment = this.f70562OooOo;
                    if (i == 1) {
                        ImageView imageView = cloudBackupFragment.f70540Oooo0O0;
                        if (imageView == null) {
                            OooOOO0.OooOOOO("ivBackupOnAllConditions");
                            throw null;
                        }
                        imageView.setSelected(true);
                        ImageView imageView2 = cloudBackupFragment.f70541Oooo0OO;
                        if (imageView2 == null) {
                            OooOOO0.OooOOOO("ivBackupOnWifi");
                            throw null;
                        }
                        imageView2.setSelected(false);
                    } else {
                        ImageView imageView3 = cloudBackupFragment.f70540Oooo0O0;
                        if (imageView3 == null) {
                            OooOOO0.OooOOOO("ivBackupOnAllConditions");
                            throw null;
                        }
                        imageView3.setSelected(false);
                        ImageView imageView4 = cloudBackupFragment.f70541Oooo0OO;
                        if (imageView4 == null) {
                            OooOOO0.OooOOOO("ivBackupOnWifi");
                            throw null;
                        }
                        imageView4.setSelected(true);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(CloudBackupFragment cloudBackupFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f70560OooOo = cloudBackupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f70560OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70561OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                    CloudBackupFragment cloudBackupFragment = this.f70560OooOo;
                    com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoOO = cloudBackupFragment.OooOoOO();
                    OooO00o oooO00o = new OooO00o(cloudBackupFragment, null);
                    this.f70561OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO00oOooOoOO.f70692OooOO0O, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$5", m80623f = "CloudBackupFragment.kt", m80624l = {150}, m80625m = "invokeSuspend")
        public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupFragment f70564OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70565OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public static final OooO00o<T> f70566OooOo0o = new OooO00o<>();

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    ((Boolean) obj).booleanValue();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o0(CloudBackupFragment cloudBackupFragment, Continuation<? super OooO0o0> continuation) {
                super(2, continuation);
                this.f70564OooOo = cloudBackupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o0(this.f70564OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70565OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                    com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoOO = this.f70564OooOo.OooOoOO();
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO = OooO00o.f70566OooOo0o;
                    this.f70565OooOo0o = 1;
                    if (oooO00oOooOoOO.f70707OooOoO0.f121747OooOo0o.collect(interfaceC33723OooO0oO, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$7", m80623f = "CloudBackupFragment.kt", m80624l = {170}, m80625m = "invokeSuspend")
        public static final class C22990OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupFragment f70567OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70568OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$7$1", m80623f = "CloudBackupFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ CloudBackupFragment f70569OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f70570OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(CloudBackupFragment cloudBackupFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f70569OooOo = cloudBackupFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f70569OooOo, continuation);
                    oooO00o.f70570OooOo0o = ((Boolean) obj).booleanValue();
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
                    if (this.f70570OooOo0o) {
                        CloudBackupFragment cloudBackupFragment = this.f70569OooOo;
                        String string = cloudBackupFragment.getString(R.string.tips);
                        OooOOO0.OooO0o(string, "getString(...)");
                        String string2 = cloudBackupFragment.getString(R.string.auto_back_on_wifi_tips);
                        OooOOO0.OooO0o(string2, "getString(...)");
                        new TipsDialogFragment(string, string2, null, null, new ViewOnClickListenerC26311Ooooooo(), 0).show(cloudBackupFragment.getChildFragmentManager(), "TipsDialogFragment");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22990OooO0oO(CloudBackupFragment cloudBackupFragment, Continuation<? super C22990OooO0oO> continuation) {
                super(2, continuation);
                this.f70567OooOo = cloudBackupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22990OooO0oO(this.f70567OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C22990OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70568OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                    CloudBackupFragment cloudBackupFragment = this.f70567OooOo;
                    C33772OooooOo c33772OooooOo = cloudBackupFragment.OooOoOO().f70696OooOOOO;
                    OooO00o oooO00o = new OooO00o(cloudBackupFragment, null);
                    this.f70568OooOo0o = 1;
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

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$8", m80623f = "CloudBackupFragment.kt", m80624l = {185}, m80625m = "invokeSuspend")
        public static final class C22991OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupFragment f70571OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70572OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0O0$OooO0oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupFragment$onViewCreated$7$8$1", m80623f = "CloudBackupFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ CloudBackupFragment f70573OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f70574OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(CloudBackupFragment cloudBackupFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f70573OooOo = cloudBackupFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f70573OooOo, continuation);
                    oooO00o.f70574OooOo0o = ((Boolean) obj).booleanValue();
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
                    boolean z = this.f70574OooOo0o;
                    TextView textView = this.f70573OooOo.f70535OooOooo;
                    if (textView != null) {
                        if (z) {
                            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_ni_vip_12, 0);
                            textView.setCompoundDrawablePadding(o000000O.OooO0o(6));
                        } else {
                            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22991OooO0oo(CloudBackupFragment cloudBackupFragment, Continuation<? super C22991OooO0oo> continuation) {
                super(2, continuation);
                this.f70571OooOo = cloudBackupFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22991OooO0oo(this.f70571OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C22991OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70572OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    CloudBackupFragment cloudBackupFragment = this.f70571OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) cloudBackupFragment.f70532OooOoo.getValue();
                    OooO00o oooO00o = new OooO00o(cloudBackupFragment, null);
                    this.f70572OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoO.f90249OoooOOo, oooO00o, this) == enumC32485OooO00o) {
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
            OooO0O0 oooO0O0 = CloudBackupFragment.this.new OooO0O0(continuation);
            oooO0O0.f70546OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f70546OooOo0o;
            CloudBackupFragment cloudBackupFragment = CloudBackupFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(cloudBackupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19149OooO0O0(cloudBackupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(cloudBackupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22989OooO0Oo(cloudBackupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(cloudBackupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(cloudBackupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22990OooO0oO(cloudBackupFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22991OooO0oo(cloudBackupFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return CloudBackupFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C22992OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22992OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return CloudBackupFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return CloudBackupFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C22993OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22993OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return CloudBackupFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C22994OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C22994OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return CloudBackupFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C22995OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22995OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return CloudBackupFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public CloudBackupFragment() {
        super(R.layout.fragment_cloud_backup);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f70533OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.backup.OooO00o.class), new OooO0OO(), new C22993OooO0o0(), new C22992OooO0Oo());
        this.f70532OooOoo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0o(), new C22995OooO0oo(), new C22994OooO0oO());
        this.f70542Oooo0o0 = new CloudBackupResultDialogFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(CloudBackupFragment cloudBackupFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C31130OooOOOo c31130OooOOOo;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C31130OooOOOo) {
            c31130OooOOOo = (C31130OooOOOo) abstractC32479OooO0OO;
            int i2 = c31130OooOOOo.f111090OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c31130OooOOOo.f111090OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c31130OooOOOo = new C31130OooOOOo(cloudBackupFragment, abstractC32479OooO0OO);
            }
        }
        C31130OooOOOo c31130OooOOOo2 = c31130OooOOOo;
        Object objShowNonVipFeatureLimitedDialog$default = c31130OooOOOo2.f111089OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c31130OooOOOo2.f111090OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = cloudBackupFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c31130OooOOOo2.f111090OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c31130OooOOOo2, 6, null);
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

    public final com.orion.notein.p607ui.backup.OooO00o OooOoOO() {
        return (com.orion.notein.p607ui.backup.OooO00o) this.f70533OooOoo0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BackupFile.DiskVendor diskVendor;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        OooOoOO().OooO0oo();
        View viewFindViewById = view.findViewById(R.id.btn_back_to_parent);
        this.f70534OooOooO = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new o0Oo0oOo.o000000O(this, 4));
        }
        TextView textView = (TextView) view.findViewById(R.id.current_folder_name);
        this.f70535OooOooo = textView;
        if (textView != null) {
            textView.setText(getString(R.string.cloud_backup));
        }
        SwitchMaterial switchMaterial = (SwitchMaterial) view.findViewById(R.id.switch_use_disk);
        this.f70536Oooo0 = switchMaterial;
        if (switchMaterial == null) {
            OooOOO0.OooOOOO("switch");
            throw null;
        }
        switchMaterial.setOnClickListener(new o00000O0(this, 4));
        TextButtonView textButtonView = (TextButtonView) view.findViewById(R.id.tv_import);
        this.f70538Oooo00O = textButtonView;
        if (textButtonView == null) {
            OooOOO0.OooOOOO("btnImport");
            throw null;
        }
        C28050OooO0OO.OooO00o(textButtonView, 1000L, new ViewOnClickListenerC29578OooO00o(this, 5));
        TextButtonView textButtonView2 = (TextButtonView) view.findViewById(R.id.tv_manually_backup);
        this.f70537Oooo000 = textButtonView2;
        if (textButtonView2 == null) {
            OooOOO0.OooOOOO("btnManuallyBackup");
            throw null;
        }
        C28050OooO0OO.OooO00o(textButtonView2, 500L, new ViewOnClickListenerC29777OooO00o(this, 3));
        this.f70539Oooo00o = (TextView) view.findViewById(R.id.tv_last_backup_time);
        view.findViewById(R.id.cl_auto_backup_all_conditions).setOnClickListener(new ViewOnClickListenerC28583o0000OoO(this, 5));
        view.findViewById(R.id.cl_auto_backup_only_wifi).setOnClickListener(new ViewOnClickListenerC28586o0000o0(this, 7));
        this.f70540Oooo0O0 = (ImageView) view.findViewById(R.id.iv_auto_backup_on_all_conditions);
        this.f70541Oooo0OO = (ImageView) view.findViewById(R.id.iv_auto_backup_only_on_wifi);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
        if (!((Boolean) OooOoOO().f70707OooOoO0.f121747OooOo0o.getValue()).booleanValue() || (diskVendor = (BackupFile.DiskVendor) OooOoOO().f70714Oooo000.f121747OooOo0o.getValue()) == null) {
            return;
        }
        OooOoOO().OooOO0o(diskVendor);
    }
}

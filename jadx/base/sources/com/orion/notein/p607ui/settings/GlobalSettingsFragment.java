package com.orion.notein.p607ui.settings;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.os.LocaleListCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oOoo.C26157OooOO0o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OOo0Oo.EnumC27285OooO;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.C28201OooooO0;
import o0Oo0oOo.ViewOnClickListenerC28359OooooO0;
import o0Oo0oOo.o00Ooo;
import o0OoO000.o0O0O00;
import o0OoO000.o0OO00O;
import o0OoO000.o0Oo0oo;
import o0OoO000.oo0o0Oo;
import o0OoO0oo.o00O;
import o0OoOoo.ViewOnClickListenerC29219OooO0OO;
import o0OoOoo.ViewOnClickListenerC29223OooO0oO;
import o0Ooo0oo.ViewOnClickListenerC29467OooOooO;
import o0Ooo0oo.ViewOnClickListenerC29468OooOooo;
import o0o0Oo0O.C30609OooO;
import o0o0Oo0O.C30623OooOOOO;
import o0oOOoOo.C30849OooO0O0;
import o0oOoOo.C31033OooO0Oo;
import o0oOoOo.C31047OooOOoo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/settings/GlobalSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GlobalSettingsFragment extends Hilt_GlobalSettingsFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f78854OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78855OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f78856OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f78857OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f78858Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f78859Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f78860Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public SwitchListItemView f78861Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f78862Oooo0O0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(GlobalSettingsFragment.this).OooO0o(R.id.nav_graph_global_settings);
        }
    }

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f78864OooO00o;

        static {
            int[] iArr = new int[EnumC27285OooO.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC27285OooO enumC27285OooO = EnumC27285OooO.f95076OooOo0o;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC27285OooO enumC27285OooO2 = EnumC27285OooO.f95076OooOo0o;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC27285OooO enumC27285OooO3 = EnumC27285OooO.f95076OooOo0o;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnumC27285OooO enumC27285OooO4 = EnumC27285OooO.f95076OooOo0o;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[BackupFile.DiskVendor.values().length];
            try {
                iArr2[BackupFile.DiskVendor.Baidu.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BackupFile.DiskVendor.GoogleDrive.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f78864OooO00o = iArr2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$onViewCreated$3", m80623f = "GlobalSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78866OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$onViewCreated$3$1", m80623f = "GlobalSettingsFragment.kt", m80624l = {127}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GlobalSettingsFragment f78867OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78868OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.GlobalSettingsFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$onViewCreated$3$1$1", m80623f = "GlobalSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19471OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C31033OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ GlobalSettingsFragment f78869OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78870OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19471OooO00o(GlobalSettingsFragment globalSettingsFragment, Continuation<? super C19471OooO00o> continuation) {
                    super(2, continuation);
                    this.f78869OooOo = globalSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19471OooO00o c19471OooO00o = new C19471OooO00o(this.f78869OooOo, continuation);
                    c19471OooO00o.f78870OooOo0o = obj;
                    return c19471OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C31033OooO0Oo c31033OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19471OooO00o) create(c31033OooO0Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    String string;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C31033OooO0Oo c31033OooO0Oo = (C31033OooO0Oo) this.f78870OooOo0o;
                    if (c31033OooO0Oo == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    GlobalSettingsFragment globalSettingsFragment = this.f78869OooOo;
                    TextView textView = globalSettingsFragment.f78857OooOooo;
                    if (textView != null) {
                        globalSettingsFragment.getClass();
                        int iOrdinal = c31033OooO0Oo.f110788OooO0O0.ordinal();
                        if (iOrdinal == 0) {
                            string = globalSettingsFragment.getString(R.string.cloud_non_activated);
                            OooOOO0.OooO0o(string, "getString(...)");
                        } else if (iOrdinal == 1) {
                            string = globalSettingsFragment.getString(R.string.cloud_sync_by_huawei_cloud);
                            OooOOO0.OooO0o(string, "getString(...)");
                        } else if (iOrdinal == 2) {
                            string = globalSettingsFragment.getString(R.string.cloud_sync_by_onedrive);
                            OooOOO0.OooO0o(string, "getString(...)");
                        } else if (iOrdinal == 3) {
                            string = globalSettingsFragment.getString(R.string.cloud_sync_by_xiaomi_cloud);
                            OooOOO0.OooO0o(string, "getString(...)");
                        } else {
                            if (iOrdinal != 4) {
                                throw new C32442OooOO0o();
                            }
                            string = globalSettingsFragment.getString(R.string.cloud_sync_by_google_drive);
                            OooOOO0.OooO0o(string, "getString(...)");
                        }
                        textView.setText(string);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(GlobalSettingsFragment globalSettingsFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f78867OooOo = globalSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f78867OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78868OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    GlobalSettingsFragment globalSettingsFragment = this.f78867OooOo;
                    C28201OooooO0 c28201OooooO0 = (C28201OooooO0) globalSettingsFragment.f78854OooOoo.getValue();
                    C19471OooO00o c19471OooO00o = new C19471OooO00o(globalSettingsFragment, null);
                    this.f78868OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c28201OooooO0.f99967Oooo0O0, c19471OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.GlobalSettingsFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$onViewCreated$3$2", m80623f = "GlobalSettingsFragment.kt", m80624l = {136}, m80625m = "invokeSuspend")
        public static final class C19472OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GlobalSettingsFragment f78871OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78872OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.GlobalSettingsFragment$OooO0O0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$onViewCreated$3$2$1", m80623f = "GlobalSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31047OooOOoo>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ GlobalSettingsFragment f78873OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78874OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(GlobalSettingsFragment globalSettingsFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78873OooOo = globalSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78873OooOo, continuation);
                    oooO00o.f78874OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31047OooOOoo> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    Object next;
                    int i;
                    String string;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    Iterator it = ((List) this.f78874OooOo0o).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((C31047OooOOoo) next).f110852OooO0O0) {
                            break;
                        }
                    }
                    C31047OooOOoo c31047OooOOoo = (C31047OooOOoo) next;
                    BackupFile.DiskVendor diskVendor = c31047OooOOoo != null ? c31047OooOOoo.f110851OooO00o : null;
                    GlobalSettingsFragment globalSettingsFragment = this.f78873OooOo;
                    TextView textView = globalSettingsFragment.f78859Oooo000;
                    if (textView != null) {
                        if (diskVendor == null) {
                            i = -1;
                        } else {
                            globalSettingsFragment.getClass();
                            i = OooO00o.f78864OooO00o[diskVendor.ordinal()];
                        }
                        if (i == 1) {
                            string = globalSettingsFragment.getString(R.string.baidu_disk);
                            OooOOO0.OooO0o(string, "getString(...)");
                        } else if (i != 2) {
                            string = globalSettingsFragment.getString(R.string.cloud_non_activated);
                            OooOOO0.OooO0o(string, "getString(...)");
                        } else {
                            string = globalSettingsFragment.getString(R.string.google_drive);
                            OooOOO0.OooO0o(string, "getString(...)");
                        }
                        textView.setText(string);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19472OooO0O0(GlobalSettingsFragment globalSettingsFragment, Continuation<? super C19472OooO0O0> continuation) {
                super(2, continuation);
                this.f78871OooOo = globalSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19472OooO0O0(this.f78871OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19472OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78872OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    GlobalSettingsFragment globalSettingsFragment = this.f78871OooOo;
                    com.orion.notein.p607ui.backup.OooO00o oooO00o = (com.orion.notein.p607ui.backup.OooO00o) globalSettingsFragment.f78856OooOooO.getValue();
                    OooO00o oooO00o2 = new OooO00o(globalSettingsFragment, null);
                    this.f78872OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO00o.f70701OooOo, oooO00o2, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$onViewCreated$3$3", m80623f = "GlobalSettingsFragment.kt", m80624l = {143}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GlobalSettingsFragment f78875OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78876OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$onViewCreated$3$3$1", m80623f = "GlobalSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ GlobalSettingsFragment f78877OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f78878OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(GlobalSettingsFragment globalSettingsFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78877OooOo = globalSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78877OooOo, continuation);
                    oooO00o.f78878OooOo0o = ((Boolean) obj).booleanValue();
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
                    boolean z = this.f78878OooOo0o;
                    SwitchListItemView switchListItemView = this.f78877OooOo.f78861Oooo00o;
                    if (switchListItemView != null && switchListItemView.OooO() != z) {
                        switchListItemView.setChecked(z);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(GlobalSettingsFragment globalSettingsFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f78875OooOo = globalSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f78875OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78876OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    GlobalSettingsFragment globalSettingsFragment = this.f78875OooOo;
                    C30623OooOOOO c30623OooOOOO = (C30623OooOOOO) globalSettingsFragment.f78855OooOoo0.getValue();
                    OooO00o oooO00o = new OooO00o(globalSettingsFragment, null);
                    this.f78876OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30623OooOOOO.f109588OooOo0, oooO00o, this) == enumC32485OooO00o) {
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
            OooO0O0 oooO0O0 = GlobalSettingsFragment.this.new OooO0O0(continuation);
            oooO0O0.f78866OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78866OooOo0o;
            GlobalSettingsFragment globalSettingsFragment = GlobalSettingsFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(globalSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19472OooO0O0(globalSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(globalSettingsFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return GlobalSettingsFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.GlobalSettingsFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23788OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23788OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return GlobalSettingsFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return GlobalSettingsFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.GlobalSettingsFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23789OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23789OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return GlobalSettingsFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.GlobalSettingsFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23790OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23790OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return GlobalSettingsFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.GlobalSettingsFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23791OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23791OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return GlobalSettingsFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78885OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78885OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f78885OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78886OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78886OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f78886OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.GlobalSettingsFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23792OooOO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78887OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23792OooOO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78887OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = GlobalSettingsFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f78887OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public GlobalSettingsFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO());
        OooOO0 oooOO02 = new OooOO0(c32447OooOOoOooO0OO);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78855OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C30623OooOOOO.class), oooOO02, new C23792OooOO0o(c32447OooOOoOooO0OO), new OooOO0O(c32447OooOOoOooO0OO));
        this.f78854OooOoo = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new OooO0OO(), new C23789OooO0o0(), new C23788OooO0Oo());
        this.f78856OooOooO = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.backup.OooO00o.class), new OooO0o(), new C23791OooO0oo(), new C23790OooO0oO());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(GlobalSettingsFragment globalSettingsFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30609OooO c30609OooO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30609OooO) {
            c30609OooO = (C30609OooO) abstractC32479OooO0OO;
            int i2 = c30609OooO.f109545OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30609OooO.f109545OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30609OooO = new C30609OooO(globalSettingsFragment, abstractC32479OooO0OO);
            }
        }
        C30609OooO c30609OooO2 = c30609OooO;
        Object objShowNonVipFeatureLimitedDialog$default = c30609OooO2.f109544OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30609OooO2.f109545OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = globalSettingsFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30609OooO2.f109545OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30609OooO2, 6, null);
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

    public static void OooOoOO(int i, View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_icon);
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOoo0() {
        String displayLanguage;
        LocaleListCompat localeListCompatOooO0o = AbstractC21486OooOO0o.OooO0o();
        OooOOO0.OooO0o(localeListCompatOooO0o, "getApplicationLocales(...)");
        Locale locale = !localeListCompatOooO0o.isEmpty() ? localeListCompatOooO0o.get(0) : Locale.getDefault();
        if (locale == null) {
            displayLanguage = Locale.getDefault().getDisplayLanguage();
            OooOOO0.OooO0o(displayLanguage, "getDisplayLanguage(...)");
        } else {
            String language = locale.getLanguage();
            if (language != null) {
                switch (language.hashCode()) {
                    case 3201:
                        if (!language.equals(TranslateLanguage.GERMAN)) {
                            displayLanguage = locale.getDisplayLanguage();
                            OooOOO0.OooO0Oo(displayLanguage);
                        } else {
                            displayLanguage = getString(R.string.language_german);
                            OooOOO0.OooO0Oo(displayLanguage);
                        }
                        break;
                    case 3241:
                        if (language.equals(TranslateLanguage.ENGLISH)) {
                            displayLanguage = getString(R.string.language_english);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3246:
                        if (language.equals(TranslateLanguage.SPANISH)) {
                            displayLanguage = getString(R.string.language_spanish);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3276:
                        if (language.equals(TranslateLanguage.FRENCH)) {
                            displayLanguage = getString(R.string.language_french);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3355:
                        if (language.equals("id")) {
                            displayLanguage = getString(R.string.language_indonesian);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3365:
                        if (!language.equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                        }
                        break;
                    case 3371:
                        if (language.equals(TranslateLanguage.ITALIAN)) {
                            displayLanguage = getString(R.string.language_italian);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3383:
                        if (language.equals(TranslateLanguage.JAPANESE)) {
                            displayLanguage = getString(R.string.language_japanese);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3428:
                        if (language.equals(TranslateLanguage.KOREAN)) {
                            displayLanguage = getString(R.string.language_korean);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3580:
                        if (language.equals(TranslateLanguage.POLISH)) {
                            displayLanguage = getString(R.string.language_polish);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3588:
                        if (language.equals(TranslateLanguage.PORTUGUESE)) {
                            displayLanguage = getString(R.string.language_portuguese);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3651:
                        if (language.equals(TranslateLanguage.RUSSIAN)) {
                            displayLanguage = getString(R.string.language_russian);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3700:
                        if (language.equals(TranslateLanguage.THAI)) {
                            displayLanguage = getString(R.string.language_thai);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3710:
                        if (language.equals(TranslateLanguage.TURKISH)) {
                            displayLanguage = getString(R.string.language_turkish);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3763:
                        if (language.equals(TranslateLanguage.VIETNAMESE)) {
                            displayLanguage = getString(R.string.language_vietnamese);
                            OooOOO0.OooO0Oo(displayLanguage);
                            break;
                        }
                        break;
                    case 3886:
                        if (language.equals(TranslateLanguage.CHINESE)) {
                            if (OooOOO0.OooO0O0(locale.getScript(), "Hant") || OooOOO0.OooO0O0(locale.getCountry(), "TW")) {
                                displayLanguage = getString(R.string.language_traditional_chinese);
                                OooOOO0.OooO0Oo(displayLanguage);
                            } else {
                                displayLanguage = getString(R.string.language_simplified_chinese);
                                OooOOO0.OooO0Oo(displayLanguage);
                            }
                            break;
                        }
                        break;
                }
            }
        }
        TextView textView = this.f78860Oooo00O;
        if (textView != null) {
            textView.setText(displayLanguage);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_global_settings, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        OooOoo0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.cl_document_setting).setOnClickListener(new ViewOnClickListenerC29219OooO0OO(this, 3));
        View viewFindViewById = view.findViewById(R.id.card_item_page_settings);
        if (viewFindViewById != null) {
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.tv_title);
            if (textView != null) {
                textView.setText(R.string.page_settings);
            }
            TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.tv_value);
            if (textView2 != null) {
                textView2.setText("");
            }
            OooOoOO(R.drawable.ic_ni_documents_new, viewFindViewById);
            viewFindViewById.setOnClickListener(new o0OO00O(this, 5));
        }
        View viewFindViewById2 = view.findViewById(R.id.card_item_tool_settings);
        if (viewFindViewById2 != null) {
            TextView textView3 = (TextView) viewFindViewById2.findViewById(R.id.tv_title);
            if (textView3 != null) {
                textView3.setText(R.string.tool_settings);
            }
            TextView textView4 = (TextView) viewFindViewById2.findViewById(R.id.tv_value);
            if (textView4 != null) {
                textView4.setText("");
                textView4.setVisibility(8);
            }
            OooOoOO(R.drawable.ic_ni_setting2_normal_new, viewFindViewById2);
            viewFindViewById2.setOnClickListener(new o00O(this, 1));
        }
        View viewFindViewById3 = view.findViewById(R.id.card_item_assist_line_and_shapes);
        if (viewFindViewById3 != null) {
            TextView textView5 = (TextView) viewFindViewById3.findViewById(R.id.tv_title);
            if (textView5 != null) {
                textView5.setText(R.string.assist_line_and_shapes);
            }
            TextView textView6 = (TextView) viewFindViewById3.findViewById(R.id.tv_value);
            if (textView6 != null) {
                textView6.setText("");
                textView6.setVisibility(8);
            }
            OooOoOO(R.drawable.ic_ni_shapes_new, viewFindViewById3);
            viewFindViewById3.setOnClickListener(new o0Oo0oo(this, 3));
        }
        View viewFindViewById4 = view.findViewById(R.id.card_item_appearance_settings);
        if (viewFindViewById4 != null) {
            TextView textView7 = (TextView) viewFindViewById4.findViewById(R.id.tv_title);
            if (textView7 != null) {
                textView7.setText(R.string.appearance_settings);
            }
            TextView textView8 = (TextView) viewFindViewById4.findViewById(R.id.tv_value);
            if (textView8 != null) {
                textView8.setText("");
                textView8.setVisibility(8);
            }
            OooOoOO(R.drawable.ic_appearance_settings, viewFindViewById4);
            viewFindViewById4.setOnClickListener(new o0O0O00(this, 3));
        }
        View viewFindViewById5 = view.findViewById(R.id.card_item_language_settings);
        if (viewFindViewById5 != null) {
            TextView textView9 = (TextView) viewFindViewById5.findViewById(R.id.tv_title);
            if (textView9 != null) {
                textView9.setText(R.string.language_settings_label);
            }
            TextView textView10 = (TextView) viewFindViewById5.findViewById(R.id.tv_value);
            this.f78860Oooo00O = textView10;
            if (textView10 != null) {
                textView10.setVisibility(0);
            }
            OooOoOO(R.drawable.ic_ni_language_new, viewFindViewById5);
            viewFindViewById5.setOnClickListener(new ViewOnClickListenerC29223OooO0oO(this, 1));
        }
        View viewFindViewById6 = view.findViewById(R.id.card_item_cloud_sync);
        if (viewFindViewById6 != null) {
            TextView textView11 = (TextView) viewFindViewById6.findViewById(R.id.tv_title);
            if (textView11 != null) {
                textView11.setText(R.string.cloud_sync_title);
            }
            this.f78857OooOooo = (TextView) viewFindViewById6.findViewById(R.id.tv_value);
            OooOoOO(R.drawable.ic_ni_sync_normal_new, viewFindViewById6);
            viewFindViewById6.setOnClickListener(new oo0o0Oo(this, 5));
        }
        View viewFindViewById7 = view.findViewById(R.id.card_item_cloud_backup);
        if (viewFindViewById7 != null) {
            TextView textView12 = (TextView) viewFindViewById7.findViewById(R.id.tv_title);
            if (textView12 != null) {
                textView12.setText(R.string.cloud_backup);
            }
            this.f78859Oooo000 = (TextView) viewFindViewById7.findViewById(R.id.tv_value);
            OooOoOO(R.drawable.ic_ni_backup_normal_new, viewFindViewById7);
            viewFindViewById7.setOnClickListener(new ViewOnClickListenerC29467OooOooO(this, 2));
        }
        View viewFindViewById8 = view.findViewById(R.id.card_item_local_backup);
        if (viewFindViewById8 != null) {
            TextView textView13 = (TextView) viewFindViewById8.findViewById(R.id.tv_title);
            if (textView13 != null) {
                textView13.setText(R.string.backup);
            }
            TextView textView14 = (TextView) viewFindViewById8.findViewById(R.id.tv_value);
            if (textView14 != null) {
                textView14.setText("");
            }
            OooOoOO(R.drawable.ic_ni_import_normal_new, viewFindViewById8);
            viewFindViewById8.setOnClickListener(new ViewOnClickListenerC28359OooooO0(this, 3));
        }
        View viewFindViewById9 = view.findViewById(R.id.card_item_gesture_settings);
        if (viewFindViewById9 != null) {
            TextView textView15 = (TextView) viewFindViewById9.findViewById(R.id.tv_title);
            if (textView15 != null) {
                textView15.setText(R.string.gesture_settings);
            }
            TextView textView16 = (TextView) viewFindViewById9.findViewById(R.id.tv_value);
            if (textView16 != null) {
                textView16.setVisibility(8);
            }
            OooOoOO(R.drawable.ic_ni_gesture, viewFindViewById9);
            viewFindViewById9.setOnClickListener(new o00Ooo(this, 4));
        }
        View viewFindViewById10 = view.findViewById(R.id.card_item_pen_shortcut);
        if (viewFindViewById10 != null) {
            TextView textView17 = (TextView) viewFindViewById10.findViewById(R.id.tv_title);
            if (textView17 != null) {
                textView17.setText(R.string.stylus_settings);
            }
            TextView textView18 = (TextView) viewFindViewById10.findViewById(R.id.tv_value);
            if (textView18 != null) {
                textView18.setText("");
                textView18.setVisibility(8);
            }
            OooOoOO(R.drawable.ic_ni_tools_pen_bar_normal_new, viewFindViewById10);
            o0O0o000.OooO0O0 oooO0O0OooO00o = o0O0o000.OooO00o.OooO00o();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GlobalSettingsFragment");
            c20358OooO00o.OooO0o0("setupPenShortcutCard, brand: " + Build.BRAND + ", vendor: " + oooO0O0OooO00o, new Object[0]);
            boolean zContains = C30849OooO0O0.f110258OooO0oo.contains(oooO0O0OooO00o);
            viewFindViewById10.setAlpha(zContains ? 1.0f : 0.38f);
            viewFindViewById10.setEnabled(zContains);
            viewFindViewById10.setClickable(zContains);
            viewFindViewById10.setFocusable(zContains);
            if (zContains) {
                viewFindViewById10.setOnClickListener(new ViewOnClickListenerC29468OooOooo(this, 2));
            } else {
                viewFindViewById10.setOnClickListener(null);
            }
        }
        SwitchListItemView switchListItemView = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_auto_update);
        if (switchListItemView != null) {
            String string = getString(R.string.auto_update);
            OooOOO0.OooO0o(string, "getString(...)");
            switchListItemView.setTitle(string);
            switchListItemView.setIcon(Integer.valueOf(R.drawable.ic_ni_import_normal_new));
            switchListItemView.setIconContentDescription(R.string.auto_update);
            String BRAND = Build.BRAND;
            OooOOO0.OooO0o(BRAND, "BRAND");
            if (C33599OooOo0O.OooOoOO(BRAND, "HUAWEI", true) || C28039OooO00o.OooO0OO()) {
                this.f78861Oooo00o = switchListItemView;
                switchListItemView.setOnCheckedChangeListener(new C26157OooOO0o(this));
            } else {
                switchListItemView.setVisibility(8);
                this.f78861Oooo00o = null;
            }
        }
        OooOoo0();
        final View viewFindViewById11 = view.findViewById(R.id.tv_reset_to_defaults);
        OooOOO0.OooO0Oo(viewFindViewById11);
        C28050OooO0OO.OooO00o(viewFindViewById11, 1000L, new View.OnClickListener() { // from class: o0o0Oo0O.OooO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GlobalSettingsFragment globalSettingsFragment = this.f109553OooOo0o;
                if (globalSettingsFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") != null) {
                    return;
                }
                String string2 = globalSettingsFragment.getString(R.string.tips);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                String string3 = globalSettingsFragment.getString(R.string.reset_to_default_settings_message);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                new TipsDialogFragment(string2, string3, new ViewOnClickListenerC26311Ooooooo(), new o0O0oOoo.OooOOO0(globalSettingsFragment, viewFindViewById11, 1), null, globalSettingsFragment.getString(R.string.reset_to_default_settings_confirm_button), 0, null, 384).show(globalSettingsFragment.getChildFragmentManager(), "TipsDialogFragment");
            }
        });
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}

package com.orion.notein.p607ui.backup;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.transition.OooOOOO;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000o00.AbstractC24555OooO00o;
import o0OoO000.ViewOnClickListenerC28585o0000o;
import o0OoO000.ViewOnClickListenerC28588o0000o0o;
import o0OoO0oo.ViewOnClickListenerC28958o00oOo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/backup/CloudBackupResultDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudBackupResultDialogFragment extends Hilt_CloudBackupResultDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f70581Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f70582Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(com.orion.notein.p607ui.backup.OooO00o.class), new OooO0O0(), new C22996OooO0Oo(), new OooO0OO());

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ProgressBar f70583Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f70584Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f70585Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f70586Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f70587Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f70588Oooo0o0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupResultDialogFragment$onViewCreated$6", m80623f = "CloudBackupResultDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f70590OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupResultDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupResultDialogFragment$onViewCreated$6$1", m80623f = "CloudBackupResultDialogFragment.kt", m80624l = {67}, m80625m = "invokeSuspend")
        public static final class C19150OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupResultDialogFragment f70591OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70592OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupResultDialogFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19151OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ CloudBackupResultDialogFragment f70593OooOo0o;

                public C19151OooO00o(CloudBackupResultDialogFragment cloudBackupResultDialogFragment) {
                    this.f70593OooOo0o = cloudBackupResultDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String string;
                    String string2;
                    BackupEvent backupEvent = (BackupEvent) obj;
                    if (backupEvent == null || backupEvent.getWhat() != 5) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    CloudBackupResultDialogFragment cloudBackupResultDialogFragment = this.f70593OooOo0o;
                    cloudBackupResultDialogFragment.getClass();
                    int result = backupEvent.getResult();
                    TextView textView = cloudBackupResultDialogFragment.f70585Oooo0O0;
                    if (textView == null) {
                        OooOOO0.OooOOOO("info");
                        throw null;
                    }
                    textView.setVisibility(0);
                    ProgressBar progressBar = cloudBackupResultDialogFragment.f70583Oooo00O;
                    if (progressBar == null) {
                        OooOOO0.OooOOOO("progressBar");
                        throw null;
                    }
                    progressBar.setVisibility(8);
                    TextView textView2 = cloudBackupResultDialogFragment.f70584Oooo00o;
                    if (textView2 == null) {
                        OooOOO0.OooOOOO("progressText");
                        throw null;
                    }
                    textView2.setVisibility(8);
                    if (result == 0) {
                        TextView textView3 = cloudBackupResultDialogFragment.f70581Oooo0;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                            throw null;
                        }
                        textView3.setText(cloudBackupResultDialogFragment.getString(R.string.backup_dialog_title));
                    } else {
                        TextView textView4 = cloudBackupResultDialogFragment.f70581Oooo0;
                        if (textView4 == null) {
                            OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                            throw null;
                        }
                        textView4.setText(cloudBackupResultDialogFragment.getString(R.string.backup_dialog_title_alert));
                    }
                    TextView textView5 = cloudBackupResultDialogFragment.f70585Oooo0O0;
                    if (textView5 == null) {
                        OooOOO0.OooOOOO("info");
                        throw null;
                    }
                    Bundle data = backupEvent.getData();
                    if (result == 0) {
                        string = cloudBackupResultDialogFragment.getString(R.string.backup_to_cloud_completed);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -101 || result == -999) {
                        string = cloudBackupResultDialogFragment.getString(R.string.backup_failed);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -3) {
                        string = cloudBackupResultDialogFragment.getString(R.string.backup_file_corrupted);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -2) {
                        string = cloudBackupResultDialogFragment.getString(R.string.backup_file_not_found);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -5) {
                        string = cloudBackupResultDialogFragment.getString(R.string.no_data_successfully_recovered);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -4) {
                        string = cloudBackupResultDialogFragment.getString(R.string.no_data_successfully_backed_up);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -6) {
                        string = cloudBackupResultDialogFragment.getString(R.string.no_data_to_back_up);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -7) {
                        string = cloudBackupResultDialogFragment.getString(R.string.no_data_to_recover);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -100) {
                        string = cloudBackupResultDialogFragment.getString(R.string.invalid_vendor);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -201) {
                        string = cloudBackupResultDialogFragment.getString(R.string.upload_backup_file_failed);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -110) {
                        if (data == null || (string2 = data.getString("note_title")) == null) {
                            string2 = "???";
                        }
                        string = cloudBackupResultDialogFragment.getString(R.string.invalid_filename_for_cloud_backup, string2);
                        OooOOO0.OooO0Oo(string);
                    } else if (result == -106) {
                        string = cloudBackupResultDialogFragment.getString(R.string.remote_disk_full);
                        OooOOO0.OooO0Oo(string);
                    } else {
                        string = cloudBackupResultDialogFragment.getString(R.string.unknown_error);
                        OooOOO0.OooO0Oo(string);
                    }
                    textView5.setText(string);
                    TextView textView6 = cloudBackupResultDialogFragment.f70588Oooo0o0;
                    if (textView6 == null) {
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                    textView6.setVisibility(0);
                    TextView textView7 = cloudBackupResultDialogFragment.f70586Oooo0OO;
                    if (textView7 != null) {
                        textView7.setVisibility(8);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnCancel");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19150OooO00o(CloudBackupResultDialogFragment cloudBackupResultDialogFragment, Continuation<? super C19150OooO00o> continuation) {
                super(2, continuation);
                this.f70591OooOo = cloudBackupResultDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19150OooO00o(this.f70591OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19150OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70592OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                CloudBackupResultDialogFragment cloudBackupResultDialogFragment = this.f70591OooOo;
                com.orion.notein.p607ui.backup.OooO00o oooO00o = (com.orion.notein.p607ui.backup.OooO00o) cloudBackupResultDialogFragment.f70582Oooo000.getValue();
                C19151OooO00o c19151OooO00o = new C19151OooO00o(cloudBackupResultDialogFragment);
                this.f70592OooOo0o = 1;
                oooO00o.f70695OooOOO0.collect(c19151OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupResultDialogFragment$onViewCreated$6$2", m80623f = "CloudBackupResultDialogFragment.kt", m80624l = {73}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudBackupResultDialogFragment f70594OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70595OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupResultDialogFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19152OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ CloudBackupResultDialogFragment f70596OooOo0o;

                public C19152OooO00o(CloudBackupResultDialogFragment cloudBackupResultDialogFragment) {
                    this.f70596OooOo0o = cloudBackupResultDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Log.d("CloudBackupResultDialogFragment", "Update progress " + fFloatValue);
                    int iMin = Math.min(100, (int) (fFloatValue * ((float) 100)));
                    CloudBackupResultDialogFragment cloudBackupResultDialogFragment = this.f70596OooOo0o;
                    ProgressBar progressBar = cloudBackupResultDialogFragment.f70583Oooo00O;
                    if (progressBar == null) {
                        OooOOO0.OooOOOO("progressBar");
                        throw null;
                    }
                    progressBar.setProgress(iMin);
                    TextView textView = cloudBackupResultDialogFragment.f70584Oooo00o;
                    if (textView == null) {
                        OooOOO0.OooOOOO("progressText");
                        throw null;
                    }
                    textView.setText(iMin + "%");
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(CloudBackupResultDialogFragment cloudBackupResultDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f70594OooOo = cloudBackupResultDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f70594OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70595OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                CloudBackupResultDialogFragment cloudBackupResultDialogFragment = this.f70594OooOo;
                com.orion.notein.p607ui.backup.OooO00o oooO00o = (com.orion.notein.p607ui.backup.OooO00o) cloudBackupResultDialogFragment.f70582Oooo000.getValue();
                C19152OooO00o c19152OooO00o = new C19152OooO00o(cloudBackupResultDialogFragment);
                this.f70595OooOo0o = 1;
                oooO00o.f70699OooOOo0.collect(c19152OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = CloudBackupResultDialogFragment.this.new OooO00o(continuation);
            oooO00o.f70590OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f70590OooOo0o;
            CloudBackupResultDialogFragment cloudBackupResultDialogFragment = CloudBackupResultDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19150OooO00o(cloudBackupResultDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(cloudBackupResultDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return CloudBackupResultDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return CloudBackupResultDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.CloudBackupResultDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C22996OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C22996OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return CloudBackupResultDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_backup_result_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        ProgressBar progressBar = this.f70583Oooo00O;
        if (progressBar == null) {
            OooOOO0.OooOOOO("progressBar");
            throw null;
        }
        progressBar.setProgress(0);
        TextView textView = this.f70584Oooo00o;
        if (textView != null) {
            textView.setText("0%");
        } else {
            OooOOO0.OooOOOO("progressText");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        this.f70583Oooo00O = (ProgressBar) view.findViewById(R.id.progress_bar);
        this.f70584Oooo00o = (TextView) view.findViewById(R.id.progress_txt);
        TextView textView = (TextView) view.findViewById(R.id.dialog_title);
        this.f70581Oooo0 = textView;
        if (textView == null) {
            OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
            throw null;
        }
        textView.setText(getString(R.string.backup_in_progress));
        this.f70585Oooo0O0 = (TextView) view.findViewById(R.id.alert_info);
        TextView textView2 = (TextView) view.findViewById(R.id.btn_cancel);
        OooOOO0.OooO0Oo(textView2);
        textView2.setVisibility(0);
        this.f70586Oooo0OO = textView2;
        textView2.setOnClickListener(new ViewOnClickListenerC28588o0000o0o(this, 3));
        TextView textView3 = (TextView) view.findViewById(R.id.btn_confirm);
        OooOOO0.OooO0Oo(textView3);
        textView3.setVisibility(8);
        this.f70588Oooo0o0 = textView3;
        textView3.setOnClickListener(new ViewOnClickListenerC28585o0000o(this, 3));
        View viewFindViewById = view.findViewById(R.id.btn_terminate);
        this.f70587Oooo0o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnTerminate");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28958o00oOo0o(this, 5));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}

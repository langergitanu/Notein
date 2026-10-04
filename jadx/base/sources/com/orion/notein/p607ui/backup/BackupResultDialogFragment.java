package com.orion.notein.p607ui.backup;

import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.transition.OooOOOO;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000o00.AbstractC24555OooO00o;
import o00oo0Oo.C25716Oooo0O0;
import o0Oo0oOo.ViewOnClickListenerC28375o0ooOO0;
import o0OoO000.ViewOnClickListenerC28589o0000oO;
import o0OoO000.o0000O0;
import o0o00oO0.ViewOnClickListenerC29992OooOO0o;
import o0oOoo00.C31114OooO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/backup/BackupResultDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BackupResultDialogFragment extends Hilt_BackupResultDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f70508Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f70509Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ProgressBar f70510Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f70511Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f70512Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f70513Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ViewGroup f70514Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f70515Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f70516Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f70517Oooo0oo;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupResultDialogFragment$onViewCreated$5", m80623f = "BackupResultDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f70519OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupResultDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupResultDialogFragment$onViewCreated$5$1", m80623f = "BackupResultDialogFragment.kt", m80624l = {76}, m80625m = "invokeSuspend")
        public static final class C19145OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BackupResultDialogFragment f70520OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70521OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupResultDialogFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19146OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ BackupResultDialogFragment f70522OooOo0o;

                public C19146OooO00o(BackupResultDialogFragment backupResultDialogFragment) {
                    this.f70522OooOo0o = backupResultDialogFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                    this.f70522OooOo0o.Oooo0(((Number) c32443OooOOO.f116638OooOo0o).intValue(), (Integer) c32443OooOOO.f116637OooOo);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19145OooO00o(BackupResultDialogFragment backupResultDialogFragment, Continuation<? super C19145OooO00o> continuation) {
                super(2, continuation);
                this.f70520OooOo = backupResultDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19145OooO00o(this.f70520OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19145OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70521OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BackupResultDialogFragment backupResultDialogFragment = this.f70520OooOo;
                    C31114OooO c31114OooOOooo00o = backupResultDialogFragment.Oooo00o();
                    C19146OooO00o c19146OooO00o = new C19146OooO00o(backupResultDialogFragment);
                    this.f70521OooOo0o = 1;
                    if (c31114OooOOooo00o.f111032OooOO0o.f121747OooOo0o.collect(c19146OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupResultDialogFragment$onViewCreated$5$2", m80623f = "BackupResultDialogFragment.kt", m80624l = {78}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BackupResultDialogFragment f70523OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70524OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupResultDialogFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19147OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ BackupResultDialogFragment f70525OooOo0o;

                public C19147OooO00o(BackupResultDialogFragment backupResultDialogFragment) {
                    this.f70525OooOo0o = backupResultDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    float fFloatValue = ((Number) obj).floatValue();
                    BackupResultDialogFragment backupResultDialogFragment = this.f70525OooOo0o;
                    Log.d("BackupResultDialogFragment", "Update progress " + fFloatValue + ", state: " + backupResultDialogFragment.Oooo00o().f111032OooOO0o.f121747OooOo0o.getValue());
                    int iMin = Math.min(100, (int) (fFloatValue * ((float) 100)));
                    ProgressBar progressBar = backupResultDialogFragment.f70510Oooo00O;
                    if (progressBar == null) {
                        OooOOO0.OooOOOO("progressBar");
                        throw null;
                    }
                    progressBar.setProgress(iMin);
                    TextView textView = backupResultDialogFragment.f70511Oooo00o;
                    if (textView == null) {
                        OooOOO0.OooOOOO("progressText");
                        throw null;
                    }
                    textView.setText(iMin + "%");
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(BackupResultDialogFragment backupResultDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f70523OooOo = backupResultDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f70523OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70524OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                BackupResultDialogFragment backupResultDialogFragment = this.f70523OooOo;
                C31114OooO c31114OooOOooo00o = backupResultDialogFragment.Oooo00o();
                C19147OooO00o c19147OooO00o = new C19147OooO00o(backupResultDialogFragment);
                this.f70524OooOo0o = 1;
                c31114OooOOooo00o.f111036OooOOOo.collect(c19147OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = BackupResultDialogFragment.this.new OooO00o(continuation);
            oooO00o.f70519OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f70519OooOo0o;
            BackupResultDialogFragment backupResultDialogFragment = BackupResultDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19145OooO00o(backupResultDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(backupResultDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C25716Oooo0O0 f70526OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C25716Oooo0O0 c25716Oooo0O0) {
            super(0);
            this.f70526OooOo0o = c25716Oooo0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70526OooOo0o.invoke();
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70527OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70527OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70527OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupResultDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C22987OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70528OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22987OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70528OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70528OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.BackupResultDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C22988OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70529OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22988OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70529OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70529OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BackupResultDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public BackupResultDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0O0(new C25716Oooo0O0(this, 1)));
        this.f70509Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C31114OooO.class), new OooO0OO(interfaceC32440OooOO0OooO0O0), new C22988OooO0o0(interfaceC32440OooOO0OooO0O0), new C22987OooO0Oo(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_backup_result_dialog;
    }

    public final void Oooo0(int i, Integer num) {
        String string;
        boolean z = num != null;
        TextView textView = this.f70512Oooo0O0;
        if (textView == null) {
            OooOOO0.OooOOOO("info");
            throw null;
        }
        textView.setVisibility(z ? 0 : 8);
        ProgressBar progressBar = this.f70510Oooo00O;
        if (progressBar == null) {
            OooOOO0.OooOOOO("progressBar");
            throw null;
        }
        progressBar.setVisibility(!z ? 0 : 8);
        TextView textView2 = this.f70511Oooo00o;
        if (textView2 == null) {
            OooOOO0.OooOOOO("progressText");
            throw null;
        }
        textView2.setVisibility(!z ? 0 : 8);
        if (num != null && num.intValue() == 0) {
            TextView textView3 = this.f70508Oooo0;
            if (textView3 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView3.setText(getString(R.string.backup_dialog_title));
        } else if (num != null) {
            TextView textView4 = this.f70508Oooo0;
            if (textView4 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView4.setText(getString(R.string.backup_dialog_title_alert));
        } else if (i == 1) {
            TextView textView5 = this.f70508Oooo0;
            if (textView5 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView5.setText(getString(R.string.backup_in_progress));
        } else if (i == 2) {
            TextView textView6 = this.f70508Oooo0;
            if (textView6 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView6.setText(getString(R.string.restore_in_progress));
        }
        TextView textView7 = this.f70512Oooo0O0;
        if (textView7 == null) {
            OooOOO0.OooOOOO("info");
            throw null;
        }
        if (num != null && num.intValue() == 0) {
            if (i == 1) {
                string = getString(R.string.backup_completed);
                OooOOO0.OooO0Oo(string);
            } else {
                string = getString(R.string.restore_completed);
                OooOOO0.OooO0Oo(string);
            }
        } else if (num != null && num.intValue() == -999) {
            if (i == 1) {
                string = getString(R.string.backup_failed);
                OooOOO0.OooO0Oo(string);
            } else {
                string = getString(R.string.restore_failed);
                OooOOO0.OooO0Oo(string);
            }
        } else if (num != null && num.intValue() == -3) {
            string = getString(R.string.backup_file_corrupted);
            OooOOO0.OooO0Oo(string);
        } else if (num != null && num.intValue() == -2) {
            string = getString(R.string.backup_file_not_found);
            OooOOO0.OooO0Oo(string);
        } else if (num != null && num.intValue() == -5) {
            string = getString(R.string.no_data_successfully_recovered);
            OooOOO0.OooO0Oo(string);
        } else if (num != null && num.intValue() == -4) {
            string = getString(R.string.no_data_successfully_backed_up);
            OooOOO0.OooO0Oo(string);
        } else if (num != null && num.intValue() == -6) {
            string = getString(R.string.no_data_to_back_up);
            OooOOO0.OooO0Oo(string);
        } else if (num != null && num.intValue() == -7) {
            string = getString(R.string.no_data_to_recover);
            OooOOO0.OooO0Oo(string);
        } else if (num != null && num.intValue() == -100) {
            string = getString(R.string.invalid_vendor);
            OooOOO0.OooO0Oo(string);
        } else {
            string = getString(R.string.unknown_error);
            OooOOO0.OooO0Oo(string);
        }
        textView7.setText(string);
        ViewGroup viewGroup = this.f70514Oooo0o;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnSkipAndTerminate");
            throw null;
        }
        viewGroup.setVisibility(8);
        TextView textView8 = this.f70515Oooo0o0;
        if (textView8 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView8.setVisibility(z ? 0 : 8);
        TextView textView9 = this.f70513Oooo0OO;
        if (textView9 != null) {
            textView9.setVisibility(z ? 8 : 0);
        } else {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
    }

    public final C31114OooO Oooo00o() {
        return (C31114OooO) this.f70509Oooo000.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        o00000OO o00000oo2 = Oooo00o().f111028OooO0oO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        ProgressBar progressBar = this.f70510Oooo00O;
        if (progressBar == null) {
            OooOOO0.OooOOOO("progressBar");
            throw null;
        }
        progressBar.setProgress(1);
        TextView textView = this.f70511Oooo00o;
        if (textView != null) {
            textView.setText("1%");
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
        this.f70510Oooo00O = (ProgressBar) view.findViewById(R.id.progress_bar);
        this.f70511Oooo00o = (TextView) view.findViewById(R.id.progress_txt);
        this.f70508Oooo0 = (TextView) view.findViewById(R.id.dialog_title);
        this.f70512Oooo0O0 = (TextView) view.findViewById(R.id.alert_info);
        TextView textView = (TextView) view.findViewById(R.id.btn_cancel);
        this.f70513Oooo0OO = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC28375o0ooOO0(this, 2));
        TextView textView2 = (TextView) view.findViewById(R.id.btn_confirm);
        this.f70515Oooo0o0 = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView2.setOnClickListener(new ViewOnClickListenerC28589o0000oO(this, 3));
        this.f70514Oooo0o = (ViewGroup) view.findViewById(R.id.btn_skip_and_terminate);
        View viewFindViewById = view.findViewById(R.id.btn_terminate);
        this.f70517Oooo0oo = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnTerminate");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC29992OooOO0o(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.btn_continue);
        this.f70516Oooo0oO = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new o0000O0(this, 2));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}

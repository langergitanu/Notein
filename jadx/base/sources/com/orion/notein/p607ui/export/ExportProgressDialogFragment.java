package com.orion.notein.p607ui.export;

import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
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
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000o00.AbstractC24555OooO00o;
import o0O0o0oO.o00O0O;
import o0Oo0o0o.C28257Oooo0o;
import o0Oo0o0o.C28258Oooo0o0;
import o0Oo0o0o.C28259Oooo0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/export/ExportProgressDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ExportProgressDialogFragment extends Hilt_ExportProgressDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f71660Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C32447OooOOo f71661Oooo000 = C20519OooO0Oo.OooO0OO(new C28258Oooo0o0(this, 0));

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f71662Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f71663Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ViewGroup f71664Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ViewGroup f71665Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ProgressBar f71666Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ViewGroup f71667Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f71668Oooo0oO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportProgressDialogFragment$onViewCreated$2", m80623f = "ExportProgressDialogFragment.kt", m80624l = {90}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71670OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportProgressDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19205OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ ExportProgressDialogFragment f71671OooOo0o;

            public C19205OooO00o(ExportProgressDialogFragment exportProgressDialogFragment) {
                this.f71671OooOo0o = exportProgressDialogFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                float fFloatValue = ((Number) obj).floatValue();
                ExportProgressDialogFragment exportProgressDialogFragment = this.f71671OooOo0o;
                if (fFloatValue >= 0.01f || ((C28259Oooo0oO) exportProgressDialogFragment.f71661Oooo000.getValue()).f100127OooO00o) {
                    TextView textView = exportProgressDialogFragment.f71663Oooo00o;
                    if (textView == null) {
                        OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                        throw null;
                    }
                    textView.setText(exportProgressDialogFragment.getString(R.string.export));
                    ViewGroup viewGroup = exportProgressDialogFragment.f71665Oooo0OO;
                    if (viewGroup == null) {
                        OooOOO0.OooOOOO("progressBarWrapper");
                        throw null;
                    }
                    viewGroup.setVisibility(0);
                    ViewGroup viewGroup2 = exportProgressDialogFragment.f71667Oooo0o0;
                    if (viewGroup2 == null) {
                        OooOOO0.OooOOOO("progressCircleWrapper");
                        throw null;
                    }
                    viewGroup2.setVisibility(8);
                    int iMin = Math.min(100, (int) (fFloatValue * 100));
                    ProgressBar progressBar = exportProgressDialogFragment.f71666Oooo0o;
                    if (progressBar == null) {
                        OooOOO0.OooOOOO("progressBar");
                        throw null;
                    }
                    progressBar.setProgress(iMin);
                    TextView textView2 = exportProgressDialogFragment.f71668Oooo0oO;
                    if (textView2 == null) {
                        OooOOO0.OooOOOO("progressText");
                        throw null;
                    }
                    textView2.setText(iMin + "%");
                } else {
                    TextView textView3 = exportProgressDialogFragment.f71663Oooo00o;
                    if (textView3 == null) {
                        OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                        throw null;
                    }
                    textView3.setText(exportProgressDialogFragment.getString(R.string.loading));
                    ViewGroup viewGroup3 = exportProgressDialogFragment.f71665Oooo0OO;
                    if (viewGroup3 == null) {
                        OooOOO0.OooOOOO("progressBarWrapper");
                        throw null;
                    }
                    viewGroup3.setVisibility(8);
                    ViewGroup viewGroup4 = exportProgressDialogFragment.f71667Oooo0o0;
                    if (viewGroup4 == null) {
                        OooOOO0.OooOOOO("progressCircleWrapper");
                        throw null;
                    }
                    viewGroup4.setVisibility(0);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ExportProgressDialogFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71670OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            ExportProgressDialogFragment exportProgressDialogFragment = ExportProgressDialogFragment.this;
            OooO0o oooO0o = (OooO0o) exportProgressDialogFragment.f71662Oooo00O.getValue();
            C19205OooO00o c19205OooO00o = new C19205OooO00o(exportProgressDialogFragment);
            this.f71670OooOo0o = 1;
            oooO0o.f71761OooOOO0.collect(c19205OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28257Oooo0o f71672OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C28257Oooo0o c28257Oooo0o) {
            super(0);
            this.f71672OooOo0o = c28257Oooo0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71672OooOo0o.invoke();
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71673OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71673OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71673OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportProgressDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23101OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71674OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23101OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71674OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71674OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.export.ExportProgressDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23102OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71675OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23102OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71675OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71675OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ExportProgressDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ExportProgressDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0O0(new C28257Oooo0o(this, 0)));
        this.f71662Oooo00O = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(OooO0o.class), new OooO0OO(interfaceC32440OooOO0OooO0O0), new C23102OooO0o0(interfaceC32440OooOO0OooO0O0), new C23101OooO0Oo(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_export_progress_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        ProgressBar progressBar = this.f71666Oooo0o;
        if (progressBar == null) {
            OooOOO0.OooOOOO("progressBar");
            throw null;
        }
        progressBar.setProgress(0);
        TextView textView = this.f71668Oooo0oO;
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
        TextView textView = (TextView) view.findViewById(R.id.dialog_title);
        this.f71663Oooo00o = textView;
        if (textView == null) {
            OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
            throw null;
        }
        textView.setText(getString(R.string.export));
        TextView textView2 = (TextView) view.findViewById(R.id.btn_cancel);
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        textView2.setOnClickListener(new o00O0O(this, 1));
        this.f71660Oooo0 = (TextView) view.findViewById(R.id.tv_info);
        C32447OooOOo c32447OooOOo = this.f71661Oooo000;
        if (((C28259Oooo0oO) c32447OooOOo.getValue()).f100128OooO0O0 == 1) {
            TextView textView3 = this.f71660Oooo0;
            if (textView3 == null) {
                OooOOO0.OooOOOO("txtInfo");
                throw null;
            }
            textView3.setText(getString(R.string.page_exporting_and_waiting));
        } else {
            TextView textView4 = this.f71660Oooo0;
            if (textView4 == null) {
                OooOOO0.OooOOOO("txtInfo");
                throw null;
            }
            textView4.setText(getString(R.string.note_exporting_and_waiting));
        }
        this.f71664Oooo0O0 = (ViewGroup) view.findViewById(R.id.cl_progress);
        this.f71665Oooo0OO = (ViewGroup) view.findViewById(R.id.progress_bar_wrapper);
        this.f71667Oooo0o0 = (ViewGroup) view.findViewById(R.id.progress_circle_wrapper);
        this.f71666Oooo0o = (ProgressBar) view.findViewById(R.id.progress_bar);
        this.f71668Oooo0oO = (TextView) view.findViewById(R.id.progress_txt);
        TextView textView5 = this.f71660Oooo0;
        if (textView5 == null) {
            OooOOO0.OooOOOO("txtInfo");
            throw null;
        }
        textView5.setVisibility(((C28259Oooo0oO) c32447OooOOo.getValue()).f100127OooO00o ? 0 : 8);
        ViewGroup viewGroup = this.f71665Oooo0OO;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("progressBarWrapper");
            throw null;
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f71667Oooo0o0;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("progressCircleWrapper");
            throw null;
        }
        viewGroup2.setVisibility(0);
        ViewGroup viewGroup3 = this.f71664Oooo0O0;
        if (viewGroup3 == null) {
            OooOOO0.OooOOOO("progressViewGroup");
            throw null;
        }
        viewGroup3.setVisibility(((C28259Oooo0oO) c32447OooOOo.getValue()).f100127OooO00o ? 8 : 0);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}

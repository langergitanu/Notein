package com.orion.notein.p607ui.pageeditor;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import com.google.android.material.datepicker.ViewOnClickListenerC22469OooO0o0;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o000o0O0.OooOO0;
import o0o0OO.C30367OooO0o0;
import o0o0OO0O.C30427OooO0o;
import oO00ooO.C32447OooOOo;
import oO0o0OO.o00000OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/pageeditor/PageOperationProgressDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageOperationProgressDialogFragment extends Hilt_PageOperationProgressDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f78494Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f78495Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f78496Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f78497Oooo00o;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(PageOperationProgressDialogFragment.this).OooO0o(R.id.tiledPageEditorFragment);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78499OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78499OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f78499OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78500OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78500OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f78500OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.PageOperationProgressDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23747OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78501OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23747OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78501OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = PageOperationProgressDialogFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f78501OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.PageOperationProgressDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23748OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23748OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            PageOperationProgressDialogFragment pageOperationProgressDialogFragment = PageOperationProgressDialogFragment.this;
            Bundle arguments = pageOperationProgressDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + pageOperationProgressDialogFragment + " has null arguments");
        }
    }

    public PageOperationProgressDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78495Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C30427OooO0o.class), new C23748OooO0o0());
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO00o());
        OooO0O0 oooO0O0 = new OooO0O0(c32447OooOOoOooO0OO);
        this.f78496Oooo00O = new C22026ooOO(oooo0.OooO0O0(C30367OooO0o0.class), oooO0O0, new C23747OooO0Oo(c32447OooOOoOooO0OO), new OooO0OO(c32447OooOOoOooO0OO));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_export_progress_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        o00000OO o00000oo2 = ((C30367OooO0o0) this.f78496Oooo00O.getValue()).f108327OooO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
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
        this.f78497Oooo00o = (TextView) view.findViewById(R.id.dialog_title);
        this.f78494Oooo0 = (TextView) view.findViewById(R.id.tv_info);
        int i = ((C30427OooO0o) this.f78495Oooo000.getValue()).f108686OooO00o;
        if (i == 0) {
            TextView textView = this.f78497Oooo00o;
            if (textView == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView.setText(getString(R.string.page_copy_into));
            TextView textView2 = this.f78494Oooo0;
            if (textView2 == null) {
                OooOOO0.OooOOOO("txtInfo");
                throw null;
            }
            textView2.setText(getString(R.string.page_coping_and_waiting));
        } else if (i == 1) {
            TextView textView3 = this.f78497Oooo00o;
            if (textView3 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView3.setText(getString(R.string.page_cut_into));
            TextView textView4 = this.f78494Oooo0;
            if (textView4 == null) {
                OooOOO0.OooOOOO("txtInfo");
                throw null;
            }
            textView4.setText(getString(R.string.page_cutting_and_waiting));
        } else if (i == 2) {
            TextView textView5 = this.f78497Oooo00o;
            if (textView5 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView5.setText(getString(R.string.page_saving));
            TextView textView6 = this.f78494Oooo0;
            if (textView6 == null) {
                OooOOO0.OooOOOO("txtInfo");
                throw null;
            }
            textView6.setText(getString(R.string.page_saving_and_waiting));
        } else if (i == 3) {
            TextView textView7 = this.f78497Oooo00o;
            if (textView7 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView7.setText(getString(R.string.page_paste_info));
            TextView textView8 = this.f78494Oooo0;
            if (textView8 == null) {
                OooOOO0.OooOOOO("txtInfo");
                throw null;
            }
            textView8.setText(getString(R.string.page_pasting_and_waiting));
        }
        TextView textView9 = (TextView) view.findViewById(R.id.btn_cancel);
        if (textView9 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        textView9.setOnClickListener(new ViewOnClickListenerC22469OooO0o0(this, 5));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cl_progress);
        if (viewGroup == null) {
            OooOOO0.OooOOOO("progressViewGroup");
            throw null;
        }
        viewGroup.setVisibility(8);
        TextView textView10 = this.f78494Oooo0;
        if (textView10 != null) {
            textView10.setVisibility(0);
        } else {
            OooOOO0.OooOOOO("txtInfo");
            throw null;
        }
    }
}

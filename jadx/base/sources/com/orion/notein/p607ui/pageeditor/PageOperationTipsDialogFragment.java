package com.orion.notein.p607ui.pageeditor;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0Oo0oOo.o000OOo;
import o0OoOoo0.ViewOnClickListenerC29234OooOO0;
import o0Ooo0oo.ViewOnClickListenerC29543o000O0o0;
import o0o0OO0O.C30430OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/pageeditor/PageOperationTipsDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageOperationTipsDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f78504OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30430OooO0oo.class), new OooO00o());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f78505OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public TextView f78506OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f78507OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f78508OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f78509Oooo000;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            PageOperationTipsDialogFragment pageOperationTipsDialogFragment = PageOperationTipsDialogFragment.this;
            Bundle arguments = pageOperationTipsDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + pageOperationTipsDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_page_operation_result_dialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C30430OooO0oo Oooo00O() {
        return (C30430OooO0oo) this.f78504OooOoOO.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f78506OooOoo0 = (TextView) view.findViewById(R.id.dialog_title);
        this.f78505OooOoo = (TextView) view.findViewById(R.id.dialog_content);
        TextView textView = (TextView) view.findViewById(R.id.dialog_cancel);
        this.f78507OooOooO = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC29234OooOO0(this, 3));
        TextView textView2 = (TextView) view.findViewById(R.id.dialog_confirm);
        this.f78508OooOooo = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView2.setOnClickListener(new o000OOo(this, 3));
        TextView textView3 = (TextView) view.findViewById(R.id.dialog_known);
        this.f78509Oooo000 = textView3;
        if (textView3 == null) {
            OooOOO0.OooOOOO("btnKnown");
            throw null;
        }
        textView3.setOnClickListener(new ViewOnClickListenerC29543o000O0o0(this, 2));
        int i = Oooo00O().f108687OooO00o;
        if (i == 0) {
            TextView textView4 = this.f78506OooOoo0;
            if (textView4 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView4.setText(getString(R.string.page_copy_into));
            if (Oooo00O().f108688OooO0O0) {
                TextView textView5 = this.f78505OooOoo;
                if (textView5 == null) {
                    OooOOO0.OooOOOO("info");
                    throw null;
                }
                textView5.setText(getString(R.string.page_copy_success, Integer.valueOf(Oooo00O().f108690OooO0Oo)));
            } else {
                TextView textView6 = this.f78505OooOoo;
                if (textView6 == null) {
                    OooOOO0.OooOOOO("info");
                    throw null;
                }
                textView6.setText(getString(R.string.page_operation_failed));
            }
        } else if (i == 1) {
            TextView textView7 = this.f78506OooOoo0;
            if (textView7 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView7.setText(getString(R.string.page_cut_into));
            if (Oooo00O().f108688OooO0O0) {
                TextView textView8 = this.f78505OooOoo;
                if (textView8 == null) {
                    OooOOO0.OooOOOO("info");
                    throw null;
                }
                textView8.setText(getString(R.string.page_copy_success));
            } else {
                TextView textView9 = this.f78505OooOoo;
                if (textView9 == null) {
                    OooOOO0.OooOOOO("info");
                    throw null;
                }
                textView9.setText(getString(R.string.page_operation_failed));
            }
        } else if (i == 2) {
            TextView textView10 = this.f78506OooOoo0;
            if (textView10 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            textView10.setText(getString(R.string.page_save_as));
            if (Oooo00O().f108688OooO0O0) {
                TextView textView11 = this.f78505OooOoo;
                if (textView11 == null) {
                    OooOOO0.OooOOOO("info");
                    throw null;
                }
                textView11.setText(getString(R.string.page_save_as_success));
            } else {
                TextView textView12 = this.f78505OooOoo;
                if (textView12 == null) {
                    OooOOO0.OooOOOO("info");
                    throw null;
                }
                textView12.setText(getString(R.string.page_operation_failed));
            }
        } else if (Oooo00O().f108688OooO0O0) {
            TextView textView13 = this.f78505OooOoo;
            if (textView13 == null) {
                OooOOO0.OooOOOO("info");
                throw null;
            }
            textView13.setText(getString(R.string.page_operation_success));
        } else {
            TextView textView14 = this.f78505OooOoo;
            if (textView14 == null) {
                OooOOO0.OooOOOO("info");
                throw null;
            }
            textView14.setText(getString(R.string.page_operation_failed));
        }
        if (Oooo00O().f108688OooO0O0) {
            return;
        }
        TextView textView15 = this.f78508OooOooo;
        if (textView15 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView15.setVisibility(8);
        TextView textView16 = this.f78507OooOooO;
        if (textView16 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        textView16.setVisibility(8);
        TextView textView17 = this.f78509Oooo000;
        if (textView17 != null) {
            textView17.setVisibility(0);
        } else {
            OooOOO0.OooOOOO("btnKnown");
            throw null;
        }
    }
}

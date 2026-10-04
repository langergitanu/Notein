package com.orion.notein.p607ui.export;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.fragment.app.C21904OooOoo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import com.orion.notein.p607ui.export.WatermarkEditDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.o0O0O00;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/export/WatermarkEditDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class WatermarkEditDialogFragment extends BaseDialogFragment {
    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_watermark_edit_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        final EditText editText = (EditText) view.findViewById(R.id.input_water_mark);
        View viewFindViewById = view.findViewById(R.id.btn_cancel);
        View viewFindViewById2 = view.findViewById(R.id.btn_confirm);
        editText.setText(requireArguments().getString("arg_text", ""));
        Editable text = editText.getText();
        editText.setSelection(text != null ? text.length() : 0);
        viewFindViewById.setOnClickListener(new o0O0O00(this, 1));
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0o0o.o0ooOOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Editable text2 = editText.getText();
                String string = text2 != null ? text2.toString() : null;
                if (string == null) {
                    string = "";
                }
                Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("key_bundle_for_text", string));
                WatermarkEditDialogFragment watermarkEditDialogFragment = this;
                C21904OooOoo0.OooO0o(bundleBundleOf, watermarkEditDialogFragment, "key_result_for_text");
                watermarkEditDialogFragment.dismiss();
            }
        });
        editText.requestFocus();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(20);
    }
}

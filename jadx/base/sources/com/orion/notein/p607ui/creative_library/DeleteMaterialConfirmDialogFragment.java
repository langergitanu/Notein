package com.orion.notein.p607ui.creative_library;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.ViewOnClickListenerC28372o00o0O;
import o0Oo0oOo.o00Ooo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/DeleteMaterialConfirmDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DeleteMaterialConfirmDialogFragment extends BaseDialogFragment {
    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.dialog_delete_material_confirm;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg_material_id") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("arg_material_title") : null;
        TextView textView = (TextView) view.findViewById(R.id.alert_info);
        if (string2 == null) {
            string2 = "";
        }
        textView.setText(getString(R.string.delete_downloaded_material_message, string2));
        view.findViewById(R.id.btn_cancel).setOnClickListener(new o00Ooo(this, 0));
        view.findViewById(R.id.btn_confirm).setOnClickListener(new ViewOnClickListenerC28372o00o0O(0, string, this));
    }
}

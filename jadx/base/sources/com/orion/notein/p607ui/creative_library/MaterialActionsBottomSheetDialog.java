package com.orion.notein.p607ui.creative_library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import o0OOOoO.C27187OooO00o;
import o0Oo0oOo.o00000O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/MaterialActionsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MaterialActionsBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C27187OooO00o f70974OooOoO0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.bottom_sheet_material_actions, viewGroup, false);
        int i = R.id.delete_icon;
        if (((ImageView) C24217OooO0O0.OooO0O0(R.id.delete_icon, viewInflate)) != null) {
            i = R.id.item_delete;
            ConstraintLayout constraintLayout = (ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.item_delete, viewInflate);
            if (constraintLayout != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                this.f70974OooOoO0 = new C27187OooO00o(linearLayoutCompat, constraintLayout);
                OooOOO0.OooO0o(linearLayoutCompat, "getRoot(...)");
                return linearLayoutCompat;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f70974OooOoO0 = null;
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C27187OooO00o c27187OooO00o = this.f70974OooOoO0;
        OooOOO0.OooO0Oo(c27187OooO00o);
        c27187OooO00o.f94910OooO00o.setOnClickListener(new o00000O0(this, 0));
    }
}

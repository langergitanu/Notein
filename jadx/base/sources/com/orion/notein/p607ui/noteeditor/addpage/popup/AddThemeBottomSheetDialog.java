package com.orion.notein.p607ui.noteeditor.addpage.popup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.ViewOnClickListenerC28701OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addpage/popup/AddThemeBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AddThemeBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ViewOnClickListenerC28701OooOOo0 f73972OooOoO0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_theme_actions, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC28701OooOOo0 viewOnClickListenerC28701OooOOo0 = this.f73972OooOoO0;
        List listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_import_from_gallery), Integer.valueOf(R.id.item_import_from_camera), Integer.valueOf(R.id.item_import_from_pdf));
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        Iterator it = listOooOO0o.iterator();
        while (it.hasNext()) {
            View viewFindViewById = view.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(viewOnClickListenerC28701OooOOo0);
            arrayList.add(viewFindViewById);
        }
    }
}

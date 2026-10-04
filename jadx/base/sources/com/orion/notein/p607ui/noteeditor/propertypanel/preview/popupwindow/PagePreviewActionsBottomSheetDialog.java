package com.orion.notein.p607ui.noteeditor.propertypanel.preview.popupwindow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o0o.ViewOnClickListenerC28239OooOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/preview/popupwindow/PagePreviewActionsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PagePreviewActionsBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ViewOnClickListenerC28239OooOOo f76131OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PagePreviewVO f76132OooOoO0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_page_preview_actions, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC28239OooOOo viewOnClickListenerC28239OooOOo = this.f76131OooOoO;
        List listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_add_outline), Integer.valueOf(R.id.item_add_comment), Integer.valueOf(R.id.item_copy), Integer.valueOf(R.id.item_delete), Integer.valueOf(R.id.item_export), Integer.valueOf(R.id.item_add_label));
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        Iterator it = listOooOO0o.iterator();
        while (it.hasNext()) {
            View viewFindViewById = view.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(viewOnClickListenerC28239OooOOo);
            arrayList.add(viewFindViewById);
        }
        PagePreviewVO pagePreviewVO = this.f76132OooOoO0;
        if (pagePreviewVO != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setTag(pagePreviewVO);
            }
        }
    }
}

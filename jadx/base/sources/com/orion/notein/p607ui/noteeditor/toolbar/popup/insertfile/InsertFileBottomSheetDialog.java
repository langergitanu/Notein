package com.orion.notein.p607ui.noteeditor.toolbar.popup.insertfile;

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
import o0o000oo.ViewOnClickListenerC29819OooOo;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbar/popup/insertfile/InsertFileBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class InsertFileBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ViewOnClickListenerC29819OooOo f76726OooOoO0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_insert_file, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC29819OooOo viewOnClickListenerC29819OooOo = this.f76726OooOoO0;
        List listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_image), Integer.valueOf(R.id.item_camera), Integer.valueOf(R.id.item_sticker), Integer.valueOf(R.id.item_audio));
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        Iterator it = listOooOO0o.iterator();
        while (it.hasNext()) {
            view.findViewById(((Number) it.next()).intValue()).setOnClickListener(viewOnClickListenerC29819OooOo);
            arrayList.add(C32460OooOooO.f116667OooO00o);
        }
    }
}

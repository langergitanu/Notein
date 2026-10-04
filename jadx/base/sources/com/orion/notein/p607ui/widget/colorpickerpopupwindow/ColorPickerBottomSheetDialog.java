package com.orion.notein.p607ui.widget.colorpickerpopupwindow;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0OoO0oO.C28679OooO0oo;
import o0oOoo0O.C31147OooO0Oo;
import oo0oO0.o00O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/widget/colorpickerpopupwindow/ColorPickerBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ColorPickerBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80135OooOoO = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C28679OooO0oo.OooO00o f80136OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00O f80137OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C31147OooO0Oo f80138OooOoo0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_color_picker, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        C31147OooO0Oo c31147OooO0Oo = new C31147OooO0Oo(view, C28038OooO0Oo.OooO00o(context).f116638OooOo0o.intValue(), false);
        c31147OooO0Oo.f111131OooO0OO = this.f80136OooOoO0;
        c31147OooO0Oo.OooO00o(this.f80135OooOoO);
        float[] fArr = new float[3];
        Color.colorToHSV(c31147OooO0Oo.f111137OooOO0, fArr);
        c31147OooO0Oo.f111134OooO0o0.setProgress((int) fArr[0]);
        this.f80138OooOoo0 = c31147OooO0Oo;
        o00O o00o2 = this.f80137OooOoOO;
        if (o00o2 != null) {
            o00o2.invoke(view);
        }
    }
}

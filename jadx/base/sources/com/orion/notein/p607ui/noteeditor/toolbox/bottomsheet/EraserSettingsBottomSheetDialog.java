package com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29931OooO0O0;
import o0o00oO0.C29993OooOOOo;
import o0oOoOo.C31056OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/bottomsheet/EraserSettingsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "Lo0o00o0/OooO0O0;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EraserSettingsBottomSheetDialog extends PhoneBottomSheetDialog implements InterfaceC29931OooO0O0 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29936OooO0oO f76802OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31056OooOoo f76803OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C29993OooOOOo f76804OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f76805OooOoo0 = DrawToolFactory.ERASER_TYPE_PIXEL;

    @Override // o0o00o0.InterfaceC29931OooO0O0
    public final void OooO00o() {
        C29993OooOOOo c29993OooOOOo = this.f76804OooOoOO;
        if (c29993OooOOOo != null) {
            c29993OooOOOo.OooO00o();
        }
    }

    @Override // o0o00o0.InterfaceC29931OooO0O0
    public final void OooO0Oo(boolean z, boolean z2) {
        C29993OooOOOo c29993OooOOOo = this.f76804OooOoOO;
        if (c29993OooOOOo != null) {
            c29993OooOOOo.OooO0Oo(z, z2);
        }
    }

    @Override // o0o00o0.InterfaceC29931OooO0O0
    public final void OooO0oo(String type) {
        OooOOO0.OooO0oO(type, "type");
        this.f76805OooOoo0 = type;
        C29993OooOOOo c29993OooOOOo = this.f76804OooOoOO;
        if (c29993OooOOOo != null) {
            c29993OooOOOo.OooO0OO(type);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_eraser_settings, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C29993OooOOOo c29993OooOOOo = new C29993OooOOOo(view);
        this.f76804OooOoOO = c29993OooOOOo;
        C31056OooOoo c31056OooOoo = this.f76803OooOoO0;
        c29993OooOOOo.f106559Oooo0 = this.f76802OooOoO;
        if (c31056OooOoo != null) {
            c29993OooOOOo.OooO0O0(c31056OooOoo);
        }
        C29993OooOOOo c29993OooOOOo2 = this.f76804OooOoOO;
        if (c29993OooOOOo2 != null) {
            c29993OooOOOo2.OooO0oo(this.f76805OooOoo0);
        }
    }
}

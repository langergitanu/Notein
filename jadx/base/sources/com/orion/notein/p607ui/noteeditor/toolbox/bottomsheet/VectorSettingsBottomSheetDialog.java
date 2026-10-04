package com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o00o0.C29936OooO0oO;
import o0o00o0.OooO;
import o0o00oO0.C30025OoooOoo;
import o0oOoOo.C31056OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/bottomsheet/VectorSettingsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "Lo0o00o0/OooO;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class VectorSettingsBottomSheetDialog extends PhoneBottomSheetDialog implements OooO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29936OooO0oO f76830OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31056OooOoo f76831OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30025OoooOoo f76832OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f76833OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f76834OooOoo0;

    @Override // o0o00o0.OooO
    public final void OooO(int i) {
        C30025OoooOoo c30025OoooOoo = this.f76832OooOoOO;
        if (c30025OoooOoo != null) {
            c30025OoooOoo.OooO0Oo(i);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C30025OoooOoo c30025OoooOoo = this.f76832OooOoOO;
        if (c30025OoooOoo != null) {
            c30025OoooOoo.OooO00o();
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        OooOOO0.OooO0oO(list, "list");
        C30025OoooOoo c30025OoooOoo = this.f76832OooOoOO;
        if (c30025OoooOoo != null) {
            c30025OoooOoo.OooO0O0(list);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidthVO) {
        C30025OoooOoo c30025OoooOoo = this.f76832OooOoOO;
        if (c30025OoooOoo != null) {
            c30025OoooOoo.OooOOOO(penWidthVO);
        }
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
        this.f76834OooOoo0 = z;
        C30025OoooOoo c30025OoooOoo = this.f76832OooOoOO;
        if (c30025OoooOoo != null) {
            c30025OoooOoo.OooOOOo(z);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOo00(boolean z) {
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
        this.f76833OooOoo = i;
        C30025OoooOoo c30025OoooOoo = this.f76832OooOoOO;
        if (c30025OoooOoo != null) {
            c30025OoooOoo.OooOo0o(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_vector_settings, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30025OoooOoo c30025OoooOoo = new C30025OoooOoo(view);
        this.f76832OooOoOO = c30025OoooOoo;
        C31056OooOoo c31056OooOoo = this.f76831OooOoO0;
        c30025OoooOoo.f106730Oooo00O = this.f76830OooOoO;
        if (c31056OooOoo != null) {
            c30025OoooOoo.OooO0OO(c31056OooOoo);
        }
        C30025OoooOoo c30025OoooOoo2 = this.f76832OooOoOO;
        if (c30025OoooOoo2 != null) {
            c30025OoooOoo2.OooOOOo(this.f76834OooOoo0);
        }
        C30025OoooOoo c30025OoooOoo3 = this.f76832OooOoOO;
        if (c30025OoooOoo3 != null) {
            c30025OoooOoo3.OooOo0o(this.f76833OooOoo);
        }
    }
}

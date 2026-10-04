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
import o0o00o0.InterfaceC29934OooO0o;
import o0o00oO0.C29997OooOo0;
import o0oOoOo.C31056OooOoo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/bottomsheet/HLGroupSettingsBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "Lo0o00o0/OooO0o;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class HLGroupSettingsBottomSheetDialog extends PhoneBottomSheetDialog implements InterfaceC29934OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29936OooO0oO f76806OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C31056OooOoo f76807OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C29997OooOo0 f76808OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f76809OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f76810OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f76811OooOooO;

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C29997OooOo0 c29997OooOo0 = this.f76808OooOoOO;
        if (c29997OooOo0 != null) {
            c29997OooOo0.OooO00o();
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        OooOOO0.OooO0oO(list, "list");
        C29997OooOo0 c29997OooOo0 = this.f76808OooOoOO;
        if (c29997OooOo0 != null) {
            c29997OooOo0.OooO0Oo(list);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidthVO) {
        C29997OooOo0 c29997OooOo0 = this.f76808OooOoOO;
        if (c29997OooOo0 != null) {
            c29997OooOo0.OooOOOO(penWidthVO);
        }
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
        this.f76809OooOoo = z;
        C29997OooOo0 c29997OooOo0 = this.f76808OooOoOO;
        if (c29997OooOo0 != null) {
            c29997OooOo0.OooOOOo(z);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOo00(boolean z) {
        this.f76810OooOoo0 = z;
        C29997OooOo0 c29997OooOo0 = this.f76808OooOoOO;
        if (c29997OooOo0 != null) {
            c29997OooOo0.OooOo00(z);
        }
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
        this.f76811OooOooO = i;
        C29997OooOo0 c29997OooOo0 = this.f76808OooOoOO;
        if (c29997OooOo0 != null) {
            c29997OooOo0.OooOo0o(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_hl_pen_settings, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C29997OooOo0 c29997OooOo0;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C29997OooOo0 c29997OooOo02 = new C29997OooOo0(view);
        this.f76808OooOoOO = c29997OooOo02;
        C31056OooOoo c31056OooOoo = this.f76807OooOoO0;
        c29997OooOo02.OooO0o(this.f76806OooOoO);
        if (c31056OooOoo != null && (c29997OooOo0 = this.f76808OooOoOO) != null) {
            c29997OooOo0.OooO0o0(c31056OooOoo);
        }
        C29997OooOo0 c29997OooOo03 = this.f76808OooOoOO;
        if (c29997OooOo03 != null) {
            c29997OooOo03.OooOo00(this.f76810OooOoo0);
        }
        C29997OooOo0 c29997OooOo04 = this.f76808OooOoOO;
        if (c29997OooOo04 != null) {
            c29997OooOo04.OooOOOo(this.f76809OooOoo);
        }
        C29997OooOo0 c29997OooOo05 = this.f76808OooOoOO;
        if (c29997OooOo05 != null) {
            c29997OooOo05.OooOo0o(this.f76811OooOooO);
        }
    }
}

package com.orion.notein.p607ui.notelist.fabbottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.ViewOnClickListenerC28318OooOOO0;
import o0OoO000.ViewOnClickListenerC28565Ooooo00;
import o0OoO000.ViewOnClickListenerC28566Ooooo0o;
import o0OoOOoO.ViewOnClickListenerC29188OooO0O0;
import o0OoOOoO.ViewOnClickListenerC29189OooO0OO;
import o0o00ooO.ViewOnClickListenerC30139OooO0O0;
import o0o00ooO.ViewOnClickListenerC30140OooO0OO;
import o0o0O00.C30207OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/fabbottomsheet/FabDocumentsFragment;", "Landroidx/fragment/app/Fragment;", "Lo0o0O00/OooOo$OooO0O0;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FabDocumentsFragment extends Fragment implements C30207OooOo.OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C30207OooOo.OooO00o f77466OooOo0o;

    @Override // o0o0O00.C30207OooOo.OooO0O0
    public final void OooOo0O(C30207OooOo.OooO00o oooO00o) {
        this.f77466OooOo0o = oooO00o;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_fab_documents, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.iv_back);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28318OooOOO0(viewFindViewById, 4));
        view.findViewById(R.id.cl_import_pdf).setOnClickListener(new ViewOnClickListenerC29188OooO0O0(this, 1));
        view.findViewById(R.id.cl_import_ppt).setOnClickListener(new ViewOnClickListenerC29189OooO0OO(this, 1));
        view.findViewById(R.id.cl_import_doc).setOnClickListener(new ViewOnClickListenerC30139OooO0O0(this, 0));
        view.findViewById(R.id.cl_import_xls).setOnClickListener(new ViewOnClickListenerC30140OooO0OO(this, 0));
        view.findViewById(R.id.cl_import_epub).setOnClickListener(new ViewOnClickListenerC28565Ooooo00(this, 4));
        view.findViewById(R.id.cl_import_caj).setOnClickListener(new ViewOnClickListenerC28566Ooooo0o(this, 1));
    }
}

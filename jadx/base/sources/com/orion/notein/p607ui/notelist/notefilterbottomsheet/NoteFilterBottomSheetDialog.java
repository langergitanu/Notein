package com.orion.notein.p607ui.notelist.notefilterbottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26047OoooO00;
import o0o0O00o.C30256OooO00o;
import o0oOoOo.C31049OooOo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/notefilterbottomsheet/NoteFilterBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteFilterBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C30256OooO00o f77822OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RecyclerView f77823OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super Integer, C32460OooOooO> f77824OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public List<C31049OooOo0> f77825OooOoo0 = C34434OooOoO.f123453OooOo0o;

    public final void OooOoO(List<C31049OooOo0> noteFilterVOs) {
        OooOOO0.OooO0oO(noteFilterVOs, "noteFilterVOs");
        this.f77825OooOoo0 = noteFilterVOs;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_note_filter, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f77823OooOoO0 = (RecyclerView) view.findViewById(R.id.rv_note_filter_list);
        C30256OooO00o c30256OooO00o = new C30256OooO00o(C30256OooO00o.C20056OooO00o.f107809OooO00o);
        c30256OooO00o.f107808OooO0O0 = new ViewOnClickListenerC26047OoooO00(this, 3);
        this.f77822OooOoO = c30256OooO00o;
        RecyclerView recyclerView = this.f77823OooOoO0;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvNoteFilter");
            throw null;
        }
        recyclerView.setAdapter(c30256OooO00o);
        C30256OooO00o c30256OooO00o2 = this.f77822OooOoO;
        if (c30256OooO00o2 != null) {
            c30256OooO00o2.OooO0Oo(this.f77825OooOoo0);
        } else {
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
    }
}

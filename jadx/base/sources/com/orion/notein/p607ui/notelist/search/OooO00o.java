package com.orion.notein.p607ui.notelist.search;

import androidx.appcompat.widget.SearchView;
import com.orion.notein.p607ui.notelist.search.NoteSearchView;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements SearchView.OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteSearchView f77984OooO00o;

    public OooO00o(NoteSearchView noteSearchView) {
        this.f77984OooO00o = noteSearchView;
    }

    @Override // androidx.appcompat.widget.SearchView.OooOOO0
    public final boolean OooO00o(String str) {
        NoteSearchView.OooO00o oooO00o = this.f77984OooO00o.f77983OooOoo0;
        if (oooO00o == null) {
            return false;
        }
        oooO00o.OooO00o(str);
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.OooOOO0
    public final boolean OooO0O0() {
        return false;
    }
}

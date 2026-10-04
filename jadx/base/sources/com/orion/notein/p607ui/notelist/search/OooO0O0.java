package com.orion.notein.p607ui.notelist.search;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.p607ui.notelist.search.NoteSearchView;
import o0o0O0o0.C30296OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements NoteSearchView.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SearchListContainerFragment f77985OooO00o;

    public OooO0O0(SearchListContainerFragment searchListContainerFragment) {
        this.f77985OooO00o = searchListContainerFragment;
    }

    @Override // com.orion.notein.ui.notelist.search.NoteSearchView.OooO00o
    public final void OooO00o(String str) {
        C30296OooO00o c30296OooO00oOooOoOO = this.f77985OooO00o.OooOoOO();
        c30296OooO00oOooOoOO.f107996OooOOO.OooO0Oo(String.valueOf(str));
    }

    @Override // com.orion.notein.ui.notelist.search.NoteSearchView.OooO00o
    public final void onDismiss() {
        C21030OooOO0o.OooO0OO(this.f77985OooO00o).OooOOo0();
    }
}

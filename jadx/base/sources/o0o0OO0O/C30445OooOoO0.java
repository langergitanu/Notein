package o0o0OO0O;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OO0O.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30445OooOoO0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108721OooO00o;

    public C30445OooOoO0(String str) {
        this.f108721OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30445OooOoO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108721OooO00o, ((C30445OooOoO0) obj).f108721OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_tiledPageEditorFragment_to_pageSaveAsDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("default_note_title", this.f108721OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f108721OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionTiledPageEditorFragmentToPageSaveAsDialogFragment(defaultNoteTitle="), this.f108721OooO00o, ")");
    }
}

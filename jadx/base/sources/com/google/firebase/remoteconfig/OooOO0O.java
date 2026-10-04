package com.google.firebase.remoteconfig;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.orion.notein.p607ui.export.C23110OooO0oo;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import o0Oo00o.C28026OooO0OO;
import o0o00oo.C30127Oooo00o;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOO0O implements SuccessContinuation, InterfaceC21912Oooo0o, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68642OooOo0o;

    public /* synthetic */ OooOO0O(Object obj) {
        this.f68642OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) this.f68642OooOo0o;
        if (zBooleanValue) {
            return;
        }
        String string = noteListContainerFragment.getString(com.orion.notein.global.R.string.request_permission_title_insert_image);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = noteListContainerFragment.getString(com.orion.notein.global.R.string.request_permission_content_insert_image);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), new C30127Oooo00o(string, string2));
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        String string = bundle.getString("key_bundle_for_text");
        if (string != null) {
            boolean zOooo0o0 = C33599OooOo0O.Oooo0o0(string);
            ExportDialogFragment exportDialogFragment = (ExportDialogFragment) this.f68642OooOo0o;
            if (!zOooo0o0) {
                exportDialogFragment.Oooo0o0().OooO0o(string);
                exportDialogFragment.Oooo0o0().OooO0o0(C23110OooO0oo.OooO00o.f71800OooOoOO);
                return;
            }
            com.orion.notein.p607ui.export.OooO0O0 Oooo0o02 = exportDialogFragment.Oooo0o0();
            String string2 = exportDialogFragment.getString(com.orion.notein.global.R.string.app_name);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            Oooo0o02.OooO0o(string2);
            exportDialogFragment.Oooo0o0().OooO0o0(C23110OooO0oo.OooO00o.f71799OooOoO0);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((FirebaseRemoteConfig) this.f68642OooOo0o).lambda$fetchAndActivate$1((Void) obj);
    }
}

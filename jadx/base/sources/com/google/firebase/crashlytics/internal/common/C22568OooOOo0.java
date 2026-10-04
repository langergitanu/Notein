package com.google.firebase.crashlytics.internal.common;

import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.p607ui.notelist.NoteListFragment;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22568OooOOo0 implements Continuation, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68016OooOo0o;

    public /* synthetic */ C22568OooOOo0(Object obj) {
        this.f68016OooOo0o = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        int i = bundle.getInt(C18437z2.f56754h);
        String string = bundle.getString("id");
        String str2 = string == null ? "" : string;
        String string2 = bundle.getString("new_name");
        String str3 = string2 == null ? "" : string2;
        NoteListFragment noteListFragment = (NoteListFragment) this.f68016OooOo0o;
        InterfaceC21987OooOoo viewLifecycleOwner = noteListFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new NoteListFragment.OooO0O0(str2, str3, noteListFragment, i, null), 3);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return Boolean.valueOf(((SessionReportingCoordinator) this.f68016OooOo0o).onReportSendComplete(task));
    }
}

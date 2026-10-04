package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C22328OooOO0o implements SynchronizationGuard.CriticalSection, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f67581OooOo0o;

    public /* synthetic */ C22328OooOO0o(Object obj) {
        this.f67581OooOo0o = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        if (bundle.getBoolean("result")) {
            Log.d("NoteListContainerFragment", "moveSuccess");
            ((NoteListContainerFragment) this.f67581OooOo0o).OooOoo().Oooo000(0);
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f67581OooOo0o).lambda$logAndUpdateState$6();
    }
}

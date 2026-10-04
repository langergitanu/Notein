package com.google.firebase.firestore.auth;

import Oooo0oO.C21030OooOO0o;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28783o000O000;
import o0OoO0oo.RunnableC28846o00O0o0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: com.google.firebase.firestore.auth.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22615OooO0Oo implements Deferred.DeferredHandler, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68123OooOo0o;

    public /* synthetic */ C22615OooO0Oo(Object obj) {
        this.f68123OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NoteEditorFragment noteEditorFragment = (NoteEditorFragment) this.f68123OooOo0o;
        if (zBooleanValue) {
            RunnableC28846o00O0o0o runnableC28846o00O0o0o = noteEditorFragment.f73039o00000O0;
            if (runnableC28846o00O0o0o != null) {
                runnableC28846o00O0o0o.run();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        } else {
            String string = noteEditorFragment.getString(R.string.request_permission_title_insert_image);
            OooOOO0.OooO0o(string, "getString(...)");
            String string2 = noteEditorFragment.getString(R.string.request_permission_content_insert_image);
            OooOOO0.OooO0o(string2, "getString(...)");
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorFragment), new C28783o000O000(string, string2));
            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
        }
        noteEditorFragment.f73039o00000O0 = null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((FirebaseAuthCredentialsProvider) this.f68123OooOo0o).lambda$new$1(provider);
    }
}

package com.google.firebase.firestore;

import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.o0OoOo0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import o0Ooo0oo.C29549o000Oo0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: com.google.firebase.firestore.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22584OooO0oo implements Continuation, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68063OooOo0o;

    public /* synthetic */ C22584OooO0oo(Object obj) {
        this.f68063OooOo0o = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        String string = bundle.getString("id", "");
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = bundle.getString("new_name", "");
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo000 = ((NoteEditorContainerFragment) this.f68063OooOo0o).Oooo000();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0O0Oooo000), null, null, new C29549o000Oo0(oooO0O0Oooo000, string, string2, null), 3);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((DocumentReference) this.f68063OooOo0o).lambda$get$4(task);
    }
}

package com.google.firebase.firestore;

import android.app.role.RoleManager;
import android.os.Build;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0OO implements Continuation, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68058OooOo0o;

    public /* synthetic */ OooO0OO(Object obj) {
        this.f68058OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        NoteListContainerFragment noteListContainerFragment;
        RoleManager roleManager;
        ActivityResult result = (ActivityResult) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        if (Build.VERSION.SDK_INT >= 34 && (roleManager = (noteListContainerFragment = (NoteListContainerFragment) this.f68058OooOo0o).f77342Oooo00O) != null) {
            if (roleManager.isRoleHeld("android.app.role.NOTES")) {
                Toast.makeText(noteListContainerFragment.getContext(), "Notes Role Granted!", 0).show();
            } else {
                Toast.makeText(noteListContainerFragment.getContext(), "Notes Role Not Granted", 0).show();
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return CollectionReference.lambda$add$0((DocumentReference) this.f68058OooOo0o, task);
    }
}

package com.google.firebase.crashlytics.internal.concurrency;

import androidx.activity.result.ActivityResult;
import androidx.lifecycle.o0OoOo0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29059OooOOOo;
import o0oOoOo.C31089Ooooooo;
import oO0o0OO.C33609OooO0oo;
import oO0oO0O.InterfaceC34008OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0O0 implements Continuation, OooO0o.OooO00o, InterfaceC34008OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68022OooOo0o;

    public /* synthetic */ OooO0O0(Object obj) {
        this.f68022OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        OooOOO0.OooO0oO(result, "result");
        if (result.f62240OooOo0o != -1) {
            ((LockNoteFragment) this.f68022OooOo0o).OooOoo0(R.string.must_set_device_screen_password);
        }
    }

    @Override // oO0oO0O.InterfaceC34008OooO0O0
    public void onVisibilityChanged(boolean z) {
        List<C31089Ooooooo> list = C29051OooOO0o.f102893OoooO0O;
        C29051OooOO0o c29051OooOO0o = (C29051OooOO0o) this.f68022OooOo0o;
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c29051OooOO0o), null, null, new C29059OooOOOo(c29051OooOO0o, z, null), 3);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return CrashlyticsWorker.lambda$submit$1((Runnable) this.f68022OooOo0o, task);
    }
}

package com.google.firebase.crashlytics.internal.concurrency;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.C28709OooOoO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0OO implements Continuation, OnApplyWindowInsetsListener, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68023OooOo0o;

    public /* synthetic */ OooO0OO(Object obj) {
        this.f68023OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        OooOOO0.OooO0oO(result, "result");
        LockNoteFragment lockNoteFragment = (LockNoteFragment) this.f68023OooOo0o;
        if (result.f62240OooOo0o == -1) {
            C28709OooOoO0 c28709OooOoO0 = lockNoteFragment.f72800Oooo000;
            if (c28709OooOoO0 != null) {
                c28709OooOoO0.invoke();
                return;
            }
            return;
        }
        oO0O000o.OooO00o<C32460OooOooO> oooO00o = lockNoteFragment.f72801Oooo00O;
        if (oooO00o != null) {
            oooO00o.invoke();
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return MainActivity.onCreate$lambda$5((MainActivity) this.f68023OooOo0o, view, windowInsetsCompat);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return CrashlyticsWorker.lambda$submit$0((Callable) this.f68023OooOo0o, task);
    }
}

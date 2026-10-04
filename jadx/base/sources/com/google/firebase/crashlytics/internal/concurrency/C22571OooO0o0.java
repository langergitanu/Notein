package com.google.firebase.crashlytics.internal.concurrency;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.OooOOO0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.concurrency.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22571OooO0o0 implements Continuation, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68025OooOo0o;

    public /* synthetic */ C22571OooO0o0(Object obj) {
        this.f68025OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        Uri data;
        ActivityResult result = (ActivityResult) obj;
        OooOOO0.OooO0oO(result, "result");
        Intent intent = result.f62239OooOo;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        LabelContainerFragment labelContainerFragment = (LabelContainerFragment) this.f68025OooOo0o;
        InterfaceC21987OooOoo viewLifecycleOwner = labelContainerFragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.notelist.label.OooO00o(labelContainerFragment, data, null), 3);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return CrashlyticsWorker.lambda$submitTask$2((Callable) this.f68025OooOo0o, task);
    }
}

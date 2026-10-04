package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.ink.authoring.InProgressShapesView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.concurrency.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22572OooO0oO implements Continuation, o000O.OooO0O0, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68026OooOo0o;

    public /* synthetic */ C22572OooO0oO(Object obj) {
        this.f68026OooOo0o = obj;
    }

    @Override // o000O.OooO0O0
    public void OooO00o(o000O.OooO00o oooO00o) {
        o000O.OooO0O0 oooO0O0 = ((InProgressShapesView) this.f68026OooOo0o).latencyDataCallback;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(oooO00o);
        }
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        OooOOO0.OooO0oO(bundle, "bundle");
        if (bundle.getBoolean("result")) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("LabelContainerFragment");
            c20358OooO00o.OooO00o("moveSuccess", new Object[0]);
            ((LabelContainerFragment) this.f68026OooOo0o).OooOoo().Oooo000(0);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return CrashlyticsWorker.lambda$submitTaskOnSuccess$4((Callable) this.f68026OooOo0o, task);
    }
}

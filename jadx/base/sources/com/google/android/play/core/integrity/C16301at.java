package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C16365ae;
import com.google.android.play.integrity.internal.InterfaceC16391bd;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.at */
/* JADX INFO: loaded from: classes7.dex */
final class C16301at {

    /* JADX INFO: renamed from: a */
    private final InterfaceC16391bd f51446a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC16391bd f51447b;

    public C16301at(InterfaceC16391bd interfaceC16391bd, InterfaceC16391bd interfaceC16391bd2) {
        this.f51446a = interfaceC16391bd;
        this.f51447b = interfaceC16391bd2;
    }

    /* JADX INFO: renamed from: a */
    public final BinderC16300as m74949a(Activity activity, TaskCompletionSource taskCompletionSource, C16365ae c16365ae) {
        Context context = (Context) this.f51446a.mo74933a();
        context.getClass();
        InterfaceC16339k interfaceC16339k = (InterfaceC16339k) this.f51447b.mo74933a();
        interfaceC16339k.getClass();
        activity.getClass();
        c16365ae.getClass();
        return new BinderC16300as(context, interfaceC16339k, activity, taskCompletionSource, c16365ae);
    }
}

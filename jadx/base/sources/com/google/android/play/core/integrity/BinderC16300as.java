package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.AbstractBinderC16406q;
import com.google.android.play.integrity.internal.C16365ae;
import com.google.android.play.integrity.internal.C16408s;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.as */
/* JADX INFO: loaded from: classes7.dex */
final class BinderC16300as extends AbstractBinderC16406q {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f51440a;

    /* JADX INFO: renamed from: b */
    final C16365ae f51441b;

    /* JADX INFO: renamed from: c */
    private final C16408s f51442c = new C16408s("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d */
    private final String f51443d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC16339k f51444e;

    /* JADX INFO: renamed from: f */
    private final Activity f51445f;

    public BinderC16300as(Context context, InterfaceC16339k interfaceC16339k, Activity activity, TaskCompletionSource taskCompletionSource, C16365ae c16365ae) {
        this.f51443d = context.getPackageName();
        this.f51444e = interfaceC16339k;
        this.f51440a = taskCompletionSource;
        this.f51445f = activity;
        this.f51441b = c16365ae;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16407r
    /* JADX INFO: renamed from: b */
    public final void mo74948b(Bundle bundle) {
        this.f51441b.m75014v(this.f51440a);
        this.f51442c.m75061d("onRequestDialog(%s)", this.f51443d);
        ApiException apiExceptionMo74978a = this.f51444e.mo74978a(bundle);
        if (apiExceptionMo74978a != null) {
            this.f51440a.trySetException(apiExceptionMo74978a);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f51442c.m75059b("onRequestDialog(%s): got null dialog intent", this.f51443d);
            this.f51440a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f51445f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ResultReceiverC16299ar(this, this.f51441b.m75010c()));
        this.f51442c.m75058a("Starting dialog intent...", new Object[0]);
        this.f51445f.startActivityForResult(intent, 0);
    }
}

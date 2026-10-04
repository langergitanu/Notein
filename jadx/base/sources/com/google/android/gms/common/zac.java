package com.google.android.gms.common;

import OooO0o.OooO0O0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes7.dex */
final class zac implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ OooO0O0 zac;
    final /* synthetic */ GoogleApiAvailability zad;

    public zac(GoogleApiAvailability googleApiAvailability, Activity activity, int i, OooO0O0 oooO0O0) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = i;
        this.zac = oooO0O0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        IntentSender intentSender = errorResolutionPendingIntent.getIntentSender();
        OooOOO0.OooO0oO(intentSender, "intentSender");
        this.zac.OooO00o(new IntentSenderRequest(intentSender, null, 0, 0));
    }
}

package OooO0oO;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OooO0oO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20430OooO extends AbstractC20431OooO00o<IntentSenderRequest, ActivityResult> {
    @Override // OooO0oO.AbstractC20431OooO00o
    public final Intent OooO00o(Context context, IntentSenderRequest intentSenderRequest) {
        IntentSenderRequest input = intentSenderRequest;
        OooOOO0.OooO0oO(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        OooOOO0.OooO0o(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final ActivityResult OooO0OO(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}

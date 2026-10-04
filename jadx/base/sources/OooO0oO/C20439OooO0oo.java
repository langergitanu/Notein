package OooO0oO;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OooO0oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20439OooO0oo extends AbstractC20431OooO00o<Intent, ActivityResult> {
    @Override // OooO0oO.AbstractC20431OooO00o
    public final Intent OooO00o(Context context, Intent intent) {
        Intent input = intent;
        OooOOO0.OooO0oO(input, "input");
        return input;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final ActivityResult OooO0OO(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}

package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aq */
/* JADX INFO: loaded from: classes7.dex */
final class C16298aq extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a */
    private final String f51437a;

    /* JADX INFO: renamed from: b */
    private final AbstractC16355y f51438b;

    public C16298aq(String str, AbstractC16355y abstractC16355y) {
        this.f51437a = str;
        this.f51438b = abstractC16355y;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i) {
        return this.f51438b.m74987a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f51437a;
    }
}

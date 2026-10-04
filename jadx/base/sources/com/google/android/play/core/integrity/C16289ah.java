package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ah */
/* JADX INFO: loaded from: classes7.dex */
final class C16289ah extends AbstractC16355y {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC16290ai f51418a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16289ah(BinderC16290ai binderC16290ai, String str, long j) {
        super(str, j);
        this.f51418a = binderC16290ai;
    }

    @Override // com.google.android.play.core.integrity.AbstractC16355y
    /* JADX INFO: renamed from: b */
    public final Task mo74938b(Activity activity, Bundle bundle) {
        return this.f51418a.f51419a.m74945b(activity, bundle);
    }
}

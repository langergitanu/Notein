package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bj */
/* JADX INFO: loaded from: classes7.dex */
final class C16318bj extends AbstractC16355y {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC16319bk f51477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16318bj(BinderC16319bk binderC16319bk, String str, long j) {
        super(str, j);
        this.f51477a = binderC16319bk;
    }

    @Override // com.google.android.play.core.integrity.AbstractC16355y
    /* JADX INFO: renamed from: b */
    public final Task mo74938b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f51477a.f51480e);
        return this.f51477a.f51478c.m74973c(activity, bundle);
    }
}

package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC16409t;
import com.google.android.play.integrity.internal.C16369ai;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.be */
/* JADX INFO: loaded from: classes7.dex */
final class C16313be extends AbstractRunnableC16409t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f51460a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C16322bn f51461b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16313be(C16322bn c16322bn, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f51460a = context;
        this.f51461b = c16322bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        this.f51461b.f51487d.trySetResult(Integer.valueOf(C16369ai.m75017a(this.f51460a)));
    }
}

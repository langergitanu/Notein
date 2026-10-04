package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC16409t;
import com.google.android.play.integrity.internal.C16366af;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bm */
/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractC16321bm extends AbstractRunnableC16409t {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C16322bn f51483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC16321bm(C16322bn c16322bn, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f51483f = c16322bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: a */
    public final void mo74936a(Exception exc) {
        if (!(exc instanceof C16366af)) {
            super.mo74936a(exc);
        } else if (C16322bn.m74972l(this.f51483f)) {
            super.mo74936a(new StandardIntegrityException(-2, exc));
        } else {
            super.mo74936a(new StandardIntegrityException(-9, exc));
        }
    }
}

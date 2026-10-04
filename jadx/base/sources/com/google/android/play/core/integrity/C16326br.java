package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.br */
/* JADX INFO: loaded from: classes7.dex */
final class C16326br extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a */
    private final String f51494a;

    /* JADX INFO: renamed from: b */
    private final AbstractC16355y f51495b;

    public C16326br(String str, AbstractC16355y abstractC16355y) {
        this.f51494a = str;
        this.f51495b = abstractC16355y;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i) {
        return this.f51495b.m74987a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f51494a;
    }
}

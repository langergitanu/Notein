package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return C16356z.m74988a(context).m74985a();
    }

    public static StandardIntegrityManager createStandard(Context context) {
        return C16305ax.m74953a(context).mo74952a();
    }
}

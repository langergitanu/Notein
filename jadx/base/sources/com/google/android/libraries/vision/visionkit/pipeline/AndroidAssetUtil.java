package com.google.android.libraries.vision.visionkit.pipeline;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class AndroidAssetUtil {
    private static native boolean nativeInitializeAssetManager(Context context, String str);

    public static synchronized boolean zba(Context context) {
        return nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
    }
}

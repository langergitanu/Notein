package com.google.android.material.color;

import android.content.Context;
import android.os.Build;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface ColorResourcesOverride {
    static ColorResourcesOverride getInstance() {
        int i = Build.VERSION.SDK_INT;
        if ((30 > i || i > 33) && i < 34) {
            return null;
        }
        return ResourcesLoaderColorResourcesOverride.getInstance();
    }

    boolean applyIfPossible(Context context, Map<Integer, Integer> map);

    Context wrapContextIfPossible(Context context, Map<Integer, Integer> map);
}

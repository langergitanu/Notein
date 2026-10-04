package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTaskInput;

/* JADX INFO: loaded from: classes8.dex */
public abstract class MLTask<T, S extends MLTaskInput> extends ModelResource {
    public MLTask() {
    }

    public abstract T run(S s) throws MlKitException;

    public MLTask(TaskQueue taskQueue) {
        super(taskQueue);
    }
}

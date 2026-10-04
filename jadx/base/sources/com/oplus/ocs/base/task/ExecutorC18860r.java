package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.r */
/* JADX INFO: loaded from: classes9.dex */
public final class ExecutorC18860r implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C18864d.m80553a(runnable);
        runnable.run();
    }
}

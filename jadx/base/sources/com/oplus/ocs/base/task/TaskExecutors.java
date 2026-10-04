package com.oplus.ocs.base.task;

import android.os.Handler;
import android.os.Looper;
import com.oplus.ocs.base.utils.C18864d;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public class TaskExecutors {
    public static final Executor MAIN_THREAD = new MainExecutor();
    public static final Executor CURRENT_THREAD = new ExecutorC18860r();

    public static class MainExecutor implements Executor {

        /* JADX INFO: renamed from: a */
        private Handler f57554a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C18864d.m80553a(runnable);
            this.f57554a.post(runnable);
        }
    }

    private TaskExecutors() {
    }
}

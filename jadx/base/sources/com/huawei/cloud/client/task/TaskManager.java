package com.huawei.cloud.client.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public class TaskManager {

    /* JADX INFO: renamed from: a */
    private static final TaskManager f52321a = new TaskManager();

    /* JADX INFO: renamed from: b */
    private ExecutorService f52322b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c */
    private ExecutorService f52323c = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: d */
    private ExecutorService f52324d = Executors.newSingleThreadExecutor();

    public static TaskManager getInstance() {
        return f52321a;
    }

    public void createTask(Task task) {
        task.setFuture(this.f52323c.submit(task));
    }

    public void execute(Task task) {
        task.setFuture(this.f52322b.submit(task));
    }

    public void report(Task task) {
        task.setFuture(this.f52324d.submit(task));
    }
}

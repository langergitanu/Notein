package com.huawei.hms.drive;

/* JADX INFO: renamed from: com.huawei.hms.drive.bo */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractRunnableC17805bo implements Runnable {

    /* JADX INFO: renamed from: c */
    protected final String f52953c;

    public AbstractRunnableC17805bo(String str, Object... objArr) {
        this.f52953c = C17806bp.m76330a(str, objArr);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo76260f();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f52953c);
        try {
            mo76260f();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}

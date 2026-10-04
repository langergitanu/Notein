package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o8 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractRunnableC18300o8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f55838a;

    public AbstractRunnableC18300o8(String str, Object... objArr) {
        this.f55838a = C18313p8.m79366a(str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo78220b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f55838a);
        try {
            mo78220b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}

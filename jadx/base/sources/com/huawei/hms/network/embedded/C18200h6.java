package com.huawei.hms.network.embedded;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18200h6 {

    /* JADX INFO: renamed from: a */
    public final Lock f55031a;

    /* JADX INFO: renamed from: b */
    public final Condition f55032b;

    /* JADX INFO: renamed from: c */
    public final Condition f55033c;

    /* JADX INFO: renamed from: d */
    public final Object[] f55034d;

    /* JADX INFO: renamed from: e */
    public int f55035e;

    /* JADX INFO: renamed from: f */
    public int f55036f;

    /* JADX INFO: renamed from: g */
    public int f55037g;

    public C18200h6() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f55031a = reentrantLock;
        this.f55032b = reentrantLock.newCondition();
        this.f55033c = reentrantLock.newCondition();
        this.f55034d = new Object[1];
    }

    public void put(Object obj) throws InterruptedException {
        int i;
        Object[] objArr;
        this.f55031a.lock();
        while (true) {
            try {
                i = this.f55037g;
                objArr = this.f55034d;
                if (i != objArr.length) {
                    break;
                } else {
                    this.f55032b.await();
                }
            } catch (Throwable th) {
                this.f55031a.unlock();
                throw th;
            }
        }
        int i2 = this.f55035e;
        objArr[i2] = obj;
        int i3 = i2 + 1;
        this.f55035e = i3;
        if (i3 == objArr.length) {
            this.f55035e = 0;
        }
        this.f55037g = i + 1;
        this.f55033c.signal();
        this.f55031a.unlock();
    }

    public Object take() throws InterruptedException {
        int i;
        this.f55031a.lock();
        while (true) {
            try {
                i = this.f55037g;
                if (i != 0) {
                    break;
                }
                this.f55033c.await();
            } catch (Throwable th) {
                this.f55031a.unlock();
                throw th;
            }
        }
        Object[] objArr = this.f55034d;
        int i2 = this.f55036f;
        Object obj = objArr[i2];
        int i3 = i2 + 1;
        this.f55036f = i3;
        if (i3 == objArr.length) {
            this.f55036f = 0;
        }
        this.f55037g = i - 1;
        this.f55032b.signal();
        this.f55031a.unlock();
        return obj;
    }
}

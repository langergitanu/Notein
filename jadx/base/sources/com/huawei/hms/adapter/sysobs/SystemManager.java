package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SystemManager {

    /* JADX INFO: renamed from: a */
    public static SystemManager f52381a = new SystemManager();

    /* JADX INFO: renamed from: b */
    public static final Object f52382b = new Object();

    /* JADX INFO: renamed from: c */
    public static SystemNotifier f52383c = new C17712a();

    public static SystemManager getInstance() {
        return f52381a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f52383c;
    }

    public void notifyNoticeResult(int i) {
        f52383c.notifyNoticeObservers(i);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f52383c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i) {
        f52383c.notifyObservers(i);
    }

    /* JADX INFO: renamed from: com.huawei.hms.adapter.sysobs.SystemManager$a */
    public static class C17712a implements SystemNotifier {

        /* JADX INFO: renamed from: a */
        public final List<SystemObserver> f52384a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i) {
            synchronized (SystemManager.f52382b) {
                try {
                    Iterator<SystemObserver> it = this.f52384a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onNoticeResult(i)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f52382b) {
                try {
                    Iterator<SystemObserver> it = this.f52384a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onSolutionResult(intent, str)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.f52384a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.f52382b) {
                this.f52384a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f52382b) {
                this.f52384a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i) {
            synchronized (SystemManager.f52382b) {
                try {
                    Iterator<SystemObserver> it = this.f52384a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onUpdateResult(i)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

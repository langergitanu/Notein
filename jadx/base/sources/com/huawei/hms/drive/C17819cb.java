package com.huawei.hms.drive;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.drive.cb */
/* JADX INFO: loaded from: classes6.dex */
public final class C17819cb {

    /* JADX INFO: renamed from: a */
    private final Set<C17802bl> f53073a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public synchronized void m76427a(C17802bl c17802bl) {
        this.f53073a.add(c17802bl);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m76428b(C17802bl c17802bl) {
        this.f53073a.remove(c17802bl);
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m76429c(C17802bl c17802bl) {
        return this.f53073a.contains(c17802bl);
    }
}

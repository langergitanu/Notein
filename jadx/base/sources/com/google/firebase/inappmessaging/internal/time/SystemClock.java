package com.google.firebase.inappmessaging.internal.time;

/* JADX INFO: loaded from: classes8.dex */
public class SystemClock implements Clock {
    @Override // com.google.firebase.inappmessaging.internal.time.Clock
    public long now() {
        return System.currentTimeMillis();
    }
}

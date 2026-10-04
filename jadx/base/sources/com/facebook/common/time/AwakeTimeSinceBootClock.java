package com.facebook.common.time;

import o00o0oOO.InterfaceC25456OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public class AwakeTimeSinceBootClock implements InterfaceC25456OooO0O0 {
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // o00o0oOO.InterfaceC25456OooO0O0, o00o0oOO.InterfaceC25455OooO00o
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // o00o0oOO.InterfaceC25456OooO0O0, o00o0oOO.InterfaceC25455OooO00o
    public long nowNanos() {
        return System.nanoTime();
    }
}

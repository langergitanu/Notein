package oO0oO0OO;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: oO0oO0OO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ThreadFactoryC34011OooO0O0 implements ThreadFactory {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f122309OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f122310OooOo0o;

    public /* synthetic */ ThreadFactoryC34011OooO0O0(String str, boolean z) {
        this.f122310OooOo0o = str;
        this.f122309OooOo = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte[] bArr = Util.f124301OooO00o;
        String name = this.f122310OooOo0o;
        OooOOO0.OooO0oO(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f122309OooOo);
        return thread;
    }
}

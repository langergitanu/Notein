package o0ooo0;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: o0ooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31707OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113244OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113245OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f113246OooO0OO;

    public C31707OooO0O0(String str, String str2, int i) {
        this.f113244OooO00o = str;
        this.f113245OooO0O0 = str2;
        this.f113246OooO0OO = i;
    }

    public final String toString() {
        return this.f113244OooO00o + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + this.f113245OooO0O0 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + this.f113246OooO0OO;
    }
}

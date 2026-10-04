package o00ooO0;

import com.huawei.hms.network.embedded.C18163eb;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f87825OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f87826OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile C25739OooO0oo f87827OooO0OO;

    static {
        new OooO();
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        f87825OooO00o = ((long) iMin) > C18163eb.f54662y ? (iMin / 4) * 3 : iMin / 2;
        f87826OooO0O0 = 384;
    }
}

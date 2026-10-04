package o0oooOo;

import java.io.File;

/* JADX INFO: renamed from: o0oooOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31854OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f113533OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f113534OooO0O0;

    static {
        boolean zExists = new File("/data/system/oauth_staging_preview").exists();
        f113533OooO00o = zExists ? "http://account.preview.n.xiaomi.net" : "https://account.xiaomi.com";
        f113534OooO0O0 = zExists ? "http://open.account.preview.n.xiaomi.net" : "https://open.account.xiaomi.com";
    }
}

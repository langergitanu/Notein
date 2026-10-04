package o00oo0O0;

import java.util.concurrent.TimeUnit;
import o00o0Ooo.InterfaceC25423OooO;

/* JADX INFO: renamed from: o00oo0O0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25669OooOOO0 implements InterfaceC25423OooO<C25677OooOo00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f87607OooO00o = TimeUnit.MINUTES.toMillis(5);

    @Override // o00o0Ooo.InterfaceC25423OooO
    public final C25677OooOo00 get() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = iMin < 16777216 ? 1048576 : iMin < 33554432 ? 2097152 : 4194304;
        return new C25677OooOo00(i, Integer.MAX_VALUE, i, i / 8, f87607OooO00o);
    }
}

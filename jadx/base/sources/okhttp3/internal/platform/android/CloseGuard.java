package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class CloseGuard {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Companion f124703OooO0Oo = new Companion(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f124704OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Method f124705OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Method f124706OooO0OO;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.f124704OooO00o = method;
        this.f124705OooO0O0 = method2;
        this.f124706OooO0OO = method3;
    }
}

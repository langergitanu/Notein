package o0O0O0oo;

import com.lzf.easyfloat.data.FloatConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0O0O0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25876OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FloatConfig f88305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C25875OooO0O0 f88306OooO0O0;

    public C25876OooO0Oo(FloatConfig floatConfig, C25875OooO0O0 c25875OooO0O0) {
        this.f88305OooO00o = floatConfig;
        this.f88306OooO0O0 = c25875OooO0O0;
    }

    public final void OooO00o(boolean z) {
        if (z) {
            ConcurrentHashMap<String, C25875OooO0O0> concurrentHashMap = C25877OooO0o0.f88312OooO00o;
            ConcurrentHashMap<String, C25875OooO0O0> concurrentHashMap2 = C25877OooO0o0.f88312OooO00o;
            String floatTag = this.f88305OooO00o.getFloatTag();
            OooOOO0.OooO0Oo(floatTag);
            concurrentHashMap2.put(floatTag, this.f88306OooO0O0);
        }
    }
}

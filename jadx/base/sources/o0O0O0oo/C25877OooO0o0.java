package o0O0O0oo;

import com.lzf.easyfloat.data.FloatConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0O0O0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25877OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ConcurrentHashMap<String, C25875OooO0O0> f88312OooO00o = new ConcurrentHashMap<>();

    public static C32460OooOooO OooO00o(String str) {
        ConcurrentHashMap<String, C25875OooO0O0> concurrentHashMap = f88312OooO00o;
        C25875OooO0O0 c25875OooO0O0OooO0O0 = OooO0O0(str);
        if (c25875OooO0O0OooO0O0 == null) {
            return null;
        }
        FloatConfig floatConfig = c25875OooO0O0OooO0O0.f88293OooO0O0;
        try {
            floatConfig.setAnim(false);
            String floatTag = floatConfig.getFloatTag();
            if (floatTag == null) {
                floatTag = "default";
            }
            concurrentHashMap.remove(floatTag);
            c25875OooO0O0OooO0O0.OooO0Oo().removeViewImmediate(c25875OooO0O0OooO0O0.f88297OooO0o0);
        } catch (Exception e) {
            String msg = OooOOO0.OooOOO0(e, "浮窗关闭出现异常：");
            OooOOO0.OooO0oO(msg, "msg");
            OooOOO0.OooO0oO(msg.toString(), "msg");
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public static C25875OooO0O0 OooO0O0(String str) {
        ConcurrentHashMap<String, C25875OooO0O0> concurrentHashMap = f88312OooO00o;
        if (str == null) {
            str = "default";
        }
        return concurrentHashMap.get(str);
    }
}

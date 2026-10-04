package o00OOOO;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f84877OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Class<?> f84878OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Method f84879OooO0OO;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f84878OooO0O0 = cls;
            f84877OooO00o = cls.newInstance();
            cls.getMethod("getUDID", Context.class);
            f84879OooO0OO = cls.getMethod("getOAID", Context.class);
            cls.getMethod("getVAID", Context.class);
            cls.getMethod("getAAID", Context.class);
        } catch (Exception e) {
            Log.e("IdentifierManager", "reflect exception!", e);
        }
    }
}

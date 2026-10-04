package o00O00Oo;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import o0000Ooo.C24239OooOOO0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: o00O00Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24803OooO0O0 {

    /* JADX INFO: renamed from: o00O00Oo.OooO0O0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final InterfaceC24804OooO0OO f84119OooO00o;

        static {
            InterfaceC24804OooO0OO c24239OooOOO0;
            try {
                InvocationHandler invocationHandlerOooO00o = C24803OooO0O0.OooO00o();
                c24239OooOOO0 = new C24805OooO0Oo((WebViewProviderFactoryBoundaryInterface) (invocationHandlerOooO00o == null ? null : WebViewProviderFactoryBoundaryInterface.class.cast(Proxy.newProxyInstance(oOO00O0.OooO00o.class.getClassLoader(), new Class[]{WebViewProviderFactoryBoundaryInterface.class}, invocationHandlerOooO00o))));
            } catch (ClassNotFoundException unused) {
                c24239OooOOO0 = new C24239OooOOO0();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            f84119OooO00o = c24239OooOOO0;
        }
    }

    public static InvocationHandler OooO00o() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }
}

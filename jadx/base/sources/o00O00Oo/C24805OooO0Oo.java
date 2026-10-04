package o00O00Oo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: o00O00Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24805OooO0Oo implements InterfaceC24804OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f84120OooO00o;

    public C24805OooO0Oo(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f84120OooO00o = webViewProviderFactoryBoundaryInterface;
    }

    @Override // o00O00Oo.InterfaceC24804OooO0OO
    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        InvocationHandler dropDataProvider = this.f84120OooO00o.getDropDataProvider();
        return (DropDataContentProviderBoundaryInterface) (dropDataProvider == null ? null : DropDataContentProviderBoundaryInterface.class.cast(Proxy.newProxyInstance(oOO00O0.OooO00o.class.getClassLoader(), new Class[]{DropDataContentProviderBoundaryInterface.class}, dropDataProvider)));
    }
}

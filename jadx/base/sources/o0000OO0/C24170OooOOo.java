package o0000OO0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o0000OO0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24170OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f81437OooO00o;

    public C24170OooOOo(Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.f81437OooO00o = context;
    }

    public static InterfaceC24171OooOOo0 OooO00o(C24170OooOOo c24170OooOOo) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C24186Oooo0O0 c24186Oooo0O0 = new C24186Oooo0O0(c24170OooOOo.f81437OooO00o);
            C24186Oooo0O0 c24186Oooo0O02 = c24186Oooo0O0.isAvailableOnDevice() ? c24186Oooo0O0 : null;
            return c24186Oooo0O02 == null ? c24170OooOOo.OooO0O0() : c24186Oooo0O02;
        }
        if (i <= 33) {
            return c24170OooOOo.OooO0O0();
        }
        return null;
    }

    public final InterfaceC24171OooOOo0 OooO0O0() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f81437OooO00o;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(arrayList);
        if (listO0ooOO0.isEmpty()) {
            return null;
        }
        Iterator it = listO0ooOO0.iterator();
        InterfaceC24171OooOOo0 interfaceC24171OooOOo0 = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.OooOOO0.OooO0o0(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC24171OooOOo0 interfaceC24171OooOOo02 = (InterfaceC24171OooOOo0) objNewInstance;
                if (!interfaceC24171OooOOo02.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC24171OooOOo0 != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    interfaceC24171OooOOo0 = interfaceC24171OooOOo02;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC24171OooOOo0;
    }
}

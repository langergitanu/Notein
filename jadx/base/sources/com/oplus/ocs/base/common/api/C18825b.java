package com.oplus.ocs.base.common.api;

import android.content.Context;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.utils.ServiceCheck;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.b */
/* JADX INFO: loaded from: classes9.dex */
public class C18825b {

    /* JADX INFO: renamed from: a */
    private static volatile C18825b f57497a;

    private C18825b() {
    }

    /* JADX INFO: renamed from: a */
    public static C18825b m80493a() {
        if (f57497a == null) {
            synchronized (C18825b.class) {
                try {
                    if (f57497a == null) {
                        f57497a = new C18825b();
                    }
                } finally {
                }
            }
        }
        return f57497a;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18828e m80495a(Context context, String str, HandlerC18826c handlerC18826c, InterfaceC18834k interfaceC18834k) {
        if (ServiceCheck.check(context, "com.oplus.ocs")) {
            return new C18830g(context, str, handlerC18826c, interfaceC18834k);
        }
        if (ServiceCheck.check(context, "com.coloros.ocs.opencapabilityservice")) {
            return new C18824a(context, str, handlerC18826c, interfaceC18834k);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18828e m80494a(Context context, InternalClient internalClient, IAuthenticationListener iAuthenticationListener) {
        if (ServiceCheck.check(context, "com.oplus.ocs")) {
            return new C18831h(context, internalClient, iAuthenticationListener);
        }
        if (ServiceCheck.check(context, "com.coloros.ocs.opencapabilityservice")) {
            return new C18829f(context, internalClient, iAuthenticationListener);
        }
        return null;
    }
}

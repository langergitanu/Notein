package com.orion.ni_render_engine.impl.ink;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.ni_render_engine.impl.ink.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22841OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f69451OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f69452OooO0O0 = new Object();

    public static void OooO00o(OooO0o oooO0o) {
        synchronized (f69452OooO0O0) {
            try {
                ArrayList arrayList = f69451OooO00o;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (OooOOO0.OooO0O0((OooO0o) it.next(), oooO0o)) {
                            break;
                        }
                    }
                }
                f69451OooO00o.add(oooO0o);
                C34406OooO00o.f123390OooO00o.OooO00o("注册 PDF 矢量渲染器: " + C24035Oooo00o.f80943OooO00o.OooO0O0(oooO0o.getClass()).OooOO0(), new Object[0]);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

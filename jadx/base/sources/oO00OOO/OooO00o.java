package oO00OOO;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<OooOO0> f115709OooO00o;

    static {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(OooOO0.class, OooOO0.class.getClassLoader());
        OooOOO0.OooO0o(serviceLoaderLoad, "load(it, it.classLoader)");
        f115709OooO00o = OooOo.o0ooOO0(serviceLoaderLoad);
    }
}

package oO0O0O0o;

import OooOoOO.C20519OooO0Oo;
import java.util.ServiceLoader;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.Oooo0;
import oO0Ooo0.C33361OooO0Oo;
import oOo000Oo.OooOo;
import ooOOOoOo.InterfaceC35101OooO00o;
import ooOOOoOo.InterfaceC35103OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public interface OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20247OooO00o f117097OooO00o = C20247OooO00o.f117098OooO00o;

    /* JADX INFO: renamed from: oO0O0O0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20247OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ C20247OooO00o f117098OooO00o = new C20247OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Object f117099OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, C20248OooO00o.f117100OooOo0o);

        /* JADX INFO: renamed from: oO0O0O0o.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20248OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooO00o> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final C20248OooO00o f117100OooOo0o = new C20248OooO00o(0);

            @Override // oO0O000o.OooO00o
            public final OooO00o invoke() {
                ServiceLoader implementations = ServiceLoader.load(OooO00o.class, OooO00o.class.getClassLoader());
                kotlin.jvm.internal.OooOOO0.OooO0o(implementations, "implementations");
                OooO00o oooO00o = (OooO00o) OooOo.Oooo0oo(implementations);
                if (oooO00o != null) {
                    return oooO00o;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }
    }

    Oooo0 OooO00o(C33361OooO0Oo c33361OooO0Oo, InterfaceC32615OooOoo interfaceC32615OooOoo, Iterable iterable, InterfaceC35103OooO0OO interfaceC35103OooO0OO, InterfaceC35101OooO00o interfaceC35101OooO00o, boolean z);
}

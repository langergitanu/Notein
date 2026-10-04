package o00O00oO;

import OooOoOO.C20519OooO0Oo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.C24035Oooo00o;
import o00O0.C24796OooO0Oo;
import o00O00o.C24809OooO0o0;
import oO00ooO.C32447OooOOo;
import oo00o.InterfaceC34660OooO00o;

/* JADX INFO: renamed from: o00O00oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC24820OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f84174OooO00o = OooO00o.f84175OooO00o;

    /* JADX INFO: renamed from: o00O00oO.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f84175OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C32447OooOOo f84176OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C24814OooO0O0 f84177OooO0OO;

        /* JADX INFO: renamed from: o00O00oO.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19654OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC34660OooO00o> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final C19654OooO00o f84178OooOo0o = new C19654OooO00o(0);

            @Override // oO0O000o.OooO00o
            public final InterfaceC34660OooO00o invoke() {
                WindowLayoutComponent windowLayoutComponentOooO00o;
                try {
                    ClassLoader loader = InterfaceC24820OooO0oo.class.getClassLoader();
                    C24819OooO0oO c24819OooO0oO = loader != null ? new C24819OooO0oO(loader, new o00O00o.OooO0OO(loader)) : null;
                    if (c24819OooO0oO != null && (windowLayoutComponentOooO00o = c24819OooO0oO.OooO00o()) != null) {
                        kotlin.jvm.internal.OooOOO0.OooO0o(loader, "loader");
                        o00O00o.OooO0OO oooO0OO = new o00O00o.OooO0OO(loader);
                        C24809OooO0o0.f84145OooO00o.getClass();
                        int iOooO00o = C24809OooO0o0.OooO00o();
                        return iOooO00o >= 2 ? new C24796OooO0Oo(windowLayoutComponentOooO00o) : iOooO00o == 1 ? new o00O0.OooO0OO(windowLayoutComponentOooO00o, oooO0OO) : new o00O0.OooO00o();
                    }
                } catch (Throwable unused) {
                    OooO00o oooO00o = OooO00o.f84175OooO00o;
                }
                return null;
            }
        }

        static {
            C24035Oooo00o.f80943OooO00o.OooO0O0(InterfaceC24820OooO0oo.class).OooOO0();
            f84176OooO0O0 = C20519OooO0Oo.OooO0OO(C19654OooO00o.f84178OooOo0o);
            f84177OooO0OO = C24814OooO0O0.f84156OooO00o;
        }
    }
}

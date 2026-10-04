package oO0o0OO;

import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0Ooo.C33841OooOo0O;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: oO0o0OO.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33641Oooo0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InterfaceC33645OoooO00 f121324OooO00o;

    static {
        String property;
        AbstractC33687OooO0oO abstractC33687OooO0oO;
        int i = C33841OooOo0O.f121953OooO00o;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO2 = C33833OooOOOO.f121946OooO00o;
            abstractC33687OooO0oO2.getClass();
            abstractC33687OooO0oO = !(abstractC33687OooO0oO2 instanceof InterfaceC33645OoooO00) ? RunnableC33639Oooo0o.f121321Oooo000 : abstractC33687OooO0oO2;
        } else {
            abstractC33687OooO0oO = RunnableC33639Oooo0o.f121321Oooo000;
        }
        f121324OooO00o = abstractC33687OooO0oO;
    }
}

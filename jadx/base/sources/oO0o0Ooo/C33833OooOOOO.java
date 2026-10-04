package oO0o0Ooo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0OOO.C33681OooO00o;

/* JADX INFO: renamed from: oO0o0Ooo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33833OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AbstractC33687OooO0oO f121946OooO00o;

    static {
        String property;
        int i = C33841OooOo0O.f121953OooO00o;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = C33576OooOOOo.OooOo0(C33574OooOOO0.OooO0o(Arrays.asList(new C33681OooO00o()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((InterfaceC33831OooOOO) next).getClass();
                    do {
                        ((InterfaceC33831OooOOO) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            InterfaceC33831OooOOO interfaceC33831OooOOO = (InterfaceC33831OooOOO) next;
            if (interfaceC33831OooOOO == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            f121946OooO00o = interfaceC33831OooOOO.OooO00o();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

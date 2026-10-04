package oOO00OOo;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import oOO00Oo.C34357OooO0Oo;
import oOO00Oo.C34360OooO0oo;
import oOO00Oo.OooO;
import oOO00Oo.OooO0o;
import oOO00Oo.OooOO0;
import oOO00Oo.OooOO0O;
import oOO00Oo0.C34363OooO0OO;
import ooooOoOo.InterfaceC35246OooO0O0;

/* JADX INFO: renamed from: oOO00OOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34354OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile int f123310OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOO0 f123311OooO0O0 = new OooOO0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0o f123312OooO0OO = new OooO0o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f123313OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String[] f123314OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile InterfaceC35246OooO0O0 f123315OooO0o0;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f123313OooO0Oo = property == null ? false : property.equalsIgnoreCase(TelemetryEventStrings.Value.TRUE);
        f123314OooO0o = new String[]{"2.0"};
    }

    public static ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = C34354OooO0Oo.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        InterfaceC35246OooO0O0 interfaceC35246OooO0O0 = null;
        if (property != null && !property.isEmpty()) {
            try {
                OooOO0O.OooO00o("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                interfaceC35246OooO0O0 = (InterfaceC35246OooO0O0) classLoader.loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassCastException e) {
                OooOO0O.OooO0O0("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                OooOO0O.OooO0O0("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                OooOO0O.OooO0O0("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                OooOO0O.OooO0O0("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                OooOO0O.OooO0O0("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                OooOO0O.OooO0O0("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (interfaceC35246OooO0O0 != null) {
            arrayList.add(interfaceC35246OooO0O0);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(InterfaceC35246OooO0O0.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: oOO00OOo.OooO0OO
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(InterfaceC35246OooO0O0.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((InterfaceC35246OooO0O0) it.next());
            } catch (ServiceConfigurationError e7) {
                OooOO0O.OooO00o("A SLF4J service provider failed to instantiate:\n" + e7.getMessage());
            }
        }
        return arrayList;
    }

    public static InterfaceC34352OooO0O0 OooO0O0(Class<?> cls) {
        int i;
        InterfaceC34352OooO0O0 interfaceC34352OooO0O0OooO0OO = OooO0OO(cls.getName());
        if (f123313OooO0Oo) {
            OooOO0O.OooO00o oooO00o = OooOO0O.f123333OooO00o;
            Class<?> cls2 = null;
            if (oooO00o == null) {
                if (OooOO0O.f123334OooO0O0) {
                    oooO00o = null;
                } else {
                    try {
                        oooO00o = new OooOO0O.OooO00o();
                    } catch (SecurityException unused) {
                        oooO00o = null;
                    }
                    OooOO0O.f123333OooO00o = oooO00o;
                    OooOO0O.f123334OooO0O0 = true;
                }
            }
            if (oooO00o != null) {
                Class<?>[] classContext = oooO00o.getClassContext();
                String name = OooOO0O.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                OooOO0O.OooO00o("Detected logger name mismatch. Given name: \"" + interfaceC34352OooO0O0OooO0OO.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                OooOO0O.OooO00o("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC34352OooO0O0OooO0OO;
    }

    public static InterfaceC34352OooO0O0 OooO0OO(String str) {
        return OooO0Oo().OooO00o().OooO00o(str);
    }

    public static InterfaceC35246OooO0O0 OooO0Oo() {
        if (f123310OooO00o == 0) {
            synchronized (C34354OooO0Oo.class) {
                try {
                    if (f123310OooO00o == 0) {
                        f123310OooO00o = 1;
                        OooO0o0();
                    }
                } finally {
                }
            }
        }
        int i = f123310OooO00o;
        if (i == 1) {
            return f123311OooO0O0;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return f123315OooO0o0;
        }
        if (i == 4) {
            return f123312OooO0OO;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static void OooO0o() {
        OooOO0 oooOO02 = f123311OooO0O0;
        synchronized (oooOO02) {
            try {
                oooOO02.f123331OooO00o.f123317OooO00o = true;
                OooO oooO = oooOO02.f123331OooO00o;
                oooO.getClass();
                for (C34360OooO0oo c34360OooO0oo : new ArrayList(oooO.f123318OooO0O0.values())) {
                    c34360OooO0oo.f123324OooOo = OooO0OO(c34360OooO0oo.f123325OooOo0o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue<C34363OooO0OO> linkedBlockingQueue = f123311OooO0O0.f123331OooO00o.f123319OooO0OO;
        int size = linkedBlockingQueue.size();
        ArrayList<C34363OooO0OO> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C34363OooO0OO c34363OooO0OO : arrayList) {
                if (c34363OooO0OO != null) {
                    C34360OooO0oo c34360OooO0oo2 = c34363OooO0OO.f123339OooO0O0;
                    String str = c34360OooO0oo2.f123325OooOo0o;
                    if (c34360OooO0oo2.f123324OooOo == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c34360OooO0oo2.f123324OooOo instanceof C34357OooO0Oo)) {
                        if (!c34360OooO0oo2.OooOo0O()) {
                            OooOO0O.OooO00o(str);
                        } else if (c34360OooO0oo2.OooO(c34363OooO0OO.f123338OooO00o) && c34360OooO0oo2.OooOo0O()) {
                            try {
                                c34360OooO0oo2.f123326OooOoO.invoke(c34360OooO0oo2.f123324OooOo, c34363OooO0OO);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c34363OooO0OO.f123339OooO0O0.OooOo0O()) {
                        OooOO0O.OooO00o("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        OooOO0O.OooO00o("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        OooOO0O.OooO00o("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c34363OooO0OO.f123339OooO0O0.f123324OooOo instanceof C34357OooO0Oo)) {
                        OooOO0O.OooO00o("The following set of substitute loggers may have been accessed");
                        OooOO0O.OooO00o("during the initialization phase. Logging calls during this");
                        OooOO0O.OooO00o("phase were not honored. However, subsequent logging calls to these");
                        OooOO0O.OooO00o("loggers will work as normally expected.");
                        OooOO0O.OooO00o("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        OooO oooO2 = f123311OooO0O0.f123331OooO00o;
        oooO2.f123318OooO0O0.clear();
        oooO2.f123319OooO0OO.clear();
    }

    public static final void OooO0o0() {
        try {
            ArrayList arrayListOooO00o = OooO00o();
            OooO0oo(arrayListOooO00o);
            if (arrayListOooO00o.isEmpty()) {
                f123310OooO00o = 4;
                OooOO0O.OooO00o("No SLF4J providers were found.");
                OooOO0O.OooO00o("Defaulting to no-operation (NOP) logger implementation");
                OooOO0O.OooO00o("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = C34354OooO0Oo.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    OooOO0O.OooO0O0("Error getting resources from path", e);
                }
                OooO0oO(linkedHashSet);
            } else {
                f123315OooO0o0 = (InterfaceC35246OooO0O0) arrayListOooO00o.get(0);
                f123315OooO0o0.getClass();
                f123310OooO00o = 3;
                if (!arrayListOooO00o.isEmpty() && arrayListOooO00o.size() > 1) {
                    OooOO0O.OooO00o("Actual provider is of type [" + arrayListOooO00o.get(0) + "]");
                }
            }
            OooO0o();
            if (f123310OooO00o == 3) {
                try {
                    String strOooO0OO = f123315OooO0o0.OooO0OO();
                    boolean z = false;
                    for (String str : f123314OooO0o) {
                        if (strOooO0OO.startsWith(str)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    }
                    OooOO0O.OooO00o("The requested version " + strOooO0OO + " by your slf4j provider is not compatible with " + Arrays.asList(f123314OooO0o).toString());
                    OooOO0O.OooO00o("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    OooOO0O.OooO0O0("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f123310OooO00o = 2;
            OooOO0O.OooO0O0("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    public static void OooO0oO(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        OooOO0O.OooO00o("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            OooOO0O.OooO00o("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        OooOO0O.OooO00o("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void OooO0oo(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            OooOO0O.OooO00o("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OooOO0O.OooO00o("Found provider [" + ((InterfaceC35246OooO0O0) it.next()) + "]");
            }
            OooOO0O.OooO00o("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}

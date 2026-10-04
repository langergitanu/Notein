package OooOooo;

import OooOooO.C20733OooOO0O;
import Oooo0oO.C21030OooOO0o;
import Oooo0oO.C21089o0000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.InterfaceC21233OooO0o;
import android.util.Log;
import com.facebook.soloader.C22314OooOOo0;
import com.facebook.soloader.SoLoader;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import o000oOoO.C24633OooO00o;
import o00oO0O.C25503OooOoOO;
import o00oO0O.InterfaceC25489OooO0oO;
import o00ooOo.C25781OooO0OO;
import o00ooOo0.C25787OooO00o;
import o00ooOo0.InterfaceC25788OooO0O0;
import o0ooOO0.C31552Oooooo;
import o0ooOO0.o000O0O;
import oo000o.C34638OooOOo0;

/* JADX INFO: renamed from: OooOooo.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20806OooooOo implements InterfaceC25788OooO0O0 {
    public static final void OooO0O0(InterfaceC21033OooOOOO interfaceC21033OooOOOO, InterfaceC21233OooO0o modifier) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(modifier, "modifier");
        interfaceC21033OooOOOO.OooOo00(-72882467);
        C20808Oooooo0 c20808Oooooo0 = C20808Oooooo0.f59740OooO00o;
        interfaceC21033OooOOOO.OooOo00(-1323940314);
        InterfaceC24229OooO0OO interfaceC24229OooO0OO = (InterfaceC24229OooO0OO) interfaceC21033OooOOOO.OooO0o0(C31552Oooooo.f112773OooO0o0);
        EnumC24238OooOOO enumC24238OooOOO = (EnumC24238OooOOO) interfaceC21033OooOOOO.OooO0o0(C31552Oooooo.f112777OooOO0O);
        o000O0O o000o0o2 = (o000O0O) interfaceC21033OooOOOO.OooO0o0(C31552Oooooo.f112782OooOOOo);
        InterfaceC25489OooO0oO.f86880OooO00o.getClass();
        C25503OooOoOO.OooO00o oooO00o = InterfaceC25489OooO0oO.OooO00o.f86882OooO0O0;
        C24633OooO00o c24633OooO00oOooO00o = C34638OooOOo0.OooO00o(modifier);
        if (interfaceC21033OooOOOO.OooOOO() == null) {
            C21030OooOO0o.OooO0Oo();
            throw null;
        }
        interfaceC21033OooOOOO.OooO0Oo();
        if (interfaceC21033OooOOOO.OooOO0o()) {
            interfaceC21033OooOOOO.OooOo(oooO00o);
        } else {
            interfaceC21033OooOOOO.OooO0O0();
        }
        interfaceC21033OooOOOO.OooOoO();
        C20733OooOO0O.OooO0OO(interfaceC21033OooOOOO, c20808Oooooo0, InterfaceC25489OooO0oO.OooO00o.f86886OooO0o0);
        C20733OooOO0O.OooO0OO(interfaceC21033OooOOOO, interfaceC24229OooO0OO, InterfaceC25489OooO0oO.OooO00o.f86884OooO0Oo);
        C20733OooOO0O.OooO0OO(interfaceC21033OooOOOO, enumC24238OooOOO, InterfaceC25489OooO0oO.OooO00o.f86885OooO0o);
        C20733OooOO0O.OooO0OO(interfaceC21033OooOOOO, o000o0o2, InterfaceC25489OooO0oO.OooO00o.f86887OooO0oO);
        interfaceC21033OooOOOO.OooOO0O();
        c24633OooO00oOooO00o.invoke(new C21089o0000OoO(interfaceC21033OooOOOO), interfaceC21033OooOOOO, 0);
        interfaceC21033OooOOOO.OooOo00(2058660585);
        interfaceC21033OooOOOO.OooOoo();
        interfaceC21033OooOOOO.OooO0OO();
        interfaceC21033OooOOOO.OooOoo();
        interfaceC21033OooOOOO.OooOoo();
    }

    @Override // o00ooOo0.InterfaceC25788OooO0O0
    public boolean OooO00o(String str) {
        Boolean boolValueOf;
        if (SoLoader.f67528OooO0o0 == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = SoLoader.f67525OooO0OO;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (SoLoader.f67528OooO0o0 == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean zContains = SoLoader.f67530OooO0oo.contains(str);
                                boolean z = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z);
                            } finally {
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!SoLoader.OooOO0O()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th) {
                SoLoader.f67525OooO0OO.readLock().unlock();
                throw th;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (!SoLoader.f67532OooOO0O) {
            return C25787OooO00o.OooO0O0(str);
        }
        if (SoLoader.f67534OooOOO0 != 2) {
        }
        String strMapLibraryName = System.mapLibraryName(str);
        C25781OooO0OO c25781OooO0OOOooO0o = null;
        while (true) {
            try {
                return SoLoader.OooOO0o(strMapLibraryName, str, 0, null);
            } catch (UnsatisfiedLinkError e) {
                Log.w("SoLoader", "Starting recovery for " + strMapLibraryName, e);
                SoLoader.f67525OooO0OO.writeLock().lock();
                if (c25781OooO0OOOooO0o == null) {
                    try {
                        try {
                            c25781OooO0OOOooO0o = SoLoader.OooO0o();
                        } catch (Throwable th2) {
                            SoLoader.f67525OooO0OO.writeLock().unlock();
                            throw th2;
                        }
                    } catch (C22314OooOOo0 e2) {
                        Log.e("SoLoader", "Base APK not found during recovery", e2);
                        throw e2;
                    } catch (Exception e3) {
                        Log.e("SoLoader", "Got an exception during recovery, will throw the initial error instead", e3);
                        throw e;
                    }
                }
                if (c25781OooO0OOOooO0o == null || !c25781OooO0OOOooO0o.OooO0O0(e, SoLoader.f67528OooO0o0)) {
                    SoLoader.f67525OooO0OO.writeLock().unlock();
                    Log.w("SoLoader", "Failed to recover");
                    throw e;
                }
                SoLoader.f67527OooO0o.getAndIncrement();
                Log.w("SoLoader", "Attempting to load library again");
                SoLoader.f67525OooO0OO.writeLock().unlock();
            }
        }
        SoLoader.f67525OooO0OO.writeLock().unlock();
        Log.w("SoLoader", "Failed to recover");
        throw e;
    }
}

package o00o00o0;

import Oooo0oO.C21111o0ooOoO;
import androidx.datastore.preferences.protobuf.o000oOoO;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o00o00o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class C25283OooO0Oo {
    public static InterfaceC25281OooO0O0 OooO00o(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof InterfaceC25281OooO0O0) {
                    return (InterfaceC25281OooO0O0) objNewInstance;
                }
                throw new RuntimeException(o000oOoO.OooO00o(objNewInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                OooO0O0(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                OooO0O0(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                OooO0O0(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                OooO0O0(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void OooO0O0(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}

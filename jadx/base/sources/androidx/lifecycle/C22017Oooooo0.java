package androidx.lifecycle;

import Oooo0oO.C21111o0ooOoO;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: androidx.lifecycle.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22017Oooooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<Class<?>> f65674OooO00o = C34429OooOOo0.OooOO0o(Application.class, C22008OoooOo0.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final List<Class<?>> f65675OooO0O0 = com.facebook.soloader.OooOo.OooO0oO(C22008OoooOo0.class);

    public static final Constructor OooO00o(List signature, Class cls) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.OooOOO0.OooO0o(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.OooOOO0.OooO0o(parameterTypes, "constructor.parameterTypes");
            List listOoooOO0 = oOo000Oo.OooOOO.OoooOO0(parameterTypes);
            if (signature.equals(listOoooOO0)) {
                return constructor;
            }
            if (signature.size() == listOoooOO0.size() && listOoooOO0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends AbstractC22019Ooooooo> T OooO0O0(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "Failed to access "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(Oooo0oO.o0Oo0oo.OooO0OO("A ", cls, " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(C21111o0ooOoO.OooO0O0(cls, "An exception happened in constructor of "), e3.getCause());
        }
    }
}

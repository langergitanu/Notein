package o00O000o;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo.OooO00o<String, Method> f84076OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo.OooO00o<String, Method> f84077OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo.OooO00o<String, Class> f84078OooO0OO;

    public OooO00o(OooOo.OooO00o<String, Method> oooO00o, OooOo.OooO00o<String, Method> oooO00o2, OooOo.OooO00o<String, Class> oooO00o3) {
        this.f84076OooO00o = oooO00o;
        this.f84077OooO0O0 = oooO00o2;
        this.f84078OooO0OO = oooO00o3;
    }

    public abstract int OooO();

    public abstract OooO0O0 OooO00o();

    public final Class OooO0O0(Class<? extends OooO0OO> cls) throws ClassNotFoundException {
        String name = cls.getName();
        OooOo.OooO00o<String, Class> oooO00o = this.f84078OooO0OO;
        Class cls2 = oooO00o.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(OooO0O0.OooO00o.OooO0O0(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        oooO00o.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method OooO0OO(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        OooOo.OooO00o<String, Method> oooO00o = this.f84076OooO00o;
        Method method = oooO00o.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, OooO00o.class.getClassLoader()).getDeclaredMethod("read", OooO00o.class);
        oooO00o.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method OooO0Oo(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        OooOo.OooO00o<String, Method> oooO00o = this.f84077OooO0O0;
        Method method = oooO00o.get(name);
        if (method != null) {
            return method;
        }
        Class clsOooO0O0 = OooO0O0(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsOooO0O0.getDeclaredMethod("write", cls, OooO00o.class);
        oooO00o.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract byte[] OooO0o();

    public abstract boolean OooO0o0();

    public abstract CharSequence OooO0oO();

    public abstract boolean OooO0oo(int i);

    public final int OooOO0(int i, int i2) {
        return !OooO0oo(i2) ? i : OooO();
    }

    public abstract <T extends Parcelable> T OooOO0O();

    public abstract String OooOO0o();

    public abstract void OooOOO(int i);

    public final <T extends OooO0OO> T OooOOO0() {
        String strOooOO0o = OooOO0o();
        if (strOooOO0o == null) {
            return null;
        }
        try {
            return (T) OooO0OO(strOooOO0o).invoke(null, OooO00o());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void OooOOOO(boolean z);

    public abstract void OooOOOo(byte[] bArr);

    public abstract void OooOOo(int i);

    public abstract void OooOOo0(CharSequence charSequence);

    public final void OooOOoo(int i, int i2) {
        OooOOO(i2);
        OooOOo(i);
    }

    public abstract void OooOo0(String str);

    public abstract void OooOo00(Parcelable parcelable);

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOo0O(OooO0OO oooO0OO) {
        if (oooO0OO == null) {
            OooOo0(null);
            return;
        }
        try {
            OooOo0(OooO0O0(oooO0OO.getClass()).getName());
            OooO0O0 oooO0O0OooO00o = OooO00o();
            try {
                OooO0Oo(oooO0OO.getClass()).invoke(null, oooO0OO, oooO0O0OooO00o);
                oooO0O0OooO00o.OooOo0o();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(oooO0OO.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}

package androidx.fragment.app;

import OooOo.C20493Oooo00o;
import OooOoo.C20593OooO0Oo;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.fragment.app.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21901OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20493Oooo00o<ClassLoader, C20493Oooo00o<String, Class<?>>> f64994OooO00o = new C20493Oooo00o<>();

    public static Class<?> OooO0O0(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C20493Oooo00o<ClassLoader, C20493Oooo00o<String, Class<?>>> c20493Oooo00o = f64994OooO00o;
        C20493Oooo00o<String, Class<?>> c20493Oooo00o2 = c20493Oooo00o.get(classLoader);
        if (c20493Oooo00o2 == null) {
            c20493Oooo00o2 = new C20493Oooo00o<>();
            c20493Oooo00o.put(classLoader, c20493Oooo00o2);
        }
        Class<?> cls = c20493Oooo00o2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c20493Oooo00o2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> OooO0OO(ClassLoader classLoader, String str) {
        try {
            return OooO0O0(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public Fragment OooO00o(ClassLoader classLoader, String str) {
        try {
            return OooO0OO(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment.C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}

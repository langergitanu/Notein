package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO f65506OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f65507OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f65508OooO0O0 = new HashMap();

    @Deprecated
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f65509OooO00o = new HashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashMap f65510OooO0O0;

        public OooO00o(HashMap map) {
            this.f65510OooO0O0 = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC21979OooOOo0.OooO00o oooO00o = (AbstractC21979OooOOo0.OooO00o) entry.getValue();
                List arrayList = (List) this.f65509OooO00o.get(oooO00o);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f65509OooO00o.put(oooO00o, arrayList);
                }
                arrayList.add((OooO0O0) entry.getKey());
            }
        }

        public static void OooO00o(List list, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o, InterfaceC21988OooOoo0 interfaceC21988OooOoo0) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    OooO0O0 oooO0O0 = (OooO0O0) list.get(size);
                    oooO0O0.getClass();
                    try {
                        int i = oooO0O0.f65511OooO00o;
                        Method method = oooO0O0.f65512OooO0O0;
                        if (i == 0) {
                            method.invoke(interfaceC21988OooOoo0, new Object[0]);
                        } else if (i == 1) {
                            method.invoke(interfaceC21988OooOoo0, interfaceC21987OooOoo);
                        } else if (i == 2) {
                            method.invoke(interfaceC21988OooOoo0, interfaceC21987OooOoo, oooO00o);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f65511OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f65512OooO0O0;

        public OooO0O0(Method method, int i) {
            this.f65511OooO00o = i;
            this.f65512OooO0O0 = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f65511OooO00o == oooO0O0.f65511OooO00o && this.f65512OooO0O0.getName().equals(oooO0O0.f65512OooO0O0.getName());
        }

        public final int hashCode() {
            return this.f65512OooO0O0.getName().hashCode() + (this.f65511OooO00o * 31);
        }
    }

    public static void OooO0O0(HashMap map, OooO0O0 oooO0O0, AbstractC21979OooOOo0.OooO00o oooO00o, Class cls) {
        AbstractC21979OooOOo0.OooO00o oooO00o2 = (AbstractC21979OooOOo0.OooO00o) map.get(oooO0O0);
        if (oooO00o2 == null || oooO00o == oooO00o2) {
            if (oooO00o2 == null) {
                map.put(oooO0O0, oooO00o);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + oooO0O0.f65512OooO0O0.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + oooO00o2 + ", new value " + oooO00o);
    }

    public final OooO00o OooO00o(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f65507OooO00o;
        if (superclass != null) {
            OooO00o OooO00o2 = (OooO00o) map2.get(superclass);
            if (OooO00o2 == null) {
                OooO00o2 = OooO00o(superclass, null);
            }
            map.putAll(OooO00o2.f65510OooO0O0);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            OooO00o OooO00o3 = (OooO00o) map2.get(cls2);
            if (OooO00o3 == null) {
                OooO00o3 = OooO00o(cls2, null);
            }
            for (Map.Entry entry : OooO00o3.f65510OooO0O0.entrySet()) {
                OooO0O0(map, (OooO0O0) entry.getKey(), (AbstractC21979OooOOo0.OooO00o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC21997Oooo0o interfaceC21997Oooo0o = (InterfaceC21997Oooo0o) method.getAnnotation(InterfaceC21997Oooo0o.class);
            if (interfaceC21997Oooo0o != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC21987OooOoo.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC21979OooOOo0.OooO00o oooO00oValue = interfaceC21997Oooo0o.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC21979OooOOo0.OooO00o.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (oooO00oValue != AbstractC21979OooOOo0.OooO00o.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                OooO0O0(map, new OooO0O0(method, i), oooO00oValue, cls);
                z = true;
            }
        }
        OooO00o oooO00o = new OooO00o(map);
        map2.put(cls, oooO00o);
        this.f65508OooO0O0.put(cls, Boolean.valueOf(z));
        return oooO00o;
    }
}

package ooOOOoO0;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oO00ooO.C32447OooOOo;
import oO0O0O0.C32579OoooO0O;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements InvocationHandler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class f126055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map f126056OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f126057OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32447OooOOo f126058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List f126059OooO0o0;

    public OooO0O0(Class cls, Map map, C32447OooOOo c32447OooOOo, C32447OooOOo c32447OooOOo2, List list) {
        this.f126055OooO00o = cls;
        this.f126056OooO0O0 = map;
        this.f126057OooO0OO = c32447OooOOo;
        this.f126058OooO0Oo = c32447OooOOo2;
        this.f126059OooO0o0 = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zOooO0O0;
        boolean z;
        Class annotationClass = this.f126055OooO00o;
        OooOOO0.OooO0oO(annotationClass, "$annotationClass");
        Map map = this.f126056OooO0O0;
        C32447OooOOo c32447OooOOo = this.f126057OooO0OO;
        C32447OooOOo c32447OooOOo2 = this.f126058OooO0Oo;
        List methods = this.f126059OooO0o0;
        OooOOO0.OooO0oO(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) c32447OooOOo2.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) c32447OooOOo.getValue();
            }
        }
        boolean z2 = false;
        if (!OooOOO0.OooO0O0(name, "equals") || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(OooOOO.OoooOO0(objArr));
            sb.append(')');
            throw new C32579OoooO0O(sb.toString());
        }
        Object objOooo0o0 = OooOOO.Oooo0o0(objArr);
        Annotation annotation = objOooo0o0 instanceof Annotation ? (Annotation) objOooo0o0 : null;
        if (OooOOO0.OooO0O0(annotation != null ? C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(annotation)) : null, annotationClass)) {
            List<Method> list = methods;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = true;
                if (z) {
                }
            } else {
                for (Method method2 : list) {
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objOooo0o0, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zOooO0O0 = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zOooO0O0 = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zOooO0O0 = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zOooO0O0 = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zOooO0O0 = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zOooO0O0 = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zOooO0O0 = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zOooO0O0 = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zOooO0O0 = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zOooO0O0 = OooOOO0.OooO0O0(obj2, objInvoke);
                    }
                    if (!zOooO0O0) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    z2 = true;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}

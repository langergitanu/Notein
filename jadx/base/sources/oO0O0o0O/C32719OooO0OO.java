package oO0O0o0O;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oO0O0O0o.OooOO0O;
import oO0O0O0o.OooOOO;
import oO0O0oO0.C32730OooO0Oo;
import oO0OOo.C33036OooO0o;
import oO0Oo0.EnumC33191OooO0Oo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOoo0.InterfaceC34595OooO0Oo;
import ooo0o.InterfaceC35196OooOOo0;

/* JADX INFO: renamed from: oO0O0o0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32719OooO0OO {
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, oO00ooO.OooOO0] */
    public static C33036OooO0o OooO00o(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            OooOOO0.OooO0o(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new C33036OooO0o(C33476OooO0O0.OooOO0(OooOOO.OooO00o.f117153OooO0Oo.OooO0oO()), i);
            }
            OooOO0O oooOO0OOooO0Oo = EnumC33191OooO0Oo.OooO0O0(cls.getName()).OooO0Oo();
            OooOOO0.OooO0o(oooOO0OOooO0Oo, "get(currentClass.name).primitiveType");
            return i > 0 ? new C33036OooO0o(C33476OooO0O0.OooOO0((C33477OooO0OO) oooOO0OOooO0Oo.f117124OooOoO.getValue()), i - 1) : new C33036OooO0o(C33476OooO0O0.OooOO0((C33477OooO0OO) oooOO0OOooO0Oo.f117125OooOoO0.getValue()), i);
        }
        C33476OooO0O0 c33476OooO0O0OooO00o = C32730OooO0Oo.OooO00o(cls);
        String str = oO0O0O.OooO0OO.f116822OooO00o;
        C33476OooO0O0 c33476OooO0O0 = oO0O0O.OooO0OO.f116829OooO0oo.get(c33476OooO0O0OooO00o.OooO0O0().OooO());
        if (c33476OooO0O0 != null) {
            c33476OooO0O0OooO00o = c33476OooO0O0;
        }
        return new C33036OooO0o(c33476OooO0O0OooO00o, i);
    }

    public static void OooO0O0(InterfaceC35196OooOOo0.OooO0OO oooO0OO, Annotation annotation) throws InvocationTargetException {
        Class clsOooO0Oo = C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(annotation));
        InterfaceC35196OooOOo0.OooO00o oooO00oOooO0O0 = oooO0OO.OooO0O0(C32730OooO0Oo.OooO00o(clsOooO0Oo), new C32718OooO0O0(annotation));
        if (oooO00oOooO0O0 != null) {
            OooO0OO(oooO00oOooO0O0, annotation, clsOooO0Oo);
        }
    }

    public static void OooO0OO(InterfaceC35196OooOOo0.OooO00o oooO00o, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        OooOOO0.OooO0o(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                OooOOO0.OooO0Oo(objInvoke);
                C33479OooO0o c33479OooO0oOooO0o0 = C33479OooO0o.OooO0o0(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    oooO00o.OooO0Oo(c33479OooO0oOooO0o0, OooO00o((Class) objInvoke));
                } else if (C32723OooO0oO.f117650OooO00o.contains(enclosingClass)) {
                    oooO00o.OooO0O0(c33479OooO0oOooO0o0, objInvoke);
                } else {
                    List<InterfaceC34595OooO0Oo<? extends Object>> list = C32730OooO0Oo.f117669OooO00o;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        OooOOO0.OooO0o(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        oooO00o.OooO0o0(c33479OooO0oOooO0o0, C32730OooO0Oo.OooO00o(enclosingClass), C33479OooO0o.OooO0o0(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        OooOOO0.OooO0o(interfaces, "clazz.interfaces");
                        Class annotationClass = (Class) oOo000Oo.OooOOO.Oooo0o0(interfaces);
                        OooOOO0.OooO0o(annotationClass, "annotationClass");
                        InterfaceC35196OooOOo0.OooO00o oooO00oOooO0o = oooO00o.OooO0o(C32730OooO0Oo.OooO00o(annotationClass), c33479OooO0oOooO0o0);
                        if (oooO00oOooO0o != null) {
                            OooO0OO(oooO00oOooO0o, (Annotation) objInvoke, annotationClass);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        InterfaceC35196OooOOo0.OooO0O0 oooO0O0OooO0OO = oooO00o.OooO0OO(c33479OooO0oOooO0o0);
                        if (oooO0O0OooO0OO != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                C33476OooO0O0 c33476OooO0O0OooO00o = C32730OooO0Oo.OooO00o(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    oooO0O0OooO0OO.OooO0o0(c33476OooO0O0OooO00o, C33479OooO0o.OooO0o0(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    oooO0O0OooO0OO.OooO0O0(OooO00o((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    InterfaceC35196OooOOo0.OooO00o oooO00oOooO0OO = oooO0O0OooO0OO.OooO0OO(C32730OooO0Oo.OooO00o(componentType));
                                    if (oooO00oOooO0OO != null) {
                                        OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        OooO0OO(oooO00oOooO0OO, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    oooO0O0OooO0OO.OooO0Oo(obj4);
                                }
                            }
                            oooO0O0OooO0OO.OooO00o();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        oooO00o.OooO00o();
    }
}

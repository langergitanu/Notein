package o0oo0o00;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o0oo0o0.C31286OooO0O0;
import o0oo0o00.AbstractC31298OooOO0o;
import o0oo0o00.AbstractC31304OooOOo0;

/* JADX INFO: renamed from: o0oo0o00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31294OooO0oO<T> extends AbstractC31298OooOO0o<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f111729OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC31292OooO0o<T> f111730OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0<?>[] f111731OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC31304OooOOo0.OooO00o f111732OooO0OO;

    /* JADX INFO: renamed from: o0oo0o00.OooO0oO$OooO00o */
    public class OooO00o implements AbstractC31298OooOO0o.OooO00o {
        public static void OooO0O0(Type type, Class cls) {
            Class<?> clsOooO0OO = C31320OooOoOO.OooO0OO(type);
            if (cls.isAssignableFrom(clsOooO0OO)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsOooO0OO.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o.OooO00o
        public final AbstractC31298OooOO0o<?> OooO00o(Type type, Set<? extends Annotation> set, C31306OooOo c31306OooOo) {
            AbstractC31292OooO0o c31293OooO0o0;
            Class<Object> cls;
            LinkedHashSet linkedHashSet;
            boolean z;
            Type typeOooO0o0 = type;
            boolean z2 = true;
            Class<Object> cls2 = Object.class;
            LinkedHashSet linkedHashSet2 = null;
            if ((typeOooO0o0 instanceof Class) || (typeOooO0o0 instanceof ParameterizedType)) {
                Class<?> clsOooO0OO = C31320OooOoOO.OooO0OO(typeOooO0o0);
                if (!clsOooO0OO.isInterface() && !clsOooO0OO.isEnum() && set.isEmpty()) {
                    if (C31286OooO0O0.OooO0Oo(clsOooO0OO)) {
                        OooO0O0(typeOooO0o0, List.class);
                        OooO0O0(typeOooO0o0, Set.class);
                        OooO0O0(typeOooO0o0, Map.class);
                        OooO0O0(typeOooO0o0, Collection.class);
                        String str = "Platform " + clsOooO0OO;
                        if (typeOooO0o0 instanceof ParameterizedType) {
                            str = str + " in " + typeOooO0o0;
                        }
                        throw new IllegalArgumentException(C21111o0ooOoO.OooO0Oo(str, " requires explicit JsonAdapter to be registered"));
                    }
                    if (clsOooO0OO.isAnonymousClass()) {
                        throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsOooO0OO.getName()));
                    }
                    if (clsOooO0OO.isLocalClass()) {
                        throw new IllegalArgumentException("Cannot serialize local class ".concat(clsOooO0OO.getName()));
                    }
                    if (clsOooO0OO.getEnclosingClass() != null && !Modifier.isStatic(clsOooO0OO.getModifiers())) {
                        throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsOooO0OO.getName()));
                    }
                    if (Modifier.isAbstract(clsOooO0OO.getModifiers())) {
                        throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsOooO0OO.getName()));
                    }
                    Class<? extends Annotation> cls3 = C31286OooO0O0.f111708OooO0OO;
                    if (cls3 != null && clsOooO0OO.isAnnotationPresent(cls3)) {
                        throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsOooO0OO.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                    }
                    int i = 0;
                    try {
                        try {
                            try {
                                try {
                                    Constructor<?> declaredConstructor = clsOooO0OO.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    c31293OooO0o0 = new C31289OooO0O0(clsOooO0OO, declaredConstructor);
                                } catch (NoSuchMethodException unused) {
                                    Class<?> cls4 = Class.forName("sun.misc.Unsafe");
                                    Field declaredField = cls4.getDeclaredField("theUnsafe");
                                    declaredField.setAccessible(true);
                                    c31293OooO0o0 = new C31290OooO0OO(cls4.getMethod("allocateInstance", Class.class), declaredField.get(null), clsOooO0OO);
                                }
                            } catch (Exception unused2) {
                                throw new IllegalArgumentException("cannot construct instances of ".concat(clsOooO0OO.getName()));
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                            declaredMethod.setAccessible(true);
                            int iIntValue = ((Integer) declaredMethod.invoke(null, cls2)).intValue();
                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                            declaredMethod2.setAccessible(true);
                            c31293OooO0o0 = new C31291OooO0Oo(declaredMethod2, clsOooO0OO, iIntValue);
                        } catch (IllegalAccessException unused4) {
                            throw new AssertionError();
                        }
                    } catch (IllegalAccessException unused5) {
                        throw new AssertionError();
                    } catch (NoSuchMethodException unused6) {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                        declaredMethod3.setAccessible(true);
                        c31293OooO0o0 = new C31293OooO0o0(declaredMethod3, clsOooO0OO);
                    } catch (InvocationTargetException e) {
                        C31286OooO0O0.OooO0o(e);
                        throw null;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (typeOooO0o0 != cls2) {
                        Class<?> clsOooO0OO2 = C31320OooOoOO.OooO0OO(typeOooO0o0);
                        boolean zOooO0Oo = C31286OooO0O0.OooO0Oo(clsOooO0OO2);
                        Field[] declaredFields = clsOooO0OO2.getDeclaredFields();
                        int length = declaredFields.length;
                        int i2 = i;
                        while (i2 < length) {
                            Field field = declaredFields[i2];
                            int modifiers = field.getModifiers();
                            if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || !(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zOooO0Oo)) {
                                cls = cls2;
                                linkedHashSet = linkedHashSet2;
                            } else {
                                InterfaceC31297OooOO0O interfaceC31297OooOO0O = (InterfaceC31297OooOO0O) field.getAnnotation(InterfaceC31297OooOO0O.class);
                                if (interfaceC31297OooOO0O == null || !interfaceC31297OooOO0O.ignore()) {
                                    Type typeOooO0o02 = C31286OooO0O0.OooO0o0(typeOooO0o0, clsOooO0OO2, field.getGenericType(), new LinkedHashSet());
                                    Annotation[] annotations = field.getAnnotations();
                                    linkedHashSet = linkedHashSet2;
                                    int length2 = annotations.length;
                                    LinkedHashSet linkedHashSet3 = linkedHashSet;
                                    while (i < length2) {
                                        boolean z3 = z2;
                                        Annotation annotation = annotations[i];
                                        Class<Object> cls5 = cls2;
                                        int i3 = length2;
                                        if (annotation.annotationType().isAnnotationPresent(InterfaceC31302OooOOOo.class)) {
                                            if (linkedHashSet3 == null) {
                                                linkedHashSet3 = new LinkedHashSet();
                                            }
                                            LinkedHashSet linkedHashSet4 = linkedHashSet3;
                                            linkedHashSet4.add(annotation);
                                            linkedHashSet3 = linkedHashSet4;
                                        }
                                        i++;
                                        length2 = i3;
                                        z2 = z3;
                                        cls2 = cls5;
                                    }
                                    boolean z4 = z2;
                                    cls = cls2;
                                    Set<Annotation> setUnmodifiableSet = linkedHashSet3 != null ? Collections.unmodifiableSet(linkedHashSet3) : C31286OooO0O0.f111706OooO00o;
                                    String name = field.getName();
                                    AbstractC31298OooOO0o<T> abstractC31298OooOO0oOooO0O0 = c31306OooOo.OooO0O0(typeOooO0o02, setUnmodifiableSet, name);
                                    field.setAccessible(z4);
                                    if (interfaceC31297OooOO0O != null) {
                                        String strName = interfaceC31297OooOO0O.name();
                                        if (!"\u0000".equals(strName)) {
                                            name = strName;
                                        }
                                    }
                                    OooO0O0 oooO0O0 = (OooO0O0) treeMap.put(name, new OooO0O0(name, field, abstractC31298OooOO0oOooO0O0));
                                    if (oooO0O0 != null) {
                                        throw new IllegalArgumentException("Conflicting fields:\n    " + oooO0O0.f111734OooO0O0 + "\n    " + field);
                                    }
                                } else {
                                    z = z2;
                                    cls = cls2;
                                    linkedHashSet = linkedHashSet2;
                                    i2++;
                                    linkedHashSet2 = linkedHashSet;
                                    z2 = z;
                                    cls2 = cls;
                                    i = 0;
                                }
                            }
                            z = true;
                            i2++;
                            linkedHashSet2 = linkedHashSet;
                            z2 = z;
                            cls2 = cls;
                            i = 0;
                        }
                        boolean z5 = z2;
                        Class<?> clsOooO0OO3 = C31320OooOoOO.OooO0OO(typeOooO0o0);
                        typeOooO0o0 = C31286OooO0O0.OooO0o0(typeOooO0o0, clsOooO0OO3, clsOooO0OO3.getGenericSuperclass(), new LinkedHashSet());
                        linkedHashSet2 = linkedHashSet2;
                        z2 = z5;
                        cls2 = cls2;
                        i = 0;
                    }
                    return new C31294OooO0oO(c31293OooO0o0, treeMap).OooO0O0();
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooO0oO$OooO0O0 */
    public static class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f111733OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Field f111734OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AbstractC31298OooOO0o<T> f111735OooO0OO;

        public OooO0O0(String str, Field field, AbstractC31298OooOO0o<T> abstractC31298OooOO0o) {
            this.f111733OooO00o = str;
            this.f111734OooO0O0 = field;
            this.f111735OooO0OO = abstractC31298OooOO0o;
        }
    }

    public C31294OooO0oO(AbstractC31292OooO0o abstractC31292OooO0o, TreeMap treeMap) {
        this.f111730OooO00o = abstractC31292OooO0o;
        this.f111731OooO0O0 = (OooO0O0[]) treeMap.values().toArray(new OooO0O0[treeMap.size()]);
        this.f111732OooO0OO = AbstractC31304OooOOo0.OooO00o.OooO00o((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
        try {
            T tOooO00o = this.f111730OooO00o.OooO00o();
            try {
                c31303OooOOo.OooOOoo();
                while (c31303OooOOo.o00Oo0()) {
                    int iO000OO0o = c31303OooOOo.o000OO0o(this.f111732OooO0OO);
                    if (iO000OO0o == -1) {
                        c31303OooOOo.o000OOO();
                        c31303OooOOo.o000OOoO();
                    } else {
                        OooO0O0<?> oooO0O0 = this.f111731OooO0O0[iO000OO0o];
                        oooO0O0.f111734OooO0O0.set(tOooO00o, oooO0O0.f111735OooO0OO.OooO00o(c31303OooOOo));
                    }
                }
                c31303OooOOo.Oooo0();
                return tOooO00o;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            C31286OooO0O0.OooO0o(e2);
            throw null;
        }
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
        try {
            c31305OooOOoo.OooOooo();
            for (OooO0O0<?> oooO0O0 : this.f111731OooO0O0) {
                c31305OooOOoo.Oooo0OO(oooO0O0.f111733OooO00o);
                oooO0O0.f111735OooO0OO.OooO0OO(c31305OooOOoo, oooO0O0.f111734OooO0O0.get(obj));
            }
            c31305OooOOoo.Oooo0();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f111730OooO00o + ")";
    }
}

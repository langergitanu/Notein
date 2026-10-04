package com.google.gson.internal;

import OooOOOo.C20451OooO0Oo;
import OooOOOo.C20454OooO0oo;
import OooOOOo.OooOOO0;
import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.C22214OooOoo;
import com.aspose.slides.C22215OooOoo0;
import com.aspose.slides.C22216OooOooO;
import com.aspose.slides.C22217OooOooo;
import com.aspose.slides.C22219Oooo00O;
import com.aspose.slides.Oooo000;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes8.dex */
public final class ConstructorConstructor {
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private final List<ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z, List<ReflectionAccessFilter> list) {
        this.instanceCreators = map;
        this.useJdkUnsafe = z;
        this.reflectionFilters = list;
    }

    public static String checkInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$get$2(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$get$3(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultConstructor$6(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultConstructor$7(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultConstructor$8(Constructor constructor) {
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$10() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$11() {
        return new ArrayDeque();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$12() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$13() {
        return new ConcurrentSkipListMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$14() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$15() {
        return new TreeMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$16() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$17() {
        return new LinkedTreeMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultImplementationConstructor$9() {
        return new TreeSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newSpecialCollectionConstructor$4(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newSpecialCollectionConstructor$5(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newUnsafeAllocator$18(Class cls) {
        try {
            return UnsafeAllocator.INSTANCE.newInstance(cls);
        } catch (Exception e) {
            throw new RuntimeException(o0Oo0oo.OooO0OO("Unable to create instance of ", cls, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newUnsafeAllocator$19(String str) {
        throw new JsonIOException(str);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [OooOOOo.OooO0o0, android.util.Log, com.google.gson.internal.ObjectConstructor<T>] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 OooOOOo.OooO0o0, still in use, count: 1, list:
          (r4v4 OooOOOo.OooO0o0) from MOVE (r4v3 OooOOOo.OooO0o0) = (r4v4 OooOOOo.OooO0o0) A[SOFT_CAST, SYNTHETIC]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultConstructor(java.lang.Class<? super T> r3, com.google.gson.ReflectionAccessFilter.FilterResult r4) {
        /*
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            goto L4e
        Lc:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L4e
            java.lang.reflect.Constructor r0 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L4e
            com.google.gson.ReflectionAccessFilter$FilterResult r2 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r4 == r2) goto L3a
            boolean r1 = com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(r0, r1)
            if (r1 == 0) goto L2c
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r4 != r1) goto L3a
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L2c
            goto L3a
        L2c:
            java.lang.String r4 = "Unable to invoke no-args constructor of "
            java.lang.String r0 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            java.lang.String r3 = Oooo0oO.o0Oo0oo.OooO0OO(r4, r3, r0)
            OooOOOo.OooO0o0 r4 = new OooOOOo.OooO0o0
            r4.e(r3, r0)
            return r4
        L3a:
            if (r4 != r2) goto L48
            java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.tryMakeAccessible(r0)
            if (r3 == 0) goto L48
            OooOOOo.OooO0o r4 = new OooOOOo.OooO0o
            r4.<init>(r3)
            return r4
        L48:
            OooOOOo.OooO0oO r3 = new OooOOOo.OooO0oO
            r3.<init>(r0)
            return r3
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ConstructorConstructor.newDefaultConstructor(java.lang.Class, com.google.gson.ReflectionAccessFilter$FilterResult):com.google.gson.internal.ObjectConstructor");
    }

    private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C22213OooOoOO() : Set.class.isAssignableFrom(cls) ? new C22215OooOoo0() : Queue.class.isAssignableFrom(cls) ? new C22214OooOoo() : new C22216OooOooO();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new OooOOO0() : ConcurrentMap.class.isAssignableFrom(cls) ? new C22217OooOooo() : SortedMap.class.isAssignableFrom(cls) ? new Oooo000() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new OooOO0.OooO0O0() : new C22219Oooo00O();
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.OooO0O0
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.lambda$newSpecialCollectionConstructor$4(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new OooO0OO(type);
        }
        return null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new OooO00o(cls);
        }
        String strOooO0OO = o0Oo0oo.OooO0OO("Unable to create instance of ", cls, "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        if (cls.getDeclaredConstructors().length == 0) {
            strOooO0OO = C21111o0ooOoO.OooO0Oo(strOooO0OO, " Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        return new C20454OooO0oo(strOooO0OO);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        final Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        final InstanceCreator<?> instanceCreator = this.instanceCreators.get(type);
        if (instanceCreator != null) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.OooO0Oo
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return instanceCreator.createInstance(type);
                }
            };
        }
        final InstanceCreator<?> instanceCreator2 = this.instanceCreators.get(rawType);
        if (instanceCreator2 != null) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.OooO0o0
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return instanceCreator2.createInstance(type);
                }
            };
        }
        ObjectConstructor<T> objectConstructorNewSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
        if (objectConstructorNewSpecialCollectionConstructor != null) {
            return objectConstructorNewSpecialCollectionConstructor;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        ObjectConstructor<T> objectConstructorNewDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (objectConstructorNewDefaultConstructor != null) {
            return objectConstructorNewDefaultConstructor;
        }
        ObjectConstructor<T> objectConstructorNewDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        if (objectConstructorNewDefaultImplementationConstructor != null) {
            return objectConstructorNewDefaultImplementationConstructor;
        }
        String strCheckInstantiable = checkInstantiable(rawType);
        return strCheckInstantiable != null ? new OooO0o(strCheckInstantiable) : filterResult == ReflectionAccessFilter.FilterResult.ALLOW ? newUnsafeAllocator(rawType) : new C20451OooO0Oo(o0Oo0oo.OooO0OO("Unable to create instance of ", rawType, "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."));
    }

    public String toString() {
        return this.instanceCreators.toString();
    }
}

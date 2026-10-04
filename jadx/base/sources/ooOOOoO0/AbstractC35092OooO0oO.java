package ooOOOoO0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C24037Oooo0OO;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOOO;
import ooOOOoO0.OooO0o;

/* JADX INFO: renamed from: ooOOOoO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35092OooO0oO<M extends Member> implements ooOOOoO0.OooO0o<M> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final M f126064OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Type f126065OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Class<?> f126066OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Type> f126067OooO0Oo;

    /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO00o */
    public static final class OooO00o extends AbstractC35092OooO0oO<Constructor<?>> implements InterfaceC35091OooO0o0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Object f126068OooO0o0;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO00o(Constructor<?> constructor, Object obj) {
            OooOOO0.OooO0oO(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            OooOOO0.OooO0o(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            OooOOO0.OooO0o(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : Oooo.OooO0OO.OooOOO0(genericParameterTypes, 1, genericParameterTypes.length - 1)));
            this.f126068OooO0o0 = obj;
        }

        @Override // ooOOOoO0.OooO0o
        public final Object call(Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0o.OooO00o.OooO00o(this, args);
            Constructor constructor = (Constructor) this.f126064OooO00o;
            C24037Oooo0OO c24037Oooo0OO = new C24037Oooo0OO(3);
            c24037Oooo0OO.OooO0OO(this.f126068OooO0o0);
            c24037Oooo0OO.OooO0Oo(args);
            c24037Oooo0OO.OooO0OO(null);
            ArrayList arrayList = (ArrayList) c24037Oooo0OO.f80945OooO00o;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC35092OooO0oO<Constructor<?>> {
        @Override // ooOOOoO0.OooO0o
        public final Object call(Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0o.OooO00o.OooO00o(this, args);
            Constructor constructor = (Constructor) this.f126064OooO00o;
            C24037Oooo0OO c24037Oooo0OO = new C24037Oooo0OO(2);
            c24037Oooo0OO.OooO0Oo(args);
            c24037Oooo0OO.OooO0OO(null);
            ArrayList arrayList = (ArrayList) c24037Oooo0OO.f80945OooO00o;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0OO */
    public static final class OooO0OO extends AbstractC35092OooO0oO<Constructor<?>> implements InterfaceC35091OooO0o0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Object f126069OooO0o0;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0OO(Constructor<?> constructor, Object obj) {
            OooOOO0.OooO0oO(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            OooOOO0.OooO0o(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            OooOOO0.OooO0o(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes);
            this.f126069OooO0o0 = obj;
        }

        @Override // ooOOOoO0.OooO0o
        public final Object call(Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0o.OooO00o.OooO00o(this, args);
            Constructor constructor = (Constructor) this.f126064OooO00o;
            C24037Oooo0OO c24037Oooo0OO = new C24037Oooo0OO(2);
            c24037Oooo0OO.OooO0OO(this.f126069OooO0o0);
            c24037Oooo0OO.OooO0Oo(args);
            ArrayList arrayList = (ArrayList) c24037Oooo0OO.f80945OooO00o;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C35093OooO0Oo extends AbstractC35092OooO0oO<Constructor<?>> {
        @Override // ooOOOoO0.OooO0o
        public final Object call(Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0o.OooO00o.OooO00o(this, args);
            return ((Constructor) this.f126064OooO00o).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o */
    public static abstract class OooO0o extends AbstractC35092OooO0oO<Field> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f126070OooO0o0;

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o$OooO00o */
        public static final class OooO00o extends OooO0o implements InterfaceC35091OooO0o0 {

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final Object f126071OooO0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Field field, boolean z, Object obj) {
                super(field, z, false);
                OooOOO0.OooO0oO(field, "field");
                this.f126071OooO0o = obj;
            }

            @Override // ooOOOoO0.AbstractC35092OooO0oO.OooO0o, ooOOOoO0.OooO0o
            public final Object call(Object[] args) throws IllegalAccessException {
                OooOOO0.OooO0oO(args, "args");
                OooO0OO(args);
                ((Field) this.f126064OooO00o).set(this.f126071OooO0o, OooOOO.OooOoo0(args));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o$OooO0O0 */
        public static final class OooO0O0 extends OooO0o implements InterfaceC35091OooO0o0 {
            @Override // ooOOOoO0.AbstractC35092OooO0oO.OooO0o, ooOOOoO0.OooO0o
            public final Object call(Object[] args) throws IllegalAccessException {
                OooOOO0.OooO0oO(args, "args");
                OooO0OO(args);
                ((Field) this.f126064OooO00o).set(null, OooOOO.Oooo0OO(args));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o$OooO0OO */
        public static final class OooO0OO extends OooO0o {
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o$OooO0Oo, reason: case insensitive filesystem */
        public static final class C35094OooO0Oo extends OooO0o {
            @Override // ooOOOoO0.AbstractC35092OooO0oO.OooO0o, ooOOOoO0.AbstractC35092OooO0oO
            public final void OooO0OO(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                super.OooO0OO(args);
                OooO0Oo(OooOOO.OooOoo(args));
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o$OooO0o0, reason: case insensitive filesystem */
        public static final class C35095OooO0o0 extends OooO0o {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0o(Field field, boolean z, boolean z2) {
            Class TYPE = Void.TYPE;
            OooOOO0.OooO0o(TYPE, "TYPE");
            Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            OooOOO0.OooO0o(genericType, "field.genericType");
            super(field, TYPE, declaringClass, new Type[]{genericType});
            this.f126070OooO0o0 = z;
        }

        @Override // ooOOOoO0.AbstractC35092OooO0oO
        public void OooO0OO(Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0o.OooO00o.OooO00o(this, args);
            if (this.f126070OooO0o0 && OooOOO.Oooo0OO(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // ooOOOoO0.OooO0o
        public Object call(Object[] args) throws IllegalAccessException {
            OooOOO0.OooO0oO(args, "args");
            OooO0OO(args);
            ((Field) this.f126064OooO00o).set(this.f126066OooO0OO != null ? OooOOO.OooOoo0(args) : null, OooOOO.Oooo0OO(args));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC35096OooO0o0 extends AbstractC35092OooO0oO<Field> {

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o0$OooO00o */
        public static final class OooO00o extends AbstractC35096OooO0o0 implements InterfaceC35091OooO0o0 {

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final Object f126072OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Field field, Object obj) {
                super(field, false);
                OooOOO0.OooO0oO(field, "field");
                this.f126072OooO0o0 = obj;
            }

            @Override // ooOOOoO0.AbstractC35092OooO0oO.AbstractC35096OooO0o0, ooOOOoO0.OooO0o
            public final Object call(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                OooO0o.OooO00o.OooO00o(this, args);
                return ((Field) this.f126064OooO00o).get(this.f126072OooO0o0);
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o0$OooO0O0 */
        public static final class OooO0O0 extends AbstractC35096OooO0o0 implements InterfaceC35091OooO0o0 {
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o0$OooO0OO */
        public static final class OooO0OO extends AbstractC35096OooO0o0 {
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o0$OooO0Oo, reason: case insensitive filesystem */
        public static final class C35097OooO0Oo extends AbstractC35096OooO0o0 {
            @Override // ooOOOoO0.AbstractC35092OooO0oO
            public final void OooO0OO(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                OooO0o.OooO00o.OooO00o(this, args);
                OooO0Oo(OooOOO.OooOoo(args));
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0o0$OooO0o0, reason: collision with other inner class name */
        public static final class C20378OooO0o0 extends AbstractC35096OooO0o0 {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AbstractC35096OooO0o0(Field field, boolean z) {
            Type genericType = field.getGenericType();
            OooOOO0.OooO0o(genericType, "field.genericType");
            super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
        }

        @Override // ooOOOoO0.OooO0o
        public Object call(Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0OO(args);
            return ((Field) this.f126064OooO00o).get(this.f126066OooO0OO != null ? OooOOO.OooOoo0(args) : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC35092OooO0oO(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> listOoooOO0;
        this.f126064OooO00o = member;
        this.f126065OooO0O0 = type;
        this.f126066OooO0OO = cls;
        if (cls != null) {
            C24037Oooo0OO c24037Oooo0OO = new C24037Oooo0OO(2);
            c24037Oooo0OO.OooO0OO(cls);
            c24037Oooo0OO.OooO0Oo(typeArr);
            ArrayList arrayList = (ArrayList) c24037Oooo0OO.f80945OooO00o;
            listOoooOO0 = C34429OooOOo0.OooOO0o(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listOoooOO0 = OooOOO.OoooOO0(typeArr);
        }
        this.f126067OooO0Oo = listOoooOO0;
    }

    @Override // ooOOOoO0.OooO0o
    public final List<Type> OooO00o() {
        return this.f126067OooO0Oo;
    }

    @Override // ooOOOoO0.OooO0o
    public final M OooO0O0() {
        return this.f126064OooO00o;
    }

    public void OooO0OO(Object[] objArr) {
        OooO0o.OooO00o.OooO00o(this, objArr);
    }

    public final void OooO0Oo(Object obj) {
        if (obj == null || !this.f126064OooO00o.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // ooOOOoO0.OooO0o
    public final Type getReturnType() {
        return this.f126065OooO0O0;
    }

    /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0oO, reason: collision with other inner class name */
    public static abstract class AbstractC20379OooO0oO extends AbstractC35092OooO0oO<Method> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f126073OooO0o0;

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0oO$OooO00o */
        public static final class OooO00o extends AbstractC20379OooO0oO implements InterfaceC35091OooO0o0 {

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final Object f126074OooO0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Method method, Object obj) {
                super(4, method, false);
                OooOOO0.OooO0oO(method, "method");
                this.f126074OooO0o = obj;
            }

            @Override // ooOOOoO0.OooO0o
            public final Object call(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                OooO0o.OooO00o.OooO00o(this, args);
                return OooO0o0(this.f126074OooO0o, args);
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0oO$OooO0O0 */
        public static final class OooO0O0 extends AbstractC20379OooO0oO implements InterfaceC35091OooO0o0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(Method method) {
                super(4, method, false);
                OooOOO0.OooO0oO(method, "method");
            }

            @Override // ooOOOoO0.OooO0o
            public final Object call(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                OooO0o.OooO00o.OooO00o(this, args);
                return OooO0o0(null, args);
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0oO$OooO0OO */
        public static final class OooO0OO extends AbstractC20379OooO0oO implements InterfaceC35091OooO0o0 {

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final Object f126075OooO0o;

            /* JADX WARN: Illegal instructions before constructor call */
            public OooO0OO(Method method, Object obj) {
                OooOOO0.OooO0oO(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                OooOOO0.OooO0o(genericParameterTypes, "method.genericParameterTypes");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : Oooo.OooO0OO.OooOOO0(genericParameterTypes, 1, genericParameterTypes.length)));
                this.f126075OooO0o = obj;
            }

            @Override // ooOOOoO0.OooO0o
            public final Object call(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                OooO0o.OooO00o.OooO00o(this, args);
                C24037Oooo0OO c24037Oooo0OO = new C24037Oooo0OO(2);
                c24037Oooo0OO.OooO0OO(this.f126075OooO0o);
                c24037Oooo0OO.OooO0Oo(args);
                ArrayList arrayList = (ArrayList) c24037Oooo0OO.f80945OooO00o;
                return OooO0o0(null, arrayList.toArray(new Object[arrayList.size()]));
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0oO$OooO0Oo, reason: case insensitive filesystem */
        public static final class C35098OooO0Oo extends AbstractC20379OooO0oO {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C35098OooO0Oo(Method method) {
                super(6, method, false);
                OooOOO0.OooO0oO(method, "method");
            }

            @Override // ooOOOoO0.OooO0o
            public final Object call(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                OooO0o.OooO00o.OooO00o(this, args);
                return OooO0o0(args[0], args.length <= 1 ? new Object[0] : Oooo.OooO0OO.OooOOO0(args, 1, args.length));
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0oO$OooO0o */
        public static final class OooO0o extends AbstractC20379OooO0oO {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(Method method) {
                super(6, method, false);
                OooOOO0.OooO0oO(method, "method");
            }

            @Override // ooOOOoO0.OooO0o
            public final Object call(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                OooO0o.OooO00o.OooO00o(this, args);
                return OooO0o0(null, args);
            }
        }

        /* JADX INFO: renamed from: ooOOOoO0.OooO0oO$OooO0oO$OooO0o0, reason: case insensitive filesystem */
        public static final class C35099OooO0o0 extends AbstractC20379OooO0oO {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C35099OooO0o0(Method method) {
                super(4, method, true);
                OooOOO0.OooO0oO(method, "method");
            }

            @Override // ooOOOoO0.OooO0o
            public final Object call(Object[] args) {
                OooOOO0.OooO0oO(args, "args");
                OooO0o.OooO00o.OooO00o(this, args);
                OooO0Oo(OooOOO.OooOoo(args));
                return OooO0o0(null, args.length <= 1 ? new Object[0] : Oooo.OooO0OO.OooOOO0(args, 1, args.length));
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AbstractC20379OooO0oO(int i, Method method, boolean z) {
            z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            OooOOO0.OooO0o(genericParameterTypes, "method.genericParameterTypes");
            this(method, z, genericParameterTypes);
        }

        public final Object OooO0o0(Object obj, Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            return this.f126073OooO0o0 ? C32460OooOooO.f116667OooO00o : ((Method) this.f126064OooO00o).invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AbstractC20379OooO0oO(Method method, boolean z, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            OooOOO0.OooO0o(genericReturnType, "method.genericReturnType");
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
            this.f126073OooO0o0 = genericReturnType.equals(Void.TYPE);
        }
    }
}

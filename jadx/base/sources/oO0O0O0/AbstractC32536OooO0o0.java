package oO0O0O0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import o000OoO.C24536OooO0Oo;
import o0Oo0ooO.C28461OooooOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0oO0.C32730OooO0Oo;
import oO0OOO.AbstractC32933OooO0Oo;

/* JADX INFO: renamed from: oO0O0O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32536OooO0o0 {

    /* JADX INFO: renamed from: oO0O0O0.OooO0o0$OooO00o */
    public static final class OooO00o extends AbstractC32536OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<Method> f116910OooO00o;

        /* JADX INFO: renamed from: oO0O0O0.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20240OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Method, CharSequence> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final C20240OooO00o f116911OooOo0o = new C20240OooO00o(1);

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                kotlin.jvm.internal.OooOOO0.OooO0o(returnType, "it.returnType");
                return C32730OooO0Oo.OooO0O0(returnType);
            }
        }

        /* JADX INFO: renamed from: oO0O0O0.OooO0o0$OooO00o$OooO0O0 */
        public static final class OooO0O0<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C24536OooO0Oo.OooO0O0(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        public OooO00o(Class<?> jClass) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(jClass, "jClass");
            Method[] declaredMethods = jClass.getDeclaredMethods();
            kotlin.jvm.internal.OooOOO0.OooO0o(declaredMethods, "jClass.declaredMethods");
            this.f116910OooO00o = oOo000Oo.OooOOO.Oooo0oO(declaredMethods, new OooO0O0());
        }

        @Override // oO0O0O0.AbstractC32536OooO0o0
        public final String OooO00o() {
            return oOo000Oo.OooOo.o000oOoO(this.f116910OooO00o, "", "<init>(", ")V", C20240OooO00o.f116911OooOo0o, 24);
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32536OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Constructor<?> f116912OooO00o;

        /* JADX INFO: renamed from: oO0O0O0.OooO0o0$OooO0O0$OooO00o */
        public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Class<?>, CharSequence> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final OooO00o f116913OooOo0o = new OooO00o(1);

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final CharSequence invoke(Class<?> cls) {
                Class<?> it = cls;
                kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
                return C32730OooO0Oo.OooO0O0(it);
            }
        }

        public OooO0O0(Constructor<?> constructor) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(constructor, "constructor");
            this.f116912OooO00o = constructor;
        }

        @Override // oO0O0O0.AbstractC32536OooO0o0
        public final String OooO00o() {
            Class<?>[] parameterTypes = this.f116912OooO00o.getParameterTypes();
            kotlin.jvm.internal.OooOOO0.OooO0o(parameterTypes, "constructor.parameterTypes");
            return oOo000Oo.OooOOO.Oooo0O0(parameterTypes, "", "<init>(", ")V", OooO00o.f116913OooOo0o, 24);
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0o0$OooO0OO */
    public static final class OooO0OO extends AbstractC32536OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f116914OooO00o;

        public OooO0OO(Method method) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(method, "method");
            this.f116914OooO00o = method;
        }

        @Override // oO0O0O0.AbstractC32536OooO0o0
        public final String OooO00o() {
            return C28461OooooOO.OooO00o(this.f116914OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32537OooO0Oo extends AbstractC32536OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC32933OooO0Oo.OooO0O0 f116915OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f116916OooO0O0;

        public C32537OooO0Oo(AbstractC32933OooO0Oo.OooO0O0 oooO0O0) {
            this.f116915OooO00o = oooO0O0;
            this.f116916OooO0O0 = oooO0O0.OooO00o();
        }

        @Override // oO0O0O0.AbstractC32536OooO0o0
        public final String OooO00o() {
            return this.f116916OooO0O0;
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0o0$OooO0o0, reason: collision with other inner class name */
    public static final class C20241OooO0o0 extends AbstractC32536OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC32933OooO0Oo.OooO0O0 f116917OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f116918OooO0O0;

        public C20241OooO0o0(AbstractC32933OooO0Oo.OooO0O0 oooO0O0) {
            this.f116917OooO00o = oooO0O0;
            this.f116918OooO0O0 = oooO0O0.OooO00o();
        }

        @Override // oO0O0O0.AbstractC32536OooO0o0
        public final String OooO00o() {
            return this.f116918OooO0O0;
        }
    }

    public abstract String OooO00o();
}

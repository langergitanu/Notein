package ooOOOoO0;

import OooOoOO.C20519OooO0Oo;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32447OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f126060OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Map<String, ? extends Object> map) {
            super(0);
            this.f126060OooOo0o = map;
        }

        @Override // oO0O000o.OooO00o
        public final Integer invoke() {
            Iterator<T> it = this.f126060OooOo0o.entrySet().iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(iHashCode);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<String> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f126061OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Class<T> f126062OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f126062OooOo0o = cls;
            this.f126061OooOo = map;
        }

        @Override // oO0O000o.OooO00o
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(this.f126062OooOo0o.getCanonicalName());
            OooOo.OoooOO0(this.f126061OooOo.entrySet(), sb, ", ", "(", ")", C35090OooO0Oo.f126063OooOo0o, 48);
            String string = sb.toString();
            OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public static final <T> T OooO00o(Class<T> annotationClass, Map<String, ? extends Object> map, List<Method> methods) {
        OooOOO0.OooO0oO(annotationClass, "annotationClass");
        OooOOO0.OooO0oO(methods, "methods");
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO00o(map));
        T t = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new ooOOOoO0.OooO0O0(annotationClass, map, C20519OooO0Oo.OooO0OO(new OooO0O0(annotationClass, map)), c32447OooOOoOooO0OO, methods));
        OooOOO0.OooO0o0(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t;
    }
}

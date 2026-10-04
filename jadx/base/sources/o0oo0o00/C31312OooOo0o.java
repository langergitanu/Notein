package o0oo0o00;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import o0oo0o0.C31286OooO0O0;
import o0oo0o00.AbstractC31298OooOO0o;

/* JADX INFO: renamed from: o0oo0o00.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31312OooOo0o<K, V> extends AbstractC31298OooOO0o<Map<K, V>> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f111815OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC31298OooOO0o<K> f111816OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC31298OooOO0o<V> f111817OooO0O0;

    /* JADX INFO: renamed from: o0oo0o00.OooOo0o$OooO00o */
    public class OooO00o implements AbstractC31298OooOO0o.OooO00o {
        @Override // o0oo0o00.AbstractC31298OooOO0o.OooO00o
        public final AbstractC31298OooOO0o<?> OooO00o(Type type, Set<? extends Annotation> set, C31306OooOo c31306OooOo) {
            Class<?> clsOooO0OO;
            Type[] actualTypeArguments;
            if (!set.isEmpty() || (clsOooO0OO = C31320OooOoOO.OooO0OO(type)) != Map.class) {
                return null;
            }
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else {
                if (!Map.class.isAssignableFrom(clsOooO0OO)) {
                    throw new IllegalArgumentException();
                }
                Type typeOooO0o0 = C31286OooO0O0.OooO0o0(type, clsOooO0OO, C31286OooO0O0.OooO0OO(type, clsOooO0OO, Map.class), new LinkedHashSet());
                actualTypeArguments = typeOooO0o0 instanceof ParameterizedType ? ((ParameterizedType) typeOooO0o0).getActualTypeArguments() : new Type[]{Object.class, Object.class};
            }
            return new C31312OooOo0o(c31306OooOo, actualTypeArguments[0], actualTypeArguments[1]).OooO0O0();
        }
    }

    public C31312OooOo0o(C31306OooOo c31306OooOo, Type type, Type type2) {
        c31306OooOo.getClass();
        Set<Annotation> set = C31286OooO0O0.f111706OooO00o;
        this.f111816OooO00o = c31306OooOo.OooO0O0(type, set, null);
        this.f111817OooO0O0 = c31306OooOo.OooO0O0(type2, set, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0oo0o00.AbstractC31298OooOO0o
    public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
        C31309OooOo0O c31309OooOo0O = new C31309OooOo0O();
        c31303OooOOo.OooOOoo();
        while (c31303OooOOo.o00Oo0()) {
            if (c31303OooOOo.o00Oo0()) {
                c31303OooOOo.f111746Oooo000 = c31303OooOOo.o0000oO();
                c31303OooOOo.f111742OooOoo = 11;
            }
            Object objOooO00o = this.f111816OooO00o.OooO00o(c31303OooOOo);
            Object objOooO00o2 = this.f111817OooO0O0.OooO00o(c31303OooOOo);
            Object objPut = c31309OooOo0O.put(objOooO00o, objOooO00o2);
            if (objPut != null) {
                throw new C31299OooOOO("Map key '" + objOooO00o + "' has multiple values at path " + c31303OooOOo.OooO00o() + ": " + objPut + " and " + objOooO00o2);
            }
        }
        c31303OooOOo.Oooo0();
        return c31309OooOo0O;
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
        c31305OooOOoo.OooOooo();
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                throw new C31299OooOOO("Map key is null at " + c31305OooOOoo.OooO00o());
            }
            int iOooO0OO = c31305OooOOoo.OooO0OO();
            if (iOooO0OO != 5 && iOooO0OO != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            c31305OooOOoo.f111784OooOoOO = true;
            this.f111816OooO00o.OooO0OO(c31305OooOOoo, entry.getKey());
            this.f111817OooO0O0.OooO0OO(c31305OooOOoo, entry.getValue());
        }
        c31305OooOOoo.Oooo0();
    }

    public final String toString() {
        return "JsonAdapter(" + this.f111816OooO00o + "=" + this.f111817OooO0O0 + ")";
    }
}

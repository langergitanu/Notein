package o0oo0o00;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import o0oo0o0.C31286OooO0O0;
import o0oo0o00.AbstractC31298OooOO0o;

/* JADX INFO: renamed from: o0oo0o00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31288OooO00o extends AbstractC31298OooOO0o<Object> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C20170OooO00o f111716OooO0OO = new C20170OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f111717OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC31298OooOO0o<Object> f111718OooO0O0;

    /* JADX INFO: renamed from: o0oo0o00.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C20170OooO00o implements AbstractC31298OooOO0o.OooO00o {
        @Override // o0oo0o00.AbstractC31298OooOO0o.OooO00o
        public final AbstractC31298OooOO0o<?> OooO00o(Type type, Set<? extends Annotation> set, C31306OooOo c31306OooOo) {
            Type genericComponentType = type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : type instanceof Class ? ((Class) type).getComponentType() : null;
            if (genericComponentType == null || !set.isEmpty()) {
                return null;
            }
            Class<?> clsOooO0OO = C31320OooOoOO.OooO0OO(genericComponentType);
            c31306OooOo.getClass();
            return new C31288OooO00o(clsOooO0OO, c31306OooOo.OooO0O0(genericComponentType, C31286OooO0O0.f111706OooO00o, null)).OooO0O0();
        }
    }

    public C31288OooO00o(Class<?> cls, AbstractC31298OooOO0o<Object> abstractC31298OooOO0o) {
        this.f111717OooO00o = cls;
        this.f111718OooO0O0 = abstractC31298OooOO0o;
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
        ArrayList arrayList = new ArrayList();
        c31303OooOOo.OooOOo0();
        while (c31303OooOOo.o00Oo0()) {
            arrayList.add(this.f111718OooO0O0.OooO00o(c31303OooOOo));
        }
        c31303OooOOo.Oooo00o();
        Object objNewInstance = Array.newInstance(this.f111717OooO00o, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
        c31305OooOOoo.OooOOoo();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f111718OooO0O0.OooO0OO(c31305OooOOoo, Array.get(obj, i));
        }
        c31305OooOOoo.Oooo00o();
    }

    public final String toString() {
        return this.f111718OooO0O0 + ".array()";
    }
}

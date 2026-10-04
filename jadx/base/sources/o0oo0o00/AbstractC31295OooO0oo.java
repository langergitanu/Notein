package o0oo0o00;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0oo0o0.C31286OooO0O0;
import o0oo0o00.AbstractC31298OooOO0o;

/* JADX INFO: renamed from: o0oo0o00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31295OooO0oo<C extends Collection<T>, T> extends AbstractC31298OooOO0o<C> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f111736OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC31298OooOO0o<T> f111737OooO00o;

    /* JADX INFO: renamed from: o0oo0o00.OooO0oo$OooO00o */
    public class OooO00o implements AbstractC31298OooOO0o.OooO00o {
        @Override // o0oo0o00.AbstractC31298OooOO0o.OooO00o
        public final AbstractC31298OooOO0o<?> OooO00o(Type type, Set<? extends Annotation> set, C31306OooOo c31306OooOo) {
            Class<?> clsOooO0OO = C31320OooOoOO.OooO0OO(type);
            if (set.isEmpty()) {
                if (clsOooO0OO == List.class || clsOooO0OO == Collection.class) {
                    Type typeOooO00o = C31320OooOoOO.OooO00o(type);
                    c31306OooOo.getClass();
                    return new C31287OooO(c31306OooOo.OooO0O0(typeOooO00o, C31286OooO0O0.f111706OooO00o, null)).OooO0O0();
                }
                if (clsOooO0OO == Set.class) {
                    Type typeOooO00o2 = C31320OooOoOO.OooO00o(type);
                    c31306OooOo.getClass();
                    return new C31296OooOO0(c31306OooOo.OooO0O0(typeOooO00o2, C31286OooO0O0.f111706OooO00o, null)).OooO0O0();
                }
            }
            return null;
        }
    }

    public AbstractC31295OooO0oo(AbstractC31298OooOO0o abstractC31298OooOO0o) {
        this.f111737OooO00o = abstractC31298OooOO0o;
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
        Collection collectionOooO0Oo = OooO0Oo();
        c31303OooOOo.OooOOo0();
        while (c31303OooOOo.o00Oo0()) {
            collectionOooO0Oo.add(this.f111737OooO00o.OooO00o(c31303OooOOo));
        }
        c31303OooOOo.Oooo00o();
        return collectionOooO0Oo;
    }

    @Override // o0oo0o00.AbstractC31298OooOO0o
    public void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
        c31305OooOOoo.OooOOoo();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.f111737OooO00o.OooO0OO(c31305OooOOoo, it.next());
        }
        c31305OooOOoo.Oooo00o();
    }

    public abstract C OooO0Oo();

    public final String toString() {
        return this.f111737OooO00o + ".collection()";
    }
}

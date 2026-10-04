package o0oo0o00;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import o0oo0o0.C31285OooO00o;

/* JADX INFO: renamed from: o0oo0o00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31298OooOO0o<T> {

    /* JADX INFO: renamed from: o0oo0o00.OooOO0o$OooO00o */
    public interface OooO00o {
        AbstractC31298OooOO0o<?> OooO00o(Type type, Set<? extends Annotation> set, C31306OooOo c31306OooOo);
    }

    public abstract Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException;

    public final C31285OooO00o OooO0O0() {
        return this instanceof C31285OooO00o ? (C31285OooO00o) this : new C31285OooO00o(this);
    }

    public abstract void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException;
}

package o0oo0o00;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o0oo0o00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31293OooO0o0 extends AbstractC31292OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f111727OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Class f111728OooO0O0;

    public C31293OooO0o0(Method method, Class cls) {
        this.f111727OooO00o = method;
        this.f111728OooO0O0 = cls;
    }

    @Override // o0oo0o00.AbstractC31292OooO0o
    public final Object OooO00o() throws IllegalAccessException, InvocationTargetException {
        return this.f111727OooO00o.invoke(null, this.f111728OooO0O0, Object.class);
    }

    public final String toString() {
        return this.f111728OooO0O0.getName();
    }
}

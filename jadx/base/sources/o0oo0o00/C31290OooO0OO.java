package o0oo0o00;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o0oo0o00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31290OooO0OO extends AbstractC31292OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f111721OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f111722OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Class f111723OooO0OO;

    public C31290OooO0OO(Method method, Object obj, Class cls) {
        this.f111721OooO00o = method;
        this.f111722OooO0O0 = obj;
        this.f111723OooO0OO = cls;
    }

    @Override // o0oo0o00.AbstractC31292OooO0o
    public final Object OooO00o() throws IllegalAccessException, InvocationTargetException {
        return this.f111721OooO00o.invoke(this.f111722OooO0O0, this.f111723OooO0OO);
    }

    public final String toString() {
        return this.f111723OooO0OO.getName();
    }
}

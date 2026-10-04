package o0oo0o00;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o0oo0o00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31291OooO0Oo extends AbstractC31292OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f111724OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Class f111725OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f111726OooO0OO;

    public C31291OooO0Oo(Method method, Class cls, int i) {
        this.f111724OooO00o = method;
        this.f111725OooO0O0 = cls;
        this.f111726OooO0OO = i;
    }

    @Override // o0oo0o00.AbstractC31292OooO0o
    public final Object OooO00o() throws IllegalAccessException, InvocationTargetException {
        return this.f111724OooO00o.invoke(null, this.f111725OooO0O0, Integer.valueOf(this.f111726OooO0OO));
    }

    public final String toString() {
        return this.f111725OooO0O0.getName();
    }
}

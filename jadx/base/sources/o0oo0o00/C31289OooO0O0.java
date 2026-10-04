package o0oo0o00;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o0oo0o00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31289OooO0O0 extends AbstractC31292OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Constructor f111719OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Class f111720OooO0O0;

    public C31289OooO0O0(Class cls, Constructor constructor) {
        this.f111719OooO00o = constructor;
        this.f111720OooO0O0 = cls;
    }

    @Override // o0oo0o00.AbstractC31292OooO0o
    public final Object OooO00o() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        return this.f111719OooO00o.newInstance(null);
    }

    public final String toString() {
        return this.f111720OooO0O0.getName();
    }
}

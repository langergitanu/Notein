package o00O00o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00O00o.OooO0OO;

/* JADX INFO: renamed from: o00O00o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24808OooO0Oo implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Method f84136OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f84137OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f84138OooO0OO;

    public C24808OooO0Oo(Method method, Object obj, Object obj2) {
        this.f84136OooO00o = method;
        this.f84137OooO0O0 = obj;
        this.f84138OooO0OO = obj2;
    }

    @Override // o00O00o.OooO0OO.OooO0O0
    public final void dispose() throws IllegalAccessException, InvocationTargetException {
        this.f84136OooO00o.invoke(this.f84137OooO0O0, this.f84138OooO0OO);
    }
}

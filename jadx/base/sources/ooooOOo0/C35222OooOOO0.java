package ooooOOo0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ooooOOo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35222OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f126456OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<?> f126457OooO0O0;

    public C35222OooOOO0(Method method, ArrayList arrayList) {
        this.f126456OooO00o = method;
        this.f126457OooO0O0 = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f126456OooO00o;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f126457OooO0O0);
    }
}

package oO0O0O0;

import java.util.Comparator;

/* JADX INFO: renamed from: oO0O0O0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32553OooOOo0 implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32555OooOo0 f116982OooOo0o;

    public C32553OooOOo0(C32555OooOo0 c32555OooOo0) {
        this.f116982OooOo0o = c32555OooOo0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C32555OooOo0 tmp0 = this.f116982OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }
}

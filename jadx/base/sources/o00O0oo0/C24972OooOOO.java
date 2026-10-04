package o00O0oo0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o00O0oo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24972OooOOO implements InterfaceC24962OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f84690OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<InterfaceC24962OooO0O0> f84691OooO0O0;

    public C24972OooOOO(List list, String str, boolean z) {
        this.f84690OooO00o = str;
        this.f84691OooO0O0 = list;
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f84690OooO00o + "' Shapes: " + Arrays.toString(this.f84691OooO0O0.toArray()) + '}';
    }
}

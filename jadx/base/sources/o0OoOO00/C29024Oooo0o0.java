package o0OoOO00;

import oO0Oo0oo.InterfaceC33225OooO00o;
import oO0Oo0oo.InterfaceC33226OooO0O0;

/* JADX INFO: renamed from: o0OoOO00.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29024Oooo0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f102834OooO00o = 0;

    public static Object OooO00o(Class cls, Object obj) {
        if (obj instanceof InterfaceC33225OooO00o) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC33226OooO0O0) {
            return OooO00o(cls, ((InterfaceC33226OooO0O0) obj).generatedComponent());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + InterfaceC33225OooO00o.class + " or " + InterfaceC33226OooO0O0.class);
    }
}

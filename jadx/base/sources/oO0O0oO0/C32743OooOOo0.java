package oO0O0oO0;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34596OooO0o;

/* JADX INFO: renamed from: oO0O0oO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32743OooOOo0 extends kotlin.jvm.internal.OooOO0O implements InterfaceC32507OooOO0o<Method, C32752OooOoOO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32743OooOOo0 f117687OooOo0o = new C32743OooOOo0(1);

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final InterfaceC34596OooO0o getOwner() {
        return C24035Oooo00o.f80943OooO00o.OooO0O0(C32752OooOoOO.class);
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32752OooOoOO invoke(Method method) {
        Method p0 = method;
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
        return new C32752OooOoOO(p0);
    }
}

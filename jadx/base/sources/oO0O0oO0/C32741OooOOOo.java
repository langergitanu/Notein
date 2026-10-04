package oO0O0oO0;

import com.huawei.hms.network.embedded.C18437z2;
import java.lang.reflect.Method;
import java.util.Arrays;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0O0oO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32741OooOOOo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Method, Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32742OooOOo f117685OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32741OooOOOo(C32742OooOOo c32742OooOOo) {
        super(1);
        this.f117685OooOo0o = c32742OooOOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(Method method) {
        boolean zEquals;
        Method method2 = method;
        boolean z = false;
        if (!method2.isSynthetic()) {
            if (this.f117685OooOo0o.f117686OooO00o.isEnum()) {
                String name = method2.getName();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(name, C18437z2.f56756j)) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    kotlin.jvm.internal.OooOOO0.OooO0o(parameterTypes, "method.parameterTypes");
                    zEquals = parameterTypes.length == 0;
                    if (!zEquals) {
                        z = true;
                    }
                } else {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(name, "valueOf")) {
                        zEquals = Arrays.equals(method2.getParameterTypes(), new Class[]{String.class});
                    }
                    if (!zEquals) {
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}

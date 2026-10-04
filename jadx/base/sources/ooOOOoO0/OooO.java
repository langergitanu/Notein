package ooOOOoO0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;
import ooOOOoO0.OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO implements OooO0o<Method> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f126038OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Type> f126039OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Class f126040OooO0OO;

    public static final class OooO00o extends OooO implements InterfaceC35091OooO0o0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object f126041OooO0Oo;

        public OooO00o(Method method, Object obj) {
            super(method, C34434OooOoO.f123453OooOo0o);
            this.f126041OooO0Oo = obj;
        }

        @Override // ooOOOoO0.OooO0o
        public final Object call(Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0o.OooO00o.OooO00o(this, args);
            return this.f126038OooO00o.invoke(this.f126041OooO0Oo, Arrays.copyOf(args, args.length));
        }
    }

    public static final class OooO0O0 extends OooO {
        @Override // ooOOOoO0.OooO0o
        public final Object call(Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0o.OooO00o.OooO00o(this, args);
            Object obj = args[0];
            Object[] objArrOooOOO0 = args.length <= 1 ? new Object[0] : Oooo.OooO0OO.OooOOO0(args, 1, args.length);
            return this.f126038OooO00o.invoke(obj, Arrays.copyOf(objArrOooOOO0, objArrOooOOO0.length));
        }
    }

    public OooO(Method method, List list) {
        this.f126038OooO00o = method;
        this.f126039OooO0O0 = list;
        Class<?> returnType = method.getReturnType();
        OooOOO0.OooO0o(returnType, "unboxMethod.returnType");
        this.f126040OooO0OO = returnType;
    }

    @Override // ooOOOoO0.OooO0o
    public final List<Type> OooO00o() {
        return this.f126039OooO0O0;
    }

    @Override // ooOOOoO0.OooO0o
    public final /* bridge */ /* synthetic */ Member OooO0O0() {
        return null;
    }

    @Override // ooOOOoO0.OooO0o
    public final Type getReturnType() {
        return this.f126040OooO0OO;
    }
}

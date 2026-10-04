package ooOOOoO0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o00OOooo.C25022OooO0O0;
import oO0O0O0.C32579OoooO0O;
import oO0O0O0.C32585OoooOoo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooOO0O;
import oO0OOOo.C32992OooOO0O;
import oO0Ooo.AbstractC33320OooOoo;
import ooOOOoO0.AbstractC35092OooO0oO;

/* JADX INFO: renamed from: ooOOOoO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35100OooO0oo<M extends Member> implements OooO0o<M> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o<M> f126076OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f126077OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f126078OooO0OO;

    /* JADX INFO: renamed from: ooOOOoO0.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO0O00oo.OooO f126079OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method[] f126080OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Method f126081OooO0OO;

        public OooO00o(oO0O00oo.OooO argumentRange, Method[] methodArr, Method method) {
            OooOOO0.OooO0oO(argumentRange, "argumentRange");
            this.f126079OooO00o = argumentRange;
            this.f126080OooO0O0 = methodArr;
            this.f126081OooO0OO = method;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C35100OooO0oo(InterfaceC32609OooOo0 descriptor, OooO0o oooO0o, boolean z) {
        Method declaredMethod;
        OooO00o oooO00o;
        Class clsOooOO0;
        OooOOO0.OooO0oO(descriptor, "descriptor");
        this.f126076OooO00o = oooO0o;
        this.f126077OooO0O0 = z;
        AbstractC33320OooOoo returnType = descriptor.getReturnType();
        OooOOO0.OooO0Oo(returnType);
        Class clsOooOO02 = C25022OooO0O0.OooOO0(returnType);
        if (clsOooOO02 != null) {
            try {
                declaredMethod = clsOooOO02.getDeclaredMethod("box-impl", C25022OooO0O0.OooO0oO(clsOooOO02, descriptor).getReturnType());
                OooOOO0.OooO0o(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new C32579OoooO0O("No box method found in inline class: " + clsOooOO02 + " (calling " + descriptor + ')');
            }
        } else {
            declaredMethod = null;
        }
        int i = 0;
        if (C32992OooOO0O.OooO00o(descriptor)) {
            oooO00o = new OooO00o(oO0O00oo.OooO.f116803OooOoO, new Method[0], declaredMethod);
        } else {
            int i2 = -1;
            if (!(oooO0o instanceof AbstractC35092OooO0oO.AbstractC20379OooO0oO.OooO0OO)) {
                if (descriptor instanceof oO0O0OO.OooOO0) {
                    if (!(oooO0o instanceof InterfaceC35091OooO0o0)) {
                        i2 = 0;
                    }
                } else if (descriptor.OoooOo0() != null && !(oooO0o instanceof InterfaceC35091OooO0o0)) {
                    OooOO0O oooOO0OOooO0Oo = descriptor.OooO0Oo();
                    OooOOO0.OooO0o(oooOO0OOooO0Oo, "descriptor.containingDeclaration");
                    if (!C32992OooOO0O.OooO0O0(oooOO0OOooO0Oo)) {
                        i2 = 1;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            InterfaceC32629OoooO0 interfaceC32629OoooO0OoooOoo = descriptor.OoooOoo();
            AbstractC33320OooOoo type = interfaceC32629OoooO0OoooOoo != null ? interfaceC32629OoooO0OoooOoo.getType() : null;
            if (type != null) {
                arrayList.add(type);
            } else if (descriptor instanceof oO0O0OO.OooOO0) {
                InterfaceC32596OooO0o0 interfaceC32596OooO0o0Oooo00O = ((oO0O0OO.OooOO0) descriptor).Oooo00O();
                OooOOO0.OooO0o(interfaceC32596OooO0o0Oooo00O, "descriptor.constructedClass");
                if (interfaceC32596OooO0o0Oooo00O.OooOo00()) {
                    OooOO0O oooOO0OOooO0Oo2 = interfaceC32596OooO0o0Oooo00O.OooO0Oo();
                    OooOOO0.OooO0o0(oooOO0OOooO0Oo2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((InterfaceC32596OooO0o0) oooOO0OOooO0Oo2).OooOOO());
                }
            } else {
                OooOO0O oooOO0OOooO0Oo3 = descriptor.OooO0Oo();
                OooOOO0.OooO0o(oooOO0OOooO0Oo3, "descriptor.containingDeclaration");
                if ((oooOO0OOooO0Oo3 instanceof InterfaceC32596OooO0o0) && C32992OooOO0O.OooO0O0(oooOO0OOooO0Oo3)) {
                    arrayList.add(((InterfaceC32596OooO0o0) oooOO0OOooO0Oo3).OooOOO());
                }
            }
            List<InterfaceC32641OooooOO> listOooO0o = descriptor.OooO0o();
            OooOOO0.OooO0o(listOooO0o, "descriptor.valueParameters");
            Iterator<T> it = listOooO0o.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC32641OooooOO) it.next()).getType());
            }
            int size = arrayList.size() + i2 + (descriptor.isSuspend() ? 1 : 0) + (this.f126077OooO0O0 ? ((arrayList.size() + 31) / 32) + 1 : 0);
            if (o000ooOO.OooOOO0.OooO0OO(this) != size) {
                throw new C32579OoooO0O("Inconsistent number of parameters in the descriptor and Java reflection object: " + o000ooOO.OooOOO0.OooO0OO(this) + " != " + size + "\nCalling: " + descriptor + "\nParameter types: " + this.f126076OooO00o.OooO00o() + ")\nDefault: " + this.f126077OooO0O0);
            }
            oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(Math.max(i2, 0), arrayList.size() + i2);
            Method[] methodArr = new Method[size];
            while (i < size) {
                methodArr[i] = (i > OooO2.f116811OooOo || OooO2.f116812OooOo0o > i || (clsOooOO0 = C25022OooO0O0.OooOO0((AbstractC33320OooOoo) arrayList.get(i - i2))) == null) ? null : C25022OooO0O0.OooO0oO(clsOooOO0, descriptor);
                i++;
            }
            oooO00o = new OooO00o(OooO2, methodArr, declaredMethod);
        }
        this.f126078OooO0OO = oooO00o;
    }

    @Override // ooOOOoO0.OooO0o
    public final List<Type> OooO00o() {
        return this.f126076OooO00o.OooO00o();
    }

    @Override // ooOOOoO0.OooO0o
    public final M OooO0O0() {
        return (M) this.f126076OooO00o.OooO0O0();
    }

    @Override // ooOOOoO0.OooO0o
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        OooOOO0.OooO0oO(args, "args");
        OooO00o oooO00o = this.f126078OooO0OO;
        oO0O00oo.OooO oooO = oooO00o.f126079OooO00o;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, size)");
        int i = oooO.f116812OooOo0o;
        int i2 = oooO.f116811OooOo;
        if (i <= i2) {
            while (true) {
                Method method = oooO00o.f126080OooO0O0[i];
                Object objOooO0o0 = args[i];
                if (method != null) {
                    if (objOooO0o0 != null) {
                        objOooO0o0 = method.invoke(objOooO0o0, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        OooOOO0.OooO0o(returnType, "method.returnType");
                        objOooO0o0 = C32585OoooOoo.OooO0o0(returnType);
                    }
                }
                objArrCopyOf[i] = objOooO0o0;
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        Object objCall = this.f126076OooO00o.call(objArrCopyOf);
        Method method2 = oooO00o.f126081OooO0OO;
        return (method2 == null || (objInvoke = method2.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // ooOOOoO0.OooO0o
    public final Type getReturnType() {
        return this.f126076OooO00o.getReturnType();
    }
}

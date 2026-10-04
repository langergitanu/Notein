package oO0O0O0;

import Oooo0oO.C21053Oooo00o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000OOo.C24217OooO0O0;
import oO0O0O0.C32580OoooOO0;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0oOo.InterfaceC32771OooO00o;
import oO0OOOo.C32992OooOO0O;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOoo0.C34614OooOo0o;
import oOoo0.EnumC34612OooOo00;
import oOoo0.InterfaceC34594OooO0OO;
import oOoo0.InterfaceC34601OooOO0O;
import oOoo0.InterfaceC34606OooOOOo;
import oOoo0.InterfaceC34608OooOOo0;

/* JADX INFO: renamed from: oO0O0O0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32538OooO0oO<R> implements InterfaceC34594OooO0OO<R>, InterfaceC32577OoooO0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o<List<Annotation>> f116920OooOo0o = C32580OoooOO0.OooO00o(null, new OooO0O0(this));

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o<ArrayList<InterfaceC34601OooOO0O>> f116919OooOo = C32580OoooOO0.OooO00o(null, new OooO0OO(this));

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o<C32567Oooo> f116922OooOoO0 = C32580OoooOO0.OooO00o(null, new C32539OooO0Oo(this));

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o<List<C32578OoooO00>> f116921OooOoO = C32580OoooOO0.OooO00o(null, new C32540OooO0o0(this));

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o<Object[]> f116923OooOoOO = C32580OoooOO0.OooO00o(null, new OooO00o(this));

    /* JADX INFO: renamed from: oO0O0O0.OooO0oO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Object[]> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC32538OooO0oO<R> f116924OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(AbstractC32538OooO0oO<? extends R> abstractC32538OooO0oO) {
            super(0);
            this.f116924OooOo0o = abstractC32538OooO0oO;
        }

        @Override // oO0O000o.OooO00o
        public final Object[] invoke() {
            AbstractC32538OooO0oO<R> abstractC32538OooO0oO = this.f116924OooOo0o;
            int size = (abstractC32538OooO0oO.isSuspend() ? 1 : 0) + abstractC32538OooO0oO.getParameters().size();
            int size2 = (abstractC32538OooO0oO.getParameters().size() + 31) / 32;
            Object[] objArr = new Object[size + size2 + 1];
            for (InterfaceC34601OooOO0O interfaceC34601OooOO0O : abstractC32538OooO0oO.getParameters()) {
                if (interfaceC34601OooOO0O.OooO0o()) {
                    C32567Oooo type = interfaceC34601OooOO0O.getType();
                    C33477OooO0OO c33477OooO0OO = C32585OoooOoo.f117091OooO00o;
                    AbstractC33320OooOoo abstractC33320OooOoo = type.f117034OooOo0o;
                    if (abstractC33320OooOoo == null || !C32992OooOO0O.OooO0OO(abstractC33320OooOoo)) {
                        int index = interfaceC34601OooOO0O.getIndex();
                        C32567Oooo type2 = interfaceC34601OooOO0O.getType();
                        Type typeOooO0OO = type2.OooO0OO();
                        if (typeOooO0OO == null) {
                            typeOooO0OO = C34614OooOo0o.OooO0Oo(type2);
                        }
                        objArr[index] = C32585OoooOoo.OooO0o0(typeOooO0OO);
                    }
                }
                if (interfaceC34601OooOO0O.OooO00o()) {
                    objArr[interfaceC34601OooOO0O.getIndex()] = AbstractC32538OooO0oO.OooO(interfaceC34601OooOO0O.getType());
                }
            }
            for (int i = 0; i < size2; i++) {
                objArr[size + i] = 0;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0oO$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends Annotation>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC32538OooO0oO<R> f116925OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(AbstractC32538OooO0oO<? extends R> abstractC32538OooO0oO) {
            super(0);
            this.f116925OooOo0o = abstractC32538OooO0oO;
        }

        @Override // oO0O000o.OooO00o
        public final List<? extends Annotation> invoke() {
            return C32585OoooOoo.OooO0Oo(this.f116925OooOo0o.OooOOO());
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0oO$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<ArrayList<InterfaceC34601OooOO0O>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC32538OooO0oO<R> f116926OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(AbstractC32538OooO0oO<? extends R> abstractC32538OooO0oO) {
            super(0);
            this.f116926OooOo0o = abstractC32538OooO0oO;
        }

        @Override // oO0O000o.OooO00o
        public final ArrayList<InterfaceC34601OooOO0O> invoke() {
            int i;
            AbstractC32538OooO0oO<R> abstractC32538OooO0oO = this.f116926OooOo0o;
            oO0O0OO.OooO0O0 oooO0O0OooOOO = abstractC32538OooO0oO.OooOOO();
            ArrayList<InterfaceC34601OooOO0O> arrayList = new ArrayList<>();
            int i2 = 0;
            if (abstractC32538OooO0oO.OooOOOo()) {
                i = 0;
            } else {
                InterfaceC32629OoooO0 interfaceC32629OoooO0OooO0oO = C32585OoooOoo.OooO0oO(oooO0O0OooOOO);
                if (interfaceC32629OoooO0OooO0oO != null) {
                    arrayList.add(new C32561OooOoo(abstractC32538OooO0oO, 0, InterfaceC34601OooOO0O.OooO00o.f123971OooOo0o, new C32541OooO0oo(interfaceC32629OoooO0OooO0oO)));
                    i = 1;
                } else {
                    i = 0;
                }
                InterfaceC32629OoooO0 interfaceC32629OoooO0OoooOoo = oooO0O0OooOOO.OoooOoo();
                if (interfaceC32629OoooO0OoooOoo != null) {
                    arrayList.add(new C32561OooOoo(abstractC32538OooO0oO, i, InterfaceC34601OooOO0O.OooO00o.f123970OooOo, new OooO(interfaceC32629OoooO0OoooOoo)));
                    i++;
                }
            }
            int size = oooO0O0OooOOO.OooO0o().size();
            while (i2 < size) {
                arrayList.add(new C32561OooOoo(abstractC32538OooO0oO, i, InterfaceC34601OooOO0O.OooO00o.f123973OooOoO0, new OooOO0(oooO0O0OooOOO, i2)));
                i2++;
                i++;
            }
            if (abstractC32538OooO0oO.OooOOOO() && (oooO0O0OooOOO instanceof InterfaceC32771OooO00o) && arrayList.size() > 1) {
                C34431OooOo0.OooOooO(arrayList, new OooOO0O());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0oO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32539OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32567Oooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC32538OooO0oO<R> f116927OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C32539OooO0Oo(AbstractC32538OooO0oO<? extends R> abstractC32538OooO0oO) {
            super(0);
            this.f116927OooOo0o = abstractC32538OooO0oO;
        }

        @Override // oO0O000o.OooO00o
        public final C32567Oooo invoke() {
            AbstractC32538OooO0oO<R> abstractC32538OooO0oO = this.f116927OooOo0o;
            AbstractC33320OooOoo returnType = abstractC32538OooO0oO.OooOOO().getReturnType();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(returnType);
            return new C32567Oooo(returnType, new C32542OooOO0o(abstractC32538OooO0oO));
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0oO$OooO0o0, reason: case insensitive filesystem */
    public static final class C32540OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends C32578OoooO00>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC32538OooO0oO<R> f116928OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C32540OooO0o0(AbstractC32538OooO0oO<? extends R> abstractC32538OooO0oO) {
            super(0);
            this.f116928OooOo0o = abstractC32538OooO0oO;
        }

        @Override // oO0O000o.OooO00o
        public final List<? extends C32578OoooO00> invoke() {
            AbstractC32538OooO0oO<R> abstractC32538OooO0oO = this.f116928OooOo0o;
            List<InterfaceC32637OoooOoo> typeParameters = abstractC32538OooO0oO.OooOOO().getTypeParameters();
            kotlin.jvm.internal.OooOOO0.OooO0o(typeParameters, "descriptor.typeParameters");
            List<InterfaceC32637OoooOoo> list = typeParameters;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (InterfaceC32637OoooOoo descriptor : list) {
                kotlin.jvm.internal.OooOOO0.OooO0o(descriptor, "descriptor");
                arrayList.add(new C32578OoooO00(abstractC32538OooO0oO, descriptor));
            }
            return arrayList;
        }
    }

    public static Object OooO(InterfaceC34606OooOOOo interfaceC34606OooOOOo) {
        Class clsOooO0Oo = C24217OooO0O0.OooO0Oo(C21053Oooo00o.OooO0o0(interfaceC34606OooOOOo));
        if (clsOooO0Oo.isArray()) {
            Object objNewInstance = Array.newInstance(clsOooO0Oo.getComponentType(), 0);
            kotlin.jvm.internal.OooOOO0.OooO0o(objNewInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return objNewInstance;
        }
        throw new C32579OoooO0O("Cannot instantiate the default empty array of type " + clsOooO0Oo.getSimpleName() + ", because it is not an array type");
    }

    public abstract ooOOOoO0.OooO0o<?> OooOO0O();

    public abstract AbstractC32552OooOOo OooOO0o();

    public abstract oO0O0OO.OooO0O0 OooOOO();

    public abstract ooOOOoO0.OooO0o<?> OooOOO0();

    public final boolean OooOOOO() {
        return kotlin.jvm.internal.OooOOO0.OooO0O0(getName(), "<init>") && OooOO0o().OooO().isAnnotation();
    }

    public abstract boolean OooOOOo();

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final R call(Object... args) throws oO0O0.OooO00o {
        kotlin.jvm.internal.OooOOO0.OooO0oO(args, "args");
        try {
            return (R) OooOO0O().call(args);
        } catch (IllegalAccessException e) {
            throw new oO0O0.OooO00o(e);
        }
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final R callBy(Map<InterfaceC34601OooOO0O, ? extends Object> args) throws oO0O0.OooO00o {
        Object objOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(args, "args");
        boolean z = false;
        if (OooOOOO()) {
            List<InterfaceC34601OooOO0O> parameters = getParameters();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(parameters, 10));
            for (InterfaceC34601OooOO0O interfaceC34601OooOO0O : parameters) {
                if (args.containsKey(interfaceC34601OooOO0O)) {
                    objOooO = args.get(interfaceC34601OooOO0O);
                    if (objOooO == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC34601OooOO0O + ')');
                    }
                } else if (interfaceC34601OooOO0O.OooO0o()) {
                    objOooO = null;
                } else {
                    if (!interfaceC34601OooOO0O.OooO00o()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + interfaceC34601OooOO0O);
                    }
                    objOooO = OooO(interfaceC34601OooOO0O.getType());
                }
                arrayList.add(objOooO);
            }
            ooOOOoO0.OooO0o<?> oooO0oOooOOO0 = OooOOO0();
            if (oooO0oOooOOO0 != null) {
                try {
                    return (R) oooO0oOooOOO0.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new oO0O0.OooO00o(e);
                }
            }
            throw new C32579OoooO0O("This callable does not support a default call: " + OooOOO());
        }
        List<InterfaceC34601OooOO0O> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return (R) OooOO0O().call(isSuspend() ? new Continuation[]{null} : new Continuation[0]);
            } catch (IllegalAccessException e2) {
                throw new oO0O0.OooO00o(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) this.f116923OooOoOO.invoke().clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (InterfaceC34601OooOO0O interfaceC34601OooOO0O2 : parameters2) {
            if (args.containsKey(interfaceC34601OooOO0O2)) {
                objArr[interfaceC34601OooOO0O2.getIndex()] = args.get(interfaceC34601OooOO0O2);
            } else if (interfaceC34601OooOO0O2.OooO0o()) {
                int i2 = (i / 32) + size;
                Object obj = objArr[i2];
                kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Int");
                objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!interfaceC34601OooOO0O2.OooO00o()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + interfaceC34601OooOO0O2);
            }
            if (interfaceC34601OooOO0O2.getKind() == InterfaceC34601OooOO0O.OooO00o.f123973OooOoO0) {
                i++;
            }
        }
        if (!z) {
            try {
                ooOOOoO0.OooO0o<?> oooO0oOooOO0O = OooOO0O();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
                return (R) oooO0oOooOO0O.call(objArrCopyOf);
            } catch (IllegalAccessException e3) {
                throw new oO0O0.OooO00o(e3);
            }
        }
        ooOOOoO0.OooO0o<?> oooO0oOooOOO02 = OooOOO0();
        if (oooO0oOooOOO02 != null) {
            try {
                return (R) oooO0oOooOOO02.call(objArr);
            } catch (IllegalAccessException e4) {
                throw new oO0O0.OooO00o(e4);
            }
        }
        throw new C32579OoooO0O("This callable does not support a default call: " + OooOOO());
    }

    @Override // oOoo0.InterfaceC34593OooO0O0
    public final List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this.f116920OooOo0o.invoke();
        kotlin.jvm.internal.OooOOO0.OooO0o(listInvoke, "_annotations()");
        return listInvoke;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final List<InterfaceC34601OooOO0O> getParameters() {
        ArrayList<InterfaceC34601OooOO0O> arrayListInvoke = this.f116919OooOo.invoke();
        kotlin.jvm.internal.OooOOO0.OooO0o(arrayListInvoke, "_parameters()");
        return arrayListInvoke;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final InterfaceC34606OooOOOo getReturnType() {
        C32567Oooo c32567OoooInvoke = this.f116922OooOoO0.invoke();
        kotlin.jvm.internal.OooOOO0.OooO0o(c32567OoooInvoke, "_returnType()");
        return c32567OoooInvoke;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final List<InterfaceC34608OooOOo0> getTypeParameters() {
        List<C32578OoooO00> listInvoke = this.f116921OooOoO.invoke();
        kotlin.jvm.internal.OooOOO0.OooO0o(listInvoke, "_typeParameters()");
        return listInvoke;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final EnumC34612OooOo00 getVisibility() {
        AbstractC32601OooOOo visibility = OooOOO().getVisibility();
        kotlin.jvm.internal.OooOOO0.OooO0o(visibility, "descriptor.visibility");
        C33477OooO0OO c33477OooO0OO = C32585OoooOoo.f117091OooO00o;
        if (visibility.equals(C32602OooOOo0.f117243OooO0o0)) {
            return EnumC34612OooOo00.f123988OooOo0o;
        }
        if (visibility.equals(C32602OooOOo0.f117240OooO0OO)) {
            return EnumC34612OooOo00.f123987OooOo;
        }
        if (visibility.equals(C32602OooOOo0.f117241OooO0Oo)) {
            return EnumC34612OooOo00.f123990OooOoO0;
        }
        if (visibility.equals(C32602OooOOo0.f117238OooO00o) ? true : visibility.equals(C32602OooOOo0.f117239OooO0O0)) {
            return EnumC34612OooOo00.f123989OooOoO;
        }
        return null;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final boolean isAbstract() {
        return OooOOO().OooO0oO() == EnumC32614OooOoOO.f117262OooOoO;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final boolean isFinal() {
        return OooOOO().OooO0oO() == EnumC32614OooOoOO.f117261OooOo0o;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public final boolean isOpen() {
        return OooOOO().OooO0oO() == EnumC32614OooOoOO.f117263OooOoO0;
    }
}

package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import oOoo0.EnumC34612OooOo00;
import oOoo0.InterfaceC34594OooO0OO;
import oOoo0.InterfaceC34596OooO0o;
import oOoo0.InterfaceC34601OooOO0O;
import oOoo0.InterfaceC34606OooOOOo;
import oOoo0.InterfaceC34608OooOOo0;
import ooOOoOo0.C35149OooO00o;

/* JADX INFO: renamed from: kotlin.jvm.internal.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC24015OooO0Oo implements InterfaceC34594OooO0OO, Serializable {
    public static final Object NO_RECEIVER = OooO00o.f80931OooOo0o;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC34594OooO0OO reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.OooO0Oo$OooO00o */
    public static class OooO00o implements Serializable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f80931OooOo0o = new OooO00o();

        private Object readResolve() throws ObjectStreamException {
            return f80931OooOo0o;
        }
    }

    public AbstractC24015OooO0Oo() {
        this(NO_RECEIVER);
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC34594OooO0OO compute() {
        InterfaceC34594OooO0OO interfaceC34594OooO0OO = this.reflected;
        if (interfaceC34594OooO0OO != null) {
            return interfaceC34594OooO0OO;
        }
        InterfaceC34594OooO0OO interfaceC34594OooO0OOComputeReflected = computeReflected();
        this.reflected = interfaceC34594OooO0OOComputeReflected;
        return interfaceC34594OooO0OOComputeReflected;
    }

    public abstract InterfaceC34594OooO0OO computeReflected();

    @Override // oOoo0.InterfaceC34593OooO0O0
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public String getName() {
        return this.name;
    }

    public InterfaceC34596OooO0o getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C24035Oooo00o.f80943OooO00o.OooO0OO(cls, "") : C24035Oooo00o.f80943OooO00o.OooO0O0(cls);
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public List<InterfaceC34601OooOO0O> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC34594OooO0OO getReflected() {
        InterfaceC34594OooO0OO interfaceC34594OooO0OOCompute = compute();
        if (interfaceC34594OooO0OOCompute != this) {
            return interfaceC34594OooO0OOCompute;
        }
        throw new C35149OooO00o("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public InterfaceC34606OooOOOo getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public List<InterfaceC34608OooOOo0> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public EnumC34612OooOo00 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // oOoo0.InterfaceC34594OooO0OO
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public AbstractC24015OooO0Oo(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC24015OooO0Oo(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}

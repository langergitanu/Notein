package androidx.datastore.preferences.protobuf;

import Oooo0oo.AbstractC21138OooO0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.datastore.preferences.protobuf.OooO00o;
import androidx.datastore.preferences.protobuf.OooOo;
import androidx.datastore.preferences.protobuf.OooOo.OooO00o;
import androidx.datastore.preferences.protobuf.OooOo00;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOo<MessageType extends OooOo<MessageType, BuilderType>, BuilderType extends OooO00o<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.OooO00o<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, OooOo<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected o00Ooo unknownFields = o00Ooo.f64559OooO0o;

    public static abstract class OooO00o<MessageType extends OooOo<MessageType, BuilderType>, BuilderType extends OooO00o<MessageType, BuilderType>> extends OooO00o.AbstractC19010OooO00o<MessageType, BuilderType> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public MessageType f64461OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final MessageType f64462OooOo0o;

        public OooO00o(MessageType messagetype) {
            this.f64462OooOo0o = messagetype;
            if (messagetype.OooOO0()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f64461OooOo = (MessageType) messagetype.OooOO0o();
        }

        public final MessageType OooO0OO() {
            MessageType messagetype = (MessageType) OooO0Oo();
            messagetype.getClass();
            if (OooOo.OooO(messagetype, true)) {
                return messagetype;
            }
            throw new o00O0O();
        }

        public final MessageType OooO0Oo() {
            if (!this.f64461OooOo.OooOO0()) {
                return this.f64461OooOo;
            }
            MessageType messagetype = this.f64461OooOo;
            messagetype.getClass();
            C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
            c21834OooooOO.getClass();
            c21834OooooOO.OooO00o(messagetype.getClass()).makeImmutable(messagetype);
            messagetype.OooOO0O();
            return this.f64461OooOo;
        }

        public final void OooO0o0() {
            if (this.f64461OooOo.OooOO0()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f64462OooOo0o.OooOO0o();
            MessageType messagetype2 = this.f64461OooOo;
            C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
            c21834OooooOO.getClass();
            c21834OooooOO.OooO00o(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
            this.f64461OooOo = messagetype;
        }

        public final Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) this.f64462OooOo0o.OooO0o(OooO0o.f64467OooOoOO);
            oooO00o.f64461OooOo = (MessageType) OooO0Oo();
            return oooO00o;
        }
    }

    public static class OooO0O0<T extends OooOo<T, ?>> extends androidx.datastore.preferences.protobuf.OooO0O0<T> {
    }

    public static abstract class OooO0OO<MessageType extends OooO0OO<MessageType, BuilderType>, BuilderType> extends OooOo<MessageType, BuilderType> implements InterfaceC21824OoooO0O {
        protected OooOo00<C21800OooO0Oo> extensions = OooOo00.f64475OooO0Oo;

        @Override // androidx.datastore.preferences.protobuf.OooOo, androidx.datastore.preferences.protobuf.InterfaceC21824OoooO0O
        public final OooOo OooO00o() {
            return (OooOo) OooO0o(OooO0o.f64469OooOoo0);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOo, androidx.datastore.preferences.protobuf.InterfaceC21822OoooO0
        public final OooO00o newBuilderForType() {
            return (OooO00o) OooO0o(OooO0o.f64467OooOoOO);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C21800OooO0Oo implements OooOo00.OooO00o<C21800OooO0Oo> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((C21800OooO0Oo) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOo00.OooO00o
        public final o00oO0O getLiteJavaType() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0o f64463OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0o f64464OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0o f64465OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0o f64466OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO0o f64467OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final /* synthetic */ OooO0o[] f64468OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO0o f64469OooOoo0;

        static {
            OooO0o oooO0o = new OooO0o("GET_MEMOIZED_IS_INITIALIZED", 0);
            f64464OooOo0o = oooO0o;
            OooO0o oooO0o2 = new OooO0o("SET_MEMOIZED_IS_INITIALIZED", 1);
            f64463OooOo = oooO0o2;
            OooO0o oooO0o3 = new OooO0o("BUILD_MESSAGE_INFO", 2);
            f64466OooOoO0 = oooO0o3;
            OooO0o oooO0o4 = new OooO0o("NEW_MUTABLE_INSTANCE", 3);
            f64465OooOoO = oooO0o4;
            OooO0o oooO0o5 = new OooO0o("NEW_BUILDER", 4);
            f64467OooOoOO = oooO0o5;
            OooO0o oooO0o6 = new OooO0o("GET_DEFAULT_INSTANCE", 5);
            f64469OooOoo0 = oooO0o6;
            f64468OooOoo = new OooO0o[]{oooO0o, oooO0o2, oooO0o3, oooO0o4, oooO0o5, oooO0o6, new OooO0o("GET_PARSER", 6)};
        }

        public OooO0o() {
            throw null;
        }

        public static OooO0o valueOf(String str) {
            return (OooO0o) Enum.valueOf(OooO0o.class, str);
        }

        public static OooO0o[] values() {
            return (OooO0o[]) f64468OooOoo.clone();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOo$OooO0o0, reason: case insensitive filesystem */
    public static class C21801OooO0o0<ContainingType extends InterfaceC21822OoooO0, Type> extends AbstractC21138OooO0oo {
    }

    public static final <T extends OooOo<T, ?>> boolean OooO(T t, boolean z) {
        byte bByteValue = ((Byte) t.OooO0o(OooO0o.f64464OooOo0o)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
        c21834OooooOO.getClass();
        boolean zIsInitialized = c21834OooooOO.OooO00o(t.getClass()).isInitialized(t);
        if (z) {
            t.OooO0o(OooO0o.f64463OooOo);
        }
        return zIsInitialized;
    }

    public static <T extends OooOo<?, ?>> T OooO0oO(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((OooOo) C21843o00ooo.OooO0Oo(cls)).OooO0o(OooO0o.f64469OooOoo0);
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static Object OooO0oo(Method method, InterfaceC21822OoooO0 interfaceC21822OoooO0, Object... objArr) {
        try {
            return method.invoke(interfaceC21822OoooO0, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends OooOo<?, ?>> void OooOOO0(Class<T> cls, T t) {
        t.OooOO0O();
        defaultInstanceMap.put(cls, t);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21824OoooO0O
    public OooOo OooO00o() {
        return (OooOo) OooO0o(OooO0o.f64469OooOoo0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21822OoooO0
    public final void OooO0O0(AbstractC21794OooOO0o abstractC21794OooOO0o) throws IOException {
        C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
        c21834OooooOO.getClass();
        InterfaceC21836Oooooo interfaceC21836OoooooOooO00o = c21834OooooOO.OooO00o(getClass());
        OooOOO0 oooOOO0 = abstractC21794OooOO0o.f64442OooO00o;
        if (oooOOO0 == null) {
            oooOOO0 = new OooOOO0(abstractC21794OooOO0o);
        }
        interfaceC21836OoooooOooO00o.OooO0OO(this, oooOOO0);
    }

    @Override // androidx.datastore.preferences.protobuf.OooO00o
    public final int OooO0OO() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.OooO00o
    public final int OooO0Oo(InterfaceC21836Oooooo interfaceC21836Oooooo) {
        int iOooO00o;
        int iOooO00o2;
        if (OooOO0()) {
            if (interfaceC21836Oooooo == null) {
                C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
                c21834OooooOO.getClass();
                iOooO00o2 = c21834OooooOO.OooO00o(getClass()).OooO00o(this);
            } else {
                iOooO00o2 = interfaceC21836Oooooo.OooO00o(this);
            }
            if (iOooO00o2 >= 0) {
                return iOooO00o2;
            }
            throw new IllegalStateException(C21532OooOOo.OooO0OO(iOooO00o2, "serialized size must be non-negative, was "));
        }
        if (OooO0OO() != Integer.MAX_VALUE) {
            return OooO0OO();
        }
        if (interfaceC21836Oooooo == null) {
            C21834OooooOO c21834OooooOO2 = C21834OooooOO.f64546OooO0OO;
            c21834OooooOO2.getClass();
            iOooO00o = c21834OooooOO2.OooO00o(getClass()).OooO00o(this);
        } else {
            iOooO00o = interfaceC21836Oooooo.OooO00o(this);
        }
        OooO0o0(iOooO00o);
        return iOooO00o;
    }

    public abstract Object OooO0o(OooO0o oooO0o);

    @Override // androidx.datastore.preferences.protobuf.OooO00o
    public final void OooO0o0(int i) {
        if (i < 0) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final boolean OooOO0() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void OooOO0O() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final MessageType OooOO0o() {
        return (MessageType) OooO0o(OooO0o.f64465OooOoO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
        c21834OooooOO.getClass();
        return c21834OooooOO.OooO00o(getClass()).OooO0Oo(this, (OooOo) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21822OoooO0
    public final int getSerializedSize() {
        return OooO0Oo(null);
    }

    public final int hashCode() {
        if (OooOO0()) {
            C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
            c21834OooooOO.getClass();
            return c21834OooooOO.OooO00o(getClass()).OooO0o0(this);
        }
        if (this.memoizedHashCode == 0) {
            C21834OooooOO c21834OooooOO2 = C21834OooooOO.f64546OooO0OO;
            c21834OooooOO2.getClass();
            this.memoizedHashCode = c21834OooooOO2.OooO00o(getClass()).OooO0o0(this);
        }
        return this.memoizedHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21822OoooO0
    public OooO00o newBuilderForType() {
        return (OooO00o) OooO0o(OooO0o.f64467OooOoOO);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = C21821OoooO.f64518OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        C21821OoooO.OooO0OO(this, sb, 0);
        return sb.toString();
    }
}

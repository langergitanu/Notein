package com.google.firebase.vertexai.type;

import OooOoOO.C20519OooO0Oo;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000Ooo.C24242OooOOo;
import o00Oo0oO.C25050OooO0O0;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.OooO00o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooO.InterfaceC33916OooO0oo;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallingConfig;", "", "mode", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Mode;", "allowedFunctionNames", "", "", "(Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Mode;Ljava/util/List;)V", "getAllowedFunctionNames$com_google_firebase_firebase_vertexai", "()Ljava/util/List;", "getMode$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Mode;", "Companion", "Internal", "Mode", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FunctionCallingConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<String> allowedFunctionNames;
    private final Mode mode;

    @Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\n"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Companion;", "", "()V", "any", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig;", "allowedFunctionNames", "", "", "auto", "none", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FunctionCallingConfig any$default(Companion companion, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = null;
            }
            return companion.any(list);
        }

        public final FunctionCallingConfig any() {
            return any$default(this, null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final FunctionCallingConfig auto() {
            return new FunctionCallingConfig(Mode.AUTO, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final FunctionCallingConfig none() {
            return new FunctionCallingConfig(Mode.NONE, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }

        public final FunctionCallingConfig any(List<String> allowedFunctionNames) {
            return new FunctionCallingConfig(Mode.ANY, allowedFunctionNames);
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0003+*,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019¨\u0006-"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;", "", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode;", "mode", "", "", "allowedFunctionNames", "<init>", "(Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode;Ljava/util/List;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode;Ljava/util/List;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode;", "component2", "()Ljava/util/List;", "copy", "(Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode;Ljava/util/List;)Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode;", "getMode", "Ljava/util/List;", "getAllowedFunctionNames", "getAllowedFunctionNames$annotations", "()V", "Companion", "$serializer", "Mode", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private final List<String> allowedFunctionNames;
        private final Mode mode;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {Mode.INSTANCE.serializer(), new C33938OooO0o0(o00000OO.f122230OooO00o)};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return FunctionCallingConfig$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC33908OooO
        @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode;", "", "(Ljava/lang/String;I)V", "UNSPECIFIED", "AUTO", "ANY", "NONE", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public enum Mode {
            UNSPECIFIED,
            AUTO,
            ANY,
            NONE;


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final InterfaceC32440OooOO0<InterfaceC33911OooO0OO<Object>> $cachedSerializer$delegate = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, Companion.C172601.INSTANCE);

            @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal$Mode;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class Companion {

                /* JADX INFO: renamed from: com.google.firebase.vertexai.type.FunctionCallingConfig$Internal$Mode$Companion$1 */
                @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
                public static final class C172601 extends OooOOOO implements OooO00o<InterfaceC33911OooO0OO<Object>> {
                    public static final C172601 INSTANCE = new C172601();

                    public C172601() {
                        super(0);
                    }

                    @Override // oO0O000o.OooO00o
                    public final InterfaceC33911OooO0OO<Object> invoke() {
                        return C25050OooO0O0.OooO0OO("com.google.firebase.vertexai.type.FunctionCallingConfig.Internal.Mode", Mode.values(), new String[]{"MODE_UNSPECIFIED", null, null, null}, new Annotation[][]{null, null, null, null});
                    }
                }

                public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                    this();
                }

                private final /* synthetic */ InterfaceC33911OooO0OO get$cachedSerializer() {
                    return (InterfaceC33911OooO0OO) Mode.$cachedSerializer$delegate.getValue();
                }

                public final InterfaceC33911OooO0OO<Mode> serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }
        }

        public /* synthetic */ Internal(int i, Mode mode, @InterfaceC33916OooO0oo("allowed_function_names") List list, o000000O o000000o2) {
            if (1 != (i & 1)) {
                C24242OooOOo.OooO0O0(i, 1, FunctionCallingConfig$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.mode = mode;
            if ((i & 2) == 0) {
                this.allowedFunctionNames = null;
            } else {
                this.allowedFunctionNames = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, Mode mode, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                mode = internal.mode;
            }
            if ((i & 2) != 0) {
                list = internal.allowedFunctionNames;
            }
            return internal.copy(mode, list);
        }

        @InterfaceC33916OooO0oo("allowed_function_names")
        public static /* synthetic */ void getAllowedFunctionNames$annotations() {
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            output.OooOoo0(serialDesc, 0, interfaceC33911OooO0OOArr[0], self.mode);
            if (!output.OooOoO0(serialDesc) && self.allowedFunctionNames == null) {
                return;
            }
            output.OooOo(serialDesc, 1, interfaceC33911OooO0OOArr[1], self.allowedFunctionNames);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Mode getMode() {
            return this.mode;
        }

        public final List<String> component2() {
            return this.allowedFunctionNames;
        }

        public final Internal copy(Mode mode, List<String> allowedFunctionNames) {
            OooOOO0.OooO0oO(mode, "mode");
            return new Internal(mode, allowedFunctionNames);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return this.mode == internal.mode && OooOOO0.OooO0O0(this.allowedFunctionNames, internal.allowedFunctionNames);
        }

        public final List<String> getAllowedFunctionNames() {
            return this.allowedFunctionNames;
        }

        public final Mode getMode() {
            return this.mode;
        }

        public int hashCode() {
            int iHashCode = this.mode.hashCode() * 31;
            List<String> list = this.allowedFunctionNames;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Internal(mode=" + this.mode + ", allowedFunctionNames=" + this.allowedFunctionNames + ')';
        }

        public Internal(Mode mode, List<String> list) {
            OooOOO0.OooO0oO(mode, "mode");
            this.mode = mode;
            this.allowedFunctionNames = list;
        }

        public /* synthetic */ Internal(Mode mode, List list, int i, C24018OooO0oo c24018OooO0oo) {
            this(mode, (i & 2) != 0 ? null : list);
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Mode;", "", "(Ljava/lang/String;I)V", "AUTO", "ANY", "NONE", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public enum Mode {
        AUTO,
        ANY,
        NONE
    }

    public FunctionCallingConfig(Mode mode, List<String> list) {
        OooOOO0.OooO0oO(mode, "mode");
        this.mode = mode;
        this.allowedFunctionNames = list;
    }

    public static final FunctionCallingConfig any() {
        return INSTANCE.any();
    }

    public static final FunctionCallingConfig auto() {
        return INSTANCE.auto();
    }

    public static final FunctionCallingConfig none() {
        return INSTANCE.none();
    }

    public final List<String> getAllowedFunctionNames$com_google_firebase_firebase_vertexai() {
        return this.allowedFunctionNames;
    }

    /* JADX INFO: renamed from: getMode$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Mode getMode() {
        return this.mode;
    }

    public static final FunctionCallingConfig any(List<String> list) {
        return INSTANCE.any(list);
    }

    public /* synthetic */ FunctionCallingConfig(Mode mode, List list, int i, C24018OooO0oo c24018OooO0oo) {
        this(mode, (i & 2) != 0 ? null : list);
    }
}

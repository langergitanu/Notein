package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.FunctionCallingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO00ooO.C32442OooOO0o;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooO.InterfaceC33916OooO0oo;
import oO0oO00.o000000O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ToolConfig;", "", "functionCallingConfig", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig;", "(Lcom/google/firebase/vertexai/type/FunctionCallingConfig;)V", "getFunctionCallingConfig$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/FunctionCallingConfig;", "toInternal", "Lcom/google/firebase/vertexai/type/ToolConfig$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ToolConfig {
    private final FunctionCallingConfig functionCallingConfig;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014¨\u0006&"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ToolConfig$Internal;", "", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;", "functionCallingConfig", "<init>", "(Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/ToolConfig$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;", "copy", "(Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;)Lcom/google/firebase/vertexai/type/ToolConfig$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/FunctionCallingConfig$Internal;", "getFunctionCallingConfig", "getFunctionCallingConfig$annotations", "()V", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FunctionCallingConfig.Internal functionCallingConfig;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ToolConfig$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/ToolConfig$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return ToolConfig$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, @InterfaceC33916OooO0oo("function_calling_config") FunctionCallingConfig.Internal internal, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.functionCallingConfig = internal;
            } else {
                C24242OooOOo.OooO0O0(i, 1, ToolConfig$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, FunctionCallingConfig.Internal internal2, int i, Object obj) {
            if ((i & 1) != 0) {
                internal2 = internal.functionCallingConfig;
            }
            return internal.copy(internal2);
        }

        @InterfaceC33916OooO0oo("function_calling_config")
        public static /* synthetic */ void getFunctionCallingConfig$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FunctionCallingConfig.Internal getFunctionCallingConfig() {
            return this.functionCallingConfig;
        }

        public final Internal copy(FunctionCallingConfig.Internal functionCallingConfig) {
            return new Internal(functionCallingConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Internal) && OooOOO0.OooO0O0(this.functionCallingConfig, ((Internal) other).functionCallingConfig);
        }

        public final FunctionCallingConfig.Internal getFunctionCallingConfig() {
            return this.functionCallingConfig;
        }

        public int hashCode() {
            FunctionCallingConfig.Internal internal = this.functionCallingConfig;
            if (internal == null) {
                return 0;
            }
            return internal.hashCode();
        }

        public String toString() {
            return "Internal(functionCallingConfig=" + this.functionCallingConfig + ')';
        }

        public Internal(FunctionCallingConfig.Internal internal) {
            this.functionCallingConfig = internal;
        }
    }

    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FunctionCallingConfig.Mode.values().length];
            try {
                iArr[FunctionCallingConfig.Mode.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FunctionCallingConfig.Mode.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FunctionCallingConfig.Mode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ToolConfig(FunctionCallingConfig functionCallingConfig) {
        this.functionCallingConfig = functionCallingConfig;
    }

    /* JADX INFO: renamed from: getFunctionCallingConfig$com_google_firebase_firebase_vertexai, reason: from getter */
    public final FunctionCallingConfig getFunctionCallingConfig() {
        return this.functionCallingConfig;
    }

    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        FunctionCallingConfig.Internal internal;
        FunctionCallingConfig.Internal.Mode mode;
        FunctionCallingConfig functionCallingConfig = this.functionCallingConfig;
        if (functionCallingConfig != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[functionCallingConfig.getMode().ordinal()];
            if (i == 1) {
                mode = FunctionCallingConfig.Internal.Mode.ANY;
            } else if (i == 2) {
                mode = FunctionCallingConfig.Internal.Mode.AUTO;
            } else {
                if (i != 3) {
                    throw new C32442OooOO0o();
                }
                mode = FunctionCallingConfig.Internal.Mode.NONE;
            }
            internal = new FunctionCallingConfig.Internal(mode, functionCallingConfig.getAllowedFunctionNames$com_google_firebase_firebase_vertexai());
        } else {
            internal = null;
        }
        return new Internal(internal);
    }
}

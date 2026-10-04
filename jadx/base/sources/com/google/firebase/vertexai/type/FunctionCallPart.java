package com.google.firebase.vertexai.type;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33977OoooOOo;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;
import oOo00O0O.C34465OooOOo0;
import oOo00O0O.OooOO0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallPart;", "Lcom/google/firebase/vertexai/type/Part;", "", "name", "", "LoOo00O0O/OooOO0O;", "args", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/util/Map;", "getArgs", "()Ljava/util/Map;", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FunctionCallPart implements Part {
    private final Map<String, OooOO0O> args;
    private final String name;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0003$#%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006&"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal;", "Lcom/google/firebase/vertexai/type/InternalPart;", "Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;", "functionCall", "<init>", "(Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;", "copy", "(Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;)Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;", "getFunctionCall", "Companion", "$serializer", "FunctionCall", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal implements InternalPart {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FunctionCall functionCall;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return FunctionCallPart$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC33908OooO
        @Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB=\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;", "", "", "name", "", "LoOo00O0O/OooOO0O;", "args", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/util/Map;", "getArgs", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final /* data */ class FunctionCall {
            private final Map<String, OooOO0O> args;
            private final String name;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, new C33977OoooOOo(o00000OO.f122230OooO00o, C33928OooO00o.OooO0OO(C34465OooOOo0.f123523OooO00o))};

            @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal$FunctionCall;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                    this();
                }

                public final InterfaceC33911OooO0OO<FunctionCall> serializer() {
                    return FunctionCallPart$Internal$FunctionCall$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ FunctionCall(int i, String str, Map map, o000000O o000000o2) {
                if (1 != (i & 1)) {
                    C24242OooOOo.OooO0O0(i, 1, FunctionCallPart$Internal$FunctionCall$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.name = str;
                if ((i & 2) == 0) {
                    this.args = null;
                } else {
                    this.args = map;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FunctionCall copy$default(FunctionCall functionCall, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = functionCall.name;
                }
                if ((i & 2) != 0) {
                    map = functionCall.args;
                }
                return functionCall.copy(str, map);
            }

            public static final /* synthetic */ void write$Self(FunctionCall self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
                output.OooOO0o(serialDesc, 0, self.name);
                if (!output.OooOoO0(serialDesc) && self.args == null) {
                    return;
                }
                output.OooOo(serialDesc, 1, interfaceC33911OooO0OOArr[1], self.args);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final Map<String, OooOO0O> component2() {
                return this.args;
            }

            public final FunctionCall copy(String name, Map<String, ? extends OooOO0O> args) {
                OooOOO0.OooO0oO(name, "name");
                return new FunctionCall(name, args);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FunctionCall)) {
                    return false;
                }
                FunctionCall functionCall = (FunctionCall) other;
                return OooOOO0.OooO0O0(this.name, functionCall.name) && OooOOO0.OooO0O0(this.args, functionCall.args);
            }

            public final Map<String, OooOO0O> getArgs() {
                return this.args;
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                Map<String, OooOO0O> map = this.args;
                return iHashCode + (map == null ? 0 : map.hashCode());
            }

            public String toString() {
                return "FunctionCall(name=" + this.name + ", args=" + this.args + ')';
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FunctionCall(String name, Map<String, ? extends OooOO0O> map) {
                OooOOO0.OooO0oO(name, "name");
                this.name = name;
                this.args = map;
            }

            public /* synthetic */ FunctionCall(String str, Map map, int i, C24018OooO0oo c24018OooO0oo) {
                this(str, (i & 2) != 0 ? null : map);
            }
        }

        public /* synthetic */ Internal(int i, FunctionCall functionCall, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.functionCall = functionCall;
            } else {
                C24242OooOOo.OooO0O0(i, 1, FunctionCallPart$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, FunctionCall functionCall, int i, Object obj) {
            if ((i & 1) != 0) {
                functionCall = internal.functionCall;
            }
            return internal.copy(functionCall);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FunctionCall getFunctionCall() {
            return this.functionCall;
        }

        public final Internal copy(FunctionCall functionCall) {
            OooOOO0.OooO0oO(functionCall, "functionCall");
            return new Internal(functionCall);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Internal) && OooOOO0.OooO0O0(this.functionCall, ((Internal) other).functionCall);
        }

        public final FunctionCall getFunctionCall() {
            return this.functionCall;
        }

        public int hashCode() {
            return this.functionCall.hashCode();
        }

        public String toString() {
            return "Internal(functionCall=" + this.functionCall + ')';
        }

        public Internal(FunctionCall functionCall) {
            OooOOO0.OooO0oO(functionCall, "functionCall");
            this.functionCall = functionCall;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionCallPart(String name, Map<String, ? extends OooOO0O> args) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(args, "args");
        this.name = name;
        this.args = args;
    }

    public final Map<String, OooOO0O> getArgs() {
        return this.args;
    }

    public final String getName() {
        return this.name;
    }
}

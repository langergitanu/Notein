package com.google.firebase.vertexai.type;

import com.microsoft.identity.common.java.constants.FidoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;
import oOo00O0O.C34473OooOoo;
import oOo00O0O.C34474OooOoo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionResponsePart;", "Lcom/google/firebase/vertexai/type/Part;", "", "name", "LoOo00O0O/OooOoo0;", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "<init>", "(Ljava/lang/String;LoOo00O0O/OooOoo0;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoOo00O0O/OooOoo0;", "getResponse", "()LoOo00O0O/OooOoo0;", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FunctionResponsePart implements Part {
    private final String name;
    private final C34474OooOoo0 response;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0003$#%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006&"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal;", "Lcom/google/firebase/vertexai/type/InternalPart;", "Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;", "functionResponse", "<init>", "(Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;", "copy", "(Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;)Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;", "getFunctionResponse", "Companion", "$serializer", "FunctionResponse", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal implements InternalPart {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FunctionResponse functionResponse;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return FunctionResponsePart$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC33908OooO
        @Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006("}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;", "", "", "name", "LoOo00O0O/OooOoo0;", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "<init>", "(Ljava/lang/String;LoOo00O0O/OooOoo0;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;LoOo00O0O/OooOoo0;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "()LoOo00O0O/OooOoo0;", "copy", "(Ljava/lang/String;LoOo00O0O/OooOoo0;)Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "LoOo00O0O/OooOoo0;", "getResponse", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final /* data */ class FunctionResponse {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String name;
            private final C34474OooOoo0 response;

            @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal$FunctionResponse;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                    this();
                }

                public final InterfaceC33911OooO0OO<FunctionResponse> serializer() {
                    return FunctionResponsePart$Internal$FunctionResponse$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ FunctionResponse(int i, String str, C34474OooOoo0 c34474OooOoo0, o000000O o000000o2) {
                if (3 != (i & 3)) {
                    C24242OooOOo.OooO0O0(i, 3, FunctionResponsePart$Internal$FunctionResponse$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.name = str;
                this.response = c34474OooOoo0;
            }

            public static /* synthetic */ FunctionResponse copy$default(FunctionResponse functionResponse, String str, C34474OooOoo0 c34474OooOoo0, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = functionResponse.name;
                }
                if ((i & 2) != 0) {
                    c34474OooOoo0 = functionResponse.response;
                }
                return functionResponse.copy(str, c34474OooOoo0);
            }

            public static final /* synthetic */ void write$Self(FunctionResponse self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                output.OooOO0o(serialDesc, 0, self.name);
                output.OooOoo0(serialDesc, 1, C34473OooOoo.f123533OooO00o, self.response);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final C34474OooOoo0 getResponse() {
                return this.response;
            }

            public final FunctionResponse copy(String name, C34474OooOoo0 response) {
                OooOOO0.OooO0oO(name, "name");
                OooOOO0.OooO0oO(response, "response");
                return new FunctionResponse(name, response);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FunctionResponse)) {
                    return false;
                }
                FunctionResponse functionResponse = (FunctionResponse) other;
                return OooOOO0.OooO0O0(this.name, functionResponse.name) && OooOOO0.OooO0O0(this.response, functionResponse.response);
            }

            public final String getName() {
                return this.name;
            }

            public final C34474OooOoo0 getResponse() {
                return this.response;
            }

            public int hashCode() {
                return this.response.f123538OooOo0o.hashCode() + (this.name.hashCode() * 31);
            }

            public String toString() {
                return "FunctionResponse(name=" + this.name + ", response=" + this.response + ')';
            }

            public FunctionResponse(String name, C34474OooOoo0 response) {
                OooOOO0.OooO0oO(name, "name");
                OooOOO0.OooO0oO(response, "response");
                this.name = name;
                this.response = response;
            }
        }

        public /* synthetic */ Internal(int i, FunctionResponse functionResponse, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.functionResponse = functionResponse;
            } else {
                C24242OooOOo.OooO0O0(i, 1, FunctionResponsePart$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, FunctionResponse functionResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                functionResponse = internal.functionResponse;
            }
            return internal.copy(functionResponse);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FunctionResponse getFunctionResponse() {
            return this.functionResponse;
        }

        public final Internal copy(FunctionResponse functionResponse) {
            OooOOO0.OooO0oO(functionResponse, "functionResponse");
            return new Internal(functionResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Internal) && OooOOO0.OooO0O0(this.functionResponse, ((Internal) other).functionResponse);
        }

        public final FunctionResponse getFunctionResponse() {
            return this.functionResponse;
        }

        public int hashCode() {
            return this.functionResponse.hashCode();
        }

        public String toString() {
            return "Internal(functionResponse=" + this.functionResponse + ')';
        }

        public Internal(FunctionResponse functionResponse) {
            OooOOO0.OooO0oO(functionResponse, "functionResponse");
            this.functionResponse = functionResponse;
        }
    }

    public FunctionResponsePart(String name, C34474OooOoo0 response) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(response, "response");
        this.name = name;
        this.response = response;
    }

    public final String getName() {
        return this.name;
    }

    public final C34474OooOoo0 getResponse() {
        return this.response;
    }
}

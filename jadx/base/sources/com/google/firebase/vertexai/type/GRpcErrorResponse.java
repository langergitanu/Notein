package com.google.firebase.vertexai.type;

import com.aspose.slides.internal.p497xc.OooO00o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33977OoooOOo;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0003$#%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006&"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GRpcErrorResponse;", "Lcom/google/firebase/vertexai/type/Response;", "Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;", "error", "<init>", "(Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/GRpcErrorResponse;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;", "copy", "(Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;)Lcom/google/firebase/vertexai/type/GRpcErrorResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;", "getError", "Companion", "$serializer", "GRpcError", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final /* data */ class GRpcErrorResponse implements Response {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GRpcError error;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GRpcErrorResponse$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/GRpcErrorResponse;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final InterfaceC33911OooO0OO<GRpcErrorResponse> serializer() {
            return GRpcErrorResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0003,+-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nB=\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;", "", "", "code", "", "message", "", "Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$GRpcErrorDetails;", "details", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/util/List;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/util/List;)Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getDetails", "Companion", "$serializer", "GRpcErrorDetails", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class GRpcError {
        private final int code;
        private final List<GRpcErrorDetails> details;
        private final String message;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, new C33938OooO0o0(GRpcErrorResponse$GRpcError$GRpcErrorDetails$$serializer.INSTANCE)};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<GRpcError> serializer() {
                return GRpcErrorResponse$GRpcError$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC33908OooO
        @Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bBE\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ@\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$GRpcErrorDetails;", "", "", "reason", "domain", "", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$GRpcErrorDetails;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$GRpcErrorDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReason", "getDomain", "Ljava/util/Map;", "getMetadata", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final /* data */ class GRpcErrorDetails {
            private static final InterfaceC33911OooO0OO<Object>[] $childSerializers;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String domain;
            private final Map<String, String> metadata;
            private final String reason;

            @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$GRpcErrorDetails$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$GRpcErrorDetails;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                    this();
                }

                public final InterfaceC33911OooO0OO<GRpcErrorDetails> serializer() {
                    return GRpcErrorResponse$GRpcError$GRpcErrorDetails$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            static {
                o00000OO o00000oo2 = o00000OO.f122230OooO00o;
                $childSerializers = new InterfaceC33911OooO0OO[]{null, null, new C33977OoooOOo(o00000oo2, o00000oo2)};
            }

            public GRpcErrorDetails() {
                this((String) null, (String) null, (Map) null, 7, (C24018OooO0oo) null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GRpcErrorDetails copy$default(GRpcErrorDetails gRpcErrorDetails, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = gRpcErrorDetails.reason;
                }
                if ((i & 2) != 0) {
                    str2 = gRpcErrorDetails.domain;
                }
                if ((i & 4) != 0) {
                    map = gRpcErrorDetails.metadata;
                }
                return gRpcErrorDetails.copy(str, str2, map);
            }

            public static final /* synthetic */ void write$Self(GRpcErrorDetails self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
                if (output.OooOoO0(serialDesc) || self.reason != null) {
                    output.OooOo(serialDesc, 0, o00000OO.f122230OooO00o, self.reason);
                }
                if (output.OooOoO0(serialDesc) || self.domain != null) {
                    output.OooOo(serialDesc, 1, o00000OO.f122230OooO00o, self.domain);
                }
                if (!output.OooOoO0(serialDesc) && self.metadata == null) {
                    return;
                }
                output.OooOo(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.metadata);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getReason() {
                return this.reason;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDomain() {
                return this.domain;
            }

            public final Map<String, String> component3() {
                return this.metadata;
            }

            public final GRpcErrorDetails copy(String reason, String domain, Map<String, String> metadata) {
                return new GRpcErrorDetails(reason, domain, metadata);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GRpcErrorDetails)) {
                    return false;
                }
                GRpcErrorDetails gRpcErrorDetails = (GRpcErrorDetails) other;
                return OooOOO0.OooO0O0(this.reason, gRpcErrorDetails.reason) && OooOOO0.OooO0O0(this.domain, gRpcErrorDetails.domain) && OooOOO0.OooO0O0(this.metadata, gRpcErrorDetails.metadata);
            }

            public final String getDomain() {
                return this.domain;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                String str = this.reason;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.domain;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Map<String, String> map = this.metadata;
                return iHashCode2 + (map != null ? map.hashCode() : 0);
            }

            public String toString() {
                return "GRpcErrorDetails(reason=" + this.reason + ", domain=" + this.domain + ", metadata=" + this.metadata + ')';
            }

            public /* synthetic */ GRpcErrorDetails(int i, String str, String str2, Map map, o000000O o000000o2) {
                if ((i & 1) == 0) {
                    this.reason = null;
                } else {
                    this.reason = str;
                }
                if ((i & 2) == 0) {
                    this.domain = null;
                } else {
                    this.domain = str2;
                }
                if ((i & 4) == 0) {
                    this.metadata = null;
                } else {
                    this.metadata = map;
                }
            }

            public GRpcErrorDetails(String str, String str2, Map<String, String> map) {
                this.reason = str;
                this.domain = str2;
                this.metadata = map;
            }

            public /* synthetic */ GRpcErrorDetails(String str, String str2, Map map, int i, C24018OooO0oo c24018OooO0oo) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map);
            }
        }

        public /* synthetic */ GRpcError(int i, int i2, String str, List list, o000000O o000000o2) {
            if (3 != (i & 3)) {
                C24242OooOOo.OooO0O0(i, 3, GRpcErrorResponse$GRpcError$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.code = i2;
            this.message = str;
            if ((i & 4) == 0) {
                this.details = null;
            } else {
                this.details = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GRpcError copy$default(GRpcError gRpcError, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = gRpcError.code;
            }
            if ((i2 & 2) != 0) {
                str = gRpcError.message;
            }
            if ((i2 & 4) != 0) {
                list = gRpcError.details;
            }
            return gRpcError.copy(i, str, list);
        }

        public static final /* synthetic */ void write$Self(GRpcError self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            output.OooOoOO(0, self.code, serialDesc);
            output.OooOO0o(serialDesc, 1, self.message);
            if (!output.OooOoO0(serialDesc) && self.details == null) {
                return;
            }
            output.OooOo(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.details);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final List<GRpcErrorDetails> component3() {
            return this.details;
        }

        public final GRpcError copy(int code, String message, List<GRpcErrorDetails> details) {
            OooOOO0.OooO0oO(message, "message");
            return new GRpcError(code, message, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GRpcError)) {
                return false;
            }
            GRpcError gRpcError = (GRpcError) other;
            return this.code == gRpcError.code && OooOOO0.OooO0O0(this.message, gRpcError.message) && OooOOO0.OooO0O0(this.details, gRpcError.details);
        }

        public final int getCode() {
            return this.code;
        }

        public final List<GRpcErrorDetails> getDetails() {
            return this.details;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iOooO0O0 = OooO00o.OooO0O0(Integer.hashCode(this.code) * 31, 31, this.message);
            List<GRpcErrorDetails> list = this.details;
            return iOooO0O0 + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "GRpcError(code=" + this.code + ", message=" + this.message + ", details=" + this.details + ')';
        }

        public GRpcError(int i, String message, List<GRpcErrorDetails> list) {
            OooOOO0.OooO0oO(message, "message");
            this.code = i;
            this.message = message;
            this.details = list;
        }

        public /* synthetic */ GRpcError(int i, String str, List list, int i2, C24018OooO0oo c24018OooO0oo) {
            this(i, str, (i2 & 4) != 0 ? null : list);
        }
    }

    public /* synthetic */ GRpcErrorResponse(int i, GRpcError gRpcError, o000000O o000000o2) {
        if (1 == (i & 1)) {
            this.error = gRpcError;
        } else {
            C24242OooOOo.OooO0O0(i, 1, GRpcErrorResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ GRpcErrorResponse copy$default(GRpcErrorResponse gRpcErrorResponse, GRpcError gRpcError, int i, Object obj) {
        if ((i & 1) != 0) {
            gRpcError = gRpcErrorResponse.error;
        }
        return gRpcErrorResponse.copy(gRpcError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GRpcError getError() {
        return this.error;
    }

    public final GRpcErrorResponse copy(GRpcError error) {
        OooOOO0.OooO0oO(error, "error");
        return new GRpcErrorResponse(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GRpcErrorResponse) && OooOOO0.OooO0O0(this.error, ((GRpcErrorResponse) other).error);
    }

    public final GRpcError getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        return "GRpcErrorResponse(error=" + this.error + ')';
    }

    public GRpcErrorResponse(GRpcError error) {
        OooOOO0.OooO0oO(error, "error");
        this.error = error;
    }
}

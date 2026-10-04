package com.google.firebase.vertexai.type;

import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.vertexai.type.Schema;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\r\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionDeclaration;", "", "name", "", "description", "parameters", "", "Lcom/google/firebase/vertexai/type/Schema;", "optionalParameters", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getDescription$com_google_firebase_firebase_vertexai", "()Ljava/lang/String;", "getName$com_google_firebase_firebase_vertexai", "getOptionalParameters$com_google_firebase_firebase_vertexai", "()Ljava/util/List;", "getParameters$com_google_firebase_firebase_vertexai", "()Ljava/util/Map;", "schema", "getSchema$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/Schema;", "toInternal", "Lcom/google/firebase/vertexai/type/FunctionDeclaration$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FunctionDeclaration {
    private final String description;
    private final String name;
    private final List<String> optionalParameters;
    private final Map<String, Schema> parameters;
    private final Schema schema;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionDeclaration$Internal;", "", "", "name", "description", "Lcom/google/firebase/vertexai/type/Schema$Internal;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/Schema$Internal;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/Schema$Internal;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/FunctionDeclaration$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/google/firebase/vertexai/type/Schema$Internal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/Schema$Internal;)Lcom/google/firebase/vertexai/type/FunctionDeclaration$Internal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDescription", "Lcom/google/firebase/vertexai/type/Schema$Internal;", "getParameters", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final String name;
        private final Schema.Internal parameters;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FunctionDeclaration$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FunctionDeclaration$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return FunctionDeclaration$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, String str, String str2, Schema.Internal internal, o000000O o000000o2) {
            if (7 != (i & 7)) {
                C24242OooOOo.OooO0O0(i, 7, FunctionDeclaration$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.name = str;
            this.description = str2;
            this.parameters = internal;
        }

        public static /* synthetic */ Internal copy$default(Internal internal, String str, String str2, Schema.Internal internal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internal.name;
            }
            if ((i & 2) != 0) {
                str2 = internal.description;
            }
            if ((i & 4) != 0) {
                internal2 = internal.parameters;
            }
            return internal.copy(str, str2, internal2);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            output.OooOO0o(serialDesc, 0, self.name);
            output.OooOO0o(serialDesc, 1, self.description);
            output.OooOoo0(serialDesc, 2, Schema$Internal$$serializer.INSTANCE, self.parameters);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Schema.Internal getParameters() {
            return this.parameters;
        }

        public final Internal copy(String name, String description, Schema.Internal parameters) {
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(description, "description");
            OooOOO0.OooO0oO(parameters, "parameters");
            return new Internal(name, description, parameters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.name, internal.name) && OooOOO0.OooO0O0(this.description, internal.description) && OooOOO0.OooO0O0(this.parameters, internal.parameters);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public final Schema.Internal getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            return this.parameters.hashCode() + OooO00o.OooO0O0(this.name.hashCode() * 31, 31, this.description);
        }

        public String toString() {
            return "Internal(name=" + this.name + ", description=" + this.description + ", parameters=" + this.parameters + ')';
        }

        public Internal(String name, String description, Schema.Internal parameters) {
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(description, "description");
            OooOOO0.OooO0oO(parameters, "parameters");
            this.name = name;
            this.description = description;
            this.parameters = parameters;
        }
    }

    public FunctionDeclaration(String name, String description, Map<String, Schema> parameters, List<String> optionalParameters) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(parameters, "parameters");
        OooOOO0.OooO0oO(optionalParameters, "optionalParameters");
        this.name = name;
        this.description = description;
        this.parameters = parameters;
        this.optionalParameters = optionalParameters;
        this.schema = Schema.Companion.obj$default(Schema.INSTANCE, parameters, optionalParameters, null, false, 4, null);
    }

    /* JADX INFO: renamed from: getDescription$com_google_firebase_firebase_vertexai, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: getName$com_google_firebase_firebase_vertexai, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> getOptionalParameters$com_google_firebase_firebase_vertexai() {
        return this.optionalParameters;
    }

    public final Map<String, Schema> getParameters$com_google_firebase_firebase_vertexai() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: getSchema$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Schema getSchema() {
        return this.schema;
    }

    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        return new Internal(this.name, "", this.schema.toInternal$com_google_firebase_firebase_vertexai());
    }

    public /* synthetic */ FunctionDeclaration(String str, String str2, Map map, List list, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, map, (i & 8) != 0 ? C34434OooOoO.f123453OooOo0o : list);
    }
}

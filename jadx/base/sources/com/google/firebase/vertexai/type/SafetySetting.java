package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.HarmBlockMethod;
import com.google.firebase.vertexai.type.HarmBlockThreshold;
import com.google.firebase.vertexai.type.HarmCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/SafetySetting;", "", "harmCategory", "Lcom/google/firebase/vertexai/type/HarmCategory;", "threshold", "Lcom/google/firebase/vertexai/type/HarmBlockThreshold;", "method", "Lcom/google/firebase/vertexai/type/HarmBlockMethod;", "(Lcom/google/firebase/vertexai/type/HarmCategory;Lcom/google/firebase/vertexai/type/HarmBlockThreshold;Lcom/google/firebase/vertexai/type/HarmBlockMethod;)V", "getHarmCategory$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/HarmCategory;", "getMethod$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/HarmBlockMethod;", "getThreshold$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/HarmBlockThreshold;", "toInternal", "Lcom/google/firebase/vertexai/type/SafetySetting$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SafetySetting {
    private final HarmCategory harmCategory;
    private final HarmBlockMethod method;
    private final HarmBlockThreshold threshold;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001c¨\u00060"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/SafetySetting$Internal;", "", "Lcom/google/firebase/vertexai/type/HarmCategory$Internal;", "category", "Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;", "threshold", "Lcom/google/firebase/vertexai/type/HarmBlockMethod$Internal;", "method", "<init>", "(Lcom/google/firebase/vertexai/type/HarmCategory$Internal;Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;Lcom/google/firebase/vertexai/type/HarmBlockMethod$Internal;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/HarmCategory$Internal;Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;Lcom/google/firebase/vertexai/type/HarmBlockMethod$Internal;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/SafetySetting$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/HarmCategory$Internal;", "component2", "()Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;", "component3", "()Lcom/google/firebase/vertexai/type/HarmBlockMethod$Internal;", "copy", "(Lcom/google/firebase/vertexai/type/HarmCategory$Internal;Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;Lcom/google/firebase/vertexai/type/HarmBlockMethod$Internal;)Lcom/google/firebase/vertexai/type/SafetySetting$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/HarmCategory$Internal;", "getCategory", "Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;", "getThreshold", "Lcom/google/firebase/vertexai/type/HarmBlockMethod$Internal;", "getMethod", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private final HarmCategory.Internal category;
        private final HarmBlockMethod.Internal method;
        private final HarmBlockThreshold.Internal threshold;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, HarmBlockThreshold.Internal.INSTANCE.serializer(), HarmBlockMethod.Internal.INSTANCE.serializer()};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/SafetySetting$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/SafetySetting$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return SafetySetting$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, HarmCategory.Internal internal, HarmBlockThreshold.Internal internal2, HarmBlockMethod.Internal internal3, o000000O o000000o2) {
            if (3 != (i & 3)) {
                C24242OooOOo.OooO0O0(i, 3, SafetySetting$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.category = internal;
            this.threshold = internal2;
            if ((i & 4) == 0) {
                this.method = null;
            } else {
                this.method = internal3;
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, HarmCategory.Internal internal2, HarmBlockThreshold.Internal internal3, HarmBlockMethod.Internal internal4, int i, Object obj) {
            if ((i & 1) != 0) {
                internal2 = internal.category;
            }
            if ((i & 2) != 0) {
                internal3 = internal.threshold;
            }
            if ((i & 4) != 0) {
                internal4 = internal.method;
            }
            return internal.copy(internal2, internal3, internal4);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            output.OooOoo0(serialDesc, 0, HarmCategory.Internal.Serializer.INSTANCE, self.category);
            output.OooOoo0(serialDesc, 1, interfaceC33911OooO0OOArr[1], self.threshold);
            if (!output.OooOoO0(serialDesc) && self.method == null) {
                return;
            }
            output.OooOo(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.method);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HarmCategory.Internal getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HarmBlockThreshold.Internal getThreshold() {
            return this.threshold;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HarmBlockMethod.Internal getMethod() {
            return this.method;
        }

        public final Internal copy(HarmCategory.Internal category, HarmBlockThreshold.Internal threshold, HarmBlockMethod.Internal method) {
            OooOOO0.OooO0oO(category, "category");
            OooOOO0.OooO0oO(threshold, "threshold");
            return new Internal(category, threshold, method);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return this.category == internal.category && this.threshold == internal.threshold && this.method == internal.method;
        }

        public final HarmCategory.Internal getCategory() {
            return this.category;
        }

        public final HarmBlockMethod.Internal getMethod() {
            return this.method;
        }

        public final HarmBlockThreshold.Internal getThreshold() {
            return this.threshold;
        }

        public int hashCode() {
            int iHashCode = (this.threshold.hashCode() + (this.category.hashCode() * 31)) * 31;
            HarmBlockMethod.Internal internal = this.method;
            return iHashCode + (internal == null ? 0 : internal.hashCode());
        }

        public String toString() {
            return "Internal(category=" + this.category + ", threshold=" + this.threshold + ", method=" + this.method + ')';
        }

        public Internal(HarmCategory.Internal category, HarmBlockThreshold.Internal threshold, HarmBlockMethod.Internal internal) {
            OooOOO0.OooO0oO(category, "category");
            OooOOO0.OooO0oO(threshold, "threshold");
            this.category = category;
            this.threshold = threshold;
            this.method = internal;
        }

        public /* synthetic */ Internal(HarmCategory.Internal internal, HarmBlockThreshold.Internal internal2, HarmBlockMethod.Internal internal3, int i, C24018OooO0oo c24018OooO0oo) {
            this(internal, internal2, (i & 4) != 0 ? null : internal3);
        }
    }

    public SafetySetting(HarmCategory harmCategory, HarmBlockThreshold threshold, HarmBlockMethod harmBlockMethod) {
        OooOOO0.OooO0oO(harmCategory, "harmCategory");
        OooOOO0.OooO0oO(threshold, "threshold");
        this.harmCategory = harmCategory;
        this.threshold = threshold;
        this.method = harmBlockMethod;
    }

    /* JADX INFO: renamed from: getHarmCategory$com_google_firebase_firebase_vertexai, reason: from getter */
    public final HarmCategory getHarmCategory() {
        return this.harmCategory;
    }

    /* JADX INFO: renamed from: getMethod$com_google_firebase_firebase_vertexai, reason: from getter */
    public final HarmBlockMethod getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: getThreshold$com_google_firebase_firebase_vertexai, reason: from getter */
    public final HarmBlockThreshold getThreshold() {
        return this.threshold;
    }

    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        HarmCategory.Internal internal$com_google_firebase_firebase_vertexai = this.harmCategory.toInternal$com_google_firebase_firebase_vertexai();
        HarmBlockThreshold.Internal internal$com_google_firebase_firebase_vertexai2 = this.threshold.toInternal$com_google_firebase_firebase_vertexai();
        HarmBlockMethod harmBlockMethod = this.method;
        return new Internal(internal$com_google_firebase_firebase_vertexai, internal$com_google_firebase_firebase_vertexai2, harmBlockMethod != null ? harmBlockMethod.toInternal$com_google_firebase_firebase_vertexai() : null);
    }

    public /* synthetic */ SafetySetting(HarmCategory harmCategory, HarmBlockThreshold harmBlockThreshold, HarmBlockMethod harmBlockMethod, int i, C24018OooO0oo c24018OooO0oo) {
        this(harmCategory, harmBlockThreshold, (i & 4) != 0 ? null : harmBlockMethod);
    }
}

package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.HarmCategory;
import com.google.firebase.vertexai.type.HarmProbability;
import com.google.firebase.vertexai.type.HarmSeverity;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33940OooO0oo;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u001cBE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/SafetyRating;", "", "category", "Lcom/google/firebase/vertexai/type/HarmCategory;", "probability", "Lcom/google/firebase/vertexai/type/HarmProbability;", "probabilityScore", "", "blocked", "", "severity", "Lcom/google/firebase/vertexai/type/HarmSeverity;", "severityScore", "(Lcom/google/firebase/vertexai/type/HarmCategory;Lcom/google/firebase/vertexai/type/HarmProbability;FLjava/lang/Boolean;Lcom/google/firebase/vertexai/type/HarmSeverity;Ljava/lang/Float;)V", "getBlocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCategory", "()Lcom/google/firebase/vertexai/type/HarmCategory;", "getProbability", "()Lcom/google/firebase/vertexai/type/HarmProbability;", "getProbabilityScore", "()F", "getSeverity", "()Lcom/google/firebase/vertexai/type/HarmSeverity;", "getSeverityScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SafetyRating {
    private final Boolean blocked;
    private final HarmCategory category;
    private final HarmProbability probability;
    private final float probabilityScore;
    private final HarmSeverity severity;
    private final Float severityScore;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002A@BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010'JT\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b?\u0010'¨\u0006B"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/SafetyRating$Internal;", "", "Lcom/google/firebase/vertexai/type/HarmCategory$Internal;", "category", "Lcom/google/firebase/vertexai/type/HarmProbability$Internal;", "probability", "", "blocked", "", "probabilityScore", "Lcom/google/firebase/vertexai/type/HarmSeverity$Internal;", "severity", "severityScore", "<init>", "(Lcom/google/firebase/vertexai/type/HarmCategory$Internal;Lcom/google/firebase/vertexai/type/HarmProbability$Internal;Ljava/lang/Boolean;Ljava/lang/Float;Lcom/google/firebase/vertexai/type/HarmSeverity$Internal;Ljava/lang/Float;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/HarmCategory$Internal;Lcom/google/firebase/vertexai/type/HarmProbability$Internal;Ljava/lang/Boolean;Ljava/lang/Float;Lcom/google/firebase/vertexai/type/HarmSeverity$Internal;Ljava/lang/Float;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/SafetyRating$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/SafetyRating;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/SafetyRating;", "toPublic", "component1", "()Lcom/google/firebase/vertexai/type/HarmCategory$Internal;", "component2", "()Lcom/google/firebase/vertexai/type/HarmProbability$Internal;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/Float;", "component5", "()Lcom/google/firebase/vertexai/type/HarmSeverity$Internal;", "component6", "copy", "(Lcom/google/firebase/vertexai/type/HarmCategory$Internal;Lcom/google/firebase/vertexai/type/HarmProbability$Internal;Ljava/lang/Boolean;Ljava/lang/Float;Lcom/google/firebase/vertexai/type/HarmSeverity$Internal;Ljava/lang/Float;)Lcom/google/firebase/vertexai/type/SafetyRating$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/HarmCategory$Internal;", "getCategory", "Lcom/google/firebase/vertexai/type/HarmProbability$Internal;", "getProbability", "Ljava/lang/Boolean;", "getBlocked", "Ljava/lang/Float;", "getProbabilityScore", "Lcom/google/firebase/vertexai/type/HarmSeverity$Internal;", "getSeverity", "getSeverityScore", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean blocked;
        private final HarmCategory.Internal category;
        private final HarmProbability.Internal probability;
        private final Float probabilityScore;
        private final HarmSeverity.Internal severity;
        private final Float severityScore;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/SafetyRating$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/SafetyRating$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return SafetyRating$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Internal(HarmCategory.Internal category, HarmProbability.Internal probability) {
            this(category, probability, (Boolean) null, (Float) null, (HarmSeverity.Internal) null, (Float) null, 60, (C24018OooO0oo) null);
            OooOOO0.OooO0oO(category, "category");
            OooOOO0.OooO0oO(probability, "probability");
        }

        public static /* synthetic */ Internal copy$default(Internal internal, HarmCategory.Internal internal2, HarmProbability.Internal internal3, Boolean bool, Float f, HarmSeverity.Internal internal4, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                internal2 = internal.category;
            }
            if ((i & 2) != 0) {
                internal3 = internal.probability;
            }
            if ((i & 4) != 0) {
                bool = internal.blocked;
            }
            if ((i & 8) != 0) {
                f = internal.probabilityScore;
            }
            if ((i & 16) != 0) {
                internal4 = internal.severity;
            }
            if ((i & 32) != 0) {
                f2 = internal.severityScore;
            }
            HarmSeverity.Internal internal5 = internal4;
            Float f3 = f2;
            return internal.copy(internal2, internal3, bool, f, internal5, f3);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            output.OooOoo0(serialDesc, 0, HarmCategory.Internal.Serializer.INSTANCE, self.category);
            output.OooOoo0(serialDesc, 1, HarmProbability.Internal.Serializer.INSTANCE, self.probability);
            if (output.OooOoO0(serialDesc) || self.blocked != null) {
                output.OooOo(serialDesc, 2, C33940OooO0oo.f122144OooO00o, self.blocked);
            }
            if (output.OooOoO0(serialDesc) || self.probabilityScore != null) {
                output.OooOo(serialDesc, 3, C33965Oooo0O0.f122189OooO00o, self.probabilityScore);
            }
            if (output.OooOoO0(serialDesc) || self.severity != null) {
                output.OooOo(serialDesc, 4, HarmSeverity.Internal.Serializer.INSTANCE, self.severity);
            }
            if (!output.OooOoO0(serialDesc) && self.severityScore == null) {
                return;
            }
            output.OooOo(serialDesc, 5, C33965Oooo0O0.f122189OooO00o, self.severityScore);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HarmCategory.Internal getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HarmProbability.Internal getProbability() {
            return this.probability;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getBlocked() {
            return this.blocked;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Float getProbabilityScore() {
            return this.probabilityScore;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final HarmSeverity.Internal getSeverity() {
            return this.severity;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Float getSeverityScore() {
            return this.severityScore;
        }

        public final Internal copy(HarmCategory.Internal category, HarmProbability.Internal probability, Boolean blocked, Float probabilityScore, HarmSeverity.Internal severity, Float severityScore) {
            OooOOO0.OooO0oO(category, "category");
            OooOOO0.OooO0oO(probability, "probability");
            return new Internal(category, probability, blocked, probabilityScore, severity, severityScore);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return this.category == internal.category && this.probability == internal.probability && OooOOO0.OooO0O0(this.blocked, internal.blocked) && OooOOO0.OooO0O0(this.probabilityScore, internal.probabilityScore) && this.severity == internal.severity && OooOOO0.OooO0O0(this.severityScore, internal.severityScore);
        }

        public final Boolean getBlocked() {
            return this.blocked;
        }

        public final HarmCategory.Internal getCategory() {
            return this.category;
        }

        public final HarmProbability.Internal getProbability() {
            return this.probability;
        }

        public final Float getProbabilityScore() {
            return this.probabilityScore;
        }

        public final HarmSeverity.Internal getSeverity() {
            return this.severity;
        }

        public final Float getSeverityScore() {
            return this.severityScore;
        }

        public int hashCode() {
            int iHashCode = (this.probability.hashCode() + (this.category.hashCode() * 31)) * 31;
            Boolean bool = this.blocked;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.probabilityScore;
            int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            HarmSeverity.Internal internal = this.severity;
            int iHashCode4 = (iHashCode3 + (internal == null ? 0 : internal.hashCode())) * 31;
            Float f2 = this.severityScore;
            return iHashCode4 + (f2 != null ? f2.hashCode() : 0);
        }

        public final SafetyRating toPublic$com_google_firebase_firebase_vertexai() {
            HarmCategory public$com_google_firebase_firebase_vertexai = this.category.toPublic$com_google_firebase_firebase_vertexai();
            HarmProbability public$com_google_firebase_firebase_vertexai2 = this.probability.toPublic$com_google_firebase_firebase_vertexai();
            Float f = this.probabilityScore;
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            Boolean bool = this.blocked;
            HarmSeverity.Internal internal = this.severity;
            return new SafetyRating(public$com_google_firebase_firebase_vertexai, public$com_google_firebase_firebase_vertexai2, fFloatValue, bool, internal != null ? internal.toPublic$com_google_firebase_firebase_vertexai() : null, this.severityScore);
        }

        public String toString() {
            return "Internal(category=" + this.category + ", probability=" + this.probability + ", blocked=" + this.blocked + ", probabilityScore=" + this.probabilityScore + ", severity=" + this.severity + ", severityScore=" + this.severityScore + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Internal(HarmCategory.Internal category, HarmProbability.Internal probability, Boolean bool) {
            this(category, probability, bool, (Float) null, (HarmSeverity.Internal) null, (Float) null, 56, (C24018OooO0oo) null);
            OooOOO0.OooO0oO(category, "category");
            OooOOO0.OooO0oO(probability, "probability");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Internal(HarmCategory.Internal category, HarmProbability.Internal probability, Boolean bool, Float f) {
            this(category, probability, bool, f, (HarmSeverity.Internal) null, (Float) null, 48, (C24018OooO0oo) null);
            OooOOO0.OooO0oO(category, "category");
            OooOOO0.OooO0oO(probability, "probability");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Internal(HarmCategory.Internal category, HarmProbability.Internal probability, Boolean bool, Float f, HarmSeverity.Internal internal) {
            this(category, probability, bool, f, internal, (Float) null, 32, (C24018OooO0oo) null);
            OooOOO0.OooO0oO(category, "category");
            OooOOO0.OooO0oO(probability, "probability");
        }

        public /* synthetic */ Internal(int i, HarmCategory.Internal internal, HarmProbability.Internal internal2, Boolean bool, Float f, HarmSeverity.Internal internal3, Float f2, o000000O o000000o2) {
            if (3 != (i & 3)) {
                C24242OooOOo.OooO0O0(i, 3, SafetyRating$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.category = internal;
            this.probability = internal2;
            if ((i & 4) == 0) {
                this.blocked = null;
            } else {
                this.blocked = bool;
            }
            if ((i & 8) == 0) {
                this.probabilityScore = null;
            } else {
                this.probabilityScore = f;
            }
            if ((i & 16) == 0) {
                this.severity = null;
            } else {
                this.severity = internal3;
            }
            if ((i & 32) == 0) {
                this.severityScore = null;
            } else {
                this.severityScore = f2;
            }
        }

        public Internal(HarmCategory.Internal category, HarmProbability.Internal probability, Boolean bool, Float f, HarmSeverity.Internal internal, Float f2) {
            OooOOO0.OooO0oO(category, "category");
            OooOOO0.OooO0oO(probability, "probability");
            this.category = category;
            this.probability = probability;
            this.blocked = bool;
            this.probabilityScore = f;
            this.severity = internal;
            this.severityScore = f2;
        }

        public /* synthetic */ Internal(HarmCategory.Internal internal, HarmProbability.Internal internal2, Boolean bool, Float f, HarmSeverity.Internal internal3, Float f2, int i, C24018OooO0oo c24018OooO0oo) {
            this(internal, internal2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : internal3, (i & 32) != 0 ? null : f2);
        }
    }

    public SafetyRating(HarmCategory category, HarmProbability probability, float f, Boolean bool, HarmSeverity harmSeverity, Float f2) {
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(probability, "probability");
        this.category = category;
        this.probability = probability;
        this.probabilityScore = f;
        this.blocked = bool;
        this.severity = harmSeverity;
        this.severityScore = f2;
    }

    public final Boolean getBlocked() {
        return this.blocked;
    }

    public final HarmCategory getCategory() {
        return this.category;
    }

    public final HarmProbability getProbability() {
        return this.probability;
    }

    public final float getProbabilityScore() {
        return this.probabilityScore;
    }

    public final HarmSeverity getSeverity() {
        return this.severity;
    }

    public final Float getSeverityScore() {
        return this.severityScore;
    }

    public /* synthetic */ SafetyRating(HarmCategory harmCategory, HarmProbability harmProbability, float f, Boolean bool, HarmSeverity harmSeverity, Float f2, int i, C24018OooO0oo c24018OooO0oo) {
        this(harmCategory, harmProbability, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : harmSeverity, (i & 32) != 0 ? null : f2);
    }
}

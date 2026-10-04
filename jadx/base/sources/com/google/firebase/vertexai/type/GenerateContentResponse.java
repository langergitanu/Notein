package com.google.firebase.vertexai.type;

import OooOoOO.C20519OooO0Oo;
import com.google.firebase.vertexai.type.Candidate;
import com.google.firebase.vertexai.type.PromptFeedback;
import com.google.firebase.vertexai.type.UsageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\r¨\u0006\u001f"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "", "", "Lcom/google/firebase/vertexai/type/Candidate;", "candidates", "Lcom/google/firebase/vertexai/type/PromptFeedback;", "promptFeedback", "Lcom/google/firebase/vertexai/type/UsageMetadata;", "usageMetadata", "<init>", "(Ljava/util/List;Lcom/google/firebase/vertexai/type/PromptFeedback;Lcom/google/firebase/vertexai/type/UsageMetadata;)V", "Ljava/util/List;", "getCandidates", "()Ljava/util/List;", "Lcom/google/firebase/vertexai/type/PromptFeedback;", "getPromptFeedback", "()Lcom/google/firebase/vertexai/type/PromptFeedback;", "Lcom/google/firebase/vertexai/type/UsageMetadata;", "getUsageMetadata", "()Lcom/google/firebase/vertexai/type/UsageMetadata;", "", "text$delegate", "LoO00ooO/OooOO0;", "getText", "()Ljava/lang/String;", "text", "Lcom/google/firebase/vertexai/type/FunctionCallPart;", "functionCalls$delegate", "getFunctionCalls", "functionCalls", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class GenerateContentResponse {
    private final List<Candidate> candidates;

    /* JADX INFO: renamed from: functionCalls$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 functionCalls;
    private final PromptFeedback promptFeedback;

    /* JADX INFO: renamed from: text$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 text;
    private final UsageMetadata usageMetadata;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 42\u00020\u0001:\u000254B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!¨\u00066"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "Lcom/google/firebase/vertexai/type/Response;", "", "Lcom/google/firebase/vertexai/type/Candidate$Internal;", "candidates", "Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;", "promptFeedback", "Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;", "usageMetadata", "<init>", "(Ljava/util/List;Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "toPublic", "component1", "()Ljava/util/List;", "component2", "()Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;", "component3", "()Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;", "copy", "(Ljava/util/List;Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;)Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCandidates", "Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;", "getPromptFeedback", "Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;", "getUsageMetadata", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal implements Response {
        private final List<Candidate.Internal> candidates;
        private final PromptFeedback.Internal promptFeedback;
        private final UsageMetadata.Internal usageMetadata;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {new C33938OooO0o0(Candidate$Internal$$serializer.INSTANCE), null, null};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return GenerateContentResponse$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Internal() {
            this((List) null, (PromptFeedback.Internal) null, (UsageMetadata.Internal) null, 7, (C24018OooO0oo) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, List list, PromptFeedback.Internal internal2, UsageMetadata.Internal internal3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = internal.candidates;
            }
            if ((i & 2) != 0) {
                internal2 = internal.promptFeedback;
            }
            if ((i & 4) != 0) {
                internal3 = internal.usageMetadata;
            }
            return internal.copy(list, internal2, internal3);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            if (output.OooOoO0(serialDesc) || self.candidates != null) {
                output.OooOo(serialDesc, 0, interfaceC33911OooO0OOArr[0], self.candidates);
            }
            if (output.OooOoO0(serialDesc) || self.promptFeedback != null) {
                output.OooOo(serialDesc, 1, PromptFeedback$Internal$$serializer.INSTANCE, self.promptFeedback);
            }
            if (!output.OooOoO0(serialDesc) && self.usageMetadata == null) {
                return;
            }
            output.OooOo(serialDesc, 2, UsageMetadata$Internal$$serializer.INSTANCE, self.usageMetadata);
        }

        public final List<Candidate.Internal> component1() {
            return this.candidates;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PromptFeedback.Internal getPromptFeedback() {
            return this.promptFeedback;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final UsageMetadata.Internal getUsageMetadata() {
            return this.usageMetadata;
        }

        public final Internal copy(List<Candidate.Internal> candidates, PromptFeedback.Internal promptFeedback, UsageMetadata.Internal usageMetadata) {
            return new Internal(candidates, promptFeedback, usageMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.candidates, internal.candidates) && OooOOO0.OooO0O0(this.promptFeedback, internal.promptFeedback) && OooOOO0.OooO0O0(this.usageMetadata, internal.usageMetadata);
        }

        public final List<Candidate.Internal> getCandidates() {
            return this.candidates;
        }

        public final PromptFeedback.Internal getPromptFeedback() {
            return this.promptFeedback;
        }

        public final UsageMetadata.Internal getUsageMetadata() {
            return this.usageMetadata;
        }

        public int hashCode() {
            List<Candidate.Internal> list = this.candidates;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            PromptFeedback.Internal internal = this.promptFeedback;
            int iHashCode2 = (iHashCode + (internal == null ? 0 : internal.hashCode())) * 31;
            UsageMetadata.Internal internal2 = this.usageMetadata;
            return iHashCode2 + (internal2 != null ? internal2.hashCode() : 0);
        }

        public final GenerateContentResponse toPublic$com_google_firebase_firebase_vertexai() {
            List arrayList;
            List<Candidate.Internal> list = this.candidates;
            if (list != null) {
                List<Candidate.Internal> list2 = list;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Candidate.Internal) it.next()).toPublic$com_google_firebase_firebase_vertexai());
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = C34434OooOoO.f123453OooOo0o;
            }
            PromptFeedback.Internal internal = this.promptFeedback;
            PromptFeedback public$com_google_firebase_firebase_vertexai = internal != null ? internal.toPublic$com_google_firebase_firebase_vertexai() : null;
            UsageMetadata.Internal internal2 = this.usageMetadata;
            return new GenerateContentResponse(arrayList, public$com_google_firebase_firebase_vertexai, internal2 != null ? internal2.toPublic$com_google_firebase_firebase_vertexai() : null);
        }

        public String toString() {
            return "Internal(candidates=" + this.candidates + ", promptFeedback=" + this.promptFeedback + ", usageMetadata=" + this.usageMetadata + ')';
        }

        public /* synthetic */ Internal(int i, List list, PromptFeedback.Internal internal, UsageMetadata.Internal internal2, o000000O o000000o2) {
            if ((i & 1) == 0) {
                this.candidates = null;
            } else {
                this.candidates = list;
            }
            if ((i & 2) == 0) {
                this.promptFeedback = null;
            } else {
                this.promptFeedback = internal;
            }
            if ((i & 4) == 0) {
                this.usageMetadata = null;
            } else {
                this.usageMetadata = internal2;
            }
        }

        public Internal(List<Candidate.Internal> list, PromptFeedback.Internal internal, UsageMetadata.Internal internal2) {
            this.candidates = list;
            this.promptFeedback = internal;
            this.usageMetadata = internal2;
        }

        public /* synthetic */ Internal(List list, PromptFeedback.Internal internal, UsageMetadata.Internal internal2, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : internal, (i & 4) != 0 ? null : internal2);
        }
    }

    public GenerateContentResponse(List<Candidate> candidates, PromptFeedback promptFeedback, UsageMetadata usageMetadata) {
        OooOOO0.OooO0oO(candidates, "candidates");
        this.candidates = candidates;
        this.promptFeedback = promptFeedback;
        this.usageMetadata = usageMetadata;
        this.text = C20519OooO0Oo.OooO0OO(new GenerateContentResponse$text$2(this));
        this.functionCalls = C20519OooO0Oo.OooO0OO(new GenerateContentResponse$functionCalls$2(this));
    }

    public final List<Candidate> getCandidates() {
        return this.candidates;
    }

    public final List<FunctionCallPart> getFunctionCalls() {
        return (List) this.functionCalls.getValue();
    }

    public final PromptFeedback getPromptFeedback() {
        return this.promptFeedback;
    }

    public final String getText() {
        return (String) this.text.getValue();
    }

    public final UsageMetadata getUsageMetadata() {
        return this.usageMetadata;
    }
}

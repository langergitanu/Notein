package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.ModalityTokenCount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33971OoooO;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0013B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0086\u0002¢\u0006\u0002\u0010\fJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0086\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/CountTokensResponse;", "", "totalTokens", "", "totalBillableCharacters", "promptTokensDetails", "", "Lcom/google/firebase/vertexai/type/ModalityTokenCount;", "(ILjava/lang/Integer;Ljava/util/List;)V", "getPromptTokensDetails", "()Ljava/util/List;", "getTotalBillableCharacters", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalTokens", "()I", "component1", "component2", "component3", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class CountTokensResponse {
    private final List<ModalityTokenCount> promptTokensDetails;
    private final Integer totalBillableCharacters;
    private final int totalTokens;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB=\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/CountTokensResponse$Internal;", "Lcom/google/firebase/vertexai/type/Response;", "", "totalTokens", "totalBillableCharacters", "", "Lcom/google/firebase/vertexai/type/ModalityTokenCount$Internal;", "promptTokensDetails", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/util/List;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/CountTokensResponse$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/CountTokensResponse;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/CountTokensResponse;", "toPublic", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/util/List;", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lcom/google/firebase/vertexai/type/CountTokensResponse$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalTokens", "Ljava/lang/Integer;", "getTotalBillableCharacters", "Ljava/util/List;", "getPromptTokensDetails", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal implements Response {
        private final List<ModalityTokenCount.Internal> promptTokensDetails;
        private final Integer totalBillableCharacters;
        private final int totalTokens;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, new C33938OooO0o0(ModalityTokenCount$Internal$$serializer.INSTANCE)};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/CountTokensResponse$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/CountTokensResponse$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return CountTokensResponse$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, int i2, Integer num, List list, o000000O o000000o2) {
            if (1 != (i & 1)) {
                C24242OooOOo.OooO0O0(i, 1, CountTokensResponse$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.totalTokens = i2;
            if ((i & 2) == 0) {
                this.totalBillableCharacters = null;
            } else {
                this.totalBillableCharacters = num;
            }
            if ((i & 4) == 0) {
                this.promptTokensDetails = null;
            } else {
                this.promptTokensDetails = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = internal.totalTokens;
            }
            if ((i2 & 2) != 0) {
                num = internal.totalBillableCharacters;
            }
            if ((i2 & 4) != 0) {
                list = internal.promptTokensDetails;
            }
            return internal.copy(i, num, list);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            output.OooOoOO(0, self.totalTokens, serialDesc);
            if (output.OooOoO0(serialDesc) || self.totalBillableCharacters != null) {
                output.OooOo(serialDesc, 1, C33971OoooO.f122193OooO00o, self.totalBillableCharacters);
            }
            if (!output.OooOoO0(serialDesc) && self.promptTokensDetails == null) {
                return;
            }
            output.OooOo(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.promptTokensDetails);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTotalTokens() {
            return this.totalTokens;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getTotalBillableCharacters() {
            return this.totalBillableCharacters;
        }

        public final List<ModalityTokenCount.Internal> component3() {
            return this.promptTokensDetails;
        }

        public final Internal copy(int totalTokens, Integer totalBillableCharacters, List<ModalityTokenCount.Internal> promptTokensDetails) {
            return new Internal(totalTokens, totalBillableCharacters, promptTokensDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return this.totalTokens == internal.totalTokens && OooOOO0.OooO0O0(this.totalBillableCharacters, internal.totalBillableCharacters) && OooOOO0.OooO0O0(this.promptTokensDetails, internal.promptTokensDetails);
        }

        public final List<ModalityTokenCount.Internal> getPromptTokensDetails() {
            return this.promptTokensDetails;
        }

        public final Integer getTotalBillableCharacters() {
            return this.totalBillableCharacters;
        }

        public final int getTotalTokens() {
            return this.totalTokens;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.totalTokens) * 31;
            Integer num = this.totalBillableCharacters;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<ModalityTokenCount.Internal> list = this.promptTokensDetails;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final CountTokensResponse toPublic$com_google_firebase_firebase_vertexai() {
            List arrayList;
            int i = this.totalTokens;
            Integer num = this.totalBillableCharacters;
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
            List<ModalityTokenCount.Internal> list = this.promptTokensDetails;
            if (list != null) {
                List<ModalityTokenCount.Internal> list2 = list;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ModalityTokenCount.Internal) it.next()).toPublic$com_google_firebase_firebase_vertexai());
                }
            } else {
                arrayList = C34434OooOoO.f123453OooOo0o;
            }
            return new CountTokensResponse(i, numValueOf, arrayList);
        }

        public String toString() {
            return "Internal(totalTokens=" + this.totalTokens + ", totalBillableCharacters=" + this.totalBillableCharacters + ", promptTokensDetails=" + this.promptTokensDetails + ')';
        }

        public Internal(int i, Integer num, List<ModalityTokenCount.Internal> list) {
            this.totalTokens = i;
            this.totalBillableCharacters = num;
            this.promptTokensDetails = list;
        }

        public /* synthetic */ Internal(int i, Integer num, List list, int i2, C24018OooO0oo c24018OooO0oo) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : list);
        }
    }

    public CountTokensResponse(int i, Integer num, List<ModalityTokenCount> promptTokensDetails) {
        OooOOO0.OooO0oO(promptTokensDetails, "promptTokensDetails");
        this.totalTokens = i;
        this.totalBillableCharacters = num;
        this.promptTokensDetails = promptTokensDetails;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalTokens() {
        return this.totalTokens;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTotalBillableCharacters() {
        return this.totalBillableCharacters;
    }

    public final List<ModalityTokenCount> component3() {
        return this.promptTokensDetails;
    }

    public final List<ModalityTokenCount> getPromptTokensDetails() {
        return this.promptTokensDetails;
    }

    public final Integer getTotalBillableCharacters() {
        return this.totalBillableCharacters;
    }

    public final int getTotalTokens() {
        return this.totalTokens;
    }

    public /* synthetic */ CountTokensResponse(int i, Integer num, List list, int i2, C24018OooO0oo c24018OooO0oo) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? C34434OooOoO.f123453OooOo0o : list);
    }
}

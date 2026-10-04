package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.ModalityTokenCount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
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
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0014B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/UsageMetadata;", "", "promptTokenCount", "", "candidatesTokenCount", "totalTokenCount", "promptTokensDetails", "", "Lcom/google/firebase/vertexai/type/ModalityTokenCount;", "candidatesTokensDetails", "(ILjava/lang/Integer;ILjava/util/List;Ljava/util/List;)V", "getCandidatesTokenCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCandidatesTokensDetails", "()Ljava/util/List;", "getPromptTokenCount", "()I", "getPromptTokensDetails", "getTotalTokenCount", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class UsageMetadata {
    private final Integer candidatesTokenCount;
    private final List<ModalityTokenCount> candidatesTokensDetails;
    private final int promptTokenCount;
    private final List<ModalityTokenCount> promptTokensDetails;
    private final int totalTokenCount;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 52\u00020\u0001:\u000265BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBY\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!JX\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b4\u0010!¨\u00067"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;", "", "", "promptTokenCount", "candidatesTokenCount", "totalTokenCount", "", "Lcom/google/firebase/vertexai/type/ModalityTokenCount$Internal;", "promptTokensDetails", "candidatesTokensDetails", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/UsageMetadata;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/UsageMetadata;", "toPublic", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getPromptTokenCount", "getCandidatesTokenCount", "getTotalTokenCount", "Ljava/util/List;", "getPromptTokensDetails", "getCandidatesTokensDetails", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer candidatesTokenCount;
        private final List<ModalityTokenCount.Internal> candidatesTokensDetails;
        private final Integer promptTokenCount;
        private final List<ModalityTokenCount.Internal> promptTokensDetails;
        private final Integer totalTokenCount;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/UsageMetadata$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/UsageMetadata$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return UsageMetadata$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            ModalityTokenCount$Internal$$serializer modalityTokenCount$Internal$$serializer = ModalityTokenCount$Internal$$serializer.INSTANCE;
            $childSerializers = new InterfaceC33911OooO0OO[]{null, null, null, new C33938OooO0o0(modalityTokenCount$Internal$$serializer), new C33938OooO0o0(modalityTokenCount$Internal$$serializer)};
        }

        public Internal() {
            this((Integer) null, (Integer) null, (Integer) null, (List) null, (List) null, 31, (C24018OooO0oo) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, Integer num, Integer num2, Integer num3, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = internal.promptTokenCount;
            }
            if ((i & 2) != 0) {
                num2 = internal.candidatesTokenCount;
            }
            if ((i & 4) != 0) {
                num3 = internal.totalTokenCount;
            }
            if ((i & 8) != 0) {
                list = internal.promptTokensDetails;
            }
            if ((i & 16) != 0) {
                list2 = internal.candidatesTokensDetails;
            }
            List list3 = list2;
            Integer num4 = num3;
            return internal.copy(num, num2, num4, list, list3);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            if (output.OooOoO0(serialDesc) || self.promptTokenCount != null) {
                output.OooOo(serialDesc, 0, C33971OoooO.f122193OooO00o, self.promptTokenCount);
            }
            if (output.OooOoO0(serialDesc) || self.candidatesTokenCount != null) {
                output.OooOo(serialDesc, 1, C33971OoooO.f122193OooO00o, self.candidatesTokenCount);
            }
            if (output.OooOoO0(serialDesc) || self.totalTokenCount != null) {
                output.OooOo(serialDesc, 2, C33971OoooO.f122193OooO00o, self.totalTokenCount);
            }
            if (output.OooOoO0(serialDesc) || self.promptTokensDetails != null) {
                output.OooOo(serialDesc, 3, interfaceC33911OooO0OOArr[3], self.promptTokensDetails);
            }
            if (!output.OooOoO0(serialDesc) && self.candidatesTokensDetails == null) {
                return;
            }
            output.OooOo(serialDesc, 4, interfaceC33911OooO0OOArr[4], self.candidatesTokensDetails);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getPromptTokenCount() {
            return this.promptTokenCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getCandidatesTokenCount() {
            return this.candidatesTokenCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getTotalTokenCount() {
            return this.totalTokenCount;
        }

        public final List<ModalityTokenCount.Internal> component4() {
            return this.promptTokensDetails;
        }

        public final List<ModalityTokenCount.Internal> component5() {
            return this.candidatesTokensDetails;
        }

        public final Internal copy(Integer promptTokenCount, Integer candidatesTokenCount, Integer totalTokenCount, List<ModalityTokenCount.Internal> promptTokensDetails, List<ModalityTokenCount.Internal> candidatesTokensDetails) {
            return new Internal(promptTokenCount, candidatesTokenCount, totalTokenCount, promptTokensDetails, candidatesTokensDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.promptTokenCount, internal.promptTokenCount) && OooOOO0.OooO0O0(this.candidatesTokenCount, internal.candidatesTokenCount) && OooOOO0.OooO0O0(this.totalTokenCount, internal.totalTokenCount) && OooOOO0.OooO0O0(this.promptTokensDetails, internal.promptTokensDetails) && OooOOO0.OooO0O0(this.candidatesTokensDetails, internal.candidatesTokensDetails);
        }

        public final Integer getCandidatesTokenCount() {
            return this.candidatesTokenCount;
        }

        public final List<ModalityTokenCount.Internal> getCandidatesTokensDetails() {
            return this.candidatesTokensDetails;
        }

        public final Integer getPromptTokenCount() {
            return this.promptTokenCount;
        }

        public final List<ModalityTokenCount.Internal> getPromptTokensDetails() {
            return this.promptTokensDetails;
        }

        public final Integer getTotalTokenCount() {
            return this.totalTokenCount;
        }

        public int hashCode() {
            Integer num = this.promptTokenCount;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.candidatesTokenCount;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.totalTokenCount;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            List<ModalityTokenCount.Internal> list = this.promptTokensDetails;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            List<ModalityTokenCount.Internal> list2 = this.candidatesTokensDetails;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        public final UsageMetadata toPublic$com_google_firebase_firebase_vertexai() {
            List arrayList;
            Integer num = this.promptTokenCount;
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = this.candidatesTokenCount;
            Integer numValueOf = Integer.valueOf(num2 != null ? num2.intValue() : 0);
            Integer num3 = this.totalTokenCount;
            int iIntValue2 = num3 != null ? num3.intValue() : 0;
            List<ModalityTokenCount.Internal> list = this.promptTokensDetails;
            List arrayList2 = C34434OooOoO.f123453OooOo0o;
            if (list != null) {
                List<ModalityTokenCount.Internal> list2 = list;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ModalityTokenCount.Internal) it.next()).toPublic$com_google_firebase_firebase_vertexai());
                }
            } else {
                arrayList = arrayList2;
            }
            List<ModalityTokenCount.Internal> list3 = this.candidatesTokensDetails;
            if (list3 != null) {
                List<ModalityTokenCount.Internal> list4 = list3;
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ModalityTokenCount.Internal) it2.next()).toPublic$com_google_firebase_firebase_vertexai());
                }
            }
            return new UsageMetadata(iIntValue, numValueOf, iIntValue2, arrayList, arrayList2);
        }

        public String toString() {
            return "Internal(promptTokenCount=" + this.promptTokenCount + ", candidatesTokenCount=" + this.candidatesTokenCount + ", totalTokenCount=" + this.totalTokenCount + ", promptTokensDetails=" + this.promptTokensDetails + ", candidatesTokensDetails=" + this.candidatesTokensDetails + ')';
        }

        public /* synthetic */ Internal(int i, Integer num, Integer num2, Integer num3, List list, List list2, o000000O o000000o2) {
            if ((i & 1) == 0) {
                this.promptTokenCount = null;
            } else {
                this.promptTokenCount = num;
            }
            if ((i & 2) == 0) {
                this.candidatesTokenCount = null;
            } else {
                this.candidatesTokenCount = num2;
            }
            if ((i & 4) == 0) {
                this.totalTokenCount = null;
            } else {
                this.totalTokenCount = num3;
            }
            if ((i & 8) == 0) {
                this.promptTokensDetails = null;
            } else {
                this.promptTokensDetails = list;
            }
            if ((i & 16) == 0) {
                this.candidatesTokensDetails = null;
            } else {
                this.candidatesTokensDetails = list2;
            }
        }

        public Internal(Integer num, Integer num2, Integer num3, List<ModalityTokenCount.Internal> list, List<ModalityTokenCount.Internal> list2) {
            this.promptTokenCount = num;
            this.candidatesTokenCount = num2;
            this.totalTokenCount = num3;
            this.promptTokensDetails = list;
            this.candidatesTokensDetails = list2;
        }

        public /* synthetic */ Internal(Integer num, Integer num2, Integer num3, List list, List list2, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
        }
    }

    public UsageMetadata(int i, Integer num, int i2, List<ModalityTokenCount> promptTokensDetails, List<ModalityTokenCount> candidatesTokensDetails) {
        OooOOO0.OooO0oO(promptTokensDetails, "promptTokensDetails");
        OooOOO0.OooO0oO(candidatesTokensDetails, "candidatesTokensDetails");
        this.promptTokenCount = i;
        this.candidatesTokenCount = num;
        this.totalTokenCount = i2;
        this.promptTokensDetails = promptTokensDetails;
        this.candidatesTokensDetails = candidatesTokensDetails;
    }

    public final Integer getCandidatesTokenCount() {
        return this.candidatesTokenCount;
    }

    public final List<ModalityTokenCount> getCandidatesTokensDetails() {
        return this.candidatesTokensDetails;
    }

    public final int getPromptTokenCount() {
        return this.promptTokenCount;
    }

    public final List<ModalityTokenCount> getPromptTokensDetails() {
        return this.promptTokensDetails;
    }

    public final int getTotalTokenCount() {
        return this.totalTokenCount;
    }
}

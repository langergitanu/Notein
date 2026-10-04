package com.google.firebase.vertexai.type;

import Oooo0oO.C21111o0ooOoO;
import com.google.firebase.vertexai.type.BlockReason;
import com.google.firebase.vertexai.type.SafetyRating;
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
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0010B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/PromptFeedback;", "", "blockReason", "Lcom/google/firebase/vertexai/type/BlockReason;", "safetyRatings", "", "Lcom/google/firebase/vertexai/type/SafetyRating;", "blockReasonMessage", "", "(Lcom/google/firebase/vertexai/type/BlockReason;Ljava/util/List;Ljava/lang/String;)V", "getBlockReason", "()Lcom/google/firebase/vertexai/type/BlockReason;", "getBlockReasonMessage", "()Ljava/lang/String;", "getSafetyRatings", "()Ljava/util/List;", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class PromptFeedback {
    private final BlockReason blockReason;
    private final String blockReasonMessage;
    private final List<SafetyRating> safetyRatings;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001dR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010!¨\u00063"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;", "", "Lcom/google/firebase/vertexai/type/BlockReason$Internal;", "blockReason", "", "Lcom/google/firebase/vertexai/type/SafetyRating$Internal;", "safetyRatings", "", "blockReasonMessage", "<init>", "(Lcom/google/firebase/vertexai/type/BlockReason$Internal;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/BlockReason$Internal;Ljava/util/List;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/PromptFeedback;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/PromptFeedback;", "toPublic", "component1", "()Lcom/google/firebase/vertexai/type/BlockReason$Internal;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/google/firebase/vertexai/type/BlockReason$Internal;Ljava/util/List;Ljava/lang/String;)Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/BlockReason$Internal;", "getBlockReason", "Ljava/util/List;", "getSafetyRatings", "Ljava/lang/String;", "getBlockReasonMessage", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private final BlockReason.Internal blockReason;
        private final String blockReasonMessage;
        private final List<SafetyRating.Internal> safetyRatings;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, new C33938OooO0o0(SafetyRating$Internal$$serializer.INSTANCE), null};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/PromptFeedback$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/PromptFeedback$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return PromptFeedback$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Internal() {
            this((BlockReason.Internal) null, (List) null, (String) null, 7, (C24018OooO0oo) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, BlockReason.Internal internal2, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                internal2 = internal.blockReason;
            }
            if ((i & 2) != 0) {
                list = internal.safetyRatings;
            }
            if ((i & 4) != 0) {
                str = internal.blockReasonMessage;
            }
            return internal.copy(internal2, list, str);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            if (output.OooOoO0(serialDesc) || self.blockReason != null) {
                output.OooOo(serialDesc, 0, BlockReason.Internal.Serializer.INSTANCE, self.blockReason);
            }
            if (output.OooOoO0(serialDesc) || self.safetyRatings != null) {
                output.OooOo(serialDesc, 1, interfaceC33911OooO0OOArr[1], self.safetyRatings);
            }
            if (!output.OooOoO0(serialDesc) && self.blockReasonMessage == null) {
                return;
            }
            output.OooOo(serialDesc, 2, o00000OO.f122230OooO00o, self.blockReasonMessage);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BlockReason.Internal getBlockReason() {
            return this.blockReason;
        }

        public final List<SafetyRating.Internal> component2() {
            return this.safetyRatings;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBlockReasonMessage() {
            return this.blockReasonMessage;
        }

        public final Internal copy(BlockReason.Internal blockReason, List<SafetyRating.Internal> safetyRatings, String blockReasonMessage) {
            return new Internal(blockReason, safetyRatings, blockReasonMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return this.blockReason == internal.blockReason && OooOOO0.OooO0O0(this.safetyRatings, internal.safetyRatings) && OooOOO0.OooO0O0(this.blockReasonMessage, internal.blockReasonMessage);
        }

        public final BlockReason.Internal getBlockReason() {
            return this.blockReason;
        }

        public final String getBlockReasonMessage() {
            return this.blockReasonMessage;
        }

        public final List<SafetyRating.Internal> getSafetyRatings() {
            return this.safetyRatings;
        }

        public int hashCode() {
            BlockReason.Internal internal = this.blockReason;
            int iHashCode = (internal == null ? 0 : internal.hashCode()) * 31;
            List<SafetyRating.Internal> list = this.safetyRatings;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.blockReasonMessage;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final PromptFeedback toPublic$com_google_firebase_firebase_vertexai() {
            List arrayList;
            List<SafetyRating.Internal> list = this.safetyRatings;
            if (list != null) {
                List<SafetyRating.Internal> list2 = list;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SafetyRating.Internal) it.next()).toPublic$com_google_firebase_firebase_vertexai());
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = C34434OooOoO.f123453OooOo0o;
            }
            BlockReason.Internal internal = this.blockReason;
            return new PromptFeedback(internal != null ? internal.toPublic$com_google_firebase_firebase_vertexai() : null, arrayList, this.blockReasonMessage);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Internal(blockReason=");
            sb.append(this.blockReason);
            sb.append(", safetyRatings=");
            sb.append(this.safetyRatings);
            sb.append(", blockReasonMessage=");
            return C21111o0ooOoO.OooO0OO(this.blockReasonMessage, ')', sb);
        }

        public /* synthetic */ Internal(int i, BlockReason.Internal internal, List list, String str, o000000O o000000o2) {
            if ((i & 1) == 0) {
                this.blockReason = null;
            } else {
                this.blockReason = internal;
            }
            if ((i & 2) == 0) {
                this.safetyRatings = null;
            } else {
                this.safetyRatings = list;
            }
            if ((i & 4) == 0) {
                this.blockReasonMessage = null;
            } else {
                this.blockReasonMessage = str;
            }
        }

        public Internal(BlockReason.Internal internal, List<SafetyRating.Internal> list, String str) {
            this.blockReason = internal;
            this.safetyRatings = list;
            this.blockReasonMessage = str;
        }

        public /* synthetic */ Internal(BlockReason.Internal internal, List list, String str, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : internal, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
        }
    }

    public PromptFeedback(BlockReason blockReason, List<SafetyRating> safetyRatings, String str) {
        OooOOO0.OooO0oO(safetyRatings, "safetyRatings");
        this.blockReason = blockReason;
        this.safetyRatings = safetyRatings;
        this.blockReasonMessage = str;
    }

    public final BlockReason getBlockReason() {
        return this.blockReason;
    }

    public final String getBlockReasonMessage() {
        return this.blockReasonMessage;
    }

    public final List<SafetyRating> getSafetyRatings() {
        return this.safetyRatings;
    }
}

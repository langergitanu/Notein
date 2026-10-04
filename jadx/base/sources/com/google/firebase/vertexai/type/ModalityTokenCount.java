package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.ContentModality;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33971OoooO;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u0086\u0002J\t\u0010\f\u001a\u00020\u0005H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ModalityTokenCount;", "", "modality", "Lcom/google/firebase/vertexai/type/ContentModality;", "tokenCount", "", "(Lcom/google/firebase/vertexai/type/ContentModality;I)V", "getModality", "()Lcom/google/firebase/vertexai/type/ContentModality;", "getTokenCount", "()I", "component1", "component2", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ModalityTokenCount {
    private final ContentModality modality;
    private final int tokenCount;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006-"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ModalityTokenCount$Internal;", "", "Lcom/google/firebase/vertexai/type/ContentModality$Internal;", "modality", "", "tokenCount", "<init>", "(Lcom/google/firebase/vertexai/type/ContentModality$Internal;Ljava/lang/Integer;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/ContentModality$Internal;Ljava/lang/Integer;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/ModalityTokenCount$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/ModalityTokenCount;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/ModalityTokenCount;", "toPublic", "component1", "()Lcom/google/firebase/vertexai/type/ContentModality$Internal;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/google/firebase/vertexai/type/ContentModality$Internal;Ljava/lang/Integer;)Lcom/google/firebase/vertexai/type/ModalityTokenCount$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/ContentModality$Internal;", "getModality", "Ljava/lang/Integer;", "getTokenCount", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ContentModality.Internal modality;
        private final Integer tokenCount;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ModalityTokenCount$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/ModalityTokenCount$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return ModalityTokenCount$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, ContentModality.Internal internal, Integer num, o000000O o000000o2) {
            if (1 != (i & 1)) {
                C24242OooOOo.OooO0O0(i, 1, ModalityTokenCount$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.modality = internal;
            if ((i & 2) == 0) {
                this.tokenCount = null;
            } else {
                this.tokenCount = num;
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, ContentModality.Internal internal2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                internal2 = internal.modality;
            }
            if ((i & 2) != 0) {
                num = internal.tokenCount;
            }
            return internal.copy(internal2, num);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            output.OooOoo0(serialDesc, 0, ContentModality.Internal.Serializer.INSTANCE, self.modality);
            if (!output.OooOoO0(serialDesc) && self.tokenCount == null) {
                return;
            }
            output.OooOo(serialDesc, 1, C33971OoooO.f122193OooO00o, self.tokenCount);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ContentModality.Internal getModality() {
            return this.modality;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getTokenCount() {
            return this.tokenCount;
        }

        public final Internal copy(ContentModality.Internal modality, Integer tokenCount) {
            OooOOO0.OooO0oO(modality, "modality");
            return new Internal(modality, tokenCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return this.modality == internal.modality && OooOOO0.OooO0O0(this.tokenCount, internal.tokenCount);
        }

        public final ContentModality.Internal getModality() {
            return this.modality;
        }

        public final Integer getTokenCount() {
            return this.tokenCount;
        }

        public int hashCode() {
            int iHashCode = this.modality.hashCode() * 31;
            Integer num = this.tokenCount;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final ModalityTokenCount toPublic$com_google_firebase_firebase_vertexai() {
            ContentModality public$com_google_firebase_firebase_vertexai = this.modality.toPublic$com_google_firebase_firebase_vertexai();
            Integer num = this.tokenCount;
            return new ModalityTokenCount(public$com_google_firebase_firebase_vertexai, num != null ? num.intValue() : 0, null);
        }

        public String toString() {
            return "Internal(modality=" + this.modality + ", tokenCount=" + this.tokenCount + ')';
        }

        public Internal(ContentModality.Internal modality, Integer num) {
            OooOOO0.OooO0oO(modality, "modality");
            this.modality = modality;
            this.tokenCount = num;
        }

        public /* synthetic */ Internal(ContentModality.Internal internal, Integer num, int i, C24018OooO0oo c24018OooO0oo) {
            this(internal, (i & 2) != 0 ? null : num);
        }
    }

    public /* synthetic */ ModalityTokenCount(ContentModality contentModality, int i, C24018OooO0oo c24018OooO0oo) {
        this(contentModality, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ContentModality getModality() {
        return this.modality;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTokenCount() {
        return this.tokenCount;
    }

    public final ContentModality getModality() {
        return this.modality;
    }

    public final int getTokenCount() {
        return this.tokenCount;
    }

    private ModalityTokenCount(ContentModality contentModality, int i) {
        this.modality = contentModality;
        this.tokenCount = i;
    }
}

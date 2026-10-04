package com.google.firebase.vertexai.type;

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
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenImageFormat;", "", "mimeType", "", "compressionQuality", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getCompressionQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMimeType", "()Ljava/lang/String;", "toInternal", "Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Companion", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenImageFormat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer compressionQuality;
    private final String mimeType;

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenImageFormat$Companion;", "", "()V", "jpeg", "Lcom/google/firebase/vertexai/type/ImagenImageFormat;", "compressionQuality", "", "(Ljava/lang/Integer;)Lcom/google/firebase/vertexai/type/ImagenImageFormat;", "png", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ ImagenImageFormat jpeg$default(Companion companion, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            return companion.jpeg(num);
        }

        public final ImagenImageFormat jpeg(Integer compressionQuality) {
            return new ImagenImageFormat("image/jpeg", compressionQuality, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ImagenImageFormat png() {
            return new ImagenImageFormat("image/png", null, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0017¨\u0006'"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;", "", "", "mimeType", "", "compressionQuality", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMimeType", "Ljava/lang/Integer;", "getCompressionQuality", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer compressionQuality;
        private final String mimeType;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return ImagenImageFormat$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, String str, Integer num, o000000O o000000o2) {
            if (3 != (i & 3)) {
                C24242OooOOo.OooO0O0(i, 3, ImagenImageFormat$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.mimeType = str;
            this.compressionQuality = num;
        }

        public static /* synthetic */ Internal copy$default(Internal internal, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internal.mimeType;
            }
            if ((i & 2) != 0) {
                num = internal.compressionQuality;
            }
            return internal.copy(str, num);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            output.OooOO0o(serialDesc, 0, self.mimeType);
            output.OooOo(serialDesc, 1, C33971OoooO.f122193OooO00o, self.compressionQuality);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getCompressionQuality() {
            return this.compressionQuality;
        }

        public final Internal copy(String mimeType, Integer compressionQuality) {
            OooOOO0.OooO0oO(mimeType, "mimeType");
            return new Internal(mimeType, compressionQuality);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.mimeType, internal.mimeType) && OooOOO0.OooO0O0(this.compressionQuality, internal.compressionQuality);
        }

        public final Integer getCompressionQuality() {
            return this.compressionQuality;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            int iHashCode = this.mimeType.hashCode() * 31;
            Integer num = this.compressionQuality;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Internal(mimeType=" + this.mimeType + ", compressionQuality=" + this.compressionQuality + ')';
        }

        public Internal(String mimeType, Integer num) {
            OooOOO0.OooO0oO(mimeType, "mimeType");
            this.mimeType = mimeType;
            this.compressionQuality = num;
        }
    }

    public /* synthetic */ ImagenImageFormat(String str, Integer num, C24018OooO0oo c24018OooO0oo) {
        this(str, num);
    }

    public static final ImagenImageFormat jpeg(Integer num) {
        return INSTANCE.jpeg(num);
    }

    public static final ImagenImageFormat png() {
        return INSTANCE.png();
    }

    public final Integer getCompressionQuality() {
        return this.compressionQuality;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        return new Internal(this.mimeType, this.compressionQuality);
    }

    private ImagenImageFormat(String str, Integer num) {
        this.mimeType = str;
        this.compressionQuality = num;
    }
}

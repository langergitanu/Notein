package com.google.firebase.vertexai.type;

import Oooo0oO.C21111o0ooOoO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33580OooO00o;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\f\rB\u001f\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGenerationResponse;", "T", "", "images", "", "filteredReason", "", "(Ljava/util/List;Ljava/lang/String;)V", "getFilteredReason", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "ImagenImageResponse", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenGenerationResponse<T> {
    private final String filteredReason;
    private final List<T> images;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ@\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001f¨\u00063"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$ImagenImageResponse;", "", "", "bytesBase64Encoded", "gcsUri", "mimeType", "raiFilteredReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$ImagenImageResponse;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/ImagenInlineImage;", "toPublicInline$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/ImagenInlineImage;", "toPublicInline", "Lcom/google/firebase/vertexai/type/ImagenGCSImage;", "toPublicGCS$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/ImagenGCSImage;", "toPublicGCS", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$ImagenImageResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBytesBase64Encoded", "getGcsUri", "getMimeType", "getRaiFilteredReason", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class ImagenImageResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String bytesBase64Encoded;
        private final String gcsUri;
        private final String mimeType;
        private final String raiFilteredReason;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$ImagenImageResponse$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$ImagenImageResponse;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<ImagenImageResponse> serializer() {
                return ImagenGenerationResponse$ImagenImageResponse$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ImagenImageResponse() {
            this((String) null, (String) null, (String) null, (String) null, 15, (C24018OooO0oo) null);
        }

        public static /* synthetic */ ImagenImageResponse copy$default(ImagenImageResponse imagenImageResponse, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = imagenImageResponse.bytesBase64Encoded;
            }
            if ((i & 2) != 0) {
                str2 = imagenImageResponse.gcsUri;
            }
            if ((i & 4) != 0) {
                str3 = imagenImageResponse.mimeType;
            }
            if ((i & 8) != 0) {
                str4 = imagenImageResponse.raiFilteredReason;
            }
            return imagenImageResponse.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self(ImagenImageResponse self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            if (output.OooOoO0(serialDesc) || self.bytesBase64Encoded != null) {
                output.OooOo(serialDesc, 0, o00000OO.f122230OooO00o, self.bytesBase64Encoded);
            }
            if (output.OooOoO0(serialDesc) || self.gcsUri != null) {
                output.OooOo(serialDesc, 1, o00000OO.f122230OooO00o, self.gcsUri);
            }
            if (output.OooOoO0(serialDesc) || self.mimeType != null) {
                output.OooOo(serialDesc, 2, o00000OO.f122230OooO00o, self.mimeType);
            }
            if (!output.OooOoO0(serialDesc) && self.raiFilteredReason == null) {
                return;
            }
            output.OooOo(serialDesc, 3, o00000OO.f122230OooO00o, self.raiFilteredReason);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBytesBase64Encoded() {
            return this.bytesBase64Encoded;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getGcsUri() {
            return this.gcsUri;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRaiFilteredReason() {
            return this.raiFilteredReason;
        }

        public final ImagenImageResponse copy(String bytesBase64Encoded, String gcsUri, String mimeType, String raiFilteredReason) {
            return new ImagenImageResponse(bytesBase64Encoded, gcsUri, mimeType, raiFilteredReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImagenImageResponse)) {
                return false;
            }
            ImagenImageResponse imagenImageResponse = (ImagenImageResponse) other;
            return OooOOO0.OooO0O0(this.bytesBase64Encoded, imagenImageResponse.bytesBase64Encoded) && OooOOO0.OooO0O0(this.gcsUri, imagenImageResponse.gcsUri) && OooOOO0.OooO0O0(this.mimeType, imagenImageResponse.mimeType) && OooOOO0.OooO0O0(this.raiFilteredReason, imagenImageResponse.raiFilteredReason);
        }

        public final String getBytesBase64Encoded() {
            return this.bytesBase64Encoded;
        }

        public final String getGcsUri() {
            return this.gcsUri;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getRaiFilteredReason() {
            return this.raiFilteredReason;
        }

        public int hashCode() {
            String str = this.bytesBase64Encoded;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.gcsUri;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mimeType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.raiFilteredReason;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final ImagenGCSImage toPublicGCS$com_google_firebase_firebase_vertexai() {
            String str = this.gcsUri;
            OooOOO0.OooO0Oo(str);
            String str2 = this.mimeType;
            OooOOO0.OooO0Oo(str2);
            return new ImagenGCSImage(str, str2);
        }

        public final ImagenInlineImage toPublicInline$com_google_firebase_firebase_vertexai() {
            String str = this.bytesBase64Encoded;
            OooOOO0.OooO0Oo(str);
            byte[] bytes = str.getBytes(C33580OooO00o.f121231OooO0O0);
            OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
            String str2 = this.mimeType;
            OooOOO0.OooO0Oo(str2);
            return new ImagenInlineImage(bytes, str2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ImagenImageResponse(bytesBase64Encoded=");
            sb.append(this.bytesBase64Encoded);
            sb.append(", gcsUri=");
            sb.append(this.gcsUri);
            sb.append(", mimeType=");
            sb.append(this.mimeType);
            sb.append(", raiFilteredReason=");
            return C21111o0ooOoO.OooO0OO(this.raiFilteredReason, ')', sb);
        }

        public /* synthetic */ ImagenImageResponse(int i, String str, String str2, String str3, String str4, o000000O o000000o2) {
            if ((i & 1) == 0) {
                this.bytesBase64Encoded = null;
            } else {
                this.bytesBase64Encoded = str;
            }
            if ((i & 2) == 0) {
                this.gcsUri = null;
            } else {
                this.gcsUri = str2;
            }
            if ((i & 4) == 0) {
                this.mimeType = null;
            } else {
                this.mimeType = str3;
            }
            if ((i & 8) == 0) {
                this.raiFilteredReason = null;
            } else {
                this.raiFilteredReason = str4;
            }
        }

        public ImagenImageResponse(String str, String str2, String str3, String str4) {
            this.bytesBase64Encoded = str;
            this.gcsUri = str2;
            this.mimeType = str3;
            this.raiFilteredReason = str4;
        }

        public /* synthetic */ ImagenImageResponse(String str, String str2, String str3, String str4, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006-"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$Internal;", "", "", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$ImagenImageResponse;", "predictions", "<init>", "(Ljava/util/List;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/util/List;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse;", "Lcom/google/firebase/vertexai/type/ImagenGCSImage;", "toPublicGCS$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/ImagenGenerationResponse;", "toPublicGCS", "Lcom/google/firebase/vertexai/type/ImagenInlineImage;", "toPublicInline$com_google_firebase_firebase_vertexai", "toPublicInline", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPredictions", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private final List<ImagenImageResponse> predictions;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {new C33938OooO0o0(ImagenGenerationResponse$ImagenImageResponse$$serializer.INSTANCE)};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return ImagenGenerationResponse$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, List list, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.predictions = list;
            } else {
                C24242OooOOo.OooO0O0(i, 1, ImagenGenerationResponse$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = internal.predictions;
            }
            return internal.copy(list);
        }

        public final List<ImagenImageResponse> component1() {
            return this.predictions;
        }

        public final Internal copy(List<ImagenImageResponse> predictions) {
            OooOOO0.OooO0oO(predictions, "predictions");
            return new Internal(predictions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Internal) && OooOOO0.OooO0O0(this.predictions, ((Internal) other).predictions);
        }

        public final List<ImagenImageResponse> getPredictions() {
            return this.predictions;
        }

        public int hashCode() {
            return this.predictions.hashCode();
        }

        public final ImagenGenerationResponse<ImagenGCSImage> toPublicGCS$com_google_firebase_firebase_vertexai() {
            List<ImagenImageResponse> list = this.predictions;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (((ImagenImageResponse) t).getMimeType() != null) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ImagenImageResponse) it.next()).toPublicGCS$com_google_firebase_firebase_vertexai());
            }
            return new ImagenGenerationResponse<>(arrayList2, null);
        }

        public final ImagenGenerationResponse<ImagenInlineImage> toPublicInline$com_google_firebase_firebase_vertexai() {
            List<ImagenImageResponse> list = this.predictions;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (((ImagenImageResponse) t).getMimeType() != null) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ImagenImageResponse) it.next()).toPublicInline$com_google_firebase_firebase_vertexai());
            }
            return new ImagenGenerationResponse<>(arrayList2, null);
        }

        public String toString() {
            return "Internal(predictions=" + this.predictions + ')';
        }

        public Internal(List<ImagenImageResponse> predictions) {
            OooOOO0.OooO0oO(predictions, "predictions");
            this.predictions = predictions;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImagenGenerationResponse(List<? extends T> images, String str) {
        OooOOO0.OooO0oO(images, "images");
        this.images = images;
        this.filteredReason = str;
    }

    public final String getFilteredReason() {
        return this.filteredReason;
    }

    public final List<T> getImages() {
        return this.images;
    }
}

package com.google.firebase.vertexai.common;

import Oooo0oO.C21111o0ooOoO;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.vertexai.type.ImagenImageFormat;
import com.google.firebase.vertexai.type.ImagenImageFormat$Internal$$serializer;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33940OooO0oo;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0004+*,-B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006."}, m80612d2 = {"Lcom/google/firebase/vertexai/common/GenerateImageRequest;", "Lcom/google/firebase/vertexai/common/Request;", "", "Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenPrompt;", "instances", "Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;", "parameters", "<init>", "(Ljava/util/List;Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/common/GenerateImageRequest;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;", "copy", "(Ljava/util/List;Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;)Lcom/google/firebase/vertexai/common/GenerateImageRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInstances", "Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;", "getParameters", "Companion", "$serializer", "ImagenParameters", "ImagenPrompt", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final /* data */ class GenerateImageRequest implements Request {
    private final List<ImagenPrompt> instances;
    private final ImagenParameters parameters;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {new C33938OooO0o0(GenerateImageRequest$ImagenPrompt$$serializer.INSTANCE), null};

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/GenerateImageRequest$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/common/GenerateImageRequest;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final InterfaceC33911OooO0OO<GenerateImageRequest> serializer() {
            return GenerateImageRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002A@B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u001a\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b8\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b9\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b:\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b;\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010*¨\u0006B"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;", "", "", "sampleCount", "", "includeRaiReason", "", "storageUri", "negativePrompt", "aspectRatio", "safetySetting", "personGeneration", "addWatermark", "Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;", "imageOutputOptions", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()I", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "()Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;", "copy", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;)Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getSampleCount", "Z", "getIncludeRaiReason", "Ljava/lang/String;", "getStorageUri", "getNegativePrompt", "getAspectRatio", "getSafetySetting", "getPersonGeneration", "Ljava/lang/Boolean;", "getAddWatermark", "Lcom/google/firebase/vertexai/type/ImagenImageFormat$Internal;", "getImageOutputOptions", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class ImagenParameters {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean addWatermark;
        private final String aspectRatio;
        private final ImagenImageFormat.Internal imageOutputOptions;
        private final boolean includeRaiReason;
        private final String negativePrompt;
        private final String personGeneration;
        private final String safetySetting;
        private final int sampleCount;
        private final String storageUri;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenParameters;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<ImagenParameters> serializer() {
                return GenerateImageRequest$ImagenParameters$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ ImagenParameters(int i, int i2, boolean z, String str, String str2, String str3, String str4, String str5, Boolean bool, ImagenImageFormat.Internal internal, o000000O o000000o2) {
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                C24242OooOOo.OooO0O0(i, FrameMetricsAggregator.EVERY_DURATION, GenerateImageRequest$ImagenParameters$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.sampleCount = i2;
            this.includeRaiReason = z;
            this.storageUri = str;
            this.negativePrompt = str2;
            this.aspectRatio = str3;
            this.safetySetting = str4;
            this.personGeneration = str5;
            this.addWatermark = bool;
            this.imageOutputOptions = internal;
        }

        public static /* synthetic */ ImagenParameters copy$default(ImagenParameters imagenParameters, int i, boolean z, String str, String str2, String str3, String str4, String str5, Boolean bool, ImagenImageFormat.Internal internal, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = imagenParameters.sampleCount;
            }
            if ((i2 & 2) != 0) {
                z = imagenParameters.includeRaiReason;
            }
            if ((i2 & 4) != 0) {
                str = imagenParameters.storageUri;
            }
            if ((i2 & 8) != 0) {
                str2 = imagenParameters.negativePrompt;
            }
            if ((i2 & 16) != 0) {
                str3 = imagenParameters.aspectRatio;
            }
            if ((i2 & 32) != 0) {
                str4 = imagenParameters.safetySetting;
            }
            if ((i2 & 64) != 0) {
                str5 = imagenParameters.personGeneration;
            }
            if ((i2 & 128) != 0) {
                bool = imagenParameters.addWatermark;
            }
            if ((i2 & 256) != 0) {
                internal = imagenParameters.imageOutputOptions;
            }
            Boolean bool2 = bool;
            ImagenImageFormat.Internal internal2 = internal;
            String str6 = str4;
            String str7 = str5;
            String str8 = str3;
            String str9 = str;
            return imagenParameters.copy(i, z, str9, str2, str8, str6, str7, bool2, internal2);
        }

        public static final /* synthetic */ void write$Self(ImagenParameters self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            output.OooOoOO(0, self.sampleCount, serialDesc);
            output.OooO0oO(serialDesc, 1, self.includeRaiReason);
            o00000OO o00000oo2 = o00000OO.f122230OooO00o;
            output.OooOo(serialDesc, 2, o00000oo2, self.storageUri);
            output.OooOo(serialDesc, 3, o00000oo2, self.negativePrompt);
            output.OooOo(serialDesc, 4, o00000oo2, self.aspectRatio);
            output.OooOo(serialDesc, 5, o00000oo2, self.safetySetting);
            output.OooOo(serialDesc, 6, o00000oo2, self.personGeneration);
            output.OooOo(serialDesc, 7, C33940OooO0oo.f122144OooO00o, self.addWatermark);
            output.OooOo(serialDesc, 8, ImagenImageFormat$Internal$$serializer.INSTANCE, self.imageOutputOptions);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSampleCount() {
            return this.sampleCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIncludeRaiReason() {
            return this.includeRaiReason;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStorageUri() {
            return this.storageUri;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getNegativePrompt() {
            return this.negativePrompt;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAspectRatio() {
            return this.aspectRatio;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSafetySetting() {
            return this.safetySetting;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPersonGeneration() {
            return this.personGeneration;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getAddWatermark() {
            return this.addWatermark;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final ImagenImageFormat.Internal getImageOutputOptions() {
            return this.imageOutputOptions;
        }

        public final ImagenParameters copy(int sampleCount, boolean includeRaiReason, String storageUri, String negativePrompt, String aspectRatio, String safetySetting, String personGeneration, Boolean addWatermark, ImagenImageFormat.Internal imageOutputOptions) {
            return new ImagenParameters(sampleCount, includeRaiReason, storageUri, negativePrompt, aspectRatio, safetySetting, personGeneration, addWatermark, imageOutputOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImagenParameters)) {
                return false;
            }
            ImagenParameters imagenParameters = (ImagenParameters) other;
            return this.sampleCount == imagenParameters.sampleCount && this.includeRaiReason == imagenParameters.includeRaiReason && OooOOO0.OooO0O0(this.storageUri, imagenParameters.storageUri) && OooOOO0.OooO0O0(this.negativePrompt, imagenParameters.negativePrompt) && OooOOO0.OooO0O0(this.aspectRatio, imagenParameters.aspectRatio) && OooOOO0.OooO0O0(this.safetySetting, imagenParameters.safetySetting) && OooOOO0.OooO0O0(this.personGeneration, imagenParameters.personGeneration) && OooOOO0.OooO0O0(this.addWatermark, imagenParameters.addWatermark) && OooOOO0.OooO0O0(this.imageOutputOptions, imagenParameters.imageOutputOptions);
        }

        public final Boolean getAddWatermark() {
            return this.addWatermark;
        }

        public final String getAspectRatio() {
            return this.aspectRatio;
        }

        public final ImagenImageFormat.Internal getImageOutputOptions() {
            return this.imageOutputOptions;
        }

        public final boolean getIncludeRaiReason() {
            return this.includeRaiReason;
        }

        public final String getNegativePrompt() {
            return this.negativePrompt;
        }

        public final String getPersonGeneration() {
            return this.personGeneration;
        }

        public final String getSafetySetting() {
            return this.safetySetting;
        }

        public final int getSampleCount() {
            return this.sampleCount;
        }

        public final String getStorageUri() {
            return this.storageUri;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.sampleCount) * 31;
            boolean z = this.includeRaiReason;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iHashCode + r1) * 31;
            String str = this.storageUri;
            int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativePrompt;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.aspectRatio;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.safetySetting;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.personGeneration;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.addWatermark;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            ImagenImageFormat.Internal internal = this.imageOutputOptions;
            return iHashCode7 + (internal != null ? internal.hashCode() : 0);
        }

        public String toString() {
            return "ImagenParameters(sampleCount=" + this.sampleCount + ", includeRaiReason=" + this.includeRaiReason + ", storageUri=" + this.storageUri + ", negativePrompt=" + this.negativePrompt + ", aspectRatio=" + this.aspectRatio + ", safetySetting=" + this.safetySetting + ", personGeneration=" + this.personGeneration + ", addWatermark=" + this.addWatermark + ", imageOutputOptions=" + this.imageOutputOptions + ')';
        }

        public ImagenParameters(int i, boolean z, String str, String str2, String str3, String str4, String str5, Boolean bool, ImagenImageFormat.Internal internal) {
            this.sampleCount = i;
            this.includeRaiReason = z;
            this.storageUri = str;
            this.negativePrompt = str2;
            this.aspectRatio = str3;
            this.safetySetting = str4;
            this.personGeneration = str5;
            this.addWatermark = bool;
            this.imageOutputOptions = internal;
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006\""}, m80612d2 = {"Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenPrompt;", "", "", AuthenticationConstants.AAD.QUERY_PROMPT, "<init>", "(Ljava/lang/String;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenPrompt;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenPrompt;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrompt", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class ImagenPrompt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String prompt;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenPrompt$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/common/GenerateImageRequest$ImagenPrompt;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<ImagenPrompt> serializer() {
                return GenerateImageRequest$ImagenPrompt$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ ImagenPrompt(int i, String str, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.prompt = str;
            } else {
                C24242OooOOo.OooO0O0(i, 1, GenerateImageRequest$ImagenPrompt$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ImagenPrompt copy$default(ImagenPrompt imagenPrompt, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = imagenPrompt.prompt;
            }
            return imagenPrompt.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPrompt() {
            return this.prompt;
        }

        public final ImagenPrompt copy(String prompt) {
            OooOOO0.OooO0oO(prompt, "prompt");
            return new ImagenPrompt(prompt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImagenPrompt) && OooOOO0.OooO0O0(this.prompt, ((ImagenPrompt) other).prompt);
        }

        public final String getPrompt() {
            return this.prompt;
        }

        public int hashCode() {
            return this.prompt.hashCode();
        }

        public String toString() {
            return C21111o0ooOoO.OooO0OO(this.prompt, ')', new StringBuilder("ImagenPrompt(prompt="));
        }

        public ImagenPrompt(String prompt) {
            OooOOO0.OooO0oO(prompt, "prompt");
            this.prompt = prompt;
        }
    }

    public /* synthetic */ GenerateImageRequest(int i, List list, ImagenParameters imagenParameters, o000000O o000000o2) {
        if (3 != (i & 3)) {
            C24242OooOOo.OooO0O0(i, 3, GenerateImageRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.instances = list;
        this.parameters = imagenParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenerateImageRequest copy$default(GenerateImageRequest generateImageRequest, List list, ImagenParameters imagenParameters, int i, Object obj) {
        if ((i & 1) != 0) {
            list = generateImageRequest.instances;
        }
        if ((i & 2) != 0) {
            imagenParameters = generateImageRequest.parameters;
        }
        return generateImageRequest.copy(list, imagenParameters);
    }

    public static final /* synthetic */ void write$Self(GenerateImageRequest self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        output.OooOoo0(serialDesc, 0, $childSerializers[0], self.instances);
        output.OooOoo0(serialDesc, 1, GenerateImageRequest$ImagenParameters$$serializer.INSTANCE, self.parameters);
    }

    public final List<ImagenPrompt> component1() {
        return this.instances;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImagenParameters getParameters() {
        return this.parameters;
    }

    public final GenerateImageRequest copy(List<ImagenPrompt> instances, ImagenParameters parameters) {
        OooOOO0.OooO0oO(instances, "instances");
        OooOOO0.OooO0oO(parameters, "parameters");
        return new GenerateImageRequest(instances, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateImageRequest)) {
            return false;
        }
        GenerateImageRequest generateImageRequest = (GenerateImageRequest) other;
        return OooOOO0.OooO0O0(this.instances, generateImageRequest.instances) && OooOOO0.OooO0O0(this.parameters, generateImageRequest.parameters);
    }

    public final List<ImagenPrompt> getInstances() {
        return this.instances;
    }

    public final ImagenParameters getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.instances.hashCode() * 31);
    }

    public String toString() {
        return "GenerateImageRequest(instances=" + this.instances + ", parameters=" + this.parameters + ')';
    }

    public GenerateImageRequest(List<ImagenPrompt> instances, ImagenParameters parameters) {
        OooOOO0.OooO0oO(instances, "instances");
        OooOOO0.OooO0oO(parameters, "parameters");
        this.instances = instances;
        this.parameters = parameters;
    }
}

package com.google.firebase.vertexai.type;

import Oooo0oO.C21111o0ooOoO;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.vertexai.type.CitationMetadata;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.FinishReason;
import com.google.firebase.vertexai.type.SafetyRating;
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
import oO0o0ooO.InterfaceC33916OooO0oo;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0014B1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate;", "", FirebaseAnalytics.Param.CONTENT, "Lcom/google/firebase/vertexai/type/Content;", "safetyRatings", "", "Lcom/google/firebase/vertexai/type/SafetyRating;", "citationMetadata", "Lcom/google/firebase/vertexai/type/CitationMetadata;", "finishReason", "Lcom/google/firebase/vertexai/type/FinishReason;", "(Lcom/google/firebase/vertexai/type/Content;Ljava/util/List;Lcom/google/firebase/vertexai/type/CitationMetadata;Lcom/google/firebase/vertexai/type/FinishReason;)V", "getCitationMetadata", "()Lcom/google/firebase/vertexai/type/CitationMetadata;", "getContent", "()Lcom/google/firebase/vertexai/type/Content;", "getFinishReason", "()Lcom/google/firebase/vertexai/type/FinishReason;", "getSafetyRatings", "()Ljava/util/List;", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class Candidate {
    private final CitationMetadata citationMetadata;
    private final Content content;
    private final FinishReason finishReason;
    private final List<SafetyRating> safetyRatings;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0003@?ABI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)JR\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010#R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010)¨\u0006B"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal;", "", "Lcom/google/firebase/vertexai/type/Content$Internal;", FirebaseAnalytics.Param.CONTENT, "Lcom/google/firebase/vertexai/type/FinishReason$Internal;", "finishReason", "", "Lcom/google/firebase/vertexai/type/SafetyRating$Internal;", "safetyRatings", "Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;", "citationMetadata", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;", "groundingMetadata", "<init>", "(Lcom/google/firebase/vertexai/type/Content$Internal;Lcom/google/firebase/vertexai/type/FinishReason$Internal;Ljava/util/List;Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/Content$Internal;Lcom/google/firebase/vertexai/type/FinishReason$Internal;Ljava/util/List;Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Candidate$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/Candidate;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/Candidate;", "toPublic", "component1", "()Lcom/google/firebase/vertexai/type/Content$Internal;", "component2", "()Lcom/google/firebase/vertexai/type/FinishReason$Internal;", "component3", "()Ljava/util/List;", "component4", "()Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;", "component5", "()Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;", "copy", "(Lcom/google/firebase/vertexai/type/Content$Internal;Lcom/google/firebase/vertexai/type/FinishReason$Internal;Ljava/util/List;Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;)Lcom/google/firebase/vertexai/type/Candidate$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/Content$Internal;", "getContent", "Lcom/google/firebase/vertexai/type/FinishReason$Internal;", "getFinishReason", "Ljava/util/List;", "getSafetyRatings", "Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;", "getCitationMetadata", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;", "getGroundingMetadata", "Companion", "$serializer", "GroundingMetadata", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private final CitationMetadata.Internal citationMetadata;
        private final Content.Internal content;
        private final FinishReason.Internal finishReason;
        private final GroundingMetadata groundingMetadata;
        private final List<SafetyRating.Internal> safetyRatings;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, new C33938OooO0o0(SafetyRating$Internal$$serializer.INSTANCE), null, null};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Candidate$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return Candidate$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC33908OooO
        @Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 42\u00020\u0001:\u00045467BA\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bB]\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJR\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001cR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001aR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\u001a¨\u00068"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;", "", "", "", "webSearchQueries", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;", "searchEntryPoint", "retrievalQueries", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution;", "groundingAttribution", "<init>", "(Ljava/util/List;Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;Ljava/util/List;Ljava/util/List;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;", "component3", "component4", "copy", "(Ljava/util/List;Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;Ljava/util/List;Ljava/util/List;)Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getWebSearchQueries", "getWebSearchQueries$annotations", "()V", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;", "getSearchEntryPoint", "getSearchEntryPoint$annotations", "getRetrievalQueries", "getRetrievalQueries$annotations", "getGroundingAttribution", "getGroundingAttribution$annotations", "Companion", "$serializer", "GroundingAttribution", "SearchEntryPoint", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final /* data */ class GroundingMetadata {
            private static final InterfaceC33911OooO0OO<Object>[] $childSerializers;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final List<GroundingAttribution> groundingAttribution;
            private final List<String> retrievalQueries;
            private final SearchEntryPoint searchEntryPoint;
            private final List<String> webSearchQueries;

            @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                    this();
                }

                public final InterfaceC33911OooO0OO<GroundingMetadata> serializer() {
                    return Candidate$Internal$GroundingMetadata$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC33908OooO
            @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0003+*,B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018¨\u0006-"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution;", "", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;", "segment", "", "confidenceScore", "<init>", "(Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;Ljava/lang/Float;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;Ljava/lang/Float;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;", "component2", "()Ljava/lang/Float;", "copy", "(Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;Ljava/lang/Float;)Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;", "getSegment", "Ljava/lang/Float;", "getConfidenceScore", "getConfidenceScore$annotations", "()V", "Companion", "$serializer", "Segment", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final /* data */ class GroundingAttribution {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Float confidenceScore;
                private final Segment segment;

                @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                        this();
                    }

                    public final InterfaceC33911OooO0OO<GroundingAttribution> serializer() {
                        return C17254xb8c3ce56.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public /* synthetic */ GroundingAttribution(int i, Segment segment, @InterfaceC33916OooO0oo("confidence_score") Float f, o000000O o000000o2) {
                    if (3 != (i & 3)) {
                        C24242OooOOo.OooO0O0(i, 3, C17254xb8c3ce56.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.segment = segment;
                    this.confidenceScore = f;
                }

                public static /* synthetic */ GroundingAttribution copy$default(GroundingAttribution groundingAttribution, Segment segment, Float f, int i, Object obj) {
                    if ((i & 1) != 0) {
                        segment = groundingAttribution.segment;
                    }
                    if ((i & 2) != 0) {
                        f = groundingAttribution.confidenceScore;
                    }
                    return groundingAttribution.copy(segment, f);
                }

                @InterfaceC33916OooO0oo("confidence_score")
                public static /* synthetic */ void getConfidenceScore$annotations() {
                }

                public static final /* synthetic */ void write$Self(GroundingAttribution self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                    output.OooOoo0(serialDesc, 0, C17255x43fba245.INSTANCE, self.segment);
                    output.OooOo(serialDesc, 1, C33965Oooo0O0.f122189OooO00o, self.confidenceScore);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Segment getSegment() {
                    return this.segment;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Float getConfidenceScore() {
                    return this.confidenceScore;
                }

                public final GroundingAttribution copy(Segment segment, Float confidenceScore) {
                    OooOOO0.OooO0oO(segment, "segment");
                    return new GroundingAttribution(segment, confidenceScore);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof GroundingAttribution)) {
                        return false;
                    }
                    GroundingAttribution groundingAttribution = (GroundingAttribution) other;
                    return OooOOO0.OooO0O0(this.segment, groundingAttribution.segment) && OooOOO0.OooO0O0(this.confidenceScore, groundingAttribution.confidenceScore);
                }

                public final Float getConfidenceScore() {
                    return this.confidenceScore;
                }

                public final Segment getSegment() {
                    return this.segment;
                }

                public int hashCode() {
                    int iHashCode = this.segment.hashCode() * 31;
                    Float f = this.confidenceScore;
                    return iHashCode + (f == null ? 0 : f.hashCode());
                }

                public String toString() {
                    return "GroundingAttribution(segment=" + this.segment + ", confidenceScore=" + this.confidenceScore + ')';
                }

                public GroundingAttribution(Segment segment, Float f) {
                    OooOOO0.OooO0oO(segment, "segment");
                    this.segment = segment;
                    this.confidenceScore = f;
                }

                @InterfaceC33908OooO
                @Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006("}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;", "", "", "startIndex", "endIndex", "<init>", "(II)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(IIILoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()I", "component2", "copy", "(II)Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStartIndex", "getStartIndex$annotations", "()V", "getEndIndex", "getEndIndex$annotations", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
                public static final /* data */ class Segment {

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final int endIndex;
                    private final int startIndex;

                    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$GroundingAttribution$Segment;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                            this();
                        }

                        public final InterfaceC33911OooO0OO<Segment> serializer() {
                            return C17255x43fba245.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    public Segment(int i, int i2) {
                        this.startIndex = i;
                        this.endIndex = i2;
                    }

                    public static /* synthetic */ Segment copy$default(Segment segment, int i, int i2, int i3, Object obj) {
                        if ((i3 & 1) != 0) {
                            i = segment.startIndex;
                        }
                        if ((i3 & 2) != 0) {
                            i2 = segment.endIndex;
                        }
                        return segment.copy(i, i2);
                    }

                    @InterfaceC33916OooO0oo("end_index")
                    public static /* synthetic */ void getEndIndex$annotations() {
                    }

                    @InterfaceC33916OooO0oo("start_index")
                    public static /* synthetic */ void getStartIndex$annotations() {
                    }

                    public static final /* synthetic */ void write$Self(Segment self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                        output.OooOoOO(0, self.startIndex, serialDesc);
                        output.OooOoOO(1, self.endIndex, serialDesc);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final int getStartIndex() {
                        return this.startIndex;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final int getEndIndex() {
                        return this.endIndex;
                    }

                    public final Segment copy(int startIndex, int endIndex) {
                        return new Segment(startIndex, endIndex);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Segment)) {
                            return false;
                        }
                        Segment segment = (Segment) other;
                        return this.startIndex == segment.startIndex && this.endIndex == segment.endIndex;
                    }

                    public final int getEndIndex() {
                        return this.endIndex;
                    }

                    public final int getStartIndex() {
                        return this.startIndex;
                    }

                    public int hashCode() {
                        return Integer.hashCode(this.endIndex) + (Integer.hashCode(this.startIndex) * 31);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.String] */
                    public String toString() {
                        StringBuilder sb = new StringBuilder("Segment(startIndex=");
                        sb.append(this.startIndex);
                        sb.append(", endIndex=");
                        int i = this.endIndex;
                        return APMediaMessage.IMediaObject.type();
                    }

                    public /* synthetic */ Segment(int i, @InterfaceC33916OooO0oo("start_index") int i2, @InterfaceC33916OooO0oo("end_index") int i3, o000000O o000000o2) {
                        if (3 != (i & 3)) {
                            C24242OooOOo.OooO0O0(i, 3, C17255x43fba245.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.startIndex = i2;
                        this.endIndex = i3;
                    }
                }
            }

            @InterfaceC33908OooO
            @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;", "", "", "renderedContent", "sdkBlob", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRenderedContent", "getRenderedContent$annotations", "()V", "getSdkBlob", "getSdkBlob$annotations", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final /* data */ class SearchEntryPoint {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String renderedContent;
                private final String sdkBlob;

                @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Candidate$Internal$GroundingMetadata$SearchEntryPoint;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                        this();
                    }

                    public final InterfaceC33911OooO0OO<SearchEntryPoint> serializer() {
                        return C17256x2fde3ed8.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public /* synthetic */ SearchEntryPoint(int i, @InterfaceC33916OooO0oo("rendered_content") String str, @InterfaceC33916OooO0oo("sdk_blob") String str2, o000000O o000000o2) {
                    if (3 != (i & 3)) {
                        C24242OooOOo.OooO0O0(i, 3, C17256x2fde3ed8.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.renderedContent = str;
                    this.sdkBlob = str2;
                }

                public static /* synthetic */ SearchEntryPoint copy$default(SearchEntryPoint searchEntryPoint, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = searchEntryPoint.renderedContent;
                    }
                    if ((i & 2) != 0) {
                        str2 = searchEntryPoint.sdkBlob;
                    }
                    return searchEntryPoint.copy(str, str2);
                }

                @InterfaceC33916OooO0oo("rendered_content")
                public static /* synthetic */ void getRenderedContent$annotations() {
                }

                @InterfaceC33916OooO0oo("sdk_blob")
                public static /* synthetic */ void getSdkBlob$annotations() {
                }

                public static final /* synthetic */ void write$Self(SearchEntryPoint self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                    o00000OO o00000oo2 = o00000OO.f122230OooO00o;
                    output.OooOo(serialDesc, 0, o00000oo2, self.renderedContent);
                    output.OooOo(serialDesc, 1, o00000oo2, self.sdkBlob);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getRenderedContent() {
                    return this.renderedContent;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getSdkBlob() {
                    return this.sdkBlob;
                }

                public final SearchEntryPoint copy(String renderedContent, String sdkBlob) {
                    return new SearchEntryPoint(renderedContent, sdkBlob);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SearchEntryPoint)) {
                        return false;
                    }
                    SearchEntryPoint searchEntryPoint = (SearchEntryPoint) other;
                    return OooOOO0.OooO0O0(this.renderedContent, searchEntryPoint.renderedContent) && OooOOO0.OooO0O0(this.sdkBlob, searchEntryPoint.sdkBlob);
                }

                public final String getRenderedContent() {
                    return this.renderedContent;
                }

                public final String getSdkBlob() {
                    return this.sdkBlob;
                }

                public int hashCode() {
                    String str = this.renderedContent;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.sdkBlob;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("SearchEntryPoint(renderedContent=");
                    sb.append(this.renderedContent);
                    sb.append(", sdkBlob=");
                    return C21111o0ooOoO.OooO0OO(this.sdkBlob, ')', sb);
                }

                public SearchEntryPoint(String str, String str2) {
                    this.renderedContent = str;
                    this.sdkBlob = str2;
                }
            }

            static {
                o00000OO o00000oo2 = o00000OO.f122230OooO00o;
                $childSerializers = new InterfaceC33911OooO0OO[]{new C33938OooO0o0(o00000oo2), null, new C33938OooO0o0(o00000oo2), new C33938OooO0o0(C17254xb8c3ce56.INSTANCE)};
            }

            public /* synthetic */ GroundingMetadata(int i, @InterfaceC33916OooO0oo("web_search_queries") List list, @InterfaceC33916OooO0oo("search_entry_point") SearchEntryPoint searchEntryPoint, @InterfaceC33916OooO0oo("retrieval_queries") List list2, @InterfaceC33916OooO0oo("grounding_attribution") List list3, o000000O o000000o2) {
                if (15 != (i & 15)) {
                    C24242OooOOo.OooO0O0(i, 15, Candidate$Internal$GroundingMetadata$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.webSearchQueries = list;
                this.searchEntryPoint = searchEntryPoint;
                this.retrievalQueries = list2;
                this.groundingAttribution = list3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GroundingMetadata copy$default(GroundingMetadata groundingMetadata, List list, SearchEntryPoint searchEntryPoint, List list2, List list3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = groundingMetadata.webSearchQueries;
                }
                if ((i & 2) != 0) {
                    searchEntryPoint = groundingMetadata.searchEntryPoint;
                }
                if ((i & 4) != 0) {
                    list2 = groundingMetadata.retrievalQueries;
                }
                if ((i & 8) != 0) {
                    list3 = groundingMetadata.groundingAttribution;
                }
                return groundingMetadata.copy(list, searchEntryPoint, list2, list3);
            }

            @InterfaceC33916OooO0oo("grounding_attribution")
            public static /* synthetic */ void getGroundingAttribution$annotations() {
            }

            @InterfaceC33916OooO0oo("retrieval_queries")
            public static /* synthetic */ void getRetrievalQueries$annotations() {
            }

            @InterfaceC33916OooO0oo("search_entry_point")
            public static /* synthetic */ void getSearchEntryPoint$annotations() {
            }

            @InterfaceC33916OooO0oo("web_search_queries")
            public static /* synthetic */ void getWebSearchQueries$annotations() {
            }

            public static final /* synthetic */ void write$Self(GroundingMetadata self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
                output.OooOo(serialDesc, 0, interfaceC33911OooO0OOArr[0], self.webSearchQueries);
                output.OooOo(serialDesc, 1, C17256x2fde3ed8.INSTANCE, self.searchEntryPoint);
                output.OooOo(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.retrievalQueries);
                output.OooOo(serialDesc, 3, interfaceC33911OooO0OOArr[3], self.groundingAttribution);
            }

            public final List<String> component1() {
                return this.webSearchQueries;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final SearchEntryPoint getSearchEntryPoint() {
                return this.searchEntryPoint;
            }

            public final List<String> component3() {
                return this.retrievalQueries;
            }

            public final List<GroundingAttribution> component4() {
                return this.groundingAttribution;
            }

            public final GroundingMetadata copy(List<String> webSearchQueries, SearchEntryPoint searchEntryPoint, List<String> retrievalQueries, List<GroundingAttribution> groundingAttribution) {
                return new GroundingMetadata(webSearchQueries, searchEntryPoint, retrievalQueries, groundingAttribution);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GroundingMetadata)) {
                    return false;
                }
                GroundingMetadata groundingMetadata = (GroundingMetadata) other;
                return OooOOO0.OooO0O0(this.webSearchQueries, groundingMetadata.webSearchQueries) && OooOOO0.OooO0O0(this.searchEntryPoint, groundingMetadata.searchEntryPoint) && OooOOO0.OooO0O0(this.retrievalQueries, groundingMetadata.retrievalQueries) && OooOOO0.OooO0O0(this.groundingAttribution, groundingMetadata.groundingAttribution);
            }

            public final List<GroundingAttribution> getGroundingAttribution() {
                return this.groundingAttribution;
            }

            public final List<String> getRetrievalQueries() {
                return this.retrievalQueries;
            }

            public final SearchEntryPoint getSearchEntryPoint() {
                return this.searchEntryPoint;
            }

            public final List<String> getWebSearchQueries() {
                return this.webSearchQueries;
            }

            public int hashCode() {
                List<String> list = this.webSearchQueries;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                SearchEntryPoint searchEntryPoint = this.searchEntryPoint;
                int iHashCode2 = (iHashCode + (searchEntryPoint == null ? 0 : searchEntryPoint.hashCode())) * 31;
                List<String> list2 = this.retrievalQueries;
                int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<GroundingAttribution> list3 = this.groundingAttribution;
                return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
            }

            public String toString() {
                return "GroundingMetadata(webSearchQueries=" + this.webSearchQueries + ", searchEntryPoint=" + this.searchEntryPoint + ", retrievalQueries=" + this.retrievalQueries + ", groundingAttribution=" + this.groundingAttribution + ')';
            }

            public GroundingMetadata(List<String> list, SearchEntryPoint searchEntryPoint, List<String> list2, List<GroundingAttribution> list3) {
                this.webSearchQueries = list;
                this.searchEntryPoint = searchEntryPoint;
                this.retrievalQueries = list2;
                this.groundingAttribution = list3;
            }
        }

        public Internal() {
            this((Content.Internal) null, (FinishReason.Internal) null, (List) null, (CitationMetadata.Internal) null, (GroundingMetadata) null, 31, (C24018OooO0oo) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, Content.Internal internal2, FinishReason.Internal internal3, List list, CitationMetadata.Internal internal4, GroundingMetadata groundingMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                internal2 = internal.content;
            }
            if ((i & 2) != 0) {
                internal3 = internal.finishReason;
            }
            if ((i & 4) != 0) {
                list = internal.safetyRatings;
            }
            if ((i & 8) != 0) {
                internal4 = internal.citationMetadata;
            }
            if ((i & 16) != 0) {
                groundingMetadata = internal.groundingMetadata;
            }
            GroundingMetadata groundingMetadata2 = groundingMetadata;
            List list2 = list;
            return internal.copy(internal2, internal3, list2, internal4, groundingMetadata2);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            if (output.OooOoO0(serialDesc) || self.content != null) {
                output.OooOo(serialDesc, 0, Content$Internal$$serializer.INSTANCE, self.content);
            }
            if (output.OooOoO0(serialDesc) || self.finishReason != null) {
                output.OooOo(serialDesc, 1, FinishReason.Internal.Serializer.INSTANCE, self.finishReason);
            }
            if (output.OooOoO0(serialDesc) || self.safetyRatings != null) {
                output.OooOo(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.safetyRatings);
            }
            if (output.OooOoO0(serialDesc) || self.citationMetadata != null) {
                output.OooOo(serialDesc, 3, CitationMetadata$Internal$$serializer.INSTANCE, self.citationMetadata);
            }
            if (!output.OooOoO0(serialDesc) && self.groundingMetadata == null) {
                return;
            }
            output.OooOo(serialDesc, 4, Candidate$Internal$GroundingMetadata$$serializer.INSTANCE, self.groundingMetadata);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Content.Internal getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final FinishReason.Internal getFinishReason() {
            return this.finishReason;
        }

        public final List<SafetyRating.Internal> component3() {
            return this.safetyRatings;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final CitationMetadata.Internal getCitationMetadata() {
            return this.citationMetadata;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final GroundingMetadata getGroundingMetadata() {
            return this.groundingMetadata;
        }

        public final Internal copy(Content.Internal content, FinishReason.Internal finishReason, List<SafetyRating.Internal> safetyRatings, CitationMetadata.Internal citationMetadata, GroundingMetadata groundingMetadata) {
            return new Internal(content, finishReason, safetyRatings, citationMetadata, groundingMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.content, internal.content) && this.finishReason == internal.finishReason && OooOOO0.OooO0O0(this.safetyRatings, internal.safetyRatings) && OooOOO0.OooO0O0(this.citationMetadata, internal.citationMetadata) && OooOOO0.OooO0O0(this.groundingMetadata, internal.groundingMetadata);
        }

        public final CitationMetadata.Internal getCitationMetadata() {
            return this.citationMetadata;
        }

        public final Content.Internal getContent() {
            return this.content;
        }

        public final FinishReason.Internal getFinishReason() {
            return this.finishReason;
        }

        public final GroundingMetadata getGroundingMetadata() {
            return this.groundingMetadata;
        }

        public final List<SafetyRating.Internal> getSafetyRatings() {
            return this.safetyRatings;
        }

        public int hashCode() {
            Content.Internal internal = this.content;
            int iHashCode = (internal == null ? 0 : internal.hashCode()) * 31;
            FinishReason.Internal internal2 = this.finishReason;
            int iHashCode2 = (iHashCode + (internal2 == null ? 0 : internal2.hashCode())) * 31;
            List<SafetyRating.Internal> list = this.safetyRatings;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            CitationMetadata.Internal internal3 = this.citationMetadata;
            int iHashCode4 = (iHashCode3 + (internal3 == null ? 0 : internal3.hashCode())) * 31;
            GroundingMetadata groundingMetadata = this.groundingMetadata;
            return iHashCode4 + (groundingMetadata != null ? groundingMetadata.hashCode() : 0);
        }

        public final Candidate toPublic$com_google_firebase_firebase_vertexai() {
            List arrayList;
            Content content;
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
            CitationMetadata.Internal internal = this.citationMetadata;
            CitationMetadata public$com_google_firebase_firebase_vertexai = internal != null ? internal.toPublic$com_google_firebase_firebase_vertexai() : null;
            FinishReason.Internal internal2 = this.finishReason;
            FinishReason public$com_google_firebase_firebase_vertexai2 = internal2 != null ? internal2.toPublic$com_google_firebase_firebase_vertexai() : null;
            Content.Internal internal3 = this.content;
            if (internal3 == null || (content = internal3.toPublic$com_google_firebase_firebase_vertexai()) == null) {
                content = ContentKt.content("model", Candidate$Internal$toPublic$1.INSTANCE);
            }
            return new Candidate(content, arrayList, public$com_google_firebase_firebase_vertexai, public$com_google_firebase_firebase_vertexai2);
        }

        public String toString() {
            return "Internal(content=" + this.content + ", finishReason=" + this.finishReason + ", safetyRatings=" + this.safetyRatings + ", citationMetadata=" + this.citationMetadata + ", groundingMetadata=" + this.groundingMetadata + ')';
        }

        public /* synthetic */ Internal(int i, Content.Internal internal, FinishReason.Internal internal2, List list, CitationMetadata.Internal internal3, GroundingMetadata groundingMetadata, o000000O o000000o2) {
            if ((i & 1) == 0) {
                this.content = null;
            } else {
                this.content = internal;
            }
            if ((i & 2) == 0) {
                this.finishReason = null;
            } else {
                this.finishReason = internal2;
            }
            if ((i & 4) == 0) {
                this.safetyRatings = null;
            } else {
                this.safetyRatings = list;
            }
            if ((i & 8) == 0) {
                this.citationMetadata = null;
            } else {
                this.citationMetadata = internal3;
            }
            if ((i & 16) == 0) {
                this.groundingMetadata = null;
            } else {
                this.groundingMetadata = groundingMetadata;
            }
        }

        public Internal(Content.Internal internal, FinishReason.Internal internal2, List<SafetyRating.Internal> list, CitationMetadata.Internal internal3, GroundingMetadata groundingMetadata) {
            this.content = internal;
            this.finishReason = internal2;
            this.safetyRatings = list;
            this.citationMetadata = internal3;
            this.groundingMetadata = groundingMetadata;
        }

        public /* synthetic */ Internal(Content.Internal internal, FinishReason.Internal internal2, List list, CitationMetadata.Internal internal3, GroundingMetadata groundingMetadata, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : internal, (i & 2) != 0 ? null : internal2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : internal3, (i & 16) != 0 ? null : groundingMetadata);
        }
    }

    public Candidate(Content content, List<SafetyRating> safetyRatings, CitationMetadata citationMetadata, FinishReason finishReason) {
        OooOOO0.OooO0oO(content, "content");
        OooOOO0.OooO0oO(safetyRatings, "safetyRatings");
        this.content = content;
        this.safetyRatings = safetyRatings;
        this.citationMetadata = citationMetadata;
        this.finishReason = finishReason;
    }

    public final CitationMetadata getCitationMetadata() {
        return this.citationMetadata;
    }

    public final Content getContent() {
        return this.content;
    }

    public final FinishReason getFinishReason() {
        return this.finishReason;
    }

    public final List<SafetyRating> getSafetyRatings() {
        return this.safetyRatings;
    }
}

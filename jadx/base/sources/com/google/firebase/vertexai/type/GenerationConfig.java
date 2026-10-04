package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.Schema;
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
import oO0oO00.C33971OoooO;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0003&'(Bq\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\r\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b \u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b!\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\"\u0010\u0016¨\u0006)"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerationConfig;", "", "temperature", "", "topK", "", "topP", "candidateCount", "maxOutputTokens", "presencePenalty", "frequencyPenalty", "stopSequences", "", "", "responseMimeType", "responseSchema", "Lcom/google/firebase/vertexai/type/Schema;", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/List;Ljava/lang/String;Lcom/google/firebase/vertexai/type/Schema;)V", "getCandidateCount$com_google_firebase_firebase_vertexai", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFrequencyPenalty$com_google_firebase_firebase_vertexai", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMaxOutputTokens$com_google_firebase_firebase_vertexai", "getPresencePenalty$com_google_firebase_firebase_vertexai", "getResponseMimeType$com_google_firebase_firebase_vertexai", "()Ljava/lang/String;", "getResponseSchema$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/Schema;", "getStopSequences$com_google_firebase_firebase_vertexai", "()Ljava/util/List;", "getTemperature$com_google_firebase_firebase_vertexai", "getTopK$com_google_firebase_firebase_vertexai", "getTopP$com_google_firebase_firebase_vertexai", "toInternal", "Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Builder", "Companion", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class GenerationConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer candidateCount;
    private final Float frequencyPenalty;
    private final Integer maxOutputTokens;
    private final Float presencePenalty;
    private final String responseMimeType;
    private final Schema responseSchema;
    private final List<String> stopSequences;
    private final Float temperature;
    private final Integer topK;
    private final Float topP;

    @Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0016"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerationConfig$Builder;", "", "()V", "candidateCount", "", "Ljava/lang/Integer;", "frequencyPenalty", "", "Ljava/lang/Float;", "maxOutputTokens", "presencePenalty", "responseMimeType", "", "responseSchema", "Lcom/google/firebase/vertexai/type/Schema;", "stopSequences", "", "temperature", "topK", "topP", "build", "Lcom/google/firebase/vertexai/type/GenerationConfig;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Builder {
        public Integer candidateCount;
        public Float frequencyPenalty;
        public Integer maxOutputTokens;
        public Float presencePenalty;
        public String responseMimeType;
        public Schema responseSchema;
        public List<String> stopSequences;
        public Float temperature;
        public Integer topK;
        public Float topP;

        public final GenerationConfig build() {
            return new GenerationConfig(this.temperature, this.topK, this.topP, this.candidateCount, this.maxOutputTokens, this.presencePenalty, this.frequencyPenalty, this.stopSequences, this.responseMimeType, this.responseSchema, null);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerationConfig$Companion;", "", "()V", "builder", "Lcom/google/firebase/vertexai/type/GenerationConfig$Builder;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0081\b\u0018\u0000 P2\u00020\u0001:\u0002QPBy\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0097\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u008e\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J(\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÇ\u0001¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010<\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\bB\u0010;\u001a\u0004\bA\u0010\u001bR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010C\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010F\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010!R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\bJ\u0010;\u001a\u0004\bI\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\bL\u0010;\u001a\u0004\bK\u0010\u0018R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010M\u0012\u0004\bO\u0010;\u001a\u0004\bN\u0010%¨\u0006R"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "", "", "temperature", "topP", "", "topK", "candidateCount", "maxOutputTokens", "", "", "stopSequences", "responseMimeType", "presencePenalty", "frequencyPenalty", "Lcom/google/firebase/vertexai/type/Schema$Internal;", "responseSchema", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lcom/google/firebase/vertexai/type/Schema$Internal;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lcom/google/firebase/vertexai/type/Schema$Internal;LoO0oO00/o000000O;)V", "component1", "()Ljava/lang/Float;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Ljava/lang/String;", "component8", "component9", "component10", "()Lcom/google/firebase/vertexai/type/Schema$Internal;", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lcom/google/firebase/vertexai/type/Schema$Internal;)Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Ljava/lang/Float;", "getTemperature", "getTopP", "getTopP$annotations", "()V", "Ljava/lang/Integer;", "getTopK", "getTopK$annotations", "getCandidateCount", "getCandidateCount$annotations", "getMaxOutputTokens", "getMaxOutputTokens$annotations", "Ljava/util/List;", "getStopSequences", "getStopSequences$annotations", "Ljava/lang/String;", "getResponseMimeType", "getResponseMimeType$annotations", "getPresencePenalty", "getPresencePenalty$annotations", "getFrequencyPenalty", "getFrequencyPenalty$annotations", "Lcom/google/firebase/vertexai/type/Schema$Internal;", "getResponseSchema", "getResponseSchema$annotations", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private final Integer candidateCount;
        private final Float frequencyPenalty;
        private final Integer maxOutputTokens;
        private final Float presencePenalty;
        private final String responseMimeType;
        private final Schema.Internal responseSchema;
        private final List<String> stopSequences;
        private final Float temperature;
        private final Integer topK;
        private final Float topP;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, null, null, null, new C33938OooO0o0(o00000OO.f122230OooO00o), null, null, null, null};

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerationConfig$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return GenerationConfig$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Internal(int i, Float f, @InterfaceC33916OooO0oo("top_p") Float f2, @InterfaceC33916OooO0oo("top_k") Integer num, @InterfaceC33916OooO0oo("candidate_count") Integer num2, @InterfaceC33916OooO0oo("max_output_tokens") Integer num3, @InterfaceC33916OooO0oo("stop_sequences") List list, @InterfaceC33916OooO0oo("response_mime_type") String str, @InterfaceC33916OooO0oo("presence_penalty") Float f3, @InterfaceC33916OooO0oo("frequency_penalty") Float f4, @InterfaceC33916OooO0oo("response_schema") Schema.Internal internal, o000000O o000000o2) {
            if (63 != (i & 63)) {
                C24242OooOOo.OooO0O0(i, 63, GenerationConfig$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.temperature = f;
            this.topP = f2;
            this.topK = num;
            this.candidateCount = num2;
            this.maxOutputTokens = num3;
            this.stopSequences = list;
            if ((i & 64) == 0) {
                this.responseMimeType = null;
            } else {
                this.responseMimeType = str;
            }
            if ((i & 128) == 0) {
                this.presencePenalty = null;
            } else {
                this.presencePenalty = f3;
            }
            if ((i & 256) == 0) {
                this.frequencyPenalty = null;
            } else {
                this.frequencyPenalty = f4;
            }
            if ((i & 512) == 0) {
                this.responseSchema = null;
            } else {
                this.responseSchema = internal;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, Float f, Float f2, Integer num, Integer num2, Integer num3, List list, String str, Float f3, Float f4, Schema.Internal internal2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = internal.temperature;
            }
            if ((i & 2) != 0) {
                f2 = internal.topP;
            }
            if ((i & 4) != 0) {
                num = internal.topK;
            }
            if ((i & 8) != 0) {
                num2 = internal.candidateCount;
            }
            if ((i & 16) != 0) {
                num3 = internal.maxOutputTokens;
            }
            if ((i & 32) != 0) {
                list = internal.stopSequences;
            }
            if ((i & 64) != 0) {
                str = internal.responseMimeType;
            }
            if ((i & 128) != 0) {
                f3 = internal.presencePenalty;
            }
            if ((i & 256) != 0) {
                f4 = internal.frequencyPenalty;
            }
            if ((i & 512) != 0) {
                internal2 = internal.responseSchema;
            }
            Float f5 = f4;
            Schema.Internal internal3 = internal2;
            String str2 = str;
            Float f6 = f3;
            Integer num4 = num3;
            List list2 = list;
            return internal.copy(f, f2, num, num2, num4, list2, str2, f6, f5, internal3);
        }

        @InterfaceC33916OooO0oo("candidate_count")
        public static /* synthetic */ void getCandidateCount$annotations() {
        }

        @InterfaceC33916OooO0oo("frequency_penalty")
        public static /* synthetic */ void getFrequencyPenalty$annotations() {
        }

        @InterfaceC33916OooO0oo("max_output_tokens")
        public static /* synthetic */ void getMaxOutputTokens$annotations() {
        }

        @InterfaceC33916OooO0oo("presence_penalty")
        public static /* synthetic */ void getPresencePenalty$annotations() {
        }

        @InterfaceC33916OooO0oo("response_mime_type")
        public static /* synthetic */ void getResponseMimeType$annotations() {
        }

        @InterfaceC33916OooO0oo("response_schema")
        public static /* synthetic */ void getResponseSchema$annotations() {
        }

        @InterfaceC33916OooO0oo("stop_sequences")
        public static /* synthetic */ void getStopSequences$annotations() {
        }

        @InterfaceC33916OooO0oo("top_k")
        public static /* synthetic */ void getTopK$annotations() {
        }

        @InterfaceC33916OooO0oo("top_p")
        public static /* synthetic */ void getTopP$annotations() {
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            C33965Oooo0O0 c33965Oooo0O0 = C33965Oooo0O0.f122189OooO00o;
            output.OooOo(serialDesc, 0, c33965Oooo0O0, self.temperature);
            output.OooOo(serialDesc, 1, c33965Oooo0O0, self.topP);
            C33971OoooO c33971OoooO = C33971OoooO.f122193OooO00o;
            output.OooOo(serialDesc, 2, c33971OoooO, self.topK);
            output.OooOo(serialDesc, 3, c33971OoooO, self.candidateCount);
            output.OooOo(serialDesc, 4, c33971OoooO, self.maxOutputTokens);
            output.OooOo(serialDesc, 5, interfaceC33911OooO0OOArr[5], self.stopSequences);
            if (output.OooOoO0(serialDesc) || self.responseMimeType != null) {
                output.OooOo(serialDesc, 6, o00000OO.f122230OooO00o, self.responseMimeType);
            }
            if (output.OooOoO0(serialDesc) || self.presencePenalty != null) {
                output.OooOo(serialDesc, 7, c33965Oooo0O0, self.presencePenalty);
            }
            if (output.OooOoO0(serialDesc) || self.frequencyPenalty != null) {
                output.OooOo(serialDesc, 8, c33965Oooo0O0, self.frequencyPenalty);
            }
            if (!output.OooOoO0(serialDesc) && self.responseSchema == null) {
                return;
            }
            output.OooOo(serialDesc, 9, Schema$Internal$$serializer.INSTANCE, self.responseSchema);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Float getTemperature() {
            return this.temperature;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Schema.Internal getResponseSchema() {
            return this.responseSchema;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Float getTopP() {
            return this.topP;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getTopK() {
            return this.topK;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getCandidateCount() {
            return this.candidateCount;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public final List<String> component6() {
            return this.stopSequences;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getResponseMimeType() {
            return this.responseMimeType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Float getPresencePenalty() {
            return this.presencePenalty;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Float getFrequencyPenalty() {
            return this.frequencyPenalty;
        }

        public final Internal copy(Float temperature, Float topP, Integer topK, Integer candidateCount, Integer maxOutputTokens, List<String> stopSequences, String responseMimeType, Float presencePenalty, Float frequencyPenalty, Schema.Internal responseSchema) {
            return new Internal(temperature, topP, topK, candidateCount, maxOutputTokens, stopSequences, responseMimeType, presencePenalty, frequencyPenalty, responseSchema);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.temperature, internal.temperature) && OooOOO0.OooO0O0(this.topP, internal.topP) && OooOOO0.OooO0O0(this.topK, internal.topK) && OooOOO0.OooO0O0(this.candidateCount, internal.candidateCount) && OooOOO0.OooO0O0(this.maxOutputTokens, internal.maxOutputTokens) && OooOOO0.OooO0O0(this.stopSequences, internal.stopSequences) && OooOOO0.OooO0O0(this.responseMimeType, internal.responseMimeType) && OooOOO0.OooO0O0(this.presencePenalty, internal.presencePenalty) && OooOOO0.OooO0O0(this.frequencyPenalty, internal.frequencyPenalty) && OooOOO0.OooO0O0(this.responseSchema, internal.responseSchema);
        }

        public final Integer getCandidateCount() {
            return this.candidateCount;
        }

        public final Float getFrequencyPenalty() {
            return this.frequencyPenalty;
        }

        public final Integer getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public final Float getPresencePenalty() {
            return this.presencePenalty;
        }

        public final String getResponseMimeType() {
            return this.responseMimeType;
        }

        public final Schema.Internal getResponseSchema() {
            return this.responseSchema;
        }

        public final List<String> getStopSequences() {
            return this.stopSequences;
        }

        public final Float getTemperature() {
            return this.temperature;
        }

        public final Integer getTopK() {
            return this.topK;
        }

        public final Float getTopP() {
            return this.topP;
        }

        public int hashCode() {
            Float f = this.temperature;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.topP;
            int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
            Integer num = this.topK;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.candidateCount;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.maxOutputTokens;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            List<String> list = this.stopSequences;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.responseMimeType;
            int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            Float f3 = this.presencePenalty;
            int iHashCode8 = (iHashCode7 + (f3 == null ? 0 : f3.hashCode())) * 31;
            Float f4 = this.frequencyPenalty;
            int iHashCode9 = (iHashCode8 + (f4 == null ? 0 : f4.hashCode())) * 31;
            Schema.Internal internal = this.responseSchema;
            return iHashCode9 + (internal != null ? internal.hashCode() : 0);
        }

        public String toString() {
            return "Internal(temperature=" + this.temperature + ", topP=" + this.topP + ", topK=" + this.topK + ", candidateCount=" + this.candidateCount + ", maxOutputTokens=" + this.maxOutputTokens + ", stopSequences=" + this.stopSequences + ", responseMimeType=" + this.responseMimeType + ", presencePenalty=" + this.presencePenalty + ", frequencyPenalty=" + this.frequencyPenalty + ", responseSchema=" + this.responseSchema + ')';
        }

        public Internal(Float f, Float f2, Integer num, Integer num2, Integer num3, List<String> list, String str, Float f3, Float f4, Schema.Internal internal) {
            this.temperature = f;
            this.topP = f2;
            this.topK = num;
            this.candidateCount = num2;
            this.maxOutputTokens = num3;
            this.stopSequences = list;
            this.responseMimeType = str;
            this.presencePenalty = f3;
            this.frequencyPenalty = f4;
            this.responseSchema = internal;
        }

        public /* synthetic */ Internal(Float f, Float f2, Integer num, Integer num2, Integer num3, List list, String str, Float f3, Float f4, Schema.Internal internal, int i, C24018OooO0oo c24018OooO0oo) {
            this(f, f2, num, num2, num3, list, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : f3, (i & 256) != 0 ? null : f4, (i & 512) != 0 ? null : internal);
        }
    }

    public /* synthetic */ GenerationConfig(Float f, Integer num, Float f2, Integer num2, Integer num3, Float f3, Float f4, List list, String str, Schema schema, C24018OooO0oo c24018OooO0oo) {
        this(f, num, f2, num2, num3, f3, f4, list, str, schema);
    }

    /* JADX INFO: renamed from: getCandidateCount$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Integer getCandidateCount() {
        return this.candidateCount;
    }

    /* JADX INFO: renamed from: getFrequencyPenalty$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Float getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    /* JADX INFO: renamed from: getMaxOutputTokens$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Integer getMaxOutputTokens() {
        return this.maxOutputTokens;
    }

    /* JADX INFO: renamed from: getPresencePenalty$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Float getPresencePenalty() {
        return this.presencePenalty;
    }

    /* JADX INFO: renamed from: getResponseMimeType$com_google_firebase_firebase_vertexai, reason: from getter */
    public final String getResponseMimeType() {
        return this.responseMimeType;
    }

    /* JADX INFO: renamed from: getResponseSchema$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Schema getResponseSchema() {
        return this.responseSchema;
    }

    public final List<String> getStopSequences$com_google_firebase_firebase_vertexai() {
        return this.stopSequences;
    }

    /* JADX INFO: renamed from: getTemperature$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Float getTemperature() {
        return this.temperature;
    }

    /* JADX INFO: renamed from: getTopK$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Integer getTopK() {
        return this.topK;
    }

    /* JADX INFO: renamed from: getTopP$com_google_firebase_firebase_vertexai, reason: from getter */
    public final Float getTopP() {
        return this.topP;
    }

    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        Float f = this.temperature;
        Float f2 = this.topP;
        Integer num = this.topK;
        Integer num2 = this.candidateCount;
        Integer num3 = this.maxOutputTokens;
        List<String> list = this.stopSequences;
        Float f3 = this.frequencyPenalty;
        Float f4 = this.presencePenalty;
        String str = this.responseMimeType;
        Schema schema = this.responseSchema;
        return new Internal(f, f2, num, num2, num3, list, str, f4, f3, schema != null ? schema.toInternal$com_google_firebase_firebase_vertexai() : null);
    }

    private GenerationConfig(Float f, Integer num, Float f2, Integer num2, Integer num3, Float f3, Float f4, List<String> list, String str, Schema schema) {
        this.temperature = f;
        this.topK = num;
        this.topP = f2;
        this.candidateCount = num2;
        this.maxOutputTokens = num3;
        this.presencePenalty = f3;
        this.frequencyPenalty = f4;
        this.stopSequences = list;
        this.responseMimeType = str;
        this.responseSchema = schema;
    }
}

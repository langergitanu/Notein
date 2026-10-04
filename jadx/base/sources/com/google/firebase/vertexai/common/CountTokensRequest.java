package com.google.firebase.vertexai.common;

import com.google.firebase.vertexai.common.util.UtilKt;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.Content$Internal$$serializer;
import com.google.firebase.vertexai.type.Tool;
import com.google.firebase.vertexai.type.Tool$Internal$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooO.InterfaceC33916OooO0oo;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 92\u00020\u0001:\u0002:9BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rB[\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#JX\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b4\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010#¨\u0006;"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/CountTokensRequest;", "Lcom/google/firebase/vertexai/common/Request;", "Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "generateContentRequest", "", "model", "", "Lcom/google/firebase/vertexai/type/Content$Internal;", "contents", "Lcom/google/firebase/vertexai/type/Tool$Internal;", "tools", "systemInstruction", "<init>", "(Lcom/google/firebase/vertexai/common/GenerateContentRequest;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/google/firebase/vertexai/type/Content$Internal;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/common/GenerateContentRequest;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/google/firebase/vertexai/type/Content$Internal;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/common/CountTokensRequest;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/google/firebase/vertexai/type/Content$Internal;", "copy", "(Lcom/google/firebase/vertexai/common/GenerateContentRequest;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/google/firebase/vertexai/type/Content$Internal;)Lcom/google/firebase/vertexai/common/CountTokensRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "getGenerateContentRequest", "Ljava/lang/String;", "getModel", "Ljava/util/List;", "getContents", "getTools", "Lcom/google/firebase/vertexai/type/Content$Internal;", "getSystemInstruction", "getSystemInstruction$annotations", "()V", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final /* data */ class CountTokensRequest implements Request {
    private final List<Content.Internal> contents;
    private final GenerateContentRequest generateContentRequest;
    private final String model;
    private final Content.Internal systemInstruction;
    private final List<Tool.Internal> tools;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, new C33938OooO0o0(Content$Internal$$serializer.INSTANCE), new C33938OooO0o0(Tool$Internal$$serializer.INSTANCE), null};

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/CountTokensRequest$Companion;", "", "<init>", "()V", "Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "generateContentRequest", "Lcom/google/firebase/vertexai/common/CountTokensRequest;", "forGenAI", "(Lcom/google/firebase/vertexai/common/GenerateContentRequest;)Lcom/google/firebase/vertexai/common/CountTokensRequest;", "forVertexAI", "LoO0o0ooO/OooO0OO;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CountTokensRequest forGenAI(GenerateContentRequest generateContentRequest) {
            GenerateContentRequest generateContentRequest2;
            OooOOO0.OooO0oO(generateContentRequest, "generateContentRequest");
            String model = generateContentRequest.getModel();
            if (model == null || (generateContentRequest = GenerateContentRequest.copy$default((generateContentRequest2 = generateContentRequest), UtilKt.fullModelName(model), null, null, null, null, null, null, 126, null)) != null) {
                generateContentRequest2 = generateContentRequest;
            }
            return new CountTokensRequest(generateContentRequest2, (String) null, (List) null, (List) null, (Content.Internal) null, 30, (C24018OooO0oo) null);
        }

        public final CountTokensRequest forVertexAI(GenerateContentRequest generateContentRequest) {
            OooOOO0.OooO0oO(generateContentRequest, "generateContentRequest");
            String model = generateContentRequest.getModel();
            return new CountTokensRequest((GenerateContentRequest) null, model != null ? UtilKt.fullModelName(model) : null, generateContentRequest.getContents(), generateContentRequest.getTools(), generateContentRequest.getSystemInstruction(), 1, (C24018OooO0oo) null);
        }

        public final InterfaceC33911OooO0OO<CountTokensRequest> serializer() {
            return CountTokensRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CountTokensRequest() {
        this((GenerateContentRequest) null, (String) null, (List) null, (List) null, (Content.Internal) null, 31, (C24018OooO0oo) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountTokensRequest copy$default(CountTokensRequest countTokensRequest, GenerateContentRequest generateContentRequest, String str, List list, List list2, Content.Internal internal, int i, Object obj) {
        if ((i & 1) != 0) {
            generateContentRequest = countTokensRequest.generateContentRequest;
        }
        if ((i & 2) != 0) {
            str = countTokensRequest.model;
        }
        if ((i & 4) != 0) {
            list = countTokensRequest.contents;
        }
        if ((i & 8) != 0) {
            list2 = countTokensRequest.tools;
        }
        if ((i & 16) != 0) {
            internal = countTokensRequest.systemInstruction;
        }
        Content.Internal internal2 = internal;
        List list3 = list;
        return countTokensRequest.copy(generateContentRequest, str, list3, list2, internal2);
    }

    @InterfaceC33916OooO0oo("system_instruction")
    public static /* synthetic */ void getSystemInstruction$annotations() {
    }

    public static final /* synthetic */ void write$Self(CountTokensRequest self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
        if (output.OooOoO0(serialDesc) || self.generateContentRequest != null) {
            output.OooOo(serialDesc, 0, GenerateContentRequest$$serializer.INSTANCE, self.generateContentRequest);
        }
        if (output.OooOoO0(serialDesc) || self.model != null) {
            output.OooOo(serialDesc, 1, o00000OO.f122230OooO00o, self.model);
        }
        if (output.OooOoO0(serialDesc) || self.contents != null) {
            output.OooOo(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.contents);
        }
        if (output.OooOoO0(serialDesc) || self.tools != null) {
            output.OooOo(serialDesc, 3, interfaceC33911OooO0OOArr[3], self.tools);
        }
        if (!output.OooOoO0(serialDesc) && self.systemInstruction == null) {
            return;
        }
        output.OooOo(serialDesc, 4, Content$Internal$$serializer.INSTANCE, self.systemInstruction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GenerateContentRequest getGenerateContentRequest() {
        return this.generateContentRequest;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final List<Content.Internal> component3() {
        return this.contents;
    }

    public final List<Tool.Internal> component4() {
        return this.tools;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Content.Internal getSystemInstruction() {
        return this.systemInstruction;
    }

    public final CountTokensRequest copy(GenerateContentRequest generateContentRequest, String model, List<Content.Internal> contents, List<Tool.Internal> tools, Content.Internal systemInstruction) {
        return new CountTokensRequest(generateContentRequest, model, contents, tools, systemInstruction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountTokensRequest)) {
            return false;
        }
        CountTokensRequest countTokensRequest = (CountTokensRequest) other;
        return OooOOO0.OooO0O0(this.generateContentRequest, countTokensRequest.generateContentRequest) && OooOOO0.OooO0O0(this.model, countTokensRequest.model) && OooOOO0.OooO0O0(this.contents, countTokensRequest.contents) && OooOOO0.OooO0O0(this.tools, countTokensRequest.tools) && OooOOO0.OooO0O0(this.systemInstruction, countTokensRequest.systemInstruction);
    }

    public final List<Content.Internal> getContents() {
        return this.contents;
    }

    public final GenerateContentRequest getGenerateContentRequest() {
        return this.generateContentRequest;
    }

    public final String getModel() {
        return this.model;
    }

    public final Content.Internal getSystemInstruction() {
        return this.systemInstruction;
    }

    public final List<Tool.Internal> getTools() {
        return this.tools;
    }

    public int hashCode() {
        GenerateContentRequest generateContentRequest = this.generateContentRequest;
        int iHashCode = (generateContentRequest == null ? 0 : generateContentRequest.hashCode()) * 31;
        String str = this.model;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Content.Internal> list = this.contents;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Tool.Internal> list2 = this.tools;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Content.Internal internal = this.systemInstruction;
        return iHashCode4 + (internal != null ? internal.hashCode() : 0);
    }

    public String toString() {
        return "CountTokensRequest(generateContentRequest=" + this.generateContentRequest + ", model=" + this.model + ", contents=" + this.contents + ", tools=" + this.tools + ", systemInstruction=" + this.systemInstruction + ')';
    }

    public /* synthetic */ CountTokensRequest(int i, GenerateContentRequest generateContentRequest, String str, List list, List list2, @InterfaceC33916OooO0oo("system_instruction") Content.Internal internal, o000000O o000000o2) {
        if ((i & 1) == 0) {
            this.generateContentRequest = null;
        } else {
            this.generateContentRequest = generateContentRequest;
        }
        if ((i & 2) == 0) {
            this.model = null;
        } else {
            this.model = str;
        }
        if ((i & 4) == 0) {
            this.contents = null;
        } else {
            this.contents = list;
        }
        if ((i & 8) == 0) {
            this.tools = null;
        } else {
            this.tools = list2;
        }
        if ((i & 16) == 0) {
            this.systemInstruction = null;
        } else {
            this.systemInstruction = internal;
        }
    }

    public CountTokensRequest(GenerateContentRequest generateContentRequest, String str, List<Content.Internal> list, List<Tool.Internal> list2, Content.Internal internal) {
        this.generateContentRequest = generateContentRequest;
        this.model = str;
        this.contents = list;
        this.tools = list2;
        this.systemInstruction = internal;
    }

    public /* synthetic */ CountTokensRequest(GenerateContentRequest generateContentRequest, String str, List list, List list2, Content.Internal internal, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : generateContentRequest, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : internal);
    }
}

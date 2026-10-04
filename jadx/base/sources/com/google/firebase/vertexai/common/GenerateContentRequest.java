package com.google.firebase.vertexai.common;

import OoooooO.C21445Oooo;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.Content$Internal$$serializer;
import com.google.firebase.vertexai.type.GenerationConfig;
import com.google.firebase.vertexai.type.GenerationConfig$Internal$$serializer;
import com.google.firebase.vertexai.type.SafetySetting;
import com.google.firebase.vertexai.type.SafetySetting$Internal$$serializer;
import com.google.firebase.vertexai.type.Tool;
import com.google.firebase.vertexai.type.Tool$Internal$$serializer;
import com.google.firebase.vertexai.type.ToolConfig;
import com.google.firebase.vertexai.type.ToolConfig$Internal$$serializer;
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
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 H2\u00020\u0001:\u0002IHBi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*Jt\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\"R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010%R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b?\u0010\"R*\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010@\u0012\u0004\bD\u0010;\u001a\u0004\bA\u0010(\"\u0004\bB\u0010CR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010E\u0012\u0004\bG\u0010;\u001a\u0004\bF\u0010*¨\u0006J"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "Lcom/google/firebase/vertexai/common/Request;", "", "model", "", "Lcom/google/firebase/vertexai/type/Content$Internal;", "contents", "Lcom/google/firebase/vertexai/type/SafetySetting$Internal;", "safetySettings", "Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "generationConfig", "Lcom/google/firebase/vertexai/type/Tool$Internal;", "tools", "Lcom/google/firebase/vertexai/type/ToolConfig$Internal;", "toolConfig", "systemInstruction", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;Ljava/util/List;Lcom/google/firebase/vertexai/type/ToolConfig$Internal;Lcom/google/firebase/vertexai/type/Content$Internal;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;Ljava/util/List;Lcom/google/firebase/vertexai/type/ToolConfig$Internal;Lcom/google/firebase/vertexai/type/Content$Internal;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/common/GenerateContentRequest;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "component5", "component6", "()Lcom/google/firebase/vertexai/type/ToolConfig$Internal;", "component7", "()Lcom/google/firebase/vertexai/type/Content$Internal;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;Ljava/util/List;Lcom/google/firebase/vertexai/type/ToolConfig$Internal;Lcom/google/firebase/vertexai/type/Content$Internal;)Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModel", "Ljava/util/List;", "getContents", "getSafetySettings", "getSafetySettings$annotations", "()V", "Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "getGenerationConfig", "getGenerationConfig$annotations", "getTools", "Lcom/google/firebase/vertexai/type/ToolConfig$Internal;", "getToolConfig", "setToolConfig", "(Lcom/google/firebase/vertexai/type/ToolConfig$Internal;)V", "getToolConfig$annotations", "Lcom/google/firebase/vertexai/type/Content$Internal;", "getSystemInstruction", "getSystemInstruction$annotations", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final /* data */ class GenerateContentRequest implements Request {
    private final List<Content.Internal> contents;
    private final GenerationConfig.Internal generationConfig;
    private final String model;
    private final List<SafetySetting.Internal> safetySettings;
    private final Content.Internal systemInstruction;
    private ToolConfig.Internal toolConfig;
    private final List<Tool.Internal> tools;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, new C33938OooO0o0(Content$Internal$$serializer.INSTANCE), new C33938OooO0o0(SafetySetting$Internal$$serializer.INSTANCE), null, new C33938OooO0o0(Tool$Internal$$serializer.INSTANCE), null, null};

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/GenerateContentRequest$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final InterfaceC33911OooO0OO<GenerateContentRequest> serializer() {
            return GenerateContentRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GenerateContentRequest(int i, String str, List list, @InterfaceC33916OooO0oo("safety_settings") List list2, @InterfaceC33916OooO0oo("generation_config") GenerationConfig.Internal internal, List list3, @InterfaceC33916OooO0oo("tool_config") ToolConfig.Internal internal2, @InterfaceC33916OooO0oo("system_instruction") Content.Internal internal3, o000000O o000000o2) {
        if (2 != (i & 2)) {
            C24242OooOOo.OooO0O0(i, 2, GenerateContentRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.model = null;
        } else {
            this.model = str;
        }
        this.contents = list;
        if ((i & 4) == 0) {
            this.safetySettings = null;
        } else {
            this.safetySettings = list2;
        }
        if ((i & 8) == 0) {
            this.generationConfig = null;
        } else {
            this.generationConfig = internal;
        }
        if ((i & 16) == 0) {
            this.tools = null;
        } else {
            this.tools = list3;
        }
        if ((i & 32) == 0) {
            this.toolConfig = null;
        } else {
            this.toolConfig = internal2;
        }
        if ((i & 64) == 0) {
            this.systemInstruction = null;
        } else {
            this.systemInstruction = internal3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenerateContentRequest copy$default(GenerateContentRequest generateContentRequest, String str, List list, List list2, GenerationConfig.Internal internal, List list3, ToolConfig.Internal internal2, Content.Internal internal3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateContentRequest.model;
        }
        if ((i & 2) != 0) {
            list = generateContentRequest.contents;
        }
        if ((i & 4) != 0) {
            list2 = generateContentRequest.safetySettings;
        }
        if ((i & 8) != 0) {
            internal = generateContentRequest.generationConfig;
        }
        if ((i & 16) != 0) {
            list3 = generateContentRequest.tools;
        }
        if ((i & 32) != 0) {
            internal2 = generateContentRequest.toolConfig;
        }
        if ((i & 64) != 0) {
            internal3 = generateContentRequest.systemInstruction;
        }
        ToolConfig.Internal internal4 = internal2;
        Content.Internal internal5 = internal3;
        List list4 = list3;
        List list5 = list2;
        return generateContentRequest.copy(str, list, list5, internal, list4, internal4, internal5);
    }

    @InterfaceC33916OooO0oo("generation_config")
    public static /* synthetic */ void getGenerationConfig$annotations() {
    }

    @InterfaceC33916OooO0oo("safety_settings")
    public static /* synthetic */ void getSafetySettings$annotations() {
    }

    @InterfaceC33916OooO0oo("system_instruction")
    public static /* synthetic */ void getSystemInstruction$annotations() {
    }

    @InterfaceC33916OooO0oo("tool_config")
    public static /* synthetic */ void getToolConfig$annotations() {
    }

    public static final /* synthetic */ void write$Self(GenerateContentRequest self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
        if (output.OooOoO0(serialDesc) || self.model != null) {
            output.OooOo(serialDesc, 0, o00000OO.f122230OooO00o, self.model);
        }
        output.OooOoo0(serialDesc, 1, interfaceC33911OooO0OOArr[1], self.contents);
        if (output.OooOoO0(serialDesc) || self.safetySettings != null) {
            output.OooOo(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.safetySettings);
        }
        if (output.OooOoO0(serialDesc) || self.generationConfig != null) {
            output.OooOo(serialDesc, 3, GenerationConfig$Internal$$serializer.INSTANCE, self.generationConfig);
        }
        if (output.OooOoO0(serialDesc) || self.tools != null) {
            output.OooOo(serialDesc, 4, interfaceC33911OooO0OOArr[4], self.tools);
        }
        if (output.OooOoO0(serialDesc) || self.toolConfig != null) {
            output.OooOo(serialDesc, 5, ToolConfig$Internal$$serializer.INSTANCE, self.toolConfig);
        }
        if (!output.OooOoO0(serialDesc) && self.systemInstruction == null) {
            return;
        }
        output.OooOo(serialDesc, 6, Content$Internal$$serializer.INSTANCE, self.systemInstruction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final List<Content.Internal> component2() {
        return this.contents;
    }

    public final List<SafetySetting.Internal> component3() {
        return this.safetySettings;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenerationConfig.Internal getGenerationConfig() {
        return this.generationConfig;
    }

    public final List<Tool.Internal> component5() {
        return this.tools;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ToolConfig.Internal getToolConfig() {
        return this.toolConfig;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Content.Internal getSystemInstruction() {
        return this.systemInstruction;
    }

    public final GenerateContentRequest copy(String model, List<Content.Internal> contents, List<SafetySetting.Internal> safetySettings, GenerationConfig.Internal generationConfig, List<Tool.Internal> tools, ToolConfig.Internal toolConfig, Content.Internal systemInstruction) {
        OooOOO0.OooO0oO(contents, "contents");
        return new GenerateContentRequest(model, contents, safetySettings, generationConfig, tools, toolConfig, systemInstruction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateContentRequest)) {
            return false;
        }
        GenerateContentRequest generateContentRequest = (GenerateContentRequest) other;
        return OooOOO0.OooO0O0(this.model, generateContentRequest.model) && OooOOO0.OooO0O0(this.contents, generateContentRequest.contents) && OooOOO0.OooO0O0(this.safetySettings, generateContentRequest.safetySettings) && OooOOO0.OooO0O0(this.generationConfig, generateContentRequest.generationConfig) && OooOOO0.OooO0O0(this.tools, generateContentRequest.tools) && OooOOO0.OooO0O0(this.toolConfig, generateContentRequest.toolConfig) && OooOOO0.OooO0O0(this.systemInstruction, generateContentRequest.systemInstruction);
    }

    public final List<Content.Internal> getContents() {
        return this.contents;
    }

    public final GenerationConfig.Internal getGenerationConfig() {
        return this.generationConfig;
    }

    public final String getModel() {
        return this.model;
    }

    public final List<SafetySetting.Internal> getSafetySettings() {
        return this.safetySettings;
    }

    public final Content.Internal getSystemInstruction() {
        return this.systemInstruction;
    }

    public final ToolConfig.Internal getToolConfig() {
        return this.toolConfig;
    }

    public final List<Tool.Internal> getTools() {
        return this.tools;
    }

    public int hashCode() {
        String str = this.model;
        int iOooO00o = C21445Oooo.OooO00o(this.contents, (str == null ? 0 : str.hashCode()) * 31, 31);
        List<SafetySetting.Internal> list = this.safetySettings;
        int iHashCode = (iOooO00o + (list == null ? 0 : list.hashCode())) * 31;
        GenerationConfig.Internal internal = this.generationConfig;
        int iHashCode2 = (iHashCode + (internal == null ? 0 : internal.hashCode())) * 31;
        List<Tool.Internal> list2 = this.tools;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ToolConfig.Internal internal2 = this.toolConfig;
        int iHashCode4 = (iHashCode3 + (internal2 == null ? 0 : internal2.hashCode())) * 31;
        Content.Internal internal3 = this.systemInstruction;
        return iHashCode4 + (internal3 != null ? internal3.hashCode() : 0);
    }

    public final void setToolConfig(ToolConfig.Internal internal) {
        this.toolConfig = internal;
    }

    public String toString() {
        return "GenerateContentRequest(model=" + this.model + ", contents=" + this.contents + ", safetySettings=" + this.safetySettings + ", generationConfig=" + this.generationConfig + ", tools=" + this.tools + ", toolConfig=" + this.toolConfig + ", systemInstruction=" + this.systemInstruction + ')';
    }

    public GenerateContentRequest(String str, List<Content.Internal> contents, List<SafetySetting.Internal> list, GenerationConfig.Internal internal, List<Tool.Internal> list2, ToolConfig.Internal internal2, Content.Internal internal3) {
        OooOOO0.OooO0oO(contents, "contents");
        this.model = str;
        this.contents = contents;
        this.safetySettings = list;
        this.generationConfig = internal;
        this.tools = list2;
        this.toolConfig = internal2;
        this.systemInstruction = internal3;
    }

    public /* synthetic */ GenerateContentRequest(String str, List list, List list2, GenerationConfig.Internal internal, List list3, ToolConfig.Internal internal2, Content.Internal internal3, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : internal, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : internal2, (i & 64) != 0 ? null : internal3);
    }
}

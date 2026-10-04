package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.FileDataPart;
import com.google.firebase.vertexai.type.FunctionCallPart;
import com.google.firebase.vertexai.type.FunctionResponsePart;
import com.google.firebase.vertexai.type.InlineDataPart;
import com.google.firebase.vertexai.type.TextPart;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33910OooO0O0;
import oO0oO00.C33962Oooo;
import oOo00O0O.C34462OooOO0o;
import oOo00O0O.C34474OooOoo0;
import oOo00O0O.OooO;
import oOo00O0O.OooOO0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/PartSerializer;", "LoOo00O0O/OooO;", "Lcom/google/firebase/vertexai/type/InternalPart;", "<init>", "()V", "LoOo00O0O/OooOO0O;", "element", "LoO0o0ooO/OooO0O0;", "selectDeserializer", "(LoOo00O0O/OooOO0O;)LoO0o0ooO/OooO0O0;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class PartSerializer extends OooO<InternalPart> {
    public static final PartSerializer INSTANCE = new PartSerializer();

    private PartSerializer() {
        super(C24035Oooo00o.f80943OooO00o.OooO0O0(InternalPart.class));
    }

    @Override // oOo00O0O.OooO
    public InterfaceC33910OooO0O0<InternalPart> selectDeserializer(OooOO0O element) {
        OooOOO0.OooO0oO(element, "element");
        C33962Oooo c33962Oooo = C34462OooOO0o.f123521OooO00o;
        C34474OooOoo0 c34474OooOoo0 = element instanceof C34474OooOoo0 ? (C34474OooOoo0) element : null;
        if (c34474OooOoo0 == null) {
            C34462OooOO0o.OooO00o(element, "JsonObject");
            throw null;
        }
        if (c34474OooOoo0.containsKey("text")) {
            return TextPart.Internal.INSTANCE.serializer();
        }
        if (c34474OooOoo0.containsKey("functionCall")) {
            return FunctionCallPart.Internal.INSTANCE.serializer();
        }
        if (c34474OooOoo0.containsKey("functionResponse")) {
            return FunctionResponsePart.Internal.INSTANCE.serializer();
        }
        if (c34474OooOoo0.containsKey("inlineData")) {
            return InlineDataPart.Internal.INSTANCE.serializer();
        }
        if (c34474OooOoo0.containsKey("fileData")) {
            return FileDataPart.Internal.INSTANCE.serializer();
        }
        throw new C33917OooOO0("Unknown Part type");
    }
}

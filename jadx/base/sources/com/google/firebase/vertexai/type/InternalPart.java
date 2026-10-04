package com.google.firebase.vertexai.type;

import kotlin.Metadata;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC33908OooO(with = PartSerializer.class)
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/InternalPart;", "", "Companion", "Lcom/google/firebase/vertexai/type/FileDataPart$Internal;", "Lcom/google/firebase/vertexai/type/FunctionCallPart$Internal;", "Lcom/google/firebase/vertexai/type/FunctionResponsePart$Internal;", "Lcom/google/firebase/vertexai/type/InlineDataPart$Internal;", "Lcom/google/firebase/vertexai/type/TextPart$Internal;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public interface InternalPart {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/InternalPart$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/InternalPart;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final InterfaceC33911OooO0OO<InternalPart> serializer() {
            return PartSerializer.INSTANCE;
        }
    }
}

package com.google.firebase.vertexai.java;

import androidx.concurrent.futures.OooOO0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import com.google.firebase.vertexai.GenerativeModel;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.CountTokensResponse;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.o0000oO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0.C33850OooO0O0;
import oO0o0o0.C33856OooO0oo;
import oO0o0o0.InterfaceC33849OooO00o;
import oOO00OOO.OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo0000O.OooO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H&¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H&¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/GenerativeModelFutures;", "", "<init>", "()V", "", "Lcom/google/firebase/vertexai/type/Content;", AuthenticationConstants.AAD.QUERY_PROMPT, "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "generateContent", "([Lcom/google/firebase/vertexai/type/Content;)Lcom/google/common/util/concurrent/ListenableFuture;", "LoOO00OOO/OooO00o;", "generateContentStream", "([Lcom/google/firebase/vertexai/type/Content;)LoOO00OOO/OooO00o;", "Lcom/google/firebase/vertexai/type/CountTokensResponse;", "countTokens", "Lcom/google/firebase/vertexai/java/ChatFutures;", "startChat", "()Lcom/google/firebase/vertexai/java/ChatFutures;", "", "history", "(Ljava/util/List;)Lcom/google/firebase/vertexai/java/ChatFutures;", "Lcom/google/firebase/vertexai/GenerativeModel;", "getGenerativeModel", "()Lcom/google/firebase/vertexai/GenerativeModel;", "Companion", "FuturesImpl", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class GenerativeModelFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/GenerativeModelFutures$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/google/firebase/vertexai/java/GenerativeModelFutures;", "model", "Lcom/google/firebase/vertexai/GenerativeModel;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final GenerativeModelFutures from(GenerativeModel model) {
            OooOOO0.OooO0oO(model, "model");
            return new FuturesImpl(model);
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/GenerativeModelFutures$FuturesImpl;", "Lcom/google/firebase/vertexai/java/GenerativeModelFutures;", "Lcom/google/firebase/vertexai/GenerativeModel;", "model", "<init>", "(Lcom/google/firebase/vertexai/GenerativeModel;)V", "", "Lcom/google/firebase/vertexai/type/Content;", AuthenticationConstants.AAD.QUERY_PROMPT, "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "generateContent", "([Lcom/google/firebase/vertexai/type/Content;)Lcom/google/common/util/concurrent/ListenableFuture;", "LoOO00OOO/OooO00o;", "generateContentStream", "([Lcom/google/firebase/vertexai/type/Content;)LoOO00OOO/OooO00o;", "Lcom/google/firebase/vertexai/type/CountTokensResponse;", "countTokens", "Lcom/google/firebase/vertexai/java/ChatFutures;", "startChat", "()Lcom/google/firebase/vertexai/java/ChatFutures;", "", "history", "(Ljava/util/List;)Lcom/google/firebase/vertexai/java/ChatFutures;", "getGenerativeModel", "()Lcom/google/firebase/vertexai/GenerativeModel;", "Lcom/google/firebase/vertexai/GenerativeModel;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class FuturesImpl extends GenerativeModelFutures {
        private final GenerativeModel model;

        public FuturesImpl(GenerativeModel model) {
            OooOOO0.OooO0oO(model, "model");
            this.model = model;
        }

        @Override // com.google.firebase.vertexai.java.GenerativeModelFutures
        public ListenableFuture<CountTokensResponse> countTokens(Content... prompt) {
            OooOOO0.OooO0oO(prompt, "prompt");
            OooOO0.OooO0O0 oooO0O0 = OooOO0.f63608OooO00o;
            return OooOO0.OooO00o(new GenerativeModelFutures$FuturesImpl$countTokens$1(this, prompt, null));
        }

        @Override // com.google.firebase.vertexai.java.GenerativeModelFutures
        public ListenableFuture<GenerateContentResponse> generateContent(Content... prompt) {
            OooOOO0.OooO0oO(prompt, "prompt");
            OooOO0.OooO0O0 oooO0O0 = OooOO0.f63608OooO00o;
            return OooOO0.OooO00o(new GenerativeModelFutures$FuturesImpl$generateContent$1(this, prompt, null));
        }

        @Override // com.google.firebase.vertexai.java.GenerativeModelFutures
        public OooO00o<GenerateContentResponse> generateContentStream(Content... prompt) {
            OooOOO0.OooO0oO(prompt, "prompt");
            InterfaceC33721OooO0o<GenerateContentResponse> interfaceC33721OooO0oGenerateContentStream = this.model.generateContentStream((Content[]) Arrays.copyOf(prompt, prompt.length));
            InterfaceC33849OooO00o[] interfaceC33849OooO00oArr = C33856OooO0oo.f121981OooO00o;
            OooO oooO = OooO.f123416OooOo0o;
            o0000oO o0000oo2 = C33649OoooOOo.f121329OooO0O0;
            o0000oo2.getClass();
            return new C33850OooO0O0(interfaceC33721OooO0oGenerateContentStream, InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(o0000oo2, oooO));
        }

        @Override // com.google.firebase.vertexai.java.GenerativeModelFutures
        /* JADX INFO: renamed from: getGenerativeModel, reason: from getter */
        public GenerativeModel getModel() {
            return this.model;
        }

        @Override // com.google.firebase.vertexai.java.GenerativeModelFutures
        public ChatFutures startChat() {
            return startChat(C34434OooOoO.f123453OooOo0o);
        }

        @Override // com.google.firebase.vertexai.java.GenerativeModelFutures
        public ChatFutures startChat(List<Content> history) {
            OooOOO0.OooO0oO(history, "history");
            return ChatFutures.INSTANCE.from(this.model.startChat(history));
        }
    }

    public static final GenerativeModelFutures from(GenerativeModel generativeModel) {
        return INSTANCE.from(generativeModel);
    }

    public abstract ListenableFuture<CountTokensResponse> countTokens(Content... prompt);

    public abstract ListenableFuture<GenerateContentResponse> generateContent(Content... prompt);

    public abstract OooO00o<GenerateContentResponse> generateContentStream(Content... prompt);

    /* JADX INFO: renamed from: getGenerativeModel */
    public abstract GenerativeModel getModel();

    public abstract ChatFutures startChat();

    public abstract ChatFutures startChat(List<Content> history);
}

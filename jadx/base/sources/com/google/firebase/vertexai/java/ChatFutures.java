package com.google.firebase.vertexai.java;

import androidx.concurrent.futures.OooOO0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import com.google.firebase.vertexai.Chat;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/ChatFutures;", "", "<init>", "()V", "Lcom/google/firebase/vertexai/type/Content;", AuthenticationConstants.AAD.QUERY_PROMPT, "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "sendMessage", "(Lcom/google/firebase/vertexai/type/Content;)Lcom/google/common/util/concurrent/ListenableFuture;", "LoOO00OOO/OooO00o;", "sendMessageStream", "(Lcom/google/firebase/vertexai/type/Content;)LoOO00OOO/OooO00o;", "Lcom/google/firebase/vertexai/Chat;", "getChat", "()Lcom/google/firebase/vertexai/Chat;", "Companion", "FuturesImpl", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class ChatFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/ChatFutures$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/google/firebase/vertexai/java/ChatFutures;", "chat", "Lcom/google/firebase/vertexai/Chat;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final ChatFutures from(Chat chat) {
            OooOOO0.OooO0oO(chat, "chat");
            return new FuturesImpl(chat);
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/ChatFutures$FuturesImpl;", "Lcom/google/firebase/vertexai/java/ChatFutures;", "Lcom/google/firebase/vertexai/Chat;", "chat", "<init>", "(Lcom/google/firebase/vertexai/Chat;)V", "Lcom/google/firebase/vertexai/type/Content;", AuthenticationConstants.AAD.QUERY_PROMPT, "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "sendMessage", "(Lcom/google/firebase/vertexai/type/Content;)Lcom/google/common/util/concurrent/ListenableFuture;", "LoOO00OOO/OooO00o;", "sendMessageStream", "(Lcom/google/firebase/vertexai/type/Content;)LoOO00OOO/OooO00o;", "getChat", "()Lcom/google/firebase/vertexai/Chat;", "Lcom/google/firebase/vertexai/Chat;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class FuturesImpl extends ChatFutures {
        private final Chat chat;

        public FuturesImpl(Chat chat) {
            OooOOO0.OooO0oO(chat, "chat");
            this.chat = chat;
        }

        @Override // com.google.firebase.vertexai.java.ChatFutures
        public Chat getChat() {
            return this.chat;
        }

        @Override // com.google.firebase.vertexai.java.ChatFutures
        public ListenableFuture<GenerateContentResponse> sendMessage(Content prompt) {
            OooOOO0.OooO0oO(prompt, "prompt");
            OooOO0.OooO0O0 oooO0O0 = OooOO0.f63608OooO00o;
            return OooOO0.OooO00o(new ChatFutures$FuturesImpl$sendMessage$1(this, prompt, null));
        }

        @Override // com.google.firebase.vertexai.java.ChatFutures
        public OooO00o<GenerateContentResponse> sendMessageStream(Content prompt) {
            OooOOO0.OooO0oO(prompt, "prompt");
            InterfaceC33721OooO0o<GenerateContentResponse> interfaceC33721OooO0oSendMessageStream = this.chat.sendMessageStream(prompt);
            InterfaceC33849OooO00o[] interfaceC33849OooO00oArr = C33856OooO0oo.f121981OooO00o;
            OooO oooO = OooO.f123416OooOo0o;
            o0000oO o0000oo2 = C33649OoooOOo.f121329OooO0O0;
            o0000oo2.getClass();
            return new C33850OooO0O0(interfaceC33721OooO0oSendMessageStream, InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(o0000oo2, oooO));
        }
    }

    public static final ChatFutures from(Chat chat) {
        return INSTANCE.from(chat);
    }

    public abstract Chat getChat();

    public abstract ListenableFuture<GenerateContentResponse> sendMessage(Content prompt);

    public abstract OooO00o<GenerateContentResponse> sendMessageStream(Content prompt);
}

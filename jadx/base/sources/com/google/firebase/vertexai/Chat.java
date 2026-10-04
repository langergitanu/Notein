package com.google.firebase.vertexai;

import android.graphics.Bitmap;
import com.google.firebase.vertexai.type.Candidate;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.ContentKt;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.google.firebase.vertexai.type.ImagePart;
import com.google.firebase.vertexai.type.InlineDataPart;
import com.google.firebase.vertexai.type.InvalidStateException;
import com.google.firebase.vertexai.type.Part;
import com.google.firebase.vertexai.type.TextPart;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24037Oooo0OO;
import kotlin.jvm.internal.OooOOO0;
import o0OO00o0.o000Oo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0013J\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0015J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u000e\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0019J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u000e\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m80612d2 = {"Lcom/google/firebase/vertexai/Chat;", "", "Lcom/google/firebase/vertexai/GenerativeModel;", "model", "", "Lcom/google/firebase/vertexai/type/Content;", "history", "<init>", "(Lcom/google/firebase/vertexai/GenerativeModel;Ljava/util/List;)V", "LoO00ooO/OooOooO;", "assertComesFromUser", "(Lcom/google/firebase/vertexai/type/Content;)V", "attemptLock", "()V", AuthenticationConstants.AAD.QUERY_PROMPT, "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "sendMessage", "(Lcom/google/firebase/vertexai/type/Content;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LoO0o0Oo/OooO0o;", "sendMessageStream", "(Lcom/google/firebase/vertexai/type/Content;)LoO0o0Oo/OooO0o;", "(Ljava/lang/String;)LoO0o0Oo/OooO0o;", "(Landroid/graphics/Bitmap;)LoO0o0Oo/OooO0o;", "Lcom/google/firebase/vertexai/GenerativeModel;", "Ljava/util/List;", "getHistory", "()Ljava/util/List;", "Ljava/util/concurrent/Semaphore;", "lock", "Ljava/util/concurrent/Semaphore;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class Chat {
    private final List<Content> history;
    private Semaphore lock;
    private final GenerativeModel model;

    /* JADX INFO: renamed from: com.google.firebase.vertexai.Chat$sendMessage$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.Chat", m80623f = "Chat.kt", m80624l = {69}, m80625m = "sendMessage")
    public static final class C172201 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C172201(Continuation<? super C172201> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Chat.this.sendMessage((Content) null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.Chat$sendMessageStream$1 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/GenerateContentResponse;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(Lcom/google/firebase/vertexai/type/GenerateContentResponse;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.Chat$sendMessageStream$1", m80623f = "Chat.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C172211 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<GenerateContentResponse, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ LinkedList<Bitmap> $bitmaps;
        final /* synthetic */ LinkedList<InlineDataPart> $inlineDataParts;
        final /* synthetic */ StringBuilder $text;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172211(StringBuilder sb, LinkedList<Bitmap> linkedList, LinkedList<InlineDataPart> linkedList2, Continuation<? super C172211> continuation) {
            super(2, continuation);
            this.$text = sb;
            this.$bitmaps = linkedList;
            this.$inlineDataParts = linkedList2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C172211 c172211 = new C172211(this.$text, this.$bitmaps, this.$inlineDataParts, continuation);
            c172211.L$0 = obj;
            return c172211;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(GenerateContentResponse generateContentResponse, Continuation<? super C32460OooOooO> continuation) {
            return ((C172211) create(generateContentResponse, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            for (Part part : ((Candidate) OooOo.Oooo0oO(((GenerateContentResponse) this.L$0).getCandidates())).getContent().getParts()) {
                if (part instanceof TextPart) {
                    this.$text.append(((TextPart) part).getText());
                } else if (part instanceof ImagePart) {
                    this.$bitmaps.add(((ImagePart) part).getImage());
                } else if (part instanceof InlineDataPart) {
                    this.$inlineDataParts.add((InlineDataPart) part);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.Chat$sendMessageStream$2 */
    @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m80612d2 = {"LoO0o0Oo/OooO0oO;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0Oo/OooO0oO;Ljava/lang/Throwable;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.Chat$sendMessageStream$2", m80623f = "Chat.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C172222 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super GenerateContentResponse>, Throwable, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ LinkedList<Bitmap> $bitmaps;
        final /* synthetic */ LinkedList<InlineDataPart> $inlineDataParts;
        final /* synthetic */ Content $prompt;
        final /* synthetic */ StringBuilder $text;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172222(Content content, LinkedList<Bitmap> linkedList, LinkedList<InlineDataPart> linkedList2, StringBuilder sb, Continuation<? super C172222> continuation) {
            super(3, continuation);
            this.$prompt = content;
            this.$bitmaps = linkedList;
            this.$inlineDataParts = linkedList2;
            this.$text = sb;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            Throwable th = (Throwable) this.L$0;
            Chat.this.lock.release();
            if (th == null) {
                Content content = ContentKt.content("model", new Chat$sendMessageStream$2$content$1(this.$bitmaps, this.$inlineDataParts, this.$text));
                Chat.this.getHistory().add(this.$prompt);
                Chat.this.getHistory().add(content);
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super GenerateContentResponse> interfaceC33723OooO0oO, Throwable th, Continuation<? super C32460OooOooO> continuation) {
            C172222 c172222 = Chat.this.new C172222(this.$prompt, this.$bitmaps, this.$inlineDataParts, this.$text, continuation);
            c172222.L$0 = th;
            return c172222.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    public Chat(GenerativeModel model, List<Content> history) {
        OooOOO0.OooO0oO(model, "model");
        OooOOO0.OooO0oO(history, "history");
        this.model = model;
        this.history = history;
        this.lock = new Semaphore(1);
    }

    private final void assertComesFromUser(Content content) {
        if (!OooOo.Oooo00o(C34429OooOOo0.OooOO0o("user", "function"), content.getRole())) {
            throw new InvalidStateException("Chat prompts should come from the 'user' or 'function' role.", null, 2, null);
        }
    }

    private final void attemptLock() {
        if (!this.lock.tryAcquire()) {
            throw new InvalidStateException("This chat instance currently has an ongoing request, please wait for it to complete before sending more messages", null, 2, null);
        }
    }

    public final List<Content> getHistory() {
        return this.history;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMessage(Content content, Continuation<? super GenerateContentResponse> continuation) throws Throwable {
        C172201 c172201;
        Chat chat;
        if (continuation instanceof C172201) {
            c172201 = (C172201) continuation;
            int i = c172201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172201.label = i - Integer.MIN_VALUE;
            } else {
                c172201 = new C172201(continuation);
            }
        }
        Object objGenerateContent = c172201.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172201.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objGenerateContent);
            assertComesFromUser(content);
            attemptLock();
            try {
                GenerativeModel generativeModel = this.model;
                C24037Oooo0OO c24037Oooo0OO = new C24037Oooo0OO(2);
                ArrayList arrayList = (ArrayList) c24037Oooo0OO.f80945OooO00o;
                c24037Oooo0OO.OooO0Oo(this.history.toArray(new Content[0]));
                c24037Oooo0OO.OooO0OO(content);
                Content[] contentArr = (Content[]) arrayList.toArray(new Content[arrayList.size()]);
                c172201.L$0 = this;
                c172201.L$1 = content;
                c172201.label = 1;
                objGenerateContent = generativeModel.generateContent(contentArr, c172201);
                if (objGenerateContent == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                chat = this;
            } catch (Throwable th) {
                th = th;
                chat = this;
                chat.lock.release();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            content = (Content) c172201.L$1;
            chat = (Chat) c172201.L$0;
            try {
                C32446OooOOOo.OooO0O0(objGenerateContent);
            } catch (Throwable th2) {
                th = th2;
                chat.lock.release();
                throw th;
            }
        }
        GenerateContentResponse generateContentResponse = (GenerateContentResponse) objGenerateContent;
        chat.history.add(content);
        chat.history.add(((Candidate) OooOo.Oooo0oO(generateContentResponse.getCandidates())).getContent());
        chat.lock.release();
        return generateContentResponse;
    }

    public final InterfaceC33721OooO0o<GenerateContentResponse> sendMessageStream(Content prompt) {
        OooOOO0.OooO0oO(prompt, "prompt");
        assertComesFromUser(prompt);
        attemptLock();
        GenerativeModel generativeModel = this.model;
        C24037Oooo0OO c24037Oooo0OO = new C24037Oooo0OO(2);
        c24037Oooo0OO.OooO0Oo(this.history.toArray(new Content[0]));
        c24037Oooo0OO.OooO0OO(prompt);
        ArrayList arrayList = (ArrayList) c24037Oooo0OO.f80945OooO00o;
        InterfaceC33721OooO0o<GenerateContentResponse> interfaceC33721OooO0oGenerateContentStream = generativeModel.generateContentStream((Content[]) arrayList.toArray(new Content[arrayList.size()]));
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        StringBuilder sb = new StringBuilder();
        return new C33734OooOOoo(new o000Oo0(interfaceC33721OooO0oGenerateContentStream, new C172211(sb, linkedList, linkedList2, null), 1), new C172222(prompt, linkedList, linkedList2, sb, null));
    }

    public /* synthetic */ Chat(GenerativeModel generativeModel, List list, int i, C24018OooO0oo c24018OooO0oo) {
        this(generativeModel, (i & 2) != 0 ? new ArrayList() : list);
    }

    public final Object sendMessage(String str, Continuation<? super GenerateContentResponse> continuation) {
        return sendMessage(ContentKt.content$default(null, new Chat$sendMessage$content$1(str), 1, null), continuation);
    }

    public final Object sendMessage(Bitmap bitmap, Continuation<? super GenerateContentResponse> continuation) {
        return sendMessage(ContentKt.content$default(null, new Chat$sendMessage$content$2(bitmap), 1, null), continuation);
    }

    public final InterfaceC33721OooO0o<GenerateContentResponse> sendMessageStream(String prompt) {
        OooOOO0.OooO0oO(prompt, "prompt");
        return sendMessageStream(ContentKt.content$default(null, new Chat$sendMessageStream$content$1(prompt), 1, null));
    }

    public final InterfaceC33721OooO0o<GenerateContentResponse> sendMessageStream(Bitmap prompt) {
        OooOOO0.OooO0oO(prompt, "prompt");
        return sendMessageStream(ContentKt.content$default(null, new Chat$sendMessageStream$content$2(prompt), 1, null));
    }
}

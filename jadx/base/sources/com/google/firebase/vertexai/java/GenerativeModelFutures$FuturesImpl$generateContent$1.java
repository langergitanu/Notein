package com.google.firebase.vertexai.java;

import com.google.firebase.vertexai.GenerativeModel;
import com.google.firebase.vertexai.java.GenerativeModelFutures;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Lcom/google/firebase/vertexai/type/GenerateContentResponse;"}, m80613k = 3, m80614mv = {1, 8, 0})
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.java.GenerativeModelFutures$FuturesImpl$generateContent$1", m80623f = "GenerativeModelFutures.kt", m80624l = {88}, m80625m = "invokeSuspend")
public final class GenerativeModelFutures$FuturesImpl$generateContent$1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super GenerateContentResponse>, Object> {
    final /* synthetic */ Content[] $prompt;
    int label;
    final /* synthetic */ GenerativeModelFutures.FuturesImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerativeModelFutures$FuturesImpl$generateContent$1(GenerativeModelFutures.FuturesImpl futuresImpl, Content[] contentArr, Continuation<? super GenerativeModelFutures$FuturesImpl$generateContent$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresImpl;
        this.$prompt = contentArr;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new GenerativeModelFutures$FuturesImpl$generateContent$1(this.this$0, this.$prompt, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        GenerativeModel generativeModel = this.this$0.model;
        Content[] contentArr = this.$prompt;
        Content[] contentArr2 = (Content[]) Arrays.copyOf(contentArr, contentArr.length);
        this.label = 1;
        Object objGenerateContent = generativeModel.generateContent(contentArr2, this);
        return objGenerateContent == enumC32485OooO00o ? enumC32485OooO00o : objGenerateContent;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super GenerateContentResponse> continuation) {
        return ((GenerativeModelFutures$FuturesImpl$generateContent$1) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}

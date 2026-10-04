package com.google.firebase.vertexai.java;

import com.google.firebase.vertexai.ImagenModel;
import com.google.firebase.vertexai.java.ImagenModelFutures;
import com.google.firebase.vertexai.type.ImagenGenerationResponse;
import com.google.firebase.vertexai.type.ImagenInlineImage;
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
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse;", "Lcom/google/firebase/vertexai/type/ImagenInlineImage;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Lcom/google/firebase/vertexai/type/ImagenGenerationResponse;"}, m80613k = 3, m80614mv = {1, 8, 0})
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.java.ImagenModelFutures$FuturesImpl$generateImages$1", m80623f = "ImagenModelFutures.kt", m80624l = {49}, m80625m = "invokeSuspend")
public final class ImagenModelFutures$FuturesImpl$generateImages$1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super ImagenGenerationResponse<ImagenInlineImage>>, Object> {
    final /* synthetic */ String $prompt;
    int label;
    final /* synthetic */ ImagenModelFutures.FuturesImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagenModelFutures$FuturesImpl$generateImages$1(ImagenModelFutures.FuturesImpl futuresImpl, String str, Continuation<? super ImagenModelFutures$FuturesImpl$generateImages$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresImpl;
        this.$prompt = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new ImagenModelFutures$FuturesImpl$generateImages$1(this.this$0, this.$prompt, continuation);
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
        ImagenModel imagenModel = this.this$0.model;
        String str = this.$prompt;
        this.label = 1;
        Object objGenerateImages = imagenModel.generateImages(str, this);
        return objGenerateImages == enumC32485OooO00o ? enumC32485OooO00o : objGenerateImages;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super ImagenGenerationResponse<ImagenInlineImage>> continuation) {
        return ((ImagenModelFutures$FuturesImpl$generateImages$1) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}

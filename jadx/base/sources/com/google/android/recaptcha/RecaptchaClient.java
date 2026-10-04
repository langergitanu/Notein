package com.google.android.recaptcha;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m80612d2 = {"Lcom/google/android/recaptcha/RecaptchaClient;", "", "Lcom/google/android/recaptcha/RecaptchaAction;", "recaptchaAction", "", "timeout", "LoO00ooO/OooOOOO;", "", "execute-0E7RQCE", "(Lcom/google/android/recaptcha/RecaptchaAction;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "execute-gIAlu-s", "(Lcom/google/android/recaptcha/RecaptchaAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public interface RecaptchaClient {
    /* JADX INFO: renamed from: execute-0E7RQCE, reason: not valid java name */
    Object mo80693execute0E7RQCE(RecaptchaAction recaptchaAction, long j, Continuation<? super C32445OooOOOO<String>> continuation);

    /* JADX INFO: renamed from: execute-gIAlu-s, reason: not valid java name */
    Object mo80694executegIAlus(RecaptchaAction recaptchaAction, Continuation<? super C32445OooOOOO<String>> continuation);
}

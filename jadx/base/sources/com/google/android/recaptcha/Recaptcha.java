package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m80612d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "fetchTaskClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "getTasksClient", "", "timeout", "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaClient;", "fetchClient", "(Landroid/app/Application;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LoO00ooO/OooOOOO;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClient", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String siteKey) {
        return zzcq.zze(application, siteKey);
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m80691getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m80692getClientBWLJW6A(application, str, j, continuation);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey) {
        return zzcq.zzc(application, siteKey, 10000L);
    }

    public final Object fetchClient(Application application, String str, Continuation<? super RecaptchaClient> continuation) {
        return zzcq.zzd(application, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m80692getClientBWLJW6A(Application application, String str, long j, Continuation<? super C32445OooOOOO<? extends RecaptchaClient>> continuation) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (continuation instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) continuation;
            int i = recaptcha$getClient$1.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, continuation);
            }
        }
        Object objZzb = recaptcha$getClient$1.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = recaptcha$getClient$1.zzc;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objZzb);
                recaptcha$getClient$1.zzc = 1;
                objZzb = zzcq.zzb(application, str, j, recaptcha$getClient$1);
                if (objZzb == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objZzb);
            }
            return (zzdc) objZzb;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey, long timeout) {
        return zzcq.zzc(application, siteKey, timeout);
    }
}

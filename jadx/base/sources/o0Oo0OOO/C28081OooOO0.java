package o0Oo0OOO;

import OooOooO.C20741OooOOoo;
import Oooo0oO.o0Oo0oo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.google.mlkit.p567nl.translate.Translation;
import com.google.mlkit.p567nl.translate.Translator;
import com.google.mlkit.p567nl.translate.TranslatorOptions;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0OOO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28081OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C28081OooOO0 f99532OooO00o = new C28081OooOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final LinkedHashMap f99533OooO0O0 = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28079OooO0oO c28079OooO0oO;
        Translator translator;
        if (abstractC32479OooO0OO instanceof C28079OooO0oO) {
            c28079OooO0oO = (C28079OooO0oO) abstractC32479OooO0OO;
            int i = c28079OooO0oO.f99526OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28079OooO0oO.f99526OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28079OooO0oO = new C28079OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28079OooO0oO.f99524OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28079OooO0oO.f99526OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                TranslatorOptions translatorOptionsBuild = new TranslatorOptions.Builder().setSourceLanguage(str).setTargetLanguage(str2).build();
                OooOOO0.OooO0o(translatorOptionsBuild, "build(...)");
                Translator client = Translation.getClient(translatorOptionsBuild);
                OooOOO0.OooO0o(client, "getClient(...)");
                Task<Void> taskDownloadModelIfNeeded = client.downloadModelIfNeeded();
                final C28073OooO00o c28073OooO00o = new C28073OooO00o(str, str2);
                Task<Void> taskAddOnFailureListener = taskDownloadModelIfNeeded.addOnSuccessListener(new OnSuccessListener() { // from class: o0Oo0OOO.OooO0O0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj2) {
                        c28073OooO00o.invoke(obj2);
                    }
                }).addOnFailureListener(new C28075OooO0OO());
                OooOOO0.OooO0o(taskAddOnFailureListener, "addOnFailureListener(...)");
                c28079OooO0oO.f99525OooOo0o = client;
                c28079OooO0oO.f99526OooOoO = 1;
                Object objOooO0o = C20741OooOOoo.OooO0o(taskAddOnFailureListener, c28079OooO0oO);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj = objOooO0o;
                translator = client;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                translator = c28079OooO0oO.f99525OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            return translator;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MlKitTranslateHelper");
            c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("下载模型失败. ", e.getMessage()), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28080OooO0oo c28080OooO0oo;
        String str3;
        if (abstractC32479OooO0OO instanceof C28080OooO0oo) {
            c28080OooO0oo = (C28080OooO0oo) abstractC32479OooO0OO;
            int i = c28080OooO0oo.f99530OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28080OooO0oo.f99530OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28080OooO0oo = new C28080OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28080OooO0oo.f99528OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28080OooO0oo.f99530OooOoO;
        LinkedHashMap linkedHashMap = f99533OooO0O0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String strFromLanguageTag = TranslateLanguage.fromLanguageTag(str);
            String strFromLanguageTag2 = TranslateLanguage.fromLanguageTag(str2);
            if (strFromLanguageTag == null || strFromLanguageTag2 == null) {
                throw new IllegalArgumentException("Language code is not valid.");
            }
            String strOooO0Oo = o0Oo0oo.OooO0Oo(strFromLanguageTag, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, strFromLanguageTag2);
            Translator translator = (Translator) linkedHashMap.get(strOooO0Oo);
            if (translator != null) {
                return translator;
            }
            c28080OooO0oo.f99529OooOo0o = strOooO0Oo;
            c28080OooO0oo.f99530OooOoO = 1;
            Object objOooO00o = OooO00o(str, str2, c28080OooO0oo);
            if (objOooO00o == obj2) {
                return obj2;
            }
            obj = objOooO00o;
            str3 = strOooO0Oo;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c28080OooO0oo.f99529OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        Translator translator2 = (Translator) obj;
        if (translator2 == null) {
            return null;
        }
        linkedHashMap.put(str3, translator2);
        return translator2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C28072OooO c28072OooO;
        if (abstractC32479OooO0OO instanceof C28072OooO) {
            c28072OooO = (C28072OooO) abstractC32479OooO0OO;
            int i = c28072OooO.f99518OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28072OooO.f99518OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28072OooO = new C28072OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c28072OooO.f99516OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28072OooO.f99518OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c28072OooO.f99517OooOo0o = str;
            c28072OooO.f99518OooOoO = 1;
            objOooO0O0 = OooO0O0(str2, str3, c28072OooO);
            if (objOooO0O0 != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return objOooO0O0;
        }
        str = c28072OooO.f99517OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        Translator translator = (Translator) objOooO0O0;
        if (translator == null) {
            return null;
        }
        Task<String> taskTranslate = translator.translate(str);
        final C28076OooO0Oo c28076OooO0Oo = new C28076OooO0Oo();
        Task<String> taskAddOnFailureListener = taskTranslate.addOnSuccessListener(new OnSuccessListener() { // from class: o0Oo0OOO.OooO0o0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                c28076OooO0Oo.invoke(obj2);
            }
        }).addOnFailureListener(new C28077OooO0o());
        OooOOO0.OooO0o(taskAddOnFailureListener, "addOnFailureListener(...)");
        c28072OooO.f99517OooOo0o = null;
        c28072OooO.f99518OooOoO = 2;
        Object objOooO0o = C20741OooOOoo.OooO0o(taskAddOnFailureListener, c28072OooO);
        return objOooO0o == obj ? obj : objOooO0o;
    }
}

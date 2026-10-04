package o0OOOO0;

import OooOooO.C20741OooOOoo;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.app.OooO;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.p567nl.languageid.LanguageIdentification;
import com.google.mlkit.p567nl.languageid.LanguageIdentifier;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.translate.TranslateResult;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27205OooO0OO;
import o0Oo0OOO.C28081OooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27084OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0<AbstractC24338OooO0o0> f94328OooO00o;

    public C27084OooO0o0(OooOO0<AbstractC24338OooO0o0> dataStore) {
        OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f94328OooO00o = dataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        C27084OooO0o0 c27084OooO0o0;
        String language;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f94315OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f94315OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = oooO0O0.f94314OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f94315OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = this.f94328OooO00o.getData();
            oooO0O0.f94312OooOo0o = this;
            oooO0O0.f94311OooOo = str;
            oooO0O0.f94315OooOoOO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, oooO0O0);
            if (objOooOOo != enumC32485OooO00o) {
                c27084OooO0o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C32446OooOOOo.OooO0O0(objOooOOo);
                return objOooOOo;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
            return objOooOOo;
        }
        str = oooO0O0.f94311OooOo;
        c27084OooO0o0 = oooO0O0.f94312OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        String str2 = (String) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(C27205OooO0OO.f95015OooOOOO);
        if (str2 == null) {
            c27084OooO0o0.getClass();
            LocaleListCompat localeListCompatOooO0o = AbstractC21486OooOO0o.OooO0o();
            OooOOO0.OooO0o(localeListCompatOooO0o, "getApplicationLocales(...)");
            Locale locale = !localeListCompatOooO0o.isEmpty() ? localeListCompatOooO0o.get(0) : Locale.getDefault();
            if (locale == null || (language = locale.getLanguage()) == null) {
                language = TranslateLanguage.ENGLISH;
            }
            oooO0O0.f94312OooOo0o = null;
            oooO0O0.f94311OooOo = null;
            oooO0O0.f94315OooOoOO = 2;
            Object objOooO0OO = c27084OooO0o0.OooO0OO(str, "auto", language, oooO0O0);
            if (objOooO0OO != enumC32485OooO00o) {
                return objOooO0OO;
            }
        } else {
            oooO0O0.f94312OooOo0o = null;
            oooO0O0.f94311OooOo = null;
            oooO0O0.f94315OooOoOO = 3;
            Object objOooO0OO2 = c27084OooO0o0.OooO0OO(str, "auto", str2, oooO0O0);
            if (objOooO0OO2 != enumC32485OooO00o) {
                return objOooO0OO2;
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0OO oooO0OO;
        String str2;
        Task<String> task;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f94320OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f94320OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0OO.f94319OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f94320OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            LanguageIdentifier client = LanguageIdentification.getClient();
            OooOOO0.OooO0o(client, "getClient(...)");
            Task<String> taskIdentifyLanguage = client.identifyLanguage(str);
            OooOOO0.OooO0Oo(taskIdentifyLanguage);
            oooO0OO.f94317OooOo0o = str;
            oooO0OO.f94316OooOo = taskIdentifyLanguage;
            oooO0OO.f94320OooOoOO = 1;
            if (C20741OooOOoo.OooO0o(taskIdentifyLanguage, oooO0OO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            str2 = str;
            task = taskIdentifyLanguage;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            task = oooO0OO.f94316OooOo;
            str2 = oooO0OO.f94317OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        OooOOO0.OooO0o(task, "also(...)");
        if (!task.isSuccessful()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TranslateGoogleDataSource");
            c20358OooO00o.OooO0OO("Language identification failed.", new Object[0]);
            return null;
        }
        String result = task.getResult();
        if (OooOOO0.OooO0O0(result, LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(OooO.OooO0O0(c20358OooO00o2, "TranslateGoogleDataSource", "Can't identify language. ", str2), new Object[0]);
            return null;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooO0o0(OooO.OooO0O0(c20358OooO00o3, "TranslateGoogleDataSource", "Language: ", result), new Object[0]);
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9 A[Catch: Exception -> 0x00d5, TryCatch #2 {Exception -> 0x00d5, blocks: (B:41:0x00b5, B:43:0x00b9, B:47:0x00dc), top: B:58:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d5, blocks: (B:41:0x00b5, B:43:0x00b9, B:47:0x00dc), top: B:58:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27083OooO0Oo c27083OooO0Oo;
        String str4;
        String str5;
        String str6;
        C27084OooO0o0 c27084OooO0o0;
        String str7;
        String str8;
        String str9;
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        if (abstractC32479OooO0OO instanceof C27083OooO0Oo) {
            c27083OooO0Oo = (C27083OooO0Oo) abstractC32479OooO0OO;
            int i = c27083OooO0Oo.f94326OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27083OooO0Oo.f94326OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27083OooO0Oo = new C27083OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27083OooO0Oo.f94323OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27083OooO0Oo.f94326OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            if (OooOOO0.OooO0O0(str11, "auto")) {
                c27083OooO0Oo.f94322OooOo0o = this;
                c27083OooO0Oo.f94321OooOo = str10;
                c27083OooO0Oo.f94324OooOoO0 = str12;
                c27083OooO0Oo.f94326OooOoo0 = 1;
                objOooO0OO = OooO0O0(str10, c27083OooO0Oo);
                if (objOooO0OO != enumC32485OooO00o) {
                    c27084OooO0o0 = this;
                    str7 = (String) objOooO0OO;
                    if (str7 == null) {
                    }
                    c27083OooO0Oo.f94322OooOo0o = null;
                    c27083OooO0Oo.f94321OooOo = null;
                    c27083OooO0Oo.f94324OooOoO0 = null;
                    c27083OooO0Oo.f94326OooOoo0 = 2;
                    Object objOooO0OO2 = c27084OooO0o0.OooO0OO(str10, str7, str12, c27083OooO0Oo);
                    if (objOooO0OO2 != enumC32485OooO00o) {
                    }
                }
            } else {
                try {
                    C28081OooOO0 c28081OooOO0 = C28081OooOO0.f99532OooO00o;
                    c27083OooO0Oo.f94322OooOo0o = str10;
                    c27083OooO0Oo.f94321OooOo = str11;
                    c27083OooO0Oo.f94324OooOoO0 = str12;
                    c27083OooO0Oo.f94326OooOoo0 = 3;
                    objOooO0OO = c28081OooOO0.OooO0OO(str10, str11, str12, c27083OooO0Oo);
                    if (objOooO0OO != enumC32485OooO00o) {
                        str5 = str10;
                        str6 = str12;
                        str8 = str11;
                        str9 = (String) objOooO0OO;
                        if (str9 != null) {
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    str4 = str10;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("TranslateGoogleDataSource");
                    c20358OooO00o.OooO0OO("Translation failed.", new Object[0]);
                    return new TranslateResult(str11, str12, str4, "", "", "", "", e.toString());
                }
            }
        }
        if (i2 == 1) {
            String str13 = c27083OooO0Oo.f94324OooOoO0;
            String str14 = c27083OooO0Oo.f94321OooOo;
            C27084OooO0o0 c27084OooO0o02 = (C27084OooO0o0) c27083OooO0Oo.f94322OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            str12 = str13;
            str10 = str14;
            c27084OooO0o0 = c27084OooO0o02;
            str7 = (String) objOooO0OO;
            if (str7 == null) {
                str7 = TranslateLanguage.ENGLISH;
            }
            c27083OooO0Oo.f94322OooOo0o = null;
            c27083OooO0Oo.f94321OooOo = null;
            c27083OooO0Oo.f94324OooOoO0 = null;
            c27083OooO0Oo.f94326OooOoo0 = 2;
            Object objOooO0OO22 = c27084OooO0o0.OooO0OO(str10, str7, str12, c27083OooO0Oo);
            return objOooO0OO22 != enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO22;
        }
        if (i2 == 2) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            return objOooO0OO;
        }
        if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str15 = c27083OooO0Oo.f94324OooOoO0;
        str11 = c27083OooO0Oo.f94321OooOo;
        String str16 = (String) c27083OooO0Oo.f94322OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            str6 = str15;
            str5 = str16;
            str8 = str11;
        } catch (Exception e2) {
            e = e2;
            str4 = str16;
            str12 = str15;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("TranslateGoogleDataSource");
            c20358OooO00o2.OooO0OO("Translation failed.", new Object[0]);
            return new TranslateResult(str11, str12, str4, "", "", "", "", e.toString());
        }
        try {
            str9 = (String) objOooO0OO;
            if (str9 != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("TranslateGoogleDataSource");
                c20358OooO00o3.OooO0OO("Translation text is null.", new Object[0]);
                return new TranslateResult(str8, str6, str5, "", "", "", "", "");
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("TranslateGoogleDataSource");
            c20358OooO00o4.OooO00o("Translated text: ".concat(str9), new Object[0]);
            return new TranslateResult(str8, str6, str5, str9, "", "", "", "");
        } catch (Exception e3) {
            e = e3;
            str11 = str8;
            str12 = str6;
            str4 = str5;
            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o22.OooOOO0("TranslateGoogleDataSource");
            c20358OooO00o22.OooO0OO("Translation failed.", new Object[0]);
            return new TranslateResult(str11, str12, str4, "", "", "", "", e.toString());
        }
    }
}

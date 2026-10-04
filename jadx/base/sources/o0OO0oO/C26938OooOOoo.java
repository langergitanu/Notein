package o0OO0oO;

import OooOoOO.C20519OooO0Oo;
import android.net.Uri;
import com.aspose.slides.C22201OooO0oO;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import o0OOOoO0.C27192OooO00o;
import o0OOOoO0.C27193OooO0O0;
import o0OOOoO0.C27194OooO0OO;
import o0OOOoO0.C27196OooO0o;
import o0OOOoO0.C27197OooO0o0;
import o0OOOoO0.InterfaceC27198OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO0.InterfaceC32462OooO00o;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OO0oO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26938OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27198OooO0oO f93570OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32462OooO00o<o0OO00Oo.OooO0OO> f93571OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f93572OooO0OO;

    public C26938OooOOoo(InterfaceC27198OooO0oO wpsService, InterfaceC32462OooO00o<o0OO00Oo.OooO0OO> ossProvider) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(wpsService, "wpsService");
        kotlin.jvm.internal.OooOOO0.OooO0oO(ossProvider, "ossProvider");
        this.f93570OooO00o = wpsService;
        this.f93571OooO0O0 = ossProvider;
        this.f93572OooO0OO = C20519OooO0Oo.OooO0OO(new OooOOO0(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C26938OooOOoo c26938OooOOoo, String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOOO oooOOOO;
        c26938OooOOoo.getClass();
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f93555OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f93555OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(c26938OooOOoo, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooOOOO.f93554OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f93555OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            C27192OooO00o c27192OooO00o = new C27192OooO00o(str, str2, str3);
            oooOOOO.f93555OooOoO0 = 1;
            objOooO0O0 = c26938OooOOoo.f93570OooO00o.OooO0O0(c27192OooO00o, oooOOOO);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        C27193OooO0O0 c27193OooO0O0 = (C27193OooO0O0) objOooO0O0;
        if (c27193OooO0O0.getCode() == 0) {
            return c27193OooO0O0.getCom.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String().getTaskId();
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("WPSFileConvertDataSource");
        c20358OooO00o.OooOO0O(androidx.core.app.OooO.OooO00o(c27193OooO0O0.getCode(), "createTask failed code=", ", msg=", c27193OooO0O0.getMessage()), new Object[0]);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        if (oO0o0OO.C33644OoooO0.OooO00o(2000, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f2 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C26938OooOOoo c26938OooOOoo, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26937OooOOo0 c26937OooOOo0;
        int i;
        int i2;
        int i3;
        int i4;
        C26938OooOOoo c26938OooOOoo2;
        String str2;
        String upperCase;
        List<C27194OooO0OO> listOooO00o;
        C27194OooO0OO c27194OooO0OO;
        c26938OooOOoo.getClass();
        if (abstractC32479OooO0OO instanceof C26937OooOOo0) {
            c26937OooOOo0 = (C26937OooOOo0) abstractC32479OooO0OO;
            int i5 = c26937OooOOo0.f93568OooOoo;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c26937OooOOo0.f93568OooOoo = i5 - Integer.MIN_VALUE;
            } else {
                c26937OooOOo0 = new C26937OooOOo0(c26938OooOOoo, abstractC32479OooO0OO);
            }
        }
        Object obj = c26937OooOOo0.f93567OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i6 = c26937OooOOo0.f93568OooOoo;
        if (i6 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            i = 60;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = c26937OooOOo0.f93565OooOoO;
                i3 = c26937OooOOo0.f93566OooOoO0;
                str2 = c26937OooOOo0.f93563OooOo;
                c26938OooOOoo2 = c26937OooOOo0.f93564OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i3;
                str = str2;
                i2 = i4 + 1;
                c26938OooOOoo = c26938OooOOoo2;
                if (i2 < i) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOO0O(C22201OooO0oO.OooO0O0(c20358OooO00o, "WPSFileConvertDataSource", "Task ", str, " timed out"), new Object[0]);
                    return null;
                }
                InterfaceC27198OooO0oO interfaceC27198OooO0oO = c26938OooOOoo.f93570OooO00o;
                c26937OooOOo0.f93564OooOo0o = c26938OooOOoo;
                c26937OooOOo0.f93563OooOo = str;
                c26937OooOOo0.f93566OooOoO0 = i;
                c26937OooOOo0.f93565OooOoO = i2;
                c26937OooOOo0.f93568OooOoo = 1;
                Object objOooO00o = interfaceC27198OooO0oO.OooO00o(str, c26937OooOOo0);
                if (objOooO00o != enumC32485OooO00o) {
                    c26938OooOOoo2 = c26938OooOOoo;
                    i4 = i2;
                    str2 = str;
                    i3 = i;
                    obj = objOooO00o;
                    C27197OooO0o0 c27197OooO0o0 = (C27197OooO0o0) obj;
                    upperCase = c27197OooO0o0.getCom.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String().getStatus().toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
                    if (upperCase.equals("PROCESSING")) {
                        if (upperCase.equals(MaterialPurchaseStatusResponse.STATUS_SUCCESS)) {
                            C27196OooO0o c27196OooO0oOooO0O0 = c27197OooO0o0.getCom.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String().getResult();
                            if (c27196OooO0oOooO0O0 == null || (listOooO00o = c27196OooO0oOooO0O0.OooO00o()) == null || (c27194OooO0OO = (C27194OooO0OO) OooOo.Oooo(listOooO00o)) == null) {
                                return null;
                            }
                            return c27194OooO0OO.getUrl();
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("WPSFileConvertDataSource");
                        String strOooO0OO = c27197OooO0o0.getCom.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String().getStatus();
                        String strOooO00o = c27197OooO0o0.getCom.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String().getMessage();
                        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Task ", str2, " status=", strOooO0OO, ", message=");
                        sbOooO0O0.append(strOooO00o);
                        c20358OooO00o2.OooOO0O(sbOooO0O0.toString(), new Object[0]);
                        return null;
                    }
                    c26937OooOOo0.f93564OooOo0o = c26938OooOOoo2;
                    c26937OooOOo0.f93563OooOo = str2;
                    c26937OooOOo0.f93566OooOoO0 = i3;
                    c26937OooOOo0.f93565OooOoO = i4;
                    c26937OooOOo0.f93568OooOoo = 2;
                }
                return enumC32485OooO00o;
            }
            i4 = c26937OooOOo0.f93565OooOoO;
            i3 = c26937OooOOo0.f93566OooOoO0;
            str2 = c26937OooOOo0.f93563OooOo;
            c26938OooOOoo2 = c26937OooOOo0.f93564OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C27197OooO0o0 c27197OooO0o02 = (C27197OooO0o0) obj;
            upperCase = c27197OooO0o02.getCom.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String().getStatus().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
            if (upperCase.equals("PROCESSING")) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(C26938OooOOoo c26938OooOOoo, Uri uri, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26936OooOOo c26936OooOOo;
        String str2;
        c26938OooOOoo.getClass();
        if (abstractC32479OooO0OO instanceof C26936OooOOo) {
            c26936OooOOo = (C26936OooOOo) abstractC32479OooO0OO;
            int i = c26936OooOOo.f93562OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26936OooOOo.f93562OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26936OooOOo = new C26936OooOOo(c26938OooOOoo, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26936OooOOo.f93561OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26936OooOOo.f93562OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                str2 = UUID.randomUUID() + C18115b5.CONNECTOR + str;
                Object value = c26938OooOOoo.f93572OooO0OO.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
                c26936OooOOo.f93559OooOo0o = c26938OooOOoo;
                c26936OooOOo.f93558OooOo = str2;
                c26936OooOOo.f93562OooOoOO = 1;
                objOooO0O0 = ((o0OO00Oo.OooO0OO) value).OooO0O0(uri, str2, c26936OooOOo);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = c26936OooOOo.f93558OooOo;
                C26938OooOOoo c26938OooOOoo2 = c26936OooOOo.f93559OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                str2 = str3;
                c26938OooOOoo = c26938OooOOoo2;
            }
            Object value2 = c26938OooOOoo.f93572OooO0OO.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0o(value2, "getValue(...)");
            return ((o0OO00Oo.OooO0OO) value2).OooO00o(str2);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("WPSFileConvertDataSource");
            c20358OooO00o.OooO0Oo(e, "OSS upload failed", new Object[0]);
            return "";
        }
    }
}

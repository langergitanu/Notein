package o0O0oooO;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.App;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.function.Consumer;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26340o000Oo;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27360OoooO0O;
import o0OOo0o.C27428o000oOoO;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O00.C28051OooO00o;
import o0oooo.C31862OooO00o;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33591OooOOO;
import oO0o0O0o.C33596OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOoo0.InterfaceC34598OooO0oO;
import ooOOOOoo.C35063OooO0OO;
import ooOOOOoo.C35074OooOOo0;
import ooOOOOoo.C35077OooOo0O;
import ooOOOOoo.OooOO0;

/* JADX INFO: renamed from: o0O0oooO.o000Oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26342o000Oo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C26342o000Oo0O f90392OooO00o = new C26342o000Oo0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Uri.Builder f90393OooO0O0 = new Uri.Builder().scheme("relay").authority("xiaomi").path("/main");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f90394OooO0OO;

    /* JADX INFO: renamed from: o0O0oooO.o000Oo0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.XiaomiScreenRelay", m80623f = "XiaomiScreenRelay.kt", m80624l = {208, 210, 240}, m80625m = "handleXiaomiUri")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Object f90395OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C26342o000Oo0O f90396OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Comparable f90397OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Object f90398OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public Object f90399OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public /* synthetic */ Object f90401OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f90402OooOooO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f90401OooOoo0 = obj;
            this.f90402OooOooO |= Integer.MIN_VALUE;
            return C26342o000Oo0O.this.OooO0O0(null, null, this);
        }
    }

    public static Uri OooO(Intent intent) {
        Uri data = intent != null ? intent.getData() : null;
        if (data != null && kotlin.jvm.internal.OooOOO0.OooO0O0(data.getScheme(), "relay") && kotlin.jvm.internal.OooOOO0.OooO0O0(data.getHost(), "xiaomi")) {
            return data;
        }
        return null;
    }

    public static String OooO00o() {
        String PRODUCT = Build.PRODUCT;
        kotlin.jvm.internal.OooOOO0.OooO0o(PRODUCT, "PRODUCT");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.OooOOO0.OooO0o(MODEL, "MODEL");
        return PRODUCT + C18241k5.f55433h + MODEL;
    }

    public static void OooO0o(String message) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("xiaomi_relay");
        c20358OooO00o.OooO00o(OooO0O0.OooO00o.OooO0O0(OooO00o(), ". ", message, "."), new Object[0]);
    }

    public static void OooO0oO(String message) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("xiaomi_relay");
        c20358OooO00o.OooO0OO(OooO0O0.OooO00o.OooO0O0(OooO00o(), ". ", message, "."), new Object[0]);
    }

    public static void OooO0oo(String message) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("xiaomi_relay");
        c20358OooO00o.OooO0o0(OooO0O0.OooO00o.OooO0O0(OooO00o(), ". ", message, "."), new Object[0]);
    }

    public static void OooOO0(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        if (f90394OooO0OO) {
            Uri.Builder deeplinkBuilder = f90393OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0o(deeplinkBuilder, "deeplinkBuilder");
            interfaceC32507OooOO0o.invoke(deeplinkBuilder);
            OooO0oo("updateDeeplink, uri:" + deeplinkBuilder.build());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101 A[Catch: Exception -> 0x0065, TryCatch #2 {Exception -> 0x0065, blocks: (B:21:0x0060, B:49:0x00f9, B:51:0x0101, B:52:0x010b, B:55:0x0122, B:57:0x012a, B:59:0x0130, B:61:0x0138, B:62:0x013c, B:64:0x0179, B:68:0x0183, B:73:0x018f), top: B:94:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b A[Catch: Exception -> 0x0065, TryCatch #2 {Exception -> 0x0065, blocks: (B:21:0x0060, B:49:0x00f9, B:51:0x0101, B:52:0x010b, B:55:0x0122, B:57:0x012a, B:59:0x0130, B:61:0x0138, B:62:0x013c, B:64:0x0179, B:68:0x0183, B:73:0x018f), top: B:94:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ec A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #1 {Exception -> 0x0047, blocks: (B:14:0x0042, B:77:0x01bc, B:79:0x01d2, B:82:0x01dd, B:83:0x01ec), top: B:93:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(Activity activity, InterfaceC34598OooO0oO<C32460OooOooO> interfaceC34598OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        C26342o000Oo0O c26342o000Oo0O;
        InterfaceC34598OooO0oO<C32460OooOooO> interfaceC34598OooO0oO2;
        Uri uri;
        C26342o000Oo0O c26342o000Oo0O2;
        Activity activity2;
        C26342o000Oo0O c26342o000Oo0O3;
        Uri uri2;
        InterfaceC34598OooO0oO<C32460OooOooO> interfaceC34598OooO0oO3;
        Activity activity3;
        C26342o000Oo0O c26342o000Oo0O4;
        InterfaceC34598OooO0oO<C32460OooOooO> interfaceC34598OooO0oO4;
        String str;
        String str2;
        Integer num;
        NoteMeta noteMeta;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f90402OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f90402OooOooO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooO0Oo = oooO00o.f90401OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f90402OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            if (!f90394OooO0OO) {
                return C32460OooOooO.f116667OooO00o;
            }
            Intent intent = activity.getIntent();
            OooO0oo("handleXiaomiUri, intent: " + (intent != null ? intent.getData() : null));
            try {
                Uri uriOooO = OooO(activity.getIntent());
                if (uriOooO != null) {
                    oooO00o.f90396OooOo0o = this;
                    oooO00o.f90395OooOo = activity;
                    oooO00o.f90398OooOoO0 = interfaceC34598OooO0oO;
                    oooO00o.f90397OooOoO = uriOooO;
                    oooO00o.f90399OooOoOO = this;
                    oooO00o.f90402OooOooO = 1;
                    Object objOooO0Oo2 = OooO0Oo(activity, oooO00o);
                    if (objOooO0Oo2 != enumC32485OooO00o) {
                        interfaceC34598OooO0oO2 = interfaceC34598OooO0oO;
                        uri = uriOooO;
                        objOooO0Oo = objOooO0Oo2;
                        c26342o000Oo0O2 = this;
                        activity2 = activity;
                        c26342o000Oo0O3 = c26342o000Oo0O2;
                        c26342o000Oo0O3.getClass();
                        OooO0oo("isLogged: " + objOooO0Oo);
                        oooO00o.f90396OooOo0o = c26342o000Oo0O2;
                        oooO00o.f90395OooOo = activity2;
                        oooO00o.f90398OooOoO0 = interfaceC34598OooO0oO2;
                        oooO00o.f90397OooOoO = uri;
                        oooO00o.f90399OooOoOO = null;
                        oooO00o.f90402OooOooO = 2;
                        objOooO0Oo = c26342o000Oo0O2.OooO0Oo(activity2, oooO00o);
                        if (objOooO0Oo != enumC32485OooO00o) {
                        }
                    }
                    return enumC32485OooO00o;
                }
            } catch (Exception e) {
                e = e;
                c26342o000Oo0O = this;
                e.printStackTrace();
                String strConcat = "handleXiaomiUri, err: ".concat(C32435OooO0Oo.OooO0O0(e));
                c26342o000Oo0O.getClass();
                OooO0oO(strConcat);
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                uri2 = (Uri) oooO00o.f90397OooOoO;
                interfaceC34598OooO0oO3 = (InterfaceC34598OooO0oO) oooO00o.f90398OooOoO0;
                activity3 = (Activity) oooO00o.f90395OooOo;
                c26342o000Oo0O4 = oooO00o.f90396OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    if (((Boolean) objOooO0Oo).booleanValue()) {
                        c26342o000Oo0O4.getClass();
                        OooO0oO("User is NOT login");
                    } else {
                        String queryParameter = uri2.getQueryParameter(TmemberRight.TAG_USERID);
                        String queryParameter2 = uri2.getQueryParameter(NoteMeta.PROPERTY_NOTE_ID);
                        String queryParameter3 = uri2.getQueryParameter(NoteMeta.PROPERTY_PARENT_ID);
                        if (queryParameter3 == null) {
                            queryParameter3 = "";
                        }
                        String queryParameter4 = uri2.getQueryParameter("pageCount");
                        Integer numOooOOO0 = queryParameter4 != null ? C33596OooOOo0.OooOOO0(queryParameter4) : null;
                        String queryParameter5 = uri2.getQueryParameter("pageIndex");
                        Integer numOooOOO02 = queryParameter5 != null ? C33596OooOOo0.OooOOO0(queryParameter5) : null;
                        String strOooO0oo = C33591OooOOO.OooO0oo("\n                        Params from xiaomi screen relay uri\n                        userId: " + queryParameter + ",\n                        noteId: " + queryParameter2 + ",\n                        parentId: " + queryParameter3 + ",\n                        pageCount: " + numOooOOO0 + ",\n                        pageIndex: " + numOooOOO02 + ",\n                    ");
                        c26342o000Oo0O4.getClass();
                        OooO0oo(strOooO0oo);
                        if (queryParameter != null && !C33599OooOo0O.Oooo0o0(queryParameter) && queryParameter2 != null && !C33599OooOo0O.Oooo0o0(queryParameter2) && numOooOOO0 != null && numOooOOO02 != null) {
                            Context applicationContext = activity3.getApplicationContext();
                            kotlin.jvm.internal.OooOOO0.OooO0o(applicationContext, "getApplicationContext(...)");
                            InterfaceC27313OooOoo0 interfaceC27313OooOoo0OooO0O0 = ((InterfaceC26339o000OOoO) com.facebook.soloader.OooOo.OooO0o0(applicationContext, InterfaceC26339o000OOoO.class)).OooO0O0();
                            oooO00o.f90396OooOo0o = c26342o000Oo0O4;
                            oooO00o.f90395OooOo = interfaceC34598OooO0oO3;
                            oooO00o.f90398OooOoO0 = queryParameter2;
                            oooO00o.f90397OooOoO = queryParameter3;
                            oooO00o.f90399OooOoOO = numOooOOO02;
                            oooO00o.f90402OooOooO = 3;
                            objOooO0Oo = interfaceC27313OooOoo0OooO0O0.OooO0oo(queryParameter2, queryParameter, oooO00o);
                            if (objOooO0Oo != enumC32485OooO00o) {
                                interfaceC34598OooO0oO4 = interfaceC34598OooO0oO3;
                                c26342o000Oo0O = c26342o000Oo0O4;
                                str = queryParameter2;
                                str2 = queryParameter3;
                                num = numOooOOO02;
                                noteMeta = (NoteMeta) objOooO0Oo;
                                c26342o000Oo0O.getClass();
                                OooO0oo("find meta: " + noteMeta);
                                if (noteMeta != null) {
                                    OooO0oo("NoteMeta is null or pageCount not satisfy condition, do nothing, stay mainActivity");
                                }
                            }
                            return enumC32485OooO00o;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    c26342o000Oo0O = c26342o000Oo0O4;
                    e.printStackTrace();
                    String strConcat2 = "handleXiaomiUri, err: ".concat(C32435OooO0Oo.OooO0O0(e));
                    c26342o000Oo0O.getClass();
                    OooO0oO(strConcat2);
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) oooO00o.f90399OooOoOO;
                str2 = (String) oooO00o.f90397OooOoO;
                str = (String) oooO00o.f90398OooOoO0;
                interfaceC34598OooO0oO4 = (InterfaceC34598OooO0oO) oooO00o.f90395OooOo;
                c26342o000Oo0O = oooO00o.f90396OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    noteMeta = (NoteMeta) objOooO0Oo;
                    c26342o000Oo0O.getClass();
                    OooO0oo("find meta: " + noteMeta);
                    if (noteMeta != null || noteMeta.getTotalPagesCount() < num.intValue()) {
                        OooO0oo("NoteMeta is null or pageCount not satisfy condition, do nothing, stay mainActivity");
                    } else {
                        OooO0oo("Nav2 noteContainerFragment directly");
                        ((InterfaceC32510OooOOo0) interfaceC34598OooO0oO4).invoke(str, str2, num.toString());
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    String strConcat22 = "handleXiaomiUri, err: ".concat(C32435OooO0Oo.OooO0O0(e));
                    c26342o000Oo0O.getClass();
                    OooO0oO(strConcat22);
                }
            }
            e.printStackTrace();
            String strConcat222 = "handleXiaomiUri, err: ".concat(C32435OooO0Oo.OooO0O0(e));
            c26342o000Oo0O.getClass();
            OooO0oO(strConcat222);
        } else {
            c26342o000Oo0O3 = (C26342o000Oo0O) oooO00o.f90399OooOoOO;
            uri = (Uri) oooO00o.f90397OooOoO;
            interfaceC34598OooO0oO2 = (InterfaceC34598OooO0oO) oooO00o.f90398OooOoO0;
            activity2 = (Activity) oooO00o.f90395OooOo;
            c26342o000Oo0O2 = oooO00o.f90396OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                c26342o000Oo0O3.getClass();
                OooO0oo("isLogged: " + objOooO0Oo);
                oooO00o.f90396OooOo0o = c26342o000Oo0O2;
                oooO00o.f90395OooOo = activity2;
                oooO00o.f90398OooOoO0 = interfaceC34598OooO0oO2;
                oooO00o.f90397OooOoO = uri;
                oooO00o.f90399OooOoOO = null;
                oooO00o.f90402OooOooO = 2;
                objOooO0Oo = c26342o000Oo0O2.OooO0Oo(activity2, oooO00o);
                if (objOooO0Oo != enumC32485OooO00o) {
                    uri2 = uri;
                    interfaceC34598OooO0oO3 = interfaceC34598OooO0oO2;
                    activity3 = activity2;
                    c26342o000Oo0O4 = c26342o000Oo0O2;
                    if (((Boolean) objOooO0Oo).booleanValue()) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Exception e4) {
                e = e4;
                c26342o000Oo0O = c26342o000Oo0O2;
                e.printStackTrace();
                String strConcat2222 = "handleXiaomiUri, err: ".concat(C32435OooO0Oo.OooO0O0(e));
                c26342o000Oo0O.getClass();
                OooO0oO(strConcat2222);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(Activity activity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26343o000Oo0o c26343o000Oo0o;
        C26342o000Oo0O c26342o000Oo0O;
        if (abstractC32479OooO0OO instanceof C26343o000Oo0o) {
            c26343o000Oo0o = (C26343o000Oo0o) abstractC32479OooO0OO;
            int i = c26343o000Oo0o.f90407OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26343o000Oo0o.f90407OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26343o000Oo0o = new C26343o000Oo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c26343o000Oo0o.f90406OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26343o000Oo0o.f90407OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            OooO0oo("initXiaomiScreenRelay, intent.data: " + activity.getIntent().getData());
            c26343o000Oo0o.f90404OooOo0o = this;
            c26343o000Oo0o.f90403OooOo = activity;
            c26343o000Oo0o.f90407OooOoOO = 1;
            objOooO0o0 = OooO0o0(activity, c26343o000Oo0o);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26342o000Oo0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = c26343o000Oo0o.f90403OooOo;
            c26342o000Oo0O = c26343o000Oo0o.f90404OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        if (((Boolean) objOooO0o0).booleanValue() && Build.VERSION.SDK_INT >= 29) {
            Intent intent = activity.getIntent();
            c26342o000Oo0O.getClass();
            boolean z = OooO(intent) != null;
            String strOooO0O0 = com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("isLaunchedFromScreenRelay: ", z);
            C26342o000Oo0O c26342o000Oo0O2 = f90392OooO00o;
            c26342o000Oo0O2.getClass();
            OooO0oo(strOooO0O0);
            if (!z) {
                try {
                    OooO0oo("getIntent: " + activity.getIntent());
                    C35077OooOo0O.OooO0o0("Handoff", "from:%s", activity.getClass().getName());
                    C26341o000Oo00 c26341o000Oo00 = new C26341o000Oo00();
                    C35077OooOo0O.OooO0o0("session", "setDeepLink without callback", null);
                    C31862OooO00o c31862OooO00o = new C31862OooO00o(activity, c26341o000Oo00);
                    final C26340o000Oo c26340o000Oo = new C26340o000Oo();
                    C35077OooOo0O.OooO0o0("session", "publish", null);
                    final C35063OooO0OO c35063OooO0OO = c31862OooO00o.f113563OooO0OO;
                    c35063OooO0OO.f125954OooO0OO.OooO00o().post(new Runnable() { // from class: ooOOOOoo.OooO00o
                        @Override // java.lang.Runnable
                        public final void run() {
                            C35063OooO0OO c35063OooO0OO2 = c35063OooO0OO;
                            final OooOO0 oooOO02 = c35063OooO0OO2.f125952OooO00o;
                            C26340o000Oo c26340o000Oo2 = c26340o000Oo;
                            if (oooOO02 != null) {
                                C35077OooOo0O.OooO0o0("HH", "publish", null);
                                C26340o000Oo c26340o000Oo3 = oooOO02.f125978OooOOO0;
                                oooOO02.f125978OooOOO0 = c26340o000Oo2;
                                oooOO02.f125968OooO0OO = new OooOO0.OooO00o(c26340o000Oo2);
                                if (c26340o000Oo3 == null) {
                                    C31862OooO00o c31862OooO00o2 = oooOO02.f125970OooO0o;
                                    c31862OooO00o2.f113561OooO00o.registerActivityLifecycleCallbacks(oooOO02.f125969OooO0Oo);
                                    View viewFindViewById = c31862OooO00o2.f113561OooO00o.findViewById(R.id.content);
                                    oooOO02.f125977OooOOO = viewFindViewById;
                                    if (viewFindViewById != null) {
                                        viewFindViewById.addOnLayoutChangeListener(oooOO02.f125971OooO0o0);
                                    }
                                }
                                oooOO02.OooO00o(new Consumer() { // from class: ooOOOOoo.OooO0o0
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj) {
                                        oooOO02.OooO0OO((InterfaceC35073OooOOo) obj, true);
                                    }
                                }, null);
                            }
                            C35079OooOoO c35079OooOoO = c35063OooO0OO2.f125953OooO0O0;
                            if (c35079OooOoO != null) {
                                c35079OooOoO.f126003OooO0O0.OooO00o().obtainMessage(1, c26340o000Oo2).sendToTarget();
                            }
                        }
                    });
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    String str = "Published new screen request, session hash: " + c31862OooO00o.hashCode();
                    c26342o000Oo0O2.getClass();
                    OooO0oo(str);
                    return c31862OooO00o;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(Context context, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26345o000OoOO c26345o000OoOO;
        if (abstractC32479OooO0OO instanceof C26345o000OoOO) {
            c26345o000OoOO = (C26345o000OoOO) abstractC32479OooO0OO;
            int i = c26345o000OoOO.f90414OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26345o000OoOO.f90414OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26345o000OoOO = new C26345o000OoOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26345o000OoOO.f90413OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26345o000OoOO.f90414OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOOo);
                InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(context).getData();
                c26345o000OoOO.f90414OooOoO0 = 1;
                objOooOOo = C25252OooO0Oo.OooOOo(data, c26345o000OoOO);
                if (objOooOOo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOOo);
            }
            CharSequence charSequence = (CharSequence) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(App.f69544OooOooO);
            if (charSequence != null) {
                z = charSequence.length() == 0;
                z = !z;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (oO0o0O0o.C33599OooOo0O.OooOoOO(r10, "Redmi", true) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(Context context, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26346o000OoOo c26346o000OoOo;
        C26342o000Oo0O c26342o000Oo0O;
        C26342o000Oo0O c26342o000Oo0O2;
        if (abstractC32479OooO0OO instanceof C26346o000OoOo) {
            c26346o000OoOo = (C26346o000OoOo) abstractC32479OooO0OO;
            int i = c26346o000OoOo.f90419OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26346o000OoOo.f90419OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26346o000OoOo = new C26346o000OoOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26346o000OoOo.f90418OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26346o000OoOo.f90419OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(applicationContext, "getApplicationContext(...)");
            C27428o000oOoO c27428o000oOoOOooO0OO = ((InterfaceC26339o000OOoO) com.facebook.soloader.OooOo.OooO0o0(applicationContext, InterfaceC26339o000OOoO.class)).OooO0OO();
            c26346o000OoOo.f90416OooOo0o = this;
            c26346o000OoOo.f90415OooOo = context;
            c26346o000OoOo.f90419OooOoOO = 1;
            c27428o000oOoOOooO0OO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27360OoooO0O(c27428o000oOoOOooO0OO, null), c26346o000OoOo);
            if (objOooO0o != enumC32485OooO00o) {
                c26342o000Oo0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = c26346o000OoOo.f90415OooOo;
            c26342o000Oo0O2 = c26346o000OoOo.f90416OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (((Boolean) objOooO0o).booleanValue() || Build.VERSION.SDK_INT < 29) {
                c26342o000Oo0O = c26342o000Oo0O2;
                c26342o000Oo0O2 = c26342o000Oo0O;
                c26342o000Oo0O2.getClass();
                OooO0oo("isSupportScreenRelay: " + z);
                f90394OooO0OO = z;
                return Boolean.valueOf(z);
            }
            z = C35074OooOOo0.OooO0o(context) || C35074OooOOo0.OooO0o0(context);
            C35077OooOo0O.OooO0o0("Handoff", "isSupport=%s", Boolean.valueOf(z));
            c26342o000Oo0O2.getClass();
            OooO0oo("isSupportScreenRelay: " + z);
            f90394OooO0OO = z;
            return Boolean.valueOf(z);
        }
        context = c26346o000OoOo.f90415OooOo;
        c26342o000Oo0O = c26346o000OoOo.f90416OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        boolean zBooleanValue = ((Boolean) objOooO0o).booleanValue();
        c26342o000Oo0O.getClass();
        OooO0oo("isSupportScreenRelay,isSwitchEnable: " + zBooleanValue + ".");
        if (zBooleanValue) {
            if (!C28039OooO00o.OooO0Oo()) {
                String BRAND = Build.BRAND;
                kotlin.jvm.internal.OooOOO0.OooO0o(BRAND, "BRAND");
            }
            c26346o000OoOo.f90416OooOo0o = c26342o000Oo0O;
            c26346o000OoOo.f90415OooOo = context;
            c26346o000OoOo.f90419OooOoOO = 2;
            objOooO0o = c26342o000Oo0O.OooO0Oo(context, c26346o000OoOo);
            if (objOooO0o != enumC32485OooO00o) {
                c26342o000Oo0O2 = c26342o000Oo0O;
                if (((Boolean) objOooO0o).booleanValue()) {
                }
                c26342o000Oo0O = c26342o000Oo0O2;
            }
            return enumC32485OooO00o;
        }
        c26342o000Oo0O2 = c26342o000Oo0O;
        c26342o000Oo0O2.getClass();
        OooO0oo("isSupportScreenRelay: " + z);
        f90394OooO0OO = z;
        return Boolean.valueOf(z);
    }
}

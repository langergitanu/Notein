package o0OO0o00;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.cloud.base.auth.DriveCredential;
import com.huawei.cloud.services.drive.Drive;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f93149OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Drive f93151OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public DriveCredential f93152OooO0Oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33898OooO0Oo f93150OooO0O0 = C33900OooO0o0.OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f93153OooO0o0 = new OooO0O0();

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C33898OooO0Oo f93159OooO00o = C33900OooO0o0.OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f93160OooO0O0;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
            o0OO0o00.OooO0O0 oooO0O0;
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            OooO0O0 oooO0O02;
            InterfaceC33895OooO00o interfaceC33895OooO00o2;
            Throwable th;
            OooO0O0 oooO0O03;
            if (abstractC32479OooO0OO instanceof o0OO0o00.OooO0O0) {
                oooO0O0 = (o0OO0o00.OooO0O0) abstractC32479OooO0OO;
                int i = oooO0O0.f93165OooOoOO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO0O0.f93165OooOoOO = i - Integer.MIN_VALUE;
                } else {
                    oooO0O0 = new o0OO0o00.OooO0O0(this, abstractC32479OooO0OO);
                }
            }
            Object obj = oooO0O0.f93164OooOoO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = oooO0O0.f93165OooOoOO;
            try {
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    oooO0O0.f93162OooOo0o = this;
                    interfaceC33895OooO00o = this.f93159OooO00o;
                    oooO0O0.f93161OooOo = interfaceC33895OooO00o;
                    oooO0O0.f93165OooOoOO = 1;
                    if (interfaceC33895OooO00o.OooO00o(oooO0O0) != enumC32485OooO00o) {
                        oooO0O02 = this;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = oooO0O0.f93161OooOo;
                    oooO0O03 = oooO0O0.f93162OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        oooO0O02 = oooO0O03;
                        oooO0O02.f93160OooO0O0 = Math.max(SystemClock.elapsedRealtime(), oooO0O02.f93160OooO0O0 + 1000);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                InterfaceC33895OooO00o interfaceC33895OooO00o3 = oooO0O0.f93161OooOo;
                oooO0O02 = oooO0O0.f93162OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = interfaceC33895OooO00o3;
                oooO0O02.getClass();
                long jElapsedRealtime = (oooO0O02.f93160OooO0O0 + 1000) - SystemClock.elapsedRealtime();
                if (jElapsedRealtime <= 0) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    oooO0O02.f93160OooO0O0 = Math.max(SystemClock.elapsedRealtime(), oooO0O02.f93160OooO0O0 + 1000);
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                }
                oooO0O0.f93162OooOo0o = oooO0O02;
                oooO0O0.f93161OooOo = interfaceC33895OooO00o;
                oooO0O0.f93165OooOoOO = 2;
                if (C33644OoooO0.OooO00o(jElapsedRealtime, oooO0O0) != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    oooO0O03 = oooO0O02;
                    oooO0O02 = oooO0O03;
                    oooO0O02.f93160OooO0O0 = Math.max(SystemClock.elapsedRealtime(), oooO0O02.f93160OooO0O0 + 1000);
                    C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                th = th3;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }
    }

    public OooO00o(Context context) {
        this.f93149OooO00o = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(OooO00o oooO00o, Continuation continuation) throws Throwable {
        C26880OooOo0O c26880OooOo0O;
        C33898OooO0Oo c33898OooO0Oo;
        oooO00o.getClass();
        if (continuation instanceof C26880OooOo0O) {
            c26880OooOo0O = (C26880OooOo0O) continuation;
            int i = c26880OooOo0O.f93237OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26880OooOo0O.f93237OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26880OooOo0O = new C26880OooOo0O(oooO00o, continuation);
            }
        }
        Object obj = c26880OooOo0O.f93236OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26880OooOo0O.f93237OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26880OooOo0O.f93234OooOo0o = oooO00o;
            c33898OooO0Oo = oooO00o.f93150OooO0O0;
            c26880OooOo0O.f93233OooOo = c33898OooO0Oo;
            c26880OooOo0O.f93237OooOoOO = 1;
            if (c33898OooO0Oo.OooO00o(c26880OooOo0O) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C33898OooO0Oo c33898OooO0Oo2 = c26880OooOo0O.f93233OooOo;
            OooO00o oooO00o2 = c26880OooOo0O.f93234OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            oooO00o = oooO00o2;
        }
        try {
            Drive drive = oooO00o.f93151OooO0OO;
            if (drive != null) {
                return drive;
            }
            throw new IllegalStateException("Huawei Drive not initialized");
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, String str2, String str3, LinkedHashMap linkedHashMap, String str4, Long l, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26870OooO0Oo c26870OooO0Oo;
        if (abstractC32479OooO0OO instanceof C26870OooO0Oo) {
            c26870OooO0Oo = (C26870OooO0Oo) abstractC32479OooO0OO;
            int i = c26870OooO0Oo.f93170OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26870OooO0Oo.f93170OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26870OooO0Oo = new C26870OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26870OooO0Oo.f93169OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26870OooO0Oo.f93170OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO0o oooO0o = new OooO0o(this, str, str2, str4, linkedHashMap, str3, l, null);
            c26870OooO0Oo.f93170OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO0o, c26870OooO0Oo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, C26887OooOooO c26887OooOooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0O oooOO0O;
        C33898OooO0Oo c33898OooO0Oo;
        OooO00o oooO00o;
        DriveCredential.AccessMethod accessMethod;
        if (abstractC32479OooO0OO instanceof OooOO0O) {
            oooOO0O = (OooOO0O) abstractC32479OooO0OO;
            int i = oooOO0O.f93204OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f93204OooOooO = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOO0O.f93203OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO0O.f93204OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooOO0O.f93198OooOo0o = this;
            oooOO0O.f93197OooOo = str;
            oooOO0O.f93200OooOoO0 = str2;
            oooOO0O.f93199OooOoO = c26887OooOooO;
            c33898OooO0Oo = this.f93150OooO0O0;
            oooOO0O.f93201OooOoOO = c33898OooO0Oo;
            oooOO0O.f93204OooOooO = 1;
            if (c33898OooO0Oo.OooO00o(oooOO0O) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO00o = this;
            accessMethod = c26887OooOooO;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C33898OooO0Oo c33898OooO0Oo2 = oooOO0O.f93201OooOoOO;
            DriveCredential.AccessMethod accessMethod2 = oooOO0O.f93199OooOoO;
            str2 = oooOO0O.f93200OooOoO0;
            String str3 = oooOO0O.f93197OooOo;
            oooO00o = oooOO0O.f93198OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            str = str3;
            accessMethod = accessMethod2;
        }
        try {
            if (oooO00o.f93151OooO0OO != null && oooO00o.f93152OooO0Oo != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            DriveCredential accessToken = new DriveCredential.Builder(str, accessMethod).build().setAccessToken(str2);
            oooO00o.f93152OooO0Oo = accessToken;
            oooO00o.f93151OooO0OO = new Drive.Builder(accessToken, oooO00o.f93149OooO00o).build();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HuaweiCloudSyncDS");
            c20358OooO00o.OooO0o0("Huawei Drive initialized", new Object[0]);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOOO0 oooOOO0;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f93213OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f93213OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOOO0.f93212OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f93213OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooOOO oooOOO = new OooOOO(str, null, this);
            oooOOO0.f93213OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooOOO, oooOOO0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26881OooOo0o c26881OooOo0o;
        OooO00o oooO00o;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C26881OooOo0o) {
            c26881OooOo0o = (C26881OooOo0o) abstractC32479OooO0OO;
            int i = c26881OooOo0o.f93242OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26881OooOo0o.f93242OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26881OooOo0o = new C26881OooOo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26881OooOo0o.f93241OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26881OooOo0o.f93242OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c26881OooOo0o.f93239OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f93150OooO0O0;
            c26881OooOo0o.f93238OooOo = c33898OooO0Oo2;
            c26881OooOo0o.f93242OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c26881OooOo0o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO00o = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c26881OooOo0o.f93238OooOo;
            oooO00o = c26881OooOo0o.f93239OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            oooO00o.f93151OooO0OO = null;
            oooO00o.f93152OooO0Oo = null;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26875OooOOOo c26875OooOOOo;
        if (abstractC32479OooO0OO instanceof C26875OooOOOo) {
            c26875OooOOOo = (C26875OooOOOo) abstractC32479OooO0OO;
            int i = c26875OooOOOo.f93218OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26875OooOOOo.f93218OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26875OooOOOo = new C26875OooOOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26875OooOOOo.f93217OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26875OooOOOo.f93218OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26877OooOOo0 c26877OooOOo0 = new C26877OooOOo0(str, null, this);
            c26875OooOOOo.f93218OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26877OooOOo0, c26875OooOOOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, String str2, String str3, String str4, LinkedHashMap linkedHashMap, String str5, Long l, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOo oooOo;
        if (abstractC32479OooO0OO instanceof OooOo) {
            oooOo = (OooOo) abstractC32479OooO0OO;
            int i = oooOo.f93228OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f93228OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOo.f93227OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo.f93228OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26882OooOoO c26882OooOoO = new C26882OooOoO(this, str3, str2, str5, linkedHashMap, str4, l, str, null);
            oooOo.f93228OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26882OooOoO, oooOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    /* JADX INFO: renamed from: o0OO0o00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19821OooO00o extends OutputStream {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final long f93154OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final FileOutputStream f93155OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public long f93156OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final InterfaceC32507OooOO0o<Integer, C32460OooOooO> f93157OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f93158OooOoOO;

        public C19821OooO00o(FileOutputStream fileOutputStream, long j, InterfaceC32507OooOO0o onProgress) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(onProgress, "onProgress");
            this.f93155OooOo0o = fileOutputStream;
            this.f93154OooOo = j;
            this.f93157OooOoO0 = onProgress;
            this.f93158OooOoOO = -1;
        }

        public final void OooO00o() {
            int iOooO0o = oO0O00oo.OooOO0.OooO0o((int) ((this.f93156OooOoO * ((long) 100)) / this.f93154OooOo), 0, 100);
            if (iOooO0o != this.f93158OooOoOO) {
                this.f93157OooOoO0.invoke(Integer.valueOf(iOooO0o));
                this.f93158OooOoOO = iOooO0o;
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f93155OooOo0o.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f93155OooOo0o.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.f93155OooOo0o.write(i);
            this.f93156OooOoO++;
            OooO00o();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] b) throws IOException {
            kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
            this.f93155OooOo0o.write(b);
            this.f93156OooOoO += (long) b.length;
            OooO00o();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] b, int i, int i2) throws IOException {
            kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
            this.f93155OooOo0o.write(b, i, i2);
            this.f93156OooOoO += (long) i2;
            OooO00o();
        }
    }
}

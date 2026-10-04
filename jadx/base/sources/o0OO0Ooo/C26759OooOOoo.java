package o0OO0Ooo;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OO0Ooo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26759OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Drive f92544OooO00o;

    public static final Drive OooO00o(C26759OooOOoo c26759OooOOoo) {
        Drive drive = c26759OooOOoo.f92544OooO00o;
        if (drive != null) {
            return drive;
        }
        throw new IllegalStateException("Drive has not been initialized. Call setDrive() first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(File file, java.io.File file2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26742OooO00o c26742OooO00o;
        if (abstractC32479OooO0OO instanceof C26742OooO00o) {
            c26742OooO00o = (C26742OooO00o) abstractC32479OooO0OO;
            int i = c26742OooO00o.f92502OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26742OooO00o.f92502OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26742OooO00o = new C26742OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26742OooO00o.f92501OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26742OooO00o.f92502OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26743OooO0O0 c26743OooO0O0 = new C26743OooO0O0(this, file2, file, null);
            c26742OooO00o.f92502OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26743OooO0O0, c26742OooO00o);
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
    public final Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26744OooO0OO c26744OooO0OO;
        if (abstractC32479OooO0OO instanceof C26744OooO0OO) {
            c26744OooO0OO = (C26744OooO0OO) abstractC32479OooO0OO;
            int i = c26744OooO0OO.f92508OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26744OooO0OO.f92508OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26744OooO0OO = new C26744OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26744OooO0OO.f92507OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26744OooO0OO.f92508OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26745OooO0Oo c26745OooO0Oo = new C26745OooO0Oo(this, str, null);
            c26744OooO0OO.f92508OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26745OooO0Oo, c26744OooO0OO);
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
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26741OooO c26741OooO;
        if (abstractC32479OooO0OO instanceof C26741OooO) {
            c26741OooO = (C26741OooO) abstractC32479OooO0OO;
            int i = c26741OooO.f92499OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26741OooO.f92499OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26741OooO = new C26741OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26741OooO.f92498OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26741OooO.f92499OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26750OooOO0 c26750OooOO0 = new C26750OooOO0(this, null);
            c26741OooO.f92499OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26750OooOO0, c26741OooO);
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
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26754OooOOO0 c26754OooOOO0;
        if (abstractC32479OooO0OO instanceof C26754OooOOO0) {
            c26754OooOOO0 = (C26754OooOOO0) abstractC32479OooO0OO;
            int i = c26754OooOOO0.f92532OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26754OooOOO0.f92532OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26754OooOOO0 = new C26754OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26754OooOOO0.f92531OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26754OooOOO0.f92532OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26753OooOOO c26753OooOOO = new C26753OooOOO(this, null);
            c26754OooOOO0.f92532OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26753OooOOO, c26754OooOOO0);
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
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26751OooOO0O c26751OooOO0O;
        if (abstractC32479OooO0OO instanceof C26751OooOO0O) {
            c26751OooOO0O = (C26751OooOO0O) abstractC32479OooO0OO;
            int i = c26751OooOO0O.f92526OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26751OooOO0O.f92526OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26751OooOO0O = new C26751OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26751OooOO0O.f92525OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26751OooOO0O.f92526OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26752OooOO0o c26752OooOO0o = new C26752OooOO0o(this, str, null);
            c26751OooOO0O.f92526OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26752OooOO0o, c26751OooOO0O);
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
    public final Object OooO0oO(String str, File file, java.io.File file2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26758OooOOo0 c26758OooOOo0;
        if (abstractC32479OooO0OO instanceof C26758OooOOo0) {
            c26758OooOOo0 = (C26758OooOOo0) abstractC32479OooO0OO;
            int i = c26758OooOOo0.f92543OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26758OooOOo0.f92543OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26758OooOOo0 = new C26758OooOOo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26758OooOOo0.f92542OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26758OooOOo0.f92543OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26757OooOOo c26757OooOOo = new C26757OooOOo(this, file2, str, file, null);
            c26758OooOOo0.f92543OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26757OooOOo, c26758OooOOo0);
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
}

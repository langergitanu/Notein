package o0000o0O;

import androidx.core.content.C21638OooO0Oo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0000o0O.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24282OoooO00<T> implements o0ooOOo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f81719OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O<T> f81720OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000oOoO f81721OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C24276Oooo0o f81722OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33898OooO0Oo f81723OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f81724OooO0o0;

    public C24282OoooO00(File file, o00O0O serializer, o000oOoO coordinator, C24276Oooo0o c24276Oooo0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(coordinator, "coordinator");
        this.f81719OooO00o = file;
        this.f81720OooO0O0 = serializer;
        this.f81721OooO0OO = coordinator;
        this.f81722OooO0Oo = c24276Oooo0o;
        this.f81724OooO0o0 = new AtomicBoolean(false);
        this.f81723OooO0o = C33900OooO0o0.OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:41:0x0088, B:38:0x0083), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [o0000o0O.OoooO00] */
    /* JADX WARN: Type inference failed for: r0v13, types: [o0000o0O.OoooO00] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o0000o0O.Oooo0oo] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [o0000o0O.OoooO00] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [o0000o0O.o0ooOoO] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // o0000o0O.o0ooOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(C24303o0ooOoO c24303o0ooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        ?? c24279Oooo0oo;
        Throwable th;
        C24275Oooo0OO c24275Oooo0OO;
        ?? r8;
        ?? r0;
        if (abstractC32479OooO0OO instanceof C24279Oooo0oo) {
            C24279Oooo0oo c24279Oooo0oo2 = (C24279Oooo0oo) abstractC32479OooO0OO;
            int i = c24279Oooo0oo2.f81712OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24279Oooo0oo2.f81712OooOoo0 = i - Integer.MIN_VALUE;
                c24279Oooo0oo = c24279Oooo0oo2;
            } else {
                c24279Oooo0oo = new C24279Oooo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24279Oooo0oo.f81709OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24279Oooo0oo.f81712OooOoo0;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c24303o0ooOoO = c24279Oooo0oo.f81710OooOoO0;
                c24275Oooo0OO = c24279Oooo0oo.f81707OooOo;
                c24279Oooo0oo = c24279Oooo0oo.f81708OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    r0 = c24279Oooo0oo;
                    r8 = c24303o0ooOoO;
                    try {
                        c24275Oooo0OO.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r0.f81723OooO0o.OooOOO0(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c24275Oooo0OO.close();
                    } catch (Throwable th4) {
                        C32435OooO0Oo.OooO00o(th, th4);
                    }
                    throw th;
                }
            }
            C32446OooOOOo.OooO0O0(obj);
            if (this.f81724OooO0o0.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zOooO0o0 = this.f81723OooO0o.OooO0o0();
            try {
                C24275Oooo0OO c24275Oooo0OO2 = new C24275Oooo0OO(this.f81719OooO00o, this.f81720OooO0O0);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zOooO0o0);
                    c24279Oooo0oo.f81708OooOo0o = this;
                    c24279Oooo0oo.f81707OooOo = c24275Oooo0OO2;
                    c24279Oooo0oo.f81710OooOoO0 = zOooO0o0;
                    c24279Oooo0oo.f81712OooOoo0 = 1;
                    Object objInvoke = c24303o0ooOoO.invoke(c24275Oooo0OO2, boolValueOf, c24279Oooo0oo);
                    if (objInvoke == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    obj = objInvoke;
                    r8 = zOooO0o0;
                    r0 = this;
                    c24275Oooo0OO = c24275Oooo0OO2;
                    c24275Oooo0OO.close();
                    th = null;
                    if (th == null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c24303o0ooOoO = zOooO0o0;
                    c24279Oooo0oo = this;
                    c24275Oooo0OO = c24275Oooo0OO2;
                    c24275Oooo0OO.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                c24303o0ooOoO = zOooO0o0;
                c24279Oooo0oo = this;
                if (c24303o0ooOoO != 0) {
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (c24303o0ooOoO != 0) {
                c24279Oooo0oo.f81723OooO0o.OooOOO0(null);
            }
            throw th;
        }
    }

    @Override // o0000o0O.o0ooOOo
    public final o000oOoO OooO0Oo() {
        return this.f81721OooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd A[Catch: all -> 0x011b, IOException -> 0x011d, TRY_ENTER, TryCatch #5 {all -> 0x011b, blocks: (B:44:0x00dd, B:46:0x00e3, B:47:0x00e5, B:51:0x00fa, B:52:0x011a, B:57:0x0120, B:60:0x0128, B:69:0x0137, B:71:0x013d, B:72:0x0140, B:67:0x0135, B:66:0x0132, B:33:0x0097, B:34:0x00b3), top: B:88:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128 A[Catch: all -> 0x011b, IOException -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x011b, blocks: (B:44:0x00dd, B:46:0x00e3, B:47:0x00e5, B:51:0x00fa, B:52:0x011a, B:57:0x0120, B:60:0x0128, B:69:0x0137, B:71:0x013d, B:72:0x0140, B:67:0x0135, B:66:0x0132, B:33:0x0097, B:34:0x00b3), top: B:88:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o0000o0O.o0ooOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(C24273Oooo00o c24273Oooo00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C24271Oooo c24271Oooo;
        File file;
        C24282OoooO00<T> c24282OoooO00;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        InterfaceC32508OooOOOo interfaceC32508OooOOOo;
        C24283OoooO0O c24283OoooO0O;
        Throwable th;
        C24283OoooO0O c24283OoooO0O2;
        File file2;
        C24282OoooO00<T> c24282OoooO002;
        boolean z = false;
        if (abstractC32479OooO0OO instanceof C24271Oooo) {
            c24271Oooo = (C24271Oooo) abstractC32479OooO0OO;
            int i = c24271Oooo.f81674OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24271Oooo.f81674OooOoo = i - Integer.MIN_VALUE;
            } else {
                c24271Oooo = new C24271Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24271Oooo.f81673OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24271Oooo.f81674OooOoo;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            C32446OooOOOo.OooO0O0(obj);
                            if (this.f81724OooO0o0.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file3 = this.f81719OooO00o;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException(C21638OooO0Oo.OooO00o(file3, "Unable to create parent directories of "));
                                }
                            }
                            c24271Oooo.f81670OooOo0o = this;
                            c24271Oooo.f81669OooOo = c24273Oooo00o;
                            C33898OooO0Oo c33898OooO0Oo = this.f81723OooO0o;
                            c24271Oooo.f81672OooOoO0 = c33898OooO0Oo;
                            c24271Oooo.f81674OooOoo = 1;
                            if (c33898OooO0Oo.OooO00o(c24271Oooo) != enumC32485OooO00o) {
                                c24282OoooO00 = this;
                                interfaceC33895OooO00o = c33898OooO0Oo;
                                interfaceC32508OooOOOo = c24273Oooo00o;
                            }
                            return enumC32485OooO00o;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c24283OoooO0O2 = c24271Oooo.f81671OooOoO;
                            File file4 = (File) c24271Oooo.f81672OooOoO0;
                            interfaceC33895OooO00o = (InterfaceC33895OooO00o) c24271Oooo.f81669OooOo;
                            c24282OoooO002 = c24271Oooo.f81670OooOo0o;
                            try {
                                C32446OooOOOo.OooO0O0(obj);
                                file2 = file4;
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                try {
                                    c24283OoooO0O2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    try {
                                        Files.move(file2.toPath(), c24282OoooO002.f81719OooO00o.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                        z = true;
                                    } catch (IOException unused) {
                                    }
                                    if (!z) {
                                        throw new IOException("Unable to rename " + file2 + " to " + c24282OoooO002.f81719OooO00o + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                interfaceC33895OooO00o.OooOOO0(null);
                                return C32460OooOooO.f116667OooO00o;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    c24283OoooO0O2.close();
                                } catch (Throwable th4) {
                                    C32435OooO0Oo.OooO00o(th, th4);
                                }
                                throw th;
                            }
                        }
                        InterfaceC33895OooO00o interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c24271Oooo.f81672OooOoO0;
                        InterfaceC32508OooOOOo interfaceC32508OooOOOo2 = (InterfaceC32508OooOOOo) c24271Oooo.f81669OooOo;
                        c24282OoooO00 = c24271Oooo.f81670OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        interfaceC33895OooO00o = interfaceC33895OooO00o2;
                        interfaceC32508OooOOOo = interfaceC32508OooOOOo2;
                        c24271Oooo.f81670OooOo0o = c24282OoooO00;
                        c24271Oooo.f81669OooOo = interfaceC33895OooO00o;
                        c24271Oooo.f81672OooOoO0 = file;
                        c24271Oooo.f81671OooOoO = c24283OoooO0O;
                        c24271Oooo.f81674OooOoo = 2;
                        if (interfaceC32508OooOOOo.invoke(c24283OoooO0O, c24271Oooo) != enumC32485OooO00o) {
                            file2 = file;
                            c24282OoooO002 = c24282OoooO00;
                            c24283OoooO0O2 = c24283OoooO0O;
                            C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                            c24283OoooO0O2.close();
                            th = null;
                            if (th == null) {
                            }
                        }
                        return enumC32485OooO00o;
                    } catch (Throwable th5) {
                        th = th5;
                        c24283OoooO0O2 = c24283OoooO0O;
                        c24283OoooO0O2.close();
                        throw th;
                    }
                    o00O0O<T> serializer = c24282OoooO00.f81720OooO0O0;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
                    c24283OoooO0O = new C24283OoooO0O(file, serializer);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(c24282OoooO00.f81719OooO00o.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                interfaceC33895OooO00o.OooOOO0(null);
                throw th6;
            }
        } catch (IOException e2) {
            e = e2;
            file = enumC32485OooO00o;
        }
    }

    @Override // o0000o0O.InterfaceC24248OooO0O0
    public final void close() throws NoSuchMethodException, ClassNotFoundException {
        this.f81724OooO0o0.set(true);
        this.f81722OooO0Oo.invoke();
    }
}

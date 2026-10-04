package o0000o0O;

import OooOoOO.C20519OooO0Oo;
import android.os.ParcelFileDescriptor;
import androidx.core.content.C21638OooO0Oo;
import androidx.core.location.LocationRequestCompat;
import androidx.datastore.core.NativeSharedCounter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0Oo.C33719OooO0OO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0000o0O.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24287OoooOo0 implements o000oOoO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C32447OooOOo f81733OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f81734OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f81735OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33719OooO0OO f81736OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f81737OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f81738OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f81739OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33898OooO0Oo f81740OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C32447OooOOo f81741OooO0oo;

    /* JADX INFO: renamed from: o0000o0O.OoooOo0$OooO00o */
    public static final class OooO00o {
        /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:27:0x0075). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object OooO00o(FileOutputStream fileOutputStream, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
            C24286OoooOOo c24286OoooOOo;
            long j;
            C24286OoooOOo c24286OoooOOo2;
            if (abstractC32479OooO0OO instanceof C24286OoooOOo) {
                c24286OoooOOo = (C24286OoooOOo) abstractC32479OooO0OO;
                int i = c24286OoooOOo.f81731OooOoO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c24286OoooOOo.f81731OooOoO = i - Integer.MIN_VALUE;
                } else {
                    c24286OoooOOo = new C24286OoooOOo(abstractC32479OooO0OO);
                }
            }
            Object obj = c24286OoooOOo.f81732OooOoO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c24286OoooOOo.f81731OooOoO;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c24286OoooOOo.f81729OooOo;
                fileOutputStream = c24286OoooOOo.f81730OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c24286OoooOOo2 = c24286OoooOOo;
                j *= (long) 2;
                if (j <= 60000) {
                    FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, LocationRequestCompat.PASSIVE_INTERVAL, false);
                    kotlin.jvm.internal.OooOOO0.OooO0o(fileLockLock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                    return fileLockLock;
                }
                try {
                } catch (IOException e) {
                    String message = e.getMessage();
                    if (message == null || !C33599OooOo0O.OooOoOO(message, "Resource deadlock would occur", false)) {
                        throw e;
                    }
                    c24286OoooOOo2.f81730OooOo0o = fileOutputStream;
                    c24286OoooOOo2.f81729OooOo = j;
                    c24286OoooOOo2.f81731OooOoO = 1;
                    if (C33644OoooO0.OooO00o(j, c24286OoooOOo2) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, LocationRequestCompat.PASSIVE_INTERVAL, false);
                kotlin.jvm.internal.OooOOO0.OooO0o(fileLockLock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                return fileLockLock2;
            }
            C32446OooOOOo.OooO0O0(obj);
            j = 10;
            c24286OoooOOo2 = c24286OoooOOo;
            if (j <= 60000) {
            }
        }
    }

    /* JADX INFO: renamed from: o0000o0O.OoooOo0$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0 invoke() throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            System.loadLibrary("datastore_shared_counter");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new C24290Ooooo00(C24287OoooOo0.this).invoke(), 939524096);
                try {
                    int fd = parcelFileDescriptorOpen.getFd();
                    NativeSharedCounter nativeSharedCounter = o00Oo0.f81775OooO0O0;
                    if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    o00Oo0 o00oo02 = new o00Oo0(jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return o00oo02;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }
    }

    /* JADX INFO: renamed from: o0000o0O.OoooOo0$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<File> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final File invoke() {
            C24287OoooOo0 c24287OoooOo0 = C24287OoooOo0.this;
            File file = new File(c24287OoooOo0.f81735OooO0O0.getAbsolutePath() + c24287OoooOo0.f81737OooO0Oo);
            C24287OoooOo0.OooO0o(c24287OoooOo0, file);
            return file;
        }
    }

    public C24287OoooOo0(InterfaceC34415OooO0oo context, File file) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(file, "file");
        this.f81734OooO00o = context;
        this.f81735OooO0O0 = file;
        Object obj = FileObserverC24295Oooooo.f81764OooO0O0;
        this.f81736OooO0OO = new C33719OooO0OO(new C24296Oooooo0(file, null), oOo0000O.OooO.f123416OooOo0o, -2, EnumC33692OooO0OO.f121452OooOo0o);
        this.f81737OooO0Oo = ".lock";
        this.f81739OooO0o0 = ".version";
        this.f81738OooO0o = "fcntl failed: EAGAIN";
        this.f81740OooO0oO = C33900OooO0o0.OooO00o();
        this.f81741OooO0oo = C20519OooO0Oo.OooO0OO(new OooO0OO());
        this.f81733OooO = C20519OooO0Oo.OooO0OO(new OooO0O0());
    }

    public static final void OooO0o(C24287OoooOo0 c24287OoooOo0, File file) {
        c24287OoooOo0.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(C21638OooO0Oo.OooO00o(file, "Unable to create parent directories of "));
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Type inference failed for: r2v0, types: [oO0O000o.OooOOOo] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o0000o0O.OooooO0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // o0000o0O.o000oOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        ?? c24292OooooO0;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        C33898OooO0Oo c33898OooO0Oo;
        boolean z;
        FileInputStream fileInputStream;
        C33898OooO0Oo c33898OooO0Oo2;
        boolean z2;
        ?? r2 = interfaceC32508OooOOOo;
        if (abstractC32479OooO0OO instanceof C24292OooooO0) {
            C24292OooooO0 c24292OooooO02 = (C24292OooooO0) abstractC32479OooO0OO;
            int i = c24292OooooO02.f81758OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24292OooooO02.f81758OooOoo = i - Integer.MIN_VALUE;
                c24292OooooO0 = c24292OooooO02;
            } else {
                c24292OooooO0 = new C24292OooooO0(this, abstractC32479OooO0OO);
            }
        }
        Object objInvoke = c24292OooooO0.f81757OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r5 = c24292OooooO0.f81758OooOoo;
        try {
            try {
                if (r5 != 0) {
                    if (r5 == 1) {
                        z2 = c24292OooooO0.f81755OooOoO;
                        c33898OooO0Oo2 = c24292OooooO0.f81754OooOo0o;
                        C32446OooOOOo.OooO0O0(objInvoke);
                        if (z2) {
                            c33898OooO0Oo2.OooOOO0(null);
                        }
                        return objInvoke;
                    }
                    if (r5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = c24292OooooO0.f81755OooOoO;
                    fileLock = c24292OooooO0.f81756OooOoO0;
                    fileInputStream = c24292OooooO0.f81753OooOo;
                    c33898OooO0Oo = c24292OooooO0.f81754OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        oO0O000.OooO00o.OooO00o(fileInputStream, null);
                        if (z) {
                            c33898OooO0Oo.OooOOO0(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                        }
                        throw th;
                    }
                }
                C32446OooOOOo.OooO0O0(objInvoke);
                C33898OooO0Oo c33898OooO0Oo3 = this.f81740OooO0oO;
                boolean zOooO0o0 = c33898OooO0Oo3.OooO0o0();
                try {
                    if (zOooO0o0) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.f81741OooO0oo.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, LocationRequestCompat.PASSIVE_INTERVAL, true);
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = null;
                                if (fileLock != null) {
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            String message2 = e.getMessage();
                            if ((message2 == null || !C33595OooOOo.OooOoO0(message2, this.f81738OooO0o, false)) && ((message = e.getMessage()) == null || !C33595OooOOo.OooOoO0(message, "Resource deadlock would occur", false))) {
                                throw e;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                            c24292OooooO0.f81754OooOo0o = c33898OooO0Oo3;
                            c24292OooooO0.f81753OooOo = fileInputStream2;
                            c24292OooooO0.f81756OooOoO0 = fileLockTryLock;
                            c24292OooooO0.f81755OooOoO = zOooO0o0;
                            c24292OooooO0.f81758OooOoo = 2;
                            objInvoke = r2.invoke(boolValueOf, c24292OooooO0);
                            if (objInvoke != enumC32485OooO00o) {
                                c33898OooO0Oo = c33898OooO0Oo3;
                                z = zOooO0o0;
                                fileInputStream = fileInputStream2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                }
                                oO0O000.OooO00o.OooO00o(fileInputStream, null);
                                if (z) {
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        c24292OooooO0.f81754OooOo0o = c33898OooO0Oo3;
                        c24292OooooO0.f81755OooOoO = zOooO0o0;
                        c24292OooooO0.f81758OooOoo = 1;
                        objInvoke = r2.invoke(bool, c24292OooooO0);
                        if (objInvoke != enumC32485OooO00o) {
                            c33898OooO0Oo2 = c33898OooO0Oo3;
                            z2 = zOooO0o0;
                            if (z2) {
                            }
                            return objInvoke;
                        }
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th4) {
                    th = th4;
                    c24292OooooO0 = c33898OooO0Oo3;
                    r2 = zOooO0o0;
                    if (r2 != 0) {
                        c24292OooooO0.OooOOO0(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                ?? r4 = c24292OooooO0;
                try {
                    throw th5;
                } catch (Throwable th6) {
                    try {
                        oO0O000.OooO00o.OooO00o(r5, th5);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        r2 = r2;
                        c24292OooooO0 = r4;
                        if (r2 != 0) {
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // o0000o0O.o000oOoO
    public final InterfaceC33721OooO0o<C32460OooOooO> OooO0O0() {
        return this.f81736OooO0OO;
    }

    @Override // o0000o0O.o000oOoO
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C32447OooOOo c32447OooOOo = this.f81733OooO;
        if (c32447OooOOo.isInitialized()) {
            return new Integer(o00Oo0.f81775OooO0O0.nativeGetCounterValue(((o00Oo0) c32447OooOOo.getValue()).f81776OooO00o));
        }
        return C33609OooO0oo.OooO0o(this.f81734OooO00o, new C24288OoooOoO(this, null), abstractC32479OooO0OO);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:57:0x00da, B:58:0x00dd), top: B:66:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:57:0x00da, B:58:0x00dd), top: B:66:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, oO00ooo0.OooO00o] */
    @Override // o0000o0O.o000oOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C24291Ooooo0o c24291Ooooo0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C24287OoooOo0 c24287OoooOo0;
        FileOutputStream fileOutputStream;
        Throwable th;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o2;
        Closeable closeable;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        ?? r10;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r102;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        if (abstractC32479OooO0OO instanceof C24291Ooooo0o) {
            c24291Ooooo0o = (C24291Ooooo0o) abstractC32479OooO0OO;
            int i = c24291Ooooo0o.f81752OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24291Ooooo0o.f81752OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c24291Ooooo0o = new C24291Ooooo0o(this, abstractC32479OooO0OO);
            }
        }
        ?? r103 = c24291Ooooo0o.f81749OooOoO;
        ?? r1 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24291Ooooo0o.f81752OooOoo0;
        try {
            try {
                try {
                    if (i2 == 0) {
                        C32446OooOOOo.OooO0O0(r103);
                        c24291Ooooo0o.f81748OooOo0o = this;
                        c24291Ooooo0o.f81747OooOo = interfaceC32507OooOO0o;
                        interfaceC33895OooO00o = this.f81740OooO0oO;
                        c24291Ooooo0o.f81750OooOoO0 = interfaceC33895OooO00o;
                        c24291Ooooo0o.f81752OooOoo0 = 1;
                        if (interfaceC33895OooO00o.OooO00o(c24291Ooooo0o) != r1) {
                            c24287OoooOo0 = this;
                        }
                        return r1;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) c24291Ooooo0o.f81750OooOoO0;
                            closeable2 = (Closeable) c24291Ooooo0o.f81747OooOo;
                            interfaceC33895OooO00o3 = (InterfaceC33895OooO00o) c24291Ooooo0o.f81748OooOo0o;
                            try {
                                C32446OooOOOo.OooO0O0(r103);
                                r102 = r103;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    oO0O000.OooO00o.OooO00o(closeable2, null);
                                    interfaceC33895OooO00o3.OooOOO0(null);
                                    return r102;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r103 = interfaceC33895OooO00o3;
                                    r103.OooOOO0(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) c24291Ooooo0o.f81750OooOoO0;
                        interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c24291Ooooo0o.f81747OooOo;
                        interfaceC32507OooOO0o2 = (InterfaceC32507OooOO0o) c24291Ooooo0o.f81748OooOo0o;
                        try {
                            C32446OooOOOo.OooO0O0(r103);
                            r10 = r103;
                            fileLock2 = (FileLock) r10;
                        } catch (Throwable th4) {
                            th = th4;
                            fileLock = null;
                            if (fileLock != null) {
                            }
                            throw th;
                        }
                        try {
                            c24291Ooooo0o.f81748OooOo0o = interfaceC33895OooO00o2;
                            c24291Ooooo0o.f81747OooOo = closeable;
                            c24291Ooooo0o.f81750OooOoO0 = fileLock2;
                            c24291Ooooo0o.f81752OooOoo0 = 3;
                            objInvoke = interfaceC32507OooOO0o2.invoke(c24291Ooooo0o);
                            if (objInvoke != r1) {
                                closeable2 = closeable;
                                fileLock = fileLock2;
                                r102 = objInvoke;
                                interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                                if (fileLock != null) {
                                }
                                oO0O000.OooO00o.OooO00o(closeable2, null);
                                interfaceC33895OooO00o3.OooOOO0(null);
                                return r102;
                            }
                            return r1;
                        } catch (Throwable th5) {
                            fileLock = fileLock2;
                            th = th5;
                            if (fileLock != null) {
                            }
                            throw th;
                        }
                    }
                    InterfaceC33895OooO00o interfaceC33895OooO00o4 = (InterfaceC33895OooO00o) c24291Ooooo0o.f81750OooOoO0;
                    InterfaceC32507OooOO0o interfaceC32507OooOO0o3 = (InterfaceC32507OooOO0o) c24291Ooooo0o.f81747OooOo;
                    c24287OoooOo0 = (C24287OoooOo0) c24291Ooooo0o.f81748OooOo0o;
                    C32446OooOOOo.OooO0O0(r103);
                    interfaceC33895OooO00o = interfaceC33895OooO00o4;
                    interfaceC32507OooOO0o = interfaceC32507OooOO0o3;
                    c24291Ooooo0o.f81748OooOo0o = interfaceC32507OooOO0o;
                    c24291Ooooo0o.f81747OooOo = interfaceC33895OooO00o;
                    c24291Ooooo0o.f81750OooOoO0 = fileOutputStream;
                    c24291Ooooo0o.f81752OooOoo0 = 2;
                    Object objOooO00o = OooO00o.OooO00o(fileOutputStream, c24291Ooooo0o);
                    if (objOooO00o != r1) {
                        interfaceC32507OooOO0o2 = interfaceC32507OooOO0o;
                        closeable = fileOutputStream;
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                        r10 = objOooO00o;
                        fileLock2 = (FileLock) r10;
                        c24291Ooooo0o.f81748OooOo0o = interfaceC33895OooO00o2;
                        c24291Ooooo0o.f81747OooOo = closeable;
                        c24291Ooooo0o.f81750OooOoO0 = fileLock2;
                        c24291Ooooo0o.f81752OooOoo0 = 3;
                        objInvoke = interfaceC32507OooOO0o2.invoke(c24291Ooooo0o);
                        if (objInvoke != r1) {
                        }
                    }
                    return r1;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream((File) c24287OoooOo0.f81741OooO0oo.getValue());
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            r103 = c24291Ooooo0o;
            try {
                throw th8;
            } catch (Throwable th9) {
                oO0O000.OooO00o.OooO00o(r1, th8);
                throw th9;
            }
        }
    }

    @Override // o0000o0O.o000oOoO
    public final Object OooO0o0(C24273Oooo00o c24273Oooo00o) {
        C32447OooOOo c32447OooOOo = this.f81733OooO;
        if (c32447OooOOo.isInitialized()) {
            return new Integer(o00Oo0.f81775OooO0O0.nativeIncrementAndGetCounterValue(((o00Oo0) c32447OooOOo.getValue()).f81776OooO00o));
        }
        return C33609OooO0oo.OooO0o(this.f81734OooO00o, new C24289OoooOoo(this, null), c24273Oooo00o);
    }
}

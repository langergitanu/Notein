package o0000o0O;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0000o0O.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24275Oooo0OO<T> implements InterfaceC24298Ooooooo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f81696OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O<T> f81697OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicBoolean f81698OooO0OO;

    public C24275Oooo0OO(File file, o00O0O<T> serializer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
        this.f81696OooO00o = file;
        this.f81697OooO0O0 = serializer;
        this.f81698OooO0OO = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [o0000o0O.Oooo0OO] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o0000o0O.Oooo0OO] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [o0000o0O.Oooo0OO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooO0o(C24275Oooo0OO c24275Oooo0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24274Oooo0O0 c24274Oooo0O0;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th2;
        if (abstractC32479OooO0OO instanceof C24274Oooo0O0) {
            c24274Oooo0O0 = (C24274Oooo0O0) abstractC32479OooO0OO;
            int i = c24274Oooo0O0.f81695OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24274Oooo0O0.f81695OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c24274Oooo0O0 = new C24274Oooo0O0(c24275Oooo0OO, abstractC32479OooO0OO);
            }
        }
        Object obj = c24274Oooo0O0.f81694OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r2 = c24274Oooo0O0.f81695OooOoOO;
        try {
        } catch (FileNotFoundException unused) {
            c24275Oooo0OO = r2;
        }
        if (r2 != 0) {
            if (r2 == 1) {
                fileInputStream2 = c24274Oooo0O0.f81691OooOo;
                r2 = (C24275Oooo0OO) c24274Oooo0O0.f81692OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    oO0O000.OooO00o.OooO00o(fileInputStream2, null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (r2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileInputStream = (Closeable) c24274Oooo0O0.f81692OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                oO0O000.OooO00o.OooO00o(fileInputStream, null);
                return obj;
            } catch (Throwable th4) {
                th = th4;
                try {
                    throw th;
                } finally {
                }
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        if (c24275Oooo0OO.f81698OooO0OO.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        try {
            FileInputStream fileInputStream3 = new FileInputStream(c24275Oooo0OO.f81696OooO00o);
            try {
                o00O0O<T> o00o0o2 = c24275Oooo0OO.f81697OooO0O0;
                c24274Oooo0O0.f81692OooOo0o = c24275Oooo0OO;
                c24274Oooo0O0.f81691OooOo = fileInputStream3;
                c24274Oooo0O0.f81695OooOoOO = 1;
                Object from = o00o0o2.readFrom(fileInputStream3, c24274Oooo0O0);
                if (from != enumC32485OooO00o) {
                    fileInputStream2 = fileInputStream3;
                    obj = from;
                    oO0O000.OooO00o.OooO00o(fileInputStream2, null);
                    return obj;
                }
            } catch (Throwable th5) {
                r2 = c24275Oooo0OO;
                fileInputStream2 = fileInputStream3;
                th2 = th5;
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            boolean zExists = c24275Oooo0OO.f81696OooO00o.exists();
            o00O0O<T> o00o0o3 = c24275Oooo0OO.f81697OooO0O0;
            if (!zExists) {
                return o00o0o3.getDefaultValue();
            }
            FileInputStream fileInputStream4 = new FileInputStream(c24275Oooo0OO.f81696OooO00o);
            try {
                c24274Oooo0O0.f81692OooOo0o = fileInputStream4;
                c24274Oooo0O0.f81691OooOo = null;
                c24274Oooo0O0.f81695OooOoOO = 2;
                Object from2 = o00o0o3.readFrom(fileInputStream4, c24274Oooo0O0);
                if (from2 != enumC32485OooO00o) {
                    obj = from2;
                    fileInputStream = fileInputStream4;
                    oO0O000.OooO00o.OooO00o(fileInputStream, null);
                    return obj;
                }
            } catch (Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream4;
                throw th;
            }
        }
        return enumC32485OooO00o;
    }

    @Override // o0000o0O.InterfaceC24298Ooooooo
    public final Object OooO0OO(C24303o0ooOoO c24303o0ooOoO) {
        return OooO0o(this, c24303o0ooOoO);
    }

    @Override // o0000o0O.InterfaceC24248OooO0O0
    public final void close() {
        this.f81698OooO0OO.set(true);
    }
}

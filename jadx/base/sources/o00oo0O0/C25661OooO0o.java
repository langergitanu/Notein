package o00oo0O0;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import o00o0OO.C25327OooO00o;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0OOo.InterfaceC25413OooO0oo;
import o00o0o00.C25438OooO00o;
import o00o0o0o.C25451OooOO0;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00oo.C25638OooO0oO;
import o00ooO0.C25748OooOoO;
import o00ooO0.C25750OooOoOO;

/* JADX INFO: renamed from: o00oo0O0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25661OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25413OooO0oo f87590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25750OooOoOO f87591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25451OooOO0 f87592OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f87593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C25679OooOo0o f87594OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f87595OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25675OooOo f87596OooO0oO;

    public C25661OooO0o(InterfaceC25413OooO0oo fileCache, C25750OooOoOO c25750OooOoOO, C25451OooOO0 c25451OooOO0, Executor executor, Executor executor2, C25679OooOo0o imageCacheStatsTracker) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileCache, "fileCache");
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f87590OooO00o = fileCache;
        this.f87591OooO0O0 = c25750OooOoOO;
        this.f87592OooO0OO = c25451OooOO0;
        this.f87593OooO0Oo = executor;
        this.f87595OooO0o0 = executor2;
        this.f87594OooO0o = imageCacheStatsTracker;
        this.f87596OooO0oO = new C25675OooOo();
    }

    public final InterfaceC25449OooO0oO OooO00o(InterfaceC25397OooO00o interfaceC25397OooO00o) throws IOException {
        C25679OooOo0o c25679OooOo0o = this.f87594OooO0o;
        try {
            C25438OooO00o.OooO0Oo(C25661OooO0o.class, interfaceC25397OooO00o.OooO00o(), "Disk cache read for %s");
            C25327OooO00o c25327OooO00oOooO0O0 = this.f87590OooO00o.OooO0O0(interfaceC25397OooO00o);
            if (c25327OooO00oOooO0O0 == null) {
                C25438OooO00o.OooO0Oo(C25661OooO0o.class, interfaceC25397OooO00o.OooO00o(), "Disk cache miss for %s");
                c25679OooOo0o.getClass();
                return null;
            }
            C25438OooO00o.OooO0Oo(C25661OooO0o.class, interfaceC25397OooO00o.OooO00o(), "Found entry in disk cache for %s");
            c25679OooOo0o.getClass();
            FileInputStream fileInputStream = new FileInputStream(c25327OooO00oOooO0O0.f86173OooO00o);
            try {
                C25748OooOoO c25748OooOoOOooO00o = this.f87591OooO0O0.OooO00o(fileInputStream, (int) c25327OooO00oOooO0O0.f86173OooO00o.length());
                fileInputStream.close();
                C25438OooO00o.OooO0Oo(C25661OooO0o.class, interfaceC25397OooO00o.OooO00o(), "Successful read from disk cache for %s");
                return c25748OooOoOOooO00o;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            C25438OooO00o.OooO(e, "Exception reading from cache for %s", interfaceC25397OooO00o.OooO00o());
            c25679OooOo0o.getClass();
            throw e;
        }
    }

    public final void OooO0O0(InterfaceC25397OooO00o interfaceC25397OooO00o, C25638OooO0oO c25638OooO0oO) {
        C25438OooO00o.OooO0Oo(C25661OooO0o.class, interfaceC25397OooO00o.OooO00o(), "About to write to disk-cache for key %s");
        try {
            this.f87590OooO00o.OooO00o(interfaceC25397OooO00o, new C25662OooO0o0(c25638OooO0oO, this));
            this.f87594OooO0o.getClass();
            C25438OooO00o.OooO0Oo(C25661OooO0o.class, interfaceC25397OooO00o.OooO00o(), "Successful disk-cache write for key %s");
        } catch (IOException e) {
            C25438OooO00o.OooO(e, "Failed to write to disk-cache for key %s", interfaceC25397OooO00o.OooO00o());
        }
    }
}

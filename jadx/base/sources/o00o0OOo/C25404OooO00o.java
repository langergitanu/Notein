package o00o0OOo;

import OooOoo0.OooOo00;
import Oooo0oO.C21030OooOO0o;
import android.os.Environment;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.OooOOO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOOO0;
import o00o0OO.C25327OooO00o;
import o00o0OOO.C25400OooO0Oo;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0OOo.InterfaceC25411OooO0o0;
import o00o0OoO.C25421OooO0O0;
import o00o0OoO.InterfaceC25420OooO00o;
import o00o0Ooo.C25426OooO0OO;
import o00o0oOO.C25457OooO0OO;
import o00oO0O.o0OoOo0;
import o00oo.C25638OooO0oO;
import o00oo0O0.C25661OooO0o;
import o00oo0O0.C25662OooO0o0;

/* JADX INFO: renamed from: o00o0OOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25404OooO00o implements InterfaceC25411OooO0o0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final long f86623OooO0o = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f86624OooO0oO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f86625OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f86626OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final File f86627OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25400OooO0Oo f86628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25457OooO0OO f86629OooO0o0;

    /* JADX INFO: renamed from: o00o0OOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19700OooO00o implements InterfaceC25420OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f86630OooO00o = new ArrayList();

        public C19700OooO00o() {
        }

        @Override // o00o0OoO.InterfaceC25420OooO00o
        public final void OooO00o(File file) {
            OooO0OO oooO0OOOooO0o0 = C25404OooO00o.OooO0o0(file, C25404OooO00o.this);
            if (oooO0OOOooO0o0 == null || oooO0OOOooO0o0.f86636OooO00o != ".cnt") {
                return;
            }
            this.f86630OooO00o.add(new OooO0O0(oooO0OOOooO0o0.f86637OooO0O0, file));
        }

        @Override // o00o0OoO.InterfaceC25420OooO00o
        public final void OooO0O0(File file) {
        }

        @Override // o00o0OoO.InterfaceC25420OooO00o
        public final void OooO0OO(File file) {
        }
    }

    /* JADX INFO: renamed from: o00o0OOo.OooO00o$OooO0O0 */
    public static class OooO0O0 implements InterfaceC25411OooO0o0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f86632OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C25327OooO00o f86633OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f86634OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f86635OooO0Oo;

        public OooO0O0(String str, File file) {
            str.getClass();
            this.f86632OooO00o = str;
            this.f86633OooO0O0 = new C25327OooO00o(file);
            this.f86634OooO0OO = -1L;
            this.f86635OooO0Oo = -1L;
        }

        @Override // o00o0OOo.InterfaceC25411OooO0o0.OooO00o
        public final String getId() {
            return this.f86632OooO00o;
        }

        @Override // o00o0OOo.InterfaceC25411OooO0o0.OooO00o
        public final long getSize() {
            if (this.f86634OooO0OO < 0) {
                this.f86634OooO0OO = this.f86633OooO0O0.f86173OooO00o.length();
            }
            return this.f86634OooO0OO;
        }

        @Override // o00o0OOo.InterfaceC25411OooO0o0.OooO00o
        public final long getTimestamp() {
            if (this.f86635OooO0Oo < 0) {
                this.f86635OooO0Oo = this.f86633OooO0O0.f86173OooO00o.lastModified();
            }
            return this.f86635OooO0Oo;
        }
    }

    /* JADX INFO: renamed from: o00o0OOo.OooO00o$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f86636OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f86637OooO0O0;

        public OooO0OO(String str, String str2) {
            this.f86636OooO00o = str;
            this.f86637OooO0O0 = str2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86636OooO00o);
            sb.append("(");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f86637OooO0O0, ")");
        }
    }

    /* JADX INFO: renamed from: o00o0OOo.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static class C25405OooO0Oo extends IOException {
    }

    /* JADX INFO: renamed from: o00o0OOo.OooO00o$OooO0o */
    public class OooO0o implements InterfaceC25420OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f86638OooO00o;

        public OooO0o() {
        }

        @Override // o00o0OoO.InterfaceC25420OooO00o
        public final void OooO00o(File file) {
            C25404OooO00o c25404OooO00o;
            OooO0OO oooO0OOOooO0o0;
            if (this.f86638OooO00o && (oooO0OOOooO0o0 = C25404OooO00o.OooO0o0(file, (c25404OooO00o = C25404OooO00o.this))) != null) {
                String str = oooO0OOOooO0o0.f86636OooO00o;
                if (str != ".tmp") {
                    OooOo00.OooO0o(str == ".cnt");
                    return;
                }
                long jLastModified = file.lastModified();
                c25404OooO00o.f86629OooO0o0.getClass();
                if (jLastModified > System.currentTimeMillis() - C25404OooO00o.f86623OooO0o) {
                    return;
                }
            }
            file.delete();
        }

        @Override // o00o0OoO.InterfaceC25420OooO00o
        public final void OooO0O0(File file) {
            C25404OooO00o c25404OooO00o = C25404OooO00o.this;
            if (!c25404OooO00o.f86625OooO00o.equals(file) && !this.f86638OooO00o) {
                file.delete();
            }
            if (this.f86638OooO00o && file.equals(c25404OooO00o.f86627OooO0OO)) {
                this.f86638OooO00o = false;
            }
        }

        @Override // o00o0OoO.InterfaceC25420OooO00o
        public final void OooO0OO(File file) {
            if (this.f86638OooO00o || !file.equals(C25404OooO00o.this.f86627OooO0OO)) {
                return;
            }
            this.f86638OooO00o = true;
        }
    }

    /* JADX INFO: renamed from: o00o0OOo.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public class C25406OooO0o0 implements InterfaceC25411OooO0o0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f86640OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final File f86641OooO0O0;

        public C25406OooO0o0(String str, File file) {
            this.f86640OooO00o = str;
            this.f86641OooO0O0 = file;
        }

        public final C25327OooO00o OooO00o() throws IOException {
            C25404OooO00o c25404OooO00o = C25404OooO00o.this;
            c25404OooO00o.f86629OooO0o0.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            File fileOooO0o = c25404OooO00o.OooO0o(this.f86640OooO00o);
            try {
                C25421OooO0O0.OooO0O0(this.f86641OooO0O0, fileOooO0o);
                if (fileOooO0o.exists()) {
                    fileOooO0o.setLastModified(jCurrentTimeMillis);
                }
                return new C25327OooO00o(fileOooO0o);
            } catch (C25421OooO0O0.C25422OooO0Oo e) {
                Throwable cause = e.getCause();
                if (cause != null && !(cause instanceof C25421OooO0O0.OooO0OO)) {
                    boolean z = cause instanceof FileNotFoundException;
                }
                int i = C25404OooO00o.f86624OooO0oO;
                c25404OooO00o.f86628OooO0Oo.getClass();
                throw e;
            }
        }

        public final void OooO0O0(C25662OooO0o0 c25662OooO0o0) throws IOException {
            File file = this.f86641OooO0O0;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    C25426OooO0OO c25426OooO0OO = new C25426OooO0OO(fileOutputStream);
                    c25426OooO0OO.f86699OooOo0o = 0L;
                    C25661OooO0o this$0 = c25662OooO0o0.f87598OooO0O0;
                    OooOOO0.OooO0oO(this$0, "this$0");
                    C25638OooO0oO c25638OooO0oO = c25662OooO0o0.f87597OooO00o;
                    OooOOO0.OooO0Oo(c25638OooO0oO);
                    InputStream inputStreamOooOOoo = c25638OooO0oO.OooOOoo();
                    if (inputStreamOooOOoo == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    this$0.f87592OooO0OO.OooO00o(inputStreamOooOOoo, c25426OooO0OO);
                    c25426OooO0OO.flush();
                    long j = c25426OooO0OO.f86699OooOo0o;
                    fileOutputStream.close();
                    if (file.length() == j) {
                        return;
                    }
                    long length = file.length();
                    StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "File was not written completely. Expected: ", ", found: ");
                    sbOooO00o.append(length);
                    throw new C25405OooO0Oo(sbOooO00o.toString());
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                C25400OooO0Oo c25400OooO0Oo = C25404OooO00o.this.f86628OooO0Oo;
                int i = C25404OooO00o.f86624OooO0oO;
                c25400OooO0Oo.getClass();
                throw e;
            }
        }
    }

    public C25404OooO00o(File file, int i, C25400OooO0Oo c25400OooO0Oo) {
        this.f86625OooO00o = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    c25400OooO0Oo.getClass();
                }
            }
        } catch (Exception unused2) {
            c25400OooO0Oo.getClass();
        }
        this.f86626OooO0O0 = zContains;
        File file2 = new File(this.f86625OooO00o, C21532OooOOo.OooO0OO(i, "v2.ols100."));
        this.f86627OooO0OO = file2;
        this.f86628OooO0Oo = c25400OooO0Oo;
        File file3 = this.f86625OooO00o;
        if (!file3.exists()) {
            C25421OooO0O0.OooO00o(file2);
        } else if (!file2.exists()) {
            C21030OooOO0o.OooO0O0(file3);
            try {
                C25421OooO0O0.OooO00o(file2);
            } catch (C25421OooO0O0.OooO00o unused3) {
                Objects.toString(file2);
                this.f86628OooO0Oo.getClass();
            }
        }
        this.f86629OooO0o0 = C25457OooO0OO.f86756OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OooO0OO OooO0o0(File file, C25404OooO00o c25404OooO00o) {
        OooO0OO oooO0OO;
        c25404OooO00o.getClass();
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf <= 0) {
            oooO0OO = null;
        } else {
            String strSubstring = name.substring(iLastIndexOf);
            String str = ".cnt".equals(strSubstring) ? ".cnt" : ".tmp".equals(strSubstring) ? ".tmp" : null;
            if (str != null) {
                String strSubstring2 = name.substring(0, iLastIndexOf);
                if (str.equals(".tmp")) {
                    int iLastIndexOf2 = strSubstring2.lastIndexOf(46);
                    if (iLastIndexOf2 > 0) {
                        strSubstring2 = strSubstring2.substring(0, iLastIndexOf2);
                    }
                    oooO0OO = null;
                }
                oooO0OO = new OooO0OO(str, strSubstring2);
            }
        }
        if (oooO0OO != null && new File(c25404OooO00o.OooO0oO(oooO0OO.f86637OooO0O0)).equals(file.getParentFile())) {
            return oooO0OO;
        }
        return null;
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final InterfaceC25411OooO0o0.OooO0O0 OooO00o(String str, InterfaceC25397OooO00o interfaceC25397OooO00o) throws IOException {
        File file = new File(OooO0oO(str));
        boolean zExists = file.exists();
        C25400OooO0Oo c25400OooO0Oo = this.f86628OooO0Oo;
        if (!zExists) {
            try {
                C25421OooO0O0.OooO00o(file);
            } catch (C25421OooO0O0.OooO00o e) {
                c25400OooO0Oo.getClass();
                throw e;
            }
        }
        try {
            return new C25406OooO0o0(str, File.createTempFile(str.concat("."), ".tmp", file));
        } catch (IOException e2) {
            c25400OooO0Oo.getClass();
            throw e2;
        }
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final void OooO0O0() {
        C21030OooOO0o.OooO0oO(this.f86625OooO00o, new OooO0o());
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final long OooO0OO(InterfaceC25411OooO0o0.OooO00o oooO00o) {
        File file = ((OooO0O0) oooO00o).f86633OooO0O0.f86173OooO00o;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final C25327OooO00o OooO0Oo(String str, InterfaceC25397OooO00o interfaceC25397OooO00o) {
        File fileOooO0o = OooO0o(str);
        if (!fileOooO0o.exists()) {
            return null;
        }
        this.f86629OooO0o0.getClass();
        fileOooO0o.setLastModified(System.currentTimeMillis());
        return new C25327OooO00o(fileOooO0o);
    }

    public final File OooO0o(String str) {
        return new File(OooOOO.OooO0O0(C22218Oooo.OooO0OO(OooO0oO(str)), File.separator, str, ".cnt"));
    }

    public final String OooO0oO(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f86627OooO0OO);
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, File.separator, strValueOf);
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final Collection getEntries() throws IOException {
        C19700OooO00o c19700OooO00o = new C19700OooO00o();
        C21030OooOO0o.OooO0oO(this.f86627OooO0OO, c19700OooO00o);
        return Collections.unmodifiableList(c19700OooO00o.f86630OooO00o);
    }

    @Override // o00o0OOo.InterfaceC25411OooO0o0
    public final boolean isExternal() {
        return this.f86626OooO0O0;
    }
}

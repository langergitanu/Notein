package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.CreateFileUtil;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18095a;
import com.huawei.hms.network.embedded.C18141d3;
import com.huawei.hms.network.embedded.C18295o3;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.embedded.C18412x3;
import com.huawei.hms.network.httpclient.Request;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.t3 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18360t3 implements InterfaceC18114b4 {
    public static final int ENTRY_METADATA = 0;

    /* JADX INFO: renamed from: b */
    public static final String f56195b = "Cache";

    /* JADX INFO: renamed from: c */
    public static final int f56196c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f56197d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f56198e = 50004300;

    /* JADX INFO: renamed from: a */
    public C18095a f56199a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t3$b */
    public final class b implements InterfaceC18373u3 {

        /* JADX INFO: renamed from: f */
        public static final String f56200f = "CacheBodyImpl";

        /* JADX INFO: renamed from: a */
        public boolean f56201a;

        /* JADX INFO: renamed from: b */
        public C18095a.c f56202b;

        /* JADX INFO: renamed from: c */
        public OutputStream f56203c;

        /* JADX INFO: renamed from: d */
        public OutputStream f56204d;

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t3$b$a */
        public class a extends C19120b {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C18360t3 f56206c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C18095a.c f56207d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OutputStream outputStream, C18360t3 c18360t3, C18095a.c cVar) {
                super(outputStream);
                this.f56206c = c18360t3;
                this.f56207d = cVar;
            }

            @Override // com.huawei.hms.network.embedded.C18360t3.b.C19120b, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (C18360t3.this) {
                    try {
                        b bVar = b.this;
                        if (bVar.f56201a) {
                            return;
                        }
                        bVar.f56201a = true;
                        super.close();
                        this.f56207d.m77813c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t3$b$b, reason: collision with other inner class name */
        public class C19120b extends OutputStream {

            /* JADX INFO: renamed from: a */
            public final OutputStream f56209a;

            public C19120b(OutputStream outputStream) {
                if (outputStream == null) {
                    throw new IllegalArgumentException("outputStream == null");
                }
                this.f56209a = outputStream;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f56209a.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f56209a.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                this.f56209a.write(i);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr) throws IOException {
                this.f56209a.write(bArr);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                this.f56209a.write(bArr, i, i2);
            }
        }

        public b(C18095a.c cVar) {
            this.f56202b = cVar;
            try {
                this.f56203c = new FileOutputStream(cVar.m77808a(1));
                this.f56204d = new a(this.f56203c, C18360t3.this, cVar);
            } catch (IOException unused) {
                Logger.m76967w(f56200f, "An exception occurred during the commit.");
                try {
                    cVar.m77809a();
                } catch (IOException unused2) {
                    Logger.m76967w(f56200f, "An exception occurred during the commit, Terminating the cached file failed !");
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18373u3
        public void abort() {
            synchronized (C18360t3.this) {
                try {
                    if (this.f56201a) {
                        return;
                    }
                    this.f56201a = true;
                    IoUtils.closeSecure(this.f56203c);
                    try {
                        this.f56202b.m77809a();
                    } catch (IOException unused) {
                        Logger.m76967w(f56200f, "Terminating the cached file failed !");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18373u3
        public void close() throws IOException {
            OutputStream outputStream = this.f56204d;
            if (outputStream != null) {
                outputStream.close();
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18373u3
        public void write(byte[] bArr) throws IOException {
            OutputStream outputStream = this.f56204d;
            if (outputStream != null) {
                outputStream.write(bArr);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t3$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f56211a;

        /* JADX INFO: renamed from: b */
        public final int f56212b;

        /* JADX INFO: renamed from: c */
        public final String f56213c;

        /* JADX INFO: renamed from: d */
        public final Headers f56214d;

        /* JADX INFO: renamed from: e */
        public final long f56215e;

        /* JADX INFO: renamed from: f */
        public final long f56216f;

        /* JADX INFO: renamed from: g */
        public final String f56217g;

        public c(C18412x3.c cVar) {
            this.f56211a = C18425y3.key(cVar.m79878c().getUrl());
            this.f56212b = cVar.m79879d().getCode();
            this.f56213c = cVar.m79879d().getMessage();
            this.f56214d = Headers.m77737of(cVar.m79879d().getHeaders());
            this.f56215e = cVar.m79881f();
            this.f56216f = cVar.m79876a();
            this.f56217g = cVar.m79879d().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m79547a(C18095a.c cVar) throws Throwable {
            BufferedWriter bufferedWriter;
            int i;
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(cVar.m77808a(0)), Charset.forName("UTF-8")));
            } catch (Throwable th) {
                th = th;
                bufferedWriter = null;
            }
            try {
                bufferedWriter.write(this.f56211a + '\n');
                bufferedWriter.write(this.f56212b + IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(this.f56213c + '\n');
                bufferedWriter.write(this.f56215e + IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(this.f56216f + IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(this.f56217g + IOUtils.LINE_SEPARATOR_UNIX);
                int size = this.f56214d.size();
                bufferedWriter.write(size + IOUtils.LINE_SEPARATOR_UNIX);
                for (i = 0; i < size; i++) {
                    bufferedWriter.write(this.f56214d.name(i) + C18241k5.f55433h + this.f56214d.value(i) + '\n');
                }
                bufferedWriter.flush();
                IoUtils.closeSecure((Writer) bufferedWriter);
            } catch (Throwable th2) {
                th = th2;
                IoUtils.closeSecure((Writer) bufferedWriter);
                throw th;
            }
        }

        public C18412x3.c response(Request request, C18095a c18095a, C18095a.e eVar) throws IOException {
            String str = this.f56214d.get("Content-Type");
            long jStringToLong = C18100a4.stringToLong(this.f56214d.get("Content-Length"), -1L);
            return new C18412x3.c(this.f56215e, this.f56216f, request, new C18141d3.b().url(this.f56217g).code(this.f56212b).message(this.f56213c).headers(this.f56214d.toMultimap()).body(new C18321q3.g(new C18295o3.b().contentLength(jStringToLong).contentType(str).inputStream(new C18438z3(c18095a, this.f56211a, new FileInputStream(eVar.m77829a(1)))).build())).build());
        }

        public c(File file) throws Throwable {
            BufferedReader bufferedReader;
            if (file == null) {
                throw new IOException("Cached file is empty");
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8")));
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
            try {
                this.f56211a = bufferedReader.readLine();
                this.f56212b = C18100a4.stringToInteger(bufferedReader.readLine(), -1);
                this.f56213c = bufferedReader.readLine();
                this.f56215e = C18100a4.stringToLong(bufferedReader.readLine(), -1L);
                this.f56216f = C18100a4.stringToLong(bufferedReader.readLine(), -1L);
                this.f56217g = bufferedReader.readLine();
                Headers.Builder builder = new Headers.Builder();
                int iStringToInteger = C18100a4.stringToInteger(bufferedReader.readLine(), -1);
                for (int i = 0; i < iStringToInteger; i++) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        builder.addLenient(line);
                    }
                }
                this.f56214d = builder.build();
                IoUtils.closeSecure((Reader) bufferedReader);
            } catch (Throwable th2) {
                th = th2;
                IoUtils.closeSecure((Reader) bufferedReader);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public boolean m79550a(Request request) {
            return this.f56211a.equals(C18425y3.key(request.getUrl()));
        }
    }

    public C18360t3(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(ContextHolder.getAppContext().getCacheDir().getPath());
        sbOooO0OO.append(File.separator);
        sbOooO0OO.append(str);
        File fileNewFile = CreateFileUtil.newFile(sbOooO0OO.toString());
        try {
            this.f56199a = C18095a.m77777a(fileNewFile.getCanonicalFile(), 50004300, 2, j);
        } catch (IOException unused) {
            CreateFileUtil.deleteSecure(fileNewFile);
            Logger.m76967w(f56195b, "DiskLruCache failed to create.");
            this.f56199a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79546a(C18095a.c cVar) {
        if (cVar != null) {
            try {
                cVar.m77809a();
            } catch (IOException unused) {
                Logger.m76967w(f56195b, "Terminating the cached file failed !");
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18114b4
    public C18412x3.c get(Request request) throws Throwable {
        String strKey = C18425y3.key(request.getUrl());
        if (TextUtils.isEmpty(strKey)) {
            return null;
        }
        try {
            C18095a.e eVarM77797c = this.f56199a.m77797c(strKey);
            if (eVarM77797c == null) {
                return null;
            }
            c cVar = new c(eVarM77797c.m77829a(0));
            C18412x3.c cVarResponse = cVar.response(request, this.f56199a, eVarM77797c);
            if (cVar.m79550a(request)) {
                return cVarResponse;
            }
            IoUtils.closeSecure(cVarResponse.m79879d().getBody());
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean isInvalid() {
        return this.f56199a == null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18114b4
    public InterfaceC18373u3 put(C18412x3.c cVar) throws Throwable {
        C18095a.c cVarM77796b;
        String strKey = C18425y3.key(cVar.m79878c().getUrl());
        if (TextUtils.isEmpty(strKey)) {
            return null;
        }
        c cVar2 = new c(cVar);
        try {
            cVarM77796b = this.f56199a.m77796b(strKey);
            if (cVarM77796b == null) {
                return null;
            }
            try {
                cVar2.m79547a(cVarM77796b);
                return new b(cVarM77796b);
            } catch (IOException unused) {
                m79546a(cVarM77796b);
                return null;
            }
        } catch (IOException unused2) {
            cVarM77796b = null;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18114b4
    public void remove(C18253l3 c18253l3) {
        if (c18253l3 == null) {
            return;
        }
        String strKey = C18425y3.key(c18253l3.getUrl());
        if (TextUtils.isEmpty(strKey)) {
            return;
        }
        try {
            this.f56199a.m77798d(strKey);
        } catch (IOException unused) {
            Logger.m76960e(f56195b, "remove cached files of the request failed.");
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18114b4
    public void update(C18412x3.c cVar) throws Throwable {
        C18095a.c cVarM77828a;
        c cVar2 = new c(cVar);
        try {
            C18095a.e eVarM77797c = this.f56199a.m77797c(C18425y3.key(cVar.m79878c().getUrl()));
            if (eVarM77797c == null) {
                return;
            }
            try {
                cVarM77828a = eVarM77797c.m77828a();
                if (cVarM77828a != null) {
                    try {
                        cVar2.m79547a(cVarM77828a);
                        cVarM77828a.m77813c();
                    } catch (IOException unused) {
                        m79546a(cVarM77828a);
                    }
                }
            } catch (IOException unused2) {
                cVarM77828a = null;
            }
        } catch (IOException unused3) {
        }
    }
}

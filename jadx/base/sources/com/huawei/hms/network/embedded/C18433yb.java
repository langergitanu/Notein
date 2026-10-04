package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.yb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18433yb {

    /* JADX INFO: renamed from: a */
    public static final Logger f56729a = Logger.getLogger(C18433yb.class.getName());

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.yb$a */
    public class a implements InterfaceC18220ic {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18248kc f56730a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OutputStream f56731b;

        public a(C18248kc c18248kc, OutputStream outputStream) {
            this.f56730a = c18248kc;
            this.f56731b = outputStream;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            C18276mc.m79202a(c18261lb.f55631b, 0L, j);
            while (j > 0) {
                this.f56730a.mo79002e();
                C18178fc c18178fc = c18261lb.f55630a;
                int iMin = (int) Math.min(j, c18178fc.f54867c - c18178fc.f54866b);
                this.f56731b.write(c18178fc.f54865a, c18178fc.f54866b, iMin);
                int i = c18178fc.f54866b + iMin;
                c18178fc.f54866b = i;
                long j2 = iMin;
                j -= j2;
                c18261lb.f55631b -= j2;
                if (i == c18178fc.f54867c) {
                    c18261lb.f55630a = c18178fc.m78512b();
                    C18192gc.m78640a(c18178fc);
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f56731b.close();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public void flush() throws IOException {
            this.f56731b.flush();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        public C18248kc timeout() {
            return this.f56730a;
        }

        public String toString() {
            return "sink(" + this.f56731b + ")";
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.yb$b */
    public class b implements InterfaceC18234jc {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18248kc f56732a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InputStream f56733b;

        public b(C18248kc c18248kc, InputStream inputStream) {
            this.f56732a = c18248kc;
            this.f56733b = inputStream;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        /* JADX INFO: renamed from: c */
        public long mo77914c(C18261lb c18261lb, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.f56732a.mo79002e();
                C18178fc c18178fcM79090e = c18261lb.m79090e(1);
                int i = this.f56733b.read(c18178fcM79090e.f54865a, c18178fcM79090e.f54867c, (int) Math.min(j, 8192 - c18178fcM79090e.f54867c));
                if (i != -1) {
                    c18178fcM79090e.f54867c += i;
                    long j2 = i;
                    c18261lb.f55631b += j2;
                    return j2;
                }
                if (c18178fcM79090e.f54866b != c18178fcM79090e.f54867c) {
                    return -1L;
                }
                c18261lb.f55630a = c18178fcM79090e.m78512b();
                C18192gc.m78640a(c18178fcM79090e);
                return -1L;
            } catch (AssertionError e) {
                if (C18433yb.m80008a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f56733b.close();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
        public C18248kc timeout() {
            return this.f56732a;
        }

        public String toString() {
            return "source(" + this.f56733b + ")";
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.yb$c */
    public class c implements InterfaceC18220ic {
        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        /* JADX INFO: renamed from: b */
        public void mo78029b(C18261lb c18261lb, long j) throws IOException {
            c18261lb.skip(j);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
        public C18248kc timeout() {
            return C18248kc.f55445d;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.yb$d */
    public class d extends C18233jb {

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ Socket f56734l;

        public d(Socket socket) {
            this.f56734l = socket;
        }

        @Override // com.huawei.hms.network.embedded.C18233jb
        /* JADX INFO: renamed from: b */
        public IOException mo78827b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.huawei.hms.network.embedded.C18233jb
        /* JADX INFO: renamed from: i */
        public void mo78828i() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Throwable th;
            try {
                this.f56734l.close();
            } catch (AssertionError e) {
                if (!C18433yb.m80008a(e)) {
                    throw e;
                }
                Logger logger2 = C18433yb.f56729a;
                level = Level.WARNING;
                sb = new StringBuilder("Failed to close timed out socket ");
                th = e;
                logger = logger2;
                sb.append(this.f56734l);
                logger.log(level, sb.toString(), th);
            } catch (Exception e2) {
                Logger logger3 = C18433yb.f56729a;
                level = Level.WARNING;
                sb = new StringBuilder("Failed to close timed out socket ");
                th = e2;
                logger = logger3;
                sb.append(this.f56734l);
                logger.log(level, sb.toString(), th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18220ic m79998a() {
        return new c();
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC18220ic m80009b(File file) throws FileNotFoundException {
        if (file != null) {
            return m80000a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* JADX INFO: renamed from: c */
    public static C18233jb m80012c(Socket socket) {
        return new d(socket);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18220ic m79999a(File file) throws FileNotFoundException {
        if (file != null) {
            return m80000a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC18234jc m80010b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C18233jb c18233jbM80012c = m80012c(socket);
        return c18233jbM80012c.m78926a(m80005a(socket.getInputStream(), c18233jbM80012c));
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC18234jc m80013c(File file) throws FileNotFoundException {
        if (file != null) {
            return m80004a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18220ic m80000a(OutputStream outputStream) {
        return m80001a(outputStream, new C18248kc());
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC18234jc m80011b(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return m80004a(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18220ic m80001a(OutputStream outputStream, C18248kc c18248kc) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (c18248kc != null) {
            return new a(c18248kc, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18220ic m80002a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C18233jb c18233jbM80012c = m80012c(socket);
        return c18233jbM80012c.m78925a(m80001a(socket.getOutputStream(), c18233jbM80012c));
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18220ic m80003a(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return m80000a(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18234jc m80004a(InputStream inputStream) {
        return m80005a(inputStream, new C18248kc());
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18234jc m80005a(InputStream inputStream, C18248kc c18248kc) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (c18248kc != null) {
            return new b(c18248kc, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18275mb m80006a(InterfaceC18220ic interfaceC18220ic) {
        return new C18150dc(interfaceC18220ic);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC18289nb m80007a(InterfaceC18234jc interfaceC18234jc) {
        return new C18164ec(interfaceC18234jc);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80008a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}

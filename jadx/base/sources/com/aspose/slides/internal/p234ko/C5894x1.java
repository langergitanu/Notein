package com.aspose.slides.internal.p234ko;

import com.aspose.slides.internal.p286mz.C6678k4;
import com.aspose.slides.p559ms.System.C14052dq;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.ko.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5894x1 {

    /* JADX INFO: renamed from: k4 */
    public static final PrintStream f16672k4;

    /* JADX INFO: renamed from: x1 */
    public static final PrintStream f16673x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ko.x1$k4 */
    public static class k4 extends BufferedOutputStream {

        /* JADX INFO: renamed from: k4 */
        private char[] f16674k4;

        /* JADX INFO: renamed from: kk */
        private int f16675kk;

        /* JADX INFO: renamed from: to */
        private boolean f16676to;

        /* JADX INFO: renamed from: x1 */
        private int f16677x1;

        public k4(OutputStream outputStream) {
            super(outputStream);
            this.f16674k4 = C14052dq.f47188k4.toCharArray();
            this.f16677x1 = r1.length - 1;
            this.f16675kk = -1;
            this.f16676to = false;
        }

        /* JADX INFO: renamed from: k4 */
        private void m23744k4(int i) {
            char[] cArr = this.f16674k4;
            int i2 = this.f16675kk;
            this.f16675kk = i == cArr[i2 + 1] ? i2 + 1 : -1;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16676to = true;
            super.close();
        }

        @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f16676to) {
                this.f16676to = false;
                super.flush();
            }
        }

        @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
        public synchronized void write(int i) throws IOException {
            try {
                m23744k4(i);
                if (this.f16675kk == this.f16677x1) {
                    this.f16675kk = -1;
                    this.f16676to = true;
                    flush();
                } else {
                    super.write(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
            while (true) {
                i2--;
                if (i2 >= 0) {
                    int i3 = i + 1;
                    write(bArr[i]);
                    i = i3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ko.x1$x1 */
    public static class x1 extends OutputStream {
        private x1() {
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) throws IOException {
            C6678k4.m26427k4(String.valueOf(i));
        }

        public /* synthetic */ x1(RunnableC5893to runnableC5893to) {
            this();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            C6678k4.m26427k4(new String(bArr));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
            C6678k4.m26427k4(new String(bArr, i, i2));
        }
    }

    static {
        RunnableC5893to runnableC5893to = null;
        f16672k4 = new PrintStream((OutputStream) new k4(new x1(runnableC5893to)), true);
        f16673x1 = new PrintStream((OutputStream) new k4(new x1(runnableC5893to)), true);
        if (C6678k4.m26428k4()) {
            try {
                Runtime.getRuntime().addShutdownHook(new Thread(new RunnableC5893to(), "hook"));
            } catch (Exception unused) {
            }
        }
    }
}

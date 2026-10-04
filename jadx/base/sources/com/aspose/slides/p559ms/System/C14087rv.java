package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p234ko.C5894x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C14087rv {

    /* JADX INFO: renamed from: du */
    private static AbstractC3151yd f47307du;

    /* JADX INFO: renamed from: k4 */
    static AbstractC3124b3 f47308k4;

    /* JADX INFO: renamed from: kk */
    static AbstractC6747ar f47309kk;

    /* JADX INFO: renamed from: to */
    private static AbstractC3124b3 f47310to;

    /* JADX INFO: renamed from: x1 */
    static AbstractC6747ar f47311x1 = AbstractC6747ar.m26634h4();

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.rv$k4 */
    public static class k4 extends AbstractC3150x6 {

        /* JADX INFO: renamed from: k4 */
        private InputStream f47312k4;

        private k4(InputStream inputStream) {
            this.f47312k4 = inputStream;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canRead() {
            return true;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canSeek() {
            return false;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canWrite() {
            return false;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void flush() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getLength() {
            return 0L;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getPosition() {
            return 0L;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public int read(byte[] bArr, int i, int i2) {
            try {
                return this.f47312k4.read(bArr, i, i2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long seek(long j, int i) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setLength(long j) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setPosition(long j) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void write(byte[] bArr, int i, int i2) {
            throw new NotSupportedException();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.rv$x1 */
    public static class x1 extends AbstractC3150x6 {

        /* JADX INFO: renamed from: k4 */
        private PrintStream f47313k4;

        private x1(PrintStream printStream) {
            this.f47313k4 = printStream;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canRead() {
            return false;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canSeek() {
            return true;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canWrite() {
            return true;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void flush() {
            this.f47313k4.flush();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getLength() {
            return 0L;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getPosition() {
            return 1L;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public int read(byte[] bArr, int i, int i2) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long seek(long j, int i) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setLength(long j) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setPosition(long j) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void write(byte[] bArr, int i, int i2) {
            this.f47313k4.write(bArr, i, i2);
        }
    }

    static {
        AbstractC6747ar abstractC6747arM26634h4 = AbstractC6747ar.m26634h4();
        f47309kk = abstractC6747arM26634h4;
        m67162k4(f47311x1, abstractC6747arM26634h4);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3124b3 m67159k4() {
        return f47308k4;
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC3150x6 m67169kk() {
        return new x1(C5894x1.f16672k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC3150x6 m67170x1() {
        return new k4(System.in);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67160k4(int i) {
        f47308k4.mo13324x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m67171x1(String str) {
        f47308k4.mo13326x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67161k4(AbstractC3124b3 abstractC3124b3) {
        if (abstractC3124b3 == null) {
            throw new ArgumentNullException("newOut");
        }
        f47308k4 = abstractC3124b3;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67162k4(AbstractC6747ar abstractC6747ar, AbstractC6747ar abstractC6747ar2) {
        C3123ar c3123ar = new C3123ar(m67169kk(), abstractC6747ar2);
        c3123ar.m13305k4(true);
        f47308k4 = AbstractC3124b3.m13312k4((AbstractC3124b3) c3123ar);
        C3123ar c3123ar2 = new C3123ar(m67169kk(), abstractC6747ar2);
        c3123ar2.m13305k4(true);
        f47310to = AbstractC3124b3.m13312k4((AbstractC3124b3) c3123ar2);
        f47307du = new C3148wl(m67170x1(), abstractC6747ar);
        C14094ts.m67303k4(f47308k4);
        C14094ts.m67303k4(f47310to);
        C14094ts.m67303k4(f47307du);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67163k4(Object obj) {
        f47308k4.mo13325x1(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67164k4(String str) {
        f47308k4.mo13304k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67165k4(String str, Object obj, Object obj2) {
        f47308k4.mo13328x1(str, obj, obj2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67166k4(String str, Object obj, Object obj2, Object obj3) {
        f47308k4.mo13329x1(str, obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67167k4(String str, Object... objArr) {
        if (objArr == null) {
            f47308k4.mo13326x1(str);
        } else {
            f47308k4.mo13330x1(str, objArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67168k4(boolean z) {
        f47308k4.mo13323kk(z);
    }
}

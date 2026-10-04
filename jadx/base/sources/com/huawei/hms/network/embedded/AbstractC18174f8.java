package com.huawei.hms.network.embedded;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.f8 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18174f8 {

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.f8$a */
    public class a extends AbstractC18174f8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18442z7 f54741a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C18303ob f54742b;

        public a(C18442z7 c18442z7, C18303ob c18303ob) {
            this.f54741a = c18442z7;
            this.f54742b = c18303ob;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public long contentLength() throws IOException {
            return this.f54742b.mo78736j();
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public C18442z7 contentType() {
            return this.f54741a;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public void writeTo(InterfaceC18275mb interfaceC18275mb) throws IOException {
            interfaceC18275mb.mo78267b(this.f54742b);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.f8$b */
    public class b extends AbstractC18174f8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18442z7 f54743a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54744b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ byte[] f54745c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f54746d;

        public b(C18442z7 c18442z7, int i, byte[] bArr, int i2) {
            this.f54743a = c18442z7;
            this.f54744b = i;
            this.f54745c = bArr;
            this.f54746d = i2;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public long contentLength() {
            return this.f54744b;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public C18442z7 contentType() {
            return this.f54743a;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public void writeTo(InterfaceC18275mb interfaceC18275mb) throws IOException {
            interfaceC18275mb.write(this.f54745c, this.f54746d, this.f54744b);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.f8$c */
    public class c extends AbstractC18174f8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18442z7 f54747a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f54748b;

        public c(C18442z7 c18442z7, File file) {
            this.f54747a = c18442z7;
            this.f54748b = file;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public long contentLength() {
            return this.f54748b.length();
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public C18442z7 contentType() {
            return this.f54747a;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18174f8
        public void writeTo(InterfaceC18275mb interfaceC18275mb) throws IOException {
            InterfaceC18234jc interfaceC18234jcM80013c = C18433yb.m80013c(this.f54748b);
            try {
                interfaceC18275mb.mo78257a(interfaceC18234jcM80013c);
                if (interfaceC18234jcM80013c != null) {
                    interfaceC18234jcM80013c.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (interfaceC18234jcM80013c != null) {
                        try {
                            interfaceC18234jcM80013c.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
    }

    public static AbstractC18174f8 create(C18442z7 c18442z7, C18303ob c18303ob) {
        return new a(c18442z7, c18303ob);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract C18442z7 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC18275mb interfaceC18275mb) throws IOException;

    public static AbstractC18174f8 create(C18442z7 c18442z7, File file) {
        if (file != null) {
            return new c(c18442z7, file);
        }
        throw new NullPointerException("file == null");
    }

    public static AbstractC18174f8 create(C18442z7 c18442z7, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (c18442z7 != null) {
            Charset charsetM80035a = c18442z7.m80035a();
            if (charsetM80035a == null) {
                c18442z7 = C18442z7.m80034b(c18442z7 + "; charset=utf-8");
            } else {
                charset = charsetM80035a;
            }
        }
        return create(c18442z7, str.getBytes(charset));
    }

    public static AbstractC18174f8 create(C18442z7 c18442z7, byte[] bArr) {
        return create(c18442z7, bArr, 0, bArr.length);
    }

    public static AbstractC18174f8 create(C18442z7 c18442z7, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        C18313p8.m79377a(bArr.length, i, i2);
        return new b(c18442z7, i2, bArr, i);
    }
}

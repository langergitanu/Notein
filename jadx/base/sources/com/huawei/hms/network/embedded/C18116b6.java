package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18321q3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.b6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18116b6 extends AbstractC18174f8 {

    /* JADX INFO: renamed from: b */
    public static final String f54248b = "OkRequestBody";

    /* JADX INFO: renamed from: a */
    public final C18321q3.e f54249a;

    public C18116b6(C18321q3.e eVar) {
        this.f54249a = eVar;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public long contentLength() throws IOException {
        return this.f54249a.contentLength();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public C18442z7 contentType() {
        String strContentType = this.f54249a.contentType();
        if (strContentType == null) {
            return null;
        }
        return C18442z7.m80034b(strContentType);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public boolean isDuplex() {
        return this.f54249a.isDuplex();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public void writeTo(InterfaceC18275mb interfaceC18275mb) throws IOException {
        C18130c6 c18130c6 = new C18130c6(interfaceC18275mb);
        try {
            this.f54249a.writeTo(c18130c6);
            if (isDuplex()) {
                return;
            }
            IoUtils.closeSecure((OutputStream) c18130c6);
        } catch (FileNotFoundException e) {
            Logger.m76967w(f54248b, "the requestBody with writeTo has error! and the FileNotFound must be changed to InterruptedIOException");
            throw new InterruptedIOException(e.getMessage());
        } catch (IOException e2) {
            Logger.m76967w(f54248b, "the requestBody with writeTo has other error");
            throw e2;
        }
    }
}

package com.huawei.hms.network.base.common.trans;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class FileBinary implements Binary {
    public static final String HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM = "application/octet-stream";

    /* JADX INFO: renamed from: b */
    private static final String f54066b = "FileBinary";

    /* JADX INFO: renamed from: a */
    private File f54067a;

    public FileBinary(File file) {
        this(file, file.getName());
    }

    public InputStream getInputStream() {
        return new FileInputStream(this.f54067a);
    }

    @Override // com.huawei.hms.network.base.common.trans.Binary
    public long getLength() {
        return this.f54067a.length();
    }

    @Override // com.huawei.hms.network.base.common.trans.Binary
    public void onWriteBinary(OutputStream outputStream) {
        InputStream inputStream = null;
        try {
            inputStream = getInputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i);
                }
            }
        } catch (IOException unused) {
            Logger.m76967w(f54066b, "the file is reading but has error!");
        } finally {
            IoUtils.closeSecure(inputStream);
        }
    }

    public FileBinary(File file, String str) {
        if (file == null) {
            throw new IllegalArgumentException(OooO00o.OooO00o("File is null: ", str));
        }
        if (!file.exists()) {
            throw new IllegalArgumentException(OooO00o.OooO00o("File not found: ", str));
        }
        this.f54067a = file;
    }
}

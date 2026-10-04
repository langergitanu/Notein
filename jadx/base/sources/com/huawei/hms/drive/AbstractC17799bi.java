package com.huawei.hms.drive;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34534OooOOOO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.InterfaceC34526OooO0o0;

/* JADX INFO: renamed from: com.huawei.hms.drive.bi */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17799bi {
    public static AbstractC17799bi create(C17794bd c17794bd, String str) {
        Charset charset = C17806bp.f52958e;
        if (c17794bd != null) {
            Charset charsetM76188a = c17794bd.m76188a();
            if (charsetM76188a == null) {
                c17794bd = C17794bd.m76187b(c17794bd + "; charset=utf-8");
            } else {
                charset = charsetM76188a;
            }
        }
        return create(c17794bd, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract C17794bd contentType();

    public abstract void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException;

    public static AbstractC17799bi create(final C17794bd c17794bd, final C34527OooO0oO c34527OooO0oO) {
        return new AbstractC17799bi() { // from class: com.huawei.hms.drive.bi.1
            @Override // com.huawei.hms.drive.AbstractC17799bi
            public long contentLength() throws IOException {
                return c34527OooO0oO.OooO0OO();
            }

            @Override // com.huawei.hms.drive.AbstractC17799bi
            public C17794bd contentType() {
                return c17794bd;
            }

            @Override // com.huawei.hms.drive.AbstractC17799bi
            public void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
                interfaceC34526OooO0o0.Oooo0O0(c34527OooO0oO);
            }
        };
    }

    public static AbstractC17799bi create(C17794bd c17794bd, byte[] bArr) {
        return create(c17794bd, bArr, 0, bArr.length);
    }

    public static AbstractC17799bi create(final C17794bd c17794bd, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            C17806bp.m76337a(bArr.length, i, i2);
            return new AbstractC17799bi() { // from class: com.huawei.hms.drive.bi.2
                @Override // com.huawei.hms.drive.AbstractC17799bi
                public long contentLength() {
                    return i2;
                }

                @Override // com.huawei.hms.drive.AbstractC17799bi
                public C17794bd contentType() {
                    return c17794bd;
                }

                @Override // com.huawei.hms.drive.AbstractC17799bi
                public void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
                    interfaceC34526OooO0o0.o000O0o0(i, i2, bArr);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static AbstractC17799bi create(final C17794bd c17794bd, final File file) {
        if (file != null) {
            return new AbstractC17799bi() { // from class: com.huawei.hms.drive.bi.3
                @Override // com.huawei.hms.drive.AbstractC17799bi
                public long contentLength() {
                    return file.length();
                }

                @Override // com.huawei.hms.drive.AbstractC17799bi
                public C17794bd contentType() {
                    return c17794bd;
                }

                @Override // com.huawei.hms.drive.AbstractC17799bi
                public void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
                    C34534OooOOOO c34534OooOOOOOooO0o0 = null;
                    try {
                        c34534OooOOOOOooO0o0 = C34535OooOOOo.OooO0o0(file);
                        interfaceC34526OooO0o0.o0000O00(c34534OooOOOOOooO0o0);
                    } finally {
                        C17806bp.m76338a(c34534OooOOOOOooO0o0);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}

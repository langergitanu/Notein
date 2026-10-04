package com.huawei.hms.drive;

import java.io.Closeable;
import java.io.InputStream;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.InterfaceC34525OooO0o;

/* JADX INFO: renamed from: com.huawei.hms.drive.bk */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17801bk implements Closeable {
    /* JADX INFO: renamed from: a */
    public static AbstractC17801bk m76311a(C17794bd c17794bd, byte[] bArr) {
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        c34524OooO0Oo.o0000ooO(bArr);
        return m76310a(c17794bd, bArr.length, c34524OooO0Oo);
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo76312a();

    /* JADX INFO: renamed from: b */
    public final InputStream m76313b() {
        return mo76314c().o000OO00();
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC34525OooO0o mo76314c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C17806bp.m76338a(mo76314c());
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC17801bk m76310a(final C17794bd c17794bd, final long j, final InterfaceC34525OooO0o interfaceC34525OooO0o) {
        if (interfaceC34525OooO0o != null) {
            return new AbstractC17801bk() { // from class: com.huawei.hms.drive.bk.1
                @Override // com.huawei.hms.drive.AbstractC17801bk
                /* JADX INFO: renamed from: a */
                public long mo76312a() {
                    return j;
                }

                @Override // com.huawei.hms.drive.AbstractC17801bk
                /* JADX INFO: renamed from: c */
                public InterfaceC34525OooO0o mo76314c() {
                    return interfaceC34525OooO0o;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}

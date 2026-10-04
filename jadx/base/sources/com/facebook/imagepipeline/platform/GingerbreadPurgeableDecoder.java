package com.facebook.imagepipeline.platform;

import OooOoo0.OooOo00;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import o00O0oo0.C24969OooOO0;
import o00o0Ooo.C25425OooO0O0;
import o00o0o.AbstractC25434OooO00o;
import o00o0o0o.C25450OooO0oo;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00o0oO.C25452OooO00o;
import o00o0oo0.C25471OooO0O0;
import o00o0oo0.InterfaceC25470OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static Method f67272OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25470OooO00o f67273OooO0OO;

    public GingerbreadPurgeableDecoder() {
        InterfaceC25470OooO00o interfaceC25470OooO00o = null;
        if (!C25471OooO0O0.f86780OooO00o) {
            try {
                interfaceC25470OooO00o = (InterfaceC25470OooO00o) WebpBitmapFactoryImpl.class.newInstance();
            } catch (Throwable unused) {
            }
            C25471OooO0O0.f86780OooO00o = true;
        }
        this.f67273OooO0OO = interfaceC25470OooO00o;
    }

    public static MemoryFile OooO0oO(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o, int i, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        C25452OooO00o c25452OooO00o;
        C25450OooO0oo c25450OooO0oo = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            C25450OooO0oo c25450OooO0oo2 = new C25450OooO0oo(abstractC25434OooO00o.Oooo000());
            try {
                c25452OooO00o = new C25452OooO00o(c25450OooO0oo2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    outputStream2.getClass();
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int i2 = c25452OooO00o.read(bArr2);
                        if (i2 == -1) {
                            break;
                        }
                        outputStream2.write(bArr2, 0, i2);
                    }
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    abstractC25434OooO00o.close();
                    C25425OooO0O0.OooO0O0(c25450OooO0oo2);
                    C25425OooO0O0.OooO0O0(c25452OooO00o);
                    C25425OooO0O0.OooO00o(outputStream2);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    c25450OooO0oo = c25450OooO0oo2;
                    abstractC25434OooO00o.close();
                    C25425OooO0O0.OooO0O0(c25450OooO0oo);
                    C25425OooO0O0.OooO0O0(c25452OooO00o);
                    C25425OooO0O0.OooO00o(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                c25452OooO00o = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            c25452OooO00o = null;
        }
    }

    public final FileDescriptor OooO(MemoryFile memoryFile) {
        Method method;
        try {
            synchronized (this) {
                if (f67272OooO0Oo == null) {
                    try {
                        f67272OooO0Oo = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
                    } catch (Exception e) {
                        C24969OooOO0.OooO0o(e);
                        throw null;
                    }
                }
                method = f67272OooO0Oo;
            }
            Object objInvoke = method.invoke(memoryFile, new Object[0]);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e2) {
            C24969OooOO0.OooO0o(e2);
            throw null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap OooO0OO(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o, BitmapFactory.Options options) {
        return OooO0oo(abstractC25434OooO00o, abstractC25434OooO00o.Oooo000().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap OooO0Oo(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o, int i, BitmapFactory.Options options) {
        return OooO0oo(abstractC25434OooO00o, i, DalvikPurgeableDecoder.OooO0o0(i, abstractC25434OooO00o) ? null : DalvikPurgeableDecoder.f67262OooO0O0, options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap OooO0oo(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o, int i, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = 0;
        try {
            try {
                MemoryFile memoryFileOooO0oO = OooO0oO(abstractC25434OooO00o, i, bArr);
                try {
                    FileDescriptor fileDescriptorOooO = OooO(memoryFileOooO0oO);
                    InterfaceC25470OooO00o interfaceC25470OooO00o = this.f67273OooO0OO;
                    if (interfaceC25470OooO00o == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmapOooO00o = interfaceC25470OooO00o.OooO00o(fileDescriptorOooO, options);
                    OooOo00.OooO0o0(bitmapOooO00o, "BitmapFactory returned null");
                    memoryFileOooO0oO.close();
                    return bitmapOooO00o;
                } catch (IOException e) {
                    e = e;
                    C24969OooOO0.OooO0o(e);
                    throw null;
                }
            } catch (Throwable th) {
                th = th;
                memoryFile = abstractC25434OooO00o;
                if (memoryFile != 0) {
                    memoryFile.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            if (memoryFile != 0) {
            }
            throw th;
        }
    }
}

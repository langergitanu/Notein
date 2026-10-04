package o00OoooO;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25115OooO0Oo;
import o00OooOO.C25159OooO0oO;
import oO00OoO.C32280OooO0O0;
import oO00OoO0.C32287OooO0oo;

/* JADX INFO: renamed from: o00OoooO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25193OooOoO0 implements InterfaceC25115OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f85767OooO00o;

    public C25193OooOoO0(C25159OooO0oO c25159OooO0oO) {
        this.f85767OooO00o = c25159OooO0oO;
    }

    @Override // o00Ooo0o.InterfaceC25115OooO0Oo
    public boolean OooO00o(Object obj, File file, C25111OooO c25111OooO) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C25159OooO0oO c25159OooO0oO = (C25159OooO0oO) this.f85767OooO00o;
        byte[] bArr = (byte[]) c25159OooO0oO.OooO0Oo(byte[].class, 65536);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c25159OooO0oO.OooO0oo(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c25159OooO0oO.OooO0oo(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c25159OooO0oO.OooO0oo(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean OooO0OO(CharSequence charSequence, C32287OooO0oo c32287OooO0oo) {
        String str = c32287OooO0oo.f116166OooOo;
        if (str.length() != 0) {
            Matcher matcher = ((C32280OooO0O0) this.f85767OooO00o).OooO00o(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    public C25193OooOoO0() {
        this.f85767OooO00o = new C32280OooO0O0(100);
    }
}

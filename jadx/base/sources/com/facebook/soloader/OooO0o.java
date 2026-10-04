package com.facebook.soloader;

import android.graphics.Bitmap;
import android.os.StrictMode;
import com.aspose.slides.C22226Oooo0oo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class OooO0o extends AbstractC22320OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f67483OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f67484OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<String> f67485OooO0OO = Arrays.asList(new String[0]);

    public OooO0o(File file, int i) {
        this.f67483OooO00o = file;
        this.f67484OooO0O0 = i;
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public String OooO0OO() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final int OooO0Oo(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f67524OooO0O0 == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        boolean zContains = this.f67485OooO0OO.contains(str);
        File file = this.f67483OooO00o;
        if (zContains) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " is on the denyList, skip loading from ");
            sbOooO0OO.append(file.getCanonicalPath());
            OooOOO.OooO00o("SoLoader", sbOooO0OO.toString());
            return 0;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            StringBuilder sbOooO0OO2 = C22226Oooo0oo.OooO0OO(str, " file not found on ");
            sbOooO0OO2.append(file.getCanonicalPath());
            OooOOO.OooO0O0("SoLoader", sbOooO0OO2.toString());
            return 0;
        }
        String canonicalPath = file2.getCanonicalPath();
        OooOOO.OooO00o("SoLoader", str + " file found at " + canonicalPath);
        int i2 = i & 1;
        int i3 = this.f67484OooO0O0;
        if (i2 != 0 && (i3 & 2) != 0) {
            OooOOO.OooO00o("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((i3 & 1) != 0) {
            OooO oooO = new OooO();
            oooO.f67475OooOo0o = file2;
            FileInputStream fileInputStream = new FileInputStream(oooO.f67475OooOo0o);
            oooO.f67474OooOo = fileInputStream;
            oooO.f67476OooOoO0 = fileInputStream.getChannel();
            try {
                C22312OooOOOo.OooO0O0(str, oooO, i, threadPolicy);
                oooO.close();
            } catch (Throwable th) {
                try {
                    oooO.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            OooOOO.OooO00o("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f67524OooO0O0.OooO0O0(i, canonicalPath);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            throw OooOo.OooO0OO(str, e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.StringBuilder] */
    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final String toString() {
        String name;
        File file = this.f67483OooO00o;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        ?? sb = new StringBuilder();
        sb.append(OooO0OO());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return Bitmap.compress(93, sb, this.f67484OooO0O0);
    }
}

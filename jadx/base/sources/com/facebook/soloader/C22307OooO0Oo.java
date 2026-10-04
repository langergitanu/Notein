package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.AbstractC22322OooOoo0;
import com.facebook.soloader.C22311OooOO0o;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: com.facebook.soloader.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22307OooO0Oo extends C22311OooOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f67479OooO0oO;

    /* JADX INFO: renamed from: com.facebook.soloader.OooO0Oo$OooO00o */
    public class OooO00o extends C22311OooOO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final boolean f67480OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final int f67481OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final File f67482OooOoo0;

        public OooO00o(C22307OooO0Oo c22307OooO0Oo, C22307OooO0Oo c22307OooO0Oo2, boolean z) throws IOException {
            super(c22307OooO0Oo, c22307OooO0Oo2);
            this.f67480OooOoOO = z;
            this.f67482OooOoo0 = new File(c22307OooO0Oo.f67513OooO0Oo.getApplicationInfo().nativeLibraryDir);
            this.f67481OooOoo = c22307OooO0Oo.f67479OooO0oO;
        }

        @Override // com.facebook.soloader.C22311OooOO0o.OooO0O0
        public final C22311OooOO0o.OooO00o[] OooOOoo() {
            C22311OooOO0o.OooO00o[] oooO00oArr = this.f67502OooOo0o;
            if (oooO00oArr != null) {
                return oooO00oArr;
            }
            C22311OooOO0o.OooO00o[] oooO00oArrOooOOo0 = OooOOo0();
            this.f67502OooOo0o = oooO00oArrOooOOo0;
            if (this.f67480OooOoOO) {
                Log.w("BackupSoSource", "Unconditonally extracting all DSOs from zip");
                return this.f67502OooOo0o;
            }
            if ((this.f67481OooOoo & 1) == 0) {
                Log.w("BackupSoSource", "Self-extraction preferred (PREFER_ANDROID_LIBS_DRIECTORY not set)");
                return this.f67502OooOo0o;
            }
            for (C22311OooOO0o.OooO00o oooO00o : oooO00oArrOooOOo0) {
                ZipEntry zipEntry = oooO00o.f67500OooOoO0;
                String name = zipEntry.getName();
                File file = this.f67482OooOoo0;
                String str = oooO00o.f67519OooOo0o;
                File file2 = new File(file, str);
                try {
                    if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                        if (file2.isFile()) {
                            long length = file2.length();
                            long size = zipEntry.getSize();
                            if (length != size) {
                                StringBuilder sb = new StringBuilder("Allowing consideration of ");
                                sb.append(file2);
                                sb.append(": sysdir file length is ");
                                sb.append(length);
                                Log.w("BackupSoSource", OooO0OO.OooO00o(size, ", but the file is ", " bytes long in the APK", sb));
                            } else {
                                Log.w("BackupSoSource", "Not allowing consideration of " + name + ": deferring to libdir");
                            }
                        } else {
                            Log.w("BackupSoSource", androidx.core.database.OooO00o.OooO00o("Allowing consideration of ", name, ": ", str, " not in system lib dir"));
                        }
                        return this.f67502OooOo0o;
                    }
                    OooOOO.OooO00o("BackupSoSource", "Not allowing consideration of " + name + ": " + str + " not in lib dir.");
                } catch (IOException e) {
                    StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Not allowing consideration of ", name, ": ", str, ", IOException when constructing path: ");
                    sbOooO0O0.append(e.toString());
                    Log.w("BackupSoSource", sbOooO0O0.toString());
                }
            }
            C22311OooOO0o.OooO00o[] oooO00oArr2 = new C22311OooOO0o.OooO00o[0];
            this.f67502OooOo0o = oooO00oArr2;
            return oooO00oArr2;
        }
    }

    public C22307OooO0Oo(Context context, File file, String str) {
        super(context, file, str);
        this.f67479OooO0oO = 1;
    }

    @Override // com.facebook.soloader.OooO0o, com.facebook.soloader.AbstractC22320OooOoO0
    public final String OooO0OO() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.AbstractC22322OooOoo0
    public final byte[] OooO0o() throws IOException {
        int i;
        Context context = this.f67513OooO0Oo;
        File canonicalFile = this.f67498OooO0o0.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            parcelObtain.writeInt(i);
            if ((this.f67479OooO0oO & 1) == 0) {
                parcelObtain.writeByte((byte) 0);
                return parcelObtain.marshall();
            }
            String str = context.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile2.getPath());
            parcelObtain.writeLong(canonicalFile2.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.AbstractC22322OooOoo0
    public final AbstractC22322OooOoo0.AbstractC22323OooO0Oo OooO0oo(boolean z) throws IOException {
        return new OooO00o(this, this, z);
    }
}

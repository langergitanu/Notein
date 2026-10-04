package com.orion.notein.data.repo.backup;

import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32466OooO0OO;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22912Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f69976OooO00o;

    public C22912Oooo0O0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f69976OooO00o = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006a -> B:61:0x0085). Please report as a decompilation issue!!! */
    public static void OooO0O0(FileOutputStream fileOutputStream, BackupFile backupFile) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        Object next;
        Throwable th;
        IOException iOException;
        BufferedOutputStream bufferedOutputStream2;
        File fileOooO0Oo = OooO0Oo();
        if (!fileOooO0Oo.exists()) {
            throw new BackupException(null, -2, null, 4, null);
        }
        ZipFile zipFile = new ZipFile(fileOooO0Oo);
        Iterator it = C31193OooOOo.OooO00o(fileOooO0Oo).iterator();
        while (true) {
            bufferedOutputStream = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ZipEntry) next).getName(), backupFile.getPath())) {
                    break;
                }
            }
        }
        ZipEntry zipEntry = (ZipEntry) next;
        if (zipEntry == null) {
            throw new BackupException(null, -2, null, 4, null);
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (inputStream == null) {
            Log.e("FileIOUtils", "create file <" + fileOutputStream + "> failed.");
            return;
        }
        try {
            try {
                bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream, 4194304);
            } catch (IOException e2) {
                iOException = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[4194304];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    bufferedOutputStream2.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            inputStream.close();
            bufferedOutputStream2.close();
        } catch (IOException e4) {
            iOException = e4;
            bufferedOutputStream = bufferedOutputStream2;
            iOException.printStackTrace();
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            if (bufferedOutputStream == null) {
            } else {
                bufferedOutputStream.close();
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = bufferedOutputStream2;
            try {
                inputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            if (bufferedOutputStream == null) {
                throw th;
            }
            try {
                bufferedOutputStream.close();
                throw th;
            } catch (IOException e7) {
                e7.printStackTrace();
                throw th;
            }
        }
    }

    public static File OooO0Oo() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "Notein");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "backup.zip");
    }

    public static Map OooO0o0(ZipEntry zipEntry, Uri uri) {
        String name;
        File file = new File(zipEntry.getName());
        File parentFile = file.getParentFile();
        List listOoooOO0 = (parentFile == null || (name = parentFile.getName()) == null) ? null : C33599OooOo0O.OoooOO0(name, new String[]{C18115b5.CONNECTOR});
        Map mapOooO0oo = C34436OooOoOO.f123455OooOo0o;
        if (listOoooOO0 == null || listOoooOO0.size() < 2) {
            return mapOooO0oo;
        }
        String strOooO0o0 = C32501OooO0oO.OooO0o0(file);
        int iHashCode = strOooO0o0.hashCode();
        if (iHashCode != -1321546630) {
            if (iHashCode != 3365) {
                if (iHashCode == 3568542 && strOooO0o0.equals(BackupFile.EXTENSION_FOLDER_TREE_FILE)) {
                    mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, "folder_tree"), new C32443OooOOO("content_type", "folder_tree"));
                }
            } else if (strOooO0o0.equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, (String) listOoooOO0.get(1)), new C32443OooOOO("content_type", BackupFile.FILE_CONTENT_TYPE_NOTE));
            }
        } else if (strOooO0o0.equals("template")) {
            mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, (String) listOoooOO0.get(1)), new C32443OooOOO("content_type", "template"));
        }
        C32466OooO0OO c32466OooO0OO = new C32466OooO0OO();
        c32466OooO0OO.putAll(mapOooO0oo);
        c32466OooO0OO.put(BackupFile.FILE_PROPERTY_LOCAL_BACKUP_INSTANCE_URI, String.valueOf(uri));
        return c32466OooO0OO.OooO0O0();
    }

    public static ArrayList OooO0oO(String str) throws BackupException {
        File fileOooO0Oo = OooO0Oo();
        if (!fileOooO0Oo.exists()) {
            throw new BackupException(null, -2, null, 4, null);
        }
        try {
            ArrayList arrayListOooO00o = C31193OooOOo.OooO00o(fileOooO0Oo);
            ArrayList<ZipEntry> arrayList = new ArrayList();
            for (Object obj : arrayListOooO00o) {
                String name = ((ZipEntry) obj).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                if (C33599OooOo0O.OooOoOO(name, str, false)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            for (ZipEntry zipEntry : arrayList) {
                FileTime lastModifiedTime = zipEntry.getLastModifiedTime();
                long millis = lastModifiedTime != null ? lastModifiedTime.toMillis() : fileOooO0Oo.lastModified();
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.Local;
                String name2 = new File(zipEntry.getName()).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                boolean zIsDirectory = zipEntry.isDirectory();
                String name3 = zipEntry.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
                arrayList2.add(new BackupFile(string, diskVendor, name2, name3, zIsDirectory, millis, zipEntry.getSize(), OooO0o0(zipEntry, null), null));
            }
            return arrayList2;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupLocalDataSource");
            c20358OooO00o.OooO0Oo(e, "Couldn't obtain notein files from backup file.", new Object[0]);
            throw new BackupException(null, -3, null, 4, null);
        }
    }

    public final C32460OooOooO OooO00o(BackupFile backupFile, String str) throws BackupException {
        try {
            File file = new File(str);
            if (!C31190OooO0oo.OooO0oO(file)) {
                throw new BackupException(null, BackupEvent.ERROR_FILE_NOT_EXIST, null, 4, null);
            }
            String str2 = backupFile.getContentProperties().get(BackupFile.FILE_PROPERTY_LOCAL_BACKUP_INSTANCE_URI);
            Uri uri = str2 != null ? Uri.parse(str2) : null;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (uri != null) {
                    OooO0OO(fileOutputStream, uri, backupFile);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } else {
                    OooO0O0(fileOutputStream, backupFile);
                }
                fileOutputStream.close();
                return C32460OooOooO.f116667OooO00o;
            } finally {
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupLocalDataSource");
            c20358OooO00o.OooO0Oo(e, "download error, backupFile is: " + backupFile, new Object[0]);
            throw new BackupException(e.getMessage(), -3, null, 4, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r9 = new byte[1024];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r0 = r1.read(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r0 == (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r7.write(r9, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r1.closeEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO(FileOutputStream fileOutputStream, Uri uri, BackupFile backupFile) throws IOException {
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        boolean z;
        InputStream inputStreamOpenInputStream = this.f69976OooO00o.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                zipInputStream = new ZipInputStream(inputStreamOpenInputStream);
                try {
                    nextEntry = zipInputStream.getNextEntry();
                } finally {
                }
            } finally {
            }
            while (true) {
                z = false;
                if (nextEntry == null) {
                    break;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(nextEntry.getName(), backupFile.getPath())) {
                    break;
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            zipInputStream.close();
            if (!z) {
                throw new BackupException(null, -2, null, 4, null);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            inputStreamOpenInputStream.close();
        }
    }

    public final ArrayList OooO0o(Uri uri) {
        ArrayList arrayList = new ArrayList();
        try {
            InputStream inputStreamOpenInputStream = this.f69976OooO00o.getContentResolver().openInputStream(uri);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(inputStreamOpenInputStream);
                if (inputStreamOpenInputStream != null) {
                    try {
                        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                            String name = nextEntry.getName();
                            long compressedSize = nextEntry.getCompressedSize();
                            long size = nextEntry.getSize();
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("ZipEntry");
                            c20358OooO00o.OooO00o("Name: " + name + ", Compressed size: " + compressedSize + ", Size: " + size, new Object[0]);
                            arrayList.add(nextEntry);
                            zipInputStream.closeEntry();
                        }
                    } finally {
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                zipInputStream.close();
                oO0O000.OooO00o.OooO00o(inputStreamOpenInputStream, null);
                return arrayList;
            } finally {
            }
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupLocalDataSource");
            c20358OooO00o2.OooO0Oo(e, "Couldn't read zip entries from uri: " + uri, new Object[0]);
            return arrayList;
        }
    }
}

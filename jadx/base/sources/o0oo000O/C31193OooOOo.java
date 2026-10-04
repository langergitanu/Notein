package o0oo000O;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.aspose.slides.C22218Oooo;
import com.google.android.material.color.utilities.C22366OooOo0;
import com.google.android.material.color.utilities.C22367OooOo0O;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: o0oo000O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31193OooOOo {
    public static void OooO(Collection collection, File file, Map map) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file));
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    if (!OooO0o0(file2, "", zipOutputStream2, (String) map.get(file2.getName()))) {
                        break;
                    }
                }
                zipOutputStream2.finish();
                zipOutputStream2.close();
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ArrayList OooO00o(File file) throws IOException {
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            arrayList.add(enumerationEntries.nextElement());
        }
        zipFile.close();
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean OooO0O0(File file, ArrayList arrayList, ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        File file2 = new File(file, str);
        arrayList.add(file2);
        if (zipEntry.isDirectory()) {
            return C31190OooO0oo.OooO0o(file2);
        }
        if (!C31190OooO0oo.OooO0oO(file2)) {
            return false;
        }
        try {
            bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
                th = th;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
            bufferedInputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    bufferedInputStream.close();
                    bufferedOutputStream.close();
                    return true;
                }
                bufferedOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th4) {
            th = th4;
            if (bufferedInputStream != null) {
            }
            if (bufferedOutputStream != null) {
            }
            throw th;
        }
    }

    public static void OooO0OO(File file, File file2) throws IOException {
        if (file == null || file2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        try {
            int i = OooOOOO.f111245OooO00o;
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String strReplace = zipEntryNextElement.getName().replace("\\", "/");
                if (strReplace.contains("../")) {
                    Log.e("ZipUtils", "entryName: " + strReplace + " is dangerous!");
                } else if (!OooO0O0(file2, arrayList, zipFile, zipEntryNextElement, strReplace)) {
                    zipFile.close();
                    return;
                }
            }
            zipFile.close();
        } catch (Throwable th) {
            zipFile.close();
            throw th;
        }
    }

    public static void OooO0Oo(File file, ArrayList arrayList) {
        File[] fileArrListFiles;
        arrayList.add(file);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Comparator.comparing(new C22367OooOo0O(1)));
        for (File file2 : fileArrListFiles) {
            OooO0Oo(file2, arrayList);
        }
    }

    public static boolean OooO0o(Collection<File> collection, File file) throws IOException {
        ArrayList<File> arrayList = new ArrayList();
        for (File file2 : collection) {
            file2.getParentFile();
            OooO0Oo(file2, arrayList);
        }
        arrayList.sort(Comparator.comparing(new C22366OooOo0(1)));
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
        try {
            zipOutputStream.setLevel(8);
            for (File file3 : arrayList) {
                Path path = file3.toPath();
                Path path2 = null;
                for (File file4 : collection) {
                    Path path3 = file4.toPath();
                    if (file4.isDirectory() && path.startsWith(path3) && (path2 == null || path3.getNameCount() > path2.getNameCount())) {
                        path2 = path3;
                    }
                }
                String strReplace = (path2 != null ? path2.relativize(path).toString() : file3.getName()).replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
                if (file3.isDirectory()) {
                    strReplace = strReplace + IOUtils.DIR_SEPARATOR_UNIX;
                }
                ZipEntry zipEntry = new ZipEntry(strReplace);
                zipEntry.setComment(null);
                zipEntry.setExtra(null);
                zipEntry.setTime(0L);
                zipOutputStream.putNextEntry(zipEntry);
                if (!file3.isDirectory()) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file3));
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, i);
                        }
                        bufferedInputStream.close();
                    } finally {
                    }
                }
                zipOutputStream.closeEntry();
            }
            zipOutputStream.close();
            return true;
        } catch (Throwable th) {
            try {
                zipOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean OooO0o0(File file, String str, ZipOutputStream zipOutputStream, String str2) throws Throwable {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
        sbOooO0OO.append(OooOOOO.OooO0O0(str) ? "" : File.separator);
        sbOooO0OO.append(file.getName());
        String string = sbOooO0OO.toString();
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (!OooO0o0(file2, string, zipOutputStream, str2)) {
                        return false;
                    }
                }
                return true;
            }
            ZipEntry zipEntry = new ZipEntry(string + IOUtils.DIR_SEPARATOR_UNIX);
            zipEntry.setTime(file.lastModified());
            zipEntry.setComment(str2);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            return true;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                ZipEntry zipEntry2 = new ZipEntry(string);
                zipEntry2.setTime(file.lastModified());
                zipEntry2.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream2.read(bArr, 0, 8192);
                    if (i == -1) {
                        zipOutputStream.closeEntry();
                        bufferedInputStream2.close();
                        return true;
                    }
                    zipOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean OooO0oO(Collection collection, OutputStream outputStream) throws Throwable {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(outputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!OooO0o0((File) it.next(), "", zipOutputStream, null)) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                    return false;
                }
            }
            zipOutputStream.finish();
            zipOutputStream.close();
            return true;
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            if (zipOutputStream2 != null) {
                zipOutputStream2.finish();
                zipOutputStream2.close();
            }
            throw th;
        }
    }

    public static void OooO0oo(Context context, Collection collection, Uri uri, Map map) throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        ZipOutputStream zipOutputStream;
        if (uri == null) {
            return;
        }
        ZipOutputStream zipOutputStream2 = null;
        try {
            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
            try {
                zipOutputStream = new ZipOutputStream(outputStreamOpenOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStreamOpenOutputStream = null;
        }
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (!OooO0o0(file, "", zipOutputStream, (String) map.get(file.getName()))) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                        return;
                    }
                    return;
                }
            }
            zipOutputStream.finish();
            zipOutputStream.close();
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.close();
            }
        } catch (Throwable th3) {
            th = th3;
            zipOutputStream2 = zipOutputStream;
            if (zipOutputStream2 != null) {
                zipOutputStream2.finish();
                zipOutputStream2.close();
            }
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.close();
            }
            throw th;
        }
    }
}

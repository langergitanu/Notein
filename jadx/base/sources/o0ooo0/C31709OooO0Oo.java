package o0ooo0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.util.Log;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import o00Oo0oO.C25051OooO0OO;
import o0oo0o0O.InterfaceC31322OooO0O0;
import o0oo0oO0.AbstractC31337OooO0oO;
import o0oo0oO0.C31331OooO00o;
import o0oo0oo.C31389OooOoOO;
import o0oo0oo.C31391OooOoo0;
import o0oo0oo.C31392OooOooO;
import o0oo0oo.C31398Oooo0OO;
import o0oo0oo.C31399Oooo0o;
import o0oo0oo.C31400Oooo0o0;
import o0oo0oo.C31401Oooo0oO;
import o0oo0ooO.C31409OooO0Oo;
import o0ooO000.C31419OooO0OO;
import o0ooO0o.C31455OooO00o;
import o0oooOO0.C31835OooO00o;

/* JADX INFO: renamed from: o0ooo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31709OooO0Oo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25051OooO0OO f113248OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f113249OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: o0ooo0.OooO0Oo$OooO00o */
    public static class OooO00o extends AbstractC31710OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final C31724OooOo0 f113250OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f113251OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final EnumC31711OooO0o0 f113252OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C31707OooO0O0 f113253OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f113254OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f113255OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f113256OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f113257OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f113258OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final File f113259OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final C31709OooO0Oo f113260OooOO0O;

        public OooO00o(File file, EnumC31711OooO0o0 enumC31711OooO0o0, String str, C31707OooO0O0 c31707OooO0O0, int i, int i2, int i3, int i4, int i5, byte[] bArr, C31709OooO0Oo c31709OooO0Oo) {
            this.f113259OooOO0 = file;
            this.f113252OooO0O0 = enumC31711OooO0o0;
            this.f113251OooO00o = str;
            this.f113253OooO0OO = c31707OooO0O0;
            this.f113254OooO0Oo = i;
            this.f113256OooO0o0 = i2;
            this.f113255OooO0o = i3;
            this.f113257OooO0oO = i4;
            this.f113258OooO0oo = i5;
            this.f113250OooO = (bArr == null || bArr.length < 10) ? null : new C31724OooOo0(bArr);
            this.f113260OooOO0O = c31709OooO0Oo;
        }

        public static C31392OooOooO OooOO0O(File file, String str) {
            C31401Oooo0oO c31401Oooo0oOOooO00o;
            try {
                int i = 0;
                if (!file.getName().toLowerCase().endsWith(".ttc")) {
                    return new C31391OooOoo0(false, true).OooO0o0(file);
                }
                C31399Oooo0o c31399Oooo0o = new C31399Oooo0o(file);
                while (true) {
                    try {
                        if (i >= c31399Oooo0o.f112115OooOo) {
                            c31401Oooo0oOOooO00o = null;
                            break;
                        }
                        c31401Oooo0oOOooO00o = c31399Oooo0o.OooO00o(i);
                        if (c31401Oooo0oOOooO00o.getName().equals(str)) {
                            break;
                        }
                        i++;
                    } catch (IOException e) {
                        Log.e("PdfBox-Android", e.getMessage(), e);
                        c31399Oooo0o.close();
                        return null;
                    }
                }
                if (c31401Oooo0oOOooO00o != null) {
                    return (C31392OooOooO) c31401Oooo0oOOooO00o;
                }
                c31399Oooo0o.close();
                throw new IOException("Font " + str + " not found in " + file);
            } catch (IOException e2) {
                Log.w("PdfBox-Android", "Could not load font file: " + file, e2);
                return null;
            }
        }

        public static C31401Oooo0oO OooOO0o(File file, String str) throws IOException {
            C31401Oooo0oO c31401Oooo0oOOooO00o;
            int i = 0;
            if (!file.getName().toLowerCase().endsWith(".ttc")) {
                return new C31398Oooo0OO(false, true).OooO0O0(file);
            }
            C31399Oooo0o c31399Oooo0o = new C31399Oooo0o(file);
            while (true) {
                try {
                    if (i >= c31399Oooo0o.f112115OooOo) {
                        c31401Oooo0oOOooO00o = null;
                        break;
                    }
                    c31401Oooo0oOOooO00o = c31399Oooo0o.OooO00o(i);
                    if (c31401Oooo0oOOooO00o.getName().equals(str)) {
                        break;
                    }
                    i++;
                } catch (IOException e) {
                    c31399Oooo0o.close();
                    throw e;
                }
            }
            if (c31401Oooo0oOOooO00o != null) {
                return c31401Oooo0oOOooO00o;
            }
            c31399Oooo0o.close();
            throw new IOException("Font " + str + " not found in " + file);
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final String OooO() {
            return this.f113251OooO00o;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final C31707OooO0O0 OooO00o() {
            return this.f113253OooO0OO;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final int OooO0O0() {
            return this.f113255OooO0o;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final int OooO0OO() {
            return this.f113257OooO0oO;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final int OooO0Oo() {
            return this.f113256OooO0o0;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final EnumC31711OooO0o0 OooO0o() {
            return this.f113252OooO0O0;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final synchronized InterfaceC31322OooO0O0 OooO0o0() {
            File file;
            FileInputStream fileInputStream;
            try {
                SoftReference softReference = (SoftReference) ((ConcurrentHashMap) this.f113260OooOO0O.f113248OooOo.f85053OooO00o).get(this);
                FileInputStream fileInputStream2 = null;
                interfaceC31322OooO0O0OooOO0o = null;
                InterfaceC31322OooO0O0 interfaceC31322OooO0O0OooOO0o = null;
                InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = softReference != null ? (InterfaceC31322OooO0O0) softReference.get() : null;
                if (interfaceC31322OooO0O0 != null) {
                    return interfaceC31322OooO0O0;
                }
                int iOrdinal = this.f113252OooO0O0.ordinal();
                if (iOrdinal == 0) {
                    String str = this.f113251OooO00o;
                    File file2 = this.f113259OooOO0;
                    try {
                        interfaceC31322OooO0O0OooOO0o = OooOO0o(file2, str);
                    } catch (IOException e) {
                        Log.w("PdfBox-Android", "Could not load font file: " + file2, e);
                    }
                } else if (iOrdinal == 1) {
                    interfaceC31322OooO0O0OooOO0o = OooOO0O(this.f113259OooOO0, this.f113251OooO00o);
                } else {
                    if (iOrdinal != 2) {
                        throw new RuntimeException("can't happen");
                    }
                    try {
                        file = this.f113259OooOO0;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                    }
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            interfaceC31322OooO0O0OooOO0o = C31409OooO0Oo.OooO0o0(fileInputStream);
                        } catch (IOException e2) {
                            e = e2;
                            Log.w("PdfBox-Android", "Could not load font file: " + file, e);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        C31455OooO00o.OooO0O0(fileInputStream2);
                        throw th;
                    }
                    C31455OooO00o.OooO0O0(fileInputStream);
                }
                if (interfaceC31322OooO0O0OooOO0o != null) {
                    ((ConcurrentHashMap) this.f113260OooOO0O.f113248OooOo.f85053OooO00o).put(this, new SoftReference(interfaceC31322OooO0O0OooOO0o));
                }
                return interfaceC31322OooO0O0OooOO0o;
            } catch (Throwable th3) {
                throw th3;
            }
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final int OooO0oO() {
            return this.f113258OooO0oo;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final C31724OooOo0 OooO0oo() {
            return this.f113250OooO;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final int OooOO0() {
            return this.f113254OooO0Oo;
        }

        @Override // o0ooo0.AbstractC31710OooO0o
        public final String toString() {
            return super.toString() + " " + this.f113259OooOO0;
        }
    }

    /* JADX INFO: renamed from: o0ooo0.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends OooO00o {
        public OooO0O0(File file, EnumC31711OooO0o0 enumC31711OooO0o0, String str) {
            super(file, enumC31711OooO0o0, str, null, 0, 0, 0, 0, 0, null, null);
        }
    }

    public C31709OooO0Oo(C25051OooO0OO c25051OooO0OO) throws Throwable {
        this.f113248OooOo = c25051OooO0OO;
        try {
            OoooO00(new File("/system/fonts/DroidSans.ttf"));
            OoooO00(new File("/system/fonts/DroidSans-Bold.ttf"));
            OoooO00(new File("/system/fonts/DroidSansMono.ttf"));
        } catch (IOException e) {
            e.printStackTrace();
            try {
                C31419OooO0OO c31419OooO0OO = new C31419OooO0OO();
                c31419OooO0OO.f112187OooO00o = null;
                ArrayList arrayListOooO00o = c31419OooO0OO.OooO00o();
                ArrayList arrayList = new ArrayList(arrayListOooO00o.size());
                Iterator it = arrayListOooO00o.iterator();
                while (it.hasNext()) {
                    arrayList.add(new File((URI) it.next()));
                }
                ArrayList arrayListOoooOO0 = OoooOO0(arrayList);
                if (arrayListOoooOO0 != null && !arrayListOoooOO0.isEmpty()) {
                    this.f113249OooOo0o.addAll(arrayListOoooOO0);
                    return;
                }
                Log.w("PdfBox-Android", "Building on-disk font cache, this may take a while");
                OoooOOO(arrayList);
                o000oOoO();
                Log.w("PdfBox-Android", "Finished building on-disk font cache, found " + this.f113249OooOo0o.size() + " fonts");
            } catch (AccessControlException e2) {
                Log.e("PdfBox-Android", "Error accessing the file system", e2);
            }
        }
    }

    public static File OoooO() {
        String property = System.getProperty("pdfbox.fontcache");
        if ((property == null || !new File(property).isDirectory() || !new File(property).canWrite()) && ((property = System.getProperty("user.home")) == null || !new File(property).isDirectory() || !new File(property).canWrite())) {
            property = System.getProperty("java.io.tmpdir");
        }
        return new File(property, ".pdfbox.cache");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo(File file) throws Throwable {
        C31399Oooo0o c31399Oooo0o;
        IOException e;
        C31399Oooo0o c31399Oooo0o2 = null;
        try {
            c31399Oooo0o = new C31399Oooo0o(file);
            for (int i = 0; i < c31399Oooo0o.f112115OooOo; i++) {
                try {
                    try {
                        OoooO0(c31399Oooo0o.OooO00o(i), file);
                    } catch (IOException e2) {
                        e = e2;
                        Log.w("PdfBox-Android", "Could not load font file: " + file, e);
                        if (c31399Oooo0o != null) {
                            c31399Oooo0o.close();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    c31399Oooo0o2 = c31399Oooo0o;
                    if (c31399Oooo0o2 != null) {
                        c31399Oooo0o2.close();
                    }
                    throw th;
                }
            }
            c31399Oooo0o.close();
        } catch (IOException e3) {
            c31399Oooo0o = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (c31399Oooo0o2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [o0ooo0.OooO0o0] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [o0ooo0.OooO0o0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [o0ooo0.OooO0o0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [o0ooo0.OooO0o0] */
    public final void OoooO0(C31401Oooo0oO c31401Oooo0oO, File file) throws IOException {
        String str;
        ?? r4;
        ?? r15;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        ?? r18;
        ArrayList arrayList;
        C31707OooO0O0 c31707OooO0O0;
        ?? r182;
        C31707OooO0O0 c31707OooO0O02;
        File file2 = file;
        ?? r152 = EnumC31711OooO0o0.f113262OooOo0o;
        ArrayList arrayList2 = this.f113249OooOo0o;
        ?? r42 = "Could not load font file: ";
        try {
            try {
                if (c31401Oooo0oO.getName() == null || !c31401Oooo0oO.getName().contains("|")) {
                    try {
                        if (c31401Oooo0oO.getName() == null) {
                            str = "Could not load font file: ";
                            ?? r43 = r152;
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new OooO0O0(file2, r43, "*skipnoname*"));
                            Log.w("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file2);
                            r42 = r43;
                            r152 = arrayList3;
                        } else {
                            if (c31401Oooo0oO.Oooo000() == null) {
                                arrayList2.add(new OooO0O0(file2, r152, c31401Oooo0oO.getName()));
                                c31401Oooo0oO.close();
                                return;
                            }
                            int i5 = c31401Oooo0oO.Oooo000().f112061OooOO0O;
                            C31389OooOoOO c31389OooOoOOOoOO = c31401Oooo0oO.ooOO();
                            if (c31389OooOoOOOoOO != null) {
                                i = c31389OooOoOOOoOO.f112083OooO;
                                int i6 = c31389OooOoOOOoOO.f112085OooO0oO;
                                int i7 = (int) c31389OooOoOOOoOO.f112090OooOOO;
                                i4 = (int) c31389OooOoOOOoOO.f112092OooOOOO;
                                bArr = c31389OooOoOOOoOO.f112087OooOO0;
                                i5 = i5;
                                i2 = i6;
                                i3 = i7;
                            } else {
                                i = -1;
                                i2 = -1;
                                bArr = null;
                                i3 = 0;
                                i4 = 0;
                            }
                            try {
                                if (c31401Oooo0oO instanceof C31392OooOooO) {
                                    try {
                                        if (((C31392OooOooO) c31401Oooo0oO).f112126OooOoO0.containsKey("CFF ")) {
                                            AbstractC31337OooO0oO abstractC31337OooO0oO = ((C31392OooOooO) c31401Oooo0oO).o0000ooO().f111972OooO0o;
                                            if (abstractC31337OooO0oO instanceof C31331OooO00o) {
                                                try {
                                                    C31331OooO00o c31331OooO00o = (C31331OooO00o) abstractC31337OooO0oO;
                                                    arrayList = arrayList2;
                                                    try {
                                                        c31707OooO0O0 = new C31707OooO0O0(c31331OooO00o.f111883OooOoo0, c31331OooO00o.f111882OooOoo, c31331OooO00o.f111884OooOooO);
                                                    } catch (IOException e) {
                                                        e = e;
                                                        str = "Could not load font file: ";
                                                        r4 = r152;
                                                        r15 = arrayList;
                                                        r15.add(new OooO0O0(file2, r4, "*skipexception*"));
                                                        Log.w("PdfBox-Android", str + file2, e);
                                                        c31401Oooo0oO.close();
                                                        return;
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    arrayList = arrayList2;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                                c31707OooO0O0 = null;
                                            }
                                            try {
                                            } catch (IOException e3) {
                                                e = e3;
                                                str = "Could not load font file: ";
                                            }
                                            try {
                                                try {
                                                    arrayList.add(new OooO00o(file2, EnumC31711OooO0o0.f113261OooOo, c31401Oooo0oO.getName(), c31707OooO0O0, i2, i, i3, i4, i5, bArr, this));
                                                } catch (IOException e4) {
                                                    e = e4;
                                                    r182 = r152;
                                                    str = "Could not load font file: ";
                                                    r152 = arrayList;
                                                    r18 = r182;
                                                    file2 = file;
                                                    r4 = r18;
                                                    r15 = r152;
                                                    r15.add(new OooO0O0(file2, r4, "*skipexception*"));
                                                    Log.w("PdfBox-Android", str + file2, e);
                                                    c31401Oooo0oO.close();
                                                    return;
                                                }
                                            } catch (IOException e5) {
                                                e = e5;
                                                str = "Could not load font file: ";
                                                r182 = r152;
                                                r152 = arrayList;
                                                r18 = r182;
                                                file2 = file;
                                                r4 = r18;
                                                r15 = r152;
                                                r15.add(new OooO0O0(file2, r4, "*skipexception*"));
                                                Log.w("PdfBox-Android", str + file2, e);
                                                c31401Oooo0oO.close();
                                                return;
                                            }
                                        }
                                    } catch (IOException e6) {
                                        e = e6;
                                        str = "Could not load font file: ";
                                        r18 = r152;
                                        r152 = arrayList2;
                                    }
                                }
                                str = "Could not load font file: ";
                                byte[] bArr2 = bArr;
                                ArrayList arrayList4 = arrayList2;
                                HashMap map = c31401Oooo0oO.f112126OooOoO0;
                                if (map.containsKey("gcid")) {
                                    byte[] bArrO00000OO = c31401Oooo0oO.o00000OO((C31400Oooo0o0) map.get("gcid"));
                                    Charset charset = C31835OooO00o.f113456OooO00o;
                                    String str2 = new String(bArrO00000OO, 10, 64, charset);
                                    String strSubstring = str2.substring(0, str2.indexOf(0));
                                    String str3 = new String(bArrO00000OO, 76, 64, charset);
                                    c31707OooO0O02 = new C31707OooO0O0(strSubstring, str3.substring(0, str3.indexOf(0)), bArrO00000OO[141] & 255 & (bArrO00000OO[140] << 8));
                                } else {
                                    c31707OooO0O02 = null;
                                }
                                file2 = file;
                                ?? r44 = r152;
                                arrayList4.add(new OooO00o(file2, r44, c31401Oooo0oO.getName(), c31707OooO0O02, i2, i, i3, i4, i5, bArr2, this));
                                r42 = r44;
                                r152 = arrayList4;
                            } catch (IOException e7) {
                                e = e7;
                            }
                        }
                    } catch (IOException e8) {
                        e = e8;
                        r4 = r42;
                        r15 = r152;
                    }
                } else {
                    arrayList2.add(new OooO0O0(file2, r152, "*skippipeinname*"));
                    Log.w("PdfBox-Android", "Skipping font with '|' in name " + c31401Oooo0oO.getName() + " in file " + file2);
                }
                c31401Oooo0oO.close();
            } catch (IOException e9) {
                e = e9;
                str = "Could not load font file: ";
                r4 = r152;
                r15 = arrayList2;
            }
        } catch (Throwable th) {
            c31401Oooo0oO.close();
            throw th;
        }
    }

    public final void OoooO00(File file) throws IOException {
        try {
            if (file.getPath().toLowerCase().endsWith(".otf")) {
                OoooO0(new C31391OooOoo0(false, true).OooO0o0(file), file);
            } else {
                OoooO0(new C31398Oooo0OO(false, true).OooO0O0(file), file);
            }
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Could not load font file: " + file, e);
        }
    }

    public final void OoooO0O(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C31409OooO0Oo c31409OooO0OoOooO0o0 = C31409OooO0Oo.OooO0o0(fileInputStream);
            String str = c31409OooO0OoOooO0o0.f112153OooOo0o;
            EnumC31711OooO0o0 enumC31711OooO0o0 = EnumC31711OooO0o0.f113264OooOoO0;
            ArrayList arrayList = this.f113249OooOo0o;
            if (str == null) {
                arrayList.add(new OooO0O0(file, enumC31711OooO0o0, "*skipnoname*"));
                Log.w("PdfBox-Android", "Missing 'name' entry for PostScript name in font " + file);
                return;
            }
            if (!str.contains("|")) {
                arrayList.add(new OooO00o(file, enumC31711OooO0o0, c31409OooO0OoOooO0o0.f112153OooOo0o, null, -1, -1, 0, 0, -1, null, this));
                return;
            }
            arrayList.add(new OooO0O0(file, enumC31711OooO0o0, "*skippipeinname*"));
            Log.w("PdfBox-Android", "Skipping font with '|' in name " + c31409OooO0OoOooO0o0.f112153OooOo0o + " in file " + file);
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Could not load font file: " + file, e);
        } finally {
            fileInputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList OoooOO0(ArrayList arrayList) throws Throwable {
        File fileOoooO;
        boolean zExists;
        BufferedReader bufferedReader;
        ArrayList arrayList2;
        BufferedReader bufferedReader2;
        ArrayList arrayList3;
        C31707OooO0O0 c31707OooO0O0;
        int i;
        byte[] bArr;
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getAbsolutePath());
        }
        ArrayList arrayList4 = new ArrayList();
        char c = 0;
        try {
            fileOoooO = OoooO();
            try {
                zExists = fileOoooO.exists();
            } catch (SecurityException unused) {
                zExists = false;
            }
        } catch (SecurityException unused2) {
            fileOoooO = null;
        }
        if (zExists) {
            try {
                bufferedReader2 = new BufferedReader(new FileReader(fileOoooO));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = line.split("\\|", 10);
                            if (strArrSplit.length < 10) {
                                Log.w("PdfBox-Android", "Incorrect line '" + line + "' in font disk cache is skipped");
                            } else {
                                String str = strArrSplit[c];
                                EnumC31711OooO0o0 enumC31711OooO0o0ValueOf = EnumC31711OooO0o0.valueOf(strArrSplit[1]);
                                if (strArrSplit[2].length() > 0) {
                                    String[] strArrSplit2 = strArrSplit[2].split(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                                    c31707OooO0O0 = new C31707OooO0O0(strArrSplit2[c], strArrSplit2[1], Integer.parseInt(strArrSplit2[2]));
                                } else {
                                    c31707OooO0O0 = null;
                                }
                                if (strArrSplit[3].length() > 0) {
                                    arrayList2 = null;
                                    try {
                                        i = (int) Long.parseLong(strArrSplit[3], 16);
                                    } catch (IOException e) {
                                        e = e;
                                        Log.w("PdfBox-Android", "Error loading font cache, will be re-built", e);
                                        C31455OooO00o.OooO0O0(bufferedReader2);
                                        return arrayList2;
                                    }
                                } else {
                                    arrayList2 = null;
                                    i = -1;
                                }
                                int i2 = strArrSplit[4].length() > 0 ? (int) Long.parseLong(strArrSplit[4], 16) : -1;
                                int i3 = (int) Long.parseLong(strArrSplit[5], 16);
                                int i4 = (int) Long.parseLong(strArrSplit[6], 16);
                                int i5 = strArrSplit[7].length() > 0 ? (int) Long.parseLong(strArrSplit[7], 16) : -1;
                                if (strArrSplit[8].length() > 0) {
                                    byte[] bArr2 = new byte[10];
                                    int i6 = 0;
                                    for (int i7 = 10; i6 < i7; i7 = 10) {
                                        int i8 = i6 * 2;
                                        bArr2[i6] = (byte) (Integer.parseInt(strArrSplit[8].substring(i8, i8 + 2), 16) & 255);
                                        i6++;
                                        i2 = i2;
                                    }
                                    bArr = bArr2;
                                } else {
                                    bArr = arrayList2;
                                }
                                int i9 = i2;
                                File file = new File(strArrSplit[9]);
                                if (file.exists()) {
                                    arrayList4.add(new OooO00o(file, enumC31711OooO0o0ValueOf, str, c31707OooO0O0, i, i9, i3, i4, i5, bArr, this));
                                } else {
                                    Log.d("PdfBox-Android", "Font file " + file.getAbsolutePath() + " not found, skipped");
                                }
                                hashSet.remove(file.getAbsolutePath());
                                c = 0;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            arrayList2 = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        C31455OooO00o.OooO0O0(bufferedReader);
                        throw th;
                    }
                }
                arrayList3 = null;
                C31455OooO00o.OooO0O0(bufferedReader2);
            } catch (IOException e3) {
                e = e3;
                arrayList2 = null;
                bufferedReader2 = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                C31455OooO00o.OooO0O0(bufferedReader);
                throw th;
            }
        } else {
            arrayList3 = null;
        }
        if (hashSet.isEmpty()) {
            return arrayList4;
        }
        Log.w("PdfBox-Android", "New fonts found, font cache will be re-built");
        return arrayList3;
    }

    public final void OoooOOO(ArrayList arrayList) throws Throwable {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                String lowerCase = file.getPath().toLowerCase();
                if (lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf")) {
                    OoooO00(file);
                } else if (lowerCase.endsWith(".ttc") || lowerCase.endsWith(".otc")) {
                    Oooo(file);
                } else if (lowerCase.endsWith(".pfb")) {
                    OoooO0O(file);
                }
            } catch (IOException e) {
                Log.w("PdfBox-Android", "Error parsing font " + file.getPath(), e);
            }
        }
    }

    public final void o000oOoO() throws Throwable {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(OoooO()));
            } catch (Throwable th) {
                th = th;
            }
            try {
                for (OooO00o oooO00o : this.f113249OooOo0o) {
                    bufferedWriter.write(oooO00o.f113251OooO00o.trim());
                    bufferedWriter.write("|");
                    bufferedWriter.write(oooO00o.f113252OooO0O0.toString());
                    bufferedWriter.write("|");
                    C31707OooO0O0 c31707OooO0O0 = oooO00o.f113253OooO0OO;
                    if (c31707OooO0O0 != null) {
                        bufferedWriter.write(c31707OooO0O0.f113244OooO00o + '-' + c31707OooO0O0.f113245OooO0O0 + '-' + c31707OooO0O0.f113246OooO0OO);
                    }
                    bufferedWriter.write("|");
                    int i = oooO00o.f113254OooO0Oo;
                    if (i > -1) {
                        bufferedWriter.write(Integer.toHexString(i));
                    }
                    bufferedWriter.write("|");
                    int i2 = oooO00o.f113256OooO0o0;
                    if (i2 > -1) {
                        bufferedWriter.write(Integer.toHexString(i2));
                    }
                    bufferedWriter.write("|");
                    bufferedWriter.write(Integer.toHexString(oooO00o.f113255OooO0o));
                    bufferedWriter.write("|");
                    bufferedWriter.write(Integer.toHexString(oooO00o.f113257OooO0oO));
                    bufferedWriter.write("|");
                    int i3 = oooO00o.f113258OooO0oo;
                    if (i3 > -1) {
                        bufferedWriter.write(Integer.toHexString(i3));
                    }
                    bufferedWriter.write("|");
                    C31724OooOo0 c31724OooOo0 = oooO00o.f113250OooO;
                    if (c31724OooOo0 != null) {
                        byte[] bArr = c31724OooOo0.f113323OooO00o;
                        for (int i4 = 0; i4 < 10; i4++) {
                            String hexString = Integer.toHexString(bArr[i4]);
                            if (hexString.length() == 1) {
                                bufferedWriter.write(48);
                            }
                            bufferedWriter.write(hexString);
                        }
                    }
                    bufferedWriter.write("|");
                    bufferedWriter.write(oooO00o.f113259OooOO0.getAbsolutePath());
                    bufferedWriter.newLine();
                }
                C31455OooO00o.OooO0O0(bufferedWriter);
            } catch (IOException e) {
                e = e;
                bufferedWriter2 = bufferedWriter;
                Log.w("PdfBox-Android", "Could not write to font cache", e);
                Log.w("PdfBox-Android", "Installed fonts information will have to be reloaded for each start");
                Log.w("PdfBox-Android", "You can assign a directory to the 'pdfbox.fontcache' property");
                C31455OooO00o.OooO0O0(bufferedWriter2);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                C31455OooO00o.OooO0O0(bufferedWriter2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (SecurityException unused) {
        }
    }
}

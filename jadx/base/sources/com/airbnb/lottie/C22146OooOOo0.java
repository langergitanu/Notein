package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o00O.C24783OooOo0O;
import o00O0oOO.C24944OooO0O0;
import o00O0oOO.C24946OooO0Oo;
import o00OO000.C24982OooO0Oo;
import o00OO00O.C24983OooO0Oo;
import o00OO00O.C24986OooO0oo;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.C34542OooOo0O.OooO00o;

/* JADX INFO: renamed from: com.airbnb.lottie.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22146OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f66792OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashSet f66793OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f66794OooO0OO = {80, 75, 3, 4};

    public static String OooO(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static C22152OooOoO0 OooO00o(final String str, Callable callable, OooOO0O oooOO0O) {
        Throwable th;
        Object obj;
        final C22142OooO0oo c22142OooO0oo = str == null ? null : C24946OooO0Oo.f84644OooO0O0.f84645OooO00o.get(str);
        C22152OooOoO0 c22152OooOoO0 = c22142OooO0oo != null ? new C22152OooOoO0(new Callable() { // from class: com.airbnb.lottie.OooOOO0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C22150OooOo0o(c22142OooO0oo);
            }
        }, false) : null;
        HashMap map = f66792OooO00o;
        if (str != null && map.containsKey(str)) {
            c22152OooOoO0 = (C22152OooOoO0) map.get(str);
        }
        if (c22152OooOoO0 != null) {
            if (oooOO0O != null) {
                oooOO0O.run();
            }
            return c22152OooOoO0;
        }
        C22152OooOoO0 c22152OooOoO02 = new C22152OooOoO0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            InterfaceC22149OooOo0O interfaceC22149OooOo0O = new InterfaceC22149OooOo0O() { // from class: com.airbnb.lottie.OooOOO
                @Override // com.airbnb.lottie.InterfaceC22149OooOo0O
                public final void onResult(Object obj2) {
                    HashMap map2 = C22146OooOOo0.f66792OooO00o;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        C22146OooOOo0.OooO0oo(true);
                    }
                }
            };
            synchronized (c22152OooOoO02) {
                try {
                    C22150OooOo0o<T> c22150OooOo0o = c22152OooOoO02.f66818OooO0Oo;
                    if (c22150OooOo0o != 0 && (obj = c22150OooOo0o.f66812OooO00o) != null) {
                        interfaceC22149OooOo0O.onResult(obj);
                    }
                    c22152OooOoO02.f66815OooO00o.add(interfaceC22149OooOo0O);
                } finally {
                }
            }
            InterfaceC22149OooOo0O interfaceC22149OooOo0O2 = new InterfaceC22149OooOo0O() { // from class: com.airbnb.lottie.OooOOOO
                @Override // com.airbnb.lottie.InterfaceC22149OooOo0O
                public final void onResult(Object obj2) {
                    HashMap map2 = C22146OooOOo0.f66792OooO00o;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        C22146OooOOo0.OooO0oo(true);
                    }
                }
            };
            synchronized (c22152OooOoO02) {
                try {
                    C22150OooOo0o<T> c22150OooOo0o2 = c22152OooOoO02.f66818OooO0Oo;
                    if (c22150OooOo0o2 != 0 && (th = c22150OooOo0o2.f66813OooO0O0) != null) {
                        interfaceC22149OooOo0O2.onResult(th);
                    }
                    c22152OooOoO02.f66816OooO0O0.add(interfaceC22149OooOo0O2);
                } finally {
                }
            }
            if (!atomicBoolean.get()) {
                map.put(str, c22152OooOoO02);
                if (map.size() == 1) {
                    OooO0oo(false);
                    return c22152OooOoO02;
                }
            }
        }
        return c22152OooOoO02;
    }

    public static C22150OooOo0o<C22142OooO0oo> OooO0O0(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return OooO0OO(context.getAssets().open(str), str2);
            }
            return OooO0o(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C22150OooOo0o<>((Throwable) e);
        }
    }

    public static C22150OooOo0o<C22142OooO0oo> OooO0OO(InputStream inputStream, String str) {
        try {
            C34542OooOo0O c34542OooOo0OOooO0O0 = C34535OooOOOo.OooO0O0(C34535OooOOOo.OooO0o(inputStream));
            String[] strArr = o00OO000.OooO0OO.f84718OooOoOO;
            return OooO0Oo(new C24982OooO0Oo(c34542OooOo0OOooO0O0), str, true);
        } finally {
            C24986OooO0oo.OooO00o(inputStream);
        }
    }

    public static C22150OooOo0o OooO0Oo(C24982OooO0Oo c24982OooO0Oo, String str, boolean z) {
        try {
            try {
                C22142OooO0oo c22142OooO0ooOooO00o = C24783OooOo0O.OooO00o(c24982OooO0Oo);
                if (str != null) {
                    C24946OooO0Oo.f84644OooO0O0.f84645OooO00o.put(str, c22142OooO0ooOooO00o);
                }
                C22150OooOo0o c22150OooOo0o = new C22150OooOo0o(c22142OooO0ooOooO00o);
                if (z) {
                    C24986OooO0oo.OooO00o(c24982OooO0Oo);
                }
                return c22150OooOo0o;
            } catch (Exception e) {
                C22150OooOo0o c22150OooOo0o2 = new C22150OooOo0o((Throwable) e);
                if (z) {
                    C24986OooO0oo.OooO00o(c24982OooO0Oo);
                }
                return c22150OooOo0o2;
            }
        } catch (Throwable th) {
            if (z) {
                C24986OooO0oo.OooO00o(c24982OooO0Oo);
            }
            throw th;
        }
    }

    public static C22150OooOo0o<C22142OooO0oo> OooO0o(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return OooO0oO(context, zipInputStream, str);
        } finally {
            C24986OooO0oo.OooO00o(zipInputStream);
        }
    }

    public static C22150OooOo0o<C22142OooO0oo> OooO0o0(Context context, int i, String str) {
        Boolean bool;
        try {
            C34542OooOo0O c34542OooOo0OOooO0O0 = C34535OooOOOo.OooO0O0(C34535OooOOOo.OooO0o(context.getResources().openRawResource(i)));
            try {
                C34542OooOo0O c34542OooOo0OPeek = c34542OooOo0OOooO0O0.peek();
                byte[] bArr = f66794OooO0OO;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        c34542OooOo0OPeek.close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (c34542OooOo0OPeek.readByte() != bArr[i2]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i2++;
                }
            } catch (Exception unused) {
                C24983OooO0Oo.f84750OooO00o.getClass();
                bool = Boolean.FALSE;
            } catch (NoSuchMethodError unused2) {
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? OooO0o(context, new ZipInputStream(c34542OooOo0OOooO0O0.new OooO00o()), str) : OooO0OO(c34542OooOo0OOooO0O0.new OooO00o(), str);
        } catch (Resources.NotFoundException e) {
            return new C22150OooOo0o<>((Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C22150OooOo0o<C22142OooO0oo> OooO0oO(Context context, ZipInputStream zipInputStream, String str) {
        C22148OooOo0 c22148OooOo0;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C22142OooO0oo c22142OooO0oo = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase(Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    C34542OooOo0O c34542OooOo0OOooO0O0 = C34535OooOOOo.OooO0O0(C34535OooOOOo.OooO0o(zipInputStream));
                    String[] strArr = o00OO000.OooO0OO.f84718OooOoOO;
                    c22142OooO0oo = (C22142OooO0oo) OooO0Oo(new C24982OooO0Oo(c34542OooOo0OOooO0O0), null, false).f66812OooO00o;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else if (name.contains(".ttf") || name.contains(".otf")) {
                    String[] strArrSplit2 = name.split("/");
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        C24983OooO0Oo.OooO0OO("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        C24983OooO0Oo.OooO0O0("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile);
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c22142OooO0oo == null) {
                return new C22150OooOo0o<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator it = c22142OooO0oo.f66770OooO0O0.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c22148OooOo0 = null;
                        break;
                    }
                    c22148OooOo0 = (C22148OooOo0) it.next();
                    if (c22148OooOo0.f66799OooO0OO.equals(str4)) {
                        break;
                    }
                }
                if (c22148OooOo0 != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    int i2 = C24986OooO0oo.f84760OooO00o;
                    int width = bitmap.getWidth();
                    int i3 = c22148OooOo0.f66797OooO00o;
                    int i4 = c22148OooOo0.f66798OooO0O0;
                    if (width != i3 || bitmap.getHeight() != i4) {
                        Bitmap.createScaledBitmap(bitmap, i3, i4, true);
                        bitmap.recycle();
                    }
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                Iterator it2 = c22142OooO0oo.f66771OooO0OO.values().iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    if (((C24944OooO0O0) it2.next()).f84640OooO00o.equals(entry2.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    C24983OooO0Oo.OooO0O0("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator it3 = c22142OooO0oo.f66770OooO0O0.entrySet().iterator();
                while (it3.hasNext()) {
                    C22148OooOo0 c22148OooOo02 = (C22148OooOo0) ((Map.Entry) it3.next()).getValue();
                    if (c22148OooOo02 == null) {
                        return null;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    String str5 = c22148OooOo02.f66799OooO0OO;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                            BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e) {
                            C24983OooO0Oo.OooO0OO("data URL did not have correct base64 format.", e);
                            return null;
                        }
                    }
                }
            }
            if (str != null) {
                C24946OooO0Oo.f84644OooO0O0.f84645OooO00o.put(str, c22142OooO0oo);
            }
            return new C22150OooOo0o<>(c22142OooO0oo);
        } catch (IOException e2) {
            return new C22150OooOo0o<>((Throwable) e2);
        }
    }

    public static void OooO0oo(boolean z) {
        ArrayList arrayList = new ArrayList(f66793OooO0O0);
        for (int i = 0; i < arrayList.size(); i++) {
            ((InterfaceC22151OooOoO) arrayList.get(i)).OooO00o();
        }
    }
}

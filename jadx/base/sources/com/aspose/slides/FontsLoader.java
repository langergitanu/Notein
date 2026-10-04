package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9794uz;
import com.aspose.slides.internal.p427tt.C11113x1;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv;
import com.orion.notein.richeditor.fonts.FontManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class FontsLoader implements IFontsLoader {

    /* JADX INFO: renamed from: k4 */
    private static final Object f2344k4 = new Object();

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<String, List<C12004dy>> f2346x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<byte[], List<C12004dy>> f2345kk = new Dictionary<>();

    private FontsLoader() {
    }

    public static void clearCache() {
        synchronized (f2344k4) {
            C9794uz.m48261k4();
            C11113x1.m53659k4();
            f2346x1.clear();
            f2345kk.clear();
        }
        C9763ck.m48030to().m48036x1();
        C13736km.m64003x1();
    }

    public static String[] getFontFolders() {
        return C9763ck.m48030to().m48034k4();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static List<byte[]> m1529k4() {
        Dictionary<byte[], List<C12004dy>> dictionary = f2345kk;
        List<byte[]> list = new List<>(dictionary.size());
        synchronized (f2344k4) {
            try {
                Dictionary.Enumerator<byte[], List<C12004dy>> it = dictionary.iterator();
                while (it.hasNext()) {
                    try {
                        list.addItem(((byte[]) it.next().getKey()).clone());
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    public static void loadExternalFont(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 4))) {
            m1530k4(C11240k4.m54219k4(bArr));
        } else {
            m1530k4(bArr);
        }
    }

    public static void loadExternalFonts(String[] strArr) {
        if (strArr == null) {
            return;
        }
        m1531k4(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022 A[Catch: all -> 0x001c, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0015, B:14:0x0022, B:13:0x001f), top: B:18:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m1530k4(byte[] bArr) {
        List<C12004dy> listM48257k4;
        synchronized (f2344k4) {
            try {
                listM48257k4 = C9794uz.m48257k4(bArr);
            } catch (Exception e) {
                C3085sv.m13082k4(e);
            }
            if (listM48257k4.size() > 0) {
                Dictionary<byte[], List<C12004dy>> dictionary = f2345kk;
                if (!dictionary.containsKey(bArr)) {
                    dictionary.addItem(bArr, listM48257k4);
                    C13736km.m64002k4(bArr);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m1531k4(String[] strArr) {
        synchronized (f2344k4) {
            try {
                GraphicsEnv.m67573du().mo67582k4(strArr);
                Dictionary dictionary = new Dictionary();
                List list = new List();
                try {
                    for (String str : getFontFolders()) {
                        String strM13104to = C3085sv.m13104to(str);
                        if (FontManager.REMOTE_FONT_DIR.equals(str)) {
                            strM13104to = FontManager.REMOTE_FONT_DIR;
                        }
                        dictionary.set_Item(strM13104to, strM13104to);
                    }
                } catch (Exception e) {
                    C3085sv.m13082k4(e);
                }
                for (String str2 : strArr) {
                    String strM13104to2 = C3085sv.m13104to(str2);
                    if (C3142to.m13421kk(str2) && !dictionary.containsKey(strM13104to2)) {
                        Dictionary<String, List<C12004dy>> dictionaryM48255k4 = C9794uz.m48255k4(strM13104to2, true);
                        Dictionary.KeyCollection.Enumerator<String, List<C12004dy>> it = dictionaryM48255k4.getKeys().iterator();
                        while (it.hasNext()) {
                            try {
                                String next = it.next();
                                Dictionary<String, List<C12004dy>> dictionary2 = f2346x1;
                                if (!dictionary2.containsKey(next)) {
                                    dictionary2.addItem(next, dictionaryM48255k4.get_Item(next));
                                }
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                        list.addItem(strM13104to2);
                    }
                }
                C9763ck.m48030to().m48033k4((String[]) list.toArray(new String[0]), true);
            } catch (Throwable th) {
                throw th;
            }
        }
        C13736km.m64003x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m1532k4(String str) {
        return m1533k4(str, new String[]{null}) || m1535k4(str, new byte[][]{null});
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public static boolean m1533k4(String str, String[] strArr) {
        synchronized (f2344k4) {
            try {
                Dictionary.KeyCollection.Enumerator<String, List<C12004dy>> it = f2346x1.getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        String next = it.next();
                        List.Enumerator<C12004dy> it2 = f2346x1.get_Item(next).iterator();
                        while (it2.hasNext()) {
                            try {
                                if (C14113y2.m67363du(it2.next().m56527du(), str)) {
                                    strArr[0] = next;
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                    return true;
                                }
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                strArr[0] = null;
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m1534k4(String str, String[] strArr, byte[][] bArr) {
        strArr[0] = null;
        bArr[0] = null;
        return m1533k4(str, strArr) || m1535k4(str, bArr);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public static boolean m1535k4(String str, byte[][] bArr) {
        synchronized (f2344k4) {
            try {
                Dictionary.KeyCollection.Enumerator<byte[], List<C12004dy>> it = f2345kk.getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        byte[] next = it.next();
                        List.Enumerator<C12004dy> it2 = f2345kk.get_Item(next).iterator();
                        while (it2.hasNext()) {
                            try {
                                if (C14113y2.m67363du(it2.next().m56527du(), str)) {
                                    bArr[0] = next;
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                    return true;
                                }
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                bArr[0] = null;
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

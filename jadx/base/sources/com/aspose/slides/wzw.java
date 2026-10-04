package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class wzw {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49889k4 = new C7017h4("m", "cm", "mm", BackupFile.EXTENSION_NOTEIN_FILE, "pc", "1/cm", "1/in");

    /* JADX INFO: renamed from: k4 */
    public static double m72987k4(double d, String str) {
        int iM27428k4 = f49889k4.m27428k4(str);
        return iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 5 ? iM27428k4 != 6 ? d : d / 72.0d : (d * 2.54d) / 72.0d : d * 72.0d : d * 10.0d * 2.54d * 72.0d : (d / 2.54d) * 72.0d : ((d * 100.0d) / 2.54d) * 72.0d;
    }

    /* JADX INFO: renamed from: x1 */
    public static double m72989x1(double d, String str) {
        int iM27428k4 = f49889k4.m27428k4(str);
        return iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 5 ? iM27428k4 != 6 ? d : d * 72.0d : (d * 72.0d) / 2.54d : d / 72.0d : d / 1828.8d : (d / 72.0d) * 2.54d : ((d * 2.54d) * 100.0d) / 72.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public static cow m72988k4(Ink ink, String str) {
        bfl next;
        if (C14113y2.m67411k4(str) || ink.m1770ck() == null) {
            return null;
        }
        if (str.charAt(0) == '#') {
            str = C14113y2.m67422kk(str, 1);
        }
        List.Enumerator<bfl> it = ink.m1770ck().iterator();
        while (it.hasNext()) {
            try {
                it = it.next().m72344to().iterator();
                do {
                    try {
                        if (it.hasNext()) {
                            next = it.next();
                        } else if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                } while (!C14113y2.m67363du(str, next.m4174k4()));
                if (next.m4165ck() != null) {
                    cow cowVarM4165ck = next.m4165ck();
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return cowVarM4165ck;
                }
                cow cowVarM73674m9 = next.m4170fa().m73674m9();
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                return cowVarM73674m9;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static InkBrush m72990x1(Ink ink, String str) {
        InkBrush next;
        if (C14113y2.m67411k4(str) || ink.m1770ck() == null) {
            return null;
        }
        if (str.charAt(0) == '#') {
            str = C14113y2.m67422kk(str, 1);
        }
        List.Enumerator<InkBrush> it = ink.m1770ck().iterator();
        while (it.hasNext()) {
            try {
                it = it.next().m72341k4().iterator();
                do {
                    try {
                        if (it.hasNext()) {
                            next = it.next();
                        } else if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                } while (!C14113y2.m67363du(str, next.m1781du()));
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                return next;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }
}

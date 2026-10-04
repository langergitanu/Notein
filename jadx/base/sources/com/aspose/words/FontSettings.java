package com.aspose.words;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FontSettings {
    private static FontSettings zzYwQ = new FontSettings();
    private com.aspose.words.internal.zzZXH zzA8;
    private com.aspose.words.internal.zzKJ zzAe;
    private FontSubstitutionSettings zzYwO;
    private FontFallbackSettings zzYwP;
    private Object zzZDm;

    public FontSettings() {
        Object obj = new Object();
        this.zzZDm = obj;
        this.zzYwP = new FontFallbackSettings(obj, this);
        this.zzYwO = new FontSubstitutionSettings(this.zzZDm);
        resetFontSources();
    }

    public static FontSettings getDefaultInstance() {
        return zzYwQ;
    }

    private static Iterable<com.aspose.words.internal.zzGP> zzZ(FontSourceBase[] fontSourceBaseArr) {
        ArrayList arrayList = new ArrayList();
        for (FontSourceBase fontSourceBase : fontSourceBaseArr) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<FontSourceBase>) arrayList, fontSourceBase);
        }
        return arrayList;
    }

    private void zzZ7(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        synchronized (this.zzZDm) {
            this.zzAe.zzN(zzzop);
        }
    }

    public FontFallbackSettings getFallbackSettings() {
        return this.zzYwP;
    }

    public FontSourceBase[] getFontsSources() {
        Iterable<com.aspose.words.internal.zzGP> iterableZzIl;
        synchronized (this.zzZDm) {
            iterableZzIl = this.zzAe.zzIl();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.aspose.words.internal.zzGP> it = iterableZzIl.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<FontSourceBase>) arrayList, (FontSourceBase) it.next());
        }
        return (FontSourceBase[]) arrayList.toArray(new FontSourceBase[0]);
    }

    public FontSubstitutionSettings getSubstitutionSettings() {
        return this.zzYwO;
    }

    public void resetFontSources() {
        synchronized (this.zzZDm) {
            this.zzAe = new com.aspose.words.internal.zzKJ(new com.aspose.words.internal.zzGP[]{new SystemFontSource()});
        }
    }

    public void saveSearchCache(OutputStream outputStream) throws Exception {
        zzZ7(com.aspose.words.internal.zzZOP.zzY(outputStream));
    }

    public void setFontsFolder(String str, boolean z) {
        setFontsFolders(new String[]{str}, z);
    }

    public void setFontsFolders(String[] strArr, boolean z) {
        if (strArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fontsFolders");
        }
        FontSourceBase[] fontSourceBaseArr = new FontSourceBase[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            fontSourceBaseArr[i] = new FolderFontSource(strArr[i], z);
        }
        setFontsSources(fontSourceBaseArr);
    }

    public void setFontsSources(FontSourceBase[] fontSourceBaseArr) {
        if (fontSourceBaseArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: sources");
        }
        Iterable<com.aspose.words.internal.zzGP> iterableZzZ = zzZ(fontSourceBaseArr);
        synchronized (this.zzZDm) {
            this.zzAe = new com.aspose.words.internal.zzKJ(iterableZzZ);
        }
    }

    public final Collection<com.aspose.words.internal.zzJU> zzIj() {
        Collection<com.aspose.words.internal.zzJU> collectionZzIj;
        synchronized (this.zzZDm) {
            collectionZzIj = this.zzAe.zzIj();
        }
        return collectionZzIj;
    }

    public final com.aspose.words.internal.zzZXH zzIk() {
        synchronized (this.zzZDm) {
            try {
                com.aspose.words.internal.zzZXH zzzxhZzIk = this.zzAe.zzIk();
                if (zzzxhZzIk != null) {
                    return zzzxhZzIk;
                }
                if (this.zzA8 == null) {
                    this.zzA8 = com.aspose.words.internal.zzJF.zzHi();
                }
                return this.zzA8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.aspose.words.internal.zzZXH zzV(String str, int i) {
        com.aspose.words.internal.zzZXH zzzxhZzV;
        synchronized (this.zzZDm) {
            zzzxhZzV = this.zzAe.zzV(str, i);
        }
        return zzzxhZzV;
    }

    public final com.aspose.words.internal.zzZXH zzW(String str, int i, FontInfo fontInfo) {
        com.aspose.words.internal.zzZXH zzzxhZzY;
        synchronized (this.zzZDm) {
            zzzxhZzY = getSubstitutionSettings().getFontConfigSubstitution().zzY(str, i, fontInfo, this.zzAe);
        }
        return zzzxhZzY;
    }

    public final com.aspose.words.internal.zzZXH zzX(String str, int i, FontInfo fontInfo) {
        com.aspose.words.internal.zzZXH zzzxhZzY;
        synchronized (this.zzZDm) {
            zzzxhZzY = getSubstitutionSettings().getDefaultFontSubstitution().zzY(str, i, fontInfo, this.zzAe);
        }
        return zzzxhZzY;
    }

    public final com.aspose.words.internal.zzZXH zzY(String str, int i, FontInfo fontInfo) {
        com.aspose.words.internal.zzZXH zzzxhZzY;
        synchronized (this.zzZDm) {
            zzzxhZzY = getSubstitutionSettings().getFontInfoSubstitution().zzY(str, i, fontInfo, this.zzAe);
        }
        return zzzxhZzY;
    }

    public final void zzZ6Z() {
        synchronized (this.zzZDm) {
            this.zzAe.zzIi();
        }
    }

    private void zzZ(FontSourceBase[] fontSourceBaseArr, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (fontSourceBaseArr != null) {
            Iterable<com.aspose.words.internal.zzGP> iterableZzZ = zzZ(fontSourceBaseArr);
            synchronized (this.zzZDm) {
                this.zzAe = com.aspose.words.internal.zzKJ.zzZ(iterableZzZ, zzzop);
            }
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: sources");
    }

    public final com.aspose.words.internal.zzZXH zzV(String str, int i, FontInfo fontInfo) {
        com.aspose.words.internal.zzZXH zzzxhZzY;
        synchronized (this.zzZDm) {
            zzzxhZzY = getSubstitutionSettings().getFontNameSubstitution().zzY(str, i, fontInfo, this.zzAe);
        }
        return zzzxhZzY;
    }

    public void setFontsSources(FontSourceBase[] fontSourceBaseArr, InputStream inputStream) throws Exception {
        zzZ(fontSourceBaseArr, com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public final com.aspose.words.internal.zzZXH zzZ(String str, int i, FontInfo fontInfo) {
        com.aspose.words.internal.zzZXH zzzxhZzY;
        synchronized (this.zzZDm) {
            zzzxhZzY = getSubstitutionSettings().getTableSubstitution().zzY(str, i, fontInfo, this.zzAe);
        }
        return zzzxhZzY;
    }
}

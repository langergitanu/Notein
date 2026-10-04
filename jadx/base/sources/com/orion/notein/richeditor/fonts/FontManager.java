package com.orion.notein.richeditor.fonts;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.SystemFonts;
import android.os.Build;
import android.util.Log;
import androidx.core.view.o0OO00O;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public class FontManager {
    public static final String CUSTOM_FONT_DIR = "custom-fonts";
    private static final String REMOTE_FONT_BASE_DOWNLOAD_URL = "https://notein-fonts.oss-cn-beijing.aliyuncs.com";
    public static final String REMOTE_FONT_DIR = "fonts";
    private static final boolean USE_ASSET_FONT = true;
    private static final boolean USE_CUSTOM_FONT = true;
    private static final boolean USE_REMOTE_FONT = true;
    private static final boolean USE_SYS_FONT = false;
    private static final String[] FONT_DIRS = {"/system/fonts", "/system/font", "/data/fonts"};
    private static final Map<String, String> ASSET_FONTS_BY_NAME = new TreeMap();
    private static final Map<String, String> SYSTEM_FONTS_BY_PATH = new TreeMap();
    private static final Map<String, String> SYSTEM_FONTS_BY_NAME = new TreeMap();
    private static final Map<String, String> REMOTE_FONTS_BY_PATH = new TreeMap();
    private static final Map<String, String> REMOTE_FONTS_BY_NAME = new TreeMap();
    private static final Map<String, String> CUSTOM_FONTS_BY_PATH = new TreeMap();
    private static final Map<String, String> CUSTOM_FONTS_BY_NAME = new TreeMap();
    public static final String[] REMOTE_CHINESE_FONTS = {"思源黑体", "思源宋体", "鸿雷板书", "沐瑶随心手写体", "千图纤墨体", "悠然小楷", "云峰静龙行书"};
    public static final String[] REMOTE_ENGLISH_FONTS = {"Roboto-Regular", "Roboto Serif-Regular", "Christopherhand", "Journal", "Note this", "Zhiyong Elegant", "ZhiyongWrite", "Playwrite US Modern", "Playwrite US Trad", "Patrick Hand", "Caveat", "Caveat Brush", "Kalam", "Edu AU VIC WA NT Hand", "Dancing Script", "Pacifico Regular", "Great Vibes"};
    private static final RTTypefaceSet ALL_FONTS = new RTTypefaceSet() { // from class: com.orion.notein.richeditor.fonts.FontManager.1
        @Override // com.orion.notein.richeditor.fonts.RTTypefaceSet
        public boolean contains(String str) {
            return get(str) != null;
        }

        @Override // com.orion.notein.richeditor.fonts.RTTypefaceSet
        public RTTypeface get(String str) {
            for (RTTypeface rTTypeface : this) {
                if (rTTypeface.getName().equals(str)) {
                    return rTTypeface;
                }
            }
            return null;
        }
    };

    public static boolean addCustomFont(Context context, File file, String str) {
        if (file == null || !file.exists()) {
            return false;
        }
        File file2 = new File(getCustomFontDir(context), file.getName());
        if (!file2.exists()) {
            try {
                if (!file2.createNewFile()) {
                    return false;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = fileInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            fileOutputStream.close();
                            fileInputStream.close();
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    Log.e("FontManager", "Font file copy failed", e);
                    return false;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        String absolutePath = file2.getAbsolutePath();
        Map<String, String> map = REMOTE_FONTS_BY_PATH;
        if (map.containsKey(absolutePath)) {
            return true;
        }
        map.put(absolutePath, str);
        REMOTE_FONTS_BY_NAME.put(str, absolutePath);
        return true;
    }

    private static Map<String, String> getAssetFonts(Context context) {
        Map<String, String> map;
        Map<String, String> map2 = ASSET_FONTS_BY_NAME;
        synchronized (map2) {
            try {
                if (map2.isEmpty()) {
                    AssetManager assets = context.getResources().getAssets();
                    Collection<String> assetIndex = AssetIndex.getAssetIndex(context);
                    if (assetIndex == null || assetIndex.isEmpty()) {
                        assetIndex = listFontFiles(context.getResources());
                    }
                    for (String str : assetIndex) {
                        if (str.toLowerCase(Locale.getDefault()).endsWith("ttf")) {
                            String fontName = TTFAnalyzer.getFontName(assets, str);
                            if (fontName == null) {
                                fontName = getFileName(str);
                            }
                            ASSET_FONTS_BY_NAME.put(fontName, str);
                        }
                    }
                }
                map = ASSET_FONTS_BY_NAME;
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public static File getCustomFontDir(Context context) {
        File file = new File(context.getFilesDir(), REMOTE_FONT_DIR);
        file.mkdirs();
        return file;
    }

    public static List<String> getCustomFontNames() {
        ArrayList arrayList;
        Map<String, String> map = CUSTOM_FONTS_BY_NAME;
        synchronized (map) {
            arrayList = new ArrayList(map.keySet());
        }
        return arrayList;
    }

    private static Map<String, String> getCustomFonts(Context context) {
        Map<String, String> map = CUSTOM_FONTS_BY_NAME;
        synchronized (map) {
            try {
                File file = new File(context.getFilesDir(), CUSTOM_FONT_DIR);
                if (!file.exists()) {
                    return map;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    return map;
                }
                for (File file2 : fileArrListFiles) {
                    String absolutePath = file2.getAbsolutePath();
                    Map<String, String> map2 = CUSTOM_FONTS_BY_PATH;
                    if (!map2.containsKey(absolutePath)) {
                        String fileName = getFileName(absolutePath);
                        map2.put(absolutePath, fileName);
                        CUSTOM_FONTS_BY_NAME.put(fileName, absolutePath);
                    }
                }
                return CUSTOM_FONTS_BY_NAME;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String getFileName(String str) {
        return FilenameUtils.getBaseName(str).replace(File.pathSeparator, "");
    }

    public static SortedSet<RTTypeface> getFonts(Context context) {
        Map<String, String> assetFonts = getAssetFonts(context);
        AssetManager assets = context.getResources().getAssets();
        for (String str : assetFonts.keySet()) {
            String str2 = assetFonts.get(str);
            RTTypefaceSet rTTypefaceSet = ALL_FONTS;
            if (!rTTypefaceSet.contains(str)) {
                try {
                    rTTypefaceSet.add(new RTTypeface(str, Typeface.createFromAsset(assets, str2)));
                } catch (Exception unused) {
                }
            }
        }
        Map<String, String> noteinFonts = getNoteinFonts(context);
        for (String str3 : noteinFonts.keySet()) {
            String str4 = noteinFonts.get(str3);
            RTTypefaceSet rTTypefaceSet2 = ALL_FONTS;
            if (!rTTypefaceSet2.contains(str3)) {
                try {
                    rTTypefaceSet2.add(new RTTypeface(str3, Typeface.createFromFile(str4)));
                } catch (Exception unused2) {
                }
            }
        }
        Map<String, String> customFonts = getCustomFonts(context);
        for (String str5 : customFonts.keySet()) {
            String str6 = customFonts.get(str5);
            RTTypefaceSet rTTypefaceSet3 = ALL_FONTS;
            if (!rTTypefaceSet3.contains(str5)) {
                try {
                    rTTypefaceSet3.add(new RTTypeface(str5, Typeface.createFromFile(str6)));
                } catch (Exception unused3) {
                }
            }
        }
        return ALL_FONTS;
    }

    private static Map<String, String> getNoteinFonts(Context context) {
        Map<String, String> map = REMOTE_FONTS_BY_NAME;
        synchronized (map) {
            try {
                if (!map.isEmpty()) {
                    return map;
                }
                File file = new File(context.getFilesDir(), REMOTE_FONT_DIR);
                if (!file.exists()) {
                    return map;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    return map;
                }
                for (File file2 : fileArrListFiles) {
                    String absolutePath = file2.getAbsolutePath();
                    Map<String, String> map2 = REMOTE_FONTS_BY_PATH;
                    if (!map2.containsKey(absolutePath)) {
                        String fileName = getFileName(absolutePath);
                        map2.put(absolutePath, fileName);
                        REMOTE_FONTS_BY_NAME.put(fileName, absolutePath);
                    }
                }
                return REMOTE_FONTS_BY_NAME;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Map<String, String> getSystemFonts() {
        File[] fileArrListFiles;
        Map<String, String> map = SYSTEM_FONTS_BY_NAME;
        synchronized (map) {
            try {
                if (!map.isEmpty()) {
                    return map;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    Iterator it = SystemFonts.getAvailableFonts().iterator();
                    while (it.hasNext()) {
                        File file = o0OO00O.OooO0O0(it.next()).getFile();
                        String absolutePath = file.getAbsolutePath();
                        Map<String, String> map2 = SYSTEM_FONTS_BY_PATH;
                        if (!map2.containsKey(absolutePath)) {
                            String fontName = TTFAnalyzer.getFontName(file.getAbsolutePath());
                            if (fontName == null) {
                                fontName = getFileName(absolutePath);
                            }
                            map2.put(absolutePath, fontName);
                            SYSTEM_FONTS_BY_NAME.put(fontName, absolutePath);
                        }
                    }
                    return SYSTEM_FONTS_BY_NAME;
                }
                for (String str : FONT_DIRS) {
                    File file2 = new File(str);
                    if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                        for (File file3 : fileArrListFiles) {
                            String absolutePath2 = file3.getAbsolutePath();
                            Map<String, String> map3 = SYSTEM_FONTS_BY_PATH;
                            if (!map3.containsKey(absolutePath2)) {
                                String fontName2 = TTFAnalyzer.getFontName(file3.getAbsolutePath());
                                if (fontName2 == null) {
                                    fontName2 = getFileName(absolutePath2);
                                }
                                map3.put(absolutePath2, fontName2);
                                SYSTEM_FONTS_BY_NAME.put(fontName2, absolutePath2);
                            }
                        }
                    }
                }
                return SYSTEM_FONTS_BY_NAME;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static RTTypeface getTypeface(String str) {
        return ALL_FONTS.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$preLoadFonts$0(Context context) {
        synchronized (ASSET_FONTS_BY_NAME) {
            getAssetFonts(context);
        }
        synchronized (REMOTE_FONTS_BY_NAME) {
            getNoteinFonts(context);
        }
        synchronized (CUSTOM_FONTS_BY_NAME) {
            getCustomFonts(context);
        }
        getFonts(context);
    }

    private static Collection<String> listFontFiles(Resources resources) {
        ArrayList arrayList = new ArrayList();
        listFontFiles(resources.getAssets(), arrayList, "", 0);
        return arrayList;
    }

    public static void preLoadFonts(final Context context) {
        new Thread(new Runnable() { // from class: com.orion.notein.richeditor.fonts.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                FontManager.lambda$preLoadFonts$0(context);
            }
        }).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x002d, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0024, B:14:0x0045, B:13:0x0030), top: B:18:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void removeCustomFontByName(String str) {
        Map<String, String> map = CUSTOM_FONTS_BY_NAME;
        synchronized (map) {
            try {
            } catch (Exception e) {
                Log.e("FontManager", "removeCustomFontByName: " + e.getMessage());
            }
            if (map.containsKey(str)) {
                String str2 = map.get(str);
                map.remove(str);
                CUSTOM_FONTS_BY_PATH.remove(str2);
                RTTypefaceSet rTTypefaceSet = ALL_FONTS;
                rTTypefaceSet.remove(rTTypefaceSet.get(str));
                if (str2 != null) {
                    new File(str2).delete();
                }
            }
        }
    }

    private static void listFontFiles(AssetManager assetManager, Collection<String> collection, String str, int i) {
        if (i >= 8) {
            return;
        }
        try {
            String[] list = assetManager.list(str);
            if (list != null && list.length > 0) {
                for (String str2 : list) {
                    i++;
                    listFontFiles(assetManager, collection, ("".equals(str) ? "" : str + File.separator) + str2, i);
                }
                return;
            }
            if (str.endsWith("ttf")) {
                collection.add(str);
            }
        } catch (IOException unused) {
        }
    }
}

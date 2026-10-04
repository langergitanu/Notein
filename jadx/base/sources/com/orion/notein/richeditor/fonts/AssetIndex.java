package com.orion.notein.richeditor.fonts;

import android.content.Context;
import android.util.Log;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class AssetIndex {
    private static final List<String> mAssetIndex = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.InputStream] */
    public static List<String> getAssetIndex(Context context) throws Throwable {
        Reader reader;
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        if (mAssetIndex.isEmpty()) {
            try {
                try {
                    context = context.getAssets().open("assets.index");
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(context));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            mAssetIndex.add(line);
                        } catch (IOException e2) {
                            e = e2;
                            Log.w("AssetIndex", "The assets.index file could not be read. If you want to use your own fonts, please copy the fonts to the assets folder and the build code to generate the assets.index file into your build.gradle (for more details consult the readme, chapter fonts)", e);
                        }
                    }
                } catch (IOException e3) {
                    bufferedReader = null;
                    e = e3;
                } catch (Throwable th3) {
                    reader = null;
                    th = th3;
                    IOUtils.closeQuietly((InputStream) context);
                    IOUtils.closeQuietly(reader);
                    throw th;
                }
            } catch (IOException e4) {
                bufferedReader = null;
                e = e4;
                context = 0;
            } catch (Throwable th4) {
                reader = null;
                th = th4;
                context = 0;
            }
            IOUtils.closeQuietly((InputStream) context);
            IOUtils.closeQuietly((Reader) bufferedReader);
        }
        return mAssetIndex;
    }
}

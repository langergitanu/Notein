package com.orion.notein.richeditor.utils;

import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.richeditor.api.RTApi;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.Bidi;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Helper {
    private static final int LEADING_MARGIN = 18;
    private static float sDensity = Float.MAX_VALUE;
    private static float sDensity4Fonts = Float.MAX_VALUE;
    private static int sLeadingMargin = -1;

    public static void closeQuietly(Closeable closeable) {
        IOUtils.closeQuietly(closeable);
    }

    public static int convertPxToSp(int i) {
        return Math.round(i * getDisplayDensity4Fonts());
    }

    public static int convertSpToPx(int i) {
        return Math.round(i / getDisplayDensity4Fonts());
    }

    public static String decodeQuery(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static String encodeUrl(String str) {
        Uri uri = Uri.parse(str);
        try {
            Map<String, List<String>> mapSplitQuery = splitQuery(uri);
            StringBuilder sb = new StringBuilder();
            for (String str2 : mapSplitQuery.keySet()) {
                for (String str3 : mapSplitQuery.get(str2)) {
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(str2 + "=" + URLEncoder.encode(str3, "UTF-8"));
                }
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()) + (sb.length() > 0 ? MsalUtils.QUERY_STRING_SYMBOL + ((Object) sb) : "");
        } catch (UnsupportedEncodingException | URISyntaxException unused) {
            return uri.toString();
        }
    }

    public static float getDisplayDensity() {
        float f;
        synchronized (Helper.class) {
            try {
                if (sDensity == Float.MAX_VALUE) {
                    sDensity = getDisplayMetrics().density;
                }
                f = sDensity;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    private static float getDisplayDensity4Fonts() {
        float f;
        synchronized (Helper.class) {
            try {
                if (sDensity4Fonts == Float.MAX_VALUE) {
                    sDensity4Fonts = getDisplayMetrics().density * getFontScale();
                }
                f = sDensity4Fonts;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    private static DisplayMetrics getDisplayMetrics() {
        Display defaultDisplay = ((WindowManager) RTApi.getApplicationContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    private static float getFontScale() {
        return RTApi.getApplicationContext().getResources().getConfiguration().fontScale;
    }

    public static int getLeadingMarging() {
        if (sLeadingMargin == -1) {
            sLeadingMargin = Math.round(getDisplayDensity() * 18.0f);
        }
        return sLeadingMargin;
    }

    public static boolean isRTL(CharSequence charSequence, int i, int i2) {
        if (charSequence == null || charSequence.length() == 0) {
            return isRTL(Locale.getDefault());
        }
        if (i == i2 && (i = Math.max(0, i - 1)) == i2) {
            i2 = Math.min(charSequence.length(), i2 + 1);
        }
        try {
            return !new Bidi(charSequence.subSequence(i, i2).toString(), -2).baseIsLeftToRight();
        } catch (IndexOutOfBoundsException unused) {
            return false;
        }
    }

    private static Map<String, List<String>> splitQuery(Uri uri) throws UnsupportedEncodingException {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String query = uri.getQuery();
        if (query != null) {
            for (String str : query.split("&")) {
                int iIndexOf = str.indexOf("=");
                String strDecode = iIndexOf > 0 ? URLDecoder.decode(str.substring(0, iIndexOf), "UTF-8") : str;
                if (!linkedHashMap.containsKey(strDecode)) {
                    linkedHashMap.put(strDecode, new LinkedList());
                }
                ((List) linkedHashMap.get(strDecode)).add((iIndexOf <= 0 || str.length() <= (i = iIndexOf + 1)) ? "" : URLDecoder.decode(str.substring(i), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    private static boolean isRTL(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName().charAt(0));
        return directionality == 1 || directionality == 2;
    }
}

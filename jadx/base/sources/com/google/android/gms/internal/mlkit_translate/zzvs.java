package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
final class zzvs {
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a A[Catch: IOException -> 0x0013, XmlPullParserException -> 0x0016, TryCatch #2 {IOException -> 0x0013, XmlPullParserException -> 0x0016, blocks: (B:3:0x0007, B:5:0x000d, B:11:0x0019, B:16:0x002b, B:48:0x008e, B:19:0x0034, B:23:0x0044, B:25:0x004a, B:30:0x0057, B:45:0x007f, B:46:0x0085, B:47:0x008a), top: B:52:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map zza(Context context, int i) {
        Resources resources;
        byte b;
        HashMap map = new HashMap();
        try {
            resources = context.getResources();
        } catch (IOException e) {
            e = e;
            Log.e("DefaultsXmlParser", "Encountered an error while parsing the defaults XML file.", e);
        } catch (XmlPullParserException e2) {
            e = e2;
            Log.e("DefaultsXmlParser", "Encountered an error while parsing the defaults XML file.", e);
        }
        if (resources == null) {
            Log.e("DefaultsXmlParser", "Could not find the resources of the current context while trying to set defaults from an XML.");
            return map;
        }
        XmlResourceParser xml = resources.getXml(i);
        String name = null;
        String text = null;
        String text2 = null;
        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType == 2) {
                name = xml.getName();
            } else if (eventType == 3) {
                if (xml.getName().equals("entry")) {
                    if (text == null || text2 == null) {
                        Log.w("DefaultsXmlParser", "An entry in the defaults XML has an invalid key and/or value tag.");
                    } else {
                        map.put(text, text2);
                    }
                    text = null;
                    text2 = null;
                }
                name = null;
            } else if (eventType == 4 && name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != 106079) {
                    b = (iHashCode == 111972721 && name.equals("value")) ? (byte) 1 : (byte) -1;
                    if (b != 0) {
                        text = xml.getText();
                    } else if (b != 1) {
                        Log.w("DefaultsXmlParser", "Encountered an unexpected tag while parsing the defaults XML.");
                    } else {
                        text2 = xml.getText();
                    }
                } else {
                    if (name.equals("key")) {
                        b = 0;
                    }
                    if (b != 0) {
                    }
                }
            }
        }
        return map;
    }
}

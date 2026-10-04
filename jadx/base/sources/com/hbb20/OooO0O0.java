package com.hbb20;

import android.content.Context;
import android.util.SparseArray;
import com.aspose.words.StyleIdentifier;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.hbb20.CountryCodePicker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static SparseArray<OooO0O0> f68808OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f68809OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f68810OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, String> f68811OooO0OO;

    public OooO0O0(String str, int i, HashMap<String, String> map) {
        this.f68809OooO00o = str;
        this.f68810OooO0O0 = i;
        this.f68811OooO0OO = map;
    }

    public static OooO0O0 OooO0O0(int i) {
        if (f68808OooO0Oo == null) {
            f68808OooO0Oo = new SparseArray<>();
            HashMap map = new HashMap();
            map.put("ag", "268");
            map.put("ai", "264");
            map.put("as", "684");
            map.put("bb", "246");
            map.put("bm", "441");
            map.put("bs", "242");
            map.put(TranslateLanguage.CATALAN, "204/226/236/249/250/289/306/343/365/403/416/418/431/437/438/450/506/514/519/579/581/587/600/601/604/613/639/647/705/709/769/778/780/782/807/819/825/867/873/902/905/");
            map.put("dm", "767");
            map.put("do", "809/829/849");
            map.put("gd", "473");
            map.put(TranslateLanguage.GUJARATI, "671");
            map.put("jm", "876");
            map.put(TranslateLanguage.KANNADA, "869");
            map.put("ky", "345");
            map.put("lc", "758");
            map.put("mp", "670");
            map.put(TranslateLanguage.MALAY, "664");
            map.put("pr", "787");
            map.put("sx", "721");
            map.put("tc", "649");
            map.put("tt", "868");
            map.put("vc", "784");
            map.put("vg", "284");
            map.put(TranslateLanguage.VIETNAMESE, "340");
            f68808OooO0Oo.put(1, new OooO0O0("us", 3, map));
            HashMap map2 = new HashMap();
            map2.put("gg", "1481");
            map2.put("im", "1624");
            map2.put("je", "1534");
            f68808OooO0Oo.put(44, new OooO0O0("gb", 4, map2));
            HashMap map3 = new HashMap();
            map3.put("ax", "18");
            f68808OooO0Oo.put(StyleIdentifier.LIST_TABLE_2_ACCENT_5, new OooO0O0(TranslateLanguage.FINNISH, 2, map3));
        }
        return f68808OooO0Oo.get(i);
    }

    public final OooO00o OooO00o(Context context, CountryCodePicker.OooO0o oooO0o, String str) {
        String key = this.f68809OooO00o;
        for (Map.Entry<String, String> entry : this.f68811OooO0OO.entrySet()) {
            if (entry.getValue().contains(str)) {
                key = entry.getKey();
            }
        }
        return OooO00o.OooO0OO(context, oooO0o, key);
    }
}

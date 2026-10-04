package o0ooo0;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import o00Oo0oO.C25051OooO0OO;
import o0oo0o0O.InterfaceC31322OooO0O0;
import o0oo0oo.C31382OooOo;
import o0oo0oo.C31392OooOooO;
import o0oo0oo.C31398Oooo0OO;
import o0oo0oo.C31401Oooo0oO;
import o0oo0ooO.C31409OooO0Oo;
import o0ooO00o.C31428OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31450OooOOoo;

/* JADX INFO: renamed from: o0ooo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31713OooO0oo implements InterfaceC31712OooO0oO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C25051OooO0OO f113265OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C31709OooO0Oo f113266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public LinkedHashMap f113267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C31401Oooo0oO f113268OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f113269OooO0Oo;

    /* JADX INFO: renamed from: o0ooo0.OooO0oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C31709OooO0Oo f113270OooO00o = new C31709OooO0Oo(C31713OooO0oo.f113265OooO0o0);
    }

    /* JADX INFO: renamed from: o0ooo0.OooO0oo$OooO0O0 */
    public static class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC31710OooO0o f113271OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public double f113272OooOo0o;

        public OooO0O0(AbstractC31710OooO0o abstractC31710OooO0o) {
            this.f113271OooOo = abstractC31710OooO0o;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0O0 oooO0O0) {
            return Double.compare(oooO0O0.f113272OooOo0o, this.f113272OooOo0o);
        }
    }

    static {
        C25051OooO0OO c25051OooO0OO = new C25051OooO0OO();
        c25051OooO0OO.f85053OooO00o = new ConcurrentHashMap();
        f113265OooO0o0 = c25051OooO0OO;
    }

    public C31713OooO0oo() {
        HashMap map = new HashMap();
        this.f113269OooO0Oo = map;
        map.put("Courier", new ArrayList(Arrays.asList("CourierNew", "CourierNewPSMT", "LiberationMono", "NimbusMonL-Regu", "DroidSansMono")));
        map.put("Courier-Bold", new ArrayList(Arrays.asList("CourierNewPS-BoldMT", "CourierNew-Bold", "LiberationMono-Bold", "NimbusMonL-Bold", "DroidSansMono")));
        map.put("Courier-Oblique", new ArrayList(Arrays.asList("CourierNewPS-ItalicMT", "CourierNew-Italic", "LiberationMono-Italic", "NimbusMonL-ReguObli", "DroidSansMono")));
        map.put("Courier-BoldOblique", new ArrayList(Arrays.asList("CourierNewPS-BoldItalicMT", "CourierNew-BoldItalic", "LiberationMono-BoldItalic", "NimbusMonL-BoldObli", "DroidSansMono")));
        map.put("Helvetica", new ArrayList(Arrays.asList("ArialMT", "Arial", "LiberationSans", "NimbusSanL-Regu", "Roboto-Regular")));
        map.put("Helvetica-Bold", new ArrayList(Arrays.asList("Arial-BoldMT", "Arial-Bold", "LiberationSans-Bold", "NimbusSanL-Bold", "Roboto-Bold")));
        map.put("Helvetica-Oblique", new ArrayList(Arrays.asList("Arial-ItalicMT", "Arial-Italic", "Helvetica-Italic", "LiberationSans-Italic", "NimbusSanL-ReguItal", "Roboto-Italic")));
        map.put("Helvetica-BoldOblique", new ArrayList(Arrays.asList("Arial-BoldItalicMT", "Helvetica-BoldItalic", "LiberationSans-BoldItalic", "NimbusSanL-BoldItal", "Roboto-BoldItalic")));
        map.put("Times-Roman", new ArrayList(Arrays.asList("TimesNewRomanPSMT", "TimesNewRoman", "TimesNewRomanPS", "LiberationSerif", "NimbusRomNo9L-Regu", "Roboto-Regular")));
        map.put("Times-Bold", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldMT", "TimesNewRomanPS-Bold", "TimesNewRoman-Bold", "LiberationSerif-Bold", "NimbusRomNo9L-Medi", "DroidSerif-Bold", "Roboto-Bold")));
        map.put("Times-Italic", new ArrayList(Arrays.asList("TimesNewRomanPS-ItalicMT", "TimesNewRomanPS-Italic", "TimesNewRoman-Italic", "LiberationSerif-Italic", "NimbusRomNo9L-ReguItal", "DroidSerif-Italic", "Roboto-Italic")));
        map.put("Times-BoldItalic", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldItalicMT", "TimesNewRomanPS-BoldItalic", "TimesNewRoman-BoldItalic", "LiberationSerif-BoldItalic", "NimbusRomNo9L-MediItal", "DroidSerif-BoldItalic", "Roboto-BoldItalic")));
        map.put("Symbol", new ArrayList(Arrays.asList("Symbol", "SymbolMT", "StandardSymL")));
        map.put("ZapfDingbats", new ArrayList(Arrays.asList("ZapfDingbatsITCbyBT-Regular", "ZapfDingbatsITC", "Dingbats", "MS-Gothic")));
        for (String str : Collections.unmodifiableSet(C31733OooOooO.f113356OooO00o.keySet())) {
            if (!this.f113269OooO0Oo.containsKey(str)) {
                this.f113269OooO0Oo.put(str, new ArrayList((Collection) this.f113269OooO0Oo.get((String) C31733OooOooO.f113356OooO00o.get(str))));
            }
        }
        try {
            InputStream inputStreamOooO00o = C31428OooO00o.f112202OooO00o != null ? C31428OooO00o.OooO00o("com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf") : InterfaceC31712OooO0oO.class.getResourceAsStream("/com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf");
            if (inputStreamOooO00o != null) {
                this.f113268OooO0OO = new C31398Oooo0OO(false, false).OooO0OO(new C31382OooOo(new BufferedInputStream(inputStreamOooO00o)));
                return;
            }
            throw new IOException("resource 'com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf' not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static LinkedHashMap OooO00o(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC31710OooO0o abstractC31710OooO0o = (AbstractC31710OooO0o) it.next();
            String strOooO = abstractC31710OooO0o.OooO();
            HashSet hashSet = new HashSet(2);
            hashSet.add(strOooO);
            hashSet.add(strOooO.replace(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, ""));
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put((String) it2.next(), abstractC31710OooO0o);
            }
        }
        return linkedHashMap;
    }

    public static String OooO0o0(C31722OooOOo0 c31722OooOOo0) {
        if (c31722OooOOo0 == null) {
            return "Times-Roman";
        }
        boolean z = false;
        if (c31722OooOOo0.OooO0OO() != null) {
            String lowerCase = c31722OooOOo0.OooO0OO().toLowerCase();
            if (lowerCase.contains("bold") || lowerCase.contains("black") || lowerCase.contains("heavy")) {
                z = true;
            }
        }
        return c31722OooOOo0.OooO0o0(1) ? (z && c31722OooOOo0.OooO0o0(64)) ? "Courier-BoldOblique" : z ? "Courier-Bold" : c31722OooOOo0.OooO0o0(64) ? "Courier-Oblique" : "Courier" : c31722OooOOo0.OooO0o0(2) ? (z && c31722OooOOo0.OooO0o0(64)) ? "Times-BoldItalic" : z ? "Times-Bold" : c31722OooOOo0.OooO0o0(64) ? "Times-Italic" : "Times-Roman" : (z && c31722OooOOo0.OooO0o0(64)) ? "Helvetica-BoldOblique" : z ? "Helvetica-Bold" : c31722OooOOo0.OooO0o0(64) ? "Helvetica-Oblique" : "Helvetica";
    }

    public final InterfaceC31322OooO0O0 OooO0O0(EnumC31711OooO0o0 enumC31711OooO0o0, String str) {
        if (str == null) {
            return null;
        }
        if (this.f113266OooO00o == null) {
            synchronized (this) {
                if (this.f113266OooO00o == null) {
                    C31709OooO0Oo c31709OooO0Oo = OooO00o.f113270OooO00o;
                    synchronized (this) {
                        this.f113267OooO0O0 = OooO00o(c31709OooO0Oo.f113249OooOo0o);
                        this.f113266OooO00o = c31709OooO0Oo;
                    }
                }
            }
        }
        AbstractC31710OooO0o abstractC31710OooO0oOooO0o = OooO0o(enumC31711OooO0o0, str);
        if (abstractC31710OooO0oOooO0o != null) {
            return abstractC31710OooO0oOooO0o.OooO0o0();
        }
        AbstractC31710OooO0o abstractC31710OooO0oOooO0o2 = OooO0o(enumC31711OooO0o0, str.replace(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, ""));
        if (abstractC31710OooO0oOooO0o2 != null) {
            return abstractC31710OooO0oOooO0o2.OooO0o0();
        }
        List list = (List) this.f113269OooO0Oo.get(str.replace(" ", ""));
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31710OooO0o abstractC31710OooO0oOooO0o3 = OooO0o(enumC31711OooO0o0, (String) it.next());
            if (abstractC31710OooO0oOooO0o3 != null) {
                return abstractC31710OooO0oOooO0o3.OooO0o0();
            }
        }
        AbstractC31710OooO0o abstractC31710OooO0oOooO0o4 = OooO0o(enumC31711OooO0o0, str.replace(",", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR));
        if (abstractC31710OooO0oOooO0o4 != null) {
            return abstractC31710OooO0oOooO0o4.OooO0o0();
        }
        AbstractC31710OooO0o abstractC31710OooO0oOooO0o5 = OooO0o(enumC31711OooO0o0, str.concat("-Regular"));
        if (abstractC31710OooO0oOooO0o5 != null) {
            return abstractC31710OooO0oOooO0o5.OooO0o0();
        }
        return null;
    }

    public final InterfaceC31322OooO0O0 OooO0OO(String str) {
        C31409OooO0Oo c31409OooO0Oo = (C31409OooO0Oo) OooO0O0(EnumC31711OooO0o0.f113264OooOoO0, str);
        if (c31409OooO0Oo != null) {
            return c31409OooO0Oo;
        }
        C31401Oooo0oO c31401Oooo0oO = (C31401Oooo0oO) OooO0O0(EnumC31711OooO0o0.f113262OooOo0o, str);
        if (c31401Oooo0oO != null) {
            return c31401Oooo0oO;
        }
        C31392OooOooO c31392OooOooO = (C31392OooOooO) OooO0O0(EnumC31711OooO0o0.f113261OooOo, str);
        if (c31392OooOooO != null) {
            return c31392OooOooO;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31706OooO00o OooO0Oo(String str, C31722OooOOo0 c31722OooOOo0, C31719OooOOOO c31719OooOOOO) {
        C31392OooOooO c31392OooOooO;
        byte b;
        Iterator it;
        OooO0O0 oooO0O0;
        C31725OooOo00 c31725OooOo00OooO0Oo;
        C31436OooO0Oo c31436OooO0Oo;
        C31441OooOO0 c31441OooOO0;
        double d;
        C31392OooOooO c31392OooOooO2 = (C31392OooOooO) OooO0O0(EnumC31711OooO0o0.f113261OooOo, str);
        byte b2 = 0;
        String str2 = null;
        if (c31392OooOooO2 != null) {
            return new C31706OooO00o(c31392OooOooO2, null, false);
        }
        C31401Oooo0oO c31401Oooo0oO = (C31401Oooo0oO) OooO0O0(EnumC31711OooO0o0.f113262OooOo0o, str);
        if (c31401Oooo0oO != null) {
            return new C31706OooO00o(null, c31401Oooo0oO, false);
        }
        if (c31719OooOOOO != null) {
            StringBuilder sb = new StringBuilder();
            C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112387o00O0OOo;
            C31436OooO0Oo c31436OooO0Oo2 = c31719OooOOOO.f113306OooOo0o;
            sb.append(c31436OooO0Oo2.o000OOO(c31441OooOO02));
            sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            sb.append(c31719OooOOOO.OooO00o());
            String string = sb.toString();
            if (string.equals("Adobe-GB1") || string.equals("Adobe-CNS1") || string.equals("Adobe-Japan1") || string.equals("Adobe-Korea1")) {
                PriorityQueue priorityQueue = new PriorityQueue(20);
                Iterator it2 = this.f113267OooO0O0.values().iterator();
                while (it2.hasNext()) {
                    AbstractC31710OooO0o abstractC31710OooO0o = (AbstractC31710OooO0o) it2.next();
                    if (abstractC31710OooO0o.OooO00o() != null) {
                        if (!abstractC31710OooO0o.OooO00o().f113244OooO00o.equals(c31436OooO0Oo2.o000OOO(C31441OooOO0.f112387o00O0OOo)) || !abstractC31710OooO0o.OooO00o().f113245OooO0O0.equals(c31719OooOOOO.OooO00o())) {
                            b = b2;
                            it = it2;
                            it2 = it;
                            b2 = b;
                            str2 = null;
                        }
                        oooO0O0 = new OooO0O0(abstractC31710OooO0o);
                        c31725OooOo00OooO0Oo = c31722OooOOo0.OooO0Oo();
                        c31436OooO0Oo = c31722OooOOo0.f113315OooOo0o;
                        if (c31725OooOo00OooO0Oo != null || abstractC31710OooO0o.OooO0oo() == null) {
                            b = b2;
                            it = it2;
                            c31441OooOO0 = C31441OooOO0.f112318o000O0o;
                            if (c31436OooO0Oo.o0000ooO(c31441OooOO0, 0.0f) > 0.0f && abstractC31710OooO0o.OooOO0() > 0) {
                                oooO0O0.f113272OooOo0o = (1.0d - (((double) (Math.abs(c31436OooO0Oo.o0000ooO(c31441OooOO0, 0.0f) - abstractC31710OooO0o.OooOO0()) / 100.0f)) * 0.5d)) + oooO0O0.f113272OooOo0o;
                            }
                            priorityQueue.add(oooO0O0);
                            it2 = it;
                            b2 = b;
                            str2 = null;
                        } else {
                            b = b2;
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(c31722OooOOo0.OooO0Oo().f113324OooO00o, 2, 12);
                            if (bArrCopyOfRange[b] == abstractC31710OooO0o.OooO0oo().f113323OooO00o[b]) {
                                if (bArrCopyOfRange[b] == 0) {
                                    d = 1.0d;
                                    if (abstractC31710OooO0o.OooO().toLowerCase().contains(OptionalModuleUtils.BARCODE) || abstractC31710OooO0o.OooO().startsWith("Code")) {
                                        C31450OooOOoo c31450OooOOoo = (C31450OooOOoo) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112306o0000oOo);
                                        String strOooOooo = c31450OooOOoo != null ? c31450OooOOoo.OooOooo() : str2;
                                        if (strOooOooo == null) {
                                            strOooOooo = "";
                                        }
                                        String strOooO0OO = c31722OooOOo0.OooO0OO();
                                        String str3 = strOooO0OO != null ? strOooO0OO : "";
                                        if (!strOooOooo.startsWith("Code") && !strOooOooo.toLowerCase().contains(OptionalModuleUtils.BARCODE) && !str3.startsWith("Code") && !str3.toLowerCase().contains(OptionalModuleUtils.BARCODE)) {
                                            b2 = b;
                                        }
                                    }
                                } else {
                                    d = 1.0d;
                                }
                                byte b3 = 5;
                                if (bArrCopyOfRange[1] == abstractC31710OooO0o.OooO0oo().f113323OooO00o[1]) {
                                    it = it2;
                                    oooO0O0.f113272OooOo0o += 2.0d;
                                } else {
                                    it = it2;
                                    byte b4 = bArrCopyOfRange[1];
                                    if (b4 < 2 || b4 > 5 || abstractC31710OooO0o.OooO0oo().f113323OooO00o[1] < 2 || abstractC31710OooO0o.OooO0oo().f113323OooO00o[1] > 5) {
                                        byte b5 = bArrCopyOfRange[1];
                                        if (b5 >= 11 && b5 <= 13 && abstractC31710OooO0o.OooO0oo().f113323OooO00o[1] >= 11 && abstractC31710OooO0o.OooO0oo().f113323OooO00o[1] <= 13) {
                                            oooO0O0.f113272OooOo0o += d;
                                        } else if (bArrCopyOfRange[1] != 0 && abstractC31710OooO0o.OooO0oo().f113323OooO00o[1] != 0) {
                                            oooO0O0.f113272OooOo0o -= d;
                                        }
                                    } else {
                                        oooO0O0.f113272OooOo0o += d;
                                    }
                                }
                                byte b6 = abstractC31710OooO0o.OooO0oo().f113323OooO00o[2];
                                int iOooOO0 = abstractC31710OooO0o.OooOO0();
                                if (iOooOO0 == 100) {
                                    b3 = 2;
                                } else if (iOooOO0 == 200) {
                                    b3 = 3;
                                } else if (iOooOO0 == 300) {
                                    b3 = 4;
                                } else if (iOooOO0 != 400) {
                                    b3 = iOooOO0 != 500 ? iOooOO0 != 600 ? iOooOO0 != 700 ? iOooOO0 != 800 ? iOooOO0 != 900 ? b : (byte) 10 : (byte) 9 : (byte) 8 : (byte) 7 : (byte) 6;
                                }
                                if (Math.abs(b6 - b3) > 2) {
                                    b6 = b3;
                                }
                                byte b7 = bArrCopyOfRange[2];
                                if (b7 == b6) {
                                    oooO0O0.f113272OooOo0o += 2.0d;
                                } else if (b7 > 1 && b6 > 1) {
                                    oooO0O0.f113272OooOo0o = (d - (((double) Math.abs(b7 - b6)) * 0.5d)) + oooO0O0.f113272OooOo0o;
                                }
                            } else {
                                it = it2;
                            }
                            priorityQueue.add(oooO0O0);
                            it2 = it;
                            b2 = b;
                            str2 = null;
                        }
                    } else {
                        long jOooO0O0 = (((long) abstractC31710OooO0o.OooO0O0()) & 4294967295L) | ((4294967295L & ((long) abstractC31710OooO0o.OooO0OO())) << 32);
                        if ("MalgunGothic-Semilight".equals(abstractC31710OooO0o.OooO())) {
                            jOooO0O0 &= -1441793;
                        }
                        if ((!c31719OooOOOO.OooO00o().equals("GB1") || (jOooO0O0 & PlaybackStateCompat.ACTION_SET_REPEAT_MODE) != PlaybackStateCompat.ACTION_SET_REPEAT_MODE) && ((!c31719OooOOOO.OooO00o().equals("CNS1") || (jOooO0O0 & PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) != PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) && ((!c31719OooOOOO.OooO00o().equals("Japan1") || (jOooO0O0 & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) != PlaybackStateCompat.ACTION_PREPARE_FROM_URI) && (!c31719OooOOOO.OooO00o().equals("Korea1") || ((jOooO0O0 & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) != PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED && (jOooO0O0 & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) != PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE))))) {
                            b = b2;
                            it = it2;
                            it2 = it;
                            b2 = b;
                            str2 = null;
                        }
                        oooO0O0 = new OooO0O0(abstractC31710OooO0o);
                        c31725OooOo00OooO0Oo = c31722OooOOo0.OooO0Oo();
                        c31436OooO0Oo = c31722OooOOo0.f113315OooOo0o;
                        if (c31725OooOo00OooO0Oo != null) {
                        }
                        b = b2;
                        it = it2;
                        c31441OooOO0 = C31441OooOO0.f112318o000O0o;
                        if (c31436OooO0Oo.o0000ooO(c31441OooOO0, 0.0f) > 0.0f) {
                            oooO0O0.f113272OooOo0o = (1.0d - (((double) (Math.abs(c31436OooO0Oo.o0000ooO(c31441OooOO0, 0.0f) - abstractC31710OooO0o.OooOO0()) / 100.0f)) * 0.5d)) + oooO0O0.f113272OooOo0o;
                        }
                        priorityQueue.add(oooO0O0);
                        it2 = it;
                        b2 = b;
                        str2 = null;
                    }
                }
                OooO0O0 oooO0O02 = (OooO0O0) priorityQueue.poll();
                if (oooO0O02 != null) {
                    InterfaceC31322OooO0O0 interfaceC31322OooO0O0OooO0o0 = oooO0O02.f113271OooOo.OooO0o0();
                    if (interfaceC31322OooO0O0OooO0o0 instanceof C31392OooOooO) {
                        return new C31706OooO00o((C31392OooOooO) interfaceC31322OooO0O0OooO0o0, null, true);
                    }
                    c31392OooOooO = null;
                    if (interfaceC31322OooO0O0OooO0o0 != null) {
                        return new C31706OooO00o(null, interfaceC31322OooO0O0OooO0o0, true);
                    }
                } else {
                    c31392OooOooO = null;
                }
            } else {
                c31392OooOooO = null;
            }
        }
        return new C31706OooO00o(c31392OooOooO, this.f113268OooO0OO, true);
    }

    public final AbstractC31710OooO0o OooO0o(EnumC31711OooO0o0 enumC31711OooO0o0, String str) {
        if (str.contains("+")) {
            str = str.substring(str.indexOf(43) + 1);
        }
        AbstractC31710OooO0o abstractC31710OooO0o = (AbstractC31710OooO0o) this.f113267OooO0O0.get(str);
        if (abstractC31710OooO0o == null || abstractC31710OooO0o.OooO0o() != enumC31711OooO0o0) {
            return null;
        }
        return abstractC31710OooO0o;
    }

    public final C31714OooOO0<InterfaceC31322OooO0O0> OooO0oO(String str, C31722OooOOo0 c31722OooOOo0) {
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0OooO0OO = OooO0OO(str);
        if (interfaceC31322OooO0O0OooO0OO != null) {
            return new C31714OooOO0<>(interfaceC31322OooO0O0OooO0OO, false);
        }
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0OooO0OO2 = OooO0OO(OooO0o0(c31722OooOOo0));
        if (interfaceC31322OooO0O0OooO0OO2 == null) {
            interfaceC31322OooO0O0OooO0OO2 = this.f113268OooO0OO;
        }
        return new C31714OooOO0<>(interfaceC31322OooO0O0OooO0OO2, true);
    }

    public final C31714OooOO0<C31401Oooo0oO> OooO0oo(String str, C31722OooOOo0 c31722OooOOo0) {
        EnumC31711OooO0o0 enumC31711OooO0o0 = EnumC31711OooO0o0.f113262OooOo0o;
        C31401Oooo0oO c31401Oooo0oO = (C31401Oooo0oO) OooO0O0(enumC31711OooO0o0, str);
        if (c31401Oooo0oO != null) {
            return new C31714OooOO0<>(c31401Oooo0oO, false);
        }
        C31401Oooo0oO c31401Oooo0oO2 = (C31401Oooo0oO) OooO0O0(enumC31711OooO0o0, OooO0o0(c31722OooOOo0));
        if (c31401Oooo0oO2 == null) {
            c31401Oooo0oO2 = this.f113268OooO0OO;
        }
        return new C31714OooOO0<>(c31401Oooo0oO2, true);
    }
}

package o0oo0oo;

import com.aspose.words.EditingLanguage;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o0oo0ooo.C31413OooO0O0;

/* JADX INFO: renamed from: o0oo0oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31387OooOoO extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f112073OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public HashMap f112074OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f112075OooO0oo;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        abstractC31397Oooo0O0.ooOO();
        int iOoOO = abstractC31397Oooo0O0.ooOO();
        abstractC31397Oooo0O0.ooOO();
        this.f112073OooO0o = new ArrayList(iOoOO);
        for (int i = 0; i < iOoOO; i++) {
            C31388OooOoO0 c31388OooOoO0 = new C31388OooOoO0();
            c31388OooOoO0.f112076OooO00o = abstractC31397Oooo0O0.ooOO();
            c31388OooOoO0.f112077OooO0O0 = abstractC31397Oooo0O0.ooOO();
            c31388OooOoO0.f112078OooO0OO = abstractC31397Oooo0O0.ooOO();
            c31388OooOoO0.f112079OooO0Oo = abstractC31397Oooo0O0.ooOO();
            c31388OooOoO0.f112081OooO0o0 = abstractC31397Oooo0O0.ooOO();
            c31388OooOoO0.f112080OooO0o = abstractC31397Oooo0O0.ooOO();
            this.f112073OooO0o.add(c31388OooOoO0);
        }
        for (C31388OooOoO0 c31388OooOoO02 : this.f112073OooO0o) {
            long j = c31388OooOoO02.f112080OooO0o;
            if (j > this.f112120OooO0OO) {
                c31388OooOoO02.f112082OooO0oO = null;
            } else {
                abstractC31397Oooo0O0.seek(this.f112119OooO0O0 + 6 + ((long) (iOoOO * 12)) + j);
                int i2 = c31388OooOoO02.f112076OooO00o;
                int i3 = c31388OooOoO02.f112077OooO0O0;
                Charset charset = C31413OooO0O0.f112169OooO00o;
                if ((i2 == 3 && (i3 == 0 || i3 == 1)) || i2 == 0) {
                    charset = C31413OooO0O0.f112170OooO0O0;
                } else if (i2 == 2) {
                    if (i3 == 0) {
                        charset = C31413OooO0O0.f112172OooO0Oo;
                    } else if (i3 == 1) {
                        charset = C31413OooO0O0.f112173OooO0o0;
                    }
                }
                c31388OooOoO02.f112082OooO0oO = abstractC31397Oooo0O0.Oooo00o(c31388OooOoO02.f112081OooO0o0, charset);
            }
        }
        this.f112074OooO0oO = new HashMap(this.f112073OooO0o.size());
        for (C31388OooOoO0 c31388OooOoO03 : this.f112073OooO0o) {
            Map map = (Map) this.f112074OooO0oO.get(Integer.valueOf(c31388OooOoO03.f112079OooO0Oo));
            if (map == null) {
                map = new HashMap();
                this.f112074OooO0oO.put(Integer.valueOf(c31388OooOoO03.f112079OooO0Oo), map);
            }
            Map map2 = (Map) map.get(Integer.valueOf(c31388OooOoO03.f112076OooO00o));
            if (map2 == null) {
                map2 = new HashMap();
                map.put(Integer.valueOf(c31388OooOoO03.f112076OooO00o), map2);
            }
            Map map3 = (Map) map2.get(Integer.valueOf(c31388OooOoO03.f112077OooO0O0));
            if (map3 == null) {
                map3 = new HashMap();
                map2.put(Integer.valueOf(c31388OooOoO03.f112077OooO0O0), map3);
            }
            map3.put(Integer.valueOf(c31388OooOoO03.f112078OooO0OO), c31388OooOoO03.f112082OooO0oO);
        }
        int i4 = 4;
        int i5 = 4;
        while (true) {
            if (i5 >= 0) {
                if (OooO0O0(1, 0, i5, 0) != null) {
                    break;
                } else {
                    i5--;
                }
            } else if (OooO0O0(1, 3, 1, EditingLanguage.ENGLISH_US) == null) {
                OooO0O0(1, 1, 0, 0);
            }
        }
        while (true) {
            if (i4 >= 0) {
                if (OooO0O0(2, 0, i4, 0) != null) {
                    break;
                } else {
                    i4--;
                }
            } else if (OooO0O0(2, 3, 1, EditingLanguage.ENGLISH_US) == null) {
                OooO0O0(2, 1, 0, 0);
            }
        }
        String strOooO0O0 = OooO0O0(6, 1, 0, 0);
        this.f112075OooO0oo = strOooO0O0;
        if (strOooO0O0 == null) {
            this.f112075OooO0oo = OooO0O0(6, 3, 1, EditingLanguage.ENGLISH_US);
        }
        String str = this.f112075OooO0oo;
        if (str != null) {
            this.f112075OooO0oo = str.trim();
        }
        this.f112121OooO0Oo = true;
    }

    public final String OooO0O0(int i, int i2, int i3, int i4) {
        Map map;
        Map map2;
        Map map3 = (Map) this.f112074OooO0oO.get(Integer.valueOf(i));
        if (map3 == null || (map = (Map) map3.get(Integer.valueOf(i2))) == null || (map2 = (Map) map.get(Integer.valueOf(i3))) == null) {
            return null;
        }
        return (String) map2.get(Integer.valueOf(i4));
    }
}

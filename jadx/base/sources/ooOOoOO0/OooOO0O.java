package ooOOoOO0;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes10.dex */
public class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C35131OooOoO f126119OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f126120OooO0O0 = true;

    public OooOO0O(C35131OooOoO c35131OooOoO) {
        this.f126119OooO00o = c35131OooOoO;
    }

    public void OooO() {
    }

    public void OooO00o() {
        this.f126120OooO0O0 = false;
    }

    public void OooO0O0(byte b) {
        this.f126119OooO00o.OooO0Oo(b);
    }

    public final void OooO0OO(char c) {
        C35131OooOoO c35131OooOoO = this.f126119OooO00o;
        c35131OooOoO.OooO00o(c35131OooOoO.f126143OooO0O0, 1);
        char[] cArr = c35131OooOoO.f126142OooO00o;
        int i = c35131OooOoO.f126143OooO0O0;
        c35131OooOoO.f126143OooO0O0 = i + 1;
        cArr[i] = c;
    }

    public void OooO0Oo(int i) {
        this.f126119OooO00o.OooO0Oo(i);
    }

    public final void OooO0o(String v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        this.f126119OooO00o.OooO0OO(v);
    }

    public void OooO0o0(long j) {
        this.f126119OooO00o.OooO0Oo(j);
    }

    public void OooO0oO(short s) {
        this.f126119OooO00o.OooO0Oo(s);
    }

    public void OooO0oo(String value) {
        byte b;
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        C35131OooOoO c35131OooOoO = this.f126119OooO00o;
        c35131OooOoO.OooO00o(c35131OooOoO.f126143OooO0O0, value.length() + 2);
        char[] cArr = c35131OooOoO.f126142OooO00o;
        int i = c35131OooOoO.f126143OooO0O0;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = C35142Oooo0o.f126192OooO0O0;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = value.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c35131OooOoO.OooO00o(i4, 2);
                    char cCharAt = value.charAt(i5);
                    byte[] bArr2 = C35142Oooo0o.f126192OooO0O0;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        c35131OooOoO.f126142OooO00o[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str = C35142Oooo0o.f126191OooO00o[cCharAt];
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                            c35131OooOoO.OooO00o(i4, str.length());
                            str.getChars(0, str.length(), c35131OooOoO.f126142OooO00o, i4);
                            int length3 = str.length() + i4;
                            c35131OooOoO.f126143OooO0O0 = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = c35131OooOoO.f126142OooO00o;
                            cArr2[i4] = IOUtils.DIR_SEPARATOR_WINDOWS;
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            c35131OooOoO.f126143OooO0O0 = i4;
                        }
                    }
                }
                c35131OooOoO.OooO00o(i4, 1);
                c35131OooOoO.f126142OooO00o[i4] = '\"';
                c35131OooOoO.f126143OooO0O0 = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c35131OooOoO.f126143OooO0O0 = i3 + 1;
    }

    public void OooOO0() {
    }
}

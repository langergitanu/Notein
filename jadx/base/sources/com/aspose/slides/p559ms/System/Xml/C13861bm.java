package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.bm */
/* JADX INFO: loaded from: classes5.dex */
public class C13861bm {

    /* JADX INFO: renamed from: du */
    private boolean f46362du;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3124b3 f46364k4;

    /* JADX INFO: renamed from: to */
    private C6765kp f46366to;

    /* JADX INFO: renamed from: x1 */
    private boolean f46367x1;

    /* JADX INFO: renamed from: h4 */
    private C14022y4 f46363h4 = new C14022y4();

    /* JADX INFO: renamed from: kk */
    private char f46365kk = '\"';

    public C13861bm(AbstractC3124b3 abstractC3124b3) {
        this.f46364k4 = abstractC3124b3;
        C14022y4.m66318k4().CloneTo(this.f46363h4);
    }

    /* JADX INFO: renamed from: du */
    private void m65191du(String str) {
        this.f46364k4.mo13302k4('&');
        this.f46364k4.mo13304k4(str);
        this.f46364k4.mo13302k4(';');
    }

    /* JADX INFO: renamed from: kk */
    private void m65193kk(char c) {
        m65194to(C14057f9.m66588k4(c, "X", C11683c5.m55033ck()));
    }

    /* JADX INFO: renamed from: to */
    private void m65194to(String str) {
        this.f46364k4.mo13304k4("&#x");
        this.f46364k4.mo13304k4(str);
        this.f46364k4.mo13302k4(';');
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65195k4() {
        if (this.f46362du) {
            this.f46366to.m26801k4(0);
        }
        this.f46367x1 = false;
        this.f46362du = false;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m65202x1() {
        return this.f46362du ? this.f46366to.toString() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65196k4(char c) {
        this.f46365kk = c;
    }

    /* JADX INFO: renamed from: kk */
    public final void m65201kk(String str) {
        if (this.f46362du) {
            this.f46366to.m26780k4('&');
            this.f46366to.m26792k4(str);
            this.f46366to.m26780k4(';');
        }
        m65191du(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65203x1(char c) {
        if (C14022y4.m66325kk((int) c)) {
            throw new ArgumentException(C13968ri.m65818k4("The surrogate pair is invalid. Missing a low surrogate character."));
        }
        String strM66588k4 = C14057f9.m66588k4(c, "X", C11683c5.m55033ck());
        if (this.f46362du) {
            this.f46366to.m26792k4("&#x");
            this.f46366to.m26792k4(strM66588k4);
            this.f46366to.m26780k4(';');
        }
        m65194to(strM66588k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65197k4(char c, char c2) {
        if (!C14022y4.m66327x1((int) c) || !C14022y4.m66321k4((int) c2)) {
            throw C13850af.m65078k4(c, c2);
        }
        this.f46364k4.mo13302k4(c2);
        this.f46364k4.mo13302k4(c);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65204x1(char c, char c2) {
        if (!C14022y4.m66327x1((int) c) || !C14022y4.m66321k4((int) c2)) {
            throw C13850af.m65078k4(c, c2);
        }
        int iM66317k4 = C14022y4.m66317k4(c, c2);
        if (this.f46362du) {
            this.f46366to.m26780k4(c2);
            this.f46366to.m26780k4(c);
        }
        this.f46364k4.mo13304k4("&#x");
        this.f46364k4.mo13304k4(C14057f9.m66588k4(iM66317k4, "X", C11683c5.m55033ck()));
        this.f46364k4.mo13302k4(';');
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m65198k4(String str) {
        String str2;
        if (str == null) {
            return;
        }
        if (this.f46362du) {
            this.f46366to.m26792k4(str);
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        char c = 0;
        while (true) {
            if (i2 < length) {
                byte[] bArr = this.f46363h4.f47099k4;
                char cCharAt = str.charAt(i2);
                if ((bArr[cCharAt] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                    i2++;
                    c = cCharAt;
                } else {
                    c = cCharAt;
                }
            }
            if (i2 == length) {
                this.f46364k4.mo13304k4(str);
                return;
            }
            if (this.f46367x1) {
                if (c != '\t') {
                    break;
                }
                i2++;
            } else {
                if (c != '\t' && c != '\n' && c != '\r' && c != '\"' && c != '\'') {
                    break;
                }
                i2++;
            }
        }
        char[] cArr = new char[256];
        while (true) {
            if (i < i2) {
                m65192k4(str, i, i2 - i, cArr);
            }
            if (i2 == length) {
                return;
            }
            if (c == '\t') {
                this.f46364k4.mo13302k4(c);
            } else {
                if (c == '\n' || c == '\r') {
                    if (this.f46367x1) {
                    }
                } else if (c != '\"') {
                    if (c == '<') {
                        str2 = TranslateLanguage.LITHUANIAN;
                    } else if (c == '>') {
                        str2 = "gt";
                    } else if (c == '&') {
                        str2 = "amp";
                    } else if (c != '\'') {
                        if (C14022y4.m66321k4((int) c)) {
                            int i3 = i2 + 1;
                            if (i3 >= length) {
                                throw C13850af.m65078k4(str.charAt(i2), c);
                            }
                            m65197k4(str.charAt(i3), c);
                            i2 = i3;
                        } else if (C14022y4.m66327x1((int) c)) {
                            throw C13850af.m65136x1(c);
                        }
                    } else if (this.f46367x1 && this.f46365kk == c) {
                        str2 = "apos";
                    } else {
                        this.f46364k4.mo13302k4('\'');
                    }
                    m65191du(str2);
                } else if (this.f46367x1 && this.f46365kk == c) {
                    str2 = "quot";
                    m65191du(str2);
                } else {
                    this.f46364k4.mo13302k4('\"');
                }
                m65193kk(c);
            }
            i = i2 + 1;
            i2 = i;
            while (true) {
                if (i2 < length) {
                    byte[] bArr2 = this.f46363h4.f47099k4;
                    char cCharAt2 = str.charAt(i2);
                    if ((bArr2[cCharAt2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                        c = cCharAt2;
                        break;
                    } else {
                        i2++;
                        c = cCharAt2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65205x1(String str) {
        if (str == null) {
            return;
        }
        if (this.f46362du) {
            this.f46366to.m26792k4(str);
        }
        int length = str.length();
        int i = 0;
        char c = 0;
        while (true) {
            if (i < length) {
                byte[] bArr = this.f46363h4.f47099k4;
                char cCharAt = str.charAt(i);
                if ((bArr[cCharAt] & 16) != 0 || cCharAt < ' ') {
                    i++;
                    c = cCharAt;
                } else {
                    c = cCharAt;
                }
            }
            if (i == length) {
                this.f46364k4.mo13304k4(str);
                return;
            }
            if (C14022y4.m66321k4((int) c)) {
                int i2 = i + 1;
                if (i2 >= length) {
                    throw new ArgumentException(C13968ri.m65818k4("The surrogate pair is invalid. Missing a low surrogate character."));
                }
                char cCharAt2 = str.charAt(i2);
                if (!C14022y4.m66327x1((int) cCharAt2)) {
                    throw C13850af.m65078k4(cCharAt2, c);
                }
                i += 2;
            } else {
                if (C14022y4.m66327x1((int) c)) {
                    throw C13850af.m65136x1(c);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65192k4(String str, int i, int i2, char[] cArr) {
        int length = cArr.length;
        while (i2 > 0) {
            int i3 = i2 > length ? length : i2;
            C14113y2.m67409k4(str, i, cArr, 0, i3);
            this.f46364k4.mo13307k4(cArr, 0, i3);
            i += i3;
            i2 -= i3;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65206x1(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset");
        }
        if (i2 > cArr.length - i) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (this.f46362du) {
            this.f46366to.m26799k4(cArr, i, i2);
        }
        this.f46364k4.mo13307k4(cArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65199k4(boolean z) {
        this.f46367x1 = true;
        this.f46362du = z;
        if (z) {
            C6765kp c6765kp = this.f46366to;
            if (c6765kp == null) {
                this.f46366to = new C6765kp();
            } else {
                c6765kp.m26801k4(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m65200k4(char[] cArr, int i, int i2) {
        String str;
        if (cArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (i2 > cArr.length - i) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (this.f46362du) {
            this.f46366to.m26799k4(cArr, i, i2);
        }
        int i3 = i2 + i;
        char c = 0;
        while (true) {
            int i4 = i;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                byte[] bArr = this.f46363h4.f47099k4;
                char c2 = cArr[i4];
                if ((bArr[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    c = c2;
                    break;
                } else {
                    i4++;
                    c = c2;
                }
            }
            if (i < i4) {
                this.f46364k4.mo13307k4(cArr, i, i4 - i);
            }
            if (i4 == i3) {
                return;
            }
            if (c == '\t') {
                this.f46364k4.mo13302k4(c);
            } else {
                if (c != '\n' && c != '\r') {
                    char c3 = '\"';
                    if (c != '\"') {
                        if (c == '<') {
                            str = TranslateLanguage.LITHUANIAN;
                        } else if (c == '>') {
                            str = "gt";
                        } else if (c != '&') {
                            c3 = '\'';
                            if (c == '\'') {
                                if (this.f46367x1 && this.f46365kk == c) {
                                    str = "apos";
                                }
                                this.f46364k4.mo13302k4(c3);
                            } else if (C14022y4.m66321k4((int) c)) {
                                i4++;
                                if (i4 >= i3) {
                                    throw new ArgumentException(C13968ri.m65818k4("The second character surrogate pair is not in the input buffer to be written."));
                                }
                                m65197k4(cArr[i4], c);
                            } else if (C14022y4.m66327x1((int) c)) {
                                throw C13850af.m65136x1(c);
                            }
                        } else {
                            str = "amp";
                        }
                        m65191du(str);
                    } else {
                        if (this.f46367x1 && this.f46365kk == c) {
                            str = "quot";
                            m65191du(str);
                        }
                        this.f46364k4.mo13302k4(c3);
                    }
                } else if (this.f46367x1) {
                }
                m65193kk(c);
            }
            i = i4 + 1;
        }
    }
}
